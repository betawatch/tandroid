package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import bi.g3;
import bi.k8;
import bi.n6;
import bi.s6;
import bi.v3;
import bi.y7;
import c8.ma;
import di.b5;
import di.f6;
import di.p8;
import di.y8;
import fi.a6;
import fi.d6;
import fi.e6;
import fi.e9;
import fi.f9;
import fi.h6;
import fi.i6;
import fi.l3;
import fi.n3;
import fi.p6;
import fi.r3;
import fi.w3;
import fi.y3;
import fi.z3;
import hi.c7;
import hi.na;
import hi.r8;
import hi.sa;
import hi.v5;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ki.h3;
import m.o3;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.ec;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.u9;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.we;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.qm0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r(f6 f6Var, TLObject tLObject, TL_wallet.nftItem nftitem, String str) {
        this.a = 10;
        this.c = f6Var;
        this.d = tLObject;
        this.e = nftitem;
        this.b = str;
    }

    private final void a() {
        int i7;
        long j3;
        int i10;
        long j10;
        long j11;
        ArrayList arrayList;
        c7 c7Var = (c7) this.c;
        String str = (String) this.b;
        int[][] iArr = (int[][]) this.d;
        x10 x10Var = (x10) this.e;
        c7Var.getClass();
        e20 e20Var = new e20();
        char c10 = 1;
        e20Var.J = true;
        e20Var.a0 = c7Var.c1;
        e20Var.h = c7Var.k0;
        e20Var.i = c7Var.l0;
        e20Var.k = c7Var.i0;
        e20Var.l = c7Var.j0;
        File file = c7Var.P0;
        e20Var.B = file == null ? null : file.getPath();
        File file2 = c7Var.W0;
        e20Var.D = file2 == null ? null : file2.getPath();
        File file3 = c7Var.X0;
        e20Var.E = file3 == null ? null : file3.getPath();
        File file4 = c7Var.Y0;
        e20Var.F = file4 == null ? null : file4.getPath();
        int v = MediaController.v(e20Var.k, e20Var.l, e20Var.m, true);
        if (!c7Var.K || str == null || c7Var.v()) {
            File file5 = c7Var.Z0;
            if (file5 != null) {
                e20Var.o = file5.getAbsolutePath();
            } else {
                e20Var.o = str;
            }
            e20Var.I = true;
            e20Var.L = c7Var.S;
            if (c7Var.v()) {
                int i11 = 0;
                boolean z10 = false;
                while (i11 < c7Var.T.size()) {
                    c7 c7Var2 = (c7) c7Var.T.get(i11);
                    if (c7Var2.K) {
                        c7Var2.k0 = Math.max(c7Var2.k0, iArr[i11][c10]);
                        c7Var2.l0 = Math.max(c7Var2.l0, iArr[i11][2]);
                        i10 = v;
                        c7Var2.h0 = Math.max(c7Var2.h0, iArr[i11][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i11++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = d20.a(c7Var);
                e20Var.M = a10;
                if (z10) {
                    int size = a10.size();
                    long j12 = 0;
                    d20 d20Var = null;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = a10.get(i12);
                        i12++;
                        d20 d20Var2 = (d20) obj;
                        if (d20Var2.b) {
                            long j13 = d20Var2.o;
                            if (j13 > j12) {
                                d20Var = d20Var2;
                                j12 = j13;
                            }
                        }
                    }
                    if (d20Var != null) {
                        float f10 = d20Var.o;
                        float f11 = d20Var.k;
                        float f12 = d20Var.j;
                        long j14 = (long) ((f11 - f12) * f10);
                        c7Var.h0 = j14;
                        e20Var.v = j14;
                        e20Var.r = j14;
                        j3 = -(d20Var.f + ((long) (f12 * f10)));
                        d20Var.f = j3;
                        ArrayList arrayList2 = e20Var.M;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            d20 d20Var3 = (d20) obj2;
                            if (d20Var3.b && d20Var3 != d20Var) {
                                d20Var3.f += j3;
                            }
                        }
                        e20Var.a = -1L;
                        e20Var.b = -1L;
                        e20Var.t = true;
                        e20Var.j = -1;
                        e20Var.u = 1.0f;
                        e20Var.m = -1;
                        e20Var.n = 30;
                        e20Var.q = (long) (((c7Var.h0 / 1000.0f) * i7) / 8.0f);
                        e20Var.A = null;
                    }
                } else {
                    long j15 = c7Var.S0;
                    c7Var.h0 = j15;
                    e20Var.v = j15;
                    e20Var.r = j15;
                }
            } else {
                i7 = v;
                if (c7Var.o0 != null) {
                    long j16 = (long) ((c7Var.t0 - c7Var.s0) * c7Var.q0);
                    c7Var.h0 = j16;
                    e20Var.v = j16;
                    e20Var.r = j16;
                } else if (c7Var.y != null) {
                    long j17 = (long) ((c7Var.F - c7Var.E) * c7Var.C);
                    c7Var.h0 = j17;
                    e20Var.v = j17;
                    e20Var.r = j17;
                } else {
                    long j18 = c7Var.S0;
                    c7Var.h0 = j18;
                    e20Var.v = j18;
                    e20Var.r = j18;
                }
            }
            j3 = 0;
            e20Var.a = -1L;
            e20Var.b = -1L;
            e20Var.t = true;
            e20Var.j = -1;
            e20Var.u = 1.0f;
            e20Var.m = -1;
            e20Var.n = 30;
            e20Var.q = (long) (((c7Var.h0 / 1000.0f) * i7) / 8.0f);
            e20Var.A = null;
        } else {
            e20Var.o = str;
            e20Var.I = false;
            e20Var.n = Math.min(59, iArr[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr[0][3];
            }
            e20Var.j = E;
            if (E >= 1000000 || (arrayList = c7Var.T0) == null || arrayList.isEmpty()) {
                int i14 = e20Var.j;
                if (i14 < 500000) {
                    e20Var.m = 2500000;
                    e20Var.j = -1;
                } else {
                    e20Var.m = Utilities.j(i14, 3000000, 500000);
                }
            } else {
                e20Var.m = 2000000;
                e20Var.j = -1;
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(e20Var.j);
            sb2.append(" => ");
            i5.c.t(e20Var.m, sb2);
            int i15 = iArr[0][4];
            long j19 = i15;
            c7Var.h0 = j19;
            e20Var.v = j19 * 1000;
            float f13 = j19;
            long j20 = ((long) (c7Var.Z * f13)) * 1000;
            e20Var.a = j20;
            long j21 = ((long) (c7Var.a0 * f13)) * 1000;
            e20Var.b = j21;
            e20Var.r = j21 - j20;
            e20Var.u = c7Var.P;
            e20Var.t = c7Var.Y;
            e20Var.q = (long) a8.p0.f(i15 / 1000.0f, v, 8.0f, r2[5]);
            e20Var.q = Math.max(c7Var.L.length(), e20Var.q);
            e20Var.A = c7Var.a1;
            File file6 = c7Var.Q0;
            e20Var.C = file6 == null ? null : file6.getPath();
            j3 = 0;
        }
        e20Var.S = c7Var.a;
        e20Var.U = c7Var.z0;
        e20Var.T = c7Var.y0;
        e20Var.c = -1L;
        we weVar = c7Var.m0;
        if (weVar != null) {
            e20Var.H = weVar.clone();
        } else {
            e20Var.H = new we();
        }
        e20Var.H.B = new Matrix();
        e20Var.H.B.set(c7Var.n0);
        e20Var.G = c7Var.T0;
        e20Var.Q = Integer.valueOf(c7Var.A0);
        e20Var.R = Integer.valueOf(c7Var.B0);
        e20Var.V = true;
        e20Var.K = c7Var.d1;
        e20Var.b0.clear();
        if (c7Var.v() && !c7Var.Y) {
            ArrayList arrayList3 = e20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                d20 d20Var4 = (d20) obj3;
                if (d20Var4.b && d20Var4.e > 0.0f && !d20Var4.c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(d20Var4.d);
                    mixedSoundInfo.volume = d20Var4.e;
                    float f14 = d20Var4.j;
                    float f15 = d20Var4.o;
                    mixedSoundInfo.audioOffset = ((long) (f14 * f15)) * 1000;
                    mixedSoundInfo.startTime = d20Var4.f * 1000;
                    mixedSoundInfo.duration = ((long) ((d20Var4.k - f14) * f15)) * 1000;
                    e20Var.b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = c7Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = c7Var.u0;
            float f16 = c7Var.s0;
            float f17 = c7Var.q0;
            long j22 = ((long) (f16 * f17)) * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (c7Var.K) {
                mixedSoundInfo2.startTime = ((long) (c7Var.r0 - (c7Var.Z * c7Var.h0))) * 1000;
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
            mixedSoundInfo2.duration = ((long) ((c7Var.t0 - f16) * f17)) * 1000;
            e20Var.b0.add(mixedSoundInfo2);
        }
        String str2 = c7Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = c7Var.G;
            float f18 = c7Var.E;
            float f19 = c7Var.C;
            long j24 = ((long) (f18 * f19)) * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (c7Var.K) {
                mixedSoundInfo3.startTime = ((long) (c7Var.D - (c7Var.Z * c7Var.h0))) * 1000;
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
            mixedSoundInfo3.duration = ((long) ((c7Var.F - f18) * f19)) * 1000;
            e20Var.b0.add(mixedSoundInfo3);
        }
        x10Var.a(e20Var);
    }

    private final void b() {
        h3.A0((h3) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
    }

    private final void c() {
        TLObject tLObject = (TLObject) this.b;
        boolean[] zArr = (boolean[]) this.c;
        org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
        TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            oVar.a(Boolean.TRUE, "cancelled");
            return;
        }
        userFull.bot_can_manage_emoji_status = true;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        oVar.a(Boolean.TRUE, "allowed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x020e, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03cd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0507  */
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
        c7 c7Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        e9 e9Var;
        char c10;
        org.telegram.ui.ActionBar.g2 T;
        boolean z11;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement executeFast;
        String str2;
        int i11 = 10;
        SQLiteCursor sQLiteCursor = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                DictationAsr.a((String) this.b, (boolean[]) this.c, (h21) this.d, (android.support.v4.media.session.a0) this.e);
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.c;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.d;
                String str3 = (String) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.e;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.g.b(iOnDoneCallback, str3, aVar);
                    return;
                }
                androidx.car.app.utils.g.f(iOnDoneCallback, str3, new IllegalStateException("Lifecycle is not at least created when dispatching " + aVar));
                return;
            case 2:
                final n6 n6Var = (n6) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                g3 g3Var = (g3) this.d;
                final View view = (View) this.e;
                gq0 gq0Var = n6Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    g3Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = n6Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(n6Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z12 = savedStarGift.pinned_to_top;
                final boolean z13 = !z12;
                if (n6Var.e.q(savedStarGift, z13, false)) {
                    new s6(n6Var.getContext(), gq0Var.c, savedStarGift, n6Var.c, new p10() { // from class: bi.d6
                        @Override // org.telegram.messenger.p10
                        public final Object run() {
                            ((g3) view).d(z13, true);
                            n6 n6Var2 = n6.this;
                            n6Var2.f.v0(0);
                            return lc.b0(n6Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z12) {
                    f3.n(null, 2131749863, lc.b0(gq0Var.a), R.raw.ic_unpin, 36);
                } else {
                    lc.b0(gq0Var.a).I(R.raw.ic_pin, gd.N0(2131750059, null), gd.N0(2131750060, null)).j();
                }
                ((g3) view).d(z13, true);
                n6Var.f.v0(0);
                return;
            case 3:
                k8 k8Var = (k8) this.b;
                a70 a70Var = (a70) this.c;
                op opVar = (op) this.d;
                org.telegram.ui.ActionBar.y0[] y0VarArr = (org.telegram.ui.ActionBar.y0[]) this.e;
                k8Var.getClass();
                a70Var.q0 = true;
                y7 y7Var = k8Var.d;
                opVar.a(y7Var.k(), true);
                org.telegram.ui.ActionBar.y0 y0Var = y0VarArr[1];
                if (y0Var != null) {
                    y0Var.setChecked(y7Var.r);
                }
                org.telegram.ui.ActionBar.y0 y0Var2 = y0VarArr[2];
                if (y0Var2 != null) {
                    y0Var2.setChecked(y7Var.s);
                }
                org.telegram.ui.ActionBar.y0 y0Var3 = y0VarArr[3];
                if (y0Var3 != null) {
                    y0Var3.setChecked(y7Var.t);
                    return;
                }
                return;
            case 4:
                o3 o3Var = (o3) this.c;
                String str4 = (String) this.b;
                Map map = (Map) this.d;
                List list = (List) this.e;
                ca.h hVar = (ca.h) o3Var.a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o3Var.g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hVar.i(str4, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hVar.h(str4, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File b10 = hVar.a.b(str4, "rollouts-state");
                if (list.isEmpty()) {
                    ca.h.g(b10, "Rollout state is empty for session: " + str4);
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
            case 5:
                e51 e51Var = (e51) this.b;
                ci.b0 b0Var = (ci.b0) this.c;
                y10 y10Var = (y10) this.d;
                x10 x10Var = (x10) this.e;
                if (ci.b0.d(e51Var.getParentActivity())) {
                    b0Var.e();
                    qm0 qm0Var = new qm0(10, false, false, null);
                    qm0Var.H = 1;
                    qm0Var.I = false;
                    qm0Var.y = false;
                    qm0Var.W = new android.support.v4.media.session.a0(y10Var, e51Var, x10Var, false, 19);
                    e51Var.presentFragment(qm0Var);
                    return;
                }
                return;
            case 6:
                String str5 = (String) this.b;
                y10 y10Var2 = (y10) this.c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                x10 x10Var2 = (x10) this.e;
                try {
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = ec.K(str5, null, c12.x, c12.y, true);
                    if (K != null) {
                        str = ci.b0.l(K, y10Var2);
                        try {
                            K.recycle();
                        } catch (Throwable th5) {
                            th = th5;
                            z10 = true;
                            a8.g(th, z10);
                            org.telegram.messenger.g0.g3(new ci.z(g2Var, str, x10Var2));
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
                org.telegram.messenger.g0.g3(new ci.z(g2Var, str, x10Var2));
                return;
            case 7:
                di.s sVar = (di.s) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str6 = (String) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                ca.r rVar = sVar.n;
                di.t tVar = sVar.r;
                if (tVar.P) {
                    return;
                }
                sVar.e = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    i7 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
                    mp.u1(i7).f4(starsStatus.users, false);
                    i10 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
                    mp.u1(i10).Z3(starsStatus.chats, false);
                    boolean z14 = ((starsStatus.flags & 1) == 0 || starsStatus.next_offset == null) ? false : true;
                    if (z14 && TextUtils.equals(str6, starsStatus.next_offset)) {
                        sVar.h = true;
                    } else {
                        sVar.b.addAll(starsStatus.history);
                        sVar.d = starsStatus.next_offset;
                        sVar.f = !z14;
                    }
                } else {
                    sVar.h = true;
                    if (tL_error != null) {
                        lc.e0(tL_error);
                    }
                }
                sVar.c.g3.O(false);
                sVar.removeCallbacks(rVar);
                sVar.post(rVar);
                return;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                vf.b bVar = (vf.b) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                if (g2Var2 != null && tL_error2 != null) {
                    lc.b0(g2Var2).g0(tL_error2, false);
                }
                if ((g2Var2 instanceof bn) && tL_error2 == null) {
                    ((bn) g2Var2).Fc();
                }
                bVar.b();
                t1Var.dismiss();
                return;
            case 9:
                f6 f6Var = (f6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.d;
                nc[] ncVarArr = (nc[]) this.e;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                TL_stars.StarGift D1 = f6Var.D1();
                u9.c(f6Var.a).j(D1.gift_id, new di.n2(f6Var, D1, starGiftAttribute, ncVarArr, zArr, 0));
                return;
            case 10:
                f6 f6Var2 = (f6) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                String str7 = (String) this.b;
                if (tLObject2 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject2;
                    if ((tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) && !f6Var2.J && f6Var2.b3 == nftitem && TextUtils.equals(f6Var2.E2, str7)) {
                        mp.u1(f6Var2.a).f4(tL_payments_uniqueStarGift.users, false);
                        mp.u1(f6Var2.a).Z3(tL_payments_uniqueStarGift.chats, false);
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
                        nftitem.gift = tL_starGiftUnique;
                        f6Var2.u2(str7, tL_starGiftUnique, f6Var2.C2);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                f6 f6Var3 = (f6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                aa.r rVar2 = (aa.r) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                if (!(tLObject3 instanceof TLRPC.TL_messages_chatFull)) {
                    gc Z = f6Var3.k().Z(tL_error3);
                    Z.t = true;
                    Z.j();
                    return;
                }
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                mp.u1(f6Var3.a).f4(tL_messages_chatFull.users, false);
                mp.u1(f6Var3.a).Z3(tL_messages_chatFull.chats, false);
                mp.u1(f6Var3.a).Y3(tL_messages_chatFull.full_chat);
                if (tL_messages_chatFull.full_chat.stargifts_available) {
                    rVar2.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var3.getContext(), f6Var3.J0);
                alertDialog$Builder.a.S = gd.N0(2131750245, null);
                alertDialog$Builder.a.U = gd.N0(2131750246, null);
                f3.m(null, 2131747637, alertDialog$Builder, null);
                return;
            case 12:
                f6 f6Var4 = (f6) this.b;
                fj fjVar = (fj) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                f6Var4.k3 = true;
                f6Var4.v2(fjVar, null);
                f6Var4.H2(0, true, null);
                wz wzVar = f6Var4.W1;
                if (wzVar != null) {
                    wzVar.c(true);
                }
                y8.y(f6Var4.a, false).N();
                p8 G = y8.y(f6Var4.a, false).G(j10.i(f6Var4.a).e(), false);
                if (G != null) {
                    G.l(arrayList2, starGift);
                    return;
                }
                return;
            case 13:
                f6 f6Var5 = (f6) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error4 != null || !(tLObject4 instanceof TLRPC.Updates)) {
                    f6Var5.k().g0(tL_error4, false);
                    return;
                }
                f6Var5.n2 = true;
                f6Var5.r3 = null;
                f6Var5.o1(inputSavedStarGift, (TLRPC.Updates) tLObject4, new di.k1(f6Var5, 14));
                Utilities.d.c(new di.f2(4, f6Var5, tLObject4));
                return;
            case 14:
                b5 b5Var = (b5) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                o6 o6Var = b5Var.I;
                b5Var.i0 = false;
                if (starGift2 != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                rh0 rh0Var = b5Var.m0;
                if (rh0Var != null) {
                    rh0Var.d();
                    org.telegram.messenger.g0.h3(new n(i11), 750L);
                }
                b5Var.R.animate().alpha(0.0f).start();
                b5Var.T.animate().alpha(1.0f).start();
                b5Var.H.animate().alpha(1.0f).start();
                b5Var.S.animate().alpha(0.0f).start();
                b5Var.Q.animate().alpha(1.0f).start();
                b5Var.N.setText(org.telegram.messenger.g0.W2(gd.G(arrayList3.size(), "GiftCraftFailedText", new Object[0])));
                o6Var.setText(gd.N0(2131749778, null));
                o6Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
                b5Var.J.setAlpha(0.0f);
                if (b5Var.P != null) {
                    int i13 = 0;
                    while (true) {
                        g3[] g3VarArr = b5Var.P;
                        if (i13 < g3VarArr.length) {
                            org.telegram.messenger.g0.E2(g3VarArr[i13]);
                            i13++;
                        } else {
                            b5Var.P = null;
                        }
                    }
                }
                b5Var.P = new g3[arrayList3.size()];
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i14);
                    g3 g3Var2 = new g3(b5Var.a0, b5Var.getContext(), b5Var.a);
                    g3Var2.h(starGift3, false, false, false, false, true);
                    g3Var2.y.setVisibility(8);
                    g3Var2.setRibbonColor(-3065286);
                    q9 q9Var = g3Var2.E;
                    FrameLayout.LayoutParams e13 = ma.e(42, 42, 17);
                    g3Var2.F = e13;
                    q9Var.setLayoutParams(e13);
                    int i15 = i14 + 1;
                    boolean z15 = i15 >= arrayList3.size();
                    LinearLayout linearLayout = b5Var.O;
                    b5Var.P[i14] = g3Var2;
                    linearLayout.addView(g3Var2, ma.q(74, 74, 0.0f, 51, 0, 0, z15 ? 0 : 6, 0));
                    i14 = i15;
                }
                return;
            case 15:
                r3 r3Var = (r3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                x10 x10Var3 = (x10) this.e;
                z3 z3Var = r3Var.x;
                if (tLObject5 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject5;
                    mp.u1(z3Var.m2).f4(tL_stories_stories.users, false);
                    mp.u1(z3Var.m2).Z3(tL_stories_stories.chats, false);
                    for (int i16 = 0; i16 < tL_stories_stories.stories.size(); i16++) {
                        if (tL_stories_stories.stories.get(i16).id == storyItem2.id) {
                            x10Var3.a(tL_stories_stories.stories.get(i16).media.document);
                            return;
                        }
                    }
                }
                x10Var3.a(null);
                return;
            case 16:
                r3 r3Var2 = (r3) this.b;
                Activity activity = (Activity) this.c;
                f9 f9Var = (f9) this.d;
                w3 w3Var = (w3) this.e;
                sa D = sa.D(activity, r3Var2.x.m2);
                y3 y3Var = r3Var2.x.w2;
                long j3 = (y3Var == null || (e9Var = (e9) y3Var.c) == null) ? 0L : e9Var.currentPosition;
                hi.b1 b1Var = mp.u1(r3Var2.x.m2).R1().w;
                TL_stories.StoryItem storyItem3 = r3Var2.x.y1.a;
                long j10 = storyItem3.dialogId;
                ArrayList arrayList4 = b1Var.b;
                int size = arrayList4.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList4.get(i17);
                    i17++;
                    c7 c7Var2 = (c7) obj;
                    if (c7Var2.g && storyItem3.id == c7Var2.f && j10 == c7Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                        if ((document == null || document.id == c7Var2.H) && ((photo = messageMedia.photo) == null || photo.id == c7Var2.I)) {
                            c7Var2.h = true;
                            c7Var = c7Var2;
                            if (c7Var != null || c7Var.u || (file = c7Var.L) == null || !file.exists()) {
                                c7Var = c7.n(r3Var2.x.y1.h(), r3Var2.x.y1.a);
                                c7Var.e = r3Var2.x.l1;
                            }
                            c7 g10 = c7Var.g();
                            if (r3Var2.x.G0()) {
                                z3 z3Var2 = r3Var2.x;
                                g10.J0 = z3Var2.l1;
                                g10.L0 = mp.l5(z3Var2.y1.a.media);
                                h6 h6Var = f9Var.O0;
                                if (h6Var instanceof a6) {
                                    g10.K0 = ((a6) h6Var).E;
                                }
                            }
                            D.R(na.d(f9Var), g10, j3);
                            D.R = new l3(r3Var2, 3);
                            D.S = new n3(r3Var2, w3Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList4 = arrayList;
                }
                c7Var = null;
                if (c7Var != null) {
                }
                c7Var = c7.n(r3Var2.x.y1.h(), r3Var2.x.y1.a);
                c7Var.e = r3Var2.x.l1;
                c7 g102 = c7Var.g();
                if (r3Var2.x.G0()) {
                }
                D.R(na.d(f9Var), g102, j3);
                D.R = new l3(r3Var2, 3);
                D.S = new n3(r3Var2, w3Var, 1);
                return;
            case 17:
                d6 d6Var = (d6) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                x10 x10Var4 = (x10) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                d6Var.i = false;
                if (tLObject6 instanceof TL_stories.TL_storyAlbum) {
                    i6 a10 = i6.a((TL_stories.TL_storyAlbum) tLObject6);
                    d6Var.h.add(a10);
                    d6Var.f(true);
                    x10Var4.a(a10);
                    return;
                }
                if (tL_error5 == null || (T = LaunchActivity.T()) == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    lc.b0(T).g0(tL_error5, false);
                }
                ks f10 = ks.f(d6Var.a);
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(d6Var.b);
                objArr[1] = d6Var;
                f10.k(ks.l3, objArr);
                return;
            case 18:
                h6 h6Var2 = (h6) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                tr trVar = (tr) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                int i18 = h6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i19 = h6Var2.e;
                sb2.append(i19);
                sb2.append("{");
                long j11 = h6Var2.d;
                sb2.append(j11);
                sb2.append("} saveCache {");
                sb2.append(p6.a(arrayList5));
                p5.c.s("}", sb2);
                try {
                    sQLiteDatabase = trVar.b;
                    executeFast = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                } catch (Throwable th7) {
                    th = th7;
                    z11 = true;
                    sQLitePreparedStatement = null;
                }
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j11 + " AND album_id = " + i18).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                    int i20 = 0;
                    while (i20 < arrayList5.size()) {
                        try {
                            TL_stories.StoryItem storyItem4 = ((fj) arrayList5.get(i20)).l;
                            if (storyItem4 != null) {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                storyItem4.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindLong(i12, j11);
                                executeFast.bindInteger(2, storyItem4.id);
                                executeFast.bindByteBuffer(3, nativeByteBuffer);
                                executeFast.bindInteger(4, i19);
                                executeFast.bindInteger(5, h6Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                executeFast.bindInteger(6, arrayList6.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                                executeFast2.requery();
                                executeFast2.bindLong(i12, j11);
                                executeFast2.bindInteger(2, i18);
                                executeFast2.bindInteger(3, storyItem4.id);
                                executeFast2.bindInteger(4, i20);
                                executeFast2.step();
                            }
                            i20++;
                            i12 = 1;
                        } catch (Throwable th8) {
                            th = th8;
                            sQLitePreparedStatement2 = executeFast2;
                            sQLitePreparedStatement = executeFast;
                            z11 = true;
                            try {
                                trVar.o(th, z11);
                                org.telegram.messenger.g0.g3(new e6(h6Var2, 2));
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
                } catch (Throwable th9) {
                    th = th9;
                    sQLitePreparedStatement = executeFast;
                    z11 = true;
                    sQLitePreparedStatement2 = null;
                    trVar.o(th, z11);
                    org.telegram.messenger.g0.g3(new e6(h6Var2, 2));
                    return;
                }
                org.telegram.messenger.g0.g3(new e6(h6Var2, 2));
                return;
            case 19:
                v5 v5Var = (v5) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                c7 c7Var3 = (c7) this.e;
                boolean[] zArr2 = (boolean[]) this.c;
                ca caVar = v5Var.H;
                Bitmap bitmap = v5Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    v5Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                v5Var.a = bitmap2;
                if (c7Var3 != null && !c7Var3.c && c7Var3.K && bitmap2 != null) {
                    c7Var3.k0 = bitmap2.getWidth();
                    c7Var3.l0 = v5Var.a.getHeight();
                    c7Var3.A();
                }
                if (zArr2[0] && c7Var3 != null && caVar != null && v5Var.a != null) {
                    caVar.e();
                    caVar.f(c7Var3.b(0.2f, v5Var.a), false);
                    r8 r8Var = v5Var.w;
                    if (r8Var != null) {
                        r8Var.run();
                    }
                }
                v5Var.r();
                v5Var.invalidate();
                return;
            case 20:
                a();
                return;
            case 21:
                kg.z zVar = (kg.z) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList7 = zVar.b;
                if (tLObject7 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject7;
                    int indexOf = arrayList7.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList7.set(indexOf, tL_businessChatLink2);
                        ks.f(zVar.a).k(ks.J1, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        zVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                kg.v1 v1Var = (kg.v1) this.b;
                tr trVar2 = (tr) this.c;
                kg.u1 u1Var = (kg.u1) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = trVar2.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(u1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Throwable th10) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th10;
                    }
                } catch (Exception e14) {
                    a8.g(e14, true);
                    break;
                }
                sQLiteCursor.dispose();
                org.telegram.messenger.g0.g3(new r(v1Var, arrayList8, u1Var, tL_messages_sendQuickReplyMessages, 23));
                return;
            case 23:
                kg.v1 v1Var2 = (kg.v1) this.b;
                ArrayList<Integer> arrayList9 = (ArrayList) this.c;
                kg.u1 u1Var2 = (kg.u1) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i21 = v1Var2.a;
                if (arrayList9.isEmpty() || arrayList9.size() < u1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = u1Var2.a;
                    ConnectionsManager.getInstance(i21).sendRequest(tL_messages_getQuickReplyMessages, new bi.q1(v1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, 12));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList9;
                    for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i21).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 24:
                TLObject tLObject8 = (TLObject) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                String str8 = (String) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                lc b02 = T2 != null ? lc.b0(T2) : lc.Y();
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    b02.V(arrayList10, arrayList10.size() == 1 ? org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753056, o10.q((TLRPC.User) arrayList10.get(0)), str8)) : org.telegram.messenger.g0.W2(gd.G(arrayList10.size(), "BotInviteDoneMany", str8)), null, null).j();
                    return;
                }
                if (tL_error6 != null && "BOT_INVITE_ALREADY_STARTED".equals(tL_error6.text)) {
                    b02.t(arrayList10.size() == 1 ? org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753052, o10.q((TLRPC.User) arrayList10.get(0)), str8)) : org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753051, str8)), null).j();
                    return;
                } else if (tL_error6 == null || (str2 = tL_error6.text) == null || str2.startsWith("BOT_INVITE_")) {
                    b02.t(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753050, str8)), null).j();
                    return;
                } else {
                    b02.Z(tL_error6).j();
                    return;
                }
            case 25:
                hi.e eVar = (hi.e) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.d;
                v3 v3Var = (v3) this.e;
                eVar.setLoading(false);
                if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                    w2Var.dismiss();
                    v3Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 26:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) this.c;
                org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                new lc(w2Var2.F, h6Var3).I(R.raw.copy, gd.N0(2131754330, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), o10.q(user)))).j();
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                oi.o oVar2 = (oi.o) this.b;
                oi.a aVar2 = (oi.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                a70 a70Var2 = (a70) this.e;
                oVar2.r.Y4(aVar2, pageBlock);
                a70Var2.v();
                return;
        }
    }

    public /* synthetic */ r(v5 v5Var, Bitmap[] bitmapArr, c7 c7Var, boolean[] zArr) {
        this.a = 19;
        this.b = v5Var;
        this.d = bitmapArr;
        this.e = c7Var;
        this.c = zArr;
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
