package mi;

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
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.cf;
import org.telegram.messenger.hs;
import org.telegram.messenger.iu;
import org.telegram.messenger.lu;
import org.telegram.messenger.me;
import org.telegram.messenger.qf;
import org.telegram.messenger.qu;
import org.telegram.messenger.ud;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Cells.j7;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z7;
import org.telegram.ui.Components.zl;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b0() {
        this.a = 6;
    }

    private final void a() {
        zl zlVar = (zl) this.b;
        am amVar = zlVar.Q;
        if (amVar.K == null || amVar.L) {
            return;
        }
        int computeVerticalScrollOffset = amVar.r.computeVerticalScrollOffset();
        boolean z10 = amVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (zlVar.e() - zlVar.r) + zlVar.n;
        float max = Math.max(0.0f, (amVar.F - Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
        float max2 = Math.max(0.0f, ((amVar.r.getMeasuredHeight() - (amVar.F - computeVerticalScrollOffset)) - amVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
        float L = org.telegram.messenger.g0.L(32.0f);
        float L2 = (max >= L || computeVerticalScrollOffset <= amVar.getListTopPadding()) ? max2 < L ? org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L)) : 0.0f : (-(1.0f - (max / L))) * org.telegram.messenger.g0.L(6.0f);
        int i3 = (int) L2;
        if (Math.abs(i3) > 0 && amVar.r.canScrollVertically(i3) && (L2 <= 0.0f || !z10)) {
            amVar.F += L2;
            amVar.r.scrollBy(0, i3);
            zlVar.invalidate();
        }
        zlVar.M = true;
        zlVar.postDelayed(this, 15L);
    }

    /* JADX WARN: Removed duplicated region for block: B:358:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ByteBuffer allocateDirect;
        cf cfVar;
        boolean z10;
        File file;
        int i3;
        long j10;
        long j11;
        long j12;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = 5;
        switch (this.a) {
            case 0:
                ((f0) this.b).h();
                return;
            case 1:
                Object obj = ((gi.w5) this.b).b;
                return;
            case 2:
                og.e eVar = (og.e) this.b;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 3:
                if (!((org.telegram.messenger.r5) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i12 = 0;
                    while (i12 < ((org.telegram.messenger.r5) this.b).a.size()) {
                        org.telegram.messenger.q5 q5Var = (org.telegram.messenger.q5) ((org.telegram.messenger.r5) this.b).a.get(i12);
                        if (q5Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            q5Var.recycle();
                            ((org.telegram.messenger.r5) this.b).a.remove(i12);
                            org.telegram.messenger.r5 r5Var = (org.telegram.messenger.r5) this.b;
                            r5Var.e--;
                            i12--;
                        }
                        i12++;
                    }
                }
                if (((org.telegram.messenger.r5) this.b).a.isEmpty() && ((org.telegram.messenger.r5) this.b).c.isEmpty()) {
                    ((org.telegram.messenger.r5) this.b).h = false;
                    return;
                } else {
                    Utilities.e.e(this, 30000L);
                    ((org.telegram.messenger.r5) this.b).h = true;
                    return;
                }
            case 4:
                org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) this.b;
                z5Var.J.clear();
                z5Var.getNotificationCenter().k(hs.b5, new Object[0]);
                return;
            case 5:
                MediaController mediaController = (MediaController) this.b;
                ArrayList arrayList = mediaController.y1;
                if (mediaController.f1 != null) {
                    if (arrayList.isEmpty()) {
                        allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                    } else {
                        allocateDirect = (ByteBuffer) arrayList.get(0);
                        arrayList.remove(0);
                    }
                    allocateDirect.rewind();
                    int read = mediaController.f1.read(allocateDirect, allocateDirect.capacity());
                    if (read <= 0) {
                        arrayList.add(allocateDirect);
                        int i13 = mediaController.C1;
                        if (i13 == 3 || i13 == 4) {
                            return;
                        }
                        mediaController.C0(i13, mediaController.E1, mediaController.D1, mediaController.F1);
                        return;
                    }
                    allocateDirect.limit(read);
                    double d = 0.0d;
                    try {
                        long j13 = mediaController.w1;
                        long j14 = (read / 2) + j13;
                        int length = (int) ((j13 / j14) * r0.length);
                        int length2 = mediaController.v1.length - length;
                        if (length != 0) {
                            float length3 = r0.length / length;
                            float f10 = 0.0f;
                            for (int i14 = 0; i14 < length; i14++) {
                                short[] sArr = mediaController.v1;
                                sArr[i14] = sArr[(int) f10];
                                f10 += length3;
                            }
                        }
                        float f11 = (read / 2.0f) / length2;
                        int i15 = length;
                        float f12 = 0.0f;
                        for (int i16 = 0; i16 < read / 2; i16++) {
                            short s6 = allocateDirect.getShort();
                            d += s6 * s6;
                            if (i16 == ((int) f12)) {
                                short[] sArr2 = mediaController.v1;
                                if (i15 < sArr2.length) {
                                    sArr2[i15] = s6;
                                    f12 += f11;
                                    i15++;
                                }
                            }
                        }
                        mediaController.w1 = j14;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    allocateDirect.position(0);
                    double sqrt = Math.sqrt((d / read) / 2.0d);
                    mediaController.O1.c(new qf(this, allocateDirect, read != allocateDirect.capacity(), 6));
                    mediaController.N1.c(mediaController.P1);
                    org.telegram.messenger.g0.h3(new me(this, sqrt, 0));
                    return;
                }
                return;
            case 6:
                MediaController B = MediaController.B();
                cf cfVar2 = (cf) this.b;
                zi ziVar = cfVar2.a;
                b20 b20Var = cfVar2.b;
                if (ziVar == null || b20Var == null) {
                    return;
                }
                String str = b20Var.o;
                long j15 = b20Var.p;
                long j16 = b20Var.a;
                long j17 = b20Var.c;
                long j18 = b20Var.b;
                int i17 = b20Var.k;
                int i18 = b20Var.l;
                int i19 = b20Var.g;
                int i20 = b20Var.h;
                int i21 = b20Var.i;
                int i22 = b20Var.n;
                int i23 = b20Var.m;
                int i24 = b20Var.j;
                if (org.telegram.messenger.m5.C(zi.B0(ziVar.k)) || b20Var.V) {
                    cfVar = cfVar2;
                    z10 = true;
                } else {
                    cfVar = cfVar2;
                    z10 = false;
                }
                File file2 = new File(ziVar.k.attachPath);
                if (file2.exists()) {
                    file2.delete();
                }
                if (org.telegram.messenger.r2.a) {
                    file = file2;
                    StringBuilder sb2 = new StringBuilder("begin convert ");
                    sb2.append(str);
                    sb2.append(" startTime = ");
                    sb2.append(j16);
                    sb2.append(" avatarStartTime = ");
                    sb2.append(j17);
                    sb2.append(" endTime ");
                    sb2.append(j18);
                    sb2.append(" rWidth = ");
                    sb2.append(i17);
                    sb2.append(" rHeight = ");
                    sb2.append(i18);
                    sb2.append(" rotation = ");
                    sb2.append(i19);
                    sb2.append(" oWidth = ");
                    sb2.append(i20);
                    sb2.append(" oHeight = ");
                    sb2.append(i21);
                    sb2.append(" framerate = ");
                    sb2.append(i22);
                    sb2.append(" bitrate = ");
                    sb2.append(i23);
                    sb2.append(" originalBitrate = ");
                    i3 = i24;
                    sb2.append(i3);
                    a8.b(sb2.toString());
                } else {
                    file = file2;
                    i3 = i24;
                }
                if (str == null) {
                    str = "";
                }
                if (j16 <= 0 || j18 <= 0) {
                    if (j18 > 0) {
                        j10 = j18;
                        j11 = j10;
                    } else if (j16 > 0) {
                        j10 = j18;
                        j12 = b20Var.v - j16;
                    } else {
                        j10 = j18;
                        j11 = b20Var.v;
                    }
                    if (i22 != 0) {
                        i22 = 25;
                    } else if (i22 > 59) {
                        i22 = 59;
                    }
                    if (i19 != 90 || i19 == 270) {
                        i10 = i18;
                        i18 = i17;
                    } else {
                        i10 = i17;
                    }
                    if (!b20Var.Z && i22 > 40 && Math.min(i18, i10) <= 480) {
                        i22 = 30;
                    }
                    int i25 = i22;
                    boolean z14 = (j17 != -1 && b20Var.H == null && b20Var.G == null && b20Var.B == null && b20Var.A == null && i10 == i20 && i18 == i21 && i19 == 0 && !b20Var.s && j16 == -1 && b20Var.b0.isEmpty()) ? false : true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("videoconvert", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    int i26 = i10;
                    cf cfVar3 = cfVar;
                    o4.m0 m0Var = new o4.m0(B, b20Var, file, cfVar3);
                    b20Var.X = true;
                    MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
                    File file3 = file;
                    MediaCodecVideoConvertor.ConvertVideoParams of2 = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file3, j15, i19, z10, i20, i21, i26, i18, i25, i23, i3, j16, j10, j17, z14, j11, m0Var, b20Var);
                    of2.soundInfos.addAll(b20Var.b0);
                    boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of2);
                    z11 = b20Var.W;
                    if (!z11) {
                        synchronized (B.b) {
                            z11 = b20Var.W;
                        }
                    }
                    if (org.telegram.messenger.r2.a) {
                        a8.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z11);
                    }
                    sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
                    long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
                    long length4 = file3.length();
                    boolean z15 = !convertVideo || z11;
                    b20 b20Var2 = cfVar3.b;
                    z12 = b20Var2.X;
                    if (z12) {
                        b20Var2.X = false;
                    }
                    org.telegram.messenger.g0.h3(new ud(B, z15, true, cfVar3, file3, 1.0f, lastFrameTimestamp, z12, length4));
                    return;
                }
                j12 = j18 - j16;
                j10 = j18;
                j11 = j12;
                if (i22 != 0) {
                }
                if (i19 != 90) {
                }
                i10 = i18;
                i18 = i17;
                if (!b20Var.Z) {
                    i22 = 30;
                }
                int i252 = i22;
                if (j17 != -1) {
                }
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.b.getSharedPreferences("videoconvert", 0);
                long currentTimeMillis2 = System.currentTimeMillis();
                int i262 = i10;
                cf cfVar32 = cfVar;
                o4.m0 m0Var2 = new o4.m0(B, b20Var, file, cfVar32);
                b20Var.X = true;
                MediaCodecVideoConvertor mediaCodecVideoConvertor2 = new MediaCodecVideoConvertor();
                File file32 = file;
                MediaCodecVideoConvertor.ConvertVideoParams of22 = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file32, j15, i19, z10, i20, i21, i262, i18, i252, i23, i3, j16, j10, j17, z14, j11, m0Var2, b20Var);
                of22.soundInfos.addAll(b20Var.b0);
                boolean convertVideo2 = mediaCodecVideoConvertor2.convertVideo(of22);
                z11 = b20Var.W;
                if (!z11) {
                }
                if (org.telegram.messenger.r2.a) {
                }
                sharedPreferences2.edit().putBoolean("isPreviousOk", true).apply();
                long lastFrameTimestamp2 = mediaCodecVideoConvertor2.getLastFrameTimestamp();
                long length42 = file32.length();
                if (convertVideo2) {
                }
                b20 b20Var22 = cfVar32.b;
                z12 = b20Var22.X;
                if (z12) {
                }
                org.telegram.messenger.g0.h3(new ud(B, z15, true, cfVar32, file32, 1.0f, lastFrameTimestamp2, z12, length42));
                return;
            case 7:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a == null || MediaController.B().v0 == null) {
                    return;
                }
                if (MediaController.B().v0.h0 == -9223372036854775807L) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                RemoteControlClient.MetadataEditor editMetadata = musicPlayerService.a.editMetadata(false);
                editMetadata.putLong(9, MediaController.B().v0.h0 * 1000);
                editMetadata.apply();
                musicPlayerService.a.setPlaybackState(MediaController.B().H() ? 2 : 3, Math.max(MediaController.B().v0.g0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                return;
            case 8:
                org.telegram.messenger.t0.b.sendBroadcast((Intent) this.b);
                return;
            case 9:
                iu iuVar = (iu) this.b;
                OverScroller overScroller = iuVar.n0;
                if (overScroller == null || iuVar.W == null || !overScroller.computeScrollOffset()) {
                    return;
                }
                int currX = iuVar.n0.getCurrX();
                r2 = currX >= 0 ? currX : 0;
                int i27 = iuVar.d0;
                if (r2 > i27) {
                    r2 = i27;
                }
                if (r2 != iuVar.e0) {
                    iuVar.e0 = r2;
                    iuVar.W.invalidate();
                }
                if (iuVar.n0.isFinished()) {
                    return;
                }
                iuVar.W.postOnAnimation(this);
                return;
            case 10:
                lu luVar = (lu) this.b;
                OverScroller overScroller2 = luVar.v0;
                if (overScroller2 == null || luVar.W == null || !overScroller2.computeScrollOffset()) {
                    return;
                }
                int currX2 = luVar.v0.getCurrX();
                r2 = currX2 >= 0 ? currX2 : 0;
                int i28 = luVar.b0;
                if (r2 > i28) {
                    r2 = i28;
                }
                if (r2 != luVar.c0) {
                    luVar.c0 = r2;
                    luVar.Z(luVar.T, luVar.U, luVar.V);
                    luVar.W.invalidate();
                }
                if (luVar.v0.isFinished()) {
                    return;
                }
                luVar.W.postOnAnimation(this);
                return;
            case 11:
                qu quVar = (qu) this.b;
                OverScroller overScroller3 = quVar.z0;
                if (overScroller3 == null || quVar.W == null || !overScroller3.computeScrollOffset()) {
                    return;
                }
                int currX3 = quVar.z0.getCurrX();
                r2 = currX3 >= 0 ? currX3 : 0;
                int i29 = quVar.i0;
                if (r2 > i29) {
                    r2 = i29;
                }
                if (r2 != quVar.j0) {
                    quVar.j0 = r2;
                    quVar.Z(quVar.T, quVar.U, quVar.V);
                    quVar.W.invalidate();
                }
                if (quVar.z0.isFinished()) {
                    return;
                }
                quVar.W.postOnAnimation(this);
                return;
            case 12:
                long currentTimeMillis3 = System.currentTimeMillis();
                bz bzVar = (bz) this.b;
                if (Math.abs(currentTimeMillis3 - bzVar.b) < 2000) {
                    return;
                }
                bzVar.b = currentTimeMillis3;
                try {
                    bzVar.s.b();
                    for (int i30 = 0; i30 < 3; i30++) {
                        for (int i31 = 0; i31 < 7; i31++) {
                            bzVar.s.write(bz.a(bzVar, bzVar.c[i30][i31]), 0, 8);
                            bzVar.s.write(bz.a(bzVar, bzVar.d[i30][i31]), 0, 8);
                            bzVar.s.write(bz.b(bzVar, bzVar.e[i30][i31]), 0, 4);
                            bzVar.s.write(bz.b(bzVar, bzVar.f[i30][i31]), 0, 4);
                        }
                        bzVar.s.write(bz.b(bzVar, bzVar.n[i30]), 0, 4);
                        bzVar.s.write(bz.a(bzVar, bzVar.h[i30]), 0, 8);
                    }
                    for (int i32 = 0; i32 < 3; i32++) {
                        bzVar.s.write(bz.a(bzVar, bzVar.c[i32][7]), 0, 8);
                        bzVar.s.write(bz.a(bzVar, bzVar.d[i32][7]), 0, 8);
                        bzVar.s.write(bz.b(bzVar, bzVar.e[i32][7]), 0, 4);
                        bzVar.s.write(bz.b(bzVar, bzVar.f[i32][7]), 0, 4);
                    }
                    bzVar.r.seek(0L);
                    RandomAccessFile randomAccessFile = bzVar.r;
                    cg.c0 c0Var = bzVar.s;
                    randomAccessFile.write(c0Var.a, 0, c0Var.b);
                    bzVar.r.getFD().sync();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 13:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d != this) {
                    return;
                }
                actionBarLayout.d = null;
                actionBarLayout.h0(false, true, false);
                return;
            case 14:
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.b;
                ValueAnimator valueAnimator = h1Var.m;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                h1Var.m.start();
                return;
            case 15:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.b;
                if (t2Var.H != this || (z13 = t2Var.J)) {
                    return;
                }
                t2Var.H = null;
                if (z13) {
                    return;
                }
                t2Var.b.setVisibility(0);
                if (t2Var.m0()) {
                    return;
                }
                if (t2Var.K) {
                    t2Var.c.setLayerType(2, null);
                }
                if (t2Var.W0) {
                    t2Var.b.setTranslationX(org.telegram.messenger.g0.L(48.0f));
                    t2Var.b.setAlpha(0.0f);
                    t2Var.b.setTranslationY(0.0f);
                } else {
                    t2Var.b.setTranslationY(Math.max(0, Math.min(org.telegram.messenger.g0.n, t2Var.Q())) + org.telegram.messenger.g0.L(10.0f) + t2Var.R() + t2Var.f);
                }
                t2Var.h0();
                t2Var.B0 = 1;
                ValueAnimator valueAnimator2 = t2Var.C0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(t2Var.D0, 1.0f);
                t2Var.C0 = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.f2(t2Var, 0));
                t2Var.A0 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ObjectAnimator.ofFloat(t2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(t2Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.f2(t2Var, 1));
                arrayList2.add(ofFloat2);
                arrayList2.add(ObjectAnimator.ofInt(t2Var.Z, k6.d, t2Var.p0 ? t2Var.q0 : 0));
                arrayList2.add(t2Var.C0);
                t2Var.E(arrayList2, true);
                t2Var.A0.playTogether(arrayList2);
                if (t2Var.W0) {
                    t2Var.A0.setDuration(250L);
                    t2Var.A0.setInterpolator(xq.f);
                } else {
                    t2Var.A0.setDuration(t2Var.k0);
                    t2Var.A0.setInterpolator(t2Var.l0);
                }
                t2Var.A0.setStartDelay(t2Var.E ? 0L : 20L);
                t2Var.A0.setInterpolator(t2Var.l0);
                t2Var.M0.d();
                t2Var.A0.addListener(new org.telegram.ui.ActionBar.l2(t2Var, r2));
                if (t2Var.L0) {
                    hs.e().k(98, 512);
                }
                t2Var.A0.start();
                return;
            case 16:
                org.telegram.ui.ActionBar.i4 i4Var = (org.telegram.ui.ActionBar.i4) this.b;
                i4Var.k();
                i4Var.j();
                i4Var.f.setAlpha(1.0f);
                return;
            case 17:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                t70 t70Var = jVar.x;
                if (t70Var != null) {
                    CharacterStyle characterStyle = t70Var.i;
                    final String url = characterStyle instanceof v31 ? ((v31) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        jVar.performHapticFeedback(0, 2);
                    } catch (Exception unused2) {
                    }
                    final StaticLayout staticLayout = jVar.E;
                    final float f13 = jVar.y;
                    if (jVar.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) jVar.x.i;
                        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, jVar.getContext(), null, false);
                        l10.P = url;
                        l10.Q = false;
                        CharSequence[] charSequenceArr = {bd.M0(2131747825, null), bd.M0(2131751767, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i33) {
                                j jVar2 = (j) mi.b0.this.b;
                                org.telegram.ui.ActionBar.d2 d2Var = jVar2.I;
                                if (i33 == 0) {
                                    jVar2.d(clickableSpan, staticLayout, f13);
                                    return;
                                }
                                if (i33 == 1) {
                                    String str2 = url;
                                    org.telegram.messenger.g0.g(str2);
                                    if (org.telegram.messenger.g0.I3()) {
                                        if (str2.startsWith("@")) {
                                            org.telegram.messenger.k5.o(null, 2131743675, fc.a0(d2Var), R.raw.copy, 36);
                                        } else if (str2.startsWith("#") || str2.startsWith("$")) {
                                            org.telegram.messenger.k5.o(null, 2131749370, fc.a0(d2Var), R.raw.copy, 36);
                                        } else {
                                            org.telegram.messenger.k5.o(null, 2131748929, fc.a0(d2Var), R.raw.copy, 36);
                                        }
                                    }
                                }
                            }
                        };
                        l10.M = charSequenceArr;
                        l10.L = onClickListener;
                        l10.I0 = new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ((j) mi.b0.this.b).e();
                            }
                        };
                        l10.show();
                    }
                    jVar.x = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.b;
                if (zVar.b == null) {
                    zVar.b = new androidx.emoji2.text.j(zVar, 4);
                }
                androidx.emoji2.text.j jVar2 = zVar.b;
                int i33 = zVar.c + 1;
                zVar.c = i33;
                jVar2.b = i33;
                zVar.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 19:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.b;
                TextView textView = s5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                s5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(s5Var.a, (Property<TextView, Float>) property, 1.0f));
                s5Var.d.setDuration(250L);
                s5Var.d.setInterpolator(new DecelerateInterpolator());
                s5Var.d.addListener(new ii.v3(this, 26));
                s5Var.d.start();
                return;
            case 20:
                p6 p6Var = (p6) this.b;
                p6Var.a();
                RectF rectF = p6Var.r;
                p6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                org.telegram.messenger.g0.i3(p6Var.E, 1000L);
                return;
            case 21:
                j7 j7Var = (j7) this.b;
                if (j7Var.b == null) {
                    j7Var.b = new androidx.emoji2.text.j(j7Var, i11);
                }
                androidx.emoji2.text.j jVar3 = j7Var.b;
                int i34 = j7Var.c + 1;
                j7Var.c = i34;
                jVar3.b = i34;
                j7Var.postDelayed(jVar3, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 22:
                q7 q7Var = (q7) this.b;
                RectF rectF2 = q7Var.s;
                q7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                org.telegram.messenger.g0.i3(q7Var.G, 1000L);
                return;
            case 23:
                org.telegram.ui.Components.j7 j7Var2 = (org.telegram.ui.Components.j7) this.b;
                z7 z7Var = j7Var2.E;
                if (MediaController.B().v0 == null) {
                    return;
                }
                int i35 = z7Var.A2 + 1;
                z7Var.A2 = i35;
                if (i35 != 1) {
                    if (i35 != 2) {
                        MediaController.B().m0(true, 13.0f);
                        return;
                    } else {
                        MediaController.B().m0(true, 7.0f);
                        org.telegram.messenger.g0.i3(this, 2000L);
                        return;
                    }
                }
                j7Var2.w = true;
                z7Var.y2 = 1;
                if (MediaController.B().H()) {
                    z7Var.Y0();
                } else if (z7Var.y2 == 1) {
                    org.telegram.messenger.g0.r(z7Var.F2);
                    z7Var.C2 = 0L;
                }
                MediaController.B().m0(true, 4.0f);
                org.telegram.messenger.g0.i3(this, 2000L);
                return;
            case 24:
                z7 z7Var2 = (z7) this.b;
                m51 m51Var = MediaController.B().j0;
                long U = m51Var == null ? 0L : m51Var.U();
                if (U == 0 || U == -9223372036854775807L) {
                    z7Var2.B2 = System.currentTimeMillis();
                    return;
                }
                float f14 = z7Var2.z2;
                long currentTimeMillis4 = System.currentTimeMillis();
                long j19 = currentTimeMillis4 - z7Var2.B2;
                z7Var2.B2 = currentTimeMillis4;
                long j20 = currentTimeMillis4 - z7Var2.C2;
                int i36 = z7Var2.A2;
                float f15 = ((long) ((f14 * r3) + (((i36 == 1 ? 3L : i36 == 2 ? 6L : 12L) * j19) - j19))) / U;
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                z7Var2.z2 = f15;
                zi ziVar2 = MediaController.B().v0;
                if (ziVar2 != null && ziVar2.J3()) {
                    if (!MediaController.B().H()) {
                        MediaController.B().v0.b0 = z7Var2.z2;
                    }
                    z7Var2.b1(ziVar2, false);
                }
                if (z7Var2.y2 == 1 && z7Var2.A2 > 0 && MediaController.B().H()) {
                    if (j20 > 200 || z7Var2.z2 == 0.0f) {
                        z7Var2.C2 = currentTimeMillis4;
                        MediaController.B().i0(MediaController.B().v0, f15);
                    }
                    if (z7Var2.A2 <= 0 || z7Var2.z2 <= 0.0f) {
                        return;
                    }
                    org.telegram.messenger.g0.i3(z7Var2.F2, 16L);
                    return;
                }
                return;
            case 25:
                nc ncVar = (nc) this.b;
                ncVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                ncVar.f.performHapticFeedback(0);
                Runnable runnable = ncVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                tj tjVar = (tj) this.b;
                if (tjVar.T) {
                    tjVar.O.clear();
                    tjVar.Q.clear();
                    tjVar.R.clear();
                    tjVar.f();
                    return;
                }
                return;
            case 27:
                a();
                return;
            case 28:
                an anVar = (an) this.b;
                b0 b0Var = anVar.V0;
                org.telegram.ui.Cells.z5 z5Var2 = anVar.h1;
                if (z5Var2 != null) {
                    EditTextBoldCursor editField = z5Var2.getEditField();
                    if (anVar.I || editField == null || !anVar.H || anVar.f1 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || !org.telegram.messenger.g0.Q1()) {
                        return;
                    }
                    editField.requestFocus();
                    org.telegram.messenger.g0.K3(editField);
                    org.telegram.messenger.g0.r(b0Var);
                    org.telegram.messenger.g0.i3(b0Var, 100L);
                    return;
                }
                return;
            default:
                jt jtVar = (jt) this.b;
                b0 b0Var2 = jtVar.Q;
                dt dtVar = jtVar.a;
                if (jtVar.E || dtVar == null || !jtVar.O || jtVar.w || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || !org.telegram.messenger.g0.Q1()) {
                    return;
                }
                dtVar.requestFocus();
                org.telegram.messenger.g0.K3(dtVar);
                org.telegram.messenger.g0.r(b0Var2);
                org.telegram.messenger.g0.i3(b0Var2, 100L);
                return;
        }
    }

    public /* synthetic */ b0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public b0(gi.w5 w5Var, int i3) {
        this.a = 1;
        this.b = w5Var;
    }
}
