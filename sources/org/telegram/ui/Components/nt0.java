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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class nt0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ jv0 d;

    public nt0(jv0 jv0Var, long j3, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.d = jv0Var;
        this.a = j3;
        this.b = f6Var;
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
        iv0 j12;
        final jv0 jv0Var = this.d;
        yu0[] yu0VarArr = jv0Var.t1;
        yr0 yr0Var = jv0Var.V;
        ImageView imageView = jv0Var.r0;
        xr0 xr0Var = jv0Var.U;
        int closestTab = jv0Var.getClosestTab();
        boolean p02 = jv0.p0(closestTab);
        final org.telegram.ui.ActionBar.n2 n2Var = jv0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(n2Var.getCurrentAccount());
        long j3 = jv0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        storiesController = jv0Var.getStoriesController();
        boolean i10 = storiesController.i(j3);
        int i11 = 11;
        if (jv0.w0(closestTab) && i10 && (j12 = jv0Var.j1(closestTab)) != null) {
            final int i12 = j12.b;
            final v70 H = v70.H(n2Var, imageView);
            int i13 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i14 = 0;
            final long j10 = this.a;
            H.c(i13, string, new Runnable() { // from class: org.telegram.ui.Components.qr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            jv0Var.O0(n2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            jv0Var.P0(n2Var, j10, i12);
                            H.u();
                            break;
                    }
                }
            }, false);
            jv0Var.x(H, n2Var, j10, i12);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new wm(jv0Var, i12, H, i11), false);
            final int i15 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.qr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            jv0Var.O0(n2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            jv0Var.P0(n2Var, j10, i12);
                            H.u();
                            break;
                    }
                }
            }, true);
            H.k();
            jv0Var.y(H);
            H.J = false;
            H.Y = true;
            H.s = 0;
            H.Z();
            return;
        }
        final int i16 = 5;
        int i17 = 14;
        if (closestTab == 14) {
            xh.o2 currentPage = yr0Var.getCurrentPage();
            yh.l5 l5Var = currentPage.e;
            if (l5Var == null) {
                return;
            }
            long j11 = yr0Var.c;
            int i18 = yr0Var.b;
            boolean canUserDoAction = j11 == UserConfig.getInstance(i18).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i18).getChat(Long.valueOf(-j11)), 5);
            final v70 H2 = v70.H(n2Var, imageView);
            if (l5Var.c) {
                f1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, H2.e, H2.d, false, false);
                H2.d(f1Var4);
                f1Var = f1Var4;
                z12 = true;
            }
            if (yr0Var.b()) {
                final int i19 = 0;
                H2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) { // from class: org.telegram.ui.Components.it0
                    public final /* synthetic */ nt0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                yr0 yr0Var2 = this.b.d.V;
                                yr0Var2.getClass();
                                yr0Var2.h(null, new xh.t1(yr0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                nt0 nt0Var = this.b;
                                nt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jv0 jv0Var2 = nt0Var.d;
                                bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                ja0 ja0Var = new ja0(bundle, null);
                                ja0Var.c = jv0Var2.d1;
                                jv0Var2.v1.presentFragment(ja0Var);
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
            if (yr0Var.e.h()) {
                if (!l5Var.h().isEmpty() || currentPage.d) {
                    final int i20 = 2;
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) { // from class: org.telegram.ui.Components.it0
                        public final /* synthetic */ nt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i20) {
                                case 0:
                                    yr0 yr0Var2 = this.b.d.V;
                                    yr0Var2.getClass();
                                    yr0Var2.h(null, new xh.t1(yr0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    nt0 nt0Var = this.b;
                                    nt0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jv0 jv0Var2 = nt0Var.d;
                                    bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                    ja0 ja0Var = new ja0(bundle, null);
                                    ja0Var.c = jv0Var2.d1;
                                    jv0Var2.v1.presentFragment(ja0Var);
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
                f1Var5.setOnClickListener(new dt(i17, l5Var, jkVar));
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
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && xr0Var != null) {
            v70 H3 = v70.H(n2Var, imageView);
            boolean z13 = xr0Var.getItemsCount() < n2Var.getMessagesController().botPreviewMediasMax;
            final int i21 = 0;
            H3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i21) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = jv0Var2.v1;
                            ci.oc E = ci.oc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = jv0Var2.j1;
                            String currentLang = jv0Var2.U.getCurrentLang();
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
                            xr0 xr0Var2 = this.b.d.U;
                            if (!xr0Var2.d()) {
                                xr0Var2.f();
                                break;
                            } else {
                                xr0Var2.h();
                                break;
                            }
                        case 3:
                            xr0 xr0Var3 = this.b.d.U;
                            xr0Var3.b(xr0Var3.getCurrentLang());
                            break;
                        case 4:
                            jv0 jv0Var3 = this.b.d;
                            jv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            jv0 jv0Var4 = this.b.d;
                            try {
                                jv0Var4.v1.getMediaDataController().installShortcut(jv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            nt0 nt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            d5.s(n2Var4, false, null, currentUser, false, true, false, true, new a3(15, nt0Var, currentUser));
                            break;
                    }
                }
            }, z13);
            final int i22 = 1;
            H3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i22) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = jv0Var2.v1;
                            ci.oc E = ci.oc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = jv0Var2.j1;
                            String currentLang = jv0Var2.U.getCurrentLang();
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
                            xr0 xr0Var2 = this.b.d.U;
                            if (!xr0Var2.d()) {
                                xr0Var2.f();
                                break;
                            } else {
                                xr0Var2.h();
                                break;
                            }
                        case 3:
                            xr0 xr0Var3 = this.b.d.U;
                            xr0Var3.b(xr0Var3.getCurrentLang());
                            break;
                        case 4:
                            jv0 jv0Var3 = this.b.d;
                            jv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            jv0 jv0Var4 = this.b.d;
                            try {
                                jv0Var4.v1.getMediaDataController().installShortcut(jv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            nt0 nt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            d5.s(n2Var4, false, null, currentUser, false, true, false, true, new a3(15, nt0Var, currentUser));
                            break;
                    }
                }
            }, xr0Var.getItemsCount() > 1 && !xr0Var.d());
            final int i23 = 2;
            H3.l(R.drawable.msg_select, LocaleController.getString(xr0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = jv0Var2.v1;
                            ci.oc E = ci.oc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = jv0Var2.j1;
                            String currentLang = jv0Var2.U.getCurrentLang();
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
                            xr0 xr0Var2 = this.b.d.U;
                            if (!xr0Var2.d()) {
                                xr0Var2.f();
                                break;
                            } else {
                                xr0Var2.h();
                                break;
                            }
                        case 3:
                            xr0 xr0Var3 = this.b.d.U;
                            xr0Var3.b(xr0Var3.getCurrentLang());
                            break;
                        case 4:
                            jv0 jv0Var3 = this.b.d;
                            jv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            jv0 jv0Var4 = this.b.d;
                            try {
                                jv0Var4.v1.getMediaDataController().installShortcut(jv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            nt0 nt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            d5.s(n2Var4, false, null, currentUser, false, true, false, true, new a3(15, nt0Var, currentUser));
                            break;
                    }
                }
            }, xr0Var.getItemsCount() > 0);
            final int i24 = 3;
            H3.m(!TextUtils.isEmpty(xr0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, j41.E(xr0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = jv0Var2.v1;
                            ci.oc E = ci.oc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = jv0Var2.j1;
                            String currentLang = jv0Var2.U.getCurrentLang();
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
                            xr0 xr0Var2 = this.b.d.U;
                            if (!xr0Var2.d()) {
                                xr0Var2.f();
                                break;
                            } else {
                                xr0Var2.h();
                                break;
                            }
                        case 3:
                            xr0 xr0Var3 = this.b.d.U;
                            xr0Var3.b(xr0Var3.getCurrentLang());
                            break;
                        case 4:
                            jv0 jv0Var3 = this.b.d;
                            jv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            jv0 jv0Var4 = this.b.d;
                            try {
                                jv0Var4.v1.getMediaDataController().installShortcut(jv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            nt0 nt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            d5.s(n2Var4, false, null, currentUser, false, true, false, true, new a3(15, nt0Var, currentUser));
                            break;
                    }
                }
            });
            H3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H3.s = 0;
            H3.Z();
            return;
        }
        if (jv0Var.getSelectedTab() == 11) {
            v70 H4 = v70.H(n2Var, imageView);
            final int i25 = 4;
            H4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = jv0Var2.v1;
                            ci.oc E = ci.oc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = jv0Var2.j1;
                            String currentLang = jv0Var2.U.getCurrentLang();
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
                            xr0 xr0Var2 = this.b.d.U;
                            if (!xr0Var2.d()) {
                                xr0Var2.f();
                                break;
                            } else {
                                xr0Var2.h();
                                break;
                            }
                        case 3:
                            xr0 xr0Var3 = this.b.d.U;
                            xr0Var3.b(xr0Var3.getCurrentLang());
                            break;
                        case 4:
                            jv0 jv0Var3 = this.b.d;
                            jv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            jv0 jv0Var4 = this.b.d;
                            try {
                                jv0Var4.v1.getMediaDataController().installShortcut(jv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            nt0 nt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            d5.s(n2Var4, false, null, currentUser, false, true, false, true, new a3(15, nt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.k();
            H4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = jv0Var2.v1;
                            ci.oc E = ci.oc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = jv0Var2.j1;
                            String currentLang = jv0Var2.U.getCurrentLang();
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
                            xr0 xr0Var2 = this.b.d.U;
                            if (!xr0Var2.d()) {
                                xr0Var2.f();
                                break;
                            } else {
                                xr0Var2.h();
                                break;
                            }
                        case 3:
                            xr0 xr0Var3 = this.b.d.U;
                            xr0Var3.b(xr0Var3.getCurrentLang());
                            break;
                        case 4:
                            jv0 jv0Var3 = this.b.d;
                            jv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            jv0 jv0Var4 = this.b.d;
                            try {
                                jv0Var4.v1.getMediaDataController().installShortcut(jv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            nt0 nt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            d5.s(n2Var4, false, null, currentUser, false, true, false, true, new a3(15, nt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i26 = 6;
            H4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i26) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = jv0Var2.v1;
                            ci.oc E = ci.oc.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = jv0Var2.j1;
                            String currentLang = jv0Var2.U.getCurrentLang();
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
                            xr0 xr0Var2 = this.b.d.U;
                            if (!xr0Var2.d()) {
                                xr0Var2.f();
                                break;
                            } else {
                                xr0Var2.h();
                                break;
                            }
                        case 3:
                            xr0 xr0Var3 = this.b.d.U;
                            xr0Var3.b(xr0Var3.getCurrentLang());
                            break;
                        case 4:
                            jv0 jv0Var3 = this.b.d;
                            jv0Var3.v1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.zn(bundle), true);
                            break;
                        case 5:
                            jv0 jv0Var4 = this.b.d;
                            try {
                                jv0Var4.v1.getMediaDataController().installShortcut(jv0Var4.v1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        default:
                            nt0 nt0Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            d5.s(n2Var4, false, null, currentUser, false, true, false, true, new a3(15, nt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final v70 H5 = v70.H(n2Var, imageView);
        if ((closestTab == 8 || jv0.w0(closestTab)) && i10) {
            c10 = 0;
            H5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new cn0(this, this.b, H5, 4), false);
            H5.k();
        } else {
            c10 = 0;
        }
        jv0Var.y(H5);
        if (!p02) {
            yu0 yu0Var = yu0VarArr[c10];
            if (!yu0Var.w || !yu0Var.v) {
                boolean[] zArr = yu0Var.i;
                if (zArr[c10] && zArr[1] && yu0Var.l) {
                    z10 = false;
                    if (!DialogObject.isEncryptedDialog(j3) && (user == null || !user.bot)) {
                        H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new wm(this, closestTab, H5, 13), false);
                        if (jv0Var.d1 != null && !jv0Var.v0() && (chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(jv0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                            final int i27 = 1;
                            H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.it0
                                public final /* synthetic */ nt0 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i27) {
                                        case 0:
                                            yr0 yr0Var2 = this.b.d.V;
                                            yr0Var2.getClass();
                                            yr0Var2.h(null, new xh.t1(yr0Var2, 0));
                                            H5.u();
                                            break;
                                        case 1:
                                            nt0 nt0Var = this.b;
                                            nt0Var.getClass();
                                            Bundle bundle = new Bundle();
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                            jv0 jv0Var2 = nt0Var.d;
                                            bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                            ja0 ja0Var = new ja0(bundle, null);
                                            ja0Var.c = jv0Var2.d1;
                                            jv0Var2.v1.presentFragment(ja0Var);
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
                                int i29 = yu0VarArr[0].q;
                                f1Var8.setChecked(i29 == 0 || i29 == 1);
                                f1Var8.setOnClickListener(new lt0(this, f1Var9, f1Var8, i28));
                                int i30 = yu0VarArr[0].q;
                                f1Var9.setChecked(i30 == 0 || i30 == 2);
                                z11 = true;
                                f1Var9.setOnClickListener(new lt0(this, f1Var8, f1Var9, 1 == true ? 1 : 0));
                                H5.J = false;
                                H5.Y = z11;
                                H5.s = 0;
                                H5.Z();
                            }
                            final gv0 k12 = jv0Var.k1(closestTab);
                            if (k12 != null && (d9Var = k12.s) != null) {
                                f1Var8.setChecked(d9Var.n);
                                f1Var9.setChecked(k12.s.o);
                            }
                            final int i31 = 0;
                            f1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kt0
                                public final /* synthetic */ nt0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i31) {
                                        case 0:
                                            jv0 jv0Var2 = this.b.d;
                                            if (!jv0Var2.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var10 = f1Var9;
                                                boolean z14 = f1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var11 = f1Var8;
                                                if (!z14 && f1Var11.getCheckView().a.q) {
                                                    float f7 = -jv0Var2.s1;
                                                    jv0Var2.s1 = f7;
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
                                            jv0 jv0Var3 = this.b.d;
                                            if (!jv0Var3.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var12 = f1Var9;
                                                boolean z17 = f1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var13 = f1Var8;
                                                if (!z17 && f1Var13.getCheckView().a.q) {
                                                    float f10 = -jv0Var3.s1;
                                                    jv0Var3.s1 = f10;
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
                            f1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kt0
                                public final /* synthetic */ nt0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i32) {
                                        case 0:
                                            jv0 jv0Var2 = this.b.d;
                                            if (!jv0Var2.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var10 = f1Var8;
                                                boolean z14 = f1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var11 = f1Var9;
                                                if (!z14 && f1Var11.getCheckView().a.q) {
                                                    float f7 = -jv0Var2.s1;
                                                    jv0Var2.s1 = f7;
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
                                            jv0 jv0Var3 = this.b.d;
                                            if (!jv0Var3.H1) {
                                                org.telegram.ui.ActionBar.f1 f1Var12 = f1Var8;
                                                boolean z17 = f1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.f1 f1Var13 = f1Var9;
                                                if (!z17 && f1Var13.getCheckView().a.q) {
                                                    float f10 = -jv0Var3.s1;
                                                    jv0Var3.s1 = f10;
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
            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new wm(this, closestTab, H5, 13), false);
            if (jv0Var.d1 != null) {
                final int i272 = 1;
                H5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) { // from class: org.telegram.ui.Components.it0
                    public final /* synthetic */ nt0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i272) {
                            case 0:
                                yr0 yr0Var2 = this.b.d.V;
                                yr0Var2.getClass();
                                yr0Var2.h(null, new xh.t1(yr0Var2, 0));
                                H5.u();
                                break;
                            case 1:
                                nt0 nt0Var = this.b;
                                nt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jv0 jv0Var2 = nt0Var.d;
                                bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                ja0 ja0Var = new ja0(bundle, null);
                                ja0Var.c = jv0Var2.d1;
                                jv0Var2.v1.presentFragment(ja0Var);
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
