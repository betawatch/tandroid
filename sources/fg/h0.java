package fg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.af;
import bi.g3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.gy;
import org.telegram.ui.ic1;
import org.telegram.ui.iy;
import org.telegram.ui.q10;
import org.telegram.ui.wy;
import org.telegram.ui.yv;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class h0 extends ul0 {
    public q10 A0;
    public int B0;
    public int C0;
    public int D0;
    public d0 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public iy U;
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
    public u f;
    public int f0;
    public int g0;
    public u h;
    public final int h0;
    public final s4.j i0;
    public final y j0;
    public ic1 k0;
    public final long l0;
    public long n0;
    public View o0;
    public af p0;
    public ArrayList q0;
    public g3 r;
    public final wy r0;
    public final int s0;
    public ArrayList t0;
    public final ArrayList u0;
    public int v;
    public final ArrayList v0;
    public int w;
    public String w0;
    public a0.i x0;
    public String y;
    public final ArrayList y0;
    public boolean z0;
    public e0 c = e0.d;
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

    public h0(Context context, wy wyVar, int i10, int i11, s4.j jVar, boolean z10) {
        int i12 = UserConfig.selectedAccount;
        this.s0 = i12;
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = null;
        this.x0 = new a0.i();
        this.y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.i0 = jVar;
        this.r0 = wyVar;
        ao0 ao0Var = (ao0) this;
        y yVar = new y(ao0Var);
        this.j0 = yVar;
        yVar.a = new pb.c(ao0Var, 18);
        yVar.p = z10;
        this.e = context;
        this.V = i10;
        this.h0 = i11;
        this.l0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new n(i12, i11, new x(this), 0));
        }
        MediaDataController.getInstance(i12).loadHints(true);
    }

    public static boolean Y(String str, String str2) {
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

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
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
                g0 g0Var = (g0) arrayList2.remove(0);
                this.t0.remove(g0Var);
                arrayList.remove(g0Var);
                this.x0.l(g0Var.c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(g0Var.c);
                } else {
                    sb2.append(", ");
                    sb2.append(g0Var.c);
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
        MessagesStorage.getInstance(this.s0).getStorageQueue().postRunnable(new af(29, (ao0) this, sb2));
    }

    public final boolean F(Object obj) {
        if (this.h0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        wy wyVar = this.r0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? wyVar.A2 : wyVar.z2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return ChatObject.isChannel(chat) ? wyVar.y2 : ChatObject.isMegagroup(chat) ? wyVar.v2 || wyVar.w2 : wyVar.v2 || wyVar.x2;
    }

    public final void G(String str) {
        iy iyVar;
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
                iy iyVar2 = this.U;
                if ((iyVar2 == null || iyVar2.a() != ((g0) this.t0.get(i10)).c) && F(((g0) this.t0.get(i10)).a)) {
                    arrayList2.add((g0) this.t0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.t0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            g0 g0Var = (g0) this.t0.get(i11);
            if (g0Var != null && g0Var.a != null && (((iyVar = this.U) == null || iyVar.a() != g0Var.c) && F(((g0) this.t0.get(i11)).a))) {
                TLObject tLObject = g0Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? mg.d.i(chat, this.s0, false) : chat.title;
                    str3 = ((TLRPC.Chat) g0Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) g0Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(g0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(e0 e0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(e0Var.c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new uq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final ic1 I() {
        return this.k0;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public final Object J(int i10) {
        int i11;
        int i12;
        TLRPC.Chat chat;
        int i13;
        ArrayList arrayList = this.x;
        if (!arrayList.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList.size()) {
                return arrayList.get(i13);
            }
            i10 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList);
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0) {
                return arrayList2.get(i10 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            ArrayList arrayList3 = this.N ? this.v0 : this.u0;
            if (i10 > M && (i12 = (i10 - 1) - (M == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((g0) arrayList3.get(i12)).a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i14 = this.s0;
                if (!z10) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(i14).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                return user != null ? user : tLObject;
            }
            i10 -= K();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList5);
        }
        y yVar = this.j0;
        ArrayList arrayList6 = yVar.e;
        ArrayList arrayList7 = yVar.d;
        ArrayList arrayList8 = yVar.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (K() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
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

    public final int K() {
        ArrayList arrayList = this.N ? this.v0 : this.u0;
        return (M() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int L() {
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.x;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (P()) {
            size += K();
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
        return size2 + size3 > 0 ? (K() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i10 : i10 + 1 : i10;
    }

    public final boolean M() {
        if (this.N || MediaDataController.getInstance(this.s0).hints.isEmpty()) {
            return false;
        }
        return this.h0 != 14 || this.r0.z2;
    }

    public final boolean N() {
        return S() && K() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean O(int i10) {
        int i11;
        int i12;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                i10 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList);
            }
            if (P()) {
                ?? M = M();
                ArrayList arrayList2 = this.N ? this.v0 : this.u0;
                if (i10 <= M || (i10 - 1) - (M == true ? 1 : 0) >= arrayList2.size()) {
                    i10 -= K();
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
            if (size + size2 > 0 && (K() > 0 || !this.F.isEmpty() || !arrayList.isEmpty())) {
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
                    if (this.c != e0.d || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        return this.V != 2 && N();
    }

    public final void Q() {
        if ((this.Q == 0 || this.O == 0) && this.g0 == this.d0) {
            iy iyVar = this.U;
            if (iyVar == null || iyVar.a() == 0 || this.X) {
                W(this.g0, this.Z);
            } else {
                V(this.g0, this.Z);
            }
        }
    }

    public final void R(long j3, TLObject tLObject) {
        g0 g0Var = (g0) this.x0.f(j3);
        if (g0Var == null) {
            g0Var = new g0();
            this.x0.k(g0Var, j3);
        } else {
            this.t0.remove(g0Var);
        }
        this.t0.add(0, g0Var);
        g0Var.c = j3;
        g0Var.a = tLObject;
        g0Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.M;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.s0).getStorageQueue().postRunnable(new q((ao0) this, j3, 1));
    }

    public final boolean S() {
        int i10 = this.h0;
        return (i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 1 || i10 == 11 || i10 == 15) ? false : true;
    }

    public final void T() {
        int L;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (L = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(L + 1, size);
            int size2 = this.j0.e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(int i10, String str) {
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
        u uVar = this.h;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            this.h = null;
        }
        g3 g3Var = this.r;
        if (g3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g3Var);
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
                this.S = ConnectionsManager.getInstance(this.s0).sendRequest(tL_contacts_getSponsoredPeers, new bi.c2((ao0) this, 6));
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
                iy iyVar = this.U;
                yVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, iyVar != null ? iyVar.a() : 0L, null);
            }
            this.N = false;
            this.d0 = 0;
            this.D0 = 0;
            this.G0 = true;
            this.H0 = true;
            iy iyVar2 = this.U;
            if (iyVar2 != null) {
                iyVar2.d(false, true);
            }
            if (this.h0 != 15) {
                X(null);
                W(0, null);
                V(0, null);
            }
            l();
            this.y0.clear();
            this.z0 = false;
            q10 q10Var = this.A0;
            if (q10Var != null) {
                ((yv) q10Var).i(false, null, this.y0, false);
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
                    this.J.add(((b2) arrayList.get(i12)).a);
                }
                this.G0 = true;
                this.H0 = true;
                this.D0 = 0;
                l();
                iy iyVar3 = this.U;
                if (iyVar3 != null) {
                    iyVar3.d(false, false);
                }
            } else {
                MessagesStorage.getInstance(yVar2.m).getStorageQueue().postRunnable(new a2(yVar2, 1));
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
        iy iyVar4 = this.U;
        if (iyVar4 != null) {
            iyVar4.d(true, false);
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
                ao0 ao0Var = (ao0) this;
                u uVar2 = new u(ao0Var, trim, i13, str, 2);
                this.f = uVar2;
                dispatchQueue.postRunnable(uVar2, 300L);
                if (str2 == null) {
                    this.D0++;
                    g3 g3Var2 = new g3(ao0Var, i13, str2, 8);
                    this.r = g3Var2;
                    AndroidUtilities.runOnUIThread(g3Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        DispatchQueue dispatchQueue2 = Utilities.searchQueue;
        ao0 ao0Var2 = (ao0) this;
        u uVar22 = new u(ao0Var2, trim, i13, str, 2);
        this.f = uVar22;
        dispatchQueue2.postRunnable(uVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void V(int i10, String str) {
        iy iyVar = this.U;
        if (iyVar == null || iyVar.a() == 0 || this.V == 0) {
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

    public final void W(int i10, String str) {
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
                    MessageObject messageObject = (MessageObject) hc.b.i(1, arrayList);
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
            iy iyVar = this.U;
            if (iyVar != null) {
                iyVar.d(i15 > 0, true);
                this.U.c();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        iy iyVar = this.U;
        if (iyVar == null || iyVar.a() == 0) {
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
        if (P()) {
            size += K();
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
        if (size2 + size3 > 0 && (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
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
        if ((this.c != e0.d || this.d) && arrayList6.isEmpty()) {
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
            if (P()) {
                ?? M = M();
                if (i10 < M) {
                    return 6;
                }
                if (i10 != M) {
                    if (i10 >= K()) {
                        i10 -= K();
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
                    i10 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList2);
                }
            }
            ArrayList arrayList3 = this.E;
            if (!arrayList3.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList3.size()) {
                        return 8;
                    }
                    i10 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList3);
                }
            }
            y yVar = this.j0;
            ArrayList arrayList4 = yVar.e;
            int size = this.s.size();
            int size2 = yVar.d.size();
            if (size + size2 > 0 && (K() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
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
            e0 e0Var = this.c;
            e0 e0Var2 = e0.d;
            if ((e0Var != e0Var2 || this.d) && arrayList6.isEmpty()) {
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
                                    return (this.c == e0Var2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i15 == 0) {
                    }
                } else {
                    Object J = J(i14);
                    if (J instanceof String) {
                        if (!"section".equals((String) J)) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0320  */
    /* JADX WARN: Type inference failed for: r10v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r7v62 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        ?? r72;
        ArrayList<TLRPC.TL_username> arrayList2;
        String str;
        Object obj;
        boolean z11;
        TLRPC.EncryptedChat encryptedChat2;
        CharSequence charSequence;
        ?? r52;
        CharSequence charSequence2;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        String str2;
        CharSequence charSequence3;
        boolean z12;
        String str3;
        int i11;
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
        boolean z13;
        final int i14;
        char c10;
        String str7;
        Runnable qVar;
        int i15 = i10;
        int i16 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.J;
        ArrayList arrayList5 = this.K;
        ArrayList arrayList6 = this.x;
        ArrayList arrayList7 = this.F;
        y yVar = this.j0;
        int i17 = this.s0;
        final int i18 = 1;
        switch (i16) {
            case 0:
                j6 j6Var = (j6) view;
                j6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                long dialogId = j6Var.getDialogId();
                boolean O = O(i15);
                Object J = J(i15);
                boolean z14 = J instanceof TLRPC.TL_sponsoredPeer;
                if (z14) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) J;
                    HashSet hashSet = this.L;
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
                            ArrayList<TLRPC.TL_username> arrayList8 = user.usernames;
                            publicUsername = DialogObject.getPublicUsername(user, this.b0);
                            arrayList2 = arrayList8;
                            chat2 = null;
                            String str8 = publicUsername;
                            arrayList = arrayList5;
                            str = str8;
                            z10 = z14;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = null;
                            arrayList2 = null;
                            publicUsername = null;
                            chat2 = chat;
                            String str82 = publicUsername;
                            arrayList = arrayList5;
                            str = str82;
                            z10 = z14;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    } else {
                        TLRPC.Chat chat3 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                        if (chat3 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = chat3.usernames;
                            publicUsername = DialogObject.getPublicUsername(chat3, this.b0);
                            arrayList2 = arrayList9;
                            chat2 = chat3;
                            user = null;
                            String str822 = publicUsername;
                            arrayList = arrayList5;
                            str = str822;
                            z10 = z14;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = chat3;
                            user = null;
                            arrayList2 = null;
                            publicUsername = null;
                            chat2 = chat;
                            String str8222 = publicUsername;
                            arrayList = arrayList5;
                            str = str8222;
                            z10 = z14;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    }
                } else if (J instanceof TLRPC.User) {
                    user = (TLRPC.User) J;
                    ArrayList<TLRPC.TL_username> arrayList10 = user.usernames;
                    z10 = z14;
                    arrayList = arrayList5;
                    encryptedChat = null;
                    str = DialogObject.getPublicUsername(user, this.b0);
                    arrayList2 = arrayList10;
                    r72 = 0;
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) J;
                    arrayList = arrayList5;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i17).getChat(Long.valueOf(chat4.id));
                    if (chat5 == null) {
                        chat5 = chat4;
                    }
                    ArrayList<TLRPC.TL_username> arrayList11 = chat5.usernames;
                    z10 = z14;
                    str = DialogObject.getPublicUsername(chat5, this.b0);
                    encryptedChat = null;
                    arrayList2 = arrayList11;
                    r72 = chat5;
                    user = null;
                } else {
                    arrayList = arrayList5;
                    if (J instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat3 = MessagesController.getInstance(i17).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) J).id));
                        z10 = z14;
                        encryptedChat = encryptedChat3;
                        user = MessagesController.getInstance(i17).getUser(Long.valueOf(encryptedChat3.user_id));
                    } else {
                        z10 = z14;
                        encryptedChat = null;
                        user = null;
                    }
                    r72 = 0;
                    arrayList2 = null;
                    str = null;
                }
                if (arrayList6.isEmpty()) {
                    obj = J;
                } else {
                    obj = J;
                    i15 = com.google.android.gms.internal.vision.e2.e(1, i15, arrayList6);
                }
                if (P()) {
                    if (i15 < K()) {
                        j6Var.M = i15 != K() + (-1);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i15 -= K();
                } else {
                    z11 = false;
                }
                if (arrayList7.isEmpty()) {
                    encryptedChat2 = encryptedChat;
                } else {
                    encryptedChat2 = encryptedChat;
                    i15 = com.google.android.gms.internal.vision.e2.e(1, i15, arrayList7);
                }
                ArrayList arrayList12 = yVar.e;
                ArrayList arrayList13 = yVar.j;
                int i19 = i15;
                int size = this.s.size();
                int size2 = yVar.d.size();
                int i20 = (size + size2 <= 0 || (K() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i19 : i19 - 1;
                int size3 = arrayList13.size();
                if (size3 > 3 && this.H0) {
                    size3 = 3;
                }
                int i21 = (size3 <= 0 || !(arrayList13.get(size3 + (-1)) instanceof String)) ? size3 : size3 - 2;
                int size4 = arrayList12.size();
                if (size4 > 3 && this.G0) {
                    size4 = 3;
                }
                int size5 = (arrayList12.isEmpty() && arrayList.isEmpty()) ? 0 : arrayList.size() + size4 + 1;
                if (!z11) {
                    j6Var.M = (i20 == (h() - K()) + (-1) || i20 == ((size + i21) + size2) + (-1) || i20 == (((size + size5) + size3) + size2) + (-1)) ? false : true;
                }
                if (i20 < 0 || i20 >= this.s.size() || user != null) {
                    charSequence = null;
                } else {
                    charSequence = (CharSequence) this.G.get(i20);
                    String publicUsername2 = UserObject.getPublicUsername(user);
                    if (charSequence == null || user == null || publicUsername2 == null || !charSequence.toString().startsWith("@".concat(publicUsername2))) {
                        r52 = charSequence;
                        charSequence = null;
                        if (charSequence == null) {
                            String str9 = z11 ? this.w0 : yVar.c;
                            if (!TextUtils.isEmpty(str9)) {
                                String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : r72 != 0 ? r72.monoforum ? mg.d.i(r72, i17, false) : r72.title : null;
                                if (formatName != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(formatName, str9)) != -1) {
                                    r52 = new SpannableStringBuilder(formatName);
                                    r52.setSpan(new m10(org.telegram.ui.ActionBar.j6.q6, null), indexOfIgnoreCase, str9.length() + indexOfIgnoreCase, 33);
                                }
                                if (arrayList2 == null || arrayList2.size() <= 1) {
                                    charSequence2 = charSequence;
                                } else {
                                    String substring = str9.startsWith("@") ? str9.substring(1) : str9;
                                    int size6 = arrayList2.size();
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 < size6) {
                                            TLRPC.TL_username tL_username = arrayList2.get(i22);
                                            i22++;
                                            TLRPC.TL_username tL_username2 = tL_username;
                                            charSequence2 = charSequence;
                                            if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                                str4 = tL_username2.username;
                                            } else {
                                                charSequence = charSequence2;
                                            }
                                        } else {
                                            charSequence2 = charSequence;
                                            str4 = null;
                                        }
                                    }
                                    if (str4 == null) {
                                        int size7 = arrayList2.size();
                                        int i23 = 0;
                                        while (i23 < size7) {
                                            TLRPC.TL_username tL_username3 = arrayList2.get(i23);
                                            i23++;
                                            TLRPC.TL_username tL_username4 = tL_username3;
                                            String str10 = str4;
                                            if (tL_username4.active && tL_username4.username.contains(substring)) {
                                                str5 = tL_username4.username;
                                                if (str5 != null) {
                                                    str = str5;
                                                }
                                            } else {
                                                str4 = str10;
                                            }
                                        }
                                    }
                                    str5 = str4;
                                    if (str5 != null) {
                                    }
                                }
                                if (str != null && (user == null || O)) {
                                    if (str9.startsWith("@")) {
                                        str9 = str9.substring(1);
                                    }
                                    try {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                        spannableStringBuilder2.append((CharSequence) "@");
                                        spannableStringBuilder2.append((CharSequence) str);
                                        int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str, str9);
                                        if (indexOfIgnoreCase2 != -1) {
                                            int length = str9.length();
                                            if (indexOfIgnoreCase2 == 0) {
                                                length++;
                                            } else {
                                                indexOfIgnoreCase2++;
                                            }
                                            tL_sponsoredPeer = null;
                                            try {
                                                spannableStringBuilder2.setSpan(new m10(org.telegram.ui.ActionBar.j6.q6, null), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                            } catch (Exception e) {
                                                e = e;
                                                FileLog.e(e);
                                                charSequence2 = str;
                                                str2 = r52;
                                                j6Var.s(false, false);
                                                if (user == null) {
                                                }
                                                charSequence3 = charSequence2;
                                                z12 = false;
                                                str3 = str2;
                                                if (r72 == 0) {
                                                }
                                                if (user != null) {
                                                }
                                                ai.b bVar = new ai.b(this, 14);
                                                j6Var.B0 = z11;
                                                j6Var.C0 = bVar;
                                                j6Var.setOnSponsoredOptionsClick(new ai.c0(this, 20));
                                                j6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                                                j6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence3, true, z12);
                                                j6Var.s(this.U.a.I2.contains(Long.valueOf(j6Var.getDialogId())), dialogId != j6Var.getDialogId());
                                                return;
                                            }
                                        } else {
                                            tL_sponsoredPeer = null;
                                        }
                                        charSequence2 = spannableStringBuilder2;
                                        str2 = r52;
                                    } catch (Exception e7) {
                                        e = e7;
                                        tL_sponsoredPeer = null;
                                    }
                                    j6Var.s(false, false);
                                    if (user == null && user.id == this.l0 && this.h0 != 16) {
                                        charSequence3 = tL_sponsoredPeer;
                                        z12 = true;
                                        str3 = LocaleController.getString(R.string.SavedMessages);
                                    } else {
                                        charSequence3 = charSequence2;
                                        z12 = false;
                                        str3 = str2;
                                    }
                                    if (r72 == 0 && r72.participants_count != 0) {
                                        String formatPluralStringSpaced = (!ChatObject.isChannel(r72) || r72.megagroup) ? LocaleController.formatPluralStringSpaced("Members", r72.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", r72.participants_count);
                                        if (charSequence3 instanceof SpannableStringBuilder) {
                                            ((SpannableStringBuilder) charSequence3).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced);
                                        } else {
                                            charSequence3 = !TextUtils.isEmpty(charSequence3) ? TextUtils.concat(charSequence3, ", ", formatPluralStringSpaced) : formatPluralStringSpaced;
                                        }
                                    } else if (user != null && user.bot && (i11 = user.bot_active_users) != 0) {
                                        String formatPluralStringSpaced2 = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                                        if (charSequence3 instanceof SpannableStringBuilder) {
                                            charSequence3 = !TextUtils.isEmpty(charSequence3) ? TextUtils.concat(charSequence3, ", ", formatPluralStringSpaced2) : formatPluralStringSpaced2;
                                            ai.b bVar2 = new ai.b(this, 14);
                                            j6Var.B0 = z11;
                                            j6Var.C0 = bVar2;
                                            j6Var.setOnSponsoredOptionsClick(new ai.c0(this, 20));
                                            j6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                                            j6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence3, true, z12);
                                            j6Var.s(this.U.a.I2.contains(Long.valueOf(j6Var.getDialogId())), dialogId != j6Var.getDialogId());
                                        } else {
                                            ((SpannableStringBuilder) charSequence3).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced2);
                                        }
                                    }
                                    ai.b bVar22 = new ai.b(this, 14);
                                    j6Var.B0 = z11;
                                    j6Var.C0 = bVar22;
                                    j6Var.setOnSponsoredOptionsClick(new ai.c0(this, 20));
                                    j6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                                    j6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence3, true, z12);
                                    j6Var.s(this.U.a.I2.contains(Long.valueOf(j6Var.getDialogId())), dialogId != j6Var.getDialogId());
                                }
                                tL_sponsoredPeer = null;
                                str2 = r52;
                                j6Var.s(false, false);
                                if (user == null) {
                                }
                                charSequence3 = charSequence2;
                                z12 = false;
                                str3 = str2;
                                if (r72 == 0) {
                                }
                                if (user != null) {
                                    String formatPluralStringSpaced22 = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                                    if (charSequence3 instanceof SpannableStringBuilder) {
                                    }
                                }
                                ai.b bVar222 = new ai.b(this, 14);
                                j6Var.B0 = z11;
                                j6Var.C0 = bVar222;
                                j6Var.setOnSponsoredOptionsClick(new ai.c0(this, 20));
                                j6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                                j6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence3, true, z12);
                                j6Var.s(this.U.a.I2.contains(Long.valueOf(j6Var.getDialogId())), dialogId != j6Var.getDialogId());
                            }
                        }
                        charSequence2 = charSequence;
                        tL_sponsoredPeer = null;
                        str2 = r52;
                        j6Var.s(false, false);
                        if (user == null) {
                        }
                        charSequence3 = charSequence2;
                        z12 = false;
                        str3 = str2;
                        if (r72 == 0) {
                        }
                        if (user != null) {
                        }
                        ai.b bVar2222 = new ai.b(this, 14);
                        j6Var.B0 = z11;
                        j6Var.C0 = bVar2222;
                        j6Var.setOnSponsoredOptionsClick(new ai.c0(this, 20));
                        j6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                        j6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence3, true, z12);
                        j6Var.s(this.U.a.I2.contains(Long.valueOf(j6Var.getDialogId())), dialogId != j6Var.getDialogId());
                    }
                }
                r52 = 0;
                if (charSequence == null) {
                }
                charSequence2 = charSequence;
                tL_sponsoredPeer = null;
                str2 = r52;
                j6Var.s(false, false);
                if (user == null) {
                }
                charSequence3 = charSequence2;
                z12 = false;
                str3 = str2;
                if (r72 == 0) {
                }
                if (user != null) {
                }
                ai.b bVar22222 = new ai.b(this, 14);
                j6Var.B0 = z11;
                j6Var.C0 = bVar22222;
                j6Var.setOnSponsoredOptionsClick(new ai.c0(this, 20));
                j6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                j6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence3, true, z12);
                j6Var.s(this.U.a.I2.contains(Long.valueOf(j6Var.getDialogId())), dialogId != j6Var.getDialogId());
                break;
            case 1:
                final u3 u3Var = (u3) view;
                if (!arrayList4.isEmpty()) {
                    String string = LocaleController.getString(R.string.Hashtags);
                    String string2 = LocaleController.getString(R.string.ClearButton);
                    final int i24 = r15 ? 1 : 0;
                    u3Var.c(string, string2, new View.OnClickListener(this) { // from class: fg.o
                        public final /* synthetic */ h0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    iy iyVar = this.b.U;
                                    if (iyVar != null) {
                                        iyVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    gy gyVar = ((ao0) this.b).K0;
                                    xn0 xn0Var = gyVar.v0;
                                    ao0 ao0Var = gyVar.b0;
                                    String str11 = ao0Var.y;
                                    ArrayList arrayList14 = ao0Var.x;
                                    int i25 = ao0Var.w;
                                    int i26 = ao0Var.v;
                                    ArrayList arrayList15 = xn0Var.O;
                                    if (!TextUtils.equals(str11, xn0Var.Y)) {
                                        xn0Var.V();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        xn0Var.W = i26;
                                        xn0Var.V = i26 > arrayList14.size();
                                        xn0Var.Z = i25;
                                        xn0Var.Y = str11;
                                        xn0Var.N(true);
                                    }
                                    gyVar.q0 = true;
                                    gyVar.t0.h1(0, 0);
                                    gyVar.R();
                                    l81 l81Var = gyVar.M;
                                    if (l81Var != null && l81Var.getCurrentTabId() != 1) {
                                        gyVar.M.d(1, 1);
                                    }
                                    xn0Var.Y(gyVar.K0);
                                    break;
                                case 2:
                                    iy iyVar2 = this.b.U;
                                    if (iyVar2 != null) {
                                        iyVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    iy iyVar3 = this.b.U;
                                    if (iyVar3 != null) {
                                        iyVar3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i12 = i15;
                    } else if (i15 == 0) {
                        u3Var.c(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) { // from class: fg.o
                            public final /* synthetic */ h0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i18) {
                                    case 0:
                                        iy iyVar = this.b.U;
                                        if (iyVar != null) {
                                            iyVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        gy gyVar = ((ao0) this.b).K0;
                                        xn0 xn0Var = gyVar.v0;
                                        ao0 ao0Var = gyVar.b0;
                                        String str11 = ao0Var.y;
                                        ArrayList arrayList14 = ao0Var.x;
                                        int i25 = ao0Var.w;
                                        int i26 = ao0Var.v;
                                        ArrayList arrayList15 = xn0Var.O;
                                        if (!TextUtils.equals(str11, xn0Var.Y)) {
                                            xn0Var.V();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            xn0Var.W = i26;
                                            xn0Var.V = i26 > arrayList14.size();
                                            xn0Var.Z = i25;
                                            xn0Var.Y = str11;
                                            xn0Var.N(true);
                                        }
                                        gyVar.q0 = true;
                                        gyVar.t0.h1(0, 0);
                                        gyVar.R();
                                        l81 l81Var = gyVar.M;
                                        if (l81Var != null && l81Var.getCurrentTabId() != 1) {
                                            gyVar.M.d(1, 1);
                                        }
                                        xn0Var.Y(gyVar.K0);
                                        break;
                                    case 2:
                                        iy iyVar2 = this.b.U;
                                        if (iyVar2 != null) {
                                            iyVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        iy iyVar3 = this.b.U;
                                        if (iyVar3 != null) {
                                            iyVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i12 = com.google.android.gms.internal.vision.e2.e(1, i15, arrayList6);
                    }
                    ArrayList arrayList14 = yVar.e;
                    ArrayList arrayList15 = yVar.j;
                    boolean P = P();
                    ArrayList arrayList16 = this.E;
                    if (P || !arrayList7.isEmpty() || !arrayList16.isEmpty() || !arrayList6.isEmpty()) {
                        ?? M = M();
                        if (i12 >= M) {
                            if (i12 != M || !P()) {
                                if (i12 == K() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.s.isEmpty()) {
                                    u3Var.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                                    break;
                                } else {
                                    i12 -= K();
                                }
                            } else if (!this.N) {
                                final int i25 = 2;
                                u3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) { // from class: fg.o
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i25) {
                                            case 0:
                                                iy iyVar = this.b.U;
                                                if (iyVar != null) {
                                                    iyVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                gy gyVar = ((ao0) this.b).K0;
                                                xn0 xn0Var = gyVar.v0;
                                                ao0 ao0Var = gyVar.b0;
                                                String str11 = ao0Var.y;
                                                ArrayList arrayList142 = ao0Var.x;
                                                int i252 = ao0Var.w;
                                                int i26 = ao0Var.v;
                                                ArrayList arrayList152 = xn0Var.O;
                                                if (!TextUtils.equals(str11, xn0Var.Y)) {
                                                    xn0Var.V();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    xn0Var.W = i26;
                                                    xn0Var.V = i26 > arrayList142.size();
                                                    xn0Var.Z = i252;
                                                    xn0Var.Y = str11;
                                                    xn0Var.N(true);
                                                }
                                                gyVar.q0 = true;
                                                gyVar.t0.h1(0, 0);
                                                gyVar.R();
                                                l81 l81Var = gyVar.M;
                                                if (l81Var != null && l81Var.getCurrentTabId() != 1) {
                                                    gyVar.M.d(1, 1);
                                                }
                                                xn0Var.Y(gyVar.K0);
                                                break;
                                            case 2:
                                                iy iyVar2 = this.b.U;
                                                if (iyVar2 != null) {
                                                    iyVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                iy iyVar3 = this.b.U;
                                                if (iyVar3 != null) {
                                                    iyVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i26 = 3;
                                u3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) { // from class: fg.o
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i26) {
                                            case 0:
                                                iy iyVar = this.b.U;
                                                if (iyVar != null) {
                                                    iyVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                gy gyVar = ((ao0) this.b).K0;
                                                xn0 xn0Var = gyVar.v0;
                                                ao0 ao0Var = gyVar.b0;
                                                String str11 = ao0Var.y;
                                                ArrayList arrayList142 = ao0Var.x;
                                                int i252 = ao0Var.w;
                                                int i262 = ao0Var.v;
                                                ArrayList arrayList152 = xn0Var.O;
                                                if (!TextUtils.equals(str11, xn0Var.Y)) {
                                                    xn0Var.V();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    xn0Var.W = i262;
                                                    xn0Var.V = i262 > arrayList142.size();
                                                    xn0Var.Z = i252;
                                                    xn0Var.Y = str11;
                                                    xn0Var.N(true);
                                                }
                                                gyVar.q0 = true;
                                                gyVar.t0.h1(0, 0);
                                                gyVar.R();
                                                l81 l81Var = gyVar.M;
                                                if (l81Var != null && l81Var.getCurrentTabId() != 1) {
                                                    gyVar.M.d(1, 1);
                                                }
                                                xn0Var.Y(gyVar.K0);
                                                break;
                                            case 2:
                                                iy iyVar2 = this.b.U;
                                                if (iyVar2 != null) {
                                                    iyVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                iy iyVar3 = this.b.U;
                                                if (iyVar3 != null) {
                                                    iyVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            u3Var.setText(LocaleController.getString(R.string.ChatHints));
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
                    int i27 = size13;
                    if (this.c != e0.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i13 = 1;
                        str6 = null;
                    } else {
                        str6 = i12 == 0 ? LocaleController.getString(R.string.Topics) : null;
                        i13 = 1;
                        i12 = com.google.android.gms.internal.vision.e2.e(1, i12, arrayList7);
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i12 == 0) {
                            str6 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        i12 = com.google.android.gms.internal.vision.e2.e(i13, i12, arrayList16);
                    }
                    if (str6 == null) {
                        int i28 = i12 - (size8 + size9);
                        if (i28 < 0 || i28 >= size10) {
                            int i29 = i28 - size10;
                            if (i29 < 0 || i29 >= size12) {
                                if (this.U == null || i27 <= 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                    if (i29 - size12 <= 1) {
                                        TLRPC.Chat chat6 = MessagesController.getInstance(i17).getChat(Long.valueOf(-this.U.a()));
                                        int i30 = R.string.SearchMessagesIn;
                                        if (chat6 == null) {
                                            str7 = BuildConfig.BETA_URL;
                                            c10 = 0;
                                        } else if (chat6.monoforum) {
                                            c10 = 0;
                                            str7 = mg.d.i(chat6, i17, false);
                                        } else {
                                            c10 = 0;
                                            str7 = chat6.title;
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[c10] = str7;
                                        str6 = LocaleController.formatString(i30, objArr);
                                    }
                                }
                                this.F0 = i29;
                                SpannableStringBuilder H = H(this.c);
                                Runnable runnable2 = new Runnable(this) { // from class: fg.p
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                h0 h0Var = this.b;
                                                boolean z15 = h0Var.H0;
                                                h0Var.H0 = !z15;
                                                u3Var.setRightText(LocaleController.getString(!z15 ? R.string.ShowMore : R.string.ShowLess));
                                                h0Var.l();
                                                break;
                                            default:
                                                h0 h0Var2 = this.b;
                                                wy wyVar = h0Var2.r0;
                                                u3 u3Var2 = u3Var;
                                                w70 H2 = w70.H(wyVar, u3Var2);
                                                for (e0 e0Var : e0.values()) {
                                                    boolean z16 = e0Var.a == h0Var2.c.a;
                                                    H2.i(new bi.g2(h0Var2, z16, u3Var2, e0Var, 2), LocaleController.getString(e0Var.b), z16);
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
                                str6 = LocaleController.getString(R.string.GlobalSearch);
                                if (yVar.e.size() > 3) {
                                    z13 = this.G0;
                                    qVar = new di.q(this, arrayList14, i15, u3Var);
                                    runnable = qVar;
                                    spannableStringBuilder = null;
                                }
                            }
                        } else {
                            str6 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (arrayList15.size() > 3) {
                                boolean z15 = this.H0;
                                final int i31 = 0;
                                qVar = new Runnable(this) { // from class: fg.p
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i31) {
                                            case 0:
                                                h0 h0Var = this.b;
                                                boolean z152 = h0Var.H0;
                                                h0Var.H0 = !z152;
                                                u3Var.setRightText(LocaleController.getString(!z152 ? R.string.ShowMore : R.string.ShowLess));
                                                h0Var.l();
                                                break;
                                            default:
                                                h0 h0Var2 = this.b;
                                                wy wyVar = h0Var2.r0;
                                                u3 u3Var2 = u3Var;
                                                w70 H2 = w70.H(wyVar, u3Var2);
                                                for (e0 e0Var : e0.values()) {
                                                    boolean z16 = e0Var.a == h0Var2.c.a;
                                                    H2.i(new bi.g2(h0Var2, z16, u3Var2, e0Var, 2), LocaleController.getString(e0Var.b), z16);
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
                                z13 = z15;
                                runnable = qVar;
                                spannableStringBuilder = null;
                            }
                        }
                        if (runnable == null) {
                            if (spannableStringBuilder == null) {
                                u3Var.c(str6, LocaleController.getString(z13 ? R.string.ShowMore : R.string.ShowLess), new ai.v(2, runnable));
                                u3Var.setRightTextMargin(16);
                                break;
                            } else {
                                u3Var.c(str6, spannableStringBuilder, new ai.v(3, runnable));
                                u3Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            u3Var.setText(str6);
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
                r2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                r2Var.s2 = i15 != h() - 1;
                MessageObject messageObject = (MessageObject) J(i15);
                r2Var.O = arrayList3.contains(messageObject);
                if (messageObject != null) {
                    r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                    break;
                } else {
                    r2Var.W(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((ua) view).setTopic((TLRPC.TL_forumTopic) J(i15));
                break;
            case 5:
                l4 l4Var = (l4) view;
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                l4Var.setText((CharSequence) arrayList4.get(i15 - 1));
                l4Var.setNeedDivider(i15 != arrayList4.size());
                break;
            case 6:
                ((b0) ((vl0) view).getAdapter()).l();
                break;
            case 7:
                String str11 = (String) J(i15);
                s8 s8Var = (s8) view;
                s8Var.e(-1, org.telegram.ui.ActionBar.j6.o6);
                s8Var.i(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, gf.b.c().b("+" + str11)), false);
                break;
            case 8:
                j6 j6Var2 = (j6) view;
                ContactsController.Contact contact = (ContactsController.Contact) J(i15);
                j6Var2.t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), org.telegram.messenger.a2.j(new StringBuilder("+"), contact.shortPhones.get(0), gf.b.c()), false, false);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = this.h0;
        int i12 = 16;
        int i13 = 0;
        f6 f6Var = null;
        Context context = this.e;
        switch (i10) {
            case 0:
                j6 j6Var = new j6(context, null);
                j6Var.l0 = i11 == 3;
                view = j6Var;
                view2 = view;
                break;
            case 1:
                view2 = new u3(context, null);
                break;
            case 2:
            case 9:
                view2 = new z(i13, context, true ? 1 : 0);
                break;
            case 3:
                view2 = new ua(context);
                break;
            case 4:
                a10 a10Var = new a10(context, null);
                a10Var.setViewType(1);
                a10Var.setIsSingleCell(true);
                view2 = a10Var;
                break;
            case 5:
                l4 l4Var = new l4(context);
                l4Var.setGravity(16);
                l4Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                l4Var.setTextSize(1, 17.0f);
                l4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                view2 = l4Var;
                break;
            case 6:
                ic1 ic1Var = new ic1(context, true ? 1 : 0, f6Var);
                ic1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false));
                ic1Var.setTag(9);
                ic1Var.setItemAnimator(null);
                ic1Var.setLayoutAnimation(null);
                a0 a0Var = new a0(i13);
                a0Var.j1(0);
                ic1Var.setLayoutManager(a0Var);
                ic1Var.setAdapter(new b0(this.s0, this.e, null, false, i11 == 3));
                ic1Var.setOnItemClickListener(new ai.g(this, 8));
                ic1Var.setOnItemLongClickListener(new x(this));
                this.k0 = ic1Var;
                view = ic1Var;
                view2 = view;
                break;
            case 7:
            default:
                view2 = new s8(16, context, false);
                break;
            case 8:
                view2 = new j6(context, null);
                break;
            case 10:
                v vVar = new v(this, true ? 1 : 0);
                d0 d0Var = new d0(context);
                d0Var.setOrientation(1);
                w9 w9Var = new w9(context);
                w9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
                d0Var.addView(w9Var, a6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i14 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                textView.setTypeface(AndroidUtilities.bold());
                em.k(R.string.SearchMessagesFilterEmptyTitle, textView, 17);
                d0Var.addView(textView, a6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                d0Var.a = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView2.setGravity(17);
                d0Var.addView(textView2, a6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView3.setTextSize(1, 14.0f);
                textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i15 = org.telegram.ui.ActionBar.j6.Oh;
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(6, 6, 6, 6, 0, l1, l1));
                textView3.setOnClickListener(new ai.u(vVar, i12));
                d0Var.addView(textView3, a6.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = d0Var;
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.Z));
                view2 = d0Var;
                break;
        }
        if (i10 == 5) {
            view2.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            view2.setLayoutParams(new s4.p0(-1, -2));
        }
        return new fl0(view2);
    }
}
