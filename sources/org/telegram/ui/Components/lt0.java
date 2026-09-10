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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lt0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ iv0 d;

    public lt0(iv0 iv0Var, long j3, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.d = iv0Var;
        this.a = j3;
        this.b = f6Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0348  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        zh.i5 storiesController;
        char c10;
        boolean z10;
        boolean z11;
        ?? r82;
        zh.a5 a5Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.g1 g1Var;
        boolean z12;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        hv0 j12;
        final iv0 iv0Var = this.d;
        xu0[] xu0VarArr = iv0Var.t1;
        wr0 wr0Var = iv0Var.V;
        ImageView imageView = iv0Var.r0;
        vr0 vr0Var = iv0Var.U;
        int closestTab = iv0Var.getClosestTab();
        boolean p02 = iv0.p0(closestTab);
        final org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(p2Var.getCurrentAccount());
        long j3 = iv0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        storiesController = iv0Var.getStoriesController();
        boolean i10 = storiesController.i(j3);
        if (iv0.w0(closestTab) && i10 && (j12 = iv0Var.j1(closestTab)) != null) {
            final int i11 = j12.b;
            final w70 H = w70.H(p2Var, imageView);
            int i12 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i13 = 0;
            final long j10 = this.a;
            H.c(i12, string, new Runnable() { // from class: org.telegram.ui.Components.or0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            iv0Var.O0(p2Var, j10, i11);
                            H.u();
                            break;
                        default:
                            iv0Var.P0(p2Var, j10, i11);
                            H.u();
                            break;
                    }
                }
            }, false);
            iv0Var.x(H, p2Var, j10, i11);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new my(iv0Var, i11, H, 9), false);
            final int i14 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.or0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            iv0Var.O0(p2Var, j10, i11);
                            H.u();
                            break;
                        default:
                            iv0Var.P0(p2Var, j10, i11);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            iv0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i15 = 5;
        if (closestTab == 14) {
            wh.m2 currentPage = wr0Var.getCurrentPage();
            xh.n5 n5Var = currentPage.e;
            if (n5Var == null) {
                return;
            }
            long j11 = wr0Var.c;
            int i16 = wr0Var.b;
            boolean canUserDoAction = j11 == UserConfig.getInstance(i16).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i16).getChat(Long.valueOf(-j11)), 5);
            final w70 H2 = w70.H(p2Var, imageView);
            if (n5Var.c) {
                g1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, H2.e, H2.d, false, false);
                H2.d(g1Var4);
                g1Var = g1Var4;
                z12 = true;
            }
            if (wr0Var.b()) {
                final int i17 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.gt0
                    public final /* synthetic */ lt0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                wr0 wr0Var2 = this.b.d.V;
                                wr0Var2.getClass();
                                wr0Var2.h(null, new wh.r1(wr0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                lt0 lt0Var = this.b;
                                lt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                iv0 iv0Var2 = lt0Var.d;
                                bundle.putLong("dialog_id", -iv0Var2.d1.id);
                                la0 la0Var = new la0(bundle, null);
                                la0Var.c = iv0Var2.d1;
                                iv0Var2.v1.presentFragment(la0Var);
                                H2.u();
                                break;
                            default:
                                this.b.d.V.setReordering(true);
                                H2.u();
                                break;
                        }
                    }
                }, false);
                z12 = true;
            }
            if (wr0Var.e.h()) {
                if (!n5Var.h().isEmpty() || currentPage.d) {
                    final int i18 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.gt0
                        public final /* synthetic */ lt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    wr0 wr0Var2 = this.b.d.V;
                                    wr0Var2.getClass();
                                    wr0Var2.h(null, new wh.r1(wr0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    lt0 lt0Var = this.b;
                                    lt0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    iv0 iv0Var2 = lt0Var.d;
                                    bundle.putLong("dialog_id", -iv0Var2.d1.id);
                                    la0 la0Var = new la0(bundle, null);
                                    la0Var.c = iv0Var2.d1;
                                    iv0Var2.v1.presentFragment(la0Var);
                                    H2.u();
                                    break;
                                default:
                                    this.b.d.V.setReordering(true);
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
            org.telegram.messenger.sk skVar = new org.telegram.messenger.sk(g1Var, n5Var, h, h10, h11, h12, canUserDoAction, g1Var2, g1Var3, 3);
            org.telegram.ui.ActionBar.g1 g1Var5 = g1Var;
            org.telegram.ui.ActionBar.g1 g1Var6 = g1Var2;
            org.telegram.ui.ActionBar.g1 g1Var7 = g1Var3;
            skVar.run();
            if (g1Var5 != null) {
                g1Var5.setOnClickListener(new u10(11, n5Var, skVar));
            }
            wh.q2.j(h, n5Var, skVar, 1);
            wh.q2.j(h10, n5Var, skVar, 2);
            wh.q2.j(h11, n5Var, skVar, 4);
            wh.q2.j(h12, n5Var, skVar, 8);
            if (canUserDoAction) {
                wh.q2.j(g1Var6, n5Var, skVar, 256);
                wh.q2.j(g1Var7, n5Var, skVar, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && vr0Var != null) {
            w70 H3 = w70.H(p2Var, imageView);
            boolean z13 = vr0Var.getItemsCount() < p2Var.getMessagesController().botPreviewMediasMax;
            final int i19 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.ht0
                public final /* synthetic */ lt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            iv0 iv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var2.v1;
                            bi.ce E = bi.ce.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j13 = iv0Var2.j1;
                            String currentLang = iv0Var2.U.getCurrentLang();
                            E.v0 = j13;
                            E.w0 = currentLang;
                            E.R(null);
                            E.v0 = j13;
                            E.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            vr0 vr0Var2 = this.b.d.U;
                            if (!vr0Var2.d()) {
                                vr0Var2.f();
                                break;
                            } else {
                                vr0Var2.h();
                                break;
                            }
                        case 3:
                            vr0 vr0Var3 = this.b.d.U;
                            vr0Var3.b(vr0Var3.getCurrentLang());
                            break;
                        case 4:
                            iv0 iv0Var3 = this.b.d;
                            iv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.eo(bundle), true);
                            break;
                        case 5:
                            iv0 iv0Var4 = this.b.d;
                            try {
                                iv0Var4.v1.getMediaDataController().installShortcut(iv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            lt0 lt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = lt0Var.d.v1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            d5.s(p2Var4, false, null, currentUser, false, true, false, true, new km(10, lt0Var, currentUser));
                            break;
                    }
                }
            }, z13);
            final int i20 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.ht0
                public final /* synthetic */ lt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            iv0 iv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var2.v1;
                            bi.ce E = bi.ce.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j13 = iv0Var2.j1;
                            String currentLang = iv0Var2.U.getCurrentLang();
                            E.v0 = j13;
                            E.w0 = currentLang;
                            E.R(null);
                            E.v0 = j13;
                            E.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            vr0 vr0Var2 = this.b.d.U;
                            if (!vr0Var2.d()) {
                                vr0Var2.f();
                                break;
                            } else {
                                vr0Var2.h();
                                break;
                            }
                        case 3:
                            vr0 vr0Var3 = this.b.d.U;
                            vr0Var3.b(vr0Var3.getCurrentLang());
                            break;
                        case 4:
                            iv0 iv0Var3 = this.b.d;
                            iv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.eo(bundle), true);
                            break;
                        case 5:
                            iv0 iv0Var4 = this.b.d;
                            try {
                                iv0Var4.v1.getMediaDataController().installShortcut(iv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            lt0 lt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = lt0Var.d.v1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            d5.s(p2Var4, false, null, currentUser, false, true, false, true, new km(10, lt0Var, currentUser));
                            break;
                    }
                }
            }, vr0Var.getItemsCount() > 1 && !vr0Var.d());
            final int i21 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(vr0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.ht0
                public final /* synthetic */ lt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            iv0 iv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var2.v1;
                            bi.ce E = bi.ce.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j13 = iv0Var2.j1;
                            String currentLang = iv0Var2.U.getCurrentLang();
                            E.v0 = j13;
                            E.w0 = currentLang;
                            E.R(null);
                            E.v0 = j13;
                            E.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            vr0 vr0Var2 = this.b.d.U;
                            if (!vr0Var2.d()) {
                                vr0Var2.f();
                                break;
                            } else {
                                vr0Var2.h();
                                break;
                            }
                        case 3:
                            vr0 vr0Var3 = this.b.d.U;
                            vr0Var3.b(vr0Var3.getCurrentLang());
                            break;
                        case 4:
                            iv0 iv0Var3 = this.b.d;
                            iv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.eo(bundle), true);
                            break;
                        case 5:
                            iv0 iv0Var4 = this.b.d;
                            try {
                                iv0Var4.v1.getMediaDataController().installShortcut(iv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            lt0 lt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = lt0Var.d.v1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            d5.s(p2Var4, false, null, currentUser, false, true, false, true, new km(10, lt0Var, currentUser));
                            break;
                    }
                }
            }, vr0Var.getItemsCount() > 0);
            final int i22 = 3;
            H3.m(!TextUtils.isEmpty(vr0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, i41.D(vr0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.ht0
                public final /* synthetic */ lt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            iv0 iv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var2.v1;
                            bi.ce E = bi.ce.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j13 = iv0Var2.j1;
                            String currentLang = iv0Var2.U.getCurrentLang();
                            E.v0 = j13;
                            E.w0 = currentLang;
                            E.R(null);
                            E.v0 = j13;
                            E.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            vr0 vr0Var2 = this.b.d.U;
                            if (!vr0Var2.d()) {
                                vr0Var2.f();
                                break;
                            } else {
                                vr0Var2.h();
                                break;
                            }
                        case 3:
                            vr0 vr0Var3 = this.b.d.U;
                            vr0Var3.b(vr0Var3.getCurrentLang());
                            break;
                        case 4:
                            iv0 iv0Var3 = this.b.d;
                            iv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.eo(bundle), true);
                            break;
                        case 5:
                            iv0 iv0Var4 = this.b.d;
                            try {
                                iv0Var4.v1.getMediaDataController().installShortcut(iv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            lt0 lt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = lt0Var.d.v1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            d5.s(p2Var4, false, null, currentUser, false, true, false, true, new km(10, lt0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        if (iv0Var.getSelectedTab() == 11) {
            w70 H4 = w70.H(p2Var, imageView);
            final int i23 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.ht0
                public final /* synthetic */ lt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            iv0 iv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var2.v1;
                            bi.ce E = bi.ce.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j13 = iv0Var2.j1;
                            String currentLang = iv0Var2.U.getCurrentLang();
                            E.v0 = j13;
                            E.w0 = currentLang;
                            E.R(null);
                            E.v0 = j13;
                            E.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            vr0 vr0Var2 = this.b.d.U;
                            if (!vr0Var2.d()) {
                                vr0Var2.f();
                                break;
                            } else {
                                vr0Var2.h();
                                break;
                            }
                        case 3:
                            vr0 vr0Var3 = this.b.d.U;
                            vr0Var3.b(vr0Var3.getCurrentLang());
                            break;
                        case 4:
                            iv0 iv0Var3 = this.b.d;
                            iv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.eo(bundle), true);
                            break;
                        case 5:
                            iv0 iv0Var4 = this.b.d;
                            try {
                                iv0Var4.v1.getMediaDataController().installShortcut(iv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            lt0 lt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = lt0Var.d.v1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            d5.s(p2Var4, false, null, currentUser, false, true, false, true, new km(10, lt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.ht0
                public final /* synthetic */ lt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            iv0 iv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var2.v1;
                            bi.ce E = bi.ce.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j13 = iv0Var2.j1;
                            String currentLang = iv0Var2.U.getCurrentLang();
                            E.v0 = j13;
                            E.w0 = currentLang;
                            E.R(null);
                            E.v0 = j13;
                            E.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            vr0 vr0Var2 = this.b.d.U;
                            if (!vr0Var2.d()) {
                                vr0Var2.f();
                                break;
                            } else {
                                vr0Var2.h();
                                break;
                            }
                        case 3:
                            vr0 vr0Var3 = this.b.d.U;
                            vr0Var3.b(vr0Var3.getCurrentLang());
                            break;
                        case 4:
                            iv0 iv0Var3 = this.b.d;
                            iv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.eo(bundle), true);
                            break;
                        case 5:
                            iv0 iv0Var4 = this.b.d;
                            try {
                                iv0Var4.v1.getMediaDataController().installShortcut(iv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            lt0 lt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = lt0Var.d.v1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            d5.s(p2Var4, false, null, currentUser, false, true, false, true, new km(10, lt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i24 = 6;
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.ht0
                public final /* synthetic */ lt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            iv0 iv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var2.v1;
                            bi.ce E = bi.ce.E(p2Var2.getParentActivity(), p2Var2.getCurrentAccount());
                            long j13 = iv0Var2.j1;
                            String currentLang = iv0Var2.U.getCurrentLang();
                            E.v0 = j13;
                            E.w0 = currentLang;
                            E.R(null);
                            E.v0 = j13;
                            E.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            vr0 vr0Var2 = this.b.d.U;
                            if (!vr0Var2.d()) {
                                vr0Var2.f();
                                break;
                            } else {
                                vr0Var2.h();
                                break;
                            }
                        case 3:
                            vr0 vr0Var3 = this.b.d.U;
                            vr0Var3.b(vr0Var3.getCurrentLang());
                            break;
                        case 4:
                            iv0 iv0Var3 = this.b.d;
                            iv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.p2 p2Var3 = iv0Var3.v1;
                            bundle.putLong("user_id", p2Var3.getUserConfig().getClientUserId());
                            p2Var3.presentFragment(new org.telegram.ui.eo(bundle), true);
                            break;
                        case 5:
                            iv0 iv0Var4 = this.b.d;
                            try {
                                iv0Var4.v1.getMediaDataController().installShortcut(iv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            lt0 lt0Var = this.b;
                            org.telegram.ui.ActionBar.p2 p2Var4 = lt0Var.d.v1;
                            TLRPC.User currentUser = p2Var4.getUserConfig().getCurrentUser();
                            d5.s(p2Var4, false, null, currentUser, false, true, false, true, new km(10, lt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final w70 H5 = w70.H(p2Var, imageView);
        if ((closestTab == 8 || iv0.w0(closestTab)) && i10) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new gf(this, this.b, H5, 23), false);
            H5.k();
        } else {
            c10 = 0;
        }
        iv0Var.y(H5);
        if (!p02) {
            xu0 xu0Var = xu0VarArr[c10];
            if (!xu0Var.w || !xu0Var.v) {
                boolean[] zArr = xu0Var.i;
                if (zArr[c10] && zArr[1] && xu0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j3)) {
                        if (user == null || !user.bot) {
                            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new my(this, closestTab, H5, 11), false);
                            if (iv0Var.d1 != null && !iv0Var.v0() && (chat = MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(iv0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                                final int i25 = 1;
                                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.gt0
                                    public final /* synthetic */ lt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i25) {
                                            case 0:
                                                wr0 wr0Var2 = this.b.d.V;
                                                wr0Var2.getClass();
                                                wr0Var2.h(null, new wh.r1(wr0Var2, 0));
                                                H5.u();
                                                break;
                                            case 1:
                                                lt0 lt0Var = this.b;
                                                lt0Var.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                                iv0 iv0Var2 = lt0Var.d;
                                                bundle.putLong("dialog_id", -iv0Var2.d1.id);
                                                la0 la0Var = new la0(bundle, null);
                                                la0Var.c = iv0Var2.d1;
                                                iv0Var2.v1.presentFragment(la0Var);
                                                H5.u();
                                                break;
                                            default:
                                                this.b.d.V.setReordering(true);
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
                                    int i26 = 0;
                                    int i27 = xu0VarArr[0].q;
                                    g1Var8.setChecked(i27 == 0 || i27 == 1);
                                    g1Var8.setOnClickListener(new jt0(this, g1Var9, g1Var8, i26));
                                    int i28 = xu0VarArr[0].q;
                                    g1Var9.setChecked(i28 == 0 || i28 == 2);
                                    z11 = true;
                                    g1Var9.setOnClickListener(new jt0(this, g1Var8, g1Var9, 1 == true ? 1 : 0));
                                    r82 = 0;
                                    H5.J = r82;
                                    H5.Y = z11;
                                    H5.s = r82;
                                    H5.Z();
                                }
                                final fv0 k12 = iv0Var.k1(closestTab);
                                if (k12 != null && (a5Var = k12.s) != null) {
                                    g1Var8.setChecked(a5Var.n);
                                    g1Var9.setChecked(k12.s.o);
                                }
                                final int i29 = 0;
                                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.it0
                                    public final /* synthetic */ lt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i29) {
                                            case 0:
                                                iv0 iv0Var2 = this.b.d;
                                                if (!iv0Var2.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var9;
                                                    boolean z14 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var8;
                                                    if (!z14 && g1Var11.getCheckView().a.q) {
                                                        float f7 = -iv0Var2.s1;
                                                        iv0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        zh.a5 a5Var2 = k12.s;
                                                        if (a5Var2 != null) {
                                                            boolean z15 = g1Var11.getCheckView().a.q;
                                                            boolean z16 = g1Var10.getCheckView().a.q;
                                                            a5Var2.n = z15;
                                                            a5Var2.o = z16;
                                                            a5Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                iv0 iv0Var3 = this.b.d;
                                                if (!iv0Var3.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var9;
                                                    boolean z17 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var8;
                                                    if (!z17 && g1Var13.getCheckView().a.q) {
                                                        float f10 = -iv0Var3.s1;
                                                        iv0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        zh.a5 a5Var3 = k12.s;
                                                        if (a5Var3 != null) {
                                                            boolean z18 = g1Var12.getCheckView().a.q;
                                                            boolean z19 = g1Var13.getCheckView().a.q;
                                                            a5Var3.n = z18;
                                                            a5Var3.o = z19;
                                                            a5Var3.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i30 = 1;
                                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.it0
                                    public final /* synthetic */ lt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i30) {
                                            case 0:
                                                iv0 iv0Var2 = this.b.d;
                                                if (!iv0Var2.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var8;
                                                    boolean z14 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var9;
                                                    if (!z14 && g1Var11.getCheckView().a.q) {
                                                        float f7 = -iv0Var2.s1;
                                                        iv0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        zh.a5 a5Var2 = k12.s;
                                                        if (a5Var2 != null) {
                                                            boolean z15 = g1Var11.getCheckView().a.q;
                                                            boolean z16 = g1Var10.getCheckView().a.q;
                                                            a5Var2.n = z15;
                                                            a5Var2.o = z16;
                                                            a5Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                iv0 iv0Var3 = this.b.d;
                                                if (!iv0Var3.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var8;
                                                    boolean z17 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var9;
                                                    if (!z17 && g1Var13.getCheckView().a.q) {
                                                        float f10 = -iv0Var3.s1;
                                                        iv0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        zh.a5 a5Var3 = k12.s;
                                                        if (a5Var3 != null) {
                                                            boolean z18 = g1Var12.getCheckView().a.q;
                                                            boolean z19 = g1Var13.getCheckView().a.q;
                                                            a5Var3.n = z18;
                                                            a5Var3.o = z19;
                                                            a5Var3.d(true);
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
        if (!DialogObject.isEncryptedDialog(j3)) {
        }
        z11 = true;
        r82 = 0;
        H5.J = r82;
        H5.Y = z11;
        H5.s = r82;
        H5.Z();
    }
}
