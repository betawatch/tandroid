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
import bi.v3;
import c8.ja;
import di.r9;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v extends r41 implements is {
    public static org.telegram.ui.ActionBar.t1 e;

    public static void d0(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
    }

    public static int f0(ArrayList arrayList) {
        char c10 = 65535;
        boolean z10 = false;
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
    public static void g0(Activity activity, int i7, TL_account.TL_businessChatLink tL_businessChatLink, e6 e6Var) {
        e2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i10 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        ?? v1Var = z10 ? new org.telegram.ui.ActionBar.v1(0, activity, e6Var) : new AlertDialog$Builder(0, activity, e6Var);
        String M0 = hd.M0(2131752699, null);
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = M0;
        s sVar = new s(activity, e6Var);
        si.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i11 = j6.j5;
        q6.U(sVar, i11, e6Var);
        q6.l(sVar, 34, j6.Oi, e6Var);
        q6.l(sVar, 30, j6.Ne, null);
        sVar.setHintText(hd.M0(2131752701, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        q6.F(sVar, j6.k6, j6.l6, j6.p7, e6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        q6.U(textView, i11, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131752700, null));
        e10.addView(textView, ja.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(sVar, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        v1Var.o(e10);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new q(sVar, i7, tL_businessChatLink, t1VarArr, currentFocus, 0));
        int i12 = 2;
        v1Var.k(hd.M0(2131751354, null), new ai.q1(sVar, i7, tL_businessChatLink, i12));
        v1Var.h(hd.M0(2131752589, null), new i0.b(11));
        if (z10) {
            e = t1Var;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(i10, currentFocus));
            e.setOnShowListener(new bi.l(sVar, i12));
            e.r(250L);
        } else {
            t1Var.P = new ai.u1(21, currentFocus, sVar);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r9(sVar, 5));
            t1VarArr[0].setOnShowListener(new o(currentFocus, sVar, i10));
            t1VarArr[0].show();
        }
        t1VarArr[0].k0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
        wy0 wy0Var = null;
        String M0 = hd.M0(2131752710, null);
        String M02 = hd.M0(2131752703, null);
        b41 b41Var = new b41(2);
        b41Var.l = M0;
        b41Var.o = M02;
        b41Var.k = R.raw.biz_links;
        arrayList.add(b41Var);
        p41Var.V();
        y d = y.d(this.currentAccount);
        if (d.b.size() < np.s1(d.a).I5) {
            b41 c10 = b41.c(1, R.drawable.menu_link_create, hd.M0(2131752709, null));
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
            b41 b41Var2 = new b41(29);
            b41Var2.G = uVar;
            arrayList.add(b41Var2);
        }
        p41Var.U();
        TLRPC.User f10 = m10.i(this.currentAccount).f();
        String s5 = a8.p0.s(new StringBuilder(), np.s1(this.currentAccount).V2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n10 = q10.n(f10);
        if (n10 != null) {
            arrayList3.add(s5 + n10);
        }
        ArrayList v = g5.r(this.currentAccount).v(6);
        ArrayList v10 = g5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f10.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder m10 = r.b.m(s5, "+");
            m10.append(f10.phone);
            arrayList3.add(m10.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String a02 = arrayList3.size() == 2 ? hd.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1)) : hd.a0(null, null, 2131752705, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(a02);
        int size2 = arrayList3.size();
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            String str = (String) obj2;
            int indexOf = a02.indexOf(str);
            if (indexOf > -1) {
                g4 g4Var = new g4(r.b.k("https://", str), wy0Var);
                g4Var.f = this;
                spannableString.setSpan(g4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(b41.C(spannableString));
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131752710, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        if (b41Var.d == 1) {
            y d = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new x(d, 1));
            return;
        }
        if (b41Var.a == 29) {
            Object obj = b41Var.G;
            if (obj instanceof u) {
                Bundle f10 = r.b.f(6, "chatMode");
                f10.putString("business_link", ((u) obj).a.link);
                presentFragment(new an(f10));
            }
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        final int i7 = 0;
        if (b41Var.a == 29) {
            Object obj = b41Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).a;
                m60 H = m60.H(this, view);
                H.c(R.drawable.msg_copy, hd.M0(2131751767, null), new hi.e1(tL_businessChatLink, 25), false);
                H.c(R.drawable.msg_share, hd.M0(2131748925, null), new Runnable(this) { // from class: kg.p
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
                                String M0 = hd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = hd.M0(2131752708, null);
                                alertDialog$Builder.k(hd.M0(2131746321, null), new ab.g(24, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    q6.U(textView, j6.q7, vVar.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i10 = 1;
                H.c(R.drawable.msg_edit, hd.M0(2131746278, null), new Runnable(this) { // from class: kg.p
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
                                String M0 = hd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = hd.M0(2131752708, null);
                                alertDialog$Builder.k(hd.M0(2131746321, null), new ab.g(24, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    q6.U(textView, j6.q7, vVar.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 2;
                H.c(R.drawable.msg_delete, hd.M0(2131751598, null), new Runnable(this) { // from class: kg.p
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
                                String M0 = hd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = M0;
                                t1Var.U = hd.M0(2131752708, null);
                                alertDialog$Builder.k(hd.M0(2131746321, null), new ab.g(24, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                vVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    q6.U(textView, j6.q7, vVar.getResourceProvider());
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

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(hd.M0(2131752710, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 == ns.J1 || i7 == ns.k0) {
            v3 v3Var = this.a;
            if (v3Var == null || (p41Var = v3Var.g3) == null) {
                return;
            }
            p41Var.O(true);
            return;
        }
        if (i7 != ns.K1) {
            if (i7 == ns.L1) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle f10 = r.b.f(6, "chatMode");
            f10.putString("business_link", tL_businessChatLink.link);
            presentFragment(new an(f10));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.t1 t1Var = e;
        if (t1Var == null || !t1Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.J1);
        getNotificationCenter().c(this, ns.K1);
        getNotificationCenter().c(this, ns.L1);
        getNotificationCenter().c(this, ns.k0);
        y d = y.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        g5.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.J1);
        getNotificationCenter().n(this, ns.K1);
        getNotificationCenter().n(this, ns.L1);
        getNotificationCenter().n(this, ns.k0);
        xb.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
