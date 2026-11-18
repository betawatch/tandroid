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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class q8 extends org.telegram.ui.ActionBar.x2 implements fs {
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
    public w7 O1;
    public x10 P1;
    public c8 Q1;
    public x10 R1;
    public t8 S1;
    public final boolean T1;
    public boolean U1;
    public boolean V1;
    public BitmapDrawable W1;
    public s8 X1;
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
    public q8(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
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
        String string = mp.u1(this.a).h7.getString("story_prv_contacts", null);
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
        String string2 = mp.u1(this.a).h7.getString("story_prv_grpcontacts", null);
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
        String string3 = mp.u1(this.a).h7.getString("story_prv_everyoneexcept", null);
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
        String string4 = mp.u1(this.a).h7.getString("story_prv_grpeveryoneexcept", null);
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
        String string5 = mp.u1(this.a).h7.getString("story_prv_excluded", null);
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
        this.x1 = !mp.u1(this.a).h7.getBoolean("story_noforwards", r23);
        this.y1 = mp.u1(this.a).h7.getBoolean("story_keep", z12);
        Q0(context);
        this.m1.setAdapter(new p7(this, context, 0));
        tr a02 = tr.a0(this.a);
        a02.a.c(new r1(15, this, a02));
        mp.u1(this.a).R1().S();
        mp.u1(this.a).R1().U();
    }

    public static ArrayList K0(q8 q8Var) {
        ArrayList P0 = q8Var.P0();
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

    public static int L0(q8 q8Var, TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = mp.u1(q8Var.a).P0(chat.id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = q8Var.K1;
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

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        View currentView = this.m1.getCurrentView();
        if (currentView instanceof l8) {
            return ((l8) currentView).T;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        ks.f(this.a).n(this, ks.O);
        ks.f(this.a).n(this, ks.c3);
        ks.f(this.a).n(this, ks.e3);
        super.L();
    }

    public final void M0(boolean z10) {
        this.z1 = z10;
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof l8) {
                    ((l8) view).f(false);
                }
            }
        }
    }

    public final void N0() {
        e8 e8Var;
        for (View view : this.m1.getViewPages()) {
            if ((view instanceof l8) && (e8Var = ((l8) view).y) != null) {
                org.telegram.messenger.g0.v1(e8Var.b);
            }
        }
    }

    public final void O0(o8 o8Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.N1 != null) {
            mp u12 = mp.u1(this.a);
            for (int i7 = 0; i7 < this.N1.size(); i7++) {
                String str = (String) this.N1.get(i7);
                TLObject h22 = u12.h2(str);
                if (h22 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) h22;
                    TLRPC.User c22 = u12.c2(Long.valueOf(user.id));
                    if (c22 != null) {
                        user = c22;
                    }
                    if (!user.bot && !o8Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.isEmpty() || z10) {
            View view = this.m1.getViewPages()[0];
            d dVar = view instanceof l8 ? ((l8) view).w : null;
            if (dVar != null) {
                dVar.setLoading(true);
            }
            w7 w7Var = this.O1;
            if (w7Var != null) {
                w7Var.i(o8Var, this.w1, this.x1, this.y1, this.B1, this.n1, this.C1, new r1(17, dVar, runnable), new k(dVar, 15));
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
            spannableString.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = gd.M0(2131744254, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.K2(gd.M0(2131744253, null), spannableStringBuilder, "%s");
        alertDialog$Builder.k(gd.M0(2131746550, null), new a3.h(this, o8Var, runnable, 11));
        i5.c.y(null, 2131752578, alertDialog$Builder, null);
    }

    public final ArrayList P0() {
        TLRPC.User c22;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = org.telegram.messenger.i5.r(this.a).f0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            org.telegram.messenger.i5.r(this.a).A(0L, false);
        }
        mp u12 = mp.u1(this.a);
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i7);
                if (tL_contact != null && (c22 = u12.c2(Long.valueOf(tL_contact.user_id))) != null && !o10.C(c22) && !c22.bot && c22.id != 777000) {
                    arrayList.add(c22);
                }
            }
        }
        return arrayList;
    }

    public final void Q0(Context context) {
        gc.a(this.c, new bi.t(1));
        ks.f(this.a).c(this, ks.O);
        ks.f(this.a).c(this, ks.c3);
        ks.f(this.a).c(this, ks.e3);
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        this.M1.setColor(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        Q(i7);
        this.b = new v7(this, context);
        i1 i1Var = new i1(1, context, this);
        this.m1 = i1Var;
        int i10 = this.u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.b.addView(this.m1, c8.ma.e(-1, -1, ks.E1));
    }

    public final void R0(boolean z10) {
        this.U1 = z10;
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof l8) {
                    l8 l8Var = (l8) view;
                    l8Var.h(false);
                    l8Var.f(false);
                }
            }
        }
    }

    public final void T0(int i7) {
        this.D1 = i7;
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof l8) {
                    ((l8) view).f(false);
                }
            }
        }
    }

    public final void U0(Bitmap bitmap) {
        this.W1 = bitmap == null ? null : new BitmapDrawable(bitmap);
        i1 i1Var = this.m1;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof l8) {
                    l8 l8Var = (l8) view;
                    l8Var.h(false);
                    l8Var.f(false);
                }
            }
        }
    }

    public final void V0() {
        this.F1 = true;
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof l8) {
            l8 l8Var = (l8) view;
            l8Var.b(l8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof l8) {
            l8 l8Var2 = (l8) view2;
            l8Var2.b(l8Var2.a);
        }
    }

    public final void W0(TLRPC.InputPeer inputPeer) {
        this.n1 = inputPeer;
        this.v1.clear();
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof l8) {
            l8 l8Var = (l8) view;
            l8Var.b(l8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof l8) {
            l8 l8Var2 = (l8) view2;
            l8Var2.b(l8Var2.a);
        }
    }

    public final void X0(o8 o8Var) {
        if (o8Var == null) {
            return;
        }
        HashMap hashMap = o8Var.d;
        int i7 = o8Var.a;
        ArrayList arrayList = o8Var.c;
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
            arrayList5.addAll(o8Var.f);
            this.m1.setPosition(1);
        }
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof l8) {
            l8 l8Var = (l8) view;
            l8Var.b(l8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof l8) {
            l8 l8Var2 = (l8) view2;
            l8Var2.b(l8Var2.a);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        i1 i1Var = this.m1;
        if (i1Var == null) {
            return;
        }
        int i11 = 0;
        if (i7 == ks.O) {
            View[] viewPages = i1Var.getViewPages();
            View view = viewPages[0];
            if (view instanceof l8) {
                ((l8) view).h(true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof l8) {
                ((l8) view2).h(true);
                return;
            }
            return;
        }
        if (i7 != ks.c3) {
            if (i7 == ks.e3) {
                View[] viewPages2 = i1Var.getViewPages();
                while (i11 < viewPages2.length) {
                    View view3 = viewPages2[i11];
                    if (view3 instanceof l8) {
                        l8 l8Var = (l8) view3;
                        if (l8Var.a == 0) {
                            l8Var.h(true);
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
            if (view4 instanceof l8) {
                l8 l8Var2 = (l8) view4;
                int i12 = l8Var2.a;
                if (i12 == 6) {
                    l8Var2.a(true);
                } else if (i12 == 0) {
                    l8Var2.h(true);
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        o8 o8Var;
        x10 x10Var = this.P1;
        ArrayList arrayList = this.r1;
        HashMap hashMap = this.p1;
        ArrayList arrayList2 = this.o1;
        HashMap hashMap2 = this.t1;
        ArrayList arrayList3 = this.s1;
        if (x10Var != null) {
            int i7 = this.I1;
            if (i7 == 3) {
                o8Var = new o8(this.I1, this.a, new ArrayList(S0(arrayList3, hashMap2)));
                ArrayList arrayList4 = o8Var.c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = o8Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i7 == 4) {
                o8Var = new o8(this.I1, this.a, new ArrayList(S0(arrayList2, hashMap)));
                ArrayList arrayList5 = o8Var.c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = o8Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else {
                o8Var = i7 == 2 ? new o8(i7, this.a, arrayList) : new o8(i7, this.a, (ArrayList) null);
            }
            this.P1.a(o8Var);
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
        mp.u1(this.a).h7.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.x1).putBoolean("story_keep", this.y1).apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        if (this.m1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        N0();
        this.m1.A(r0.getCurrentPosition() - 1);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        super.s0();
        try {
            this.M1.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public q8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
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
        this.m1.setAdapter(new p7(this, context, 1));
    }
}
