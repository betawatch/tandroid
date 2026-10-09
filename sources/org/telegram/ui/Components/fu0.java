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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fu0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ bw0 d;

    public fu0(bw0 bw0Var, long j3, org.telegram.ui.ActionBar.e6 e6Var, Context context) {
        this.d = bw0Var;
        this.a = j3;
        this.b = e6Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0345  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ai.m9 storiesController;
        char c10;
        boolean z10;
        boolean z11;
        ?? r82;
        ai.e9 e9Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.f1 f1Var;
        boolean z12;
        org.telegram.ui.ActionBar.f1 f1Var2;
        org.telegram.ui.ActionBar.f1 f1Var3;
        aw0 j12;
        final bw0 bw0Var = this.d;
        qv0[] qv0VarArr = bw0Var.t1;
        rs0 rs0Var = bw0Var.V;
        ImageView imageView = bw0Var.r0;
        qs0 qs0Var = bw0Var.U;
        int closestTab = bw0Var.getClosestTab();
        boolean p02 = bw0.p0(closestTab);
        final org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(n2Var.getCurrentAccount());
        long j3 = bw0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        storiesController = bw0Var.getStoriesController();
        boolean i10 = storiesController.i(j3);
        if (bw0.w0(closestTab) && i10 && (j12 = bw0Var.j1(closestTab)) != null) {
            final int i11 = j12.b;
            final p80 H = p80.H(n2Var, imageView);
            int i12 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i13 = 0;
            final long j10 = this.a;
            H.c(i12, string, new Runnable() { // from class: org.telegram.ui.Components.js0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            bw0Var.O0(n2Var, j10, i11);
                            H.u();
                            break;
                        default:
                            bw0Var.P0(n2Var, j10, i11);
                            H.u();
                            break;
                    }
                }
            }, false);
            bw0Var.x(H, n2Var, j10, i11);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new zk(bw0Var, i11, H, 12), false);
            final int i14 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.js0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            bw0Var.O0(n2Var, j10, i11);
                            H.u();
                            break;
                        default:
                            bw0Var.P0(n2Var, j10, i11);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            bw0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i15 = 5;
        int i16 = 14;
        if (closestTab == 14) {
            xh.o2 currentPage = rs0Var.getCurrentPage();
            yh.e5 e5Var = currentPage.e;
            if (e5Var == null) {
                return;
            }
            long j11 = rs0Var.c;
            int i17 = rs0Var.b;
            boolean canUserDoAction = j11 == UserConfig.getInstance(i17).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i17).getChat(Long.valueOf(-j11)), 5);
            final p80 H2 = p80.H(n2Var, imageView);
            if (e5Var.c) {
                f1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, H2.e, H2.d, false, false);
                H2.d(f1Var4);
                f1Var = f1Var4;
                z12 = true;
            }
            if (rs0Var.b()) {
                final int i18 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.au0
                    public final /* synthetic */ fu0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                rs0 rs0Var2 = this.b.d.V;
                                rs0Var2.getClass();
                                rs0Var2.h(null, new xh.t1(rs0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                fu0 fu0Var = this.b;
                                fu0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                bw0 bw0Var2 = fu0Var.d;
                                bundle.putLong("dialog_id", -bw0Var2.d1.id);
                                db0 db0Var = new db0(bundle, null);
                                db0Var.c = bw0Var2.d1;
                                bw0Var2.v1.presentFragment(db0Var);
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
            if (rs0Var.e.h()) {
                if (!e5Var.h().isEmpty() || currentPage.d) {
                    final int i19 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.au0
                        public final /* synthetic */ fu0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    rs0 rs0Var2 = this.b.d.V;
                                    rs0Var2.getClass();
                                    rs0Var2.h(null, new xh.t1(rs0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    fu0 fu0Var = this.b;
                                    fu0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    bw0 bw0Var2 = fu0Var.d;
                                    bundle.putLong("dialog_id", -bw0Var2.d1.id);
                                    db0 db0Var = new db0(bundle, null);
                                    db0Var.c = bw0Var2.d1;
                                    bw0Var2.v1.presentFragment(db0Var);
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
            org.telegram.messenger.zj zjVar = new org.telegram.messenger.zj(f1Var, e5Var, h, h10, h11, h12, canUserDoAction, f1Var2, f1Var3, 3);
            org.telegram.ui.ActionBar.f1 f1Var5 = f1Var;
            org.telegram.ui.ActionBar.f1 f1Var6 = f1Var2;
            org.telegram.ui.ActionBar.f1 f1Var7 = f1Var3;
            zjVar.run();
            if (f1Var5 != null) {
                f1Var5.setOnClickListener(new ut(i16, e5Var, zjVar));
            }
            xh.s2.j(h, e5Var, zjVar, 1);
            xh.s2.j(h10, e5Var, zjVar, 2);
            xh.s2.j(h11, e5Var, zjVar, 4);
            xh.s2.j(h12, e5Var, zjVar, 8);
            if (canUserDoAction) {
                xh.s2.j(f1Var6, e5Var, zjVar, 256);
                xh.s2.j(f1Var7, e5Var, zjVar, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && qs0Var != null) {
            p80 H3 = p80.H(n2Var, imageView);
            boolean z13 = qs0Var.getItemsCount() < n2Var.getMessagesController().botPreviewMediasMax;
            final int i20 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.bu0
                public final /* synthetic */ fu0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            bw0 bw0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var2.v1;
                            ci.lc D = ci.lc.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = bw0Var2.j1;
                            String currentLang = bw0Var2.U.getCurrentLang();
                            D.v0 = j13;
                            D.w0 = currentLang;
                            D.Q(null);
                            D.v0 = j13;
                            D.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            qs0 qs0Var2 = this.b.d.U;
                            if (!qs0Var2.d()) {
                                qs0Var2.f();
                                break;
                            } else {
                                qs0Var2.h();
                                break;
                            }
                        case 3:
                            qs0 qs0Var3 = this.b.d.U;
                            qs0Var3.b(qs0Var3.getCurrentLang());
                            break;
                        case 4:
                            bw0 bw0Var3 = this.b.d;
                            bw0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            bw0 bw0Var4 = this.b.d;
                            try {
                                bw0Var4.v1.getMediaDataController().installShortcut(bw0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            fu0 fu0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = fu0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            g5.r(n2Var4, false, null, currentUser, false, true, false, true, new y2(16, fu0Var, currentUser));
                            break;
                    }
                }
            }, z13);
            final int i21 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.bu0
                public final /* synthetic */ fu0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            bw0 bw0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var2.v1;
                            ci.lc D = ci.lc.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = bw0Var2.j1;
                            String currentLang = bw0Var2.U.getCurrentLang();
                            D.v0 = j13;
                            D.w0 = currentLang;
                            D.Q(null);
                            D.v0 = j13;
                            D.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            qs0 qs0Var2 = this.b.d.U;
                            if (!qs0Var2.d()) {
                                qs0Var2.f();
                                break;
                            } else {
                                qs0Var2.h();
                                break;
                            }
                        case 3:
                            qs0 qs0Var3 = this.b.d.U;
                            qs0Var3.b(qs0Var3.getCurrentLang());
                            break;
                        case 4:
                            bw0 bw0Var3 = this.b.d;
                            bw0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            bw0 bw0Var4 = this.b.d;
                            try {
                                bw0Var4.v1.getMediaDataController().installShortcut(bw0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            fu0 fu0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = fu0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            g5.r(n2Var4, false, null, currentUser, false, true, false, true, new y2(16, fu0Var, currentUser));
                            break;
                    }
                }
            }, qs0Var.getItemsCount() > 1 && !qs0Var.d());
            final int i22 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(qs0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.bu0
                public final /* synthetic */ fu0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            bw0 bw0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var2.v1;
                            ci.lc D = ci.lc.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = bw0Var2.j1;
                            String currentLang = bw0Var2.U.getCurrentLang();
                            D.v0 = j13;
                            D.w0 = currentLang;
                            D.Q(null);
                            D.v0 = j13;
                            D.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            qs0 qs0Var2 = this.b.d.U;
                            if (!qs0Var2.d()) {
                                qs0Var2.f();
                                break;
                            } else {
                                qs0Var2.h();
                                break;
                            }
                        case 3:
                            qs0 qs0Var3 = this.b.d.U;
                            qs0Var3.b(qs0Var3.getCurrentLang());
                            break;
                        case 4:
                            bw0 bw0Var3 = this.b.d;
                            bw0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            bw0 bw0Var4 = this.b.d;
                            try {
                                bw0Var4.v1.getMediaDataController().installShortcut(bw0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            fu0 fu0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = fu0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            g5.r(n2Var4, false, null, currentUser, false, true, false, true, new y2(16, fu0Var, currentUser));
                            break;
                    }
                }
            }, qs0Var.getItemsCount() > 0);
            final int i23 = 3;
            H3.m(!TextUtils.isEmpty(qs0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, b51.F(qs0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.bu0
                public final /* synthetic */ fu0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            bw0 bw0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var2.v1;
                            ci.lc D = ci.lc.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = bw0Var2.j1;
                            String currentLang = bw0Var2.U.getCurrentLang();
                            D.v0 = j13;
                            D.w0 = currentLang;
                            D.Q(null);
                            D.v0 = j13;
                            D.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            qs0 qs0Var2 = this.b.d.U;
                            if (!qs0Var2.d()) {
                                qs0Var2.f();
                                break;
                            } else {
                                qs0Var2.h();
                                break;
                            }
                        case 3:
                            qs0 qs0Var3 = this.b.d.U;
                            qs0Var3.b(qs0Var3.getCurrentLang());
                            break;
                        case 4:
                            bw0 bw0Var3 = this.b.d;
                            bw0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            bw0 bw0Var4 = this.b.d;
                            try {
                                bw0Var4.v1.getMediaDataController().installShortcut(bw0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            fu0 fu0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = fu0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            g5.r(n2Var4, false, null, currentUser, false, true, false, true, new y2(16, fu0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        final int i24 = 6;
        if (bw0Var.getSelectedTab() == 11) {
            p80 H4 = p80.H(n2Var, imageView);
            final int i25 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.bu0
                public final /* synthetic */ fu0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            bw0 bw0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var2.v1;
                            ci.lc D = ci.lc.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = bw0Var2.j1;
                            String currentLang = bw0Var2.U.getCurrentLang();
                            D.v0 = j13;
                            D.w0 = currentLang;
                            D.Q(null);
                            D.v0 = j13;
                            D.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            qs0 qs0Var2 = this.b.d.U;
                            if (!qs0Var2.d()) {
                                qs0Var2.f();
                                break;
                            } else {
                                qs0Var2.h();
                                break;
                            }
                        case 3:
                            qs0 qs0Var3 = this.b.d.U;
                            qs0Var3.b(qs0Var3.getCurrentLang());
                            break;
                        case 4:
                            bw0 bw0Var3 = this.b.d;
                            bw0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            bw0 bw0Var4 = this.b.d;
                            try {
                                bw0Var4.v1.getMediaDataController().installShortcut(bw0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            fu0 fu0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = fu0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            g5.r(n2Var4, false, null, currentUser, false, true, false, true, new y2(16, fu0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.bu0
                public final /* synthetic */ fu0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            bw0 bw0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var2.v1;
                            ci.lc D = ci.lc.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = bw0Var2.j1;
                            String currentLang = bw0Var2.U.getCurrentLang();
                            D.v0 = j13;
                            D.w0 = currentLang;
                            D.Q(null);
                            D.v0 = j13;
                            D.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            qs0 qs0Var2 = this.b.d.U;
                            if (!qs0Var2.d()) {
                                qs0Var2.f();
                                break;
                            } else {
                                qs0Var2.h();
                                break;
                            }
                        case 3:
                            qs0 qs0Var3 = this.b.d.U;
                            qs0Var3.b(qs0Var3.getCurrentLang());
                            break;
                        case 4:
                            bw0 bw0Var3 = this.b.d;
                            bw0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            bw0 bw0Var4 = this.b.d;
                            try {
                                bw0Var4.v1.getMediaDataController().installShortcut(bw0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            fu0 fu0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = fu0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            g5.r(n2Var4, false, null, currentUser, false, true, false, true, new y2(16, fu0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.bu0
                public final /* synthetic */ fu0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            bw0 bw0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var2.v1;
                            ci.lc D = ci.lc.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = bw0Var2.j1;
                            String currentLang = bw0Var2.U.getCurrentLang();
                            D.v0 = j13;
                            D.w0 = currentLang;
                            D.Q(null);
                            D.v0 = j13;
                            D.w0 = currentLang;
                            break;
                        case 1:
                            this.b.d.U.f();
                            break;
                        case 2:
                            qs0 qs0Var2 = this.b.d.U;
                            if (!qs0Var2.d()) {
                                qs0Var2.f();
                                break;
                            } else {
                                qs0Var2.h();
                                break;
                            }
                        case 3:
                            qs0 qs0Var3 = this.b.d.U;
                            qs0Var3.b(qs0Var3.getCurrentLang());
                            break;
                        case 4:
                            bw0 bw0Var3 = this.b.d;
                            bw0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            bw0 bw0Var4 = this.b.d;
                            try {
                                bw0Var4.v1.getMediaDataController().installShortcut(bw0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        default:
                            fu0 fu0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = fu0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            g5.r(n2Var4, false, null, currentUser, false, true, false, true, new y2(16, fu0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final p80 H5 = p80.H(n2Var, imageView);
        if ((closestTab == 8 || bw0.w0(closestTab)) && i10) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new og0(this, this.b, H5, i24), false);
            H5.k();
        } else {
            c10 = 0;
        }
        bw0Var.y(H5);
        if (!p02) {
            qv0 qv0Var = qv0VarArr[c10];
            if (!qv0Var.w || !qv0Var.v) {
                boolean[] zArr = qv0Var.i;
                if (zArr[c10] && zArr[1] && qv0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j3)) {
                        if (user == null || !user.bot) {
                            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new zk(this, closestTab, H5, 14), false);
                            if (bw0Var.d1 != null && !bw0Var.v0() && (chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(bw0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                                final int i26 = 1;
                                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.au0
                                    public final /* synthetic */ fu0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i26) {
                                            case 0:
                                                rs0 rs0Var2 = this.b.d.V;
                                                rs0Var2.getClass();
                                                rs0Var2.h(null, new xh.t1(rs0Var2, 0));
                                                H5.u();
                                                break;
                                            case 1:
                                                fu0 fu0Var = this.b;
                                                fu0Var.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                                bw0 bw0Var2 = fu0Var.d;
                                                bundle.putLong("dialog_id", -bw0Var2.d1.id);
                                                db0 db0Var = new db0(bundle, null);
                                                db0Var.c = bw0Var2.d1;
                                                bw0Var2.v1.presentFragment(db0Var);
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
                                    int i28 = qv0VarArr[0].q;
                                    f1Var8.setChecked(i28 == 0 || i28 == 1);
                                    f1Var8.setOnClickListener(new du0(this, f1Var9, f1Var8, i27));
                                    int i29 = qv0VarArr[0].q;
                                    f1Var9.setChecked(i29 == 0 || i29 == 2);
                                    z11 = true;
                                    f1Var9.setOnClickListener(new du0(this, f1Var8, f1Var9, 1 == true ? 1 : 0));
                                    r82 = 0;
                                    H5.J = r82;
                                    H5.Y = z11;
                                    H5.s = r82;
                                    H5.Z();
                                }
                                final yv0 k12 = bw0Var.k1(closestTab);
                                if (k12 != null && (e9Var = k12.s) != null) {
                                    f1Var8.setChecked(e9Var.n);
                                    f1Var9.setChecked(k12.s.o);
                                }
                                final int i30 = 0;
                                f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cu0
                                    public final /* synthetic */ fu0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i30) {
                                            case 0:
                                                bw0 bw0Var2 = this.b.d;
                                                if (!bw0Var2.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var10 = f1Var9;
                                                    boolean z14 = f1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var11 = f1Var8;
                                                    if (!z14 && f1Var11.getCheckView().a.q) {
                                                        float f7 = -bw0Var2.s1;
                                                        bw0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        f1Var11.getCheckView().a(!f1Var11.getCheckView().a.q, true);
                                                        ai.e9 e9Var2 = k12.s;
                                                        if (e9Var2 != null) {
                                                            boolean z15 = f1Var11.getCheckView().a.q;
                                                            boolean z16 = f1Var10.getCheckView().a.q;
                                                            e9Var2.n = z15;
                                                            e9Var2.o = z16;
                                                            e9Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                bw0 bw0Var3 = this.b.d;
                                                if (!bw0Var3.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var12 = f1Var9;
                                                    boolean z17 = f1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var13 = f1Var8;
                                                    if (!z17 && f1Var13.getCheckView().a.q) {
                                                        float f10 = -bw0Var3.s1;
                                                        bw0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        f1Var13.getCheckView().a(!f1Var13.getCheckView().a.q, true);
                                                        ai.e9 e9Var3 = k12.s;
                                                        if (e9Var3 != null) {
                                                            boolean z18 = f1Var12.getCheckView().a.q;
                                                            boolean z19 = f1Var13.getCheckView().a.q;
                                                            e9Var3.n = z18;
                                                            e9Var3.o = z19;
                                                            e9Var3.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i31 = 1;
                                f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cu0
                                    public final /* synthetic */ fu0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i31) {
                                            case 0:
                                                bw0 bw0Var2 = this.b.d;
                                                if (!bw0Var2.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var10 = f1Var8;
                                                    boolean z14 = f1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var11 = f1Var9;
                                                    if (!z14 && f1Var11.getCheckView().a.q) {
                                                        float f7 = -bw0Var2.s1;
                                                        bw0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        f1Var11.getCheckView().a(!f1Var11.getCheckView().a.q, true);
                                                        ai.e9 e9Var2 = k12.s;
                                                        if (e9Var2 != null) {
                                                            boolean z15 = f1Var11.getCheckView().a.q;
                                                            boolean z16 = f1Var10.getCheckView().a.q;
                                                            e9Var2.n = z15;
                                                            e9Var2.o = z16;
                                                            e9Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                bw0 bw0Var3 = this.b.d;
                                                if (!bw0Var3.H1) {
                                                    org.telegram.ui.ActionBar.f1 f1Var12 = f1Var8;
                                                    boolean z17 = f1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.f1 f1Var13 = f1Var9;
                                                    if (!z17 && f1Var13.getCheckView().a.q) {
                                                        float f10 = -bw0Var3.s1;
                                                        bw0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        f1Var13.getCheckView().a(!f1Var13.getCheckView().a.q, true);
                                                        ai.e9 e9Var3 = k12.s;
                                                        if (e9Var3 != null) {
                                                            boolean z18 = f1Var12.getCheckView().a.q;
                                                            boolean z19 = f1Var13.getCheckView().a.q;
                                                            e9Var3.n = z18;
                                                            e9Var3.o = z19;
                                                            e9Var3.d(true);
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
