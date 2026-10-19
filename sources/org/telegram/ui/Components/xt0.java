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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xt0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ tv0 d;

    public xt0(tv0 tv0Var, long j10, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.d = tv0Var;
        this.a = j10;
        this.b = d6Var;
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
        ci.i7 storiesController;
        char c10;
        boolean z10;
        boolean z11;
        ?? r82;
        ci.a7 a7Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.e1 e1Var;
        boolean z12;
        org.telegram.ui.ActionBar.e1 e1Var2;
        org.telegram.ui.ActionBar.e1 e1Var3;
        sv0 l1;
        final tv0 tv0Var = this.d;
        iv0[] iv0VarArr = tv0Var.t1;
        js0 js0Var = tv0Var.V;
        ImageView imageView = tv0Var.r0;
        is0 is0Var = tv0Var.U;
        int closestTab = tv0Var.getClosestTab();
        boolean q02 = tv0.q0(closestTab);
        final org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(n2Var.getCurrentAccount());
        long j10 = tv0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        storiesController = tv0Var.getStoriesController();
        boolean i10 = storiesController.i(j10);
        if (tv0.y0(closestTab) && i10 && (l1 = tv0Var.l1(closestTab)) != null) {
            final int i11 = l1.b;
            final i80 H = i80.H(n2Var, imageView);
            int i12 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i13 = 0;
            final long j11 = this.a;
            H.c(i12, string, new Runnable() { // from class: org.telegram.ui.Components.bs0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            tv0Var.Q0(n2Var, j11, i11);
                            H.u();
                            break;
                        default:
                            tv0Var.R0(n2Var, j11, i11);
                            H.u();
                            break;
                    }
                }
            }, false);
            tv0Var.x(H, n2Var, j11, i11);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new org.telegram.ui.i4(tv0Var, i11, H, 17), false);
            final int i14 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.bs0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            tv0Var.Q0(n2Var, j11, i11);
                            H.u();
                            break;
                        default:
                            tv0Var.R0(n2Var, j11, i11);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            tv0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i15 = 5;
        if (closestTab == 14) {
            yh.l2 currentPage = js0Var.getCurrentPage();
            ai.y9 y9Var = currentPage.e;
            if (y9Var == null) {
                return;
            }
            long j12 = js0Var.c;
            int i16 = js0Var.b;
            boolean canUserDoAction = j12 == UserConfig.getInstance(i16).getClientUserId() ? true : j12 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i16).getChat(Long.valueOf(-j12)), 5);
            final i80 H2 = i80.H(n2Var, imageView);
            if (y9Var.c) {
                e1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, H2.e, H2.d, false, false);
                H2.d(e1Var4);
                e1Var = e1Var4;
                z12 = true;
            }
            if (js0Var.b()) {
                final int i17 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.st0
                    public final /* synthetic */ xt0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                js0 js0Var2 = this.b.d.V;
                                js0Var2.getClass();
                                js0Var2.h(null, new yh.p1(js0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                xt0 xt0Var = this.b;
                                xt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                tv0 tv0Var2 = xt0Var.d;
                                bundle.putLong("dialog_id", -tv0Var2.d1.id);
                                wa0 wa0Var = new wa0(bundle, null);
                                wa0Var.c = tv0Var2.d1;
                                tv0Var2.v1.presentFragment(wa0Var);
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
            if (js0Var.e.h()) {
                if (!y9Var.i().isEmpty() || currentPage.d) {
                    final int i18 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.st0
                        public final /* synthetic */ xt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    js0 js0Var2 = this.b.d.V;
                                    js0Var2.getClass();
                                    js0Var2.h(null, new yh.p1(js0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    xt0 xt0Var = this.b;
                                    xt0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    tv0 tv0Var2 = xt0Var.d;
                                    bundle.putLong("dialog_id", -tv0Var2.d1.id);
                                    wa0 wa0Var = new wa0(bundle, null);
                                    wa0Var.c = tv0Var2.d1;
                                    tv0Var2.v1.presentFragment(wa0Var);
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
            org.telegram.ui.ActionBar.e1 h = H2.h();
            h.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.e1 h10 = H2.h();
            h10.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.e1 h11 = H2.h();
            h11.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.e1 h12 = H2.h();
            h12.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (canUserDoAction) {
                H2.k();
                org.telegram.ui.ActionBar.e1 h13 = H2.h();
                h13.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.e1 h14 = H2.h();
                h14.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                e1Var3 = h14;
                e1Var2 = h13;
            } else {
                e1Var2 = null;
                e1Var3 = null;
            }
            org.telegram.messenger.uj ujVar = new org.telegram.messenger.uj(e1Var, y9Var, h, h10, h11, h12, canUserDoAction, e1Var2, e1Var3, 3);
            org.telegram.ui.ActionBar.e1 e1Var5 = e1Var;
            org.telegram.ui.ActionBar.e1 e1Var6 = e1Var2;
            org.telegram.ui.ActionBar.e1 e1Var7 = e1Var3;
            ujVar.run();
            if (e1Var5 != null) {
                e1Var5.setOnClickListener(new ca(24, y9Var, ujVar));
            }
            yh.p2.j(h, y9Var, ujVar, 1);
            yh.p2.j(h10, y9Var, ujVar, 2);
            yh.p2.j(h11, y9Var, ujVar, 4);
            yh.p2.j(h12, y9Var, ujVar, 8);
            if (canUserDoAction) {
                yh.p2.j(e1Var6, y9Var, ujVar, 256);
                yh.p2.j(e1Var7, y9Var, ujVar, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && is0Var != null) {
            i80 H3 = i80.H(n2Var, imageView);
            boolean z13 = is0Var.getItemsCount() < n2Var.getMessagesController().botPreviewMediasMax;
            final int i19 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.tt0
                public final /* synthetic */ xt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            tv0 tv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var2.v1;
                            ei.vb D = ei.vb.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = tv0Var2.j1;
                            String currentLang = tv0Var2.U.getCurrentLang();
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
                            is0 is0Var2 = this.b.d.U;
                            if (!is0Var2.d()) {
                                is0Var2.f();
                                break;
                            } else {
                                is0Var2.h();
                                break;
                            }
                        case 3:
                            is0 is0Var3 = this.b.d.U;
                            is0Var3.b(is0Var3.getCurrentLang());
                            break;
                        case 4:
                            tv0 tv0Var3 = this.b.d;
                            tv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = tv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            tv0 tv0Var4 = this.b.d;
                            try {
                                tv0Var4.v1.getMediaDataController().installShortcut(tv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            xt0 xt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = xt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            f5.r(n2Var4, false, null, currentUser, false, true, false, true, new q2(20, xt0Var, currentUser));
                            break;
                    }
                }
            }, z13);
            final int i20 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.tt0
                public final /* synthetic */ xt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i20) {
                        case 0:
                            tv0 tv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var2.v1;
                            ei.vb D = ei.vb.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = tv0Var2.j1;
                            String currentLang = tv0Var2.U.getCurrentLang();
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
                            is0 is0Var2 = this.b.d.U;
                            if (!is0Var2.d()) {
                                is0Var2.f();
                                break;
                            } else {
                                is0Var2.h();
                                break;
                            }
                        case 3:
                            is0 is0Var3 = this.b.d.U;
                            is0Var3.b(is0Var3.getCurrentLang());
                            break;
                        case 4:
                            tv0 tv0Var3 = this.b.d;
                            tv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = tv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            tv0 tv0Var4 = this.b.d;
                            try {
                                tv0Var4.v1.getMediaDataController().installShortcut(tv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            xt0 xt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = xt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            f5.r(n2Var4, false, null, currentUser, false, true, false, true, new q2(20, xt0Var, currentUser));
                            break;
                    }
                }
            }, is0Var.getItemsCount() > 1 && !is0Var.d());
            final int i21 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(is0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.tt0
                public final /* synthetic */ xt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            tv0 tv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var2.v1;
                            ei.vb D = ei.vb.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = tv0Var2.j1;
                            String currentLang = tv0Var2.U.getCurrentLang();
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
                            is0 is0Var2 = this.b.d.U;
                            if (!is0Var2.d()) {
                                is0Var2.f();
                                break;
                            } else {
                                is0Var2.h();
                                break;
                            }
                        case 3:
                            is0 is0Var3 = this.b.d.U;
                            is0Var3.b(is0Var3.getCurrentLang());
                            break;
                        case 4:
                            tv0 tv0Var3 = this.b.d;
                            tv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = tv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            tv0 tv0Var4 = this.b.d;
                            try {
                                tv0Var4.v1.getMediaDataController().installShortcut(tv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            xt0 xt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = xt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            f5.r(n2Var4, false, null, currentUser, false, true, false, true, new q2(20, xt0Var, currentUser));
                            break;
                    }
                }
            }, is0Var.getItemsCount() > 0);
            final int i22 = 3;
            H3.m(!TextUtils.isEmpty(is0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, s41.E(is0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.tt0
                public final /* synthetic */ xt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            tv0 tv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var2.v1;
                            ei.vb D = ei.vb.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = tv0Var2.j1;
                            String currentLang = tv0Var2.U.getCurrentLang();
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
                            is0 is0Var2 = this.b.d.U;
                            if (!is0Var2.d()) {
                                is0Var2.f();
                                break;
                            } else {
                                is0Var2.h();
                                break;
                            }
                        case 3:
                            is0 is0Var3 = this.b.d.U;
                            is0Var3.b(is0Var3.getCurrentLang());
                            break;
                        case 4:
                            tv0 tv0Var3 = this.b.d;
                            tv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = tv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            tv0 tv0Var4 = this.b.d;
                            try {
                                tv0Var4.v1.getMediaDataController().installShortcut(tv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            xt0 xt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = xt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            f5.r(n2Var4, false, null, currentUser, false, true, false, true, new q2(20, xt0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        if (tv0Var.getSelectedTab() == 11) {
            i80 H4 = i80.H(n2Var, imageView);
            final int i23 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.tt0
                public final /* synthetic */ xt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            tv0 tv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var2.v1;
                            ei.vb D = ei.vb.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = tv0Var2.j1;
                            String currentLang = tv0Var2.U.getCurrentLang();
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
                            is0 is0Var2 = this.b.d.U;
                            if (!is0Var2.d()) {
                                is0Var2.f();
                                break;
                            } else {
                                is0Var2.h();
                                break;
                            }
                        case 3:
                            is0 is0Var3 = this.b.d.U;
                            is0Var3.b(is0Var3.getCurrentLang());
                            break;
                        case 4:
                            tv0 tv0Var3 = this.b.d;
                            tv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = tv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            tv0 tv0Var4 = this.b.d;
                            try {
                                tv0Var4.v1.getMediaDataController().installShortcut(tv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            xt0 xt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = xt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            f5.r(n2Var4, false, null, currentUser, false, true, false, true, new q2(20, xt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.tt0
                public final /* synthetic */ xt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            tv0 tv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var2.v1;
                            ei.vb D = ei.vb.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = tv0Var2.j1;
                            String currentLang = tv0Var2.U.getCurrentLang();
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
                            is0 is0Var2 = this.b.d.U;
                            if (!is0Var2.d()) {
                                is0Var2.f();
                                break;
                            } else {
                                is0Var2.h();
                                break;
                            }
                        case 3:
                            is0 is0Var3 = this.b.d.U;
                            is0Var3.b(is0Var3.getCurrentLang());
                            break;
                        case 4:
                            tv0 tv0Var3 = this.b.d;
                            tv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = tv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            tv0 tv0Var4 = this.b.d;
                            try {
                                tv0Var4.v1.getMediaDataController().installShortcut(tv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            xt0 xt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = xt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            f5.r(n2Var4, false, null, currentUser, false, true, false, true, new q2(20, xt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i24 = 6;
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.tt0
                public final /* synthetic */ xt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            tv0 tv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var2.v1;
                            ei.vb D = ei.vb.D(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = tv0Var2.j1;
                            String currentLang = tv0Var2.U.getCurrentLang();
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
                            is0 is0Var2 = this.b.d.U;
                            if (!is0Var2.d()) {
                                is0Var2.f();
                                break;
                            } else {
                                is0Var2.h();
                                break;
                            }
                        case 3:
                            is0 is0Var3 = this.b.d.U;
                            is0Var3.b(is0Var3.getCurrentLang());
                            break;
                        case 4:
                            tv0 tv0Var3 = this.b.d;
                            tv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = tv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.qn(bundle), true);
                            break;
                        case 5:
                            tv0 tv0Var4 = this.b.d;
                            try {
                                tv0Var4.v1.getMediaDataController().installShortcut(tv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            xt0 xt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = xt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            f5.r(n2Var4, false, null, currentUser, false, true, false, true, new q2(20, xt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final i80 H5 = i80.H(n2Var, imageView);
        if ((closestTab == 8 || tv0.y0(closestTab)) && i10) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new lg(this, this.b, H5, 22), false);
            H5.k();
        } else {
            c10 = 0;
        }
        tv0Var.y(H5);
        if (!q02) {
            iv0 iv0Var = iv0VarArr[c10];
            if (!iv0Var.w || !iv0Var.v) {
                boolean[] zArr = iv0Var.i;
                if (zArr[c10] && zArr[1] && iv0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        if (user == null || !user.bot) {
                            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new org.telegram.ui.i4(this, closestTab, H5, 19), false);
                            if (tv0Var.d1 != null && !tv0Var.x0() && (chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(tv0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                                final int i25 = 1;
                                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.st0
                                    public final /* synthetic */ xt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i25) {
                                            case 0:
                                                js0 js0Var2 = this.b.d.V;
                                                js0Var2.getClass();
                                                js0Var2.h(null, new yh.p1(js0Var2, 0));
                                                H5.u();
                                                break;
                                            case 1:
                                                xt0 xt0Var = this.b;
                                                xt0Var.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                                tv0 tv0Var2 = xt0Var.d;
                                                bundle.putLong("dialog_id", -tv0Var2.d1.id);
                                                wa0 wa0Var = new wa0(bundle, null);
                                                wa0Var.c = tv0Var2.d1;
                                                tv0Var2.v1.presentFragment(wa0Var);
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
                                final org.telegram.ui.ActionBar.e1 e1Var8 = new org.telegram.ui.ActionBar.e1(1, this.c, this.b, false, false);
                                final org.telegram.ui.ActionBar.e1 e1Var9 = new org.telegram.ui.ActionBar.e1(1, this.c, this.b, false, true);
                                e1Var8.g(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0, null);
                                H5.A.addView(e1Var8);
                                e1Var9.g(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0, null);
                                H5.A.addView(e1Var9);
                                if (!q02) {
                                    int i26 = 0;
                                    int i27 = iv0VarArr[0].q;
                                    e1Var8.setChecked(i27 == 0 || i27 == 1);
                                    e1Var8.setOnClickListener(new vt0(this, e1Var9, e1Var8, i26));
                                    int i28 = iv0VarArr[0].q;
                                    e1Var9.setChecked(i28 == 0 || i28 == 2);
                                    z11 = true;
                                    e1Var9.setOnClickListener(new vt0(this, e1Var8, e1Var9, 1 == true ? 1 : 0));
                                    r82 = 0;
                                    H5.J = r82;
                                    H5.Y = z11;
                                    H5.s = r82;
                                    H5.Z();
                                }
                                final qv0 m12 = tv0Var.m1(closestTab);
                                if (m12 != null && (a7Var = m12.s) != null) {
                                    e1Var8.setChecked(a7Var.n);
                                    e1Var9.setChecked(m12.s.o);
                                }
                                final int i29 = 0;
                                e1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ut0
                                    public final /* synthetic */ xt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i29) {
                                            case 0:
                                                tv0 tv0Var2 = this.b.d;
                                                if (!tv0Var2.H1) {
                                                    org.telegram.ui.ActionBar.e1 e1Var10 = e1Var9;
                                                    boolean z14 = e1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.e1 e1Var11 = e1Var8;
                                                    if (!z14 && e1Var11.getCheckView().a.q) {
                                                        float f7 = -tv0Var2.s1;
                                                        tv0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        e1Var11.getCheckView().a(!e1Var11.getCheckView().a.q, true);
                                                        ci.a7 a7Var2 = m12.s;
                                                        if (a7Var2 != null) {
                                                            boolean z15 = e1Var11.getCheckView().a.q;
                                                            boolean z16 = e1Var10.getCheckView().a.q;
                                                            a7Var2.n = z15;
                                                            a7Var2.o = z16;
                                                            a7Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                tv0 tv0Var3 = this.b.d;
                                                if (!tv0Var3.H1) {
                                                    org.telegram.ui.ActionBar.e1 e1Var12 = e1Var9;
                                                    boolean z17 = e1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.e1 e1Var13 = e1Var8;
                                                    if (!z17 && e1Var13.getCheckView().a.q) {
                                                        float f10 = -tv0Var3.s1;
                                                        tv0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        e1Var13.getCheckView().a(!e1Var13.getCheckView().a.q, true);
                                                        ci.a7 a7Var3 = m12.s;
                                                        if (a7Var3 != null) {
                                                            boolean z18 = e1Var12.getCheckView().a.q;
                                                            boolean z19 = e1Var13.getCheckView().a.q;
                                                            a7Var3.n = z18;
                                                            a7Var3.o = z19;
                                                            a7Var3.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i30 = 1;
                                e1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ut0
                                    public final /* synthetic */ xt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i30) {
                                            case 0:
                                                tv0 tv0Var2 = this.b.d;
                                                if (!tv0Var2.H1) {
                                                    org.telegram.ui.ActionBar.e1 e1Var10 = e1Var8;
                                                    boolean z14 = e1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.e1 e1Var11 = e1Var9;
                                                    if (!z14 && e1Var11.getCheckView().a.q) {
                                                        float f7 = -tv0Var2.s1;
                                                        tv0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        e1Var11.getCheckView().a(!e1Var11.getCheckView().a.q, true);
                                                        ci.a7 a7Var2 = m12.s;
                                                        if (a7Var2 != null) {
                                                            boolean z15 = e1Var11.getCheckView().a.q;
                                                            boolean z16 = e1Var10.getCheckView().a.q;
                                                            a7Var2.n = z15;
                                                            a7Var2.o = z16;
                                                            a7Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                tv0 tv0Var3 = this.b.d;
                                                if (!tv0Var3.H1) {
                                                    org.telegram.ui.ActionBar.e1 e1Var12 = e1Var8;
                                                    boolean z17 = e1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.e1 e1Var13 = e1Var9;
                                                    if (!z17 && e1Var13.getCheckView().a.q) {
                                                        float f10 = -tv0Var3.s1;
                                                        tv0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        e1Var13.getCheckView().a(!e1Var13.getCheckView().a.q, true);
                                                        ci.a7 a7Var3 = m12.s;
                                                        if (a7Var3 != null) {
                                                            boolean z18 = e1Var12.getCheckView().a.q;
                                                            boolean z19 = e1Var13.getCheckView().a.q;
                                                            a7Var3.n = z18;
                                                            a7Var3.o = z19;
                                                            a7Var3.d(true);
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
