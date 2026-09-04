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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yc {
    public final org.telegram.ui.ActionBar.n2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.f6 c;

    public yc(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null || n2Var.getLastStoryViewer() == null || !n2Var.getLastStoryViewer().attachedToParent()) {
            this.a = n2Var;
            this.b = null;
            this.c = n2Var != null ? n2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            bi.o5 currentPeerView = n2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.c1 : null;
            this.c = n2Var.getLastStoryViewer().y;
        }
    }

    public static qc A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        return z(n2Var, z10 ? 3 : 4, 0, f6Var);
    }

    public static qc B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, bi.k8 k8Var, org.telegram.ui.te teVar, org.telegram.ui.ActionBar.f6 f6Var) {
        yb ybVar = new yb(n2Var.getParentActivity(), f6Var);
        ybVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        ybVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            oc ocVar = new oc(n2Var.getParentActivity(), f6Var, true);
            ocVar.a = k8Var;
            ocVar.b = teVar;
            ybVar.setButton(ocVar);
        }
        return qc.g(n2Var, ybVar, z10 ? 1500 : 5000);
    }

    public static qc C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return qc.g(n2Var, ybVar, 1500);
    }

    public static qc D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        ybVar.d(R.raw.ic_ban, "Hand");
        ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return qc.g(n2Var, ybVar, 1500);
    }

    public static qc F(FrameLayout frameLayout, boolean z10) {
        return new yc(frameLayout, null).m(z10 ? xc.h : xc.e, 1, -115203550, -1, null);
    }

    public static qc S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String string;
        yb ybVar = new yb(n2Var.getParentActivity(), f6Var);
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
            ybVar.d(R.raw.sound_on, new String[0]);
        } else {
            ybVar.d(R.raw.sound_off, new String[0]);
        }
        ybVar.b.setText(string);
        return qc.g(n2Var, ybVar, 1500);
    }

    public static yc X() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return new yc(lb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.f3 ? new yc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static yc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        return new yc(frameLayout, f6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.n2 n2Var) {
        return (n2Var == null || n2Var.getParentActivity() == null || n2Var.getLayoutContainer() == null) ? false : true;
    }

    public static yc a0(org.telegram.ui.ActionBar.n2 n2Var) {
        return n2Var == null ? X() : new yc(n2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static qc d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            ybVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ybVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ybVar.b.setText(AndroidUtilities.replaceTags(string));
        return qc.g(n2Var, ybVar, 1500);
    }

    public static qc j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static qc l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        ybVar.b.setText(AndroidUtilities.replaceTags(string));
        ybVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return qc.g(n2Var, ybVar, 5000);
    }

    public static qc v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.g0 g0Var) {
        yb ybVar;
        SpannableStringBuilder replaceTags;
        qc g10;
        int i15 = 1;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || n2Var == null || i10 > 1 || j3 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            ybVar = new yb(i12, i13, context, n2Var != null ? n2Var.getResourceProvider() : null);
        } else {
            ybVar = new bc(i11, n2Var);
        }
        yb ybVar2 = ybVar;
        int i16 = 0;
        boolean z11 = g0Var != null;
        uc ucVar = g0Var != null ? new uc(i16, new boolean[]{false}, g0Var) : null;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            ybVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            int i17 = 26;
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new ah.j(28) : new ah.j(i17));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ah.j(i17));
            }
            ybVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            a3.g0 g0Var2 = new a3.g0(ucVar, n2Var, j3, 17);
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
                replaceTags = i11 <= 1 ? n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, g0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, g0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
                if (i11 <= 1) {
                    int i18 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, g0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                } else {
                    int i19 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i19, UserObject.getFirstName(user)), -1, 2, g0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i19, UserObject.getFirstName(user)));
                }
            }
            ybVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        ybVar2.b.setText(replaceTags);
        if (z11) {
            oc ocVar = new oc(ybVar2.getContext(), n2Var != null ? n2Var.getResourceProvider() : null, true, true);
            ocVar.a = null;
            ocVar.b = ucVar;
            ybVar2.setButton(ocVar);
        }
        ybVar2.postDelayed(new rc(ybVar2, i15), 300);
        if (frameLayout != null) {
            g10 = qc.f(frameLayout, ybVar2, i14);
        } else {
            if (n2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = qc.g(n2Var, ybVar2, i14);
        }
        if (ybVar2 instanceof bc) {
            ybVar2.b.setSingleLine(false);
            ybVar2.b.setMaxLines(2);
            ((bc) ybVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qc x(Activity activity, FrameLayout frameLayout, int i10, long j3, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        yb ybVar = new yb(i11, i12, activity, null);
        int i14 = 0;
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            ybVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                ybVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                ybVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    ybVar.postDelayed(new rc(ybVar, i14), i13);
                }
                return qc.f(frameLayout, ybVar, 1500);
            }
            if (DialogObject.isChatDialog(j3)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3)))));
            }
            ybVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        spannableStringBuilder = replaceTags;
        i13 = 300;
        ybVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return qc.f(frameLayout, ybVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qc z(org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        String formatString;
        boolean z10;
        yb ybVar = new yb(n2Var.getParentActivity(), f6Var);
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
                    ybVar.b.setText(formatString);
                    return qc.g(n2Var, ybVar, 1500);
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException();
                }
                formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                z10 = true;
                if (z11) {
                    ybVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    ybVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ybVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ybVar.b.setText(formatString);
                return qc.g(n2Var, ybVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (z11) {
        }
        ybVar.b.setText(formatString);
        return qc.g(n2Var, ybVar, 1500);
    }

    public final qc E(org.telegram.ui.ActionBar.f6 f6Var) {
        yb ybVar = new yb(W(), f6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(ybVar, 1500);
    }

    public final qc G(int i10, int i11, CharSequence charSequence) {
        yb ybVar = new yb(W(), this.c);
        ybVar.c(i10, 36, 36, new String[0]);
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
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(i11);
        ybVar.b.setText(charSequence);
        return b(ybVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final qc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final qc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        yb ybVar = new yb(W, f6Var);
        if (i10 != 0) {
            ybVar.c(i10, 36, 36, new String[0]);
        } else {
            ybVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ybVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setTextDirection(5);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        ybVar.b.setText(charSequence);
        oc ocVar = new oc(W(), f6Var, true, z10);
        ocVar.e(charSequence2);
        ocVar.a = runnable;
        ybVar.setButton(ocVar);
        return b(ybVar, i11);
    }

    public final qc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final qc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        nc ncVar = new nc(W, f6Var);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.b.setText(str);
        ncVar.c.setText(charSequence);
        oc ocVar = new oc(W(), f6Var, true);
        ocVar.e(str2);
        ocVar.a = runnable;
        ncVar.setButton(ocVar);
        return b(ncVar, 5000);
    }

    public final qc L(Drawable drawable, CharSequence charSequence) {
        yb ybVar = new yb(W(), this.c);
        ybVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.wp0) {
            ((org.telegram.ui.wp0) drawable).e(ybVar.a);
        }
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, 2750);
    }

    public final qc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        nc ncVar = new nc(W(), this.c);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.b.setText(charSequence);
        ncVar.c.setText(charSequence2);
        return b(ncVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final qc N(String str, String str2) {
        nc ncVar = new nc(W(), this.c);
        ncVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ncVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        ncVar.b.setText(str);
        ncVar.c.setText(str2);
        return b(ncVar, 5000);
    }

    public final qc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new pb();
        }
        mc mcVar = new mc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        x9 x9Var = mcVar.a;
        x9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = mcVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = mcVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(mcVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final qc P(int i10, CharSequence charSequence) {
        yb ybVar = new yb(W(), this.c);
        ybVar.c(i10, 36, 36, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setMaxLines(4);
        return b(ybVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final qc Q(int i10, int i11, CharSequence charSequence) {
        yb ybVar = new yb(W(), this.c);
        ybVar.c(i10, i11, i11, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final qc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new pb();
        }
        mc mcVar = new mc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        x9 x9Var = mcVar.a;
        x9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = mcVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        mcVar.c.setVisibility(8);
        return b(mcVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final qc T(String str) {
        yb ybVar = new yb(W(), null);
        ybVar.d(R.raw.contact_check, new String[0]);
        ybVar.b.setText(str);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        nb nbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (isEmpty) {
            yb ybVar = new yb(W(), f6Var);
            ybVar.b.setText(str);
            ybVar.b.setSingleLine(false);
            ybVar.b.setMaxLines(2);
            nbVar = ybVar;
        } else {
            nc ncVar = new nc(W(), f6Var);
            ncVar.b.setText(str);
            ncVar.c.setText((CharSequence) null);
            nbVar = ncVar;
        }
        nbVar.setTimer();
        oc ocVar = new oc(W(), f6Var, true, z10);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.a = runnable;
        ocVar.b = runnable2;
        nbVar.setButton(ocVar);
        return b(nbVar, 5000);
    }

    public final qc V(List list, CharSequence charSequence, CharSequence charSequence2, o0.a aVar) {
        float f7;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        pc pcVar = new pc(W, f6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    pcVar.a.setCount(i13);
                    pcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                pcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                pcVar.a.setScaleX(1.2f);
                pcVar.a.setScaleY(1.2f);
            } else {
                pcVar.a.setScaleX(1.0f);
                pcVar.a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        pcVar.a.a(false);
        if (charSequence2 != null) {
            pcVar.b.setSingleLine(true);
            pcVar.b.setMaxLines(1);
            pcVar.b.setText(charSequence);
            pcVar.c.setText(charSequence2);
            pcVar.c.setSingleLine(false);
            pcVar.c.setMaxLines(3);
            if (pcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) pcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) pcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            pcVar.b.setSingleLine(false);
            pcVar.b.setMaxLines(4);
            pcVar.b.setText(charSequence);
            if (pcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    pcVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) pcVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) pcVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (aVar != null) {
            oc ocVar = new oc(W(), f6Var, true);
            ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ocVar.a = (Runnable) aVar.b;
            ocVar.b = (Runnable) aVar.c;
            pcVar.setButton(ocVar);
        }
        return b(pcVar, 5000);
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

    public final qc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.C1 ? new pb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final qc b(nb nbVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        return n2Var != null ? qc.g(n2Var, nbVar, i10) : qc.f(this.b, nbVar, i10);
    }

    public final qc c(CharSequence charSequence) {
        if (W() == null) {
            return new pb();
        }
        yb ybVar = new yb(W(), this.c);
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        ybVar.b.setText(charSequence);
        return b(ybVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (LaunchActivity.C1) {
            if (TextUtils.isEmpty(str)) {
                qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final qc e(boolean z10) {
        String string;
        yb ybVar = new yb(W(), this.c);
        if (z10) {
            ybVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ybVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ybVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(ybVar, 1500);
    }

    public final boolean e0(int i10, long j3) {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.a) != null) {
            bc bcVar = new bc(i10, n2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ah.j(26)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ah.j(26));
                bcVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                bcVar.b.setText(replaceSingleTag);
                bcVar.b.setSingleLine(false);
                bcVar.b.setMaxLines(2);
                qc b10 = b(bcVar, 3500);
                bcVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final qc f(int i10, Runnable runnable) {
        yb ybVar = new yb(W(), null);
        ybVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new vc(0, runnable), indexOf, indexOf2 - 1, 33);
        ybVar.b.setText(valueOf);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        return b(ybVar, 5000);
    }

    public final qc g(String str, ArrayList arrayList) {
        pc pcVar = new pc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                pcVar.a.setCount(i12);
                pcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            pcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            pcVar.a.setScaleX(1.2f);
            pcVar.a.setScaleY(1.2f);
        } else {
            pcVar.a.setScaleX(1.0f);
            pcVar.a.setScaleY(1.0f);
        }
        pcVar.a.a(false);
        pcVar.b.setSingleLine(false);
        pcVar.b.setMaxLines(2);
        pcVar.b.setText(str);
        if (pcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) pcVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) pcVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            pcVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(pcVar, 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final qc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        i90 i90Var;
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
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.sc
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
            i90Var = new i90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), f6Var);
            spannableStringBuilder.setSpan(i90Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.j6.Hi;
            i90Var.a(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 32), i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 72));
        } else {
            i90Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.sc
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
        wb wbVar = new wb(W, f6Var);
        d90 d90Var = new d90(W, null);
        wbVar.d = d90Var;
        d90Var.setDisablePaddingsOffset(true);
        d90Var.setSingleLine();
        d90Var.setTypeface(Typeface.SANS_SERIF);
        d90Var.setTextSize(1, 15.0f);
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
        d90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        wbVar.b.setVisibility(8);
        wbVar.addView(d90Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.j6.Hi;
        wbVar.setTextColor(wbVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            wbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        wbVar.e(document, new String[i11]);
        wbVar.b.setTextSize(1, 14.0f);
        wbVar.b.setSingleLine(i11);
        wbVar.b.setMaxLines(3);
        d90Var.setText(spannableStringBuilder);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setSingleLine(i11);
        d90Var.setMaxLines(3);
        oc ocVar = new oc(W(), f6Var, true);
        ocVar.e(string);
        ocVar.a = runnable;
        wbVar.setButton(ocVar);
        qc b10 = b(wbVar, 2750);
        if (i90Var != null) {
            ub ubVar = b10.e;
            if (ubVar instanceof wb) {
                i90Var.b = ((wb) ubVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new tc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final qc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new pb();
        }
        yb ybVar = new yb(W(), null);
        ybVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ybVar.b.setText(str);
        return b(ybVar, 1500);
    }

    public final qc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new pb();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (!z10) {
            yb ybVar = new yb(W(), f6Var);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(ybVar, 1500);
        }
        nc ncVar = new nc(W(), f6Var);
        ncVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ncVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        ncVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(ncVar, 2750);
    }

    public final qc m(xc xcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        yb ybVar = (i11 == 0 || i12 == 0) ? new yb(W(), f6Var) : new yb(i11, i12, W(), f6Var);
        wc wcVar = xcVar.d;
        ybVar.d(wcVar.a, wcVar.b);
        TextView textView = ybVar.b;
        String str = xcVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(xcVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, xcVar.b), new ah.j(27)));
        int i13 = xcVar.d.c;
        if (i13 != 0) {
            ybVar.setIconPaddingBottom(i13);
        }
        return b(ybVar, 1500);
    }

    public final qc n(xc xcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(xcVar, i10, 0, 0, f6Var);
    }

    public final qc o(xc xcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(xcVar, 1, 0, 0, f6Var);
    }

    public final qc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        lc lcVar = new lc(W, f6Var);
        q5 q5Var = new q5(1, UserConfig.selectedAccount, j3);
        x9 x9Var = lcVar.a;
        x9Var.setAnimatedEmojiDrawable(q5Var);
        x9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        lcVar.b.setText(str);
        lcVar.c.setText(str2);
        return b(lcVar, 2750);
    }

    public final qc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        yb ybVar = new yb(W, f6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            ybVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ybVar.e(document, new String[0]);
        if (ybVar.a.getImageReceiver() != null) {
            ybVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        ybVar.b.setText(charSequence);
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        oc ocVar = new oc(W(), f6Var, true);
        ocVar.e(str);
        ocVar.a = runnable;
        ybVar.setButton(ocVar);
        return b(ybVar, 2750);
    }

    public final qc r(TLRPC.Document document, String str) {
        yb ybVar = new yb(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            ybVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ybVar.e(document, new String[0]);
        ybVar.b.setText(str);
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        return b(ybVar, 2750);
    }

    public final qc s(TLRPC.Document document, String str, CharSequence charSequence) {
        nc ncVar = new nc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        aj0 aj0Var = ncVar.a;
        if (isTextColorEmoji) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        ncVar.b.setText(str);
        ncVar.c.setText(charSequence);
        return b(ncVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final qc t(CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        yb ybVar = new yb(W(), f6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc u(String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        nc ncVar = new nc(W(), f6Var);
        ncVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ncVar.b.setText(str);
        ncVar.c.setText(str2);
        return b(ncVar, 1500);
    }

    public final qc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        yb ybVar = new yb(W, f6Var);
        ybVar.setBackground(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var), 12);
        ybVar.a.setImageResource(i10);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setLines(2);
        ybVar.b.setMaxLines(4);
        TextView textView = ybVar.b;
        textView.setMaxWidth(di.f4.a(textView.getText(), ybVar.b.getPaint()));
        ybVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ybVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        ybVar.setWrapWidth();
        return b(ybVar, 5000);
    }

    public final qc y(int i10, TLRPC.Document document, hg.n nVar) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        yb ybVar = new yb(W, f6Var);
        ybVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ybVar.removeView(ybVar.b);
        y5 y5Var = new y5(ybVar.getContext());
        ybVar.b = y5Var;
        y5Var.setTypeface(Typeface.SANS_SERIF);
        ybVar.b.setTextSize(1, 15.0f);
        ybVar.b.setEllipsize(TextUtils.TruncateAt.END);
        ybVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new z5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        ybVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            oc ocVar = new oc(W(), f6Var, true);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            ocVar.a = nVar;
            ybVar.setButton(ocVar);
        }
        ybVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        ybVar.addView(ybVar.b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ybVar, 2750);
    }

    public yc(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = f6Var;
    }
}
