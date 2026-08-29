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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ts0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ qu0 d;

    public ts0(qu0 qu0Var, long j10, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        this.d = qu0Var;
        this.a = j10;
        this.b = c6Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03a4  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        lh.s6 storiesController;
        char c3;
        boolean z10;
        boolean z11;
        lh.k6 k6Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.g1 g1Var;
        boolean z12;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        int i10;
        pu0 j12;
        final qu0 qu0Var = this.d;
        fu0[] fu0VarArr = qu0Var.p1;
        gr0 gr0Var = qu0Var.R;
        ImageView imageView = qu0Var.n0;
        fr0 fr0Var = qu0Var.Q;
        int closestTab = qu0Var.getClosestTab();
        boolean p02 = qu0.p0(closestTab);
        final org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        MessagesController messagesController = MessagesController.getInstance(o2Var.getCurrentAccount());
        long j10 = qu0Var.f1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        storiesController = qu0Var.getStoriesController();
        boolean i11 = storiesController.i(j10);
        int i12 = 11;
        if (qu0.w0(closestTab) && i11 && (j12 = qu0Var.j1(closestTab)) != null) {
            final int i13 = j12.b;
            final j70 H = j70.H(o2Var, imageView);
            int i14 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i15 = 0;
            final long j11 = this.a;
            H.c(i14, string, new Runnable() { // from class: org.telegram.ui.Components.yq0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            qu0Var.O0(o2Var, j11, i13);
                            H.u();
                            break;
                        default:
                            qu0Var.P0(o2Var, j11, i13);
                            H.u();
                            break;
                    }
                }
            }, false);
            qu0Var.x(H, o2Var, j11, i13);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new rm(qu0Var, i13, H, i12), false);
            final int i16 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.yq0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            qu0Var.O0(o2Var, j11, i13);
                            H.u();
                            break;
                        default:
                            qu0Var.P0(o2Var, j11, i13);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            qu0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i17 = 5;
        if (closestTab == 14) {
            ih.n3 currentPage = gr0Var.getCurrentPage();
            jh.k7 k7Var = currentPage.e;
            if (k7Var == null) {
                return;
            }
            long j13 = gr0Var.c;
            int i18 = gr0Var.b;
            boolean canUserDoAction = j13 == UserConfig.getInstance(i18).getClientUserId() ? true : j13 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i18).getChat(Long.valueOf(-j13)), 5);
            final j70 H2 = j70.H(o2Var, imageView);
            if (k7Var.c) {
                g1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, H2.e, H2.d, false, false);
                H2.d(g1Var4);
                g1Var = g1Var4;
                z12 = true;
            }
            if (gr0Var.b()) {
                final int i19 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.os0
                    public final /* synthetic */ ts0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                gr0 gr0Var2 = this.b.d.R;
                                gr0Var2.getClass();
                                gr0Var2.h(null, new ih.k2(gr0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                ts0 ts0Var = this.b;
                                ts0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qu0 qu0Var2 = ts0Var.d;
                                bundle.putLong("dialog_id", -qu0Var2.Z0.id);
                                y90 y90Var = new y90(bundle, null);
                                y90Var.c = qu0Var2.Z0;
                                qu0Var2.r1.presentFragment(y90Var);
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
            if (gr0Var.e.h()) {
                if (!k7Var.h().isEmpty() || currentPage.d) {
                    final int i20 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.os0
                        public final /* synthetic */ ts0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i20) {
                                case 0:
                                    gr0 gr0Var2 = this.b.d.R;
                                    gr0Var2.getClass();
                                    gr0Var2.h(null, new ih.k2(gr0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    ts0 ts0Var = this.b;
                                    ts0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qu0 qu0Var2 = ts0Var.d;
                                    bundle.putLong("dialog_id", -qu0Var2.Z0.id);
                                    y90 y90Var = new y90(bundle, null);
                                    y90Var.c = qu0Var2.Z0;
                                    qu0Var2.r1.presentFragment(y90Var);
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
            ih.o3 o3Var = new ih.o3(g1Var, k7Var, h, h10, h11, h12, canUserDoAction, g1Var2, g1Var3);
            org.telegram.ui.ActionBar.g1 g1Var5 = g1Var;
            org.telegram.ui.ActionBar.g1 g1Var6 = g1Var2;
            org.telegram.ui.ActionBar.g1 g1Var7 = g1Var3;
            o3Var.run();
            if (g1Var5 != null) {
                i10 = 2;
                g1Var5.setOnClickListener(new fi0(i10, k7Var, o3Var));
            } else {
                i10 = 2;
            }
            ih.x3.j(h, k7Var, o3Var, 1);
            ih.x3.j(h10, k7Var, o3Var, i10);
            ih.x3.j(h11, k7Var, o3Var, 4);
            ih.x3.j(h12, k7Var, o3Var, 8);
            if (canUserDoAction) {
                ih.x3.j(g1Var6, k7Var, o3Var, 256);
                ih.x3.j(g1Var7, k7Var, o3Var, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && fr0Var != null) {
            j70 H3 = j70.H(o2Var, imageView);
            final int i21 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.ps0
                public final /* synthetic */ ts0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            qu0 qu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var2.r1;
                            nh.gb E = nh.gb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = qu0Var2.f1;
                            String currentLang = qu0Var2.Q.getCurrentLang();
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
                            fr0 fr0Var2 = this.b.d.Q;
                            if (!fr0Var2.d()) {
                                fr0Var2.f();
                                break;
                            } else {
                                fr0Var2.h();
                                break;
                            }
                        case 3:
                            fr0 fr0Var3 = this.b.d.Q;
                            fr0Var3.b(fr0Var3.getCurrentLang());
                            break;
                        case 4:
                            qu0 qu0Var3 = this.b.d;
                            qu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.tn(bundle), true);
                            break;
                        case 5:
                            qu0 qu0Var4 = this.b.d;
                            try {
                                qu0Var4.r1.getMediaDataController().installShortcut(qu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            ts0 ts0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = ts0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new j1(24, ts0Var, currentUser));
                            break;
                    }
                }
            }, fr0Var.getItemsCount() < o2Var.getMessagesController().botPreviewMediasMax);
            final int i22 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.ps0
                public final /* synthetic */ ts0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            qu0 qu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var2.r1;
                            nh.gb E = nh.gb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = qu0Var2.f1;
                            String currentLang = qu0Var2.Q.getCurrentLang();
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
                            fr0 fr0Var2 = this.b.d.Q;
                            if (!fr0Var2.d()) {
                                fr0Var2.f();
                                break;
                            } else {
                                fr0Var2.h();
                                break;
                            }
                        case 3:
                            fr0 fr0Var3 = this.b.d.Q;
                            fr0Var3.b(fr0Var3.getCurrentLang());
                            break;
                        case 4:
                            qu0 qu0Var3 = this.b.d;
                            qu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.tn(bundle), true);
                            break;
                        case 5:
                            qu0 qu0Var4 = this.b.d;
                            try {
                                qu0Var4.r1.getMediaDataController().installShortcut(qu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            ts0 ts0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = ts0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new j1(24, ts0Var, currentUser));
                            break;
                    }
                }
            }, fr0Var.getItemsCount() > 1 && !fr0Var.d());
            final int i23 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(fr0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.ps0
                public final /* synthetic */ ts0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            qu0 qu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var2.r1;
                            nh.gb E = nh.gb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = qu0Var2.f1;
                            String currentLang = qu0Var2.Q.getCurrentLang();
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
                            fr0 fr0Var2 = this.b.d.Q;
                            if (!fr0Var2.d()) {
                                fr0Var2.f();
                                break;
                            } else {
                                fr0Var2.h();
                                break;
                            }
                        case 3:
                            fr0 fr0Var3 = this.b.d.Q;
                            fr0Var3.b(fr0Var3.getCurrentLang());
                            break;
                        case 4:
                            qu0 qu0Var3 = this.b.d;
                            qu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.tn(bundle), true);
                            break;
                        case 5:
                            qu0 qu0Var4 = this.b.d;
                            try {
                                qu0Var4.r1.getMediaDataController().installShortcut(qu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            ts0 ts0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = ts0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new j1(24, ts0Var, currentUser));
                            break;
                    }
                }
            }, fr0Var.getItemsCount() > 0);
            final int i24 = 3;
            H3.m(!TextUtils.isEmpty(fr0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, k31.D(fr0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.ps0
                public final /* synthetic */ ts0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            qu0 qu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var2.r1;
                            nh.gb E = nh.gb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = qu0Var2.f1;
                            String currentLang = qu0Var2.Q.getCurrentLang();
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
                            fr0 fr0Var2 = this.b.d.Q;
                            if (!fr0Var2.d()) {
                                fr0Var2.f();
                                break;
                            } else {
                                fr0Var2.h();
                                break;
                            }
                        case 3:
                            fr0 fr0Var3 = this.b.d.Q;
                            fr0Var3.b(fr0Var3.getCurrentLang());
                            break;
                        case 4:
                            qu0 qu0Var3 = this.b.d;
                            qu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.tn(bundle), true);
                            break;
                        case 5:
                            qu0 qu0Var4 = this.b.d;
                            try {
                                qu0Var4.r1.getMediaDataController().installShortcut(qu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            ts0 ts0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = ts0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new j1(24, ts0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        if (qu0Var.getSelectedTab() == 11) {
            j70 H4 = j70.H(o2Var, imageView);
            final int i25 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.ps0
                public final /* synthetic */ ts0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            qu0 qu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var2.r1;
                            nh.gb E = nh.gb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = qu0Var2.f1;
                            String currentLang = qu0Var2.Q.getCurrentLang();
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
                            fr0 fr0Var2 = this.b.d.Q;
                            if (!fr0Var2.d()) {
                                fr0Var2.f();
                                break;
                            } else {
                                fr0Var2.h();
                                break;
                            }
                        case 3:
                            fr0 fr0Var3 = this.b.d.Q;
                            fr0Var3.b(fr0Var3.getCurrentLang());
                            break;
                        case 4:
                            qu0 qu0Var3 = this.b.d;
                            qu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.tn(bundle), true);
                            break;
                        case 5:
                            qu0 qu0Var4 = this.b.d;
                            try {
                                qu0Var4.r1.getMediaDataController().installShortcut(qu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            ts0 ts0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = ts0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new j1(24, ts0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.ps0
                public final /* synthetic */ ts0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            qu0 qu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var2.r1;
                            nh.gb E = nh.gb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = qu0Var2.f1;
                            String currentLang = qu0Var2.Q.getCurrentLang();
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
                            fr0 fr0Var2 = this.b.d.Q;
                            if (!fr0Var2.d()) {
                                fr0Var2.f();
                                break;
                            } else {
                                fr0Var2.h();
                                break;
                            }
                        case 3:
                            fr0 fr0Var3 = this.b.d.Q;
                            fr0Var3.b(fr0Var3.getCurrentLang());
                            break;
                        case 4:
                            qu0 qu0Var3 = this.b.d;
                            qu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.tn(bundle), true);
                            break;
                        case 5:
                            qu0 qu0Var4 = this.b.d;
                            try {
                                qu0Var4.r1.getMediaDataController().installShortcut(qu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            ts0 ts0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = ts0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new j1(24, ts0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i26 = 6;
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.ps0
                public final /* synthetic */ ts0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i26) {
                        case 0:
                            qu0 qu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var2.r1;
                            nh.gb E = nh.gb.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j14 = qu0Var2.f1;
                            String currentLang = qu0Var2.Q.getCurrentLang();
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
                            fr0 fr0Var2 = this.b.d.Q;
                            if (!fr0Var2.d()) {
                                fr0Var2.f();
                                break;
                            } else {
                                fr0Var2.h();
                                break;
                            }
                        case 3:
                            fr0 fr0Var3 = this.b.d.Q;
                            fr0Var3.b(fr0Var3.getCurrentLang());
                            break;
                        case 4:
                            qu0 qu0Var3 = this.b.d;
                            qu0Var3.r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.tn(bundle), true);
                            break;
                        case 5:
                            qu0 qu0Var4 = this.b.d;
                            try {
                                qu0Var4.r1.getMediaDataController().installShortcut(qu0Var4.r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        default:
                            ts0 ts0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = ts0Var.d.r1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new j1(24, ts0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final j70 H5 = j70.H(o2Var, imageView);
        if ((closestTab == 8 || qu0.w0(closestTab)) && i11) {
            c3 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new g(this, this.b, H5), false);
            H5.k();
        } else {
            c3 = 0;
        }
        qu0Var.y(H5);
        if (!p02) {
            fu0 fu0Var = fu0VarArr[c3];
            if (!fu0Var.w || !fu0Var.v) {
                boolean[] zArr = fu0Var.i;
                if (zArr[c3] && zArr[1] && fu0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j10) && (user == null || !user.bot)) {
                        H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new rm(this, closestTab, H5, 13), false);
                        if (qu0Var.Z0 != null && !qu0Var.v0() && (chat = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(qu0Var.Z0.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                            final int i27 = 1;
                            H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.os0
                                public final /* synthetic */ ts0 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i27) {
                                        case 0:
                                            gr0 gr0Var2 = this.b.d.R;
                                            gr0Var2.getClass();
                                            gr0Var2.h(null, new ih.k2(gr0Var2, 0));
                                            H5.u();
                                            break;
                                        case 1:
                                            ts0 ts0Var = this.b;
                                            ts0Var.getClass();
                                            Bundle bundle = new Bundle();
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                            qu0 qu0Var2 = ts0Var.d;
                                            bundle.putLong("dialog_id", -qu0Var2.Z0.id);
                                            y90 y90Var = new y90(bundle, null);
                                            y90Var.c = qu0Var2.Z0;
                                            qu0Var2.r1.presentFragment(y90Var);
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
                                int i28 = 0;
                                int i29 = fu0VarArr[0].q;
                                g1Var8.setChecked(i29 == 0 || i29 == 1);
                                g1Var8.setOnClickListener(new rs0(this, g1Var9, g1Var8, i28));
                                int i30 = fu0VarArr[0].q;
                                g1Var9.setChecked(i30 == 0 || i30 == 2);
                                z11 = true;
                                g1Var9.setOnClickListener(new rs0(this, g1Var8, g1Var9, 1 == true ? 1 : 0));
                                H5.J = false;
                                H5.Y = z11;
                                H5.s = 0;
                                H5.Z();
                            }
                            final nu0 k12 = qu0Var.k1(closestTab);
                            if (k12 != null && (k6Var = k12.s) != null) {
                                g1Var8.setChecked(k6Var.n);
                                g1Var9.setChecked(k12.s.o);
                            }
                            final int i31 = 0;
                            g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qs0
                                public final /* synthetic */ ts0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i31) {
                                        case 0:
                                            qu0 qu0Var2 = this.b.d;
                                            if (!qu0Var2.D1) {
                                                org.telegram.ui.ActionBar.g1 g1Var10 = g1Var9;
                                                boolean z13 = g1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.g1 g1Var11 = g1Var8;
                                                if (!z13 && g1Var11.getCheckView().a.q) {
                                                    float f9 = -qu0Var2.o1;
                                                    qu0Var2.o1 = f9;
                                                    AndroidUtilities.shakeViewSpring(view2, f9);
                                                    break;
                                                } else {
                                                    g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                    lh.k6 k6Var2 = k12.s;
                                                    if (k6Var2 != null) {
                                                        boolean z14 = g1Var11.getCheckView().a.q;
                                                        boolean z15 = g1Var10.getCheckView().a.q;
                                                        k6Var2.n = z14;
                                                        k6Var2.o = z15;
                                                        k6Var2.d(true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            qu0 qu0Var3 = this.b.d;
                                            if (!qu0Var3.D1) {
                                                org.telegram.ui.ActionBar.g1 g1Var12 = g1Var9;
                                                boolean z16 = g1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.g1 g1Var13 = g1Var8;
                                                if (!z16 && g1Var13.getCheckView().a.q) {
                                                    float f10 = -qu0Var3.o1;
                                                    qu0Var3.o1 = f10;
                                                    AndroidUtilities.shakeViewSpring(view2, f10);
                                                    break;
                                                } else {
                                                    g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                    lh.k6 k6Var3 = k12.s;
                                                    if (k6Var3 != null) {
                                                        boolean z17 = g1Var12.getCheckView().a.q;
                                                        boolean z18 = g1Var13.getCheckView().a.q;
                                                        k6Var3.n = z17;
                                                        k6Var3.o = z18;
                                                        k6Var3.d(true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            final int i32 = 1;
                            g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qs0
                                public final /* synthetic */ ts0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i32) {
                                        case 0:
                                            qu0 qu0Var2 = this.b.d;
                                            if (!qu0Var2.D1) {
                                                org.telegram.ui.ActionBar.g1 g1Var10 = g1Var8;
                                                boolean z13 = g1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.g1 g1Var11 = g1Var9;
                                                if (!z13 && g1Var11.getCheckView().a.q) {
                                                    float f9 = -qu0Var2.o1;
                                                    qu0Var2.o1 = f9;
                                                    AndroidUtilities.shakeViewSpring(view2, f9);
                                                    break;
                                                } else {
                                                    g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                    lh.k6 k6Var2 = k12.s;
                                                    if (k6Var2 != null) {
                                                        boolean z14 = g1Var11.getCheckView().a.q;
                                                        boolean z15 = g1Var10.getCheckView().a.q;
                                                        k6Var2.n = z14;
                                                        k6Var2.o = z15;
                                                        k6Var2.d(true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            qu0 qu0Var3 = this.b.d;
                                            if (!qu0Var3.D1) {
                                                org.telegram.ui.ActionBar.g1 g1Var12 = g1Var8;
                                                boolean z16 = g1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.g1 g1Var13 = g1Var9;
                                                if (!z16 && g1Var13.getCheckView().a.q) {
                                                    float f10 = -qu0Var3.o1;
                                                    qu0Var3.o1 = f10;
                                                    AndroidUtilities.shakeViewSpring(view2, f10);
                                                    break;
                                                } else {
                                                    g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                    lh.k6 k6Var3 = k12.s;
                                                    if (k6Var3 != null) {
                                                        boolean z17 = g1Var12.getCheckView().a.q;
                                                        boolean z18 = g1Var13.getCheckView().a.q;
                                                        k6Var3.n = z17;
                                                        k6Var3.o = z18;
                                                        k6Var3.d(true);
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
                    z11 = true;
                    H5.J = false;
                    H5.Y = z11;
                    H5.s = 0;
                    H5.Z();
                }
            }
        }
        z10 = true;
        if (!DialogObject.isEncryptedDialog(j10)) {
            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new rm(this, closestTab, H5, 13), false);
            if (qu0Var.Z0 != null) {
                final int i272 = 1;
                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.os0
                    public final /* synthetic */ ts0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i272) {
                            case 0:
                                gr0 gr0Var2 = this.b.d.R;
                                gr0Var2.getClass();
                                gr0Var2.h(null, new ih.k2(gr0Var2, 0));
                                H5.u();
                                break;
                            case 1:
                                ts0 ts0Var = this.b;
                                ts0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qu0 qu0Var2 = ts0Var.d;
                                bundle.putLong("dialog_id", -qu0Var2.Z0.id);
                                y90 y90Var = new y90(bundle, null);
                                y90Var.c = qu0Var2.Z0;
                                qu0Var2.r1.presentFragment(y90Var);
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
            }
        }
        z11 = true;
        H5.J = false;
        H5.Y = z11;
        H5.s = 0;
        H5.Z();
    }
}
