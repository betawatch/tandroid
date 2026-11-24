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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ez3 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ez3() {
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
        om6 om6Var = (om6) this.b;
        k27 k27Var = om6Var.a;
        oac oacVar = om6Var.b;
        if (k27Var == null || oacVar == null) {
            return;
        }
        String str2 = oacVar.o;
        long j2 = oacVar.p;
        long j3 = oacVar.a;
        long j4 = oacVar.c;
        long j5 = oacVar.b;
        int i5 = oacVar.k;
        int i6 = oacVar.l;
        int i7 = oacVar.g;
        int i8 = oacVar.h;
        int i9 = oacVar.i;
        int i10 = oacVar.n;
        int i11 = oacVar.m;
        int i12 = oacVar.j;
        boolean z = cf3.B(k27.B0(k27Var.k)) || oacVar.U;
        File file2 = new File(k27Var.k.attachPath);
        if (file2.exists()) {
            file2.delete();
        }
        if (w01.a) {
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
            fa4.b(sb.toString());
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
                long j6 = oacVar.v;
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
        if (!oacVar.Y && i10 > 40 && Math.min(i6, i5) <= 480) {
            i10 = 30;
        }
        boolean z2 = (j4 == -1 && oacVar.H == null && oacVar.G == null && oacVar.B == null && oacVar.A == null && i5 == i8 && i6 == i9 && i7 == 0 && !oacVar.s && j3 == -1 && oacVar.a0.isEmpty()) ? false : true;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("videoconvert", 0);
        long currentTimeMillis = System.currentTimeMillis();
        File file3 = file;
        spc spcVar = new spc(w, oacVar, file3, om6Var);
        oacVar.W = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of = MediaCodecVideoConvertor.ConvertVideoParams.of(str3, file3, j2, i7, z, i8, i9, i5, i6, i10, i4, i3, j3, j5, j4, z2, j, spcVar, oacVar);
        of.soundInfos.addAll(oacVar.a0);
        boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of);
        boolean z3 = oacVar.V;
        if (!z3) {
            synchronized (w.b) {
                z3 = oacVar.V;
            }
        }
        if (w01.a) {
            fa4.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z3);
        }
        sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
        long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
        boolean z4 = z3;
        long length = file3.length();
        boolean z5 = convertVideo || z4;
        oac oacVar2 = om6Var.b;
        boolean z6 = oacVar2.W;
        if (z6) {
            oacVar2.W = false;
        }
        gl.d3(new bl6(w, z5, true, om6Var, file3, 1.0f, lastFrameTimestamp, z6, length));
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
        s49 s49Var;
        LaunchActivity launchActivity;
        Object obj;
        ByteBuffer allocateDirect;
        double d;
        boolean z;
        byte b = 4;
        float f = 0.0f;
        switch (this.a) {
            case 0:
                t14 t14Var = (t14) this.b;
                if (t14Var.C0.s == null) {
                    t14Var.Y1 = false;
                    t14Var.Z();
                    return;
                }
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.x == this) {
                    if (gl.n2(true)) {
                        if (w01.a) {
                            fa4.b("lock app");
                        }
                        externalActionActivity.i();
                    } else if (w01.a) {
                        fa4.b("didn't pass lock check");
                    }
                    externalActionActivity.x = null;
                    return;
                }
                return;
            case 2:
                he4 he4Var = (he4) this.b;
                if (he4Var.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f2 = he4Var.q0 + (elapsedRealtime / 320.0f);
                    he4Var.q0 = f2;
                    he4Var.setAnimationIdicatorProgress(he4Var.j0.getInterpolation(f2));
                    float f3 = he4Var.q0;
                    if (f3 > 1.0f) {
                        he4Var.q0 = 1.0f;
                        f3 = 1.0f;
                    }
                    if (f3 < 1.0f) {
                        gl.d3(he4Var.w0);
                        return;
                    }
                    he4Var.P = false;
                    he4Var.setEnabled(true);
                    ce4 ce4Var = he4Var.K;
                    if (ce4Var != null) {
                        ((ti3) ce4Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                af4 af4Var = (af4) this.b;
                if (af4Var.N) {
                    af4Var.f.clear();
                    af4Var.n.clear();
                    af4Var.r.clear();
                    n39 n39Var = af4Var.d;
                    if (n39Var != null) {
                        n39Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bg4 bg4Var = (bg4) this.b;
                Context n = bg4Var.n();
                if (n == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                bg4Var.D0.d(1);
                lj0 lj0Var = bg4Var.D0;
                String string = n.getString(R.string.fingerprint_dialog_touch_sensor);
                hh7 hh7Var = lj0Var.y;
                if (hh7Var == null) {
                    hh7Var = new hh7();
                    lj0Var.y = hh7Var;
                }
                lj0.f(hh7Var, string);
                return;
            case 5:
                ek4 ek4Var = (ek4) this.b;
                ek4Var.k();
                ek4Var.j();
                ek4Var.f.setAlpha(1.0f);
                return;
            case 6:
                bn4 bn4Var = (bn4) this.b;
                if (bn4Var.Z != null) {
                    bn4Var.j();
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                gl.e3(fragmentContextView.t0, 1000L);
                return;
            case 8:
                ((go4) this.b).A(true);
                return;
            case 9:
                ip4 ip4Var = (ip4) this.b;
                if (ip4Var.G.get()) {
                    ip4Var.invalidate();
                    ip4Var.I.postDelayed(this, 300L);
                    return;
                }
                return;
            case 10:
                p15 p15Var = (p15) this.b;
                if (p15Var.d && p15Var.e && p15Var.k != null) {
                    if (SystemClock.elapsedRealtime() - p15Var.l >= 30000) {
                        p15Var.f("heartbeat timed out");
                        return;
                    }
                    p15Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - p15Var.l) + " ms ago");
                    p15Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    gl.e3(this, 15000L);
                    return;
                }
                return;
            case 11:
                h75 h75Var = ((u45) this.b).b;
                h75Var.w1.setAnimation(h75Var.D2);
                h75Var.F2 = false;
                return;
            case 12:
                w85 w85Var = (w85) this.b;
                if (w85Var.w) {
                    w85Var.i(false);
                    gl.e3(this, 250L);
                    return;
                }
                return;
            case 13:
                e55 e55Var = (e55) this.b;
                if (!e55Var.b || e55Var.R0.t2 != null) {
                    gl.e3(e55Var.i0, 3000L);
                    return;
                } else {
                    e55Var.h0 = false;
                    e55Var.setUiVisible(false);
                    return;
                }
            case 14:
                wp5 wp5Var = (wp5) this.b;
                try {
                    int w0 = bkb.w0(null, bkb.c6, false);
                    vp5 vp5Var = wp5Var.J;
                    if (vp5Var == null || wp5Var.fragmentView == null || wp5Var.P == w0) {
                        return;
                    }
                    wp5Var.P = w0;
                    vp5Var.postRunnable(new sm3((Object) vp5Var, w0, (byte) 14));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 15:
                if (((vp5) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    vp5 vp5Var2 = (vp5) this.b;
                    if (vp5Var2.e.equals(vp5Var2.b.eglGetCurrentContext())) {
                        vp5 vp5Var3 = (vp5) this.b;
                        break;
                    }
                    vp5 vp5Var4 = (vp5) this.b;
                    EGL10 egl10 = vp5Var4.b;
                    EGLDisplay eGLDisplay = vp5Var4.c;
                    EGLSurface eGLSurface = vp5Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, vp5Var4.e)) {
                        if (w01.a) {
                            b00.v(((vp5) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            return;
                        }
                        return;
                    }
                    int min = (int) Math.min(currentTimeMillis - ((vp5) this.b).s, 16L);
                    Intro.setPage(((vp5) this.b).y.I);
                    Intro.setDate((currentTimeMillis - r6.K) / 1000.0f);
                    Intro.onDrawFrame(min);
                    vp5 vp5Var5 = (vp5) this.b;
                    vp5Var5.b.eglSwapBuffers(vp5Var5.c, vp5Var5.f);
                    vp5 vp5Var6 = (vp5) this.b;
                    vp5Var6.s = currentTimeMillis;
                    if (vp5Var6.r == 0.0f) {
                        for (float f4 : ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f4 > f) {
                                f = f4;
                            }
                        }
                        ((vp5) this.b).r = f;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    vp5 vp5Var7 = (vp5) this.b;
                    vp5Var7.postRunnable(vp5Var7.x, Math.max(((long) (1000.0f / vp5Var7.r)) - currentTimeMillis2, 0L));
                    return;
                }
                return;
            case 16:
                yq5 yq5Var = (yq5) this.b;
                zq5 zq5Var = yq5Var.E;
                mq5 mq5Var = zq5Var.P1;
                if (mq5Var != null && mq5Var.getAdapter() != null) {
                    zq5Var.P1.getClass();
                    int R = RecyclerView.R(yq5Var);
                    if (R >= 0) {
                        zq5Var.N1.t(zq5Var.P1.T(yq5Var), R);
                    }
                }
                gl.d3(this);
                return;
            case 17:
                is5 is5Var = (is5) this.b;
                fs5 fs5Var = is5Var.y;
                if (is5Var.c != null) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    long j = is5Var.S;
                    long j2 = j != Long.MIN_VALUE ? currentTimeMillis3 - j : 0L;
                    d49 layoutManager = is5Var.I.getLayoutManager();
                    Rect rect = is5Var.R;
                    if (rect == null) {
                        rect = new Rect();
                        is5Var.R = rect;
                    }
                    layoutManager.c(is5Var.c.a, rect);
                    if (layoutManager.d()) {
                        int i3 = (int) (is5Var.s + is5Var.n);
                        int paddingLeft = (i3 - is5Var.R.left) - is5Var.I.getPaddingLeft();
                        float f5 = is5Var.n;
                        if (f5 >= 0.0f || paddingLeft >= 0) {
                            if (f5 > 0.0f) {
                                i = ((is5Var.c.a.getWidth() + i3) + is5Var.R.right) - (is5Var.I.getWidth() - is5Var.I.getPaddingRight());
                                break;
                            }
                        } else {
                            i = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i4 = (int) (is5Var.w + is5Var.r);
                            int paddingTop = (i4 - is5Var.R.top) - is5Var.I.getPaddingTop();
                            float f6 = is5Var.r;
                            if (f6 >= 0.0f || paddingTop >= 0) {
                                if (f6 > 0.0f) {
                                    i2 = ((is5Var.c.a.getHeight() + i4) + is5Var.R.bottom) - (is5Var.I.getHeight() - is5Var.I.getPaddingBottom());
                                    break;
                                }
                            } else {
                                i2 = paddingTop;
                            }
                            if (i != 0) {
                                int width = is5Var.c.a.getWidth();
                                is5Var.I.getWidth();
                                i = fs5Var.j(width, i, j2);
                            }
                            if (i2 != 0) {
                                int height = is5Var.c.a.getHeight();
                                is5Var.I.getHeight();
                                i2 = fs5Var.j(height, i2, j2);
                            }
                            if (i != 0 && i2 == 0) {
                                is5Var.S = Long.MIN_VALUE;
                                return;
                            }
                            if (is5Var.S == Long.MIN_VALUE) {
                                is5Var.S = currentTimeMillis3;
                            }
                            is5Var.I.scrollBy(i, i2);
                            s49Var = is5Var.c;
                            if (s49Var != null) {
                                is5Var.p(s49Var);
                            }
                            is5Var.I.removeCallbacks(is5Var.J);
                            RecyclerView recyclerView = is5Var.I;
                            WeakHashMap weakHashMap = jdc.a;
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
                        if (is5Var.S == Long.MIN_VALUE) {
                        }
                        is5Var.I.scrollBy(i, i2);
                        s49Var = is5Var.c;
                        if (s49Var != null) {
                        }
                        is5Var.I.removeCallbacks(is5Var.J);
                        RecyclerView recyclerView2 = is5Var.I;
                        WeakHashMap weakHashMap2 = jdc.a;
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
                    if (is5Var.S == Long.MIN_VALUE) {
                    }
                    is5Var.I.scrollBy(i, i2);
                    s49Var = is5Var.c;
                    if (s49Var != null) {
                    }
                    is5Var.I.removeCallbacks(is5Var.J);
                    RecyclerView recyclerView22 = is5Var.I;
                    WeakHashMap weakHashMap22 = jdc.a;
                    recyclerView22.postOnAnimation(this);
                    return;
                }
                return;
            case 18:
                l34 l34Var = ((q88) this.b).I0;
                if (l34Var instanceof vhb) {
                    ((vhb) l34Var).getEditText();
                    return;
                }
                return;
            case 19:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                if (launchActivity2.Z0 == this) {
                    if (gl.n2(true)) {
                        if (w01.a) {
                            fa4.b("lock app");
                        }
                        launchActivity = launchActivity2;
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            im7.n(y6c.t0).Y();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                    } else {
                        launchActivity = launchActivity2;
                        if (w01.a) {
                            fa4.b("didn't pass lock check");
                        }
                    }
                    launchActivity.Z0 = null;
                    return;
                }
                return;
            case 20:
                m06 m06Var = (m06) this.b;
                m06Var.f.animate().setDuration(120L).alpha(0.0f);
                RadialProgressView radialProgressView = m06Var.h;
                radialProgressView.animate().setListener(null).start();
                if (radialProgressView.getVisibility() != 0) {
                    radialProgressView.setVisibility(0);
                    radialProgressView.setAlpha(0.0f);
                }
                radialProgressView.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 21:
                synchronized (((hh7) this.b).a) {
                    obj = ((hh7) this.b).f;
                    ((hh7) this.b).f = hh7.k;
                }
                ((hh7) this.b).i(obj);
                return;
            case 22:
                ((l86) this.b).c();
                return;
            case 23:
                be6 be6Var = (be6) this.b;
                if (be6Var.h == this) {
                    be6Var.n();
                    gl.e3(be6Var.h, 1000L);
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
                    gjc gjcVar = xxe.a;
                    if (gjcVar != null && read > 0) {
                        try {
                            gjcVar.n(byteBuffer, read, c, 1);
                        } catch (Throwable th) {
                            fa4.g(th, true);
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
                                fa4.g(e, z);
                                byteBuffer.position(0);
                                final double sqrt = Math.sqrt((d / read) / 2.0d);
                                mediaController.O1.c(new vj6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 1));
                                mediaController.N1.c(mediaController.P1);
                                gl.d3(new Runnable() { // from class: sl6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaController mediaController3 = (MediaController) ez3.this.b;
                                        kk7.f(mediaController3.i1).k(kk7.j2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt));
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
                                fa4.g(e, z);
                                byteBuffer.position(0);
                                final double sqrt2 = Math.sqrt((d / read) / 2.0d);
                                mediaController.O1.c(new vj6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 1));
                                mediaController.N1.c(mediaController.P1);
                                gl.d3(new Runnable() { // from class: sl6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaController mediaController3 = (MediaController) ez3.this.b;
                                        kk7.f(mediaController3.i1).k(kk7.j2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt2));
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
                    mediaController.O1.c(new vj6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 1));
                    mediaController.N1.c(mediaController.P1);
                    gl.d3(new Runnable() { // from class: sl6
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaController mediaController3 = (MediaController) ez3.this.b;
                            kk7.f(mediaController3.i1).k(kk7.j2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt22));
                        }
                    });
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                ws6 ws6Var = (ws6) this.b;
                ws6Var.i(true);
                ws6Var.V.requestLayout();
                ws6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new up(ws6Var, b));
                return;
            case 27:
                ws6 ws6Var2 = ((us6) this.b).b;
                if (ws6Var2.d0 != null) {
                    ws6Var2.d0 = null;
                    if (ws6Var2.t0) {
                        ws6Var2.q(ws6Var2.u0);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                l37 l37Var = (l37) this.b;
                ValueAnimator valueAnimator = l37Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                l37Var.h.start();
                return;
            default:
                ((s47) this.b).U.animate().alpha(1.0f).setDuration(230L);
                return;
        }
    }

    public /* synthetic */ ez3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
