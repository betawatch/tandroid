// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.WeakHashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o04 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ o04() {
        this.a = (byte) 25;
    }

    private final void a() {
        File file;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        long j;
        MediaController w = MediaController.w();
        oo6 oo6Var = (oo6) this.b;
        k47 k47Var = oo6Var.a;
        rcc rccVar = oo6Var.b;
        if (k47Var == null || rccVar == null) {
            return;
        }
        String str2 = rccVar.o;
        long j2 = rccVar.p;
        long j3 = rccVar.a;
        long j4 = rccVar.c;
        long j5 = rccVar.b;
        int i5 = rccVar.k;
        int i6 = rccVar.l;
        int i7 = rccVar.g;
        int i8 = rccVar.h;
        int i9 = rccVar.i;
        int i10 = rccVar.n;
        int i11 = rccVar.m;
        int i12 = rccVar.j;
        boolean z = pg3.B(k47.B0(k47Var.k)) || rccVar.U;
        File file2 = new File(k47Var.k.attachPath);
        if (file2.exists()) {
            file2.delete();
        }
        if (e21.a) {
            file = file2;
            StringBuilder sb = new StringBuilder("begin convert ");
            sb.append(str2);
            sb.append(" startTime = ");
            sb.append(j3);
            sb.append(" avatarStartTime = ");
            sb.append(j4);
            sb.append(" endTime ");
            sb.append(j5);
            sb.append(" rWidth = ");
            sb.append(i5);
            sb.append(" rHeight = ");
            sb.append(i6);
            sb.append(" rotation = ");
            sb.append(i7);
            sb.append(" oWidth = ");
            sb.append(i8);
            sb.append(" oHeight = ");
            sb.append(i9);
            sb.append(" framerate = ");
            sb.append(i10);
            sb.append(" bitrate = ");
            i = i11;
            sb.append(i);
            str = str2;
            sb.append(" originalBitrate = ");
            i2 = i12;
            sb.append(i2);
            fc4.b(sb.toString());
        } else {
            file = file2;
            i = i11;
            str = str2;
            i2 = i12;
        }
        String str3 = str == null ? "" : str;
        if (j3 <= 0 || j5 <= 0) {
            i3 = i2;
            if (j5 > 0) {
                i4 = i;
                j = j5;
            } else {
                i4 = i;
                long j6 = rccVar.v;
                if (j3 > 0) {
                    j6 -= j3;
                }
                j = j6;
            }
        } else {
            j = j5 - j3;
            i3 = i2;
            i4 = i;
        }
        if (i10 == 0) {
            i10 = 25;
        } else if (i10 > 59) {
            i10 = 59;
        }
        if (i7 == 90 || i7 == 270) {
            i6 = i5;
            i5 = i6;
        }
        if (!rccVar.Y && i10 > 40 && Math.min(i6, i5) <= 480) {
            i10 = 30;
        }
        boolean z2 = (j4 == -1 && rccVar.H == null && rccVar.G == null && rccVar.B == null && rccVar.A == null && i5 == i8 && i6 == i9 && i7 == 0 && !rccVar.s && j3 == -1 && rccVar.a0.isEmpty()) ? false : true;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("videoconvert", 0);
        long currentTimeMillis = System.currentTimeMillis();
        File file3 = file;
        trc trcVar = new trc(w, rccVar, file3, oo6Var);
        rccVar.W = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of = MediaCodecVideoConvertor.ConvertVideoParams.of(str3, file3, j2, i7, z, i8, i9, i5, i6, i10, i4, i3, j3, j5, j4, z2, j, trcVar, rccVar);
        of.soundInfos.addAll(rccVar.a0);
        boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of);
        boolean z3 = rccVar.V;
        if (!z3) {
            synchronized (w.b) {
                z3 = rccVar.V;
            }
        }
        if (e21.a) {
            fc4.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z3);
        }
        sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
        long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
        boolean z4 = z3;
        long length = file3.length();
        boolean z5 = convertVideo || z4;
        rcc rccVar2 = oo6Var.b;
        boolean z6 = rccVar2.W;
        if (z6) {
            rccVar2.W = false;
        }
        gm.c3(new en6(w, z5, true, oo6Var, file3, 1.0f, lastFrameTimestamp, z6, length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x02ea, code lost:
    
        if (r7 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a4, code lost:
    
        if (r9 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0397, code lost:
    
        if (r0.f.equals(r0.b.eglGetCurrentSurface(12377)) == false) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        u69 u69Var;
        LaunchActivity launchActivity;
        Object obj;
        ByteBuffer allocateDirect;
        double d;
        boolean z;
        byte b = 4;
        float f = 0.0f;
        switch (this.a) {
            case 0:
                e34 e34Var = (e34) this.b;
                if (e34Var.C0.s == null) {
                    e34Var.Y1 = false;
                    e34Var.Z();
                    return;
                }
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.x == this) {
                    if (gm.n2(true)) {
                        if (e21.a) {
                            fc4.b("lock app");
                        }
                        externalActionActivity.i();
                    } else if (e21.a) {
                        fc4.b("didn't pass lock check");
                    }
                    externalActionActivity.x = null;
                    return;
                }
                return;
            case 2:
                ig4 ig4Var = (ig4) this.b;
                if (ig4Var.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f2 = ig4Var.q0 + (elapsedRealtime / 320.0f);
                    ig4Var.q0 = f2;
                    ig4Var.setAnimationIdicatorProgress(ig4Var.j0.getInterpolation(f2));
                    float f3 = ig4Var.q0;
                    if (f3 > 1.0f) {
                        ig4Var.q0 = 1.0f;
                        f3 = 1.0f;
                    }
                    if (f3 < 1.0f) {
                        gm.c3(ig4Var.w0);
                        return;
                    }
                    ig4Var.P = false;
                    ig4Var.setEnabled(true);
                    dg4 dg4Var = ig4Var.K;
                    if (dg4Var != null) {
                        ((dk3) dg4Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ch4 ch4Var = (ch4) this.b;
                if (ch4Var.N) {
                    ch4Var.f.clear();
                    ch4Var.n.clear();
                    ch4Var.r.clear();
                    q59 q59Var = ch4Var.d;
                    if (q59Var != null) {
                        q59Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                di4 di4Var = (di4) this.b;
                Context n = di4Var.n();
                if (n == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                di4Var.D0.d(1);
                lk0 lk0Var = di4Var.D0;
                String string = n.getString(R.string.fingerprint_dialog_touch_sensor);
                kj7 kj7Var = lk0Var.y;
                if (kj7Var == null) {
                    kj7Var = new kj7();
                    lk0Var.y = kj7Var;
                }
                lk0.f(kj7Var, string);
                return;
            case 5:
                fm4 fm4Var = (fm4) this.b;
                fm4Var.k();
                fm4Var.j();
                fm4Var.f.setAlpha(1.0f);
                return;
            case 6:
                dp4 dp4Var = (dp4) this.b;
                if (dp4Var.Z != null) {
                    dp4Var.j();
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                gm.d3(fragmentContextView.t0, 1000L);
                return;
            case 8:
                ((hq4) this.b).A(true);
                return;
            case 9:
                jr4 jr4Var = (jr4) this.b;
                if (jr4Var.G.get()) {
                    jr4Var.invalidate();
                    jr4Var.I.postDelayed(this, 300L);
                    return;
                }
                return;
            case 10:
                p35 p35Var = (p35) this.b;
                if (p35Var.d && p35Var.e && p35Var.k != null) {
                    if (SystemClock.elapsedRealtime() - p35Var.l >= 30000) {
                        p35Var.f("heartbeat timed out");
                        return;
                    }
                    p35Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - p35Var.l) + " ms ago");
                    p35Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    gm.d3(this, 15000L);
                    return;
                }
                return;
            case 11:
                g95 g95Var = ((s65) this.b).b;
                g95Var.w1.setAnimation(g95Var.D2);
                g95Var.F2 = false;
                return;
            case 12:
                va5 va5Var = (va5) this.b;
                if (va5Var.w) {
                    va5Var.i(false);
                    gm.d3(this, 250L);
                    return;
                }
                return;
            case 13:
                c75 c75Var = (c75) this.b;
                if (!c75Var.b || c75Var.R0.t2 != null) {
                    gm.d3(c75Var.i0, 3000L);
                    return;
                } else {
                    c75Var.h0 = false;
                    c75Var.setUiVisible(false);
                    return;
                }
            case 14:
                vr5 vr5Var = (vr5) this.b;
                try {
                    int w0 = cmb.w0(null, cmb.c6, false);
                    ur5 ur5Var = vr5Var.J;
                    if (ur5Var == null || vr5Var.fragmentView == null || vr5Var.P == w0) {
                        return;
                    }
                    vr5Var.P = w0;
                    ur5Var.postRunnable(new bm3((Object) ur5Var, w0, (byte) 16));
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 15:
                if (((ur5) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ur5 ur5Var2 = (ur5) this.b;
                    if (ur5Var2.e.equals(ur5Var2.b.eglGetCurrentContext())) {
                        ur5 ur5Var3 = (ur5) this.b;
                        break;
                    }
                    ur5 ur5Var4 = (ur5) this.b;
                    EGL10 egl10 = ur5Var4.b;
                    EGLDisplay eGLDisplay = ur5Var4.c;
                    EGLSurface eGLSurface = ur5Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, ur5Var4.e)) {
                        if (e21.a) {
                            b10.v(((ur5) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            return;
                        }
                        return;
                    }
                    int min = (int) Math.min(currentTimeMillis - ((ur5) this.b).s, 16L);
                    Intro.setPage(((ur5) this.b).y.I);
                    Intro.setDate((currentTimeMillis - r6.K) / 1000.0f);
                    Intro.onDrawFrame(min);
                    ur5 ur5Var5 = (ur5) this.b;
                    ur5Var5.b.eglSwapBuffers(ur5Var5.c, ur5Var5.f);
                    ur5 ur5Var6 = (ur5) this.b;
                    ur5Var6.s = currentTimeMillis;
                    if (ur5Var6.r == 0.0f) {
                        for (float f4 : ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f4 > f) {
                                f = f4;
                            }
                        }
                        ((ur5) this.b).r = f;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    ur5 ur5Var7 = (ur5) this.b;
                    ur5Var7.postRunnable(ur5Var7.x, Math.max(((long) (1000.0f / ur5Var7.r)) - currentTimeMillis2, 0L));
                    return;
                }
                return;
            case 16:
                ws5 ws5Var = (ws5) this.b;
                xs5 xs5Var = ws5Var.E;
                ks5 ks5Var = xs5Var.P1;
                if (ks5Var != null && ks5Var.getAdapter() != null) {
                    xs5Var.P1.getClass();
                    int R = RecyclerView.R(ws5Var);
                    if (R >= 0) {
                        xs5Var.N1.t(xs5Var.P1.T(ws5Var), R);
                    }
                }
                gm.c3(this);
                return;
            case 17:
                hu5 hu5Var = (hu5) this.b;
                eu5 eu5Var = hu5Var.y;
                if (hu5Var.c != null) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    long j = hu5Var.S;
                    long j2 = j != Long.MIN_VALUE ? currentTimeMillis3 - j : 0L;
                    f69 layoutManager = hu5Var.I.getLayoutManager();
                    Rect rect = hu5Var.R;
                    if (rect == null) {
                        rect = new Rect();
                        hu5Var.R = rect;
                    }
                    layoutManager.c(hu5Var.c.a, rect);
                    if (layoutManager.d()) {
                        int i3 = (int) (hu5Var.s + hu5Var.n);
                        int paddingLeft = (i3 - hu5Var.R.left) - hu5Var.I.getPaddingLeft();
                        float f5 = hu5Var.n;
                        if (f5 >= 0.0f || paddingLeft >= 0) {
                            if (f5 > 0.0f) {
                                i = ((hu5Var.c.a.getWidth() + i3) + hu5Var.R.right) - (hu5Var.I.getWidth() - hu5Var.I.getPaddingRight());
                                break;
                            }
                        } else {
                            i = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i4 = (int) (hu5Var.w + hu5Var.r);
                            int paddingTop = (i4 - hu5Var.R.top) - hu5Var.I.getPaddingTop();
                            float f6 = hu5Var.r;
                            if (f6 >= 0.0f || paddingTop >= 0) {
                                if (f6 > 0.0f) {
                                    i2 = ((hu5Var.c.a.getHeight() + i4) + hu5Var.R.bottom) - (hu5Var.I.getHeight() - hu5Var.I.getPaddingBottom());
                                    break;
                                }
                            } else {
                                i2 = paddingTop;
                            }
                            if (i != 0) {
                                int width = hu5Var.c.a.getWidth();
                                hu5Var.I.getWidth();
                                i = eu5Var.j(width, i, j2);
                            }
                            if (i2 != 0) {
                                int height = hu5Var.c.a.getHeight();
                                hu5Var.I.getHeight();
                                i2 = eu5Var.j(height, i2, j2);
                            }
                            if (i != 0 && i2 == 0) {
                                hu5Var.S = Long.MIN_VALUE;
                                return;
                            }
                            if (hu5Var.S == Long.MIN_VALUE) {
                                hu5Var.S = currentTimeMillis3;
                            }
                            hu5Var.I.scrollBy(i, i2);
                            u69Var = hu5Var.c;
                            if (u69Var != null) {
                                hu5Var.p(u69Var);
                            }
                            hu5Var.I.removeCallbacks(hu5Var.J);
                            RecyclerView recyclerView = hu5Var.I;
                            WeakHashMap weakHashMap = kfc.a;
                            recyclerView.postOnAnimation(this);
                            return;
                        }
                        i2 = 0;
                        if (i != 0) {
                        }
                        if (i2 != 0) {
                        }
                        if (i != 0) {
                        }
                        if (hu5Var.S == Long.MIN_VALUE) {
                        }
                        hu5Var.I.scrollBy(i, i2);
                        u69Var = hu5Var.c;
                        if (u69Var != null) {
                        }
                        hu5Var.I.removeCallbacks(hu5Var.J);
                        RecyclerView recyclerView2 = hu5Var.I;
                        WeakHashMap weakHashMap2 = kfc.a;
                        recyclerView2.postOnAnimation(this);
                        return;
                    }
                    i = 0;
                    if (layoutManager.e()) {
                    }
                    i2 = 0;
                    if (i != 0) {
                    }
                    if (i2 != 0) {
                    }
                    if (i != 0) {
                    }
                    if (hu5Var.S == Long.MIN_VALUE) {
                    }
                    hu5Var.I.scrollBy(i, i2);
                    u69Var = hu5Var.c;
                    if (u69Var != null) {
                    }
                    hu5Var.I.removeCallbacks(hu5Var.J);
                    RecyclerView recyclerView22 = hu5Var.I;
                    WeakHashMap weakHashMap22 = kfc.a;
                    recyclerView22.postOnAnimation(this);
                    return;
                }
                return;
            case 18:
                w44 w44Var = ((sa8) this.b).I0;
                if (w44Var instanceof xjb) {
                    ((xjb) w44Var).getEditText();
                    return;
                }
                return;
            case 19:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                if (launchActivity2.Z0 == this) {
                    if (gm.n2(true)) {
                        if (e21.a) {
                            fc4.b("lock app");
                        }
                        launchActivity = launchActivity2;
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            lo7.n(z8c.t0).Y();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                    } else {
                        launchActivity = launchActivity2;
                        if (e21.a) {
                            fc4.b("didn't pass lock check");
                        }
                    }
                    launchActivity.Z0 = null;
                    return;
                }
                return;
            case 20:
                m26 m26Var = (m26) this.b;
                m26Var.f.animate().setDuration(120L).alpha(0.0f);
                RadialProgressView radialProgressView = m26Var.h;
                radialProgressView.animate().setListener(null).start();
                if (radialProgressView.getVisibility() != 0) {
                    radialProgressView.setVisibility(0);
                    radialProgressView.setAlpha(0.0f);
                }
                radialProgressView.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 21:
                synchronized (((kj7) this.b).a) {
                    obj = ((kj7) this.b).f;
                    ((kj7) this.b).f = kj7.k;
                }
                ((kj7) this.b).i(obj);
                return;
            case 22:
                ((ka6) this.b).b();
                return;
            case 23:
                ag6 ag6Var = (ag6) this.b;
                if (ag6Var.h == this) {
                    ag6Var.n();
                    gm.d3(ag6Var.h, 1000L);
                    return;
                }
                return;
            case 24:
                MediaController mediaController = (MediaController) this.b;
                if (mediaController.f1 != null) {
                    if (mediaController.y1.isEmpty()) {
                        allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                    } else {
                        allocateDirect = (ByteBuffer) mediaController.y1.get(0);
                        mediaController.y1.remove(0);
                    }
                    ByteBuffer byteBuffer = allocateDirect;
                    byteBuffer.rewind();
                    int read = mediaController.f1.read(byteBuffer, byteBuffer.capacity());
                    if (read <= 0) {
                        mediaController.y1.add(byteBuffer);
                        MediaController mediaController2 = (MediaController) this.b;
                        byte b2 = mediaController2.C1;
                        if (b2 == 3 || b2 == 4) {
                            return;
                        }
                        mediaController2.B0(b2, mediaController2.E1, mediaController2.D1, mediaController2.F1);
                        return;
                    }
                    byteBuffer.limit(read);
                    char c = mediaController.B1;
                    glc glcVar = zze.a;
                    if (glcVar != null && read > 0) {
                        try {
                            glcVar.n(byteBuffer, read, c, 1);
                        } catch (Throwable th) {
                            fc4.g(th, true);
                        }
                    }
                    try {
                        long j3 = mediaController.w1;
                        long j4 = (read / 2) + j3;
                        int length = (int) ((j3 / j4) * r0.length);
                        int length2 = mediaController.v1.length - length;
                        if (length != 0) {
                            try {
                                float length3 = r0.length / length;
                                float f7 = 0.0f;
                                for (int i5 = 0; i5 < length; i5++) {
                                    short[] sArr = mediaController.v1;
                                    sArr[i5] = sArr[(int) f7];
                                    f7 += length3;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                z = true;
                                d = 0.0d;
                                fc4.g(e, z);
                                byteBuffer.position(0);
                                final double sqrt = Math.sqrt((d / read) / 2.0d);
                                mediaController.O1.c(new yl6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 1));
                                mediaController.N1.c(mediaController.P1);
                                gm.c3(new Runnable() { // from class: un6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaController mediaController3 = (MediaController) o04.this.b;
                                        nm7.f(mediaController3.i1).k(nm7.k2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt));
                                    }
                                });
                                return;
                            }
                        }
                        float f8 = (read / 2.0f) / length2;
                        d = 0.0d;
                        for (int i6 = 0; i6 < read / 2; i6++) {
                            try {
                                short s = byteBuffer.getShort();
                                d += s * s;
                                if (i6 == ((int) f)) {
                                    short[] sArr2 = mediaController.v1;
                                    if (length < sArr2.length) {
                                        sArr2[length] = s;
                                        f += f8;
                                        length++;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                z = true;
                                fc4.g(e, z);
                                byteBuffer.position(0);
                                final double sqrt2 = Math.sqrt((d / read) / 2.0d);
                                mediaController.O1.c(new yl6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 1));
                                mediaController.N1.c(mediaController.P1);
                                gm.c3(new Runnable() { // from class: un6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaController mediaController3 = (MediaController) o04.this.b;
                                        nm7.f(mediaController3.i1).k(nm7.k2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt2));
                                    }
                                });
                                return;
                            }
                        }
                        mediaController.w1 = j4;
                    } catch (Exception e5) {
                        e = e5;
                        d = 0.0d;
                    }
                    byteBuffer.position(0);
                    final double sqrt22 = Math.sqrt((d / read) / 2.0d);
                    mediaController.O1.c(new yl6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 1));
                    mediaController.N1.c(mediaController.P1);
                    gm.c3(new Runnable() { // from class: un6
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaController mediaController3 = (MediaController) o04.this.b;
                            nm7.f(mediaController3.i1).k(nm7.k2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt22));
                        }
                    });
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                wu6 wu6Var = (wu6) this.b;
                wu6Var.i(true);
                wu6Var.V.requestLayout();
                wu6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new uq(wu6Var, b));
                return;
            case 27:
                wu6 wu6Var2 = ((uu6) this.b).b;
                if (wu6Var2.d0 != null) {
                    wu6Var2.d0 = null;
                    if (wu6Var2.t0) {
                        wu6Var2.q(wu6Var2.u0);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                l57 l57Var = (l57) this.b;
                ValueAnimator valueAnimator = l57Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                l57Var.h.start();
                return;
            default:
                ((t67) this.b).U.animate().alpha(1.0f).setDuration(230L);
                return;
        }
    }

    public /* synthetic */ o04(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
