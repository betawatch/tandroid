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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vc {
    public final org.telegram.ui.ActionBar.o2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.f6 c;

    public vc(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == null || o2Var.getLastStoryViewer() == null || !o2Var.getLastStoryViewer().attachedToParent()) {
            this.a = o2Var;
            this.b = null;
            this.c = o2Var != null ? o2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            ai.f6 currentPeerView = o2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.c1 : null;
            this.c = o2Var.getLastStoryViewer().y;
        }
    }

    public static oc A(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        return z(o2Var, z10 ? 3 : 4, 0, f6Var);
    }

    public static oc B(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, ai.c9 c9Var, org.telegram.ui.ue ueVar, org.telegram.ui.ActionBar.f6 f6Var) {
        wb wbVar = new wb(o2Var.getParentActivity(), f6Var);
        wbVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        wbVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            mc mcVar = new mc(o2Var.getParentActivity(), f6Var, true);
            mcVar.a = c9Var;
            mcVar.b = ueVar;
            wbVar.setButton(mcVar);
        }
        return oc.g(o2Var, wbVar, z10 ? 1500 : 5000);
    }

    public static oc C(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
        wbVar.d(R.raw.ic_admin, "Shield");
        wbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return oc.g(o2Var, wbVar, 1500);
    }

    public static oc D(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
        wbVar.d(R.raw.ic_ban, "Hand");
        wbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return oc.g(o2Var, wbVar, 1500);
    }

    public static oc F(FrameLayout frameLayout, boolean z10) {
        return new vc(frameLayout, null).m(z10 ? uc.h : uc.e, 1, -115203550, -1, null);
    }

    public static oc S(int i10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String string;
        wb wbVar = new wb(o2Var.getParentActivity(), f6Var);
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
            wbVar.d(R.raw.sound_on, new String[0]);
        } else {
            wbVar.d(R.raw.sound_off, new String[0]);
        }
        wbVar.b.setText(string);
        return oc.g(o2Var, wbVar, 1500);
    }

    public static vc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return new vc(jb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.g3 ? new vc(((org.telegram.ui.ActionBar.g3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static vc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        return new vc(frameLayout, f6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.o2 o2Var) {
        return (o2Var == null || o2Var.getParentActivity() == null || o2Var.getLayoutContainer() == null) ? false : true;
    }

    public static vc a0(org.telegram.ui.ActionBar.o2 o2Var) {
        return o2Var == null ? X() : new vc(o2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static oc d(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (z10) {
            wbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            wbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        wbVar.b.setText(AndroidUtilities.replaceTags(string));
        return oc.g(o2Var, wbVar, 1500);
    }

    public static oc j(org.telegram.ui.ActionBar.o2 o2Var) {
        return a0(o2Var).k(false);
    }

    public static oc l(String str, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        wbVar.b.setText(AndroidUtilities.replaceTags(string));
        wbVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return oc.g(o2Var, wbVar, 5000);
    }

    public static oc v(Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        wb wbVar;
        SpannableStringBuilder replaceTags;
        oc g10;
        int i15 = 1;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || o2Var == null || i10 > 1 || j3 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            wbVar = new wb(i12, i13, context, o2Var != null ? o2Var.getResourceProvider() : null);
        } else {
            wbVar = new zb(i11, o2Var);
        }
        wb wbVar2 = wbVar;
        boolean z11 = h0Var != null;
        org.telegram.ui.wh whVar = h0Var != null ? new org.telegram.ui.wh(24, new boolean[]{false}, h0Var) : null;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            wbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            int i16 = 25;
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new ai.f(27) : new ai.f(i16));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(i16));
            }
            wbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            a3.h0 h0Var2 = new a3.h0(whVar, o2Var, j3, 17);
            if (DialogObject.isChatDialog(j3)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
                replaceTags = i11 <= 1 ? o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
                if (i11 <= 1) {
                    int i17 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                } else {
                    int i18 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, h0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                }
            }
            wbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        wbVar2.b.setText(replaceTags);
        if (z11) {
            mc mcVar = new mc(wbVar2.getContext(), o2Var != null ? o2Var.getResourceProvider() : null, true, true);
            mcVar.a = null;
            mcVar.b = whVar;
            wbVar2.setButton(mcVar);
        }
        wbVar2.postDelayed(new pc(wbVar2, i15), 300);
        if (frameLayout != null) {
            g10 = oc.f(frameLayout, wbVar2, i14);
        } else {
            if (o2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = oc.g(o2Var, wbVar2, i14);
        }
        if (wbVar2 instanceof zb) {
            wbVar2.b.setSingleLine(false);
            wbVar2.b.setMaxLines(2);
            ((zb) wbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oc x(Activity activity, FrameLayout frameLayout, int i10, long j3, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        wb wbVar = new wb(i11, i12, activity, null);
        int i14 = 0;
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            wbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                wbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                wbVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    wbVar.postDelayed(new pc(wbVar, i14), i13);
                }
                return oc.f(frameLayout, wbVar, 1500);
            }
            if (DialogObject.isChatDialog(j3)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3)))));
            }
            wbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        spannableStringBuilder = replaceTags;
        i13 = 300;
        wbVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return oc.f(frameLayout, wbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oc z(org.telegram.ui.ActionBar.o2 o2Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        String formatString;
        boolean z10;
        wb wbVar = new wb(o2Var.getParentActivity(), f6Var);
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
                    wbVar.b.setText(formatString);
                    return oc.g(o2Var, wbVar, 1500);
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException();
                }
                formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                z10 = true;
                if (z11) {
                    wbVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    wbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    wbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                wbVar.b.setText(formatString);
                return oc.g(o2Var, wbVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (z11) {
        }
        wbVar.b.setText(formatString);
        return oc.g(o2Var, wbVar, 1500);
    }

    public final oc E(org.telegram.ui.ActionBar.f6 f6Var) {
        wb wbVar = new wb(W(), f6Var);
        wbVar.d(R.raw.chats_infotip, new String[0]);
        wbVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(wbVar, 1500);
    }

    public final oc G(int i10, int i11, CharSequence charSequence) {
        wb wbVar = new wb(W(), this.c);
        wbVar.c(i10, 36, 36, new String[0]);
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
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(i11);
        wbVar.b.setText(charSequence);
        return b(wbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final oc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final oc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        wb wbVar = new wb(W, f6Var);
        if (i10 != 0) {
            wbVar.c(i10, 36, 36, new String[0]);
        } else {
            wbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) wbVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        wbVar.b.setTextSize(1, 14.0f);
        wbVar.b.setTextDirection(5);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(3);
        wbVar.b.setText(charSequence);
        mc mcVar = new mc(W(), f6Var, true, z10);
        mcVar.e(charSequence2);
        mcVar.a = runnable;
        wbVar.setButton(mcVar);
        return b(wbVar, i11);
    }

    public final oc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final oc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        lc lcVar = new lc(W, f6Var);
        lcVar.c(i10, 36, 36, new String[0]);
        lcVar.b.setText(str);
        lcVar.c.setText(charSequence);
        mc mcVar = new mc(W(), f6Var, true);
        mcVar.e(str2);
        mcVar.a = runnable;
        lcVar.setButton(mcVar);
        return b(lcVar, 5000);
    }

    public final oc L(Drawable drawable, CharSequence charSequence) {
        wb wbVar = new wb(W(), this.c);
        wbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.xp0) {
            ((org.telegram.ui.xp0) drawable).e(wbVar.a);
        }
        wbVar.b.setText(charSequence);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(2);
        return b(wbVar, 2750);
    }

    public final oc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        lc lcVar = new lc(W(), this.c);
        lcVar.c(i10, 36, 36, new String[0]);
        lcVar.b.setText(charSequence);
        lcVar.c.setText(charSequence2);
        return b(lcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final oc N(String str, String str2) {
        lc lcVar = new lc(W(), this.c);
        lcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) lcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        lcVar.b.setText(str);
        lcVar.c.setText(str2);
        return b(lcVar, 5000);
    }

    public final oc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new nb();
        }
        kc kcVar = new kc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        u9 u9Var = kcVar.a;
        u9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = kcVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = kcVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(kcVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final oc P(int i10, CharSequence charSequence) {
        wb wbVar = new wb(W(), this.c);
        wbVar.c(i10, 36, 36, new String[0]);
        wbVar.b.setText(charSequence);
        wbVar.b.setSingleLine(false);
        wbVar.b.setTextSize(1, 14.0f);
        wbVar.b.setMaxLines(4);
        return b(wbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final oc Q(int i10, int i11, CharSequence charSequence) {
        wb wbVar = new wb(W(), this.c);
        wbVar.c(i10, i11, i11, new String[0]);
        wbVar.b.setText(charSequence);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(2);
        return b(wbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final oc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new nb();
        }
        kc kcVar = new kc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        u9 u9Var = kcVar.a;
        u9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = kcVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        kcVar.c.setVisibility(8);
        return b(kcVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final oc T(String str) {
        wb wbVar = new wb(W(), null);
        wbVar.d(R.raw.contact_check, new String[0]);
        wbVar.b.setText(str);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(2);
        return b(wbVar, 1500);
    }

    public final oc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        lb lbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (isEmpty) {
            wb wbVar = new wb(W(), f6Var);
            wbVar.b.setText(str);
            wbVar.b.setSingleLine(false);
            wbVar.b.setMaxLines(2);
            lbVar = wbVar;
        } else {
            lc lcVar = new lc(W(), f6Var);
            lcVar.b.setText(str);
            lcVar.c.setText((CharSequence) null);
            lbVar = lcVar;
        }
        lbVar.setTimer();
        mc mcVar = new mc(W(), f6Var, true, z10);
        mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        mcVar.a = runnable;
        mcVar.b = runnable2;
        lbVar.setButton(mcVar);
        return b(lbVar, 5000);
    }

    public final oc V(List list, CharSequence charSequence, CharSequence charSequence2, o0.a aVar) {
        float f7;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        nc ncVar = new nc(W, f6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    ncVar.a.setCount(i13);
                    ncVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                ncVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                ncVar.a.setScaleX(1.2f);
                ncVar.a.setScaleY(1.2f);
            } else {
                ncVar.a.setScaleX(1.0f);
                ncVar.a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        ncVar.a.a(false);
        if (charSequence2 != null) {
            ncVar.b.setSingleLine(true);
            ncVar.b.setMaxLines(1);
            ncVar.b.setText(charSequence);
            ncVar.c.setText(charSequence2);
            ncVar.c.setSingleLine(false);
            ncVar.c.setMaxLines(3);
            if (ncVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ncVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) ncVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            ncVar.b.setSingleLine(false);
            ncVar.b.setMaxLines(4);
            ncVar.b.setText(charSequence);
            if (ncVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    ncVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ncVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) ncVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (aVar != null) {
            mc mcVar = new mc(W(), f6Var, true);
            mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            mcVar.a = (Runnable) aVar.b;
            mcVar.b = (Runnable) aVar.c;
            ncVar.setButton(mcVar);
        }
        return b(ncVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var != null) {
            context = o2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public final oc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.C1 ? new nb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final oc b(lb lbVar, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        return o2Var != null ? oc.g(o2Var, lbVar, i10) : oc.f(this.b, lbVar, i10);
    }

    public final oc c(CharSequence charSequence) {
        if (W() == null) {
            return new nb();
        }
        wb wbVar = new wb(W(), this.c);
        wbVar.d(R.raw.ic_admin, "Shield");
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(3);
        wbVar.b.setText(charSequence);
        return b(wbVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (LaunchActivity.C1) {
            if (TextUtils.isEmpty(str)) {
                oc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                oc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                oc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                oc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final oc e(boolean z10) {
        String string;
        wb wbVar = new wb(W(), this.c);
        if (z10) {
            wbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            wbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        wbVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(wbVar, 1500);
    }

    public final boolean e0(int i10, long j3) {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (o2Var = this.a) != null) {
            zb zbVar = new zb(i10, o2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ai.f(25)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(25));
                zbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                zbVar.b.setText(replaceSingleTag);
                zbVar.b.setSingleLine(false);
                zbVar.b.setMaxLines(2);
                oc b10 = b(zbVar, 3500);
                zbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final oc f(int i10, Runnable runnable) {
        wb wbVar = new wb(W(), null);
        wbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new sc(0, runnable), indexOf, indexOf2 - 1, 33);
        wbVar.b.setText(valueOf);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(3);
        return b(wbVar, 5000);
    }

    public final oc g(String str, ArrayList arrayList) {
        nc ncVar = new nc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                ncVar.a.setCount(i12);
                ncVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            ncVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            ncVar.a.setScaleX(1.2f);
            ncVar.a.setScaleY(1.2f);
        } else {
            ncVar.a.setScaleX(1.0f);
            ncVar.a.setScaleY(1.0f);
        }
        ncVar.a.a(false);
        ncVar.b.setSingleLine(false);
        ncVar.b.setMaxLines(2);
        ncVar.b.setText(str);
        if (ncVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) ncVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) ncVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            ncVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(ncVar, 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final oc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        h90 h90Var;
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
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.qc
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
            h90Var = new h90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), f6Var);
            spannableStringBuilder.setSpan(h90Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.j6.Hi;
            h90Var.a(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 32), i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 72));
        } else {
            h90Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.qc
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
        ub ubVar = new ub(W, f6Var);
        c90 c90Var = new c90(W, null);
        ubVar.d = c90Var;
        c90Var.setDisablePaddingsOffset(true);
        c90Var.setSingleLine();
        c90Var.setTypeface(Typeface.SANS_SERIF);
        c90Var.setTextSize(1, 15.0f);
        c90Var.setEllipsize(TextUtils.TruncateAt.END);
        c90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ubVar.b.setVisibility(8);
        ubVar.addView(c90Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.j6.Hi;
        ubVar.setTextColor(ubVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            ubVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        ubVar.e(document, new String[i11]);
        ubVar.b.setTextSize(1, 14.0f);
        ubVar.b.setSingleLine(i11);
        ubVar.b.setMaxLines(3);
        c90Var.setText(spannableStringBuilder);
        c90Var.setTextSize(1, 14.0f);
        c90Var.setSingleLine(i11);
        c90Var.setMaxLines(3);
        mc mcVar = new mc(W(), f6Var, true);
        mcVar.e(string);
        mcVar.a = runnable;
        ubVar.setButton(mcVar);
        oc b10 = b(ubVar, 2750);
        if (h90Var != null) {
            sb sbVar = b10.e;
            if (sbVar instanceof ub) {
                h90Var.b = ((ub) sbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new rc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final oc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new nb();
        }
        wb wbVar = new wb(W(), null);
        wbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        wbVar.b.setText(str);
        return b(wbVar, 1500);
    }

    public final oc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new nb();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        if (!z10) {
            wb wbVar = new wb(W(), f6Var);
            wbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            wbVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(wbVar, 1500);
        }
        lc lcVar = new lc(W(), f6Var);
        lcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        lcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        lcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(lcVar, 2750);
    }

    public final oc m(uc ucVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        wb wbVar = (i11 == 0 || i12 == 0) ? new wb(W(), f6Var) : new wb(i11, i12, W(), f6Var);
        tc tcVar = ucVar.d;
        wbVar.d(tcVar.a, tcVar.b);
        TextView textView = wbVar.b;
        String str = ucVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(ucVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, ucVar.b), new ai.f(26)));
        int i13 = ucVar.d.c;
        if (i13 != 0) {
            wbVar.setIconPaddingBottom(i13);
        }
        return b(wbVar, 1500);
    }

    public final oc n(uc ucVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(ucVar, i10, 0, 0, f6Var);
    }

    public final oc o(uc ucVar, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(ucVar, 1, 0, 0, f6Var);
    }

    public final oc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        jc jcVar = new jc(W, f6Var);
        o5 o5Var = new o5(1, UserConfig.selectedAccount, j3);
        u9 u9Var = jcVar.a;
        u9Var.setAnimatedEmojiDrawable(o5Var);
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        jcVar.b.setText(str);
        jcVar.c.setText(str2);
        return b(jcVar, 2750);
    }

    public final oc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        wb wbVar = new wb(W, f6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            wbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        wbVar.e(document, new String[0]);
        if (wbVar.a.getImageReceiver() != null) {
            wbVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        wbVar.b.setText(charSequence);
        wbVar.b.setTextSize(1, 14.0f);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(3);
        mc mcVar = new mc(W(), f6Var, true);
        mcVar.e(str);
        mcVar.a = runnable;
        wbVar.setButton(mcVar);
        return b(wbVar, 2750);
    }

    public final oc r(TLRPC.Document document, String str) {
        wb wbVar = new wb(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            wbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        wbVar.e(document, new String[0]);
        wbVar.b.setText(str);
        wbVar.b.setTextSize(1, 14.0f);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(3);
        return b(wbVar, 2750);
    }

    public final oc s(TLRPC.Document document, String str, CharSequence charSequence) {
        lc lcVar = new lc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        bj0 bj0Var = lcVar.a;
        if (isTextColorEmoji) {
            bj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        bj0Var.setAutoRepeat(true);
        bj0Var.g(36, 36, document);
        lcVar.b.setText(str);
        lcVar.c.setText(charSequence);
        return b(lcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final oc t(CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        wb wbVar = new wb(W(), f6Var);
        wbVar.d(R.raw.chats_infotip, new String[0]);
        wbVar.b.setText(charSequence);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(2);
        return b(wbVar, 1500);
    }

    public final oc u(String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        lc lcVar = new lc(W(), f6Var);
        lcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        lcVar.b.setText(str);
        lcVar.c.setText(str2);
        return b(lcVar, 1500);
    }

    public final oc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        wb wbVar = new wb(W, f6Var);
        wbVar.setBackground(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var), 12);
        wbVar.a.setImageResource(i10);
        wbVar.b.setText(charSequence);
        wbVar.b.setSingleLine(false);
        wbVar.b.setLines(2);
        wbVar.b.setMaxLines(4);
        TextView textView = wbVar.b;
        textView.setMaxWidth(ci.f4.a(textView.getText(), wbVar.b.getPaint()));
        wbVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) wbVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        wbVar.setWrapWidth();
        return b(wbVar, 5000);
    }

    public final oc y(int i10, TLRPC.Document document, gg.n nVar) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        wb wbVar = new wb(W, f6Var);
        wbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        wbVar.removeView(wbVar.b);
        w5 w5Var = new w5(wbVar.getContext());
        wbVar.b = w5Var;
        w5Var.setTypeface(Typeface.SANS_SERIF);
        wbVar.b.setTextSize(1, 15.0f);
        wbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        wbVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new x5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        wbVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            mc mcVar = new mc(W(), f6Var, true);
            mcVar.e(LocaleController.getString(R.string.ViewAction));
            mcVar.a = nVar;
            wbVar.setButton(mcVar);
        }
        wbVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        wbVar.addView(wbVar.b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(wbVar, 2750);
    }

    public vc(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = f6Var;
    }
}
