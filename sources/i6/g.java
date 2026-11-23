package i6;

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
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.TaskCompletionSource;
import hi.u0;
import j6.p;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import ji.n;
import ki.n3;
import m.r1;
import oi.e0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.d20;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.jf;
import org.telegram.messenger.ks;
import org.telegram.messenger.ku;
import org.telegram.messenger.n5;
import org.telegram.messenger.nu;
import org.telegram.messenger.pe;
import org.telegram.messenger.r5;
import org.telegram.messenger.re;
import org.telegram.messenger.s2;
import org.telegram.messenger.s5;
import org.telegram.messenger.su;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.vr;
import org.telegram.messenger.xf;
import org.telegram.messenger.yd;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.k7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g() {
        this.a = 11;
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
        jf jfVar = (jf) this.b;
        fj fjVar = jfVar.a;
        d20 d20Var = jfVar.b;
        if (fjVar == null || d20Var == null) {
            return;
        }
        String str2 = d20Var.o;
        long j11 = d20Var.p;
        long j12 = d20Var.a;
        long j13 = d20Var.c;
        long j14 = d20Var.b;
        int i13 = d20Var.k;
        int i14 = d20Var.l;
        int i15 = d20Var.g;
        int i16 = d20Var.h;
        int i17 = d20Var.i;
        int i18 = d20Var.n;
        int i19 = d20Var.m;
        int i20 = d20Var.j;
        boolean z13 = n5.C(fj.B0(fjVar.k)) || d20Var.V;
        File file2 = new File(fjVar.k.attachPath);
        if (file2.exists()) {
            file2.delete();
        }
        if (s2.a) {
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
                j10 = d20Var.v - j12;
            } else {
                i11 = i10;
                i12 = i7;
                j3 = d20Var.v;
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
            if (!d20Var.Z && i18 > 40 && Math.min(i13, i14) <= 480) {
                i18 = 30;
            }
            int i21 = i18;
            boolean z14 = (j13 != -1 && d20Var.H == null && d20Var.G == null && d20Var.B == null && d20Var.A == null && i14 == i16 && i13 == i17 && i15 == 0 && !d20Var.s && j12 == -1 && d20Var.b0.isEmpty()) ? false : true;
            SharedPreferences sharedPreferences = t0.b.getSharedPreferences("videoconvert", 0);
            long currentTimeMillis = System.currentTimeMillis();
            String str4 = str3;
            File file3 = file;
            pe peVar = new pe(B, d20Var, file3, jfVar);
            d20Var.X = true;
            MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
            MediaCodecVideoConvertor.ConvertVideoParams of2 = MediaCodecVideoConvertor.ConvertVideoParams.of(str4, file3, j11, i15, z13, i16, i17, i14, i13, i21, i12, i11, j12, j14, j13, z14, j3, peVar, d20Var);
            of2.soundInfos.addAll(d20Var.b0);
            convertVideo = mediaCodecVideoConvertor.convertVideo(of2);
            z10 = d20Var.W;
            if (!z10) {
                synchronized (B.b) {
                    z10 = d20Var.W;
                }
            }
            if (s2.a) {
                a8.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z10);
            }
            z11 = true;
            sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
            long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
            long length = file3.length();
            if (!convertVideo && !z10) {
                z11 = false;
            }
            d20 d20Var2 = jfVar.b;
            z12 = d20Var2.X;
            if (z12) {
                d20Var2.X = false;
            }
            g0.g3(new yd(B, z11, true, jfVar, file3, 1.0f, lastFrameTimestamp, z12, length));
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
        if (!d20Var.Z) {
            i18 = 30;
        }
        int i212 = i18;
        if (j13 != -1) {
        }
        SharedPreferences sharedPreferences2 = t0.b.getSharedPreferences("videoconvert", 0);
        long currentTimeMillis2 = System.currentTimeMillis();
        String str42 = str3;
        File file32 = file;
        pe peVar2 = new pe(B, d20Var, file32, jfVar);
        d20Var.X = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor2 = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of22 = MediaCodecVideoConvertor.ConvertVideoParams.of(str42, file32, j11, i15, z13, i16, i17, i14, i13, i212, i12, i11, j12, j14, j13, z14, j3, peVar2, d20Var);
        of22.soundInfos.addAll(d20Var.b0);
        convertVideo = mediaCodecVideoConvertor2.convertVideo(of22);
        z10 = d20Var.W;
        if (!z10) {
        }
        if (s2.a) {
        }
        z11 = true;
        sharedPreferences2.edit().putBoolean("isPreviousOk", true).apply();
        long lastFrameTimestamp2 = mediaCodecVideoConvertor2.getLastFrameTimestamp();
        long length2 = file32.length();
        if (!convertVideo) {
            z11 = false;
        }
        d20 d20Var22 = jfVar.b;
        z12 = d20Var22.X;
        if (z12) {
        }
        g0.g3(new yd(B, z11, true, jfVar, file32, 1.0f, lastFrameTimestamp2, z12, length2));
    }

    /* JADX WARN: Removed duplicated region for block: B:322:0x06f2  */
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
                ((i) this.b).g(false);
                return;
            case 1:
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
            case 2:
                r1 r1Var = (r1) this.b;
                r1Var.x = null;
                r1Var.drawableStateChanged();
                return;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (hVar = actionMenuView.K) == null) {
                    return;
                }
                hVar.l();
                return;
            case 4:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 5:
                ng.e eVar = (ng.e) this.b;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 6:
                Object obj = ((u0) this.b).b;
                return;
            case 7:
                ((e0) this.b).h();
                return;
            case 8:
                if (!((s5) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i11 = 0;
                    while (i11 < ((s5) this.b).a.size()) {
                        r5 r5Var = (r5) ((s5) this.b).a.get(i11);
                        if (r5Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            r5Var.recycle();
                            ((s5) this.b).a.remove(i11);
                            ((s5) this.b).e--;
                            i11--;
                        }
                        i11++;
                    }
                }
                if (((s5) this.b).a.isEmpty() && ((s5) this.b).c.isEmpty()) {
                    ((s5) this.b).h = false;
                    return;
                } else {
                    Utilities.e.d(this, 30000L);
                    ((s5) this.b).h = true;
                    return;
                }
            case 9:
                a6 a6Var = (a6) this.b;
                a6Var.J.clear();
                a6Var.getNotificationCenter().k(ks.e5, new Object[0]);
                return;
            case 10:
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
                    n nVar = vr.k;
                    if (nVar != null && read > 0) {
                        try {
                            nVar.l(byteBuffer, read, i13, 1);
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
                                        g0.g3(new re(this, sqrt, 0));
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
                        g0.g3(new re(this, sqrt2, 0));
                        return;
                    }
                    byteBuffer.position(0);
                    double sqrt22 = Math.sqrt((d / read) / 2.0d);
                    mediaController.O1.c(new xf(this, byteBuffer, read != byteBuffer.capacity(), 6));
                    mediaController.N1.c(mediaController.P1);
                    g0.g3(new re(this, sqrt22, 0));
                    return;
                }
                return;
            case 11:
                a();
                return;
            case 12:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a == null || MediaController.B().v0 == null) {
                    return;
                }
                if (MediaController.B().v0.j0 == -9223372036854775807L) {
                    g0.h3(this, 500L);
                    return;
                }
                RemoteControlClient.MetadataEditor editMetadata = musicPlayerService.a.editMetadata(false);
                editMetadata.putLong(9, MediaController.B().v0.j0 * 1000);
                editMetadata.apply();
                musicPlayerService.a.setPlaybackState(MediaController.B().H() ? 2 : 3, Math.max(MediaController.B().v0.i0 * 1000, 100L), MediaController.B().H() ? 0.0f : 1.0f);
                return;
            case 13:
                t0.b.sendBroadcast((Intent) this.b);
                return;
            case 14:
                ku kuVar = (ku) this.b;
                OverScroller overScroller = kuVar.n0;
                if (overScroller == null || kuVar.W == null || !overScroller.computeScrollOffset()) {
                    return;
                }
                int currX = kuVar.n0.getCurrX();
                r15 = currX >= 0 ? currX : 0;
                int i17 = kuVar.d0;
                if (r15 > i17) {
                    r15 = i17;
                }
                if (r15 != kuVar.e0) {
                    kuVar.e0 = r15;
                    kuVar.W.invalidate();
                }
                if (kuVar.n0.isFinished()) {
                    return;
                }
                kuVar.W.postOnAnimation(this);
                return;
            case 15:
                nu nuVar = (nu) this.b;
                OverScroller overScroller2 = nuVar.v0;
                if (overScroller2 == null || nuVar.W == null || !overScroller2.computeScrollOffset()) {
                    return;
                }
                int currX2 = nuVar.v0.getCurrX();
                r15 = currX2 >= 0 ? currX2 : 0;
                int i18 = nuVar.b0;
                if (r15 > i18) {
                    r15 = i18;
                }
                if (r15 != nuVar.c0) {
                    nuVar.c0 = r15;
                    nuVar.Z(nuVar.T, nuVar.U, nuVar.V);
                    nuVar.W.invalidate();
                }
                if (nuVar.v0.isFinished()) {
                    return;
                }
                nuVar.W.postOnAnimation(this);
                return;
            case 16:
                su suVar = (su) this.b;
                OverScroller overScroller3 = suVar.z0;
                if (overScroller3 == null || suVar.W == null || !overScroller3.computeScrollOffset()) {
                    return;
                }
                int currX3 = suVar.z0.getCurrX();
                r15 = currX3 >= 0 ? currX3 : 0;
                int i19 = suVar.i0;
                if (r15 > i19) {
                    r15 = i19;
                }
                if (r15 != suVar.j0) {
                    suVar.j0 = r15;
                    suVar.Z(suVar.T, suVar.U, suVar.V);
                    suVar.W.invalidate();
                }
                if (suVar.z0.isFinished()) {
                    return;
                }
                suVar.W.postOnAnimation(this);
                return;
            case 17:
                long currentTimeMillis = System.currentTimeMillis();
                cz czVar = (cz) this.b;
                if (Math.abs(currentTimeMillis - czVar.b) < 2000) {
                    return;
                }
                czVar.b = currentTimeMillis;
                try {
                    czVar.s.b();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= 3) {
                            int i21 = 0;
                            for (int i22 = 3; i21 < i22; i22 = 3) {
                                czVar.s.write(cz.a(czVar, czVar.c[i21][7]), 0, 8);
                                czVar.s.write(cz.a(czVar, czVar.d[i21][7]), 0, 8);
                                czVar.s.write(cz.b(czVar, czVar.e[i21][7]), 0, 4);
                                czVar.s.write(cz.b(czVar, czVar.f[i21][7]), 0, 4);
                                i21++;
                            }
                            czVar.r.seek(0L);
                            RandomAccessFile randomAccessFile = czVar.r;
                            bg.e0 e0Var = czVar.s;
                            randomAccessFile.write(e0Var.a, 0, e0Var.b);
                            czVar.r.getFD().sync();
                            return;
                        }
                        for (int i23 = 0; i23 < 7; i23++) {
                            czVar.s.write(cz.a(czVar, czVar.c[i20][i23]), 0, 8);
                            czVar.s.write(cz.a(czVar, czVar.d[i20][i23]), 0, 8);
                            czVar.s.write(cz.b(czVar, czVar.e[i20][i23]), 0, 4);
                            czVar.s.write(cz.b(czVar, czVar.f[i20][i23]), 0, 4);
                        }
                        czVar.s.write(cz.b(czVar, czVar.n[i20]), 0, 4);
                        czVar.s.write(cz.a(czVar, czVar.h[i20]), 0, 8);
                        i20++;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 18:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d != this) {
                    return;
                }
                actionBarLayout.d = null;
                actionBarLayout.h0(false, true, false);
                return;
            case 19:
                i1 i1Var = (i1) this.b;
                ValueAnimator valueAnimator = i1Var.m;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                i1Var.m.start();
                return;
            case 20:
                w2 w2Var = (w2) this.b;
                if (w2Var.H != this || (z10 = w2Var.J)) {
                    return;
                }
                w2Var.H = null;
                if (z10) {
                    return;
                }
                w2Var.b.setVisibility(0);
                if (w2Var.m0()) {
                    return;
                }
                if (w2Var.K) {
                    w2Var.c.setLayerType(2, null);
                }
                if (w2Var.W0) {
                    w2Var.b.setTranslationX(g0.L(48.0f));
                    w2Var.b.setAlpha(0.0f);
                    w2Var.b.setTranslationY(0.0f);
                } else {
                    w2Var.b.setTranslationY(Math.max(0, Math.min(g0.n, w2Var.R())) + g0.L(10.0f) + w2Var.S() + w2Var.f);
                }
                w2Var.h0();
                w2Var.B0 = 1;
                ValueAnimator valueAnimator2 = w2Var.C0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(w2Var.D0, 1.0f);
                w2Var.C0 = ofFloat;
                ofFloat.addUpdateListener(new i2(w2Var, 0));
                w2Var.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(w2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(w2Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(w2Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new i2(w2Var, 1));
                arrayList.add(ofFloat2);
                arrayList.add(ObjectAnimator.ofInt(w2Var.Z, q6.d, w2Var.p0 ? w2Var.q0 : 0));
                arrayList.add(w2Var.C0);
                w2Var.E(arrayList, true);
                w2Var.A0.playTogether(arrayList);
                if (w2Var.W0) {
                    w2Var.A0.setDuration(250L);
                    w2Var.A0.setInterpolator(kr.f);
                } else {
                    w2Var.A0.setDuration(w2Var.k0);
                    w2Var.A0.setInterpolator(w2Var.l0);
                }
                w2Var.A0.setStartDelay(w2Var.E ? 0L : 20L);
                w2Var.A0.setInterpolator(w2Var.l0);
                w2Var.M0.d();
                w2Var.A0.addListener(new o2(w2Var, r15));
                if (w2Var.L0) {
                    ks.e().k(98, 512);
                }
                w2Var.A0.start();
                return;
            case 21:
                j4 j4Var = (j4) this.b;
                j4Var.k();
                j4Var.j();
                j4Var.f.setAlpha(1.0f);
                return;
            case 22:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                k80 k80Var = jVar.x;
                if (k80Var != null) {
                    CharacterStyle characterStyle = k80Var.i;
                    final String url = characterStyle instanceof r41 ? ((r41) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        jVar.performHapticFeedback(0, 2);
                    } catch (Exception unused2) {
                    }
                    final StaticLayout staticLayout = jVar.E;
                    final float f13 = jVar.y;
                    if (jVar.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) jVar.x.i;
                        w2 j11 = f3.j(1, jVar.getContext(), null, false);
                        j11.P = url;
                        j11.Q = false;
                        CharSequence[] charSequenceArr = {gd.N0(2131747623, null), gd.N0(2131751755, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i24) {
                                j jVar2 = (j) i6.g.this.b;
                                org.telegram.ui.ActionBar.g2 g2Var = jVar2.I;
                                if (i24 == 0) {
                                    jVar2.d(clickableSpan, staticLayout, f13);
                                    return;
                                }
                                if (i24 == 1) {
                                    String str = url;
                                    org.telegram.messenger.g0.g(str);
                                    if (org.telegram.messenger.g0.G3()) {
                                        if (str.startsWith("@")) {
                                            org.telegram.messenger.f3.n(null, 2131743418, kc.b0(g2Var), R.raw.copy, 36);
                                        } else if (str.startsWith("#") || str.startsWith("$")) {
                                            org.telegram.messenger.f3.n(null, 2131749169, kc.b0(g2Var), R.raw.copy, 36);
                                        } else {
                                            org.telegram.messenger.f3.n(null, 2131748728, kc.b0(g2Var), R.raw.copy, 36);
                                        }
                                    }
                                }
                            }
                        };
                        j11.M = charSequenceArr;
                        j11.L = onClickListener;
                        j11.I0 = new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ((j) i6.g.this.b).e();
                            }
                        };
                        j11.show();
                    }
                    jVar.x = null;
                    return;
                }
                return;
            case 23:
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
            case 24:
                t5 t5Var = (t5) this.b;
                TextView textView = t5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                t5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(t5Var.a, (Property<TextView, Float>) property, 1.0f));
                t5Var.d.setDuration(250L);
                t5Var.d.setInterpolator(new DecelerateInterpolator());
                t5Var.d.addListener(new n3(this, 26));
                t5Var.d.start();
                return;
            case 25:
                org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) this.b;
                q6Var.a();
                RectF rectF = q6Var.r;
                q6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                g0.h3(q6Var.E, 1000L);
                return;
            case 26:
                k7 k7Var = (k7) this.b;
                if (k7Var.b == null) {
                    k7Var.b = new androidx.emoji2.text.j(k7Var, i10);
                }
                androidx.emoji2.text.j jVar3 = k7Var.b;
                int i25 = k7Var.c + 1;
                k7Var.c = i25;
                jVar3.b = i25;
                k7Var.postDelayed(jVar3, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 27:
                r7 r7Var = (r7) this.b;
                RectF rectF2 = r7Var.s;
                r7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                g0.h3(r7Var.G, 1000L);
                return;
            case 28:
                o7 o7Var = (o7) this.b;
                e8 e8Var = o7Var.E;
                if (MediaController.B().v0 == null) {
                    return;
                }
                int i26 = e8Var.D2 + 1;
                e8Var.D2 = i26;
                if (i26 != 1) {
                    if (i26 != 2) {
                        MediaController.B().m0(true, 13.0f);
                        return;
                    } else {
                        MediaController.B().m0(true, 7.0f);
                        g0.h3(this, 2000L);
                        return;
                    }
                }
                o7Var.w = true;
                e8Var.B2 = 1;
                if (MediaController.B().H()) {
                    e8Var.Z0();
                } else if (e8Var.B2 == 1) {
                    g0.r(e8Var.I2);
                    e8Var.F2 = 0L;
                }
                MediaController.B().m0(true, 4.0f);
                g0.h3(this, 2000L);
                return;
            default:
                e8 e8Var2 = (e8) this.b;
                h61 h61Var = MediaController.B().j0;
                long U = h61Var == null ? 0L : h61Var.U();
                if (U == 0 || U == -9223372036854775807L) {
                    e8Var2.E2 = System.currentTimeMillis();
                    return;
                }
                float f14 = e8Var2.C2;
                long currentTimeMillis2 = System.currentTimeMillis();
                long j12 = currentTimeMillis2 - e8Var2.E2;
                e8Var2.E2 = currentTimeMillis2;
                long j13 = currentTimeMillis2 - e8Var2.F2;
                int i27 = e8Var2.D2;
                float f15 = ((long) ((f14 * r2) + (((i27 == 1 ? 3L : i27 == 2 ? 6L : 12L) * j12) - j12))) / U;
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                e8Var2.C2 = f15;
                fj fjVar = MediaController.B().v0;
                if (fjVar != null && fjVar.I3()) {
                    if (!MediaController.B().H()) {
                        MediaController.B().v0.b0 = e8Var2.C2;
                    }
                    e8Var2.c1(fjVar, false);
                }
                if (e8Var2.B2 == 1 && e8Var2.D2 > 0 && MediaController.B().H()) {
                    if (j13 > 200 || e8Var2.C2 == 0.0f) {
                        e8Var2.F2 = currentTimeMillis2;
                        MediaController.B().i0(MediaController.B().v0, f15);
                    }
                    if (e8Var2.D2 <= 0 || e8Var2.C2 <= 0.0f) {
                        return;
                    }
                    g0.h3(e8Var2.I2, 16L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public g(u0 u0Var, int i7) {
        this.a = 6;
        this.b = u0Var;
    }
}
