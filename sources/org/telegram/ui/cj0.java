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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class cj0 extends org.telegram.ui.Components.bb {
    public static cj0 u0;
    public final aj0 X;
    public final zi0 Y;
    public final x10 Z;
    public final yi0 a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final HashSet d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public final HashMap g0;
    public final ArrayList h0;
    public final LinkedHashMap i0;
    public String j0;
    public vg.h k0;
    public int l0;
    public int m0;
    public float n0;
    public org.telegram.ui.Components.mb0 o0;
    public final int p0;
    public final bj0 q0;
    public final Boolean r0;
    public final Boolean s0;
    public final a6 t0;

    public cj0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Boolean bool, Boolean bool2, bj0 bj0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
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
        this.t0 = new a6(this, 11);
        this.p0 = i10;
        this.r0 = bool;
        this.s0 = bool2;
        this.q0 = bj0Var;
        this.e.setTitle(A());
        yi0 yi0Var = new yi0(getContext(), this.resourcesProvider);
        this.a0 = yi0Var;
        yi0Var.setOnCloseClickListener(new wi0(this, 0));
        yi0Var.setText(A());
        yi0Var.setCloseImageVisible(false);
        yi0Var.e.c(0.0f, false);
        this.o0 = new org.telegram.ui.Components.mb0(this, 1);
        zi0 zi0Var = new zi0(this, getContext(), this.resourcesProvider);
        this.Y = zi0Var;
        int i11 = org.telegram.ui.ActionBar.h6.h5;
        zi0Var.setBackgroundColor(getThemedColor(i11));
        zi0Var.setOnSearchTextChange(new v3(this, 12));
        zi0Var.b.setHintText(LocaleController.getString(R.string.Search), false);
        x10 x10Var = new x10(this, getContext(), 2);
        this.Z = x10Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView(yi0Var, 0, w7.z5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(zi0Var, w7.z5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(x10Var, w7.z5.f(1.0f, 55, i14, 0, i14, 0));
        ai.bd bdVar = new ai.bd(getContext(), this.resourcesProvider, (org.telegram.ui.Components.im0) null);
        bdVar.setClickable(true);
        bdVar.setOrientation(1);
        bdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        bdVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourcesProvider));
        aj0 aj0Var = new aj0(this, getContext(), this.resourcesProvider);
        this.X = aj0Var;
        aj0Var.setOnClickListener(new xi0(this, 0));
        bdVar.addView(aj0Var, w7.z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(bdVar, w7.z5.f(-2.0f, 87, i15, 0, i15, 0));
        vg.h hVar = this.k0;
        org.telegram.ui.Components.im0 im0Var = this.d;
        hVar.n = arrayList;
        hVar.f = im0Var;
        int i16 = this.backgroundPaddingLeft;
        im0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new k3(this, 21));
        this.d.setOnItemClickListener(new i2.r(this, i10, 15));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new ei.q1(this, 6));
        zi0Var.setText("");
        zi0Var.d.b(false);
        zi0Var.b(false, hashSet, new wi0(this, 1), null);
        yi0Var.setText(A());
        T(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        V(false, true);
        fixNavigationBar();
    }

    public static void Q(cj0 cj0Var, int i10, View view) {
        zi0 zi0Var = cj0Var.Y;
        HashSet hashSet = cj0Var.d0;
        if (view instanceof yg.k) {
            TLRPC.User user = ((yg.k) view).getUser();
            long j10 = user.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                cj0Var.i0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.xc(cj0Var.container, cj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", cj0Var.p0, new Object[0])).k(true);
                try {
                    cj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            zi0Var.b(true, hashSet, new wi0(cj0Var, 2), null);
            cj0Var.V(true, false);
            if (TextUtils.isEmpty(cj0Var.j0)) {
                return;
            }
            cj0Var.j0 = null;
            zi0Var.setText("");
            AndroidUtilities.cancelRunOnUIThread(cj0Var.t0);
            cj0Var.U(true, true);
        }
    }

    public static void R(cj0 cj0Var, String str) {
        TLRPC.User user;
        if (cj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(cj0Var.currentAccount).cancelRequest(cj0Var.m0, true);
            cj0Var.m0 = -1;
        }
        Boolean bool = cj0Var.r0;
        boolean z10 = bool != null && bool.booleanValue();
        org.telegram.ui.Components.qy qyVar = new org.telegram.ui.Components.qy(12, cj0Var, str);
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
                    if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.g0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i12);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.g0.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.g0.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        qyVar.run(arrayList);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        Boolean bool = this.r0;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.p0 > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }

    @Override // org.telegram.ui.Components.bb
    public final void D(Canvas canvas, int i10) {
        float f7 = AndroidUtilities.statusBarHeight;
        yi0 yi0Var = this.a0;
        yi0Var.setTranslationY(Math.max(i10, (((yi0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f7) + AndroidUtilities.dp(8.0f));
        float translationY = yi0Var.getTranslationY() + yi0Var.getMeasuredHeight();
        zi0 zi0Var = this.Y;
        zi0Var.setTranslationY(translationY);
        float translationY2 = zi0Var.getTranslationY() + zi0Var.getMeasuredHeight();
        this.Z.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (zi0Var.getMeasuredHeight() + yi0Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final boolean S(TLRPC.User user) {
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

    public final void T(boolean z10) {
        aj0 aj0Var = this.X;
        aj0Var.setShowZero(false);
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
        aj0Var.b(hashSet.size(), true);
        aj0Var.g(spannableStringBuilder, z10, false);
        aj0Var.setEnabled(true);
    }

    public final void U(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        vg.h hVar;
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
                    if (!user.self && !user.bot && !UserObject.isService(user.id) && !UserObject.isDeleted(user) && S(user)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList6.add(vg.g.c(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                }
                if (!arrayList6.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(vg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
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
                        if (S(user2)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList7.add(vg.g.c(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    f11 = f12;
                    size2 = i14;
                    allDialogs = arrayList2;
                }
                f7 = f11;
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(f7);
                    arrayList4.add(vg.g.b(LocaleController.getString(R.string.SearchApps)));
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
                            if (S(user3)) {
                                i11 += AndroidUtilities.dp(f13);
                                arrayList9.add(vg.g.c(user3, hashSet.contains(Long.valueOf(user3.id))));
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
                        vg.g gVar = new vg.g(7, false);
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
                arrayList4.add(vg.g.c(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new vg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        vg.g gVar2 = new vg.g(-1, false);
        gVar2.l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                vg.h hVar2 = this.k0;
                xi0 xi0Var = new xi0(this, 1);
                org.telegram.ui.Cells.u3 u3Var = hVar2.v;
                if (u3Var != null) {
                    u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), xi0Var);
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var2 = this.k0.v;
                if (u3Var2 != null) {
                    u3Var2.setRightText(null);
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

    public final void V(boolean z10, boolean z11) {
        int R;
        U(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.im0 im0Var = this.d;
            if (i11 >= im0Var.getChildCount()) {
                break;
            }
            View childAt = im0Var.getChildAt(i11);
            if ((childAt instanceof yg.k) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.c0;
                    if (i13 < arrayList.size()) {
                        vg.g gVar = (vg.g) arrayList.get(i13);
                        yg.k kVar = (yg.k) childAt;
                        kVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            kVar.i(this.k0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            kVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i11++;
        }
        if (z10) {
            this.k0.q(0, i10);
            vg.h hVar = this.k0;
            hVar.q(i12, hVar.h() - i12);
        }
        T(z10);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.t0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        U(false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.hm0 x(org.telegram.ui.Components.im0 im0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.k0 = hVar;
        hVar.s = true;
        return hVar;
    }
}
