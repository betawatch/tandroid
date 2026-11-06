package fi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class s8 extends org.telegram.ui.ActionBar.v2 implements ls {
    public static final /* synthetic */ int U1 = 0;
    public final ArrayList A1;
    public boolean B1;
    public boolean C1;
    public int D1;
    public int E1;
    public boolean F1;
    public HashMap G1;
    public int H1;
    public final Paint I1;
    public ArrayList J1;
    public y7 K1;
    public c20 L1;
    public e8 M1;
    public c20 N1;
    public v8 O1;
    public final boolean P1;
    public boolean Q1;
    public boolean R1;
    public BitmapDrawable S1;
    public u8 T1;
    public g1 i1;
    public TLRPC.InputPeer j1;
    public final ArrayList k1;
    public final HashMap l1;
    public int m1;
    public final ArrayList n1;
    public final ArrayList o1;
    public final HashMap p1;
    public int q1;
    public final HashSet r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public int y1;
    public int z1;

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
    public s8(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        boolean z9;
        char c10;
        boolean z10 = true;
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        HashMap hashMap = new HashMap();
        this.l1 = hashMap;
        char c11 = 0;
        this.m1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.n1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.o1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.p1 = hashMap2;
        this.q1 = 0;
        this.r1 = new HashSet();
        this.s1 = true;
        this.t1 = true;
        this.u1 = false;
        this.v1 = true;
        this.w1 = true;
        this.x1 = false;
        this.y1 = 0;
        this.z1 = 1;
        this.A1 = new ArrayList();
        this.D1 = 1;
        this.E1 = 4;
        this.G1 = new HashMap();
        this.H1 = 86400;
        this.I1 = new Paint(1);
        this.P1 = true;
        this.Q1 = false;
        this.H1 = i7;
        String string = qp.s1(this.a).e7.getString("story_prv_contacts", null);
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
        String string2 = qp.s1(this.a).e7.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i10 = 0;
            while (i10 < split2.length) {
                String[] split3 = split2[i10].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c11]);
                        z9 = z10;
                        ArrayList arrayList4 = new ArrayList();
                        c10 = c11;
                        for (?? r52 = z9; r52 < split3.length; r52++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[r52])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i10++;
                    c11 = c10;
                    z10 = z9;
                }
                z9 = z10;
                c10 = c11;
                i10++;
                c11 = c10;
                z10 = z9;
            }
        }
        boolean z11 = z10;
        ?? r23 = c11;
        String string3 = qp.s1(this.a).e7.getString("story_prv_everyoneexcept", null);
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
        String string4 = qp.s1(this.a).e7.getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i12 = r23 == true ? 1 : 0; i12 < split5.length; i12++) {
                String[] split6 = split5[i12].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (?? r14 = z11; r14 < split6.length; r14++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[r14])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = qp.s1(this.a).e7.getString("story_prv_excluded", null);
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
        this.q1 = R0(arrayList3, hashMap2).size();
        this.m1 = R0(arrayList, hashMap).size();
        this.t1 = !qp.s1(this.a).e7.getBoolean("story_noforwards", r23);
        this.u1 = qp.s1(this.a).e7.getBoolean("story_keep", z11);
        P0(context);
        this.i1.setAdapter(new q7(this, context, 0));
        yr a02 = yr.a0(this.a);
        a02.a.c(new f2.h(18, this, a02));
        qp.s1(this.a).P1().S();
        qp.s1(this.a).P1().U();
    }

    public static ArrayList J0(s8 s8Var) {
        ArrayList O0 = s8Var.O0();
        int i7 = 0;
        while (i7 < O0.size()) {
            TLObject tLObject = (TLObject) O0.get(i7);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                O0.remove(i7);
                i7--;
            }
            i7++;
        }
        return O0;
    }

    public static int K0(s8 s8Var, TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(s8Var.a).N0(chat.id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = s8Var.G1;
        return (hashMap == null || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public static HashSet R0(ArrayList arrayList, HashMap hashMap) {
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

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        View currentView = this.i1.getCurrentView();
        if (currentView instanceof n8) {
            return ((n8) currentView).S;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        qs.f(this.a).n(this, qs.O);
        qs.f(this.a).n(this, qs.a3);
        qs.f(this.a).n(this, qs.c3);
        super.K();
    }

    public final void L0(boolean z9) {
        this.v1 = z9;
        g1 g1Var = this.i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    ((n8) view).f(false);
                }
            }
        }
    }

    public final void M0() {
        g8 g8Var;
        for (View view : this.i1.getViewPages()) {
            if ((view instanceof n8) && (g8Var = ((n8) view).y) != null) {
                org.telegram.messenger.g0.v1(g8Var.b);
            }
        }
    }

    public final void N0(q8 q8Var, Runnable runnable, boolean z9) {
        ArrayList arrayList = new ArrayList();
        if (this.J1 != null) {
            qp s12 = qp.s1(this.a);
            for (int i7 = 0; i7 < this.J1.size(); i7++) {
                String str = (String) this.J1.get(i7);
                TLObject f22 = s12.f2(str);
                if (f22 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) f22;
                    TLRPC.User a22 = s12.a2(Long.valueOf(user.id));
                    if (a22 != null) {
                        user = a22;
                    }
                    if (!user.bot && !q8Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.isEmpty() || z9) {
            View view = this.i1.getViewPages()[0];
            d dVar = view instanceof n8 ? ((n8) view).w : null;
            if (dVar != null) {
                dVar.setLoading(true);
            }
            y7 y7Var = this.K1;
            if (y7Var != null) {
                y7Var.l(q8Var, this.s1, this.t1, this.u1, this.x1, this.j1, this.y1, new f2.h(20, dVar, runnable), new di.s7(dVar, 28));
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
            spannableString.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String M0 = hd.M0(2131744490, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.K2(hd.M0(2131744489, null), spannableStringBuilder, "%s");
        alertDialog$Builder.k(hd.M0(2131746742, null), new a3.h(this, q8Var, runnable, 9));
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public final ArrayList O0() {
        TLRPC.User a22;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = org.telegram.messenger.g5.r(this.a).e0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            org.telegram.messenger.g5.r(this.a).A(0L, false);
        }
        qp s12 = qp.s1(this.a);
        if (arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i7);
                if (tL_contact != null && (a22 = s12.a2(Long.valueOf(tL_contact.user_id))) != null && !t10.B(a22) && !a22.bot && a22.id != 777000) {
                    arrayList.add(a22);
                }
            }
        }
        return arrayList;
    }

    public final void P0(Context context) {
        cc.a(this.c, new r7(0));
        qs.f(this.a).c(this, qs.O);
        qs.f(this.a).c(this, qs.a3);
        qs.f(this.a).c(this, qs.c3);
        int i7 = org.telegram.ui.ActionBar.k6.h5;
        this.I1.setColor(org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        P(i7);
        this.b = new x7(this, context);
        g1 g1Var = new g1(1, context, this);
        this.i1 = g1Var;
        int i10 = this.t0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.b.addView(this.i1, c8.ha.e(-1, -1, qs.E1));
    }

    public final void Q0(boolean z9) {
        this.Q1 = z9;
        g1 g1Var = this.i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    n8 n8Var = (n8) view;
                    n8Var.h(false);
                    n8Var.f(false);
                }
            }
        }
    }

    public final void S0(int i7) {
        this.z1 = i7;
        g1 g1Var = this.i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    ((n8) view).f(false);
                }
            }
        }
    }

    public final void T0(Bitmap bitmap) {
        this.S1 = bitmap == null ? null : new BitmapDrawable(bitmap);
        g1 g1Var = this.i1;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof n8) {
                    n8 n8Var = (n8) view;
                    n8Var.h(false);
                    n8Var.f(false);
                }
            }
        }
    }

    public final void U0() {
        this.B1 = true;
        View[] viewPages = this.i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof n8) {
            n8 n8Var = (n8) view;
            n8Var.b(n8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof n8) {
            n8 n8Var2 = (n8) view2;
            n8Var2.b(n8Var2.a);
        }
    }

    public final void V0(TLRPC.InputPeer inputPeer) {
        this.j1 = inputPeer;
        this.r1.clear();
        View[] viewPages = this.i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof n8) {
            n8 n8Var = (n8) view;
            n8Var.b(n8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof n8) {
            n8 n8Var2 = (n8) view2;
            n8Var2.b(n8Var2.a);
        }
    }

    public final void W0(q8 q8Var) {
        if (q8Var == null) {
            return;
        }
        HashMap hashMap = q8Var.d;
        int i7 = q8Var.a;
        ArrayList arrayList = q8Var.c;
        this.E1 = i7;
        if (i7 == 2) {
            ArrayList arrayList2 = this.n1;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        } else if (i7 == 3) {
            ArrayList arrayList3 = this.o1;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            HashMap hashMap2 = this.p1;
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            this.q1 = R0(arrayList3, hashMap2).size();
        } else if (i7 == 4) {
            ArrayList arrayList4 = this.k1;
            arrayList4.clear();
            arrayList4.addAll(arrayList);
            HashMap hashMap3 = this.l1;
            hashMap3.clear();
            hashMap3.putAll(hashMap);
            this.m1 = R0(arrayList4, hashMap3).size();
        }
        if (i7 == 5) {
            this.F1 = true;
            this.D1 = 5;
            ArrayList arrayList5 = this.A1;
            arrayList5.clear();
            arrayList5.addAll(q8Var.f);
            this.i1.setPosition(1);
        }
        View[] viewPages = this.i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof n8) {
            n8 n8Var = (n8) view;
            n8Var.b(n8Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof n8) {
            n8 n8Var2 = (n8) view2;
            n8Var2.b(n8Var2.a);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g1 g1Var = this.i1;
        if (g1Var == null) {
            return;
        }
        int i11 = 0;
        if (i7 == qs.O) {
            View[] viewPages = g1Var.getViewPages();
            View view = viewPages[0];
            if (view instanceof n8) {
                ((n8) view).h(true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof n8) {
                ((n8) view2).h(true);
                return;
            }
            return;
        }
        if (i7 != qs.a3) {
            if (i7 == qs.c3) {
                View[] viewPages2 = g1Var.getViewPages();
                while (i11 < viewPages2.length) {
                    View view3 = viewPages2[i11];
                    if (view3 instanceof n8) {
                        n8 n8Var = (n8) view3;
                        if (n8Var.a == 0) {
                            n8Var.h(true);
                        }
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        View[] viewPages3 = g1Var.getViewPages();
        while (i11 < viewPages3.length) {
            View view4 = viewPages3[i11];
            if (view4 instanceof n8) {
                n8 n8Var2 = (n8) view4;
                int i12 = n8Var2.a;
                if (i12 == 6) {
                    n8Var2.a(true);
                } else if (i12 == 0) {
                    n8Var2.h(true);
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        q8 q8Var;
        c20 c20Var = this.L1;
        ArrayList arrayList = this.n1;
        HashMap hashMap = this.l1;
        ArrayList arrayList2 = this.k1;
        HashMap hashMap2 = this.p1;
        ArrayList arrayList3 = this.o1;
        if (c20Var != null) {
            int i7 = this.E1;
            if (i7 == 3) {
                q8Var = new q8(this.E1, this.a, new ArrayList(R0(arrayList3, hashMap2)));
                ArrayList arrayList4 = q8Var.c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = q8Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i7 == 4) {
                q8Var = new q8(this.E1, this.a, new ArrayList(R0(arrayList2, hashMap)));
                ArrayList arrayList5 = q8Var.c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = q8Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else {
                q8Var = i7 == 2 ? new q8(i7, this.a, arrayList) : new q8(i7, this.a, (ArrayList) null);
            }
            this.L1.a(q8Var);
            this.L1 = null;
        }
        cc.h(this.c);
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
        qp.s1(this.a).e7.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.t1).putBoolean("story_keep", this.u1).apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        if (this.i1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        M0();
        this.i1.E(r0.getCurrentPosition() - 1);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            this.I1.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public s8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.k1 = new ArrayList();
        this.l1 = new HashMap();
        this.m1 = 0;
        this.n1 = new ArrayList();
        this.o1 = new ArrayList();
        this.p1 = new HashMap();
        this.q1 = 0;
        this.r1 = new HashSet();
        this.s1 = true;
        this.t1 = true;
        this.u1 = false;
        this.v1 = true;
        this.w1 = true;
        this.x1 = false;
        this.y1 = 0;
        this.z1 = 1;
        this.A1 = new ArrayList();
        this.D1 = 1;
        this.E1 = 4;
        this.G1 = new HashMap();
        this.H1 = 86400;
        this.I1 = new Paint(1);
        this.P1 = true;
        this.Q1 = false;
        P0(context);
        this.i1.setAdapter(new q7(this, context, 1));
    }
}
