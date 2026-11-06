package m;

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
import android.util.Log;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ae;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.jz;
import org.telegram.messenger.k5;
import org.telegram.messenger.lf;
import org.telegram.messenger.m5;
import org.telegram.messenger.q5;
import org.telegram.messenger.qs;
import org.telegram.messenger.qu;
import org.telegram.messenger.r5;
import org.telegram.messenger.re;
import org.telegram.messenger.te;
import org.telegram.messenger.tu;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.yf;
import org.telegram.messenger.yu;
import org.telegram.messenger.z5;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Cells.k7;
import org.telegram.ui.Cells.q6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l7;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f3 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f3() {
        this.a = 7;
    }

    private final void a() {
        am amVar = (am) this.b;
        bm bmVar = amVar.P;
        if (bmVar.J == null || bmVar.K) {
            return;
        }
        int computeVerticalScrollOffset = bmVar.r.computeVerticalScrollOffset();
        boolean z9 = bmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (amVar.e() - amVar.r) + amVar.n;
        float max = Math.max(0.0f, (bmVar.E - Math.max(0, computeVerticalScrollOffset - bmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
        float max2 = Math.max(0.0f, ((bmVar.r.getMeasuredHeight() - (bmVar.E - computeVerticalScrollOffset)) - bmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
        float L = org.telegram.messenger.g0.L(32.0f);
        float L2 = (max >= L || computeVerticalScrollOffset <= bmVar.getListTopPadding()) ? max2 < L ? org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L)) : 0.0f : (-(1.0f - (max / L))) * org.telegram.messenger.g0.L(6.0f);
        int i7 = (int) L2;
        if (Math.abs(i7) > 0 && bmVar.r.canScrollVertically(i7) && (L2 <= 0.0f || !z9)) {
            bmVar.E += L2;
            bmVar.r.scrollBy(0, i7);
            amVar.invalidate();
        }
        amVar.L = true;
        amVar.postDelayed(this, 15L);
    }

    /* JADX WARN: Removed duplicated region for block: B:336:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07b7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        i iVar;
        int i7;
        ByteBuffer allocateDirect;
        long j3;
        boolean z9;
        long j10;
        File file;
        int i10;
        int i11;
        int i12;
        long j11;
        long j12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15 = 5;
        switch (this.a) {
            case 0:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (iVar = actionMenuView.J) == null) {
                    return;
                }
                iVar.l();
                return;
            case 1:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 2:
                ng.e eVar = (ng.e) this.b;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 3:
                Object obj = ((gf.g) this.b).b;
                return;
            case 4:
                if (!((r5) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i16 = 0;
                    while (i16 < ((r5) this.b).a.size()) {
                        q5 q5Var = (q5) ((r5) this.b).a.get(i16);
                        if (q5Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            q5Var.recycle();
                            ((r5) this.b).a.remove(i16);
                            i7 = 1;
                            ((r5) this.b).e--;
                            i16--;
                        } else {
                            i7 = 1;
                        }
                        i16 += i7;
                    }
                }
                if (((r5) this.b).a.isEmpty() && ((r5) this.b).c.isEmpty()) {
                    ((r5) this.b).h = false;
                    return;
                } else {
                    Utilities.e.d(this, 30000L);
                    ((r5) this.b).h = true;
                    return;
                }
            case 5:
                z5 z5Var = (z5) this.b;
                z5Var.I.clear();
                z5Var.getNotificationCenter().k(qs.b5, new Object[0]);
                return;
            case 6:
                MediaController mediaController = (MediaController) this.b;
                ArrayList arrayList = mediaController.x1;
                if (mediaController.e1 != null) {
                    if (arrayList.isEmpty()) {
                        allocateDirect = ByteBuffer.allocateDirect(mediaController.z1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                    } else {
                        allocateDirect = (ByteBuffer) arrayList.get(0);
                        arrayList.remove(0);
                    }
                    allocateDirect.rewind();
                    int read = mediaController.e1.read(allocateDirect, allocateDirect.capacity());
                    if (read <= 0) {
                        arrayList.add(allocateDirect);
                        int i17 = mediaController.B1;
                        if (i17 == 3 || i17 == 4) {
                            return;
                        }
                        mediaController.C0(i17, mediaController.D1, mediaController.C1, mediaController.E1);
                        return;
                    }
                    allocateDirect.limit(read);
                    double d = 0.0d;
                    try {
                        long j13 = mediaController.v1;
                        long j14 = (read / 2) + j13;
                        int length = (int) ((j13 / j14) * r0.length);
                        int length2 = mediaController.u1.length - length;
                        if (length != 0) {
                            float length3 = r0.length / length;
                            float f10 = 0.0f;
                            for (int i18 = 0; i18 < length; i18++) {
                                short[] sArr = mediaController.u1;
                                sArr[i18] = sArr[(int) f10];
                                f10 += length3;
                            }
                        }
                        float f11 = (read / 2.0f) / length2;
                        int i19 = length;
                        float f12 = 0.0f;
                        for (int i20 = 0; i20 < read / 2; i20++) {
                            short s5 = allocateDirect.getShort();
                            d += s5 * s5;
                            if (i20 == ((int) f12)) {
                                short[] sArr2 = mediaController.u1;
                                if (i19 < sArr2.length) {
                                    sArr2[i19] = s5;
                                    f12 += f11;
                                    i19++;
                                }
                            }
                        }
                        mediaController.v1 = j14;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    allocateDirect.position(0);
                    double sqrt = Math.sqrt((d / read) / 2.0d);
                    mediaController.N1.c(new yf(this, allocateDirect, read != allocateDirect.capacity(), 6));
                    mediaController.M1.c(mediaController.O1);
                    org.telegram.messenger.g0.h3(new te(this, sqrt, 0));
                    return;
                }
                return;
            case 7:
                MediaController B = MediaController.B();
                lf lfVar = (lf) this.b;
                ij ijVar = lfVar.a;
                j20 j20Var = lfVar.b;
                if (ijVar == null || j20Var == null) {
                    return;
                }
                String str = j20Var.o;
                long j15 = j20Var.p;
                long j16 = j20Var.a;
                long j17 = j20Var.c;
                long j18 = j20Var.b;
                int i21 = j20Var.k;
                int i22 = j20Var.l;
                int i23 = j20Var.g;
                int i24 = j20Var.h;
                int i25 = j20Var.i;
                int i26 = j20Var.n;
                int i27 = j20Var.m;
                int i28 = j20Var.j;
                if (m5.C(ij.B0(ijVar.k)) || j20Var.V) {
                    j3 = j15;
                    z9 = true;
                } else {
                    j3 = j15;
                    z9 = false;
                }
                long j19 = j3;
                File file2 = new File(ijVar.k.attachPath);
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
                    sb2.append(i21);
                    sb2.append(" rHeight = ");
                    sb2.append(i22);
                    sb2.append(" rotation = ");
                    sb2.append(i23);
                    sb2.append(" oWidth = ");
                    sb2.append(i24);
                    sb2.append(" oHeight = ");
                    sb2.append(i25);
                    sb2.append(" framerate = ");
                    sb2.append(i26);
                    sb2.append(" bitrate = ");
                    i10 = i27;
                    sb2.append(i10);
                    j10 = j18;
                    sb2.append(" originalBitrate = ");
                    i11 = i28;
                    sb2.append(i11);
                    a8.b(sb2.toString());
                } else {
                    j10 = j18;
                    file = file2;
                    i10 = i27;
                    i11 = i28;
                }
                if (str == null) {
                    str = "";
                }
                if (j16 <= 0 || j10 <= 0) {
                    if (j10 > 0) {
                        i12 = i11;
                        j11 = j10;
                    } else if (j16 > 0) {
                        i12 = i11;
                        j12 = j20Var.v - j16;
                    } else {
                        i12 = i11;
                        j11 = j20Var.v;
                    }
                    if (i26 != 0) {
                        i13 = 25;
                    } else {
                        i13 = 59;
                        if (i26 <= 59) {
                            i13 = i26;
                        }
                    }
                    if (i23 != 90 || i23 == 270) {
                        i14 = i22;
                    } else {
                        i14 = i21;
                        i21 = i22;
                    }
                    if (!j20Var.Z && i13 > 40 && Math.min(i21, i14) <= 480) {
                        i13 = 30;
                    }
                    int i29 = i13;
                    boolean z13 = (j17 != -1 && j20Var.H == null && j20Var.G == null && j20Var.B == null && j20Var.A == null && i14 == i24 && i21 == i25 && i23 == 0 && !j20Var.s && j16 == -1 && j20Var.b0.isEmpty()) ? false : true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("videoconvert", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    File file3 = file;
                    re reVar = new re(B, j20Var, file3, lfVar);
                    j20Var.X = true;
                    MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
                    MediaCodecVideoConvertor.ConvertVideoParams of2 = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file3, j19, i23, z9, i24, i25, i14, i21, i29, i10, i12, j16, j10, j17, z13, j11, reVar, j20Var);
                    of2.soundInfos.addAll(j20Var.b0);
                    boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of2);
                    z10 = j20Var.W;
                    if (!z10) {
                        synchronized (B.b) {
                            z10 = j20Var.W;
                        }
                    }
                    if (org.telegram.messenger.r2.a) {
                        a8.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z10);
                    }
                    sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
                    long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
                    long length4 = file3.length();
                    boolean z14 = !convertVideo || z10;
                    j20 j20Var2 = lfVar.b;
                    z11 = j20Var2.X;
                    if (z11) {
                        j20Var2.X = false;
                    }
                    org.telegram.messenger.g0.h3(new ae(B, z14, true, lfVar, file3, 1.0f, lastFrameTimestamp, z11, length4));
                    return;
                }
                j12 = j10 - j16;
                i12 = i11;
                j11 = j12;
                if (i26 != 0) {
                }
                if (i23 != 90) {
                }
                i14 = i22;
                if (!j20Var.Z) {
                    i13 = 30;
                }
                int i292 = i13;
                if (j17 != -1) {
                }
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.b.getSharedPreferences("videoconvert", 0);
                long currentTimeMillis2 = System.currentTimeMillis();
                File file32 = file;
                re reVar2 = new re(B, j20Var, file32, lfVar);
                j20Var.X = true;
                MediaCodecVideoConvertor mediaCodecVideoConvertor2 = new MediaCodecVideoConvertor();
                MediaCodecVideoConvertor.ConvertVideoParams of22 = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file32, j19, i23, z9, i24, i25, i14, i21, i292, i10, i12, j16, j10, j17, z13, j11, reVar2, j20Var);
                of22.soundInfos.addAll(j20Var.b0);
                boolean convertVideo2 = mediaCodecVideoConvertor2.convertVideo(of22);
                z10 = j20Var.W;
                if (!z10) {
                }
                if (org.telegram.messenger.r2.a) {
                }
                sharedPreferences2.edit().putBoolean("isPreviousOk", true).apply();
                long lastFrameTimestamp2 = mediaCodecVideoConvertor2.getLastFrameTimestamp();
                long length42 = file32.length();
                if (convertVideo2) {
                }
                j20 j20Var22 = lfVar.b;
                z11 = j20Var22.X;
                if (z11) {
                }
                org.telegram.messenger.g0.h3(new ae(B, z14, true, lfVar, file32, 1.0f, lastFrameTimestamp2, z11, length42));
                return;
            case 8:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a == null || MediaController.B().u0 == null) {
                    return;
                }
                if (MediaController.B().u0.h0 == -9223372036854775807L) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                RemoteControlClient.MetadataEditor editMetadata = musicPlayerService.a.editMetadata(false);
                editMetadata.putLong(9, MediaController.B().u0.h0 * 1000);
                editMetadata.apply();
                musicPlayerService.a.setPlaybackState(MediaController.B().H() ? 2 : 3, Math.max(MediaController.B().u0.g0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                return;
            case 9:
                org.telegram.messenger.t0.b.sendBroadcast((Intent) this.b);
                return;
            case 10:
                qu quVar = (qu) this.b;
                OverScroller overScroller = quVar.m0;
                if (overScroller == null || quVar.V == null || !overScroller.computeScrollOffset()) {
                    return;
                }
                int currX = quVar.m0.getCurrX();
                r3 = currX >= 0 ? currX : 0;
                int i30 = quVar.c0;
                if (r3 > i30) {
                    r3 = i30;
                }
                if (r3 != quVar.d0) {
                    quVar.d0 = r3;
                    quVar.V.invalidate();
                }
                if (quVar.m0.isFinished()) {
                    return;
                }
                quVar.V.postOnAnimation(this);
                return;
            case 11:
                tu tuVar = (tu) this.b;
                OverScroller overScroller2 = tuVar.u0;
                if (overScroller2 == null || tuVar.V == null || !overScroller2.computeScrollOffset()) {
                    return;
                }
                int currX2 = tuVar.u0.getCurrX();
                r3 = currX2 >= 0 ? currX2 : 0;
                int i31 = tuVar.a0;
                if (r3 > i31) {
                    r3 = i31;
                }
                if (r3 != tuVar.b0) {
                    tuVar.b0 = r3;
                    tuVar.Z(tuVar.S, tuVar.T, tuVar.U);
                    tuVar.V.invalidate();
                }
                if (tuVar.u0.isFinished()) {
                    return;
                }
                tuVar.V.postOnAnimation(this);
                return;
            case 12:
                yu yuVar = (yu) this.b;
                OverScroller overScroller3 = yuVar.y0;
                if (overScroller3 == null || yuVar.V == null || !overScroller3.computeScrollOffset()) {
                    return;
                }
                int currX3 = yuVar.y0.getCurrX();
                r3 = currX3 >= 0 ? currX3 : 0;
                int i32 = yuVar.h0;
                if (r3 > i32) {
                    r3 = i32;
                }
                if (r3 != yuVar.i0) {
                    yuVar.i0 = r3;
                    yuVar.Z(yuVar.S, yuVar.T, yuVar.U);
                    yuVar.V.invalidate();
                }
                if (yuVar.y0.isFinished()) {
                    return;
                }
                yuVar.V.postOnAnimation(this);
                return;
            case 13:
                long currentTimeMillis3 = System.currentTimeMillis();
                jz jzVar = (jz) this.b;
                if (Math.abs(currentTimeMillis3 - jzVar.b) < 2000) {
                    return;
                }
                jzVar.b = currentTimeMillis3;
                try {
                    jzVar.s.b();
                    int i33 = 0;
                    while (true) {
                        if (i33 >= 3) {
                            int i34 = 0;
                            for (int i35 = 3; i34 < i35; i35 = 3) {
                                jzVar.s.write(jz.a(jzVar, jzVar.c[i34][7]), 0, 8);
                                jzVar.s.write(jz.a(jzVar, jzVar.d[i34][7]), 0, 8);
                                jzVar.s.write(jz.b(jzVar, jzVar.e[i34][7]), 0, 4);
                                jzVar.s.write(jz.b(jzVar, jzVar.f[i34][7]), 0, 4);
                                i34++;
                            }
                            jzVar.r.seek(0L);
                            RandomAccessFile randomAccessFile = jzVar.r;
                            bg.d0 d0Var = jzVar.s;
                            randomAccessFile.write(d0Var.a, 0, d0Var.b);
                            jzVar.r.getFD().sync();
                            return;
                        }
                        for (int i36 = 0; i36 < 7; i36++) {
                            jzVar.s.write(jz.a(jzVar, jzVar.c[i33][i36]), 0, 8);
                            jzVar.s.write(jz.a(jzVar, jzVar.d[i33][i36]), 0, 8);
                            jzVar.s.write(jz.b(jzVar, jzVar.e[i33][i36]), 0, 4);
                            jzVar.s.write(jz.b(jzVar, jzVar.f[i33][i36]), 0, 4);
                        }
                        jzVar.s.write(jz.b(jzVar, jzVar.n[i33]), 0, 4);
                        jzVar.s.write(jz.a(jzVar, jzVar.h[i33]), 0, 8);
                        i33++;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d != this) {
                    return;
                }
                actionBarLayout.d = null;
                actionBarLayout.h0(false, true, false);
                return;
            case 15:
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.b;
                ValueAnimator valueAnimator = i1Var.m;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                i1Var.m.start();
                return;
            case 16:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.b;
                if (v2Var.G != this || (z12 = v2Var.I)) {
                    return;
                }
                v2Var.G = null;
                if (z12) {
                    return;
                }
                v2Var.b.setVisibility(0);
                if (v2Var.m0()) {
                    return;
                }
                if (v2Var.J) {
                    v2Var.c.setLayerType(2, null);
                }
                if (v2Var.V0) {
                    v2Var.b.setTranslationX(org.telegram.messenger.g0.L(48.0f));
                    v2Var.b.setAlpha(0.0f);
                    v2Var.b.setTranslationY(0.0f);
                } else {
                    v2Var.b.setTranslationY(Math.max(0, Math.min(org.telegram.messenger.g0.n, v2Var.Q())) + org.telegram.messenger.g0.L(10.0f) + v2Var.R() + v2Var.f);
                }
                v2Var.h0();
                v2Var.A0 = 1;
                ValueAnimator valueAnimator2 = v2Var.B0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(v2Var.C0, 1.0f);
                v2Var.B0 = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.h2(v2Var, 0));
                v2Var.z0 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ObjectAnimator.ofFloat(v2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(v2Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(v2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.h2(v2Var, 1));
                arrayList2.add(ofFloat2);
                arrayList2.add(ObjectAnimator.ofInt(v2Var.Y, m6.d, v2Var.o0 ? v2Var.p0 : 0));
                arrayList2.add(v2Var.B0);
                v2Var.E(arrayList2, true);
                v2Var.z0.playTogether(arrayList2);
                if (v2Var.V0) {
                    v2Var.z0.setDuration(250L);
                    v2Var.z0.setInterpolator(xq.f);
                } else {
                    v2Var.z0.setDuration(v2Var.j0);
                    v2Var.z0.setInterpolator(v2Var.k0);
                }
                v2Var.z0.setStartDelay(v2Var.D ? 0L : 20L);
                v2Var.z0.setInterpolator(v2Var.k0);
                v2Var.L0.d();
                v2Var.z0.addListener(new org.telegram.ui.ActionBar.n2(v2Var, r3));
                if (v2Var.K0) {
                    qs.e().k(98, 512);
                }
                v2Var.z0.start();
                return;
            case 17:
                i4 i4Var = (i4) this.b;
                i4Var.k();
                i4Var.j();
                i4Var.f.setAlpha(1.0f);
                return;
            case 18:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                x70 x70Var = jVar.x;
                if (x70Var != null) {
                    CharacterStyle characterStyle = x70Var.i;
                    final String url = characterStyle instanceof b41 ? ((b41) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        jVar.performHapticFeedback(0, 2);
                    } catch (Exception unused2) {
                    }
                    final StaticLayout staticLayout = jVar.D;
                    final float f13 = jVar.y;
                    if (jVar.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) jVar.x.i;
                        org.telegram.ui.ActionBar.v2 l10 = k5.l(1, jVar.getContext(), null, false);
                        l10.O = url;
                        l10.P = false;
                        CharSequence[] charSequenceArr = {hd.M0(2131747816, null), hd.M0(2131751767, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i37) {
                                j jVar2 = (j) m.f3.this.b;
                                org.telegram.ui.ActionBar.f2 f2Var = jVar2.H;
                                if (i37 == 0) {
                                    jVar2.d(clickableSpan, staticLayout, f13);
                                    return;
                                }
                                if (i37 == 1) {
                                    String str2 = url;
                                    org.telegram.messenger.g0.g(str2);
                                    if (org.telegram.messenger.g0.I3()) {
                                        if (str2.startsWith("@")) {
                                            org.telegram.messenger.k5.o(null, 2131743666, hc.a0(f2Var), R.raw.copy, 36);
                                        } else if (str2.startsWith("#") || str2.startsWith("$")) {
                                            org.telegram.messenger.k5.o(null, 2131749361, hc.a0(f2Var), R.raw.copy, 36);
                                        } else {
                                            org.telegram.messenger.k5.o(null, 2131748920, hc.a0(f2Var), R.raw.copy, 36);
                                        }
                                    }
                                }
                            }
                        };
                        l10.L = charSequenceArr;
                        l10.K = onClickListener;
                        l10.H0 = new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ((j) m.f3.this.b).e();
                            }
                        };
                        l10.show();
                    }
                    jVar.x = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.b;
                if (zVar.b == null) {
                    zVar.b = new androidx.emoji2.text.j(zVar, 4);
                }
                androidx.emoji2.text.j jVar2 = zVar.b;
                int i37 = zVar.c + 1;
                zVar.c = i37;
                jVar2.b = i37;
                zVar.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 20:
                s5 s5Var = (s5) this.b;
                TextView textView = s5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                s5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(s5Var.a, (Property<TextView, Float>) property, 1.0f));
                s5Var.d.setDuration(250L);
                s5Var.d.setInterpolator(new DecelerateInterpolator());
                s5Var.d.addListener(new a(this, 25));
                s5Var.d.start();
                return;
            case 21:
                q6 q6Var = (q6) this.b;
                q6Var.a();
                RectF rectF = q6Var.r;
                q6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                org.telegram.messenger.g0.i3(q6Var.D, 1000L);
                return;
            case 22:
                k7 k7Var = (k7) this.b;
                if (k7Var.b == null) {
                    k7Var.b = new androidx.emoji2.text.j(k7Var, i15);
                }
                androidx.emoji2.text.j jVar3 = k7Var.b;
                int i38 = k7Var.c + 1;
                k7Var.c = i38;
                jVar3.b = i38;
                k7Var.postDelayed(jVar3, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 23:
                r7 r7Var = (r7) this.b;
                RectF rectF2 = r7Var.s;
                r7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                org.telegram.messenger.g0.i3(r7Var.F, 1000L);
                return;
            case 24:
                l7 l7Var = (l7) this.b;
                b8 b8Var = l7Var.D;
                if (MediaController.B().u0 == null) {
                    return;
                }
                int i39 = b8Var.z2 + 1;
                b8Var.z2 = i39;
                if (i39 != 1) {
                    if (i39 != 2) {
                        MediaController.B().m0(true, 13.0f);
                        return;
                    } else {
                        MediaController.B().m0(true, 7.0f);
                        org.telegram.messenger.g0.i3(this, 2000L);
                        return;
                    }
                }
                l7Var.w = true;
                b8Var.x2 = 1;
                if (MediaController.B().H()) {
                    b8Var.Y0();
                } else if (b8Var.x2 == 1) {
                    org.telegram.messenger.g0.r(b8Var.E2);
                    b8Var.B2 = 0L;
                }
                MediaController.B().m0(true, 4.0f);
                org.telegram.messenger.g0.i3(this, 2000L);
                return;
            case 25:
                b8 b8Var2 = (b8) this.b;
                t51 t51Var = MediaController.B().i0;
                long U = t51Var == null ? 0L : t51Var.U();
                if (U == 0 || U == -9223372036854775807L) {
                    b8Var2.A2 = System.currentTimeMillis();
                    return;
                }
                float f14 = b8Var2.y2;
                long currentTimeMillis4 = System.currentTimeMillis();
                long j20 = currentTimeMillis4 - b8Var2.A2;
                b8Var2.A2 = currentTimeMillis4;
                long j21 = currentTimeMillis4 - b8Var2.B2;
                int i40 = b8Var2.z2;
                float f15 = ((long) ((f14 * r4) + (((i40 == 1 ? 3L : i40 == 2 ? 6L : 12L) * j20) - j20))) / U;
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                b8Var2.y2 = f15;
                ij ijVar2 = MediaController.B().u0;
                if (ijVar2 != null && ijVar2.J3()) {
                    if (!MediaController.B().H()) {
                        MediaController.B().u0.b0 = b8Var2.y2;
                    }
                    b8Var2.b1(ijVar2, false);
                }
                if (b8Var2.x2 == 1 && b8Var2.z2 > 0 && MediaController.B().H()) {
                    if (j21 > 200 || b8Var2.y2 == 0.0f) {
                        b8Var2.B2 = currentTimeMillis4;
                        MediaController.B().i0(MediaController.B().u0, f15);
                    }
                    if (b8Var2.z2 <= 0 || b8Var2.y2 <= 0.0f) {
                        return;
                    }
                    org.telegram.messenger.g0.i3(b8Var2.E2, 16L);
                    return;
                }
                return;
            case 26:
                pc pcVar = (pc) this.b;
                pcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                pcVar.f.performHapticFeedback(0);
                Runnable runnable = pcVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                uj ujVar = (uj) this.b;
                if (ujVar.S) {
                    ujVar.N.clear();
                    ujVar.P.clear();
                    ujVar.Q.clear();
                    ujVar.f();
                    return;
                }
                return;
            case 28:
                a();
                return;
            default:
                bn bnVar = (bn) this.b;
                f3 f3Var = bnVar.U0;
                a6 a6Var = bnVar.g1;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (bnVar.H || editField == null || !bnVar.G || bnVar.e1 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || !org.telegram.messenger.g0.Q1()) {
                        return;
                    }
                    editField.requestFocus();
                    org.telegram.messenger.g0.K3(editField);
                    org.telegram.messenger.g0.r(f3Var);
                    org.telegram.messenger.g0.i3(f3Var, 100L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public f3(gf.g gVar, int i7) {
        this.a = 3;
        this.b = gVar;
    }
}
