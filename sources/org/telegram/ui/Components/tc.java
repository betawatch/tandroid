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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tc {
    public final org.telegram.ui.ActionBar.o2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.c6 c;

    public tc(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == null || o2Var.getLastStoryViewer() == null || !o2Var.getLastStoryViewer().attachedToParent()) {
            this.a = o2Var;
            this.b = null;
            this.c = o2Var != null ? o2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            lh.d4 currentPeerView = o2Var.getLastStoryViewer().j0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.Y0 : null;
            this.c = o2Var.getLastStoryViewer().y;
        }
    }

    public static mc A(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        return z(o2Var, z10 ? 3 : 4, 0, c6Var);
    }

    public static mc B(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, ag.z1 z1Var, org.telegram.ui.ke keVar, org.telegram.ui.ActionBar.c6 c6Var) {
        ub ubVar = new ub(o2Var.getParentActivity(), c6Var);
        ubVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        ubVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            kc kcVar = new kc(o2Var.getParentActivity(), c6Var, true);
            kcVar.a = z1Var;
            kcVar.b = keVar;
            ubVar.setButton(kcVar);
        }
        return mc.g(o2Var, ubVar, z10 ? 1500 : 5000);
    }

    public static mc C(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
        ubVar.d(R.raw.ic_admin, "Shield");
        ubVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return mc.g(o2Var, ubVar, 1500);
    }

    public static mc D(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
        ubVar.d(R.raw.ic_ban, "Hand");
        ubVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return mc.g(o2Var, ubVar, 1500);
    }

    public static mc F(FrameLayout frameLayout, boolean z10) {
        return new tc(frameLayout, null).m(z10 ? sc.h : sc.e, 1, -115203550, -1, null);
    }

    public static mc S(int i10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        ub ubVar = new ub(o2Var.getParentActivity(), c6Var);
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
            ubVar.d(R.raw.sound_on, new String[0]);
        } else {
            ubVar.d(R.raw.sound_off, new String[0]);
        }
        ubVar.b.setText(string);
        return mc.g(o2Var, ubVar, 1500);
    }

    public static tc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return new tc(hb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.f3 ? new tc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static tc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        return new tc(frameLayout, c6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.o2 o2Var) {
        return (o2Var == null || o2Var.getParentActivity() == null || o2Var.getLayoutContainer() == null) ? false : true;
    }

    public static tc a0(org.telegram.ui.ActionBar.o2 o2Var) {
        return o2Var == null ? X() : new tc(o2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.y1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static mc d(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (z10) {
            ubVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ubVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ubVar.b.setText(AndroidUtilities.replaceTags(string));
        return mc.g(o2Var, ubVar, 1500);
    }

    public static mc j(org.telegram.ui.ActionBar.o2 o2Var) {
        return a0(o2Var).k(false);
    }

    public static mc l(String str, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        ubVar.b.setText(AndroidUtilities.replaceTags(string));
        ubVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return mc.g(o2Var, ubVar, 5000);
    }

    public static mc v(Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, g5.v vVar) {
        ub ubVar;
        SpannableStringBuilder replaceTags;
        mc g10;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || o2Var == null || i10 > 1 || j10 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            ubVar = new ub(i12, i13, context, o2Var != null ? o2Var.getResourceProvider() : null);
        } else {
            ubVar = new xb(i11, o2Var);
        }
        ub ubVar2 = ubVar;
        boolean z11 = vVar != null;
        z2 z2Var = vVar != null ? new z2(3, new boolean[]{false}, vVar) : null;
        int i15 = 2;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            ubVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new g5(4) : new g5(i15));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new g5(i15));
            }
            ubVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            g5.v vVar2 = new g5.v(z2Var, o2Var, j10, 19);
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                replaceTags = i11 <= 1 ? o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                if (i11 <= 1) {
                    int i16 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i16, UserObject.getFirstName(user)), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i16, UserObject.getFirstName(user)));
                } else {
                    int i17 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                }
            }
            ubVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        ubVar2.b.setText(replaceTags);
        if (z11) {
            kc kcVar = new kc(ubVar2.getContext(), o2Var != null ? o2Var.getResourceProvider() : null, true, true);
            kcVar.a = null;
            kcVar.b = z2Var;
            ubVar2.setButton(kcVar);
        }
        ubVar2.postDelayed(new nc(ubVar2, 1), 300);
        if (frameLayout != null) {
            g10 = mc.f(frameLayout, ubVar2, i14);
        } else {
            if (o2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = mc.g(o2Var, ubVar2, i14);
        }
        if (ubVar2 instanceof xb) {
            ubVar2.b.setSingleLine(false);
            ubVar2.b.setMaxLines(2);
            ((xb) ubVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mc x(Activity activity, FrameLayout frameLayout, int i10, long j10, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        ub ubVar = new ub(i11, i12, activity, null);
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            ubVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                ubVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                ubVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    ubVar.postDelayed(new nc(ubVar, 0), i13);
                }
                return mc.f(frameLayout, ubVar, 1500);
            }
            if (DialogObject.isChatDialog(j10)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
            }
            ubVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        spannableStringBuilder = replaceTags;
        i13 = 300;
        ubVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return mc.f(frameLayout, ubVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mc z(org.telegram.ui.ActionBar.o2 o2Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        String formatString;
        boolean z10;
        ub ubVar = new ub(o2Var.getParentActivity(), c6Var);
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
                    ubVar.b.setText(formatString);
                    return mc.g(o2Var, ubVar, 1500);
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException();
                }
                formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                z10 = true;
                if (z11) {
                    ubVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    ubVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ubVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ubVar.b.setText(formatString);
                return mc.g(o2Var, ubVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (z11) {
        }
        ubVar.b.setText(formatString);
        return mc.g(o2Var, ubVar, 1500);
    }

    public final mc E(org.telegram.ui.ActionBar.c6 c6Var) {
        ub ubVar = new ub(W(), c6Var);
        ubVar.d(R.raw.chats_infotip, new String[0]);
        ubVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(ubVar, 1500);
    }

    public final mc G(int i10, int i11, CharSequence charSequence) {
        ub ubVar = new ub(W(), this.c);
        ubVar.c(i10, 36, 36, new String[0]);
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
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(i11);
        ubVar.b.setText(charSequence);
        return b(ubVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final mc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final mc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ub ubVar = new ub(W, c6Var);
        if (i10 != 0) {
            ubVar.c(i10, 36, 36, new String[0]);
        } else {
            ubVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ubVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        ubVar.b.setTextSize(1, 14.0f);
        ubVar.b.setTextDirection(5);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(3);
        ubVar.b.setText(charSequence);
        kc kcVar = new kc(W(), c6Var, true, z10);
        kcVar.e(charSequence2);
        kcVar.a = runnable;
        ubVar.setButton(kcVar);
        return b(ubVar, i11);
    }

    public final mc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final mc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        jc jcVar = new jc(W, c6Var);
        jcVar.c(i10, 36, 36, new String[0]);
        jcVar.b.setText(str);
        jcVar.c.setText(charSequence);
        kc kcVar = new kc(W(), c6Var, true);
        kcVar.e(str2);
        kcVar.a = runnable;
        jcVar.setButton(kcVar);
        return b(jcVar, 5000);
    }

    public final mc L(Drawable drawable, CharSequence charSequence) {
        ub ubVar = new ub(W(), this.c);
        ubVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.uo0) {
            ((org.telegram.ui.uo0) drawable).e(ubVar.a);
        }
        ubVar.b.setText(charSequence);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(2);
        return b(ubVar, 2750);
    }

    public final mc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        jc jcVar = new jc(W(), this.c);
        jcVar.c(i10, 36, 36, new String[0]);
        jcVar.b.setText(charSequence);
        jcVar.c.setText(charSequence2);
        return b(jcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final mc N(String str, String str2) {
        jc jcVar = new jc(W(), this.c);
        jcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) jcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        jcVar.b.setText(str);
        jcVar.c.setText(str2);
        return b(jcVar, 5000);
    }

    public final mc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new lb();
        }
        ic icVar = new ic(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        t9 t9Var = icVar.a;
        t9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = icVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = icVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(icVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final mc P(int i10, CharSequence charSequence) {
        ub ubVar = new ub(W(), this.c);
        ubVar.c(i10, 36, 36, new String[0]);
        ubVar.b.setText(charSequence);
        ubVar.b.setSingleLine(false);
        ubVar.b.setTextSize(1, 14.0f);
        ubVar.b.setMaxLines(4);
        return b(ubVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final mc Q(int i10, int i11, CharSequence charSequence) {
        ub ubVar = new ub(W(), this.c);
        ubVar.c(i10, i11, i11, new String[0]);
        ubVar.b.setText(charSequence);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(2);
        return b(ubVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final mc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new lb();
        }
        ic icVar = new ic(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        t9 t9Var = icVar.a;
        t9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = icVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        icVar.c.setVisibility(8);
        return b(icVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final mc T(String str) {
        ub ubVar = new ub(W(), null);
        ubVar.d(R.raw.contact_check, new String[0]);
        ubVar.b.setText(str);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(2);
        return b(ubVar, 1500);
    }

    public final mc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        jb jbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        if (isEmpty) {
            ub ubVar = new ub(W(), c6Var);
            ubVar.b.setText(str);
            ubVar.b.setSingleLine(false);
            ubVar.b.setMaxLines(2);
            jbVar = ubVar;
        } else {
            jc jcVar = new jc(W(), c6Var);
            jcVar.b.setText(str);
            jcVar.c.setText((CharSequence) null);
            jbVar = jcVar;
        }
        jbVar.setTimer();
        kc kcVar = new kc(W(), c6Var, true, z10);
        kcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        kcVar.a = runnable;
        kcVar.b = runnable2;
        jbVar.setButton(kcVar);
        return b(jbVar, 5000);
    }

    public final mc V(List list, CharSequence charSequence, CharSequence charSequence2, oc.i iVar) {
        float f9;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        lc lcVar = new lc(W, c6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    lcVar.a.setCount(i13);
                    lcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f9 = 4.0f;
            if (list.size() == 1) {
                lcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                lcVar.a.setScaleX(1.2f);
                lcVar.a.setScaleY(1.2f);
            } else {
                lcVar.a.setScaleX(1.0f);
                lcVar.a.setScaleY(1.0f);
            }
        } else {
            f9 = 4.0f;
            i10 = 0;
        }
        lcVar.a.a(false);
        if (charSequence2 != null) {
            lcVar.b.setSingleLine(true);
            lcVar.b.setMaxLines(1);
            lcVar.b.setText(charSequence);
            lcVar.c.setText(charSequence2);
            lcVar.c.setSingleLine(false);
            lcVar.c.setMaxLines(3);
            if (lcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f9);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) lcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) lcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            lcVar.b.setSingleLine(false);
            lcVar.b.setMaxLines(4);
            lcVar.b.setText(charSequence);
            if (lcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    lcVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f9);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) lcVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) lcVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (iVar != null) {
            kc kcVar = new kc(W(), c6Var, true);
            kcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            kcVar.a = (Runnable) iVar.b;
            kcVar.b = (Runnable) iVar.c;
            lcVar.setButton(kcVar);
        }
        return b(lcVar, 5000);
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

    public final mc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.y1 ? new lb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final mc b(jb jbVar, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        return o2Var != null ? mc.g(o2Var, jbVar, i10) : mc.f(this.b, jbVar, i10);
    }

    public final mc c(CharSequence charSequence) {
        if (W() == null) {
            return new lb();
        }
        ub ubVar = new ub(W(), this.c);
        ubVar.d(R.raw.ic_admin, "Shield");
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(3);
        ubVar.b.setText(charSequence);
        return b(ubVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (LaunchActivity.y1) {
            if (TextUtils.isEmpty(str)) {
                mc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                mc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.y1) {
            if (tL_error == null) {
                mc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                mc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final mc e(boolean z10) {
        String string;
        ub ubVar = new ub(W(), this.c);
        if (z10) {
            ubVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ubVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ubVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(ubVar, 1500);
    }

    public final boolean e0(int i10, long j10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (o2Var = this.a) != null) {
            xb xbVar = new xb(i10, o2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new g5(2)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new g5(2));
                xbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                xbVar.b.setText(replaceSingleTag);
                xbVar.b.setSingleLine(false);
                xbVar.b.setMaxLines(2);
                mc b10 = b(xbVar, 3500);
                xbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final mc f(int i10, Runnable runnable) {
        ub ubVar = new ub(W(), null);
        ubVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new qc(0, runnable), indexOf, indexOf2 - 1, 33);
        ubVar.b.setText(valueOf);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(3);
        return b(ubVar, 5000);
    }

    public final mc g(String str, ArrayList arrayList) {
        lc lcVar = new lc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                lcVar.a.setCount(i12);
                lcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            lcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            lcVar.a.setScaleX(1.2f);
            lcVar.a.setScaleY(1.2f);
        } else {
            lcVar.a.setScaleX(1.0f);
            lcVar.a.setScaleY(1.0f);
        }
        lcVar.a.a(false);
        lcVar.b.setSingleLine(false);
        lcVar.b.setMaxLines(2);
        lcVar.b.setText(str);
        if (lcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) lcVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) lcVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            lcVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(lcVar, 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final mc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        d90 d90Var;
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
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.oc
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
            d90Var = new d90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), c6Var);
            spannableStringBuilder.setSpan(d90Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.g6.Hi;
            d90Var.a(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 32), i0.a.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 72));
        } else {
            d90Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.oc
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
        tb tbVar = new tb(W, c6Var);
        y80 y80Var = new y80(W, null);
        tbVar.d = y80Var;
        y80Var.setDisablePaddingsOffset(true);
        y80Var.setSingleLine();
        y80Var.setTypeface(Typeface.SANS_SERIF);
        y80Var.setTextSize(1, 15.0f);
        y80Var.setEllipsize(TextUtils.TruncateAt.END);
        y80Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        tbVar.b.setVisibility(8);
        tbVar.addView(y80Var, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.g6.Hi;
        tbVar.setTextColor(tbVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            tbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        tbVar.e(document, new String[i11]);
        tbVar.b.setTextSize(1, 14.0f);
        tbVar.b.setSingleLine(i11);
        tbVar.b.setMaxLines(3);
        y80Var.setText(spannableStringBuilder);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setSingleLine(i11);
        y80Var.setMaxLines(3);
        kc kcVar = new kc(W(), c6Var, true);
        kcVar.e(string);
        kcVar.a = runnable;
        tbVar.setButton(kcVar);
        mc b10 = b(tbVar, 2750);
        if (d90Var != null) {
            rb rbVar = b10.e;
            if (rbVar instanceof tb) {
                d90Var.b = ((tb) rbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new pc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final mc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new lb();
        }
        ub ubVar = new ub(W(), null);
        ubVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ubVar.b.setText(str);
        return b(ubVar, 1500);
    }

    public final mc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new lb();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        if (!z10) {
            ub ubVar = new ub(W(), c6Var);
            ubVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ubVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(ubVar, 1500);
        }
        jc jcVar = new jc(W(), c6Var);
        jcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        jcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        jcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(jcVar, 2750);
    }

    public final mc m(sc scVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        ub ubVar = (i11 == 0 || i12 == 0) ? new ub(W(), c6Var) : new ub(i11, i12, W(), c6Var);
        rc rcVar = scVar.d;
        ubVar.d(rcVar.a, rcVar.b);
        TextView textView = ubVar.b;
        String str = scVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(scVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, scVar.b), new g5(3)));
        int i13 = scVar.d.c;
        if (i13 != 0) {
            ubVar.setIconPaddingBottom(i13);
        }
        return b(ubVar, 1500);
    }

    public final mc n(sc scVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(scVar, i10, 0, 0, c6Var);
    }

    public final mc o(sc scVar, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(scVar, 1, 0, 0, c6Var);
    }

    public final mc p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        hc hcVar = new hc(W, c6Var);
        p5 p5Var = new p5(1, UserConfig.selectedAccount, j10);
        t9 t9Var = hcVar.a;
        t9Var.setAnimatedEmojiDrawable(p5Var);
        t9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        hcVar.b.setText(str);
        hcVar.c.setText(str2);
        return b(hcVar, 2750);
    }

    public final mc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ub ubVar = new ub(W, c6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            ubVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ubVar.e(document, new String[0]);
        if (ubVar.a.getImageReceiver() != null) {
            ubVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        ubVar.b.setText(charSequence);
        ubVar.b.setTextSize(1, 14.0f);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(3);
        kc kcVar = new kc(W(), c6Var, true);
        kcVar.e(str);
        kcVar.a = runnable;
        ubVar.setButton(kcVar);
        return b(ubVar, 2750);
    }

    public final mc r(TLRPC.Document document, String str) {
        ub ubVar = new ub(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            ubVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ubVar.e(document, new String[0]);
        ubVar.b.setText(str);
        ubVar.b.setTextSize(1, 14.0f);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(3);
        return b(ubVar, 2750);
    }

    public final mc s(TLRPC.Document document, String str, CharSequence charSequence) {
        jc jcVar = new jc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        aj0 aj0Var = jcVar.a;
        if (isTextColorEmoji) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        jcVar.b.setText(str);
        jcVar.c.setText(charSequence);
        return b(jcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final mc t(CharSequence charSequence, org.telegram.ui.ActionBar.c6 c6Var) {
        ub ubVar = new ub(W(), c6Var);
        ubVar.d(R.raw.chats_infotip, new String[0]);
        ubVar.b.setText(charSequence);
        ubVar.b.setSingleLine(false);
        ubVar.b.setMaxLines(2);
        return b(ubVar, 1500);
    }

    public final mc u(String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        jc jcVar = new jc(W(), c6Var);
        jcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        jcVar.b.setText(str);
        jcVar.c.setText(str2);
        return b(jcVar, 1500);
    }

    public final mc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ub ubVar = new ub(W, c6Var);
        ubVar.setBackground(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var), 12);
        ubVar.a.setImageResource(i10);
        ubVar.b.setText(charSequence);
        ubVar.b.setSingleLine(false);
        ubVar.b.setLines(2);
        ubVar.b.setMaxLines(4);
        TextView textView = ubVar.b;
        textView.setMaxWidth(nh.t3.a(textView.getText(), ubVar.b.getPaint()));
        ubVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ubVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        ubVar.setWrapWidth();
        return b(ubVar, 5000);
    }

    public final mc y(int i10, TLRPC.Document document, j3.y yVar) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ub ubVar = new ub(W, c6Var);
        ubVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ubVar.removeView(ubVar.b);
        x5 x5Var = new x5(ubVar.getContext());
        ubVar.b = x5Var;
        x5Var.setTypeface(Typeface.SANS_SERIF);
        ubVar.b.setTextSize(1, 15.0f);
        ubVar.b.setEllipsize(TextUtils.TruncateAt.END);
        ubVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new y5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        ubVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (yVar != null) {
            kc kcVar = new kc(W(), c6Var, true);
            kcVar.e(LocaleController.getString(R.string.ViewAction));
            kcVar.a = yVar;
            ubVar.setButton(kcVar);
        }
        ubVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        ubVar.addView(ubVar.b, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ubVar, 2750);
    }

    public tc(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = c6Var;
    }
}
