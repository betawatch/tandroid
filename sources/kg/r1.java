package kg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.x4;
import c8.ja;
import di.r9;
import fi.m5;
import hi.g7;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r1 extends e2 implements is {
    public static org.telegram.ui.ActionBar.t1 f;
    public u41 a;
    public final ArrayList b;
    public d5 c;
    public int d;
    public boolean e;

    public r1() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static void Z(r1 r1Var, int i7, ArrayList arrayList) {
        if (i7 == r1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((b41) arrayList.get(i10)).G instanceof u1) {
                    ((u1) ((b41) arrayList.get(i10)).G).c = i10;
                }
            }
            v1 f10 = v1.f(r1Var.currentAccount);
            ArrayList arrayList2 = f10.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = com.google.android.gms.internal.vision.e2.f(((u1) arrayList2.get(i11)).a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((u1) arrayList2.get(i12)).a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = com.google.android.gms.internal.vision.e2.f(((u1) arrayList2.get(i13)).a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.a).sendRequest(tL_messages_reorderQuickReplies, new m5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(r1 r1Var, ArrayList arrayList, p41 p41Var) {
        String M0 = hd.M0(2131752683, null);
        String M02 = hd.M0(2131752670, null);
        b41 b41Var = new b41(2);
        b41Var.l = M0;
        b41Var.o = M02;
        b41Var.m = "RestrictedEmoji";
        b41Var.n = "📝";
        arrayList.add(b41Var);
        p41Var.V();
        v1 f10 = v1.f(r1Var.currentAccount);
        ArrayList arrayList2 = f10.b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            i10 = (i10 != 0 || "hello".equalsIgnoreCase(((u1) arrayList2.get(i12)).b)) ? 1 : 0;
            i11 = (i11 != 0 || "away".equalsIgnoreCase(((u1) arrayList2.get(i12)).b)) ? 1 : 0;
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < np.s1(f10.a).C5) {
            b41 c10 = b41.c(1, R.drawable.msg_viewintopic, hd.M0(2131752682, null));
            c10.q = true;
            arrayList.add(c10);
        }
        r1Var.d = p41Var.M();
        ArrayList arrayList3 = v1.f(r1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            u1 u1Var = (u1) obj;
            b41 b41Var2 = new b41(16);
            b41Var2.G = u1Var;
            b41Var2.L(r1Var.b.contains(Integer.valueOf(u1Var.a)));
            arrayList.add(b41Var2);
        }
        p41Var.L();
        p41Var.U();
        arrayList.add(b41.C(hd.M0(2131752681, null)));
    }

    public static void b0(r1 r1Var, b41 b41Var, View view) {
        if (b41Var.d == 1) {
            i0(r1Var.getParentActivity(), r1Var.currentAccount, null, null, r1Var.getResourceProvider(), new g7(r1Var, 10));
            return;
        }
        if (b41Var.a == 16 && (b41Var.G instanceof u1)) {
            if (!r1Var.b.isEmpty()) {
                r1Var.j0(b41Var, view);
                return;
            }
            u1 u1Var = (u1) b41Var.G;
            if (u1Var.g) {
                return;
            }
            Bundle f10 = r.b.f(5, "chatMode");
            f10.putLong("user_id", r1Var.getUserConfig().e());
            f10.putString("quick_reply", u1Var.b);
            an anVar = new an(f10);
            anVar.Tb(u1Var.a);
            r1Var.presentFragment(anVar);
        }
    }

    public static void c0(r1 r1Var) {
        r1Var.b.clear();
        org.telegram.messenger.g0.d0(r1Var.a, new fi.e(4));
        r1Var.simpleActionBar.u();
        r1Var.a.z1(false);
    }

    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static void i0(Activity activity, int i7, String str, u1 u1Var, e6 e6Var, z10 z10Var) {
        ?? r10;
        e2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder v1Var = z10 ? new org.telegram.ui.ActionBar.v1(0, activity, e6Var) : new AlertDialog$Builder(0, activity, e6Var);
        String M0 = hd.M0((u1Var == null && str == null) ? 2131752659 : 2131752673, null);
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = M0;
        final x0 x0Var = new x0(activity, e6Var);
        si.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        x0Var.setTextSize(1, 18.0f);
        x0Var.setText(u1Var == null ? str == null ? "" : str : u1Var.b);
        int i10 = j6.j5;
        q6.U(x0Var, i10, e6Var);
        q6.l(x0Var, 34, j6.Oi, e6Var);
        x0Var.setHintText(hd.M0(2131752661, null));
        x0Var.setSingleLine(true);
        x0Var.setFocusable(true);
        q6.F(x0Var, j6.k6, j6.l6, j6.p7, e6Var);
        x0Var.setImeOptions(6);
        x0Var.setBackgroundDrawable(null);
        x0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        x0Var.setFilters(new InputFilter[]{new y0(1)});
        LinearLayout e10 = k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0((u1Var == null && str == null) ? 2131752660 : 2131752674, null));
        frameLayout.addView(textView, ja.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        q6.U(textView2, j6.q7, e6Var);
        i5.c.w(textView2, 1, 16.0f, null, 2131752662);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ja.e(-1, -2, 83));
        Runnable[] runnableArr = {new j1(r16, 0)};
        bi.o1 o1Var = new bi.o1(runnableArr, new ValueAnimator[1], textView2, textView, 4);
        x0Var.addTextChangedListener(new bi.v(textView2, runnableArr, false ? 1 : 0, 8));
        e10.addView(frameLayout, ja.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(x0Var, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        v1Var.o(e10);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        x0Var.setOnEditorActionListener(new n1(x0Var, i7, u1Var, textView2, o1Var, z10Var, t1VarArr, currentFocus));
        v1Var.k(hd.M0(2131751354, null), new k1(x0Var, o1Var, i7, u1Var, textView2, z10Var));
        v1Var.h(hd.M0(2131752589, null), new i0.b(12));
        if (z10) {
            f = t1Var;
            r10 = 0;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(1, currentFocus));
            org.telegram.ui.ActionBar.t1 t1Var2 = f;
            final boolean z11 = false ? 1 : 0;
            t1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.l1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var2);
                            break;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var3);
                            break;
                    }
                }
            });
            f.r(250L);
        } else {
            r10 = 0;
            t1Var.P = new g7(x0Var, 11);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r9(x0Var, 6));
            final int i11 = 1;
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.l1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var2);
                            break;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var3);
                            break;
                    }
                }
            });
            t1VarArr[0].show();
        }
        t1VarArr[r10].k0 = r10;
        x0Var.setSelection(x0Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        final int i7 = 1;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(hd.M0(2131752683, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 11));
        c5 o4 = this.simpleActionBar.o();
        d5 b10 = o4.b(1, R.drawable.msg_edit);
        this.c = b10;
        b10.setContentDescription(hd.M0(2131751335, null));
        o4.b(2, R.drawable.msg_delete).setContentDescription(hd.M0(2131751598, null));
        m1 m1Var = new m1(context, null, i10);
        u41 u41Var = new u41(this, new s10(this) { // from class: kg.i1
            public final /* synthetic */ r1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        r1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        r1.a0(this.b, (ArrayList) obj, (p41) obj2);
                        break;
                }
            }
        }, new h1(this), new h1(this));
        this.a = u41Var;
        u41Var.r1();
        this.a.setSectionsDrawBackground(true);
        u41 u41Var2 = this.a;
        u41Var2.g3.r = false;
        u41Var2.E1(new s10(this) { // from class: kg.i1
            public final /* synthetic */ r1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        r1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        r1.a0(this.b, (ArrayList) obj, (p41) obj2);
                        break;
                }
            }
        }, false);
        m1Var.addView(this.a, ja.c(-1.0f, -1));
        this.fragmentView = m1Var;
        return m1Var;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        u41 u41Var;
        p41 p41Var;
        if (i7 != ns.F1 || (u41Var = this.a) == null || (p41Var = u41Var.g3) == null) {
            return;
        }
        p41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(b41 b41Var, View view) {
        u1 u1Var = (u1) b41Var.G;
        q1 q1Var = (q1) view;
        Integer valueOf = Integer.valueOf(u1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(u1Var.a));
        } else {
            arrayList.add(Integer.valueOf(u1Var.a));
        }
        this.a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(u1Var.a));
        b41Var.e = contains;
        q1Var.d.a(contains, true);
        if (this.simpleActionBar.v() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.u();
            } else {
                this.simpleActionBar.F();
            }
        }
        this.simpleActionBar.A(Math.max(1, arrayList.size()), true);
        boolean z10 = false;
        boolean z11 = arrayList.size() == 1;
        if (z11) {
            u1 c10 = v1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !v1.g(c10.b)) {
                z10 = true;
            }
            z11 = z10;
        }
        if (this.e != z11) {
            this.e = z11;
            this.c.Z(z11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.F1);
        v1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.F1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
