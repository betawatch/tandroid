package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class is0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ eu0 d;

    public is0(eu0 eu0Var, long j10, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        this.d = eu0Var;
        this.a = j10;
        this.b = b6Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0345  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ih.v6 storiesController;
        char c10;
        boolean z10;
        boolean z11;
        ?? r82;
        ih.n6 n6Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.g1 g1Var;
        boolean z12;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        ?? r11;
        du0 j12;
        final eu0 eu0Var = this.d;
        tt0[] tt0VarArr = eu0Var.p1;
        vq0 vq0Var = eu0Var.R;
        ImageView imageView = eu0Var.n0;
        uq0 uq0Var = eu0Var.Q;
        int closestTab = eu0Var.getClosestTab();
        boolean p02 = eu0.p0(closestTab);
        final org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        MessagesController messagesController = MessagesController.getInstance(o2Var.getCurrentAccount());
        long j10 = eu0Var.f1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        storiesController = eu0Var.getStoriesController();
        boolean i9 = storiesController.i(j10);
        if (eu0.w0(closestTab) && i9 && (j12 = eu0Var.j1(closestTab)) != null) {
            final int i10 = j12.b;
            final x60 H = x60.H(o2Var, imageView);
            int i11 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i12 = 0;
            final long j11 = this.a;
            H.c(i11, string, new Runnable() { // from class: org.telegram.ui.Components.nq0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            eu0Var.O0(o2Var, j11, i10);
                            H.u();
                            break;
                        default:
                            eu0Var.P0(o2Var, j11, i10);
                            H.u();
                            break;
                    }
                }
            }, false);
            eu0Var.x(H, o2Var, j11, i10);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new org.telegram.ui.rl(eu0Var, i10, H, 12), false);
            final int i13 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.nq0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            eu0Var.O0(o2Var, j11, i10);
                            H.u();
                            break;
                        default:
                            eu0Var.P0(o2Var, j11, i10);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            eu0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i14 = 5;
        if (closestTab == 14) {
            fh.y3 currentPage = vq0Var.getCurrentPage();
            gh.n7 n7Var = currentPage.e;
            if (n7Var == null) {
                return;
            }
            long j13 = vq0Var.c;
            int i15 = vq0Var.b;
            boolean canUserDoAction = j13 == UserConfig.getInstance(i15).getClientUserId() ? true : j13 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i15).getChat(Long.valueOf(-j13)), 5);
            final x60 H2 = x60.H(o2Var, imageView);
            if (n7Var.c) {
                g1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, H2.e, H2.d, false, false);
                H2.d(g1Var4);
                g1Var = g1Var4;
                z12 = true;
            }
            if (vq0Var.b()) {
                final int i16 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.ds0
                    public final /* synthetic */ is0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                vq0 vq0Var2 = this.b.d.R;
                                vq0Var2.getClass();
                                vq0Var2.h(null, new fh.s2(vq0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                is0 is0Var = this.b;
                                is0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                eu0 eu0Var2 = is0Var.d;
                                bundle.putLong("dialog_id", -eu0Var2.Z0.id);
                                k90 k90Var = new k90(bundle, null);
                                k90Var.c = eu0Var2.Z0;
                                eu0Var2.r1.presentFragment(k90Var);
                                H2.u();
                                break;
                            default:
                                this.b.d.R.setReordering(true);
                                H2.u();
                                break;
                        }
                    }
                }, false);
                z12 = true;
            }
            if (vq0Var.e.h()) {
                if (!n7Var.h().isEmpty() || currentPage.d) {
                    final int i17 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.ds0
                        public final /* synthetic */ is0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    vq0 vq0Var2 = this.b.d.R;
                                    vq0Var2.getClass();
                                    vq0Var2.h(null, new fh.s2(vq0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    is0 is0Var = this.b;
                                    is0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    eu0 eu0Var2 = is0Var.d;
                                    bundle.putLong("dialog_id", -eu0Var2.Z0.id);
                                    k90 k90Var = new k90(bundle, null);
                                    k90Var.c = eu0Var2.Z0;
                                    eu0Var2.r1.presentFragment(k90Var);
                                    H2.u();
                                    break;
                                default:
                                    this.b.d.R.setReordering(true);
                                    H2.u();
                                    break;
                            }
                        }
                    }, false);
                }
                z12 = true;
            }
            if (z12) {
                H2.k();
            }
            org.telegram.ui.ActionBar.g1 h = H2.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.g1 h10 = H2.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.g1 h11 = H2.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.g1 h12 = H2.h();
            h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                H2.k();
                org.telegram.ui.ActionBar.g1 h13 = H2.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.g1 h14 = H2.h();
                h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                g1Var3 = h14;
                g1Var2 = h13;
            } else {
                g1Var2 = null;
                g1Var3 = null;
            }
            fh.z3 z3Var = new fh.z3(g1Var, n7Var, h, h10, h11, h12, canUserDoAction, g1Var2, g1Var3);
            org.telegram.ui.ActionBar.g1 g1Var5 = g1Var;
            org.telegram.ui.ActionBar.g1 g1Var6 = g1Var2;
            org.telegram.ui.ActionBar.g1 g1Var7 = g1Var3;
            z3Var.run();
            if (g1Var5 != null) {
                r11 = 1;
                g1Var5.setOnClickListener(new vh0(1 == true ? 1 : 0, n7Var, z3Var));
            } else {
                r11 = 1;
            }
            fh.j4.j(h, n7Var, z3Var, r11);
            fh.j4.j(h10, n7Var, z3Var, 2);
            fh.j4.j(h11, n7Var, z3Var, 4);
            fh.j4.j(h12, n7Var, z3Var, 8);
            if (canUserDoAction) {
                fh.j4.j(g1Var6, n7Var, z3Var, 256);
                fh.j4.j(g1Var7, n7Var, z3Var, 512);
            }
            H2.Y = r11;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && uq0Var != null) {
            x60 H3 = x60.H(o2Var, imageView);
            boolean z13 = uq0Var.getItemsCount() < o2Var.getMessagesController().botPreviewMediasMax;
            final int i18 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.es0
                public final /* synthetic */ is0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            eu0 eu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var2.r1;
                            kh.wb E = kh.wb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = eu0Var2.f1;
                            String currentLang = eu0Var2.Q.getCurrentLang();
                            E.r0 = j14;
                            E.s0 = currentLang;
                            E.R(null);
                            E.r0 = j14;
                            E.s0 = currentLang;
                            break;
                        case 1:
                            this.b.d.Q.f();
                            break;
                        case 2:
                            uq0 uq0Var2 = this.b.d.Q;
                            if (!uq0Var2.d()) {
                                uq0Var2.f();
                                break;
                            } else {
                                uq0Var2.h();
                                break;
                            }
                        case 3:
                            uq0 uq0Var3 = this.b.d.Q;
                            uq0Var3.b(uq0Var3.getCurrentLang());
                            break;
                        case 4:
                            eu0 eu0Var3 = this.b.d;
                            eu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            eu0 eu0Var4 = this.b.d;
                            try {
                                eu0Var4.r1.getMediaDataController().installShortcut(eu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            is0 is0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = is0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            y4.s(o2Var4, false, null, currentUser, false, true, false, true, new g1(24, is0Var, currentUser));
                            break;
                    }
                }
            }, z13);
            final int i19 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.es0
                public final /* synthetic */ is0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            eu0 eu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var2.r1;
                            kh.wb E = kh.wb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = eu0Var2.f1;
                            String currentLang = eu0Var2.Q.getCurrentLang();
                            E.r0 = j14;
                            E.s0 = currentLang;
                            E.R(null);
                            E.r0 = j14;
                            E.s0 = currentLang;
                            break;
                        case 1:
                            this.b.d.Q.f();
                            break;
                        case 2:
                            uq0 uq0Var2 = this.b.d.Q;
                            if (!uq0Var2.d()) {
                                uq0Var2.f();
                                break;
                            } else {
                                uq0Var2.h();
                                break;
                            }
                        case 3:
                            uq0 uq0Var3 = this.b.d.Q;
                            uq0Var3.b(uq0Var3.getCurrentLang());
                            break;
                        case 4:
                            eu0 eu0Var3 = this.b.d;
                            eu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            eu0 eu0Var4 = this.b.d;
                            try {
                                eu0Var4.r1.getMediaDataController().installShortcut(eu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            is0 is0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = is0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            y4.s(o2Var4, false, null, currentUser, false, true, false, true, new g1(24, is0Var, currentUser));
                            break;
                    }
                }
            }, uq0Var.getItemsCount() > 1 && !uq0Var.d());
            final int i20 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(uq0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.es0
                public final /* synthetic */ is0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            eu0 eu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var2.r1;
                            kh.wb E = kh.wb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = eu0Var2.f1;
                            String currentLang = eu0Var2.Q.getCurrentLang();
                            E.r0 = j14;
                            E.s0 = currentLang;
                            E.R(null);
                            E.r0 = j14;
                            E.s0 = currentLang;
                            break;
                        case 1:
                            this.b.d.Q.f();
                            break;
                        case 2:
                            uq0 uq0Var2 = this.b.d.Q;
                            if (!uq0Var2.d()) {
                                uq0Var2.f();
                                break;
                            } else {
                                uq0Var2.h();
                                break;
                            }
                        case 3:
                            uq0 uq0Var3 = this.b.d.Q;
                            uq0Var3.b(uq0Var3.getCurrentLang());
                            break;
                        case 4:
                            eu0 eu0Var3 = this.b.d;
                            eu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            eu0 eu0Var4 = this.b.d;
                            try {
                                eu0Var4.r1.getMediaDataController().installShortcut(eu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            is0 is0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = is0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            y4.s(o2Var4, false, null, currentUser, false, true, false, true, new g1(24, is0Var, currentUser));
                            break;
                    }
                }
            }, uq0Var.getItemsCount() > 0);
            final int i21 = 3;
            H3.m(!TextUtils.isEmpty(uq0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, z21.D(uq0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.es0
                public final /* synthetic */ is0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            eu0 eu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var2.r1;
                            kh.wb E = kh.wb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = eu0Var2.f1;
                            String currentLang = eu0Var2.Q.getCurrentLang();
                            E.r0 = j14;
                            E.s0 = currentLang;
                            E.R(null);
                            E.r0 = j14;
                            E.s0 = currentLang;
                            break;
                        case 1:
                            this.b.d.Q.f();
                            break;
                        case 2:
                            uq0 uq0Var2 = this.b.d.Q;
                            if (!uq0Var2.d()) {
                                uq0Var2.f();
                                break;
                            } else {
                                uq0Var2.h();
                                break;
                            }
                        case 3:
                            uq0 uq0Var3 = this.b.d.Q;
                            uq0Var3.b(uq0Var3.getCurrentLang());
                            break;
                        case 4:
                            eu0 eu0Var3 = this.b.d;
                            eu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            eu0 eu0Var4 = this.b.d;
                            try {
                                eu0Var4.r1.getMediaDataController().installShortcut(eu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            is0 is0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = is0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            y4.s(o2Var4, false, null, currentUser, false, true, false, true, new g1(24, is0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        final int i22 = 6;
        if (eu0Var.getSelectedTab() == 11) {
            x60 H4 = x60.H(o2Var, imageView);
            final int i23 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.es0
                public final /* synthetic */ is0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            eu0 eu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var2.r1;
                            kh.wb E = kh.wb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = eu0Var2.f1;
                            String currentLang = eu0Var2.Q.getCurrentLang();
                            E.r0 = j14;
                            E.s0 = currentLang;
                            E.R(null);
                            E.r0 = j14;
                            E.s0 = currentLang;
                            break;
                        case 1:
                            this.b.d.Q.f();
                            break;
                        case 2:
                            uq0 uq0Var2 = this.b.d.Q;
                            if (!uq0Var2.d()) {
                                uq0Var2.f();
                                break;
                            } else {
                                uq0Var2.h();
                                break;
                            }
                        case 3:
                            uq0 uq0Var3 = this.b.d.Q;
                            uq0Var3.b(uq0Var3.getCurrentLang());
                            break;
                        case 4:
                            eu0 eu0Var3 = this.b.d;
                            eu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            eu0 eu0Var4 = this.b.d;
                            try {
                                eu0Var4.r1.getMediaDataController().installShortcut(eu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            is0 is0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = is0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            y4.s(o2Var4, false, null, currentUser, false, true, false, true, new g1(24, is0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.es0
                public final /* synthetic */ is0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            eu0 eu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var2.r1;
                            kh.wb E = kh.wb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = eu0Var2.f1;
                            String currentLang = eu0Var2.Q.getCurrentLang();
                            E.r0 = j14;
                            E.s0 = currentLang;
                            E.R(null);
                            E.r0 = j14;
                            E.s0 = currentLang;
                            break;
                        case 1:
                            this.b.d.Q.f();
                            break;
                        case 2:
                            uq0 uq0Var2 = this.b.d.Q;
                            if (!uq0Var2.d()) {
                                uq0Var2.f();
                                break;
                            } else {
                                uq0Var2.h();
                                break;
                            }
                        case 3:
                            uq0 uq0Var3 = this.b.d.Q;
                            uq0Var3.b(uq0Var3.getCurrentLang());
                            break;
                        case 4:
                            eu0 eu0Var3 = this.b.d;
                            eu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            eu0 eu0Var4 = this.b.d;
                            try {
                                eu0Var4.r1.getMediaDataController().installShortcut(eu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            is0 is0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = is0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            y4.s(o2Var4, false, null, currentUser, false, true, false, true, new g1(24, is0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.es0
                public final /* synthetic */ is0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            eu0 eu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var2.r1;
                            kh.wb E = kh.wb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = eu0Var2.f1;
                            String currentLang = eu0Var2.Q.getCurrentLang();
                            E.r0 = j14;
                            E.s0 = currentLang;
                            E.R(null);
                            E.r0 = j14;
                            E.s0 = currentLang;
                            break;
                        case 1:
                            this.b.d.Q.f();
                            break;
                        case 2:
                            uq0 uq0Var2 = this.b.d.Q;
                            if (!uq0Var2.d()) {
                                uq0Var2.f();
                                break;
                            } else {
                                uq0Var2.h();
                                break;
                            }
                        case 3:
                            uq0 uq0Var3 = this.b.d.Q;
                            uq0Var3.b(uq0Var3.getCurrentLang());
                            break;
                        case 4:
                            eu0 eu0Var3 = this.b.d;
                            eu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            eu0 eu0Var4 = this.b.d;
                            try {
                                eu0Var4.r1.getMediaDataController().installShortcut(eu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            is0 is0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = is0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            y4.s(o2Var4, false, null, currentUser, false, true, false, true, new g1(24, is0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final x60 H5 = x60.H(o2Var, imageView);
        if ((closestTab == 8 || eu0.w0(closestTab)) && i9) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new ue0(this, this.b, H5, i22), false);
            H5.k();
        } else {
            c10 = 0;
        }
        eu0Var.y(H5);
        if (!p02) {
            tt0 tt0Var = tt0VarArr[c10];
            if (!tt0Var.w || !tt0Var.v) {
                boolean[] zArr = tt0Var.i;
                if (zArr[c10] && zArr[1] && tt0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        if (user == null || !user.bot) {
                            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new org.telegram.ui.rl(this, closestTab, H5, 14), false);
                            if (eu0Var.Z0 != null && !eu0Var.v0() && (chat = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(eu0Var.Z0.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                                final int i24 = 1;
                                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.ds0
                                    public final /* synthetic */ is0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i24) {
                                            case 0:
                                                vq0 vq0Var2 = this.b.d.R;
                                                vq0Var2.getClass();
                                                vq0Var2.h(null, new fh.s2(vq0Var2, 0));
                                                H5.u();
                                                break;
                                            case 1:
                                                is0 is0Var = this.b;
                                                is0Var.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                                eu0 eu0Var2 = is0Var.d;
                                                bundle.putLong("dialog_id", -eu0Var2.Z0.id);
                                                k90 k90Var = new k90(bundle, null);
                                                k90Var.c = eu0Var2.Z0;
                                                eu0Var2.r1.presentFragment(k90Var);
                                                H5.u();
                                                break;
                                            default:
                                                this.b.d.R.setReordering(true);
                                                H5.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (z10) {
                                H5.k();
                                final org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(1, this.c, this.b, false, false);
                                final org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(1, this.c, this.b, false, true);
                                g1Var8.g(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0, null);
                                H5.A.addView(g1Var8);
                                g1Var9.g(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0, null);
                                H5.A.addView(g1Var9);
                                if (!p02) {
                                    int i25 = 0;
                                    int i26 = tt0VarArr[0].q;
                                    g1Var8.setChecked(i26 == 0 || i26 == 1);
                                    g1Var8.setOnClickListener(new gs0(this, g1Var9, g1Var8, i25));
                                    int i27 = tt0VarArr[0].q;
                                    g1Var9.setChecked(i27 == 0 || i27 == 2);
                                    z11 = true;
                                    g1Var9.setOnClickListener(new gs0(this, g1Var8, g1Var9, 1 == true ? 1 : 0));
                                    r82 = 0;
                                    H5.J = r82;
                                    H5.Y = z11;
                                    H5.s = r82;
                                    H5.Z();
                                }
                                final bu0 k12 = eu0Var.k1(closestTab);
                                if (k12 != null && (n6Var = k12.s) != null) {
                                    g1Var8.setChecked(n6Var.n);
                                    g1Var9.setChecked(k12.s.o);
                                }
                                final int i28 = 0;
                                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fs0
                                    public final /* synthetic */ is0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i28) {
                                            case 0:
                                                eu0 eu0Var2 = this.b.d;
                                                if (!eu0Var2.D1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var9;
                                                    boolean z14 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var8;
                                                    if (!z14 && g1Var11.getCheckView().a.q) {
                                                        float f10 = -eu0Var2.o1;
                                                        eu0Var2.o1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        ih.n6 n6Var2 = k12.s;
                                                        if (n6Var2 != null) {
                                                            boolean z15 = g1Var11.getCheckView().a.q;
                                                            boolean z16 = g1Var10.getCheckView().a.q;
                                                            n6Var2.n = z15;
                                                            n6Var2.o = z16;
                                                            n6Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                eu0 eu0Var3 = this.b.d;
                                                if (!eu0Var3.D1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var9;
                                                    boolean z17 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var8;
                                                    if (!z17 && g1Var13.getCheckView().a.q) {
                                                        float f11 = -eu0Var3.o1;
                                                        eu0Var3.o1 = f11;
                                                        AndroidUtilities.shakeViewSpring(view2, f11);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        ih.n6 n6Var3 = k12.s;
                                                        if (n6Var3 != null) {
                                                            boolean z18 = g1Var12.getCheckView().a.q;
                                                            boolean z19 = g1Var13.getCheckView().a.q;
                                                            n6Var3.n = z18;
                                                            n6Var3.o = z19;
                                                            n6Var3.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i29 = 1;
                                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fs0
                                    public final /* synthetic */ is0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i29) {
                                            case 0:
                                                eu0 eu0Var2 = this.b.d;
                                                if (!eu0Var2.D1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var8;
                                                    boolean z14 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var9;
                                                    if (!z14 && g1Var11.getCheckView().a.q) {
                                                        float f10 = -eu0Var2.o1;
                                                        eu0Var2.o1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        ih.n6 n6Var2 = k12.s;
                                                        if (n6Var2 != null) {
                                                            boolean z15 = g1Var11.getCheckView().a.q;
                                                            boolean z16 = g1Var10.getCheckView().a.q;
                                                            n6Var2.n = z15;
                                                            n6Var2.o = z16;
                                                            n6Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                eu0 eu0Var3 = this.b.d;
                                                if (!eu0Var3.D1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var8;
                                                    boolean z17 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var9;
                                                    if (!z17 && g1Var13.getCheckView().a.q) {
                                                        float f11 = -eu0Var3.o1;
                                                        eu0Var3.o1 = f11;
                                                        AndroidUtilities.shakeViewSpring(view2, f11);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        ih.n6 n6Var3 = k12.s;
                                                        if (n6Var3 != null) {
                                                            boolean z18 = g1Var12.getCheckView().a.q;
                                                            boolean z19 = g1Var13.getCheckView().a.q;
                                                            n6Var3.n = z18;
                                                            n6Var3.o = z19;
                                                            n6Var3.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        r82 = 0;
                        z11 = true;
                        H5.J = r82;
                        H5.Y = z11;
                        H5.s = r82;
                        H5.Z();
                    }
                    z11 = true;
                    r82 = 0;
                    H5.J = r82;
                    H5.Y = z11;
                    H5.s = r82;
                    H5.Z();
                }
            }
        }
        z10 = true;
        if (!DialogObject.isEncryptedDialog(j10)) {
        }
        z11 = true;
        r82 = 0;
        H5.J = r82;
        H5.Y = z11;
        H5.s = r82;
        H5.Z();
    }
}
