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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bt0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ yu0 d;

    public bt0(yu0 yu0Var, long j10, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.d = yu0Var;
        this.a = j10;
        this.b = f6Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0346  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        nh.t6 storiesController;
        char c3;
        boolean z4;
        boolean z10;
        ?? r82;
        nh.l6 l6Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.g1 g1Var;
        boolean z11;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        xu0 j12;
        final yu0 yu0Var = this.d;
        nu0[] nu0VarArr = yu0Var.q1;
        or0 or0Var = yu0Var.S;
        ImageView imageView = yu0Var.o0;
        nr0 nr0Var = yu0Var.R;
        int closestTab = yu0Var.getClosestTab();
        boolean p02 = yu0.p0(closestTab);
        final org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        MessagesController messagesController = MessagesController.getInstance(p2Var.getCurrentAccount());
        long j10 = yu0Var.g1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        storiesController = yu0Var.getStoriesController();
        boolean i10 = storiesController.i(j10);
        if (yu0.w0(closestTab) && i10 && (j12 = yu0Var.j1(closestTab)) != null) {
            final int i11 = j12.b;
            final o70 H = o70.H(p2Var, imageView);
            int i12 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i13 = 0;
            final long j11 = this.a;
            H.c(i12, string, new Runnable() { // from class: org.telegram.ui.Components.gr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            yu0Var.O0(p2Var, j11, i11);
                            H.u();
                            break;
                        default:
                            yu0Var.P0(p2Var, j11, i11);
                            H.u();
                            break;
                    }
                }
            }, false);
            yu0Var.x(H, p2Var, j11, i11);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new ey(yu0Var, i11, H, 9), false);
            final int i14 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.gr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            yu0Var.O0(p2Var, j11, i11);
                            H.u();
                            break;
                        default:
                            yu0Var.P0(p2Var, j11, i11);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            yu0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i15 = 5;
        if (closestTab == 14) {
            kh.n3 currentPage = or0Var.getCurrentPage();
            lh.l7 l7Var = currentPage.e;
            if (l7Var == null) {
                return;
            }
            long j13 = or0Var.c;
            int i16 = or0Var.b;
            boolean canUserDoAction = j13 == UserConfig.getInstance(i16).getClientUserId() ? true : j13 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i16).getChat(Long.valueOf(-j13)), 5);
            final o70 H2 = o70.H(p2Var, imageView);
            if (l7Var.c) {
                g1Var = null;
                z11 = false;
            } else {
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, H2.e, H2.d, false, false);
                H2.d(g1Var4);
                g1Var = g1Var4;
                z11 = true;
            }
            if (or0Var.b()) {
                final int i17 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.ws0
                    public final /* synthetic */ bt0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                or0 or0Var2 = this.b.d.S;
                                or0Var2.getClass();
                                or0Var2.h(null, new kh.k2(or0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                bt0 bt0Var = this.b;
                                bt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                yu0 yu0Var2 = bt0Var.d;
                                bundle.putLong("dialog_id", -yu0Var2.a1.id);
                                da0 da0Var = new da0(bundle, null);
                                da0Var.c = yu0Var2.a1;
                                yu0Var2.s1.presentFragment(da0Var);
                                H2.u();
                                break;
                            default:
                                this.b.d.S.setReordering(true);
                                H2.u();
                                break;
                        }
                    }
                }, false);
                z11 = true;
            }
            if (or0Var.e.h()) {
                if (!l7Var.h().isEmpty() || currentPage.d) {
                    final int i18 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.ws0
                        public final /* synthetic */ bt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    or0 or0Var2 = this.b.d.S;
                                    or0Var2.getClass();
                                    or0Var2.h(null, new kh.k2(or0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    bt0 bt0Var = this.b;
                                    bt0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    yu0 yu0Var2 = bt0Var.d;
                                    bundle.putLong("dialog_id", -yu0Var2.a1.id);
                                    da0 da0Var = new da0(bundle, null);
                                    da0Var.c = yu0Var2.a1;
                                    yu0Var2.s1.presentFragment(da0Var);
                                    H2.u();
                                    break;
                                default:
                                    this.b.d.S.setReordering(true);
                                    H2.u();
                                    break;
                            }
                        }
                    }, false);
                }
                z11 = true;
            }
            if (z11) {
                H2.k();
            }
            org.telegram.ui.ActionBar.g1 h = H2.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.g1 h9 = H2.h();
            h9.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.g1 h10 = H2.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.g1 h11 = H2.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                H2.k();
                org.telegram.ui.ActionBar.g1 h12 = H2.h();
                h12.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.g1 h13 = H2.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                g1Var3 = h13;
                g1Var2 = h12;
            } else {
                g1Var2 = null;
                g1Var3 = null;
            }
            kh.o3 o3Var = new kh.o3(g1Var, l7Var, h, h9, h10, h11, canUserDoAction, g1Var2, g1Var3);
            org.telegram.ui.ActionBar.g1 g1Var5 = g1Var;
            org.telegram.ui.ActionBar.g1 g1Var6 = g1Var2;
            org.telegram.ui.ActionBar.g1 g1Var7 = g1Var3;
            o3Var.run();
            if (g1Var5 != null) {
                g1Var5.setOnClickListener(new w2(29, l7Var, o3Var));
            }
            kh.x3.j(h, l7Var, o3Var, 1);
            kh.x3.j(h9, l7Var, o3Var, 2);
            kh.x3.j(h10, l7Var, o3Var, 4);
            kh.x3.j(h11, l7Var, o3Var, 8);
            if (canUserDoAction) {
                kh.x3.j(g1Var6, l7Var, o3Var, 256);
                kh.x3.j(g1Var7, l7Var, o3Var, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && nr0Var != null) {
            o70 H3 = o70.H(p2Var, imageView);
            boolean z12 = nr0Var.getItemsCount() < p2Var.getMessagesController().botPreviewMediasMax;
            final int i19 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            yu0 yu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var2.s1;
                            ph.da E = ph.da.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j14 = yu0Var2.g1;
                            String currentLang = yu0Var2.R.getCurrentLang();
                            E.s0 = j14;
                            E.t0 = currentLang;
                            E.R(null);
                            E.s0 = j14;
                            E.t0 = currentLang;
                            break;
                        case 1:
                            this.b.d.R.f();
                            break;
                        case 2:
                            nr0 nr0Var2 = this.b.d.R;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.R;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            yu0 yu0Var3 = this.b.d;
                            yu0Var3.s1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.xn(bundle), true);
                            break;
                        case 5:
                            yu0 yu0Var4 = this.b.d;
                            try {
                                yu0Var4.s1.getMediaDataController().installShortcut(yu0Var4.s1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = bt0Var.d.s1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            z4.s(p2Var4, false, null, currentUser, false, true, false, true, new o1(23, bt0Var, currentUser));
                            break;
                    }
                }
            }, z12);
            final int i20 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            yu0 yu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var2.s1;
                            ph.da E = ph.da.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j14 = yu0Var2.g1;
                            String currentLang = yu0Var2.R.getCurrentLang();
                            E.s0 = j14;
                            E.t0 = currentLang;
                            E.R(null);
                            E.s0 = j14;
                            E.t0 = currentLang;
                            break;
                        case 1:
                            this.b.d.R.f();
                            break;
                        case 2:
                            nr0 nr0Var2 = this.b.d.R;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.R;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            yu0 yu0Var3 = this.b.d;
                            yu0Var3.s1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.xn(bundle), true);
                            break;
                        case 5:
                            yu0 yu0Var4 = this.b.d;
                            try {
                                yu0Var4.s1.getMediaDataController().installShortcut(yu0Var4.s1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = bt0Var.d.s1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            z4.s(p2Var4, false, null, currentUser, false, true, false, true, new o1(23, bt0Var, currentUser));
                            break;
                    }
                }
            }, nr0Var.getItemsCount() > 1 && !nr0Var.d());
            final int i21 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(nr0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            yu0 yu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var2.s1;
                            ph.da E = ph.da.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j14 = yu0Var2.g1;
                            String currentLang = yu0Var2.R.getCurrentLang();
                            E.s0 = j14;
                            E.t0 = currentLang;
                            E.R(null);
                            E.s0 = j14;
                            E.t0 = currentLang;
                            break;
                        case 1:
                            this.b.d.R.f();
                            break;
                        case 2:
                            nr0 nr0Var2 = this.b.d.R;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.R;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            yu0 yu0Var3 = this.b.d;
                            yu0Var3.s1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.xn(bundle), true);
                            break;
                        case 5:
                            yu0 yu0Var4 = this.b.d;
                            try {
                                yu0Var4.s1.getMediaDataController().installShortcut(yu0Var4.s1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = bt0Var.d.s1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            z4.s(p2Var4, false, null, currentUser, false, true, false, true, new o1(23, bt0Var, currentUser));
                            break;
                    }
                }
            }, nr0Var.getItemsCount() > 0);
            final int i22 = 3;
            H3.m(!TextUtils.isEmpty(nr0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, v31.D(nr0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            yu0 yu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var2.s1;
                            ph.da E = ph.da.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j14 = yu0Var2.g1;
                            String currentLang = yu0Var2.R.getCurrentLang();
                            E.s0 = j14;
                            E.t0 = currentLang;
                            E.R(null);
                            E.s0 = j14;
                            E.t0 = currentLang;
                            break;
                        case 1:
                            this.b.d.R.f();
                            break;
                        case 2:
                            nr0 nr0Var2 = this.b.d.R;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.R;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            yu0 yu0Var3 = this.b.d;
                            yu0Var3.s1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.xn(bundle), true);
                            break;
                        case 5:
                            yu0 yu0Var4 = this.b.d;
                            try {
                                yu0Var4.s1.getMediaDataController().installShortcut(yu0Var4.s1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = bt0Var.d.s1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            z4.s(p2Var4, false, null, currentUser, false, true, false, true, new o1(23, bt0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        int i23 = 11;
        if (yu0Var.getSelectedTab() == 11) {
            o70 H4 = o70.H(p2Var, imageView);
            final int i24 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            yu0 yu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var2.s1;
                            ph.da E = ph.da.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j14 = yu0Var2.g1;
                            String currentLang = yu0Var2.R.getCurrentLang();
                            E.s0 = j14;
                            E.t0 = currentLang;
                            E.R(null);
                            E.s0 = j14;
                            E.t0 = currentLang;
                            break;
                        case 1:
                            this.b.d.R.f();
                            break;
                        case 2:
                            nr0 nr0Var2 = this.b.d.R;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.R;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            yu0 yu0Var3 = this.b.d;
                            yu0Var3.s1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.xn(bundle), true);
                            break;
                        case 5:
                            yu0 yu0Var4 = this.b.d;
                            try {
                                yu0Var4.s1.getMediaDataController().installShortcut(yu0Var4.s1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = bt0Var.d.s1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            z4.s(p2Var4, false, null, currentUser, false, true, false, true, new o1(23, bt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            yu0 yu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var2.s1;
                            ph.da E = ph.da.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j14 = yu0Var2.g1;
                            String currentLang = yu0Var2.R.getCurrentLang();
                            E.s0 = j14;
                            E.t0 = currentLang;
                            E.R(null);
                            E.s0 = j14;
                            E.t0 = currentLang;
                            break;
                        case 1:
                            this.b.d.R.f();
                            break;
                        case 2:
                            nr0 nr0Var2 = this.b.d.R;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.R;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            yu0 yu0Var3 = this.b.d;
                            yu0Var3.s1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.xn(bundle), true);
                            break;
                        case 5:
                            yu0 yu0Var4 = this.b.d;
                            try {
                                yu0Var4.s1.getMediaDataController().installShortcut(yu0Var4.s1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = bt0Var.d.s1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            z4.s(p2Var4, false, null, currentUser, false, true, false, true, new o1(23, bt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i25 = 6;
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            yu0 yu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var2.s1;
                            ph.da E = ph.da.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j14 = yu0Var2.g1;
                            String currentLang = yu0Var2.R.getCurrentLang();
                            E.s0 = j14;
                            E.t0 = currentLang;
                            E.R(null);
                            E.s0 = j14;
                            E.t0 = currentLang;
                            break;
                        case 1:
                            this.b.d.R.f();
                            break;
                        case 2:
                            nr0 nr0Var2 = this.b.d.R;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.R;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            yu0 yu0Var3 = this.b.d;
                            yu0Var3.s1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.xn(bundle), true);
                            break;
                        case 5:
                            yu0 yu0Var4 = this.b.d;
                            try {
                                yu0Var4.s1.getMediaDataController().installShortcut(yu0Var4.s1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = bt0Var.d.s1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            z4.s(p2Var4, false, null, currentUser, false, true, false, true, new o1(23, bt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final o70 H5 = o70.H(p2Var, imageView);
        if ((closestTab == 8 || yu0.w0(closestTab)) && i10) {
            c3 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new hp(this, this.b, H5, 18), false);
            H5.k();
        } else {
            c3 = 0;
        }
        yu0Var.y(H5);
        if (!p02) {
            nu0 nu0Var = nu0VarArr[c3];
            if (!nu0Var.w || !nu0Var.v) {
                boolean[] zArr = nu0Var.i;
                if (zArr[c3] && zArr[1] && nu0Var.l) {
                    z4 = false;
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        if (user == null || !user.bot) {
                            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new ey(this, closestTab, H5, i23), false);
                            if (yu0Var.a1 != null && !yu0Var.v0() && (chat = MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(yu0Var.a1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                                final int i26 = 1;
                                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.ws0
                                    public final /* synthetic */ bt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i26) {
                                            case 0:
                                                or0 or0Var2 = this.b.d.S;
                                                or0Var2.getClass();
                                                or0Var2.h(null, new kh.k2(or0Var2, 0));
                                                H5.u();
                                                break;
                                            case 1:
                                                bt0 bt0Var = this.b;
                                                bt0Var.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                                yu0 yu0Var2 = bt0Var.d;
                                                bundle.putLong("dialog_id", -yu0Var2.a1.id);
                                                da0 da0Var = new da0(bundle, null);
                                                da0Var.c = yu0Var2.a1;
                                                yu0Var2.s1.presentFragment(da0Var);
                                                H5.u();
                                                break;
                                            default:
                                                this.b.d.S.setReordering(true);
                                                H5.u();
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (z4) {
                                H5.k();
                                final org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(1, this.c, this.b, false, false);
                                final org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(1, this.c, this.b, false, true);
                                g1Var8.g(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0, null);
                                H5.A.addView(g1Var8);
                                g1Var9.g(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0, null);
                                H5.A.addView(g1Var9);
                                if (!p02) {
                                    int i27 = 0;
                                    int i28 = nu0VarArr[0].q;
                                    g1Var8.setChecked(i28 == 0 || i28 == 1);
                                    g1Var8.setOnClickListener(new zs0(this, g1Var9, g1Var8, i27));
                                    int i29 = nu0VarArr[0].q;
                                    g1Var9.setChecked(i29 == 0 || i29 == 2);
                                    z10 = true;
                                    g1Var9.setOnClickListener(new zs0(this, g1Var8, g1Var9, 1 == true ? 1 : 0));
                                    r82 = 0;
                                    H5.J = r82;
                                    H5.Y = z10;
                                    H5.s = r82;
                                    H5.Z();
                                }
                                final vu0 k12 = yu0Var.k1(closestTab);
                                if (k12 != null && (l6Var = k12.s) != null) {
                                    g1Var8.setChecked(l6Var.n);
                                    g1Var9.setChecked(k12.s.o);
                                }
                                final int i30 = 0;
                                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ys0
                                    public final /* synthetic */ bt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i30) {
                                            case 0:
                                                yu0 yu0Var2 = this.b.d;
                                                if (!yu0Var2.E1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var9;
                                                    boolean z13 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var8;
                                                    if (!z13 && g1Var11.getCheckView().a.q) {
                                                        float f10 = -yu0Var2.p1;
                                                        yu0Var2.p1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        nh.l6 l6Var2 = k12.s;
                                                        if (l6Var2 != null) {
                                                            boolean z14 = g1Var11.getCheckView().a.q;
                                                            boolean z15 = g1Var10.getCheckView().a.q;
                                                            l6Var2.n = z14;
                                                            l6Var2.o = z15;
                                                            l6Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                yu0 yu0Var3 = this.b.d;
                                                if (!yu0Var3.E1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var9;
                                                    boolean z16 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var8;
                                                    if (!z16 && g1Var13.getCheckView().a.q) {
                                                        float f11 = -yu0Var3.p1;
                                                        yu0Var3.p1 = f11;
                                                        AndroidUtilities.shakeViewSpring(view2, f11);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        nh.l6 l6Var3 = k12.s;
                                                        if (l6Var3 != null) {
                                                            boolean z17 = g1Var12.getCheckView().a.q;
                                                            boolean z18 = g1Var13.getCheckView().a.q;
                                                            l6Var3.n = z17;
                                                            l6Var3.o = z18;
                                                            l6Var3.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i31 = 1;
                                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ys0
                                    public final /* synthetic */ bt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i31) {
                                            case 0:
                                                yu0 yu0Var2 = this.b.d;
                                                if (!yu0Var2.E1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var8;
                                                    boolean z13 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var9;
                                                    if (!z13 && g1Var11.getCheckView().a.q) {
                                                        float f10 = -yu0Var2.p1;
                                                        yu0Var2.p1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        nh.l6 l6Var2 = k12.s;
                                                        if (l6Var2 != null) {
                                                            boolean z14 = g1Var11.getCheckView().a.q;
                                                            boolean z15 = g1Var10.getCheckView().a.q;
                                                            l6Var2.n = z14;
                                                            l6Var2.o = z15;
                                                            l6Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                yu0 yu0Var3 = this.b.d;
                                                if (!yu0Var3.E1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var8;
                                                    boolean z16 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var9;
                                                    if (!z16 && g1Var13.getCheckView().a.q) {
                                                        float f11 = -yu0Var3.p1;
                                                        yu0Var3.p1 = f11;
                                                        AndroidUtilities.shakeViewSpring(view2, f11);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        nh.l6 l6Var3 = k12.s;
                                                        if (l6Var3 != null) {
                                                            boolean z17 = g1Var12.getCheckView().a.q;
                                                            boolean z18 = g1Var13.getCheckView().a.q;
                                                            l6Var3.n = z17;
                                                            l6Var3.o = z18;
                                                            l6Var3.d(true);
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
                        z10 = true;
                        H5.J = r82;
                        H5.Y = z10;
                        H5.s = r82;
                        H5.Z();
                    }
                    z10 = true;
                    r82 = 0;
                    H5.J = r82;
                    H5.Y = z10;
                    H5.s = r82;
                    H5.Z();
                }
            }
        }
        z4 = true;
        if (!DialogObject.isEncryptedDialog(j10)) {
        }
        z10 = true;
        r82 = 0;
        H5.J = r82;
        H5.Y = z10;
        H5.s = r82;
        H5.Z();
    }
}
