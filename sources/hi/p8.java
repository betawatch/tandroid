package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class p8 extends org.telegram.ui.ActionBar.w2 implements gs {
    public static final /* synthetic */ int Y1 = 0;
    public boolean A1;
    public boolean B1;
    public int C1;
    public int D1;
    public final ArrayList E1;
    public boolean F1;
    public boolean G1;
    public int H1;
    public int I1;
    public boolean J1;
    public HashMap K1;
    public int L1;
    public final Paint M1;
    public ArrayList N1;
    public v7 O1;
    public y10 P1;
    public b8 Q1;
    public y10 R1;
    public s8 S1;
    public final boolean T1;
    public boolean U1;
    public boolean V1;
    public BitmapDrawable W1;
    public r8 X1;
    public i1 m1;
    public TLRPC.InputPeer n1;
    public final ArrayList o1;
    public final HashMap p1;
    public int q1;
    public final ArrayList r1;
    public final ArrayList s1;
    public final HashMap t1;
    public int u1;
    public final HashSet v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    public p8(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        boolean z10;
        char c10;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        this.o1 = arrayList;
        HashMap hashMap = new HashMap();
        this.p1 = hashMap;
        char c11 = 0;
        this.q1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.r1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.s1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.t1 = hashMap2;
        this.u1 = 0;
        this.v1 = new HashSet();
        this.w1 = true;
        this.x1 = true;
        this.y1 = false;
        this.z1 = true;
        this.A1 = true;
        this.B1 = false;
        this.C1 = 0;
        this.D1 = 1;
        this.E1 = new ArrayList();
        this.H1 = 1;
        this.I1 = 4;
        this.K1 = new HashMap();
        this.L1 = 86400;
        this.M1 = new Paint(1);
        this.T1 = true;
        this.U1 = false;
        this.L1 = i7;
        String string = np.u1(this.a).h7.getString("story_prv_contacts", null);
        if (string != null) {
            String[] split = string.split(",");
            arrayList3.clear();
            for (String str : split) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = np.u1(this.a).h7.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i10 = 0;
            while (i10 < split2.length) {
                String[] split3 = split2[i10].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c11]);
                        z10 = z11;
                        ArrayList arrayList4 = new ArrayList();
                        c10 = c11;
                        for (?? r52 = z10; r52 < split3.length; r52++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[r52])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i10++;
                    c11 = c10;
                    z11 = z10;
                }
                z10 = z11;
                c10 = c11;
                i10++;
                c11 = c10;
                z11 = z10;
            }
        }
        boolean z12 = z11;
        ?? r23 = c11;
        String string3 = np.u1(this.a).h7.getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (int i11 = r23 == true ? 1 : 0; i11 < split4.length; i11++) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(split4[i11])));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = np.u1(this.a).h7.getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i12 = r23 == true ? 1 : 0; i12 < split5.length; i12++) {
                String[] split6 = split5[i12].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (?? r14 = z12; r14 < split6.length; r14++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[r14])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = np.u1(this.a).h7.getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (int i13 = r23 == true ? 1 : 0; i13 < split7.length; i13++) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(split7[i13])));
                } catch (Exception unused5) {
                }
            }
        }
        this.u1 = S0(arrayList3, hashMap2).size();
        this.q1 = S0(arrayList, hashMap).size();
        this.x1 = !np.u1(this.a).h7.getBoolean("story_noforwards", r23);
        this.y1 = np.u1(this.a).h7.getBoolean("story_keep", z12);
        Q0(context);
        this.m1.setAdapter(new o7(this, context, 0));
        ur a02 = ur.a0(this.a);
        a02.a.c(new c(17, this, a02));
        np.u1(this.a).R1().S();
        np.u1(this.a).R1().U();
    }

    public static ArrayList K0(p8 p8Var) {
        ArrayList P0 = p8Var.P0();
        int i7 = 0;
        while (i7 < P0.size()) {
            TLObject tLObject = (TLObject) P0.get(i7);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                P0.remove(i7);
                i7--;
            }
            i7++;
        }
        return P0;
    }

    public static int L0(p8 p8Var, TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = np.u1(p8Var.a).P0(chat.id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = p8Var.K1;
        return (hashMap == null || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public static HashSet S0(ArrayList arrayList, HashMap hashMap) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                hashSet.addAll((ArrayList) it.next());
            }
        }
        return hashSet;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        View currentView = this.m1.getCurrentView();
        if (currentView instanceof k8) {
            return ((k8) currentView).T;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        ls.f(this.a).n(this, ls.O);
        ls.f(this.a).n(this, ls.c3);
        ls.f(this.a).n(this, ls.e3);
        super.L();
    }

    public final void M0(boolean z10) {
        this.z1 = z10;
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof k8) {
                    ((k8) view).f(false);
                }
            }
        }
    }

    public final void N0() {
        d8 d8Var;
        for (View view : this.m1.getViewPages()) {
            if ((view instanceof k8) && (d8Var = ((k8) view).y) != null) {
                org.telegram.messenger.g0.v1(d8Var.b);
            }
        }
    }

    public final void O0(n8 n8Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.N1 != null) {
            np u12 = np.u1(this.a);
            for (int i7 = 0; i7 < this.N1.size(); i7++) {
                String str = (String) this.N1.get(i7);
                TLObject h22 = u12.h2(str);
                if (h22 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) h22;
                    TLRPC.User c22 = u12.c2(Long.valueOf(user.id));
                    if (c22 != null) {
                        user = c22;
                    }
                    if (!user.bot && !n8Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.isEmpty() || z10) {
            View view = this.m1.getViewPages()[0];
            e eVar = view instanceof k8 ? ((k8) view).w : null;
            if (eVar != null) {
                eVar.setLoading(true);
            }
            v7 v7Var = this.O1;
            if (v7Var != null) {
                v7Var.g(n8Var, this.w1, this.x1, this.y1, this.B1, this.n1, this.C1, new c(19, eVar, runnable), new l(eVar, 15));
                return;
            } else {
                runnable.run();
                return;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < Math.min(2, arrayList.size()); i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i10)));
            spannableString.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String N0 = hd.N0(2131744246, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.K2(hd.N0(2131744245, null), spannableStringBuilder, "%s");
        alertDialog$Builder.k(hd.N0(2131746549, null), new a3.h(this, n8Var, runnable, 11));
        i5.c.y(null, 2131752577, alertDialog$Builder, null);
    }

    public final ArrayList P0() {
        TLRPC.User c22;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = org.telegram.messenger.i5.r(this.a).f0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            org.telegram.messenger.i5.r(this.a).A(0L, false);
        }
        np u12 = np.u1(this.a);
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i7);
                if (tL_contact != null && (c22 = u12.c2(Long.valueOf(tL_contact.user_id))) != null && !p10.C(c22) && !c22.bot && c22.id != 777000) {
                    arrayList.add(c22);
                }
            }
        }
        return arrayList;
    }

    public final void Q0(Context context) {
        gc.a(this.c, new bi.t(1));
        ls.f(this.a).c(this, ls.O);
        ls.f(this.a).c(this, ls.c3);
        ls.f(this.a).c(this, ls.e3);
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        this.M1.setColor(org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
        Q(i7);
        this.b = new u7(this, context);
        i1 i1Var = new i1(1, context, this);
        this.m1 = i1Var;
        int i10 = this.u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.b.addView(this.m1, c8.ma.e(-1, -1, ls.E1));
    }

    public final void R0(boolean z10) {
        this.U1 = z10;
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof k8) {
                    k8 k8Var = (k8) view;
                    k8Var.h(false);
                    k8Var.f(false);
                }
            }
        }
    }

    public final void T0(int i7) {
        this.D1 = i7;
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof k8) {
                    ((k8) view).f(false);
                }
            }
        }
    }

    public final void U0(Bitmap bitmap) {
        this.W1 = bitmap == null ? null : new BitmapDrawable(bitmap);
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof k8) {
                    k8 k8Var = (k8) view;
                    k8Var.h(false);
                    k8Var.f(false);
                }
            }
        }
    }

    public final void V0() {
        this.F1 = true;
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof k8) {
            k8 k8Var = (k8) view;
            k8Var.b(k8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof k8) {
            k8 k8Var2 = (k8) view2;
            k8Var2.b(k8Var2.a);
        }
    }

    public final void W0(TLRPC.InputPeer inputPeer) {
        this.n1 = inputPeer;
        this.v1.clear();
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof k8) {
            k8 k8Var = (k8) view;
            k8Var.b(k8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof k8) {
            k8 k8Var2 = (k8) view2;
            k8Var2.b(k8Var2.a);
        }
    }

    public final void X0(n8 n8Var) {
        if (n8Var == null) {
            return;
        }
        HashMap hashMap = n8Var.d;
        int i7 = n8Var.a;
        ArrayList arrayList = n8Var.c;
        this.I1 = i7;
        if (i7 == 2) {
            ArrayList arrayList2 = this.r1;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        } else if (i7 == 3) {
            ArrayList arrayList3 = this.s1;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            HashMap hashMap2 = this.t1;
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            this.u1 = S0(arrayList3, hashMap2).size();
        } else if (i7 == 4) {
            ArrayList arrayList4 = this.o1;
            arrayList4.clear();
            arrayList4.addAll(arrayList);
            HashMap hashMap3 = this.p1;
            hashMap3.clear();
            hashMap3.putAll(hashMap);
            this.q1 = S0(arrayList4, hashMap3).size();
        }
        if (i7 == 5) {
            this.J1 = true;
            this.H1 = 5;
            ArrayList arrayList5 = this.E1;
            arrayList5.clear();
            arrayList5.addAll(n8Var.f);
            this.m1.setPosition(1);
        }
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof k8) {
            k8 k8Var = (k8) view;
            k8Var.b(k8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof k8) {
            k8 k8Var2 = (k8) view2;
            k8Var2.b(k8Var2.a);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        i1 i1Var = this.m1;
        if (i1Var == null) {
            return;
        }
        int i11 = 0;
        if (i7 == ls.O) {
            View[] viewPages = i1Var.getViewPages();
            View view = viewPages[0];
            if (view instanceof k8) {
                ((k8) view).h(true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof k8) {
                ((k8) view2).h(true);
                return;
            }
            return;
        }
        if (i7 != ls.c3) {
            if (i7 == ls.e3) {
                View[] viewPages2 = i1Var.getViewPages();
                while (i11 < viewPages2.length) {
                    View view3 = viewPages2[i11];
                    if (view3 instanceof k8) {
                        k8 k8Var = (k8) view3;
                        if (k8Var.a == 0) {
                            k8Var.h(true);
                        }
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        View[] viewPages3 = i1Var.getViewPages();
        while (i11 < viewPages3.length) {
            View view4 = viewPages3[i11];
            if (view4 instanceof k8) {
                k8 k8Var2 = (k8) view4;
                int i12 = k8Var2.a;
                if (i12 == 6) {
                    k8Var2.a(true);
                } else if (i12 == 0) {
                    k8Var2.h(true);
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        n8 n8Var;
        y10 y10Var = this.P1;
        ArrayList arrayList = this.r1;
        HashMap hashMap = this.p1;
        ArrayList arrayList2 = this.o1;
        HashMap hashMap2 = this.t1;
        ArrayList arrayList3 = this.s1;
        if (y10Var != null) {
            int i7 = this.I1;
            if (i7 == 3) {
                n8Var = new n8(this.I1, this.a, new ArrayList(S0(arrayList3, hashMap2)));
                ArrayList arrayList4 = n8Var.c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = n8Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i7 == 4) {
                n8Var = new n8(this.I1, this.a, new ArrayList(S0(arrayList2, hashMap)));
                ArrayList arrayList5 = n8Var.c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = n8Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else {
                n8Var = i7 == 2 ? new n8(i7, this.a, arrayList) : new n8(i7, this.a, (ArrayList) null);
            }
            this.P1.a(n8Var);
            this.P1 = null;
        }
        gc.h(this.c);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb3.length() > 0) {
                sb3.append(";");
            }
            sb3.append(entry2.getKey());
            sb3.append(",");
            sb3.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        np.u1(this.a).h7.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.x1).putBoolean("story_keep", this.y1).apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (this.m1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        N0();
        this.m1.A(r0.getCurrentPosition() - 1);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            this.M1.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public p8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        this.o1 = new ArrayList();
        this.p1 = new HashMap();
        this.q1 = 0;
        this.r1 = new ArrayList();
        this.s1 = new ArrayList();
        this.t1 = new HashMap();
        this.u1 = 0;
        this.v1 = new HashSet();
        this.w1 = true;
        this.x1 = true;
        this.y1 = false;
        this.z1 = true;
        this.A1 = true;
        this.B1 = false;
        this.C1 = 0;
        this.D1 = 1;
        this.E1 = new ArrayList();
        this.H1 = 1;
        this.I1 = 4;
        this.K1 = new HashMap();
        this.L1 = 86400;
        this.M1 = new Paint(1);
        this.T1 = true;
        this.U1 = false;
        Q0(context);
        this.m1.setAdapter(new o7(this, context, 1));
    }
}
