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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class gk3 extends c79 implements kf3 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public qj3 L;
    public xh3 M;
    public Drawable P;
    public final dk3 Q;
    public boolean R;
    public final uj3 S;
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
        boolean z = f11.a;
    }

    public gk3(uj3 uj3Var, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.S = uj3Var;
        this.h = i;
        this.r = i2;
        this.x = z;
        this.E = i2 == 0 && i == 0 && !z;
        this.y = arrayList;
        this.G = i3;
        this.W = uj3Var.a3;
        if (i2 == 0) {
            dk3 dk3Var = new dk3();
            dk3Var.a = new HashSet();
            dk3Var.b = new HashSet();
            dk3Var.c = new HashSet();
            dk3Var.d = new ArrayList();
            dk3Var.e = new kc(dk3Var, (byte) 29);
            this.Q = dk3Var;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                yob.x(view, drawable, aob.b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        int i = aob.a7;
        da3 da3Var = new da3((byte) 17);
        da3 da3Var2 = new da3((byte) 18);
        int P = yob.P(i, -1, 0, 0.0f, null);
        da3Var2.e(P, view);
        sob w = yob.w(101, view);
        w.c(i, -1, 0, 0.0f, null);
        w.n = da3Var;
        w.o = da3Var2;
        w.m = false;
        w.g = P;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
            if (this.S.I3(this.h)) {
                z = true;
                int i = this.h;
                int i2 = this.G;
                int i3 = this.r;
                if (!z) {
                    return (i == 0 || uc7.s1(i2).U1.get(i3)) ? 4 : 3;
                }
                if (i == 7 || i == 8) {
                    return uc7.s1(i2).U1.get(i3) ? 2 : 3;
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
            if (((ek3) this.N.get(i)).c != null && ((ek3) this.N.get(i)).c.id == j) {
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
            i = bs2.k(2, i, uc7.s1(this.G).s);
        }
        if (this.n && this.h == 3) {
            i--;
        }
        int i2 = this.h;
        return (i2 == 11 || i2 == 13) ? i - 2 : i2 == 12 ? i - 1 : i;
    }

    public final ac7 I() {
        int i = this.h;
        if (i == 7 || i == 8) {
            return uc7.s1(this.G).N[this.h - 7];
        }
        return null;
    }

    public final Object J(int i) {
        if (i < 0 || i >= this.N.size()) {
            return null;
        }
        ek3 ek3Var = (ek3) this.N.get(i);
        String str = ek3Var.l;
        TLRPC.TL_contact tL_contact = ek3Var.e;
        if (str != null) {
            return str;
        }
        TLRPC.Chat chat = ek3Var.m;
        if (chat != null) {
            return chat;
        }
        TLRPC.User user = ek3Var.n;
        if (user != null) {
            return user;
        }
        TLRPC.Dialog dialog = ek3Var.c;
        if (dialog != null) {
            return dialog;
        }
        if (tL_contact != null) {
            return uc7.s1(this.G).X1(Long.valueOf(tL_contact.user_id));
        }
        TLRPC.RecentMeUrl recentMeUrl = ek3Var.d;
        if (recentMeUrl != null) {
            return recentMeUrl;
        }
        return null;
    }

    public final void N(d79 d79Var, boolean z) {
        this.K = z;
        for (int i = 0; i < d79Var.getChildCount(); i++) {
            if (d79Var.getChildAt(i) instanceof of3) {
                ((of3) d79Var.getChildAt(i)).f = z;
            }
        }
        for (int i2 = 0; i2 < d79Var.getCachedChildCount(); i2++) {
            if (d79Var.Q(i2) instanceof of3) {
                ((of3) d79Var.Q(i2)).f = z;
            }
        }
        for (int i3 = 0; i3 < d79Var.getHiddenChildCount(); i3++) {
            if (d79Var.X(i3) instanceof of3) {
                ((of3) d79Var.X(i3)).f = z;
            }
        }
        for (int i4 = 0; i4 < d79Var.getAttachedScrapChildCount(); i4++) {
            if (d79Var.P(i4) instanceof of3) {
                ((of3) d79Var.P(i4)).f = z;
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
                    Collections.sort(this.d, new mu2(uc7.s1(i), currentTime, b));
                    if (z) {
                        f();
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void Q() {
        this.E = this.r == 0 && this.h == 0 && !this.x && !uc7.s1(this.G).s.isEmpty();
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
        ArrayList o3;
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
            lyc v = uc7.s1(i10).v(j2);
            ArrayList arrayList7 = (ArrayList) v.b;
            int size = arrayList7.size();
            ArrayList arrayList8 = (ArrayList) v.c;
            int size2 = arrayList8.size() + size;
            ArrayList arrayList9 = (ArrayList) v.d;
            int size3 = arrayList9.size() + size2;
            ArrayList arrayList10 = (ArrayList) v.e;
            this.f = arrayList10.size() + size3;
            this.V = false;
            int i11 = this.h == 3 ? 2 : 4;
            for (int i12 = 0; i12 < i11; i12++) {
                if (i12 == 0) {
                    M0 = ob6.M0(2131751843, null);
                    arrayList5 = arrayList7;
                } else if (i12 == 1) {
                    M0 = ob6.M0(2131751840, null);
                    arrayList5 = arrayList8;
                } else if (i12 == 2) {
                    M0 = ob6.M0(2131751841, null);
                    arrayList5 = arrayList9;
                } else {
                    M0 = ob6.M0(2131751838, null);
                    arrayList5 = arrayList10;
                }
                if (!arrayList5.isEmpty()) {
                    this.N.add(new ek3(this, M0));
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        zb7 zb7Var = (zb7) arrayList5.get(i13);
                        TLRPC.Dialog dialog4 = zb7Var.d;
                        if (dialog4 != null) {
                            this.N.add(new ek3(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = zb7Var.b;
                            if (chat != null) {
                                this.N.add(new ek3(this, chat));
                            } else {
                                TLRPC.User user = zb7Var.c;
                                if (user != null) {
                                    this.N.add(new ek3(this, user));
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
        uc7 s1 = uc7.s1(i10);
        int i14 = this.r;
        uj3 uj3Var = this.S;
        if (i9 != 0) {
            o3 = (ArrayList) s1.x.f(j2);
            if (o3 == null) {
                o3 = new ArrayList();
            }
            j = 0;
        } else {
            j = 0;
            o3 = uj3Var.o3(i10, this.h, i14, this.H);
            if (o3 == null) {
                o3 = new ArrayList();
            }
        }
        int size4 = o3.size();
        this.f = size4;
        this.V = false;
        if (size4 == 0 && uj3Var.F3()) {
            bs2.s(this, 19, this.N);
            return;
        }
        if (this.E || this.h != 0 || i14 != 0 || !s1.U1.get(i14) || this.e) {
            i = i9;
            z = true;
            i2 = i14;
        } else if (s1.D0() > 10 || !lv2.r(i10).n || lv2.r(i10).f0.isEmpty()) {
            i = i9;
            z = true;
            i2 = i14;
            this.d = null;
        } else {
            this.d = new ArrayList(lv2.r(i10).f0);
            i = i9;
            long j3 = yac.h(i10).n;
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
                if (j4 == j3 || s1.R.f(j4) != null) {
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
        ac7 I = I();
        if ((I == null || I.d()) && uj3Var.O0) {
            long j5 = uj3Var.R0;
            if (j5 == j) {
                j5 = uj3Var.Q0;
            }
            bs2.s(this, 20, this.N);
            int i17 = 0;
            while (true) {
                if (i17 >= o3.size()) {
                    i3 = i10;
                    dialog = null;
                    break;
                }
                i3 = i10;
                if (((TLRPC.Dialog) o3.get(i17)).id == j5) {
                    dialog = (TLRPC.Dialog) o3.get(i17);
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
            this.N.add(new ek3(this, 0, dialog));
            bs2.s(this, 20, this.N);
            z2 = false;
            this.F = z2;
            i4 = this.h;
            if ((i4 != 7 || i4 == 8) && I != null && I.c()) {
                s1.F(I.a, false);
                xb7 xb7Var = (xb7) s1.d0.get(I.a);
                tL_chatlists_chatlistUpdates = xb7Var == null ? null : xb7Var.c;
                if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                    this.F = z;
                    this.N.add(new ek3(this, tL_chatlists_chatlistUpdates));
                }
            }
            requestPeerType = this.U;
            if (requestPeerType != null) {
                bs2.s(this, 15, this.N);
            }
            if (!this.K || this.T) {
                for (i5 = 0; i5 < o3.size(); i5++) {
                    if (this.h == 2 && (o3.get(i5) instanceof pj3)) {
                        this.N.add(new ek3(this, 14, (TLRPC.Dialog) o3.get(i5)));
                    } else {
                        this.N.add(new ek3(this, 0, (TLRPC.Dialog) o3.get(i5)));
                    }
                }
                bs2.s(this, 10, this.N);
            }
            boolean z5 = j2 == j && uj3Var.I3(this.h);
            boolean z6 = z5 && this.f > 0;
            if (z6) {
                int i18 = 0;
                while (true) {
                    if (i18 >= o3.size()) {
                        break;
                    }
                    if (!(o3.get(i18) instanceof TLRPC.TL_dialogFolder)) {
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
                    bs2.s(this, 16, arrayList11);
                } else {
                    arrayList11.add(new ek3(this, F(), 0));
                }
                bs2.s(this, 8, this.N);
                bs2.s(this, 7, this.N);
                bs2.s(this, 13, this.N);
            } else {
                ArrayList arrayList12 = this.d;
                if (arrayList12 != null && !arrayList12.isEmpty() && (i6 = this.h) != 7 && i6 != 8 && !z5) {
                    if (this.f == 0) {
                        this.V = true;
                        ArrayList arrayList13 = this.N;
                        if (requestPeerType != null) {
                            bs2.s(this, 16, arrayList13);
                        } else {
                            arrayList13.add(new ek3(this, F(), 0));
                        }
                        bs2.s(this, 8, this.N);
                        bs2.s(this, 7, this.N);
                    } else {
                        int i19 = 0;
                        while (true) {
                            int size6 = o3.size();
                            arrayList2 = this.N;
                            if (i19 >= size6) {
                                break;
                            }
                            arrayList2.add(new ek3(this, 0, (TLRPC.Dialog) o3.get(i19)));
                            i19++;
                        }
                        bs2.s(this, 8, arrayList2);
                        bs2.s(this, 7, this.N);
                    }
                    int i20 = 0;
                    while (true) {
                        int size7 = this.d.size();
                        arrayList3 = this.N;
                        if (i20 >= size7) {
                            break;
                        }
                        arrayList3.add(new ek3(this, (TLRPC.TL_contact) this.d.get(i20)));
                        i20++;
                    }
                    bs2.s(this, 10, arrayList3);
                    z3 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        bs2.s(this, 12, this.N);
                    }
                    if (this.n && this.h == 3) {
                        bs2.s(this, 21, this.N);
                    }
                    if (!z3) {
                        for (int i21 = 0; i21 < o3.size(); i21++) {
                            if (this.h == 2 && (o3.get(i21) instanceof pj3)) {
                                this.N.add(new ek3(this, 14, (TLRPC.Dialog) o3.get(i21)));
                            } else {
                                this.N.add(new ek3(this, 0, (TLRPC.Dialog) o3.get(i21)));
                            }
                        }
                        if (i != 0 || this.R || (i8 = this.h) == 7 || i8 == 8) {
                            i7 = i2;
                        } else {
                            i7 = i2;
                            if (!uc7.s1(i3).U1.get(i7)) {
                                if (this.f != 0) {
                                    bs2.s(this, 1, this.N);
                                }
                                bs2.s(this, 10, this.N);
                            }
                        }
                        int i22 = this.f;
                        if (i22 == 0) {
                            z4 = true;
                        } else if (z6) {
                            z4 = false;
                        } else {
                            if (i7 == 0 && i22 > 10 && this.h == 0) {
                                bs2.s(this, 11, this.N);
                            }
                            bs2.s(this, 10, this.N);
                        }
                        this.V = z4;
                        ArrayList arrayList14 = this.N;
                        if (requestPeerType != null) {
                            bs2.s(this, 16, arrayList14);
                        } else {
                            arrayList14.add(new ek3(this, F(), 0));
                        }
                    }
                    if (s1.I0.isEmpty()) {
                        int i23 = 0;
                        while (i23 < this.N.size()) {
                            ek3 ek3Var = (ek3) this.N.get(i23);
                            if (ek3Var.a == 0 && (dialog2 = ek3Var.c) != null && s1.y2(dialog2.id)) {
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
                    int size8 = uc7.s1(i3).s.size();
                    bs2.s(this, 2, this.N);
                    int i24 = 0;
                    while (true) {
                        arrayList = this.N;
                        if (i24 >= size8) {
                            break;
                        }
                        arrayList.add(new ek3(this, (TLRPC.RecentMeUrl) uc7.s1(i3).s.get(i24)));
                        i24++;
                    }
                    bs2.s(this, 3, arrayList);
                } else {
                    int i25 = this.h;
                    if (i25 == 11 || i25 == 13) {
                        bs2.s(this, 7, this.N);
                        bs2.s(this, 12, this.N);
                    } else if (i25 == 12) {
                        bs2.s(this, 7, this.N);
                    }
                }
            }
            z3 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            bs2.s(this, 12, this.N);
            if (this.n) {
                bs2.s(this, 21, this.N);
            }
            if (!z3) {
            }
            if (s1.I0.isEmpty()) {
            }
        }
        i3 = i10;
        if ((I == null || I.d()) && this.h == 3 && uj3Var.S0 != j) {
            bs2.s(this, 20, this.N);
            int i26 = 0;
            while (true) {
                if (i26 >= o3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (((TLRPC.Dialog) o3.get(i26)).id == uj3Var.S0) {
                        dialog3 = (TLRPC.Dialog) o3.get(i26);
                        break;
                    }
                    i26++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = uj3Var.S0;
            }
            z2 = false;
            this.N.add(new ek3(this, 0, dialog3));
            bs2.s(this, 20, this.N);
            this.F = z2;
            i4 = this.h;
            if (i4 != 7) {
            }
            s1.F(I.a, false);
            xb7 xb7Var2 = (xb7) s1.d0.get(I.a);
            if (xb7Var2 == null) {
            }
            if (tL_chatlists_chatlistUpdates != null) {
                this.F = z;
                this.N.add(new ek3(this, tL_chatlists_chatlistUpdates));
            }
            requestPeerType = this.U;
            if (requestPeerType != null) {
            }
            if (this.K) {
            }
            while (i5 < o3.size()) {
            }
            bs2.s(this, 10, this.N);
        }
        z2 = false;
        this.F = z2;
        i4 = this.h;
        if (i4 != 7) {
        }
        s1.F(I.a, false);
        xb7 xb7Var22 = (xb7) s1.d0.get(I.a);
        if (xb7Var22 == null) {
        }
        if (tL_chatlists_chatlistUpdates != null) {
        }
        requestPeerType = this.U;
        if (requestPeerType != null) {
        }
        if (this.K) {
        }
        while (i5 < o3.size()) {
        }
        bs2.s(this, 10, this.N);
    }

    public final void S(th3 th3Var) {
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
        ak3 ak3Var = new ak3(this, arrayList2, (byte) 0);
        arrayList3.size();
        an2 a = cy7.a(ak3Var, true);
        this.a0 = false;
        if (th3Var != null) {
            th3Var.run();
        }
        this.N = arrayList2;
        a.c(this);
    }

    @Override // j79
    public final int b() {
        int size = this.N.size();
        this.w = size;
        return size;
    }

    @Override // j79
    public final long c(int i) {
        return ((ek3) this.N.get(i)).k;
    }

    @Override // j79
    public final int d(int i) {
        return ((ek3) this.N.get(i)).a;
    }

    @Override // j79
    public void f() {
        if (this.a0) {
            this.N = new ArrayList();
        }
        this.a0 = false;
        R();
        super.f();
    }

    @Override // kf3
    public final void k(of3 of3Var) {
        int i = this.G;
        uc7.s1(i);
        if (uc7.s1(i).O1().J(of3Var.getDialogId())) {
            uj3 uj3Var = this.S;
            uj3Var.getOrCreateStoryViewer().getClass();
            uj3Var.getOrCreateStoryViewer().H(uj3Var.getParentActivity(), of3Var.getDialogId(), l6b.a((d79) of3Var.getParent()));
        }
    }

    @Override // kf3
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override // kf3
    public final void r() {
        c6b O1 = uc7.s1(this.G).O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = O1.D(0, wf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || O1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        this.S.getOrCreateStoryViewer().K(this.c, null, arrayList2, 0, null, null, new l6b(this.L, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        String str2;
        String H;
        TLRPC.Chat M0;
        String M02;
        int i2;
        String str3;
        int i3;
        int i4 = f89Var.f;
        View view = f89Var.a;
        int i5 = this.G;
        uj3 uj3Var = this.S;
        Object[] objArr = 0;
        if (i4 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i);
            Object J = J(i + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i6 = this.h;
            ArrayList arrayList = this.y;
            if (i6 == 2 || i6 == 15) {
                bv8 bv8Var = (bv8) view;
                long dialogId = bv8Var.getDialogId();
                if (dialog.id != 0) {
                    chat = uc7.s1(i5).M0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (M0 = uc7.s1(i5).M0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = M0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str4 = chat.title;
                    if (!xc2.T(chat) || chat.megagroup) {
                        int i7 = chat.participants_count;
                        H = i7 != 0 ? ob6.H(',', "Members", i7) : chat.has_geo ? ob6.M0(2131748396, null) : !xc2.t0(chat) ? ob6.M0(2131748395, null).toLowerCase() : ob6.M0(2131748392, null).toLowerCase();
                    } else {
                        int i8 = chat.participants_count;
                        H = i8 != 0 ? ob6.H(',', "Subscribers", i8) : !xc2.t0(chat) ? ob6.M0(2131752299, null).toLowerCase() : ob6.M0(2131752288, null).toLowerCase();
                    }
                    str2 = str4;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User X1 = uc7.s1(i5).X1(Long.valueOf(dialog.id));
                    if (X1 != 0) {
                        String r = lbc.r(X1);
                        if (lbc.B(X1)) {
                            chat2 = X1;
                            str = "";
                        } else {
                            chat2 = X1;
                            str = X1.bot ? ob6.M0(2131753149, null) : ob6.d0(i5, X1, null, null);
                        }
                        str2 = r;
                    } else {
                        str = "";
                        chat2 = null;
                        str2 = null;
                    }
                }
                bv8Var.N = dialog2 != null;
                bv8Var.C(chat2, null, str2, str, false, false);
                bv8Var.A(arrayList.contains(Long.valueOf(bv8Var.getDialogId())), dialogId == bv8Var.getDialogId());
                if (i < this.f + 1) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            }
            of3 of3Var = (of3) view;
            of3Var.R0 = this.W != 0 && xc2.d0(i5, dialog.id);
            of3Var.t2 = false;
            of3Var.u2 = false;
            if (this.h == 0 && hl.O1()) {
                of3Var.setDialogSelected(dialog.id == this.s);
            }
            of3Var.d0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i == 1 && uj3Var.O0 && uj3Var.R0 != 0 && dialog.top_message == 0) {
                ac7 I = I();
                of3Var.setCustomMessage((I == null || I.d()) ? ob6.M0(2131745988, null) : null);
            } else if (i == 1 && uj3Var.O0 && uj3Var.Q0 != 0 && dialog.top_message == 0) {
                ac7 I2 = I();
                if (I2 == null || I2.d()) {
                    of3Var.setCustomMessage(wf3.v(uj3Var.Q0));
                } else {
                    of3Var.setCustomMessage(null);
                }
            } else if (i == 1 && this.h == 3 && uj3Var.S0 != 0 && dialog.top_message == 0) {
                ac7 I3 = I();
                if (I3 == null || I3.d()) {
                    of3Var.setCustomMessage(wf3.v(uj3Var.S0));
                } else {
                    of3Var.setCustomMessage(null);
                }
            } else {
                of3Var.setCustomMessage(null);
            }
            of3Var.f0(dialog, this.h, this.r);
            if (of3Var.getMeasuredHeight() > 0 && of3Var.getMeasuredHeight() != of3Var.H()) {
                of3Var.requestLayout();
            }
            boolean z = of3Var.f;
            boolean z2 = this.K;
            if (z != z2) {
                of3Var.f = z2;
                of3Var.requestLayout();
            }
            dk3 dk3Var = this.Q;
            if (dk3Var != null && i < 10) {
                long j = dialog.id;
                ArrayList arrayList2 = dk3Var.d;
                if (!dk3Var.a.contains(Long.valueOf(j)) && !dk3Var.b.contains(Long.valueOf(j)) && !dk3Var.c.contains(Long.valueOf(j)) && !arrayList2.contains(Long.valueOf(j))) {
                    arrayList2.add(Long.valueOf(j));
                }
            }
        } else if (i4 == 4) {
            ((uf3) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i));
        } else if (i4 == 5) {
            tk3 tk3Var = (tk3) view;
            int i9 = this.b0;
            int F = F();
            this.b0 = F;
            wmb wmbVar = tk3Var.n;
            TextView textView = tk3Var.h;
            e29 e29Var = tk3Var.f;
            if (tk3Var.r != F) {
                tk3Var.r = F;
                if (F == 0 || F == 1) {
                    M02 = ob6.M0(2131747959, null);
                    textView.setText(ob6.M0(2131747961, null));
                    i2 = R.raw.utyan_newborn;
                } else {
                    i3 = R.raw.filter_no_chats;
                    if (F == 2) {
                        e29Var.setAutoRepeat(false);
                        if (this.x) {
                            textView.setText(ob6.M0(2131750688, null));
                            str3 = ob6.M0(2131750687, null);
                        } else {
                            textView.setText(ob6.M0(2131750690, null));
                            str3 = ob6.M0(2131750689, null);
                        }
                    } else if (F != 4) {
                        e29Var.setAutoRepeat(true);
                        M02 = ob6.M0(2131750773, null);
                        textView.setText(ob6.M0(2131750774, null));
                        i2 = R.raw.filter_new;
                    } else {
                        e29Var.setAutoRepeat(false);
                        textView.setText(ob6.M0(2131750686, null));
                        str3 = ob6.M0(2131750685, null);
                    }
                    e29Var.setVisibility(0);
                    if (tk3Var.r == 1) {
                        if (tk3Var.d) {
                            tk3Var.a = 1.0f;
                            String M03 = ob6.M0(2131747960, null);
                            if (hl.O1() && !hl.N1()) {
                                M03 = M03.replace('\n', ' ');
                            }
                            wmbVar.a(M03, true, false);
                            tk3Var.requestLayout();
                        } else {
                            tk3Var.a(true);
                        }
                    }
                    if (tk3Var.s != i3) {
                        e29Var.f(i3, 100, 100, null);
                        e29Var.d();
                        tk3Var.s = i3;
                    }
                    if (hl.O1() && !hl.N1()) {
                        str3 = str3.replace('\n', ' ');
                    }
                    wmbVar.a(str3, false, false);
                }
                int i10 = i2;
                str3 = M02;
                i3 = i10;
                e29Var.setVisibility(0);
                if (tk3Var.r == 1) {
                }
                if (tk3Var.s != i3) {
                }
                if (hl.O1()) {
                    str3 = str3.replace('\n', ' ');
                }
                wmbVar.a(str3, false, false);
            }
            int i11 = this.h;
            if (i11 != 7) {
                byte b = 8;
                if (i11 != 8 && this.b0 != 4) {
                    tk3Var.setOnUtyanAnimationEndListener(new yj3(this, objArr == true ? 1 : 0));
                    tk3Var.setOnUtyanAnimationUpdateListener(new hw(this, b));
                    if (!tk3Var.d && this.f == 0) {
                        uj3Var.T4(0.0f);
                        for (tj3 tj3Var : uj3Var.f0) {
                            ((x46) tj3Var.a.getLayoutManager()).u = true;
                        }
                    }
                    if (this.d == null || i9 != 0) {
                        if (this.e) {
                            if (this.f == 0) {
                                tk3Var.a(false);
                            }
                        } else if (tk3Var.d && this.b0 == 0) {
                            ValueAnimator valueAnimator = tk3Var.e;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            tk3Var.d = false;
                            ValueAnimator duration = ValueAnimator.ofFloat(tk3Var.a, 0.0f).setDuration(250L);
                            tk3Var.e = duration;
                            duration.setInterpolator(dt3.d);
                            tk3Var.e.addUpdateListener(new rk3(tk3Var, (byte) 1));
                            tk3Var.e.addListener(new sk3(tk3Var, (byte) 0));
                            tk3Var.e.start();
                        }
                    } else if (!tk3Var.d) {
                        tk3Var.a(true);
                    }
                }
            }
        } else if (i4 == 6) {
            ((vac) view).d((TLRPC.User) J(i), null, null, false);
        } else if (i4 == 7) {
            mf5 mf5Var = (mf5) view;
            int i12 = this.h;
            if (i12 != 11 && i12 != 12 && i12 != 13) {
                mf5Var.setText(ob6.M0((this.f == 0 && this.e) ? 2131751769 : 2131742457, null));
            } else if (i == 0) {
                mf5Var.setText(ob6.M0(2131749003, null));
            } else {
                mf5Var.setText(ob6.M0(2131749002, null));
            }
        } else if (i4 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.U;
            if (i4 != 12) {
                switch (i4) {
                    case 14:
                        mf5 mf5Var2 = (mf5) view;
                        mf5Var2.setTextSize(14.0f);
                        if (mf5Var2.getTextView() != null) {
                            yob.X(mf5Var2.getTextView(), aob.y6, null);
                        } else {
                            mf5Var2.setTextColor(aob.w0(null, aob.y6, false));
                        }
                        yob.h(aob.e7, null, mf5Var2);
                        byte b2 = ((pj3) J(i)).a;
                        if (b2 != 0) {
                            if (b2 != 1) {
                                if (b2 == 2) {
                                    mf5Var2.setText(ob6.M0(2131750739, null));
                                    break;
                                }
                            } else {
                                mf5Var2.setText(ob6.M0(2131748058, null));
                                break;
                            }
                        } else {
                            mf5Var2.setText(ob6.M0(2131748059, null));
                            break;
                        }
                        break;
                    case 15:
                        ((xb9) view).set(requestPeerType);
                        break;
                    case 16:
                        ((cl3) view).set(requestPeerType);
                        break;
                    case 17:
                        uk3 uk3Var = (uk3) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((ek3) this.N.get(i)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            uk3Var.b(hl.N2(ob6.G(size, "FolderUpdatesTitle", new Object[0]), aob.I6, 0, null, null), ob6.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i4) {
                            case 20:
                                p55 p55Var = (p55) view;
                                if (uj3Var.O0) {
                                    if (i == 0) {
                                        p55Var.setText(ob6.M0(uj3Var.R0 != 0 ? 2131745989 : 2131745987, null));
                                        break;
                                    } else {
                                        p55Var.setText(ob6.M0(2131745986, null));
                                        break;
                                    }
                                } else if (this.h == 3) {
                                    if (i == 0) {
                                        p55Var.setText(ob6.M0(2131750546, null));
                                        break;
                                    } else {
                                        p55Var.setText(ob6.M0(2131745986, null));
                                        break;
                                    }
                                }
                                break;
                            case 21:
                                of3 of3Var2 = (of3) view;
                                jf3 jf3Var = new jf3();
                                jf3Var.a = ob6.M0(2131744428, null);
                                jf3Var.b = ob6.M0(2131744429, null);
                                of3Var2.t2 = false;
                                of3Var2.u2 = false;
                                of3Var2.setDialog(jf3Var);
                                if (of3Var2.getMeasuredHeight() > 0 && of3Var2.getMeasuredHeight() != of3Var2.H()) {
                                    of3Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((mf5) view).setText((String) J(i));
                                break;
                            case 23:
                                Object J2 = J(i);
                                of3 of3Var3 = (of3) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) J2;
                                    of3Var3.R0 = xc2.e0(i5, chat3);
                                    of3Var3.setCustomMessageWithoutRebuild(ob6.G(chat3.participants_count, "Members", new Object[0]));
                                    of3Var3.e0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    of3Var3.R0 = xc2.f0(i5, user);
                                    of3Var3.setCustomMessageWithoutRebuild(ob6.M0(2131753149, null));
                                    of3Var3.e0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof skb)) {
                    return;
                }
                skb skbVar = (skb) view;
                int i13 = aob.q6;
                skbVar.g(i13, i13);
                if (requestPeerType == null) {
                    skbVar.o(R.drawable.msg_groups_create, ob6.M0(2131751712, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    skbVar.o(R.drawable.msg_channel_create, ob6.M0(2131751717, null), true);
                } else {
                    skbVar.o(R.drawable.msg_groups_create, ob6.M0(2131751711, null), true);
                }
                skbVar.y = true;
                skbVar.setOffsetFromImage(75);
            }
        } else {
            ilb ilbVar = (ilb) view;
            ilbVar.setText(ob6.M0(2131743920, null));
            if (this.P == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.P = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            p66 textView2 = ilbVar.getTextView();
            if (textView2 != null) {
                yob.x(textView2, this.P, aob.B6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(hl.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, uj3Var.R3 ? null : this.P, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i < this.f + 1) {
        }
    }

    @Override // kf3
    public final void v(of3 of3Var) {
        this.S.c5(of3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [t62] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tk4] */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.view.View, of3] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.ViewGroup, mf5] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        View view;
        ?? tk4Var;
        View view2;
        uj3 uj3Var = this.S;
        long j = this.W;
        byte b = 0;
        byte b2 = 1;
        Context context = this.c;
        switch (i) {
            case 0:
            case 21:
                int i2 = this.h;
                if (i2 == 2 || i2 == 15) {
                    vnbVar = null;
                    view = new bv8(context, null);
                } else {
                    vnbVar = null;
                    ?? of3Var = new of3(uj3Var, this.c, false, this.G, null);
                    if (O()) {
                        zj3 zj3Var = new zj3(this, b);
                        of3Var.K1 = true;
                        of3Var.L1 = zj3Var;
                    }
                    of3Var.setArchivedPullAnimation(this.M);
                    of3Var.setPreloader(this.Q);
                    of3Var.setDialogCellDelegate(this);
                    of3Var.setIsTransitionSupport(this.T);
                    if (i == 21) {
                        of3Var.H = new mea(of3Var.getContext(), of3Var, false, R.drawable.forward_to_stories, of3Var.K4);
                        of3Var.G = true;
                    }
                    if (j != 0) {
                        of3Var.P0 = true;
                    }
                    view = of3Var;
                }
                view2 = view;
                if (this.h == 15) {
                    yob.h(aob.d6, vnbVar, view);
                    view2 = view;
                    break;
                }
                break;
            case 1:
            case 13:
                tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                r2 = i == 13 ? (byte) 18 : (byte) 7;
                tk4Var.setViewType(r2);
                if (r2 == 18) {
                    tk4Var.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    tk4Var.setItemsCount((int) ((hl.q.y * 0.5f) / hl.L(64.0f)));
                }
                view2 = tk4Var;
                break;
            case 2:
                ?? mf5Var = new mf5(context);
                mf5Var.setText(ob6.M0(2131746087, null));
                TextView textView = new TextView(context);
                bs2.t(textView, 1, 15.0f);
                ik8.x(textView, aob.L6, null, null, 2131746086);
                textView.setGravity((ob6.a0 ? 3 : 5) | 16);
                mf5Var.addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new mh3(this, b2));
                view2 = mf5Var;
                break;
            case 3:
                ViewGroup b6Var = new b6(context, (byte) 11);
                yob.h(aob.a7, null, b6Var);
                View view3 = new View(context);
                yob.Z(view3, context, R.drawable.greydivider, aob.b7);
                b6Var.addView(view3, tre.c(-1.0f, -1));
                view2 = b6Var;
                break;
            case 4:
                uf3 uf3Var = new uf3(context);
                ImageReceiver imageReceiver = new ImageReceiver(uf3Var);
                uf3Var.h = imageReceiver;
                uf3Var.n = new rb0((vnb) null);
                uf3Var.x = hl.L(40.0f);
                uf3Var.G = hl.L(10.0f);
                uf3Var.I = yac.t0;
                aob.S(context);
                imageReceiver.q0(hl.L(26.0f));
                view2 = uf3Var;
                break;
            case 5:
                view2 = new tk3(context);
                break;
            case 6:
                view2 = new vac(context, 8, 0, false);
                break;
            case 7:
                View mf5Var2 = new mf5(context);
                view2 = mf5Var2;
                if (!uj3Var.O0) {
                    mf5Var2.setPadding(0, 0, 0, hl.L(12.0f));
                    view2 = mf5Var2;
                    break;
                }
                break;
            case 8:
                View scaVar = new sca(context, (uh9) null);
                Drawable W0 = aob.W0(context, R.drawable.greydivider, aob.b7);
                zm2 zm2Var = new zm2(new ColorDrawable(aob.w0(null, aob.a7, false)), W0);
                zm2Var.x = true;
                scaVar.setBackgroundDrawable(zm2Var);
                E(scaVar, W0);
                view2 = scaVar;
                break;
            case 9:
            case 12:
            default:
                View skbVar = new skb(context);
                view2 = skbVar;
                if (this.h == 15) {
                    yob.h(aob.d6, null, skbVar);
                    view2 = skbVar;
                    break;
                }
                break;
            case 10:
                view2 = new fk3(this, context);
                break;
            case 11:
                View ck3Var = new ck3(this, context);
                Drawable W02 = aob.W0(context, R.drawable.greydivider, aob.b7);
                zm2 zm2Var2 = new zm2(new ColorDrawable(aob.w0(null, aob.a7, false)), W02);
                zm2Var2.x = true;
                ck3Var.setBackgroundDrawable(zm2Var2);
                E(ck3Var, W02);
                view2 = ck3Var;
                break;
            case 14:
                mf5 mf5Var3 = new mf5(this.c, aob.f7, 16, 0, false, null);
                mf5Var3.setHeight(32);
                mf5Var3.setClickable(false);
                view2 = mf5Var3;
                break;
            case 15:
                xb9 xb9Var = new xb9(context);
                xb9Var.b = new ArrayList();
                xb9Var.setOrientation(1);
                yob.h(aob.a7, null, xb9Var);
                view2 = xb9Var;
                break;
            case 16:
                view2 = new bk3(this, context);
                break;
            case 17:
                view2 = new uk3(context);
                break;
            case 18:
                tk4Var = new t62(context, r2);
                view2 = tk4Var;
                break;
            case 19:
                ViewGroup fk3Var = new fk3(this, context);
                fk3Var.addView(new zr(this.c, this.G, null, new yj3(this, b2), null), tre.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                view2 = fk3Var;
                break;
            case 20:
                view2 = new p55(context, null);
                break;
            case 22:
                view2 = new mf5(context);
                break;
            case 23:
                of3 of3Var2 = new of3(uj3Var, this.c, false, this.G, null);
                if (j != 0) {
                    of3Var2.P0 = true;
                    of3Var2.Q0 = true;
                }
                view2 = of3Var2;
                break;
        }
        view2.setLayoutParams(new r79(-1, (i == 5 || i == 19) ? -1 : -2));
        return new n69(view2);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof of3) {
            of3 of3Var = (of3) view;
            of3Var.b0(this.I, false);
            of3Var.d0(this.y.contains(Long.valueOf(of3Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    @Override // kf3
    public void o(of3 of3Var) {
    }

    @Override // kf3
    public void w(of3 of3Var) {
    }
}
