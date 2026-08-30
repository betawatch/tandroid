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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hj0 extends org.telegram.ui.Components.sa {
    public static hj0 r0;
    public final fj0 U;
    public final ej0 V;
    public final eg.h0 W;
    public final dj0 X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final HashSet a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final HashMap d0;
    public final ArrayList e0;
    public final LinkedHashMap f0;
    public String g0;
    public hg.h h0;
    public int i0;
    public int j0;
    public float k0;
    public gg.o2 l0;
    public final int m0;
    public final gj0 n0;
    public final Boolean o0;
    public final Boolean p0;
    public final z5 q0;

    public hj0(org.telegram.ui.ActionBar.p2 p2Var, int i10, Boolean bool, Boolean bool2, gj0 gj0Var) {
        super(p2Var.getParentActivity(), p2Var, true, false, false, 1, p2Var.getResourceProvider());
        this.Y = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        HashSet hashSet = new HashSet();
        this.a0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.b0 = arrayList3;
        this.c0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.d0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.e0 = arrayList4;
        this.f0 = new LinkedHashMap();
        this.i0 = AndroidUtilities.dp(120.0f);
        this.j0 = -1;
        this.q0 = new z5(this, 11);
        this.m0 = i10;
        this.o0 = bool;
        this.p0 = bool2;
        this.n0 = gj0Var;
        this.e.setTitle(y());
        dj0 dj0Var = new dj0(getContext(), this.resourcesProvider);
        this.X = dj0Var;
        dj0Var.setOnCloseClickListener(new bj0(this, 0));
        dj0Var.setText(y());
        dj0Var.setCloseImageVisible(false);
        dj0Var.e.c(0.0f, false);
        this.l0 = new gg.o2(this, 2);
        ej0 ej0Var = new ej0(this, getContext(), this.resourcesProvider);
        this.V = ej0Var;
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        ej0Var.setBackgroundColor(getThemedColor(i11));
        ej0Var.setOnSearchTextChange(new w3(this, 10));
        ej0Var.b.setHintText(LocaleController.getString(R.string.Search), false);
        eg.h0 h0Var = new eg.h0(this, getContext(), 26);
        this.W = h0Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView(dj0Var, 0, k7.b6.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(ej0Var, k7.b6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(h0Var, k7.b6.f(1.0f, 55, i14, 0, i14, 0));
        kg.a aVar = new kg.a(getContext(), this.resourcesProvider, (org.telegram.ui.Components.sl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        fj0 fj0Var = new fj0(this, getContext(), this.resourcesProvider);
        this.U = fj0Var;
        fj0Var.setOnClickListener(new cj0(this, 0));
        aVar.addView(fj0Var, k7.b6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, k7.b6.f(-2.0f, 87, i15, 0, i15, 0));
        hg.h hVar = this.h0;
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        hVar.h = arrayList;
        hVar.f = sl0Var;
        int i16 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new l3(this, 21));
        this.d.setOnItemClickListener(new gg.m2(this, i10, 14));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new gg.e2(this, 6));
        ej0Var.setText("");
        ej0Var.d.b(false);
        ej0Var.b(false, hashSet, new bj0(this, 1), null);
        dj0Var.setText(y());
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

    public static void P(hj0 hj0Var, int i10, View view) {
        ej0 ej0Var = hj0Var.V;
        HashSet hashSet = hj0Var.a0;
        if (view instanceof kg.n) {
            TLRPC.User user = ((kg.n) view).getUser();
            long j10 = user.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                hj0Var.f0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.qc(hj0Var.container, hj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", hj0Var.m0, new Object[0])).k(true);
                try {
                    hj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            ej0Var.b(true, hashSet, new bj0(hj0Var, 2), null);
            hj0Var.U(true, false);
            if (TextUtils.isEmpty(hj0Var.g0)) {
                return;
            }
            hj0Var.g0 = null;
            ej0Var.setText("");
            AndroidUtilities.cancelRunOnUIThread(hj0Var.q0);
            hj0Var.T(true, true);
        }
    }

    public static void Q(hj0 hj0Var, String str) {
        TLRPC.User user;
        if (hj0Var.j0 >= 0) {
            ConnectionsManager.getInstance(hj0Var.currentAccount).cancelRequest(hj0Var.j0, true);
            hj0Var.j0 = -1;
        }
        Boolean bool = hj0Var.o0;
        boolean z4 = bool != null && bool.booleanValue();
        org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(16, hj0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z4 || !user.bot) && !UserObject.isService(user.id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.y3.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i12);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.y3.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.y3.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        vkVar.run(arrayList);
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i10) {
        float f10 = AndroidUtilities.statusBarHeight;
        dj0 dj0Var = this.X;
        dj0Var.setTranslationY(Math.max(i10, (((dj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f10) + AndroidUtilities.dp(8.0f));
        float translationY = dj0Var.getTranslationY() + dj0Var.getMeasuredHeight();
        ej0 ej0Var = this.V;
        ej0Var.setTranslationY(translationY);
        float translationY2 = ej0Var.getTranslationY() + ej0Var.getMeasuredHeight();
        this.W.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (ej0Var.getMeasuredHeight() + dj0Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.o0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.p0;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    public final void S(boolean z4) {
        fj0 fj0Var = this.U;
        fj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.a0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.l0, 0, 1, 33);
            Boolean bool = this.o0;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(this.m0 > 1 ? R.string.ChooseBots : R.string.ChooseBot));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        fj0Var.c(hashSet.size(), true);
        fj0Var.g(spannableStringBuilder, z4, false);
        fj0Var.setEnabled(true);
    }

    public final void T(boolean z4, boolean z10) {
        int i10;
        float f10;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        hg.h hVar;
        ArrayList arrayList3 = this.Y;
        arrayList3.clear();
        ArrayList arrayList4 = this.Z;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.g0);
        HashSet hashSet = this.a0;
        if (isEmpty) {
            ArrayList arrayList5 = this.b0;
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
                        arrayList6.add(hg.g.c(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(hg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList6);
                }
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.o0;
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
                            arrayList7.add(hg.g.c(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    size2 = i14;
                    allDialogs = arrayList2;
                }
                f10 = 32.0f;
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(hg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList7);
                }
            }
            ArrayList arrayList8 = this.e0;
            int size3 = arrayList8.size();
            i11 = i10;
            int i15 = 0;
            while (i15 < size3) {
                Object obj2 = arrayList8.get(i15);
                i15++;
                String str = (String) obj2;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.d0.get(str);
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
                                arrayList9.add(hg.g.c(user3, hashSet.contains(Long.valueOf(user3.id))));
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
                        hg.g gVar = new hg.g(7, false);
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
            ArrayList arrayList11 = this.c0;
            int size4 = arrayList11.size();
            i11 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj3 = arrayList11.get(i18);
                i18++;
                TLRPC.User user4 = (TLRPC.User) obj3;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(hg.g.c(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new hg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        hg.g gVar2 = new hg.g(-1, false);
        gVar2.l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                hg.h hVar2 = this.h0;
                cj0 cj0Var = new cj0(this, 1);
                org.telegram.ui.Cells.u3 u3Var = hVar2.s;
                if (u3Var != null) {
                    u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), cj0Var);
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var2 = this.h0.s;
                if (u3Var2 != null) {
                    u3Var2.setRightText(null);
                }
            }
        }
        if (!z10 || (hVar = this.h0) == null) {
            return;
        }
        if (z4) {
            hVar.E(arrayList3, arrayList4);
        } else {
            hVar.l();
        }
    }

    public final void U(boolean z4, boolean z10) {
        int R;
        T(z4, z10);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if ((childAt instanceof kg.n) && (R = RecyclerView.R(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.Z;
                    if (i13 < arrayList.size()) {
                        hg.g gVar = (hg.g) arrayList.get(i13);
                        kg.n nVar = (kg.n) childAt;
                        nVar.c(gVar.k, z4);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            nVar.i(this.h0.F(chat) > 200 ? 0.3f : 1.0f, z4);
                        } else {
                            nVar.i(1.0f, z4);
                        }
                    }
                }
                i12 = R;
            }
            i10++;
        }
        if (z4) {
            this.h0.q(0, i11);
            hg.h hVar = this.h0;
            hVar.q(i12, hVar.h() - i12);
        }
        S(z4);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        r0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.q0);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        hg.h hVar = new hg.h(getContext(), this.resourcesProvider, true);
        this.h0 = hVar;
        hVar.r = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        Boolean bool = this.o0;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.m0 > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }
}
