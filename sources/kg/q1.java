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
import bi.eb;
import c8.ha;
import di.s2;
import di.u5;
import fi.h7;
import fi.h9;
import hi.x3;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q1 extends f2 implements ls {
    public static org.telegram.ui.ActionBar.u1 f;
    public q41 a;
    public final ArrayList b;
    public f5 c;
    public int d;
    public boolean e;

    public q1() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static void Z(q1 q1Var, int i7, ArrayList arrayList) {
        if (i7 == q1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((x31) arrayList.get(i10)).G instanceof s1) {
                    ((s1) ((x31) arrayList.get(i10)).G).c = i10;
                }
            }
            t1 f10 = t1.f(q1Var.currentAccount);
            ArrayList arrayList2 = f10.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = com.google.android.recaptcha.internal.a.f(((s1) arrayList2.get(i11)).a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.x(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((s1) arrayList2.get(i12)).a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = com.google.android.recaptcha.internal.a.f(((s1) arrayList2.get(i13)).a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.a).sendRequest(tL_messages_reorderQuickReplies, new u5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(q1 q1Var, ArrayList arrayList, l41 l41Var) {
        String M0 = id.M0(2131752683, null);
        String M02 = id.M0(2131752670, null);
        x31 x31Var = new x31(2);
        x31Var.l = M0;
        x31Var.o = M02;
        x31Var.m = "RestrictedEmoji";
        x31Var.n = "📝";
        arrayList.add(x31Var);
        l41Var.V();
        t1 f10 = t1.f(q1Var.currentAccount);
        ArrayList arrayList2 = f10.b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            i10 = (i10 != 0 || "hello".equalsIgnoreCase(((s1) arrayList2.get(i12)).b)) ? 1 : 0;
            i11 = (i11 != 0 || "away".equalsIgnoreCase(((s1) arrayList2.get(i12)).b)) ? 1 : 0;
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < qp.s1(f10.a).B5) {
            x31 c10 = x31.c(1, R.drawable.msg_viewintopic, id.M0(2131752682, null));
            c10.q = true;
            arrayList.add(c10);
        }
        q1Var.d = l41Var.M();
        ArrayList arrayList3 = t1.f(q1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            s1 s1Var = (s1) obj;
            x31 x31Var2 = new x31(16);
            x31Var2.G = s1Var;
            x31Var2.L(q1Var.b.contains(Integer.valueOf(s1Var.a)));
            arrayList.add(x31Var2);
        }
        l41Var.L();
        l41Var.U();
        arrayList.add(x31.C(id.M0(2131752681, null)));
    }

    public static void b0(q1 q1Var, x31 x31Var, View view) {
        if (x31Var.d == 1) {
            i0(q1Var.getParentActivity(), q1Var.currentAccount, null, null, q1Var.getResourceProvider(), new ii.c(q1Var, 7));
            return;
        }
        if (x31Var.a == 16 && (x31Var.G instanceof s1)) {
            if (!q1Var.b.isEmpty()) {
                q1Var.j0(x31Var, view);
                return;
            }
            s1 s1Var = (s1) x31Var.G;
            if (s1Var.g) {
                return;
            }
            Bundle f10 = rf.b.f(5, "chatMode");
            f10.putLong("user_id", q1Var.getUserConfig().e());
            f10.putString("quick_reply", s1Var.b);
            an anVar = new an(f10);
            anVar.Pb(s1Var.a);
            q1Var.presentFragment(anVar);
        }
    }

    public static void c0(q1 q1Var) {
        q1Var.b.clear();
        org.telegram.messenger.g0.d0(q1Var.a, new di.e(4));
        q1Var.simpleActionBar.r();
        q1Var.a.z1(false);
    }

    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static void i0(Activity activity, int i7, String str, s1 s1Var, f6 f6Var, c20 c20Var) {
        ?? r11;
        f2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        boolean z9 = false;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof rt0) && ((rt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder w1Var = z10 ? new org.telegram.ui.ActionBar.w1(0, activity, f6Var) : new AlertDialog$Builder(0, activity, f6Var);
        String M0 = id.M0((s1Var == null && str == null) ? 2131752659 : 2131752673, null);
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.R = M0;
        final x0 x0Var = new x0(activity, f6Var);
        ui.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        x0Var.setTextSize(1, 18.0f);
        x0Var.setText(s1Var == null ? str == null ? "" : str : s1Var.b);
        int i10 = k6.j5;
        r6.V(x0Var, i10, f6Var);
        r6.m(x0Var, 34, k6.Li, f6Var);
        x0Var.setHintText(id.M0(2131752661, null));
        x0Var.setSingleLine(true);
        x0Var.setFocusable(true);
        r6.G(x0Var, k6.k6, k6.l6, k6.p7, f6Var);
        x0Var.setImeOptions(6);
        x0Var.setBackgroundDrawable(null);
        x0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        x0Var.setFilters(new InputFilter[]{new y0(1)});
        LinearLayout e10 = k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(id.M0((s1Var == null && str == null) ? 2131752660 : 2131752674, null));
        frameLayout.addView(textView, ha.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        r6.V(textView2, k6.q7, f6Var);
        jg.g.v(textView2, 1, 16.0f, null, 2131752662);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ha.e(-1, -2, 83));
        Runnable[] runnableArr = {new h9(r16, 28)};
        s2 s2Var = new s2(runnableArr, new ValueAnimator[1], textView2, textView, 3);
        x0Var.addTextChangedListener(new h7(textView2, runnableArr, z9, 1));
        e10.addView(frameLayout, ha.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(x0Var, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        w1Var.o(e10);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        x0Var.setOnEditorActionListener(new m1(x0Var, i7, s1Var, textView2, s2Var, c20Var, u1VarArr, currentFocus));
        w1Var.k(id.M0(2131751355, null), new j1(x0Var, s2Var, i7, s1Var, textView2, c20Var));
        w1Var.h(id.M0(2131752589, null), new x3(16));
        if (z10) {
            f = u1Var;
            r11 = 0;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new q(1, currentFocus));
            org.telegram.ui.ActionBar.u1 u1Var2 = f;
            final boolean z11 = false ? 1 : 0;
            u1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.k1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var2);
                            break;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var3);
                            break;
                    }
                }
            });
            f.r(250L);
        } else {
            r11 = 0;
            u1Var.O = new ii.c(x0Var, 8);
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new eb(x0Var, 6));
            final int i11 = 1;
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.k1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var2);
                            break;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var3);
                            break;
                    }
                }
            });
            u1VarArr[0].show();
        }
        u1VarArr[r11].j0 = r11;
        x0Var.setSelection(x0Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        final int i7 = 1;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new y1(false));
        this.simpleActionBar.setTitle(id.M0(2131752683, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 18));
        e5 l10 = this.simpleActionBar.l();
        f5 b10 = l10.b(1, R.drawable.msg_edit);
        this.c = b10;
        b10.setContentDescription(id.M0(2131751336, null));
        l10.b(2, R.drawable.msg_delete).setContentDescription(id.M0(2131751599, null));
        l1 l1Var = new l1(context, null, i10);
        q41 q41Var = new q41(this, new v10(this) { // from class: kg.i1
            public final /* synthetic */ q1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        q1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        q1.a0(this.b, (ArrayList) obj, (l41) obj2);
                        break;
                }
            }
        }, new h1(this), new h1(this));
        this.a = q41Var;
        q41Var.r1();
        this.a.setSectionsDrawBackground(true);
        q41 q41Var2 = this.a;
        q41Var2.f3.r = false;
        q41Var2.E1(new v10(this) { // from class: kg.i1
            public final /* synthetic */ q1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        q1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        q1.a0(this.b, (ArrayList) obj, (l41) obj2);
                        break;
                }
            }
        }, false);
        l1Var.addView(this.a, ha.c(-1.0f, -1));
        this.fragmentView = l1Var;
        return l1Var;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        q41 q41Var;
        l41 l41Var;
        if (i7 != qs.F1 || (q41Var = this.a) == null || (l41Var = q41Var.f3) == null) {
            return;
        }
        l41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(x31 x31Var, View view) {
        s1 s1Var = (s1) x31Var.G;
        p1 p1Var = (p1) view;
        Integer valueOf = Integer.valueOf(s1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(s1Var.a));
        } else {
            arrayList.add(Integer.valueOf(s1Var.a));
        }
        this.a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(s1Var.a));
        x31Var.e = contains;
        p1Var.d.a(contains, true);
        if (this.simpleActionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.r();
            } else {
                this.simpleActionBar.B();
            }
        }
        this.simpleActionBar.x(Math.max(1, arrayList.size()), true);
        boolean z9 = false;
        boolean z10 = arrayList.size() == 1;
        if (z10) {
            s1 c10 = t1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !t1.g(c10.b)) {
                z9 = true;
            }
            z10 = z9;
        }
        if (this.e != z10) {
            this.e = z10;
            this.c.Y(z10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.F1);
        t1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.F1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
