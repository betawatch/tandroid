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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class nt0 implements View.OnClickListener {
    public final /* synthetic */ long a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ jv0 d;

    public nt0(jv0 jv0Var, long j3, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.d = jv0Var;
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
        org.telegram.ui.ActionBar.e1 e1Var;
        boolean z12;
        org.telegram.ui.ActionBar.e1 e1Var2;
        org.telegram.ui.ActionBar.e1 e1Var3;
        iv0 j12;
        final jv0 jv0Var = this.d;
        yu0[] yu0VarArr = jv0Var.t1;
        zr0 zr0Var = jv0Var.V;
        ImageView imageView = jv0Var.r0;
        xr0 xr0Var = jv0Var.U;
        int closestTab = jv0Var.getClosestTab();
        boolean p02 = jv0.p0(closestTab);
        final org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
        MessagesController messagesController = MessagesController.getInstance(m2Var.getCurrentAccount());
        long j3 = jv0Var.j1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j3));
        storiesController = jv0Var.getStoriesController();
        boolean i10 = storiesController.i(j3);
        int i11 = 11;
        if (jv0.w0(closestTab) && i10 && (j12 = jv0Var.j1(closestTab)) != null) {
            final int i12 = j12.b;
            final y70 H = y70.H(m2Var, imageView);
            int i13 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i14 = 0;
            final long j10 = this.a;
            H.c(i13, string, new Runnable() { // from class: org.telegram.ui.Components.qr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            jv0Var.O0(m2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            jv0Var.P0(m2Var, j10, i12);
                            H.u();
                            break;
                    }
                }
            }, false);
            jv0Var.x(H, m2Var, j10, i12);
            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new xm(jv0Var, i12, H, i11), false);
            final int i15 = 1;
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() { // from class: org.telegram.ui.Components.qr0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            jv0Var.O0(m2Var, j10, i12);
                            H.u();
                            break;
                        default:
                            jv0Var.P0(m2Var, j10, i12);
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
            xh.o2 currentPage = zr0Var.getCurrentPage();
            yh.k5 k5Var = currentPage.e;
            if (k5Var == null) {
                return;
            }
            long j11 = zr0Var.c;
            int i18 = zr0Var.b;
            boolean canUserDoAction = j11 == UserConfig.getInstance(i18).getClientUserId() ? true : j11 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i18).getChat(Long.valueOf(-j11)), 5);
            final y70 H2 = y70.H(m2Var, imageView);
            if (k5Var.c) {
                e1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, H2.e, H2.d, false, false);
                H2.d(e1Var4);
                e1Var = e1Var4;
                z12 = true;
            }
            if (zr0Var.b()) {
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
                                zr0 zr0Var2 = this.b.d.V;
                                zr0Var2.getClass();
                                zr0Var2.h(null, new xh.t1(zr0Var2, 0));
                                H2.u();
                                break;
                            case 1:
                                nt0 nt0Var = this.b;
                                nt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jv0 jv0Var2 = nt0Var.d;
                                bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                na0 na0Var = new na0(bundle, null);
                                na0Var.c = jv0Var2.d1;
                                jv0Var2.v1.presentFragment(na0Var);
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
            if (zr0Var.e.h()) {
                if (!k5Var.h().isEmpty() || currentPage.d) {
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
                                    zr0 zr0Var2 = this.b.d.V;
                                    zr0Var2.getClass();
                                    zr0Var2.h(null, new xh.t1(zr0Var2, 0));
                                    H2.u();
                                    break;
                                case 1:
                                    nt0 nt0Var = this.b;
                                    nt0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jv0 jv0Var2 = nt0Var.d;
                                    bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                    na0 na0Var = new na0(bundle, null);
                                    na0Var.c = jv0Var2.d1;
                                    jv0Var2.v1.presentFragment(na0Var);
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
            org.telegram.messenger.ik ikVar = new org.telegram.messenger.ik(e1Var, k5Var, h, h10, h11, h12, canUserDoAction, e1Var2, e1Var3, 3);
            org.telegram.ui.ActionBar.e1 e1Var5 = e1Var;
            org.telegram.ui.ActionBar.e1 e1Var6 = e1Var2;
            org.telegram.ui.ActionBar.e1 e1Var7 = e1Var3;
            ikVar.run();
            if (e1Var5 != null) {
                e1Var5.setOnClickListener(new et(i17, k5Var, ikVar));
            }
            xh.s2.j(h, k5Var, ikVar, 1);
            xh.s2.j(h10, k5Var, ikVar, 2);
            xh.s2.j(h11, k5Var, ikVar, 4);
            xh.s2.j(h12, k5Var, ikVar, 8);
            if (canUserDoAction) {
                xh.s2.j(e1Var6, k5Var, ikVar, 256);
                xh.s2.j(e1Var7, k5Var, ikVar, 512);
            }
            H2.Y = true;
            H2.J = false;
            H2.s = 0;
            H2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && xr0Var != null) {
            y70 H3 = y70.H(m2Var, imageView);
            boolean z13 = xr0Var.getItemsCount() < m2Var.getMessagesController().botPreviewMediasMax;
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
                            org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var2.v1;
                            ci.lc E = ci.lc.E(m2Var2.getParentActivity(), m2Var2.getCurrentAccount());
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
                            org.telegram.ui.ActionBar.m2 m2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", m2Var3.getUserConfig().getClientUserId());
                            m2Var3.presentFragment(new org.telegram.ui.wn(bundle), true);
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
                            org.telegram.ui.ActionBar.m2 m2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = m2Var4.getUserConfig().getCurrentUser();
                            e5.s(m2Var4, false, null, currentUser, false, true, false, true, new w2(16, nt0Var, currentUser));
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
                            org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var2.v1;
                            ci.lc E = ci.lc.E(m2Var2.getParentActivity(), m2Var2.getCurrentAccount());
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
                            org.telegram.ui.ActionBar.m2 m2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", m2Var3.getUserConfig().getClientUserId());
                            m2Var3.presentFragment(new org.telegram.ui.wn(bundle), true);
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
                            org.telegram.ui.ActionBar.m2 m2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = m2Var4.getUserConfig().getCurrentUser();
                            e5.s(m2Var4, false, null, currentUser, false, true, false, true, new w2(16, nt0Var, currentUser));
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
                            org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var2.v1;
                            ci.lc E = ci.lc.E(m2Var2.getParentActivity(), m2Var2.getCurrentAccount());
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
                            org.telegram.ui.ActionBar.m2 m2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", m2Var3.getUserConfig().getClientUserId());
                            m2Var3.presentFragment(new org.telegram.ui.wn(bundle), true);
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
                            org.telegram.ui.ActionBar.m2 m2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = m2Var4.getUserConfig().getCurrentUser();
                            e5.s(m2Var4, false, null, currentUser, false, true, false, true, new w2(16, nt0Var, currentUser));
                            break;
                    }
                }
            }, xr0Var.getItemsCount() > 0);
            final int i24 = 3;
            H3.m(!TextUtils.isEmpty(xr0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, i41.E(xr0Var.getCurrentLang(), null, null)), true, new Runnable(this) { // from class: org.telegram.ui.Components.jt0
                public final /* synthetic */ nt0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            jv0 jv0Var2 = this.b.d;
                            org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var2.v1;
                            ci.lc E = ci.lc.E(m2Var2.getParentActivity(), m2Var2.getCurrentAccount());
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
                            org.telegram.ui.ActionBar.m2 m2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", m2Var3.getUserConfig().getClientUserId());
                            m2Var3.presentFragment(new org.telegram.ui.wn(bundle), true);
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
                            org.telegram.ui.ActionBar.m2 m2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = m2Var4.getUserConfig().getCurrentUser();
                            e5.s(m2Var4, false, null, currentUser, false, true, false, true, new w2(16, nt0Var, currentUser));
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
            y70 H4 = y70.H(m2Var, imageView);
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
                            org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var2.v1;
                            ci.lc E = ci.lc.E(m2Var2.getParentActivity(), m2Var2.getCurrentAccount());
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
                            org.telegram.ui.ActionBar.m2 m2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", m2Var3.getUserConfig().getClientUserId());
                            m2Var3.presentFragment(new org.telegram.ui.wn(bundle), true);
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
                            org.telegram.ui.ActionBar.m2 m2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = m2Var4.getUserConfig().getCurrentUser();
                            e5.s(m2Var4, false, null, currentUser, false, true, false, true, new w2(16, nt0Var, currentUser));
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
                            org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var2.v1;
                            ci.lc E = ci.lc.E(m2Var2.getParentActivity(), m2Var2.getCurrentAccount());
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
                            org.telegram.ui.ActionBar.m2 m2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", m2Var3.getUserConfig().getClientUserId());
                            m2Var3.presentFragment(new org.telegram.ui.wn(bundle), true);
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
                            org.telegram.ui.ActionBar.m2 m2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = m2Var4.getUserConfig().getCurrentUser();
                            e5.s(m2Var4, false, null, currentUser, false, true, false, true, new w2(16, nt0Var, currentUser));
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
                            org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var2.v1;
                            ci.lc E = ci.lc.E(m2Var2.getParentActivity(), m2Var2.getCurrentAccount());
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
                            org.telegram.ui.ActionBar.m2 m2Var3 = jv0Var3.v1;
                            bundle.putLong("user_id", m2Var3.getUserConfig().getClientUserId());
                            m2Var3.presentFragment(new org.telegram.ui.wn(bundle), true);
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
                            org.telegram.ui.ActionBar.m2 m2Var4 = nt0Var.d.v1;
                            TLRPC.User currentUser = m2Var4.getUserConfig().getCurrentUser();
                            e5.s(m2Var4, false, null, currentUser, false, true, false, true, new w2(16, nt0Var, currentUser));
                            break;
                    }
                }
            }, false);
            H4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            H4.s = 0;
            H4.Z();
            return;
        }
        final y70 H5 = y70.H(m2Var, imageView);
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
                        H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new xm(this, closestTab, H5, 13), false);
                        if (jv0Var.d1 != null && !jv0Var.v0() && (chat = MessagesController.getInstance(m2Var.getCurrentAccount()).getChat(Long.valueOf(jv0Var.d1.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
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
                                            zr0 zr0Var2 = this.b.d.V;
                                            zr0Var2.getClass();
                                            zr0Var2.h(null, new xh.t1(zr0Var2, 0));
                                            H5.u();
                                            break;
                                        case 1:
                                            nt0 nt0Var = this.b;
                                            nt0Var.getClass();
                                            Bundle bundle = new Bundle();
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                            jv0 jv0Var2 = nt0Var.d;
                                            bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                            na0 na0Var = new na0(bundle, null);
                                            na0Var.c = jv0Var2.d1;
                                            jv0Var2.v1.presentFragment(na0Var);
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
                            if (!p02) {
                                int i28 = 0;
                                int i29 = yu0VarArr[0].q;
                                e1Var8.setChecked(i29 == 0 || i29 == 1);
                                e1Var8.setOnClickListener(new lt0(this, e1Var9, e1Var8, i28));
                                int i30 = yu0VarArr[0].q;
                                e1Var9.setChecked(i30 == 0 || i30 == 2);
                                z11 = true;
                                e1Var9.setOnClickListener(new lt0(this, e1Var8, e1Var9, 1 == true ? 1 : 0));
                                H5.J = false;
                                H5.Y = z11;
                                H5.s = 0;
                                H5.Z();
                            }
                            final gv0 k12 = jv0Var.k1(closestTab);
                            if (k12 != null && (d9Var = k12.s) != null) {
                                e1Var8.setChecked(d9Var.n);
                                e1Var9.setChecked(k12.s.o);
                            }
                            final int i31 = 0;
                            e1Var8.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kt0
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
                                                org.telegram.ui.ActionBar.e1 e1Var10 = e1Var9;
                                                boolean z14 = e1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.e1 e1Var11 = e1Var8;
                                                if (!z14 && e1Var11.getCheckView().a.q) {
                                                    float f7 = -jv0Var2.s1;
                                                    jv0Var2.s1 = f7;
                                                    AndroidUtilities.shakeViewSpring(view2, f7);
                                                    break;
                                                } else {
                                                    e1Var11.getCheckView().a(!e1Var11.getCheckView().a.q, true);
                                                    ai.d9 d9Var2 = k12.s;
                                                    if (d9Var2 != null) {
                                                        boolean z15 = e1Var11.getCheckView().a.q;
                                                        boolean z16 = e1Var10.getCheckView().a.q;
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
                                                org.telegram.ui.ActionBar.e1 e1Var12 = e1Var9;
                                                boolean z17 = e1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.e1 e1Var13 = e1Var8;
                                                if (!z17 && e1Var13.getCheckView().a.q) {
                                                    float f10 = -jv0Var3.s1;
                                                    jv0Var3.s1 = f10;
                                                    AndroidUtilities.shakeViewSpring(view2, f10);
                                                    break;
                                                } else {
                                                    e1Var13.getCheckView().a(!e1Var13.getCheckView().a.q, true);
                                                    ai.d9 d9Var3 = k12.s;
                                                    if (d9Var3 != null) {
                                                        boolean z18 = e1Var12.getCheckView().a.q;
                                                        boolean z19 = e1Var13.getCheckView().a.q;
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
                            e1Var9.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kt0
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
                                                org.telegram.ui.ActionBar.e1 e1Var10 = e1Var8;
                                                boolean z14 = e1Var10.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.e1 e1Var11 = e1Var9;
                                                if (!z14 && e1Var11.getCheckView().a.q) {
                                                    float f7 = -jv0Var2.s1;
                                                    jv0Var2.s1 = f7;
                                                    AndroidUtilities.shakeViewSpring(view2, f7);
                                                    break;
                                                } else {
                                                    e1Var11.getCheckView().a(!e1Var11.getCheckView().a.q, true);
                                                    ai.d9 d9Var2 = k12.s;
                                                    if (d9Var2 != null) {
                                                        boolean z15 = e1Var11.getCheckView().a.q;
                                                        boolean z16 = e1Var10.getCheckView().a.q;
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
                                                org.telegram.ui.ActionBar.e1 e1Var12 = e1Var8;
                                                boolean z17 = e1Var12.getCheckView().a.q;
                                                org.telegram.ui.ActionBar.e1 e1Var13 = e1Var9;
                                                if (!z17 && e1Var13.getCheckView().a.q) {
                                                    float f10 = -jv0Var3.s1;
                                                    jv0Var3.s1 = f10;
                                                    AndroidUtilities.shakeViewSpring(view2, f10);
                                                    break;
                                                } else {
                                                    e1Var13.getCheckView().a(!e1Var13.getCheckView().a.q, true);
                                                    ai.d9 d9Var3 = k12.s;
                                                    if (d9Var3 != null) {
                                                        boolean z18 = e1Var12.getCheckView().a.q;
                                                        boolean z19 = e1Var13.getCheckView().a.q;
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
            H5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new xm(this, closestTab, H5, 13), false);
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
                                zr0 zr0Var2 = this.b.d.V;
                                zr0Var2.getClass();
                                zr0Var2.h(null, new xh.t1(zr0Var2, 0));
                                H5.u();
                                break;
                            case 1:
                                nt0 nt0Var = this.b;
                                nt0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jv0 jv0Var2 = nt0Var.d;
                                bundle.putLong("dialog_id", -jv0Var2.d1.id);
                                na0 na0Var = new na0(bundle, null);
                                na0Var.c = jv0Var2.d1;
                                jv0Var2.v1.presentFragment(na0Var);
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
