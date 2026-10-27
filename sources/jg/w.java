package jg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.cb;
import fi.ua;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.e2 e;

    public static void Z(w wVar, TL_account.TL_businessChatLink tL_businessChatLink) {
        c0(wVar.getParentActivity(), wVar.currentAccount, tL_businessChatLink, wVar.resourceProvider);
    }

    public static int b0(ArrayList arrayList) {
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

    public static void c0(Activity activity, int i10, TL_account.TL_businessChatLink tL_businessChatLink, u6 u6Var) {
        r2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof ww0) && ((ww0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f);
        View view = currentFocus;
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        AlertDialog$Builder h2Var = z10 ? new h2(activity, 0, u6Var) : new AlertDialog$Builder(activity, 0, u6Var);
        String string = LocaleController.getString(R.string.BusinessLinksRenameTitle);
        org.telegram.ui.ActionBar.e2 e2Var = h2Var.a;
        e2Var.R = string;
        t tVar = new t(activity, u6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        tVar.setInputType(49153);
        tVar.setTextSize(1, 18.0f);
        tVar.setText(tL_businessChatLink.title);
        int i11 = y6.j5;
        f7.V(tVar, i11, u6Var);
        f7.m(tVar, 34, y6.Xh, u6Var);
        f7.m(tVar, 30, y6.Wd, null);
        tVar.setHintText(LocaleController.getString(R.string.BusinessLinksNamePlaceholder));
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        f7.G(tVar, y6.k6, y6.l6, y6.p7, u6Var);
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        TextView textView = new TextView(activity);
        f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.BusinessLinksRenameMessage));
        f7.addView(textView, kb1.o(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(tVar, kb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        h2Var.o(f7);
        e2Var.a = AndroidUtilities.dp(292.0f);
        tVar.setOnEditorActionListener(new q(tVar, i10, tL_businessChatLink, e2VarArr, view, 0));
        h2Var.k(LocaleController.getString(R.string.Done), new i2.z(tVar, i10, tL_businessChatLink, 2));
        h2Var.h(LocaleController.getString(R.string.Cancel), new j2.d(27));
        if (z10) {
            e = e2Var;
            e2VarArr[0] = e2Var;
            int i12 = 0;
            e2Var.setOnDismissListener(new r(i12, view));
            e.setOnShowListener(new s(tVar, i12));
            e.r(250L);
        } else {
            e2Var.O = new ai.n1(24, view, tVar);
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new cb(tVar, 5));
            e2VarArr[0].setOnShowListener(new o(view, tVar, 0));
            e2VarArr[0].show();
        }
        e2VarArr[0].j0 = false;
        tVar.setSelection(tVar.getText().length());
    }

    @Override // org.telegram.ui.Components.n71
    public final void V(ArrayList arrayList, k71 k71Var) {
        String string = LocaleController.getString(R.string.BusinessLinks);
        String string2 = LocaleController.getString(R.string.BusinessLinksInfo);
        int i10 = R.raw.biz_links;
        u61 u61Var = new u61(2);
        u61Var.l = string;
        u61Var.o = string2;
        u61Var.k = i10;
        arrayList.add(u61Var);
        k71Var.V();
        z d = z.d(this.currentAccount);
        if (d.b.size() < MessagesController.getInstance(d.a).businessChatLinksLimit) {
            u61 c10 = u61.c(1, R.drawable.menu_link_create, LocaleController.getString(R.string.BusinessLinksAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        ArrayList arrayList2 = z.d(this.currentAccount).b;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            v vVar = new v();
            vVar.a = (TL_account.TL_businessChatLink) obj;
            u61 u61Var2 = new u61(29);
            u61Var2.G = vVar;
            arrayList.add(u61Var2);
        }
        k71Var.U();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        String s10 = a1.g.s(new StringBuilder(), MessagesController.getInstance(this.currentAccount).linkPrefix, "/");
        ArrayList arrayList3 = new ArrayList(2);
        String publicUsername = UserObject.getPublicUsername(currentUser);
        if (publicUsername != null) {
            arrayList3.add(s10 + publicUsername);
        }
        ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(6);
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
        if (!TextUtils.isEmpty(currentUser.phone) && privacyRules != null && privacyRules2 != null && (b0(privacyRules) != 1 || b0(privacyRules2) != 2)) {
            StringBuilder l4 = b10.l(s10, "+");
            l4.append(currentUser.phone);
            arrayList3.add(l4.toString());
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
                o4 o4Var = new o4(b10.j("https://", str), (z11) null);
                o4Var.f = this;
                spannableString.setSpan(o4Var, indexOf, str.length() + indexOf, 33);
            }
        }
        arrayList.add(u61.C(spannableString));
    }

    @Override // org.telegram.ui.Components.n71
    public final CharSequence W() {
        return LocaleController.getString(R.string.BusinessLinks);
    }

    @Override // org.telegram.ui.Components.n71
    public final void X(u61 u61Var, View view) {
        if (u61Var.d == 1) {
            z d = z.d(this.currentAccount);
            TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
            createbusinesschatlink.link = tL_inputBusinessChatLink;
            tL_inputBusinessChatLink.message = "";
            ConnectionsManager.getInstance(d.a).sendRequest(createbusinesschatlink, new y(d, 1));
            return;
        }
        if (u61Var.a == 29) {
            Object obj = u61Var.G;
            if (obj instanceof v) {
                Bundle g7 = b10.g(6, "chatMode");
                g7.putString("business_link", ((v) obj).a.link);
                presentFragment(new wn(g7));
            }
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final boolean Y(u61 u61Var, View view) {
        if (u61Var.a == 29) {
            Object obj = u61Var.G;
            if (obj instanceof v) {
                final TL_account.TL_businessChatLink tL_businessChatLink = ((v) obj).a;
                l80 H = l80.H(this, view);
                H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ua(tL_businessChatLink, 23), false);
                final int i10 = 0;
                H.c(R.drawable.msg_share, LocaleController.getString(R.string.LinkActionShare), new Runnable(this) { // from class: jg.p
                    public final /* synthetic */ w b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w wVar = this.b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                w.Z(this.b, tL_businessChatLink);
                                break;
                            default:
                                w wVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.q7, wVar2.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i11 = 1;
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Rename), new Runnable(this) { // from class: jg.p
                    public final /* synthetic */ w b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                w wVar = this.b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                w.Z(this.b, tL_businessChatLink);
                                break;
                            default:
                                w wVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.q7, wVar2.getResourceProvider());
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                final int i12 = 2;
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) { // from class: jg.p
                    public final /* synthetic */ w b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                w wVar = this.b;
                                wVar.getClass();
                                Intent intent = new Intent(wVar.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", tL_businessChatLink.link);
                                wVar.startActivityForResult(intent, 500);
                                break;
                            case 1:
                                w.Z(this.b, tL_businessChatLink);
                                break;
                            default:
                                w wVar2 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wVar2.getParentActivity(), 0, wVar2.getResourceProvider());
                                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessLinksDeleteTitle);
                                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLinksDeleteMessage);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ai.f0(22, wVar2, tL_businessChatLink));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                wVar2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    f7.V(textView, y6.q7, wVar2.getResourceProvider());
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

    @Override // org.telegram.ui.Components.n71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        super.createView(context);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessLinks));
        this.b.setBackground(null);
        this.a.u1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if (i10 == NotificationCenter.businessLinksUpdated || i10 == NotificationCenter.privacyRulesUpdated) {
            m71 m71Var = this.a;
            if (m71Var == null || (k71Var = m71Var.g3) == null) {
                return;
            }
            k71Var.O(true);
            return;
        }
        if (i10 != NotificationCenter.businessLinkCreated) {
            if (i10 == NotificationCenter.needDeleteBusinessLink) {
                z.d(this.currentAccount).a(this, ((TL_account.TL_businessChatLink) objArr[0]).link);
            }
        } else {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) objArr[0];
            Bundle g7 = b10.g(6, "chatMode");
            g7.putString("business_link", tL_businessChatLink.link);
            presentFragment(new wn(g7));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.e2 e2Var = e;
        if (e2Var == null || !e2Var.isShowing()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        e.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.privacyRulesUpdated);
        z d = z.d(this.currentAccount);
        if (d.d) {
            d.e(false, true);
        } else {
            d.e(true, true);
        }
        ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinksUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.businessLinkCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteBusinessLink);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        qc.e();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
