package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bj0 extends org.telegram.ui.Components.sa {
    public static bj0 q0;
    public final zi0 T;
    public final xi0 U;
    public final yi0 V;
    public final wi0 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final HashSet Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public final HashMap c0;
    public final ArrayList d0;
    public final LinkedHashMap e0;
    public String f0;
    public cg.h g0;
    public int h0;
    public int i0;
    public float j0;
    public bg.z2 k0;
    public final int l0;
    public final aj0 m0;
    public final Boolean n0;
    public final Boolean o0;
    public final v5 p0;

    public bj0(org.telegram.ui.ActionBar.o2 o2Var, int i9, Boolean bool, Boolean bool2, aj0 aj0Var) {
        super(o2Var.getParentActivity(), o2Var, true, false, false, 1, o2Var.getResourceProvider());
        this.X = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        HashSet hashSet = new HashSet();
        this.Z = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.a0 = arrayList3;
        this.b0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.c0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.d0 = arrayList4;
        this.e0 = new LinkedHashMap();
        this.h0 = AndroidUtilities.dp(120.0f);
        this.i0 = -1;
        this.p0 = new v5(this, 11);
        this.l0 = i9;
        this.n0 = bool;
        this.o0 = bool2;
        this.m0 = aj0Var;
        this.e.setTitle(y());
        wi0 wi0Var = new wi0(getContext(), this.resourcesProvider);
        this.W = wi0Var;
        wi0Var.setOnCloseClickListener(new ui0(this, 0));
        wi0Var.setText(y());
        wi0Var.setCloseImageVisible(false);
        wi0Var.e.c(0.0f, false);
        this.k0 = new bg.z2(this, 2);
        xi0 xi0Var = new xi0(this, getContext(), this.resourcesProvider);
        this.U = xi0Var;
        int i10 = org.telegram.ui.ActionBar.f6.h5;
        xi0Var.setBackgroundColor(getThemedColor(i10));
        xi0Var.setOnSearchTextChange(new w3(this, 10));
        xi0Var.b.setHintText(LocaleController.getString(R.string.Search), false);
        yi0 yi0Var = new yi0(this, getContext(), 0);
        this.V = yi0Var;
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(wi0Var, 0, g7.e6.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup2.addView(xi0Var, g7.e6.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup3.addView(yi0Var, g7.e6.f(1.0f, 55, i13, 0, i13, 0));
        fg.a aVar = new fg.a(getContext(), this.resourcesProvider, (org.telegram.ui.Components.wk0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        zi0 zi0Var = new zi0(this, getContext(), this.resourcesProvider);
        this.T = zi0Var;
        zi0Var.setOnClickListener(new vi0(this, 0));
        aVar.addView(zi0Var, g7.e6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, g7.e6.f(-2.0f, 87, i14, 0, i14, 0));
        cg.h hVar = this.g0;
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        hVar.h = arrayList;
        hVar.f = wk0Var;
        int i15 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(60.0f));
        this.d.j(new l3(this, 21));
        this.d.setOnItemClickListener(new bg.x2(this, i9, 13));
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.m = false;
        this.d.setItemAnimator(nVar);
        this.d.i(new bg.p2(this, 7));
        xi0Var.setText("");
        xi0Var.d.b(false);
        xi0Var.b(false, hashSet, new ui0(this, 1), null);
        wi0Var.setText(y());
        R(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        T(false, true);
        fixNavigationBar();
    }

    public static void O(bj0 bj0Var, int i9, View view) {
        xi0 xi0Var = bj0Var.U;
        HashSet hashSet = bj0Var.Z;
        if (view instanceof fg.p) {
            TLRPC.User user = ((fg.p) view).getUser();
            long j10 = user.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                bj0Var.e0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i9 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.oc(bj0Var.container, bj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", bj0Var.l0, new Object[0])).k(true);
                try {
                    bj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            xi0Var.b(true, hashSet, new ui0(bj0Var, 2), null);
            bj0Var.T(true, false);
            if (TextUtils.isEmpty(bj0Var.f0)) {
                return;
            }
            bj0Var.f0 = null;
            xi0Var.setText("");
            AndroidUtilities.cancelRunOnUIThread(bj0Var.p0);
            bj0Var.S(true, true);
        }
    }

    public static void P(bj0 bj0Var, String str) {
        TLRPC.User user;
        if (bj0Var.i0 >= 0) {
            ConnectionsManager.getInstance(bj0Var.currentAccount).cancelRequest(bj0Var.i0, true);
            bj0Var.i0 = -1;
        }
        Boolean bool = bj0Var.n0;
        boolean z10 = bool != null && bool.booleanValue();
        eb0 eb0Var = new eb0(1, bj0Var, str);
        int i9 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(i9).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(i9).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(i9);
        String lowerCase = str.toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i10);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.l0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i11);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.l0.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.l0.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        eb0Var.run(arrayList);
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i9) {
        float f10 = AndroidUtilities.statusBarHeight;
        wi0 wi0Var = this.W;
        wi0Var.setTranslationY(Math.max(i9, (((wi0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f10) + AndroidUtilities.dp(8.0f));
        float translationY = wi0Var.getTranslationY() + wi0Var.getMeasuredHeight();
        xi0 xi0Var = this.U;
        xi0Var.setTranslationY(translationY);
        float translationY2 = xi0Var.getTranslationY() + xi0Var.getMeasuredHeight();
        this.V.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (xi0Var.getMeasuredHeight() + wi0Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final boolean Q(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.n0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.o0;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    public final void R(boolean z10) {
        zi0 zi0Var = this.T;
        zi0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Z;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.k0, 0, 1, 33);
            Boolean bool = this.n0;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(this.l0 > 1 ? R.string.ChooseBots : R.string.ChooseBot));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        zi0Var.c(hashSet.size(), true);
        zi0Var.g(spannableStringBuilder, z10, false);
        zi0Var.setEnabled(true);
    }

    public final void S(boolean z10, boolean z11) {
        int i9;
        float f10;
        int i10;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        cg.h hVar;
        ArrayList arrayList3 = this.X;
        arrayList3.clear();
        ArrayList arrayList4 = this.Y;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f0);
        HashSet hashSet = this.Z;
        if (isEmpty) {
            ArrayList arrayList5 = this.a0;
            if (arrayList5.isEmpty()) {
                i9 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList5.size();
                i9 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList5.get(i11);
                    i11++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!user.self && !user.bot && !UserObject.isService(user.id) && !UserObject.isDeleted(user) && Q(user)) {
                        i9 += AndroidUtilities.dp(56.0f);
                        arrayList6.add(cg.g.c(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    i9 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(cg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList6);
                }
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.n0;
            if (bool == null || !bool.booleanValue()) {
                f10 = 32.0f;
            } else {
                ArrayList arrayList7 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size2 = allDialogs.size();
                int i12 = 0;
                while (i12 < size2) {
                    TLRPC.Dialog dialog = allDialogs.get(i12);
                    i12++;
                    TLRPC.Dialog dialog2 = dialog;
                    int i13 = size2;
                    if (dialog2.id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.id));
                        if (Q(user2)) {
                            i9 += AndroidUtilities.dp(56.0f);
                            arrayList7.add(cg.g.c(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    size2 = i13;
                    allDialogs = arrayList2;
                }
                f10 = 32.0f;
                if (!arrayList7.isEmpty()) {
                    i9 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(cg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList7);
                }
            }
            ArrayList arrayList8 = this.d0;
            int size3 = arrayList8.size();
            i10 = i9;
            int i14 = 0;
            while (i14 < size3) {
                Object obj2 = arrayList8.get(i14);
                i14++;
                String str = (String) obj2;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.c0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList8;
                        } else {
                            arrayList = arrayList8;
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (Q(user3)) {
                                i10 += AndroidUtilities.dp(56.0f);
                                arrayList9.add(cg.g.c(user3, hashSet.contains(Long.valueOf(user3.id))));
                                size3 = size3;
                                arrayList8 = arrayList;
                                str = str2;
                                i14 = i14;
                            }
                        }
                        arrayList8 = arrayList;
                        str = str2;
                    }
                    int i15 = size3;
                    int i16 = i14;
                    String str3 = str;
                    ArrayList arrayList10 = arrayList8;
                    if (!arrayList9.isEmpty()) {
                        int dp = AndroidUtilities.dp(f10) + i10;
                        String upperCase = str3.toUpperCase();
                        cg.g gVar = new cg.g(7, false);
                        gVar.g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList9);
                        i10 = dp;
                    }
                    size3 = i15;
                    arrayList8 = arrayList10;
                    i14 = i16;
                }
            }
        } else {
            ArrayList arrayList11 = this.b0;
            int size4 = arrayList11.size();
            i10 = 0;
            int i17 = 0;
            while (i17 < size4) {
                Object obj3 = arrayList11.get(i17);
                i17++;
                TLRPC.User user4 = (TLRPC.User) obj3;
                i10 += AndroidUtilities.dp(56.0f);
                arrayList4.add(cg.g.c(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new cg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        cg.g gVar2 = new cg.g(-1, false);
        gVar2.l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                cg.h hVar2 = this.g0;
                vi0 vi0Var = new vi0(this, 1);
                org.telegram.ui.Cells.v3 v3Var = hVar2.s;
                if (v3Var != null) {
                    v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), vi0Var);
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var2 = this.g0.s;
                if (v3Var2 != null) {
                    v3Var2.setRightText(null);
                }
            }
        }
        if (!z11 || (hVar = this.g0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList3, arrayList4);
        } else {
            hVar.l();
        }
    }

    public final void T(boolean z10, boolean z11) {
        int R;
        S(z10, z11);
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.wk0 wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if ((childAt instanceof fg.p) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.Y;
                    if (i12 < arrayList.size()) {
                        cg.g gVar = (cg.g) arrayList.get(i12);
                        fg.p pVar = (fg.p) childAt;
                        pVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            pVar.i(this.g0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            pVar.i(1.0f, z10);
                        }
                    }
                }
                i11 = R;
            }
            i9++;
        }
        if (z10) {
            this.g0.q(0, i10);
            cg.h hVar = this.g0;
            hVar.q(i11, hVar.h() - i11);
        }
        R(z10);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.U.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        q0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.p0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        S(false, true);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        cg.h hVar = new cg.h(getContext(), this.resourcesProvider, true);
        this.g0 = hVar;
        hVar.r = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        Boolean bool = this.n0;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.l0 > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }
}
