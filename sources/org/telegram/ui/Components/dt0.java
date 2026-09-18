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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dt0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ zu0 d;

    public dt0(zu0 zu0Var, long j3, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.d = zu0Var;
        this.a = j3;
        this.b = f6Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x034a  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ai.l9 storiesController;
        char c10;
        boolean z10;
        boolean z11;
        ?? r92;
        ai.d9 d9Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        org.telegram.ui.ActionBar.g1 g1Var;
        boolean z12;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        yu0 j12;
        final zu0 zu0Var = this.d;
        ou0[] ou0VarArr = zu0Var.t1;
        or0 or0Var = zu0Var.V;
        ImageView imageView = zu0Var.r0;
        nr0 nr0Var = zu0Var.U;
        int closestTab = zu0Var.getClosestTab();
        boolean p02 = zu0.p0(closestTab);
        final org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(o2Var.getCurrentAccount());
        long j3 = zu0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        storiesController = zu0Var.getStoriesController();
        boolean i10 = storiesController.i(j3);
        int i11 = 11;
        if (zu0.w0(closestTab) && i10 && (j12 = zu0Var.j1(closestTab)) != null) {
            final int i12 = j12.b;
            final n70 H = n70.H(o2Var, imageView);
            int i13 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i14 = 0;
            final long j10 = this.a;
            H.c(i13, string, new Runnable() { // from class: org.telegram.ui.Components.fr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            zu0Var.O0(o2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            zu0Var.P0(o2Var, j10, i12);
                            H.u();
                            break;
                    }
                }
            }, false);
            zu0Var.x(H, o2Var, j10, i12);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new wm(zu0Var, i12, H, i11), false);
            final int i15 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.fr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            zu0Var.O0(o2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            zu0Var.P0(o2Var, j10, i12);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            zu0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i16 = 5;
        int i17 = 14;
        if (closestTab == 14) {
            xh.n2 currentPage = or0Var.getCurrentPage();
            yh.n5 n5Var = currentPage.e;
            if (n5Var == null) {
                return;
            }
            long j11 = or0Var.c;
            int i18 = or0Var.b;
            boolean canUserDoAction = j11 == UserConfig.getInstance(i18).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i18).getChat(Long.valueOf(-j11)), 5);
            final n70 H2 = n70.H(o2Var, imageView);
            if (n5Var.c) {
                g1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, H2.e, H2.d, false, false);
                H2.d(g1Var4);
                g1Var = g1Var4;
                z12 = true;
            }
            if (or0Var.b()) {
                final int i19 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.ys0
                    public final /* synthetic */ dt0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                or0 or0Var2 = this.b.d.V;
                                or0Var2.getClass();
                                or0Var2.h(null, new xh.s1(or0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                dt0 dt0Var = this.b;
                                dt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                zu0 zu0Var2 = dt0Var.d;
                                bundle.putLong("dialog_id", -zu0Var2.d1.id);
                                ba0 ba0Var = new ba0(bundle, null);
                                ba0Var.c = zu0Var2.d1;
                                zu0Var2.v1.presentFragment(ba0Var);
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
            if (or0Var.e.h()) {
                if (!n5Var.h().isEmpty() || currentPage.d) {
                    final int i20 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.ys0
                        public final /* synthetic */ dt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i20) {
                                case 0:
                                    or0 or0Var2 = this.b.d.V;
                                    or0Var2.getClass();
                                    or0Var2.h(null, new xh.s1(or0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    dt0 dt0Var = this.b;
                                    dt0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    zu0 zu0Var2 = dt0Var.d;
                                    bundle.putLong("dialog_id", -zu0Var2.d1.id);
                                    ba0 ba0Var = new ba0(bundle, null);
                                    ba0Var.c = zu0Var2.d1;
                                    zu0Var2.v1.presentFragment(ba0Var);
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
            org.telegram.messenger.kk kkVar = new org.telegram.messenger.kk(g1Var, n5Var, h, h10, h11, h12, canUserDoAction, g1Var2, g1Var3, 3);
            org.telegram.ui.ActionBar.g1 g1Var5 = g1Var;
            org.telegram.ui.ActionBar.g1 g1Var6 = g1Var2;
            org.telegram.ui.ActionBar.g1 g1Var7 = g1Var3;
            kkVar.run();
            if (g1Var5 != null) {
                g1Var5.setOnClickListener(new dt(i17, n5Var, kkVar));
            }
            xh.r2.j(h, n5Var, kkVar, 1);
            xh.r2.j(h10, n5Var, kkVar, 2);
            xh.r2.j(h11, n5Var, kkVar, 4);
            xh.r2.j(h12, n5Var, kkVar, 8);
            if (canUserDoAction) {
                xh.r2.j(g1Var6, n5Var, kkVar, 256);
                xh.r2.j(g1Var7, n5Var, kkVar, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && nr0Var != null) {
            n70 H3 = n70.H(o2Var, imageView);
            final int i21 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.zs0
                public final /* synthetic */ dt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            zu0 zu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var2.v1;
                            ci.oc E = ci.oc.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j13 = zu0Var2.j1;
                            String currentLang = zu0Var2.U.getCurrentLang();
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
                            nr0 nr0Var2 = this.b.d.U;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.U;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            zu0 zu0Var3 = this.b.d;
                            zu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.bo(bundle), true);
                            break;
                        case 5:
                            zu0 zu0Var4 = this.b.d;
                            try {
                                zu0Var4.v1.getMediaDataController().installShortcut(zu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            dt0 dt0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = dt0Var.d.v1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new mf(14, dt0Var, currentUser));
                            break;
                    }
                }
            }, nr0Var.getItemsCount() < o2Var.getMessagesController().botPreviewMediasMax);
            final int i22 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.zs0
                public final /* synthetic */ dt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            zu0 zu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var2.v1;
                            ci.oc E = ci.oc.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j13 = zu0Var2.j1;
                            String currentLang = zu0Var2.U.getCurrentLang();
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
                            nr0 nr0Var2 = this.b.d.U;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.U;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            zu0 zu0Var3 = this.b.d;
                            zu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.bo(bundle), true);
                            break;
                        case 5:
                            zu0 zu0Var4 = this.b.d;
                            try {
                                zu0Var4.v1.getMediaDataController().installShortcut(zu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            dt0 dt0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = dt0Var.d.v1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new mf(14, dt0Var, currentUser));
                            break;
                    }
                }
            }, nr0Var.getItemsCount() > 1 && !nr0Var.d());
            final int i23 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(nr0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.zs0
                public final /* synthetic */ dt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            zu0 zu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var2.v1;
                            ci.oc E = ci.oc.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j13 = zu0Var2.j1;
                            String currentLang = zu0Var2.U.getCurrentLang();
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
                            nr0 nr0Var2 = this.b.d.U;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.U;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            zu0 zu0Var3 = this.b.d;
                            zu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.bo(bundle), true);
                            break;
                        case 5:
                            zu0 zu0Var4 = this.b.d;
                            try {
                                zu0Var4.v1.getMediaDataController().installShortcut(zu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            dt0 dt0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = dt0Var.d.v1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new mf(14, dt0Var, currentUser));
                            break;
                    }
                }
            }, nr0Var.getItemsCount() > 0);
            final int i24 = 3;
            H3.m(!TextUtils.isEmpty(nr0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, w31.E(nr0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.zs0
                public final /* synthetic */ dt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            zu0 zu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var2.v1;
                            ci.oc E = ci.oc.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j13 = zu0Var2.j1;
                            String currentLang = zu0Var2.U.getCurrentLang();
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
                            nr0 nr0Var2 = this.b.d.U;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.U;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            zu0 zu0Var3 = this.b.d;
                            zu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.bo(bundle), true);
                            break;
                        case 5:
                            zu0 zu0Var4 = this.b.d;
                            try {
                                zu0Var4.v1.getMediaDataController().installShortcut(zu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            dt0 dt0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = dt0Var.d.v1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new mf(14, dt0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        if (zu0Var.getSelectedTab() == 11) {
            n70 H4 = n70.H(o2Var, imageView);
            final int i25 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.zs0
                public final /* synthetic */ dt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            zu0 zu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var2.v1;
                            ci.oc E = ci.oc.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j13 = zu0Var2.j1;
                            String currentLang = zu0Var2.U.getCurrentLang();
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
                            nr0 nr0Var2 = this.b.d.U;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.U;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            zu0 zu0Var3 = this.b.d;
                            zu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.bo(bundle), true);
                            break;
                        case 5:
                            zu0 zu0Var4 = this.b.d;
                            try {
                                zu0Var4.v1.getMediaDataController().installShortcut(zu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            dt0 dt0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = dt0Var.d.v1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new mf(14, dt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.zs0
                public final /* synthetic */ dt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            zu0 zu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var2.v1;
                            ci.oc E = ci.oc.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j13 = zu0Var2.j1;
                            String currentLang = zu0Var2.U.getCurrentLang();
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
                            nr0 nr0Var2 = this.b.d.U;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.U;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            zu0 zu0Var3 = this.b.d;
                            zu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.bo(bundle), true);
                            break;
                        case 5:
                            zu0 zu0Var4 = this.b.d;
                            try {
                                zu0Var4.v1.getMediaDataController().installShortcut(zu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            dt0 dt0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = dt0Var.d.v1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new mf(14, dt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i26 = 6;
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.zs0
                public final /* synthetic */ dt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i26) {
                        case 0:
                            zu0 zu0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var2.v1;
                            ci.oc E = ci.oc.E(o2Var2.getParentActivity(), o2Var2.getCurrentAccount());
                            long j13 = zu0Var2.j1;
                            String currentLang = zu0Var2.U.getCurrentLang();
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
                            nr0 nr0Var2 = this.b.d.U;
                            if (!nr0Var2.d()) {
                                nr0Var2.f();
                                break;
                            } else {
                                nr0Var2.h();
                                break;
                            }
                        case 3:
                            nr0 nr0Var3 = this.b.d.U;
                            nr0Var3.b(nr0Var3.getCurrentLang());
                            break;
                        case 4:
                            zu0 zu0Var3 = this.b.d;
                            zu0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                            bundle.putLong("user_id", o2Var3.getUserConfig().getClientUserId());
                            o2Var3.presentFragment(new org.telegram.ui.bo(bundle), true);
                            break;
                        case 5:
                            zu0 zu0Var4 = this.b.d;
                            try {
                                zu0Var4.v1.getMediaDataController().installShortcut(zu0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            dt0 dt0Var = this.b;
                            org.telegram.ui.ActionBar.o2 o2Var4 = dt0Var.d.v1;
                            TLRPC.User currentUser = o2Var4.getUserConfig().getCurrentUser();
                            c5.s(o2Var4, false, null, currentUser, false, true, false, true, new mf(14, dt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final n70 H5 = n70.H(o2Var, imageView);
        if ((closestTab == 8 || zu0.w0(closestTab)) && i10) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new gr0(this, this.b, H5, 1), false);
            H5.k();
        } else {
            c10 = 0;
        }
        zu0Var.y(H5);
        if (!p02) {
            ou0 ou0Var = ou0VarArr[c10];
            if (!ou0Var.w || !ou0Var.v) {
                boolean[] zArr = ou0Var.i;
                if (zArr[c10] && zArr[1] && ou0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j3)) {
                        if (user == null || !user.bot) {
                            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new wm(this, closestTab, H5, 13), false);
                            if (zu0Var.d1 != null && !zu0Var.v0() && (chat = MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(zu0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                                final int i27 = 1;
                                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.ys0
                                    public final /* synthetic */ dt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i27) {
                                            case 0:
                                                or0 or0Var2 = this.b.d.V;
                                                or0Var2.getClass();
                                                or0Var2.h(null, new xh.s1(or0Var2, 0));
                                                H5.u();
                                                break;
                                            case 1:
                                                dt0 dt0Var = this.b;
                                                dt0Var.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                                zu0 zu0Var2 = dt0Var.d;
                                                bundle.putLong("dialog_id", -zu0Var2.d1.id);
                                                ba0 ba0Var = new ba0(bundle, null);
                                                ba0Var.c = zu0Var2.d1;
                                                zu0Var2.v1.presentFragment(ba0Var);
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
                                    int i28 = 0;
                                    int i29 = ou0VarArr[0].q;
                                    g1Var8.setChecked(i29 == 0 || i29 == 1);
                                    g1Var8.setOnClickListener(new bt0(this, g1Var9, g1Var8, i28));
                                    int i30 = ou0VarArr[0].q;
                                    g1Var9.setChecked(i30 == 0 || i30 == 2);
                                    z11 = true;
                                    g1Var9.setOnClickListener(new bt0(this, g1Var8, g1Var9, 1 == true ? 1 : 0));
                                    r92 = 0;
                                    H5.J = r92;
                                    H5.Y = z11;
                                    H5.s = r92;
                                    H5.Z();
                                }
                                final wu0 k12 = zu0Var.k1(closestTab);
                                if (k12 != null && (d9Var = k12.s) != null) {
                                    g1Var8.setChecked(d9Var.n);
                                    g1Var9.setChecked(k12.s.o);
                                }
                                final int i31 = 0;
                                g1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.at0
                                    public final /* synthetic */ dt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i31) {
                                            case 0:
                                                zu0 zu0Var2 = this.b.d;
                                                if (!zu0Var2.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var9;
                                                    boolean z13 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var8;
                                                    if (!z13 && g1Var11.getCheckView().a.q) {
                                                        float f7 = -zu0Var2.s1;
                                                        zu0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        ai.d9 d9Var2 = k12.s;
                                                        if (d9Var2 != null) {
                                                            boolean z14 = g1Var11.getCheckView().a.q;
                                                            boolean z15 = g1Var10.getCheckView().a.q;
                                                            d9Var2.n = z14;
                                                            d9Var2.o = z15;
                                                            d9Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                zu0 zu0Var3 = this.b.d;
                                                if (!zu0Var3.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var9;
                                                    boolean z16 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var8;
                                                    if (!z16 && g1Var13.getCheckView().a.q) {
                                                        float f10 = -zu0Var3.s1;
                                                        zu0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        ai.d9 d9Var3 = k12.s;
                                                        if (d9Var3 != null) {
                                                            boolean z17 = g1Var12.getCheckView().a.q;
                                                            boolean z18 = g1Var13.getCheckView().a.q;
                                                            d9Var3.n = z17;
                                                            d9Var3.o = z18;
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
                                g1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.at0
                                    public final /* synthetic */ dt0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i32) {
                                            case 0:
                                                zu0 zu0Var2 = this.b.d;
                                                if (!zu0Var2.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var10 = g1Var8;
                                                    boolean z13 = g1Var10.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var11 = g1Var9;
                                                    if (!z13 && g1Var11.getCheckView().a.q) {
                                                        float f7 = -zu0Var2.s1;
                                                        zu0Var2.s1 = f7;
                                                        AndroidUtilities.shakeViewSpring(view2, f7);
                                                        break;
                                                    } else {
                                                        g1Var11.getCheckView().a(!g1Var11.getCheckView().a.q, true);
                                                        ai.d9 d9Var2 = k12.s;
                                                        if (d9Var2 != null) {
                                                            boolean z14 = g1Var11.getCheckView().a.q;
                                                            boolean z15 = g1Var10.getCheckView().a.q;
                                                            d9Var2.n = z14;
                                                            d9Var2.o = z15;
                                                            d9Var2.d(true);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                zu0 zu0Var3 = this.b.d;
                                                if (!zu0Var3.H1) {
                                                    org.telegram.ui.ActionBar.g1 g1Var12 = g1Var8;
                                                    boolean z16 = g1Var12.getCheckView().a.q;
                                                    org.telegram.ui.ActionBar.g1 g1Var13 = g1Var9;
                                                    if (!z16 && g1Var13.getCheckView().a.q) {
                                                        float f10 = -zu0Var3.s1;
                                                        zu0Var3.s1 = f10;
                                                        AndroidUtilities.shakeViewSpring(view2, f10);
                                                        break;
                                                    } else {
                                                        g1Var13.getCheckView().a(!g1Var13.getCheckView().a.q, true);
                                                        ai.d9 d9Var3 = k12.s;
                                                        if (d9Var3 != null) {
                                                            boolean z17 = g1Var12.getCheckView().a.q;
                                                            boolean z18 = g1Var13.getCheckView().a.q;
                                                            d9Var3.n = z17;
                                                            d9Var3.o = z18;
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
                        r92 = 0;
                        z11 = true;
                        H5.J = r92;
                        H5.Y = z11;
                        H5.s = r92;
                        H5.Z();
                    }
                    z11 = true;
                    r92 = 0;
                    H5.J = r92;
                    H5.Y = z11;
                    H5.s = r92;
                    H5.Z();
                }
            }
        }
        z10 = true;
        if (!DialogObject.isEncryptedDialog(j3)) {
        }
        z11 = true;
        r92 = 0;
        H5.J = r92;
        H5.Y = z11;
        H5.s = r92;
        H5.Z();
    }
}
