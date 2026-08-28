package of;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kh.b8;
import kh.i9;
import kh.o8;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.dy;
import org.telegram.ui.jv;
import org.telegram.ui.mx;
import org.telegram.ui.ox;
import org.telegram.ui.va1;
import org.telegram.ui.w00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class f0 extends vk0 {
    public b0 A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public String I;
    public boolean J;
    public int L;
    public String N;
    public int O;
    public int P;
    public ox Q;
    public final int R;
    public boolean S;
    public boolean T;
    public String V;
    public int W;
    public String X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public boolean d;
    public final int d0;
    public final Context e;
    public final f2.n e0;
    public s f;
    public final w f0;
    public va1 g0;
    public s h;
    public final long h0;
    public long j0;
    public View k0;
    public o8 l0;
    public ArrayList m0;
    public final dy n0;
    public final int o0;
    public ArrayList p0;
    public final ArrayList q0;
    public d5.i r;
    public final ArrayList r0;
    public String s0;
    public a0.h t0;
    public final ArrayList u0;
    public int v;
    public boolean v0;
    public int w;
    public w00 w0;
    public int x0;
    public String y;
    public int y0;
    public int z0;
    public c0 c = c0.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final HashSet H = new HashSet();
    public int K = 0;
    public int M = 0;
    public int U = -1;
    public boolean i0 = false;

    public f0(Context context, dy dyVar, int i9, int i10, f2.n nVar, boolean z10) {
        int i11 = UserConfig.selectedAccount;
        this.o0 = i11;
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = null;
        this.t0 = new a0.h();
        this.u0 = new ArrayList();
        this.B0 = -1;
        this.C0 = true;
        this.D0 = true;
        this.e0 = nVar;
        this.n0 = dyVar;
        an0 an0Var = (an0) this;
        w wVar = new w(an0Var);
        this.f0 = wVar;
        wVar.a = new n5.e0(an0Var, 6);
        wVar.p = z10;
        this.e = context;
        this.R = i9;
        this.d0 = i10;
        this.h0 = UserConfig.getInstance(i11).getClientUserId();
        if (i10 != 15) {
            MessagesStorage.getInstance(i11).getStorageQueue().postRunnable(new h3.y(i11, i10, new v(this), 2));
        }
        MediaDataController.getInstance(i11).loadHints(true);
    }

    public static boolean Y(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i9 = 0; i9 < split.length; i9++) {
                String str3 = split[i9];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i9]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 1 || i9 == 4 || i9 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.J;
        ArrayList arrayList = this.q0;
        ArrayList arrayList2 = this.r0;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                e0 e0Var = (e0) arrayList2.remove(0);
                this.p0.remove(e0Var);
                arrayList.remove(e0Var);
                this.t0.l(e0Var.c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(e0Var.c);
                } else {
                    sb2.append(", ");
                    sb2.append(e0Var.c);
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder("1");
            } else {
                sb2.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.p0.clear();
            this.t0.b();
            sb2 = new StringBuilder("1");
        }
        String str = this.I;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.o0).getStorageQueue().postRunnable(new o8(16, (an0) this, sb2));
    }

    public final boolean F(Object obj) {
        if (this.d0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        dy dyVar = this.n0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? dyVar.w2 : dyVar.v2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return ChatObject.isChannel(chat) ? dyVar.u2 : ChatObject.isMegagroup(chat) ? dyVar.r2 || dyVar.s2 : dyVar.r2 || dyVar.t2;
    }

    public final void G(String str) {
        ox oxVar;
        String str2;
        String str3;
        this.s0 = str;
        ArrayList arrayList = this.r0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.q0;
            arrayList2.clear();
            int size = this.p0.size();
            for (int i9 = 0; i9 < size; i9++) {
                ox oxVar2 = this.Q;
                if ((oxVar2 == null || oxVar2.a() != ((e0) this.p0.get(i9)).c) && F(((e0) this.p0.get(i9)).a)) {
                    arrayList2.add((e0) this.p0.get(i9));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.p0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            e0 e0Var = (e0) this.p0.get(i10);
            if (e0Var != null && e0Var.a != null && (((oxVar = this.Q) == null || oxVar.a() != e0Var.c) && F(((e0) this.p0.get(i10)).a))) {
                TLObject tLObject = e0Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? vf.c.i(chat, this.o0, false) : chat.title;
                    str3 = ((TLRPC.Chat) e0Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) e0Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(e0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(c0 c0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(c0Var.c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new eq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final va1 I() {
        return this.g0;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public final Object J(int i9) {
        int i10;
        int i11;
        TLRPC.Chat chat;
        int i12;
        ArrayList arrayList = this.x;
        if (!arrayList.isEmpty()) {
            if (i9 > 0 && i9 - 1 < arrayList.size()) {
                return arrayList.get(i12);
            }
            i9 = j3.r0.g(1, i9, arrayList);
        }
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            if (i9 > 0) {
                return arrayList2.get(i9 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            ArrayList arrayList3 = this.J ? this.r0 : this.q0;
            if (i9 > M && (i11 = (i9 - 1) - (M == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((e0) arrayList3.get(i11)).a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i13 = this.o0;
                if (!z10) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(i13).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                return user != null ? user : tLObject;
            }
            i9 -= K();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            if (i9 > 0 && i9 <= arrayList4.size()) {
                return arrayList4.get(i9 - 1);
            }
            i9 = j3.r0.g(1, i9, arrayList4);
        }
        ArrayList arrayList5 = this.A;
        if (!arrayList5.isEmpty()) {
            if (i9 > 0 && i9 <= arrayList5.size()) {
                return arrayList5.get(i9 - 1);
            }
            i9 = j3.r0.g(1, i9, arrayList5);
        }
        w wVar = this.f0;
        ArrayList arrayList6 = wVar.e;
        ArrayList arrayList7 = wVar.d;
        ArrayList arrayList8 = wVar.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (K() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i9 == 0) {
                return null;
            }
            i9--;
        }
        int size3 = arrayList8.size();
        if (size3 > 3 && this.D0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i14 = (size4 <= 3 || !this.C0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i15 = 0;
        ArrayList arrayList9 = this.G;
        int size5 = (isEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i14 + 1;
        if (i9 >= 0 && i9 < size) {
            return this.s.get(i9);
        }
        int i16 = i9 - size;
        if (i16 >= 0 && i16 < size2) {
            return arrayList7.get(i16);
        }
        int i17 = i16 - size2;
        if (i17 >= 0 && i17 < size3) {
            return arrayList8.get(i17);
        }
        int i18 = i17 - size3;
        if (i18 <= 0 || i18 >= size5) {
            i10 = i18 - size5;
        } else {
            int i19 = i18 - 1;
            if (i19 >= 0 && i19 < arrayList9.size()) {
                return arrayList9.get(i19);
            }
            i10 = i19 - arrayList9.size();
            if (i10 >= 0 && i10 < arrayList6.size()) {
                return arrayList6.get(i10);
            }
        }
        ArrayList arrayList10 = this.D;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i10 > 0 && i10 <= arrayList10.size()) {
            return arrayList10.get(i10 - 1);
        }
        if (!this.T && !arrayList10.isEmpty()) {
            i15 = 1;
        }
        int i20 = i10 - (size6 + i15);
        ArrayList arrayList11 = this.E;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i20 <= 0 || i20 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i20 - 1);
    }

    public final int K() {
        ArrayList arrayList = this.J ? this.r0 : this.q0;
        return (M() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int L() {
        if (this.z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.x;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (P()) {
            size += K();
            if (!this.J) {
                return size;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        int size3 = this.f0.d.size();
        int i9 = size + size2 + size3;
        return size2 + size3 > 0 ? (K() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i9 : i9 + 1 : i9;
    }

    public final boolean M() {
        if (this.J || MediaDataController.getInstance(this.o0).hints.isEmpty()) {
            return false;
        }
        return this.d0 != 14 || this.n0.v2;
    }

    public final boolean N() {
        return S() && K() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean O(int i9) {
        int i10;
        int i11;
        if (this.J && this.F.isEmpty()) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                i9 = j3.r0.g(1, i9, arrayList);
            }
            if (P()) {
                ?? M = M();
                ArrayList arrayList2 = this.J ? this.r0 : this.q0;
                if (i9 <= M || (i9 - 1) - (M == true ? 1 : 0) >= arrayList2.size()) {
                    i9 -= K();
                }
            }
            w wVar = this.f0;
            ArrayList arrayList3 = wVar.e;
            ArrayList arrayList4 = wVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = wVar.j.size();
            if (size3 > 3 && this.D0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i12 = (size4 <= 3 || !this.C0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.G;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i12 + 1;
            int size6 = this.A.size();
            if (size6 > 0) {
                if (i9 < 0 || i9 >= size6) {
                    i9 -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (K() > 0 || !this.B.isEmpty() || !arrayList.isEmpty())) {
                if (i9 != 0) {
                    i9--;
                }
            }
            if ((i9 < 0 || i9 >= size) && (((i10 = i9 - size) < 0 || i10 >= size2) && ((i11 = i10 - size2) <= 0 || i11 >= size3))) {
                int i13 = i11 - size3;
                if (i13 > 0 && i13 < size5) {
                    return true;
                }
                int i14 = i13 - size5;
                ArrayList arrayList6 = this.D;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i14 <= 0 || i14 >= size7) {
                    ArrayList arrayList7 = this.E;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != c0.d || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        return this.R != 2 && N();
    }

    public final void Q() {
        if ((this.M == 0 || this.K == 0) && this.c0 == this.Z) {
            ox oxVar = this.Q;
            if (oxVar == null || oxVar.a() == 0 || this.T) {
                W(this.c0, this.V);
            } else {
                V(this.c0, this.V);
            }
        }
    }

    public final void R(long j10, TLObject tLObject) {
        e0 e0Var = (e0) this.t0.f(j10);
        if (e0Var == null) {
            e0Var = new e0();
            this.t0.k(e0Var, j10);
        } else {
            this.p0.remove(e0Var);
        }
        this.p0.add(0, e0Var);
        e0Var.c = j10;
        e0Var.a = tLObject;
        e0Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.I;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.o0).getStorageQueue().postRunnable(new p((an0) this, j10, 1));
    }

    public final boolean S() {
        int i9 = this.d0;
        return (i9 == 2 || i9 == 4 || i9 == 5 || i9 == 6 || i9 == 1 || i9 == 11 || i9 == 15) ? false : true;
    }

    public final void T() {
        int L;
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty() && (L = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(L + 1, size);
            int size2 = this.f0.e.size();
            if (this.C0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(int i9, String str) {
        String str2;
        if (str != null && str.equals(this.I) && (i9 == this.y0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.I = str;
        this.y0 = i9;
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        s sVar = this.h;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.h = null;
        }
        d5.i iVar = this.r;
        if (iVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iVar);
            this.r = null;
        }
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.o0).cancelRequest(this.n, true);
            this.n = -1;
        }
        String trim = str != null ? str.trim() : null;
        G(trim);
        if (!TextUtils.equals(this.N, trim)) {
            this.N = trim;
            this.G.clear();
            if (this.O != 0) {
                ConnectionsManager.getInstance(this.o0).cancelRequest(this.O, true);
                this.O = 0;
            }
            if (trim == null || trim.length() < 4 || (UserConfig.getInstance(this.o0).isPremium() && MessagesController.getInstance(this.o0).isSponsoredDisabled())) {
                this.N = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.N = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.O = ConnectionsManager.getInstance(this.o0).sendRequest(tL_contacts_getSponsoredPeers, new bf.a((an0) this, 20));
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.s0 = null;
            this.f0.s = false;
            this.s.clear();
            this.C.clear();
            this.F.clear();
            this.v = 0;
            this.w = 0;
            this.y = null;
            this.x.clear();
            this.f0.f(null, null);
            int i10 = this.d0;
            if (i10 != 15) {
                w wVar = this.f0;
                boolean z10 = i10 != 11;
                boolean z11 = i10 != 11;
                boolean z12 = i10 == 2 || i10 == 11;
                boolean z13 = i10 == 0;
                ox oxVar = this.Q;
                wVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, oxVar != null ? oxVar.a() : 0L, null);
            }
            this.J = false;
            this.Z = 0;
            this.z0 = 0;
            this.C0 = true;
            this.D0 = true;
            ox oxVar2 = this.Q;
            if (oxVar2 != null) {
                oxVar2.d(false, true);
            }
            if (this.d0 != 15) {
                X(null);
                W(0, null);
                V(0, null);
            }
            l();
            this.u0.clear();
            this.v0 = false;
            w00 w00Var = this.w0;
            if (w00Var != null) {
                ((jv) w00Var).i(false, null, this.u0, false);
                return;
            }
            return;
        }
        this.f0.f(this.s, this.r0);
        this.v = 0;
        this.w = 0;
        this.y = null;
        this.x.clear();
        if (this.R != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.S = true;
            w wVar2 = this.f0;
            if (wVar2.s) {
                this.E.clear();
                this.F.clear();
                ArrayList arrayList = this.f0.q;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    this.F.add(((t1) arrayList.get(i11)).a);
                }
                this.C0 = true;
                this.D0 = true;
                this.z0 = 0;
                l();
                ox oxVar3 = this.Q;
                if (oxVar3 != null) {
                    oxVar3.d(false, false);
                }
            } else {
                MessagesStorage.getInstance(wVar2.m).getStorageQueue().postRunnable(new s1(wVar2, 1));
            }
        } else {
            this.F.clear();
        }
        int i12 = this.Z + 1;
        this.Z = i12;
        this.z0 = 3;
        this.C0 = true;
        this.D0 = true;
        l();
        ox oxVar4 = this.Q;
        if (oxVar4 != null) {
            oxVar4.d(true, false);
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
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                an0 an0Var = (an0) this;
                s sVar2 = new s(an0Var, trim, i12, str, 2);
                this.f = sVar2;
                dispatchQueue.postRunnable(sVar2, 300L);
                if (str2 == null) {
                    this.z0++;
                    d5.i iVar2 = new d5.i(an0Var, i12, str2, 18);
                    this.r = iVar2;
                    AndroidUtilities.runOnUIThread(iVar2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        DispatchQueue dispatchQueue2 = Utilities.searchQueue;
        an0 an0Var2 = (an0) this;
        s sVar22 = new s(an0Var2, trim, i12, str, 2);
        this.f = sVar22;
        dispatchQueue2.postRunnable(sVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void V(int i9, String str) {
        ox oxVar = this.Q;
        if (oxVar == null || oxVar.a() == 0 || this.R == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.V) && TextUtils.isEmpty(str)) {
            return;
        }
        int i10 = this.M;
        int i11 = this.o0;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.M, true);
            this.M = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.D;
        if (isEmpty) {
            this.s0 = null;
            this.E.clear();
            arrayList.clear();
            this.P = 0;
            this.V = null;
            this.J = false;
            l();
            return;
        }
        if (this.d0 == 15) {
            return;
        }
        long a2 = this.Q.a();
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = MessagesController.getInstance(i11).getInputPeer(a2);
        if (str.equals(this.V) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.V = str;
        int i12 = 1 + this.P;
        this.P = i12;
        this.M = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new q(this, str, i12, i9, tL_messages_search, 0), 2);
    }

    public final void W(int i9, String str) {
        if (this.R != 0 && (!TextUtils.isEmpty(this.V) || !TextUtils.isEmpty(str))) {
            int i10 = this.K;
            int i11 = this.o0;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.K, true);
                this.K = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.E;
            if (isEmpty || this.Q.a() != 0) {
                this.s0 = null;
                arrayList.clear();
                this.D.clear();
                this.L = 0;
                this.V = null;
                this.W = 0;
                this.J = false;
                l();
                return;
            }
            G(str);
            this.f0.f(this.s, this.r0);
            if (this.d0 != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i12 = this.c.a;
                tL_messages_searchGlobal.broadcasts_only = (i12 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i12 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i12 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.y0;
                if (!str.equals(this.V)) {
                    this.d = false;
                }
                if (str.equals(this.V) && this.W == this.c.a && !arrayList.isEmpty() && this.c0 == this.Z) {
                    MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.Y;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i11).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.V = str;
                this.W = this.c.a;
                int i13 = this.L + 1;
                this.L = i13;
                this.K = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new q(this, str, i13, i9, tL_messages_searchGlobal, 1), 2);
                return;
            }
            int i14 = this.z0 - 1;
            this.z0 = i14;
            ox oxVar = this.Q;
            if (oxVar != null) {
                oxVar.d(i14 > 0, true);
                this.Q.c();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.B;
        arrayList.clear();
        ox oxVar = this.Q;
        if (oxVar == null || oxVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.o0).getTopicsController().getTopics(-this.Q.a());
            String trim = str.trim();
            for (int i9 = 0; i9 < topics.size(); i9++) {
                if (topics.get(i9) != null && topics.get(i9).title.toLowerCase().contains(trim)) {
                    arrayList.add(topics.get(i9));
                    topics.get(i9).searchQuery = trim;
                }
            }
        }
        l();
    }

    @Override // f2.r0
    public final int h() {
        if (this.z0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.x;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.F;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (P()) {
            size += K();
            if (!this.J) {
                return size;
            }
        }
        ArrayList arrayList3 = this.B;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.A;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        w wVar = this.f0;
        int size3 = wVar.d.size();
        int i9 = size + size2 + size3;
        int size4 = wVar.e.size();
        if (size4 > 3 && this.C0) {
            size4 = 3;
        }
        int size5 = this.G.size() + size4;
        int size6 = wVar.j.size();
        if (size6 > 3 && this.D0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i9++;
        }
        if (size5 != 0) {
            i9 += size5 + 1;
        }
        if (size6 != 0) {
            i9 += size6;
        }
        ArrayList arrayList5 = this.D;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i9 += size7 + 1 + (!this.T ? 1 : 0);
        }
        if (!this.T) {
            this.U = i9;
        }
        ArrayList arrayList6 = this.E;
        int size8 = arrayList6.size();
        if ((this.c != c0.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i10 = (arrayList5.isEmpty() || this.T) ? size8 : 0;
        if (i10 != 0) {
            i9 += i10 + 1 + (!this.S ? 1 : 0);
        }
        if (this.T) {
            this.U = i9;
        }
        this.x0 = i9;
        return i9;
    }

    @Override // f2.r0
    public final long i(int i9) {
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0155, code lost:
    
        if (r14 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
    
        if (r14 != r6) goto L148;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i9) {
        int i10;
        if (this.F.isEmpty()) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                if (i9 != 0) {
                    int i11 = i9 - 1;
                    if (i11 < arrayList.size()) {
                        return 9;
                    }
                    i9 = i11 - arrayList.size();
                }
            }
            if (P()) {
                ?? M = M();
                if (i9 < M) {
                    return 6;
                }
                if (i9 != M) {
                    if (i9 >= K()) {
                        i9 -= K();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.B;
            if (!arrayList2.isEmpty()) {
                if (i9 != 0) {
                    if (i9 <= arrayList2.size()) {
                        return 3;
                    }
                    i9 = j3.r0.g(1, i9, arrayList2);
                }
            }
            ArrayList arrayList3 = this.A;
            if (!arrayList3.isEmpty()) {
                if (i9 != 0) {
                    if (i9 <= arrayList3.size()) {
                        return 8;
                    }
                    i9 = j3.r0.g(1, i9, arrayList3);
                }
            }
            w wVar = this.f0;
            ArrayList arrayList4 = wVar.e;
            int size = this.s.size();
            int size2 = wVar.d.size();
            if (size + size2 > 0 && (K() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i9 != 0) {
                    i9--;
                }
            }
            int size3 = wVar.j.size();
            if (size3 > 3 && this.D0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i12 = (size4 <= 3 || !this.C0) ? size4 : 3;
            ArrayList arrayList5 = this.G;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i12 + 1;
            ArrayList arrayList6 = this.E;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            c0 c0Var = this.c;
            c0 c0Var2 = c0.d;
            if ((c0Var != c0Var2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.D;
            if (!arrayList7.isEmpty() && !this.T) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i9 < 0 || i9 >= size) && ((i10 = i9 - size) < 0 || i10 >= size2)) {
                int i13 = i10 - size2;
                if (i13 < 0 || i13 >= size3) {
                    int i14 = i13 - size3;
                    if (i14 < 0 || i14 >= size5) {
                        int i15 = i14 - size5;
                        if (size7 > 0) {
                            if (i15 >= 0) {
                                if (this.T) {
                                }
                            }
                            i15 -= size7 + (!this.T ? 1 : 0);
                        }
                        if (i15 >= 0 && i15 < size6) {
                            if (i15 != 0) {
                                if (!this.d || !arrayList6.isEmpty()) {
                                    return (this.c == c0Var2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i14 == 0) {
                    }
                } else {
                    Object J = J(i13);
                    if (J instanceof String) {
                        if (!"section".equals((String) J)) {
                            return 7;
                        }
                    }
                }
            }
            return 0;
        }
        if (i9 != 0) {
            return 5;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0569, code lost:
    
        if (r5 != false) goto L269;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0326  */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r7v47 */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        Object obj;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        ?? r72;
        ArrayList<TLRPC.TL_username> arrayList;
        String str;
        TLRPC.EncryptedChat encryptedChat2;
        boolean z10;
        boolean z11;
        CharSequence charSequence;
        ?? r52;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        String str2;
        CharSequence charSequence4;
        boolean z12;
        String str3;
        int i10;
        CharSequence charSequence5;
        String str4;
        String str5;
        int indexOfIgnoreCase;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i11;
        int i12;
        String str6;
        SpannableStringBuilder spannableStringBuilder;
        Runnable runnable;
        boolean z13;
        final int i13;
        char c10;
        String i14;
        int i15 = i9;
        int i16 = q1Var.f;
        View view = q1Var.a;
        ArrayList arrayList2 = this.D;
        ArrayList arrayList3 = this.F;
        ArrayList arrayList4 = this.G;
        ArrayList arrayList5 = this.x;
        ArrayList arrayList6 = this.B;
        w wVar = this.f0;
        int i17 = this.o0;
        final int i18 = 1;
        switch (i16) {
            case 0:
                h6 h6Var = (h6) view;
                h6Var.setBackgroundColor(f6.w0(null, f6.d6, false));
                long dialogId = h6Var.getDialogId();
                boolean O = O(i15);
                Object J = J(i15);
                boolean z14 = J instanceof TLRPC.TL_sponsoredPeer;
                if (z14) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) J;
                    HashSet hashSet = this.H;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            hashSet.add(tL_sponsoredPeer2.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer2.random_id;
                            ConnectionsManager.getInstance(i17).sendRequest(tL_messages_viewSponsoredMessage, null);
                        } else if (Arrays.equals((byte[]) it.next(), tL_sponsoredPeer2.random_id)) {
                        }
                    }
                    long peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer2.peer);
                    if (peerDialogId >= 0) {
                        user = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            ArrayList<TLRPC.TL_username> arrayList7 = user.usernames;
                            str = DialogObject.getPublicUsername(user, this.X);
                            arrayList = arrayList7;
                            chat2 = null;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = null;
                            arrayList = null;
                            str = null;
                            chat2 = chat;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    } else {
                        TLRPC.Chat chat3 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                        if (chat3 != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = chat3.usernames;
                            str = DialogObject.getPublicUsername(chat3, this.X);
                            arrayList = arrayList8;
                            chat2 = chat3;
                            user = null;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = chat3;
                            user = null;
                            arrayList = null;
                            str = null;
                            chat2 = chat;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    }
                } else if (J instanceof TLRPC.User) {
                    user = (TLRPC.User) J;
                    ArrayList<TLRPC.TL_username> arrayList9 = user.usernames;
                    obj = J;
                    str = DialogObject.getPublicUsername(user, this.X);
                    encryptedChat = null;
                    arrayList = arrayList9;
                    r72 = 0;
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) J;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i17).getChat(Long.valueOf(chat4.id));
                    if (chat5 == null) {
                        chat5 = chat4;
                    }
                    ArrayList<TLRPC.TL_username> arrayList10 = chat5.usernames;
                    obj = J;
                    str = DialogObject.getPublicUsername(chat5, this.X);
                    encryptedChat = null;
                    arrayList = arrayList10;
                    r72 = chat5;
                    user = null;
                } else {
                    if (J instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat3 = MessagesController.getInstance(i17).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) J).id));
                        obj = J;
                        encryptedChat = encryptedChat3;
                        user = MessagesController.getInstance(i17).getUser(Long.valueOf(encryptedChat3.user_id));
                    } else {
                        obj = J;
                        encryptedChat = null;
                        user = null;
                    }
                    r72 = 0;
                    arrayList = null;
                    str = null;
                }
                if (arrayList5.isEmpty()) {
                    encryptedChat2 = encryptedChat;
                } else {
                    encryptedChat2 = encryptedChat;
                    i15 = j3.r0.g(1, i15, arrayList5);
                }
                if (P()) {
                    if (i15 < K()) {
                        h6Var.I = i15 != K() + (-1);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i15 -= K();
                } else {
                    z10 = false;
                }
                if (arrayList6.isEmpty()) {
                    z11 = z14;
                } else {
                    z11 = z14;
                    i15 = j3.r0.g(1, i15, arrayList6);
                }
                ArrayList arrayList11 = wVar.e;
                ArrayList arrayList12 = wVar.j;
                int i19 = i15;
                int size = this.s.size();
                int size2 = wVar.d.size();
                int i20 = (size + size2 <= 0 || (K() <= 0 && arrayList6.isEmpty() && arrayList5.isEmpty())) ? i19 : i19 - 1;
                int size3 = arrayList12.size();
                if (size3 > 3 && this.D0) {
                    size3 = 3;
                }
                int i21 = (size3 <= 0 || !(arrayList12.get(size3 + (-1)) instanceof String)) ? size3 : size3 - 2;
                int size4 = arrayList11.size();
                if (size4 > 3 && this.C0) {
                    size4 = 3;
                }
                int size5 = (arrayList11.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList4.size() + size4 + 1;
                if (!z10) {
                    h6Var.I = (i20 == (h() - K()) + (-1) || i20 == ((size + i21) + size2) + (-1) || i20 == (((size + size5) + size3) + size2) + (-1)) ? false : true;
                }
                if (i20 < 0 || i20 >= this.s.size() || user != null) {
                    charSequence = null;
                } else {
                    CharSequence charSequence6 = (CharSequence) this.C.get(i20);
                    String publicUsername = UserObject.getPublicUsername(user);
                    if (charSequence6 != null && user != null && publicUsername != null) {
                        boolean startsWith = charSequence6.toString().startsWith("@".concat(publicUsername));
                        charSequence = charSequence6;
                        break;
                    }
                    r52 = charSequence6;
                    charSequence2 = null;
                    if (charSequence2 == null) {
                        String str7 = z10 ? this.s0 : wVar.c;
                        if (!TextUtils.isEmpty(str7)) {
                            String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : r72 != 0 ? r72.monoforum ? vf.c.i(r72, i17, false) : r72.title : null;
                            if (formatName != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(formatName, str7)) != -1) {
                                r52 = new SpannableStringBuilder(formatName);
                                r52.setSpan(new p00(f6.q6, null), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
                            }
                            if (arrayList == null || arrayList.size() <= 1) {
                                charSequence3 = charSequence2;
                            } else {
                                String substring = str7.startsWith("@") ? str7.substring(1) : str7;
                                int size6 = arrayList.size();
                                int i22 = 0;
                                CharSequence charSequence7 = charSequence2;
                                while (true) {
                                    if (i22 < size6) {
                                        TLRPC.TL_username tL_username = arrayList.get(i22);
                                        i22++;
                                        TLRPC.TL_username tL_username2 = tL_username;
                                        charSequence3 = charSequence7;
                                        if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                            str4 = tL_username2.username;
                                        } else {
                                            charSequence7 = charSequence3;
                                        }
                                    } else {
                                        charSequence3 = charSequence7;
                                        str4 = null;
                                    }
                                }
                                if (str4 == null) {
                                    int size7 = arrayList.size();
                                    int i23 = 0;
                                    while (i23 < size7) {
                                        TLRPC.TL_username tL_username3 = arrayList.get(i23);
                                        i23++;
                                        TLRPC.TL_username tL_username4 = tL_username3;
                                        String str8 = str4;
                                        if (tL_username4.active && tL_username4.username.contains(substring)) {
                                            str5 = tL_username4.username;
                                            if (str5 != null) {
                                                str = str5;
                                            }
                                        } else {
                                            str4 = str8;
                                        }
                                    }
                                }
                                str5 = str4;
                                if (str5 != null) {
                                }
                            }
                            if (str != null && (user == null || O)) {
                                if (str7.startsWith("@")) {
                                    str7 = str7.substring(1);
                                }
                                try {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) "@");
                                    spannableStringBuilder2.append((CharSequence) str);
                                    int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str, str7);
                                    if (indexOfIgnoreCase2 != -1) {
                                        int length = str7.length();
                                        if (indexOfIgnoreCase2 == 0) {
                                            length++;
                                        } else {
                                            indexOfIgnoreCase2++;
                                        }
                                        tL_sponsoredPeer = null;
                                        try {
                                            spannableStringBuilder2.setSpan(new p00(f6.q6, null), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            charSequence3 = str;
                                            str2 = r52;
                                            h6Var.s(false, false);
                                            if (user == null) {
                                            }
                                            charSequence4 = charSequence3;
                                            z12 = false;
                                            str3 = str2;
                                            if (r72 == 0) {
                                            }
                                            if (user != null) {
                                            }
                                            charSequence5 = charSequence4;
                                            i9 i9Var = new i9(this, 5);
                                            h6Var.x0 = z10;
                                            h6Var.y0 = i9Var;
                                            h6Var.setOnSponsoredOptionsClick(new b8(this, 13));
                                            if (z11) {
                                            }
                                            h6Var.setAd(tL_sponsoredPeer);
                                            h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                                            h6Var.s(this.Q.a.E2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                                            return;
                                        }
                                    } else {
                                        tL_sponsoredPeer = null;
                                    }
                                    charSequence3 = spannableStringBuilder2;
                                    str2 = r52;
                                } catch (Exception e11) {
                                    e = e11;
                                    tL_sponsoredPeer = null;
                                }
                                h6Var.s(false, false);
                                if (user == null && user.id == this.h0 && this.d0 != 16) {
                                    charSequence4 = tL_sponsoredPeer;
                                    z12 = true;
                                    str3 = LocaleController.getString(R.string.SavedMessages);
                                } else {
                                    charSequence4 = charSequence3;
                                    z12 = false;
                                    str3 = str2;
                                }
                                if (r72 == 0 && r72.participants_count != 0) {
                                    String formatPluralStringSpaced = (!ChatObject.isChannel(r72) || r72.megagroup) ? LocaleController.formatPluralStringSpaced("Members", r72.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", r72.participants_count);
                                    if (charSequence4 instanceof SpannableStringBuilder) {
                                        ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced);
                                    } else {
                                        charSequence4 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", formatPluralStringSpaced) : formatPluralStringSpaced;
                                    }
                                } else if (user != null && user.bot && (i10 = user.bot_active_users) != 0) {
                                    String formatPluralStringSpaced2 = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                                    if (charSequence4 instanceof SpannableStringBuilder) {
                                        charSequence5 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", formatPluralStringSpaced2) : formatPluralStringSpaced2;
                                        i9 i9Var2 = new i9(this, 5);
                                        h6Var.x0 = z10;
                                        h6Var.y0 = i9Var2;
                                        h6Var.setOnSponsoredOptionsClick(new b8(this, 13));
                                        if (z11) {
                                            tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                                        }
                                        h6Var.setAd(tL_sponsoredPeer);
                                        h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                                        h6Var.s(this.Q.a.E2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                                    } else {
                                        ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced2);
                                    }
                                }
                                charSequence5 = charSequence4;
                                i9 i9Var22 = new i9(this, 5);
                                h6Var.x0 = z10;
                                h6Var.y0 = i9Var22;
                                h6Var.setOnSponsoredOptionsClick(new b8(this, 13));
                                if (z11) {
                                }
                                h6Var.setAd(tL_sponsoredPeer);
                                h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                                h6Var.s(this.Q.a.E2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                            }
                            tL_sponsoredPeer = null;
                            str2 = r52;
                            h6Var.s(false, false);
                            if (user == null) {
                            }
                            charSequence4 = charSequence3;
                            z12 = false;
                            str3 = str2;
                            if (r72 == 0) {
                            }
                            if (user != null) {
                                String formatPluralStringSpaced22 = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                                if (charSequence4 instanceof SpannableStringBuilder) {
                                }
                            }
                            charSequence5 = charSequence4;
                            i9 i9Var222 = new i9(this, 5);
                            h6Var.x0 = z10;
                            h6Var.y0 = i9Var222;
                            h6Var.setOnSponsoredOptionsClick(new b8(this, 13));
                            if (z11) {
                            }
                            h6Var.setAd(tL_sponsoredPeer);
                            h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                            h6Var.s(this.Q.a.E2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                        }
                    }
                    charSequence3 = charSequence2;
                    tL_sponsoredPeer = null;
                    str2 = r52;
                    h6Var.s(false, false);
                    if (user == null) {
                    }
                    charSequence4 = charSequence3;
                    z12 = false;
                    str3 = str2;
                    if (r72 == 0) {
                    }
                    if (user != null) {
                    }
                    charSequence5 = charSequence4;
                    i9 i9Var2222 = new i9(this, 5);
                    h6Var.x0 = z10;
                    h6Var.y0 = i9Var2222;
                    h6Var.setOnSponsoredOptionsClick(new b8(this, 13));
                    if (z11) {
                    }
                    h6Var.setAd(tL_sponsoredPeer);
                    h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                    h6Var.s(this.Q.a.E2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                }
                r52 = 0;
                charSequence2 = charSequence;
                if (charSequence2 == null) {
                }
                charSequence3 = charSequence2;
                tL_sponsoredPeer = null;
                str2 = r52;
                h6Var.s(false, false);
                if (user == null) {
                }
                charSequence4 = charSequence3;
                z12 = false;
                str3 = str2;
                if (r72 == 0) {
                }
                if (user != null) {
                }
                charSequence5 = charSequence4;
                i9 i9Var22222 = new i9(this, 5);
                h6Var.x0 = z10;
                h6Var.y0 = i9Var22222;
                h6Var.setOnSponsoredOptionsClick(new b8(this, 13));
                if (z11) {
                }
                h6Var.setAd(tL_sponsoredPeer);
                h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                h6Var.s(this.Q.a.E2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                break;
            case 1:
                final v3 v3Var = (v3) view;
                if (!arrayList3.isEmpty()) {
                    String string = LocaleController.getString(R.string.Hashtags);
                    String string2 = LocaleController.getString(R.string.ClearButton);
                    final int i24 = r7 ? 1 : 0;
                    v3Var.c(string, string2, new View.OnClickListener(this) { // from class: of.n
                        public final /* synthetic */ f0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    ox oxVar = this.b.Q;
                                    if (oxVar != null) {
                                        oxVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    mx mxVar = ((an0) this.b).G0;
                                    ym0 ym0Var = mxVar.r0;
                                    an0 an0Var = mxVar.U;
                                    String str9 = an0Var.y;
                                    ArrayList arrayList13 = an0Var.x;
                                    int i25 = an0Var.w;
                                    int i26 = an0Var.v;
                                    ArrayList arrayList14 = ym0Var.K;
                                    if (!TextUtils.equals(str9, ym0Var.U)) {
                                        ym0Var.V();
                                        arrayList14.clear();
                                        arrayList14.addAll(arrayList13);
                                        ym0Var.S = i26;
                                        ym0Var.R = i26 > arrayList13.size();
                                        ym0Var.V = i25;
                                        ym0Var.U = str9;
                                        ym0Var.N(true);
                                    }
                                    mxVar.m0 = true;
                                    mxVar.p0.h1(0, 0);
                                    mxVar.R();
                                    c71 c71Var = mxVar.I;
                                    if (c71Var != null && c71Var.getCurrentTabId() != 1) {
                                        mxVar.I.d(1, 1);
                                    }
                                    ym0Var.Y(mxVar.G0);
                                    break;
                                case 2:
                                    ox oxVar2 = this.b.Q;
                                    if (oxVar2 != null) {
                                        oxVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    ox oxVar3 = this.b.Q;
                                    if (oxVar3 != null) {
                                        oxVar3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList5.isEmpty()) {
                        i11 = i15;
                    } else if (i15 == 0) {
                        v3Var.c(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) { // from class: of.n
                            public final /* synthetic */ f0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i18) {
                                    case 0:
                                        ox oxVar = this.b.Q;
                                        if (oxVar != null) {
                                            oxVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        mx mxVar = ((an0) this.b).G0;
                                        ym0 ym0Var = mxVar.r0;
                                        an0 an0Var = mxVar.U;
                                        String str9 = an0Var.y;
                                        ArrayList arrayList13 = an0Var.x;
                                        int i25 = an0Var.w;
                                        int i26 = an0Var.v;
                                        ArrayList arrayList14 = ym0Var.K;
                                        if (!TextUtils.equals(str9, ym0Var.U)) {
                                            ym0Var.V();
                                            arrayList14.clear();
                                            arrayList14.addAll(arrayList13);
                                            ym0Var.S = i26;
                                            ym0Var.R = i26 > arrayList13.size();
                                            ym0Var.V = i25;
                                            ym0Var.U = str9;
                                            ym0Var.N(true);
                                        }
                                        mxVar.m0 = true;
                                        mxVar.p0.h1(0, 0);
                                        mxVar.R();
                                        c71 c71Var = mxVar.I;
                                        if (c71Var != null && c71Var.getCurrentTabId() != 1) {
                                            mxVar.I.d(1, 1);
                                        }
                                        ym0Var.Y(mxVar.G0);
                                        break;
                                    case 2:
                                        ox oxVar2 = this.b.Q;
                                        if (oxVar2 != null) {
                                            oxVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        ox oxVar3 = this.b.Q;
                                        if (oxVar3 != null) {
                                            oxVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i11 = j3.r0.g(1, i15, arrayList5);
                    }
                    ArrayList arrayList13 = wVar.e;
                    ArrayList arrayList14 = wVar.j;
                    boolean P = P();
                    ArrayList arrayList15 = this.A;
                    if (P || !arrayList6.isEmpty() || !arrayList15.isEmpty() || !arrayList5.isEmpty()) {
                        ?? M = M();
                        if (i11 >= M) {
                            if (i11 != M || !P()) {
                                if (i11 == K() + (arrayList6.isEmpty() ? 0 : arrayList6.size() + 1) + (arrayList15.isEmpty() ? 0 : arrayList15.size() + 1) && !this.s.isEmpty()) {
                                    v3Var.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                                    break;
                                } else {
                                    i11 -= K();
                                }
                            } else if (!this.J) {
                                final int i25 = 2;
                                v3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) { // from class: of.n
                                    public final /* synthetic */ f0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i25) {
                                            case 0:
                                                ox oxVar = this.b.Q;
                                                if (oxVar != null) {
                                                    oxVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                mx mxVar = ((an0) this.b).G0;
                                                ym0 ym0Var = mxVar.r0;
                                                an0 an0Var = mxVar.U;
                                                String str9 = an0Var.y;
                                                ArrayList arrayList132 = an0Var.x;
                                                int i252 = an0Var.w;
                                                int i26 = an0Var.v;
                                                ArrayList arrayList142 = ym0Var.K;
                                                if (!TextUtils.equals(str9, ym0Var.U)) {
                                                    ym0Var.V();
                                                    arrayList142.clear();
                                                    arrayList142.addAll(arrayList132);
                                                    ym0Var.S = i26;
                                                    ym0Var.R = i26 > arrayList132.size();
                                                    ym0Var.V = i252;
                                                    ym0Var.U = str9;
                                                    ym0Var.N(true);
                                                }
                                                mxVar.m0 = true;
                                                mxVar.p0.h1(0, 0);
                                                mxVar.R();
                                                c71 c71Var = mxVar.I;
                                                if (c71Var != null && c71Var.getCurrentTabId() != 1) {
                                                    mxVar.I.d(1, 1);
                                                }
                                                ym0Var.Y(mxVar.G0);
                                                break;
                                            case 2:
                                                ox oxVar2 = this.b.Q;
                                                if (oxVar2 != null) {
                                                    oxVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ox oxVar3 = this.b.Q;
                                                if (oxVar3 != null) {
                                                    oxVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i26 = 3;
                                v3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) { // from class: of.n
                                    public final /* synthetic */ f0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i26) {
                                            case 0:
                                                ox oxVar = this.b.Q;
                                                if (oxVar != null) {
                                                    oxVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                mx mxVar = ((an0) this.b).G0;
                                                ym0 ym0Var = mxVar.r0;
                                                an0 an0Var = mxVar.U;
                                                String str9 = an0Var.y;
                                                ArrayList arrayList132 = an0Var.x;
                                                int i252 = an0Var.w;
                                                int i262 = an0Var.v;
                                                ArrayList arrayList142 = ym0Var.K;
                                                if (!TextUtils.equals(str9, ym0Var.U)) {
                                                    ym0Var.V();
                                                    arrayList142.clear();
                                                    arrayList142.addAll(arrayList132);
                                                    ym0Var.S = i262;
                                                    ym0Var.R = i262 > arrayList132.size();
                                                    ym0Var.V = i252;
                                                    ym0Var.U = str9;
                                                    ym0Var.N(true);
                                                }
                                                mxVar.m0 = true;
                                                mxVar.p0.h1(0, 0);
                                                mxVar.R();
                                                c71 c71Var = mxVar.I;
                                                if (c71Var != null && c71Var.getCurrentTabId() != 1) {
                                                    mxVar.I.d(1, 1);
                                                }
                                                ym0Var.Y(mxVar.G0);
                                                break;
                                            case 2:
                                                ox oxVar2 = this.b.Q;
                                                if (oxVar2 != null) {
                                                    oxVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ox oxVar3 = this.b.Q;
                                                if (oxVar3 != null) {
                                                    oxVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            v3Var.setText(LocaleController.getString(R.string.ChatHints));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = wVar.d.size();
                    int size10 = arrayList14.size();
                    if (size10 > 3 && this.D0) {
                        size10 = 3;
                    }
                    int size11 = arrayList13.size();
                    if (size11 > 3 && this.C0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList13.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList4.size() + size11 + 1;
                    int size13 = arrayList2.isEmpty() ? 0 : arrayList2.size() + 1;
                    ArrayList arrayList16 = this.E;
                    if (!arrayList16.isEmpty()) {
                        arrayList16.size();
                    }
                    int i27 = size13;
                    if (this.c != c0.d || this.d) {
                        arrayList16.isEmpty();
                    }
                    if (arrayList6.isEmpty()) {
                        i12 = 1;
                        str6 = null;
                    } else {
                        str6 = i11 == 0 ? LocaleController.getString(R.string.Topics) : null;
                        i12 = 1;
                        i11 = j3.r0.g(1, i11, arrayList6);
                    }
                    if (!arrayList15.isEmpty()) {
                        if (i11 == 0) {
                            str6 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        i11 = j3.r0.g(i12, i11, arrayList15);
                    }
                    if (str6 == null) {
                        int i28 = i11 - (size8 + size9);
                        if (i28 < 0 || i28 >= size10) {
                            int i29 = i28 - size10;
                            if (i29 < 0 || i29 >= size12) {
                                if (this.Q == null || i27 <= 0) {
                                    i13 = 1;
                                } else {
                                    i13 = 1;
                                    if (i29 - size12 <= 1) {
                                        TLRPC.Chat chat6 = MessagesController.getInstance(i17).getChat(Long.valueOf(-this.Q.a()));
                                        int i30 = R.string.SearchMessagesIn;
                                        if (chat6 == null) {
                                            i14 = BuildConfig.BETA_URL;
                                            c10 = 0;
                                        } else {
                                            c10 = 0;
                                            i14 = chat6.monoforum ? vf.c.i(chat6, i17, false) : chat6.title;
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[c10] = i14;
                                        str6 = LocaleController.formatString(i30, objArr);
                                    }
                                }
                                this.B0 = i29;
                                SpannableStringBuilder H = H(this.c);
                                Runnable runnable2 = new Runnable(this) { // from class: of.o
                                    public final /* synthetic */ f0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                f0 f0Var = this.b;
                                                boolean z15 = f0Var.D0;
                                                f0Var.D0 = !z15;
                                                v3Var.setRightText(LocaleController.getString(!z15 ? R.string.ShowMore : R.string.ShowLess));
                                                f0Var.l();
                                                break;
                                            default:
                                                f0 f0Var2 = this.b;
                                                dy dyVar = f0Var2.n0;
                                                v3 v3Var2 = v3Var;
                                                x60 H2 = x60.H(dyVar, v3Var2);
                                                for (c0 c0Var : c0.values()) {
                                                    boolean z16 = c0Var.a == f0Var2.c.a;
                                                    H2.i(new bg.d(f0Var2, z16, v3Var2, c0Var, 5), LocaleController.getString(c0Var.b), z16);
                                                }
                                                H2.V(5);
                                                H2.Y = true;
                                                H2.t = false;
                                                H2.s = 0;
                                                H2.Z();
                                                break;
                                        }
                                    }
                                };
                                str6 = LocaleController.getString(R.string.SearchMessages);
                                runnable = runnable2;
                                spannableStringBuilder = H;
                                z13 = false;
                            } else {
                                String string3 = LocaleController.getString(R.string.GlobalSearch);
                                if (wVar.e.size() > 3) {
                                    z13 = this.C0;
                                    c3.d dVar = new c3.d(this, arrayList13, i9, v3Var, 5);
                                    v3Var = v3Var;
                                    str6 = string3;
                                    runnable = dVar;
                                    spannableStringBuilder = null;
                                } else {
                                    str6 = string3;
                                }
                            }
                        } else {
                            str6 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (arrayList14.size() > 3) {
                                final int i31 = 0;
                                z13 = this.D0;
                                runnable = new Runnable(this) { // from class: of.o
                                    public final /* synthetic */ f0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i31) {
                                            case 0:
                                                f0 f0Var = this.b;
                                                boolean z15 = f0Var.D0;
                                                f0Var.D0 = !z15;
                                                v3Var.setRightText(LocaleController.getString(!z15 ? R.string.ShowMore : R.string.ShowLess));
                                                f0Var.l();
                                                break;
                                            default:
                                                f0 f0Var2 = this.b;
                                                dy dyVar = f0Var2.n0;
                                                v3 v3Var2 = v3Var;
                                                x60 H2 = x60.H(dyVar, v3Var2);
                                                for (c0 c0Var : c0.values()) {
                                                    boolean z16 = c0Var.a == f0Var2.c.a;
                                                    H2.i(new bg.d(f0Var2, z16, v3Var2, c0Var, 5), LocaleController.getString(c0Var.b), z16);
                                                }
                                                H2.V(5);
                                                H2.Y = true;
                                                H2.t = false;
                                                H2.s = 0;
                                                H2.Z();
                                                break;
                                        }
                                    }
                                };
                                spannableStringBuilder = null;
                            }
                        }
                        if (runnable == null) {
                            if (spannableStringBuilder == null) {
                                v3Var.c(str6, LocaleController.getString(z13 ? R.string.ShowMore : R.string.ShowLess), new dg.w(5, runnable));
                                v3Var.setRightTextMargin(16);
                                break;
                            } else {
                                v3Var.c(str6, spannableStringBuilder, new dg.w(6, runnable));
                                v3Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            v3Var.setText(str6);
                            break;
                        }
                    }
                    spannableStringBuilder = null;
                    runnable = null;
                    z13 = false;
                    if (runnable == null) {
                    }
                }
                break;
            case 2:
            case 9:
                r2 r2Var = (r2) view;
                r2Var.setBackgroundColor(f6.w0(null, f6.d6, false));
                r2Var.o2 = i15 != h() - 1;
                MessageObject messageObject = (MessageObject) J(i15);
                r2Var.K = arrayList2.contains(messageObject);
                if (messageObject != null) {
                    r2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                    break;
                } else {
                    r2Var.V(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((pa) view).setTopic((TLRPC.TL_forumTopic) J(i15));
                break;
            case 5:
                l4 l4Var = (l4) view;
                l4Var.setBackgroundColor(f6.w0(null, f6.d6, false));
                l4Var.setText((CharSequence) arrayList3.get(i15 - 1));
                l4Var.setNeedDivider(i15 != arrayList3.size());
                break;
            case 6:
                ((z) ((wk0) view).getAdapter()).l();
                break;
            case 7:
                String str9 = (String) J(i15);
                p8 p8Var = (p8) view;
                p8Var.e(-1, f6.o6);
                p8Var.i(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, ne.b.c().b("+" + str9)), false);
                break;
            case 8:
                h6 h6Var2 = (h6) view;
                ContactsController.Contact contact = (ContactsController.Contact) J(i15);
                h6Var2.t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), ll.g(new StringBuilder("+"), contact.shortPhones.get(0), ne.b.c()), false, false);
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        int i10 = 9;
        int i11 = this.d0;
        int i12 = 16;
        int i13 = 0;
        b6 b6Var = null;
        Context context = this.e;
        switch (i9) {
            case 0:
                h6 h6Var = new h6(context, null);
                h6Var.h0 = i11 == 3;
                view = h6Var;
                break;
            case 1:
                view = new v3(context, null);
                break;
            case 2:
            case 9:
                view = new x(i13, context, true ? 1 : 0);
                break;
            case 3:
                view = new pa(context);
                break;
            case 4:
                e00 e00Var = new e00(context, null);
                e00Var.setViewType(1);
                e00Var.setIsSingleCell(true);
                view = e00Var;
                break;
            case 5:
                l4 l4Var = new l4(context);
                l4Var.setGravity(16);
                l4Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                l4Var.setTextSize(1, 17.0f);
                l4Var.setTextColor(f6.w0(null, f6.G6, false));
                view = l4Var;
                break;
            case 6:
                va1 va1Var = new va1(context, 2, b6Var);
                va1Var.setSelectorDrawableColor(f6.w0(null, f6.i6, false));
                va1Var.setTag(9);
                va1Var.setItemAnimator(null);
                va1Var.setLayoutAnimation(null);
                y yVar = new y(i13);
                yVar.j1(0);
                va1Var.setLayoutManager(yVar);
                va1Var.setAdapter(new z(this.o0, this.e, null, false, i11 == 3));
                va1Var.setOnItemClickListener(new eh.j(this, i12));
                va1Var.setOnItemLongClickListener(new v(this));
                this.g0 = va1Var;
                view = va1Var;
                break;
            case 7:
            default:
                view = new p8(16, context, false);
                break;
            case 8:
                view = new h6(context, null);
                break;
            case 10:
                t tVar = new t(this, true ? 1 : 0);
                b0 b0Var = new b0(context);
                b0Var.setOrientation(1);
                o9 o9Var = new o9(context);
                o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
                b0Var.addView(o9Var, e6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i14 = f6.G6;
                textView.setTextColor(f6.w0(null, i14, false));
                textView.setTypeface(AndroidUtilities.bold());
                ll.l(R.string.SearchMessagesFilterEmptyTitle, textView, 17);
                b0Var.addView(textView, e6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                b0Var.a = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(f6.w0(null, i14, false));
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView2.setGravity(17);
                b0Var.addView(textView2, e6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView3.setTextSize(1, 14.0f);
                textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i15 = f6.Oh;
                textView3.setTextColor(f6.w0(null, i15, false));
                int l1 = f6.l1(0.15f, f6.w0(null, i15, false));
                textView3.setBackground(f6.i0(6, 6, 6, 6, 0, l1, l1));
                textView3.setOnClickListener(new x8(tVar, i10));
                b0Var.addView(textView3, e6.t(-2, -2, 1, 0, 0, 0, 38));
                this.A0 = b0Var;
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.V));
                view = b0Var;
                break;
        }
        if (i9 == 5) {
            view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(86.0f)));
        } else {
            view.setLayoutParams(new f2.a1(-1, -2));
        }
        return new ik0(view);
    }
}
