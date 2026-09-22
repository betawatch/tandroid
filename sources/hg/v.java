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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.l4;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class v extends p61 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 e;

    public static void Y(v vVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        b0(vVar.getParentActivity(), vVar.currentAccount, tL_businessChatLink, vVar.resourceProvider);
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

    public static void b0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, f6 f6Var) {
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof cw0) && ((cw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z10 ? new org.telegram.ui.ActionBar.e2(activity, 0, f6Var) : new AlertDialog$Builder(activity, 0, f6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        s sVar = new s(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        sVar.setInputType(49153);
        sVar.setTextSize(1, 18.0f);
        sVar.setText(tL_businessChatLink.title);
        int i11 = j6.j5;
        sVar.setTextColor(j6.v0(i11, f6Var));
        sVar.setHintColor(j6.v0(j6.Xh, f6Var));
        sVar.setCursorColor(j6.w0(null, j6.Wd, false));
        sVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        sVar.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout e7 = org.telegram.messenger.l0.e(activity, 1);
        TextView textView = new TextView(activity);
        rk.n(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        e7.addView(textView, y5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(sVar, y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(e7);
        b2Var.a = AndroidUtilities.dp(292.0f);
        sVar.setOnEditorActionListener(new p(sVar, i10, tL_businessChatLink, b2VarArr, view, 0));
        e2Var.k(LocaleController.getString(R.string.Done), new gg.d2(sVar, i10, tL_businessChatLink, 1));
        e2Var.h(LocaleController.getString(R.string.Cancel), new ga.a(1));
        if (z10) {
            e = b2Var;
            b2VarArr[0] = b2Var;
            int i12 = 0;
            b2Var.setOnDismissListener(new q(i12, view));
            e.setOnShowListener(new r(i12, sVar));
            e.q(250L);
        } else {
            b2Var.O = new m2(15, view, sVar);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new g5(sVar, 2));
            b2VarArr[0].setOnShowListener(new n(view, sVar, 0));
            b2VarArr[0].show();
        }
        b2VarArr[0].h0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    @Override // org.telegram.ui.Components.p61
    public final void U(ArrayList arrayList, m61 m61Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        y51 y51Var = new y51(2);
        y51Var.l = string;
        y51Var.o = string2;
        y51Var.k = i10;
        arrayList.add(y51Var);
        m61Var.U();
        y d = y.d(this.currentAccount);
        if (d.b.size() < MessagesController.getInstance(d.a).businessChatLinksLimit) {
            y51 c10 = y51.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = y.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            u uVar = new u();
            uVar.a = (TL_account.TL_businessChatLink) obj;
            y51 y51Var2 = new y51(29);
            y51Var2.G = uVar;
            arrayList.add(y51Var2);
        }
        m61Var.T();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String s10 = a4.a.s(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(s10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (a0(privacyRules) != 1 || a0(privacyRules2) != 2)) {
            StringBuilder h = v7.j0.h(s10, "+");
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
                l4 l4Var = new l4(v7.j0.g("https://", str), (e11) null);
                l4Var.f = this;
                spannableString.setSpan(l4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(y51.B(spannableString));
    }

    @Override // org.telegram.ui.Components.p61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.p61
    public final void W(y51 y51Var, View view) {
        if (y51Var.d == 1) {
            y d = y.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new x(d, 1));
            return;
        }
        if (y51Var.a == 29) {
            Object obj = y51Var.G;
            if (obj instanceof u) {
                Bundle g10 = org.telegram.ui.Cells.c1.g(6, "chatMode");
                g10.putString("business_link", ((u) obj).a.link);
                presentFragment(new zn(g10));
            }
        }
    }

    @Override // org.telegram.ui.Components.p61
    public final boolean X(y51 y51Var, View view) {
        if (y51Var.a == 29) {
            Object obj = y51Var.G;
            if (obj instanceof u) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((u) obj).a;
                y70 H = y70.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new uc(tL_businessChatLink, 19), false);
                final int i10 = 0;
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) { // from class: hg.o
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                v vVar = this.b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                v.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                v vVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                vVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(j6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 1;
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) { // from class: hg.o
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                v vVar = this.b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                v.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                v vVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                vVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(j6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i12 = 2;
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: hg.o
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                v vVar = this.b;
                                vVar.getClass();
                                Intent intent = new Intent(vVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                vVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                v.Y(this.b, tL_businessChatLink);
                                break;
                            default:
                                v vVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vVar2.getParentActivity(), 0, vVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ah.b(14, vVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                vVar2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(vVar2.getThemedColor(j6.q7));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                H.W(this.a.W0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.p61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        super.createView(context);
        this.a.q1();
        o61 o61Var = this.a;
        o61Var.Y2.r = false;
        this.actionBar.z(o61Var, true);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m61 m61Var;
        if (i10 == NotificationCenter.businessLinksUpdated || i10 == NotificationCenter.privacyRulesUpdated) {
            o61 o61Var = this.a;
            if (o61Var == null || (m61Var = o61Var.Y2) == null) {
                return;
            }
            m61Var.N(true);
            return;
        }
        if (i10 != NotificationCenter.businessLinkCreated) {
            if (i10 == NotificationCenter.needDeleteBusinessLink) {
                y.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle g10 = org.telegram.ui.Cells.c1.g(6, "chatMode");
            g10.putString("business_link", tL_businessChatLink.link);
            presentFragment(new zn(g10));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.b2 b2Var = e;
        if (b2Var == null || !b2Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        y d = y.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
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
        pc.e();
        super.onFragmentDestroy();
    }
}
