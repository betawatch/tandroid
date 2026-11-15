package j6;

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
import ki.s3;
import m.r1;
import oi.d0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.hz;
import org.telegram.messenger.k5;
import org.telegram.messenger.kf;
import org.telegram.messenger.m5;
import org.telegram.messenger.ns;
import org.telegram.messenger.nu;
import org.telegram.messenger.q5;
import org.telegram.messenger.qe;
import org.telegram.messenger.r2;
import org.telegram.messenger.r5;
import org.telegram.messenger.ru;
import org.telegram.messenger.se;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.wu;
import org.telegram.messenger.xf;
import org.telegram.messenger.xr;
import org.telegram.messenger.z5;
import org.telegram.messenger.zd;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g4;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.j7;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i7;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.y7;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ o() {
        this.a = 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        File file;
        int i7;
        int i10;
        int i11;
        int i12;
        long j3;
        long j10;
        boolean convertVideo;
        boolean z10;
        boolean z11;
        boolean z12;
        MediaController B = MediaController.B();
        kf kfVar = (kf) this.b;
        gj gjVar = kfVar.a;
        g20 g20Var = kfVar.b;
        if (gjVar == null || g20Var == null) {
            return;
        }
        String str2 = g20Var.o;
        long j11 = g20Var.p;
        long j12 = g20Var.a;
        long j13 = g20Var.c;
        long j14 = g20Var.b;
        int i13 = g20Var.k;
        int i14 = g20Var.l;
        int i15 = g20Var.g;
        int i16 = g20Var.h;
        int i17 = g20Var.i;
        int i18 = g20Var.n;
        int i19 = g20Var.m;
        int i20 = g20Var.j;
        boolean z13 = m5.C(gj.B0(gjVar.k)) || g20Var.V;
        File file2 = new File(gjVar.k.attachPath);
        if (file2.exists()) {
            file2.delete();
        }
        if (r2.a) {
            file = file2;
            StringBuilder sb2 = new StringBuilder("begin convert ");
            sb2.append(str2);
            sb2.append(" startTime = ");
            sb2.append(j12);
            sb2.append(" avatarStartTime = ");
            sb2.append(j13);
            sb2.append(" endTime ");
            sb2.append(j14);
            sb2.append(" rWidth = ");
            sb2.append(i13);
            sb2.append(" rHeight = ");
            sb2.append(i14);
            sb2.append(" rotation = ");
            sb2.append(i15);
            sb2.append(" oWidth = ");
            sb2.append(i16);
            sb2.append(" oHeight = ");
            sb2.append(i17);
            sb2.append(" framerate = ");
            sb2.append(i18);
            sb2.append(" bitrate = ");
            i7 = i19;
            sb2.append(i7);
            str = str2;
            sb2.append(" originalBitrate = ");
            i10 = i20;
            sb2.append(i10);
            a8.b(sb2.toString());
        } else {
            str = str2;
            file = file2;
            i7 = i19;
            i10 = i20;
        }
        String str3 = str == null ? "" : str;
        if (j12 <= 0 || j14 <= 0) {
            if (j14 > 0) {
                i11 = i10;
                i12 = i7;
                j3 = j14;
            } else if (j12 > 0) {
                i11 = i10;
                i12 = i7;
                j10 = g20Var.v - j12;
            } else {
                i11 = i10;
                i12 = i7;
                j3 = g20Var.v;
            }
            if (i18 != 0) {
                i18 = 25;
            } else if (i18 > 59) {
                i18 = 59;
            }
            if (i15 != 90 && i15 != 270) {
                i14 = i13;
                i13 = i14;
            }
            if (!g20Var.Z && i18 > 40 && Math.min(i13, i14) <= 480) {
                i18 = 30;
            }
            int i21 = i18;
            boolean z14 = (j13 != -1 && g20Var.H == null && g20Var.G == null && g20Var.B == null && g20Var.A == null && i14 == i16 && i13 == i17 && i15 == 0 && !g20Var.s && j12 == -1 && g20Var.b0.isEmpty()) ? false : true;
            SharedPreferences sharedPreferences = t0.b.getSharedPreferences("videoconvert", 0);
            long currentTimeMillis = System.currentTimeMillis();
            String str4 = str3;
            File file3 = file;
            qe qeVar = new qe(B, g20Var, file3, kfVar);
            g20Var.X = true;
            MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
            MediaCodecVideoConvertor.ConvertVideoParams of2 = MediaCodecVideoConvertor.ConvertVideoParams.of(str4, file3, j11, i15, z13, i16, i17, i14, i13, i21, i12, i11, j12, j14, j13, z14, j3, qeVar, g20Var);
            of2.soundInfos.addAll(g20Var.b0);
            convertVideo = mediaCodecVideoConvertor.convertVideo(of2);
            z10 = g20Var.W;
            if (!z10) {
                synchronized (B.b) {
                    z10 = g20Var.W;
                }
            }
            if (r2.a) {
                a8.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z10);
            }
            z11 = true;
            sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
            long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
            long length = file3.length();
            if (!convertVideo && !z10) {
                z11 = false;
            }
            g20 g20Var2 = kfVar.b;
            z12 = g20Var2.X;
            if (z12) {
                g20Var2.X = false;
            }
            g0.h3(new zd(B, z11, true, kfVar, file3, 1.0f, lastFrameTimestamp, z12, length));
        }
        j10 = j14 - j12;
        i11 = i10;
        i12 = i7;
        j3 = j10;
        if (i18 != 0) {
        }
        if (i15 != 90) {
            i14 = i13;
            i13 = i14;
        }
        if (!g20Var.Z) {
            i18 = 30;
        }
        int i212 = i18;
        if (j13 != -1) {
        }
        SharedPreferences sharedPreferences2 = t0.b.getSharedPreferences("videoconvert", 0);
        long currentTimeMillis2 = System.currentTimeMillis();
        String str42 = str3;
        File file32 = file;
        qe qeVar2 = new qe(B, g20Var, file32, kfVar);
        g20Var.X = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor2 = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of22 = MediaCodecVideoConvertor.ConvertVideoParams.of(str42, file32, j11, i15, z13, i16, i17, i14, i13, i212, i12, i11, j12, j14, j13, z14, j3, qeVar2, g20Var);
        of22.soundInfos.addAll(g20Var.b0);
        convertVideo = mediaCodecVideoConvertor2.convertVideo(of22);
        z10 = g20Var.W;
        if (!z10) {
        }
        if (r2.a) {
        }
        z11 = true;
        sharedPreferences2.edit().putBoolean("isPreviousOk", true).apply();
        long lastFrameTimestamp2 = mediaCodecVideoConvertor2.getLastFrameTimestamp();
        long length2 = file32.length();
        if (!convertVideo) {
            z11 = false;
        }
        g20 g20Var22 = kfVar.b;
        z12 = g20Var22.X;
        if (z12) {
        }
        g0.h3(new zd(B, z11, true, kfVar, file32, 1.0f, lastFrameTimestamp2, z12, length2));
    }

    /* JADX WARN: Removed duplicated region for block: B:327:0x0712  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m.h hVar;
        ByteBuffer allocateDirect;
        double d;
        long j3;
        double d2;
        boolean z10;
        int i7 = 4;
        int i10 = 5;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                synchronized (p.i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                r1 r1Var = (r1) this.b;
                r1Var.x = null;
                r1Var.drawableStateChanged();
                return;
            case 2:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (hVar = actionMenuView.K) == null) {
                    return;
                }
                hVar.l();
                return;
            case 3:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 4:
                ng.e eVar = (ng.e) this.b;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 5:
                Object obj = ((d6.i) this.b).b;
                return;
            case 6:
                ((d0) this.b).h();
                return;
            case 7:
                if (!((r5) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i11 = 0;
                    while (i11 < ((r5) this.b).a.size()) {
                        q5 q5Var = (q5) ((r5) this.b).a.get(i11);
                        if (q5Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            q5Var.recycle();
                            ((r5) this.b).a.remove(i11);
                            ((r5) this.b).e--;
                            i11--;
                        }
                        i11++;
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
            case 8:
                z5 z5Var = (z5) this.b;
                z5Var.J.clear();
                z5Var.getNotificationCenter().k(ns.b5, new Object[0]);
                return;
            case 9:
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
                        int i12 = mediaController2.C1;
                        if (i12 == 3 || i12 == 4) {
                            return;
                        }
                        mediaController2.C0(i12, mediaController2.E1, mediaController2.D1, mediaController2.F1);
                        return;
                    }
                    byteBuffer.limit(read);
                    int i13 = mediaController.B1;
                    ji.m mVar = xr.k;
                    if (mVar != null && read > 0) {
                        try {
                            mVar.m(byteBuffer, read, i13, 1);
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    try {
                        long j10 = mediaController.w1;
                        j3 = (read / 2) + j10;
                        int length = (int) ((j10 / j3) * r0.length);
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
                        d = 0.0d;
                        float f12 = 0.0f;
                        for (int i16 = 0; i16 < read / 2; i16++) {
                            try {
                                short s5 = byteBuffer.getShort();
                                d += s5 * s5;
                                if (i16 == ((int) f12)) {
                                    try {
                                        short[] sArr2 = mediaController.v1;
                                        if (i15 < sArr2.length) {
                                            sArr2[i15] = s5;
                                            f12 += f11;
                                            i15++;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        a8.g(e, true);
                                        byteBuffer.position(0);
                                        double sqrt = Math.sqrt((d / read) / 2.0d);
                                        mediaController.O1.c(new xf(this, byteBuffer, read != byteBuffer.capacity(), 6));
                                        mediaController.N1.c(mediaController.P1);
                                        g0.h3(new se(this, sqrt, 0));
                                        return;
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                            }
                        }
                        d2 = d;
                    } catch (Exception e12) {
                        e = e12;
                        d = 0.0d;
                    }
                    try {
                        mediaController.w1 = j3;
                        d = d2;
                    } catch (Exception e13) {
                        e = e13;
                        d = d2;
                        a8.g(e, true);
                        byteBuffer.position(0);
                        double sqrt2 = Math.sqrt((d / read) / 2.0d);
                        mediaController.O1.c(new xf(this, byteBuffer, read != byteBuffer.capacity(), 6));
                        mediaController.N1.c(mediaController.P1);
                        g0.h3(new se(this, sqrt2, 0));
                        return;
                    }
                    byteBuffer.position(0);
                    double sqrt22 = Math.sqrt((d / read) / 2.0d);
                    mediaController.O1.c(new xf(this, byteBuffer, read != byteBuffer.capacity(), 6));
                    mediaController.N1.c(mediaController.P1);
                    g0.h3(new se(this, sqrt22, 0));
                    return;
                }
                return;
            case 10:
                a();
                return;
            case 11:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a == null || MediaController.B().v0 == null) {
                    return;
                }
                if (MediaController.B().v0.j0 == -9223372036854775807L) {
                    g0.i3(this, 500L);
                    return;
                }
                RemoteControlClient.MetadataEditor editMetadata = musicPlayerService.a.editMetadata(false);
                editMetadata.putLong(9, MediaController.B().v0.j0 * 1000);
                editMetadata.apply();
                musicPlayerService.a.setPlaybackState(MediaController.B().H() ? 2 : 3, Math.max(MediaController.B().v0.i0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                return;
            case 12:
                t0.b.sendBroadcast((Intent) this.b);
                return;
            case 13:
                nu nuVar = (nu) this.b;
                OverScroller overScroller = nuVar.n0;
                if (overScroller == null || nuVar.W == null || !overScroller.computeScrollOffset()) {
                    return;
                }
                int currX = nuVar.n0.getCurrX();
                r15 = currX >= 0 ? currX : 0;
                int i17 = nuVar.d0;
                if (r15 > i17) {
                    r15 = i17;
                }
                if (r15 != nuVar.e0) {
                    nuVar.e0 = r15;
                    nuVar.W.invalidate();
                }
                if (nuVar.n0.isFinished()) {
                    return;
                }
                nuVar.W.postOnAnimation(this);
                return;
            case 14:
                ru ruVar = (ru) this.b;
                OverScroller overScroller2 = ruVar.v0;
                if (overScroller2 == null || ruVar.W == null || !overScroller2.computeScrollOffset()) {
                    return;
                }
                int currX2 = ruVar.v0.getCurrX();
                r15 = currX2 >= 0 ? currX2 : 0;
                int i18 = ruVar.b0;
                if (r15 > i18) {
                    r15 = i18;
                }
                if (r15 != ruVar.c0) {
                    ruVar.c0 = r15;
                    ruVar.Z(ruVar.T, ruVar.U, ruVar.V);
                    ruVar.W.invalidate();
                }
                if (ruVar.v0.isFinished()) {
                    return;
                }
                ruVar.W.postOnAnimation(this);
                return;
            case 15:
                wu wuVar = (wu) this.b;
                OverScroller overScroller3 = wuVar.z0;
                if (overScroller3 == null || wuVar.W == null || !overScroller3.computeScrollOffset()) {
                    return;
                }
                int currX3 = wuVar.z0.getCurrX();
                r15 = currX3 >= 0 ? currX3 : 0;
                int i19 = wuVar.i0;
                if (r15 > i19) {
                    r15 = i19;
                }
                if (r15 != wuVar.j0) {
                    wuVar.j0 = r15;
                    wuVar.Z(wuVar.T, wuVar.U, wuVar.V);
                    wuVar.W.invalidate();
                }
                if (wuVar.z0.isFinished()) {
                    return;
                }
                wuVar.W.postOnAnimation(this);
                return;
            case 16:
                long currentTimeMillis = System.currentTimeMillis();
                hz hzVar = (hz) this.b;
                if (Math.abs(currentTimeMillis - hzVar.b) < 2000) {
                    return;
                }
                hzVar.b = currentTimeMillis;
                try {
                    hzVar.s.b();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= 3) {
                            int i21 = 0;
                            for (int i22 = 3; i21 < i22; i22 = 3) {
                                hzVar.s.write(hz.a(hzVar, hzVar.c[i21][7]), 0, 8);
                                hzVar.s.write(hz.a(hzVar, hzVar.d[i21][7]), 0, 8);
                                hzVar.s.write(hz.b(hzVar, hzVar.e[i21][7]), 0, 4);
                                hzVar.s.write(hz.b(hzVar, hzVar.f[i21][7]), 0, 4);
                                i21++;
                            }
                            hzVar.r.seek(0L);
                            RandomAccessFile randomAccessFile = hzVar.r;
                            bg.d0 d0Var = hzVar.s;
                            randomAccessFile.write(d0Var.a, 0, d0Var.b);
                            hzVar.r.getFD().sync();
                            return;
                        }
                        for (int i23 = 0; i23 < 7; i23++) {
                            hzVar.s.write(hz.a(hzVar, hzVar.c[i20][i23]), 0, 8);
                            hzVar.s.write(hz.a(hzVar, hzVar.d[i20][i23]), 0, 8);
                            hzVar.s.write(hz.b(hzVar, hzVar.e[i20][i23]), 0, 4);
                            hzVar.s.write(hz.b(hzVar, hzVar.f[i20][i23]), 0, 4);
                        }
                        hzVar.s.write(hz.b(hzVar, hzVar.n[i20]), 0, 4);
                        hzVar.s.write(hz.a(hzVar, hzVar.h[i20]), 0, 8);
                        i20++;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 17:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d != this) {
                    return;
                }
                actionBarLayout.d = null;
                actionBarLayout.h0(false, true, false);
                return;
            case 18:
                i1 i1Var = (i1) this.b;
                ValueAnimator valueAnimator = i1Var.m;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                i1Var.m.start();
                return;
            case 19:
                u2 u2Var = (u2) this.b;
                if (u2Var.H != this || (z10 = u2Var.J)) {
                    return;
                }
                u2Var.H = null;
                if (z10) {
                    return;
                }
                u2Var.b.setVisibility(0);
                if (u2Var.m0()) {
                    return;
                }
                if (u2Var.K) {
                    u2Var.c.setLayerType(2, null);
                }
                if (u2Var.W0) {
                    u2Var.b.setTranslationX(g0.L(48.0f));
                    u2Var.b.setAlpha(0.0f);
                    u2Var.b.setTranslationY(0.0f);
                } else {
                    u2Var.b.setTranslationY(Math.max(0, Math.min(g0.n, u2Var.R())) + g0.L(10.0f) + u2Var.S() + u2Var.f);
                }
                u2Var.h0();
                u2Var.B0 = 1;
                ValueAnimator valueAnimator2 = u2Var.C0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(u2Var.D0, 1.0f);
                u2Var.C0 = ofFloat;
                ofFloat.addUpdateListener(new g2(u2Var, 0));
                u2Var.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(u2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u2Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new g2(u2Var, 1));
                arrayList.add(ofFloat2);
                arrayList.add(ObjectAnimator.ofInt(u2Var.Z, k6.d, u2Var.p0 ? u2Var.q0 : 0));
                arrayList.add(u2Var.C0);
                u2Var.F(arrayList, true);
                u2Var.A0.playTogether(arrayList);
                if (u2Var.W0) {
                    u2Var.A0.setDuration(250L);
                    u2Var.A0.setInterpolator(er.f);
                } else {
                    u2Var.A0.setDuration(u2Var.k0);
                    u2Var.A0.setInterpolator(u2Var.l0);
                }
                u2Var.A0.setStartDelay(u2Var.E ? 0L : 20L);
                u2Var.A0.setInterpolator(u2Var.l0);
                u2Var.M0.d();
                u2Var.A0.addListener(new m2(u2Var, r15));
                if (u2Var.L0) {
                    ns.e().k(98, 512);
                }
                u2Var.A0.start();
                return;
            case 20:
                g4 g4Var = (g4) this.b;
                g4Var.k();
                g4Var.j();
                g4Var.f.setAlpha(1.0f);
                return;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                a80 a80Var = jVar.x;
                if (a80Var != null) {
                    CharacterStyle characterStyle = a80Var.i;
                    final String url = characterStyle instanceof f41 ? ((f41) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        jVar.performHapticFeedback(0, 2);
                    } catch (Exception unused2) {
                    }
                    final StaticLayout staticLayout = jVar.E;
                    final float f13 = jVar.y;
                    if (jVar.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) jVar.x.i;
                        u2 k10 = k5.k(1, jVar.getContext(), null, false);
                        k10.P = url;
                        k10.Q = false;
                        CharSequence[] charSequenceArr = {hd.M0(2131747817, null), hd.M0(2131751767, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i24) {
                                j jVar2 = (j) j6.o.this.b;
                                org.telegram.ui.ActionBar.e2 e2Var = jVar2.I;
                                if (i24 == 0) {
                                    jVar2.d(clickableSpan, staticLayout, f13);
                                    return;
                                }
                                if (i24 == 1) {
                                    String str = url;
                                    org.telegram.messenger.g0.g(str);
                                    if (org.telegram.messenger.g0.H3()) {
                                        if (str.startsWith("@")) {
                                            org.telegram.messenger.k5.n(null, 2131743665, cc.a0(e2Var), R.raw.copy, 36);
                                        } else if (str.startsWith("#") || str.startsWith("$")) {
                                            org.telegram.messenger.k5.n(null, 2131749362, cc.a0(e2Var), R.raw.copy, 36);
                                        } else {
                                            org.telegram.messenger.k5.n(null, 2131748921, cc.a0(e2Var), R.raw.copy, 36);
                                        }
                                    }
                                }
                            }
                        };
                        k10.M = charSequenceArr;
                        k10.L = onClickListener;
                        k10.I0 = new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ((j) j6.o.this.b).e();
                            }
                        };
                        k10.show();
                    }
                    jVar.x = null;
                    return;
                }
                return;
            case 22:
                z zVar = (z) this.b;
                if (zVar.b == null) {
                    zVar.b = new androidx.emoji2.text.j(zVar, i7);
                }
                androidx.emoji2.text.j jVar2 = zVar.b;
                int i24 = zVar.c + 1;
                zVar.c = i24;
                jVar2.b = i24;
                zVar.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 23:
                s5 s5Var = (s5) this.b;
                TextView textView = s5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                s5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(s5Var.a, (Property<TextView, Float>) property, 1.0f));
                s5Var.d.setDuration(250L);
                s5Var.d.setInterpolator(new DecelerateInterpolator());
                s5Var.d.addListener(new s3(this, 26));
                s5Var.d.start();
                return;
            case 24:
                p6 p6Var = (p6) this.b;
                p6Var.a();
                RectF rectF = p6Var.r;
                p6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                g0.i3(p6Var.E, 1000L);
                return;
            case 25:
                j7 j7Var = (j7) this.b;
                if (j7Var.b == null) {
                    j7Var.b = new androidx.emoji2.text.j(j7Var, i10);
                }
                androidx.emoji2.text.j jVar3 = j7Var.b;
                int i25 = j7Var.c + 1;
                j7Var.c = i25;
                jVar3.b = i25;
                j7Var.postDelayed(jVar3, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 26:
                q7 q7Var = (q7) this.b;
                RectF rectF2 = q7Var.s;
                q7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                g0.i3(q7Var.G, 1000L);
                return;
            case 27:
                i7 i7Var = (i7) this.b;
                y7 y7Var = i7Var.E;
                if (MediaController.B().v0 == null) {
                    return;
                }
                int i26 = y7Var.D2 + 1;
                y7Var.D2 = i26;
                if (i26 != 1) {
                    if (i26 != 2) {
                        MediaController.B().m0(true, 13.0f);
                        return;
                    } else {
                        MediaController.B().m0(true, 7.0f);
                        g0.i3(this, 2000L);
                        return;
                    }
                }
                i7Var.w = true;
                y7Var.B2 = 1;
                if (MediaController.B().H()) {
                    y7Var.Y0();
                } else if (y7Var.B2 == 1) {
                    g0.r(y7Var.I2);
                    y7Var.F2 = 0L;
                }
                MediaController.B().m0(true, 4.0f);
                g0.i3(this, 2000L);
                return;
            case 28:
                y7 y7Var2 = (y7) this.b;
                u51 u51Var = MediaController.B().j0;
                long U = u51Var == null ? 0L : u51Var.U();
                if (U == 0 || U == -9223372036854775807L) {
                    y7Var2.E2 = System.currentTimeMillis();
                    return;
                }
                float f14 = y7Var2.C2;
                long currentTimeMillis2 = System.currentTimeMillis();
                long j11 = currentTimeMillis2 - y7Var2.E2;
                y7Var2.E2 = currentTimeMillis2;
                long j12 = currentTimeMillis2 - y7Var2.F2;
                int i27 = y7Var2.D2;
                float f15 = ((long) ((f14 * r2) + (((i27 == 1 ? 3L : i27 == 2 ? 6L : 12L) * j11) - j11))) / U;
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                y7Var2.C2 = f15;
                gj gjVar = MediaController.B().v0;
                if (gjVar != null && gjVar.I3()) {
                    if (!MediaController.B().H()) {
                        MediaController.B().v0.b0 = y7Var2.C2;
                    }
                    y7Var2.b1(gjVar, false);
                }
                if (y7Var2.B2 == 1 && y7Var2.D2 > 0 && MediaController.B().H()) {
                    if (j12 > 200 || y7Var2.C2 == 0.0f) {
                        y7Var2.F2 = currentTimeMillis2;
                        MediaController.B().i0(MediaController.B().v0, f15);
                    }
                    if (y7Var2.D2 <= 0 || y7Var2.C2 <= 0.0f) {
                        return;
                    }
                    g0.i3(y7Var2.I2, 16L);
                    return;
                }
                return;
            default:
                kc kcVar = (kc) this.b;
                kcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                kcVar.f.performHapticFeedback(0);
                Runnable runnable = kcVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public o(d6.i iVar, int i7) {
        this.a = 5;
        this.b = iVar;
    }
}
