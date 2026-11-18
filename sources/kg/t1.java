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
import bi.i2;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.t9;
import fi.k5;
import hi.f9;
import hi.t6;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t1 extends h2 implements fs {
    public static org.telegram.ui.ActionBar.u1 f;
    public e51 a;
    public final ArrayList b;
    public h5 c;
    public int d;
    public boolean e;

    public t1() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static void Z(t1 t1Var, int i7, ArrayList arrayList) {
        if (i7 == t1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((l41) arrayList.get(i10)).H instanceof v1) {
                    ((v1) ((l41) arrayList.get(i10)).H).c = i10;
                }
            }
            w1 f10 = w1.f(t1Var.currentAccount);
            ArrayList arrayList2 = f10.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = e2.f(((v1) arrayList2.get(i11)).a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((v1) arrayList2.get(i12)).a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = e2.f(((v1) arrayList2.get(i13)).a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.a).sendRequest(tL_messages_reorderQuickReplies, new k5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(t1 t1Var, ArrayList arrayList, z41 z41Var) {
        String M0 = gd.M0(2131752672, null);
        String M02 = gd.M0(2131752659, null);
        l41 l41Var = new l41(2);
        l41Var.m = M0;
        l41Var.p = M02;
        l41Var.n = "RestrictedEmoji";
        l41Var.o = "📝";
        arrayList.add(l41Var);
        z41Var.V();
        w1 f10 = w1.f(t1Var.currentAccount);
        ArrayList arrayList2 = f10.b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            i10 = (i10 != 0 || "hello".equalsIgnoreCase(((v1) arrayList2.get(i12)).b)) ? 1 : 0;
            i11 = (i11 != 0 || "away".equalsIgnoreCase(((v1) arrayList2.get(i12)).b)) ? 1 : 0;
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < mp.u1(f10.a).E5) {
            l41 c10 = l41.c(1, R.drawable.msg_viewintopic, gd.M0(2131752671, null));
            c10.r = true;
            arrayList.add(c10);
        }
        t1Var.d = z41Var.M();
        ArrayList arrayList3 = w1.f(t1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            l41 l41Var2 = new l41(16);
            l41Var2.H = v1Var;
            l41Var2.L(t1Var.b.contains(Integer.valueOf(v1Var.a)));
            arrayList.add(l41Var2);
        }
        z41Var.L();
        z41Var.U();
        arrayList.add(l41.C(gd.M0(2131752670, null)));
    }

    public static void b0(t1 t1Var, l41 l41Var, View view) {
        if (l41Var.d == 1) {
            i0(t1Var.getParentActivity(), t1Var.currentAccount, null, null, t1Var.getResourceProvider(), new t6(t1Var, 11));
            return;
        }
        if (l41Var.a == 16 && (l41Var.H instanceof v1)) {
            if (!t1Var.b.isEmpty()) {
                t1Var.j0(l41Var, view);
                return;
            }
            v1 v1Var = (v1) l41Var.H;
            if (v1Var.g) {
                return;
            }
            Bundle f10 = p5.c.f(5, "chatMode");
            f10.putLong("user_id", t1Var.getUserConfig().e());
            f10.putString("quick_reply", v1Var.b);
            bn bnVar = new bn(f10);
            bnVar.Tb(v1Var.a);
            t1Var.presentFragment(bnVar);
        }
    }

    public static void c0(t1 t1Var) {
        t1Var.b.clear();
        org.telegram.messenger.g0.d0(t1Var.a, new fi.e(4));
        t1Var.simpleActionBar.w();
        t1Var.a.z1(false);
    }

    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static void i0(Activity activity, int i7, String str, v1 v1Var, i6 i6Var, x10 x10Var) {
        ?? r11;
        h2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        boolean z10 = false;
        boolean z11 = Q != null && (Q.getFragmentView() instanceof au0) && ((au0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        AlertDialog$Builder w1Var = z11 ? new org.telegram.ui.ActionBar.w1(0, activity, i6Var) : new AlertDialog$Builder(0, activity, i6Var);
        String M0 = gd.M0((v1Var == null && str == null) ? 2131752648 : 2131752662, null);
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.S = M0;
        final a1 a1Var = new a1(activity, i6Var);
        ri.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        a1Var.setTextSize(1, 18.0f);
        a1Var.setText(v1Var == null ? str == null ? "" : str : v1Var.b);
        int i10 = n6.j5;
        u6.U(a1Var, i10, i6Var);
        u6.l(a1Var, 34, n6.Oi, i6Var);
        a1Var.setHintText(gd.M0(2131752650, null));
        a1Var.setSingleLine(true);
        a1Var.setFocusable(true);
        u6.F(a1Var, n6.k6, n6.l6, n6.p7, i6Var);
        a1Var.setImeOptions(6);
        a1Var.setBackgroundDrawable(null);
        a1Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        a1Var.setFilters(new InputFilter[]{new b1(1)});
        LinearLayout f10 = f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.M0((v1Var == null && str == null) ? 2131752649 : 2131752663, null));
        frameLayout.addView(textView, ma.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        u6.U(textView2, n6.q7, i6Var);
        i5.c.r(16.0f, 1, 2131752651, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ma.e(-1, -2, 83));
        Runnable[] runnableArr = {new j0(r16, 4)};
        i2 i2Var = new i2(runnableArr, new ValueAnimator[1], textView2, textView, 4);
        a1Var.addTextChangedListener(new bi.v(textView2, runnableArr, z10, 8));
        f10.addView(frameLayout, ma.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(a1Var, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        w1Var.o(f10);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        a1Var.setOnEditorActionListener(new p1(a1Var, i7, v1Var, textView2, i2Var, x10Var, u1VarArr, currentFocus));
        w1Var.k(gd.M0(2131751343, null), new m1(a1Var, i2Var, i7, v1Var, textView2, x10Var));
        w1Var.h(gd.M0(2131752578, null), new f9(13));
        if (z11) {
            f = u1Var;
            r11 = 0;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new r(1, currentFocus));
            org.telegram.ui.ActionBar.u1 u1Var2 = f;
            final boolean z12 = false ? 1 : 0;
            u1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.n1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z12) {
                        case 0:
                            a1 a1Var2 = a1Var;
                            a1Var2.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var2);
                            break;
                        default:
                            a1 a1Var3 = a1Var;
                            a1Var3.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var3);
                            break;
                    }
                }
            });
            f.r(250L);
        } else {
            r11 = 0;
            u1Var.P = new t6(a1Var, 12);
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new t9(a1Var, 6));
            final int i11 = 1;
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.n1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            a1 a1Var2 = a1Var;
                            a1Var2.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var2);
                            break;
                        default:
                            a1 a1Var3 = a1Var;
                            a1Var3.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var3);
                            break;
                    }
                }
            });
            u1VarArr[0].show();
        }
        u1VarArr[r11].k0 = r11;
        a1Var.setSelection(a1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        final int i7 = 1;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setTitle(gd.M0(2131752672, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 13));
        g5 q10 = this.simpleActionBar.q();
        h5 b10 = q10.b(1, R.drawable.msg_edit);
        this.c = b10;
        b10.setContentDescription(gd.M0(2131751324, null));
        q10.b(2, R.drawable.msg_delete).setContentDescription(gd.M0(2131751587, null));
        o1 o1Var = new o1(context, null, i10);
        e51 e51Var = new e51(this, new q10(this) { // from class: kg.l1
            public final /* synthetic */ t1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        t1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        t1.a0(this.b, (ArrayList) obj, (z41) obj2);
                        break;
                }
            }
        }, new k1(this), new k1(this));
        this.a = e51Var;
        e51Var.r1();
        this.a.setSectionsDrawBackground(true);
        e51 e51Var2 = this.a;
        e51Var2.g3.r = false;
        e51Var2.E1(new q10(this) { // from class: kg.l1
            public final /* synthetic */ t1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        t1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        t1.a0(this.b, (ArrayList) obj, (z41) obj2);
                        break;
                }
            }
        }, false);
        o1Var.addView(this.a, ma.c(-1.0f, -1));
        this.fragmentView = o1Var;
        return o1Var;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e51 e51Var;
        z41 z41Var;
        if (i7 != ks.F1 || (e51Var = this.a) == null || (z41Var = e51Var.g3) == null) {
            return;
        }
        z41Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(l41 l41Var, View view) {
        v1 v1Var = (v1) l41Var.H;
        s1 s1Var = (s1) view;
        Integer valueOf = Integer.valueOf(v1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(v1Var.a));
        } else {
            arrayList.add(Integer.valueOf(v1Var.a));
        }
        this.a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(v1Var.a));
        l41Var.e = contains;
        s1Var.d.a(contains, true);
        if (this.simpleActionBar.x() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.w();
            } else {
                this.simpleActionBar.J();
            }
        }
        this.simpleActionBar.E(Math.max(1, arrayList.size()), true);
        boolean z10 = false;
        boolean z11 = arrayList.size() == 1;
        if (z11) {
            v1 c10 = w1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !w1.g(c10.b)) {
                z10 = true;
            }
            z11 = z10;
        }
        if (this.e != z11) {
            this.e = z11;
            this.c.Z(z11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.F1);
        w1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.F1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
