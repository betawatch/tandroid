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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dj0 extends org.telegram.ui.Components.qa {
    public static dj0 q0;
    public final bj0 T;
    public final zi0 U;
    public final aj0 V;
    public final yi0 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final HashSet Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public final HashMap c0;
    public final ArrayList d0;
    public final LinkedHashMap e0;
    public String f0;
    public dg.h g0;
    public int h0;
    public int i0;
    public float j0;
    public cg.r2 k0;
    public final int l0;
    public final cj0 m0;
    public final Boolean n0;
    public final Boolean o0;
    public final w5 p0;

    public dj0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Boolean bool, Boolean bool2, cj0 cj0Var) {
        super(n2Var.getParentActivity(), n2Var, true, false, false, 1, n2Var.getResourceProvider());
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
        this.p0 = new w5(this, 11);
        this.l0 = i10;
        this.n0 = bool;
        this.o0 = bool2;
        this.m0 = cj0Var;
        this.e.setTitle(z());
        yi0 yi0Var = new yi0(getContext(), this.resourcesProvider);
        this.W = yi0Var;
        yi0Var.setOnCloseClickListener(new wi0(this, 0));
        yi0Var.setText(z());
        yi0Var.setCloseImageVisible(false);
        yi0Var.e.c(0.0f, false);
        this.k0 = new cg.r2(this, 2);
        zi0 zi0Var = new zi0(this, getContext(), this.resourcesProvider);
        this.U = zi0Var;
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        zi0Var.setBackgroundColor(getThemedColor(i11));
        zi0Var.setOnSearchTextChange(new x3(this, 10));
        zi0Var.b.setHintText(LocaleController.getString(R.string.Search), false);
        aj0 aj0Var = new aj0(this, getContext(), 0);
        this.V = aj0Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView(yi0Var, 0, h7.z5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(zi0Var, h7.z5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(aj0Var, h7.z5.f(1.0f, 55, i14, 0, i14, 0));
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider, (org.telegram.ui.Components.zk0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        bj0 bj0Var = new bj0(this, getContext(), this.resourcesProvider);
        this.T = bj0Var;
        bj0Var.setOnClickListener(new xi0(this, 0));
        aVar.addView(bj0Var, h7.z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, h7.z5.f(-2.0f, 87, i15, 0, i15, 0));
        dg.h hVar = this.g0;
        org.telegram.ui.Components.zk0 zk0Var = this.d;
        hVar.h = arrayList;
        hVar.f = zk0Var;
        int i16 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new m3(this, 21));
        this.d.setOnItemClickListener(new cg.p2(this, i10, 13));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new cg.h2(this, 7));
        zi0Var.setText("");
        zi0Var.d.b(false);
        zi0Var.b(false, hashSet, new wi0(this, 1), null);
        yi0Var.setText(z());
        S(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        U(false, true);
        fixNavigationBar();
    }

    public static void P(dj0 dj0Var, int i10, View view) {
        zi0 zi0Var = dj0Var.U;
        HashSet hashSet = dj0Var.Z;
        if (view instanceof gg.o) {
            TLRPC.User user = ((gg.o) view).getUser();
            long j10 = user.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                dj0Var.e0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.mc(dj0Var.container, dj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", dj0Var.l0, new Object[0])).k(true);
                try {
                    dj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            zi0Var.b(true, hashSet, new wi0(dj0Var, 2), null);
            dj0Var.U(true, false);
            if (TextUtils.isEmpty(dj0Var.f0)) {
                return;
            }
            dj0Var.f0 = null;
            zi0Var.setText("");
            AndroidUtilities.cancelRunOnUIThread(dj0Var.p0);
            dj0Var.T(true, true);
        }
    }

    public static void Q(dj0 dj0Var, String str) {
        TLRPC.User user;
        if (dj0Var.i0 >= 0) {
            ConnectionsManager.getInstance(dj0Var.currentAccount).cancelRequest(dj0Var.i0, true);
            dj0Var.i0 = -1;
        }
        Boolean bool = dj0Var.n0;
        boolean z10 = bool != null && bool.booleanValue();
        ib0 ib0Var = new ib0(1, dj0Var, str);
        int i10 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(i10).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(i10).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        String lowerCase = str.toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i11);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.y1.x(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i12);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.y1.x("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.y1.x("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        ib0Var.run(arrayList);
    }

    @Override // org.telegram.ui.Components.qa
    public final void D(Canvas canvas, int i10) {
        float f10 = AndroidUtilities.statusBarHeight;
        yi0 yi0Var = this.W;
        yi0Var.setTranslationY(Math.max(i10, (((yi0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f10) + AndroidUtilities.dp(8.0f));
        float translationY = yi0Var.getTranslationY() + yi0Var.getMeasuredHeight();
        zi0 zi0Var = this.U;
        zi0Var.setTranslationY(translationY);
        float translationY2 = zi0Var.getTranslationY() + zi0Var.getMeasuredHeight();
        this.V.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (zi0Var.getMeasuredHeight() + yi0Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
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

    public final void S(boolean z10) {
        bj0 bj0Var = this.T;
        bj0Var.setShowZero(false);
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
        bj0Var.c(hashSet.size(), true);
        bj0Var.g(spannableStringBuilder, z10, false);
        bj0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f10;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        dg.h hVar;
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
                i10 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList5.size();
                i10 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!user.self && !user.bot && !UserObject.isService(user.id) && !UserObject.isDeleted(user) && R(user)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList6.add(dg.g.c(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(dg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
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
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.Dialog dialog = allDialogs.get(i13);
                    i13++;
                    TLRPC.Dialog dialog2 = dialog;
                    int i14 = size2;
                    if (dialog2.id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.id));
                        if (R(user2)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList7.add(dg.g.c(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    size2 = i14;
                    allDialogs = arrayList2;
                }
                f10 = 32.0f;
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(dg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList7);
                }
            }
            ArrayList arrayList8 = this.d0;
            int size3 = arrayList8.size();
            i11 = i10;
            int i15 = 0;
            while (i15 < size3) {
                Object obj2 = arrayList8.get(i15);
                i15++;
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
                            if (R(user3)) {
                                i11 += AndroidUtilities.dp(56.0f);
                                arrayList9.add(dg.g.c(user3, hashSet.contains(Long.valueOf(user3.id))));
                                size3 = size3;
                                arrayList8 = arrayList;
                                str = str2;
                                i15 = i15;
                            }
                        }
                        arrayList8 = arrayList;
                        str = str2;
                    }
                    int i16 = size3;
                    int i17 = i15;
                    String str3 = str;
                    ArrayList arrayList10 = arrayList8;
                    if (!arrayList9.isEmpty()) {
                        int dp = AndroidUtilities.dp(f10) + i11;
                        String upperCase = str3.toUpperCase();
                        dg.g gVar = new dg.g(7, false);
                        gVar.g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList9);
                        i11 = dp;
                    }
                    size3 = i16;
                    arrayList8 = arrayList10;
                    i15 = i17;
                }
            }
        } else {
            ArrayList arrayList11 = this.b0;
            int size4 = arrayList11.size();
            i11 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj3 = arrayList11.get(i18);
                i18++;
                TLRPC.User user4 = (TLRPC.User) obj3;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(dg.g.c(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new dg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        dg.g gVar2 = new dg.g(-1, false);
        gVar2.l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                dg.h hVar2 = this.g0;
                xi0 xi0Var = new xi0(this, 1);
                org.telegram.ui.Cells.s3 s3Var = hVar2.s;
                if (s3Var != null) {
                    s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), xi0Var);
                }
            } else {
                org.telegram.ui.Cells.s3 s3Var2 = this.g0.s;
                if (s3Var2 != null) {
                    s3Var2.setRightText(null);
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

    public final void U(boolean z10, boolean z11) {
        int R;
        T(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if ((childAt instanceof gg.o) && (R = RecyclerView.R(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.Y;
                    if (i13 < arrayList.size()) {
                        dg.g gVar = (dg.g) arrayList.get(i13);
                        gg.o oVar = (gg.o) childAt;
                        oVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            oVar.i(this.g0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            oVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i10++;
        }
        if (z10) {
            this.g0.q(0, i11);
            dg.h hVar = this.g0;
            hVar.q(i12, hVar.h() - i12);
        }
        S(z10);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.U.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        q0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.p0);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override // org.telegram.ui.Components.qa
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        dg.h hVar = new dg.h(getContext(), this.resourcesProvider, true);
        this.g0 = hVar;
        hVar.r = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        Boolean bool = this.n0;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.l0 > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }
}
