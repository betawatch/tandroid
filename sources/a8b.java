// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class a8b extends my0 implements jm7 {
    public static final /* synthetic */ int X1 = 0;
    public boolean A1;
    public int B1;
    public int C1;
    public final ArrayList D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public int H1;
    public boolean I1;
    public HashMap J1;
    public int K1;
    public final Paint L1;
    public ArrayList M1;
    public i7b N1;
    public qac O1;
    public n7b P1;
    public qac Q1;
    public g8b R1;
    public final boolean S1;
    public boolean T1;
    public boolean U1;
    public BitmapDrawable V1;
    public f8b W1;
    public hs1 l1;
    public TLRPC.InputPeer m1;
    public final ArrayList n1;
    public final HashMap o1;
    public int p1;
    public final ArrayList q1;
    public final ArrayList r1;
    public final HashMap s1;
    public int t1;
    public final HashSet u1;
    public boolean v1;
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
    public a8b(Context context, int i, r63 r63Var) {
        super(1, (ylb) r63Var, context, true);
        boolean z;
        char c;
        boolean z2 = true;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        HashMap hashMap = new HashMap();
        this.o1 = hashMap;
        char c2 = 0;
        this.p1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.q1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.r1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.s1 = hashMap2;
        this.t1 = 0;
        this.u1 = new HashSet();
        this.v1 = true;
        this.w1 = true;
        this.x1 = false;
        this.y1 = true;
        this.z1 = true;
        this.A1 = false;
        this.B1 = 0;
        this.C1 = 1;
        this.D1 = new ArrayList();
        this.G1 = 1;
        this.H1 = 4;
        this.J1 = new HashMap();
        this.K1 = 86400;
        this.L1 = new Paint(1);
        this.S1 = true;
        this.T1 = false;
        this.K1 = i;
        String string = oc7.r1(this.a).X3.getString("story_prv_contacts", null);
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
        String string2 = oc7.r1(this.a).X3.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i2 = 0;
            while (i2 < split2.length) {
                String[] split3 = split2[i2].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c2]);
                        z = z2;
                        ArrayList arrayList4 = new ArrayList();
                        c = c2;
                        for (?? r5 = z; r5 < split3.length; r5++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[r5])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i2++;
                    c2 = c;
                    z2 = z;
                }
                z = z2;
                c = c2;
                i2++;
                c2 = c;
                z2 = z;
            }
        }
        boolean z3 = z2;
        ?? r23 = c2;
        String string3 = oc7.r1(this.a).X3.getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (int i3 = r23 == true ? 1 : 0; i3 < split4.length; i3++) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(split4[i3])));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = oc7.r1(this.a).X3.getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i4 = r23 == true ? 1 : 0; i4 < split5.length; i4++) {
                String[] split6 = split5[i4].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (?? r14 = z3; r14 < split6.length; r14++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[r14])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = oc7.r1(this.a).X3.getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (int i5 = r23 == true ? 1 : 0; i5 < split7.length; i5++) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(split7[i5])));
                } catch (Exception unused5) {
                }
            }
        }
        this.t1 = M0(arrayList3, hashMap2).size();
        this.p1 = M0(arrayList, hashMap).size();
        this.w1 = !oc7.r1(this.a).X3.getBoolean("story_noforwards", r23);
        this.x1 = oc7.r1(this.a).X3.getBoolean("story_keep", z3);
        K0(context);
        byte b = 0;
        this.l1.setAdapter(new c7b(this, context, b));
        cf7 Y = cf7.Y(this.a);
        Y.a.c(new b7b(this, Y, b));
        oc7.r1(this.a).N1().R();
        oc7.r1(this.a).N1().T();
    }

    public static HashSet M0(ArrayList arrayList, HashMap hashMap) {
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

    @Override // my0
    public final boolean C() {
        View currentView = this.l1.getCurrentView();
        if (currentView instanceof v7b) {
            return ((v7b) currentView).T;
        }
        return true;
    }

    public final void E0(boolean z) {
        this.y1 = z;
        hs1 hs1Var = this.l1;
        if (hs1Var != null) {
            for (View view : hs1Var.getViewPages()) {
                if (view instanceof v7b) {
                    ((v7b) view).f(false);
                }
            }
        }
    }

    public final void F0() {
        o7b o7bVar;
        for (View view : this.l1.getViewPages()) {
            if ((view instanceof v7b) && (o7bVar = ((v7b) view).y) != null) {
                gm.t1(o7bVar.b);
            }
        }
    }

    public final void G0(y7b y7bVar, Runnable runnable, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.M1 != null) {
            oc7 r1 = oc7.r1(this.a);
            for (int i = 0; i < this.M1.size(); i++) {
                String str = (String) this.M1.get(i);
                TLObject b2 = r1.b2(str);
                if (b2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) b2;
                    TLRPC.User W1 = r1.W1(Long.valueOf(user.id));
                    if (W1 != null) {
                        user = W1;
                    }
                    if (!user.bot && !y7bVar.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        byte b = 2;
        if (arrayList.isEmpty() || z) {
            View view = this.l1.getViewPages()[0];
            b61 b61Var = view instanceof v7b ? ((v7b) view).w : null;
            if (b61Var != null) {
                b61Var.setLoading(true);
            }
            i7b i7bVar = this.N1;
            if (i7bVar != null) {
                i7bVar.c(y7bVar, this.v1, this.w1, this.x1, this.A1, this.m1, this.B1, new b7b(b61Var, runnable, b), new nsa((Object) b61Var, (byte) 22));
                return;
            } else {
                runnable.run();
                return;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i2 = 0; i2 < Math.min(2, arrayList.size()); i2++) {
            if (i2 > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i2)));
            spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = jb6.M0(2131744175, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.G2(jb6.M0(2131744174, null), spannableStringBuilder, "%s");
        alertDialog$Builder.j(jb6.M0(2131746478, null), new jq9(this, y7bVar, runnable, (byte) 7));
        wi8.y(null, 2131752542, alertDialog$Builder, null);
    }

    @Override // my0
    public final void H() {
        nm7.f(this.a).n(this, nm7.N);
        nm7.f(this.a).n(this, nm7.c3);
        nm7.f(this.a).n(this, nm7.e3);
        super.H();
    }

    public final ArrayList H0() {
        ArrayList I0 = I0();
        int i = 0;
        while (i < I0.size()) {
            TLObject tLObject = (TLObject) I0.get(i);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                I0.remove(i);
                i--;
            }
            i++;
        }
        return I0;
    }

    public final ArrayList I0() {
        TLRPC.User W1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = bw2.r(this.a).f0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            bw2.r(this.a).A(0L, false);
        }
        oc7 r1 = oc7.r1(this.a);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i);
                if (tL_contact != null && (W1 = r1.W1(Long.valueOf(tL_contact.user_id))) != null && !m9c.D(W1) && !W1.bot && W1.id != 777000) {
                    arrayList.add(W1);
                }
            }
        }
        return arrayList;
    }

    public final int J0(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull M0 = oc7.r1(this.a).M0(chat.id);
        if (M0 != null && (i = M0.participants_count) > 0) {
            return i;
        }
        HashMap hashMap = this.J1;
        return (hashMap == null || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void K0(Context context) {
        u31.a(this.c, new oz((byte) 13));
        nm7.f(this.a).b(this, nm7.N);
        nm7.f(this.a).b(this, nm7.c3);
        nm7.f(this.a).b(this, nm7.e3);
        int i = cmb.g5;
        this.L1.setColor(cmb.v0(i, this.J0));
        L(i);
        this.b = new lp2(this, context);
        hs1 hs1Var = new hs1((byte) 7, context, this);
        this.l1 = hs1Var;
        int i2 = this.u0;
        hs1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(this.l1, qoe.e(-1, -1, nm7.D1));
    }

    public final void L0(boolean z) {
        this.T1 = z;
        hs1 hs1Var = this.l1;
        if (hs1Var != null) {
            for (View view : hs1Var.getViewPages()) {
                if (view instanceof v7b) {
                    v7b v7bVar = (v7b) view;
                    v7bVar.h(false);
                    v7bVar.f(false);
                }
            }
        }
    }

    public final void N0(int i) {
        this.C1 = i;
        hs1 hs1Var = this.l1;
        if (hs1Var != null) {
            for (View view : hs1Var.getViewPages()) {
                if (view instanceof v7b) {
                    ((v7b) view).f(false);
                }
            }
        }
    }

    public final void O0(Bitmap bitmap) {
        this.V1 = bitmap == null ? null : new BitmapDrawable(bitmap);
        hs1 hs1Var = this.l1;
        if (hs1Var != null) {
            for (View view : hs1Var.getViewPages()) {
                if (view instanceof v7b) {
                    v7b v7bVar = (v7b) view;
                    v7bVar.h(false);
                    v7bVar.f(false);
                }
            }
        }
    }

    public final void P0() {
        this.E1 = true;
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof v7b) {
            v7b v7bVar = (v7b) view;
            v7bVar.b(v7bVar.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof v7b) {
            v7b v7bVar2 = (v7b) view2;
            v7bVar2.b(v7bVar2.a);
        }
    }

    public final void Q0(TLRPC.InputPeer inputPeer) {
        this.m1 = inputPeer;
        this.u1.clear();
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof v7b) {
            v7b v7bVar = (v7b) view;
            v7bVar.b(v7bVar.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof v7b) {
            v7b v7bVar2 = (v7b) view2;
            v7bVar2.b(v7bVar2.a);
        }
    }

    public final void R0(y7b y7bVar) {
        if (y7bVar != null) {
            HashMap hashMap = y7bVar.d;
            int i = y7bVar.a;
            ArrayList arrayList = y7bVar.c;
            this.H1 = i;
            if (i == 2) {
                ArrayList arrayList2 = this.q1;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i == 3) {
                ArrayList arrayList3 = this.r1;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.s1;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.t1 = M0(arrayList3, hashMap2).size();
            } else if (i == 4) {
                ArrayList arrayList4 = this.n1;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.o1;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.p1 = M0(arrayList4, hashMap3).size();
            }
            if (i == 5) {
                this.I1 = true;
                this.G1 = 5;
                ArrayList arrayList5 = this.D1;
                arrayList5.clear();
                arrayList5.addAll(y7bVar.f);
                this.l1.setPosition(1);
            }
            View[] viewPages = this.l1.getViewPages();
            View view = viewPages[0];
            if (view instanceof v7b) {
                v7b v7bVar = (v7b) view;
                v7bVar.b(v7bVar.a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof v7b) {
                v7b v7bVar2 = (v7b) view2;
                v7bVar2.b(v7bVar2.a);
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        hs1 hs1Var = this.l1;
        if (hs1Var != null) {
            int i3 = 0;
            if (i == nm7.N) {
                View[] viewPages = hs1Var.getViewPages();
                View view = viewPages[0];
                if (view instanceof v7b) {
                    ((v7b) view).h(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof v7b) {
                    ((v7b) view2).h(true);
                    return;
                }
                return;
            }
            if (i != nm7.c3) {
                if (i == nm7.e3) {
                    View[] viewPages2 = hs1Var.getViewPages();
                    while (i3 < viewPages2.length) {
                        View view3 = viewPages2[i3];
                        if (view3 instanceof v7b) {
                            v7b v7bVar = (v7b) view3;
                            if (v7bVar.a == 0) {
                                v7bVar.h(true);
                            }
                        }
                        i3++;
                    }
                    return;
                }
                return;
            }
            View[] viewPages3 = hs1Var.getViewPages();
            while (i3 < viewPages3.length) {
                View view4 = viewPages3[i3];
                if (view4 instanceof v7b) {
                    v7b v7bVar2 = (v7b) view4;
                    int i4 = v7bVar2.a;
                    if (i4 == 6) {
                        v7bVar2.a(true);
                    } else if (i4 == 0) {
                        v7bVar2.h(true);
                    }
                }
                i3++;
            }
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        y7b y7bVar;
        qac qacVar = this.O1;
        ArrayList arrayList = this.q1;
        HashMap hashMap = this.o1;
        ArrayList arrayList2 = this.n1;
        HashMap hashMap2 = this.s1;
        ArrayList arrayList3 = this.r1;
        if (qacVar != null) {
            int i = this.H1;
            if (i == 3) {
                y7bVar = new y7b(this.H1, this.a, new ArrayList(M0(arrayList3, hashMap2)));
                ArrayList arrayList4 = y7bVar.c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = y7bVar.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i == 4) {
                y7bVar = new y7b(this.H1, this.a, new ArrayList(M0(arrayList2, hashMap)));
                ArrayList arrayList5 = y7bVar.c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = y7bVar.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else {
                int i2 = this.a;
                y7bVar = i == 2 ? new y7b(i, i2, arrayList) : new y7b(i, i2, (ArrayList) null);
            }
            this.O1.a(y7bVar);
            this.O1 = null;
        }
        u31.h(this.c);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        oc7.r1(this.a).X3.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb2.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.w1).putBoolean("story_keep", this.x1).apply();
        super.dismiss();
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        if (this.l1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        F0();
        this.l1.E(r1.getCurrentPosition() - 1);
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            this.L1.setColor(cmb.v0(cmb.g5, this.J0));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public a8b(Context context, ylb ylbVar) {
        super(1, ylbVar, context, true);
        this.n1 = new ArrayList();
        this.o1 = new HashMap();
        this.p1 = 0;
        this.q1 = new ArrayList();
        this.r1 = new ArrayList();
        this.s1 = new HashMap();
        this.t1 = 0;
        this.u1 = new HashSet();
        this.v1 = true;
        this.w1 = true;
        this.x1 = false;
        this.y1 = true;
        this.z1 = true;
        this.A1 = false;
        this.B1 = 0;
        this.C1 = 1;
        this.D1 = new ArrayList();
        this.G1 = 1;
        this.H1 = 4;
        this.J1 = new HashMap();
        this.K1 = 86400;
        this.L1 = new Paint(1);
        this.S1 = true;
        this.T1 = false;
        K0(context);
        this.l1.setAdapter(new c7b(this, context, (byte) 1));
    }
}
