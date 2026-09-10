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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fh0 extends gi1 implements NotificationCenter.NotificationCenterDelegate, le.d {
    public FrameLayout E;
    public hh0 F;
    public bh.d G;
    public View H;
    public Integer I;
    public wy J;
    public nh.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public NotificationCenter.ObserversGroup P;
    public bi.x4 Q;
    public boolean R;
    public final eh.c S;
    public final eh.d T;
    public IUpdateLayout w;
    public boolean x;
    public oh1 y;
    public final le.b v = new le.b(0, this, org.telegram.ui.Components.wr.h, 380, true);
    public final RectF U = new RectF();

    public fh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            eh.d dVar = new eh.d(null);
            this.T = dVar;
            dVar.j(new ch0(this));
        } else {
            this.T = null;
        }
        this.S = new eh.c();
        z8 z8Var = new z8(this, 5);
        setBulletinDelegate(z8Var);
        org.telegram.ui.Components.pc.a(this.b, z8Var);
    }

    public static /* synthetic */ void Y(fh0 fh0Var, int i10, org.telegram.ui.Components.w70 w70Var) {
        if (fh0Var.currentAccount == i10) {
            return;
        }
        w70Var.u();
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
    public static boolean Z(fh0 fh0Var, View view) {
        ArrayList<MessagesController.DialogFilter> dialogFilters;
        ArrayList<MessagesController.DialogFilter> arrayList;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        boolean z10;
        TLRPC.EncryptedChat m10;
        ?? r22 = 0;
        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null || (dialogFilters = fh0Var.getMessagesController().getDialogFilters()) == null || dialogFilters.size() <= 1) {
            return false;
        }
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
        int i10 = 0;
        while (i10 < dialogFilters.size()) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, fh0Var.getParentActivity(), fh0Var.getResourceProvider(), false, false);
            g1Var3.setPadding(AndroidUtilities.dp(18.0f), r22, AndroidUtilities.dp(18.0f), r22);
            CharSequence replaceEmoji = Emoji.replaceEmoji(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, g1Var3.getTextView().getPaint().getFontMetricsInt(), r22);
            if (!dialogFilter.isDefault()) {
                replaceEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, dialogFilter.entities, g1Var3.getTextView().getPaint().getFontMetricsInt());
            }
            int mainUnreadCount = dialogFilter.isDefault() ? MessagesStorage.getInstance(fh0Var.currentAccount).getMainUnreadCount() : dialogFilter.unreadCount;
            if (mainUnreadCount > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) String.valueOf(mainUnreadCount));
                MessagesController messagesController = fh0Var.getMessagesController();
                ArrayList<TLRPC.Dialog> dialogs = dialogFilter.isDefault() ? messagesController.getDialogs(r22) : messagesController.getAllDialogs();
                int i11 = 0;
                org.telegram.ui.ActionBar.g1 g1Var4 = g1Var3;
                while (true) {
                    if (i11 >= dialogs.size()) {
                        arrayList = dialogFilters;
                        g1Var2 = g1Var4;
                        z10 = false;
                        break;
                    }
                    TLRPC.Dialog dialog = dialogs.get(i11);
                    if (dialogFilter.isDefault()) {
                        g1Var2 = g1Var4;
                    } else {
                        g1Var2 = g1Var4;
                        long j3 = dialog.id;
                        if (DialogObject.isEncryptedDialog(j3) && (m10 = org.telegram.messenger.a2.m(messagesController, j3)) != null) {
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
                        g1Var4 = g1Var2;
                    }
                    arrayList = dialogFilters;
                    i11++;
                    dialogFilters = arrayList;
                    g1Var4 = g1Var2;
                }
                spannableStringBuilder.setSpan(new dh0(fh0Var, mainUnreadCount, z10), length, spannableStringBuilder.length(), 33);
                org.telegram.ui.ActionBar.g1 g1Var5 = g1Var2;
                g1Var5.setContentDescription(TextUtils.concat(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, "\n", LocaleController.formatPluralString("AccDescrUnreadCount", mainUnreadCount, new Object[0])));
                replaceEmoji = spannableStringBuilder;
                g1Var = g1Var5;
            } else {
                arrayList = dialogFilters;
                g1Var = g1Var3;
            }
            g1Var.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
            g1Var.g(replaceEmoji, 0, new org.telegram.ui.Components.l10(fh0Var.getParentActivity(), R.drawable.msg_folders, fh0Var.getMessagesController().folderTags ? dialogFilter.color : -1));
            g1Var.getTextView().setEmojiColor(fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new a0(fh0Var, H, dialogFilter, 11));
            H.r(g1Var, w7.a6.n(-1, -2));
            i10++;
            dialogFilters = arrayList;
            r22 = 0;
        }
        H.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
        H.X = AndroidUtilities.dp(400.0f);
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.i = 3;
        H.Z();
        return true;
    }

    public static /* synthetic */ void a0(fh0 fh0Var) {
        fh0Var.getUserConfig().setShowCallsTab(true);
        fh0Var.g0(true, true);
        NotificationCenter.getInstance(fh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(fh0 fh0Var) {
        fh0Var.getClass();
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
            fh0Var.presentFragment(new xg0(num.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            fh0Var.showDialog(new qg.k0(7, fh0Var.currentAccount, fh0Var.getParentActivity(), fh0Var, null));
        }
    }

    public static /* synthetic */ void c0(fh0 fh0Var) {
        fh0Var.getUserConfig().setShowCallsTab(false);
        fh0Var.g0(false, true);
        NotificationCenter.getInstance(fh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override // org.telegram.ui.gi1
    public final org.telegram.ui.ActionBar.p2 V(int i10) {
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i10 == 2) {
            if (!getUserConfig().showCallsTab) {
                return new k91(a4.a.i("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new k9(bundle2);
        }
        if (i10 == 0) {
            wy wyVar = new wy(a4.a.i("hasMainTabs", true));
            this.J = wyVar;
            wyVar.I3 = new ch0(this);
            return wyVar;
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.p2 X = X();
        return X != null && X.canBeginSlide();
    }

    @Override // org.telegram.ui.gi1, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        super.createView(context);
        hh0 hh0Var = new hh0(context, this.resourceProvider);
        this.F = hh0Var;
        hh0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        nh.b[] bVarArr = new nh.b[5];
        this.K = bVarArr;
        bVarArr[0] = nh.b.b(context, this.resourceProvider, nh.a.n, R.string.MainTabsChats);
        this.K[1] = nh.b.b(context, this.resourceProvider, nh.a.f, R.string.MainTabsContacts);
        this.K[2] = nh.b.b(context, this.resourceProvider, nh.a.r, R.string.Settings);
        this.K[3] = nh.b.b(context, this.resourceProvider, nh.a.h, R.string.MainTabsCalls);
        nh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        int i11 = R.string.MainTabsProfile;
        nh.b bVar = new nh.b(context);
        bVar.a.setText(LocaleController.getString(i11));
        bVar.b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(0, user);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.e(user, g9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.c = w9Var;
        bVar.addView(w9Var, w7.a6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        final int i12 = 0;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i12) {
                    case 0:
                        break;
                    case 1:
                        fh0 fh0Var = this.b;
                        if (fh0Var.getParentActivity() != null && fh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
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
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i13) {
                    case 0:
                        break;
                    case 1:
                        fh0 fh0Var = this.b;
                        if (fh0Var.getParentActivity() != null && fh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
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
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        fh0 fh0Var = this.b;
                        if (fh0Var.getParentActivity() != null && fh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
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
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ah0
            public final /* synthetic */ fh0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i15) {
                    case 0:
                        break;
                    case 1:
                        fh0 fh0Var = this.b;
                        if (fh0Var.getParentActivity() != null && fh0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                            b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                            H.W(b02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
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
            nh.b[] bVarArr3 = this.K;
            if (i16 >= bVarArr3.length) {
                break;
            }
            nh.b bVar2 = bVarArr3[i16];
            bVar2.setOnClickListener(new bi.j5(this, i16 > 2 ? i16 - 1 : i16, 19));
            this.F.addView(this.K[i16]);
            this.F.i(bVar2, true, false);
            i16++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        eh.c cVar = this.S;
        cVar.a(themedColor);
        gh.k kVar = new gh.k(this.b);
        eh.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        k0 k0Var = this.b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        hh0 hh0Var2 = this.F;
        ch.e f7 = dh.c.f(this.resourceProvider);
        bh.d k10 = aVar.k();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (k10 instanceof bh.e)) {
            bh.e eVar = (bh.e) k10;
            eVar.N = new zg.f(eVar.I);
        }
        k10.n(f7);
        if (k0Var != null && hh0Var2 != null) {
            kVar.d(hh0Var2, k0Var, new sg.f0(14, k10, hh0Var2), false);
        }
        this.G = k10;
        k10.p(AndroidUtilities.dp(28.0f));
        this.G.o(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        k0 k0Var2 = this.b;
        this.H = new View(context);
        View view = this.H;
        bh.f fVar = new bh.f(cVar);
        fVar.n(null);
        if (k0Var2 != null && view != null) {
            kVar.d(view, k0Var2, new sg.f0(14, fVar, view), false);
        }
        zg.b bVar3 = new zg.b(fVar);
        bVar3.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(bVar3);
        this.b.addView(this.H, w7.a6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new bi.d5(19));
        this.E.addView(this.F, w7.a6.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.b.addView(this.E, w7.a6.e(-1, -2, 80));
        oh1 oh1Var = new oh1(context);
        this.y = oh1Var;
        this.b.addView(oh1Var, w7.a6.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.y);
        this.w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.b;
    }

    public final void d0() {
        eh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT < 31 || (dVar = this.T) == null || (view = this.fragmentView) == null) {
            return;
        }
        dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar.l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nh.b bVar;
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
                ei1 ei1Var = (ei1) sparseArray.valueAt(i12);
                if (sparseArray.keyAt(i12) != currentPosition && ei1Var != null) {
                    ei1Var.a.clearViews();
                }
            }
            return;
        }
        if (i10 == NotificationCenter.callTabsVisibleToggled) {
            g0(getUserConfig().showCallsTab, true);
            fi1 fi1Var = this.c;
            if (fi1Var == null || fi1Var.getCurrentPosition() != 2) {
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
        nh.b[] bVarArr = this.K;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i13 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).getClientUserId()));
        bVar.c.e(user, new org.telegram.ui.Components.g9(0, user));
    }

    public final void e0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        fi1 fi1Var = this.c;
        this.S.a(i0.a.d(fi1Var != null ? fi1Var.r(0) : 1.0f, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        bh.d dVar = this.G;
        if (dVar != null) {
            dVar.u();
        }
        d0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        hh0 hh0Var = this.F;
        if (hh0Var != null) {
            hh0Var.invalidate();
        }
        nh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (nh.b bVar : bVarArr) {
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
        hh0 hh0Var = this.F;
        if (hh0Var != null) {
            hh0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.c;
    }

    @Override // org.telegram.ui.gi1, org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.h5));
        return themeDescriptions;
    }

    public final void h0() {
        fi1 fi1Var = this.c;
        if (fi1Var == null || this.H == null) {
            return;
        }
        float a2 = 1.0f - w7.q.a(Math.abs(3.0f - fi1Var.getPositionAnimated()), 0.0f, 1.0f);
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
        Collections.sort(arrayList, new org.telegram.ui.Components.m9(16));
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new bh0(this, 0), false);
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
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.r(currentUser);
                org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(this, getParentActivity(), z10);
                linearLayout.addView(sg0Var, w7.a6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, g9Var);
                sg0Var.addView(w9Var, w7.a6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.a6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.wa(this, intValue, H, 12));
                H.r(linearLayout, w7.a6.n(230, 48));
            }
        }
        H.u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.t40.r.a();
    }

    public final wy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        wy wyVar = new wy(bundle);
        this.J = wyVar;
        wyVar.I3 = new ch0(this);
        this.a.put(0, new ei1(wyVar));
        return this.J;
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            nh.b[] bVarArr = this.K;
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
            nh.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
            i10++;
        }
        this.F.invalidate();
    }

    @Override // org.telegram.ui.gi1, org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.O = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.P = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.gi1, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.pc.h(this.b);
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

    @Override // org.telegram.ui.gi1, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        bi.x4 x4Var = this.Q;
        if (x4Var != null) {
            x4Var.e(true);
        }
    }

    @Override // org.telegram.ui.gi1, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.t40.r.c()) {
            AndroidUtilities.runOnUIThread(new bh0(this, 7), 1500L);
        }
        this.R = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
