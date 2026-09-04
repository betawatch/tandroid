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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bt0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ xu0 d;

    public bt0(xu0 xu0Var, long j3, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.d = xu0Var;
        this.a = j3;
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
        bi.u8 storiesController;
        char c10;
        boolean z10;
        boolean z11;
        ?? r82;
        bi.l8 l8Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.f1 f1Var;
        boolean z12;
        org.telegram.ui.ActionBar.f1 f1Var2;
        org.telegram.ui.ActionBar.f1 f1Var3;
        wu0 j12;
        final xu0 xu0Var = this.d;
        mu0[] mu0VarArr = xu0Var.t1;
        nr0 nr0Var = xu0Var.V;
        ImageView imageView = xu0Var.r0;
        lr0 lr0Var = xu0Var.U;
        int closestTab = xu0Var.getClosestTab();
        boolean p02 = xu0.p0(closestTab);
        final org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(n2Var.getCurrentAccount());
        long j3 = xu0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        storiesController = xu0Var.getStoriesController();
        boolean i10 = storiesController.i(j3);
        if (xu0.w0(closestTab) && i10 && (j12 = xu0Var.j1(closestTab)) != null) {
            final int i11 = j12.b;
            final n70 H = n70.H(n2Var, imageView);
            int i12 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i13 = 0;
            final long j10 = this.a;
            H.c(i12, string, new Runnable() { // from class: org.telegram.ui.Components.dr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            xu0Var.O0(n2Var, j10, i11);
                            H.u();
                            break;
                        default:
                            xu0Var.P0(n2Var, j10, i11);
                            H.u();
                            break;
                    }
                }
            }, false);
            xu0Var.x(H, n2Var, j10, i11);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new org.telegram.ui.dm(xu0Var, i11, H, 12), false);
            final int i14 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.dr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            xu0Var.O0(n2Var, j10, i11);
                            H.u();
                            break;
                        default:
                            xu0Var.P0(n2Var, j10, i11);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            xu0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i15 = 5;
        int i16 = 14;
        if (closestTab == 14) {
            yh.m2 currentPage = nr0Var.getCurrentPage();
            zh.j5 j5Var = currentPage.e;
            if (j5Var == null) {
                return;
            }
            long j11 = nr0Var.c;
            int i17 = nr0Var.b;
            boolean canUserDoAction = j11 == UserConfig.getInstance(i17).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i17).getChat(Long.valueOf(-j11)), 5);
            final n70 H2 = n70.H(n2Var, imageView);
            if (j5Var.c) {
                f1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, H2.e, H2.d, false, false);
                H2.d(f1Var4);
                f1Var = f1Var4;
                z12 = true;
            }
            if (nr0Var.b()) {
                final int i18 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.ws0
                    public final /* synthetic */ bt0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                nr0 nr0Var2 = this.b.d.V;
                                nr0Var2.getClass();
                                nr0Var2.h(null, new yh.r1(nr0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                bt0 bt0Var = this.b;
                                bt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                xu0 xu0Var2 = bt0Var.d;
                                bundle.putLong("dialog_id", -xu0Var2.d1.id);
                                ca0 ca0Var = new ca0(bundle, null);
                                ca0Var.c = xu0Var2.d1;
                                xu0Var2.v1.presentFragment(ca0Var);
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
            if (nr0Var.e.h()) {
                if (!j5Var.h().isEmpty() || currentPage.d) {
                    final int i19 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.ws0
                        public final /* synthetic */ bt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    nr0 nr0Var2 = this.b.d.V;
                                    nr0Var2.getClass();
                                    nr0Var2.h(null, new yh.r1(nr0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    bt0 bt0Var = this.b;
                                    bt0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    xu0 xu0Var2 = bt0Var.d;
                                    bundle.putLong("dialog_id", -xu0Var2.d1.id);
                                    ca0 ca0Var = new ca0(bundle, null);
                                    ca0Var.c = xu0Var2.d1;
                                    xu0Var2.v1.presentFragment(ca0Var);
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
            org.telegram.messenger.kk kkVar = new org.telegram.messenger.kk(f1Var, j5Var, h, h10, h11, h12, canUserDoAction, f1Var2, f1Var3, 3);
            org.telegram.ui.ActionBar.f1 f1Var5 = f1Var;
            org.telegram.ui.ActionBar.f1 f1Var6 = f1Var2;
            org.telegram.ui.ActionBar.f1 f1Var7 = f1Var3;
            kkVar.run();
            if (f1Var5 != null) {
                f1Var5.setOnClickListener(new ct(i16, j5Var, kkVar));
            }
            yh.q2.j(h, j5Var, kkVar, 1);
            yh.q2.j(h10, j5Var, kkVar, 2);
            yh.q2.j(h11, j5Var, kkVar, 4);
            yh.q2.j(h12, j5Var, kkVar, 8);
            if (canUserDoAction) {
                yh.q2.j(f1Var6, j5Var, kkVar, 256);
                yh.q2.j(f1Var7, j5Var, kkVar, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && lr0Var != null) {
            n70 H3 = n70.H(n2Var, imageView);
            boolean z13 = lr0Var.getItemsCount() < n2Var.getMessagesController().botPreviewMediasMax;
            final int i20 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            xu0 xu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var2.v1;
                            di.pc E = di.pc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = xu0Var2.j1;
                            String currentLang = xu0Var2.U.getCurrentLang();
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
                            lr0 lr0Var2 = this.b.d.U;
                            if (!lr0Var2.d()) {
                                lr0Var2.f();
                                break;
                            } else {
                                lr0Var2.h();
                                break;
                            }
                        case 3:
                            lr0 lr0Var3 = this.b.d.U;
                            lr0Var3.b(lr0Var3.getCurrentLang());
                            break;
                        case 4:
                            xu0 xu0Var3 = this.b.d;
                            xu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.co(bundle), true);
                            break;
                        case 5:
                            xu0 xu0Var4 = this.b.d;
                            try {
                                xu0Var4.v1.getMediaDataController().installShortcut(xu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = bt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new b3(15, bt0Var, currentUser));
                            break;
                    }
                }
            }, z13);
            final int i21 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            xu0 xu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var2.v1;
                            di.pc E = di.pc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = xu0Var2.j1;
                            String currentLang = xu0Var2.U.getCurrentLang();
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
                            lr0 lr0Var2 = this.b.d.U;
                            if (!lr0Var2.d()) {
                                lr0Var2.f();
                                break;
                            } else {
                                lr0Var2.h();
                                break;
                            }
                        case 3:
                            lr0 lr0Var3 = this.b.d.U;
                            lr0Var3.b(lr0Var3.getCurrentLang());
                            break;
                        case 4:
                            xu0 xu0Var3 = this.b.d;
                            xu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.co(bundle), true);
                            break;
                        case 5:
                            xu0 xu0Var4 = this.b.d;
                            try {
                                xu0Var4.v1.getMediaDataController().installShortcut(xu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = bt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new b3(15, bt0Var, currentUser));
                            break;
                    }
                }
            }, lr0Var.getItemsCount() > 1 && !lr0Var.d());
            final int i22 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(lr0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            xu0 xu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var2.v1;
                            di.pc E = di.pc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = xu0Var2.j1;
                            String currentLang = xu0Var2.U.getCurrentLang();
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
                            lr0 lr0Var2 = this.b.d.U;
                            if (!lr0Var2.d()) {
                                lr0Var2.f();
                                break;
                            } else {
                                lr0Var2.h();
                                break;
                            }
                        case 3:
                            lr0 lr0Var3 = this.b.d.U;
                            lr0Var3.b(lr0Var3.getCurrentLang());
                            break;
                        case 4:
                            xu0 xu0Var3 = this.b.d;
                            xu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.co(bundle), true);
                            break;
                        case 5:
                            xu0 xu0Var4 = this.b.d;
                            try {
                                xu0Var4.v1.getMediaDataController().installShortcut(xu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = bt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new b3(15, bt0Var, currentUser));
                            break;
                    }
                }
            }, lr0Var.getItemsCount() > 0);
            final int i23 = 3;
            H3.m(!TextUtils.isEmpty(lr0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, u31.D(lr0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.xs0
                public final /* synthetic */ bt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            xu0 xu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var2.v1;
                            di.pc E = di.pc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = xu0Var2.j1;
                            String currentLang = xu0Var2.U.getCurrentLang();
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
                            lr0 lr0Var2 = this.b.d.U;
                            if (!lr0Var2.d()) {
                                lr0Var2.f();
                                break;
                            } else {
                                lr0Var2.h();
                                break;
                            }
                        case 3:
                            lr0 lr0Var3 = this.b.d.U;
                            lr0Var3.b(lr0Var3.getCurrentLang());
                            break;
                        case 4:
                            xu0 xu0Var3 = this.b.d;
                            xu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.co(bundle), true);
                            break;
                        case 5:
                            xu0 xu0Var4 = this.b.d;
                            try {
                                xu0Var4.v1.getMediaDataController().installShortcut(xu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = bt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new b3(15, bt0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        if (xu0Var.getSelectedTab() == 11) {
            n70 H4 = n70.H(n2Var, imageView);
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
                            xu0 xu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var2.v1;
                            di.pc E = di.pc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = xu0Var2.j1;
                            String currentLang = xu0Var2.U.getCurrentLang();
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
                            lr0 lr0Var2 = this.b.d.U;
                            if (!lr0Var2.d()) {
                                lr0Var2.f();
                                break;
                            } else {
                                lr0Var2.h();
                                break;
                            }
                        case 3:
                            lr0 lr0Var3 = this.b.d.U;
                            lr0Var3.b(lr0Var3.getCurrentLang());
                            break;
                        case 4:
                            xu0 xu0Var3 = this.b.d;
                            xu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.co(bundle), true);
                            break;
                        case 5:
                            xu0 xu0Var4 = this.b.d;
                            try {
                                xu0Var4.v1.getMediaDataController().installShortcut(xu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = bt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new b3(15, bt0Var, currentUser));
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
                            xu0 xu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var2.v1;
                            di.pc E = di.pc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = xu0Var2.j1;
                            String currentLang = xu0Var2.U.getCurrentLang();
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
                            lr0 lr0Var2 = this.b.d.U;
                            if (!lr0Var2.d()) {
                                lr0Var2.f();
                                break;
                            } else {
                                lr0Var2.h();
                                break;
                            }
                        case 3:
                            lr0 lr0Var3 = this.b.d.U;
                            lr0Var3.b(lr0Var3.getCurrentLang());
                            break;
                        case 4:
                            xu0 xu0Var3 = this.b.d;
                            xu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.co(bundle), true);
                            break;
                        case 5:
                            xu0 xu0Var4 = this.b.d;
                            try {
                                xu0Var4.v1.getMediaDataController().installShortcut(xu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = bt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new b3(15, bt0Var, currentUser));
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
                            xu0 xu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var2.v1;
                            di.pc E = di.pc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = xu0Var2.j1;
                            String currentLang = xu0Var2.U.getCurrentLang();
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
                            lr0 lr0Var2 = this.b.d.U;
                            if (!lr0Var2.d()) {
                                lr0Var2.f();
                                break;
                            } else {
                                lr0Var2.h();
                                break;
                            }
                        case 3:
                            lr0 lr0Var3 = this.b.d.U;
                            lr0Var3.b(lr0Var3.getCurrentLang());
                            break;
                        case 4:
                            xu0 xu0Var3 = this.b.d;
                            xu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = xu0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.co(bundle), true);
                            break;
                        case 5:
                            xu0 xu0Var4 = this.b.d;
                            try {
                                xu0Var4.v1.getMediaDataController().installShortcut(xu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            bt0 bt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = bt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            e5.s(n2Var4, false, null, currentUser, false, true, false, true, new b3(15, bt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final n70 H5 = n70.H(n2Var, imageView);
        if ((closestTab == 8 || xu0.w0(closestTab)) && i10) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new er0(this, this.b, H5, 1), false);
            H5.k();
        } else {
            c10 = 0;
        }
        xu0Var.y(H5);
        if (!p02) {
            mu0 mu0Var = mu0VarArr[c10];
            if (!mu0Var.w || !mu0Var.v) {
                boolean[] zArr = mu0Var.i;
                if (zArr[c10] && zArr[1] && mu0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j3)) {
                        if (user == null || !user.bot) {
                            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new org.telegram.ui.dm(this, closestTab, H5, 14), false);
                            if (xu0Var.d1 != null && !xu0Var.v0() && (chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(xu0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
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
                                                nr0 nr0Var2 = this.b.d.V;
                                                nr0Var2.getClass();
                                                nr0Var2.h(null, new yh.r1(nr0Var2, 0));
                                                H5.u();
                                                break;
                                            case 1:
                                                bt0 bt0Var = this.b;
                                                bt0Var.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                                xu0 xu0Var2 = bt0Var.d;
                                                bundle.putLong("dialog_id", -xu0Var2.d1.id);
                                                ca0 ca0Var = new ca0(bundle, null);
                                                ca0Var.c = xu0Var2.d1;
                                                xu0Var2.v1.presentFragment(ca0Var);
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
                                    int i27 = 0;
                                    int i28 = mu0VarArr[0].q;
                                    f1Var8.setChecked(i28 == 0 || i28 == 1);
                                    f1Var8.setOnClickListener(new zs0(this, f1Var9, f1Var8, i27));
                                    int i29 = mu0VarArr[0].q;
                                    f1Var9.setChecked(i29 == 0 || i29 == 2);
                                    z11 = true;
                                    f1Var9.setOnClickListener(new zs0(this, f1Var8, f1Var9, 1 == true ? 1 : 0));
                                    r82 = 0;
                                    H5.J = r82;
                                    H5.Y = z11;
                                    H5.s = r82;
                                    H5.Z();
                                }
                                final uu0 k12 = xu0Var.k1(closestTab);
                                if (k12 != null && (l8Var = k12.s) != null) {
                                    f1Var8.setChecked(l8Var.n);
                                    f1Var9.setChecked(k12.s.o);
                                }
                                final int i30 = 0;
                                f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ys0
                                    public final /* synthetic */ bt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i30) {
                                            case 0:
                                                xu0 xu0Var2 = this.b.d;
                                                if (!xu0Var2.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var10 = f1Var9;
                                                    boolean z14 = f1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var11 = f1Var8;
                                                    if (!z14 && f1Var11.getCheckView().a.q) {
                                                        float f7 = -xu0Var2.s1;
                                                        xu0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        f1Var11.getCheckView().a(!f1Var11.getCheckView().a.q, true);
                                                        bi.l8 l8Var2 = k12.s;
                                                        if (l8Var2 != null) {
                                                            boolean z15 = f1Var11.getCheckView().a.q;
                                                            boolean z16 = f1Var10.getCheckView().a.q;
                                                            l8Var2.n = z15;
                                                            l8Var2.o = z16;
                                                            l8Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                xu0 xu0Var3 = this.b.d;
                                                if (!xu0Var3.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var12 = f1Var9;
                                                    boolean z17 = f1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var13 = f1Var8;
                                                    if (!z17 && f1Var13.getCheckView().a.q) {
                                                        float f10 = -xu0Var3.s1;
                                                        xu0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        f1Var13.getCheckView().a(!f1Var13.getCheckView().a.q, true);
                                                        bi.l8 l8Var3 = k12.s;
                                                        if (l8Var3 != null) {
                                                            boolean z18 = f1Var12.getCheckView().a.q;
                                                            boolean z19 = f1Var13.getCheckView().a.q;
                                                            l8Var3.n = z18;
                                                            l8Var3.o = z19;
                                                            l8Var3.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i31 = 1;
                                f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ys0
                                    public final /* synthetic */ bt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i31) {
                                            case 0:
                                                xu0 xu0Var2 = this.b.d;
                                                if (!xu0Var2.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var10 = f1Var8;
                                                    boolean z14 = f1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var11 = f1Var9;
                                                    if (!z14 && f1Var11.getCheckView().a.q) {
                                                        float f7 = -xu0Var2.s1;
                                                        xu0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        f1Var11.getCheckView().a(!f1Var11.getCheckView().a.q, true);
                                                        bi.l8 l8Var2 = k12.s;
                                                        if (l8Var2 != null) {
                                                            boolean z15 = f1Var11.getCheckView().a.q;
                                                            boolean z16 = f1Var10.getCheckView().a.q;
                                                            l8Var2.n = z15;
                                                            l8Var2.o = z16;
                                                            l8Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                xu0 xu0Var3 = this.b.d;
                                                if (!xu0Var3.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var12 = f1Var8;
                                                    boolean z17 = f1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var13 = f1Var9;
                                                    if (!z17 && f1Var13.getCheckView().a.q) {
                                                        float f10 = -xu0Var3.s1;
                                                        xu0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        f1Var13.getCheckView().a(!f1Var13.getCheckView().a.q, true);
                                                        bi.l8 l8Var3 = k12.s;
                                                        if (l8Var3 != null) {
                                                            boolean z18 = f1Var12.getCheckView().a.q;
                                                            boolean z19 = f1Var13.getCheckView().a.q;
                                                            l8Var3.n = z18;
                                                            l8Var3.o = z19;
                                                            l8Var3.d(true);
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
