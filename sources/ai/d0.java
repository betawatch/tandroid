package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import bi.d6;
import bi.ea;
import bi.k7;
import bi.v9;
import bi.z1;
import bi.z2;
import c8.ha;
import di.f4;
import di.h4;
import di.i4;
import di.m6;
import di.n6;
import di.o9;
import di.p9;
import di.q6;
import di.r6;
import di.s3;
import di.v3;
import di.y6;
import di.z3;
import fi.e7;
import fi.qa;
import fi.u8;
import fi.va;
import fi.y5;
import hi.d4;
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
import kg.s1;
import kg.t1;
import m.q3;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.d20;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.w7;
import org.telegram.messenger.w9;
import org.telegram.messenger.ye;
import org.telegram.messenger.yr;
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
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.mm0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(m6 m6Var, TLObject tLObject, c20 c20Var, TLRPC.TL_error tL_error) {
        this.a = 13;
        this.d = m6Var;
        this.e = tLObject;
        this.c = c20Var;
        this.b = tL_error;
    }

    private final void a() {
        int i7;
        long j3;
        int i10;
        long j10;
        long j11;
        ArrayList arrayList;
        e7 e7Var = (e7) this.d;
        String str = (String) this.e;
        int[][] iArr = (int[][]) this.b;
        c20 c20Var = (c20) this.c;
        e7Var.getClass();
        j20 j20Var = new j20();
        char c10 = 1;
        j20Var.J = true;
        j20Var.a0 = e7Var.c1;
        j20Var.h = e7Var.k0;
        j20Var.i = e7Var.l0;
        j20Var.k = e7Var.i0;
        j20Var.l = e7Var.j0;
        File file = e7Var.P0;
        j20Var.B = file == null ? null : file.getPath();
        File file2 = e7Var.W0;
        j20Var.D = file2 == null ? null : file2.getPath();
        File file3 = e7Var.X0;
        j20Var.E = file3 == null ? null : file3.getPath();
        File file4 = e7Var.Y0;
        j20Var.F = file4 == null ? null : file4.getPath();
        int v = MediaController.v(j20Var.k, j20Var.l, j20Var.m, true);
        if (!e7Var.K || str == null || e7Var.v()) {
            File file5 = e7Var.Z0;
            if (file5 != null) {
                j20Var.o = file5.getAbsolutePath();
            } else {
                j20Var.o = str;
            }
            j20Var.I = true;
            j20Var.L = e7Var.S;
            if (e7Var.v()) {
                int i11 = 0;
                boolean z9 = false;
                while (i11 < e7Var.T.size()) {
                    e7 e7Var2 = (e7) e7Var.T.get(i11);
                    if (e7Var2.K) {
                        e7Var2.k0 = Math.max(e7Var2.k0, iArr[i11][c10]);
                        e7Var2.l0 = Math.max(e7Var2.l0, iArr[i11][2]);
                        i10 = v;
                        e7Var2.h0 = Math.max(e7Var2.h0, iArr[i11][4]);
                        z9 = true;
                    } else {
                        i10 = v;
                    }
                    i11++;
                    v = i10;
                    c10 = 1;
                }
                i7 = v;
                ArrayList a10 = i20.a(e7Var);
                j20Var.M = a10;
                if (z9) {
                    int size = a10.size();
                    long j12 = 0;
                    i20 i20Var = null;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = a10.get(i12);
                        i12++;
                        i20 i20Var2 = (i20) obj;
                        if (i20Var2.b) {
                            long j13 = i20Var2.o;
                            if (j13 > j12) {
                                i20Var = i20Var2;
                                j12 = j13;
                            }
                        }
                    }
                    if (i20Var != null) {
                        float f10 = i20Var.o;
                        float f11 = i20Var.k;
                        float f12 = i20Var.j;
                        long j14 = (long) ((f11 - f12) * f10);
                        e7Var.h0 = j14;
                        j20Var.v = j14;
                        j20Var.r = j14;
                        j3 = -(i20Var.f + ((long) (f12 * f10)));
                        i20Var.f = j3;
                        ArrayList arrayList2 = j20Var.M;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            i20 i20Var3 = (i20) obj2;
                            if (i20Var3.b && i20Var3 != i20Var) {
                                i20Var3.f += j3;
                            }
                        }
                        j20Var.a = -1L;
                        j20Var.b = -1L;
                        j20Var.t = true;
                        j20Var.j = -1;
                        j20Var.u = 1.0f;
                        j20Var.m = -1;
                        j20Var.n = 30;
                        j20Var.q = (long) (((e7Var.h0 / 1000.0f) * i7) / 8.0f);
                        j20Var.A = null;
                    }
                } else {
                    long j15 = e7Var.S0;
                    e7Var.h0 = j15;
                    j20Var.v = j15;
                    j20Var.r = j15;
                }
            } else {
                i7 = v;
                if (e7Var.o0 != null) {
                    long j16 = (long) ((e7Var.t0 - e7Var.s0) * e7Var.q0);
                    e7Var.h0 = j16;
                    j20Var.v = j16;
                    j20Var.r = j16;
                } else if (e7Var.y != null) {
                    long j17 = (long) ((e7Var.F - e7Var.E) * e7Var.C);
                    e7Var.h0 = j17;
                    j20Var.v = j17;
                    j20Var.r = j17;
                } else {
                    long j18 = e7Var.S0;
                    e7Var.h0 = j18;
                    j20Var.v = j18;
                    j20Var.r = j18;
                }
            }
            j3 = 0;
            j20Var.a = -1L;
            j20Var.b = -1L;
            j20Var.t = true;
            j20Var.j = -1;
            j20Var.u = 1.0f;
            j20Var.m = -1;
            j20Var.n = 30;
            j20Var.q = (long) (((e7Var.h0 / 1000.0f) * i7) / 8.0f);
            j20Var.A = null;
        } else {
            j20Var.o = str;
            j20Var.I = false;
            j20Var.n = Math.min(59, iArr[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr[0][3];
            }
            j20Var.j = E;
            if (E >= 1000000 || (arrayList = e7Var.T0) == null || arrayList.isEmpty()) {
                int i14 = j20Var.j;
                if (i14 < 500000) {
                    j20Var.m = 2500000;
                    j20Var.j = -1;
                } else {
                    j20Var.m = Utilities.j(i14, 3000000, 500000);
                }
            } else {
                j20Var.m = 2000000;
                j20Var.j = -1;
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(j20Var.j);
            sb2.append(" => ");
            jg.g.s(j20Var.m, sb2);
            int i15 = iArr[0][4];
            long j19 = i15;
            e7Var.h0 = j19;
            j20Var.v = j19 * 1000;
            float f13 = j19;
            long j20 = ((long) (e7Var.Z * f13)) * 1000;
            j20Var.a = j20;
            long j21 = ((long) (e7Var.a0 * f13)) * 1000;
            j20Var.b = j21;
            j20Var.r = j21 - j20;
            j20Var.u = e7Var.P;
            j20Var.t = e7Var.Y;
            j20Var.q = (long) a8.p0.f(i15 / 1000.0f, v, 8.0f, r2[5]);
            j20Var.q = Math.max(e7Var.L.length(), j20Var.q);
            j20Var.A = e7Var.a1;
            File file6 = e7Var.Q0;
            j20Var.C = file6 == null ? null : file6.getPath();
            j3 = 0;
        }
        j20Var.S = e7Var.a;
        j20Var.U = e7Var.z0;
        j20Var.T = e7Var.y0;
        j20Var.c = -1L;
        ye yeVar = e7Var.m0;
        if (yeVar != null) {
            j20Var.H = yeVar.clone();
        } else {
            j20Var.H = new ye();
        }
        j20Var.H.B = new Matrix();
        j20Var.H.B.set(e7Var.n0);
        j20Var.G = e7Var.T0;
        j20Var.Q = Integer.valueOf(e7Var.A0);
        j20Var.R = Integer.valueOf(e7Var.B0);
        j20Var.V = true;
        j20Var.K = e7Var.d1;
        j20Var.b0.clear();
        if (e7Var.v() && !e7Var.Y) {
            ArrayList arrayList3 = j20Var.M;
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                i20 i20Var4 = (i20) obj3;
                if (i20Var4.b && i20Var4.e > 0.0f && !i20Var4.c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(i20Var4.d);
                    mixedSoundInfo.volume = i20Var4.e;
                    float f14 = i20Var4.j;
                    float f15 = i20Var4.o;
                    mixedSoundInfo.audioOffset = ((long) (f14 * f15)) * 1000;
                    mixedSoundInfo.startTime = i20Var4.f * 1000;
                    mixedSoundInfo.duration = ((long) ((i20Var4.k - f14) * f15)) * 1000;
                    j20Var.b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = e7Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = e7Var.u0;
            float f16 = e7Var.s0;
            float f17 = e7Var.q0;
            long j22 = ((long) (f16 * f17)) * 1000;
            mixedSoundInfo2.audioOffset = j22;
            if (e7Var.K) {
                mixedSoundInfo2.startTime = ((long) (e7Var.r0 - (e7Var.Z * e7Var.h0))) * 1000;
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
            mixedSoundInfo2.duration = ((long) ((e7Var.t0 - f16) * f17)) * 1000;
            j20Var.b0.add(mixedSoundInfo2);
        }
        String str2 = e7Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = e7Var.G;
            float f18 = e7Var.E;
            float f19 = e7Var.C;
            long j24 = ((long) (f18 * f19)) * 1000;
            mixedSoundInfo3.audioOffset = j24;
            if (e7Var.K) {
                mixedSoundInfo3.startTime = ((long) (e7Var.D - (e7Var.Z * e7Var.h0))) * 1000;
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
            mixedSoundInfo3.duration = ((long) ((e7Var.F - f18) * f19)) * 1000;
            j20Var.b0.add(mixedSoundInfo3);
        }
        c20Var.a(j20Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e8, code lost:
    
        if (r6 == null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x045d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0462 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        int i7;
        int i10;
        BufferedWriter bufferedWriter;
        String e10;
        BufferedWriter bufferedWriter2;
        e7 e7Var;
        File file;
        ArrayList arrayList;
        int i11;
        TLRPC.Photo photo;
        o9 o9Var;
        f2 T;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z9;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings;
        SQLiteCursor sQLiteCursor = null;
        int i12 = 1;
        r7 = true;
        boolean z11 = true;
        int i13 = 0;
        switch (this.a) {
            case 0:
                n41 n41Var = (n41) this.d;
                i0 i0Var = (i0) this.e;
                d20 d20Var = (d20) this.b;
                c20 c20Var = (c20) this.c;
                if (i0.d(n41Var.getParentActivity())) {
                    i0Var.e();
                    mm0 mm0Var = new mm0(10, false, false, null);
                    mm0Var.G = 1;
                    mm0Var.H = false;
                    mm0Var.y = false;
                    mm0Var.V = new android.support.v4.media.session.a0(d20Var, n41Var, c20Var, false, 7);
                    n41Var.presentFragment(mm0Var);
                    return;
                }
                return;
            case 1:
                String str2 = (String) this.d;
                d20 d20Var2 = (d20) this.b;
                f2 f2Var = (f2) this.e;
                c20 c20Var2 = (c20) this.c;
                try {
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = gc.K(str2, null, c12.x, c12.y, true);
                    if (K != null) {
                        str = i0.l(K, d20Var2);
                        try {
                            K.recycle();
                        } catch (Throwable th2) {
                            th = th2;
                            a8.g(th, true);
                            org.telegram.messenger.g0.h3(new f0(f2Var, str, c20Var2));
                            return;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = null;
                }
                org.telegram.messenger.g0.h3(new f0(f2Var, str, c20Var2));
                return;
            case 2:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.d;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.e;
                String str3 = (String) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.c;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.g.b(iOnDoneCallback, str3, aVar);
                    return;
                }
                androidx.car.app.utils.g.f(iOnDoneCallback, str3, new IllegalStateException("Lifecycle is not at least created when dispatching " + aVar));
                return;
            case 3:
                bi.y yVar = (bi.y) this.d;
                TLObject tLObject = (TLObject) this.e;
                String str4 = (String) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                a3.f fVar = yVar.n;
                bi.z zVar = yVar.r;
                if (zVar.O) {
                    return;
                }
                yVar.e = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    i7 = ((f2) zVar).currentAccount;
                    qp.s1(i7).Y3(starsStatus.users, false);
                    i10 = ((f2) zVar).currentAccount;
                    qp.s1(i10).S3(starsStatus.chats, false);
                    boolean z12 = ((starsStatus.flags & 1) == 0 || starsStatus.next_offset == null) ? false : true;
                    if (z12 && TextUtils.equals(str4, starsStatus.next_offset)) {
                        yVar.h = true;
                    } else {
                        yVar.b.addAll(starsStatus.history);
                        yVar.d = starsStatus.next_offset;
                        yVar.f = !z12;
                    }
                } else {
                    yVar.h = true;
                    if (tL_error != null) {
                        hc.d0(tL_error);
                    }
                }
                yVar.c.f3.O(false);
                yVar.removeCallbacks(fVar);
                yVar.post(fVar);
                return;
            case 4:
                f2 f2Var2 = (f2) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                vf.b bVar = (vf.b) this.b;
                u1 u1Var = (u1) this.c;
                if (f2Var2 != null && tL_error2 != null) {
                    hc.a0(f2Var2).f0(tL_error2, false);
                }
                if ((f2Var2 instanceof an) && tL_error2 == null) {
                    ((an) f2Var2).Bc();
                }
                bVar.b();
                u1Var.dismiss();
                return;
            case 5:
                k7 k7Var = (k7) this.d;
                boolean[] zArr = (boolean[]) this.e;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.b;
                jc[] jcVarArr = (jc[]) this.c;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                TL_stars.StarGift y12 = k7Var.y1();
                w9.c(k7Var.a).j(y12.gift_id, new z2(k7Var, y12, starGiftAttribute, jcVarArr, zArr, 0));
                return;
            case 6:
                k7 k7Var2 = (k7) this.d;
                ij ijVar = (ij) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                k7Var2.d3 = true;
                k7Var2.i2(ijVar, null);
                k7Var2.s2(0, true, null);
                jz jzVar = k7Var2.S1;
                if (jzVar != null) {
                    jzVar.c(true);
                }
                ea.y(k7Var2.a, false).O();
                v9 G = ea.y(k7Var2.a, false).G(p10.i(k7Var2.a).e(), false);
                if (G != null) {
                    G.k(arrayList2, starGift);
                    return;
                }
                return;
            case 7:
                k7 k7Var3 = (k7) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                aa.s sVar = (aa.s) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (!(tLObject2 instanceof TLRPC.TL_messages_chatFull)) {
                    cc Y = k7Var3.k().Y(tL_error3);
                    Y.t = true;
                    Y.j();
                    return;
                }
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                qp.s1(k7Var3.a).Y3(tL_messages_chatFull.users, false);
                qp.s1(k7Var3.a).S3(tL_messages_chatFull.chats, false);
                qp.s1(k7Var3.a).R3(tL_messages_chatFull.full_chat);
                if (tL_messages_chatFull.full_chat.stargifts_available) {
                    sVar.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var3.getContext(), k7Var3.I0);
                alertDialog$Builder.a.R = hd.M0(2131750261, null);
                alertDialog$Builder.a.T = hd.M0(2131750262, null);
                jg.g.C(null, 2131747830, alertDialog$Builder, null);
                return;
            case 8:
                k7 k7Var4 = (k7) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject3 = (TLObject) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tL_error4 != null || !(tLObject3 instanceof TLRPC.Updates)) {
                    k7Var4.k().f0(tL_error4, false);
                    return;
                }
                k7Var4.j2 = true;
                k7Var4.k3 = null;
                k7Var4.m1(inputSavedStarGift, (TLRPC.Updates) tLObject3, new z1(k7Var4, 9));
                Utilities.d.c(new a1.e(29, k7Var4, tLObject3));
                return;
            case 9:
                d6 d6Var = (d6) this.d;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.e;
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable = (Runnable) this.c;
                j6 j6Var = d6Var.H;
                d6Var.h0 = false;
                if (starGift2 != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                ch0 ch0Var = d6Var.l0;
                if (ch0Var != null) {
                    ch0Var.d();
                    org.telegram.messenger.g0.i3(new m0(3), 750L);
                }
                d6Var.Q.animate().alpha(0.0f).start();
                d6Var.S.animate().alpha(1.0f).start();
                d6Var.G.animate().alpha(1.0f).start();
                d6Var.R.animate().alpha(0.0f).start();
                d6Var.P.animate().alpha(1.0f).start();
                d6Var.M.setText(org.telegram.messenger.g0.X2(hd.G(arrayList3.size(), "GiftCraftFailedText", new Object[0])));
                j6Var.setText(hd.M0(2131749794, null));
                j6Var.setTranslationY(org.telegram.messenger.g0.L(6.0f));
                d6Var.I.setAlpha(0.0f);
                if (d6Var.O != null) {
                    int i14 = 0;
                    while (true) {
                        zh.z0[] z0VarArr = d6Var.O;
                        if (i14 < z0VarArr.length) {
                            org.telegram.messenger.g0.E2(z0VarArr[i14]);
                            i14++;
                        } else {
                            d6Var.O = null;
                        }
                    }
                }
                d6Var.O = new zh.z0[arrayList3.size()];
                int i15 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i15);
                    zh.z0 z0Var = new zh.z0(d6Var.W, d6Var.getContext(), d6Var.a);
                    z0Var.h(starGift3, false, false, false, false, true);
                    z0Var.y.setVisibility(8);
                    z0Var.setRibbonColor(-3065286);
                    l9 l9Var = z0Var.D;
                    FrameLayout.LayoutParams e11 = ha.e(42, 42, 17);
                    z0Var.E = e11;
                    l9Var.setLayoutParams(e11);
                    int i16 = i15 + 1;
                    boolean z13 = i16 >= arrayList3.size();
                    LinearLayout linearLayout = d6Var.N;
                    d6Var.O[i15] = z0Var;
                    linearLayout.addView(z0Var, ha.q(74, 74, 0.0f, 51, 0, 0, z13 ? 0 : 6, 0));
                    i15 = i16;
                }
                return;
            case 10:
                q3 q3Var = (q3) this.d;
                String str5 = (String) this.e;
                Map map = (Map) this.b;
                List list = (List) this.c;
                ca.h hVar = (ca.h) q3Var.a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) q3Var.g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hVar.i(str5, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hVar.h(str5, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File b10 = hVar.a.b(str5, "rollouts-state");
                if (list.isEmpty()) {
                    ca.h.g(b10, "Rollout state is empty for session: " + str5);
                    return;
                }
                try {
                    e10 = ca.h.e(list);
                    bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), ca.h.b));
                } catch (Exception e12) {
                    e = e12;
                    bufferedWriter = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter = null;
                }
                try {
                    bufferedWriter2.write(e10);
                    bufferedWriter2.flush();
                    aa.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                    return;
                } catch (Exception e13) {
                    e = e13;
                    bufferedWriter = bufferedWriter2;
                    try {
                        Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                        ca.h.f(b10);
                        aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bufferedWriter = bufferedWriter2;
                    aa.g.b(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            case 11:
                z3 z3Var = (z3) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.b;
                c20 c20Var3 = (c20) this.c;
                i4 i4Var = z3Var.x;
                if (tLObject4 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject4;
                    qp.s1(i4Var.l2).Y3(tL_stories_stories.users, false);
                    qp.s1(i4Var.l2).S3(tL_stories_stories.chats, false);
                    while (i13 < tL_stories_stories.stories.size()) {
                        if (tL_stories_stories.stories.get(i13).id == storyItem.id) {
                            c20Var3.a(tL_stories_stories.stories.get(i13).media.document);
                            return;
                        }
                        i13++;
                    }
                }
                c20Var3.a(null);
                return;
            case 12:
                z3 z3Var2 = (z3) this.d;
                Activity activity = (Activity) this.e;
                p9 p9Var = (p9) this.b;
                f4 f4Var = (f4) this.c;
                va D = va.D(activity, z3Var2.x.l2);
                h4 h4Var = z3Var2.x.v2;
                long j3 = (h4Var == null || (o9Var = (o9) h4Var.c) == null) ? 0L : o9Var.currentPosition;
                fi.z0 z0Var2 = qp.s1(z3Var2.x.l2).P1().w;
                TL_stories.StoryItem storyItem2 = z3Var2.x.x1.a;
                long j10 = storyItem2.dialogId;
                ArrayList arrayList4 = z0Var2.b;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    int i17 = i13 + 1;
                    e7Var = (e7) obj;
                    if (e7Var.g && storyItem2.id == e7Var.f && j10 == e7Var.e) {
                        TLRPC.MessageMedia messageMedia = storyItem2.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        i11 = i17;
                        if ((document == null || document.id == e7Var.H) && ((photo = messageMedia.photo) == null || photo.id == e7Var.I)) {
                            e7Var.h = true;
                            if (e7Var != null || e7Var.u || (file = e7Var.L) == null || !file.exists()) {
                                e7Var = e7.n(z3Var2.x.x1.h(), z3Var2.x.x1.a);
                                e7Var.e = z3Var2.x.k1;
                            }
                            e7 g10 = e7Var.g();
                            if (z3Var2.x.G0()) {
                                i4 i4Var2 = z3Var2.x;
                                g10.J0 = i4Var2.k1;
                                g10.L0 = qp.Z4(i4Var2.x1.a.media);
                                q6 q6Var = p9Var.N0;
                                if (q6Var instanceof di.j6) {
                                    g10.K0 = ((di.j6) q6Var).E;
                                }
                            }
                            D.R(qa.d(p9Var), g10, j3);
                            D.Q = new s3(z3Var2, 3);
                            D.R = new v3(z3Var2, f4Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList4;
                        i11 = i17;
                    }
                    arrayList4 = arrayList;
                    i13 = i11;
                }
                e7Var = null;
                if (e7Var != null) {
                }
                e7Var = e7.n(z3Var2.x.x1.h(), z3Var2.x.x1.a);
                e7Var.e = z3Var2.x.k1;
                e7 g102 = e7Var.g();
                if (z3Var2.x.G0()) {
                }
                D.R(qa.d(p9Var), g102, j3);
                D.Q = new s3(z3Var2, 3);
                D.R = new v3(z3Var2, f4Var, 1);
                return;
            case 13:
                m6 m6Var = (m6) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                c20 c20Var4 = (c20) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                m6Var.i = false;
                if (tLObject5 instanceof TL_stories.TL_storyAlbum) {
                    r6 a10 = r6.a((TL_stories.TL_storyAlbum) tLObject5);
                    m6Var.h.add(a10);
                    m6Var.f(true);
                    c20Var4.a(a10);
                    return;
                }
                if (tL_error5 != null && (T = LaunchActivity.T()) != null) {
                    hc.a0(T).f0(tL_error5, false);
                }
                qs.f(m6Var.a).k(qs.j3, Long.valueOf(m6Var.b), m6Var);
                return;
            case 14:
                q6 q6Var2 = (q6) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                yr yrVar = (yr) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                int i18 = q6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i19 = q6Var2.e;
                sb2.append(i19);
                sb2.append("{");
                long j11 = q6Var2.d;
                sb2.append(j11);
                sb2.append("} saveCache {");
                sb2.append(y6.a(arrayList5));
                org.telegram.ui.Cells.f1.u("}", sb2);
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j11 + " AND album_id = " + i18).stepThis().dispose();
                        SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        while (i13 < arrayList5.size()) {
                            try {
                                TL_stories.StoryItem storyItem3 = ((ij) arrayList5.get(i13)).l;
                                if (storyItem3 == null) {
                                    sQLitePreparedStatement3 = executeFast;
                                } else {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem3.getObjectSize());
                                    storyItem3.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(i12, j11);
                                    int i20 = i12;
                                    executeFast.bindInteger(2, storyItem3.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    sQLitePreparedStatement3 = executeFast;
                                    try {
                                        sQLitePreparedStatement3.bindInteger(4, i19);
                                        sQLitePreparedStatement3.bindInteger(5, q6Var2.m.contains(Integer.valueOf(storyItem3.id)) ? 1 : 0);
                                        sQLitePreparedStatement3.bindInteger(6, arrayList6.indexOf(Integer.valueOf(storyItem3.id)) + 1);
                                        sQLitePreparedStatement3.step();
                                        nativeByteBuffer.reuse();
                                        executeFast2.requery();
                                        executeFast2.bindLong(i20, j11);
                                        executeFast2.bindInteger(2, i18);
                                        executeFast2.bindInteger(3, storyItem3.id);
                                        executeFast2.bindInteger(4, i13);
                                        executeFast2.step();
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLitePreparedStatement2 = executeFast2;
                                        z9 = true;
                                        sQLitePreparedStatement = sQLitePreparedStatement3;
                                        try {
                                            yrVar.o(th, z9);
                                            org.telegram.messenger.g0.h3(new n6(q6Var2, 2));
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
                                i13++;
                                executeFast = sQLitePreparedStatement3;
                                i12 = 1;
                            } catch (Throwable th8) {
                                th = th8;
                                sQLitePreparedStatement3 = executeFast;
                            }
                        }
                        SQLitePreparedStatement sQLitePreparedStatement4 = executeFast;
                        if (sQLitePreparedStatement4 != null) {
                            sQLitePreparedStatement4.dispose();
                        }
                        if (executeFast2 != null) {
                            executeFast2.dispose();
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        sQLitePreparedStatement = executeFast;
                        z9 = true;
                        sQLitePreparedStatement2 = null;
                        yrVar.o(th, z9);
                        org.telegram.messenger.g0.h3(new n6(q6Var2, 2));
                        return;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    sQLitePreparedStatement = null;
                }
                org.telegram.messenger.g0.h3(new n6(q6Var2, 2));
                return;
            case 15:
                y5 y5Var = (y5) this.d;
                Bitmap[] bitmapArr = (Bitmap[]) this.e;
                e7 e7Var2 = (e7) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                y9 y9Var = y5Var.G;
                Bitmap bitmap = y5Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    y5Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                y5Var.a = bitmap2;
                if (e7Var2 != null && !e7Var2.c && e7Var2.K && bitmap2 != null) {
                    e7Var2.k0 = bitmap2.getWidth();
                    e7Var2.l0 = y5Var.a.getHeight();
                    e7Var2.A();
                }
                if (zArr2[0] && e7Var2 != null && y9Var != null && y5Var.a != null) {
                    y9Var.e();
                    y9Var.f(e7Var2.b(0.2f, y5Var.a), false);
                    u8 u8Var = y5Var.w;
                    if (u8Var != null) {
                        u8Var.run();
                    }
                }
                y5Var.r();
                y5Var.invalidate();
                return;
            case 16:
                a();
                return;
            case 17:
                fi.d dVar = (fi.d) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                v2 v2Var = (v2) this.b;
                hi.o1 o1Var = (hi.o1) this.c;
                dVar.setLoading(false);
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    v2Var.dismiss();
                    o1Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.d;
                v2 v2Var2 = (v2) this.e;
                f6 f6Var = (f6) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                new hc(v2Var2.E, f6Var).I(R.raw.copy, hd.M0(2131754333, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131754334, hi.j.J0(connectedbotstarref.commission_permille), t10.p(user)))).j();
                return;
            case 19:
                hi.q3.A0((hi.q3) this.d, (Context) this.e, (TLRPC.User) this.b, (TL_payments.connectedBotStarRef) this.c);
                return;
            case 20:
                TLObject tLObject7 = (TLObject) this.d;
                boolean[] zArr3 = (boolean[]) this.e;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr3[0]) {
                        return;
                    }
                    zArr3[0] = true;
                    nVar.a(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                nVar.a(Boolean.TRUE, "allowed");
                return;
            case 21:
                kg.y yVar2 = (kg.y) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ArrayList arrayList7 = yVar2.b;
                if (tLObject8 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject8;
                    int indexOf = arrayList7.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList7.set(indexOf, tL_businessChatLink2);
                        qs.f(yVar2.a).k(qs.J1, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        yVar2.f();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                t1 t1Var = (t1) this.d;
                yr yrVar2 = (yr) this.e;
                s1 s1Var = (s1) this.b;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.c;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = yrVar2.b.queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(s1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e14) {
                        a8.g(e14, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.g0.h3(new d0(t1Var, arrayList8, s1Var, tL_messages_sendQuickReplyMessages, 23));
                    return;
                } catch (Throwable th11) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th11;
                }
            case 23:
                t1 t1Var2 = (t1) this.d;
                ArrayList<Integer> arrayList9 = (ArrayList) this.e;
                s1 s1Var2 = (s1) this.b;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.c;
                int i21 = t1Var2.a;
                if (arrayList9.isEmpty() || arrayList9.size() < s1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = s1Var2.a;
                    ConnectionsManager.getInstance(i21).sendRequest(tL_messages_getQuickReplyMessages, new bi.f2(t1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, 11));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList9;
                    while (i13 < arrayList9.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                        i13++;
                    }
                    ConnectionsManager.getInstance(i21).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 24:
                li.p pVar = (li.p) this.d;
                li.a aVar2 = (li.a) this.e;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.b;
                k60 k60Var = (k60) this.c;
                pVar.r.Y4(aVar2, pageBlock);
                k60Var.u();
                return;
            case 25:
                CameraController.lambda$openRound$9((CameraSession) this.d, (Runnable) this.e, (SurfaceTexture) this.b, (Runnable) this.c);
                return;
            case 26:
                CameraController.lambda$close$5((Runnable) this.d, (CameraSession) this.e, (CountDownLatch) this.b, (Runnable) this.c);
                return;
            case 27:
                ((VideoAds) this.d).lambda$show$14((Context) this.e, (TLRPC.TL_sponsoredMessage) this.b, (k60) this.c);
                return;
            case 28:
                TLObject tLObject9 = (TLObject) this.d;
                h6 h6Var = (h6) this.e;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) this.b;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.c;
                k6.A--;
                if (tLObject9 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject9;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (h6Var == null || themeSettings == null) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && document2.id != tL_theme.document.id) {
                            if (h6Var != null) {
                                h6Var.r = tL_theme2;
                            } else {
                                j6Var2.F = tL_theme2;
                                j6Var2.G = false;
                                j6Var2.g0 = null;
                                j6Var2.h0 = null;
                                qs.f(j6Var2.E).b(j6Var2, qs.Y1);
                                qs.f(j6Var2.E).b(j6Var2, qs.Z1);
                                w7 G2 = w7.G(j6Var2.E);
                                TLRPC.TL_theme tL_theme3 = j6Var2.F;
                                G2.W(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (org.telegram.ui.ActionBar.j6.a(h6Var, themeSettings)) {
                            z10 = false;
                        } else {
                            File e15 = h6Var.e();
                            if (e15 != null) {
                                e15.delete();
                            }
                            org.telegram.ui.ActionBar.j6.i(h6Var, themeSettings);
                            org.telegram.ui.ActionBar.j6 j6Var3 = k6.I;
                            if (j6Var3 == j6Var2 && j6Var3.Y == h6Var.a) {
                                k6.t1(false, false);
                                k6.K(org.telegram.messenger.t0.b, false);
                                org.telegram.ui.ActionBar.j6 j6Var4 = k6.I;
                                k6.K1(j6Var4, k6.J == j6Var4, -1, null);
                            }
                            e6.a(true);
                            z10 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        h6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z11 = z10;
                    }
                    if (k6.A != 0) {
                        k6.B = (int) (System.currentTimeMillis() / 1000);
                        k6.y1(z11, false);
                        return;
                    }
                    return;
                }
                z11 = false;
                if (k6.A != 0) {
                }
                break;
            default:
                ((d4) this.d).a(k6.T0((File) this.e, (String) this.b, (String[]) this.c));
                return;
        }
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ d0(String str, d20 d20Var, f2 f2Var, c20 c20Var) {
        this.a = 1;
        this.d = str;
        this.b = d20Var;
        this.e = f2Var;
        this.c = c20Var;
    }
}
