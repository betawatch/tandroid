package ag;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.i5;
import org.telegram.messenger.m5;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i0 extends s51 implements vs {
    public static org.telegram.ui.ActionBar.x1 e;

    public static void d0(i0 i0Var, TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(i0Var.getParentActivity(), i0Var.currentAccount, tL_businessChatLink, i0Var.resourceProvider);
    }

    public static int f0(ArrayList arrayList) {
        char c10 = 65535;
        boolean z10 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c10 == 65535) {
                                c10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (c10 == 0 || (c10 == 65535 && z10)) {
            return 0;
        }
        return c10 == 2 ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void g0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, p6 p6Var) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.i0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i11 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof vu0) && ((vu0) Q.getFragmentView()).Q() > org.telegram.messenger.i0.L(20.0f);
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        ?? a2Var = z10 ? new org.telegram.ui.ActionBar.a2(0, activity, p6Var) : new AlertDialog$Builder(0, activity, p6Var);
        String L0 = dd.L0(2131752699, null);
        org.telegram.ui.ActionBar.x1 x1Var = a2Var.a;
        x1Var.R = L0;
        f0 f0Var = new f0(activity, p6Var);
        vi.b0(i10).M(org.telegram.messenger.i0.G0(), true);
        f0Var.setInputType(49153);
        f0Var.setTextSize(1, 18.0f);
        f0Var.setText(tL_businessChatLink.title);
        int i12 = t6.j5;
        a7.V(f0Var, i12, p6Var);
        a7.m(f0Var, 34, t6.Li, p6Var);
        a7.m(f0Var, 30, t6.Ke, null);
        f0Var.setHintText(dd.L0(2131752701, null));
        f0Var.setSingleLine(true);
        f0Var.setFocusable(true);
        a7.G(f0Var, t6.k6, t6.l6, t6.p7, p6Var);
        f0Var.setImeOptions(6);
        f0Var.setBackgroundDrawable(null);
        f0Var.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        LinearLayout e7 = m5.e(activity, 1);
        TextView textView = new TextView(activity);
        a7.V(textView, i12, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(dd.L0(2131752700, null));
        e7.addView(textView, b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(f0Var, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        a2Var.o(e7);
        x1Var.a = org.telegram.messenger.i0.L(292.0f);
        f0Var.setOnEditorActionListener(new a0(f0Var, i10, tL_businessChatLink, x1VarArr, currentFocus, 0));
        a2Var.k(dd.L0(2131751355, null), new b0(f0Var, i10, tL_businessChatLink, i11));
        a2Var.h(dd.L0(2131752589, null), new aa.a(6));
        if (z10) {
            e = x1Var;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new c0(i11, currentFocus));
            e.setOnShowListener(new d0(f0Var, i11));
            e.r(250L);
        } else {
            x1Var.O = new e0(i11, currentFocus, f0Var);
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new x(f0Var, i11));
            x1VarArr[0].setOnShowListener(new y(currentFocus, f0Var, i11));
            x1VarArr[0].show();
        }
        x1VarArr[0].j0 = false;
        f0Var.setSelection(f0Var.getText().length());
    }

    @Override // org.telegram.ui.Components.s51
    public final void Z(ArrayList arrayList, q51 q51Var) {
        zz0 zz0Var = null;
        String L0 = dd.L0(2131752710, null);
        String L02 = dd.L0(2131752703, null);
        b51 b51Var = new b51(2);
        b51Var.l = L0;
        b51Var.o = L02;
        b51Var.k = R.raw.biz_links;
        arrayList.add(b51Var);
        q51Var.V();
        s0 d = s0.d(this.currentAccount);
        if (d.b.size() < wp.r1(d.a).I5) {
            b51 c10 = b51.c(1, R.drawable.menu_link_create, dd.L0(2131752709, null));
            c10.q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = s0.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            h0 h0Var = new h0();
            h0Var.a = (TL_account.TL_businessChatLink) obj;
            b51 b51Var2 = new b51(29);
            b51Var2.G = h0Var;
            arrayList.add(b51Var2);
        }
        q51Var.U();
        TLRPC.User f7 = e20.i(this.currentAccount).f();
        String r10 = a1.g.r(new StringBuilder(), wp.r1(this.currentAccount).U2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n10 = i20.n(f7);
        if (n10 != null) {
            arrayList3.add(r10 + n10);
        }
        ArrayList v = i5.r(this.currentAccount).v(6);
        ArrayList v10 = i5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f7.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder i12 = sc.e.i(r10, "+");
            i12.append(f7.phone);
            arrayList3.add(i12.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String a02 = arrayList3.size() == 2 ? dd.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1)) : dd.a0(null, null, 2131752705, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(a02);
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            String str = (String) obj2;
            int indexOf = a02.indexOf(str);
            if (indexOf > -1) {
                f4 f4Var = new f4(sc.e.h("https://", str), zz0Var);
                f4Var.f = this;
                spannableString.setSpan(f4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(b51.C(spannableString));
    }

    @Override // org.telegram.ui.Components.s51
    public final CharSequence a0() {
        return dd.L0(2131752710, null);
    }

    @Override // org.telegram.ui.Components.s51
    public final void b0(b51 b51Var, View view) {
        if (b51Var.d == 1) {
            s0 d = s0.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new m0(d, 1));
            return;
        }
        if (b51Var.a == 29) {
            Object obj = b51Var.G;
            if (obj instanceof h0) {
                Bundle i10 = org.telegram.ui.Cells.f1.i(6, "chatMode");
                i10.putString("business_link", ((h0) obj).a.link);
                presentFragment(new un(i10));
            }
        }
    }

    @Override // org.telegram.ui.Components.s51
    public final boolean c0(b51 b51Var, View view) {
        final int i10 = 0;
        if (b51Var.a == 29) {
            Object obj = b51Var.G;
            if (obj instanceof h0) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((h0) obj).a;
                z60 H = z60.H(this, view);
                H.c(R.drawable.msg_copy, dd.L0(2131751767, null), new a3.d(tL_businessChatLink, 4), false);
                H.c(R.drawable.msg_share, dd.L0(2131748935, null), new Runnable(this) { // from class: ag.z
                    public final /* synthetic */ i0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        i0 i0Var = this.b;
                        switch (i11) {
                            case 0:
                                i0Var.getClass();
                                Intent intent = new Intent(i0Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                i0Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                i0.d0(i0Var, tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getParentActivity(), i0Var.getResourceProvider());
                                String L0 = dd.L0(2131752707, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = dd.L0(2131752708, null);
                                alertDialog$Builder.k(dd.L0(2131746336, null), new m(1, i0Var, tL_businessChatLink2));
                                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                                i0Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    a7.V(textView, t6.q7, i0Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 1;
                H.c(R.drawable.msg_edit, dd.L0(2131746293, null), new Runnable(this) { // from class: ag.z
                    public final /* synthetic */ i0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        i0 i0Var = this.b;
                        switch (i112) {
                            case 0:
                                i0Var.getClass();
                                Intent intent = new Intent(i0Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                i0Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                i0.d0(i0Var, tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getParentActivity(), i0Var.getResourceProvider());
                                String L0 = dd.L0(2131752707, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = dd.L0(2131752708, null);
                                alertDialog$Builder.k(dd.L0(2131746336, null), new m(1, i0Var, tL_businessChatLink2));
                                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                                i0Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    a7.V(textView, t6.q7, i0Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i12 = 2;
                H.c(R.drawable.msg_delete, dd.L0(2131751599, null), new Runnable(this) { // from class: ag.z
                    public final /* synthetic */ i0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        i0 i0Var = this.b;
                        switch (i112) {
                            case 0:
                                i0Var.getClass();
                                Intent intent = new Intent(i0Var.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                i0Var.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                i0.d0(i0Var, tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getParentActivity(), i0Var.getResourceProvider());
                                String L0 = dd.L0(2131752707, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L0;
                                x1Var.T = dd.L0(2131752708, null);
                                alertDialog$Builder.k(dd.L0(2131746336, null), new m(1, i0Var, tL_businessChatLink2));
                                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                                i0Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    a7.V(textView, t6.q7, i0Var.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                H.W(this.a.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.s51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(dd.L0(2131752710, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.f3.r = false;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        q51 q51Var;
        if (i10 == at.J1 || i10 == at.k0) {
            ii iiVar = this.a;
            if (iiVar == null || (q51Var = iiVar.f3) == null) {
                return;
            }
            q51Var.O(true);
            return;
        }
        if (i10 != at.K1) {
            if (i10 == at.L1) {
                s0.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle i12 = org.telegram.ui.Cells.f1.i(6, "chatMode");
            i12.putString("business_link", tL_businessChatLink.link);
            presentFragment(new un(i12));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final uk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.x1 x1Var = e;
        if (x1Var == null || !x1Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.J1);
        getNotificationCenter().c(this, at.K1);
        getNotificationCenter().c(this, at.L1);
        getNotificationCenter().c(this, at.k0);
        s0 d = s0.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        i5.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.J1);
        getNotificationCenter().n(this, at.K1);
        getNotificationCenter().n(this, at.L1);
        getNotificationCenter().n(this, at.k0);
        wb.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
