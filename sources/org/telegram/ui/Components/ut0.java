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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ut0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ qv0 d;

    public ut0(qv0 qv0Var, long j3, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.d = qv0Var;
        this.a = j3;
        this.b = d6Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03a4  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ai.l9 storiesController;
        char c10;
        boolean z10;
        boolean z11;
        ai.d9 d9Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.f1 f1Var;
        boolean z12;
        org.telegram.ui.ActionBar.f1 f1Var2;
        org.telegram.ui.ActionBar.f1 f1Var3;
        pv0 j12;
        final qv0 qv0Var = this.d;
        fv0[] fv0VarArr = qv0Var.t1;
        gs0 gs0Var = qv0Var.V;
        ImageView imageView = qv0Var.r0;
        es0 es0Var = qv0Var.U;
        int closestTab = qv0Var.getClosestTab();
        boolean p02 = qv0.p0(closestTab);
        final org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(n2Var.getCurrentAccount());
        long j3 = qv0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        storiesController = qv0Var.getStoriesController();
        boolean i10 = storiesController.i(j3);
        int i11 = 11;
        if (qv0.w0(closestTab) && i10 && (j12 = qv0Var.j1(closestTab)) != null) {
            final int i12 = j12.b;
            final b80 H = b80.H(n2Var, imageView);
            int i13 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i14 = 0;
            final long j10 = this.a;
            H.c(i13, string, new Runnable() { // from class: org.telegram.ui.Components.xr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            qv0Var.O0(n2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            qv0Var.P0(n2Var, j10, i12);
                            H.u();
                            break;
                    }
                }
            }, false);
            qv0Var.x(H, n2Var, j10, i12);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new zm(qv0Var, i12, H, i11), false);
            final int i15 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.xr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            qv0Var.O0(n2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            qv0Var.P0(n2Var, j10, i12);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            qv0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i16 = 5;
        int i17 = 14;
        if (closestTab == 14) {
            xh.o2 currentPage = gs0Var.getCurrentPage();
            yh.l5 l5Var = currentPage.e;
            if (l5Var == null) {
                return;
            }
            long j11 = gs0Var.c;
            int i18 = gs0Var.b;
            boolean canUserDoAction = j11 == UserConfig.getInstance(i18).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i18).getChat(Long.valueOf(-j11)), 5);
            final b80 H2 = b80.H(n2Var, imageView);
            if (l5Var.c) {
                f1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, H2.e, H2.d, false, false);
                H2.d(f1Var4);
                f1Var = f1Var4;
                z12 = true;
            }
            if (gs0Var.b()) {
                final int i19 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.pt0
                    public final /* synthetic */ ut0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                gs0 gs0Var2 = this.b.d.V;
                                gs0Var2.getClass();
                                gs0Var2.h(null, new xh.t1(gs0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                ut0 ut0Var = this.b;
                                ut0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qv0 qv0Var2 = ut0Var.d;
                                bundle.putLong("dialog_id", -qv0Var2.d1.id);
                                pa0 pa0Var = new pa0(bundle, null);
                                pa0Var.c = qv0Var2.d1;
                                qv0Var2.v1.presentFragment(pa0Var);
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
            if (gs0Var.e.h()) {
                if (!l5Var.h().isEmpty() || currentPage.d) {
                    final int i20 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.pt0
                        public final /* synthetic */ ut0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i20) {
                                case 0:
                                    gs0 gs0Var2 = this.b.d.V;
                                    gs0Var2.getClass();
                                    gs0Var2.h(null, new xh.t1(gs0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    ut0 ut0Var = this.b;
                                    ut0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qv0 qv0Var2 = ut0Var.d;
                                    bundle.putLong("dialog_id", -qv0Var2.d1.id);
                                    pa0 pa0Var = new pa0(bundle, null);
                                    pa0Var.c = qv0Var2.d1;
                                    qv0Var2.v1.presentFragment(pa0Var);
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
            org.telegram.ui.ActionBar.f1 h = H2.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.f1 h10 = H2.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.f1 h11 = H2.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.f1 h12 = H2.h();
            h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                H2.k();
                org.telegram.ui.ActionBar.f1 h13 = H2.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.f1 h14 = H2.h();
                h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                f1Var3 = h14;
                f1Var2 = h13;
            } else {
                f1Var2 = null;
                f1Var3 = null;
            }
            org.telegram.messenger.jk jkVar = new org.telegram.messenger.jk(f1Var, l5Var, h, h10, h11, h12, canUserDoAction, f1Var2, f1Var3, 3);
            org.telegram.ui.ActionBar.f1 f1Var5 = f1Var;
            org.telegram.ui.ActionBar.f1 f1Var6 = f1Var2;
            org.telegram.ui.ActionBar.f1 f1Var7 = f1Var3;
            jkVar.run();
            if (f1Var5 != null) {
                f1Var5.setOnClickListener(new gt(i17, l5Var, jkVar));
            }
            xh.s2.j(h, l5Var, jkVar, 1);
            xh.s2.j(h10, l5Var, jkVar, 2);
            xh.s2.j(h11, l5Var, jkVar, 4);
            xh.s2.j(h12, l5Var, jkVar, 8);
            if (canUserDoAction) {
                xh.s2.j(f1Var6, l5Var, jkVar, 256);
                xh.s2.j(f1Var7, l5Var, jkVar, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && es0Var != null) {
            b80 H3 = b80.H(n2Var, imageView);
            boolean z13 = es0Var.getItemsCount() < n2Var.getMessagesController().botPreviewMediasMax;
            final int i21 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.qt0
                public final /* synthetic */ ut0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            qv0 qv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var2.v1;
                            ci.kc E = ci.kc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = qv0Var2.j1;
                            String currentLang = qv0Var2.U.getCurrentLang();
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
                            es0 es0Var2 = this.b.d.U;
                            if (!es0Var2.d()) {
                                es0Var2.f();
                                break;
                            } else {
                                es0Var2.h();
                                break;
                            }
                        case 3:
                            es0 es0Var3 = this.b.d.U;
                            es0Var3.b(es0Var3.getCurrentLang());
                            break;
                        case 4:
                            qv0 qv0Var3 = this.b.d;
                            qv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = qv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.yn(bundle), true);
                            break;
                        case 5:
                            qv0 qv0Var4 = this.b.d;
                            try {
                                qv0Var4.v1.getMediaDataController().installShortcut(qv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            ut0 ut0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ut0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new w2(17, ut0Var, currentUser));
                            break;
                    }
                }
            }, z13);
            final int i22 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.qt0
                public final /* synthetic */ ut0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            qv0 qv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var2.v1;
                            ci.kc E = ci.kc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = qv0Var2.j1;
                            String currentLang = qv0Var2.U.getCurrentLang();
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
                            es0 es0Var2 = this.b.d.U;
                            if (!es0Var2.d()) {
                                es0Var2.f();
                                break;
                            } else {
                                es0Var2.h();
                                break;
                            }
                        case 3:
                            es0 es0Var3 = this.b.d.U;
                            es0Var3.b(es0Var3.getCurrentLang());
                            break;
                        case 4:
                            qv0 qv0Var3 = this.b.d;
                            qv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = qv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.yn(bundle), true);
                            break;
                        case 5:
                            qv0 qv0Var4 = this.b.d;
                            try {
                                qv0Var4.v1.getMediaDataController().installShortcut(qv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            ut0 ut0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ut0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new w2(17, ut0Var, currentUser));
                            break;
                    }
                }
            }, es0Var.getItemsCount() > 1 && !es0Var.d());
            final int i23 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(es0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.qt0
                public final /* synthetic */ ut0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            qv0 qv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var2.v1;
                            ci.kc E = ci.kc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = qv0Var2.j1;
                            String currentLang = qv0Var2.U.getCurrentLang();
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
                            es0 es0Var2 = this.b.d.U;
                            if (!es0Var2.d()) {
                                es0Var2.f();
                                break;
                            } else {
                                es0Var2.h();
                                break;
                            }
                        case 3:
                            es0 es0Var3 = this.b.d.U;
                            es0Var3.b(es0Var3.getCurrentLang());
                            break;
                        case 4:
                            qv0 qv0Var3 = this.b.d;
                            qv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = qv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.yn(bundle), true);
                            break;
                        case 5:
                            qv0 qv0Var4 = this.b.d;
                            try {
                                qv0Var4.v1.getMediaDataController().installShortcut(qv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            ut0 ut0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ut0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new w2(17, ut0Var, currentUser));
                            break;
                    }
                }
            }, es0Var.getItemsCount() > 0);
            final int i24 = 3;
            H3.m(!TextUtils.isEmpty(es0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, u41.C(es0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.qt0
                public final /* synthetic */ ut0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            qv0 qv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var2.v1;
                            ci.kc E = ci.kc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = qv0Var2.j1;
                            String currentLang = qv0Var2.U.getCurrentLang();
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
                            es0 es0Var2 = this.b.d.U;
                            if (!es0Var2.d()) {
                                es0Var2.f();
                                break;
                            } else {
                                es0Var2.h();
                                break;
                            }
                        case 3:
                            es0 es0Var3 = this.b.d.U;
                            es0Var3.b(es0Var3.getCurrentLang());
                            break;
                        case 4:
                            qv0 qv0Var3 = this.b.d;
                            qv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = qv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.yn(bundle), true);
                            break;
                        case 5:
                            qv0 qv0Var4 = this.b.d;
                            try {
                                qv0Var4.v1.getMediaDataController().installShortcut(qv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            ut0 ut0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ut0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new w2(17, ut0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        if (qv0Var.getSelectedTab() == 11) {
            b80 H4 = b80.H(n2Var, imageView);
            final int i25 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.qt0
                public final /* synthetic */ ut0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            qv0 qv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var2.v1;
                            ci.kc E = ci.kc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = qv0Var2.j1;
                            String currentLang = qv0Var2.U.getCurrentLang();
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
                            es0 es0Var2 = this.b.d.U;
                            if (!es0Var2.d()) {
                                es0Var2.f();
                                break;
                            } else {
                                es0Var2.h();
                                break;
                            }
                        case 3:
                            es0 es0Var3 = this.b.d.U;
                            es0Var3.b(es0Var3.getCurrentLang());
                            break;
                        case 4:
                            qv0 qv0Var3 = this.b.d;
                            qv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = qv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.yn(bundle), true);
                            break;
                        case 5:
                            qv0 qv0Var4 = this.b.d;
                            try {
                                qv0Var4.v1.getMediaDataController().installShortcut(qv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            ut0 ut0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ut0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new w2(17, ut0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.qt0
                public final /* synthetic */ ut0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            qv0 qv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var2.v1;
                            ci.kc E = ci.kc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = qv0Var2.j1;
                            String currentLang = qv0Var2.U.getCurrentLang();
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
                            es0 es0Var2 = this.b.d.U;
                            if (!es0Var2.d()) {
                                es0Var2.f();
                                break;
                            } else {
                                es0Var2.h();
                                break;
                            }
                        case 3:
                            es0 es0Var3 = this.b.d.U;
                            es0Var3.b(es0Var3.getCurrentLang());
                            break;
                        case 4:
                            qv0 qv0Var3 = this.b.d;
                            qv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = qv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.yn(bundle), true);
                            break;
                        case 5:
                            qv0 qv0Var4 = this.b.d;
                            try {
                                qv0Var4.v1.getMediaDataController().installShortcut(qv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            ut0 ut0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ut0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new w2(17, ut0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i26 = 6;
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.qt0
                public final /* synthetic */ ut0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i26) {
                        case 0:
                            qv0 qv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = qv0Var2.v1;
                            ci.kc E = ci.kc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = qv0Var2.j1;
                            String currentLang = qv0Var2.U.getCurrentLang();
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
                            es0 es0Var2 = this.b.d.U;
                            if (!es0Var2.d()) {
                                es0Var2.f();
                                break;
                            } else {
                                es0Var2.h();
                                break;
                            }
                        case 3:
                            es0 es0Var3 = this.b.d.U;
                            es0Var3.b(es0Var3.getCurrentLang());
                            break;
                        case 4:
                            qv0 qv0Var3 = this.b.d;
                            qv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = qv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.yn(bundle), true);
                            break;
                        case 5:
                            qv0 qv0Var4 = this.b.d;
                            try {
                                qv0Var4.v1.getMediaDataController().installShortcut(qv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            ut0 ut0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ut0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new w2(17, ut0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final b80 H5 = b80.H(n2Var, imageView);
        if ((closestTab == 8 || qv0.w0(closestTab)) && i10) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new in0(this, this.b, H5, 4), false);
            H5.k();
        } else {
            c10 = 0;
        }
        qv0Var.y(H5);
        if (!p02) {
            fv0 fv0Var = fv0VarArr[c10];
            if (!fv0Var.w || !fv0Var.v) {
                boolean[] zArr = fv0Var.i;
                if (zArr[c10] && zArr[1] && fv0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j3) && (user == null || !user.bot)) {
                        H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new zm(this, closestTab, H5, 13), false);
                        if (qv0Var.d1 != null && !qv0Var.v0() && (chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(qv0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                            final int i27 = 1;
                            H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.pt0
                                public final /* synthetic */ ut0 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i27) {
                                        case 0:
                                            gs0 gs0Var2 = this.b.d.V;
                                            gs0Var2.getClass();
                                            gs0Var2.h(null, new xh.t1(gs0Var2, 0));
                                            H5.u();
                                            break;
                                        case 1:
                                            ut0 ut0Var = this.b;
                                            ut0Var.getClass();
                                            Bundle bundle = new Bundle();
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                            qv0 qv0Var2 = ut0Var.d;
                                            bundle.putLong("dialog_id", -qv0Var2.d1.id);
                                            pa0 pa0Var = new pa0(bundle, null);
                                            pa0Var.c = qv0Var2.d1;
                                            qv0Var2.v1.presentFragment(pa0Var);
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
                            final org.telegram.ui.ActionBar.f1 f1Var8 = new org.telegram.ui.ActionBar.f1(1, this.c, this.b, false, false);
                            final org.telegram.ui.ActionBar.f1 f1Var9 = new org.telegram.ui.ActionBar.f1(1, this.c, this.b, false, true);
                            f1Var8.g(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0, null);
                            H5.A.addView(f1Var8);
                            f1Var9.g(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0, null);
                            H5.A.addView(f1Var9);
                            if (!p02) {
                                int i28 = 0;
                                int i29 = fv0VarArr[0].q;
                                f1Var8.setChecked(i29 == 0 || i29 == 1);
                                f1Var8.setOnClickListener(new st0(this, f1Var9, f1Var8, i28));
                                int i30 = fv0VarArr[0].q;
                                f1Var9.setChecked(i30 == 0 || i30 == 2);
                                z11 = true;
                                f1Var9.setOnClickListener(new st0(this, f1Var8, f1Var9, 1 == true ? 1 : 0));
                                H5.J = false;
                                H5.Y = z11;
                                H5.s = 0;
                                H5.Z();
                            }
                            final nv0 k12 = qv0Var.k1(closestTab);
                            if (k12 != null && (d9Var = k12.s) != null) {
                                f1Var8.setChecked(d9Var.n);
                                f1Var9.setChecked(k12.s.o);
                            }
                            final int i31 = 0;
                            f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rt0
                                public final /* synthetic */ ut0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i31) {
                                        case 0:
                                            qv0 qv0Var2 = this.b.d;
                                            if (!qv0Var2.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var10 = f1Var9;
                                                boolean z14 = f1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var11 = f1Var8;
                                                if (!z14 && f1Var11.getCheckView().a.q) {
                                                    float f7 = -qv0Var2.s1;
                                                    qv0Var2.s1 = f7;
                                                    AndroidUtilities.shakeViewSpring(view2, f7);
                                                    break;
                                                } else {
                                                    f1Var11.getCheckView().a(!f1Var11.getCheckView().a.q, true);
                                                    ai.d9 d9Var2 = k12.s;
                                                    if (d9Var2 != null) {
                                                        boolean z15 = f1Var11.getCheckView().a.q;
                                                        boolean z16 = f1Var10.getCheckView().a.q;
                                                        d9Var2.n = z15;
                                                        d9Var2.o = z16;
                                                        d9Var2.d(true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            qv0 qv0Var3 = this.b.d;
                                            if (!qv0Var3.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var12 = f1Var9;
                                                boolean z17 = f1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var13 = f1Var8;
                                                if (!z17 && f1Var13.getCheckView().a.q) {
                                                    float f10 = -qv0Var3.s1;
                                                    qv0Var3.s1 = f10;
                                                    AndroidUtilities.shakeViewSpring(view2, f10);
                                                    break;
                                                } else {
                                                    f1Var13.getCheckView().a(!f1Var13.getCheckView().a.q, true);
                                                    ai.d9 d9Var3 = k12.s;
                                                    if (d9Var3 != null) {
                                                        boolean z18 = f1Var12.getCheckView().a.q;
                                                        boolean z19 = f1Var13.getCheckView().a.q;
                                                        d9Var3.n = z18;
                                                        d9Var3.o = z19;
                                                        d9Var3.d(true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            final int i32 = 1;
                            f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rt0
                                public final /* synthetic */ ut0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i32) {
                                        case 0:
                                            qv0 qv0Var2 = this.b.d;
                                            if (!qv0Var2.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var10 = f1Var8;
                                                boolean z14 = f1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var11 = f1Var9;
                                                if (!z14 && f1Var11.getCheckView().a.q) {
                                                    float f7 = -qv0Var2.s1;
                                                    qv0Var2.s1 = f7;
                                                    AndroidUtilities.shakeViewSpring(view2, f7);
                                                    break;
                                                } else {
                                                    f1Var11.getCheckView().a(!f1Var11.getCheckView().a.q, true);
                                                    ai.d9 d9Var2 = k12.s;
                                                    if (d9Var2 != null) {
                                                        boolean z15 = f1Var11.getCheckView().a.q;
                                                        boolean z16 = f1Var10.getCheckView().a.q;
                                                        d9Var2.n = z15;
                                                        d9Var2.o = z16;
                                                        d9Var2.d(true);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            qv0 qv0Var3 = this.b.d;
                                            if (!qv0Var3.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var12 = f1Var8;
                                                boolean z17 = f1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var13 = f1Var9;
                                                if (!z17 && f1Var13.getCheckView().a.q) {
                                                    float f10 = -qv0Var3.s1;
                                                    qv0Var3.s1 = f10;
                                                    AndroidUtilities.shakeViewSpring(view2, f10);
                                                    break;
                                                } else {
                                                    f1Var13.getCheckView().a(!f1Var13.getCheckView().a.q, true);
                                                    ai.d9 d9Var3 = k12.s;
                                                    if (d9Var3 != null) {
                                                        boolean z18 = f1Var12.getCheckView().a.q;
                                                        boolean z19 = f1Var13.getCheckView().a.q;
                                                        d9Var3.n = z18;
                                                        d9Var3.o = z19;
                                                        d9Var3.d(true);
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
        if (!DialogObject.isEncryptedDialog(j3)) {
            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new zm(this, closestTab, H5, 13), false);
            if (qv0Var.d1 != null) {
                final int i272 = 1;
                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.pt0
                    public final /* synthetic */ ut0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i272) {
                            case 0:
                                gs0 gs0Var2 = this.b.d.V;
                                gs0Var2.getClass();
                                gs0Var2.h(null, new xh.t1(gs0Var2, 0));
                                H5.u();
                                break;
                            case 1:
                                ut0 ut0Var = this.b;
                                ut0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qv0 qv0Var2 = ut0Var.d;
                                bundle.putLong("dialog_id", -qv0Var2.d1.id);
                                pa0 pa0Var = new pa0(bundle, null);
                                pa0Var.c = qv0Var2.d1;
                                qv0Var2.v1.presentFragment(pa0Var);
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
            }
        }
        z11 = true;
        H5.J = false;
        H5.Y = z11;
        H5.s = 0;
        H5.Z();
    }
}
