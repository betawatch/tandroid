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
import bi.a8;
import bi.i3;
import bi.m8;
import bi.p6;
import bi.u6;
import bi.x3;
import c8.na;
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
import fi.l3;
import fi.n3;
import fi.r3;
import fi.w3;
import fi.y3;
import fi.z3;
import hi.ib;
import hi.j7;
import hi.m9;
import hi.nb;
import hi.x7;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.o3;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.ec;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.tr;
import org.telegram.messenger.u9;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.om0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    private final void a() {
        int i7;
        long j3;
        int i10;
        long j10;
        long j11;
        ArrayList arrayList;
        x7 x7Var = (x7) this.d;
        String str = (String) this.c;
        int[][] iArr = (int[][]) this.e;
        w10 w10Var = (w10) this.b;
        x7Var.getClass();
        d20 d20Var = new d20();
        char c10 = 1;
        d20Var.J = true;
        d20Var.a0 = x7Var.c1;
        d20Var.h = x7Var.k0;
        d20Var.i = x7Var.l0;
        d20Var.k = x7Var.i0;
        d20Var.l = x7Var.j0;
        File file = x7Var.P0;
        d20Var.B = file == null ? null : file.getPath();
        File file2 = x7Var.W0;
        d20Var.D = file2 == null ? null : file2.getPath();
        File file3 = x7Var.X0;
        d20Var.E = file3 == null ? null : file3.getPath();
        File file4 = x7Var.Y0;
        d20Var.F = file4 == null ? null : file4.getPath();
        int v = MediaController.v(d20Var.k, d20Var.l, d20Var.m, true);
        if (!x7Var.K || str == null || x7Var.v()) {
            File file5 = x7Var.Z0;
            if (file5 != null) {
                d20Var.o = file5.getAbsolutePath();
            } else {
                d20Var.o = str;
            }
            d20Var.I = true;
            d20Var.L = x7Var.S;
            if (x7Var.v()) {
                int i11 = 0;
                boolean z10 = false;
                while (i11 < x7Var.T.size()) {
                    x7 x7Var2 = (x7) x7Var.T.get(i11);
                    if (x7Var2.K) {
                        x7Var2.k0 = Math.max(x7Var2.k0, iArr[i11][c10]);
                        x7Var2.l0 = Math.max(x7Var2.l0, iArr[i11][2]);
                        i10 = v;
                        x7Var2.h0 = Math.max(x7Var2.h0, iArr[i11][4]);
                        z10 = true;
                    } else {
                        i10 = v;
                    }
                    i11++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = c20.a(x7Var);
                d20Var.M = a10;
                if (z10) {
                    int size = a10.size();
                    long j12 = 0;
                    c20 c20Var = null;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = a10.get(i12);
                        i12++;
                        c20 c20Var2 = (c20) obj;
                        if (c20Var2.b) {
                            long j13 = c20Var2.o;
                            if (j13 > j12) {
                                c20Var = c20Var2;
                                j12 = j13;
                            }
                        }
                    }
                    if (c20Var != null) {
                        float f10 = c20Var.o;
                        float f11 = c20Var.k;
                        float f12 = c20Var.j;
                        long j14 = (long) ((f11 - f12) * f10);
                        x7Var.h0 = j14;
                        d20Var.v = j14;
                        d20Var.r = j14;
                        j3 = -(c20Var.f + ((long) (f12 * f10)));
                        c20Var.f = j3;
                        ArrayList arrayList2 = d20Var.M;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            c20 c20Var3 = (c20) obj2;
                            if (c20Var3.b && c20Var3 != c20Var) {
                                c20Var3.f += j3;
                            }
                        }
                        d20Var.a = -1L;
                        d20Var.b = -1L;
                        d20Var.t = true;
                        d20Var.j = -1;
                        d20Var.u = 1.0f;
                        d20Var.m = -1;
                        d20Var.n = 30;
                        d20Var.q = (long) (((x7Var.h0 / 1000.0f) * i7) / 8.0f);
                        d20Var.A = null;
                    }
                } else {
                    long j15 = x7Var.S0;
                    x7Var.h0 = j15;
                    d20Var.v = j15;
                    d20Var.r = j15;
                }
            } else {
                i7 = v;
                if (x7Var.o0 != null) {
                    long j16 = (long) ((x7Var.t0 - x7Var.s0) * x7Var.q0);
                    x7Var.h0 = j16;
                    d20Var.v = j16;
                    d20Var.r = j16;
                } else if (x7Var.y != null) {
                    long j17 = (long) ((x7Var.F - x7Var.E) * x7Var.C);
                    x7Var.h0 = j17;
                    d20Var.v = j17;
                    d20Var.r = j17;
                } else {
                    long j18 = x7Var.S0;
                    x7Var.h0 = j18;
                    d20Var.v = j18;
                    d20Var.r = j18;
                }
            }
            j3 = 0;
            d20Var.a = -1L;
            d20Var.b = -1L;
            d20Var.t = true;
            d20Var.j = -1;
            d20Var.u = 1.0f;
            d20Var.m = -1;
            d20Var.n = 30;
            d20Var.q = (long) (((x7Var.h0 / 1000.0f) * i7) / 8.0f);
            d20Var.A = null;
        } else {
            d20Var.o = str;
            d20Var.I = false;
            d20Var.n = Math.min(59, iArr[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr[0][3];
            }
            d20Var.j = E;
            if (E >= 1000000 || (arrayList = x7Var.T0) == null || arrayList.isEmpty()) {
                int i14 = d20Var.j;
                if (i14 < 500000) {
                    d20Var.m = 2500000;
                    d20Var.j = -1;
                } else {
                    d20Var.m = Utilities.j(i14, 3000000, 500000);
                }
            } else {
                d20Var.m = 2000000;
                d20Var.j = -1;
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(d20Var.j);
            sb2.append(" => ");
            i5.c.t(d20Var.m, sb2);
            int i15 = iArr[0][4];
            long j19 = i15;
            x7Var.h0 = j19;
            d20Var.v = j19 * 1000;
            float f13 = j19;
            long j20 = ((long) (x7Var.Z * f13)) * 1000;
            d20Var.a = j20;
            long j21 = ((long) (x7Var.a0 * f13)) * 1000;
            d20Var.b = j21;
            d20Var.r = j21 - j20;
            d20Var.u = x7Var.P;
            d20Var.t = x7Var.Y;
            d20Var.q = (long) a8.p0.f(i15 / 1000.0f, v, 8.0f, r2[5]);
            d20Var.q = Math.max(x7Var.L.length(), d20Var.q);
            d20Var.A = x7Var.a1;
            File file6 = x7Var.Q0;
            d20Var.C = file6 == null ? null : file6.getPath();
            j3 = 0;
        }
        d20Var.S = x7Var.a;
        d20Var.U = x7Var.z0;
        d20Var.T = x7Var.y0;
        d20Var.c = -1L;
        we weVar = x7Var.m0;
        if (weVar != null) {
            d20Var.H = weVar.clone();
        } else {
            d20Var.H = new we();
        }
        d20Var.H.B = new Matrix();
        d20Var.H.B.set(x7Var.n0);
        d20Var.G = x7Var.T0;
        d20Var.Q = Integer.valueOf(x7Var.A0);
        d20Var.R = Integer.valueOf(x7Var.B0);
        d20Var.V = true;
        d20Var.K = x7Var.d1;
        d20Var.b0.clear();
        if (x7Var.v() && !x7Var.Y) {
            ArrayList arrayList3 = d20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                c20 c20Var4 = (c20) obj3;
                if (c20Var4.b && c20Var4.e > 0.0f && !c20Var4.c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(c20Var4.d);
                    mixedSoundInfo.volume = c20Var4.e;
                    float f14 = c20Var4.j;
                    float f15 = c20Var4.o;
                    mixedSoundInfo.audioOffset = ((long) (f14 * f15)) * 1000;
                    mixedSoundInfo.startTime = c20Var4.f * 1000;
                    mixedSoundInfo.duration = ((long) ((c20Var4.k - f14) * f15)) * 1000;
                    d20Var.b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = x7Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = x7Var.u0;
            float f16 = x7Var.s0;
            float f17 = x7Var.q0;
            long j22 = ((long) (f16 * f17)) * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (x7Var.K) {
                mixedSoundInfo2.startTime = ((long) (x7Var.r0 - (x7Var.Z * x7Var.h0))) * 1000;
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
            mixedSoundInfo2.duration = ((long) ((x7Var.t0 - f16) * f17)) * 1000;
            d20Var.b0.add(mixedSoundInfo2);
        }
        String str2 = x7Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = x7Var.G;
            float f18 = x7Var.E;
            float f19 = x7Var.C;
            long j24 = ((long) (f18 * f19)) * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (x7Var.K) {
                mixedSoundInfo3.startTime = ((long) (x7Var.D - (x7Var.Z * x7Var.h0))) * 1000;
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
            mixedSoundInfo3.duration = ((long) ((x7Var.F - f18) * f19)) * 1000;
            d20Var.b0.add(mixedSoundInfo3);
        }
        w10Var.a(d20Var);
    }

    private final void b() {
        hi.e eVar = (hi.e) this.d;
        TLObject tLObject = (TLObject) this.c;
        w2 w2Var = (w2) this.e;
        x3 x3Var = (x3) this.b;
        eVar.setLoading(false);
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            w2Var.dismiss();
            x3Var.a(Boolean.FALSE);
        }
    }

    private final void c() {
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.d;
        w2 w2Var = (w2) this.c;
        i6 i6Var = (i6) this.e;
        TLRPC.User user = (TLRPC.User) this.b;
        org.telegram.messenger.g0.g(connectedbotstarref.url);
        new kc(w2Var.F, i6Var).I(R.raw.copy, gd.N0(2131754330, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), n10.q(user)))).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d2, code lost:
    
        if (r7 == null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0391 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0396 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04cb  */
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
        x7 x7Var;
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
        String str2;
        int i11 = 10;
        SQLiteCursor sQLiteCursor = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                float[] fArr = (float[]) this.d;
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.c;
                j7 j7Var = (j7) this.e;
                boolean[] zArr = (boolean[]) this.b;
                try {
                    DictationAsr.e0(fArr, a0Var, j7Var, zArr);
                    return;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new a1.e(9, zArr, j7Var));
                    return;
                }
            case 1:
                DictationAsr.a((String) this.d, (boolean[]) this.b, (g21) this.e, (android.support.v4.media.session.a0) this.c);
                return;
            case 2:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.d;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str3 = (String) this.e;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.b;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.g.b(iOnDoneCallback, str3, aVar);
                    return;
                }
                androidx.car.app.utils.g.f(iOnDoneCallback, str3, new IllegalStateException("Lifecycle is not at least created when dispatching " + aVar));
                return;
            case 3:
                final p6 p6Var = (p6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                i3 i3Var = (i3) this.e;
                final View view = (View) this.b;
                fq0 fq0Var = p6Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    i3Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = p6Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(p6Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z12 = savedStarGift.pinned_to_top;
                final boolean z13 = !z12;
                if (p6Var.e.q(savedStarGift, z13, false)) {
                    new u6(p6Var.getContext(), fq0Var.c, savedStarGift, p6Var.c, new o10() { // from class: bi.f6
                        @Override // org.telegram.messenger.o10
                        public final Object run() {
                            ((i3) view).d(z13, true);
                            p6 p6Var2 = p6.this;
                            p6Var2.f.v0(0);
                            return kc.b0(p6Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z12) {
                    f3.n(null, 2131749863, kc.b0(fq0Var.a), R.raw.ic_unpin, 36);
                } else {
                    kc.b0(fq0Var.a).I(R.raw.ic_pin, gd.N0(2131750059, null), gd.N0(2131750060, null)).j();
                }
                ((i3) view).d(z13, true);
                p6Var.f.v0(0);
                return;
            case 4:
                m8 m8Var = (m8) this.d;
                x60 x60Var = (x60) this.c;
                lp lpVar = (lp) this.e;
                org.telegram.ui.ActionBar.y0[] y0VarArr = (org.telegram.ui.ActionBar.y0[]) this.b;
                m8Var.getClass();
                x60Var.q0 = true;
                a8 a8Var = m8Var.d;
                lpVar.a(a8Var.k(), true);
                org.telegram.ui.ActionBar.y0 y0Var = y0VarArr[1];
                if (y0Var != null) {
                    y0Var.setChecked(a8Var.r);
                }
                org.telegram.ui.ActionBar.y0 y0Var2 = y0VarArr[2];
                if (y0Var2 != null) {
                    y0Var2.setChecked(a8Var.s);
                }
                org.telegram.ui.ActionBar.y0 y0Var3 = y0VarArr[3];
                if (y0Var3 != null) {
                    y0Var3.setChecked(a8Var.t);
                    return;
                }
                return;
            case 5:
                o3 o3Var = (o3) this.d;
                String str4 = (String) this.c;
                Map map = (Map) this.e;
                List list = (List) this.b;
                ca.h hVar = (ca.h) o3Var.a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o3Var.h;
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
                        } catch (Throwable th3) {
                            th = th3;
                            aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedWriter = bufferedWriter2;
                        aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    bufferedWriter = null;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedWriter = null;
                }
            case 6:
                d51 d51Var = (d51) this.d;
                ci.b0 b0Var = (ci.b0) this.c;
                x10 x10Var = (x10) this.e;
                w10 w10Var = (w10) this.b;
                if (ci.b0.d(d51Var.getParentActivity())) {
                    b0Var.e();
                    om0 om0Var = new om0(10, false, false, null);
                    om0Var.H = 1;
                    om0Var.I = false;
                    om0Var.y = false;
                    om0Var.W = new android.support.v4.media.session.a0(x10Var, d51Var, w10Var, false, 19);
                    d51Var.presentFragment(om0Var);
                    return;
                }
                return;
            case 7:
                String str5 = (String) this.d;
                x10 x10Var2 = (x10) this.c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.e;
                w10 w10Var2 = (w10) this.b;
                try {
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = ec.K(str5, null, c12.x, c12.y, true);
                    if (K != null) {
                        str = ci.b0.l(K, x10Var2);
                        try {
                            K.recycle();
                        } catch (Throwable th6) {
                            th = th6;
                            z10 = true;
                            org.telegram.messenger.a8.g(th, z10);
                            org.telegram.messenger.g0.g3(new ci.z(g2Var, str, w10Var2));
                            return;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    z10 = true;
                    str = null;
                }
                org.telegram.messenger.g0.g3(new ci.z(g2Var, str, w10Var2));
                return;
            case 8:
                di.s sVar = (di.s) this.d;
                TLObject tLObject = (TLObject) this.c;
                String str6 = (String) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
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
                        kc.e0(tL_error);
                    }
                }
                sVar.c.g3.O(false);
                sVar.removeCallbacks(rVar);
                sVar.post(rVar);
                return;
            case 9:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                vf.b bVar = (vf.b) this.e;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                if (g2Var2 != null && tL_error2 != null) {
                    kc.b0(g2Var2).g0(tL_error2, false);
                }
                if ((g2Var2 instanceof bn) && tL_error2 == null) {
                    ((bn) g2Var2).Fc();
                }
                bVar.b();
                t1Var.dismiss();
                return;
            case 10:
                f6 f6Var = (f6) this.d;
                boolean[] zArr2 = (boolean[]) this.b;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.c;
                mc[] mcVarArr = (mc[]) this.e;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_stars.StarGift D1 = f6Var.D1();
                u9.c(f6Var.a).j(D1.gift_id, new di.n2(f6Var, D1, starGiftAttribute, mcVarArr, zArr2, 0));
                return;
            case 11:
                f6 f6Var2 = (f6) this.d;
                TLObject tLObject2 = (TLObject) this.c;
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
            case 12:
                f6 f6Var3 = (f6) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                aa.r rVar2 = (aa.r) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                if (!(tLObject3 instanceof TLRPC.TL_messages_chatFull)) {
                    fc Z = f6Var3.k().Z(tL_error3);
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
            case 13:
                f6 f6Var4 = (f6) this.d;
                fj fjVar = (fj) this.c;
                ArrayList arrayList2 = (ArrayList) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                f6Var4.k3 = true;
                f6Var4.v2(fjVar, null);
                f6Var4.H2(0, true, null);
                tz tzVar = f6Var4.W1;
                if (tzVar != null) {
                    tzVar.c(true);
                }
                y8.y(f6Var4.a, false).N();
                p8 G = y8.y(f6Var4.a, false).G(i10.i(f6Var4.a).e(), false);
                if (G != null) {
                    G.l(arrayList2, starGift);
                    return;
                }
                return;
            case 14:
                f6 f6Var5 = (f6) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.b;
                if (tL_error4 != null || !(tLObject4 instanceof TLRPC.Updates)) {
                    f6Var5.k().g0(tL_error4, false);
                    return;
                }
                f6Var5.n2 = true;
                f6Var5.r3 = null;
                f6Var5.o1(inputSavedStarGift, (TLRPC.Updates) tLObject4, new di.k1(f6Var5, 14));
                Utilities.d.c(new di.f2(4, f6Var5, tLObject4));
                return;
            case 15:
                b5 b5Var = (b5) this.d;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                Runnable runnable = (Runnable) this.b;
                n6 n6Var = b5Var.I;
                b5Var.i0 = false;
                if (starGift2 != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                qh0 qh0Var = b5Var.m0;
                if (qh0Var != null) {
                    qh0Var.d();
                    org.telegram.messenger.g0.h3(new k(i11), 750L);
                }
                b5Var.R.animate().alpha(0.0f).start();
                b5Var.T.animate().alpha(1.0f).start();
                b5Var.H.animate().alpha(1.0f).start();
                b5Var.S.animate().alpha(0.0f).start();
                b5Var.Q.animate().alpha(1.0f).start();
                b5Var.N.setText(org.telegram.messenger.g0.W2(gd.G(arrayList3.size(), "GiftCraftFailedText", new Object[0])));
                n6Var.setText(gd.N0(2131749778, null));
                n6Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
                b5Var.J.setAlpha(0.0f);
                if (b5Var.P != null) {
                    int i13 = 0;
                    while (true) {
                        i3[] i3VarArr = b5Var.P;
                        if (i13 < i3VarArr.length) {
                            org.telegram.messenger.g0.E2(i3VarArr[i13]);
                            i13++;
                        } else {
                            b5Var.P = null;
                        }
                    }
                }
                b5Var.P = new i3[arrayList3.size()];
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i14);
                    i3 i3Var2 = new i3(b5Var.a0, b5Var.getContext(), b5Var.a);
                    i3Var2.h(starGift3, false, false, false, false, true);
                    i3Var2.y.setVisibility(8);
                    i3Var2.setRibbonColor(-3065286);
                    p9 p9Var = i3Var2.E;
                    FrameLayout.LayoutParams e13 = na.e(42, 42, 17);
                    i3Var2.F = e13;
                    p9Var.setLayoutParams(e13);
                    int i15 = i14 + 1;
                    boolean z15 = i15 >= arrayList3.size();
                    LinearLayout linearLayout = b5Var.O;
                    b5Var.P[i14] = i3Var2;
                    linearLayout.addView(i3Var2, na.q(74, 74, 0.0f, 51, 0, 0, z15 ? 0 : 6, 0));
                    i14 = i15;
                }
                return;
            case 16:
                r3 r3Var = (r3) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                w10 w10Var3 = (w10) this.b;
                z3 z3Var = r3Var.x;
                if (tLObject5 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject5;
                    mp.u1(z3Var.m2).f4(tL_stories_stories.users, false);
                    mp.u1(z3Var.m2).Z3(tL_stories_stories.chats, false);
                    for (int i16 = 0; i16 < tL_stories_stories.stories.size(); i16++) {
                        if (tL_stories_stories.stories.get(i16).id == storyItem2.id) {
                            w10Var3.a(tL_stories_stories.stories.get(i16).media.document);
                            return;
                        }
                    }
                }
                w10Var3.a(null);
                return;
            case 17:
                r3 r3Var2 = (r3) this.d;
                Activity activity = (Activity) this.c;
                f9 f9Var = (f9) this.e;
                w3 w3Var = (w3) this.b;
                nb D = nb.D(activity, r3Var2.x.m2);
                y3 y3Var = r3Var2.x.w2;
                long j3 = (y3Var == null || (e9Var = (e9) y3Var.c) == null) ? 0L : e9Var.currentPosition;
                hi.j1 j1Var = mp.u1(r3Var2.x.m2).R1().w;
                TL_stories.StoryItem storyItem3 = r3Var2.x.y1.a;
                long j10 = storyItem3.dialogId;
                ArrayList arrayList4 = j1Var.b;
                int size = arrayList4.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList4.get(i17);
                    i17++;
                    x7 x7Var2 = (x7) obj;
                    if (x7Var2.g && storyItem3.id == x7Var2.f && j10 == x7Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                        if ((document == null || document.id == x7Var2.H) && ((photo = messageMedia.photo) == null || photo.id == x7Var2.I)) {
                            x7Var2.h = true;
                            x7Var = x7Var2;
                            if (x7Var != null || x7Var.u || (file = x7Var.L) == null || !file.exists()) {
                                x7Var = x7.n(r3Var2.x.y1.h(), r3Var2.x.y1.a);
                                x7Var.e = r3Var2.x.l1;
                            }
                            x7 g10 = x7Var.g();
                            if (r3Var2.x.G0()) {
                                z3 z3Var2 = r3Var2.x;
                                g10.J0 = z3Var2.l1;
                                g10.L0 = mp.l5(z3Var2.y1.a.media);
                                h6 h6Var = f9Var.O0;
                                if (h6Var instanceof a6) {
                                    g10.K0 = ((a6) h6Var).E;
                                }
                            }
                            D.R(ib.d(f9Var), g10, j3);
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
                x7Var = null;
                if (x7Var != null) {
                }
                x7Var = x7.n(r3Var2.x.y1.h(), r3Var2.x.y1.a);
                x7Var.e = r3Var2.x.l1;
                x7 g102 = x7Var.g();
                if (r3Var2.x.G0()) {
                }
                D.R(ib.d(f9Var), g102, j3);
                D.R = new l3(r3Var2, 3);
                D.S = new n3(r3Var2, w3Var, 1);
                return;
            case 18:
                d6 d6Var = (d6) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                w10 w10Var4 = (w10) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                d6Var.i = false;
                if (tLObject6 instanceof TL_stories.TL_storyAlbum) {
                    fi.i6 a10 = fi.i6.a((TL_stories.TL_storyAlbum) tLObject6);
                    d6Var.h.add(a10);
                    d6Var.f(true);
                    w10Var4.a(a10);
                    return;
                }
                if (tL_error5 == null || (T = LaunchActivity.T()) == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    kc.b0(T).g0(tL_error5, false);
                }
                ks f10 = ks.f(d6Var.a);
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(d6Var.b);
                objArr[1] = d6Var;
                f10.k(ks.l3, objArr);
                return;
            case 19:
                h6 h6Var2 = (h6) this.d;
                ArrayList arrayList5 = (ArrayList) this.c;
                tr trVar = (tr) this.e;
                ArrayList arrayList6 = (ArrayList) this.b;
                int i18 = h6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i19 = h6Var2.e;
                sb2.append(i19);
                sb2.append("{");
                long j11 = h6Var2.d;
                sb2.append(j11);
                sb2.append("} saveCache {");
                sb2.append(fi.p6.a(arrayList5));
                p5.c.s("}", sb2);
                try {
                    SQLiteDatabase sQLiteDatabase = trVar.b;
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
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
                } catch (Throwable th10) {
                    th = th10;
                    z11 = true;
                    sQLitePreparedStatement = null;
                }
                org.telegram.messenger.g0.g3(new e6(h6Var2, 2));
                return;
            case 20:
                hi.f6 f6Var6 = (hi.f6) this.d;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                x7 x7Var3 = (x7) this.e;
                boolean[] zArr3 = (boolean[]) this.b;
                ba baVar = f6Var6.H;
                Bitmap bitmap = f6Var6.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    f6Var6.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                f6Var6.a = bitmap2;
                if (x7Var3 != null && !x7Var3.c && x7Var3.K && bitmap2 != null) {
                    x7Var3.k0 = bitmap2.getWidth();
                    x7Var3.l0 = f6Var6.a.getHeight();
                    x7Var3.A();
                }
                if (zArr3[0] && x7Var3 != null && baVar != null && f6Var6.a != null) {
                    baVar.e();
                    baVar.f(x7Var3.b(0.2f, f6Var6.a), false);
                    m9 m9Var = f6Var6.w;
                    if (m9Var != null) {
                        m9Var.run();
                    }
                }
                f6Var6.r();
                f6Var6.invalidate();
                return;
            case 21:
                a();
                return;
            case 22:
                kg.z zVar = (kg.z) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.e;
                Runnable runnable2 = (Runnable) this.b;
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
            case 23:
                kg.w1 w1Var = (kg.w1) this.d;
                tr trVar2 = (tr) this.c;
                kg.v1 v1Var = (kg.v1) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.b;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = trVar2.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(v1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.g3(new j(w1Var, arrayList8, v1Var, tL_messages_sendQuickReplyMessages, 24));
                    return;
                } catch (Throwable th11) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th11;
                }
            case 24:
                kg.w1 w1Var2 = (kg.w1) this.d;
                ArrayList<Integer> arrayList9 = (ArrayList) this.c;
                kg.v1 v1Var2 = (kg.v1) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.b;
                int i21 = w1Var2.a;
                if (arrayList9.isEmpty() || arrayList9.size() < v1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = v1Var2.a;
                    ConnectionsManager.getInstance(i21).sendRequest(tL_messages_getQuickReplyMessages, new bi.q1(w1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, 12));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList9;
                    for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i21).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 25:
                TLObject tLObject8 = (TLObject) this.d;
                ArrayList arrayList10 = (ArrayList) this.c;
                String str8 = (String) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                kc b02 = T2 != null ? kc.b0(T2) : kc.Y();
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    b02.V(arrayList10, arrayList10.size() == 1 ? org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753056, n10.q((TLRPC.User) arrayList10.get(0)), str8)) : org.telegram.messenger.g0.W2(gd.G(arrayList10.size(), "BotInviteDoneMany", str8)), null, null).j();
                    return;
                }
                if (tL_error6 != null && "BOT_INVITE_ALREADY_STARTED".equals(tL_error6.text)) {
                    b02.t(arrayList10.size() == 1 ? org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753052, n10.q((TLRPC.User) arrayList10.get(0)), str8)) : org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753051, str8)), null).j();
                    return;
                } else if (tL_error6 == null || (str2 = tL_error6.text) == null || str2.startsWith("BOT_INVITE_")) {
                    b02.t(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753050, str8)), null).j();
                    return;
                } else {
                    b02.Z(tL_error6).j();
                    return;
                }
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                ki.i3.A0((ki.i3) this.d, (Context) this.c, (TLRPC.User) this.e, (TL_payments.connectedBotStarRef) this.b);
                return;
            default:
                TLObject tLObject9 = (TLObject) this.d;
                boolean[] zArr4 = (boolean[]) this.b;
                org.telegram.ui.web.o oVar2 = (org.telegram.ui.web.o) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr4[0]) {
                        return;
                    }
                    zArr4[0] = true;
                    oVar2.a(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr4[0]) {
                    return;
                }
                zArr4[0] = true;
                oVar2.a(Boolean.TRUE, "allowed");
                return;
        }
    }

    public /* synthetic */ j(Object obj, boolean[] zArr, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = zArr;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ j(String str, boolean[] zArr, g21 g21Var, android.support.v4.media.session.a0 a0Var) {
        this.a = 1;
        this.d = str;
        this.b = zArr;
        this.e = g21Var;
        this.c = a0Var;
    }
}
