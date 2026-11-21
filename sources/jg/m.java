package jg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.s8;
import bi.t2;
import c8.ma;
import fi.p6;
import fi.y6;
import hi.e9;
import hi.s6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.oo;
import org.telegram.messenger.qo;
import org.telegram.messenger.ro;
import org.telegram.messenger.s2;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Cells.d7;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Components.zs;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.fv;
import org.telegram.ui.xw;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class m extends dk0 implements q2 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public ek0 L;
    public zg0 M;
    public Drawable P;
    public final j Q;
    public boolean R;
    public final cx S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean a0;
    public final Context c;
    public ArrayList d;
    public boolean e;
    public int f;
    public int h;
    public boolean n;
    public final int r;
    public long s;
    public int w;
    public final boolean x;
    public final ArrayList y;
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int b0 = -1;

    static {
        boolean z10 = s2.a;
    }

    public m(cx cxVar, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.S = cxVar;
        this.h = i7;
        this.r = i10;
        this.x = z10;
        this.E = i10 == 0 && i7 == 0 && !z10;
        this.y = arrayList;
        this.G = i11;
        this.W = cxVar.a3;
        if (i10 == 0) {
            j jVar = new j();
            jVar.a = new HashSet();
            jVar.b = new HashSet();
            jVar.c = new HashSet();
            jVar.d = new ArrayList();
            jVar.e = new ai.n(jVar, 20);
            this.Q = jVar;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                t6.x(view, drawable, m6.b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i7 = m6.a7;
        e9 e9Var = new e9(5);
        e9 e9Var2 = new e9(6);
        int P = t6.P(i7, -1, 0, 0.0f, null);
        e9Var2.d(P, view);
        n6 w10 = t6.w(101, view);
        w10.c(i7, -1, 0, 0.0f, null);
        w10.n = e9Var;
        w10.o = e9Var2;
        w10.m = false;
        w10.g = P;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return (i7 == 1 || i7 == 5 || i7 == 3 || i7 == 8 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 13 || i7 == 15 || i7 == 16 || i7 == 18 || i7 == 19 || i7 == 20) ? false : true;
    }

    public final int F() {
        int i7 = this.G;
        int i10 = this.r;
        cx cxVar = this.S;
        if (cxVar != null && this.W == 0 && cxVar.w4(this.h)) {
            return (this.h == 0 || mp.u1(i7).e2.get(i10)) ? 4 : 3;
        }
        int i11 = this.h;
        if (i11 == 7 || i11 == 8) {
            return mp.u1(i7).e2.get(i10) ? 2 : 3;
        }
        if (i10 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int G(long j3) {
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            if (((k) this.N.get(i7)).c != null && ((k) this.N.get(i7)).c.id == j3) {
                return i7;
            }
        }
        return -1;
    }

    public final int H(int i7) {
        if (this.F) {
            i7--;
        }
        if (this.E) {
            i7 = i5.c.f(2, i7, mp.u1(this.G).s);
        }
        if (this.n && this.h == 3) {
            i7--;
        }
        int i10 = this.h;
        return (i10 == 11 || i10 == 13) ? i7 - 2 : i10 == 12 ? i7 - 1 : i7;
    }

    public final ro I() {
        int i7 = this.h;
        if (i7 == 7 || i7 == 8) {
            return mp.u1(this.G).N[this.h - 7];
        }
        return null;
    }

    public final Object J(int i7) {
        if (i7 >= 0 && i7 < this.N.size()) {
            k kVar = (k) this.N.get(i7);
            String str = kVar.l;
            TLRPC.TL_contact tL_contact = kVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return mp.u1(this.G).c2(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.n = z10;
    }

    public final void O(zg0 zg0Var) {
        this.M = zg0Var;
    }

    public final void P(ek0 ek0Var, boolean z10) {
        this.K = z10;
        for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
            if (ek0Var.getChildAt(i7) instanceof u2) {
                ((u2) ek0Var.getChildAt(i7)).f = z10;
            }
        }
        for (int i10 = 0; i10 < ek0Var.getCachedChildCount(); i10++) {
            if (ek0Var.P(i10) instanceof u2) {
                ((u2) ek0Var.P(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < ek0Var.getHiddenChildCount(); i11++) {
            if (ek0Var.V(i11) instanceof u2) {
                ((u2) ek0Var.V(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < ek0Var.getAttachedScrapChildCount(); i12++) {
            if (ek0Var.O(i12) instanceof u2) {
                ((u2) ek0Var.O(i12)).f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.R = z10;
    }

    public final void R(long j3) {
        this.s = j3;
    }

    public final void S(yw ywVar) {
        this.L = ywVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i7 = this.G;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    Collections.sort(this.d, new d(mp.u1(i7), currentTime, 1));
                    if (z10) {
                        f();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void V() {
        this.E = this.r == 0 && this.h == 0 && !this.x && !mp.u1(this.G).s.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04da A[LOOP:5: B:184:0x04da->B:194:0x0501, LOOP_START, PHI: r11
      0x04da: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:183:0x04d8, B:194:0x0501] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0506 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        long j3;
        ArrayList d42;
        int i7;
        int i10;
        boolean z10;
        ro roVar;
        TLRPC.Dialog dialog;
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i12;
        int i13;
        boolean z11;
        TLRPC.Dialog dialog2;
        int i14;
        TLRPC.Dialog dialog3;
        String N0;
        ArrayList arrayList;
        long j10 = this.W;
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i16 = this.G;
        int i17 = 0;
        if (i15 != 0) {
            this.N.clear();
            V();
            ab.c0 x10 = mp.u1(i16).x(j10);
            ArrayList arrayList2 = (ArrayList) x10.b;
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) x10.c;
            int size2 = arrayList3.size() + size;
            ArrayList arrayList4 = (ArrayList) x10.d;
            int size3 = arrayList4.size() + size2;
            ArrayList arrayList5 = (ArrayList) x10.e;
            this.f = arrayList5.size() + size3;
            this.V = false;
            int i18 = this.h == 3 ? 2 : 4;
            for (int i19 = 0; i19 < i18; i19++) {
                if (i19 == 0) {
                    N0 = gd.N0(2131751866, null);
                    arrayList = arrayList2;
                } else if (i19 == 1) {
                    N0 = gd.N0(2131751863, null);
                    arrayList = arrayList3;
                } else if (i19 == 2) {
                    N0 = gd.N0(2131751864, null);
                    arrayList = arrayList4;
                } else {
                    N0 = gd.N0(2131751861, null);
                    arrayList = arrayList5;
                }
                if (!arrayList.isEmpty()) {
                    this.N.add(new k(this, N0));
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        qo qoVar = (qo) arrayList.get(i20);
                        TLRPC.Dialog dialog4 = qoVar.d;
                        if (dialog4 != null) {
                            this.N.add(new k(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = qoVar.b;
                            if (chat != null) {
                                this.N.add(new k(this, chat));
                            } else {
                                TLRPC.User user = qoVar.c;
                                if (user != null) {
                                    this.N.add(new k(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.N.clear();
        V();
        mp u12 = mp.u1(i16);
        int i21 = this.r;
        cx cxVar = this.S;
        if (i15 != 0) {
            d42 = (ArrayList) u12.x.f(j10);
            if (d42 == null) {
                d42 = new ArrayList();
            }
            j3 = 0;
        } else {
            j3 = 0;
            d42 = cxVar.d4(i16, this.h, i21, this.H);
            if (d42 == null) {
                d42 = new ArrayList();
            }
        }
        int size4 = d42.size();
        this.f = size4;
        this.V = false;
        if (size4 == 0 && cxVar.t4()) {
            i5.c.A(this, 19, this.N);
            return;
        }
        if (this.E || this.h != 0 || i21 != 0 || !u12.e2.get(i21) || this.e) {
            i7 = i15;
            i10 = i16;
            z10 = true;
        } else if (u12.F0() > 10 || !i5.r(i16).n || i5.r(i16).f0.isEmpty()) {
            i7 = i15;
            i10 = i16;
            z10 = true;
            this.d = null;
        } else {
            this.d = new ArrayList(i5.r(i16).f0);
            i7 = i15;
            long j11 = j10.i(i16).n;
            int size5 = this.d.size();
            z10 = true;
            int i22 = 0;
            while (i22 < size5) {
                int i23 = i16;
                long j12 = ((TLRPC.TL_contact) this.d.get(i22)).user_id;
                if (j12 == j11 || u12.R.f(j12) != null) {
                    this.d.remove(i22);
                    i22--;
                    size5--;
                }
                i22++;
                i16 = i23;
            }
            i10 = i16;
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                U(false);
            }
        }
        ro I = I();
        if ((I == null || I.d()) && cxVar != null && cxVar.O0) {
            long j13 = cxVar.R0;
            roVar = I;
            if (j13 != j3 || cxVar.Q0 != j3) {
                if (j13 == j3) {
                    j13 = cxVar.Q0;
                }
                i5.c.A(this, 20, this.N);
                int i24 = 0;
                while (true) {
                    if (i24 >= d42.size()) {
                        dialog = null;
                        break;
                    } else {
                        if (((TLRPC.Dialog) d42.get(i24)).id == j13) {
                            dialog = (TLRPC.Dialog) d42.get(i24);
                            break;
                        }
                        i24++;
                    }
                }
                if (dialog == null) {
                    dialog = new TLRPC.TL_dialog();
                    dialog.id = j13;
                }
                this.N.add(new k(this, 0, dialog));
                i5.c.A(this, 20, this.N);
                this.F = false;
                i11 = this.h;
                if ((i11 != 7 || i11 == 8) && roVar != null && roVar.c()) {
                    u12.H(roVar.a, false);
                    oo ooVar = (oo) u12.d0.get(roVar.a);
                    tL_chatlists_chatlistUpdates = ooVar != null ? null : ooVar.c;
                    if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                        this.F = z10;
                        this.N.add(new k(this, tL_chatlists_chatlistUpdates));
                    }
                }
                requestPeerType = this.U;
                if (requestPeerType != null) {
                    i5.c.A(this, 15, this.N);
                }
                if (!this.K || this.T) {
                    for (i12 = 0; i12 < d42.size(); i12++) {
                        if (this.h == 2 && (d42.get(i12) instanceof xw)) {
                            this.N.add(new k(this, 14, (TLRPC.Dialog) d42.get(i12)));
                        } else {
                            this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i12)));
                        }
                    }
                    i5.c.A(this, 10, this.N);
                }
                boolean z12 = cxVar != null && j10 == j3 && cxVar.w4(this.h);
                boolean z13 = z12 && this.f > 0;
                if (z13) {
                    int i25 = 0;
                    while (true) {
                        if (i25 >= d42.size()) {
                            break;
                        }
                        if (!(d42.get(i25) instanceof TLRPC.TL_dialogFolder)) {
                            z13 = false;
                            break;
                        }
                        i25++;
                    }
                }
                if (this.f == 0 && this.e && !z12) {
                    this.V = true;
                    if (requestPeerType != null) {
                        i5.c.A(this, 16, this.N);
                    } else {
                        this.N.add(new k(this, F(), 0));
                    }
                    i5.c.A(this, 8, this.N);
                    i5.c.A(this, 7, this.N);
                    i5.c.A(this, 13, this.N);
                } else {
                    ArrayList arrayList6 = this.d;
                    if (arrayList6 != null && !arrayList6.isEmpty() && (i13 = this.h) != 7 && i13 != 8 && !z12) {
                        if (this.f == 0) {
                            this.V = true;
                            if (requestPeerType != null) {
                                i5.c.A(this, 16, this.N);
                            } else {
                                this.N.add(new k(this, F(), 0));
                            }
                            i5.c.A(this, 8, this.N);
                            i5.c.A(this, 7, this.N);
                        } else {
                            for (int i26 = 0; i26 < d42.size(); i26++) {
                                this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i26)));
                            }
                            i5.c.A(this, 8, this.N);
                            i5.c.A(this, 7, this.N);
                        }
                        for (int i27 = 0; i27 < this.d.size(); i27++) {
                            this.N.add(new k(this, (TLRPC.TL_contact) this.d.get(i27)));
                        }
                        i5.c.A(this, 10, this.N);
                        z11 = true;
                        if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                            i5.c.A(this, 12, this.N);
                        }
                        if (this.n && this.h == 3) {
                            i5.c.A(this, 21, this.N);
                        }
                        if (!z11) {
                            for (int i28 = 0; i28 < d42.size(); i28++) {
                                if (this.h == 2 && (d42.get(i28) instanceof xw)) {
                                    this.N.add(new k(this, 14, (TLRPC.Dialog) d42.get(i28)));
                                } else {
                                    this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i28)));
                                }
                            }
                            if (i7 != 0 || this.R || (i14 = this.h) == 7 || i14 == 8 || mp.u1(i10).e2.get(i21)) {
                                int i29 = this.f;
                                if (i29 == 0 || z13) {
                                    this.V = i29 == 0;
                                    if (requestPeerType != null) {
                                        i5.c.A(this, 16, this.N);
                                    } else {
                                        this.N.add(new k(this, F(), 0));
                                    }
                                } else {
                                    if (i21 == 0 && i29 > 10 && this.h == 0) {
                                        i5.c.A(this, 11, this.N);
                                    }
                                    i5.c.A(this, 10, this.N);
                                }
                            } else {
                                if (this.f != 0) {
                                    i5.c.A(this, 1, this.N);
                                }
                                i5.c.A(this, 10, this.N);
                            }
                        }
                        if (u12.S0.isEmpty()) {
                            while (i17 < this.N.size()) {
                                k kVar = (k) this.N.get(i17);
                                if (kVar.a == 0 && (dialog2 = kVar.c) != null && u12.B2(dialog2.id)) {
                                    this.N.remove(i17);
                                    i17--;
                                }
                                i17++;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.E) {
                        int size6 = mp.u1(i10).s.size();
                        i5.c.A(this, 2, this.N);
                        for (int i30 = 0; i30 < size6; i30++) {
                            this.N.add(new k(this, (TLRPC.RecentMeUrl) mp.u1(i10).s.get(i30)));
                        }
                        i5.c.A(this, 3, this.N);
                    } else {
                        int i31 = this.h;
                        if (i31 == 11 || i31 == 13) {
                            i5.c.A(this, 7, this.N);
                            i5.c.A(this, 12, this.N);
                        } else if (i31 == 12) {
                            i5.c.A(this, 7, this.N);
                        }
                    }
                }
                z11 = false;
                if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                }
                i5.c.A(this, 12, this.N);
                if (this.n) {
                    i5.c.A(this, 21, this.N);
                }
                if (!z11) {
                }
                if (u12.S0.isEmpty()) {
                }
            }
        } else {
            roVar = I;
        }
        if ((roVar == null || roVar.d()) && cxVar != null && this.h == 3 && cxVar.S0 != j3) {
            i5.c.A(this, 20, this.N);
            int i32 = 0;
            while (true) {
                if (i32 >= d42.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (((TLRPC.Dialog) d42.get(i32)).id == cxVar.S0) {
                        dialog3 = (TLRPC.Dialog) d42.get(i32);
                        break;
                    }
                    i32++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = cxVar.S0;
            }
            this.N.add(new k(this, 0, dialog3));
            i5.c.A(this, 20, this.N);
        }
        this.F = false;
        i11 = this.h;
        if (i11 != 7) {
        }
        u12.H(roVar.a, false);
        oo ooVar2 = (oo) u12.d0.get(roVar.a);
        if (ooVar2 != null) {
        }
        if (tL_chatlists_chatlistUpdates != null) {
            this.F = z10;
            this.N.add(new k(this, tL_chatlists_chatlistUpdates));
        }
        requestPeerType = this.U;
        if (requestPeerType != null) {
        }
        if (this.K) {
        }
        while (i12 < d42.size()) {
        }
        i5.c.A(this, 10, this.N);
    }

    public final void X(fv fvVar) {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        W();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        arrayList3.size();
        p4.c c10 = v4.o.c(gVar, true);
        this.a0 = false;
        if (fvVar != null) {
            fvVar.run();
        }
        this.N = arrayList2;
        c10.c(this);
    }

    @Override // v4.i0
    public final int b() {
        int size = this.N.size();
        this.w = size;
        return size;
    }

    @Override // v4.i0
    public final long c(int i7) {
        return ((k) this.N.get(i7)).k;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((k) this.N.get(i7)).a;
    }

    @Override // v4.i0
    public void f() {
        if (this.a0) {
            this.N = new ArrayList();
        }
        this.a0 = false;
        W();
        super.f();
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override // org.telegram.ui.Cells.q2
    public final void q() {
        p6 R1 = mp.u1(this.G).R1();
        ArrayList arrayList = R1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = R1.E(0, n5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = n5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || R1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        this.S.getOrCreateStoryViewer().M(this.c, null, arrayList2, 0, null, null, new y6(this.L, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        String H;
        TLRPC.Chat O0;
        String N0;
        int i10;
        String str2;
        int i11;
        int i12 = f1Var.f;
        View view = f1Var.a;
        int i13 = this.G;
        cx cxVar = this.S;
        Object[] objArr = 0;
        if (i12 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i7);
            Object J = J(i7 + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i14 = this.h;
            ArrayList arrayList = this.y;
            if (i14 == 2 || i14 == 15) {
                h6 h6Var = (h6) view;
                long dialogId = h6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = mp.u1(i13).O0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (O0 = mp.u1(i13).O0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = O0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str3 = chat.title;
                    if (!v3.T(chat) || chat.megagroup) {
                        int i15 = chat.participants_count;
                        H = i15 != 0 ? gd.H(',', "Members", i15) : chat.has_geo ? gd.N0(2131748449, null) : !v3.t0(chat) ? gd.N0(2131748448, null).toLowerCase() : gd.N0(2131748445, null).toLowerCase();
                    } else {
                        int i16 = chat.participants_count;
                        H = i16 != 0 ? gd.H(',', "Subscribers", i16) : !v3.t0(chat) ? gd.N0(2131752317, null).toLowerCase() : gd.N0(2131752306, null).toLowerCase();
                    }
                    r10 = str3;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User c22 = mp.u1(i13).c2(Long.valueOf(dialog.id));
                    if (c22 != 0) {
                        String q10 = o10.q(c22);
                        if (o10.A(c22)) {
                            str = "";
                            r10 = q10;
                            chat2 = c22;
                        } else {
                            chat2 = c22;
                            str = c22.bot ? gd.N0(2131753153, null) : gd.d0(i13, c22, null, null);
                            r10 = q10;
                        }
                    } else {
                        str = "";
                        chat2 = null;
                    }
                }
                h6Var.N = dialog2 != null;
                h6Var.x(chat2, null, r10, str, false, false);
                h6Var.w(arrayList.contains(Long.valueOf(h6Var.getDialogId())), dialogId == h6Var.getDialogId());
                if (i7 < this.f + 1) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            }
            u2 u2Var = (u2) view;
            u2Var.R0 = this.W != 0 && v3.d0(i13, dialog.id);
            u2Var.t2 = false;
            u2Var.u2 = false;
            if (this.h == 0 && org.telegram.messenger.g0.Q1()) {
                u2Var.setDialogSelected(dialog.id == this.s);
            }
            u2Var.c0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i7 == 1 && cxVar != null && cxVar.O0 && cxVar.R0 != 0 && dialog.top_message == 0) {
                ro I = I();
                u2Var.setCustomMessage((I == null || I.d()) ? gd.N0(2131746065, null) : null);
            } else if (i7 == 1 && cxVar != null && cxVar.O0 && cxVar.Q0 != 0 && dialog.top_message == 0) {
                ro I2 = I();
                if (I2 == null || I2.d()) {
                    u2Var.setCustomMessage(n5.w(cxVar.Q0));
                } else {
                    u2Var.setCustomMessage(null);
                }
            } else if (i7 == 1 && cxVar != null && this.h == 3 && cxVar.S0 != 0 && dialog.top_message == 0) {
                ro I3 = I();
                if (I3 == null || I3.d()) {
                    u2Var.setCustomMessage(n5.w(cxVar.S0));
                } else {
                    u2Var.setCustomMessage(null);
                }
            } else {
                u2Var.setCustomMessage(null);
            }
            u2Var.e0(dialog, this.h, this.r);
            if (u2Var.getMeasuredHeight() > 0 && u2Var.getMeasuredHeight() != u2Var.E()) {
                u2Var.requestLayout();
            }
            boolean z10 = u2Var.f;
            boolean z11 = this.K;
            if (z10 != z11) {
                u2Var.f = z11;
                u2Var.requestLayout();
            }
            j jVar = this.Q;
            if (jVar != null && i7 < 10) {
                long j3 = dialog.id;
                ArrayList arrayList2 = jVar.d;
                if (!jVar.a.contains(Long.valueOf(j3)) && !jVar.b.contains(Long.valueOf(j3)) && !jVar.c.contains(Long.valueOf(j3)) && !arrayList2.contains(Long.valueOf(j3))) {
                    arrayList2.add(Long.valueOf(j3));
                }
            }
        } else if (i12 == 4) {
            ((v2) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i7));
        } else if (i12 == 5) {
            a3 a3Var = (a3) view;
            int i17 = this.b0;
            int F = F();
            this.b0 = F;
            hz0 hz0Var = a3Var.n;
            TextView textView = a3Var.h;
            rh0 rh0Var = a3Var.f;
            if (a3Var.r != F) {
                a3Var.r = F;
                if (F == 0 || F == 1) {
                    N0 = gd.N0(2131748035, null);
                    textView.setText(gd.N0(2131748037, null));
                    i10 = R.raw.utyan_newborn;
                } else {
                    i11 = R.raw.filter_no_chats;
                    if (F == 2) {
                        rh0Var.setAutoRepeat(false);
                        if (this.x) {
                            textView.setText(gd.N0(2131750711, null));
                            str2 = gd.N0(2131750710, null);
                        } else {
                            textView.setText(gd.N0(2131750713, null));
                            str2 = gd.N0(2131750712, null);
                        }
                    } else if (F != 4) {
                        rh0Var.setAutoRepeat(true);
                        N0 = gd.N0(2131750796, null);
                        textView.setText(gd.N0(2131750797, null));
                        i10 = R.raw.filter_new;
                    } else {
                        rh0Var.setAutoRepeat(false);
                        textView.setText(gd.N0(2131750709, null));
                        str2 = gd.N0(2131750708, null);
                    }
                    rh0Var.setVisibility(0);
                    if (a3Var.r == 1) {
                        if (a3Var.d) {
                            a3Var.a = 1.0f;
                            String N02 = gd.N0(2131748036, null);
                            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                                N02 = N02.replace('\n', ' ');
                            }
                            hz0Var.a(N02, true, false);
                            a3Var.requestLayout();
                        } else {
                            a3Var.a(true);
                        }
                    }
                    if (a3Var.s != i11) {
                        rh0Var.f(i11, 100, 100, null);
                        rh0Var.d();
                        a3Var.s = i11;
                    }
                    if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                        str2 = str2.replace('\n', ' ');
                    }
                    hz0Var.a(str2, false, false);
                }
                int i18 = i10;
                str2 = N0;
                i11 = i18;
                rh0Var.setVisibility(0);
                if (a3Var.r == 1) {
                }
                if (a3Var.s != i11) {
                }
                if (org.telegram.messenger.g0.Q1()) {
                    str2 = str2.replace('\n', ' ');
                }
                hz0Var.a(str2, false, false);
            }
            int i19 = this.h;
            if (i19 != 7 && i19 != 8 && this.b0 != 4) {
                a3Var.setOnUtyanAnimationEndListener(new f(this, objArr == true ? 1 : 0));
                a3Var.setOnUtyanAnimationUpdateListener(new s8(this, 3));
                if (!a3Var.d && this.f == 0) {
                    cxVar.T4(0.0f);
                    for (bx bxVar : cxVar.f0) {
                        ((v4.c0) bxVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i17 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            a3Var.a(false);
                        }
                    } else if (a3Var.d && this.b0 == 0) {
                        ValueAnimator valueAnimator = a3Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        a3Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(a3Var.a, 0.0f).setDuration(250L);
                        a3Var.e = duration;
                        duration.setInterpolator(zs.d);
                        a3Var.e.addUpdateListener(new y2(a3Var, 1));
                        a3Var.e.addListener(new z2(a3Var, 0));
                        a3Var.e.start();
                    }
                } else if (!a3Var.d) {
                    a3Var.a(true);
                }
            }
        } else if (i12 == 6) {
            ((ra) view).d((TLRPC.User) J(i7), null, null, false);
        } else if (i12 == 7) {
            o4 o4Var = (o4) view;
            int i20 = this.h;
            if (i20 != 11 && i20 != 12 && i20 != 13) {
                o4Var.setText(gd.N0((this.f == 0 && this.e) ? 2131751792 : 2131742562, null));
            } else if (i7 == 0) {
                o4Var.setText(gd.N0(2131749056, null));
            } else {
                o4Var.setText(gd.N0(2131749055, null));
            }
        } else if (i12 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.U;
            if (i12 != 12) {
                switch (i12) {
                    case 14:
                        o4 o4Var2 = (o4) view;
                        o4Var2.setTextSize(14.0f);
                        if (o4Var2.getTextView() != null) {
                            t6.U(o4Var2.getTextView(), m6.y6, null);
                        } else {
                            o4Var2.setTextColor(m6.x0(null, m6.y6, false));
                        }
                        t6.h(m6.e7, o4Var2, null);
                        int i21 = ((xw) J(i7)).a;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 == 2) {
                                    o4Var2.setText(gd.N0(2131750762, null));
                                    break;
                                }
                            } else {
                                o4Var2.setText(gd.N0(2131748111, null));
                                break;
                            }
                        } else {
                            o4Var2.setText(gd.N0(2131748112, null));
                            break;
                        }
                        break;
                    case 15:
                        ((org.telegram.ui.Cells.p6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((e3) view).set(requestPeerType);
                        break;
                    case 17:
                        c3 c3Var = (c3) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((k) this.N.get(i7)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            c3Var.b(org.telegram.messenger.g0.R2(gd.G(size, "FolderUpdatesTitle", new Object[0]), m6.I6, 0, null, null), gd.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i12) {
                            case 20:
                                y3 y3Var = (y3) view;
                                if (cxVar == null || !cxVar.O0) {
                                    if (this.h == 3) {
                                        if (i7 == 0) {
                                            y3Var.setText(gd.N0(2131750569, null));
                                            break;
                                        } else {
                                            y3Var.setText(gd.N0(2131746063, null));
                                            break;
                                        }
                                    }
                                } else if (i7 == 0) {
                                    y3Var.setText(gd.N0(cxVar.R0 != 0 ? 2131746066 : 2131746064, null));
                                    break;
                                } else {
                                    y3Var.setText(gd.N0(2131746063, null));
                                    break;
                                }
                                break;
                            case 21:
                                u2 u2Var2 = (u2) view;
                                p2 p2Var = new p2();
                                p2Var.a = gd.N0(2131744530, null);
                                p2Var.b = gd.N0(2131744531, null);
                                u2Var2.t2 = false;
                                u2Var2.u2 = false;
                                u2Var2.setDialog(p2Var);
                                if (u2Var2.getMeasuredHeight() > 0 && u2Var2.getMeasuredHeight() != u2Var2.E()) {
                                    u2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((o4) view).setText((String) J(i7));
                                break;
                            case 23:
                                Object J2 = J(i7);
                                u2 u2Var3 = (u2) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) J2;
                                    u2Var3.R0 = v3.e0(i13, chat3);
                                    u2Var3.setCustomMessageWithoutRebuild(gd.G(chat3.participants_count, "Members", new Object[0]));
                                    u2Var3.d0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    u2Var3.R0 = v3.f0(i13, user);
                                    u2Var3.setCustomMessageWithoutRebuild(gd.N0(2131753153, null));
                                    u2Var3.d0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof n8)) {
                    return;
                }
                n8 n8Var = (n8) view;
                int i22 = m6.q6;
                n8Var.g(i22, i22);
                if (requestPeerType == null) {
                    n8Var.o(R.drawable.msg_groups_create, gd.N0(2131751735, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    n8Var.o(R.drawable.msg_channel_create, gd.N0(2131751740, null), true);
                } else {
                    n8Var.o(R.drawable.msg_groups_create, gd.N0(2131751734, null), true);
                }
                n8Var.y = true;
                n8Var.setOffsetFromImage(75);
            }
        } else {
            a9 a9Var = (a9) view;
            a9Var.setText(gd.N0(2131744026, null));
            if (this.P == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.P = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(m6.x0(null, m6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            m80 textView2 = a9Var.getTextView();
            if (textView2 != null) {
                t6.x(textView2, this.P, m6.B6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (cxVar == null || !cxVar.P3) ? this.P : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i7 < this.f + 1) {
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final void u(u2 u2Var) {
        int i7 = this.G;
        mp.u1(i7);
        if (mp.u1(i7).R1().K(u2Var.getDialogId())) {
            cx cxVar = this.S;
            cxVar.getOrCreateStoryViewer().getClass();
            cxVar.getOrCreateStoryViewer().J(cxVar.getParentActivity(), u2Var.getDialogId(), y6.a((ek0) u2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final void w(u2 u2Var) {
        this.S.b5(u2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [org.telegram.ui.Cells.u2] */
    /* JADX WARN: Type inference failed for: r2v11, types: [org.telegram.ui.Components.yz] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.ViewGroup, org.telegram.ui.Cells.o4] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, org.telegram.ui.Cells.v2, org.telegram.ui.Cells.z] */
    /* JADX WARN: Type inference failed for: r2v17, types: [org.telegram.ui.Cells.a3] */
    /* JADX WARN: Type inference failed for: r2v18, types: [org.telegram.ui.Cells.ra] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.View, org.telegram.ui.Cells.o4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.View, org.telegram.ui.Cells.z6] */
    /* JADX WARN: Type inference failed for: r2v21, types: [jg.l] */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.view.View, jg.i] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.p6] */
    /* JADX WARN: Type inference failed for: r2v26, types: [jg.h] */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.ui.Cells.c3] */
    /* JADX WARN: Type inference failed for: r2v28, types: [org.telegram.ui.Components.ln] */
    /* JADX WARN: Type inference failed for: r2v29, types: [android.view.ViewGroup, jg.l] */
    /* JADX WARN: Type inference failed for: r2v30, types: [org.telegram.ui.Cells.y3] */
    /* JADX WARN: Type inference failed for: r2v31, types: [org.telegram.ui.Cells.o4] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v36, types: [android.view.View, org.telegram.ui.Cells.n8] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ?? r22;
        o4 o4Var;
        int i10 = 4;
        int i11 = 3;
        long j3 = this.W;
        int i12 = 1;
        Context context = this.c;
        switch (i7) {
            case 0:
            case 21:
                int i13 = this.h;
                if (i13 == 2 || i13 == 15) {
                    r22 = new h6(context, null);
                } else {
                    u2 u2Var = new u2(this.S, this.c, false, this.G, null);
                    if (T()) {
                        s6 s6Var = new s6(this, i10);
                        u2Var.K1 = true;
                        u2Var.L1 = s6Var;
                    }
                    u2Var.setArchivedPullAnimation(this.M);
                    u2Var.setPreloader(this.Q);
                    u2Var.setDialogCellDelegate(this);
                    u2Var.setIsTransitionSupport(this.T);
                    if (i7 == 21) {
                        u2Var.H = new d7(u2Var.getContext(), u2Var, false, R.drawable.forward_to_stories, u2Var.K4);
                        u2Var.G = true;
                    }
                    if (j3 != 0) {
                        u2Var.P0 = true;
                    }
                    r22 = u2Var;
                }
                if (this.h == 15) {
                    t6.h(m6.d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new yz(context, null);
                r22.setIsSingleCell(true);
                int i14 = i7 == 13 ? 18 : 7;
                r22.setViewType(i14);
                if (i14 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i7 == 13) {
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new o4(context);
                r22.setText(gd.N0(2131746164, null));
                TextView textView = new TextView(context);
                i5.c.x(textView, 1, 15.0f);
                n10.r(textView, m6.L6, null, null, 2131746163);
                textView.setGravity((gd.a0 ? 3 : 5) | 16);
                r22.addView(textView, ma.d(-1, -1.0f, (gd.a0 ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new hi.o4(this, i11));
                break;
            case 3:
                t2 t2Var = new t2(context, i10);
                t6.h(m6.a7, t2Var, null);
                View view = new View(context);
                t6.Z(view, context, R.drawable.greydivider, m6.b7);
                t2Var.addView(view, ma.c(-1.0f, -1));
                r22 = t2Var;
                break;
            case 4:
                r22 = new v2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new b9((org.telegram.ui.ActionBar.h6) null);
                r22.x = org.telegram.messenger.g0.L(40.0f);
                r22.G = org.telegram.messenger.g0.L(10.0f);
                r22.I = j10.t0;
                m6.T(context);
                imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
                break;
            case 5:
                r22 = new a3(context);
                break;
            case 6:
                r22 = new ra(context, 8, 0, false);
                break;
            case 7:
                r22 = new o4(context);
                cx cxVar = this.S;
                if (cxVar == null || !cxVar.O0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new z6(context, (org.telegram.ui.Cells.c0) null);
                Drawable Y0 = m6.Y0(context, R.drawable.greydivider, m6.b7);
                oq oqVar = new oq(new ColorDrawable(m6.x0(null, m6.a7, false)), Y0);
                oqVar.x = true;
                r22.setBackgroundDrawable(oqVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new n8(context);
                if (this.h == 15) {
                    t6.h(m6.d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = m6.Y0(context, R.drawable.greydivider, m6.b7);
                oq oqVar2 = new oq(new ColorDrawable(m6.x0(null, m6.a7, false)), Y02);
                oqVar2.x = true;
                r22.setBackgroundDrawable(oqVar2);
                E(r22, Y02);
                break;
            case 14:
                o4 o4Var2 = new o4(this.c, m6.f7, 16, 0, false, null);
                o4Var2.setHeight(32);
                o4Var2.setClickable(false);
                o4Var = o4Var2;
                r22 = o4Var;
                break;
            case 15:
                r22 = new org.telegram.ui.Cells.p6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                t6.h(m6.a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new c3(context);
                break;
            case 18:
                r22 = new ln(context, i11);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new u6(this.c, this.G, null, new f(this, i12), null), ma.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new y3(context, null);
                break;
            case 22:
                r22 = new o4(context);
                break;
            case 23:
                ?? u2Var2 = new u2(this.S, this.c, false, this.G, null);
                o4Var = u2Var2;
                if (j3 != 0) {
                    u2Var2.P0 = true;
                    u2Var2.Q0 = true;
                    o4Var = u2Var2;
                }
                r22 = o4Var;
                break;
        }
        r22.setLayoutParams(new v4.q0(-1, (i7 == 5 || i7 == 19) ? -1 : -2));
        return new mj0(r22);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof u2) {
            u2 u2Var = (u2) view;
            u2Var.a0(this.I, false);
            u2Var.c0(this.y.contains(Long.valueOf(u2Var.getDialogId())), false);
        }
    }

    public void M(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.q2
    public void l(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public void r(u2 u2Var) {
    }

    public void K() {
    }

    public void L() {
    }
}
