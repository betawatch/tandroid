package mg;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.media.RemoteControlClient;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import android.widget.TextView;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bv;
import org.telegram.messenger.cd;
import org.telegram.messenger.ev;
import org.telegram.messenger.f8;
import org.telegram.messenger.jf;
import org.telegram.messenger.jj;
import org.telegram.messenger.jv;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.s5;
import org.telegram.messenger.se;
import org.telegram.messenger.t5;
import org.telegram.messenger.uz;
import org.telegram.messenger.v2;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.wf;
import org.telegram.messenger.x20;
import org.telegram.messenger.yd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Cells.x5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h7;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.wt;
import org.telegram.ui.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c2 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c2() {
        this.a = 5;
    }

    private final void a() {
        im imVar = (im) this.b;
        jm jmVar = imVar.P;
        if (jmVar.J == null || jmVar.K) {
            return;
        }
        int computeVerticalScrollOffset = jmVar.r.computeVerticalScrollOffset();
        boolean z10 = jmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (imVar.e() - imVar.r) + imVar.n;
        float max = Math.max(0.0f, (jmVar.E - Math.max(0, computeVerticalScrollOffset - jmVar.getListTopPadding())) - org.telegram.messenger.i0.L(52.0f));
        float max2 = Math.max(0.0f, ((jmVar.r.getMeasuredHeight() - (jmVar.E - computeVerticalScrollOffset)) - jmVar.getListTopPadding()) - org.telegram.messenger.i0.L(84.0f));
        float L = org.telegram.messenger.i0.L(32.0f);
        float L2 = (max >= L || computeVerticalScrollOffset <= jmVar.getListTopPadding()) ? max2 < L ? org.telegram.messenger.i0.L(6.0f) * (1.0f - (max2 / L)) : 0.0f : (-(1.0f - (max / L))) * org.telegram.messenger.i0.L(6.0f);
        int i10 = (int) L2;
        if (Math.abs(i10) > 0 && jmVar.r.canScrollVertically(i10) && (L2 <= 0.0f || !z10)) {
            jmVar.E += L2;
            jmVar.r.scrollBy(0, i10);
            imVar.invalidate();
        }
        imVar.L = true;
        imVar.postDelayed(this, 15L);
    }

    /* JADX WARN: Removed duplicated region for block: B:373:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0810  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ByteBuffer allocateDirect;
        long j10;
        boolean z10;
        long j11;
        File file;
        int i11;
        int i12;
        int i13;
        long j12;
        long j13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15 = 5;
        switch (this.a) {
            case 0:
                i2 i2Var = (i2) this.b;
                String str = i2Var.g2;
                if (str != null) {
                    if (i2Var.p2 >= 0) {
                        ConnectionsManager.getInstance(i2Var.a).cancelRequest(i2Var.p2, true);
                        i2Var.p2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    i2Var.p2 = ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_contacts_search, new ag.c(i2Var, 10));
                    return;
                }
                return;
            case 1:
                Object obj = ((za.c) this.b).b;
                return;
            case 2:
                if (!((t5) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i16 = 0;
                    while (i16 < ((t5) this.b).a.size()) {
                        s5 s5Var = (s5) ((t5) this.b).a.get(i16);
                        if (s5Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            s5Var.recycle();
                            ((t5) this.b).a.remove(i16);
                            i10 = 1;
                            ((t5) this.b).e--;
                            i16--;
                        } else {
                            i10 = 1;
                        }
                        i16 += i10;
                    }
                }
                if (((t5) this.b).a.isEmpty() && ((t5) this.b).c.isEmpty()) {
                    ((t5) this.b).h = false;
                    return;
                } else {
                    Utilities.e.d(this, 30000L);
                    ((t5) this.b).h = true;
                    return;
                }
            case 3:
                b6 b6Var = (b6) this.b;
                b6Var.I.clear();
                b6Var.getNotificationCenter().k(zs.b5, new Object[0]);
                return;
            case 4:
                MediaController mediaController = (MediaController) this.b;
                ArrayList arrayList = mediaController.w1;
                if (mediaController.d1 != null) {
                    if (arrayList.isEmpty()) {
                        allocateDirect = ByteBuffer.allocateDirect(mediaController.y1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                    } else {
                        allocateDirect = (ByteBuffer) arrayList.get(0);
                        arrayList.remove(0);
                    }
                    allocateDirect.rewind();
                    int read = mediaController.d1.read(allocateDirect, allocateDirect.capacity());
                    if (read <= 0) {
                        arrayList.add(allocateDirect);
                        int i17 = mediaController.A1;
                        if (i17 == 3 || i17 == 4) {
                            return;
                        }
                        mediaController.C0(i17, mediaController.C1, mediaController.B1, mediaController.D1);
                        return;
                    }
                    allocateDirect.limit(read);
                    double d = 0.0d;
                    try {
                        long j14 = mediaController.u1;
                        long j15 = (read / 2) + j14;
                        int length = (int) ((j14 / j15) * r0.length);
                        int length2 = mediaController.t1.length - length;
                        if (length != 0) {
                            float length3 = r0.length / length;
                            float f7 = 0.0f;
                            for (int i18 = 0; i18 < length; i18++) {
                                short[] sArr = mediaController.t1;
                                sArr[i18] = sArr[(int) f7];
                                f7 += length3;
                            }
                        }
                        float f10 = (read / 2.0f) / length2;
                        float f11 = 0.0f;
                        for (int i19 = 0; i19 < read / 2; i19++) {
                            short s10 = allocateDirect.getShort();
                            d += s10 * s10;
                            if (i19 == ((int) f11)) {
                                short[] sArr2 = mediaController.t1;
                                if (length < sArr2.length) {
                                    sArr2[length] = s10;
                                    f11 += f10;
                                    length++;
                                }
                            }
                        }
                        mediaController.u1 = j15;
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    allocateDirect.position(0);
                    double sqrt = Math.sqrt((d / read) / 2.0d);
                    mediaController.M1.c(new wf(this, allocateDirect, read != allocateDirect.capacity(), 6));
                    mediaController.L1.c(mediaController.N1);
                    org.telegram.messenger.i0.g3(new se(this, sqrt, 0));
                    return;
                }
                return;
            case 5:
                MediaController B = MediaController.B();
                jf jfVar = (jf) this.b;
                jj jjVar = jfVar.a;
                x20 x20Var = jfVar.b;
                if (jjVar == null || x20Var == null) {
                    return;
                }
                String str2 = x20Var.o;
                long j16 = x20Var.p;
                long j17 = x20Var.a;
                long j18 = x20Var.c;
                long j19 = x20Var.b;
                int i20 = x20Var.k;
                int i21 = x20Var.l;
                int i22 = x20Var.g;
                int i23 = x20Var.h;
                int i24 = x20Var.i;
                int i25 = x20Var.n;
                int i26 = x20Var.m;
                int i27 = x20Var.j;
                if (o5.C(jj.B0(jjVar.k)) || x20Var.V) {
                    j10 = j16;
                    z10 = true;
                } else {
                    j10 = j16;
                    z10 = false;
                }
                long j20 = j10;
                File file2 = new File(jjVar.k.attachPath);
                if (file2.exists()) {
                    file2.delete();
                }
                if (v2.a) {
                    file = file2;
                    StringBuilder sb2 = new StringBuilder("begin convert ");
                    sb2.append(str2);
                    sb2.append(" startTime = ");
                    sb2.append(j17);
                    sb2.append(" avatarStartTime = ");
                    sb2.append(j18);
                    sb2.append(" endTime ");
                    sb2.append(j19);
                    sb2.append(" rWidth = ");
                    sb2.append(i20);
                    sb2.append(" rHeight = ");
                    sb2.append(i21);
                    sb2.append(" rotation = ");
                    sb2.append(i22);
                    sb2.append(" oWidth = ");
                    sb2.append(i23);
                    sb2.append(" oHeight = ");
                    sb2.append(i24);
                    sb2.append(" framerate = ");
                    sb2.append(i25);
                    sb2.append(" bitrate = ");
                    i11 = i26;
                    sb2.append(i11);
                    j11 = j19;
                    sb2.append(" originalBitrate = ");
                    i12 = i27;
                    sb2.append(i12);
                    f8.b(sb2.toString());
                } else {
                    j11 = j19;
                    file = file2;
                    i11 = i26;
                    i12 = i27;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (j17 <= 0 || j11 <= 0) {
                    if (j11 > 0) {
                        i13 = i12;
                        j12 = j11;
                    } else if (j17 > 0) {
                        i13 = i12;
                        j13 = x20Var.v - j17;
                    } else {
                        i13 = i12;
                        j12 = x20Var.v;
                    }
                    if (i25 != 0) {
                        i25 = 25;
                    } else if (i25 > 59) {
                        i25 = 59;
                    }
                    if (i22 != 90 || i22 == 270) {
                        i14 = i21;
                        i21 = i20;
                    } else {
                        i14 = i20;
                    }
                    if (!x20Var.Z && i25 > 40 && Math.min(i21, i14) <= 480) {
                        i25 = 30;
                    }
                    int i28 = i25;
                    boolean z14 = (j18 != -1 && x20Var.H == null && x20Var.G == null && x20Var.B == null && x20Var.A == null && i14 == i23 && i21 == i24 && i22 == 0 && !x20Var.s && j17 == -1 && x20Var.b0.isEmpty()) ? false : true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("videoconvert", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    File file3 = file;
                    m4.n0 n0Var = new m4.n0(B, x20Var, file3, jfVar);
                    x20Var.X = true;
                    MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
                    MediaCodecVideoConvertor.ConvertVideoParams of2 = MediaCodecVideoConvertor.ConvertVideoParams.of(str2, file3, j20, i22, z10, i23, i24, i14, i21, i28, i11, i13, j17, j11, j18, z14, j12, n0Var, x20Var);
                    of2.soundInfos.addAll(x20Var.b0);
                    boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of2);
                    z11 = x20Var.W;
                    if (!z11) {
                        synchronized (B.b) {
                            z11 = x20Var.W;
                        }
                    }
                    if (v2.a) {
                        f8.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z11);
                    }
                    sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
                    long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
                    long length4 = file3.length();
                    boolean z15 = !convertVideo || z11;
                    x20 x20Var2 = jfVar.b;
                    z12 = x20Var2.X;
                    if (z12) {
                        x20Var2.X = false;
                    }
                    org.telegram.messenger.i0.g3(new yd(B, z15, true, jfVar, file3, 1.0f, lastFrameTimestamp, z12, length4));
                    return;
                }
                j13 = j11 - j17;
                i13 = i12;
                j12 = j13;
                if (i25 != 0) {
                }
                if (i22 != 90) {
                }
                i14 = i21;
                i21 = i20;
                if (!x20Var.Z) {
                    i25 = 30;
                }
                int i282 = i25;
                if (j18 != -1) {
                }
                SharedPreferences sharedPreferences2 = org.telegram.messenger.w0.b.getSharedPreferences("videoconvert", 0);
                long currentTimeMillis2 = System.currentTimeMillis();
                File file32 = file;
                m4.n0 n0Var2 = new m4.n0(B, x20Var, file32, jfVar);
                x20Var.X = true;
                MediaCodecVideoConvertor mediaCodecVideoConvertor2 = new MediaCodecVideoConvertor();
                MediaCodecVideoConvertor.ConvertVideoParams of22 = MediaCodecVideoConvertor.ConvertVideoParams.of(str2, file32, j20, i22, z10, i23, i24, i14, i21, i282, i11, i13, j17, j11, j18, z14, j12, n0Var2, x20Var);
                of22.soundInfos.addAll(x20Var.b0);
                boolean convertVideo2 = mediaCodecVideoConvertor2.convertVideo(of22);
                z11 = x20Var.W;
                if (!z11) {
                }
                if (v2.a) {
                }
                sharedPreferences2.edit().putBoolean("isPreviousOk", true).apply();
                long lastFrameTimestamp2 = mediaCodecVideoConvertor2.getLastFrameTimestamp();
                long length42 = file32.length();
                if (convertVideo2) {
                }
                x20 x20Var22 = jfVar.b;
                z12 = x20Var22.X;
                if (z12) {
                }
                org.telegram.messenger.i0.g3(new yd(B, z15, true, jfVar, file32, 1.0f, lastFrameTimestamp2, z12, length42));
                return;
            case 6:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a == null || MediaController.B().u0 == null) {
                    return;
                }
                if (MediaController.B().u0.h0 == -9223372036854775807L) {
                    org.telegram.messenger.i0.h3(this, 500L);
                    return;
                }
                RemoteControlClient.MetadataEditor editMetadata = musicPlayerService.a.editMetadata(false);
                editMetadata.putLong(9, MediaController.B().u0.h0 * 1000);
                editMetadata.apply();
                musicPlayerService.a.setPlaybackState(MediaController.B().H() ? 2 : 3, Math.max(MediaController.B().u0.g0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                return;
            case 7:
                org.telegram.messenger.w0.b.sendBroadcast((Intent) this.b);
                return;
            case 8:
                bv bvVar = (bv) this.b;
                OverScroller overScroller = bvVar.m0;
                if (overScroller == null || bvVar.V == null || !overScroller.computeScrollOffset()) {
                    return;
                }
                int currX = bvVar.m0.getCurrX();
                r3 = currX >= 0 ? currX : 0;
                int i29 = bvVar.c0;
                if (r3 > i29) {
                    r3 = i29;
                }
                if (r3 != bvVar.d0) {
                    bvVar.d0 = r3;
                    bvVar.V.invalidate();
                }
                if (bvVar.m0.isFinished()) {
                    return;
                }
                bvVar.V.postOnAnimation(this);
                return;
            case 9:
                ev evVar = (ev) this.b;
                OverScroller overScroller2 = evVar.u0;
                if (overScroller2 == null || evVar.V == null || !overScroller2.computeScrollOffset()) {
                    return;
                }
                int currX2 = evVar.u0.getCurrX();
                r3 = currX2 >= 0 ? currX2 : 0;
                int i30 = evVar.a0;
                if (r3 > i30) {
                    r3 = i30;
                }
                if (r3 != evVar.b0) {
                    evVar.b0 = r3;
                    evVar.Y(evVar.S, evVar.T, evVar.U);
                    evVar.V.invalidate();
                }
                if (evVar.u0.isFinished()) {
                    return;
                }
                evVar.V.postOnAnimation(this);
                return;
            case 10:
                jv jvVar = (jv) this.b;
                OverScroller overScroller3 = jvVar.y0;
                if (overScroller3 == null || jvVar.V == null || !overScroller3.computeScrollOffset()) {
                    return;
                }
                int currX3 = jvVar.y0.getCurrX();
                r3 = currX3 >= 0 ? currX3 : 0;
                int i31 = jvVar.h0;
                if (r3 > i31) {
                    r3 = i31;
                }
                if (r3 != jvVar.i0) {
                    jvVar.i0 = r3;
                    jvVar.Y(jvVar.S, jvVar.T, jvVar.U);
                    jvVar.V.invalidate();
                }
                if (jvVar.y0.isFinished()) {
                    return;
                }
                jvVar.V.postOnAnimation(this);
                return;
            case 11:
                long currentTimeMillis3 = System.currentTimeMillis();
                uz uzVar = (uz) this.b;
                if (Math.abs(currentTimeMillis3 - uzVar.b) < 2000) {
                    return;
                }
                uzVar.b = currentTimeMillis3;
                try {
                    uzVar.s.b();
                    int i32 = 0;
                    while (true) {
                        if (i32 >= 3) {
                            int i33 = 0;
                            for (int i34 = 3; i33 < i34; i34 = 3) {
                                uzVar.s.write(uz.a(uzVar, uzVar.c[i33][7]), 0, 8);
                                uzVar.s.write(uz.a(uzVar, uzVar.d[i33][7]), 0, 8);
                                uzVar.s.write(uz.b(uzVar, uzVar.e[i33][7]), 0, 4);
                                uzVar.s.write(uz.b(uzVar, uzVar.f[i33][7]), 0, 4);
                                i33++;
                            }
                            uzVar.r.seek(0L);
                            RandomAccessFile randomAccessFile = uzVar.r;
                            rf.x xVar = uzVar.s;
                            randomAccessFile.write(xVar.a, 0, xVar.b);
                            uzVar.r.getFD().sync();
                            return;
                        }
                        for (int i35 = 0; i35 < 7; i35++) {
                            uzVar.s.write(uz.a(uzVar, uzVar.c[i32][i35]), 0, 8);
                            uzVar.s.write(uz.a(uzVar, uzVar.d[i32][i35]), 0, 8);
                            uzVar.s.write(uz.b(uzVar, uzVar.e[i32][i35]), 0, 4);
                            uzVar.s.write(uz.b(uzVar, uzVar.f[i32][i35]), 0, 4);
                        }
                        uzVar.s.write(uz.b(uzVar, uzVar.n[i32]), 0, 4);
                        uzVar.s.write(uz.a(uzVar, uzVar.h[i32]), 0, 8);
                        i32++;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d != this) {
                    return;
                }
                actionBarLayout.d = null;
                actionBarLayout.g0(false, true, false);
                return;
            case 13:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.b;
                ValueAnimator valueAnimator = m1Var.m;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                m1Var.m.start();
                return;
            case 14:
                z2 z2Var = (z2) this.b;
                if (z2Var.G != this || (z13 = z2Var.I)) {
                    return;
                }
                z2Var.G = null;
                if (z13) {
                    return;
                }
                z2Var.b.setVisibility(0);
                if (z2Var.m0()) {
                    return;
                }
                if (z2Var.J) {
                    z2Var.c.setLayerType(2, null);
                }
                if (z2Var.V0) {
                    z2Var.b.setTranslationX(org.telegram.messenger.i0.L(48.0f));
                    z2Var.b.setAlpha(0.0f);
                    z2Var.b.setTranslationY(0.0f);
                } else {
                    z2Var.b.setTranslationY(Math.max(0, Math.min(org.telegram.messenger.i0.n, z2Var.R())) + org.telegram.messenger.i0.L(10.0f) + z2Var.S() + z2Var.f);
                }
                z2Var.h0();
                z2Var.A0 = 1;
                ValueAnimator valueAnimator2 = z2Var.B0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z2Var.C0, 1.0f);
                z2Var.B0 = ofFloat;
                ofFloat.addUpdateListener(new l2(z2Var, 0));
                z2Var.z0 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ObjectAnimator.ofFloat(z2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(z2Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new l2(z2Var, 1));
                arrayList2.add(ofFloat2);
                arrayList2.add(ObjectAnimator.ofInt(z2Var.Y, i6.d, z2Var.o0 ? z2Var.p0 : 0));
                arrayList2.add(z2Var.B0);
                z2Var.G(arrayList2, true);
                z2Var.z0.playTogether(arrayList2);
                if (z2Var.V0) {
                    z2Var.z0.setDuration(250L);
                    z2Var.z0.setInterpolator(gr.f);
                } else {
                    z2Var.z0.setDuration(z2Var.j0);
                    z2Var.z0.setInterpolator(z2Var.k0);
                }
                z2Var.z0.setStartDelay(z2Var.D ? 0L : 20L);
                z2Var.z0.setInterpolator(z2Var.k0);
                z2Var.L0.d();
                z2Var.z0.addListener(new r2(z2Var, r3));
                if (z2Var.K0) {
                    zs.e().k(98, 512);
                }
                z2Var.z0.start();
                return;
            case 15:
                q4 q4Var = (q4) this.b;
                q4Var.k();
                q4Var.j();
                q4Var.f.setAlpha(1.0f);
                return;
            case 16:
                org.telegram.ui.Cells.i iVar = (org.telegram.ui.Cells.i) this.b;
                q80 q80Var = iVar.x;
                if (q80Var != null) {
                    CharacterStyle characterStyle = q80Var.i;
                    final String url = characterStyle instanceof e51 ? ((e51) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        iVar.performHapticFeedback(0, 2);
                    } catch (Exception unused2) {
                    }
                    final StaticLayout staticLayout = iVar.D;
                    final float f12 = iVar.y;
                    if (iVar.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) iVar.x.i;
                        z2 k10 = m5.k(1, iVar.getContext(), null, false);
                        k10.O = url;
                        k10.P = false;
                        CharSequence[] charSequenceArr = {cd.L0(2131747833, null), cd.L0(2131751767, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i36) {
                                i iVar2 = (i) mg.c2.this.b;
                                org.telegram.ui.ActionBar.k2 k2Var = iVar2.H;
                                if (i36 == 0) {
                                    iVar2.d(clickableSpan, staticLayout, f12);
                                    return;
                                }
                                if (i36 == 1) {
                                    String str3 = url;
                                    org.telegram.messenger.i0.g(str3);
                                    if (org.telegram.messenger.i0.H3()) {
                                        if (str3.startsWith("@")) {
                                            org.telegram.messenger.m5.n(null, 2131743691, cc.a0(k2Var), R.raw.copy, 36);
                                        } else if (str3.startsWith("#") || str3.startsWith("$")) {
                                            org.telegram.messenger.m5.n(null, 2131749371, cc.a0(k2Var), R.raw.copy, 36);
                                        } else {
                                            org.telegram.messenger.m5.n(null, 2131748931, cc.a0(k2Var), R.raw.copy, 36);
                                        }
                                    }
                                }
                            }
                        };
                        k10.L = charSequenceArr;
                        k10.K = onClickListener;
                        k10.H0 = new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ((i) mg.c2.this.b).e();
                            }
                        };
                        k10.show();
                    }
                    iVar.x = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.b;
                if (zVar.b == null) {
                    zVar.b = new androidx.emoji2.text.j(zVar, 4);
                }
                androidx.emoji2.text.j jVar = zVar.b;
                int i36 = zVar.c + 1;
                zVar.c = i36;
                jVar.b = i36;
                zVar.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 18:
                x5 x5Var = (x5) this.b;
                TextView textView = x5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                x5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(x5Var.a, (Property<TextView, Float>) property, 1.0f));
                x5Var.d.setDuration(250L);
                x5Var.d.setInterpolator(new DecelerateInterpolator());
                x5Var.d.addListener(new s9(this, 6));
                x5Var.d.start();
                return;
            case 19:
                u6 u6Var = (u6) this.b;
                u6Var.a();
                RectF rectF = u6Var.r;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                org.telegram.messenger.i0.h3(u6Var.D, 1000L);
                return;
            case 20:
                o7 o7Var = (o7) this.b;
                if (o7Var.b == null) {
                    o7Var.b = new androidx.emoji2.text.j(o7Var, i15);
                }
                androidx.emoji2.text.j jVar2 = o7Var.b;
                int i37 = o7Var.c + 1;
                o7Var.c = i37;
                jVar2.b = i37;
                o7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 21:
                v7 v7Var = (v7) this.b;
                RectF rectF2 = v7Var.s;
                v7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                org.telegram.messenger.i0.h3(v7Var.F, 1000L);
                return;
            case 22:
                h7 h7Var = (h7) this.b;
                w7 w7Var = h7Var.D;
                if (MediaController.B().u0 == null) {
                    return;
                }
                int i38 = w7Var.z2 + 1;
                w7Var.z2 = i38;
                if (i38 != 1) {
                    if (i38 != 2) {
                        MediaController.B().m0(true, 13.0f);
                        return;
                    } else {
                        MediaController.B().m0(true, 7.0f);
                        org.telegram.messenger.i0.h3(this, 2000L);
                        return;
                    }
                }
                h7Var.w = true;
                w7Var.x2 = 1;
                if (MediaController.B().H()) {
                    w7Var.Y0();
                } else if (w7Var.x2 == 1) {
                    org.telegram.messenger.i0.r(w7Var.E2);
                    w7Var.B2 = 0L;
                }
                MediaController.B().m0(true, 4.0f);
                org.telegram.messenger.i0.h3(this, 2000L);
                return;
            case 23:
                w7 w7Var2 = (w7) this.b;
                u61 u61Var = MediaController.B().i0;
                long U = u61Var == null ? 0L : u61Var.U();
                if (U == 0 || U == -9223372036854775807L) {
                    w7Var2.A2 = System.currentTimeMillis();
                    return;
                }
                float f13 = w7Var2.y2;
                long currentTimeMillis4 = System.currentTimeMillis();
                long j21 = currentTimeMillis4 - w7Var2.A2;
                w7Var2.A2 = currentTimeMillis4;
                long j22 = currentTimeMillis4 - w7Var2.B2;
                int i39 = w7Var2.z2;
                float f14 = ((long) ((f13 * r4) + (((i39 == 1 ? 3L : i39 == 2 ? 6L : 12L) * j21) - j21))) / U;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                w7Var2.y2 = f14;
                jj jjVar2 = MediaController.B().u0;
                if (jjVar2 != null && jjVar2.I3()) {
                    if (!MediaController.B().H()) {
                        MediaController.B().u0.b0 = w7Var2.y2;
                    }
                    w7Var2.b1(jjVar2, false);
                }
                if (w7Var2.x2 == 1 && w7Var2.z2 > 0 && MediaController.B().H()) {
                    if (j22 > 200 || w7Var2.y2 == 0.0f) {
                        w7Var2.B2 = currentTimeMillis4;
                        MediaController.B().i0(MediaController.B().u0, f14);
                    }
                    if (w7Var2.z2 <= 0 || w7Var2.y2 <= 0.0f) {
                        return;
                    }
                    org.telegram.messenger.i0.h3(w7Var2.E2, 16L);
                    return;
                }
                return;
            case 24:
                jc jcVar = (jc) this.b;
                jcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                jcVar.f.performHapticFeedback(0);
                Runnable runnable = jcVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 25:
                wj wjVar = (wj) this.b;
                if (wjVar.S) {
                    wjVar.N.clear();
                    wjVar.P.clear();
                    wjVar.Q.clear();
                    wjVar.f();
                    return;
                }
                return;
            case 26:
                a();
                return;
            case 27:
                jn jnVar = (jn) this.b;
                c2 c2Var = jnVar.U0;
                e6 e6Var = jnVar.g1;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (jnVar.H || editField == null || !jnVar.G || jnVar.e1 || org.telegram.messenger.i0.D || org.telegram.messenger.i0.E || !org.telegram.messenger.i0.Q1()) {
                        return;
                    }
                    editField.requestFocus();
                    org.telegram.messenger.i0.J3(editField);
                    org.telegram.messenger.i0.r(c2Var);
                    org.telegram.messenger.i0.h3(c2Var, 100L);
                    return;
                }
                return;
            case 28:
                wt wtVar = (wt) this.b;
                c2 c2Var2 = wtVar.P;
                rt rtVar = wtVar.a;
                if (wtVar.D || rtVar == null || !wtVar.N || wtVar.w || org.telegram.messenger.i0.D || org.telegram.messenger.i0.E || !org.telegram.messenger.i0.Q1()) {
                    return;
                }
                rtVar.requestFocus();
                org.telegram.messenger.i0.J3(rtVar);
                org.telegram.messenger.i0.r(c2Var2);
                org.telegram.messenger.i0.h3(c2Var2, 100L);
                return;
            default:
                ac.a aVar = (ac.a) ((org.telegram.ui.ActionBar.g1) this.b).d;
                if (!aVar.a || ((ArrayList) aVar.d).isEmpty() || ((AnimatorSet) aVar.c).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) aVar.c).start();
                    return;
                } catch (Exception unused3) {
                    return;
                }
        }
    }

    public /* synthetic */ c2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c2(za.c cVar, int i10) {
        this.a = 1;
        this.b = cVar;
    }
}
