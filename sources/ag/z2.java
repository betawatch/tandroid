package ag;

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
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.m5;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z2 extends org.telegram.ui.ActionBar.k2 implements us {
    public static org.telegram.ui.ActionBar.x1 f;
    public u51 a;
    public final ArrayList b;
    public p5 c;
    public int d;
    public boolean e;

    public z2() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static void Y(z2 z2Var, int i10, ArrayList arrayList) {
        if (i10 == z2Var.d) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((a51) arrayList.get(i11)).G instanceof h3) {
                    ((h3) ((a51) arrayList.get(i11)).G).c = i11;
                }
            }
            i3 f7 = i3.f(z2Var.currentAccount);
            ArrayList arrayList2 = f7.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = c3.i0.j(((h3) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(2));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((h3) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = c3.i0.j(((h3) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.a).sendRequest(tL_messages_reorderQuickReplies, new c3(0));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void Z(z2 z2Var, ArrayList arrayList, p51 p51Var) {
        String L0 = cd.L0(2131752683, null);
        String L02 = cd.L0(2131752670, null);
        a51 a51Var = new a51(2);
        a51Var.l = L0;
        a51Var.o = L02;
        a51Var.m = "RestrictedEmoji";
        a51Var.n = "📝";
        arrayList.add(a51Var);
        p51Var.V();
        i3 f7 = i3.f(z2Var.currentAccount);
        ArrayList arrayList2 = f7.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((h3) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((h3) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < vp.r1(f7.a).C5) {
            a51 c10 = a51.c(1, R.drawable.msg_viewintopic, cd.L0(2131752682, null));
            c10.q = true;
            arrayList.add(c10);
        }
        z2Var.d = p51Var.M();
        ArrayList arrayList3 = i3.f(z2Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            h3 h3Var = (h3) obj;
            a51 a51Var2 = new a51(16);
            a51Var2.G = h3Var;
            a51Var2.L(z2Var.b.contains(Integer.valueOf(h3Var.a)));
            arrayList.add(a51Var2);
        }
        p51Var.L();
        p51Var.U();
        arrayList.add(a51.C(cd.L0(2131752681, null)));
    }

    public static void a0(z2 z2Var, a51 a51Var, View view) {
        if (a51Var.d == 1) {
            h0(z2Var.getParentActivity(), z2Var.currentAccount, null, null, z2Var.getResourceProvider(), new l(z2Var, 4));
            return;
        }
        if (a51Var.a == 16 && (a51Var.G instanceof h3)) {
            if (!z2Var.b.isEmpty()) {
                z2Var.i0(a51Var, view);
                return;
            }
            h3 h3Var = (h3) a51Var.G;
            if (h3Var.g) {
                return;
            }
            Bundle i10 = org.telegram.ui.Cells.f1.i(5, "chatMode");
            i10.putLong("user_id", z2Var.getUserConfig().e());
            i10.putString("quick_reply", h3Var.b);
            un unVar = new un(i10);
            unVar.Fb(h3Var.a);
            z2Var.presentFragment(unVar);
        }
    }

    public static void b0(z2 z2Var) {
        z2Var.b.clear();
        org.telegram.messenger.i0.d0(z2Var.a, new z0(1));
        z2Var.simpleActionBar.r();
        z2Var.a.z1(false);
    }

    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static void h0(Activity activity, int i10, String str, h3 h3Var, p6 p6Var, q20 q20Var) {
        ?? r92;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.i0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i11 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof uu0) && ((uu0) Q.getFragmentView()).Q() > org.telegram.messenger.i0.L(20.0f);
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        AlertDialog$Builder a2Var = z10 ? new org.telegram.ui.ActionBar.a2(0, activity, p6Var) : new AlertDialog$Builder(0, activity, p6Var);
        String L0 = cd.L0((h3Var == null && str == null) ? 2131752659 : 2131752673, null);
        org.telegram.ui.ActionBar.x1 x1Var = a2Var.a;
        x1Var.R = L0;
        final a2 a2Var2 = new a2(activity, p6Var);
        ui.b0(i10).M(org.telegram.messenger.i0.G0(), true);
        a2Var2.setTextSize(1, 18.0f);
        a2Var2.setText(h3Var == null ? str == null ? "" : str : h3Var.b);
        int i12 = t6.j5;
        a7.V(a2Var2, i12, p6Var);
        a7.m(a2Var2, 34, t6.Li, p6Var);
        a2Var2.setHintText(cd.L0(2131752661, null));
        a2Var2.setSingleLine(true);
        a2Var2.setFocusable(true);
        a7.G(a2Var2, t6.k6, t6.l6, t6.p7, p6Var);
        a2Var2.setImeOptions(6);
        a2Var2.setBackgroundDrawable(null);
        a2Var2.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        a2Var2.setFilters(new InputFilter[]{new b2(1)});
        LinearLayout e = m5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        a7.V(textView, i12, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(cd.L0((h3Var == null && str == null) ? 2131752660 : 2131752674, null));
        frameLayout.addView(textView, b6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        a7.V(textView2, t6.q7, p6Var);
        sc.e.u(textView2, 1, 16.0f, null, 2131752662);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, b6.e(-1, -2, 83));
        Runnable[] runnableArr = {new a3.d(r15, 9)};
        m2 m2Var = new m2(runnableArr, new ValueAnimator[1], textView2, textView, 0);
        a2Var2.addTextChangedListener(new u2(i11, textView2, runnableArr));
        e.addView(frameLayout, b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(a2Var2, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        a2Var.o(e);
        x1Var.a = org.telegram.messenger.i0.L(292.0f);
        a2Var2.setOnEditorActionListener(new v2(a2Var2, i10, h3Var, textView2, m2Var, q20Var, x1VarArr, currentFocus));
        a2Var.k(cd.L0(2131751355, null), new q2(a2Var2, m2Var, i10, h3Var, textView2, q20Var));
        a2Var.h(cd.L0(2131752589, null), new aa.a(7));
        if (z10) {
            f = x1Var;
            r92 = 0;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new c0(1, currentFocus));
            org.telegram.ui.ActionBar.x1 x1Var2 = f;
            final boolean z11 = false ? 1 : 0;
            x1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ag.r2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
                        case 0:
                            a2 a2Var3 = a2Var2;
                            a2Var3.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var3);
                            break;
                        default:
                            a2 a2Var4 = a2Var2;
                            a2Var4.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var4);
                            break;
                    }
                }
            });
            f.r(250L);
        } else {
            r92 = 0;
            x1Var.O = new l(a2Var2, 5);
            x1VarArr[0] = x1Var;
            final int i13 = 1;
            x1Var.setOnDismissListener(new x(a2Var2, i13));
            x1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: ag.r2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            a2 a2Var3 = a2Var2;
                            a2Var3.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var3);
                            break;
                        default:
                            a2 a2Var4 = a2Var2;
                            a2Var4.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var4);
                            break;
                    }
                }
            });
            x1VarArr[0].show();
        }
        x1VarArr[r92].j0 = r92;
        a2Var2.setSelection(a2Var2.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        final int i10 = 1;
        setHasOwnBackground(true);
        final int i11 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setTitle(cd.L0(2131752683, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 7));
        o5 l4 = this.simpleActionBar.l();
        p5 b10 = l4.b(1, R.drawable.msg_edit);
        this.c = b10;
        b10.setContentDescription(cd.L0(2131751336, null));
        l4.b(2, R.drawable.msg_delete).setContentDescription(cd.L0(2131751599, null));
        t2 t2Var = new t2(context, null, i11);
        u51 u51Var = new u51(this, new j20(this) { // from class: ag.o2
            public final /* synthetic */ z2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        z2.Y(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        z2.Z(this.b, (ArrayList) obj, (p51) obj2);
                        break;
                }
            }
        }, new n2(this), new n2(this));
        this.a = u51Var;
        u51Var.r1();
        this.a.setSectionsDrawBackground(true);
        u51 u51Var2 = this.a;
        u51Var2.f3.r = false;
        u51Var2.E1(new j20(this) { // from class: ag.o2
            public final /* synthetic */ z2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        z2.Y(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        z2.Z(this.b, (ArrayList) obj, (p51) obj2);
                        break;
                }
            }
        }, false);
        t2Var.addView(this.a, b6.c(-1.0f, -1));
        this.fragmentView = t2Var;
        return t2Var;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        p51 p51Var;
        if (i10 != zs.F1 || (u51Var = this.a) == null || (p51Var = u51Var.f3) == null) {
            return;
        }
        p51Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void i0(a51 a51Var, View view) {
        h3 h3Var = (h3) a51Var.G;
        y2 y2Var = (y2) view;
        Integer valueOf = Integer.valueOf(h3Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(h3Var.a));
        } else {
            arrayList.add(Integer.valueOf(h3Var.a));
        }
        this.a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(h3Var.a));
        a51Var.e = contains;
        y2Var.d.a(contains, true);
        if (this.simpleActionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.r();
            } else {
                this.simpleActionBar.C();
            }
        }
        this.simpleActionBar.y(Math.max(1, arrayList.size()), true);
        boolean z10 = false;
        boolean z11 = arrayList.size() == 1;
        if (z11) {
            h3 c10 = i3.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !i3.g(c10.b)) {
                z10 = true;
            }
            z11 = z10;
        }
        if (this.e != z11) {
            this.e = z11;
            this.c.Y(z11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.F1);
        i3.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.F1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
