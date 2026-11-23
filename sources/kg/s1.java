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
import bi.m2;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.u9;
import fi.l5;
import hi.e9;
import hi.s6;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class s1 extends g2 implements gs {
    public static org.telegram.ui.ActionBar.t1 f;
    public h51 a;
    public final ArrayList b;
    public g5 c;
    public int d;
    public boolean e;

    public s1() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static void Z(s1 s1Var, int i7, ArrayList arrayList) {
        if (i7 == s1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((o41) arrayList.get(i10)).H instanceof u1) {
                    ((u1) ((o41) arrayList.get(i10)).H).c = i10;
                }
            }
            v1 f10 = v1.f(s1Var.currentAccount);
            ArrayList arrayList2 = f10.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = e2.f(((u1) arrayList2.get(i11)).a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((u1) arrayList2.get(i12)).a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = e2.f(((u1) arrayList2.get(i13)).a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.a).sendRequest(tL_messages_reorderQuickReplies, new l5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(s1 s1Var, ArrayList arrayList, c51 c51Var) {
        String N0 = hd.N0(2131752671, null);
        String N02 = hd.N0(2131752658, null);
        o41 o41Var = new o41(2);
        o41Var.m = N0;
        o41Var.p = N02;
        o41Var.n = "RestrictedEmoji";
        o41Var.o = "📝";
        arrayList.add(o41Var);
        c51Var.V();
        v1 f10 = v1.f(s1Var.currentAccount);
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
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < np.u1(f10.a).E5) {
            o41 c10 = o41.c(1, R.drawable.msg_viewintopic, hd.N0(2131752670, null));
            c10.r = true;
            arrayList.add(c10);
        }
        s1Var.d = c51Var.M();
        ArrayList arrayList3 = v1.f(s1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            u1 u1Var = (u1) obj;
            o41 o41Var2 = new o41(16);
            o41Var2.H = u1Var;
            o41Var2.L(s1Var.b.contains(Integer.valueOf(u1Var.a)));
            arrayList.add(o41Var2);
        }
        c51Var.L();
        c51Var.U();
        arrayList.add(o41.C(hd.N0(2131752669, null)));
    }

    public static void b0(s1 s1Var, o41 o41Var, View view) {
        if (o41Var.d == 1) {
            i0(s1Var.getParentActivity(), s1Var.currentAccount, null, null, s1Var.getResourceProvider(), new s6(s1Var, 11));
            return;
        }
        if (o41Var.a == 16 && (o41Var.H instanceof u1)) {
            if (!s1Var.b.isEmpty()) {
                s1Var.j0(o41Var, view);
                return;
            }
            u1 u1Var = (u1) o41Var.H;
            if (u1Var.g) {
                return;
            }
            Bundle f10 = p5.c.f(5, "chatMode");
            f10.putLong("user_id", s1Var.getUserConfig().e());
            f10.putString("quick_reply", u1Var.b);
            bn bnVar = new bn(f10);
            bnVar.Tb(u1Var.a);
            s1Var.presentFragment(bnVar);
        }
    }

    public static void c0(s1 s1Var) {
        s1Var.b.clear();
        org.telegram.messenger.g0.d0(s1Var.a, new fi.e(4));
        s1Var.simpleActionBar.w();
        s1Var.a.z1(false);
    }

    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static void i0(Activity activity, int i7, String str, u1 u1Var, h6 h6Var, y10 y10Var) {
        ?? r11;
        g2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        boolean z10 = false;
        boolean z11 = Q != null && (Q.getFragmentView() instanceof du0) && ((du0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        AlertDialog$Builder v1Var = z11 ? new org.telegram.ui.ActionBar.v1(0, activity, h6Var) : new AlertDialog$Builder(0, activity, h6Var);
        String N0 = hd.N0((u1Var == null && str == null) ? 2131752647 : 2131752661, null);
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = N0;
        final z0 z0Var = new z0(activity, h6Var);
        si.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        z0Var.setTextSize(1, 18.0f);
        z0Var.setText(u1Var == null ? str == null ? "" : str : u1Var.b);
        int i10 = m6.j5;
        t6.U(z0Var, i10, h6Var);
        t6.l(z0Var, 34, m6.Oi, h6Var);
        z0Var.setHintText(hd.N0(2131752649, null));
        z0Var.setSingleLine(true);
        z0Var.setFocusable(true);
        t6.F(z0Var, m6.k6, m6.l6, m6.p7, h6Var);
        z0Var.setImeOptions(6);
        z0Var.setBackgroundDrawable(null);
        z0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        z0Var.setFilters(new InputFilter[]{new a1(1)});
        LinearLayout f10 = f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.N0((u1Var == null && str == null) ? 2131752648 : 2131752662, null));
        frameLayout.addView(textView, ma.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        t6.U(textView2, m6.q7, h6Var);
        i5.c.r(16.0f, 1, 2131752650, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ma.e(-1, -2, 83));
        Runnable[] runnableArr = {new i0(r16, 4)};
        m2 m2Var = new m2(runnableArr, new ValueAnimator[1], textView2, textView, 4);
        z0Var.addTextChangedListener(new bi.v(textView2, runnableArr, z10, 8));
        f10.addView(frameLayout, ma.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(z0Var, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        v1Var.o(f10);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        z0Var.setOnEditorActionListener(new o1(z0Var, i7, u1Var, textView2, m2Var, y10Var, t1VarArr, currentFocus));
        v1Var.k(hd.N0(2131751342, null), new l1(z0Var, m2Var, i7, u1Var, textView2, y10Var));
        v1Var.h(hd.N0(2131752577, null), new e9(13));
        if (z11) {
            f = t1Var;
            r11 = 0;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(1, currentFocus));
            org.telegram.ui.ActionBar.t1 t1Var2 = f;
            final boolean z12 = false ? 1 : 0;
            t1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.m1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z12) {
                        case 0:
                            z0 z0Var2 = z0Var;
                            z0Var2.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var2);
                            break;
                        default:
                            z0 z0Var3 = z0Var;
                            z0Var3.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var3);
                            break;
                    }
                }
            });
            f.r(250L);
        } else {
            r11 = 0;
            t1Var.P = new s6(z0Var, 12);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new u9(z0Var, 6));
            final int i11 = 1;
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: kg.m1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            z0 z0Var2 = z0Var;
                            z0Var2.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var2);
                            break;
                        default:
                            z0 z0Var3 = z0Var;
                            z0Var3.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var3);
                            break;
                    }
                }
            });
            t1VarArr[0].show();
        }
        t1VarArr[r11].k0 = r11;
        z0Var.setSelection(z0Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        final int i7 = 1;
        setHasOwnBackground(true);
        final int i10 = 0;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(hd.N0(2131752671, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 13));
        f5 q10 = this.simpleActionBar.q();
        g5 b10 = q10.b(1, R.drawable.msg_edit);
        this.c = b10;
        b10.setContentDescription(hd.N0(2131751323, null));
        q10.b(2, R.drawable.msg_delete).setContentDescription(hd.N0(2131751586, null));
        n1 n1Var = new n1(context, null, i10);
        h51 h51Var = new h51(this, new r10(this) { // from class: kg.k1
            public final /* synthetic */ s1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        s1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        s1.a0(this.b, (ArrayList) obj, (c51) obj2);
                        break;
                }
            }
        }, new j1(this), new j1(this));
        this.a = h51Var;
        h51Var.r1();
        this.a.setSectionsDrawBackground(true);
        h51 h51Var2 = this.a;
        h51Var2.g3.r = false;
        h51Var2.E1(new r10(this) { // from class: kg.k1
            public final /* synthetic */ s1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        s1.Z(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                    default:
                        s1.a0(this.b, (ArrayList) obj, (c51) obj2);
                        break;
                }
            }
        }, false);
        n1Var.addView(this.a, ma.c(-1.0f, -1));
        this.fragmentView = n1Var;
        return n1Var;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h51 h51Var;
        c51 c51Var;
        if (i7 != ls.F1 || (h51Var = this.a) == null || (c51Var = h51Var.g3) == null) {
            return;
        }
        c51Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(o41 o41Var, View view) {
        u1 u1Var = (u1) o41Var.H;
        r1 r1Var = (r1) view;
        Integer valueOf = Integer.valueOf(u1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(u1Var.a));
        } else {
            arrayList.add(Integer.valueOf(u1Var.a));
        }
        this.a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(u1Var.a));
        o41Var.e = contains;
        r1Var.d.a(contains, true);
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ls.F1);
        v1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.F1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
