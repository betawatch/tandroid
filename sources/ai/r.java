package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import bi.c4;
import bi.h4;
import bi.j6;
import c8.ja;
import di.c6;
import di.l8;
import di.u8;
import di.y4;
import fi.a4;
import fi.b4;
import fi.g6;
import fi.h9;
import fi.k6;
import fi.l6;
import fi.n3;
import fi.p3;
import fi.s6;
import fi.t3;
import fi.y3;
import hi.d7;
import hi.na;
import hi.s8;
import hi.sa;
import hi.x5;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.o3;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.f20;
import org.telegram.messenger.fc;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.r10;
import org.telegram.messenger.v9;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.vr;
import org.telegram.messenger.xe;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.om0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r(x5 x5Var, Bitmap[] bitmapArr, d7 d7Var, boolean[] zArr) {
        this.a = 17;
        this.b = x5Var;
        this.d = bitmapArr;
        this.e = d7Var;
        this.c = zArr;
    }

    private final void a() {
        int i7;
        long j3;
        int i10;
        long j10;
        long j11;
        ArrayList arrayList;
        d7 d7Var = (d7) this.c;
        String str = (String) this.b;
        int[][] iArr = (int[][]) this.d;
        z10 z10Var = (z10) this.e;
        d7Var.getClass();
        g20 g20Var = new g20();
        char c10 = 1;
        g20Var.J = true;
        g20Var.a0 = d7Var.c1;
        g20Var.h = d7Var.k0;
        g20Var.i = d7Var.l0;
        g20Var.k = d7Var.i0;
        g20Var.l = d7Var.j0;
        File file = d7Var.P0;
        g20Var.B = file == null ? null : file.getPath();
        File file2 = d7Var.W0;
        g20Var.D = file2 == null ? null : file2.getPath();
        File file3 = d7Var.X0;
        g20Var.E = file3 == null ? null : file3.getPath();
        File file4 = d7Var.Y0;
        g20Var.F = file4 == null ? null : file4.getPath();
        int v = MediaController.v(g20Var.k, g20Var.l, g20Var.m, true);
        if (!d7Var.K || str == null || d7Var.v()) {
            File file5 = d7Var.Z0;
            if (file5 != null) {
                g20Var.o = file5.getAbsolutePath();
            } else {
                g20Var.o = str;
            }
            g20Var.I = true;
            g20Var.L = d7Var.S;
            if (d7Var.v()) {
                int i11 = 0;
                boolean z10 = false;
                while (i11 < d7Var.T.size()) {
                    d7 d7Var2 = (d7) d7Var.T.get(i11);
                    if (d7Var2.K) {
                        d7Var2.k0 = Math.max(d7Var2.k0, iArr[i11][c10]);
                        d7Var2.l0 = Math.max(d7Var2.l0, iArr[i11][2]);
                        i10 = v;
                        d7Var2.h0 = Math.max(d7Var2.h0, iArr[i11][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i11++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = f20.a(d7Var);
                g20Var.M = a10;
                if (z10) {
                    int size = a10.size();
                    long j12 = 0;
                    f20 f20Var = null;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = a10.get(i12);
                        i12++;
                        f20 f20Var2 = (f20) obj;
                        if (f20Var2.b) {
                            long j13 = f20Var2.o;
                            if (j13 > j12) {
                                f20Var = f20Var2;
                                j12 = j13;
                            }
                        }
                    }
                    if (f20Var != null) {
                        float f10 = f20Var.o;
                        float f11 = f20Var.k;
                        float f12 = f20Var.j;
                        long j14 = (long) ((f11 - f12) * f10);
                        d7Var.h0 = j14;
                        g20Var.v = j14;
                        g20Var.r = j14;
                        j3 = -(f20Var.f + ((long) (f12 * f10)));
                        f20Var.f = j3;
                        ArrayList arrayList2 = g20Var.M;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            f20 f20Var3 = (f20) obj2;
                            if (f20Var3.b && f20Var3 != f20Var) {
                                f20Var3.f += j3;
                            }
                        }
                        g20Var.a = -1L;
                        g20Var.b = -1L;
                        g20Var.t = true;
                        g20Var.j = -1;
                        g20Var.u = 1.0f;
                        g20Var.m = -1;
                        g20Var.n = 30;
                        g20Var.q = (long) (((d7Var.h0 / 1000.0f) * i7) / 8.0f);
                        g20Var.A = null;
                    }
                } else {
                    long j15 = d7Var.S0;
                    d7Var.h0 = j15;
                    g20Var.v = j15;
                    g20Var.r = j15;
                }
            } else {
                i7 = v;
                if (d7Var.o0 != null) {
                    long j16 = (long) ((d7Var.t0 - d7Var.s0) * d7Var.q0);
                    d7Var.h0 = j16;
                    g20Var.v = j16;
                    g20Var.r = j16;
                } else if (d7Var.y != null) {
                    long j17 = (long) ((d7Var.F - d7Var.E) * d7Var.C);
                    d7Var.h0 = j17;
                    g20Var.v = j17;
                    g20Var.r = j17;
                } else {
                    long j18 = d7Var.S0;
                    d7Var.h0 = j18;
                    g20Var.v = j18;
                    g20Var.r = j18;
                }
            }
            j3 = 0;
            g20Var.a = -1L;
            g20Var.b = -1L;
            g20Var.t = true;
            g20Var.j = -1;
            g20Var.u = 1.0f;
            g20Var.m = -1;
            g20Var.n = 30;
            g20Var.q = (long) (((d7Var.h0 / 1000.0f) * i7) / 8.0f);
            g20Var.A = null;
        } else {
            g20Var.o = str;
            g20Var.I = false;
            g20Var.n = Math.min(59, iArr[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr[0][3];
            }
            g20Var.j = E;
            if (E >= 1000000 || (arrayList = d7Var.T0) == null || arrayList.isEmpty()) {
                int i14 = g20Var.j;
                if (i14 < 500000) {
                    g20Var.m = 2500000;
                    g20Var.j = -1;
                } else {
                    g20Var.m = Utilities.j(i14, 3000000, 500000);
                }
            } else {
                g20Var.m = 2000000;
                g20Var.j = -1;
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(g20Var.j);
            sb2.append(" => ");
            i5.c.r(g20Var.m, sb2);
            int i15 = iArr[0][4];
            long j19 = i15;
            d7Var.h0 = j19;
            g20Var.v = j19 * 1000;
            float f13 = j19;
            long j20 = ((long) (d7Var.Z * f13)) * 1000;
            g20Var.a = j20;
            long j21 = ((long) (d7Var.a0 * f13)) * 1000;
            g20Var.b = j21;
            g20Var.r = j21 - j20;
            g20Var.u = d7Var.P;
            g20Var.t = d7Var.Y;
            g20Var.q = (long) a8.p0.f(i15 / 1000.0f, v, 8.0f, r2[5]);
            g20Var.q = Math.max(d7Var.L.length(), g20Var.q);
            g20Var.A = d7Var.a1;
            File file6 = d7Var.Q0;
            g20Var.C = file6 == null ? null : file6.getPath();
            j3 = 0;
        }
        g20Var.S = d7Var.a;
        g20Var.U = d7Var.z0;
        g20Var.T = d7Var.y0;
        g20Var.c = -1L;
        xe xeVar = d7Var.m0;
        if (xeVar != null) {
            g20Var.H = xeVar.clone();
        } else {
            g20Var.H = new xe();
        }
        g20Var.H.B = new Matrix();
        g20Var.H.B.set(d7Var.n0);
        g20Var.G = d7Var.T0;
        g20Var.Q = Integer.valueOf(d7Var.A0);
        g20Var.R = Integer.valueOf(d7Var.B0);
        g20Var.V = true;
        g20Var.K = d7Var.d1;
        g20Var.b0.clear();
        if (d7Var.v() && !d7Var.Y) {
            ArrayList arrayList3 = g20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                f20 f20Var4 = (f20) obj3;
                if (f20Var4.b && f20Var4.e > 0.0f && !f20Var4.c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(f20Var4.d);
                    mixedSoundInfo.volume = f20Var4.e;
                    float f14 = f20Var4.j;
                    float f15 = f20Var4.o;
                    mixedSoundInfo.audioOffset = ((long) (f14 * f15)) * 1000;
                    mixedSoundInfo.startTime = f20Var4.f * 1000;
                    mixedSoundInfo.duration = ((long) ((f20Var4.k - f14) * f15)) * 1000;
                    g20Var.b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = d7Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = d7Var.u0;
            float f16 = d7Var.s0;
            float f17 = d7Var.q0;
            long j22 = ((long) (f16 * f17)) * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (d7Var.K) {
                mixedSoundInfo2.startTime = ((long) (d7Var.r0 - (d7Var.Z * d7Var.h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j23 = mixedSoundInfo2.startTime + j3;
            mixedSoundInfo2.startTime = j23;
            if (j23 < j11) {
                mixedSoundInfo2.audioOffset = j22 - j23;
                mixedSoundInfo2.startTime = j11;
            }
            mixedSoundInfo2.duration = ((long) ((d7Var.t0 - f16) * f17)) * 1000;
            g20Var.b0.add(mixedSoundInfo2);
        }
        String str2 = d7Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = d7Var.G;
            float f18 = d7Var.E;
            float f19 = d7Var.C;
            long j24 = ((long) (f18 * f19)) * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (d7Var.K) {
                mixedSoundInfo3.startTime = ((long) (d7Var.D - (d7Var.Z * d7Var.h0))) * 1000;
                j10 = 0;
            } else {
                j10 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j25 = mixedSoundInfo3.startTime + j3;
            mixedSoundInfo3.startTime = j25;
            if (j25 < j10) {
                mixedSoundInfo3.audioOffset = j24 - j25;
                mixedSoundInfo3.startTime = j10;
            }
            mixedSoundInfo3.duration = ((long) ((d7Var.F - f18) * f19)) * 1000;
            g20Var.b0.add(mixedSoundInfo3);
        }
        z10Var.a(g20Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b3, code lost:
    
        if (r6 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0371 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0376 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        BufferedWriter bufferedWriter;
        boolean z10;
        String str;
        int i7;
        int i10;
        d7 d7Var;
        File file;
        ArrayList arrayList;
        int i11;
        TLRPC.Photo photo;
        h9 h9Var;
        org.telegram.ui.ActionBar.e2 T;
        boolean z11;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i12 = 10;
        SQLiteCursor sQLiteCursor = null;
        int i13 = 1;
        int i14 = 0;
        switch (this.a) {
            case 0:
                DictationAsr.a((String) this.b, (boolean[]) this.c, (ki.r1) this.d, (android.support.v4.media.session.a0) this.e);
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.c;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.d;
                String str2 = (String) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.e;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.g.b(iOnDoneCallback, str2, aVar);
                    return;
                }
                androidx.car.app.utils.g.f(iOnDoneCallback, str2, new IllegalStateException("Lifecycle is not at least created when dispatching " + aVar));
                return;
            case 2:
                final c4 c4Var = (c4) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                bi.i2 i2Var = (bi.i2) this.d;
                final View view = (View) this.e;
                wp0 wp0Var = c4Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    i2Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = c4Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(c4Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z12 = savedStarGift.pinned_to_top;
                final boolean z13 = !z12;
                if (c4Var.e.o(savedStarGift, z13, false)) {
                    new h4(c4Var.getContext(), wp0Var.c, savedStarGift, c4Var.c, new r10() { // from class: bi.s3
                        @Override // org.telegram.messenger.r10
                        public final Object run() {
                            ((i2) view).d(z13, true);
                            c4 c4Var2 = c4.this;
                            c4Var2.f.v0(0);
                            return cc.a0(c4Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z12) {
                    k5.n(null, 2131749880, cc.a0(wp0Var.a), R.raw.ic_unpin, 36);
                } else {
                    cc.a0(wp0Var.a).I(R.raw.ic_pin, hd.M0(2131750076, null), hd.M0(2131750077, null)).j();
                }
                ((bi.i2) view).d(z13, true);
                c4Var.f.v0(0);
                return;
            case 3:
                o3 o3Var = (o3) this.c;
                String str3 = (String) this.b;
                Map map = (Map) this.d;
                List list = (List) this.e;
                ca.h hVar = (ca.h) o3Var.a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o3Var.g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hVar.i(str3, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hVar.h(str3, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File b10 = hVar.a.b(str3, "rollouts-state");
                if (list.isEmpty()) {
                    ca.h.g(b10, "Rollout state is empty for session: " + str3);
                    return;
                }
                try {
                    String e10 = ca.h.e(list);
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), ca.h.b));
                    try {
                        bufferedWriter2.write(e10);
                        bufferedWriter2.flush();
                        aa.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        bufferedWriter = bufferedWriter2;
                        try {
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                            ca.h.f(b10);
                            aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter = bufferedWriter2;
                        aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    bufferedWriter = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter = null;
                }
            case 4:
                r41 r41Var = (r41) this.b;
                ci.a0 a0Var = (ci.a0) this.c;
                a20 a20Var = (a20) this.d;
                z10 z10Var = (z10) this.e;
                if (ci.a0.d(r41Var.getParentActivity())) {
                    a0Var.e();
                    om0 om0Var = new om0(10, false, false, null);
                    om0Var.H = 1;
                    om0Var.I = false;
                    om0Var.y = false;
                    om0Var.W = new android.support.v4.media.session.a0(a20Var, r41Var, z10Var, false, 19);
                    r41Var.presentFragment(om0Var);
                    return;
                }
                return;
            case 5:
                String str4 = (String) this.b;
                a20 a20Var2 = (a20) this.c;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                z10 z10Var2 = (z10) this.e;
                try {
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = fc.K(str4, null, c12.x, c12.y, true);
                    if (K != null) {
                        str = ci.a0.l(K, a20Var2);
                        try {
                            K.recycle();
                        } catch (Throwable th5) {
                            th = th5;
                            z10 = true;
                            a8.g(th, z10);
                            org.telegram.messenger.g0.h3(new ci.y(e2Var, str, z10Var2));
                            return;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    z10 = true;
                    str = null;
                }
                org.telegram.messenger.g0.h3(new ci.y(e2Var, str, z10Var2));
                return;
            case 6:
                di.s sVar = (di.s) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str5 = (String) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                ch.w wVar = sVar.n;
                di.t tVar = sVar.r;
                if (tVar.P) {
                    return;
                }
                sVar.e = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    i7 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
                    np.s1(i7).Y3(starsStatus.users, false);
                    i10 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
                    np.s1(i10).S3(starsStatus.chats, false);
                    boolean z14 = ((starsStatus.flags & 1) == 0 || starsStatus.next_offset == null) ? false : true;
                    if (z14 && TextUtils.equals(str5, starsStatus.next_offset)) {
                        sVar.h = true;
                    } else {
                        sVar.b.addAll(starsStatus.history);
                        sVar.d = starsStatus.next_offset;
                        sVar.f = !z14;
                    }
                } else {
                    sVar.h = true;
                    if (tL_error != null) {
                        cc.d0(tL_error);
                    }
                }
                sVar.c.g3.O(false);
                sVar.removeCallbacks(wVar);
                sVar.post(wVar);
                return;
            case 7:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                vf.b bVar = (vf.b) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                if (e2Var2 != null && tL_error2 != null) {
                    cc.a0(e2Var2).f0(tL_error2, false);
                }
                if ((e2Var2 instanceof an) && tL_error2 == null) {
                    ((an) e2Var2).Fc();
                }
                bVar.b();
                t1Var.dismiss();
                return;
            case 8:
                c6 c6Var = (c6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.d;
                ec[] ecVarArr = (ec[]) this.e;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                TL_stars.StarGift y12 = c6Var.y1();
                v9.c(c6Var.a).j(y12.gift_id, new di.i2(c6Var, y12, starGiftAttribute, ecVarArr, zArr, 0));
                return;
            case 9:
                c6 c6Var2 = (c6) this.b;
                gj gjVar = (gj) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                c6Var2.h3 = true;
                c6Var2.j2(gjVar, null);
                c6Var2.t2(0, true, null);
                nz nzVar = c6Var2.W1;
                if (nzVar != null) {
                    nzVar.c(true);
                }
                u8.y(c6Var2.a, false).O();
                l8 G = u8.y(c6Var2.a, false).G(m10.i(c6Var2.a).e(), false);
                if (G != null) {
                    G.k(arrayList2, starGift);
                    return;
                }
                return;
            case 10:
                c6 c6Var3 = (c6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                aa.r rVar = (aa.r) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                if (!(tLObject2 instanceof TLRPC.TL_messages_chatFull)) {
                    xb Y = c6Var3.k().Y(tL_error3);
                    Y.t = true;
                    Y.j();
                    return;
                }
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                np.s1(c6Var3.a).Y3(tL_messages_chatFull.users, false);
                np.s1(c6Var3.a).S3(tL_messages_chatFull.chats, false);
                np.s1(c6Var3.a).R3(tL_messages_chatFull.full_chat);
                if (tL_messages_chatFull.full_chat.stargifts_available) {
                    rVar.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, c6Var3.getContext(), c6Var3.J0);
                alertDialog$Builder.a.S = hd.M0(2131750262, null);
                alertDialog$Builder.a.U = hd.M0(2131750263, null);
                i5.c.C(null, 2131747831, alertDialog$Builder, null);
                return;
            case 11:
                c6 c6Var4 = (c6) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error4 != null || !(tLObject3 instanceof TLRPC.Updates)) {
                    c6Var4.k().f0(tL_error4, false);
                    return;
                }
                c6Var4.n2 = true;
                c6Var4.o3 = null;
                c6Var4.m1(inputSavedStarGift, (TLRPC.Updates) tLObject3, new di.l1(c6Var4, 9));
                Utilities.d.c(new di.s2(1, c6Var4, tLObject3));
                return;
            case 12:
                y4 y4Var = (y4) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                h6 h6Var = y4Var.I;
                y4Var.i0 = false;
                if (starGift2 != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                fh0 fh0Var = y4Var.m0;
                int i15 = 8;
                if (fh0Var != null) {
                    fh0Var.d();
                    org.telegram.messenger.g0.i3(new o(i15), 750L);
                }
                y4Var.R.animate().alpha(0.0f).start();
                y4Var.T.animate().alpha(1.0f).start();
                y4Var.H.animate().alpha(1.0f).start();
                y4Var.S.animate().alpha(0.0f).start();
                y4Var.Q.animate().alpha(1.0f).start();
                y4Var.N.setText(org.telegram.messenger.g0.X2(hd.G(arrayList3.size(), "GiftCraftFailedText", new Object[0])));
                h6Var.setText(hd.M0(2131749795, null));
                h6Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
                y4Var.J.setAlpha(0.0f);
                if (y4Var.P != null) {
                    int i16 = 0;
                    while (true) {
                        bi.i2[] i2VarArr = y4Var.P;
                        if (i16 < i2VarArr.length) {
                            org.telegram.messenger.g0.E2(i2VarArr[i16]);
                            i16++;
                        } else {
                            y4Var.P = null;
                        }
                    }
                }
                y4Var.P = new bi.i2[arrayList3.size()];
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i17);
                    bi.i2 i2Var2 = new bi.i2(y4Var.a0, y4Var.getContext(), y4Var.a);
                    i2Var2.h(starGift3, false, false, false, false, true);
                    i2Var2.y.setVisibility(8);
                    i2Var2.setRibbonColor(-3065286);
                    i9 i9Var = i2Var2.E;
                    FrameLayout.LayoutParams e13 = ja.e(42, 42, 17);
                    i2Var2.F = e13;
                    i9Var.setLayoutParams(e13);
                    int i18 = i17 + 1;
                    boolean z15 = i18 >= arrayList3.size();
                    LinearLayout linearLayout = y4Var.O;
                    y4Var.P[i17] = i2Var2;
                    linearLayout.addView(i2Var2, ja.q(74, 74, 0.0f, 51, 0, 0, z15 ? 0 : 6, 0));
                    i17 = i18;
                }
                return;
            case 13:
                t3 t3Var = (t3) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                z10 z10Var3 = (z10) this.e;
                b4 b4Var = t3Var.x;
                if (tLObject4 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject4;
                    np.s1(b4Var.m2).Y3(tL_stories_stories.users, false);
                    np.s1(b4Var.m2).S3(tL_stories_stories.chats, false);
                    while (i14 < tL_stories_stories.stories.size()) {
                        if (tL_stories_stories.stories.get(i14).id == storyItem.id) {
                            z10Var3.a(tL_stories_stories.stories.get(i14).media.document);
                            return;
                        }
                        i14++;
                    }
                }
                z10Var3.a(null);
                return;
            case 14:
                t3 t3Var2 = (t3) this.b;
                Activity activity = (Activity) this.c;
                fi.i9 i9Var2 = (fi.i9) this.d;
                y3 y3Var = (y3) this.e;
                sa D = sa.D(activity, t3Var2.x.m2);
                a4 a4Var = t3Var2.x.w2;
                long j3 = (a4Var == null || (h9Var = (h9) a4Var.c) == null) ? 0L : h9Var.currentPosition;
                hi.a1 a1Var = np.s1(t3Var2.x.m2).P1().w;
                TL_stories.StoryItem storyItem2 = t3Var2.x.y1.a;
                long j10 = storyItem2.dialogId;
                ArrayList arrayList4 = a1Var.b;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    int i19 = i14 + 1;
                    d7Var = (d7) obj;
                    if (d7Var.g && storyItem2.id == d7Var.f && j10 == d7Var.e) {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        i11 = i19;
                        if ((document == null || document.id == d7Var.H) && ((photo = messageMedia.photo) == null || photo.id == d7Var.I)) {
                            d7Var.h = true;
                            if (d7Var != null || d7Var.u || (file = d7Var.L) == null || !file.exists()) {
                                d7Var = d7.n(t3Var2.x.y1.h(), t3Var2.x.y1.a);
                                d7Var.e = t3Var2.x.l1;
                            }
                            d7 g10 = d7Var.g();
                            if (t3Var2.x.G0()) {
                                b4 b4Var2 = t3Var2.x;
                                g10.J0 = b4Var2.l1;
                                g10.L0 = np.a5(b4Var2.y1.a.media);
                                k6 k6Var = i9Var2.O0;
                                if (k6Var instanceof fi.c6) {
                                    g10.K0 = ((fi.c6) k6Var).E;
                                }
                            }
                            D.R(na.d(i9Var2), g10, j3);
                            D.R = new n3(t3Var2, 3);
                            D.S = new p3(t3Var2, y3Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList4;
                        i11 = i19;
                    }
                    arrayList4 = arrayList;
                    i14 = i11;
                }
                d7Var = null;
                if (d7Var != null) {
                }
                d7Var = d7.n(t3Var2.x.y1.h(), t3Var2.x.y1.a);
                d7Var.e = t3Var2.x.l1;
                d7 g102 = d7Var.g();
                if (t3Var2.x.G0()) {
                }
                D.R(na.d(i9Var2), g102, j3);
                D.R = new n3(t3Var2, 3);
                D.S = new p3(t3Var2, y3Var, 1);
                return;
            case 15:
                g6 g6Var = (g6) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                z10 z10Var4 = (z10) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                g6Var.i = false;
                if (tLObject5 instanceof TL_stories.TL_storyAlbum) {
                    l6 a10 = l6.a((TL_stories.TL_storyAlbum) tLObject5);
                    g6Var.h.add(a10);
                    g6Var.f(true);
                    z10Var4.a(a10);
                    return;
                }
                if (tL_error5 != null && (T = LaunchActivity.T()) != null) {
                    cc.a0(T).f0(tL_error5, false);
                }
                ns.f(g6Var.a).k(ns.j3, Long.valueOf(g6Var.b), g6Var);
                return;
            case 16:
                k6 k6Var2 = (k6) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                vr vrVar = (vr) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                int i20 = k6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i21 = k6Var2.e;
                sb2.append(i21);
                sb2.append("{");
                long j11 = k6Var2.d;
                sb2.append(j11);
                sb2.append("} saveCache {");
                sb2.append(s6.a(arrayList5));
                org.telegram.ui.Cells.y0.t("}", sb2);
                try {
                    SQLiteDatabase sQLiteDatabase = vrVar.b;
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j11 + " AND album_id = " + i20).stepThis().dispose();
                        SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        while (i14 < arrayList5.size()) {
                            try {
                                TL_stories.StoryItem storyItem3 = ((gj) arrayList5.get(i14)).l;
                                if (storyItem3 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem3.getObjectSize());
                                    storyItem3.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(i13, j11);
                                    executeFast.bindInteger(2, storyItem3.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i21);
                                    executeFast.bindInteger(5, k6Var2.m.contains(Integer.valueOf(storyItem3.id)) ? 1 : 0);
                                    executeFast.bindInteger(6, arrayList6.indexOf(Integer.valueOf(storyItem3.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    executeFast2.requery();
                                    executeFast2.bindLong(i13, j11);
                                    executeFast2.bindInteger(2, i20);
                                    executeFast2.bindInteger(3, storyItem3.id);
                                    executeFast2.bindInteger(4, i14);
                                    executeFast2.step();
                                }
                                i14++;
                                i13 = 1;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLitePreparedStatement2 = executeFast2;
                                sQLitePreparedStatement = executeFast;
                                z11 = true;
                                try {
                                    vrVar.o(th, z11);
                                    org.telegram.messenger.g0.h3(new fi.h6(k6Var2, 2));
                                    return;
                                } finally {
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                }
                            }
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                        }
                        if (executeFast2 != null) {
                            executeFast2.dispose();
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        sQLitePreparedStatement = executeFast;
                        z11 = true;
                        sQLitePreparedStatement2 = null;
                        vrVar.o(th, z11);
                        org.telegram.messenger.g0.h3(new fi.h6(k6Var2, 2));
                        return;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    z11 = true;
                    sQLitePreparedStatement = null;
                }
                org.telegram.messenger.g0.h3(new fi.h6(k6Var2, 2));
                return;
            case 17:
                x5 x5Var = (x5) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                d7 d7Var2 = (d7) this.e;
                boolean[] zArr2 = (boolean[]) this.c;
                u9 u9Var = x5Var.H;
                Bitmap bitmap = x5Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    x5Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                x5Var.a = bitmap2;
                if (d7Var2 != null && !d7Var2.c && d7Var2.K && bitmap2 != null) {
                    d7Var2.k0 = bitmap2.getWidth();
                    d7Var2.l0 = x5Var.a.getHeight();
                    d7Var2.A();
                }
                if (zArr2[0] && d7Var2 != null && u9Var != null && x5Var.a != null) {
                    u9Var.e();
                    u9Var.f(d7Var2.b(0.2f, x5Var.a), false);
                    s8 s8Var = x5Var.w;
                    if (s8Var != null) {
                        s8Var.run();
                    }
                }
                x5Var.r();
                x5Var.invalidate();
                return;
            case 18:
                a();
                return;
            case 19:
                kg.y yVar = (kg.y) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList7 = yVar.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf = arrayList7.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList7.set(indexOf, tL_businessChatLink2);
                        ns.f(yVar.a).k(ns.J1, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        yVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                kg.v1 v1Var = (kg.v1) this.b;
                vr vrVar2 = (vr) this.c;
                kg.u1 u1Var = (kg.u1) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = vrVar2.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(u1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e14) {
                        a8.g(e14, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.h3(new r(v1Var, arrayList8, u1Var, tL_messages_sendQuickReplyMessages, 21));
                    return;
                } catch (Throwable th10) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th10;
                }
            case 21:
                kg.v1 v1Var2 = (kg.v1) this.b;
                ArrayList<Integer> arrayList9 = (ArrayList) this.c;
                kg.u1 u1Var2 = (kg.u1) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i22 = v1Var2.a;
                if (arrayList9.isEmpty() || arrayList9.size() < u1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = u1Var2.a;
                    ConnectionsManager.getInstance(i22).sendRequest(tL_messages_getQuickReplyMessages, new j6(v1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, i12));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList9;
                    while (i14 < arrayList9.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                        i14++;
                    }
                    ConnectionsManager.getInstance(i22).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 22:
                hi.d dVar = (hi.d) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.d;
                ki.p1 p1Var = (ki.p1) this.e;
                dVar.setLoading(false);
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    u2Var.dismiss();
                    p1Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 23:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) this.c;
                e6 e6Var = (e6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                new cc(u2Var2.F, e6Var).I(R.raw.copy, hd.M0(2131754333, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131754334, ki.k.J0(connectedbotstarref.commission_permille), q10.p(user)))).j();
                return;
            case 24:
                ki.n3.A0((ki.n3) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 25:
                TLObject tLObject8 = (TLObject) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                org.telegram.ui.web.o oVar2 = (org.telegram.ui.web.o) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr3[0]) {
                        return;
                    }
                    zArr3[0] = true;
                    oVar2.a(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                oVar2.a(Boolean.TRUE, "allowed");
                return;
            case 26:
                oi.o oVar3 = (oi.o) this.b;
                oi.a aVar2 = (oi.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                m60 m60Var = (m60) this.e;
                oVar3.r.Y4(aVar2, pageBlock);
                m60Var.u();
                return;
            case 27:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                return;
            case 28:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                return;
            default:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (m60) this.e);
                return;
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ r(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = str;
        this.e = obj3;
    }

    public /* synthetic */ r(Object obj, String str, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = str;
        this.d = obj2;
        this.e = obj3;
    }
}
