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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oc {
    public final org.telegram.ui.ActionBar.o2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.b6 c;

    public oc(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == null || o2Var.getLastStoryViewer() == null || !o2Var.getLastStoryViewer().attachedToParent()) {
            this.a = o2Var;
            this.b = null;
            this.c = o2Var != null ? o2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            ih.i4 currentPeerView = o2Var.getLastStoryViewer().j0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.Y0 : null;
            this.c = o2Var.getLastStoryViewer().y;
        }
    }

    public static gc A(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        return z(o2Var, z10 ? 3 : 4, 0, b6Var);
    }

    public static gc B(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, c3.d dVar, org.telegram.ui.me meVar, org.telegram.ui.ActionBar.b6 b6Var) {
        ob obVar = new ob(o2Var.getParentActivity(), b6Var);
        obVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        obVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            ec ecVar = new ec(o2Var.getParentActivity(), b6Var, true);
            ecVar.a = dVar;
            ecVar.b = meVar;
            obVar.setButton(ecVar);
        }
        return gc.g(o2Var, obVar, z10 ? 1500 : 5000);
    }

    public static gc C(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        obVar.d(R.raw.ic_admin, "Shield");
        obVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return gc.g(o2Var, obVar, 1500);
    }

    public static gc D(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        obVar.d(R.raw.ic_ban, "Hand");
        obVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return gc.g(o2Var, obVar, 1500);
    }

    public static gc F(FrameLayout frameLayout, boolean z10) {
        return new oc(frameLayout, null).m(z10 ? nc.h : nc.e, 1, -115203550, -1, null);
    }

    public static gc S(int i9, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        String string;
        ob obVar = new ob(o2Var.getParentActivity(), b6Var);
        boolean z10 = true;
        if (i9 == 0) {
            string = LocaleController.getString(R.string.SoundOnHint);
        } else {
            if (i9 != 1) {
                throw new IllegalArgumentException();
            }
            string = LocaleController.getString(R.string.SoundOffHint);
            z10 = false;
        }
        if (z10) {
            obVar.d(R.raw.sound_on, new String[0]);
        } else {
            obVar.d(R.raw.sound_off, new String[0]);
        }
        obVar.b.setText(string);
        return gc.g(o2Var, obVar, 1500);
    }

    public static oc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return new oc(cb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.f3 ? new oc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static oc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var) {
        return new oc(frameLayout, b6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.o2 o2Var) {
        return (o2Var == null || o2Var.getParentActivity() == null || o2Var.getLayoutContainer() == null) ? false : true;
    }

    public static oc a0(org.telegram.ui.ActionBar.o2 o2Var) {
        return o2Var == null ? X() : new oc(o2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.y1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static gc d(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (z10) {
            obVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            obVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        obVar.b.setText(AndroidUtilities.replaceTags(string));
        return gc.g(o2Var, obVar, 1500);
    }

    public static gc j(org.telegram.ui.ActionBar.o2 o2Var) {
        return a0(o2Var).k(false);
    }

    public static gc l(String str, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        obVar.b.setText(AndroidUtilities.replaceTags(string));
        obVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return gc.g(o2Var, obVar, 5000);
    }

    public static gc v(Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, int i9, long j10, int i10, int i11, int i12, int i13, boolean z10, e5.w wVar) {
        ob obVar;
        SpannableStringBuilder replaceTags;
        gc g10;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || o2Var == null || i9 > 1 || j10 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            obVar = new ob(i11, i12, context, o2Var != null ? o2Var.getResourceProvider() : null);
        } else {
            obVar = new rb(i10, o2Var);
        }
        ob obVar2 = obVar;
        int i14 = 0;
        boolean z11 = wVar != null;
        org.telegram.ui.wq wqVar = wVar != null ? new org.telegram.ui.wq(6, new boolean[]{false}, wVar) : null;
        int i15 = 2;
        if (i9 > 1) {
            replaceTags = i10 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i9, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i9, new Object[0]));
            obVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            if (i10 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new hc(i15) : new hc(i14));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new hc(i14));
            }
            obVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            e5.w wVar2 = new e5.w(wqVar, o2Var, j10, 20);
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                replaceTags = i10 <= 1 ? o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, wVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, wVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                if (i10 <= 1) {
                    int i16 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i16, UserObject.getFirstName(user)), -1, 2, wVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i16, UserObject.getFirstName(user)));
                } else {
                    int i17 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = o2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, wVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                }
            }
            obVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        obVar2.b.setText(replaceTags);
        if (z11) {
            ec ecVar = new ec(obVar2.getContext(), o2Var != null ? o2Var.getResourceProvider() : null, true, true);
            ecVar.a = null;
            ecVar.b = wqVar;
            obVar2.setButton(ecVar);
        }
        obVar2.postDelayed(new ic(obVar2, 1), 300);
        if (frameLayout != null) {
            g10 = gc.f(frameLayout, obVar2, i13);
        } else {
            if (o2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = gc.g(o2Var, obVar2, i13);
        }
        if (obVar2 instanceof rb) {
            obVar2.b.setSingleLine(false);
            obVar2.b.setMaxLines(2);
            ((rb) obVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gc x(Activity activity, FrameLayout frameLayout, int i9, long j10, int i10, int i11) {
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        ob obVar = new ob(i10, i11, activity, null);
        if (i9 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i9, new Object[0])));
            obVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                obVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i12 = -1;
                obVar.b.setText(spannableStringBuilder);
                if (i12 > 0) {
                    obVar.postDelayed(new ic(obVar, 0), i12);
                }
                return gc.f(frameLayout, obVar, 1500);
            }
            if (DialogObject.isChatDialog(j10)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
            }
            obVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        spannableStringBuilder = replaceTags;
        i12 = 300;
        obVar.b.setText(spannableStringBuilder);
        if (i12 > 0) {
        }
        return gc.f(frameLayout, obVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gc z(org.telegram.ui.ActionBar.o2 o2Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        String formatString;
        boolean z10;
        ob obVar = new ob(o2Var.getParentActivity(), b6Var);
        boolean z11 = true;
        if (i9 == 0) {
            formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        } else if (i9 == 1) {
            formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 8, new Object[0]));
        } else if (i9 == 2) {
            formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Days", 2, new Object[0]));
        } else {
            if (i9 != 3) {
                if (i9 == 4) {
                    formatString = LocaleController.getString(R.string.NotificationsUnmutedHint);
                    z10 = false;
                    z11 = false;
                    if (z11) {
                    }
                    obVar.b.setText(formatString);
                    return gc.g(o2Var, obVar, 1500);
                }
                if (i9 != 5) {
                    throw new IllegalArgumentException();
                }
                formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i10));
                z10 = true;
                if (z11) {
                    obVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    obVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    obVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                obVar.b.setText(formatString);
                return gc.g(o2Var, obVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (z11) {
        }
        obVar.b.setText(formatString);
        return gc.g(o2Var, obVar, 1500);
    }

    public final gc E(org.telegram.ui.ActionBar.b6 b6Var) {
        ob obVar = new ob(W(), b6Var);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(obVar, 1500);
    }

    public final gc G(int i9, int i10, CharSequence charSequence) {
        ob obVar = new ob(W(), this.c);
        obVar.c(i9, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i11 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i11 >= i10) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i11++;
            }
            charSequence = spannableStringBuilder;
        }
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(i10);
        obVar.b.setText(charSequence);
        return b(obVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc H(int i9, CharSequence charSequence) {
        return Q(i9, 36, charSequence);
    }

    public final gc I(int i9, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        ob obVar = new ob(W, b6Var);
        if (i9 != 0) {
            obVar.c(i9, 36, 36, new String[0]);
        } else {
            obVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) obVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setTextDirection(5);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        obVar.b.setText(charSequence);
        ec ecVar = new ec(W(), b6Var, true, z10);
        ecVar.e(charSequence2);
        ecVar.a = runnable;
        obVar.setButton(ecVar);
        return b(obVar, i10);
    }

    public final gc J(int i9, CharSequence charSequence, String str, Runnable runnable) {
        return I(i9, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final gc K(int i9, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        dc dcVar = new dc(W, b6Var);
        dcVar.c(i9, 36, 36, new String[0]);
        dcVar.b.setText(str);
        dcVar.c.setText(charSequence);
        ec ecVar = new ec(W(), b6Var, true);
        ecVar.e(str2);
        ecVar.a = runnable;
        dcVar.setButton(ecVar);
        return b(dcVar, 5000);
    }

    public final gc L(Drawable drawable, CharSequence charSequence) {
        ob obVar = new ob(W(), this.c);
        obVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.vo0) {
            ((org.telegram.ui.vo0) drawable).e(obVar.a);
        }
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, 2750);
    }

    public final gc M(CharSequence charSequence, CharSequence charSequence2, int i9) {
        dc dcVar = new dc(W(), this.c);
        dcVar.c(i9, 36, 36, new String[0]);
        dcVar.b.setText(charSequence);
        dcVar.c.setText(charSequence2);
        return b(dcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc N(String str, String str2) {
        dc dcVar = new dc(W(), this.c);
        dcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        dcVar.b.setText(str);
        dcVar.c.setText(str2);
        return b(dcVar, 5000);
    }

    public final gc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new gb();
        }
        cc ccVar = new cc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        o9 o9Var = ccVar.a;
        o9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ccVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ccVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(ccVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final gc P(int i9, CharSequence charSequence) {
        ob obVar = new ob(W(), this.c);
        obVar.c(i9, 36, 36, new String[0]);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setMaxLines(4);
        return b(obVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc Q(int i9, int i10, CharSequence charSequence) {
        ob obVar = new ob(W(), this.c);
        obVar.c(i9, i10, i10, new String[0]);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new gb();
        }
        cc ccVar = new cc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        o9 o9Var = ccVar.a;
        o9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ccVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ccVar.c.setVisibility(8);
        return b(ccVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final gc T(String str) {
        ob obVar = new ob(W(), null);
        obVar.d(R.raw.contact_check, new String[0]);
        obVar.b.setText(str);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        eb ebVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (isEmpty) {
            ob obVar = new ob(W(), b6Var);
            obVar.b.setText(str);
            obVar.b.setSingleLine(false);
            obVar.b.setMaxLines(2);
            ebVar = obVar;
        } else {
            dc dcVar = new dc(W(), b6Var);
            dcVar.b.setText(str);
            dcVar.c.setText((CharSequence) null);
            ebVar = dcVar;
        }
        ebVar.setTimer();
        ec ecVar = new ec(W(), b6Var, true, z10);
        ecVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ecVar.a = runnable;
        ecVar.b = runnable2;
        ebVar.setButton(ecVar);
        return b(ebVar, 5000);
    }

    public final gc V(List list, CharSequence charSequence, CharSequence charSequence2, org.telegram.ui.Cells.e3 e3Var) {
        float f10;
        int i9;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        fc fcVar = new fc(W, b6Var, z10);
        if (list != null) {
            int i10 = 0;
            i9 = 0;
            for (int i11 = 3; i10 < list.size() && i9 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i9 + 1;
                    fcVar.a.setCount(i12);
                    fcVar.a.b(i9, tLObject, UserConfig.selectedAccount);
                    i9 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                fcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                fcVar.a.setScaleX(1.2f);
                fcVar.a.setScaleY(1.2f);
            } else {
                fcVar.a.setScaleX(1.0f);
                fcVar.a.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i9 = 0;
        }
        fcVar.a.a(false);
        if (charSequence2 != null) {
            fcVar.b.setSingleLine(true);
            fcVar.b.setMaxLines(1);
            fcVar.b.setText(charSequence);
            fcVar.c.setText(charSequence2);
            fcVar.c.setSingleLine(false);
            fcVar.c.setMaxLines(3);
            if (fcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i9) * 12));
                if (i9 == 1) {
                    dp += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) fcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) fcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            fcVar.b.setSingleLine(false);
            fcVar.b.setMaxLines(4);
            fcVar.b.setText(charSequence);
            if (fcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i9) * 12));
                if (i9 == 1) {
                    fcVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) fcVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) fcVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (e3Var != null) {
            ec ecVar = new ec(W(), b6Var, true);
            ecVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ecVar.a = (Runnable) e3Var.b;
            ecVar.b = (Runnable) e3Var.c;
            fcVar.setButton(ecVar);
        }
        return b(fcVar, 5000);
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

    public final gc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.y1 ? new gb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final gc b(eb ebVar, int i9) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        return o2Var != null ? gc.g(o2Var, ebVar, i9) : gc.f(this.b, ebVar, i9);
    }

    public final gc c(CharSequence charSequence) {
        if (W() == null) {
            return new gb();
        }
        ob obVar = new ob(W(), this.c);
        obVar.d(R.raw.ic_admin, "Shield");
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        obVar.b.setText(charSequence);
        return b(obVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (LaunchActivity.y1) {
            if (TextUtils.isEmpty(str)) {
                gc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                gc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.y1) {
            if (tL_error == null) {
                gc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                gc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final gc e(boolean z10) {
        String string;
        ob obVar = new ob(W(), this.c);
        if (z10) {
            obVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            obVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        obVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(obVar, 1500);
    }

    public final boolean e0(int i9, long j10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (o2Var = this.a) != null) {
            rb rbVar = new rb(i9, o2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i9 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new hc(0)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new hc(0));
                rbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                rbVar.b.setText(replaceSingleTag);
                rbVar.b.setSingleLine(false);
                rbVar.b.setMaxLines(2);
                gc b10 = b(rbVar, 3500);
                rbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final gc f(int i9, Runnable runnable) {
        ob obVar = new ob(W(), null);
        obVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i9, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i10, indexOf2));
        valueOf.setSpan(new lc(0, runnable), indexOf, indexOf2 - 1, 33);
        obVar.b.setText(valueOf);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        return b(obVar, 5000);
    }

    public final gc g(String str, ArrayList arrayList) {
        fc fcVar = new fc(W(), this.c, false);
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i9 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i9 + 1;
                fcVar.a.setCount(i11);
                fcVar.a.b(i9, tLObject, UserConfig.selectedAccount);
                i9 = i11;
            }
        }
        if (arrayList.size() == 1) {
            fcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            fcVar.a.setScaleX(1.2f);
            fcVar.a.setScaleY(1.2f);
        } else {
            fcVar.a.setScaleX(1.0f);
            fcVar.a.setScaleY(1.0f);
        }
        fcVar.a.a(false);
        fcVar.b.setSingleLine(false);
        fcVar.b.setMaxLines(2);
        fcVar.b.setText(str);
        if (fcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i9) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) fcVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) fcVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            fcVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i9 - 1) * 12)));
        }
        return b(fcVar, 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final gc h(TLRPC.Document document, int i9, final Utilities.Callback callback) {
        q80 q80Var;
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet inputStickerSet2 = MessageObject.getInputStickerSet(document);
        if (inputStickerSet2 == null) {
            return null;
        }
        final int i11 = 1;
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet2, true);
        final int i12 = 0;
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            return q(document, i9 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i9 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.jc
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
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
        SpannableStringBuilder spannableStringBuilder = i9 == 1 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>"))) : i9 == 2 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>"))) : new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (indexOf >= 0) {
            q80Var = new q80(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), b6Var);
            spannableStringBuilder.setSpan(q80Var, indexOf, indexOf + 11, 33);
            int i13 = org.telegram.ui.ActionBar.f6.Hi;
            q80Var.a(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), 32), i0.a.k(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), 72));
        } else {
            q80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.jc
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
        };
        Context W = W();
        nb nbVar = new nb(W, b6Var);
        l80 l80Var = new l80(W, null);
        nbVar.d = l80Var;
        l80Var.setDisablePaddingsOffset(true);
        l80Var.setSingleLine();
        l80Var.setTypeface(Typeface.SANS_SERIF);
        l80Var.setTextSize(1, 15.0f);
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        l80Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        nbVar.b.setVisibility(8);
        nbVar.addView(l80Var, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i14 = org.telegram.ui.ActionBar.f6.Hi;
        nbVar.setTextColor(nbVar.getThemedColor(i14));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i10 = 0;
            nbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i10 = 0;
        }
        nbVar.e(document, new String[i10]);
        nbVar.b.setTextSize(1, 14.0f);
        nbVar.b.setSingleLine(i10);
        nbVar.b.setMaxLines(3);
        l80Var.setText(spannableStringBuilder);
        l80Var.setTextSize(1, 14.0f);
        l80Var.setSingleLine(i10);
        l80Var.setMaxLines(3);
        ec ecVar = new ec(W(), b6Var, true);
        ecVar.e(string);
        ecVar.a = runnable;
        nbVar.setButton(ecVar);
        gc b10 = b(nbVar, 2750);
        if (q80Var != null) {
            lb lbVar = b10.e;
            if (lbVar instanceof nb) {
                q80Var.b = ((nb) lbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new kc(i9, b10, currentTimeMillis));
        return b10;
    }

    public final gc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new gb();
        }
        ob obVar = new ob(W(), null);
        obVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        obVar.b.setText(str);
        return b(obVar, 1500);
    }

    public final gc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new gb();
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (!z10) {
            ob obVar = new ob(W(), b6Var);
            obVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            obVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(obVar, 1500);
        }
        dc dcVar = new dc(W(), b6Var);
        dcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        dcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        dcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(dcVar, 2750);
    }

    public final gc m(nc ncVar, int i9, int i10, int i11, org.telegram.ui.ActionBar.b6 b6Var) {
        ob obVar = (i10 == 0 || i11 == 0) ? new ob(W(), b6Var) : new ob(i10, i11, W(), b6Var);
        mc mcVar = ncVar.d;
        obVar.d(mcVar.a, mcVar.b);
        TextView textView = obVar.b;
        String str = ncVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(ncVar.c ? LocaleController.formatPluralString(str, i9, new Object[0]) : LocaleController.getString(str, ncVar.b), new hc(1)));
        int i12 = ncVar.d.c;
        if (i12 != 0) {
            obVar.setIconPaddingBottom(i12);
        }
        return b(obVar, 1500);
    }

    public final gc n(nc ncVar, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        return m(ncVar, i9, 0, 0, b6Var);
    }

    public final gc o(nc ncVar, org.telegram.ui.ActionBar.b6 b6Var) {
        return m(ncVar, 1, 0, 0, b6Var);
    }

    public final gc p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        bc bcVar = new bc(W, b6Var);
        k5 k5Var = new k5(1, UserConfig.selectedAccount, j10);
        o9 o9Var = bcVar.a;
        o9Var.setAnimatedEmojiDrawable(k5Var);
        o9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var), PorterDuff.Mode.SRC_IN));
        bcVar.b.setText(str);
        bcVar.c.setText(str2);
        return b(bcVar, 2750);
    }

    public final gc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        ob obVar = new ob(W, b6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            obVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        obVar.e(document, new String[0]);
        if (obVar.a.getImageReceiver() != null) {
            obVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        obVar.b.setText(charSequence);
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        ec ecVar = new ec(W(), b6Var, true);
        ecVar.e(str);
        ecVar.a = runnable;
        obVar.setButton(ecVar);
        return b(obVar, 2750);
    }

    public final gc r(TLRPC.Document document, String str) {
        ob obVar = new ob(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            obVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        obVar.e(document, new String[0]);
        obVar.b.setText(str);
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        return b(obVar, 2750);
    }

    public final gc s(TLRPC.Document document, String str, CharSequence charSequence) {
        dc dcVar = new dc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        pi0 pi0Var = dcVar.a;
        if (isTextColorEmoji) {
            pi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        pi0Var.setAutoRepeat(true);
        pi0Var.g(36, 36, document);
        dcVar.b.setText(str);
        dcVar.c.setText(charSequence);
        return b(dcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final gc t(CharSequence charSequence, org.telegram.ui.ActionBar.b6 b6Var) {
        ob obVar = new ob(W(), b6Var);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc u(String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        dc dcVar = new dc(W(), b6Var);
        dcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        dcVar.b.setText(str);
        dcVar.c.setText(str2);
        return b(dcVar, 1500);
    }

    public final gc w(int i9, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        ob obVar = new ob(W, b6Var);
        obVar.setBackground(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Fi, b6Var), 12);
        obVar.a.setImageResource(i9);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setLines(2);
        obVar.b.setMaxLines(4);
        TextView textView = obVar.b;
        textView.setMaxWidth(kh.x3.a(textView.getText(), obVar.b.getPaint()));
        obVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) obVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        obVar.setWrapWidth();
        return b(obVar, 5000);
    }

    public final gc y(int i9, TLRPC.Document document, h3.y yVar) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        ob obVar = new ob(W, b6Var);
        obVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        obVar.removeView(obVar.b);
        s5 s5Var = new s5(obVar.getContext());
        obVar.b = s5Var;
        s5Var.setTypeface(Typeface.SANS_SERIF);
        obVar.b.setTextSize(1, 15.0f);
        obVar.b.setEllipsize(TextUtils.TruncateAt.END);
        obVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new t5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        obVar.b.setText(new SpannableStringBuilder(i9 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i9, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (yVar != null) {
            ec ecVar = new ec(W(), b6Var, true);
            ecVar.e(LocaleController.getString(R.string.ViewAction));
            ecVar.a = yVar;
            obVar.setButton(ecVar);
        }
        obVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, b6Var));
        obVar.addView(obVar.b, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(obVar, 2750);
    }

    public oc(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = b6Var;
    }
}
