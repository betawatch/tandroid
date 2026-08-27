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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mc {
    public final org.telegram.ui.ActionBar.n2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.c6 c;

    public mc(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null || n2Var.getLastStoryViewer() == null || !n2Var.getLastStoryViewer().attachedToParent()) {
            this.a = n2Var;
            this.b = null;
            this.c = n2Var != null ? n2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            jh.e4 currentPeerView = n2Var.getLastStoryViewer().j0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.Y0 : null;
            this.c = n2Var.getLastStoryViewer().y;
        }
    }

    public static ec A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        return z(n2Var, z10 ? 3 : 4, 0, c6Var);
    }

    public static ec B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, ag.k0 k0Var, org.telegram.ui.me meVar, org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = new mb(n2Var.getParentActivity(), c6Var);
        mbVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        mbVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            cc ccVar = new cc(n2Var.getParentActivity(), c6Var, true);
            ccVar.a = k0Var;
            ccVar.b = meVar;
            mbVar.setButton(ccVar);
        }
        return ec.g(n2Var, mbVar, z10 ? 1500 : 5000);
    }

    public static ec C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        mbVar.d(R.raw.ic_admin, "Shield");
        mbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return ec.g(n2Var, mbVar, 1500);
    }

    public static ec D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        mbVar.d(R.raw.ic_ban, "Hand");
        mbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return ec.g(n2Var, mbVar, 1500);
    }

    public static ec F(FrameLayout frameLayout, boolean z10) {
        return new mc(frameLayout, null).m(z10 ? lc.h : lc.e, 1, -115203550, -1, null);
    }

    public static ec S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        mb mbVar = new mb(n2Var.getParentActivity(), c6Var);
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
            mbVar.d(R.raw.sound_on, new String[0]);
        } else {
            mbVar.d(R.raw.sound_off, new String[0]);
        }
        mbVar.b.setText(string);
        return ec.g(n2Var, mbVar, 1500);
    }

    public static mc X() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return new mc(ab.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.e3 ? new mc(((org.telegram.ui.ActionBar.e3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static mc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        return new mc(frameLayout, c6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.n2 n2Var) {
        return (n2Var == null || n2Var.getParentActivity() == null || n2Var.getLayoutContainer() == null) ? false : true;
    }

    public static mc a0(org.telegram.ui.ActionBar.n2 n2Var) {
        return n2Var == null ? X() : new mc(n2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.y1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static ec d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            mbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            mbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        mbVar.b.setText(AndroidUtilities.replaceTags(string));
        return ec.g(n2Var, mbVar, 1500);
    }

    public static ec j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static ec l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        mbVar.b.setText(AndroidUtilities.replaceTags(string));
        mbVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return ec.g(n2Var, mbVar, 5000);
    }

    public static ec v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, e5.u uVar) {
        mb mbVar;
        SpannableStringBuilder replaceTags;
        ec g10;
        int i15 = 1;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || n2Var == null || i10 > 1 || j10 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            mbVar = new mb(i12, i13, context, n2Var != null ? n2Var.getResourceProvider() : null);
        } else {
            mbVar = new pb(i11, n2Var);
        }
        mb mbVar2 = mbVar;
        boolean z11 = uVar != null;
        org.telegram.ui.yq yqVar = uVar != null ? new org.telegram.ui.yq(6, new boolean[]{false}, uVar) : null;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            mbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            int i16 = 29;
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new gc(i15) : new ag.l3(i16));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ag.l3(i16));
            }
            mbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            e5.u uVar2 = new e5.u(yqVar, n2Var, j10, 20);
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                replaceTags = i11 <= 1 ? n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                if (i11 <= 1) {
                    int i17 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                } else {
                    int i18 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                }
            }
            mbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        mbVar2.b.setText(replaceTags);
        if (z11) {
            cc ccVar = new cc(mbVar2.getContext(), n2Var != null ? n2Var.getResourceProvider() : null, true, true);
            ccVar.a = null;
            ccVar.b = yqVar;
            mbVar2.setButton(ccVar);
        }
        mbVar2.postDelayed(new fc(mbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = ec.f(frameLayout, mbVar2, i14);
        } else {
            if (n2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = ec.g(n2Var, mbVar2, i14);
        }
        if (mbVar2 instanceof pb) {
            mbVar2.b.setSingleLine(false);
            mbVar2.b.setMaxLines(2);
            ((pb) mbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ec x(Activity activity, FrameLayout frameLayout, int i10, long j10, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        mb mbVar = new mb(i11, i12, activity, null);
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            mbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                mbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                mbVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    mbVar.postDelayed(new fc(mbVar, 0), i13);
                }
                return ec.f(frameLayout, mbVar, 1500);
            }
            if (DialogObject.isChatDialog(j10)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
            }
            mbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        spannableStringBuilder = replaceTags;
        i13 = 300;
        mbVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return ec.f(frameLayout, mbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ec z(org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        String formatString;
        boolean z10;
        mb mbVar = new mb(n2Var.getParentActivity(), c6Var);
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
                    if (z11) {
                    }
                    mbVar.b.setText(formatString);
                    return ec.g(n2Var, mbVar, 1500);
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException();
                }
                formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                z10 = true;
                if (z11) {
                    mbVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    mbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    mbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                mbVar.b.setText(formatString);
                return ec.g(n2Var, mbVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (z11) {
        }
        mbVar.b.setText(formatString);
        return ec.g(n2Var, mbVar, 1500);
    }

    public final ec E(org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = new mb(W(), c6Var);
        mbVar.d(R.raw.chats_infotip, new String[0]);
        mbVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(mbVar, 1500);
    }

    public final ec G(int i10, int i11, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.c);
        mbVar.c(i10, 36, 36, new String[0]);
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
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(i11);
        mbVar.b.setText(charSequence);
        return b(mbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final ec I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        mb mbVar = new mb(W, c6Var);
        if (i10 != 0) {
            mbVar.c(i10, 36, 36, new String[0]);
        } else {
            mbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) mbVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        mbVar.b.setTextSize(1, 14.0f);
        mbVar.b.setTextDirection(5);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(3);
        mbVar.b.setText(charSequence);
        cc ccVar = new cc(W(), c6Var, true, z10);
        ccVar.e(charSequence2);
        ccVar.a = runnable;
        mbVar.setButton(ccVar);
        return b(mbVar, i11);
    }

    public final ec J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final ec K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        bc bcVar = new bc(W, c6Var);
        bcVar.c(i10, 36, 36, new String[0]);
        bcVar.b.setText(str);
        bcVar.c.setText(charSequence);
        cc ccVar = new cc(W(), c6Var, true);
        ccVar.e(str2);
        ccVar.a = runnable;
        bcVar.setButton(ccVar);
        return b(bcVar, 5000);
    }

    public final ec L(Drawable drawable, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.c);
        mbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.wo0) {
            ((org.telegram.ui.wo0) drawable).e(mbVar.a);
        }
        mbVar.b.setText(charSequence);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(2);
        return b(mbVar, 2750);
    }

    public final ec M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        bc bcVar = new bc(W(), this.c);
        bcVar.c(i10, 36, 36, new String[0]);
        bcVar.b.setText(charSequence);
        bcVar.c.setText(charSequence2);
        return b(bcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec N(String str, String str2) {
        bc bcVar = new bc(W(), this.c);
        bcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) bcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        bcVar.b.setText(str);
        bcVar.c.setText(str2);
        return b(bcVar, 5000);
    }

    public final ec O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new eb();
        }
        ac acVar = new ac(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        n9 n9Var = acVar.a;
        n9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = acVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = acVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(acVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final ec P(int i10, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.c);
        mbVar.c(i10, 36, 36, new String[0]);
        mbVar.b.setText(charSequence);
        mbVar.b.setSingleLine(false);
        mbVar.b.setTextSize(1, 14.0f);
        mbVar.b.setMaxLines(4);
        return b(mbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec Q(int i10, int i11, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.c);
        mbVar.c(i10, i11, i11, new String[0]);
        mbVar.b.setText(charSequence);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(2);
        return b(mbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new eb();
        }
        ac acVar = new ac(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        n9 n9Var = acVar.a;
        n9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = acVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        acVar.c.setVisibility(8);
        return b(acVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final ec T(String str) {
        mb mbVar = new mb(W(), null);
        mbVar.d(R.raw.contact_check, new String[0]);
        mbVar.b.setText(str);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(2);
        return b(mbVar, 1500);
    }

    public final ec U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        cb cbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        if (isEmpty) {
            mb mbVar = new mb(W(), c6Var);
            mbVar.b.setText(str);
            mbVar.b.setSingleLine(false);
            mbVar.b.setMaxLines(2);
            cbVar = mbVar;
        } else {
            bc bcVar = new bc(W(), c6Var);
            bcVar.b.setText(str);
            bcVar.c.setText((CharSequence) null);
            cbVar = bcVar;
        }
        cbVar.setTimer();
        cc ccVar = new cc(W(), c6Var, true, z10);
        ccVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ccVar.a = runnable;
        ccVar.b = runnable2;
        cbVar.setButton(ccVar);
        return b(cbVar, 5000);
    }

    public final ec V(List list, CharSequence charSequence, CharSequence charSequence2, org.telegram.ui.i6 i6Var) {
        float f10;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        dc dcVar = new dc(W, c6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    dcVar.a.setCount(i13);
                    dcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                dcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                dcVar.a.setScaleX(1.2f);
                dcVar.a.setScaleY(1.2f);
            } else {
                dcVar.a.setScaleX(1.0f);
                dcVar.a.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i10 = 0;
        }
        dcVar.a.a(false);
        if (charSequence2 != null) {
            dcVar.b.setSingleLine(true);
            dcVar.b.setMaxLines(1);
            dcVar.b.setText(charSequence);
            dcVar.c.setText(charSequence2);
            dcVar.c.setSingleLine(false);
            dcVar.c.setMaxLines(3);
            if (dcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            dcVar.b.setSingleLine(false);
            dcVar.b.setMaxLines(4);
            dcVar.b.setText(charSequence);
            if (dcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dcVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) dcVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) dcVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (i6Var != null) {
            cc ccVar = new cc(W(), c6Var, true);
            ccVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ccVar.a = (Runnable) i6Var.b;
            ccVar.b = (Runnable) i6Var.c;
            dcVar.setButton(ccVar);
        }
        return b(dcVar, 5000);
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

    public final ec Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.y1 ? new eb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final ec b(cb cbVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        return n2Var != null ? ec.g(n2Var, cbVar, i10) : ec.f(this.b, cbVar, i10);
    }

    public final ec c(CharSequence charSequence) {
        if (W() == null) {
            return new eb();
        }
        mb mbVar = new mb(W(), this.c);
        mbVar.d(R.raw.ic_admin, "Shield");
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(3);
        mbVar.b.setText(charSequence);
        return b(mbVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (LaunchActivity.y1) {
            if (TextUtils.isEmpty(str)) {
                ec t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                ec t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.y1) {
            if (tL_error == null) {
                ec t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                ec t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final ec e(boolean z10) {
        String string;
        mb mbVar = new mb(W(), this.c);
        if (z10) {
            mbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            mbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        mbVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(mbVar, 1500);
    }

    public final boolean e0(int i10, long j10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.a) != null) {
            pb pbVar = new pb(i10, n2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ag.l3(29)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ag.l3(29));
                pbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                pbVar.b.setText(replaceSingleTag);
                pbVar.b.setSingleLine(false);
                pbVar.b.setMaxLines(2);
                ec b10 = b(pbVar, 3500);
                pbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final ec f(int i10, Runnable runnable) {
        mb mbVar = new mb(W(), null);
        mbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new jc(0, runnable), indexOf, indexOf2 - 1, 33);
        mbVar.b.setText(valueOf);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(3);
        return b(mbVar, 5000);
    }

    public final ec g(String str, ArrayList arrayList) {
        dc dcVar = new dc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                dcVar.a.setCount(i12);
                dcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            dcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            dcVar.a.setScaleX(1.2f);
            dcVar.a.setScaleY(1.2f);
        } else {
            dcVar.a.setScaleX(1.0f);
            dcVar.a.setScaleY(1.0f);
        }
        dcVar.a.a(false);
        dcVar.b.setSingleLine(false);
        dcVar.b.setMaxLines(2);
        dcVar.b.setText(str);
        if (dcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) dcVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) dcVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            dcVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(dcVar, 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final ec h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        u80 u80Var;
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
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.hc
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
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        if (indexOf >= 0) {
            u80Var = new u80(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), c6Var);
            spannableStringBuilder.setSpan(u80Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.g6.Hi;
            u80Var.a(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 32), i0.b.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 72));
        } else {
            u80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.hc
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
        lb lbVar = new lb(W, c6Var);
        p80 p80Var = new p80(W, null);
        lbVar.d = p80Var;
        p80Var.setDisablePaddingsOffset(true);
        p80Var.setSingleLine();
        p80Var.setTypeface(Typeface.SANS_SERIF);
        p80Var.setTextSize(1, 15.0f);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        p80Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        lbVar.b.setVisibility(8);
        lbVar.addView(p80Var, h7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.g6.Hi;
        lbVar.setTextColor(lbVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            lbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        lbVar.e(document, new String[i11]);
        lbVar.b.setTextSize(1, 14.0f);
        lbVar.b.setSingleLine(i11);
        lbVar.b.setMaxLines(3);
        p80Var.setText(spannableStringBuilder);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(i11);
        p80Var.setMaxLines(3);
        cc ccVar = new cc(W(), c6Var, true);
        ccVar.e(string);
        ccVar.a = runnable;
        lbVar.setButton(ccVar);
        ec b10 = b(lbVar, 2750);
        if (u80Var != null) {
            jb jbVar = b10.e;
            if (jbVar instanceof lb) {
                u80Var.b = ((lb) jbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new ic(i10, b10, currentTimeMillis));
        return b10;
    }

    public final ec i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new eb();
        }
        mb mbVar = new mb(W(), null);
        mbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        mbVar.b.setText(str);
        return b(mbVar, 1500);
    }

    public final ec k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new eb();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        if (!z10) {
            mb mbVar = new mb(W(), c6Var);
            mbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            mbVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(mbVar, 1500);
        }
        bc bcVar = new bc(W(), c6Var);
        bcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        bcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        bcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(bcVar, 2750);
    }

    public final ec m(lc lcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = (i11 == 0 || i12 == 0) ? new mb(W(), c6Var) : new mb(i11, i12, W(), c6Var);
        kc kcVar = lcVar.d;
        mbVar.d(kcVar.a, kcVar.b);
        TextView textView = mbVar.b;
        String str = lcVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(lcVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, lcVar.b), new gc(0)));
        int i13 = lcVar.d.c;
        if (i13 != 0) {
            mbVar.setIconPaddingBottom(i13);
        }
        return b(mbVar, 1500);
    }

    public final ec n(lc lcVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(lcVar, i10, 0, 0, c6Var);
    }

    public final ec o(lc lcVar, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(lcVar, 1, 0, 0, c6Var);
    }

    public final ec p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        zb zbVar = new zb(W, c6Var);
        k5 k5Var = new k5(1, UserConfig.selectedAccount, j10);
        n9 n9Var = zbVar.a;
        n9Var.setAnimatedEmojiDrawable(k5Var);
        n9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        zbVar.b.setText(str);
        zbVar.c.setText(str2);
        return b(zbVar, 2750);
    }

    public final ec q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        mb mbVar = new mb(W, c6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            mbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        mbVar.e(document, new String[0]);
        if (mbVar.a.getImageReceiver() != null) {
            mbVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        mbVar.b.setText(charSequence);
        mbVar.b.setTextSize(1, 14.0f);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(3);
        cc ccVar = new cc(W(), c6Var, true);
        ccVar.e(str);
        ccVar.a = runnable;
        mbVar.setButton(ccVar);
        return b(mbVar, 2750);
    }

    public final ec r(TLRPC.Document document, String str) {
        mb mbVar = new mb(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            mbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        mbVar.e(document, new String[0]);
        mbVar.b.setText(str);
        mbVar.b.setTextSize(1, 14.0f);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(3);
        return b(mbVar, 2750);
    }

    public final ec s(TLRPC.Document document, String str, CharSequence charSequence) {
        bc bcVar = new bc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ri0 ri0Var = bcVar.a;
        if (isTextColorEmoji) {
            ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ri0Var.setAutoRepeat(true);
        ri0Var.g(36, 36, document);
        bcVar.b.setText(str);
        bcVar.c.setText(charSequence);
        return b(bcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final ec t(CharSequence charSequence, org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = new mb(W(), c6Var);
        mbVar.d(R.raw.chats_infotip, new String[0]);
        mbVar.b.setText(charSequence);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(2);
        return b(mbVar, 1500);
    }

    public final ec u(String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        bc bcVar = new bc(W(), c6Var);
        bcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        bcVar.b.setText(str);
        bcVar.c.setText(str2);
        return b(bcVar, 1500);
    }

    public final ec w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        mb mbVar = new mb(W, c6Var);
        mbVar.setBackground(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var), 12);
        mbVar.a.setImageResource(i10);
        mbVar.b.setText(charSequence);
        mbVar.b.setSingleLine(false);
        mbVar.b.setLines(2);
        mbVar.b.setMaxLines(4);
        TextView textView = mbVar.b;
        textView.setMaxWidth(lh.w3.a(textView.getText(), mbVar.b.getPaint()));
        mbVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) mbVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        mbVar.setWrapWidth();
        return b(mbVar, 5000);
    }

    public final ec y(int i10, TLRPC.Document document, h3.z zVar) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        mb mbVar = new mb(W, c6Var);
        mbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        mbVar.removeView(mbVar.b);
        s5 s5Var = new s5(mbVar.getContext());
        mbVar.b = s5Var;
        s5Var.setTypeface(Typeface.SANS_SERIF);
        mbVar.b.setTextSize(1, 15.0f);
        mbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        mbVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new t5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        mbVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (zVar != null) {
            cc ccVar = new cc(W(), c6Var, true);
            ccVar.e(LocaleController.getString(R.string.ViewAction));
            ccVar.a = zVar;
            mbVar.setButton(ccVar);
        }
        mbVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        mbVar.addView(mbVar.b, h7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(mbVar, 2750);
    }

    public mc(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = c6Var;
    }
}
