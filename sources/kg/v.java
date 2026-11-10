package kg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.eb;
import c8.ha;
import fi.v9;
import fi.w3;
import hi.x3;
import java.util.ArrayList;
import jg.a2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v extends o41 implements ls {
    public static org.telegram.ui.ActionBar.u1 e;

    public static void d0(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
    }

    public static int f0(ArrayList arrayList) {
        char c10 = 65535;
        boolean z9 = false;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i7);
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
                z9 = true;
            }
        }
        if (c10 == 0 || (c10 == 65535 && z9)) {
            return 0;
        }
        return c10 == 2 ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void g0(Activity activity, int i7, TL_account.TL_businessChatLink tL_businessChatLink, h6 h6Var) {
        f2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i10 = 1;
        int i11 = 0;
        boolean z9 = Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        ?? w1Var = z9 ? new org.telegram.ui.ActionBar.w1(0, activity, h6Var) : new AlertDialog$Builder(0, activity, h6Var);
        String M0 = id.M0(2131752699, null);
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.R = M0;
        s sVar = new s(activity, h6Var);
        ui.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i12 = m6.j5;
        t6.U(sVar, i12, h6Var);
        t6.l(sVar, 34, m6.Li, h6Var);
        t6.l(sVar, 30, m6.Ke, null);
        sVar.setHintText(id.M0(2131752701, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        t6.F(sVar, m6.k6, m6.l6, m6.p7, h6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        t6.U(textView, i12, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(id.M0(2131752700, null));
        e10.addView(textView, ha.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(sVar, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        w1Var.o(e10);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new p(sVar, i7, tL_businessChatLink, u1VarArr, currentFocus, 0));
        w1Var.k(id.M0(2131751354, null), new a2(sVar, i7, tL_businessChatLink, i10));
        w1Var.h(id.M0(2131752589, null), new x3(15));
        if (z9) {
            e = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new q(i11, currentFocus));
            e.setOnShowListener(new r(sVar, i11));
            e.r(250L);
        } else {
            u1Var.O = new ai.f1(23, currentFocus, sVar);
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new eb(sVar, 5));
            u1VarArr[0].setOnShowListener(new n(currentFocus, sVar, i11));
            u1VarArr[0].show();
        }
        u1VarArr[0].j0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override // org.telegram.ui.Components.o41
    public final void Z(ArrayList arrayList, m41 m41Var) {
        uy0 uy0Var = null;
        String M0 = id.M0(2131752710, null);
        String M02 = id.M0(2131752703, null);
        x31 x31Var = new x31(2);
        x31Var.l = M0;
        x31Var.o = M02;
        x31Var.k = R.raw.biz_links;
        arrayList.add(x31Var);
        m41Var.V();
        y d = y.d(this.currentAccount);
        if (d.b.size() < qp.s1(d.a).H5) {
            x31 c10 = x31.c(1, R.drawable.menu_link_create, id.M0(2131752709, null));
            c10.q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = y.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            u uVar = new u();
            uVar.a = (TL_account.TL_businessChatLink) obj;
            x31 x31Var2 = new x31(29);
            x31Var2.G = uVar;
            arrayList.add(x31Var2);
        }
        m41Var.U();
        TLRPC.User f10 = p10.i(this.currentAccount).f();
        String s5 = a8.p0.s(new StringBuilder(), qp.s1(this.currentAccount).U2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n10 = t10.n(f10);
        if (n10 != null) {
            arrayList3.add(s5 + n10);
        }
        ArrayList v = g5.r(this.currentAccount).v(6);
        ArrayList v10 = g5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f10.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder j3 = rf.b.j(s5, "+");
            j3.append(f10.phone);
            arrayList3.add(j3.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String a02 = arrayList3.size() == 2 ? id.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1)) : id.a0(null, null, 2131752705, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(a02);
        int size2 = arrayList3.size();
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            String str = (String) obj2;
            int indexOf = a02.indexOf(str);
            if (indexOf > -1) {
                h4 h4Var = new h4(rf.b.i("https://", str), uy0Var);
                h4Var.f = this;
                spannableString.setSpan(h4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(x31.C(spannableString));
    }

    @Override // org.telegram.ui.Components.o41
    public final CharSequence a0() {
        return id.M0(2131752710, null);
    }

    @Override // org.telegram.ui.Components.o41
    public final void b0(x31 x31Var, View view) {
        if (x31Var.d == 1) {
            y d = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new x(d, 1));
            return;
        }
        if (x31Var.a == 29) {
            Object obj = x31Var.G;
            if (obj instanceof u) {
                Bundle f10 = rf.b.f(6, "chatMode");
                f10.putString("business_link", ((u) obj).a.link);
                presentFragment(new cn(f10));
            }
        }
    }

    @Override // org.telegram.ui.Components.o41
    public final boolean c0(x31 x31Var, View view) {
        final int i7 = 0;
        if (x31Var.a == 29) {
            Object obj = x31Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).a;
                k60 H = k60.H(this, view);
                H.c(R.drawable.msg_copy, id.M0(2131751767, null), new v9(tL_businessChatLink, 22), false);
                H.c(R.drawable.msg_share, id.M0(2131748925, null), new Runnable(this) { // from class: kg.o
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.b;
                        switch (i10) {
                            case 0:
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                vVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                v.d0(vVar, tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vVar.getParentActivity(), vVar.getResourceProvider());
                                String M0 = id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = id.M0(2131752708, null);
                                alertDialog$Builder.k(id.M0(2131746321, null), new ab.g(20, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(id.M0(2131752589, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    t6.U(textView, m6.q7, vVar.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i10 = 1;
                H.c(R.drawable.msg_edit, id.M0(2131746278, null), new Runnable(this) { // from class: kg.o
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.b;
                        switch (i102) {
                            case 0:
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                vVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                v.d0(vVar, tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vVar.getParentActivity(), vVar.getResourceProvider());
                                String M0 = id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = id.M0(2131752708, null);
                                alertDialog$Builder.k(id.M0(2131746321, null), new ab.g(20, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(id.M0(2131752589, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    t6.U(textView, m6.q7, vVar.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 2;
                H.c(R.drawable.msg_delete, id.M0(2131751598, null), new Runnable(this) { // from class: kg.o
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tL_businessChatLink;
                        v vVar = this.b;
                        switch (i102) {
                            case 0:
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink2.link);
                                vVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                v.d0(vVar, tL_businessChatLink2);
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vVar.getParentActivity(), vVar.getResourceProvider());
                                String M0 = id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = id.M0(2131752708, null);
                                alertDialog$Builder.k(id.M0(2131746321, null), new ab.g(20, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(id.M0(2131752589, null), null);
                                vVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    t6.U(textView, m6.q7, vVar.getResourceProvider());
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

    @Override // org.telegram.ui.Components.o41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(id.M0(2131752710, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.f3.r = false;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 == qs.J1 || i7 == qs.k0) {
            w3 w3Var = this.a;
            if (w3Var == null || (m41Var = w3Var.f3) == null) {
                return;
            }
            m41Var.O(true);
            return;
        }
        if (i7 != qs.K1) {
            if (i7 == qs.L1) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle f10 = rf.b.f(6, "chatMode");
            f10.putString("business_link", tL_businessChatLink.link);
            presentFragment(new cn(f10));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.ActionBar.u1 u1Var = e;
        if (u1Var == null || !u1Var.isShowing()) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.J1);
        getNotificationCenter().c(this, qs.K1);
        getNotificationCenter().c(this, qs.L1);
        getNotificationCenter().c(this, qs.k0);
        y d = y.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        g5.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.J1);
        getNotificationCenter().n(this, qs.K1);
        getNotificationCenter().n(this, qs.L1);
        getNotificationCenter().n(this, qs.k0);
        bc.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
