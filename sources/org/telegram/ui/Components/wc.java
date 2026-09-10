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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wc {
    public final org.telegram.ui.ActionBar.p2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.f6 c;

    public wc(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == null || p2Var.getLastStoryViewer() == null || !p2Var.getLastStoryViewer().attachedToParent()) {
            this.a = p2Var;
            this.b = null;
            this.c = p2Var != null ? p2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            zh.a3 currentPeerView = p2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.c1 : null;
            this.c = p2Var.getLastStoryViewer().y;
        }
    }

    public static pc A(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        return z(p2Var, z10 ? 3 : 4, 0, f6Var);
    }

    public static pc B(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, di.q qVar, org.telegram.ui.ve veVar, org.telegram.ui.ActionBar.f6 f6Var) {
        xb xbVar = new xb(p2Var.getParentActivity(), f6Var);
        xbVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        xbVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            nc ncVar = new nc(p2Var.getParentActivity(), f6Var, true);
            ncVar.a = qVar;
            ncVar.b = veVar;
            xbVar.setButton(ncVar);
        }
        return pc.g(p2Var, xbVar, z10 ? 1500 : 5000);
    }

    public static pc C(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        xbVar.d(R.raw.ic_admin, "Shield");
        xbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return pc.g(p2Var, xbVar, 1500);
    }

    public static pc D(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        xbVar.d(R.raw.ic_ban, "Hand");
        xbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return pc.g(p2Var, xbVar, 1500);
    }

    public static pc F(FrameLayout frameLayout, boolean z10) {
        return new wc(frameLayout, null).m(z10 ? vc.h : vc.e, 1, -115203550, -1, null);
    }

    public static pc S(int i10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String string;
        xb xbVar = new xb(p2Var.getParentActivity(), f6Var);
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
            xbVar.d(R.raw.sound_on, new String[0]);
        } else {
            xbVar.d(R.raw.sound_off, new String[0]);
        }
        xbVar.b.setText(string);
        return pc.g(p2Var, xbVar, 1500);
    }

    public static wc X() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return new wc(kb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.h3 ? new wc(((org.telegram.ui.ActionBar.h3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static wc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        return new wc(frameLayout, f6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.p2 p2Var) {
        return (p2Var == null || p2Var.getParentActivity() == null || p2Var.getLayoutContainer() == null) ? false : true;
    }

    public static wc a0(org.telegram.ui.ActionBar.p2 p2Var) {
        return p2Var == null ? X() : new wc(p2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static pc d(org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        String string;
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        if (z10) {
            xbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            xbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        xbVar.b.setText(AndroidUtilities.replaceTags(string));
        return pc.g(p2Var, xbVar, 1500);
    }

    public static pc j(org.telegram.ui.ActionBar.p2 p2Var) {
        return a0(p2Var).k(false);
    }

    public static pc l(String str, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        String string;
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        xbVar.b.setText(AndroidUtilities.replaceTags(string));
        xbVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return pc.g(p2Var, xbVar, 5000);
    }

    public static pc v(Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        xb xbVar;
        SpannableStringBuilder replaceTags;
        pc g10;
        int i15 = 1;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || p2Var == null || i10 > 1 || j3 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            xbVar = new xb(i12, i13, context, p2Var != null ? p2Var.getResourceProvider() : null);
        } else {
            xbVar = new ac(i11, p2Var);
        }
        xb xbVar2 = xbVar;
        boolean z11 = h0Var != null;
        org.telegram.ui.qh qhVar = h0Var != null ? new org.telegram.ui.qh(27, new boolean[]{false}, h0Var) : null;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            xbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            int i16 = 20;
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new bi.f0(22) : new bi.f0(i16));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new bi.f0(i16));
            }
            xbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            a3.h0 h0Var2 = new a3.h0(qhVar, p2Var, j3, 11);
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
                replaceTags = i11 <= 1 ? p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
                if (i11 <= 1) {
                    int i17 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                } else {
                    int i18 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                }
            }
            xbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        xbVar2.b.setText(replaceTags);
        if (z11) {
            nc ncVar = new nc(xbVar2.getContext(), p2Var != null ? p2Var.getResourceProvider() : null, true, true);
            ncVar.a = null;
            ncVar.b = qhVar;
            xbVar2.setButton(ncVar);
        }
        xbVar2.postDelayed(new qc(xbVar2, i15), 300);
        if (frameLayout != null) {
            g10 = pc.f(frameLayout, xbVar2, i14);
        } else {
            if (p2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = pc.g(p2Var, xbVar2, i14);
        }
        if (xbVar2 instanceof ac) {
            xbVar2.b.setSingleLine(false);
            xbVar2.b.setMaxLines(2);
            ((ac) xbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pc x(Activity activity, FrameLayout frameLayout, int i10, long j3, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        xb xbVar = new xb(i11, i12, activity, null);
        int i14 = 0;
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            xbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                xbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                xbVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    xbVar.postDelayed(new qc(xbVar, i14), i13);
                }
                return pc.f(frameLayout, xbVar, 1500);
            }
            if (DialogObject.isChatDialog(j3)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3)))));
            }
            xbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        spannableStringBuilder = replaceTags;
        i13 = 300;
        xbVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return pc.f(frameLayout, xbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pc z(org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        String formatString;
        boolean z10;
        xb xbVar = new xb(p2Var.getParentActivity(), f6Var);
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
                    xbVar.b.setText(formatString);
                    return pc.g(p2Var, xbVar, 1500);
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException();
                }
                formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                z10 = true;
                if (z11) {
                    xbVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    xbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    xbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                xbVar.b.setText(formatString);
                return pc.g(p2Var, xbVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (z11) {
        }
        xbVar.b.setText(formatString);
        return pc.g(p2Var, xbVar, 1500);
    }

    public final pc E(org.telegram.ui.ActionBar.f6 f6Var) {
        xb xbVar = new xb(W(), f6Var);
        xbVar.d(R.raw.chats_infotip, new String[0]);
        xbVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(xbVar, 1500);
    }

    public final pc G(int i10, int i11, CharSequence charSequence) {
        xb xbVar = new xb(W(), this.c);
        xbVar.c(i10, 36, 36, new String[0]);
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
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(i11);
        xbVar.b.setText(charSequence);
        return b(xbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final pc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final pc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        xb xbVar = new xb(W, f6Var);
        if (i10 != 0) {
            xbVar.c(i10, 36, 36, new String[0]);
        } else {
            xbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) xbVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        xbVar.b.setTextSize(1, 14.0f);
        xbVar.b.setTextDirection(5);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(3);
        xbVar.b.setText(charSequence);
        nc ncVar = new nc(W(), f6Var, true, z10);
        ncVar.e(charSequence2);
        ncVar.a = runnable;
        xbVar.setButton(ncVar);
        return b(xbVar, i11);
    }

    public final pc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final pc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        mc mcVar = new mc(W, f6Var);
        mcVar.c(i10, 36, 36, new String[0]);
        mcVar.b.setText(str);
        mcVar.c.setText(charSequence);
        nc ncVar = new nc(W(), f6Var, true);
        ncVar.e(str2);
        ncVar.a = runnable;
        mcVar.setButton(ncVar);
        return b(mcVar, 5000);
    }

    public final pc L(Drawable drawable, CharSequence charSequence) {
        xb xbVar = new xb(W(), this.c);
        xbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.vp0) {
            ((org.telegram.ui.vp0) drawable).e(xbVar.a);
        }
        xbVar.b.setText(charSequence);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(2);
        return b(xbVar, 2750);
    }

    public final pc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        mc mcVar = new mc(W(), this.c);
        mcVar.c(i10, 36, 36, new String[0]);
        mcVar.b.setText(charSequence);
        mcVar.c.setText(charSequence2);
        return b(mcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final pc N(String str, String str2) {
        mc mcVar = new mc(W(), this.c);
        mcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) mcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        mcVar.b.setText(str);
        mcVar.c.setText(str2);
        return b(mcVar, 5000);
    }

    public final pc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new ob();
        }
        lc lcVar = new lc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        w9 w9Var = lcVar.a;
        w9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = lcVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = lcVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(lcVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final pc P(int i10, CharSequence charSequence) {
        xb xbVar = new xb(W(), this.c);
        xbVar.c(i10, 36, 36, new String[0]);
        xbVar.b.setText(charSequence);
        xbVar.b.setSingleLine(false);
        xbVar.b.setTextSize(1, 14.0f);
        xbVar.b.setMaxLines(4);
        return b(xbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final pc Q(int i10, int i11, CharSequence charSequence) {
        xb xbVar = new xb(W(), this.c);
        xbVar.c(i10, i11, i11, new String[0]);
        xbVar.b.setText(charSequence);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(2);
        return b(xbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final pc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new ob();
        }
        lc lcVar = new lc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        w9 w9Var = lcVar.a;
        w9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = lcVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        lcVar.c.setVisibility(8);
        return b(lcVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final pc T(String str) {
        xb xbVar = new xb(W(), null);
        xbVar.d(R.raw.contact_check, new String[0]);
        xbVar.b.setText(str);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(2);
        return b(xbVar, 1500);
    }

    public final pc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        mb mbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (isEmpty) {
            xb xbVar = new xb(W(), f6Var);
            xbVar.b.setText(str);
            xbVar.b.setSingleLine(false);
            xbVar.b.setMaxLines(2);
            mbVar = xbVar;
        } else {
            mc mcVar = new mc(W(), f6Var);
            mcVar.b.setText(str);
            mcVar.c.setText((CharSequence) null);
            mbVar = mcVar;
        }
        mbVar.setTimer();
        nc ncVar = new nc(W(), f6Var, true, z10);
        ncVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ncVar.a = runnable;
        ncVar.b = runnable2;
        mbVar.setButton(ncVar);
        return b(mbVar, 5000);
    }

    public final pc V(List list, CharSequence charSequence, CharSequence charSequence2, n7.a1 a1Var) {
        float f7;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        oc ocVar = new oc(W, f6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    ocVar.a.setCount(i13);
                    ocVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                ocVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                ocVar.a.setScaleX(1.2f);
                ocVar.a.setScaleY(1.2f);
            } else {
                ocVar.a.setScaleX(1.0f);
                ocVar.a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        ocVar.a.a(false);
        if (charSequence2 != null) {
            ocVar.b.setSingleLine(true);
            ocVar.b.setMaxLines(1);
            ocVar.b.setText(charSequence);
            ocVar.c.setText(charSequence2);
            ocVar.c.setSingleLine(false);
            ocVar.c.setMaxLines(3);
            if (ocVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ocVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) ocVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            ocVar.b.setSingleLine(false);
            ocVar.b.setMaxLines(4);
            ocVar.b.setText(charSequence);
            if (ocVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    ocVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ocVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) ocVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (a1Var != null) {
            nc ncVar = new nc(W(), f6Var, true);
            ncVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ncVar.a = (Runnable) a1Var.b;
            ncVar.b = (Runnable) a1Var.c;
            ocVar.setButton(ncVar);
        }
        return b(ocVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var != null) {
            context = p2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public final pc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.C1 ? new ob() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final pc b(mb mbVar, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        return p2Var != null ? pc.g(p2Var, mbVar, i10) : pc.f(this.b, mbVar, i10);
    }

    public final pc c(CharSequence charSequence) {
        if (W() == null) {
            return new ob();
        }
        xb xbVar = new xb(W(), this.c);
        xbVar.d(R.raw.ic_admin, "Shield");
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(3);
        xbVar.b.setText(charSequence);
        return b(xbVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (LaunchActivity.C1) {
            if (TextUtils.isEmpty(str)) {
                pc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                pc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                pc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                pc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final pc e(boolean z10) {
        String string;
        xb xbVar = new xb(W(), this.c);
        if (z10) {
            xbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            xbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        xbVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(xbVar, 1500);
    }

    public final boolean e0(int i10, long j3) {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (p2Var = this.a) != null) {
            ac acVar = new ac(i10, p2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new bi.f0(20)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new bi.f0(20));
                acVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                acVar.b.setText(replaceSingleTag);
                acVar.b.setSingleLine(false);
                acVar.b.setMaxLines(2);
                pc b10 = b(acVar, 3500);
                acVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final pc f(int i10, Runnable runnable) {
        xb xbVar = new xb(W(), null);
        xbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new tc(0, runnable), indexOf, indexOf2 - 1, 33);
        xbVar.b.setText(valueOf);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(3);
        return b(xbVar, 5000);
    }

    public final pc g(String str, ArrayList arrayList) {
        oc ocVar = new oc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                ocVar.a.setCount(i12);
                ocVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            ocVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            ocVar.a.setScaleX(1.2f);
            ocVar.a.setScaleY(1.2f);
        } else {
            ocVar.a.setScaleX(1.0f);
            ocVar.a.setScaleY(1.0f);
        }
        ocVar.a.a(false);
        ocVar.b.setSingleLine(false);
        ocVar.b.setMaxLines(2);
        ocVar.b.setText(str);
        if (ocVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) ocVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) ocVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            ocVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(ocVar, 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final pc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        r90 r90Var;
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
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.rc
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
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (indexOf >= 0) {
            r90Var = new r90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), f6Var);
            spannableStringBuilder.setSpan(r90Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.j6.Hi;
            r90Var.a(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 32), i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 72));
        } else {
            r90Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.rc
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
        vb vbVar = new vb(W, f6Var);
        m90 m90Var = new m90(W, null);
        vbVar.d = m90Var;
        m90Var.setDisablePaddingsOffset(true);
        m90Var.setSingleLine();
        m90Var.setTypeface(Typeface.SANS_SERIF);
        m90Var.setTextSize(1, 15.0f);
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        m90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        vbVar.b.setVisibility(8);
        vbVar.addView(m90Var, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.j6.Hi;
        vbVar.setTextColor(vbVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            vbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        vbVar.e(document, new String[i11]);
        vbVar.b.setTextSize(1, 14.0f);
        vbVar.b.setSingleLine(i11);
        vbVar.b.setMaxLines(3);
        m90Var.setText(spannableStringBuilder);
        m90Var.setTextSize(1, 14.0f);
        m90Var.setSingleLine(i11);
        m90Var.setMaxLines(3);
        nc ncVar = new nc(W(), f6Var, true);
        ncVar.e(string);
        ncVar.a = runnable;
        vbVar.setButton(ncVar);
        pc b10 = b(vbVar, 2750);
        if (r90Var != null) {
            tb tbVar = b10.e;
            if (tbVar instanceof vb) {
                r90Var.b = ((vb) tbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new sc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final pc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new ob();
        }
        xb xbVar = new xb(W(), null);
        xbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        xbVar.b.setText(str);
        return b(xbVar, 1500);
    }

    public final pc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new ob();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (!z10) {
            xb xbVar = new xb(W(), f6Var);
            xbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            xbVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(xbVar, 1500);
        }
        mc mcVar = new mc(W(), f6Var);
        mcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        mcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        mcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(mcVar, 2750);
    }

    public final pc m(vc vcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        xb xbVar = (i11 == 0 || i12 == 0) ? new xb(W(), f6Var) : new xb(i11, i12, W(), f6Var);
        uc ucVar = vcVar.d;
        xbVar.d(ucVar.a, ucVar.b);
        TextView textView = xbVar.b;
        String str = vcVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(vcVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, vcVar.b), new bi.f0(21)));
        int i13 = vcVar.d.c;
        if (i13 != 0) {
            xbVar.setIconPaddingBottom(i13);
        }
        return b(xbVar, 1500);
    }

    public final pc n(vc vcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(vcVar, i10, 0, 0, f6Var);
    }

    public final pc o(vc vcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(vcVar, 1, 0, 0, f6Var);
    }

    public final pc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        kc kcVar = new kc(W, f6Var);
        p5 p5Var = new p5(1, UserConfig.selectedAccount, j3);
        w9 w9Var = kcVar.a;
        w9Var.setAnimatedEmojiDrawable(p5Var);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        kcVar.b.setText(str);
        kcVar.c.setText(str2);
        return b(kcVar, 2750);
    }

    public final pc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        xb xbVar = new xb(W, f6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            xbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        xbVar.e(document, new String[0]);
        if (xbVar.a.getImageReceiver() != null) {
            xbVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        xbVar.b.setText(charSequence);
        xbVar.b.setTextSize(1, 14.0f);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(3);
        nc ncVar = new nc(W(), f6Var, true);
        ncVar.e(str);
        ncVar.a = runnable;
        xbVar.setButton(ncVar);
        return b(xbVar, 2750);
    }

    public final pc r(TLRPC.Document document, String str) {
        xb xbVar = new xb(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            xbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        xbVar.e(document, new String[0]);
        xbVar.b.setText(str);
        xbVar.b.setTextSize(1, 14.0f);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(3);
        return b(xbVar, 2750);
    }

    public final pc s(TLRPC.Document document, String str, CharSequence charSequence) {
        mc mcVar = new mc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        kj0 kj0Var = mcVar.a;
        if (isTextColorEmoji) {
            kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        kj0Var.setAutoRepeat(true);
        kj0Var.g(36, 36, document);
        mcVar.b.setText(str);
        mcVar.c.setText(charSequence);
        return b(mcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final pc t(CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        xb xbVar = new xb(W(), f6Var);
        xbVar.d(R.raw.chats_infotip, new String[0]);
        xbVar.b.setText(charSequence);
        xbVar.b.setSingleLine(false);
        xbVar.b.setMaxLines(2);
        return b(xbVar, 1500);
    }

    public final pc u(String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        mc mcVar = new mc(W(), f6Var);
        mcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        mcVar.b.setText(str);
        mcVar.c.setText(str2);
        return b(mcVar, 1500);
    }

    public final pc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        xb xbVar = new xb(W, f6Var);
        xbVar.setBackground(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var), 12);
        xbVar.a.setImageResource(i10);
        xbVar.b.setText(charSequence);
        xbVar.b.setSingleLine(false);
        xbVar.b.setLines(2);
        xbVar.b.setMaxLines(4);
        TextView textView = xbVar.b;
        textView.setMaxWidth(bi.x4.a(textView.getText(), xbVar.b.getPaint()));
        xbVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) xbVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        xbVar.setWrapWidth();
        return b(xbVar, 5000);
    }

    public final pc y(int i10, TLRPC.Document document, fg.n nVar) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        xb xbVar = new xb(W, f6Var);
        xbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        xbVar.removeView(xbVar.b);
        x5 x5Var = new x5(xbVar.getContext());
        xbVar.b = x5Var;
        x5Var.setTypeface(Typeface.SANS_SERIF);
        xbVar.b.setTextSize(1, 15.0f);
        xbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new y5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        xbVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            nc ncVar = new nc(W(), f6Var, true);
            ncVar.e(LocaleController.getString(R.string.ViewAction));
            ncVar.a = nVar;
            xbVar.setButton(ncVar);
        }
        xbVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        xbVar.addView(xbVar.b, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(xbVar, 2750);
    }

    public wc(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = f6Var;
    }
}
