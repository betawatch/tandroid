package lg;

import ai.h4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.ba;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends h41 implements cs {
    public static org.telegram.ui.ActionBar.s1 e;

    public static void d0(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        g0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
    }

    public static int f0(ArrayList arrayList) {
        char c2 = 65535;
        boolean z10 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i3);
            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants)) {
                if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants)) {
                    if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowUsers)) {
                        if (!(privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers)) {
                            if (!(privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) && c2 == 65535) {
                                c2 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (c2 == 0 || (c2 == 65535 && z10)) {
            return 0;
        }
        return c2 == 2 ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void g0(Activity activity, int i3, TL_account.TL_businessChatLink tL_businessChatLink, e6 e6Var) {
        d2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        int i10 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof qt0) && ((qt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        ?? u1Var = z10 ? new org.telegram.ui.ActionBar.u1(0, activity, e6Var) : new AlertDialog$Builder(0, activity, e6Var);
        String M0 = bd.M0(2131752699, null);
        org.telegram.ui.ActionBar.s1 s1Var = u1Var.a;
        s1Var.S = M0;
        s sVar = new s(activity, e6Var);
        li.b0(i3).M(org.telegram.messenger.g0.G0(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i11 = k6.j5;
        r6.V(sVar, i11, e6Var);
        r6.m(sVar, 34, k6.Li, e6Var);
        r6.m(sVar, 30, k6.Ke, null);
        sVar.setHintText(bd.M0(2131752701, null));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        r6.G(sVar, k6.k6, k6.l6, k6.p7, e6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout e10 = k5.e(activity, 1);
        TextView textView = new TextView(activity);
        r6.V(textView, i11, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(bd.M0(2131752700, null));
        e10.addView(textView, mf.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(sVar, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        u1Var.o(e10);
        s1Var.a = org.telegram.messenger.g0.L(292.0f);
        sVar.setOnEditorActionListener(new q(sVar, i3, tL_businessChatLink, s1VarArr, currentFocus, 0));
        int i12 = 2;
        u1Var.k(bd.M0(2131751355, null), new k2.y(sVar, i3, tL_businessChatLink, i12));
        u1Var.h(bd.M0(2131752589, null), new l2.d(14));
        if (z10) {
            e = s1Var;
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new r(i10, currentFocus));
            e.setOnShowListener(new ai.p(sVar, i12));
            e.r(250L);
        } else {
            s1Var.P = new ai.o1(27, currentFocus, sVar);
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new ba(sVar, 5));
            s1VarArr[0].setOnShowListener(new o(i10, currentFocus, sVar));
            s1VarArr[0].show();
        }
        s1VarArr[0].k0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
        ty0 ty0Var = null;
        String M0 = bd.M0(2131752710, null);
        String M02 = bd.M0(2131752703, null);
        r31 r31Var = new r31(2);
        r31Var.l = M0;
        r31Var.o = M02;
        r31Var.k = R.raw.biz_links;
        arrayList.add(r31Var);
        f41Var.V();
        z d = z.d(this.currentAccount);
        if (d.b.size() < hp.s1(d.a).H5) {
            r31 c2 = r31.c(1, R.drawable.menu_link_create, bd.M0(2131752709, null));
            c2.q = true;
            arrayList.add(c2);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            u uVar = new u();
            uVar.a = (TL_account.TL_businessChatLink) obj;
            r31 r31Var2 = new r31(29);
            r31Var2.G = uVar;
            arrayList.add(r31Var2);
        }
        f41Var.U();
        TLRPC.User f10 = h10.i(this.currentAccount).f();
        String s6 = a1.g.s(new StringBuilder(), hp.s1(this.currentAccount).V2, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String n4 = l10.n(f10);
        if (n4 != null) {
            arrayList3.add(s6 + n4);
        }
        ArrayList v = g5.r(this.currentAccount).v(6);
        ArrayList v10 = g5.r(this.currentAccount).v(7);
        if (!TextUtils.isEmpty(f10.phone) && v != null && v10 != null && (f0(v) != 1 || f0(v10) != 2)) {
            StringBuilder h = t4.c.h(s6, "+");
            h.append(f10.phone);
            arrayList3.add(h.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String a02 = arrayList3.size() == 2 ? bd.a0(null, null, 2131752704, arrayList3.get(0), arrayList3.get(1)) : bd.a0(null, null, 2131752705, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(a02);
        int size2 = arrayList3.size();
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            String str = (String) obj2;
            int indexOf = a02.indexOf(str);
            if (indexOf > -1) {
                g4 g4Var = new g4(t4.c.f("https://", str), ty0Var);
                g4Var.f = this;
                spannableString.setSpan(g4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(r31.C(spannableString));
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131752710, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        if (r31Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new x(d, 1));
            return;
        }
        if (r31Var.a == 29) {
            Object obj = r31Var.G;
            if (obj instanceof u) {
                Bundle k10 = org.telegram.ui.Cells.f1.k(6, "chatMode");
                k10.putString("business_link", ((u) obj).a.link);
                presentFragment(new wm(k10));
            }
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        final int i3 = 0;
        if (r31Var.a == 29) {
            Object obj = r31Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).a;
                f60 H = f60.H(this, view);
                H.c(R.drawable.msg_copy, bd.M0(2131751767, null), new n(tL_businessChatLink, i3), false);
                H.c(R.drawable.msg_share, bd.M0(2131748933, null), new Runnable(this) { // from class: lg.p
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
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
                                String M0 = bd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = bd.M0(2131752708, null);
                                alertDialog$Builder.k(bd.M0(2131746329, null), new ai.n(26, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                vVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.q7, vVar.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i10 = 1;
                H.c(R.drawable.msg_edit, bd.M0(2131746286, null), new Runnable(this) { // from class: lg.p
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
                                String M0 = bd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = bd.M0(2131752708, null);
                                alertDialog$Builder.k(bd.M0(2131746329, null), new ai.n(26, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                vVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.q7, vVar.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 2;
                H.c(R.drawable.msg_delete, bd.M0(2131751599, null), new Runnable(this) { // from class: lg.p
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
                                String M0 = bd.M0(2131752707, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = bd.M0(2131752708, null);
                                alertDialog$Builder.k(bd.M0(2131746329, null), new ai.n(26, vVar, tL_businessChatLink2));
                                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                vVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.q7, vVar.getResourceProvider());
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

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(bd.M0(2131752710, null));
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 == hs.J1 || i3 == hs.k0) {
            h4 h4Var = this.a;
            if (h4Var == null || (f41Var = h4Var.g3) == null) {
                return;
            }
            f41Var.O(true);
            return;
        }
        if (i3 != hs.K1) {
            if (i3 == hs.L1) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle k10 = org.telegram.ui.Cells.f1.k(6, "chatMode");
            k10.putString("business_link", tL_businessChatLink.link);
            presentFragment(new wm(k10));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.s1 s1Var = e;
        if (s1Var == null || !s1Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.J1);
        getNotificationCenter().c(this, hs.K1);
        getNotificationCenter().c(this, hs.L1);
        getNotificationCenter().c(this, hs.k0);
        z d = z.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        g5.r(this.currentAccount).D(false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.J1);
        getNotificationCenter().n(this, hs.K1);
        getNotificationCenter().n(this, hs.L1);
        getNotificationCenter().n(this, hs.k0);
        ac.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
