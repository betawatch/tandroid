package hg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.e4;
import bi.k8;
import bi.v7;
import fi.j4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y71;
import org.telegram.ui.ec1;
import org.telegram.ui.ey;
import org.telegram.ui.gy;
import org.telegram.ui.o10;
import org.telegram.ui.uy;
import org.telegram.ui.xv;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class i0 extends kl0 {
    public o10 A0;
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
    public gy U;
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
    public v f;
    public int f0;
    public int g0;
    public v h;
    public final int h0;
    public final s4.j i0;
    public final z j0;
    public ec1 k0;
    public final long l0;
    public long n0;
    public View o0;
    public j4 p0;
    public ArrayList q0;
    public ah.p r;
    public final uy r0;
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

    public i0(Context context, uy uyVar, int i10, int i11, s4.j jVar, boolean z10) {
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
        this.r0 = uyVar;
        rn0 rn0Var = (rn0) this;
        z zVar = new z(rn0Var);
        this.j0 = zVar;
        zVar.a = new a4.m(rn0Var, 24);
        zVar.p = z10;
        this.e = context;
        this.V = i10;
        this.h0 = i11;
        this.l0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new n(i12, i11, new y(this), 0));
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

    @Override // org.telegram.ui.Components.kl0
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
        MessagesStorage.getInstance(this.s0).getStorageQueue().postRunnable(new j4(7, (rn0) this, sb2));
    }

    public final boolean F(Object obj) {
        if (this.h0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        uy uyVar = this.r0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? uyVar.A2 : uyVar.z2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return ChatObject.isChannel(chat) ? uyVar.y2 : ChatObject.isMegagroup(chat) ? uyVar.v2 || uyVar.w2 : uyVar.v2 || uyVar.x2;
    }

    public final void G(String str) {
        gy gyVar;
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
                gy gyVar2 = this.U;
                if ((gyVar2 == null || gyVar2.a() != ((h0) this.t0.get(i10)).c) && F(((h0) this.t0.get(i10)).a)) {
                    arrayList2.add((h0) this.t0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.t0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h0 h0Var = (h0) this.t0.get(i11);
            if (h0Var != null && h0Var.a != null && (((gyVar = this.U) == null || gyVar.a() != h0Var.c) && F(((h0) this.t0.get(i11)).a))) {
                TLObject tLObject = h0Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? og.d.i(chat, this.s0, false) : chat.title;
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
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
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
        spannableStringBuilder.setSpan(new nq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final ec1 I() {
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
            i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList);
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
                TLObject tLObject = ((h0) arrayList3.get(i12)).a;
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
            i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList5);
        }
        z zVar = this.j0;
        ArrayList arrayList6 = zVar.e;
        ArrayList arrayList7 = zVar.d;
        ArrayList arrayList8 = zVar.j;
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
                i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList);
            }
            if (P()) {
                ?? M = M();
                ArrayList arrayList2 = this.N ? this.v0 : this.u0;
                if (i10 <= M || (i10 - 1) - (M == true ? 1 : 0) >= arrayList2.size()) {
                    i10 -= K();
                }
            }
            z zVar = this.j0;
            ArrayList arrayList3 = zVar.e;
            ArrayList arrayList4 = zVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = zVar.j.size();
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
                    if (this.c != f0.d || this.d) {
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
            gy gyVar = this.U;
            if (gyVar == null || gyVar.a() == 0 || this.X) {
                W(this.g0, this.Z);
            } else {
                V(this.g0, this.Z);
            }
        }
    }

    public final void R(long j3, TLObject tLObject) {
        h0 h0Var = (h0) this.x0.f(j3);
        if (h0Var == null) {
            h0Var = new h0();
            this.x0.k(h0Var, j3);
        } else {
            this.t0.remove(h0Var);
        }
        this.t0.add(0, h0Var);
        h0Var.c = j3;
        h0Var.a = tLObject;
        h0Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.M;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.s0).getStorageQueue().postRunnable(new q((rn0) this, j3, 1));
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
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
        v vVar = this.h;
        if (vVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vVar);
            this.h = null;
        }
        ah.p pVar = this.r;
        if (pVar != null) {
            AndroidUtilities.cancelRunOnUIThread(pVar);
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
                this.S = ConnectionsManager.getInstance(this.s0).sendRequest(tL_contacts_getSponsoredPeers, new v7((rn0) this, 9));
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
                z zVar = this.j0;
                boolean z10 = i11 != 11;
                boolean z11 = i11 != 11;
                boolean z12 = i11 == 2 || i11 == 11;
                boolean z13 = i11 == 0;
                gy gyVar = this.U;
                zVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, gyVar != null ? gyVar.a() : 0L, null);
            }
            this.N = false;
            this.d0 = 0;
            this.D0 = 0;
            this.G0 = true;
            this.H0 = true;
            gy gyVar2 = this.U;
            if (gyVar2 != null) {
                gyVar2.d(false, true);
            }
            if (this.h0 != 15) {
                X(null);
                W(0, null);
                V(0, null);
            }
            l();
            this.y0.clear();
            this.z0 = false;
            o10 o10Var = this.A0;
            if (o10Var != null) {
                ((xv) o10Var).i(false, null, this.y0, false);
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
            z zVar2 = this.j0;
            if (zVar2.s) {
                this.I.clear();
                this.J.clear();
                ArrayList arrayList = this.j0.q;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    this.J.add(((z1) arrayList.get(i12)).a);
                }
                this.G0 = true;
                this.H0 = true;
                this.D0 = 0;
                l();
                gy gyVar3 = this.U;
                if (gyVar3 != null) {
                    gyVar3.d(false, false);
                }
            } else {
                MessagesStorage.getInstance(zVar2.m).getStorageQueue().postRunnable(new y1(zVar2, 1));
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
        gy gyVar4 = this.U;
        if (gyVar4 != null) {
            gyVar4.d(true, false);
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
                rn0 rn0Var = (rn0) this;
                v vVar2 = new v(rn0Var, trim, i13, str, 2);
                this.f = vVar2;
                dispatchQueue.postRunnable(vVar2, 300L);
                if (str2 == null) {
                    this.D0++;
                    ah.p pVar2 = new ah.p(rn0Var, i13, str2, 12);
                    this.r = pVar2;
                    AndroidUtilities.runOnUIThread(pVar2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        DispatchQueue dispatchQueue2 = Utilities.searchQueue;
        rn0 rn0Var2 = (rn0) this;
        v vVar22 = new v(rn0Var2, trim, i13, str, 2);
        this.f = vVar22;
        dispatchQueue2.postRunnable(vVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void V(int i10, String str) {
        gy gyVar = this.U;
        if (gyVar == null || gyVar.a() == 0 || this.V == 0) {
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
                    MessageObject messageObject = (MessageObject) i2.g.h(1, arrayList);
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
            gy gyVar = this.U;
            if (gyVar != null) {
                gyVar.d(i15 > 0, true);
                this.U.c();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        gy gyVar = this.U;
        if (gyVar == null || gyVar.a() == 0) {
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
        z zVar = this.j0;
        int size3 = zVar.d.size();
        int i10 = size + size2 + size3;
        int size4 = zVar.e.size();
        if (size4 > 3 && this.G0) {
            size4 = 3;
        }
        int size5 = this.K.size() + size4;
        int size6 = zVar.j.size();
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
                    i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList2);
                }
            }
            ArrayList arrayList3 = this.E;
            if (!arrayList3.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList3.size()) {
                        return 8;
                    }
                    i10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList3);
                }
            }
            z zVar = this.j0;
            ArrayList arrayList4 = zVar.e;
            int size = this.s.size();
            int size2 = zVar.d.size();
            if (size + size2 > 0 && (K() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            int size3 = zVar.j.size();
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

    /* JADX WARN: Code restructure failed: missing block: B:238:0x056f, code lost:
    
        if (r5 != false) goto L269;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0325  */
    /* JADX WARN: Type inference failed for: r10v39, types: [boolean] */
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
    /* JADX WARN: Type inference failed for: r7v39 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
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
        CharSequence charSequence;
        ?? r52;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str2;
        CharSequence charSequence5;
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
        String i15;
        int i16 = i10;
        int i17 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.J;
        ArrayList arrayList5 = this.K;
        ArrayList arrayList6 = this.x;
        ArrayList arrayList7 = this.F;
        z zVar = this.j0;
        int i18 = this.s0;
        final int i19 = 1;
        switch (i17) {
            case 0:
                h6 h6Var = (h6) view;
                h6Var.setBackgroundColor(j6.w0(null, j6.d6, false));
                long dialogId = h6Var.getDialogId();
                boolean O = O(i16);
                Object J = J(i16);
                boolean z14 = J instanceof TLRPC.TL_sponsoredPeer;
                if (z14) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
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
                            obj = J;
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
                            obj = J;
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
                            obj = J;
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
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    }
                } else if (J instanceof TLRPC.User) {
                    user = (TLRPC.User) J;
                    ArrayList<TLRPC.TL_username> arrayList10 = user.usernames;
                    obj = J;
                    arrayList = arrayList5;
                    encryptedChat = null;
                    str = DialogObject.getPublicUsername(user, this.b0);
                    arrayList2 = arrayList10;
                    r72 = 0;
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) J;
                    arrayList = arrayList5;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i18).getChat(Long.valueOf(chat4.id));
                    if (chat5 == null) {
                        chat5 = chat4;
                    }
                    ArrayList<TLRPC.TL_username> arrayList11 = chat5.usernames;
                    obj = J;
                    str = DialogObject.getPublicUsername(chat5, this.b0);
                    encryptedChat = null;
                    arrayList2 = arrayList11;
                    r72 = chat5;
                    user = null;
                } else {
                    arrayList = arrayList5;
                    if (J instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat3 = MessagesController.getInstance(i18).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) J).id));
                        obj = J;
                        encryptedChat = encryptedChat3;
                        user = MessagesController.getInstance(i18).getUser(Long.valueOf(encryptedChat3.user_id));
                    } else {
                        obj = J;
                        encryptedChat = null;
                        user = null;
                    }
                    r72 = 0;
                    arrayList2 = null;
                    str = null;
                }
                if (arrayList6.isEmpty()) {
                    encryptedChat2 = encryptedChat;
                } else {
                    encryptedChat2 = encryptedChat;
                    i16 = com.google.android.gms.internal.vision.e2.f(1, i16, arrayList6);
                }
                if (P()) {
                    if (i16 < K()) {
                        h6Var.M = i16 != K() + (-1);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i16 -= K();
                } else {
                    z10 = false;
                }
                if (arrayList7.isEmpty()) {
                    z11 = z14;
                } else {
                    z11 = z14;
                    i16 = com.google.android.gms.internal.vision.e2.f(1, i16, arrayList7);
                }
                ArrayList arrayList12 = zVar.e;
                ArrayList arrayList13 = zVar.j;
                int i20 = i16;
                int size = this.s.size();
                int size2 = zVar.d.size();
                int i21 = (size + size2 <= 0 || (K() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i20 : i20 - 1;
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
                if (!z10) {
                    h6Var.M = (i21 == (h() - K()) + (-1) || i21 == ((size + i22) + size2) + (-1) || i21 == (((size + size5) + size3) + size2) + (-1)) ? false : true;
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
                        String str8 = z10 ? this.w0 : zVar.c;
                        if (!TextUtils.isEmpty(str8)) {
                            String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : r72 != 0 ? r72.monoforum ? og.d.i(r72, i18, false) : r72.title : null;
                            if (formatName != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(formatName, str8)) != -1) {
                                r52 = new SpannableStringBuilder(formatName);
                                r52.setSpan(new e10(j6.q6, null), indexOfIgnoreCase, str8.length() + indexOfIgnoreCase, 33);
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
                            if (str != null && (user == null || O)) {
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
                                            spannableStringBuilder2.setSpan(new e10(j6.q6, null), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                        } catch (Exception e7) {
                                            e = e7;
                                            FileLog.e(e);
                                            charSequence3 = str;
                                            str2 = r52;
                                            h6Var.s(false, false);
                                            if (user == null) {
                                            }
                                            charSequence5 = charSequence3;
                                            z12 = false;
                                            str3 = str2;
                                            if (r72 == 0) {
                                            }
                                            if (user != null) {
                                            }
                                            bi.o1 o1Var = new bi.o1(this, 18);
                                            h6Var.B0 = z10;
                                            h6Var.C0 = o1Var;
                                            h6Var.setOnSponsoredOptionsClick(new ci.u(this, 20));
                                            h6Var.setAd(!z11 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                            h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                                            h6Var.s(this.U.a.I2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
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
                                h6Var.s(false, false);
                                if (user == null && user.id == this.l0 && this.h0 != 16) {
                                    charSequence5 = charSequence4;
                                    z12 = true;
                                    str3 = LocaleController.getString(R.string.SavedMessages);
                                } else {
                                    charSequence5 = charSequence3;
                                    z12 = false;
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
                                        charSequence5 = !TextUtils.isEmpty(charSequence5) ? TextUtils.concat(charSequence5, ", ", formatPluralStringSpaced2) : formatPluralStringSpaced2;
                                        bi.o1 o1Var2 = new bi.o1(this, 18);
                                        h6Var.B0 = z10;
                                        h6Var.C0 = o1Var2;
                                        h6Var.setOnSponsoredOptionsClick(new ci.u(this, 20));
                                        h6Var.setAd(!z11 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                        h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                                        h6Var.s(this.U.a.I2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                                    } else {
                                        ((SpannableStringBuilder) charSequence5).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced2);
                                    }
                                }
                                bi.o1 o1Var22 = new bi.o1(this, 18);
                                h6Var.B0 = z10;
                                h6Var.C0 = o1Var22;
                                h6Var.setOnSponsoredOptionsClick(new ci.u(this, 20));
                                h6Var.setAd(!z11 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                                h6Var.s(this.U.a.I2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                            }
                            charSequence4 = null;
                            str2 = r52;
                            h6Var.s(false, false);
                            if (user == null) {
                            }
                            charSequence5 = charSequence3;
                            z12 = false;
                            str3 = str2;
                            if (r72 == 0) {
                            }
                            if (user != null) {
                                String formatPluralStringSpaced22 = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                                if (charSequence5 instanceof SpannableStringBuilder) {
                                }
                            }
                            bi.o1 o1Var222 = new bi.o1(this, 18);
                            h6Var.B0 = z10;
                            h6Var.C0 = o1Var222;
                            h6Var.setOnSponsoredOptionsClick(new ci.u(this, 20));
                            h6Var.setAd(!z11 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                            h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                            h6Var.s(this.U.a.I2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                        }
                    }
                    charSequence3 = charSequence2;
                    charSequence4 = null;
                    str2 = r52;
                    h6Var.s(false, false);
                    if (user == null) {
                    }
                    charSequence5 = charSequence3;
                    z12 = false;
                    str3 = str2;
                    if (r72 == 0) {
                    }
                    if (user != null) {
                    }
                    bi.o1 o1Var2222 = new bi.o1(this, 18);
                    h6Var.B0 = z10;
                    h6Var.C0 = o1Var2222;
                    h6Var.setOnSponsoredOptionsClick(new ci.u(this, 20));
                    h6Var.setAd(!z11 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                    h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                    h6Var.s(this.U.a.I2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                }
                r52 = 0;
                charSequence2 = charSequence;
                if (charSequence2 == null) {
                }
                charSequence3 = charSequence2;
                charSequence4 = null;
                str2 = r52;
                h6Var.s(false, false);
                if (user == null) {
                }
                charSequence5 = charSequence3;
                z12 = false;
                str3 = str2;
                if (r72 == 0) {
                }
                if (user != null) {
                }
                bi.o1 o1Var22222 = new bi.o1(this, 18);
                h6Var.B0 = z10;
                h6Var.C0 = o1Var22222;
                h6Var.setOnSponsoredOptionsClick(new ci.u(this, 20));
                h6Var.setAd(!z11 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z12);
                h6Var.s(this.U.a.I2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                break;
            case 1:
                final u3 u3Var = (u3) view;
                if (!arrayList4.isEmpty()) {
                    String string = LocaleController.getString(R.string.Hashtags);
                    String string2 = LocaleController.getString(R.string.ClearButton);
                    final int i25 = r15 ? 1 : 0;
                    u3Var.c(string, string2, new View.OnClickListener(this) { // from class: hg.o
                        public final /* synthetic */ i0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i25) {
                                case 0:
                                    gy gyVar = this.b.U;
                                    if (gyVar != null) {
                                        gyVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    ey eyVar = ((rn0) this.b).K0;
                                    pn0 pn0Var = eyVar.v0;
                                    rn0 rn0Var = eyVar.b0;
                                    String str10 = rn0Var.y;
                                    ArrayList arrayList14 = rn0Var.x;
                                    int i26 = rn0Var.w;
                                    int i27 = rn0Var.v;
                                    ArrayList arrayList15 = pn0Var.O;
                                    if (!TextUtils.equals(str10, pn0Var.Y)) {
                                        pn0Var.V();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        pn0Var.W = i27;
                                        pn0Var.V = i27 > arrayList14.size();
                                        pn0Var.Z = i26;
                                        pn0Var.Y = str10;
                                        pn0Var.N(true);
                                    }
                                    eyVar.q0 = true;
                                    eyVar.t0.h1(0, 0);
                                    eyVar.R();
                                    y71 y71Var = eyVar.M;
                                    if (y71Var != null && y71Var.getCurrentTabId() != 1) {
                                        eyVar.M.d(1, 1);
                                    }
                                    pn0Var.Y(eyVar.K0);
                                    break;
                                case 2:
                                    gy gyVar2 = this.b.U;
                                    if (gyVar2 != null) {
                                        gyVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    gy gyVar3 = this.b.U;
                                    if (gyVar3 != null) {
                                        gyVar3.b();
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
                        u3Var.c(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) { // from class: hg.o
                            public final /* synthetic */ i0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i19) {
                                    case 0:
                                        gy gyVar = this.b.U;
                                        if (gyVar != null) {
                                            gyVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ey eyVar = ((rn0) this.b).K0;
                                        pn0 pn0Var = eyVar.v0;
                                        rn0 rn0Var = eyVar.b0;
                                        String str10 = rn0Var.y;
                                        ArrayList arrayList14 = rn0Var.x;
                                        int i26 = rn0Var.w;
                                        int i27 = rn0Var.v;
                                        ArrayList arrayList15 = pn0Var.O;
                                        if (!TextUtils.equals(str10, pn0Var.Y)) {
                                            pn0Var.V();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            pn0Var.W = i27;
                                            pn0Var.V = i27 > arrayList14.size();
                                            pn0Var.Z = i26;
                                            pn0Var.Y = str10;
                                            pn0Var.N(true);
                                        }
                                        eyVar.q0 = true;
                                        eyVar.t0.h1(0, 0);
                                        eyVar.R();
                                        y71 y71Var = eyVar.M;
                                        if (y71Var != null && y71Var.getCurrentTabId() != 1) {
                                            eyVar.M.d(1, 1);
                                        }
                                        pn0Var.Y(eyVar.K0);
                                        break;
                                    case 2:
                                        gy gyVar2 = this.b.U;
                                        if (gyVar2 != null) {
                                            gyVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        gy gyVar3 = this.b.U;
                                        if (gyVar3 != null) {
                                            gyVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i12 = com.google.android.gms.internal.vision.e2.f(1, i16, arrayList6);
                    }
                    ArrayList arrayList14 = zVar.e;
                    ArrayList arrayList15 = zVar.j;
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
                                final int i26 = 2;
                                u3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) { // from class: hg.o
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i26) {
                                            case 0:
                                                gy gyVar = this.b.U;
                                                if (gyVar != null) {
                                                    gyVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                ey eyVar = ((rn0) this.b).K0;
                                                pn0 pn0Var = eyVar.v0;
                                                rn0 rn0Var = eyVar.b0;
                                                String str10 = rn0Var.y;
                                                ArrayList arrayList142 = rn0Var.x;
                                                int i262 = rn0Var.w;
                                                int i27 = rn0Var.v;
                                                ArrayList arrayList152 = pn0Var.O;
                                                if (!TextUtils.equals(str10, pn0Var.Y)) {
                                                    pn0Var.V();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    pn0Var.W = i27;
                                                    pn0Var.V = i27 > arrayList142.size();
                                                    pn0Var.Z = i262;
                                                    pn0Var.Y = str10;
                                                    pn0Var.N(true);
                                                }
                                                eyVar.q0 = true;
                                                eyVar.t0.h1(0, 0);
                                                eyVar.R();
                                                y71 y71Var = eyVar.M;
                                                if (y71Var != null && y71Var.getCurrentTabId() != 1) {
                                                    eyVar.M.d(1, 1);
                                                }
                                                pn0Var.Y(eyVar.K0);
                                                break;
                                            case 2:
                                                gy gyVar2 = this.b.U;
                                                if (gyVar2 != null) {
                                                    gyVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                gy gyVar3 = this.b.U;
                                                if (gyVar3 != null) {
                                                    gyVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i27 = 3;
                                u3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) { // from class: hg.o
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i27) {
                                            case 0:
                                                gy gyVar = this.b.U;
                                                if (gyVar != null) {
                                                    gyVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                ey eyVar = ((rn0) this.b).K0;
                                                pn0 pn0Var = eyVar.v0;
                                                rn0 rn0Var = eyVar.b0;
                                                String str10 = rn0Var.y;
                                                ArrayList arrayList142 = rn0Var.x;
                                                int i262 = rn0Var.w;
                                                int i272 = rn0Var.v;
                                                ArrayList arrayList152 = pn0Var.O;
                                                if (!TextUtils.equals(str10, pn0Var.Y)) {
                                                    pn0Var.V();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    pn0Var.W = i272;
                                                    pn0Var.V = i272 > arrayList142.size();
                                                    pn0Var.Z = i262;
                                                    pn0Var.Y = str10;
                                                    pn0Var.N(true);
                                                }
                                                eyVar.q0 = true;
                                                eyVar.t0.h1(0, 0);
                                                eyVar.R();
                                                y71 y71Var = eyVar.M;
                                                if (y71Var != null && y71Var.getCurrentTabId() != 1) {
                                                    eyVar.M.d(1, 1);
                                                }
                                                pn0Var.Y(eyVar.K0);
                                                break;
                                            case 2:
                                                gy gyVar2 = this.b.U;
                                                if (gyVar2 != null) {
                                                    gyVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                gy gyVar3 = this.b.U;
                                                if (gyVar3 != null) {
                                                    gyVar3.b();
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
                    int size9 = zVar.d.size();
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
                    if (this.c != f0.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i13 = 1;
                        str6 = null;
                    } else {
                        str6 = i12 == 0 ? LocaleController.getString(R.string.Topics) : null;
                        i13 = 1;
                        i12 = com.google.android.gms.internal.vision.e2.f(1, i12, arrayList7);
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i12 == 0) {
                            str6 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        i12 = com.google.android.gms.internal.vision.e2.f(i13, i12, arrayList16);
                    }
                    if (str6 == null) {
                        int i28 = i12 - (size8 + size9);
                        if (i28 < 0 || i28 >= size10) {
                            int i29 = i28 - size10;
                            if (i29 < 0 || i29 >= size12) {
                                if (this.U == null || size13 <= 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                    if (i29 - size12 <= 1) {
                                        TLRPC.Chat chat6 = MessagesController.getInstance(i18).getChat(Long.valueOf(-this.U.a()));
                                        int i30 = R.string.SearchMessagesIn;
                                        if (chat6 == null) {
                                            i15 = "null";
                                            c10 = 0;
                                        } else {
                                            c10 = 0;
                                            i15 = chat6.monoforum ? og.d.i(chat6, i18, false) : chat6.title;
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[c10] = i15;
                                        str6 = LocaleController.formatString(i30, objArr);
                                    }
                                }
                                this.F0 = i29;
                                SpannableStringBuilder H = H(this.c);
                                Runnable runnable2 = new Runnable(this) { // from class: hg.p
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                i0 i0Var = this.b;
                                                boolean z15 = i0Var.H0;
                                                i0Var.H0 = !z15;
                                                u3Var.setRightText(LocaleController.getString(!z15 ? R.string.ShowMore : R.string.ShowLess));
                                                i0Var.l();
                                                break;
                                            default:
                                                i0 i0Var2 = this.b;
                                                uy uyVar = i0Var2.r0;
                                                u3 u3Var2 = u3Var;
                                                n70 H2 = n70.H(uyVar, u3Var2);
                                                for (f0 f0Var : f0.values()) {
                                                    boolean z16 = f0Var.a == i0Var2.c.a;
                                                    H2.i(new e4(i0Var2, z16, u3Var2, f0Var, 3), LocaleController.getString(f0Var.b), z16);
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
                                if (zVar.e.size() > 3) {
                                    z13 = this.G0;
                                    runnable = new k8(this, arrayList14, i10, u3Var, 3);
                                    str6 = string3;
                                    spannableStringBuilder = null;
                                } else {
                                    str6 = string3;
                                }
                            }
                        } else {
                            str6 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (arrayList15.size() > 3) {
                                final int i31 = 0;
                                z13 = this.H0;
                                runnable = new Runnable(this) { // from class: hg.p
                                    public final /* synthetic */ i0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i31) {
                                            case 0:
                                                i0 i0Var = this.b;
                                                boolean z15 = i0Var.H0;
                                                i0Var.H0 = !z15;
                                                u3Var.setRightText(LocaleController.getString(!z15 ? R.string.ShowMore : R.string.ShowLess));
                                                i0Var.l();
                                                break;
                                            default:
                                                i0 i0Var2 = this.b;
                                                uy uyVar = i0Var2.r0;
                                                u3 u3Var2 = u3Var;
                                                n70 H2 = n70.H(uyVar, u3Var2);
                                                for (f0 f0Var : f0.values()) {
                                                    boolean z16 = f0Var.a == i0Var2.c.a;
                                                    H2.i(new e4(i0Var2, z16, u3Var2, f0Var, 3), LocaleController.getString(f0Var.b), z16);
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
                                u3Var.c(str6, LocaleController.getString(z13 ? R.string.ShowMore : R.string.ShowLess), new ci.o(2, runnable));
                                u3Var.setRightTextMargin(16);
                                break;
                            } else {
                                u3Var.c(str6, spannableStringBuilder, new ci.o(3, runnable));
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
                r2Var.setBackgroundColor(j6.w0(null, j6.d6, false));
                r2Var.s2 = i16 != h() - 1;
                MessageObject messageObject = (MessageObject) J(i16);
                r2Var.O = arrayList3.contains(messageObject);
                if (messageObject != null) {
                    r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                    break;
                } else {
                    r2Var.W(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((sa) view).setTopic((TLRPC.TL_forumTopic) J(i16));
                break;
            case 5:
                k4 k4Var = (k4) view;
                k4Var.setBackgroundColor(j6.w0(null, j6.d6, false));
                k4Var.setText((CharSequence) arrayList4.get(i16 - 1));
                k4Var.setNeedDivider(i16 != arrayList4.size());
                break;
            case 6:
                ((c0) ((ll0) view).getAdapter()).l();
                break;
            case 7:
                String str10 = (String) J(i16);
                r8 r8Var = (r8) view;
                r8Var.e(-1, j6.o6);
                r8Var.i(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, gf.b.c().b("+" + str10)), false);
                break;
            case 8:
                h6 h6Var2 = (h6) view;
                ContactsController.Contact contact = (ContactsController.Contact) J(i16);
                h6Var2.t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), org.telegram.messenger.w1.j(new StringBuilder("+"), contact.shortPhones.get(0), gf.b.c()), false, false);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = this.h0;
        int i12 = 0;
        f6 f6Var = null;
        Context context = this.e;
        switch (i10) {
            case 0:
                h6 h6Var = new h6(context, null);
                h6Var.l0 = i11 == 3;
                view = h6Var;
                view2 = view;
                break;
            case 1:
                view2 = new u3(context, null);
                break;
            case 2:
            case 9:
                view2 = new a0(i12, context, true ? 1 : 0);
                break;
            case 3:
                view2 = new sa(context);
                break;
            case 4:
                t00 t00Var = new t00(context, null);
                t00Var.setViewType(1);
                t00Var.setIsSingleCell(true);
                view2 = t00Var;
                break;
            case 5:
                k4 k4Var = new k4(context);
                k4Var.setGravity(16);
                k4Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                k4Var.setTextSize(1, 17.0f);
                k4Var.setTextColor(j6.w0(null, j6.G6, false));
                view2 = k4Var;
                break;
            case 6:
                ec1 ec1Var = new ec1(context, 2, f6Var);
                ec1Var.setSelectorDrawableColor(j6.w0(null, j6.i6, false));
                int i13 = 9;
                ec1Var.setTag(9);
                ec1Var.setItemAnimator(null);
                ec1Var.setLayoutAnimation(null);
                b0 b0Var = new b0(i12);
                b0Var.j1(0);
                ec1Var.setLayoutManager(b0Var);
                ec1Var.setAdapter(new c0(this.s0, this.e, null, false, i11 == 3));
                ec1Var.setOnItemClickListener(new bi.d(this, i13));
                ec1Var.setOnItemLongClickListener(new y(this));
                this.k0 = ec1Var;
                view = ec1Var;
                view2 = view;
                break;
            case 7:
            default:
                view2 = new r8(16, context, false);
                break;
            case 8:
                view2 = new h6(context, null);
                break;
            case 10:
                w wVar = new w(this, true ? 1 : 0);
                e0 e0Var = new e0(context);
                e0Var.setOrientation(1);
                x9 x9Var = new x9(context);
                x9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
                e0Var.addView(x9Var, x5.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i14 = j6.G6;
                textView.setTextColor(j6.w0(null, i14, false));
                textView.setTypeface(AndroidUtilities.bold());
                vl.k(R.string.SearchMessagesFilterEmptyTitle, textView, 17);
                e0Var.addView(textView, x5.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                e0Var.a = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(j6.w0(null, i14, false));
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView2.setGravity(17);
                e0Var.addView(textView2, x5.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView3.setTextSize(1, 14.0f);
                textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i15 = j6.Oh;
                textView3.setTextColor(j6.w0(null, i15, false));
                int l1 = j6.l1(0.15f, j6.w0(null, i15, false));
                textView3.setBackground(j6.i0(6, 6, 6, 6, 0, l1, l1));
                textView3.setOnClickListener(new ah.h0(wVar, 22));
                e0Var.addView(textView3, x5.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = e0Var;
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.Z));
                view2 = e0Var;
                break;
        }
        if (i10 == 5) {
            view2.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            view2.setLayoutParams(new s4.p0(-1, -2));
        }
        return new vk0(view2);
    }
}
