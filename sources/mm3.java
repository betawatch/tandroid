// default package

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class mm3 extends q59 {
    public boolean A0;
    public sg4 B0;
    public int C0;
    public boolean D0;
    public String E;
    public int E0;
    public qmb F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public String N;
    public boolean O;
    public int Q;
    public String S;
    public int T;
    public int U;
    public uj3 V;
    public final byte W;
    public boolean X;
    public boolean Y;
    public String a0;
    public byte b0;
    public String c0;
    public boolean d;
    public int d0;
    public final Activity e;
    public int e0;
    public wl3 f;
    public int f0;
    public int g0;
    public wl3 h;
    public int h0;
    public final int i0;
    public final sc3 j0;
    public final fm3 k0;
    public smb l0;
    public final long m0;
    public long o0;
    public View p0;
    public rd3 q0;
    public wc7 r;
    public ArrayList r0;
    public final nk3 s0;
    public final int t0;
    public ArrayList u0;
    public final ArrayList v0;
    public int w;
    public final ArrayList w0;
    public int x;
    public String x0;
    public vh6 y0;
    public final ArrayList z0;
    public jm3 c = jm3.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashSet M = new HashSet();
    public int P = 0;
    public int R = 0;
    public int Z = -1;
    public boolean n0 = false;

    /* JADX WARN: Multi-variable type inference failed */
    public mm3(Activity activity, nk3 nk3Var, int i, int i2, sc3 sc3Var, boolean z) {
        int i3 = z8c.t0;
        this.t0 = i3;
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = null;
        this.y0 = new vh6();
        this.z0 = new ArrayList();
        this.G0 = -1;
        this.H0 = true;
        this.I0 = true;
        this.j0 = sc3Var;
        this.s0 = nk3Var;
        ov9 ov9Var = (ov9) this;
        fm3 fm3Var = new fm3(ov9Var);
        this.k0 = fm3Var;
        fm3Var.a = new nl9(ov9Var, (byte) 28);
        fm3Var.p = z;
        this.e = activity;
        this.W = i;
        this.i0 = i2;
        this.m0 = z8c.h(i3).e();
        if (i2 != 15) {
            cf7.Y(i3).a.c(new cu(i3, i2, (Object) new cm3(this), (byte) 6));
        }
        hs6.d0(i3).O0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i = 0; i < split.length; i++) {
                String str3 = split[i];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 1 || i == 4 || i == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb;
        boolean z = this.O;
        ArrayList arrayList = this.v0;
        ArrayList arrayList2 = this.w0;
        if (z) {
            sb = null;
            while (arrayList2.size() > 0) {
                lm3 lm3Var = (lm3) arrayList2.remove(0);
                this.u0.remove(lm3Var);
                arrayList.remove(lm3Var);
                this.y0.l(lm3Var.c);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(lm3Var.c);
                } else {
                    sb.append(", ");
                    sb.append(lm3Var.c);
                }
            }
            if (sb == null) {
                sb = new StringBuilder("1");
            } else {
                sb.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.u0.clear();
            this.y0.b();
            sb = new StringBuilder("1");
        }
        String str = this.N;
        G(str != null ? str.trim() : null);
        f();
        boolean z2 = this.O;
        int i = this.t0;
        if (z2) {
            cf7.Y(i).a.c(new rd3((ov9) this, sb, (byte) 13));
        } else {
            cf7.Y(i).a.c(new fx0(i, (byte) 4));
        }
    }

    public final boolean F(Object obj) {
        if (this.i0 != 14) {
            return true;
        }
        boolean z = obj instanceof TLRPC.User;
        nk3 nk3Var = this.s0;
        if (z) {
            return ((TLRPC.User) obj).bot ? nk3Var.C2 : nk3Var.B2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return sd2.T(chat) ? nk3Var.A2 : sd2.n0(chat) ? nk3Var.x2 || nk3Var.y2 : nk3Var.x2 || nk3Var.z2;
    }

    public final void G(String str) {
        uj3 uj3Var;
        String str2;
        String str3;
        this.x0 = str;
        ArrayList arrayList = this.w0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.v0;
            arrayList2.clear();
            int size = this.u0.size();
            for (int i = 0; i < size; i++) {
                uj3 uj3Var2 = this.V;
                if ((uj3Var2 == null || uj3Var2.a() != ((lm3) this.u0.get(i)).c) && F(((lm3) this.u0.get(i)).a)) {
                    arrayList2.add((lm3) this.u0.get(i));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.u0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lm3 lm3Var = (lm3) this.u0.get(i2);
            if (lm3Var != null && lm3Var.a != null && (((uj3Var = this.V) == null || uj3Var.a() != lm3Var.c) && F(((lm3) this.u0.get(i2)).a))) {
                TLObject tLObject = lm3Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? no4.j(this.t0, chat, false) : chat.title;
                    str3 = ((TLRPC.Chat) lm3Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = m9c.r((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) lm3Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(lm3Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(jm3 jm3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(jm3Var.c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new pn2(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    public final Object I(int i) {
        int i2;
        int i3;
        TLRPC.Chat L0;
        int i4;
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            if (i > 0 && i - 1 < arrayList.size()) {
                return arrayList.get(i4);
            }
            i = ts2.k(1, i, arrayList);
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            if (i > 0) {
                return arrayList2.get(i - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            ArrayList arrayList3 = this.O ? this.w0 : this.v0;
            if (i > L && (i3 = (i - 1) - (L == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((lm3) arrayList3.get(i3)).a;
                boolean z = tLObject instanceof TLRPC.User;
                int i5 = this.t0;
                if (!z) {
                    return (!(tLObject instanceof TLRPC.Chat) || (L0 = oc7.r1(i5).L0(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : L0;
                }
                TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(((TLRPC.User) tLObject).id));
                return W1 != null ? W1 : tLObject;
            }
            i -= J();
        }
        ArrayList arrayList4 = this.G;
        if (!arrayList4.isEmpty()) {
            if (i > 0 && i <= arrayList4.size()) {
                return arrayList4.get(i - 1);
            }
            i = ts2.k(1, i, arrayList4);
        }
        ArrayList arrayList5 = this.F;
        if (!arrayList5.isEmpty()) {
            if (i > 0 && i <= arrayList5.size()) {
                return arrayList5.get(i - 1);
            }
            i = ts2.k(1, i, arrayList5);
        }
        fm3 fm3Var = this.k0;
        ArrayList arrayList6 = fm3Var.e;
        ArrayList arrayList7 = fm3Var.d;
        ArrayList arrayList8 = fm3Var.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i == 0) {
                return null;
            }
            i--;
        }
        int size3 = arrayList8.size();
        if (size3 > 3 && this.I0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i6 = (size4 <= 3 || !this.H0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i7 = 0;
        ArrayList arrayList9 = this.L;
        int size5 = (isEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i6 + 1;
        if (i >= 0 && i < size) {
            return this.s.get(i);
        }
        int i8 = i - size;
        if (i8 >= 0 && i8 < size2) {
            return arrayList7.get(i8);
        }
        int i9 = i8 - size2;
        if (i9 >= 0 && i9 < size3) {
            return arrayList8.get(i9);
        }
        int i10 = i9 - size3;
        if (i10 <= 0 || i10 >= size5) {
            i2 = i10 - size5;
        } else {
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < arrayList9.size()) {
                return arrayList9.get(i11);
            }
            i2 = i11 - arrayList9.size();
            if (i2 >= 0 && i2 < arrayList6.size()) {
                return arrayList6.get(i2);
            }
        }
        ArrayList arrayList10 = this.I;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i2 > 0 && i2 <= arrayList10.size()) {
            return arrayList10.get(i2 - 1);
        }
        if (!this.Y && !arrayList10.isEmpty()) {
            i7 = 1;
        }
        int i12 = i2 - (size6 + i7);
        ArrayList arrayList11 = this.J;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i12 <= 0 || i12 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i12 - 1);
    }

    public final int J() {
        ArrayList arrayList = this.O ? this.w0 : this.v0;
        return (L() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int K() {
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.O) {
                return size;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        int size3 = this.k0.d.size();
        int i = size + size2 + size3;
        return size2 + size3 > 0 ? (J() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i : i + 1 : i;
    }

    public final boolean L() {
        if (this.O || hs6.d0(this.t0).j1.isEmpty()) {
            return false;
        }
        return this.i0 != 14 || this.s0.B2;
    }

    public final boolean M() {
        return R() && J() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean N(int i) {
        int i2;
        int i3;
        if (this.O && this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                i = ts2.k(1, i, arrayList);
            }
            if (O()) {
                ?? L = L();
                ArrayList arrayList2 = this.O ? this.w0 : this.v0;
                if (i <= L || (i - 1) - (L == true ? 1 : 0) >= arrayList2.size()) {
                    i -= J();
                }
            }
            fm3 fm3Var = this.k0;
            ArrayList arrayList3 = fm3Var.e;
            ArrayList arrayList4 = fm3Var.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = fm3Var.j.size();
            if (size3 > 3 && this.I0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i4 = (size4 <= 3 || !this.H0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.L;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i4 + 1;
            int size6 = this.F.size();
            if (size6 > 0) {
                if (i < 0 || i >= size6) {
                    i -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (J() > 0 || !this.G.isEmpty() || !arrayList.isEmpty())) {
                if (i != 0) {
                    i--;
                }
            }
            if ((i < 0 || i >= size) && (((i2 = i - size) < 0 || i2 >= size2) && ((i3 = i2 - size2) <= 0 || i3 >= size3))) {
                int i5 = i3 - size3;
                if (i5 > 0 && i5 < size5) {
                    return true;
                }
                int i6 = i5 - size5;
                ArrayList arrayList6 = this.I;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i6 <= 0 || i6 >= size7) {
                    ArrayList arrayList7 = this.J;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != jm3.d || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        return this.W != 2 && M();
    }

    public final void P() {
        if ((this.R == 0 || this.P == 0) && this.h0 == this.e0) {
            uj3 uj3Var = this.V;
            if (uj3Var == null || uj3Var.a() == 0 || this.Y) {
                V(this.h0, this.a0);
            } else {
                U(this.h0, this.a0);
            }
        }
    }

    public final void Q(long j, TLObject tLObject) {
        lm3 lm3Var = (lm3) this.y0.f(j);
        if (lm3Var == null) {
            lm3Var = new lm3();
            this.y0.k(lm3Var, j);
        } else {
            this.u0.remove(lm3Var);
        }
        this.u0.add(0, lm3Var);
        lm3Var.c = j;
        lm3Var.a = tLObject;
        lm3Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.N;
        G(str != null ? str.trim() : null);
        f();
        int i = this.t0;
        cf7.Y(i).a.c(new an0(i, j, (byte) 2));
    }

    public final boolean R() {
        int i = this.i0;
        return (i == 2 || i == 4 || i == 5 || i == 6 || i == 1 || i == 11 || i == 15) ? false : true;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty() || (K = K()) >= b()) {
            return;
        }
        int size = arrayList.size();
        arrayList.clear();
        q(K + 1, size);
        int size2 = this.k0.e.size();
        if (this.H0) {
            size2 = Math.min(3, size2);
        }
        if (size2 <= 0) {
            s(K);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i, String str) {
        String str2;
        if (str != null && str.equals(this.N) && (i == this.D0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.N = str;
        this.D0 = i;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        wl3 wl3Var = this.h;
        if (wl3Var != null) {
            gm.r(wl3Var);
            this.h = null;
        }
        wc7 wc7Var = this.r;
        if (wc7Var != null) {
            gm.r(wc7Var);
            this.r = null;
        }
        byte b = 1;
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.t0).cancelRequest(this.n, true);
            this.n = -1;
        }
        String trim = str != null ? str.trim() : null;
        G(trim);
        if (!TextUtils.equals(this.S, trim)) {
            this.S = trim;
            this.L.clear();
            if (this.T != 0) {
                ConnectionsManager.getInstance(this.t0).cancelRequest(this.T, true);
                this.T = 0;
            }
            if (trim == null || trim.length() < 4 || (z8c.h(this.t0).p() && oc7.r1(this.t0).F2())) {
                this.S = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.S = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.T = ConnectionsManager.getInstance(this.t0).sendRequest(tL_contacts_getSponsoredPeers, new tg((ov9) this, (byte) 19));
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.x0 = null;
            this.k0.s = false;
            this.s.clear();
            this.H.clear();
            this.K.clear();
            this.w = 0;
            this.x = 0;
            this.E = null;
            this.y.clear();
            this.k0.f(null, null);
            int i2 = this.i0;
            if (i2 != 15) {
                fm3 fm3Var = this.k0;
                boolean z = i2 != 11;
                boolean z2 = z;
                boolean z3 = i2 == 2 || i2 == 11;
                boolean z4 = i2 == 0;
                uj3 uj3Var = this.V;
                fm3Var.h(null, true, true, z, z2, z3, 0L, z4, 0, 0, uj3Var != null ? uj3Var.a() : 0L, null);
            }
            this.O = false;
            this.e0 = 0;
            this.E0 = 0;
            this.H0 = true;
            this.I0 = true;
            uj3 uj3Var2 = this.V;
            if (uj3Var2 != null) {
                uj3Var2.d(false, true);
            }
            if (this.i0 != 15) {
                W(null);
                V(0, null);
                U(0, null);
            }
            f();
            this.z0.clear();
            this.A0 = false;
            sg4 sg4Var = this.B0;
            if (sg4Var != null) {
                ((nh3) sg4Var).h(false, null, this.z0, false);
                return;
            }
            return;
        }
        this.k0.f(this.s, this.w0);
        this.w = 0;
        this.x = 0;
        this.E = null;
        this.y.clear();
        if (this.W != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.X = true;
            fm3 fm3Var2 = this.k0;
            if (fm3Var2.s) {
                this.J.clear();
                this.K.clear();
                ArrayList arrayList = this.k0.q;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    this.K.add(((zt9) arrayList.get(i3)).a);
                }
                this.H0 = true;
                this.I0 = true;
                this.E0 = 0;
                f();
                uj3 uj3Var3 = this.V;
                if (uj3Var3 != null) {
                    uj3Var3.d(false, false);
                }
            } else {
                cf7.Y(fm3Var2.m).a.c(new yt9(fm3Var2, b));
            }
        } else {
            this.K.clear();
        }
        int i4 = this.e0 + 1;
        this.e0 = i4;
        this.E0 = 3;
        this.H0 = true;
        this.I0 = true;
        f();
        uj3 uj3Var4 = this.V;
        if (uj3Var4 != null) {
            uj3Var4.d(true, false);
        }
        if (trim != null) {
            String trim2 = trim.trim();
            if (trim2.length() > 1 && (trim2.charAt(0) == '#' || trim2.charAt(0) == '$')) {
                int indexOf = trim2.indexOf(64);
                String substring = trim2.substring(1);
                if (indexOf >= 0) {
                    trim2.substring(indexOf + 1);
                }
                str2 = substring;
                mp3 mp3Var = Utilities.g;
                ov9 ov9Var = (ov9) this;
                wl3 wl3Var2 = new wl3(ov9Var, trim, i4, str, (byte) 0);
                this.f = wl3Var2;
                mp3Var.d(wl3Var2, 300L);
                if (str2 == null) {
                    this.E0++;
                    wc7 wc7Var2 = new wc7((Object) ov9Var, i4, (Object) str2, (byte) 20);
                    this.r = wc7Var2;
                    gm.d3(wc7Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        mp3 mp3Var2 = Utilities.g;
        ov9 ov9Var2 = (ov9) this;
        wl3 wl3Var22 = new wl3(ov9Var2, trim, i4, str, (byte) 0);
        this.f = wl3Var22;
        mp3Var2.d(wl3Var22, 300L);
        if (str2 == null) {
        }
    }

    public final void U(int i, String str) {
        uj3 uj3Var = this.V;
        if (uj3Var == null || uj3Var.a() == 0 || this.W == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = this.R;
        int i3 = this.t0;
        if (i2 != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.R, true);
            this.R = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.I;
        if (isEmpty) {
            this.x0 = null;
            this.J.clear();
            arrayList.clear();
            this.U = 0;
            this.a0 = null;
            this.O = false;
            f();
            return;
        }
        if (this.i0 != 15) {
            long a = this.V.a();
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = 20;
            tL_messages_search.q = str;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.peer = oc7.r1(i3).i1(a);
            if (str.equals(this.a0) && !arrayList.isEmpty()) {
                tL_messages_search.add_offset = arrayList.size();
            }
            this.a0 = str;
            int i4 = 1 + this.U;
            this.U = i4;
            this.R = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_search, new am3(this, str, i4, i, tL_messages_search, (byte) 0), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(int i, String str) {
        if (this.W != 0) {
            if (TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(str)) {
                return;
            }
            int i2 = this.P;
            int i3 = this.t0;
            if (i2 != 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(this.P, true);
                this.P = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.J;
            if (isEmpty || this.V.a() != 0) {
                this.x0 = null;
                arrayList.clear();
                this.I.clear();
                this.Q = 0;
                this.a0 = null;
                this.b0 = (byte) 0;
                this.O = false;
                f();
                return;
            }
            G(str);
            this.k0.f(this.s, this.w0);
            if (this.i0 == 15) {
                int i4 = this.E0 - 1;
                this.E0 = i4;
                uj3 uj3Var = this.V;
                if (uj3Var != null) {
                    uj3Var.d(i4 > 0, true);
                    this.V.c();
                    return;
                }
                return;
            }
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            byte b = this.c.a;
            tL_messages_searchGlobal.broadcasts_only = (b & 2) != 0;
            tL_messages_searchGlobal.groups_only = (b & 4) != 0;
            tL_messages_searchGlobal.users_only = (b & 8) != 0;
            tL_messages_searchGlobal.limit = 20;
            tL_messages_searchGlobal.q = str;
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = this.D0 ? 1 : 0;
            if (!str.equals(this.a0)) {
                this.d = false;
            }
            if (str.equals(this.a0) && this.b0 == this.c.a && !arrayList.isEmpty() && this.h0 == this.e0) {
                k47 k47Var = (k47) b10.f(1, arrayList);
                tL_messages_searchGlobal.offset_id = k47Var.e1();
                tL_messages_searchGlobal.offset_rate = this.d0;
                tL_messages_searchGlobal.offset_peer = oc7.r1(i3).i1(k47.B1(k47Var.k.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.a0 = str;
            this.b0 = this.c.a;
            int i5 = this.Q + 1;
            this.Q = i5;
            this.P = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_searchGlobal, new am3(this, str, i5, i, tL_messages_searchGlobal, (byte) 1), 2);
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        uj3 uj3Var = this.V;
        if (uj3Var == null || uj3Var.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList l = oc7.r1(this.t0).g4.l(-this.V.a());
            String trim = str.trim();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) != null && ((TLRPC.TL_forumTopic) l.get(i)).title.toLowerCase().contains(trim)) {
                    arrayList.add((TLRPC.TL_forumTopic) l.get(i));
                    ((TLRPC.TL_forumTopic) l.get(i)).searchQuery = trim;
                }
            }
        }
        f();
    }

    @Override // y59
    public final int b() {
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.O) {
                return size;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        fm3 fm3Var = this.k0;
        int size3 = fm3Var.d.size();
        int i = size + size2 + size3;
        int size4 = fm3Var.e.size();
        if (size4 > 3 && this.H0) {
            size4 = 3;
        }
        int size5 = this.L.size() + size4;
        int size6 = fm3Var.j.size();
        if (size6 > 3 && this.I0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i++;
        }
        if (size5 != 0) {
            i += size5 + 1;
        }
        if (size6 != 0) {
            i += size6;
        }
        ArrayList arrayList5 = this.I;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i += size7 + 1 + (!this.Y ? 1 : 0);
        }
        if (!this.Y) {
            this.Z = i;
        }
        ArrayList arrayList6 = this.J;
        int size8 = arrayList6.size();
        if ((this.c != jm3.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i2 = (arrayList5.isEmpty() || this.Y) ? size8 : 0;
        if (i2 != 0) {
            i += i2 + 1 + (!this.X ? 1 : 0);
        }
        if (this.Y) {
            this.Z = i;
        }
        this.C0 = i;
        return i;
    }

    @Override // y59
    public final long c(int i) {
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0142, code lost:
    
        if (r14 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0144, code lost:
    
        if (r14 != r6) goto L134;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i) {
        int i2;
        if (this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                if (i != 0) {
                    int i3 = i - 1;
                    if (i3 < arrayList.size()) {
                        return 9;
                    }
                    i = i3 - arrayList.size();
                }
            }
            if (O()) {
                ?? L = L();
                if (i < L) {
                    return 6;
                }
                if (i != L) {
                    if (i >= J()) {
                        i -= J();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.G;
            if (!arrayList2.isEmpty()) {
                if (i != 0) {
                    if (i <= arrayList2.size()) {
                        return 3;
                    }
                    i = ts2.k(1, i, arrayList2);
                }
            }
            ArrayList arrayList3 = this.F;
            if (!arrayList3.isEmpty()) {
                if (i != 0) {
                    if (i <= arrayList3.size()) {
                        return 8;
                    }
                    i = ts2.k(1, i, arrayList3);
                }
            }
            fm3 fm3Var = this.k0;
            ArrayList arrayList4 = fm3Var.e;
            int size = this.s.size();
            int size2 = fm3Var.d.size();
            if (size + size2 > 0 && (J() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i != 0) {
                    i--;
                }
            }
            int size3 = fm3Var.j.size();
            if (size3 > 3 && this.I0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i4 = (size4 <= 3 || !this.H0) ? size4 : 3;
            ArrayList arrayList5 = this.L;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i4 + 1;
            ArrayList arrayList6 = this.J;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            jm3 jm3Var = this.c;
            jm3 jm3Var2 = jm3.d;
            if ((jm3Var != jm3Var2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.I;
            if (!arrayList7.isEmpty() && !this.Y) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i < 0 || i >= size) && ((i2 = i - size) < 0 || i2 >= size2)) {
                int i5 = i2 - size2;
                if (i5 < 0 || i5 >= size3) {
                    int i6 = i5 - size3;
                    if (i6 < 0 || i6 >= size5) {
                        int i7 = i6 - size5;
                        if (size7 > 0) {
                            if (i7 >= 0) {
                                if (this.Y) {
                                }
                            }
                            i7 -= size7 + (!this.Y ? 1 : 0);
                        }
                        if (i7 >= 0 && i7 < size6) {
                            if (i7 != 0) {
                                if (!this.d || !arrayList6.isEmpty()) {
                                    return (this.c == jm3Var2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i6 != 0) {
                    }
                } else {
                    Object I = I(i5);
                    if (I instanceof String) {
                        if (!"section".equals((String) I)) {
                            return 7;
                        }
                    }
                }
            }
            return 0;
        }
        if (i != 0) {
            return 5;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0342  */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        long j;
        boolean z;
        boolean z2;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.User user;
        TLRPC.Chat chat;
        String str;
        ?? r7;
        TLRPC.EncryptedChat encryptedChat;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int size;
        int size2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object obj;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        CharSequence charSequence4;
        boolean z6;
        CharSequence charSequence5;
        byte b;
        boolean z7;
        boolean z8;
        CharSequence charSequence6;
        int i3;
        String str2;
        int y1;
        boolean z9;
        TLRPC.Chat chat2;
        String p;
        ArrayList<TLRPC.TL_username> arrayList2;
        int i4;
        int i5;
        String str3;
        String str4;
        final l55 l55Var;
        final byte b2;
        ?? r72;
        Runnable runnable;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        ?? r0;
        char c;
        String str5;
        Object obj2;
        Runnable runnable2;
        String str6;
        int i6 = i;
        int i7 = u69Var.f;
        View view = u69Var.a;
        ArrayList arrayList3 = this.I;
        ArrayList arrayList4 = this.K;
        ArrayList arrayList5 = this.L;
        ArrayList arrayList6 = this.y;
        int i8 = this.t0;
        ArrayList arrayList7 = this.G;
        fm3 fm3Var = this.k0;
        final byte b3 = 1;
        switch (i7) {
            case 0:
                ut8 ut8Var = (ut8) view;
                anb.h(cmb.c6, null, ut8Var);
                long dialogId = ut8Var.getDialogId();
                boolean N = N(i6);
                Object I = I(i6);
                boolean z11 = I instanceof TLRPC.TL_sponsoredPeer;
                if (z11) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) I;
                    HashSet hashSet = this.M;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z9 = N;
                            if (!Arrays.equals((byte[]) it.next(), tL_sponsoredPeer2.random_id)) {
                                N = z9;
                            }
                        } else {
                            z9 = N;
                            hashSet.add(tL_sponsoredPeer2.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer2.random_id;
                            ConnectionsManager.getInstance(i8).sendRequest(tL_messages_viewSponsoredMessage, null);
                        }
                    }
                    j = dialogId;
                    long n = pg3.n(tL_sponsoredPeer2.peer);
                    if (n >= 0) {
                        user = oc7.r1(i8).W1(Long.valueOf(n));
                        if (user != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user.usernames;
                            p = pg3.p(this.c0, user);
                            arrayList2 = arrayList8;
                            chat2 = null;
                            String str7 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str7;
                            z2 = z9;
                        } else {
                            chat2 = null;
                            arrayList2 = null;
                            p = null;
                            String str72 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str72;
                            z2 = z9;
                        }
                    } else {
                        TLRPC.Chat L0 = oc7.r1(i8).L0(Long.valueOf(-n));
                        if (L0 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = L0.usernames;
                            p = pg3.p(this.c0, L0);
                            arrayList2 = arrayList9;
                            chat2 = L0;
                            user = null;
                            String str722 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str722;
                            z2 = z9;
                        } else {
                            chat2 = L0;
                            user = null;
                            arrayList2 = null;
                            p = null;
                            String str7222 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str7222;
                            z2 = z9;
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = true;
                        i6 = ts2.k(1, i6, arrayList6);
                    }
                    if (O()) {
                        if (i6 < J()) {
                            ut8Var.N = i6 != J() + (-1);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i6 -= J();
                    } else {
                        z4 = false;
                    }
                    if (arrayList7.isEmpty()) {
                        z5 = z;
                    } else {
                        z5 = z;
                        i6 = ts2.k(1, i6, arrayList7);
                    }
                    ArrayList arrayList10 = fm3Var.e;
                    int i9 = i6;
                    ArrayList arrayList11 = fm3Var.j;
                    int size3 = this.s.size();
                    int size4 = fm3Var.d.size();
                    i2 = (size3 + size4 > 0 || (J() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i9 : i9 - 1;
                    size = arrayList11.size();
                    if (size > 3 && this.I0) {
                        size = 3;
                    }
                    int i10 = (size > 0 || !(arrayList11.get(size + (-1)) instanceof String)) ? size : size - 2;
                    size2 = arrayList10.size();
                    int i11 = i10;
                    if (size2 > 3 && this.H0) {
                        size2 = 3;
                    }
                    int size5 = (arrayList10.isEmpty() || !arrayList5.isEmpty()) ? arrayList5.size() + size2 + 1 : 0;
                    if (!z4) {
                        ut8Var.N = (i2 == (b() - J()) + (-1) || i2 == ((size3 + i11) + size4) + (-1) || i2 == (((size3 + size5) + size) + size4) + (-1)) ? false : true;
                    }
                    if (i2 >= 0 || i2 >= this.s.size() || user != null) {
                        charSequence = null;
                    } else {
                        charSequence = (CharSequence) this.H.get(i2);
                        String p2 = m9c.p(user);
                        if (charSequence == null || user == null || p2 == null || !charSequence.toString().startsWith("@".concat(p2))) {
                            charSequence2 = charSequence;
                            charSequence = null;
                            if (charSequence == null) {
                                String str8 = z4 ? this.x0 : fm3Var.c;
                                if (!TextUtils.isEmpty(str8)) {
                                    String m = user != null ? bw2.m(0, user.first_name, user.last_name) : r7 != 0 ? r7.monoforum ? no4.j(i8, r7, false) : r7.title : null;
                                    if (m == null || (y1 = gm.y1(m, str8)) == -1) {
                                        charSequence3 = charSequence;
                                        charSequence2 = charSequence2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m);
                                        charSequence3 = charSequence;
                                        spannableStringBuilder2.setSpan(new do4(cmb.p6, null), y1, str8.length() + y1, 33);
                                        charSequence2 = spannableStringBuilder2;
                                    }
                                    if (arrayList == null || arrayList.size() <= 1) {
                                        obj = I;
                                    } else {
                                        String substring = str8.startsWith("@") ? str8.substring(1) : str8;
                                        int size6 = arrayList.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < size6) {
                                                TLRPC.TL_username tL_username = arrayList.get(i12);
                                                i12++;
                                                TLRPC.TL_username tL_username2 = tL_username;
                                                obj = I;
                                                if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                                    str2 = tL_username2.username;
                                                } else {
                                                    I = obj;
                                                }
                                            } else {
                                                obj = I;
                                                str2 = null;
                                            }
                                        }
                                        if (str2 == null) {
                                            int size7 = arrayList.size();
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < size7) {
                                                    TLRPC.TL_username tL_username3 = arrayList.get(i13);
                                                    i13++;
                                                    TLRPC.TL_username tL_username4 = tL_username3;
                                                    ArrayList<TLRPC.TL_username> arrayList12 = arrayList;
                                                    if (tL_username4.active && tL_username4.username.contains(substring)) {
                                                        str2 = tL_username4.username;
                                                    } else {
                                                        arrayList = arrayList12;
                                                    }
                                                }
                                            }
                                        }
                                        if (str2 != null) {
                                            str = str2;
                                        }
                                    }
                                    if (str != null && (user == null || z2)) {
                                        if (str8.startsWith("@")) {
                                            str8 = str8.substring(1);
                                        }
                                        try {
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                            spannableStringBuilder3.append((CharSequence) "@");
                                            spannableStringBuilder3.append((CharSequence) str);
                                            int y12 = gm.y1(str, str8);
                                            if (y12 != -1) {
                                                int length = str8.length();
                                                if (y12 == 0) {
                                                    length++;
                                                } else {
                                                    y12++;
                                                }
                                                spannableStringBuilder3.setSpan(new do4(cmb.p6, null), y12, length + y12, 33);
                                            }
                                            charSequence3 = spannableStringBuilder3;
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                            charSequence3 = str;
                                        }
                                    }
                                    ut8Var.w(false, false);
                                    if (user == null && user.id == this.m0 && this.i0 != 16) {
                                        tL_sponsoredPeer = null;
                                        charSequence4 = null;
                                        z6 = true;
                                        charSequence5 = jb6.M0(2131745635, null);
                                    } else {
                                        tL_sponsoredPeer = null;
                                        charSequence4 = charSequence3;
                                        z6 = false;
                                        charSequence5 = charSequence2;
                                    }
                                    CharSequence charSequence7 = charSequence5;
                                    if (r7 != 0 || r7.participants_count == 0) {
                                        if (user != null && user.bot && (i3 = user.bot_active_users) != 0) {
                                            String H = jb6.H(' ', "BotUsersShort", i3);
                                            if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                                ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H);
                                            } else if (TextUtils.isEmpty(charSequence4)) {
                                                b = 2;
                                                z7 = true;
                                                z8 = false;
                                                charSequence6 = H;
                                            } else {
                                                z8 = false;
                                                z7 = true;
                                                b = 2;
                                                charSequence4 = TextUtils.concat(charSequence4, ", ", H);
                                                charSequence6 = charSequence4;
                                            }
                                        }
                                        b = 2;
                                        z7 = true;
                                        z8 = false;
                                        charSequence6 = charSequence4;
                                    } else {
                                        String H2 = (!sd2.T(r7) || r7.megagroup) ? jb6.H(' ', "Members", r7.participants_count) : jb6.H(' ', "Subscribers", r7.participants_count);
                                        if (charSequence4 instanceof SpannableStringBuilder) {
                                            ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H2);
                                        } else {
                                            charSequence4 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", H2) : H2;
                                        }
                                        charSequence6 = charSequence4;
                                        b = 2;
                                        z7 = true;
                                        z8 = false;
                                    }
                                    sk3 sk3Var = new sk3(this, b);
                                    ut8Var.C0 = z4;
                                    ut8Var.D0 = sk3Var;
                                    ut8Var.setOnSponsoredOptionsClick(new h92(this, (byte) 21));
                                    ut8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                                    ut8Var.x(user != null ? user : r7, encryptedChat, charSequence7, charSequence6, true, z6);
                                    ut8Var.w(this.V.a.K2.contains(Long.valueOf(ut8Var.getDialogId())), j == ut8Var.getDialogId() ? z7 : z8);
                                    break;
                                }
                            }
                            charSequence3 = charSequence;
                            obj = I;
                            ut8Var.w(false, false);
                            if (user == null) {
                            }
                            tL_sponsoredPeer = null;
                            charSequence4 = charSequence3;
                            z6 = false;
                            charSequence5 = charSequence2;
                            CharSequence charSequence72 = charSequence5;
                            if (r7 != 0) {
                            }
                            if (user != null) {
                                String H3 = jb6.H(' ', "BotUsersShort", i3);
                                if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                }
                            }
                            b = 2;
                            z7 = true;
                            z8 = false;
                            charSequence6 = charSequence4;
                            sk3 sk3Var2 = new sk3(this, b);
                            ut8Var.C0 = z4;
                            ut8Var.D0 = sk3Var2;
                            ut8Var.setOnSponsoredOptionsClick(new h92(this, (byte) 21));
                            ut8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                            ut8Var.x(user != null ? user : r7, encryptedChat, charSequence72, charSequence6, true, z6);
                            ut8Var.w(this.V.a.K2.contains(Long.valueOf(ut8Var.getDialogId())), j == ut8Var.getDialogId() ? z7 : z8);
                        }
                    }
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    ut8Var.w(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z6 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence722 = charSequence5;
                    if (r7 != 0) {
                    }
                    if (user != null) {
                    }
                    b = 2;
                    z7 = true;
                    z8 = false;
                    charSequence6 = charSequence4;
                    sk3 sk3Var22 = new sk3(this, b);
                    ut8Var.C0 = z4;
                    ut8Var.D0 = sk3Var22;
                    ut8Var.setOnSponsoredOptionsClick(new h92(this, (byte) 21));
                    ut8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                    ut8Var.x(user != null ? user : r7, encryptedChat, charSequence722, charSequence6, true, z6);
                    ut8Var.w(this.V.a.K2.contains(Long.valueOf(ut8Var.getDialogId())), j == ut8Var.getDialogId() ? z7 : z8);
                } else {
                    j = dialogId;
                    if (I instanceof TLRPC.User) {
                        user = (TLRPC.User) I;
                        arrayList = user.usernames;
                        str = pg3.p(this.c0, user);
                        z = z11;
                        z2 = N;
                        chat = null;
                    } else {
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) I;
                            z = z11;
                            TLRPC.Chat L02 = oc7.r1(i8).L0(Long.valueOf(chat3.id));
                            if (L02 != null) {
                                chat3 = L02;
                            }
                            arrayList = chat3.usernames;
                            str = pg3.p(this.c0, chat3);
                            z2 = N;
                            encryptedChat = null;
                            r7 = chat3;
                            user = null;
                        } else {
                            z = z11;
                            if (I instanceof TLRPC.EncryptedChat) {
                                TLRPC.EncryptedChat Z0 = oc7.r1(i8).Z0(Integer.valueOf(((TLRPC.EncryptedChat) I).id));
                                z2 = N;
                                r7 = 0;
                                str = null;
                                encryptedChat = Z0;
                                user = oc7.r1(i8).W1(Long.valueOf(Z0.user_id));
                                arrayList = null;
                            } else {
                                z2 = N;
                                arrayList = null;
                                user = null;
                                chat = null;
                                str = null;
                            }
                        }
                        if (arrayList6.isEmpty()) {
                        }
                        if (O()) {
                        }
                        if (arrayList7.isEmpty()) {
                        }
                        ArrayList arrayList102 = fm3Var.e;
                        int i92 = i6;
                        ArrayList arrayList112 = fm3Var.j;
                        int size32 = this.s.size();
                        int size42 = fm3Var.d.size();
                        if (size32 + size42 > 0) {
                        }
                        size = arrayList112.size();
                        if (size > 3) {
                            size = 3;
                        }
                        if (size > 0) {
                        }
                        size2 = arrayList102.size();
                        int i112 = i10;
                        if (size2 > 3) {
                            size2 = 3;
                        }
                        if (arrayList102.isEmpty()) {
                        }
                        if (!z4) {
                        }
                        if (i2 >= 0) {
                        }
                        charSequence = null;
                        charSequence2 = null;
                        if (charSequence == null) {
                        }
                        charSequence3 = charSequence;
                        obj = I;
                        ut8Var.w(false, false);
                        if (user == null) {
                        }
                        tL_sponsoredPeer = null;
                        charSequence4 = charSequence3;
                        z6 = false;
                        charSequence5 = charSequence2;
                        CharSequence charSequence7222 = charSequence5;
                        if (r7 != 0) {
                        }
                        if (user != null) {
                        }
                        b = 2;
                        z7 = true;
                        z8 = false;
                        charSequence6 = charSequence4;
                        sk3 sk3Var222 = new sk3(this, b);
                        ut8Var.C0 = z4;
                        ut8Var.D0 = sk3Var222;
                        ut8Var.setOnSponsoredOptionsClick(new h92(this, (byte) 21));
                        ut8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                        ut8Var.x(user != null ? user : r7, encryptedChat, charSequence7222, charSequence6, true, z6);
                        ut8Var.w(this.V.a.K2.contains(Long.valueOf(ut8Var.getDialogId())), j == ut8Var.getDialogId() ? z7 : z8);
                    }
                }
                encryptedChat = null;
                r7 = chat;
                if (arrayList6.isEmpty()) {
                }
                if (O()) {
                }
                if (arrayList7.isEmpty()) {
                }
                ArrayList arrayList1022 = fm3Var.e;
                int i922 = i6;
                ArrayList arrayList1122 = fm3Var.j;
                int size322 = this.s.size();
                int size422 = fm3Var.d.size();
                if (size322 + size422 > 0) {
                }
                size = arrayList1122.size();
                if (size > 3) {
                }
                if (size > 0) {
                }
                size2 = arrayList1022.size();
                int i1122 = i10;
                if (size2 > 3) {
                }
                if (arrayList1022.isEmpty()) {
                }
                if (!z4) {
                }
                if (i2 >= 0) {
                }
                charSequence = null;
                charSequence2 = null;
                if (charSequence == null) {
                }
                charSequence3 = charSequence;
                obj = I;
                ut8Var.w(false, false);
                if (user == null) {
                }
                tL_sponsoredPeer = null;
                charSequence4 = charSequence3;
                z6 = false;
                charSequence5 = charSequence2;
                CharSequence charSequence72222 = charSequence5;
                if (r7 != 0) {
                }
                if (user != null) {
                }
                b = 2;
                z7 = true;
                z8 = false;
                charSequence6 = charSequence4;
                sk3 sk3Var2222 = new sk3(this, b);
                ut8Var.C0 = z4;
                ut8Var.D0 = sk3Var2222;
                ut8Var.setOnSponsoredOptionsClick(new h92(this, (byte) 21));
                ut8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                ut8Var.x(user != null ? user : r7, encryptedChat, charSequence72222, charSequence6, true, z6);
                ut8Var.w(this.V.a.K2.contains(Long.valueOf(ut8Var.getDialogId())), j == ut8Var.getDialogId() ? z7 : z8);
                break;
            case 1:
                final l55 l55Var2 = (l55) view;
                if (!arrayList4.isEmpty()) {
                    String M0 = jb6.M0(2131749098, null);
                    String M02 = jb6.M0(2131752036, null);
                    final byte b4 = r6 ? (byte) 1 : (byte) 0;
                    l55Var2.b(M0, M02, new View.OnClickListener(this) { // from class: yl3
                        public final /* synthetic */ mm3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b5 = b4;
                            mm3 mm3Var = this.b;
                            switch (b5) {
                                case 0:
                                    uj3 uj3Var = mm3Var.V;
                                    if (uj3Var != null) {
                                        uj3Var.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    sj3 sj3Var = ((ov9) mm3Var).L0;
                                    mv9 mv9Var = sj3Var.y0;
                                    ov9 ov9Var = sj3Var.e0;
                                    String str9 = ov9Var.E;
                                    ArrayList arrayList13 = ov9Var.y;
                                    int i14 = ov9Var.x;
                                    int i15 = ov9Var.w;
                                    ArrayList arrayList14 = mv9Var.R;
                                    if (!TextUtils.equals(str9, mv9Var.b0)) {
                                        mv9Var.W();
                                        arrayList14.clear();
                                        arrayList14.addAll(arrayList13);
                                        mv9Var.Z = i15;
                                        mv9Var.Y = i15 > arrayList13.size();
                                        mv9Var.c0 = i14;
                                        mv9Var.b0 = str9;
                                        mv9Var.O(true);
                                    }
                                    sj3Var.t0 = true;
                                    sj3Var.w0.g1(0, 0);
                                    sj3Var.S();
                                    mgc mgcVar = sj3Var.N;
                                    if (mgcVar != null && mgcVar.getCurrentTabId() != 1) {
                                        sj3Var.N.e(1, 1);
                                    }
                                    mv9Var.Z(sj3Var.N0);
                                    break;
                                case 2:
                                    uj3 uj3Var2 = mm3Var.V;
                                    if (uj3Var2 != null) {
                                        uj3Var2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    uj3 uj3Var3 = mm3Var.V;
                                    if (uj3Var3 != null) {
                                        uj3Var3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i4 = i6;
                    } else if (i6 == 0) {
                        l55Var2.b(jb6.M0(2131746317, null), gm.E2(jb6.M0(2131746319, null), false, gm.L(-2.0f), gm.L(1.0f)), new View.OnClickListener(this) { // from class: yl3
                            public final /* synthetic */ mm3 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b5 = b3;
                                mm3 mm3Var = this.b;
                                switch (b5) {
                                    case 0:
                                        uj3 uj3Var = mm3Var.V;
                                        if (uj3Var != null) {
                                            uj3Var.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        sj3 sj3Var = ((ov9) mm3Var).L0;
                                        mv9 mv9Var = sj3Var.y0;
                                        ov9 ov9Var = sj3Var.e0;
                                        String str9 = ov9Var.E;
                                        ArrayList arrayList13 = ov9Var.y;
                                        int i14 = ov9Var.x;
                                        int i15 = ov9Var.w;
                                        ArrayList arrayList14 = mv9Var.R;
                                        if (!TextUtils.equals(str9, mv9Var.b0)) {
                                            mv9Var.W();
                                            arrayList14.clear();
                                            arrayList14.addAll(arrayList13);
                                            mv9Var.Z = i15;
                                            mv9Var.Y = i15 > arrayList13.size();
                                            mv9Var.c0 = i14;
                                            mv9Var.b0 = str9;
                                            mv9Var.O(true);
                                        }
                                        sj3Var.t0 = true;
                                        sj3Var.w0.g1(0, 0);
                                        sj3Var.S();
                                        mgc mgcVar = sj3Var.N;
                                        if (mgcVar != null && mgcVar.getCurrentTabId() != 1) {
                                            sj3Var.N.e(1, 1);
                                        }
                                        mv9Var.Z(sj3Var.N0);
                                        break;
                                    case 2:
                                        uj3 uj3Var2 = mm3Var.V;
                                        if (uj3Var2 != null) {
                                            uj3Var2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        uj3 uj3Var3 = mm3Var.V;
                                        if (uj3Var3 != null) {
                                            uj3Var3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i4 = ts2.k(1, i6, arrayList6);
                    }
                    ArrayList arrayList13 = fm3Var.e;
                    ArrayList arrayList14 = fm3Var.j;
                    boolean O = O();
                    ArrayList arrayList15 = this.F;
                    if (O || !arrayList7.isEmpty() || !arrayList15.isEmpty() || !arrayList6.isEmpty()) {
                        ?? L = L();
                        if (i4 >= L) {
                            if (i4 != L || !O()) {
                                if (i4 == J() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList15.isEmpty() ? 0 : arrayList15.size() + 1) && !this.s.isEmpty()) {
                                    l55Var2.setText(jb6.M0(2131745557, null));
                                    break;
                                } else {
                                    i4 -= J();
                                }
                            } else if (!this.O) {
                                final byte b5 = 2;
                                l55Var2.b(jb6.M0(2131746103, null), jb6.M0(2131752036, null), new View.OnClickListener(this) { // from class: yl3
                                    public final /* synthetic */ mm3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        byte b52 = b5;
                                        mm3 mm3Var = this.b;
                                        switch (b52) {
                                            case 0:
                                                uj3 uj3Var = mm3Var.V;
                                                if (uj3Var != null) {
                                                    uj3Var.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                sj3 sj3Var = ((ov9) mm3Var).L0;
                                                mv9 mv9Var = sj3Var.y0;
                                                ov9 ov9Var = sj3Var.e0;
                                                String str9 = ov9Var.E;
                                                ArrayList arrayList132 = ov9Var.y;
                                                int i14 = ov9Var.x;
                                                int i15 = ov9Var.w;
                                                ArrayList arrayList142 = mv9Var.R;
                                                if (!TextUtils.equals(str9, mv9Var.b0)) {
                                                    mv9Var.W();
                                                    arrayList142.clear();
                                                    arrayList142.addAll(arrayList132);
                                                    mv9Var.Z = i15;
                                                    mv9Var.Y = i15 > arrayList132.size();
                                                    mv9Var.c0 = i14;
                                                    mv9Var.b0 = str9;
                                                    mv9Var.O(true);
                                                }
                                                sj3Var.t0 = true;
                                                sj3Var.w0.g1(0, 0);
                                                sj3Var.S();
                                                mgc mgcVar = sj3Var.N;
                                                if (mgcVar != null && mgcVar.getCurrentTabId() != 1) {
                                                    sj3Var.N.e(1, 1);
                                                }
                                                mv9Var.Z(sj3Var.N0);
                                                break;
                                            case 2:
                                                uj3 uj3Var2 = mm3Var.V;
                                                if (uj3Var2 != null) {
                                                    uj3Var2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                uj3 uj3Var3 = mm3Var.V;
                                                if (uj3Var3 != null) {
                                                    uj3Var3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final byte b6 = 3;
                                l55Var2.b(jb6.M0(2131746103, null), jb6.M0(2131752038, null), new View.OnClickListener(this) { // from class: yl3
                                    public final /* synthetic */ mm3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        byte b52 = b6;
                                        mm3 mm3Var = this.b;
                                        switch (b52) {
                                            case 0:
                                                uj3 uj3Var = mm3Var.V;
                                                if (uj3Var != null) {
                                                    uj3Var.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                sj3 sj3Var = ((ov9) mm3Var).L0;
                                                mv9 mv9Var = sj3Var.y0;
                                                ov9 ov9Var = sj3Var.e0;
                                                String str9 = ov9Var.E;
                                                ArrayList arrayList132 = ov9Var.y;
                                                int i14 = ov9Var.x;
                                                int i15 = ov9Var.w;
                                                ArrayList arrayList142 = mv9Var.R;
                                                if (!TextUtils.equals(str9, mv9Var.b0)) {
                                                    mv9Var.W();
                                                    arrayList142.clear();
                                                    arrayList142.addAll(arrayList132);
                                                    mv9Var.Z = i15;
                                                    mv9Var.Y = i15 > arrayList132.size();
                                                    mv9Var.c0 = i14;
                                                    mv9Var.b0 = str9;
                                                    mv9Var.O(true);
                                                }
                                                sj3Var.t0 = true;
                                                sj3Var.w0.g1(0, 0);
                                                sj3Var.S();
                                                mgc mgcVar = sj3Var.N;
                                                if (mgcVar != null && mgcVar.getCurrentTabId() != 1) {
                                                    sj3Var.N.e(1, 1);
                                                }
                                                mv9Var.Z(sj3Var.N0);
                                                break;
                                            case 2:
                                                uj3 uj3Var2 = mm3Var.V;
                                                if (uj3Var2 != null) {
                                                    uj3Var2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                uj3 uj3Var3 = mm3Var.V;
                                                if (uj3Var3 != null) {
                                                    uj3Var3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            l55Var2.setText(jb6.M0(2131752174, null));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = fm3Var.d.size();
                    int size10 = arrayList14.size();
                    if (size10 > 3 && this.I0) {
                        size10 = 3;
                    }
                    int size11 = arrayList13.size();
                    if (size11 > 3 && this.H0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList13.isEmpty() && arrayList5.isEmpty()) ? 0 : arrayList5.size() + size11 + 1;
                    int size13 = arrayList3.isEmpty() ? 0 : arrayList3.size() + 1;
                    ArrayList arrayList16 = this.J;
                    if (!arrayList16.isEmpty()) {
                        arrayList16.size();
                    }
                    int i14 = size13;
                    if (this.c != jm3.d || this.d) {
                        arrayList16.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i5 = 1;
                        str3 = null;
                        str4 = null;
                    } else {
                        if (i4 == 0) {
                            str3 = null;
                            str6 = jb6.M0(2131743683, null);
                        } else {
                            str3 = null;
                            str6 = null;
                        }
                        i5 = 1;
                        i4 = ts2.k(1, i4, arrayList7);
                        str4 = str6;
                    }
                    if (!arrayList15.isEmpty()) {
                        if (i4 == 0) {
                            str4 = jb6.M0(2131748864, str3);
                        }
                        i4 = ts2.k(i5, i4, arrayList15);
                    }
                    if (str4 == null) {
                        int i15 = i4 - (size8 + size9);
                        if (i15 < 0 || i15 >= size10) {
                            int i16 = i15 - size10;
                            if (i16 < 0 || i16 >= size12) {
                                l55Var = l55Var2;
                                r72 = null;
                                if (this.V == null || i14 <= 0 || i16 - size12 > 1) {
                                    this.G0 = i16;
                                    SpannableStringBuilder H4 = H(this.c);
                                    b2 = 1;
                                    Runnable runnable3 = new Runnable(this) { // from class: zl3
                                        public final /* synthetic */ mm3 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (b2) {
                                                case 0:
                                                    mm3 mm3Var = this.b;
                                                    boolean z12 = mm3Var.I0;
                                                    mm3Var.I0 = !z12;
                                                    l55Var.setRightText(jb6.M0(!z12 ? 2131745073 : 2131745074, null));
                                                    mm3Var.f();
                                                    break;
                                                default:
                                                    mm3 mm3Var2 = this.b;
                                                    nk3 nk3Var = mm3Var2.s0;
                                                    l55 l55Var3 = l55Var;
                                                    bu5 I2 = bu5.I(nk3Var, l55Var3);
                                                    for (jm3 jm3Var : jm3.values()) {
                                                        boolean z13 = jm3Var.a == mm3Var2.c.a;
                                                        I2.h(new rh((Object) mm3Var2, z13, (Object) l55Var3, (Object) jm3Var, (byte) 15), jb6.M0(jm3Var.b, null), z13);
                                                    }
                                                    I2.W(5);
                                                    I2.b0 = true;
                                                    I2.t = false;
                                                    I2.s = (short) 0;
                                                    I2.a0();
                                                    break;
                                            }
                                        }
                                    };
                                    str4 = jb6.M0(2131745490, null);
                                    spannableStringBuilder = H4;
                                    runnable = runnable3;
                                } else {
                                    TLRPC.Chat L03 = oc7.r1(i8).L0(Long.valueOf(-this.V.a()));
                                    if (L03 == null) {
                                        str5 = "null";
                                        c = 0;
                                    } else if (L03.monoforum) {
                                        c = 0;
                                        str5 = no4.j(i8, L03, false);
                                    } else {
                                        c = 0;
                                        str5 = L03.title;
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c] = str5;
                                    str4 = jb6.a0(null, null, 2131745478, objArr);
                                }
                            } else {
                                r72 = null;
                                str4 = jb6.M0(2131749309, null);
                                if (fm3Var.e.size() > 3) {
                                    l55Var = l55Var2;
                                    z10 = this.H0;
                                    spannableStringBuilder = null;
                                    obj2 = new up6((Object) this, (Object) arrayList13, i, (Object) l55Var, (byte) 20);
                                    b2 = 1;
                                    r0 = obj2;
                                } else {
                                    l55Var = l55Var2;
                                }
                            }
                            SpannableStringBuilder spannableStringBuilder4 = r72;
                            spannableStringBuilder = spannableStringBuilder4;
                            z10 = false;
                            obj2 = spannableStringBuilder4;
                            b2 = 1;
                            r0 = obj2;
                        } else {
                            str4 = jb6.M0(2131747016, null);
                            if (arrayList14.size() > 3) {
                                z10 = this.I0;
                                final byte b7 = 0;
                                Runnable runnable4 = new Runnable(this) { // from class: zl3
                                    public final /* synthetic */ mm3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (b7) {
                                            case 0:
                                                mm3 mm3Var = this.b;
                                                boolean z12 = mm3Var.I0;
                                                mm3Var.I0 = !z12;
                                                l55Var2.setRightText(jb6.M0(!z12 ? 2131745073 : 2131745074, null));
                                                mm3Var.f();
                                                break;
                                            default:
                                                mm3 mm3Var2 = this.b;
                                                nk3 nk3Var = mm3Var2.s0;
                                                l55 l55Var3 = l55Var2;
                                                bu5 I2 = bu5.I(nk3Var, l55Var3);
                                                for (jm3 jm3Var : jm3.values()) {
                                                    boolean z13 = jm3Var.a == mm3Var2.c.a;
                                                    I2.h(new rh((Object) mm3Var2, z13, (Object) l55Var3, (Object) jm3Var, (byte) 15), jb6.M0(jm3Var.b, null), z13);
                                                }
                                                I2.W(5);
                                                I2.b0 = true;
                                                I2.t = false;
                                                I2.s = (short) 0;
                                                I2.a0();
                                                break;
                                        }
                                    }
                                };
                                l55Var = l55Var2;
                                runnable2 = runnable4;
                                spannableStringBuilder = null;
                            } else {
                                l55Var = l55Var2;
                                runnable2 = null;
                                spannableStringBuilder = null;
                                z10 = false;
                            }
                            b2 = 1;
                            r72 = null;
                            r0 = runnable2;
                        }
                        if (r0 == 0) {
                            if (spannableStringBuilder == null) {
                                l55Var.b(str4, jb6.M0(z10 ? 2131745073 : 2131745074, r72), new xl3(r0, (byte) 0));
                                l55Var.setRightTextMargin(16);
                                break;
                            } else {
                                l55Var.b(str4, spannableStringBuilder, new xl3(r0, b2));
                                l55Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            l55Var.setText(str4);
                            break;
                        }
                    } else {
                        l55Var = l55Var2;
                        b2 = 1;
                        r72 = null;
                        runnable = null;
                        spannableStringBuilder = null;
                    }
                    z10 = false;
                    r0 = runnable;
                    if (r0 == 0) {
                    }
                }
                break;
            case 2:
            case 9:
                hg3 hg3Var = (hg3) view;
                anb.h(cmb.c6, null, hg3Var);
                hg3Var.t2 = i6 != b() - 1;
                k47 k47Var = (k47) I(i6);
                hg3Var.P = arrayList3.contains(k47Var);
                if (k47Var != null) {
                    hg3Var.e0(k47.B0(k47Var.k), k47Var, k47Var.k.date, false, false);
                    break;
                } else {
                    hg3Var.e0(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((zvb) view).setTopic((TLRPC.TL_forumTopic) I(i6));
                break;
            case 5:
                ue5 ue5Var = (ue5) view;
                anb.h(cmb.c6, null, ue5Var);
                ue5Var.setText((CharSequence) arrayList4.get(i6 - 1));
                ue5Var.setNeedDivider(i6 != arrayList4.size());
                break;
            case 6:
                ((hm3) ((r59) view).getAdapter()).f();
                break;
            case 7:
                String str9 = (String) I(i6);
                xib xibVar = (xib) view;
                xibVar.g(-1, cmb.n6);
                xibVar.k(jb6.a0("AddContactByPhone", null, 2131754449, r58.f().e("+" + str9)), false);
                break;
            case 8:
                ut8 ut8Var2 = (ut8) view;
                yv2 yv2Var = (yv2) I(i6);
                ut8Var2.x(yv2Var, null, bw2.m(0, yv2Var.i, yv2Var.j), mlb.l(new StringBuilder("+"), (String) yv2Var.g.get(0), r58.f()), false, false);
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int i2 = this.i0;
        boolean z = true;
        ylb ylbVar = null;
        Activity activity = this.e;
        switch (i) {
            case 0:
                ut8 ut8Var = new ut8(activity, null);
                ut8Var.m0 = i2 == 3;
                view = ut8Var;
                break;
            case 1:
                view = new l55(activity, null);
                break;
            case 2:
            case 9:
                view = new gm3(false ? 1 : 0, activity, z);
                break;
            case 3:
                view = new zvb(activity);
                break;
            case 4:
                tk4 tk4Var = new tk4(activity, null);
                tk4Var.setViewType(1);
                tk4Var.setIsSingleCell(true);
                view = tk4Var;
                break;
            case 5:
                ue5 ue5Var = new ue5(activity);
                ue5Var.setGravity(16);
                ue5Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                ue5Var.setTextSize(1, 17.0f);
                anb.X(ue5Var, cmb.F6, null);
                view = ue5Var;
                break;
            case 6:
                smb smbVar = new smb(activity, ylbVar, (byte) 6);
                anb.l(smbVar, 20, cmb.h6, null);
                smbVar.setTag(9);
                smbVar.setItemAnimator(null);
                smbVar.setLayoutAnimation(null);
                zs zsVar = new zs((byte) 5);
                zsVar.i1(0);
                smbVar.setLayoutManager(zsVar);
                smbVar.setAdapter(new hm3(this.t0, null, this.e, false, i2 == 3));
                smbVar.setOnItemClickListener(new u(this, (byte) 22));
                smbVar.setOnItemLongClickListener(new cm3(this));
                this.l0 = smbVar;
                view = smbVar;
                break;
            case 7:
            default:
                view = new xib(16, activity, false);
                break;
            case 8:
                view = new ut8(activity, null);
                break;
            case 10:
                qmb qmbVar = new qmb(activity, (byte) 4);
                qmbVar.setOrientation(1);
                bf0 bf0Var = new bf0(activity);
                bf0Var.setImageDrawable(new p09(R.raw.utyan_empty, gm.L(120.0f), gm.L(120.0f)));
                qmbVar.addView(bf0Var, qoe.t(nm7.E1, nm7.E1, 1, 0, 27, 0, 0));
                TextView textView = new TextView(activity);
                textView.setTextSize(1, 17.0f);
                int i3 = cmb.F6;
                anb.X(textView, i3, null);
                textView.setTypeface(gm.o());
                textView.setText(jb6.M0(2131745483, null));
                textView.setGravity(17);
                qmbVar.addView(textView, qoe.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(activity);
                qmbVar.b = textView2;
                textView2.setTextSize(1, 14.0f);
                anb.X(textView2, i3, null);
                textView2.setText(jb6.a0(null, null, 2131745484, ""));
                textView2.setGravity(17);
                qmbVar.addView(textView2, qoe.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(activity);
                textView3.setPadding(gm.L(12.0f), gm.L(4.0f), gm.L(12.0f), gm.L(4.0f));
                ts2.q(14.0f, 1, 2131745485, textView3, null);
                int i4 = cmb.Ei;
                anb.X(textView3, i4, null);
                int p1 = cmb.p1(0.15f, cmb.w0(null, i4, false));
                fg0 i0 = cmb.i0(6, 6, 6, 6, 0, p1, p1);
                wmb K = anb.K(0.15f, i4);
                textView3.setBackground(i0);
                anb.j(textView3, i0, null, K, null);
                textView3.setOnClickListener(new sf3(new bi3(this, (byte) 11), (byte) 4));
                qmbVar.addView(textView3, qoe.t(-2, -2, 1, 0, 0, 0, 38));
                this.F0 = qmbVar;
                textView2.setText(jb6.a0(null, null, 2131745484, this.a0));
                view = qmbVar;
                break;
        }
        if (i == 5) {
            view.setLayoutParams(new g69(-1, gm.L(86.0f)));
        } else {
            view.setLayoutParams(new g69(-1, -2));
        }
        return new b59(view);
    }
}
