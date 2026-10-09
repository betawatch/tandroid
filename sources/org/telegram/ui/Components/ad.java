package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ad {
    public final org.telegram.ui.ActionBar.n2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.e6 c;

    public ad(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null || n2Var.getLastStoryViewer() == null || !n2Var.getLastStoryViewer().attachedToParent()) {
            this.a = n2Var;
            this.b = null;
            this.c = n2Var != null ? n2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            ai.f6 currentPeerView = n2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.c1 : null;
            this.c = n2Var.getLastStoryViewer().y;
        }
    }

    public static tc A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        return z(n2Var, z10 ? 3 : 4, 0, e6Var);
    }

    public static tc B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, ai.d9 d9Var, org.telegram.ui.ve veVar, org.telegram.ui.ActionBar.e6 e6Var) {
        bc bcVar = new bc(n2Var.getParentActivity(), e6Var);
        bcVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        bcVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            rc rcVar = new rc(n2Var.getParentActivity(), e6Var, true);
            rcVar.a = d9Var;
            rcVar.b = veVar;
            bcVar.setButton(rcVar);
        }
        return tc.g(n2Var, bcVar, z10 ? 1500 : 5000);
    }

    public static tc C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        bcVar.d(R.raw.ic_admin, "Shield");
        bcVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return tc.g(n2Var, bcVar, 1500);
    }

    public static tc D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        bcVar.d(R.raw.ic_ban, "Hand");
        bcVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return tc.g(n2Var, bcVar, 1500);
    }

    public static tc F(FrameLayout frameLayout, boolean z10) {
        return new ad(frameLayout, null).m(z10 ? zc.h : zc.e, 1, -115203550, -1, null);
    }

    public static tc S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String string;
        bc bcVar = new bc(n2Var.getParentActivity(), e6Var);
        boolean z10 = true;
        if (i10 == 0) {
            string = LocaleController.getString(R.string.SoundOnHint);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException();
            }
            string = LocaleController.getString(R.string.SoundOffHint);
            z10 = false;
        }
        if (z10) {
            bcVar.d(R.raw.sound_on, new String[0]);
        } else {
            bcVar.d(R.raw.sound_off, new String[0]);
        }
        bcVar.b.setText(string);
        return tc.g(n2Var, bcVar, 1500);
    }

    public static ad X() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return new ad(ob.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.f3 ? new ad(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static ad Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ad(frameLayout, e6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.n2 n2Var) {
        return (n2Var == null || n2Var.getParentActivity() == null || n2Var.getLayoutContainer() == null) ? false : true;
    }

    public static ad a0(org.telegram.ui.ActionBar.n2 n2Var) {
        return n2Var == null ? X() : new ad(n2Var);
    }

    public static void b0(String str) {
        if (LaunchActivity.C1) {
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
        }
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        if (LaunchActivity.C1) {
            if (frameLayout == null) {
                b0(str);
                return;
            }
            tc t10 = new ad(frameLayout, e6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
            t10.r = false;
            t10.j();
        }
    }

    public static tc d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            bcVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            bcVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        bcVar.b.setText(AndroidUtilities.replaceTags(string));
        return tc.g(n2Var, bcVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static tc j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static tc l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        bcVar.b.setText(AndroidUtilities.replaceTags(string));
        bcVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return tc.g(n2Var, bcVar, 5000);
    }

    public static tc v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        bc bcVar;
        SpannableStringBuilder replaceTags;
        tc g10;
        int i15 = 1;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || n2Var == null || i10 > 1 || j3 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            bcVar = new bc(i12, i13, context, n2Var != null ? n2Var.getResourceProvider() : null);
        } else {
            bcVar = new ec(i11, n2Var);
        }
        bc bcVar2 = bcVar;
        boolean z11 = h0Var != null;
        ea eaVar = h0Var != null ? new ea(2, new boolean[]{false}, h0Var) : null;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            bcVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            int i16 = 25;
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new ai.f(27) : new ai.f(i16));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(i16));
            }
            bcVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            a3.h0 h0Var2 = new a3.h0(eaVar, n2Var, j3, 17);
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
                replaceTags = i11 <= 1 ? n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
                if (i11 <= 1) {
                    int i17 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                } else {
                    int i18 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                }
            }
            bcVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        bcVar2.b.setText(replaceTags);
        if (z11) {
            rc rcVar = new rc(bcVar2.getContext(), n2Var != null ? n2Var.getResourceProvider() : null, true, true);
            rcVar.a = null;
            rcVar.b = eaVar;
            bcVar2.setButton(rcVar);
        }
        bcVar2.postDelayed(new uc(bcVar2, i15), 300);
        if (frameLayout != null) {
            g10 = tc.f(frameLayout, bcVar2, i14);
        } else {
            if (n2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = tc.g(n2Var, bcVar2, i14);
        }
        if (bcVar2 instanceof ec) {
            bcVar2.b.setSingleLine(false);
            bcVar2.b.setMaxLines(2);
            ((ec) bcVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tc x(Activity activity, FrameLayout frameLayout, int i10, long j3, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        bc bcVar = new bc(i11, i12, activity, null);
        int i14 = 0;
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            bcVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                bcVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                bcVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    bcVar.postDelayed(new uc(bcVar, i14), i13);
                }
                return tc.f(frameLayout, bcVar, 1500);
            }
            if (DialogObject.isChatDialog(j3)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3)))));
            }
            bcVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = replaceTags;
        i13 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        bcVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return tc.f(frameLayout, bcVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tc z(org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        String formatString;
        boolean z10;
        bc bcVar = new bc(n2Var.getParentActivity(), e6Var);
        boolean z11 = true;
        if (i10 == 0) {
            formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        } else if (i10 == 1) {
            formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 8, new Object[0]));
        } else if (i10 == 2) {
            formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Days", 2, new Object[0]));
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    formatString = LocaleController.getString(R.string.NotificationsUnmutedHint);
                    z10 = false;
                    z11 = false;
                } else {
                    if (i10 != 5) {
                        throw new IllegalArgumentException();
                    }
                    formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                    z10 = true;
                }
                if (!z11) {
                    bcVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    bcVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    bcVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                bcVar.b.setText(formatString);
                return tc.g(n2Var, bcVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        bcVar.b.setText(formatString);
        return tc.g(n2Var, bcVar, 1500);
    }

    public final tc E(org.telegram.ui.ActionBar.e6 e6Var) {
        bc bcVar = new bc(W(), e6Var);
        bcVar.d(R.raw.chats_infotip, new String[0]);
        bcVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(bcVar, 1500);
    }

    public final tc G(int i10, int i11, CharSequence charSequence) {
        bc bcVar = new bc(W(), this.c);
        bcVar.c(i10, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i12 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i12 >= i11) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i12++;
            }
            charSequence = spannableStringBuilder;
        }
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(i11);
        bcVar.b.setText(charSequence);
        return b(bcVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final tc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final tc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        bc bcVar = new bc(W, e6Var);
        if (i10 != 0) {
            bcVar.c(i10, 36, 36, new String[0]);
        } else {
            bcVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) bcVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        bcVar.b.setTextSize(1, 14.0f);
        bcVar.b.setTextDirection(5);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(3);
        bcVar.b.setText(charSequence);
        rc rcVar = new rc(W(), e6Var, true, z10);
        rcVar.e(charSequence2);
        rcVar.a = runnable;
        bcVar.setButton(rcVar);
        return b(bcVar, i11);
    }

    public final tc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final tc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        qc qcVar = new qc(W, e6Var);
        qcVar.c(i10, 36, 36, new String[0]);
        qcVar.b.setText(str);
        qcVar.c.setText(charSequence);
        rc rcVar = new rc(W(), e6Var, true);
        rcVar.e(str2);
        rcVar.a = runnable;
        qcVar.setButton(rcVar);
        return b(qcVar, 5000);
    }

    public final tc L(Drawable drawable, CharSequence charSequence) {
        bc bcVar = new bc(W(), this.c);
        bcVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.vp0) {
            ((org.telegram.ui.vp0) drawable).e(bcVar.a);
        }
        bcVar.b.setText(charSequence);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(2);
        return b(bcVar, 2750);
    }

    public final tc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        qc qcVar = new qc(W(), this.c);
        qcVar.c(i10, 36, 36, new String[0]);
        qcVar.b.setText(charSequence);
        qcVar.c.setText(charSequence2);
        return b(qcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final tc N(String str, String str2) {
        qc qcVar = new qc(W(), this.c);
        qcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) qcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        qcVar.b.setText(str);
        qcVar.c.setText(str2);
        return b(qcVar, 5000);
    }

    public final tc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new sb();
        }
        pc pcVar = new pc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = pcVar.a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = pcVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = pcVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(pcVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final tc P(int i10, CharSequence charSequence) {
        bc bcVar = new bc(W(), this.c);
        bcVar.c(i10, 36, 36, new String[0]);
        bcVar.b.setText(charSequence);
        bcVar.b.setSingleLine(false);
        bcVar.b.setTextSize(1, 14.0f);
        bcVar.b.setMaxLines(4);
        return b(bcVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final tc Q(int i10, int i11, CharSequence charSequence) {
        bc bcVar = new bc(W(), this.c);
        bcVar.c(i10, i11, i11, new String[0]);
        bcVar.b.setText(charSequence);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(2);
        return b(bcVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final tc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new sb();
        }
        pc pcVar = new pc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = pcVar.a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = pcVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        pcVar.c.setVisibility(8);
        return b(pcVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final tc T(String str) {
        bc bcVar = new bc(W(), null);
        bcVar.d(R.raw.contact_check, new String[0]);
        bcVar.b.setText(str);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(2);
        return b(bcVar, 1500);
    }

    public final tc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        qb qbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (isEmpty) {
            bc bcVar = new bc(W(), e6Var);
            bcVar.b.setText(str);
            bcVar.b.setSingleLine(false);
            bcVar.b.setMaxLines(2);
            qbVar = bcVar;
        } else {
            qc qcVar = new qc(W(), e6Var);
            qcVar.b.setText(str);
            qcVar.c.setText((CharSequence) null);
            qbVar = qcVar;
        }
        qbVar.setTimer();
        rc rcVar = new rc(W(), e6Var, true, z10);
        rcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        rcVar.a = runnable;
        rcVar.b = runnable2;
        qbVar.setButton(rcVar);
        return b(qbVar, 5000);
    }

    public final tc V(List list, CharSequence charSequence, CharSequence charSequence2, n6.t tVar) {
        float f7;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        sc scVar = new sc(W, e6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    scVar.a.setCount(i13);
                    scVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                scVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                scVar.a.setScaleX(1.2f);
                scVar.a.setScaleY(1.2f);
            } else {
                scVar.a.setScaleX(1.0f);
                scVar.a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        scVar.a.a(false);
        if (charSequence2 != null) {
            scVar.b.setSingleLine(true);
            scVar.b.setMaxLines(1);
            scVar.b.setText(charSequence);
            scVar.c.setText(charSequence2);
            scVar.c.setSingleLine(false);
            scVar.c.setMaxLines(3);
            if (scVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) scVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) scVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            scVar.b.setSingleLine(false);
            scVar.b.setMaxLines(4);
            scVar.b.setText(charSequence);
            if (scVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    scVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) scVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) scVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (tVar != null) {
            rc rcVar = new rc(W(), e6Var, true);
            rcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            rcVar.a = (Runnable) tVar.b;
            rcVar.b = (Runnable) tVar.c;
            scVar.setButton(rcVar);
        }
        return b(scVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var != null) {
            context = n2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public final tc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.C1 ? new sb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final tc b(qb qbVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        return n2Var != null ? tc.g(n2Var, qbVar, i10) : tc.f(this.b, qbVar, i10);
    }

    public final tc c(CharSequence charSequence) {
        if (W() == null) {
            return new sb();
        }
        bc bcVar = new bc(W(), this.c);
        bcVar.d(R.raw.ic_admin, "Shield");
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(3);
        bcVar.b.setText(charSequence);
        return b(bcVar, 2750);
    }

    public final tc e(boolean z10) {
        String string;
        bc bcVar = new bc(W(), this.c);
        if (z10) {
            bcVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            bcVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        bcVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(bcVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (LaunchActivity.C1) {
            if (TextUtils.isEmpty(str)) {
                tc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                tc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final tc f(int i10, Runnable runnable) {
        bc bcVar = new bc(W(), null);
        bcVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new xc(0, runnable), indexOf, indexOf2 - 1, 33);
        bcVar.b.setText(valueOf);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(3);
        return b(bcVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                tc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                tc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final tc g(String str, ArrayList arrayList) {
        sc scVar = new sc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                scVar.a.setCount(i12);
                scVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            scVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            scVar.a.setScaleX(1.2f);
            scVar.a.setScaleY(1.2f);
        } else {
            scVar.a.setScaleX(1.0f);
            scVar.a.setScaleY(1.0f);
        }
        scVar.a.a(false);
        scVar.b.setSingleLine(false);
        scVar.b.setMaxLines(2);
        scVar.b.setText(str);
        if (scVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) scVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) scVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            scVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(scVar, 5000);
    }

    public final boolean g0(int i10, long j3) {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.a) != null) {
            ec ecVar = new ec(i10, n2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ai.f(25)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(25));
                ecVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                ecVar.b.setText(replaceSingleTag);
                ecVar.b.setSingleLine(false);
                ecVar.b.setMaxLines(2);
                tc b10 = b(ecVar, 3500);
                ecVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final tc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        ja0 ja0Var;
        TLRPC.InputStickerSet inputStickerSet;
        int i11;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet inputStickerSet2 = MessageObject.getInputStickerSet(document);
        if (inputStickerSet2 == null) {
            return null;
        }
        final int i12 = 1;
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet2, true);
        final int i13 = 0;
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.vc
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            callback.run(inputStickerSet2);
                            break;
                        default:
                            callback.run(inputStickerSet2);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i10 == 1 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>"))) : i10 == 2 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>"))) : new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (indexOf >= 0) {
            ja0Var = new ja0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), e6Var);
            spannableStringBuilder.setSpan(ja0Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.i6.Hi;
            ja0Var.a(i0.a.k(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), 32), i0.a.k(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), 72));
        } else {
            ja0Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.vc
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        callback.run(inputStickerSet2);
                        break;
                    default:
                        callback.run(inputStickerSet2);
                        break;
                }
            }
        };
        Context W = W();
        zb zbVar = new zb(W, e6Var);
        ea0 ea0Var = new ea0(W, null);
        zbVar.d = ea0Var;
        ea0Var.setDisablePaddingsOffset(true);
        ea0Var.setSingleLine();
        ea0Var.setTypeface(Typeface.SANS_SERIF);
        ea0Var.setTextSize(1, 15.0f);
        ea0Var.setEllipsize(TextUtils.TruncateAt.END);
        ea0Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        zbVar.b.setVisibility(8);
        zbVar.addView(ea0Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.i6.Hi;
        zbVar.setTextColor(zbVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            zbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        zbVar.e(document, new String[i11]);
        zbVar.b.setTextSize(1, 14.0f);
        zbVar.b.setSingleLine(i11);
        zbVar.b.setMaxLines(3);
        ea0Var.setText(spannableStringBuilder);
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setSingleLine(i11);
        ea0Var.setMaxLines(3);
        rc rcVar = new rc(W(), e6Var, true);
        rcVar.e(string);
        rcVar.a = runnable;
        zbVar.setButton(rcVar);
        tc b10 = b(zbVar, 2750);
        if (ja0Var != null) {
            xb xbVar = b10.e;
            if (xbVar instanceof zb) {
                ja0Var.b = ((zb) xbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new wc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final tc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new sb();
        }
        bc bcVar = new bc(W(), null);
        bcVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        bcVar.b.setText(str);
        return b(bcVar, 1500);
    }

    public final tc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new sb();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (!z10) {
            bc bcVar = new bc(W(), e6Var);
            bcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            bcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(bcVar, 1500);
        }
        qc qcVar = new qc(W(), e6Var);
        qcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        qcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        qcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(qcVar, 2750);
    }

    public final tc m(zc zcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.e6 e6Var) {
        bc bcVar = (i11 == 0 || i12 == 0) ? new bc(W(), e6Var) : new bc(i11, i12, W(), e6Var);
        yc ycVar = zcVar.d;
        bcVar.d(ycVar.a, ycVar.b);
        TextView textView = bcVar.b;
        String str = zcVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(zcVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, zcVar.b), new ai.f(26)));
        int i13 = zcVar.d.c;
        if (i13 != 0) {
            bcVar.setIconPaddingBottom(i13);
        }
        return b(bcVar, 1500);
    }

    public final tc n(zc zcVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(zcVar, i10, 0, 0, e6Var);
    }

    public final tc o(zc zcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(zcVar, 1, 0, 0, e6Var);
    }

    public final tc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        oc ocVar = new oc(W, e6Var);
        s5 s5Var = new s5(1, UserConfig.selectedAccount, j3);
        y9 y9Var = ocVar.a;
        y9Var.setAnimatedEmojiDrawable(s5Var);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        ocVar.b.setText(str);
        ocVar.c.setText(str2);
        return b(ocVar, 2750);
    }

    public final tc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        bc bcVar = new bc(W, e6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            bcVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        bcVar.e(document, new String[0]);
        if (bcVar.a.getImageReceiver() != null) {
            bcVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        bcVar.b.setText(charSequence);
        bcVar.b.setTextSize(1, 14.0f);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(3);
        rc rcVar = new rc(W(), e6Var, true);
        rcVar.e(str);
        rcVar.a = runnable;
        bcVar.setButton(rcVar);
        return b(bcVar, 2750);
    }

    public final tc r(TLRPC.Document document, String str) {
        bc bcVar = new bc(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            bcVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        bcVar.e(document, new String[0]);
        bcVar.b.setText(str);
        bcVar.b.setTextSize(1, 14.0f);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(3);
        return b(bcVar, 2750);
    }

    public final tc s(TLRPC.Document document, String str, CharSequence charSequence) {
        qc qcVar = new qc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        fk0 fk0Var = qcVar.a;
        if (isTextColorEmoji) {
            fk0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        fk0Var.setAutoRepeat(true);
        fk0Var.g(36, 36, document);
        qcVar.b.setText(str);
        qcVar.c.setText(charSequence);
        return b(qcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final tc t(CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        bc bcVar = new bc(W(), e6Var);
        bcVar.d(R.raw.chats_infotip, new String[0]);
        bcVar.b.setText(charSequence);
        bcVar.b.setSingleLine(false);
        bcVar.b.setMaxLines(2);
        return b(bcVar, 1500);
    }

    public final tc u(String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        qc qcVar = new qc(W(), e6Var);
        qcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        qcVar.b.setText(str);
        qcVar.c.setText(str2);
        return b(qcVar, 1500);
    }

    public final tc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        bc bcVar = new bc(W, e6Var);
        bcVar.setBackground(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Fi, e6Var), 12);
        bcVar.a.setImageResource(i10);
        bcVar.b.setText(charSequence);
        bcVar.b.setSingleLine(false);
        bcVar.b.setLines(2);
        bcVar.b.setMaxLines(4);
        TextView textView = bcVar.b;
        textView.setMaxWidth(ci.d4.a(textView.getText(), bcVar.b.getPaint()));
        bcVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) bcVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        bcVar.setWrapWidth();
        return b(bcVar, 5000);
    }

    public final tc y(int i10, TLRPC.Document document, gg.n nVar) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        bc bcVar = new bc(W, e6Var);
        bcVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        bcVar.removeView(bcVar.b);
        a6 a6Var = new a6(bcVar.getContext());
        bcVar.b = a6Var;
        a6Var.setTypeface(Typeface.SANS_SERIF);
        bcVar.b.setTextSize(1, 15.0f);
        bcVar.b.setEllipsize(TextUtils.TruncateAt.END);
        bcVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new b6(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        bcVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            rc rcVar = new rc(W(), e6Var, true);
            rcVar.e(LocaleController.getString(R.string.ViewAction));
            rcVar.a = nVar;
            bcVar.setButton(rcVar);
        }
        bcVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Hi, e6Var));
        bcVar.addView(bcVar.b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(bcVar, 2750);
    }

    public ad(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = e6Var;
    }
}
