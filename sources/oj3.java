// default package

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class oj3 extends n39 implements qe3 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public yi3 L;
    public dh3 M;
    public Drawable P;
    public final lj3 Q;
    public boolean R;
    public final cj3 S;
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
        boolean z = w01.a;
    }

    public oj3(cj3 cj3Var, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.S = cj3Var;
        this.h = i;
        this.r = i2;
        this.x = z;
        this.E = i2 == 0 && i == 0 && !z;
        this.y = arrayList;
        this.G = i3;
        this.W = cj3Var.a3;
        if (i2 == 0) {
            lj3 lj3Var = new lj3();
            lj3Var.a = new HashSet();
            lj3Var.b = new HashSet();
            lj3Var.c = new HashSet();
            lj3Var.d = new ArrayList();
            lj3Var.e = new jc(lj3Var, (byte) 29);
            this.Q = lj3Var;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                zkb.x(view, drawable, bkb.a7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        int i = bkb.Z6;
        k93 k93Var = new k93((byte) 11);
        k93 k93Var2 = new k93((byte) 12);
        int P = zkb.P(i, -1, 0, 0.0f, null);
        k93Var2.d(P, view);
        tkb w = zkb.w(101, view);
        w.c(i, -1, 0, 0.0f, null);
        w.n = k93Var;
        w.o = k93Var2;
        w.m = false;
        w.g = P;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 1 || i == 5 || i == 3 || i == 8 || i == 7 || i == 10 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19 || i == 20) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F() {
        boolean z;
        if (this.W == 0) {
            if (this.S.G3(this.h)) {
                z = true;
                int i = this.h;
                int i2 = this.G;
                int i3 = this.r;
                if (!z) {
                    return (i == 0 || na7.q1(i2).U1.get(i3)) ? 4 : 3;
                }
                if (i == 7 || i == 8) {
                    return na7.q1(i2).U1.get(i3) ? 2 : 3;
                }
                if (i3 != 1) {
                    return this.d != null ? 1 : 0;
                }
                return 2;
            }
        }
        z = false;
        int i4 = this.h;
        int i22 = this.G;
        int i32 = this.r;
        if (!z) {
        }
    }

    public final int G(long j) {
        for (int i = 0; i < this.N.size(); i++) {
            if (((mj3) this.N.get(i)).c != null && ((mj3) this.N.get(i)).c.id == j) {
                return i;
            }
        }
        return -1;
    }

    public final int H(int i) {
        if (this.F) {
            i--;
        }
        if (this.E) {
            i = ir2.k(2, i, na7.q1(this.G).s);
        }
        if (this.n && this.h == 3) {
            i--;
        }
        int i2 = this.h;
        return (i2 == 11 || i2 == 13) ? i - 2 : i2 == 12 ? i - 1 : i;
    }

    public final t97 I() {
        int i = this.h;
        if (i == 7 || i == 8) {
            return na7.q1(this.G).N[this.h - 7];
        }
        return null;
    }

    public final Object J(int i) {
        if (i < 0 || i >= this.N.size()) {
            return null;
        }
        mj3 mj3Var = (mj3) this.N.get(i);
        String str = mj3Var.l;
        TLRPC.TL_contact tL_contact = mj3Var.e;
        if (str != null) {
            return str;
        }
        TLRPC.Chat chat = mj3Var.m;
        if (chat != null) {
            return chat;
        }
        TLRPC.User user = mj3Var.n;
        if (user != null) {
            return user;
        }
        TLRPC.Dialog dialog = mj3Var.c;
        if (dialog != null) {
            return dialog;
        }
        if (tL_contact != null) {
            return na7.q1(this.G).V1(Long.valueOf(tL_contact.user_id));
        }
        TLRPC.RecentMeUrl recentMeUrl = mj3Var.d;
        if (recentMeUrl != null) {
            return recentMeUrl;
        }
        return null;
    }

    public final void N(o39 o39Var, boolean z) {
        this.K = z;
        for (int i = 0; i < o39Var.getChildCount(); i++) {
            if (o39Var.getChildAt(i) instanceof ue3) {
                ((ue3) o39Var.getChildAt(i)).f = z;
            }
        }
        for (int i2 = 0; i2 < o39Var.getCachedChildCount(); i2++) {
            if (o39Var.P(i2) instanceof ue3) {
                ((ue3) o39Var.P(i2)).f = z;
            }
        }
        for (int i3 = 0; i3 < o39Var.getHiddenChildCount(); i3++) {
            if (o39Var.W(i3) instanceof ue3) {
                ((ue3) o39Var.W(i3)).f = z;
            }
        }
        for (int i4 = 0; i4 < o39Var.getAttachedScrapChildCount(); i4++) {
            if (o39Var.O(i4) instanceof ue3) {
                ((ue3) o39Var.O(i4)).f = z;
            }
        }
    }

    public boolean O() {
        return false;
    }

    public final void P(boolean z) {
        int i = this.G;
        if (this.d != null) {
            if (!z || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                byte b = 1;
                try {
                    int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                    Collections.sort(this.d, new st2(na7.q1(i), currentTime, b));
                    if (z) {
                        f();
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    public final void Q() {
        this.E = this.r == 0 && this.h == 0 && !this.x && !na7.q1(this.G).s.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x01c5, code lost:
    
        if (r11 != r16) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04e2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        long j;
        ArrayList m3;
        int i;
        boolean z;
        int i2;
        int i3;
        TLRPC.Dialog dialog;
        boolean z2;
        int i4;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i5;
        ArrayList arrayList;
        int i6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3;
        TLRPC.Dialog dialog2;
        int i7;
        boolean z4;
        int i8;
        TLRPC.Dialog dialog3;
        ArrayList arrayList4;
        String M0;
        ArrayList arrayList5;
        long j2 = this.W;
        int i9 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        ArrayList arrayList6 = this.N;
        int i10 = this.G;
        if (i9 != 0) {
            arrayList6.clear();
            Q();
            c5a u = na7.q1(i10).u(j2);
            ArrayList arrayList7 = (ArrayList) u.b;
            int size = arrayList7.size();
            ArrayList arrayList8 = (ArrayList) u.c;
            int size2 = arrayList8.size() + size;
            ArrayList arrayList9 = (ArrayList) u.d;
            int size3 = arrayList9.size() + size2;
            ArrayList arrayList10 = (ArrayList) u.e;
            this.f = arrayList10.size() + size3;
            this.V = false;
            int i11 = this.h == 3 ? 2 : 4;
            for (int i12 = 0; i12 < i11; i12++) {
                if (i12 == 0) {
                    M0 = k96.M0(2131751866, null);
                    arrayList5 = arrayList7;
                } else if (i12 == 1) {
                    M0 = k96.M0(2131751863, null);
                    arrayList5 = arrayList8;
                } else if (i12 == 2) {
                    M0 = k96.M0(2131751864, null);
                    arrayList5 = arrayList9;
                } else {
                    M0 = k96.M0(2131751861, null);
                    arrayList5 = arrayList10;
                }
                if (!arrayList5.isEmpty()) {
                    this.N.add(new mj3(this, M0));
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        s97 s97Var = (s97) arrayList5.get(i13);
                        TLRPC.Dialog dialog4 = s97Var.d;
                        if (dialog4 != null) {
                            this.N.add(new mj3(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = s97Var.b;
                            if (chat != null) {
                                this.N.add(new mj3(this, chat));
                            } else {
                                TLRPC.User user = s97Var.c;
                                if (user != null) {
                                    this.N.add(new mj3(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        arrayList6.clear();
        Q();
        na7 q1 = na7.q1(i10);
        int i14 = this.r;
        cj3 cj3Var = this.S;
        if (i9 != 0) {
            m3 = (ArrayList) q1.x.f(j2);
            if (m3 == null) {
                m3 = new ArrayList();
            }
            j = 0;
        } else {
            j = 0;
            m3 = cj3Var.m3(i10, this.h, i14, this.H);
            if (m3 == null) {
                m3 = new ArrayList();
            }
        }
        int size4 = m3.size();
        this.f = size4;
        this.V = false;
        if (size4 == 0 && cj3Var.D3()) {
            ir2.s(this, 19, this.N);
            return;
        }
        if (this.E || this.h != 0 || i14 != 0 || !q1.U1.get(i14) || this.e) {
            i = i9;
            z = true;
            i2 = i14;
        } else if (q1.B0() > 10 || !qu2.r(i10).n || qu2.r(i10).f0.isEmpty()) {
            i = i9;
            z = true;
            i2 = i14;
            this.d = null;
        } else {
            this.d = new ArrayList(qu2.r(i10).f0);
            i = i9;
            long j3 = y6c.h(i10).n;
            int size5 = this.d.size();
            z = true;
            int i15 = 0;
            while (true) {
                arrayList4 = this.d;
                if (i15 >= size5) {
                    break;
                }
                int i16 = i14;
                long j4 = ((TLRPC.TL_contact) arrayList4.get(i15)).user_id;
                if (j4 == j3 || q1.R.f(j4) != null) {
                    this.d.remove(i15);
                    i15--;
                    size5--;
                }
                i15++;
                i14 = i16;
            }
            i2 = i14;
            if (arrayList4.isEmpty()) {
                this.d = null;
            } else {
                P(false);
            }
        }
        t97 I = I();
        if ((I == null || I.d()) && cj3Var.O0) {
            long j5 = cj3Var.R0;
            if (j5 == j) {
                j5 = cj3Var.Q0;
            }
            ir2.s(this, 20, this.N);
            int i17 = 0;
            while (true) {
                if (i17 >= m3.size()) {
                    i3 = i10;
                    dialog = null;
                    break;
                }
                i3 = i10;
                if (((TLRPC.Dialog) m3.get(i17)).id == j5) {
                    dialog = (TLRPC.Dialog) m3.get(i17);
                    break;
                } else {
                    i17++;
                    i10 = i3;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = j5;
            }
            this.N.add(new mj3(this, 0, dialog));
            ir2.s(this, 20, this.N);
            z2 = false;
            this.F = z2;
            i4 = this.h;
            if ((i4 != 7 || i4 == 8) && I != null && I.c()) {
                q1.D(I.a, false);
                q97 q97Var = (q97) q1.d0.get(I.a);
                tL_chatlists_chatlistUpdates = q97Var == null ? null : q97Var.c;
                if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                    this.F = z;
                    this.N.add(new mj3(this, tL_chatlists_chatlistUpdates));
                }
            }
            requestPeerType = this.U;
            if (requestPeerType != null) {
                ir2.s(this, 15, this.N);
            }
            if (!this.K || this.T) {
                for (i5 = 0; i5 < m3.size(); i5++) {
                    if (this.h == 2 && (m3.get(i5) instanceof xi3)) {
                        this.N.add(new mj3(this, 14, (TLRPC.Dialog) m3.get(i5)));
                    } else {
                        this.N.add(new mj3(this, 0, (TLRPC.Dialog) m3.get(i5)));
                    }
                }
                ir2.s(this, 10, this.N);
            }
            boolean z5 = j2 == j && cj3Var.G3(this.h);
            boolean z6 = z5 && this.f > 0;
            if (z6) {
                int i18 = 0;
                while (true) {
                    if (i18 >= m3.size()) {
                        break;
                    }
                    if (!(m3.get(i18) instanceof TLRPC.TL_dialogFolder)) {
                        z6 = false;
                        break;
                    }
                    i18++;
                }
            }
            if (this.f == 0 && this.e && !z5) {
                this.V = true;
                ArrayList arrayList11 = this.N;
                if (requestPeerType != null) {
                    ir2.s(this, 16, arrayList11);
                } else {
                    arrayList11.add(new mj3(this, F(), 0));
                }
                ir2.s(this, 8, this.N);
                ir2.s(this, 7, this.N);
                ir2.s(this, 13, this.N);
            } else {
                ArrayList arrayList12 = this.d;
                if (arrayList12 != null && !arrayList12.isEmpty() && (i6 = this.h) != 7 && i6 != 8 && !z5) {
                    if (this.f == 0) {
                        this.V = true;
                        ArrayList arrayList13 = this.N;
                        if (requestPeerType != null) {
                            ir2.s(this, 16, arrayList13);
                        } else {
                            arrayList13.add(new mj3(this, F(), 0));
                        }
                        ir2.s(this, 8, this.N);
                        ir2.s(this, 7, this.N);
                    } else {
                        int i19 = 0;
                        while (true) {
                            int size6 = m3.size();
                            arrayList2 = this.N;
                            if (i19 >= size6) {
                                break;
                            }
                            arrayList2.add(new mj3(this, 0, (TLRPC.Dialog) m3.get(i19)));
                            i19++;
                        }
                        ir2.s(this, 8, arrayList2);
                        ir2.s(this, 7, this.N);
                    }
                    int i20 = 0;
                    while (true) {
                        int size7 = this.d.size();
                        arrayList3 = this.N;
                        if (i20 >= size7) {
                            break;
                        }
                        arrayList3.add(new mj3(this, (TLRPC.TL_contact) this.d.get(i20)));
                        i20++;
                    }
                    ir2.s(this, 10, arrayList3);
                    z3 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        ir2.s(this, 12, this.N);
                    }
                    if (this.n && this.h == 3) {
                        ir2.s(this, 21, this.N);
                    }
                    if (!z3) {
                        for (int i21 = 0; i21 < m3.size(); i21++) {
                            if (this.h == 2 && (m3.get(i21) instanceof xi3)) {
                                this.N.add(new mj3(this, 14, (TLRPC.Dialog) m3.get(i21)));
                            } else {
                                this.N.add(new mj3(this, 0, (TLRPC.Dialog) m3.get(i21)));
                            }
                        }
                        if (i != 0 || this.R || (i8 = this.h) == 7 || i8 == 8) {
                            i7 = i2;
                        } else {
                            i7 = i2;
                            if (!na7.q1(i3).U1.get(i7)) {
                                if (this.f != 0) {
                                    ir2.s(this, 1, this.N);
                                }
                                ir2.s(this, 10, this.N);
                            }
                        }
                        int i22 = this.f;
                        if (i22 == 0) {
                            z4 = true;
                        } else if (z6) {
                            z4 = false;
                        } else {
                            if (i7 == 0 && i22 > 10 && this.h == 0) {
                                ir2.s(this, 11, this.N);
                            }
                            ir2.s(this, 10, this.N);
                        }
                        this.V = z4;
                        ArrayList arrayList14 = this.N;
                        if (requestPeerType != null) {
                            ir2.s(this, 16, arrayList14);
                        } else {
                            arrayList14.add(new mj3(this, F(), 0));
                        }
                    }
                    if (q1.I0.isEmpty()) {
                        int i23 = 0;
                        while (i23 < this.N.size()) {
                            mj3 mj3Var = (mj3) this.N.get(i23);
                            if (mj3Var.a == 0 && (dialog2 = mj3Var.c) != null && q1.u2(dialog2.id)) {
                                this.N.remove(i23);
                                i23--;
                            }
                            i23++;
                        }
                        return;
                    }
                    return;
                }
                if (this.E) {
                    int size8 = na7.q1(i3).s.size();
                    ir2.s(this, 2, this.N);
                    int i24 = 0;
                    while (true) {
                        arrayList = this.N;
                        if (i24 >= size8) {
                            break;
                        }
                        arrayList.add(new mj3(this, (TLRPC.RecentMeUrl) na7.q1(i3).s.get(i24)));
                        i24++;
                    }
                    ir2.s(this, 3, arrayList);
                } else {
                    int i25 = this.h;
                    if (i25 == 11 || i25 == 13) {
                        ir2.s(this, 7, this.N);
                        ir2.s(this, 12, this.N);
                    } else if (i25 == 12) {
                        ir2.s(this, 7, this.N);
                    }
                }
            }
            z3 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            ir2.s(this, 12, this.N);
            if (this.n) {
                ir2.s(this, 21, this.N);
            }
            if (!z3) {
            }
            if (q1.I0.isEmpty()) {
            }
        }
        i3 = i10;
        if ((I == null || I.d()) && this.h == 3 && cj3Var.S0 != j) {
            ir2.s(this, 20, this.N);
            int i26 = 0;
            while (true) {
                if (i26 >= m3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (((TLRPC.Dialog) m3.get(i26)).id == cj3Var.S0) {
                        dialog3 = (TLRPC.Dialog) m3.get(i26);
                        break;
                    }
                    i26++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = cj3Var.S0;
            }
            z2 = false;
            this.N.add(new mj3(this, 0, dialog3));
            ir2.s(this, 20, this.N);
            this.F = z2;
            i4 = this.h;
            if (i4 != 7) {
            }
            q1.D(I.a, false);
            q97 q97Var2 = (q97) q1.d0.get(I.a);
            if (q97Var2 == null) {
            }
            if (tL_chatlists_chatlistUpdates != null) {
                this.F = z;
                this.N.add(new mj3(this, tL_chatlists_chatlistUpdates));
            }
            requestPeerType = this.U;
            if (requestPeerType != null) {
            }
            if (this.K) {
            }
            while (i5 < m3.size()) {
            }
            ir2.s(this, 10, this.N);
        }
        z2 = false;
        this.F = z2;
        i4 = this.h;
        if (i4 != 7) {
        }
        q1.D(I.a, false);
        q97 q97Var22 = (q97) q1.d0.get(I.a);
        if (q97Var22 == null) {
        }
        if (tL_chatlists_chatlistUpdates != null) {
        }
        requestPeerType = this.U;
        if (requestPeerType != null) {
        }
        if (this.K) {
        }
        while (i5 < m3.size()) {
        }
        ir2.s(this, 10, this.N);
    }

    public final void S(zg3 zg3Var) {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        R();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        ij3 ij3Var = new ij3(this, arrayList2, (byte) 0);
        arrayList3.size();
        gm2 a = vu7.a(ij3Var, true);
        this.a0 = false;
        if (zg3Var != null) {
            zg3Var.run();
        }
        this.N = arrayList2;
        a.c(this);
    }

    @Override // w39
    public final int b() {
        int size = this.N.size();
        this.w = size;
        return size;
    }

    @Override // w39
    public final long c(int i) {
        return ((mj3) this.N.get(i)).k;
    }

    @Override // w39
    public final int d(int i) {
        return ((mj3) this.N.get(i)).a;
    }

    @Override // w39
    public void f() {
        if (this.a0) {
            this.N = new ArrayList();
        }
        this.a0 = false;
        R();
        super.f();
    }

    @Override // qe3
    public final void k(ue3 ue3Var) {
        int i = this.G;
        na7.q1(i);
        if (na7.q1(i).M1().J(ue3Var.getDialogId())) {
            cj3 cj3Var = this.S;
            cj3Var.getOrCreateStoryViewer().getClass();
            cj3Var.getOrCreateStoryViewer().H(cj3Var.getParentActivity(), ue3Var.getDialogId(), p2b.a((o39) ue3Var.getParent()));
        }
    }

    @Override // qe3
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override // qe3
    public final void s() {
        g2b M1 = na7.q1(this.G).M1();
        ArrayList arrayList = M1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = M1.D(0, cf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = cf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || M1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        this.S.getOrCreateStoryViewer().K(this.c, null, arrayList2, 0, null, null, new p2b(this.L, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        String str2;
        String H;
        TLRPC.Chat K0;
        String M0;
        int i2;
        String str3;
        int i3;
        int i4 = s49Var.f;
        View view = s49Var.a;
        int i5 = this.G;
        cj3 cj3Var = this.S;
        Object[] objArr = 0;
        if (i4 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i);
            Object J = J(i + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i6 = this.h;
            ArrayList arrayList = this.y;
            if (i6 == 2 || i6 == 15) {
                rr8 rr8Var = (rr8) view;
                long dialogId = rr8Var.getDialogId();
                if (dialog.id != 0) {
                    chat = na7.q1(i5).K0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (K0 = na7.q1(i5).K0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = K0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str4 = chat.title;
                    if (!hc2.T(chat) || chat.megagroup) {
                        int i7 = chat.participants_count;
                        H = i7 != 0 ? k96.H(',', "Members", i7) : chat.has_geo ? k96.M0(2131748450, null) : !hc2.t0(chat) ? k96.M0(2131748449, null).toLowerCase() : k96.M0(2131748446, null).toLowerCase();
                    } else {
                        int i8 = chat.participants_count;
                        H = i8 != 0 ? k96.H(',', "Subscribers", i8) : !hc2.t0(chat) ? k96.M0(2131752317, null).toLowerCase() : k96.M0(2131752306, null).toLowerCase();
                    }
                    str2 = str4;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(dialog.id));
                    if (V1 != 0) {
                        String r = l7c.r(V1);
                        if (l7c.B(V1)) {
                            chat2 = V1;
                            str = "";
                        } else {
                            chat2 = V1;
                            str = V1.bot ? k96.M0(2131753153, null) : k96.d0(i5, V1, null, null);
                        }
                        str2 = r;
                    } else {
                        str = "";
                        chat2 = null;
                        str2 = null;
                    }
                }
                rr8Var.N = dialog2 != null;
                rr8Var.z(chat2, null, str2, str, false, false);
                rr8Var.y(arrayList.contains(Long.valueOf(rr8Var.getDialogId())), dialogId == rr8Var.getDialogId());
                if (i < this.f + 1) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            }
            ue3 ue3Var = (ue3) view;
            ue3Var.R0 = this.W != 0 && hc2.d0(i5, dialog.id);
            ue3Var.t2 = false;
            ue3Var.u2 = false;
            if (this.h == 0 && gl.O1()) {
                ue3Var.setDialogSelected(dialog.id == this.s);
            }
            ue3Var.e0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i == 1 && cj3Var.O0 && cj3Var.R0 != 0 && dialog.top_message == 0) {
                t97 I = I();
                ue3Var.setCustomMessage((I == null || I.d()) ? k96.M0(2131746068, null) : null);
            } else if (i == 1 && cj3Var.O0 && cj3Var.Q0 != 0 && dialog.top_message == 0) {
                t97 I2 = I();
                if (I2 == null || I2.d()) {
                    ue3Var.setCustomMessage(cf3.v(cj3Var.Q0));
                } else {
                    ue3Var.setCustomMessage(null);
                }
            } else if (i == 1 && this.h == 3 && cj3Var.S0 != 0 && dialog.top_message == 0) {
                t97 I3 = I();
                if (I3 == null || I3.d()) {
                    ue3Var.setCustomMessage(cf3.v(cj3Var.S0));
                } else {
                    ue3Var.setCustomMessage(null);
                }
            } else {
                ue3Var.setCustomMessage(null);
            }
            ue3Var.g0(dialog, this.h, this.r);
            if (ue3Var.getMeasuredHeight() > 0 && ue3Var.getMeasuredHeight() != ue3Var.I()) {
                ue3Var.requestLayout();
            }
            boolean z = ue3Var.f;
            boolean z2 = this.K;
            if (z != z2) {
                ue3Var.f = z2;
                ue3Var.requestLayout();
            }
            lj3 lj3Var = this.Q;
            if (lj3Var != null && i < 10) {
                long j = dialog.id;
                ArrayList arrayList2 = lj3Var.d;
                if (!lj3Var.a.contains(Long.valueOf(j)) && !lj3Var.b.contains(Long.valueOf(j)) && !lj3Var.c.contains(Long.valueOf(j)) && !arrayList2.contains(Long.valueOf(j))) {
                    arrayList2.add(Long.valueOf(j));
                }
            }
        } else if (i4 == 4) {
            ((af3) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i));
        } else if (i4 == 5) {
            ck3 ck3Var = (ck3) view;
            int i9 = this.b0;
            int F = F();
            this.b0 = F;
            ajb ajbVar = ck3Var.n;
            TextView textView = ck3Var.h;
            ry8 ry8Var = ck3Var.f;
            if (ck3Var.r != F) {
                ck3Var.r = F;
                if (F == 0 || F == 1) {
                    M0 = k96.M0(2131748036, null);
                    textView.setText(k96.M0(2131748038, null));
                    i2 = R.raw.utyan_newborn;
                } else {
                    i3 = R.raw.filter_no_chats;
                    if (F == 2) {
                        ry8Var.setAutoRepeat(false);
                        if (this.x) {
                            textView.setText(k96.M0(2131750711, null));
                            str3 = k96.M0(2131750710, null);
                        } else {
                            textView.setText(k96.M0(2131750713, null));
                            str3 = k96.M0(2131750712, null);
                        }
                    } else if (F != 4) {
                        ry8Var.setAutoRepeat(true);
                        M0 = k96.M0(2131750796, null);
                        textView.setText(k96.M0(2131750797, null));
                        i2 = R.raw.filter_new;
                    } else {
                        ry8Var.setAutoRepeat(false);
                        textView.setText(k96.M0(2131750709, null));
                        str3 = k96.M0(2131750708, null);
                    }
                    ry8Var.setVisibility(0);
                    if (ck3Var.r == 1) {
                        if (ck3Var.d) {
                            ck3Var.a = 1.0f;
                            String M02 = k96.M0(2131748037, null);
                            if (gl.O1() && !gl.N1()) {
                                M02 = M02.replace('\n', ' ');
                            }
                            ajbVar.a(M02, true, false);
                            ck3Var.requestLayout();
                        } else {
                            ck3Var.a(true);
                        }
                    }
                    if (ck3Var.s != i3) {
                        ry8Var.f(i3, 100, 100, null);
                        ry8Var.d();
                        ck3Var.s = i3;
                    }
                    if (gl.O1() && !gl.N1()) {
                        str3 = str3.replace('\n', ' ');
                    }
                    ajbVar.a(str3, false, false);
                }
                int i10 = i2;
                str3 = M0;
                i3 = i10;
                ry8Var.setVisibility(0);
                if (ck3Var.r == 1) {
                }
                if (ck3Var.s != i3) {
                }
                if (gl.O1()) {
                    str3 = str3.replace('\n', ' ');
                }
                ajbVar.a(str3, false, false);
            }
            int i11 = this.h;
            if (i11 != 7) {
                byte b = 8;
                if (i11 != 8 && this.b0 != 4) {
                    ck3Var.setOnUtyanAnimationEndListener(new gj3(this, objArr == true ? 1 : 0));
                    ck3Var.setOnUtyanAnimationUpdateListener(new gw(this, b));
                    if (!ck3Var.d && this.f == 0) {
                        cj3Var.P4(0.0f);
                        for (bj3 bj3Var : cj3Var.f0) {
                            ((t26) bj3Var.a.getLayoutManager()).u = true;
                        }
                    }
                    if (this.d == null || i9 != 0) {
                        if (this.e) {
                            if (this.f == 0) {
                                ck3Var.a(false);
                            }
                        } else if (ck3Var.d && this.b0 == 0) {
                            ValueAnimator valueAnimator = ck3Var.e;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ck3Var.d = false;
                            ValueAnimator duration = ValueAnimator.ofFloat(ck3Var.a, 0.0f).setDuration(250L);
                            ck3Var.e = duration;
                            duration.setInterpolator(ls3.d);
                            ck3Var.e.addUpdateListener(new ak3(ck3Var, (byte) 1));
                            ck3Var.e.addListener(new bk3(ck3Var, (byte) 0));
                            ck3Var.e.start();
                        }
                    } else if (!ck3Var.d) {
                        ck3Var.a(true);
                    }
                }
            }
        } else if (i4 == 6) {
            ((v6c) view).d((TLRPC.User) J(i), null, null, false);
        } else if (i4 == 7) {
            ld5 ld5Var = (ld5) view;
            int i12 = this.h;
            if (i12 != 11 && i12 != 12 && i12 != 13) {
                ld5Var.setText(k96.M0((this.f == 0 && this.e) ? 2131751792 : 2131742563, null));
            } else if (i == 0) {
                ld5Var.setText(k96.M0(2131749057, null));
            } else {
                ld5Var.setText(k96.M0(2131749056, null));
            }
        } else if (i4 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.U;
            if (i4 != 12) {
                switch (i4) {
                    case 14:
                        ld5 ld5Var2 = (ld5) view;
                        ld5Var2.setTextSize(14.0f);
                        if (ld5Var2.getTextView() != null) {
                            zkb.X(ld5Var2.getTextView(), bkb.x6, null);
                        } else {
                            ld5Var2.setTextColor(bkb.w0(null, bkb.x6, false));
                        }
                        zkb.h(bkb.d7, null, ld5Var2);
                        byte b2 = ((xi3) J(i)).a;
                        if (b2 != 0) {
                            if (b2 != 1) {
                                if (b2 == 2) {
                                    ld5Var2.setText(k96.M0(2131750762, null));
                                    break;
                                }
                            } else {
                                ld5Var2.setText(k96.M0(2131748112, null));
                                break;
                            }
                        } else {
                            ld5Var2.setText(k96.M0(2131748113, null));
                            break;
                        }
                        break;
                    case 15:
                        ((l89) view).set(requestPeerType);
                        break;
                    case 16:
                        ((lk3) view).set(requestPeerType);
                        break;
                    case 17:
                        dk3 dk3Var = (dk3) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((mj3) this.N.get(i)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            dk3Var.b(gl.N2(k96.G(size, "FolderUpdatesTitle", new Object[0]), bkb.H6, 0, null, null), k96.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i4) {
                            case 20:
                                l35 l35Var = (l35) view;
                                if (cj3Var.O0) {
                                    if (i == 0) {
                                        l35Var.setText(k96.M0(cj3Var.R0 != 0 ? 2131746069 : 2131746067, null));
                                        break;
                                    } else {
                                        l35Var.setText(k96.M0(2131746066, null));
                                        break;
                                    }
                                } else if (this.h == 3) {
                                    if (i == 0) {
                                        l35Var.setText(k96.M0(2131750569, null));
                                        break;
                                    } else {
                                        l35Var.setText(k96.M0(2131746066, null));
                                        break;
                                    }
                                }
                                break;
                            case 21:
                                ue3 ue3Var2 = (ue3) view;
                                pe3 pe3Var = new pe3();
                                pe3Var.a = k96.M0(2131744534, null);
                                pe3Var.b = k96.M0(2131744535, null);
                                ue3Var2.t2 = false;
                                ue3Var2.u2 = false;
                                ue3Var2.setDialog(pe3Var);
                                if (ue3Var2.getMeasuredHeight() > 0 && ue3Var2.getMeasuredHeight() != ue3Var2.I()) {
                                    ue3Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((ld5) view).setText((String) J(i));
                                break;
                            case 23:
                                Object J2 = J(i);
                                ue3 ue3Var3 = (ue3) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) J2;
                                    ue3Var3.R0 = hc2.e0(i5, chat3);
                                    ue3Var3.setCustomMessageWithoutRebuild(k96.G(chat3.participants_count, "Members", new Object[0]));
                                    ue3Var3.f0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    ue3Var3.R0 = hc2.f0(i5, user);
                                    ue3Var3.setCustomMessageWithoutRebuild(k96.M0(2131753153, null));
                                    ue3Var3.f0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof wgb)) {
                    return;
                }
                wgb wgbVar = (wgb) view;
                int i13 = bkb.p6;
                wgbVar.g(i13, i13);
                if (requestPeerType == null) {
                    wgbVar.o(R.drawable.msg_groups_create, k96.M0(2131751735, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    wgbVar.o(R.drawable.msg_channel_create, k96.M0(2131751740, null), true);
                } else {
                    wgbVar.o(R.drawable.msg_groups_create, k96.M0(2131751734, null), true);
                }
                wgbVar.y = true;
                wgbVar.setOffsetFromImage(75);
            }
        } else {
            mhb mhbVar = (mhb) view;
            mhbVar.setText(k96.M0(2131744026, null));
            if (this.P == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.P = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.A6, false), PorterDuff.Mode.MULTIPLY));
            }
            l46 textView2 = mhbVar.getTextView();
            if (textView2 != null) {
                zkb.x(textView2, this.P, bkb.A6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(gl.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, cj3Var.P3 ? null : this.P, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i < this.f + 1) {
        }
    }

    @Override // qe3
    public final void v(ue3 ue3Var) {
        this.S.Y4(ue3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [d62] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pi4] */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.view.View, ue3] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.ViewGroup, ld5] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        View view;
        ?? pi4Var;
        View view2;
        cj3 cj3Var = this.S;
        long j = this.W;
        byte b = 0;
        byte b2 = 1;
        Context context = this.c;
        switch (i) {
            case 0:
            case 21:
                int i2 = this.h;
                if (i2 == 2 || i2 == 15) {
                    wjbVar = null;
                    view = new rr8(context, null);
                } else {
                    wjbVar = null;
                    ?? ue3Var = new ue3(cj3Var, this.c, false, this.G, null);
                    if (O()) {
                        hj3 hj3Var = new hj3(this, b);
                        ue3Var.K1 = true;
                        ue3Var.L1 = hj3Var;
                    }
                    ue3Var.setArchivedPullAnimation(this.M);
                    ue3Var.setPreloader(this.Q);
                    ue3Var.setDialogCellDelegate(this);
                    ue3Var.setIsTransitionSupport(this.T);
                    if (i == 21) {
                        ue3Var.H = new vaa(ue3Var.getContext(), ue3Var, false, R.drawable.forward_to_stories, ue3Var.K4);
                        ue3Var.G = true;
                    }
                    if (j != 0) {
                        ue3Var.P0 = true;
                    }
                    view = ue3Var;
                }
                view2 = view;
                if (this.h == 15) {
                    zkb.h(bkb.c6, wjbVar, view);
                    view2 = view;
                    break;
                }
                break;
            case 1:
            case 13:
                pi4Var = new pi4(context, null);
                pi4Var.setIsSingleCell(true);
                r2 = i == 13 ? (byte) 18 : (byte) 7;
                pi4Var.setViewType(r2);
                if (r2 == 18) {
                    pi4Var.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    pi4Var.setItemsCount((int) ((gl.q.y * 0.5f) / gl.L(64.0f)));
                }
                view2 = pi4Var;
                break;
            case 2:
                ?? ld5Var = new ld5(context);
                ld5Var.setText(k96.M0(2131746167, null));
                TextView textView = new TextView(context);
                ir2.t(textView, 1, 15.0f);
                ug8.x(textView, bkb.K6, null, null, 2131746166);
                textView.setGravity((k96.a0 ? 3 : 5) | 16);
                ld5Var.addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new x91(this, (byte) 29));
                view2 = ld5Var;
                break;
            case 3:
                ViewGroup a6Var = new a6(context, (byte) 11);
                zkb.h(bkb.Z6, null, a6Var);
                View view3 = new View(context);
                zkb.Z(view3, context, R.drawable.greydivider, bkb.a7);
                a6Var.addView(view3, nme.c(-1.0f, -1));
                view2 = a6Var;
                break;
            case 4:
                af3 af3Var = new af3(context);
                ImageReceiver imageReceiver = new ImageReceiver(af3Var);
                af3Var.h = imageReceiver;
                af3Var.n = new pb0((wjb) null);
                af3Var.x = gl.L(40.0f);
                af3Var.G = gl.L(10.0f);
                af3Var.I = y6c.t0;
                bkb.S(context);
                imageReceiver.q0(gl.L(26.0f));
                view2 = af3Var;
                break;
            case 5:
                view2 = new ck3(context);
                break;
            case 6:
                view2 = new v6c(context, 8, 0, false);
                break;
            case 7:
                View ld5Var2 = new ld5(context);
                view2 = ld5Var2;
                if (!cj3Var.O0) {
                    ld5Var2.setPadding(0, 0, 0, gl.L(12.0f));
                    view2 = ld5Var2;
                    break;
                }
                break;
            case 8:
                View b9aVar = new b9a(context, (de9) null);
                Drawable W0 = bkb.W0(context, R.drawable.greydivider, bkb.a7);
                fm2 fm2Var = new fm2(new ColorDrawable(bkb.w0(null, bkb.Z6, false)), W0);
                fm2Var.x = true;
                b9aVar.setBackgroundDrawable(fm2Var);
                E(b9aVar, W0);
                view2 = b9aVar;
                break;
            case 9:
            case 12:
            default:
                View wgbVar = new wgb(context);
                view2 = wgbVar;
                if (this.h == 15) {
                    zkb.h(bkb.c6, null, wgbVar);
                    view2 = wgbVar;
                    break;
                }
                break;
            case 10:
                view2 = new nj3(this, context);
                break;
            case 11:
                View kj3Var = new kj3(this, context);
                Drawable W02 = bkb.W0(context, R.drawable.greydivider, bkb.a7);
                fm2 fm2Var2 = new fm2(new ColorDrawable(bkb.w0(null, bkb.Z6, false)), W02);
                fm2Var2.x = true;
                kj3Var.setBackgroundDrawable(fm2Var2);
                E(kj3Var, W02);
                view2 = kj3Var;
                break;
            case 14:
                ld5 ld5Var3 = new ld5(this.c, bkb.e7, 16, 0, false, null);
                ld5Var3.setHeight(32);
                ld5Var3.setClickable(false);
                view2 = ld5Var3;
                break;
            case 15:
                l89 l89Var = new l89(context);
                l89Var.b = new ArrayList();
                l89Var.setOrientation(1);
                zkb.h(bkb.Z6, null, l89Var);
                view2 = l89Var;
                break;
            case 16:
                view2 = new jj3(this, context);
                break;
            case 17:
                view2 = new dk3(context);
                break;
            case 18:
                pi4Var = new d62(context, r2);
                view2 = pi4Var;
                break;
            case 19:
                ViewGroup nj3Var = new nj3(this, context);
                nj3Var.addView(new yr(this.c, this.G, null, new gj3(this, b2), null), nme.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                view2 = nj3Var;
                break;
            case 20:
                view2 = new l35(context, null);
                break;
            case 22:
                view2 = new ld5(context);
                break;
            case 23:
                ue3 ue3Var2 = new ue3(cj3Var, this.c, false, this.G, null);
                if (j != 0) {
                    ue3Var2.P0 = true;
                    ue3Var2.Q0 = true;
                }
                view2 = ue3Var2;
                break;
        }
        view2.setLayoutParams(new e49(-1, (i == 5 || i == 19) ? -1 : -2));
        return new y29(view2);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof ue3) {
            ue3 ue3Var = (ue3) view;
            ue3Var.c0(this.I, false);
            ue3Var.e0(this.y.contains(Long.valueOf(ue3Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    public void o(ue3 ue3Var) {
    }

    public void w(ue3 ue3Var) {
    }
}
