package hg;

import ai.g5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.m2;
import ci.uc;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k4;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.z51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x extends z51 implements NotificationCenter.NotificationCenterDelegate {
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

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, e6 e6Var) {
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, e6Var) : new AlertDialog$Builder(activity, 0, e6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        u uVar = new u(activity, e6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        uVar.setInputType(49153);
        uVar.setTextSize(1, 18.0f);
        uVar.setText(tL_businessChatLink.title);
        int i11 = i6.j5;
        uVar.setTextColor(i6.v0(i11, e6Var));
        uVar.setHintColor(i6.v0(i6.Xh, e6Var));
        uVar.setCursorColor(i6.w0(null, i6.Wd, false));
        uVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        uVar.setSingleLine(true);
        uVar.setFocusable(true);
        uVar.setLineColors(i6.v0(i6.k6, e6Var), i6.v0(i6.l6, e6Var), i6.v0(i6.p7, e6Var));
        uVar.setImeOptions(6);
        uVar.setBackgroundDrawable(null);
        uVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.y0.f(activity, 1);
        TextView textView = new TextView(activity);
        vl.o(i11, e6Var, textView, 1, 16.0f);
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
            b2Var.O = new m2(15, view, uVar);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new g5(uVar, 2));
            b2VarArr[0].setOnShowListener(new o(view, uVar, 0));
            b2VarArr[0].show();
        }
        b2VarArr[0].h0 = false;
        uVar.setSelection(uVar.getText().length());
    }

    @Override // org.telegram.ui.Components.z51
    public final void U(ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        i51 i51Var = new i51(2);
        i51Var.l = string;
        i51Var.o = string2;
        i51Var.k = i10;
        arrayList.add(i51Var);
        w51Var.U();
        a0 d10 = a0.d(this.currentAccount);
        if (d10.b.size() < MessagesController.getInstance(d10.a).businessChatLinksLimit) {
            i51 c10 = i51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
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
            i51 i51Var2 = new i51(29);
            i51Var2.G = wVar;
            arrayList.add(i51Var2);
        }
        w51Var.T();
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
                k4 k4Var = new k4(q3.i("https://", str), (o01) null);
                k4Var.f = this;
                spannableString.setSpan(k4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(i51.B(spannableString));
    }

    @Override // org.telegram.ui.Components.z51
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.z51
    public final void W(i51 i51Var, View view) {
        if (i51Var.d == 1) {
            a0 d10 = a0.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d10.a).sendRequest(createbusinesschatlink, new z(d10, 1));
            return;
        }
        if (i51Var.a == 29) {
            Object obj = i51Var.G;
            if (obj instanceof w) {
                Bundle e = q3.e(6, "chatMode");
                e.putString("business_link", ((w) obj).a.link);
                presentFragment(new bo(e));
            }
        }
    }

    @Override // org.telegram.ui.Components.z51
    public final boolean X(i51 i51Var, View view) {
        if (i51Var.a == 29) {
            Object obj = i51Var.G;
            if (obj instanceof w) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((w) obj).a;
                n70 H = n70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new uc(tL_businessChatLink, 19), false);
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
                                    textView.setTextColor(xVar2.getThemedColor(i6.q7));
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
                                    textView.setTextColor(xVar2.getThemedColor(i6.q7));
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
                                    textView.setTextColor(xVar2.getThemedColor(i6.q7));
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

    @Override // org.telegram.ui.Components.z51, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        super.createView(context);
        this.a.p1();
        y51 y51Var = this.a;
        y51Var.Y2.r = false;
        this.actionBar.z(y51Var, true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 == NotificationCenter.businessLinksUpdated || i10 == NotificationCenter.privacyRulesUpdated) {
            y51 y51Var = this.a;
            if (y51Var == null || (w51Var = y51Var.Y2) == null) {
                return;
            }
            w51Var.N(true);
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
            presentFragment(new bo(e));
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
        oc.e();
        super.onFragmentDestroy();
    }
}
