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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fh0 extends ci1 implements NotificationCenter.NotificationCenterDelegate, me.d {
    public FrameLayout E;
    public hh0 F;
    public ch.d G;
    public View H;
    public Integer I;
    public ty J;
    public oh.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public ci.d4 P;
    public boolean Q;
    public final fh.c R;
    public final fh.d S;
    public IUpdateLayout w;
    public boolean x;
    public kh1 y;
    public final me.b v = new me.b(0, this, org.telegram.ui.Components.hs.h, 380, true);
    public final RectF T = new RectF();

    public fh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            fh.d dVar = new fh.d(null);
            this.S = dVar;
            dVar.j(new ch0(this));
        } else {
            this.S = null;
        }
        this.R = new fh.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.tc.a(this.b, y8Var);
    }

    public static /* synthetic */ void Y(fh0 fh0Var, int i10, org.telegram.ui.Components.p80 p80Var) {
        if (fh0Var.currentAccount == i10) {
            return;
        }
        p80Var.u();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.K0(i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        if (r6.includesDialog(r19.getAccountInstance(), r7, r4) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
    
        if (r4.unread_mark != false) goto L49;
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
        boolean z10;
        ArrayList<MessagesController.DialogFilter> arrayList;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        boolean z11;
        org.telegram.ui.ActionBar.f1 f1Var3;
        TLRPC.EncryptedChat l4;
        ?? r22 = 0;
        if (fh0Var.getParentActivity() != null && fh0Var.getParentActivity() != null && (dialogFilters = fh0Var.getMessagesController().getDialogFilters()) != null) {
            boolean z12 = true;
            if (dialogFilters.size() > 1) {
                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                int i10 = 0;
                while (i10 < dialogFilters.size()) {
                    MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                    org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(2, fh0Var.getParentActivity(), fh0Var.getResourceProvider(), false, false);
                    f1Var4.setPadding(AndroidUtilities.dp(18.0f), r22, AndroidUtilities.dp(18.0f), r22);
                    CharSequence replaceEmoji = Emoji.replaceEmoji(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, f1Var4.getTextView().getPaint().getFontMetricsInt(), r22);
                    if (!dialogFilter.isDefault()) {
                        replaceEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, dialogFilter.entities, f1Var4.getTextView().getPaint().getFontMetricsInt());
                    }
                    int mainUnreadCount = dialogFilter.isDefault() ? MessagesStorage.getInstance(fh0Var.currentAccount).getMainUnreadCount() : dialogFilter.unreadCount;
                    if (mainUnreadCount > 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) String.valueOf(mainUnreadCount));
                        MessagesController messagesController = fh0Var.getMessagesController();
                        ArrayList<TLRPC.Dialog> dialogs = dialogFilter.isDefault() ? messagesController.getDialogs(r22) : messagesController.getAllDialogs();
                        int i11 = r22;
                        z10 = z12;
                        org.telegram.ui.ActionBar.f1 f1Var5 = f1Var4;
                        while (true) {
                            if (i11 >= dialogs.size()) {
                                arrayList = dialogFilters;
                                f1Var2 = f1Var5;
                                z11 = false;
                                break;
                            }
                            TLRPC.Dialog dialog = dialogs.get(i11);
                            if (dialogFilter.isDefault()) {
                                f1Var3 = f1Var5;
                            } else {
                                org.telegram.ui.ActionBar.f1 f1Var6 = f1Var5;
                                long j3 = dialog.id;
                                if (DialogObject.isEncryptedDialog(j3) && (l4 = org.telegram.messenger.q.l(messagesController, j3)) != null) {
                                    j3 = l4.user_id;
                                }
                                f1Var3 = f1Var6;
                                f1Var3 = f1Var6;
                            }
                            if (messagesController.getDialogUnreadCount(dialog) <= 0) {
                                f1Var3 = f1Var3;
                            }
                            long j10 = dialog.id;
                            arrayList = dialogFilters;
                            if (!messagesController.isDialogMuted(j10, 0L)) {
                                z11 = z10 ? 1 : 0;
                                f1Var2 = f1Var3;
                                break;
                            }
                            i11++;
                            dialogFilters = arrayList;
                            f1Var5 = f1Var3;
                        }
                        spannableStringBuilder.setSpan(new dh0(fh0Var, mainUnreadCount, z11), length, spannableStringBuilder.length(), 33);
                        String string = dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name;
                        String formatPluralString = LocaleController.formatPluralString("AccDescrUnreadCount", mainUnreadCount, new Object[0]);
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = string;
                        charSequenceArr[z10 ? 1 : 0] = "\n";
                        charSequenceArr[2] = formatPluralString;
                        CharSequence concat = TextUtils.concat(charSequenceArr);
                        org.telegram.ui.ActionBar.f1 f1Var7 = f1Var2;
                        f1Var7.setContentDescription(concat);
                        replaceEmoji = spannableStringBuilder;
                        f1Var = f1Var7;
                    } else {
                        z10 = z12;
                        arrayList = dialogFilters;
                        f1Var = f1Var4;
                    }
                    f1Var.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
                    f1Var.g(replaceEmoji, 0, new org.telegram.ui.Components.t10(fh0Var.getParentActivity(), R.drawable.msg_folders, fh0Var.getMessagesController().folderTags ? dialogFilter.color : -1));
                    f1Var.getTextView().setEmojiColor(fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oh));
                    f1Var.setMinimumWidth(160);
                    f1Var.setOnClickListener(new a0(fh0Var, H, dialogFilter, 11));
                    H.r(f1Var, w7.x5.n(-1, -2));
                    i10++;
                    dialogFilters = arrayList;
                    z12 = z10;
                    r22 = 0;
                }
                boolean z13 = z12;
                H.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                H.X = AndroidUtilities.dp(400.0f);
                ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                H.W(c02);
                H.i = 3;
                H.Z();
                return z13;
            }
        }
        return false;
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
            fh0Var.presentFragment(new wg0(num.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            fh0Var.showDialog(new rg.j0(7, fh0Var.currentAccount, fh0Var.getParentActivity(), fh0Var, null));
        }
    }

    public static /* synthetic */ void c0(fh0 fh0Var) {
        fh0Var.getUserConfig().setShowCallsTab(false);
        fh0Var.g0(false, true);
        NotificationCenter.getInstance(fh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override // org.telegram.ui.ci1
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
                return new i91(a1.g.i("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new j9(bundle2);
        }
        if (i10 == 0) {
            ty tyVar = new ty(a1.g.i("hasMainTabs", true));
            this.J = tyVar;
            tyVar.I3 = new ch0(this);
            return tyVar;
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

    @Override // org.telegram.ui.ci1, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        super.createView(context);
        hh0 hh0Var = new hh0(context, this.resourceProvider);
        this.F = hh0Var;
        hh0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        oh.b[] bVarArr = new oh.b[5];
        this.K = bVarArr;
        bVarArr[0] = oh.b.b(context, this.resourceProvider, oh.a.n, R.string.MainTabsChats);
        this.K[1] = oh.b.b(context, this.resourceProvider, oh.a.f, R.string.MainTabsContacts);
        this.K[2] = oh.b.b(context, this.resourceProvider, oh.a.r, R.string.Settings);
        this.K[3] = oh.b.b(context, this.resourceProvider, oh.a.h, R.string.MainTabsCalls);
        oh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        int i11 = R.string.MainTabsProfile;
        oh.b bVar = new oh.b(context);
        bVar.a.setText(LocaleController.getString(i11));
        bVar.b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(0, user);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.e(user, j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.c = y9Var;
        bVar.addView(y9Var, w7.x5.a(22.0f, 0.0f, 5.0f, 0.0f, 0.0f, 22, 49));
        bVar.w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.s = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.bl, e6Var);
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
                            org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H.W(c02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H2.W(c03);
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
                            org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H.W(c02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H2.W(c03);
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
                            org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H.W(c02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H2.W(c03);
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
                            org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                            H.u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.i = 3;
                            ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H.W(c02);
                            H.Z();
                            break;
                        }
                        break;
                    case 2:
                        fh0 fh0Var2 = this.b;
                        if (fh0Var2.getParentActivity() != null && fh0Var2.getParentActivity() != null) {
                            org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                            H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                            if (fh0Var2.getUserConfig().showCallsTab) {
                                H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                            } else {
                                H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                            }
                            H2.u = true;
                            H2.v = true;
                            H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                            c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                            H2.W(c03);
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
            oh.b[] bVarArr3 = this.K;
            if (i16 >= bVarArr3.length) {
                break;
            }
            oh.b bVar2 = bVarArr3[i16];
            bVar2.setOnClickListener(new ci.m4(this, i16 > 2 ? i16 - 1 : i16, 19));
            this.F.addView(this.K[i16]);
            this.F.i(bVar2, true, false);
            i16++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.d6);
        fh.c cVar = this.R;
        cVar.a(themedColor);
        hh.j jVar = new hh.j(this.b);
        fh.a aVar = this.S;
        if (aVar == null) {
            aVar = cVar;
        }
        ah.c cVar2 = new ah.c(aVar);
        k0 k0Var = this.b;
        cVar2.f = jVar;
        cVar2.g = k0Var;
        cVar2.i = LiteMode.isEnabled(262144);
        ch.d c10 = cVar2.c(this.F, eh.b.f(this.resourceProvider), false);
        this.G = c10;
        c10.q(AndroidUtilities.dp(28.0f));
        this.G.p(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        ah.c cVar3 = new ah.c(cVar);
        k0 k0Var2 = this.b;
        cVar3.f = jVar;
        cVar3.g = k0Var2;
        this.H = new View(context);
        ah.d dVar = new ah.d(cVar3.c(this.H, null, false));
        dVar.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(dVar);
        this.b.addView(this.H, w7.x5.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new ai.e2(20));
        this.E.addView(this.F, w7.x5.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.b.addView(this.E, w7.x5.e(-1, -2, 80));
        kh1 kh1Var = new kh1(context);
        this.y = kh1Var;
        this.b.addView(kh1Var, w7.x5.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.y);
        this.w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.b;
    }

    public final void d0() {
        fh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT < 31 || (dVar = this.S) == null || (view = this.fragmentView) == null) {
            return;
        }
        dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar.k();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oh.b bVar;
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
                ai1 ai1Var = (ai1) sparseArray.valueAt(i12);
                if (sparseArray.keyAt(i12) != currentPosition && ai1Var != null) {
                    ai1Var.a.clearViews();
                }
            }
            return;
        }
        if (i10 == NotificationCenter.callTabsVisibleToggled) {
            g0(getUserConfig().showCallsTab, true);
            bi1 bi1Var = this.c;
            if (bi1Var == null || bi1Var.getCurrentPosition() != 2) {
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
        oh.b[] bVarArr = this.K;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i13 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).getClientUserId()));
        bVar.c.e(user, new org.telegram.ui.Components.j9(0, user));
    }

    public final void e0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.d6);
        bi1 bi1Var = this.c;
        this.R.a(i0.a.d(bi1Var != null ? bi1Var.r(0) : 1.0f, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        ch.d dVar = this.G;
        if (dVar != null) {
            dVar.v();
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
        oh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (oh.b bVar : bVarArr) {
                bVar.getClass();
                bVar.w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.cl, bVar.d);
                bVar.s = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    public final void f0() {
        if (this.F == null || this.K[1] == null) {
            return;
        }
        boolean hasContactsPermission = ContactsController.hasContactsPermission();
        if (hasContactsPermission) {
            MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (UserConfig.getInstance(this.currentAccount).syncContacts && !hasContactsPermission && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
            this.K[1].d("!", true, true);
        } else {
            this.K[1].d(null, true, true);
        }
    }

    public final void g0(boolean z10, boolean z11) {
        hh0 hh0Var = this.F;
        if (hh0Var != null) {
            hh0Var.i(this.K[2], !z10, z11);
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
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.c;
    }

    @Override // org.telegram.ui.ci1, org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.h5));
        return themeDescriptions;
    }

    public final void h0() {
        bi1 bi1Var = this.c;
        if (bi1Var == null || this.H == null) {
            return;
        }
        float a2 = 1.0f - w7.o.a(Math.abs(3.0f - bi1Var.getPositionAnimated()), 0.0f, 1.0f);
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
        Collections.sort(arrayList, new gf(23));
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.kh0 kh0Var = new org.telegram.ui.Components.kh0(this, getParentActivity(), z10);
                linearLayout.addView(kh0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.e(currentUser, j9Var);
                kh0Var.addView(y9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 13));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        H.u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
        H.W(c02);
        H.Z();
        org.telegram.ui.Components.a50.r.a();
    }

    public final ty l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        ty tyVar = new ty(bundle);
        this.J = tyVar;
        tyVar.I3 = new ch0(this);
        this.a.put(0, new ai1(tyVar));
        return this.J;
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.K;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e((i11 > 2 ? i11 + (-1) : i11) == i10, z10);
            i11++;
        }
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    public final void n0(float f7, boolean z10) {
        int i10 = 0;
        while (i10 < this.K.length) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f7));
            oh.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
            i10++;
        }
        this.F.invalidate();
    }

    @Override // org.telegram.ui.ci1, org.telegram.ui.ActionBar.n2
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
        this.O = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck).addGlobal(NotificationCenter.appUpdateAvailable).addGlobal(NotificationCenter.appUpdateLoading).addGlobal(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ci1, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.tc.h(this.b);
        NotificationCenter.ObserversGroup observersGroup = this.O;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ci1, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        ci.d4 d4Var = this.P;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ci1, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.Q) {
            return;
        }
        if (this.P == null && org.telegram.ui.Components.a50.r.c()) {
            AndroidUtilities.runOnUIThread(new bh0(this, 7), 1500L);
        }
        this.Q = true;
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

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
