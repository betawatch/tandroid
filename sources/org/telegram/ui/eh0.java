package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class eh0 extends bi1 implements NotificationCenter.NotificationCenterDelegate, le.d {
    public FrameLayout E;
    public gh0 F;
    public dh.d G;
    public View H;
    public Integer I;
    public uy J;
    public ph.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public NotificationCenter.ObserversGroup P;
    public di.f4 Q;
    public boolean R;
    public final gh.c S;
    public final gh.d T;
    public IUpdateLayout w;
    public boolean x;
    public jh1 y;
    public final le.b v = new le.b(0, this, org.telegram.ui.Components.pr.h, 380, true);
    public final RectF U = new RectF();

    public eh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar = new gh.d(null);
            this.T = dVar;
            dVar.j(new bh0(this));
        } else {
            this.T = null;
        }
        this.S = new gh.c();
        z8 z8Var = new z8(this, 5);
        setBulletinDelegate(z8Var);
        org.telegram.ui.Components.qc.a(this.b, z8Var);
    }

    public static /* synthetic */ void Y(eh0 eh0Var, int i10, org.telegram.ui.Components.n70 n70Var) {
        if (eh0Var.currentAccount == i10) {
            return;
        }
        n70Var.u();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.K0(i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        if (r6.includesDialog(r19.getAccountInstance(), r7, r4) == false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Z(eh0 eh0Var, View view) {
        ArrayList<MessagesController.DialogFilter> dialogFilters;
        ArrayList<MessagesController.DialogFilter> arrayList;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        boolean z10;
        TLRPC.EncryptedChat m10;
        ?? r22 = 0;
        if (eh0Var.getParentActivity() == null || eh0Var.getParentActivity() == null || (dialogFilters = eh0Var.getMessagesController().getDialogFilters()) == null || dialogFilters.size() <= 1) {
            return false;
        }
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
        int i10 = 0;
        while (i10 < dialogFilters.size()) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, eh0Var.getParentActivity(), eh0Var.getResourceProvider(), false, false);
            f1Var3.setPadding(AndroidUtilities.dp(18.0f), r22, AndroidUtilities.dp(18.0f), r22);
            CharSequence replaceEmoji = Emoji.replaceEmoji(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, f1Var3.getTextView().getPaint().getFontMetricsInt(), r22);
            if (!dialogFilter.isDefault()) {
                replaceEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, dialogFilter.entities, f1Var3.getTextView().getPaint().getFontMetricsInt());
            }
            int mainUnreadCount = dialogFilter.isDefault() ? MessagesStorage.getInstance(eh0Var.currentAccount).getMainUnreadCount() : dialogFilter.unreadCount;
            if (mainUnreadCount > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) String.valueOf(mainUnreadCount));
                MessagesController messagesController = eh0Var.getMessagesController();
                ArrayList<TLRPC.Dialog> dialogs = dialogFilter.isDefault() ? messagesController.getDialogs(r22) : messagesController.getAllDialogs();
                int i11 = 0;
                org.telegram.ui.ActionBar.f1 f1Var4 = f1Var3;
                while (true) {
                    if (i11 >= dialogs.size()) {
                        arrayList = dialogFilters;
                        f1Var2 = f1Var4;
                        z10 = false;
                        break;
                    }
                    TLRPC.Dialog dialog = dialogs.get(i11);
                    if (dialogFilter.isDefault()) {
                        f1Var2 = f1Var4;
                    } else {
                        f1Var2 = f1Var4;
                        long j3 = dialog.id;
                        if (DialogObject.isEncryptedDialog(j3) && (m10 = org.telegram.messenger.w1.m(messagesController, j3)) != null) {
                            j3 = m10.user_id;
                        }
                    }
                    if (messagesController.getDialogUnreadCount(dialog) > 0 || dialog.unread_mark) {
                        long j10 = dialog.id;
                        arrayList = dialogFilters;
                        if (!messagesController.isDialogMuted(j10, 0L)) {
                            z10 = true;
                            break;
                        }
                        i11++;
                        dialogFilters = arrayList;
                        f1Var4 = f1Var2;
                    }
                    arrayList = dialogFilters;
                    i11++;
                    dialogFilters = arrayList;
                    f1Var4 = f1Var2;
                }
                spannableStringBuilder.setSpan(new ch0(eh0Var, mainUnreadCount, z10), length, spannableStringBuilder.length(), 33);
                org.telegram.ui.ActionBar.f1 f1Var5 = f1Var2;
                f1Var5.setContentDescription(TextUtils.concat(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, "\n", LocaleController.formatPluralString("AccDescrUnreadCount", mainUnreadCount, new Object[0])));
                replaceEmoji = spannableStringBuilder;
                f1Var = f1Var5;
            } else {
                arrayList = dialogFilters;
                f1Var = f1Var3;
            }
            f1Var.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
            f1Var.g(replaceEmoji, 0, new org.telegram.ui.Components.d10(eh0Var.getParentActivity(), R.drawable.msg_folders, eh0Var.getMessagesController().folderTags ? dialogFilter.color : -1));
            f1Var.getTextView().setEmojiColor(eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new z(eh0Var, H, dialogFilter, 11));
            H.r(f1Var, w7.x5.n(-1, -2));
            i10++;
            dialogFilters = arrayList;
            r22 = 0;
        }
        H.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
        H.X = AndroidUtilities.dp(400.0f);
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.i = 3;
        H.Z();
        return true;
    }

    public static /* synthetic */ void a0(eh0 eh0Var) {
        eh0Var.getUserConfig().setShowCallsTab(true);
        eh0Var.g0(true, true);
        NotificationCenter.getInstance(eh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(eh0 eh0Var) {
        eh0Var.getClass();
        int i10 = 0;
        Integer num = null;
        for (int i11 = 3; i11 >= 0; i11--) {
            if (!UserConfig.getInstance(i11).isClientActivated()) {
                i10++;
                if (num == null) {
                    num = Integer.valueOf(i11);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i10--;
        }
        if (i10 > 0 && num != null) {
            eh0Var.presentFragment(new wg0(num.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            eh0Var.showDialog(new sg.k0(7, eh0Var.currentAccount, eh0Var.getParentActivity(), eh0Var, null));
        }
    }

    public static /* synthetic */ void c0(eh0 eh0Var) {
        eh0Var.getUserConfig().setShowCallsTab(false);
        eh0Var.g0(false, true);
        NotificationCenter.getInstance(eh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override // org.telegram.ui.bi1
    public final org.telegram.ui.ActionBar.n2 V(int i10) {
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i10 == 2) {
            if (!getUserConfig().showCallsTab) {
                return new i91(a4.a.i("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new k9(bundle2);
        }
        if (i10 == 0) {
            uy uyVar = new uy(a4.a.i("hasMainTabs", true));
            this.J = uyVar;
            uyVar.I3 = new bh0(this);
            return uyVar;
        }
        if (i10 != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.n2 X = X();
        return X != null && X.canBeginSlide();
    }

    @Override // org.telegram.ui.bi1, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        super.createView(context);
        gh0 gh0Var = new gh0(context, this.resourceProvider);
        this.F = gh0Var;
        gh0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        ph.b[] bVarArr = new ph.b[5];
        this.K = bVarArr;
        bVarArr[0] = ph.b.b(context, this.resourceProvider, ph.a.n, R.string.MainTabsChats);
        this.K[1] = ph.b.b(context, this.resourceProvider, ph.a.f, R.string.MainTabsContacts);
        this.K[2] = ph.b.b(context, this.resourceProvider, ph.a.r, R.string.Settings);
        this.K[3] = ph.b.b(context, this.resourceProvider, ph.a.h, R.string.MainTabsCalls);
        ph.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        int i11 = R.string.MainTabsProfile;
        ph.b bVar = new ph.b(context);
        bVar.a.setText(LocaleController.getString(i11));
        bVar.b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(0, user);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        x9Var.e(user, i9Var);
        x9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.c = x9Var;
        bVar.addView(x9Var, w7.x5.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        final int i12 = 0;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ eh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i12) {
                    case 0:
                        break;
                    case 1:
                        eh0 eh0Var = this.b;
                        if (eh0Var.getParentActivity() != null && eh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        eh0 eh0Var2 = this.b;
                        if (eh0Var2.getParentActivity() != null && eh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                            if (eh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        final int i13 = 1;
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ eh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i13) {
                    case 0:
                        break;
                    case 1:
                        eh0 eh0Var = this.b;
                        if (eh0Var.getParentActivity() != null && eh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        eh0 eh0Var2 = this.b;
                        if (eh0Var2.getParentActivity() != null && eh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                            if (eh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        final int i14 = 2;
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ eh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        eh0 eh0Var = this.b;
                        if (eh0Var.getParentActivity() != null && eh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        eh0 eh0Var2 = this.b;
                        if (eh0Var2.getParentActivity() != null && eh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                            if (eh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        final int i15 = 3;
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.zg0
            public final /* synthetic */ eh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i15) {
                    case 0:
                        break;
                    case 1:
                        eh0 eh0Var = this.b;
                        if (eh0Var.getParentActivity() != null && eh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        eh0 eh0Var2 = this.b;
                        if (eh0Var2.getParentActivity() != null && eh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                            if (eh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H2.W(b03);
                            H2.Z();
                            break;
                        }
                        break;
                    default:
                        this.b.k0(view);
                        break;
                }
                return true;
            }
        });
        this.F.P.add(this.K[0]);
        this.F.P.add(this.K[1]);
        this.F.P.add(this.K[4]);
        this.F.P.add(this.K[3]);
        int i16 = 0;
        while (true) {
            ph.b[] bVarArr3 = this.K;
            if (i16 >= bVarArr3.length) {
                break;
            }
            ph.b bVar2 = bVarArr3[i16];
            bVar2.setOnClickListener(new di.o4(this, i16 > 2 ? i16 - 1 : i16, 19));
            this.F.addView(this.K[i16]);
            this.F.i(bVar2, true, false);
            i16++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        gh.c cVar = this.S;
        cVar.a(themedColor);
        ih.k kVar = new ih.k(this.b);
        gh.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        j0 j0Var = this.b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        gh0 gh0Var2 = this.F;
        eh.e f7 = fh.b.f(this.resourceProvider);
        dh.d k10 = aVar.k();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (k10 instanceof dh.e)) {
            dh.e eVar = (dh.e) k10;
            eVar.N = new bh.g(eVar.I);
        }
        k10.n(f7);
        if (j0Var != null && gh0Var2 != null) {
            kVar.d(gh0Var2, j0Var, new ah.i0(1, k10, gh0Var2), false);
        }
        this.G = k10;
        k10.p(AndroidUtilities.dp(28.0f));
        this.G.o(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        j0 j0Var2 = this.b;
        this.H = new View(context);
        View view = this.H;
        dh.f fVar = new dh.f(cVar);
        fVar.n(null);
        if (j0Var2 != null && view != null) {
            kVar.d(view, j0Var2, new ah.i0(1, fVar, view), false);
        }
        bh.c cVar2 = new bh.c(fVar);
        cVar2.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(cVar2);
        this.b.addView(this.H, w7.x5.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new ah.f(21));
        this.E.addView(this.F, w7.x5.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.b.addView(this.E, w7.x5.e(-1, -2, 80));
        jh1 jh1Var = new jh1(context);
        this.y = jh1Var;
        this.b.addView(jh1Var, w7.x5.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.y);
        this.w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.b;
    }

    public final void d0() {
        gh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT < 31 || (dVar = this.T) == null || (view = this.fragmentView) == null) {
            return;
        }
        dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar.l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ph.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.notificationsCountUpdated || i10 == NotificationCenter.updateInterfaces) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z10 = true;
            }
            j0(z10);
            return;
        }
        if (i10 == NotificationCenter.appUpdateLoading) {
            IUpdateLayout iUpdateLayout3 = this.w;
            if (iUpdateLayout3 != null) {
                iUpdateLayout3.updateFileProgress(null);
                this.w.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.w) != null) {
                iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoadFailed) {
            String str2 = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.w) != null) {
                iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoadProgressChanged) {
            IUpdateLayout iUpdateLayout4 = this.w;
            if (iUpdateLayout4 != null) {
                iUpdateLayout4.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.appUpdateAvailable) {
            IUpdateLayout iUpdateLayout5 = this.w;
            if (iUpdateLayout5 == null || (launchActivity = LaunchActivity.G1) == null) {
                return;
            }
            iUpdateLayout5.updateAppUpdateViews(this.currentAccount, launchActivity.d0.size() == 1);
            return;
        }
        if (i10 == NotificationCenter.needSetDayNightTheme) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                zh1 zh1Var = (zh1) sparseArray.valueAt(i12);
                if (sparseArray.keyAt(i12) != currentPosition && zh1Var != null) {
                    zh1Var.a.clearViews();
                }
            }
            return;
        }
        if (i10 == NotificationCenter.callTabsVisibleToggled) {
            g0(getUserConfig().showCallsTab, true);
            ai1 ai1Var = this.c;
            if (ai1Var == null || ai1Var.getCurrentPosition() != 2) {
                W(2);
                return;
            }
            this.c.D(0);
            m0(0, true);
            this.x = true;
            return;
        }
        if (i10 != NotificationCenter.mainUserInfoChanged) {
            if (i10 == NotificationCenter.contactsPermissionBadgeCheck) {
                f0();
                return;
            }
            return;
        }
        ph.b[] bVarArr = this.K;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i13 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).getClientUserId()));
        bVar.c.e(user, new org.telegram.ui.Components.i9(0, user));
    }

    public final void e0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        ai1 ai1Var = this.c;
        this.S.a(i0.a.d(ai1Var != null ? ai1Var.r(0) : 1.0f, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        dh.d dVar = this.G;
        if (dVar != null) {
            dVar.u();
        }
        d0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        gh0 gh0Var = this.F;
        if (gh0Var != null) {
            gh0Var.invalidate();
        }
        ph.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (ph.b bVar : bVarArr) {
                bVar.getClass();
                bVar.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, bVar.d);
                bVar.s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    public final void f0() {
        if (this.F == null || this.K[1] == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 23 && ContactsController.hasContactsPermission();
        if (z10) {
            MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (i10 < 23 || !UserConfig.getInstance(this.currentAccount).syncContacts || z10 || !MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
            this.K[1].d(null, true, true);
        } else {
            this.K[1].d("!", true, true);
        }
    }

    public final void g0(boolean z10, boolean z11) {
        gh0 gh0Var = this.F;
        if (gh0Var != null) {
            gh0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.c;
    }

    @Override // org.telegram.ui.bi1, org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.h5));
        return themeDescriptions;
    }

    public final void h0() {
        ai1 ai1Var = this.c;
        if (ai1Var == null || this.H == null) {
            return;
        }
        float a2 = 1.0f - w7.p.a(Math.abs(3.0f - ai1Var.getPositionAnimated()), 0.0f, 1.0f);
        float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.L)) * a2)) * this.v.e;
        this.H.setAlpha(navigationBarThirdButtonsFactor);
        this.H.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
        this.H.setVisibility(navigationBarThirdButtonsFactor > 0.0f ? 0 : 8);
    }

    public final void i0() {
        View view = this.y.b;
        int dp = AndroidUtilities.dp(40.0f) + (-((view == null || view.getVisibility() != 0) ? 0 : AndroidUtilities.dp(44.0f)));
        float f7 = this.v.e;
        AndroidUtilities.lerp(0.85f, 1.0f, f7);
        this.E.setTranslationY(AndroidUtilities.lerp(dp, r0, f7));
        this.F.setClickable(f7 > 1.0f);
        this.F.setEnabled(f7 > 1.0f);
        this.F.setAlpha(f7);
        this.F.setVisibility(f7 <= 0.0f ? 8 : 0);
    }

    public final void j0(boolean z10) {
        if (this.F == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount <= 0) {
            this.K[0].d(null, false, z10);
        } else {
            this.K[0].d(LocaleController.formatNumber(mainUnreadCount, ','), false, z10);
        }
    }

    public final void k0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new f6(25));
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new ah0(this, 0), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
                i9Var.r(currentUser);
                org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(this, getParentActivity(), z10);
                linearLayout.addView(ig0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(getParentActivity());
                if (z10) {
                    x9Var.setScaleX(0.833f);
                    x9Var.setScaleY(0.833f);
                }
                x9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                x9Var.getImageReceiver().setCurrentAccount(intValue);
                x9Var.e(currentUser, i9Var);
                ig0Var.addView(x9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.ua(this, intValue, H, 12));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        H.u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.j40.r.a();
    }

    public final uy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        uy uyVar = new uy(bundle);
        this.J = uyVar;
        uyVar.I3 = new bh0(this);
        this.a.put(0, new zh1(uyVar));
        return this.J;
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.K;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e((i11 > 2 ? i11 + (-1) : i11) == i10, z10);
            i11++;
        }
    }

    public final void n0(float f7, boolean z10) {
        int i10 = 0;
        while (i10 < this.K.length) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f7));
            ph.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
            i10++;
        }
        this.F.invalidate();
    }

    @Override // org.telegram.ui.bi1, org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.O = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.P = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.bi1, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.qc.h(this.b);
        NotificationCenter.ObserversGroup observersGroup = this.O;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.O = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.P;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.bi1, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        di.f4 f4Var = this.Q;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override // org.telegram.ui.bi1, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.j40.r.c()) {
            AndroidUtilities.runOnUIThread(new ah0(this, 7), 1500L);
        }
        this.R = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
