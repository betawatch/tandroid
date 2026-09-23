package hg;

import ai.f5;
import ai.g3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.rc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.m4;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x extends y51 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 d;

    public static void Y(x xVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(xVar.getParentActivity(), xVar.currentAccount, tL_businessChatLink, xVar.resourceProvider);
    }

    public static int a0(ArrayList arrayList) {
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

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, d6 d6Var) {
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, d6Var) : new AlertDialog$Builder(activity, 0, d6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        u uVar = new u(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        uVar.setInputType(49153);
        uVar.setTextSize(1, 18.0f);
        uVar.setText(tL_businessChatLink.title);
        int i11 = h6.j5;
        uVar.setTextColor(h6.v0(i11, d6Var));
        uVar.setHintColor(h6.v0(h6.Xh, d6Var));
        uVar.setCursorColor(h6.w0(null, h6.Wd, false));
        uVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        uVar.setSingleLine(true);
        uVar.setFocusable(true);
        uVar.setLineColors(h6.v0(h6.k6, d6Var), h6.v0(h6.l6, d6Var), h6.v0(h6.p7, d6Var));
        uVar.setImeOptions(6);
        uVar.setBackgroundDrawable(null);
        uVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.z0.f(activity, 1);
        TextView textView = new TextView(activity);
        ul.o(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f7.addView(textView, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(uVar, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(f7);
        b2Var.a = AndroidUtilities.dp(292.0f);
        uVar.setOnEditorActionListener(new q(uVar, i10, tL_businessChatLink, b2VarArr, view, 0));
        e2Var.k(LocaleController.getString(R.string.Done), new gg.d2(uVar, i10, tL_businessChatLink, 1));
        e2Var.h(LocaleController.getString(R.string.Cancel), new r(0));
        if (z10) {
            d = b2Var;
            b2VarArr[0] = b2Var;
            int i12 = 0;
            b2Var.setOnDismissListener(new s(i12, view));
            d.setOnShowListener(new t(i12, uVar));
            d.q(250L);
        } else {
            b2Var.O = new g3(16, view, uVar);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new f5(uVar, 2));
            b2VarArr[0].setOnShowListener(new o(view, uVar, 0));
            b2VarArr[0].show();
        }
        b2VarArr[0].h0 = false;
        uVar.setSelection(uVar.getText().length());
    }

    @Override // org.telegram.ui.Components.y51
    public final void U(ArrayList arrayList, v51 v51Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        h51 h51Var = new h51(2);
        h51Var.l = string;
        h51Var.o = string2;
        h51Var.k = i10;
        arrayList.add(h51Var);
        v51Var.U();
        a0 d10 = a0.d(this.currentAccount);
        if (d10.b.size() < MessagesController.getInstance(d10.a).businessChatLinksLimit) {
            h51 c10 = h51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = a0.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            w wVar = new w();
            wVar.a = (TL_account.TL_businessChatLink) obj;
            h51 h51Var2 = new h51(29);
            h51Var2.G = wVar;
            arrayList.add(h51Var2);
        }
        v51Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String t10 = a4.a.t(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(t10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder h = w.c.h(t10, "+");
            h.append(currentUser.phone);
            arrayList3.add(h.toString());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        String formatString = arrayList3.size() == 2 ? LocaleController.formatString(R.string.BusinessLinksFooterTwoLinks, arrayList3.get(0), arrayList3.get(1)) : LocaleController.formatString(R.string.BusinessLinksFooterOneLink, arrayList3.get(0));
        SpannableString spannableString = new SpannableString(formatString);
        int size2 = arrayList3.size();
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            String str = (String) obj2;
            int indexOf = formatString.indexOf(str);
            if (indexOf > -1) {
                m4 m4Var = new m4(q3.i("https://", str), (n01) null);
                m4Var.f = this;
                spannableString.setSpan(m4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(h51.B(spannableString));
    }

    @Override // org.telegram.ui.Components.y51
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.y51
    public final void W(h51 h51Var, View view) {
        if (h51Var.d == 1) {
            a0 d10 = a0.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.a).sendRequest(createbusinesschatlink, new z(d10, 1));
            return;
        }
        if (h51Var.a == 29) {
            Object obj = h51Var.G;
            if (obj instanceof w) {
                Bundle e = q3.e(6, "chatMode");
                e.putString("business_link", ((w) obj).a.link);
                presentFragment(new xn(e));
            }
        }
    }

    @Override // org.telegram.ui.Components.y51
    public final boolean X(h51 h51Var, View view) {
        if (h51Var.a == 29) {
            Object obj = h51Var.G;
            if (obj instanceof w) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((w) obj).a;
                o70 H = o70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new rc(tL_businessChatLink, 19), false);
                final int i10 = 0;
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) { // from class: hg.p
                    public final /* synthetic */ x b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                x xVar = this.b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                x.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                x xVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                xVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(h6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 1;
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) { // from class: hg.p
                    public final /* synthetic */ x b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                x xVar = this.b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                x.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                x xVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                xVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(h6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i12 = 2;
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: hg.p
                    public final /* synthetic */ x b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                x xVar = this.b;
                                xVar.getClass();
                                Intent intent = new Intent(xVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                xVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                x.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                x xVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xVar2.getParentActivity(), 0, xVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, xVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                xVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(xVar2.getThemedColor(h6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                H.W(this.a.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.y51, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        super.createView(context);
        this.a.p1();
        x51 x51Var = this.a;
        x51Var.Y2.r = false;
        this.actionBar.z(x51Var, true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == NotificationCenter.businessLinksUpdated || i10 == NotificationCenter.privacyRulesUpdated) {
            x51 x51Var = this.a;
            if (x51Var == null || (v51Var = x51Var.Y2) == null) {
                return;
            }
            v51Var.N(true);
            return;
        }
        if (i10 != NotificationCenter.businessLinkCreated) {
            if (i10 == NotificationCenter.needDeleteBusinessLink) {
                a0.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle e = q3.e(6, "chatMode");
            e.putString("business_link", tL_businessChatLink.link);
            presentFragment(new xn(e));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.b2 b2Var = d;
        if (b2Var == null || !b2Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        d.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        a0 d10 = a0.d(this.currentAccount);
        if (d10.d) {
            d10.e(false, true);
        } else {
            d10.e(true, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        qc.e();
        super.onFragmentDestroy();
    }
}
