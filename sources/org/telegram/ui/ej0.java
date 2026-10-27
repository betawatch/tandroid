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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ej0 extends org.telegram.ui.Components.bb {
    public static ej0 u0;
    public final cj0 X;
    public final bj0 Y;
    public final b20 Z;
    public final aj0 a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final HashSet d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public final HashMap g0;
    public final ArrayList h0;
    public final LinkedHashMap i0;
    public String j0;
    public wg.h k0;
    public int l0;
    public int m0;
    public float n0;
    public org.telegram.ui.Components.lb0 o0;
    public final int p0;
    public final dj0 q0;
    public final Boolean r0;
    public final Boolean s0;
    public final y5 t0;

    public ej0(org.telegram.ui.ActionBar.r2 r2Var, int i10, Boolean bool, Boolean bool2, dj0 dj0Var) {
        super(r2Var, true, false, r2Var.getResourceProvider());
        this.b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.e0 = arrayList3;
        this.f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.h0 = arrayList4;
        this.i0 = new LinkedHashMap();
        this.l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.t0 = new y5(this, 12);
        this.p0 = i10;
        this.r0 = bool;
        this.s0 = bool2;
        this.q0 = dj0Var;
        this.e.setTitle(y());
        aj0 aj0Var = new aj0(getContext(), this.resourcesProvider);
        this.a0 = aj0Var;
        aj0Var.setOnCloseClickListener(new yi0(this, 0));
        aj0Var.setText(y());
        aj0Var.setCloseImageVisible(false);
        aj0Var.f.c(0.0f, false);
        this.o0 = new org.telegram.ui.Components.lb0(this, 1);
        bj0 bj0Var = new bj0(this, getContext(), this.resourcesProvider);
        this.Y = bj0Var;
        int i11 = org.telegram.ui.ActionBar.y6.h5;
        org.telegram.ui.ActionBar.f7.i(i11, bj0Var, this.resourcesProvider);
        bj0Var.setOnSearchTextChange(new t3(this, 12));
        bj0Var.b.setHintText(LocaleController.getString(R.string.Search), false);
        b20 b20Var = new b20(this, getContext(), 2);
        this.Z = b20Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView(aj0Var, 0, org.telegram.ui.Components.kb1.j(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(bj0Var, org.telegram.ui.Components.kb1.j(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(b20Var, org.telegram.ui.Components.kb1.j(1.0f, 55, i14, 0, i14, 0));
        bi.sc scVar = new bi.sc(getContext(), this.resourcesProvider, (org.telegram.ui.Components.nm0) null);
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.ActionBar.f7.i(i11, scVar, this.resourcesProvider);
        cj0 cj0Var = new cj0(this, getContext(), this.resourcesProvider);
        this.X = cj0Var;
        cj0Var.setOnClickListener(new zi0(this, 0));
        scVar.addView(cj0Var, org.telegram.ui.Components.kb1.u(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(scVar, org.telegram.ui.Components.kb1.j(-2.0f, 87, i15, 0, i15, 0));
        wg.h hVar = this.k0;
        org.telegram.ui.Components.nm0 nm0Var = this.d;
        hVar.n = arrayList;
        hVar.f = nm0Var;
        int i16 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new i3(this, 22));
        this.d.setOnItemClickListener(new i2.r(this, i10, 15));
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new fi.p1(this, 6));
        bj0Var.setText("");
        bj0Var.d.b(false);
        bj0Var.b(false, hashSet, new yi0(this, 1), null);
        aj0Var.setText(y());
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

    public static void P(ej0 ej0Var, int i10, View view) {
        bj0 bj0Var = ej0Var.Y;
        HashSet hashSet = ej0Var.d0;
        if (view instanceof zg.l) {
            TLRPC.User user = ((zg.l) view).getUser();
            long j10 = user.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                ej0Var.i0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.wc(ej0Var.container, ej0Var.resourcesProvider).R(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", ej0Var.p0, new Object[0])).k(true);
                try {
                    ej0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            bj0Var.b(true, hashSet, new yi0(ej0Var, 2), null);
            ej0Var.U(true, false);
            if (TextUtils.isEmpty(ej0Var.j0)) {
                return;
            }
            ej0Var.j0 = null;
            bj0Var.setText("");
            AndroidUtilities.cancelRunOnUIThread(ej0Var.t0);
            ej0Var.T(true, true);
        }
    }

    public static void Q(ej0 ej0Var, String str) {
        TLRPC.User user;
        if (ej0Var.m0 >= 0) {
            ConnectionsManager.getInstance(ej0Var.currentAccount).cancelRequest(ej0Var.m0, true);
            ej0Var.m0 = -1;
        }
        Boolean bool = ej0Var.r0;
        boolean z10 = bool != null && bool.booleanValue();
        org.telegram.ui.Components.oy oyVar = new org.telegram.ui.Components.oy(14, ej0Var, str);
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
                    if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.wh.u(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i12);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.wh.u("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.wh.u("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        oyVar.run(arrayList);
    }

    @Override // org.telegram.ui.Components.bb
    public final void C(Canvas canvas, int i10) {
        float f7 = AndroidUtilities.statusBarHeight;
        aj0 aj0Var = this.a0;
        aj0Var.setTranslationY(Math.max(i10, (((aj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f7) + AndroidUtilities.dp(8.0f));
        float translationY = aj0Var.getTranslationY() + aj0Var.getMeasuredHeight();
        bj0 bj0Var = this.Y;
        bj0Var.setTranslationY(translationY);
        float translationY2 = bj0Var.getTranslationY() + bj0Var.getMeasuredHeight();
        this.Z.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (bj0Var.getMeasuredHeight() + aj0Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.s0;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    public final void S(boolean z10) {
        cj0 cj0Var = this.X;
        cj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o0, 0, 1, 33);
            Boolean bool = this.r0;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(this.p0 > 1 ? R.string.ChooseBots : R.string.ChooseBot));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        cj0Var.b(hashSet.size(), true);
        cj0Var.i(spannableStringBuilder, z10, false);
        cj0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        wg.h hVar;
        ArrayList arrayList3 = this.b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.j0);
        float f10 = 56.0f;
        HashSet hashSet = this.d0;
        if (isEmpty) {
            ArrayList arrayList5 = this.e0;
            float f11 = 32.0f;
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
                        arrayList6.add(wg.g.c(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(wg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList6);
                }
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.r0;
            if (bool == null || !bool.booleanValue()) {
                f7 = 32.0f;
            } else {
                ArrayList arrayList7 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size2 = allDialogs.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.Dialog dialog = allDialogs.get(i13);
                    i13++;
                    TLRPC.Dialog dialog2 = dialog;
                    float f12 = f11;
                    int i14 = size2;
                    if (dialog2.id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.id));
                        if (R(user2)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList7.add(wg.g.c(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    f11 = f12;
                    size2 = i14;
                    allDialogs = arrayList2;
                }
                f7 = f11;
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(f7);
                    arrayList4.add(wg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList7);
                }
            }
            ArrayList arrayList8 = this.h0;
            int size3 = arrayList8.size();
            i11 = i10;
            int i15 = 0;
            while (i15 < size3) {
                Object obj2 = arrayList8.get(i15);
                i15++;
                String str = (String) obj2;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.g0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f10;
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList8;
                        } else {
                            arrayList = arrayList8;
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (R(user3)) {
                                i11 += AndroidUtilities.dp(f13);
                                arrayList9.add(wg.g.c(user3, hashSet.contains(Long.valueOf(user3.id))));
                                size3 = size3;
                                arrayList8 = arrayList;
                                f10 = f13;
                                str = str2;
                                i15 = i15;
                            }
                        }
                        arrayList8 = arrayList;
                        f10 = f13;
                        str = str2;
                    }
                    float f14 = f10;
                    int i16 = size3;
                    int i17 = i15;
                    String str3 = str;
                    ArrayList arrayList10 = arrayList8;
                    if (!arrayList9.isEmpty()) {
                        int dp = AndroidUtilities.dp(f7) + i11;
                        String upperCase = str3.toUpperCase();
                        wg.g gVar = new wg.g(7, false);
                        gVar.g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList9);
                        i11 = dp;
                    }
                    size3 = i16;
                    arrayList8 = arrayList10;
                    f10 = f14;
                    i15 = i17;
                }
            }
        } else {
            ArrayList arrayList11 = this.f0;
            int size4 = arrayList11.size();
            i11 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj3 = arrayList11.get(i18);
                i18++;
                TLRPC.User user4 = (TLRPC.User) obj3;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(wg.g.c(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new wg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        wg.g gVar2 = new wg.g(-1, false);
        gVar2.l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                wg.h hVar2 = this.k0;
                zi0 zi0Var = new zi0(this, 1);
                org.telegram.ui.Cells.z3 z3Var = hVar2.v;
                if (z3Var != null) {
                    z3Var.a(LocaleController.getString(R.string.UsersDeselectAll), zi0Var);
                }
            } else {
                org.telegram.ui.Cells.z3 z3Var2 = this.k0.v;
                if (z3Var2 != null) {
                    z3Var2.setRightText(null);
                }
            }
        }
        if (!z11 || (hVar = this.k0) == null) {
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
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.nm0 nm0Var = this.d;
            if (i11 >= nm0Var.getChildCount()) {
                break;
            }
            View childAt = nm0Var.getChildAt(i11);
            if ((childAt instanceof zg.l) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.c0;
                    if (i13 < arrayList.size()) {
                        wg.g gVar = (wg.g) arrayList.get(i13);
                        zg.l lVar = (zg.l) childAt;
                        lVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            lVar.i(this.k0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            lVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i11++;
        }
        if (z10) {
            this.k0.q(0, i10);
            wg.h hVar = this.k0;
            hVar.q(i12, hVar.h() - i12);
        }
        S(z10);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.t0);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        wg.h hVar = new wg.h(getContext(), this.resourcesProvider, true);
        this.k0 = hVar;
        hVar.s = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        Boolean bool = this.r0;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.p0 > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }
}
