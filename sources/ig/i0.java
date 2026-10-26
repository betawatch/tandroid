package ig;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.qa;
import bi.s9;
import bi.w6;
import hi.e2;
import hi.t2;
import hi.u2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue2;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.cy;
import org.telegram.ui.iv;
import org.telegram.ui.jx;
import org.telegram.ui.lx;
import org.telegram.ui.x00;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class i0 extends lm0 {
    public x00 A0;
    public int B0;
    public int C0;
    public int D0;
    public e0 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public lx U;
    public final int V;
    public boolean W;
    public boolean X;
    public String Z;
    public int a0;
    public String b0;
    public int c0;
    public boolean d;
    public int d0;
    public final Context e;
    public int e0;
    public s f;
    public int f0;
    public int g0;
    public s h;
    public final int h0;
    public final s4.l i0;
    public final y j0;
    public za1 k0;
    public final long l0;
    public long n0;
    public View o0;
    public u2 p0;
    public ArrayList q0;
    public ai.h0 r;
    public final cy r0;
    public final int s0;
    public ArrayList t0;
    public final ArrayList u0;
    public int v;
    public final ArrayList v0;
    public int w;
    public String w0;
    public a0.h x0;
    public String y;
    public final ArrayList y0;
    public boolean z0;
    public f0 c = f0.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final HashSet L = new HashSet();
    public int O = 0;
    public int Q = 0;
    public int Y = -1;
    public boolean m0 = false;

    public i0(Context context, cy cyVar, int i10, int i11, s4.l lVar, boolean z10) {
        int i12 = UserConfig.selectedAccount;
        this.s0 = i12;
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = null;
        this.x0 = new a0.h();
        this.y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.i0 = lVar;
        this.r0 = cyVar;
        wo0 wo0Var = (wo0) this;
        y yVar = new y(wo0Var);
        this.j0 = yVar;
        yVar.a = new b6.i(wo0Var, 26);
        yVar.p = z10;
        this.e = context;
        this.V = i10;
        this.h0 = i11;
        this.l0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new i2.v(i12, i11, new w(this), 2));
        }
        MediaDataController.getInstance(i12).loadHints(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i10 = 0; i10 < split.length; i10++) {
                String str3 = split[i10];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i10]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 1 || i10 == 4 || i10 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.N;
        ArrayList arrayList = this.u0;
        ArrayList arrayList2 = this.v0;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                h0 h0Var = (h0) arrayList2.remove(0);
                this.t0.remove(h0Var);
                arrayList.remove(h0Var);
                this.x0.l(h0Var.c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(h0Var.c);
                } else {
                    sb2.append(", ");
                    sb2.append(h0Var.c);
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
            this.t0.clear();
            this.x0.b();
            sb2 = new StringBuilder("1");
        }
        String str = this.M;
        G(str != null ? str.trim() : null);
        l();
        boolean z11 = this.N;
        int i10 = this.s0;
        if (z11) {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new u2(10, (wo0) this, sb2));
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new t2(i10, 1));
        }
    }

    public final boolean F(Object obj) {
        if (this.h0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        cy cyVar = this.r0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? cyVar.A2 : cyVar.z2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return ChatObject.isChannel(chat) ? cyVar.y2 : ChatObject.isMegagroup(chat) ? cyVar.v2 || cyVar.w2 : cyVar.v2 || cyVar.x2;
    }

    public final void G(String str) {
        lx lxVar;
        String str2;
        String str3;
        this.w0 = str;
        ArrayList arrayList = this.v0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.u0;
            arrayList2.clear();
            int size = this.t0.size();
            for (int i10 = 0; i10 < size; i10++) {
                lx lxVar2 = this.U;
                if ((lxVar2 == null || lxVar2.a() != ((h0) this.t0.get(i10)).c) && F(((h0) this.t0.get(i10)).a)) {
                    arrayList2.add((h0) this.t0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.t0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h0 h0Var = (h0) this.t0.get(i11);
            if (h0Var != null && h0Var.a != null && (((lxVar = this.U) == null || lxVar.a() != h0Var.c) && F(((h0) this.t0.get(i11)).a))) {
                TLObject tLObject = h0Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? pg.d.i(chat, this.s0, false) : chat.title;
                    str3 = ((TLRPC.Chat) h0Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) h0Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(h0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(f0 f0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(f0Var.c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new zq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public final Object I(int i10) {
        int i11;
        int i12;
        TLRPC.Chat chat;
        int i13;
        ArrayList arrayList = this.x;
        if (!arrayList.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList.size()) {
                return arrayList.get(i13);
            }
            i10 = ic.a.f(1, i10, arrayList);
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0) {
                return arrayList2.get(i10 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            ArrayList arrayList3 = this.N ? this.v0 : this.u0;
            if (i10 > L && (i12 = (i10 - 1) - (L == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((h0) arrayList3.get(i12)).a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i14 = this.s0;
                if (!z10) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(i14).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                return user != null ? user : tLObject;
            }
            i10 -= J();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = ic.a.f(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = ic.a.f(1, i10, arrayList5);
        }
        y yVar = this.j0;
        ArrayList arrayList6 = yVar.e;
        ArrayList arrayList7 = yVar.d;
        ArrayList arrayList8 = yVar.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i10 == 0) {
                return null;
            }
            i10--;
        }
        int size3 = arrayList8.size();
        if (size3 > 3 && this.H0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i15 = (size4 <= 3 || !this.G0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i16 = 0;
        ArrayList arrayList9 = this.K;
        int size5 = (isEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i15 + 1;
        if (i10 >= 0 && i10 < size) {
            return this.s.get(i10);
        }
        int i17 = i10 - size;
        if (i17 >= 0 && i17 < size2) {
            return arrayList7.get(i17);
        }
        int i18 = i17 - size2;
        if (i18 >= 0 && i18 < size3) {
            return arrayList8.get(i18);
        }
        int i19 = i18 - size3;
        if (i19 <= 0 || i19 >= size5) {
            i11 = i19 - size5;
        } else {
            int i20 = i19 - 1;
            if (i20 >= 0 && i20 < arrayList9.size()) {
                return arrayList9.get(i20);
            }
            i11 = i20 - arrayList9.size();
            if (i11 >= 0 && i11 < arrayList6.size()) {
                return arrayList6.get(i11);
            }
        }
        ArrayList arrayList10 = this.H;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i11 > 0 && i11 <= arrayList10.size()) {
            return arrayList10.get(i11 - 1);
        }
        if (!this.X && !arrayList10.isEmpty()) {
            i16 = 1;
        }
        int i21 = i11 - (size6 + i16);
        ArrayList arrayList11 = this.I;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i21 <= 0 || i21 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i21 - 1);
    }

    public final int J() {
        ArrayList arrayList = this.N ? this.v0 : this.u0;
        return (L() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int K() {
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.x;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.N) {
                return size;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        int size3 = this.j0.d.size();
        int i10 = size + size2 + size3;
        return size2 + size3 > 0 ? (J() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i10 : i10 + 1 : i10;
    }

    public final boolean L() {
        if (this.N || MediaDataController.getInstance(this.s0).hints.isEmpty()) {
            return false;
        }
        return this.h0 != 14 || this.r0.z2;
    }

    public final boolean M() {
        return R() && J() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean N(int i10) {
        int i11;
        int i12;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                i10 = ic.a.f(1, i10, arrayList);
            }
            if (O()) {
                ?? L = L();
                ArrayList arrayList2 = this.N ? this.v0 : this.u0;
                if (i10 <= L || (i10 - 1) - (L == true ? 1 : 0) >= arrayList2.size()) {
                    i10 -= J();
                }
            }
            y yVar = this.j0;
            ArrayList arrayList3 = yVar.e;
            ArrayList arrayList4 = yVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = yVar.j.size();
            if (size3 > 3 && this.H0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i13 = (size4 <= 3 || !this.G0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.K;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i13 + 1;
            int size6 = this.E.size();
            if (size6 > 0) {
                if (i10 < 0 || i10 >= size6) {
                    i10 -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (J() > 0 || !this.F.isEmpty() || !arrayList.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            if ((i10 < 0 || i10 >= size) && (((i11 = i10 - size) < 0 || i11 >= size2) && ((i12 = i11 - size2) <= 0 || i12 >= size3))) {
                int i14 = i12 - size3;
                if (i14 > 0 && i14 < size5) {
                    return true;
                }
                int i15 = i14 - size5;
                ArrayList arrayList6 = this.H;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i15 <= 0 || i15 >= size7) {
                    ArrayList arrayList7 = this.I;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != f0.d || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        return this.V != 2 && M();
    }

    public final void P() {
        if ((this.Q == 0 || this.O == 0) && this.g0 == this.d0) {
            lx lxVar = this.U;
            if (lxVar == null || lxVar.a() == 0 || this.X) {
                V(this.g0, this.Z);
            } else {
                U(this.g0, this.Z);
            }
        }
    }

    public final void Q(long j10, TLObject tLObject) {
        h0 h0Var = (h0) this.x0.f(j10);
        if (h0Var == null) {
            h0Var = new h0();
            this.x0.k(h0Var, j10);
        } else {
            this.t0.remove(h0Var);
        }
        this.t0.add(0, h0Var);
        h0Var.c = j10;
        h0Var.a = tLObject;
        h0Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.M;
        G(str != null ? str.trim() : null);
        l();
        int i10 = this.s0;
        MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new qa(i10, j10, 2));
    }

    public final boolean R() {
        int i10 = this.h0;
        return (i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 1 || i10 == 11 || i10 == 15) ? false : true;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (K = K()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(K + 1, size);
            int size2 = this.j0.e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(K);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i10, String str) {
        String str2;
        if (str != null && str.equals(this.M) && (i10 == this.C0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.M = str;
        this.C0 = i10;
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        s sVar = this.h;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.h = null;
        }
        ai.h0 h0Var = this.r;
        if (h0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            this.r = null;
        }
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.s0).cancelRequest(this.n, true);
            this.n = -1;
        }
        String trim = str != null ? str.trim() : null;
        G(trim);
        if (!TextUtils.equals(this.R, trim)) {
            this.R = trim;
            this.K.clear();
            if (this.S != 0) {
                ConnectionsManager.getInstance(this.s0).cancelRequest(this.S, true);
                this.S = 0;
            }
            if (trim == null || trim.length() < 4 || (UserConfig.getInstance(this.s0).isPremium() && MessagesController.getInstance(this.s0).isSponsoredDisabled())) {
                this.R = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.R = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.S = ConnectionsManager.getInstance(this.s0).sendRequest(tL_contacts_getSponsoredPeers, new bi.i0((wo0) this, 14));
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.w0 = null;
            this.j0.s = false;
            this.s.clear();
            this.G.clear();
            this.J.clear();
            this.v = 0;
            this.w = 0;
            this.y = null;
            this.x.clear();
            this.j0.f(null, null);
            int i11 = this.h0;
            if (i11 != 15) {
                y yVar = this.j0;
                boolean z10 = i11 != 11;
                boolean z11 = i11 != 11;
                boolean z12 = i11 == 2 || i11 == 11;
                boolean z13 = i11 == 0;
                lx lxVar = this.U;
                yVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, lxVar != null ? lxVar.a() : 0L, null);
            }
            this.N = false;
            this.d0 = 0;
            this.D0 = 0;
            this.G0 = true;
            this.H0 = true;
            lx lxVar2 = this.U;
            if (lxVar2 != null) {
                lxVar2.d(false, true);
            }
            if (this.h0 != 15) {
                W(null);
                V(0, null);
                U(0, null);
            }
            l();
            this.y0.clear();
            this.z0 = false;
            x00 x00Var = this.A0;
            if (x00Var != null) {
                ((iv) x00Var).j(false, null, this.y0, false);
                return;
            }
            return;
        }
        this.j0.f(this.s, this.v0);
        this.v = 0;
        this.w = 0;
        this.y = null;
        this.x.clear();
        if (this.V != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.W = true;
            y yVar2 = this.j0;
            if (yVar2.s) {
                this.I.clear();
                this.J.clear();
                ArrayList arrayList = this.j0.q;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    this.J.add(((y1) arrayList.get(i12)).a);
                }
                this.G0 = true;
                this.H0 = true;
                this.D0 = 0;
                l();
                lx lxVar3 = this.U;
                if (lxVar3 != null) {
                    lxVar3.d(false, false);
                }
            } else {
                MessagesStorage.getInstance(yVar2.m).getStorageQueue().postRunnable(new x1(yVar2, 1));
            }
        } else {
            this.J.clear();
        }
        int i13 = this.d0 + 1;
        this.d0 = i13;
        this.D0 = 3;
        this.G0 = true;
        this.H0 = true;
        l();
        lx lxVar4 = this.U;
        if (lxVar4 != null) {
            lxVar4.d(true, false);
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
                DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
                wo0 wo0Var = (wo0) this;
                s sVar2 = new s(wo0Var, trim, i13, str, 2);
                this.f = sVar2;
                dispatchQueue2.postRunnable(sVar2, 300L);
                if (str2 == null) {
                    this.D0++;
                    ai.h0 h0Var2 = new ai.h0(wo0Var, i13, str2, 18);
                    this.r = h0Var2;
                    AndroidUtilities.runOnUIThread(h0Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        DispatchQueue2 dispatchQueue22 = Utilities.searchQueue;
        wo0 wo0Var2 = (wo0) this;
        s sVar22 = new s(wo0Var2, trim, i13, str, 2);
        this.f = sVar22;
        dispatchQueue22.postRunnable(sVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void U(int i10, String str) {
        lx lxVar = this.U;
        if (lxVar == null || lxVar.a() == 0 || this.V == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.Z) && TextUtils.isEmpty(str)) {
            return;
        }
        int i11 = this.Q;
        int i12 = this.s0;
        if (i11 != 0) {
            ConnectionsManager.getInstance(i12).cancelRequest(this.Q, true);
            this.Q = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.H;
        if (isEmpty) {
            this.w0 = null;
            this.I.clear();
            arrayList.clear();
            this.T = 0;
            this.Z = null;
            this.N = false;
            l();
            return;
        }
        if (this.h0 == 15) {
            return;
        }
        long a2 = this.U.a();
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = MessagesController.getInstance(i12).getInputPeer(a2);
        if (str.equals(this.Z) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.Z = str;
        int i13 = 1 + this.T;
        this.T = i13;
        this.Q = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new r(this, str, i13, i10, tL_messages_search, 0), 2);
    }

    public final void V(int i10, String str) {
        if (this.V != 0 && (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str))) {
            int i11 = this.O;
            int i12 = this.s0;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.O, true);
                this.O = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.I;
            if (isEmpty || this.U.a() != 0) {
                this.w0 = null;
                arrayList.clear();
                this.H.clear();
                this.P = 0;
                this.Z = null;
                this.a0 = 0;
                this.N = false;
                l();
                return;
            }
            G(str);
            this.j0.f(this.s, this.v0);
            if (this.h0 != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i13 = this.c.a;
                tL_messages_searchGlobal.broadcasts_only = (i13 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i13 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i13 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.C0;
                if (!str.equals(this.Z)) {
                    this.d = false;
                }
                if (str.equals(this.Z) && this.a0 == this.c.a && !arrayList.isEmpty() && this.g0 == this.d0) {
                    MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.c0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.Z = str;
                this.a0 = this.c.a;
                int i14 = this.P + 1;
                this.P = i14;
                this.O = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new r(this, str, i14, i10, tL_messages_searchGlobal, 1), 2);
                return;
            }
            int i15 = this.D0 - 1;
            this.D0 = i15;
            lx lxVar = this.U;
            if (lxVar != null) {
                lxVar.d(i15 > 0, true);
                this.U.c();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        lx lxVar = this.U;
        if (lxVar == null || lxVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.s0).getTopicsController().getTopics(-this.U.a());
            String trim = str.trim();
            for (int i10 = 0; i10 < topics.size(); i10++) {
                if (topics.get(i10) != null && topics.get(i10).title.toLowerCase().contains(trim)) {
                    arrayList.add(topics.get(i10));
                    topics.get(i10).searchQuery = trim;
                }
            }
        }
        l();
    }

    @Override // s4.h0
    public final int h() {
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.x;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.N) {
                return size;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        y yVar = this.j0;
        int size3 = yVar.d.size();
        int i10 = size + size2 + size3;
        int size4 = yVar.e.size();
        if (size4 > 3 && this.G0) {
            size4 = 3;
        }
        int size5 = this.K.size() + size4;
        int size6 = yVar.j.size();
        if (size6 > 3 && this.H0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i10++;
        }
        if (size5 != 0) {
            i10 += size5 + 1;
        }
        if (size6 != 0) {
            i10 += size6;
        }
        ArrayList arrayList5 = this.H;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i10 += size7 + 1 + (!this.X ? 1 : 0);
        }
        if (!this.X) {
            this.Y = i10;
        }
        ArrayList arrayList6 = this.I;
        int size8 = arrayList6.size();
        if ((this.c != f0.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i11 = (arrayList5.isEmpty() || this.X) ? size8 : 0;
        if (i11 != 0) {
            i10 += i11 + 1 + (!this.W ? 1 : 0);
        }
        if (this.X) {
            this.Y = i10;
        }
        this.B0 = i10;
        return i10;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0155, code lost:
    
        if (r14 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
    
        if (r14 != r6) goto L148;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11;
        if (this.J.isEmpty()) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i12 = i10 - 1;
                    if (i12 < arrayList.size()) {
                        return 9;
                    }
                    i10 = i12 - arrayList.size();
                }
            }
            if (O()) {
                ?? L = L();
                if (i10 < L) {
                    return 6;
                }
                if (i10 != L) {
                    if (i10 >= J()) {
                        i10 -= J();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.F;
            if (!arrayList2.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList2.size()) {
                        return 3;
                    }
                    i10 = ic.a.f(1, i10, arrayList2);
                }
            }
            ArrayList arrayList3 = this.E;
            if (!arrayList3.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList3.size()) {
                        return 8;
                    }
                    i10 = ic.a.f(1, i10, arrayList3);
                }
            }
            y yVar = this.j0;
            ArrayList arrayList4 = yVar.e;
            int size = this.s.size();
            int size2 = yVar.d.size();
            if (size + size2 > 0 && (J() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            int size3 = yVar.j.size();
            if (size3 > 3 && this.H0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i13 = (size4 <= 3 || !this.G0) ? size4 : 3;
            ArrayList arrayList5 = this.K;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i13 + 1;
            ArrayList arrayList6 = this.I;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            f0 f0Var = this.c;
            f0 f0Var2 = f0.d;
            if ((f0Var != f0Var2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.H;
            if (!arrayList7.isEmpty() && !this.X) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i10 < 0 || i10 >= size) && ((i11 = i10 - size) < 0 || i11 >= size2)) {
                int i14 = i11 - size2;
                if (i14 < 0 || i14 >= size3) {
                    int i15 = i14 - size3;
                    if (i15 < 0 || i15 >= size5) {
                        int i16 = i15 - size5;
                        if (size7 > 0) {
                            if (i16 >= 0) {
                                if (this.X) {
                                }
                            }
                            i16 -= size7 + (!this.X ? 1 : 0);
                        }
                        if (i16 >= 0 && i16 < size6) {
                            if (i16 != 0) {
                                if (!this.d || !arrayList6.isEmpty()) {
                                    return (this.c == f0Var2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i15 == 0) {
                    }
                } else {
                    Object I = I(i14);
                    if (I instanceof String) {
                        if (!"section".equals((String) I)) {
                            return 7;
                        }
                    }
                }
            }
            return 0;
        }
        if (i10 != 0) {
            return 5;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0565, code lost:
    
        if (r5 != false) goto L269;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0320  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13, types: [int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r7v38 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        ArrayList arrayList;
        Object obj;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        ?? r72;
        ArrayList<TLRPC.TL_username> arrayList2;
        String str;
        TLRPC.EncryptedChat encryptedChat2;
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        ?? r52;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str2;
        CharSequence charSequence5;
        boolean z13;
        String str3;
        int i11;
        ?? r10;
        boolean z14;
        String str4;
        String str5;
        int indexOfIgnoreCase;
        TLRPC.Chat chat;
        String publicUsername;
        TLRPC.Chat chat2;
        int i12;
        int i13;
        String str6;
        SpannableStringBuilder spannableStringBuilder;
        Runnable runnable;
        boolean z15;
        final int i14;
        char c10;
        String i15;
        int i16 = i10;
        int i17 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.J;
        ArrayList arrayList5 = this.K;
        ArrayList arrayList6 = this.x;
        ArrayList arrayList7 = this.F;
        y yVar = this.j0;
        int i18 = this.s0;
        final int i19 = 1;
        switch (i17) {
            case 0:
                m6 m6Var = (m6) view;
                f7.i(y6.d6, m6Var, null);
                long dialogId = m6Var.getDialogId();
                boolean N = N(i16);
                Object I = I(i16);
                boolean z16 = I instanceof TLRPC.TL_sponsoredPeer;
                if (z16) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) I;
                    HashSet hashSet = this.L;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            hashSet.add(tL_sponsoredPeer.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                            ConnectionsManager.getInstance(i18).sendRequest(tL_messages_viewSponsoredMessage, null);
                        } else if (Arrays.equals((byte[]) it.next(), tL_sponsoredPeer.random_id)) {
                        }
                    }
                    long peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer.peer);
                    if (peerDialogId >= 0) {
                        user = MessagesController.getInstance(i18).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user.usernames;
                            publicUsername = DialogObject.getPublicUsername(user, this.b0);
                            arrayList2 = arrayList8;
                            chat2 = null;
                            String str7 = publicUsername;
                            arrayList = arrayList5;
                            str = str7;
                            obj = I;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = null;
                            arrayList2 = null;
                            publicUsername = null;
                            chat2 = chat;
                            String str72 = publicUsername;
                            arrayList = arrayList5;
                            str = str72;
                            obj = I;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    } else {
                        TLRPC.Chat chat3 = MessagesController.getInstance(i18).getChat(Long.valueOf(-peerDialogId));
                        if (chat3 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = chat3.usernames;
                            publicUsername = DialogObject.getPublicUsername(chat3, this.b0);
                            arrayList2 = arrayList9;
                            chat2 = chat3;
                            user = null;
                            String str722 = publicUsername;
                            arrayList = arrayList5;
                            str = str722;
                            obj = I;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = chat3;
                            user = null;
                            arrayList2 = null;
                            publicUsername = null;
                            chat2 = chat;
                            String str7222 = publicUsername;
                            arrayList = arrayList5;
                            str = str7222;
                            obj = I;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    }
                } else if (I instanceof TLRPC.User) {
                    user = (TLRPC.User) I;
                    ArrayList<TLRPC.TL_username> arrayList10 = user.usernames;
                    obj = I;
                    arrayList = arrayList5;
                    encryptedChat = null;
                    str = DialogObject.getPublicUsername(user, this.b0);
                    arrayList2 = arrayList10;
                    r72 = 0;
                } else if (I instanceof TLRPC.Chat) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) I;
                    arrayList = arrayList5;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i18).getChat(Long.valueOf(chat4.id));
                    if (chat5 == null) {
                        chat5 = chat4;
                    }
                    ArrayList<TLRPC.TL_username> arrayList11 = chat5.usernames;
                    obj = I;
                    str = DialogObject.getPublicUsername(chat5, this.b0);
                    encryptedChat = null;
                    arrayList2 = arrayList11;
                    r72 = chat5;
                    user = null;
                } else {
                    arrayList = arrayList5;
                    if (I instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat3 = MessagesController.getInstance(i18).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) I).id));
                        obj = I;
                        encryptedChat = encryptedChat3;
                        user = MessagesController.getInstance(i18).getUser(Long.valueOf(encryptedChat3.user_id));
                    } else {
                        obj = I;
                        encryptedChat = null;
                        user = null;
                    }
                    r72 = 0;
                    arrayList2 = null;
                    str = null;
                }
                if (arrayList6.isEmpty()) {
                    encryptedChat2 = encryptedChat;
                    z10 = true;
                } else {
                    encryptedChat2 = encryptedChat;
                    z10 = true;
                    i16 = ic.a.f(1, i16, arrayList6);
                }
                if (O()) {
                    if (i16 < J()) {
                        m6Var.M = i16 != J() + (-1);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i16 -= J();
                } else {
                    z11 = false;
                }
                if (arrayList7.isEmpty()) {
                    z12 = z16;
                } else {
                    z12 = z16;
                    i16 = ic.a.f(1, i16, arrayList7);
                }
                ArrayList arrayList12 = yVar.e;
                ArrayList arrayList13 = yVar.j;
                int i20 = i16;
                int size = this.s.size();
                int size2 = yVar.d.size();
                int i21 = (size + size2 <= 0 || (J() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i20 : i20 - 1;
                int size3 = arrayList13.size();
                if (size3 > 3 && this.H0) {
                    size3 = 3;
                }
                int i22 = (size3 <= 0 || !(arrayList13.get(size3 + (-1)) instanceof String)) ? size3 : size3 - 2;
                int size4 = arrayList12.size();
                if (size4 > 3 && this.G0) {
                    size4 = 3;
                }
                int size5 = (arrayList12.isEmpty() && arrayList.isEmpty()) ? 0 : arrayList.size() + size4 + 1;
                if (!z11) {
                    m6Var.M = (i21 == (h() - J()) + (-1) || i21 == ((size + i22) + size2) + (-1) || i21 == (((size + size5) + size3) + size2) + (-1)) ? false : true;
                }
                if (i21 < 0 || i21 >= this.s.size() || user != null) {
                    charSequence = null;
                } else {
                    CharSequence charSequence6 = (CharSequence) this.G.get(i21);
                    String publicUsername2 = UserObject.getPublicUsername(user);
                    if (charSequence6 != null && user != null && publicUsername2 != null) {
                        boolean startsWith = charSequence6.toString().startsWith("@".concat(publicUsername2));
                        charSequence = charSequence6;
                        break;
                    }
                    r52 = charSequence6;
                    charSequence2 = null;
                    if (charSequence2 == null) {
                        String str8 = z11 ? this.w0 : yVar.c;
                        if (!TextUtils.isEmpty(str8)) {
                            String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : r72 != 0 ? r72.monoforum ? pg.d.i(r72, i18, false) : r72.title : null;
                            if (formatName != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(formatName, str8)) != -1) {
                                r52 = new SpannableStringBuilder(formatName);
                                r52.setSpan(new p10(y6.q6, null), indexOfIgnoreCase, str8.length() + indexOfIgnoreCase, 33);
                            }
                            if (arrayList2 == null || arrayList2.size() <= 1) {
                                charSequence3 = charSequence2;
                            } else {
                                String substring = str8.startsWith("@") ? str8.substring(1) : str8;
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                CharSequence charSequence7 = charSequence2;
                                while (true) {
                                    if (i23 < size6) {
                                        TLRPC.TL_username tL_username = arrayList2.get(i23);
                                        i23++;
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
                                    int size7 = arrayList2.size();
                                    int i24 = 0;
                                    while (i24 < size7) {
                                        TLRPC.TL_username tL_username3 = arrayList2.get(i24);
                                        i24++;
                                        TLRPC.TL_username tL_username4 = tL_username3;
                                        String str9 = str4;
                                        if (tL_username4.active && tL_username4.username.contains(substring)) {
                                            str5 = tL_username4.username;
                                            if (str5 != null) {
                                                str = str5;
                                            }
                                        } else {
                                            str4 = str9;
                                        }
                                    }
                                }
                                str5 = str4;
                                if (str5 != null) {
                                }
                            }
                            if (str != null && (user == null || N)) {
                                if (str8.startsWith("@")) {
                                    str8 = str8.substring(1);
                                }
                                try {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) "@");
                                    spannableStringBuilder2.append((CharSequence) str);
                                    int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str, str8);
                                    if (indexOfIgnoreCase2 != -1) {
                                        int length = str8.length();
                                        if (indexOfIgnoreCase2 == 0) {
                                            length++;
                                        } else {
                                            indexOfIgnoreCase2++;
                                        }
                                        charSequence4 = null;
                                        try {
                                            spannableStringBuilder2.setSpan(new p10(y6.q6, null), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                        } catch (Exception e) {
                                            e = e;
                                            FileLog.e(e);
                                            charSequence3 = str;
                                            str2 = r52;
                                            m6Var.r(false, false);
                                            if (user == null) {
                                            }
                                            charSequence5 = charSequence3;
                                            z13 = false;
                                            str3 = str2;
                                            if (r72 == 0) {
                                            }
                                            if (user != null) {
                                            }
                                            r10 = 0;
                                            z14 = true;
                                            o oVar = new o(this, r10);
                                            m6Var.B0 = z11;
                                            m6Var.C0 = oVar;
                                            m6Var.setOnSponsoredOptionsClick(new e2(this, 3));
                                            m6Var.setAd(!z12 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                            m6Var.s(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z13);
                                            m6Var.r(this.U.a.I2.contains(Long.valueOf(m6Var.getDialogId())), dialogId != m6Var.getDialogId() ? z14 : r10);
                                            return;
                                        }
                                    } else {
                                        charSequence4 = null;
                                    }
                                    charSequence3 = spannableStringBuilder2;
                                    str2 = r52;
                                } catch (Exception e10) {
                                    e = e10;
                                    charSequence4 = null;
                                }
                                m6Var.r(false, false);
                                if (user == null && user.id == this.l0 && this.h0 != 16) {
                                    charSequence5 = charSequence4;
                                    z13 = true;
                                    str3 = LocaleController.getString(R.string.SavedMessages);
                                } else {
                                    charSequence5 = charSequence3;
                                    z13 = false;
                                    str3 = str2;
                                }
                                if (r72 == 0 && r72.participants_count != 0) {
                                    String formatPluralStringSpaced = (!ChatObject.isChannel(r72) || r72.megagroup) ? LocaleController.formatPluralStringSpaced("Members", r72.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", r72.participants_count);
                                    if (charSequence5 instanceof SpannableStringBuilder) {
                                        ((SpannableStringBuilder) charSequence5).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced);
                                    } else {
                                        charSequence5 = !TextUtils.isEmpty(charSequence5) ? TextUtils.concat(charSequence5, ", ", formatPluralStringSpaced) : formatPluralStringSpaced;
                                    }
                                } else if (user != null && user.bot && (i11 = user.bot_active_users) != 0) {
                                    String formatPluralStringSpaced2 = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                                    if (charSequence5 instanceof SpannableStringBuilder) {
                                        if (TextUtils.isEmpty(charSequence5)) {
                                            r10 = 0;
                                            z14 = true;
                                            charSequence5 = formatPluralStringSpaced2;
                                        } else {
                                            r10 = 0;
                                            z14 = true;
                                            charSequence5 = TextUtils.concat(charSequence5, ", ", formatPluralStringSpaced2);
                                        }
                                        o oVar2 = new o(this, r10);
                                        m6Var.B0 = z11;
                                        m6Var.C0 = oVar2;
                                        m6Var.setOnSponsoredOptionsClick(new e2(this, 3));
                                        m6Var.setAd(!z12 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                        m6Var.s(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z13);
                                        m6Var.r(this.U.a.I2.contains(Long.valueOf(m6Var.getDialogId())), dialogId != m6Var.getDialogId() ? z14 : r10);
                                    } else {
                                        ((SpannableStringBuilder) charSequence5).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced2);
                                    }
                                }
                                r10 = 0;
                                z14 = true;
                                o oVar22 = new o(this, r10);
                                m6Var.B0 = z11;
                                m6Var.C0 = oVar22;
                                m6Var.setOnSponsoredOptionsClick(new e2(this, 3));
                                m6Var.setAd(!z12 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                m6Var.s(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z13);
                                m6Var.r(this.U.a.I2.contains(Long.valueOf(m6Var.getDialogId())), dialogId != m6Var.getDialogId() ? z14 : r10);
                            }
                            charSequence4 = null;
                            str2 = r52;
                            m6Var.r(false, false);
                            if (user == null) {
                            }
                            charSequence5 = charSequence3;
                            z13 = false;
                            str3 = str2;
                            if (r72 == 0) {
                            }
                            if (user != null) {
                                String formatPluralStringSpaced22 = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                                if (charSequence5 instanceof SpannableStringBuilder) {
                                }
                            }
                            r10 = 0;
                            z14 = true;
                            o oVar222 = new o(this, r10);
                            m6Var.B0 = z11;
                            m6Var.C0 = oVar222;
                            m6Var.setOnSponsoredOptionsClick(new e2(this, 3));
                            m6Var.setAd(!z12 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                            m6Var.s(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z13);
                            m6Var.r(this.U.a.I2.contains(Long.valueOf(m6Var.getDialogId())), dialogId != m6Var.getDialogId() ? z14 : r10);
                        }
                    }
                    charSequence3 = charSequence2;
                    charSequence4 = null;
                    str2 = r52;
                    m6Var.r(false, false);
                    if (user == null) {
                    }
                    charSequence5 = charSequence3;
                    z13 = false;
                    str3 = str2;
                    if (r72 == 0) {
                    }
                    if (user != null) {
                    }
                    r10 = 0;
                    z14 = true;
                    o oVar2222 = new o(this, r10);
                    m6Var.B0 = z11;
                    m6Var.C0 = oVar2222;
                    m6Var.setOnSponsoredOptionsClick(new e2(this, 3));
                    m6Var.setAd(!z12 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                    m6Var.s(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z13);
                    m6Var.r(this.U.a.I2.contains(Long.valueOf(m6Var.getDialogId())), dialogId != m6Var.getDialogId() ? z14 : r10);
                }
                r52 = 0;
                charSequence2 = charSequence;
                if (charSequence2 == null) {
                }
                charSequence3 = charSequence2;
                charSequence4 = null;
                str2 = r52;
                m6Var.r(false, false);
                if (user == null) {
                }
                charSequence5 = charSequence3;
                z13 = false;
                str3 = str2;
                if (r72 == 0) {
                }
                if (user != null) {
                }
                r10 = 0;
                z14 = true;
                o oVar22222 = new o(this, r10);
                m6Var.B0 = z11;
                m6Var.C0 = oVar22222;
                m6Var.setOnSponsoredOptionsClick(new e2(this, 3));
                m6Var.setAd(!z12 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                m6Var.s(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z13);
                m6Var.r(this.U.a.I2.contains(Long.valueOf(m6Var.getDialogId())), dialogId != m6Var.getDialogId() ? z14 : r10);
                break;
            case 1:
                final z3 z3Var = (z3) view;
                if (!arrayList4.isEmpty()) {
                    String string = LocaleController.getString(R.string.Hashtags);
                    String string2 = LocaleController.getString(R.string.ClearButton);
                    final int i25 = r15 ? 1 : 0;
                    z3Var.b(string, string2, new View.OnClickListener(this) { // from class: ig.p
                        public final /* synthetic */ i0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i25) {
                                case 0:
                                    lx lxVar = this.b.U;
                                    if (lxVar != null) {
                                        lxVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    jx jxVar = ((wo0) this.b).K0;
                                    uo0 uo0Var = jxVar.x0;
                                    wo0 wo0Var = jxVar.d0;
                                    String str10 = wo0Var.y;
                                    ArrayList arrayList14 = wo0Var.x;
                                    int i26 = wo0Var.w;
                                    int i27 = wo0Var.v;
                                    ArrayList arrayList15 = uo0Var.Q;
                                    if (!TextUtils.equals(str10, uo0Var.a0)) {
                                        uo0Var.W();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        uo0Var.Y = i27;
                                        uo0Var.X = i27 > arrayList14.size();
                                        uo0Var.b0 = i26;
                                        uo0Var.a0 = str10;
                                        uo0Var.O(true);
                                    }
                                    jxVar.s0 = true;
                                    jxVar.v0.h1(0, 0);
                                    jxVar.S();
                                    k91 k91Var = jxVar.M;
                                    if (k91Var != null && k91Var.getCurrentTabId() != 1) {
                                        jxVar.M.d(1, 1);
                                    }
                                    uo0Var.Z(jxVar.M0);
                                    break;
                                case 2:
                                    lx lxVar2 = this.b.U;
                                    if (lxVar2 != null) {
                                        lxVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    lx lxVar3 = this.b.U;
                                    if (lxVar3 != null) {
                                        lxVar3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i12 = i16;
                    } else if (i16 == 0) {
                        z3Var.b(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) { // from class: ig.p
                            public final /* synthetic */ i0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i19) {
                                    case 0:
                                        lx lxVar = this.b.U;
                                        if (lxVar != null) {
                                            lxVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        jx jxVar = ((wo0) this.b).K0;
                                        uo0 uo0Var = jxVar.x0;
                                        wo0 wo0Var = jxVar.d0;
                                        String str10 = wo0Var.y;
                                        ArrayList arrayList14 = wo0Var.x;
                                        int i26 = wo0Var.w;
                                        int i27 = wo0Var.v;
                                        ArrayList arrayList15 = uo0Var.Q;
                                        if (!TextUtils.equals(str10, uo0Var.a0)) {
                                            uo0Var.W();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            uo0Var.Y = i27;
                                            uo0Var.X = i27 > arrayList14.size();
                                            uo0Var.b0 = i26;
                                            uo0Var.a0 = str10;
                                            uo0Var.O(true);
                                        }
                                        jxVar.s0 = true;
                                        jxVar.v0.h1(0, 0);
                                        jxVar.S();
                                        k91 k91Var = jxVar.M;
                                        if (k91Var != null && k91Var.getCurrentTabId() != 1) {
                                            jxVar.M.d(1, 1);
                                        }
                                        uo0Var.Z(jxVar.M0);
                                        break;
                                    case 2:
                                        lx lxVar2 = this.b.U;
                                        if (lxVar2 != null) {
                                            lxVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        lx lxVar3 = this.b.U;
                                        if (lxVar3 != null) {
                                            lxVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i12 = ic.a.f(1, i16, arrayList6);
                    }
                    ArrayList arrayList14 = yVar.e;
                    ArrayList arrayList15 = yVar.j;
                    boolean O = O();
                    ArrayList arrayList16 = this.E;
                    if (O || !arrayList7.isEmpty() || !arrayList16.isEmpty() || !arrayList6.isEmpty()) {
                        ?? L = L();
                        if (i12 >= L) {
                            if (i12 != L || !O()) {
                                if (i12 == J() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.s.isEmpty()) {
                                    z3Var.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                                    break;
                                } else {
                                    i12 -= J();
                                }
                            } else if (!this.N) {
                                final int i26 = 2;
                                z3Var.b(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) { // from class: ig.p
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i26) {
                                            case 0:
                                                lx lxVar = this.b.U;
                                                if (lxVar != null) {
                                                    lxVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                jx jxVar = ((wo0) this.b).K0;
                                                uo0 uo0Var = jxVar.x0;
                                                wo0 wo0Var = jxVar.d0;
                                                String str10 = wo0Var.y;
                                                ArrayList arrayList142 = wo0Var.x;
                                                int i262 = wo0Var.w;
                                                int i27 = wo0Var.v;
                                                ArrayList arrayList152 = uo0Var.Q;
                                                if (!TextUtils.equals(str10, uo0Var.a0)) {
                                                    uo0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    uo0Var.Y = i27;
                                                    uo0Var.X = i27 > arrayList142.size();
                                                    uo0Var.b0 = i262;
                                                    uo0Var.a0 = str10;
                                                    uo0Var.O(true);
                                                }
                                                jxVar.s0 = true;
                                                jxVar.v0.h1(0, 0);
                                                jxVar.S();
                                                k91 k91Var = jxVar.M;
                                                if (k91Var != null && k91Var.getCurrentTabId() != 1) {
                                                    jxVar.M.d(1, 1);
                                                }
                                                uo0Var.Z(jxVar.M0);
                                                break;
                                            case 2:
                                                lx lxVar2 = this.b.U;
                                                if (lxVar2 != null) {
                                                    lxVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                lx lxVar3 = this.b.U;
                                                if (lxVar3 != null) {
                                                    lxVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i27 = 3;
                                z3Var.b(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) { // from class: ig.p
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i27) {
                                            case 0:
                                                lx lxVar = this.b.U;
                                                if (lxVar != null) {
                                                    lxVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                jx jxVar = ((wo0) this.b).K0;
                                                uo0 uo0Var = jxVar.x0;
                                                wo0 wo0Var = jxVar.d0;
                                                String str10 = wo0Var.y;
                                                ArrayList arrayList142 = wo0Var.x;
                                                int i262 = wo0Var.w;
                                                int i272 = wo0Var.v;
                                                ArrayList arrayList152 = uo0Var.Q;
                                                if (!TextUtils.equals(str10, uo0Var.a0)) {
                                                    uo0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    uo0Var.Y = i272;
                                                    uo0Var.X = i272 > arrayList142.size();
                                                    uo0Var.b0 = i262;
                                                    uo0Var.a0 = str10;
                                                    uo0Var.O(true);
                                                }
                                                jxVar.s0 = true;
                                                jxVar.v0.h1(0, 0);
                                                jxVar.S();
                                                k91 k91Var = jxVar.M;
                                                if (k91Var != null && k91Var.getCurrentTabId() != 1) {
                                                    jxVar.M.d(1, 1);
                                                }
                                                uo0Var.Z(jxVar.M0);
                                                break;
                                            case 2:
                                                lx lxVar2 = this.b.U;
                                                if (lxVar2 != null) {
                                                    lxVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                lx lxVar3 = this.b.U;
                                                if (lxVar3 != null) {
                                                    lxVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            z3Var.setText(LocaleController.getString(R.string.ChatHints));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = yVar.d.size();
                    int size10 = arrayList15.size();
                    if (size10 > 3 && this.H0) {
                        size10 = 3;
                    }
                    int size11 = arrayList14.size();
                    if (size11 > 3 && this.G0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList14.isEmpty() && arrayList5.isEmpty()) ? 0 : arrayList5.size() + size11 + 1;
                    int size13 = arrayList3.isEmpty() ? 0 : arrayList3.size() + 1;
                    ArrayList arrayList17 = this.I;
                    if (!arrayList17.isEmpty()) {
                        arrayList17.size();
                    }
                    int i28 = size13;
                    if (this.c != f0.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i13 = 1;
                        str6 = null;
                    } else {
                        str6 = i12 == 0 ? LocaleController.getString(R.string.Topics) : null;
                        i13 = 1;
                        i12 = ic.a.f(1, i12, arrayList7);
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i12 == 0) {
                            str6 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        i12 = ic.a.f(i13, i12, arrayList16);
                    }
                    if (str6 == null) {
                        int i29 = i12 - (size8 + size9);
                        if (i29 < 0 || i29 >= size10) {
                            int i30 = i29 - size10;
                            if (i30 < 0 || i30 >= size12) {
                                if (this.U == null || i28 <= 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                    if (i30 - size12 <= 1) {
                                        TLRPC.Chat chat6 = MessagesController.getInstance(i18).getChat(Long.valueOf(-this.U.a()));
                                        int i31 = R.string.SearchMessagesIn;
                                        if (chat6 == null) {
                                            i15 = BuildConfig.BETA_URL;
                                            c10 = 0;
                                        } else {
                                            c10 = 0;
                                            i15 = chat6.monoforum ? pg.d.i(chat6, i18, false) : chat6.title;
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[c10] = i15;
                                        str6 = LocaleController.formatString(i31, objArr);
                                    }
                                }
                                this.F0 = i30;
                                SpannableStringBuilder H = H(this.c);
                                Runnable runnable2 = new Runnable(this) { // from class: ig.q
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                i0 i0Var = this.b;
                                                boolean z17 = i0Var.H0;
                                                i0Var.H0 = !z17;
                                                z3Var.setRightText(LocaleController.getString(!z17 ? R.string.ShowMore : R.string.ShowLess));
                                                i0Var.l();
                                                break;
                                            default:
                                                i0 i0Var2 = this.b;
                                                cy cyVar = i0Var2.r0;
                                                z3 z3Var2 = z3Var;
                                                k80 H2 = k80.H(cyVar, z3Var2);
                                                for (f0 f0Var : f0.values()) {
                                                    boolean z18 = f0Var.a == i0Var2.c.a;
                                                    H2.i(new s9(i0Var2, z18, z3Var2, f0Var, 5), LocaleController.getString(f0Var.b), z18);
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
                                z15 = false;
                            } else {
                                String string3 = LocaleController.getString(R.string.GlobalSearch);
                                if (yVar.e.size() > 3) {
                                    z15 = this.G0;
                                    ai.h1 h1Var = new ai.h1(this, arrayList14, i10, z3Var, 6);
                                    z3Var = z3Var;
                                    str6 = string3;
                                    runnable = h1Var;
                                    spannableStringBuilder = null;
                                } else {
                                    str6 = string3;
                                }
                            }
                        } else {
                            str6 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (arrayList15.size() > 3) {
                                final int i32 = 0;
                                z15 = this.H0;
                                runnable = new Runnable(this) { // from class: ig.q
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i32) {
                                            case 0:
                                                i0 i0Var = this.b;
                                                boolean z17 = i0Var.H0;
                                                i0Var.H0 = !z17;
                                                z3Var.setRightText(LocaleController.getString(!z17 ? R.string.ShowMore : R.string.ShowLess));
                                                i0Var.l();
                                                break;
                                            default:
                                                i0 i0Var2 = this.b;
                                                cy cyVar = i0Var2.r0;
                                                z3 z3Var2 = z3Var;
                                                k80 H2 = k80.H(cyVar, z3Var2);
                                                for (f0 f0Var : f0.values()) {
                                                    boolean z18 = f0Var.a == i0Var2.c.a;
                                                    H2.i(new s9(i0Var2, z18, z3Var2, f0Var, 5), LocaleController.getString(f0Var.b), z18);
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
                                z3Var.b(str6, LocaleController.getString(z15 ? R.string.ShowMore : R.string.ShowLess), new w6(3, runnable));
                                z3Var.setRightTextMargin(16);
                                break;
                            } else {
                                z3Var.b(str6, spannableStringBuilder, new w6(4, runnable));
                                z3Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            z3Var.setText(str6);
                            break;
                        }
                    }
                    spannableStringBuilder = null;
                    runnable = null;
                    z15 = false;
                    if (runnable == null) {
                    }
                }
                break;
            case 2:
            case 9:
                p2 p2Var = (p2) view;
                f7.i(y6.d6, p2Var, null);
                p2Var.s2 = i16 != h() - 1;
                MessageObject messageObject = (MessageObject) I(i16);
                p2Var.O = arrayList3.contains(messageObject);
                if (messageObject != null) {
                    p2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                    break;
                } else {
                    p2Var.V(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((ua) view).setTopic((TLRPC.TL_forumTopic) I(i16));
                break;
            case 5:
                p4 p4Var = (p4) view;
                f7.i(y6.d6, p4Var, null);
                p4Var.setText((CharSequence) arrayList4.get(i16 - 1));
                p4Var.setNeedDivider(i16 != arrayList4.size());
                break;
            case 6:
                ((b0) ((mm0) view).getAdapter()).l();
                break;
            case 7:
                String str10 = (String) I(i16);
                v8 v8Var = (v8) view;
                v8Var.g(-1, y6.o6);
                v8Var.k(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, kf.b.c().b("+" + str10)), false);
                break;
            case 8:
                m6 m6Var2 = (m6) view;
                ContactsController.Contact contact = (ContactsController.Contact) I(i16);
                m6Var2.s(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), vh.g(new StringBuilder("+"), contact.shortPhones.get(0), kf.b.c()), false, false);
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = this.h0;
        int i12 = 1;
        u6 u6Var = null;
        Context context = this.e;
        switch (i10) {
            case 0:
                m6 m6Var = new m6(context, null);
                m6Var.l0 = i11 == 3;
                view = m6Var;
                view2 = view;
                break;
            case 1:
                view2 = new z3(context, null);
                break;
            case 2:
            case 9:
                view2 = new z(false ? 1 : 0, context, true ? 1 : 0);
                break;
            case 3:
                view2 = new ua(context);
                break;
            case 4:
                c10 c10Var = new c10(context, null);
                c10Var.setViewType(1);
                c10Var.setIsSingleCell(true);
                view2 = c10Var;
                break;
            case 5:
                p4 p4Var = new p4(context);
                p4Var.setGravity(16);
                p4Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                p4Var.setTextSize(1, 17.0f);
                f7.V(p4Var, y6.G6, null);
                view2 = p4Var;
                break;
            case 6:
                za1 za1Var = new za1(context, 2, u6Var);
                f7.m(za1Var, 20, y6.i6, null);
                za1Var.setTag(9);
                za1Var.setItemAnimator(null);
                za1Var.setLayoutAnimation(null);
                a0 a0Var = new a0((int) (false ? 1 : 0));
                a0Var.k1(0);
                za1Var.setLayoutManager(a0Var);
                za1Var.setAdapter(new b0(this.s0, this.e, null, false, i11 == 3));
                za1Var.setOnItemClickListener(new ai.k(this, 14));
                za1Var.setOnItemLongClickListener(new w(this));
                this.k0 = za1Var;
                view = za1Var;
                view2 = view;
                break;
            case 7:
            default:
                view2 = new v8(16, context, false);
                break;
            case 8:
                view2 = new m6(context, null);
                break;
            case 10:
                v vVar = new v(this, i12);
                e0 e0Var = new e0(context);
                e0Var.setOrientation(1);
                y9 y9Var = new y9(context);
                y9Var.setImageDrawable(new xj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
                e0Var.addView(y9Var, gb1.x(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i13 = y6.G6;
                f7.V(textView, i13, null);
                textView.setTypeface(AndroidUtilities.bold());
                vh.k(R.string.SearchMessagesFilterEmptyTitle, textView, 17);
                e0Var.addView(textView, gb1.x(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                e0Var.a = textView2;
                textView2.setTextSize(1, 14.0f);
                f7.V(textView2, i13, null);
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView2.setGravity(17);
                e0Var.addView(textView2, gb1.x(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView3.setTextSize(1, 14.0f);
                textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i14 = y6.Oh;
                f7.V(textView3, i14, null);
                int o12 = y6.o1(0.15f, y6.x0(null, i14, false));
                org.telegram.ui.Cells.y j02 = y6.j0(6, 6, 6, 6, 0, o12, o12);
                b7 L = f7.L(0.15f, i14);
                textView3.setBackground(j02);
                f7.k(textView3, j02, null, L, null);
                textView3.setOnClickListener(new d0(vVar, false ? 1 : 0));
                e0Var.addView(textView3, gb1.x(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = e0Var;
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.Z));
                view2 = e0Var;
                break;
        }
        if (i10 == 5) {
            view2.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            view2.setLayoutParams(new s4.q0(-1, -2));
        }
        return new vl0(view2);
    }
}
