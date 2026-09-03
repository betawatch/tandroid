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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qc {
    public final org.telegram.ui.ActionBar.p2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.g6 c;

    public qc(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == null || p2Var.getLastStoryViewer() == null || !p2Var.getLastStoryViewer().attachedToParent()) {
            this.a = p2Var;
            this.b = null;
            this.c = p2Var != null ? p2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            oh.f4 currentPeerView = p2Var.getLastStoryViewer().k0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.Z0 : null;
            this.c = p2Var.getLastStoryViewer().y;
        }
    }

    public static ic A(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        return z(p2Var, z4 ? 3 : 4, 0, g6Var);
    }

    public static ic B(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, dg.u1 u1Var, org.telegram.ui.re reVar, org.telegram.ui.ActionBar.g6 g6Var) {
        qb qbVar = new qb(p2Var.getParentActivity(), g6Var);
        qbVar.c(z4 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        qbVar.b.setText(LocaleController.getString(z4 ? "MessagePinnedHint" : "MessageUnpinnedHint", z4 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z4) {
            gc gcVar = new gc(p2Var.getParentActivity(), g6Var, true);
            gcVar.a = u1Var;
            gcVar.b = reVar;
            qbVar.setButton(gcVar);
        }
        return ic.g(p2Var, qbVar, z4 ? 1500 : 5000);
    }

    public static ic C(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        qbVar.d(R.raw.ic_admin, "Shield");
        qbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return ic.g(p2Var, qbVar, 1500);
    }

    public static ic D(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        qbVar.d(R.raw.ic_ban, "Hand");
        qbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return ic.g(p2Var, qbVar, 1500);
    }

    public static ic F(FrameLayout frameLayout, boolean z4) {
        return new qc(frameLayout, null).m(z4 ? pc.h : pc.e, 1, -115203550, -1, null);
    }

    public static ic S(int i10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        String string;
        qb qbVar = new qb(p2Var.getParentActivity(), g6Var);
        boolean z4 = true;
        if (i10 == 0) {
            string = LocaleController.getString(R.string.SoundOnHint);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException();
            }
            string = LocaleController.getString(R.string.SoundOffHint);
            z4 = false;
        }
        if (z4) {
            qbVar.d(R.raw.sound_on, new String[0]);
        } else {
            qbVar.d(R.raw.sound_off, new String[0]);
        }
        qbVar.b.setText(string);
        return ic.g(p2Var, qbVar, 1500);
    }

    public static qc X() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return new qc(cb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.h3 ? new qc(((org.telegram.ui.ActionBar.h3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static qc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        return new qc(frameLayout, g6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.p2 p2Var) {
        return (p2Var == null || p2Var.getParentActivity() == null || p2Var.getLayoutContainer() == null) ? false : true;
    }

    public static qc a0(org.telegram.ui.ActionBar.p2 p2Var) {
        return p2Var == null ? X() : new qc(p2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.z1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static ic d(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        String string;
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        if (z4) {
            qbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            qbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        qbVar.b.setText(AndroidUtilities.replaceTags(string));
        return ic.g(p2Var, qbVar, 1500);
    }

    public static ic j(org.telegram.ui.ActionBar.p2 p2Var) {
        return a0(p2Var).k(false);
    }

    public static ic l(String str, org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        String string;
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z4 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z4 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        qbVar.b.setText(AndroidUtilities.replaceTags(string));
        qbVar.d((z4 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return ic.g(p2Var, qbVar, 5000);
    }

    public static ic v(Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z4, i5.v vVar) {
        qb qbVar;
        SpannableStringBuilder replaceTags;
        ic g10;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || p2Var == null || i10 > 1 || j10 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z4) {
            qbVar = new qb(i12, i13, context, p2Var != null ? p2Var.getResourceProvider() : null);
        } else {
            qbVar = new tb(i11, p2Var);
        }
        qb qbVar2 = qbVar;
        int i15 = 0;
        boolean z10 = vVar != null;
        org.telegram.ui.mp mpVar = vVar != null ? new org.telegram.ui.mp(10, new boolean[]{false}, vVar) : null;
        int i16 = 2;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            qbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z4 ? new jc(i16) : new jc(i15));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new jc(i15));
            }
            qbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            i5.v vVar2 = new i5.v(mpVar, p2Var, j10, 18);
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                replaceTags = i11 <= 1 ? p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                if (i11 <= 1) {
                    int i17 = z10 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                } else {
                    int i18 = z10 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = p2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, vVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                }
            }
            qbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        qbVar2.b.setText(replaceTags);
        if (z10) {
            gc gcVar = new gc(qbVar2.getContext(), p2Var != null ? p2Var.getResourceProvider() : null, true, true);
            gcVar.a = null;
            gcVar.b = mpVar;
            qbVar2.setButton(gcVar);
        }
        qbVar2.postDelayed(new kc(qbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = ic.f(frameLayout, qbVar2, i14);
        } else {
            if (p2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = ic.g(p2Var, qbVar2, i14);
        }
        if (qbVar2 instanceof tb) {
            qbVar2.b.setSingleLine(false);
            qbVar2.b.setMaxLines(2);
            ((tb) qbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ic x(Activity activity, FrameLayout frameLayout, int i10, long j10, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        SpannableStringBuilder spannableStringBuilder;
        int i13;
        qb qbVar = new qb(i11, i12, activity, null);
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            qbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                qbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                qbVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    qbVar.postDelayed(new kc(qbVar, 0), i13);
                }
                return ic.f(frameLayout, qbVar, 1500);
            }
            if (DialogObject.isChatDialog(j10)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
            }
            qbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        spannableStringBuilder = replaceTags;
        i13 = 300;
        qbVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return ic.f(frameLayout, qbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ic z(org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        String formatString;
        boolean z4;
        qb qbVar = new qb(p2Var.getParentActivity(), g6Var);
        boolean z10 = true;
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
                    z4 = false;
                    z10 = false;
                    if (z10) {
                    }
                    qbVar.b.setText(formatString);
                    return ic.g(p2Var, qbVar, 1500);
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException();
                }
                formatString = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                z4 = true;
                if (z10) {
                    qbVar.d(R.raw.mute_for, new String[0]);
                } else if (z4) {
                    qbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    qbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                qbVar.b.setText(formatString);
                return ic.g(p2Var, qbVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z4 = true;
        z10 = false;
        if (z10) {
        }
        qbVar.b.setText(formatString);
        return ic.g(p2Var, qbVar, 1500);
    }

    public final ic E(org.telegram.ui.ActionBar.g6 g6Var) {
        qb qbVar = new qb(W(), g6Var);
        qbVar.d(R.raw.chats_infotip, new String[0]);
        qbVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(qbVar, 1500);
    }

    public final ic G(int i10, int i11, CharSequence charSequence) {
        qb qbVar = new qb(W(), this.c);
        qbVar.c(i10, 36, 36, new String[0]);
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
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(i11);
        qbVar.b.setText(charSequence);
        return b(qbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ic H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final ic I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z4, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        qb qbVar = new qb(W, g6Var);
        if (i10 != 0) {
            qbVar.c(i10, 36, 36, new String[0]);
        } else {
            qbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) qbVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        qbVar.b.setTextSize(1, 14.0f);
        qbVar.b.setTextDirection(5);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(3);
        qbVar.b.setText(charSequence);
        gc gcVar = new gc(W(), g6Var, true, z4);
        gcVar.e(charSequence2);
        gcVar.a = runnable;
        qbVar.setButton(gcVar);
        return b(qbVar, i11);
    }

    public final ic J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final ic K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        fc fcVar = new fc(W, g6Var);
        fcVar.c(i10, 36, 36, new String[0]);
        fcVar.b.setText(str);
        fcVar.c.setText(charSequence);
        gc gcVar = new gc(W(), g6Var, true);
        gcVar.e(str2);
        gcVar.a = runnable;
        fcVar.setButton(gcVar);
        return b(fcVar, 5000);
    }

    public final ic L(Drawable drawable, CharSequence charSequence) {
        qb qbVar = new qb(W(), this.c);
        qbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.ip0) {
            ((org.telegram.ui.ip0) drawable).e(qbVar.a);
        }
        qbVar.b.setText(charSequence);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(2);
        return b(qbVar, 2750);
    }

    public final ic M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        fc fcVar = new fc(W(), this.c);
        fcVar.c(i10, 36, 36, new String[0]);
        fcVar.b.setText(charSequence);
        fcVar.c.setText(charSequence2);
        return b(fcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ic N(String str, String str2) {
        fc fcVar = new fc(W(), this.c);
        fcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) fcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        fcVar.b.setText(str);
        fcVar.c.setText(str2);
        return b(fcVar, 5000);
    }

    public final ic O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new gb();
        }
        ec ecVar = new ec(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        p9 p9Var = ecVar.a;
        p9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ecVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ecVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(ecVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final ic P(int i10, CharSequence charSequence) {
        qb qbVar = new qb(W(), this.c);
        qbVar.c(i10, 36, 36, new String[0]);
        qbVar.b.setText(charSequence);
        qbVar.b.setSingleLine(false);
        qbVar.b.setTextSize(1, 14.0f);
        qbVar.b.setMaxLines(4);
        return b(qbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ic Q(int i10, int i11, CharSequence charSequence) {
        qb qbVar = new qb(W(), this.c);
        qbVar.c(i10, i11, i11, new String[0]);
        qbVar.b.setText(charSequence);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(2);
        return b(qbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ic R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new gb();
        }
        ec ecVar = new ec(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        p9 p9Var = ecVar.a;
        p9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ecVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ecVar.c.setVisibility(8);
        return b(ecVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final ic T(String str) {
        qb qbVar = new qb(W(), null);
        qbVar.d(R.raw.contact_check, new String[0]);
        qbVar.b.setText(str);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(2);
        return b(qbVar, 1500);
    }

    public final ic U(String str, boolean z4, Runnable runnable, Runnable runnable2) {
        eb ebVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        if (isEmpty) {
            qb qbVar = new qb(W(), g6Var);
            qbVar.b.setText(str);
            qbVar.b.setSingleLine(false);
            qbVar.b.setMaxLines(2);
            ebVar = qbVar;
        } else {
            fc fcVar = new fc(W(), g6Var);
            fcVar.b.setText(str);
            fcVar.c.setText((CharSequence) null);
            ebVar = fcVar;
        }
        ebVar.setTimer();
        gc gcVar = new gc(W(), g6Var, true, z4);
        gcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        gcVar.a = runnable;
        gcVar.b = runnable2;
        ebVar.setButton(gcVar);
        return b(ebVar, 5000);
    }

    public final ic V(List list, CharSequence charSequence, CharSequence charSequence2, n7.qa qaVar) {
        float f10;
        int i10;
        Context W = W();
        boolean z4 = charSequence2 != null;
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        hc hcVar = new hc(W, g6Var, z4);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    hcVar.a.setCount(i13);
                    hcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                hcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                hcVar.a.setScaleX(1.2f);
                hcVar.a.setScaleY(1.2f);
            } else {
                hcVar.a.setScaleX(1.0f);
                hcVar.a.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i10 = 0;
        }
        hcVar.a.a(false);
        if (charSequence2 != null) {
            hcVar.b.setSingleLine(true);
            hcVar.b.setMaxLines(1);
            hcVar.b.setText(charSequence);
            hcVar.c.setText(charSequence2);
            hcVar.c.setSingleLine(false);
            hcVar.c.setMaxLines(3);
            if (hcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) hcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) hcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            hcVar.b.setSingleLine(false);
            hcVar.b.setMaxLines(4);
            hcVar.b.setText(charSequence);
            if (hcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    hcVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) hcVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) hcVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (qaVar != null) {
            gc gcVar = new gc(W(), g6Var, true);
            gcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            gcVar.a = (Runnable) qaVar.b;
            gcVar.b = (Runnable) qaVar.c;
            hcVar.setButton(gcVar);
        }
        return b(hcVar, 5000);
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

    public final ic Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.z1 ? new gb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final ic b(eb ebVar, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        return p2Var != null ? ic.g(p2Var, ebVar, i10) : ic.f(this.b, ebVar, i10);
    }

    public final ic c(CharSequence charSequence) {
        if (W() == null) {
            return new gb();
        }
        qb qbVar = new qb(W(), this.c);
        qbVar.d(R.raw.ic_admin, "Shield");
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(3);
        qbVar.b.setText(charSequence);
        return b(qbVar, 2750);
    }

    public final void c0(String str, boolean z4) {
        if (LaunchActivity.z1) {
            if (TextUtils.isEmpty(str)) {
                ic t6 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t6.r = false;
                t6.k(z4);
            } else {
                ic t9 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t9.r = false;
                t9.k(z4);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z4) {
        if (LaunchActivity.z1) {
            if (tL_error == null) {
                ic t6 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t6.r = false;
                t6.k(z4);
            } else if (tL_error.code != 406) {
                ic t9 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t9.r = false;
                t9.k(z4);
            }
        }
    }

    public final ic e(boolean z4) {
        String string;
        qb qbVar = new qb(W(), this.c);
        if (z4) {
            qbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            qbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        qbVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(qbVar, 1500);
    }

    public final boolean e0(int i10, long j10) {
        org.telegram.ui.ActionBar.p2 p2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (p2Var = this.a) != null) {
            tb tbVar = new tb(i10, p2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new jc(0)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new jc(0));
                tbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                tbVar.b.setText(replaceSingleTag);
                tbVar.b.setSingleLine(false);
                tbVar.b.setMaxLines(2);
                ic b10 = b(tbVar, 3500);
                tbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final ic f(int i10, Runnable runnable) {
        qb qbVar = new qb(W(), null);
        qbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new nc(0, runnable), indexOf, indexOf2 - 1, 33);
        qbVar.b.setText(valueOf);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(3);
        return b(qbVar, 5000);
    }

    public final ic g(String str, ArrayList arrayList) {
        hc hcVar = new hc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                hcVar.a.setCount(i12);
                hcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            hcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            hcVar.a.setScaleX(1.2f);
            hcVar.a.setScaleY(1.2f);
        } else {
            hcVar.a.setScaleX(1.0f);
            hcVar.a.setScaleY(1.0f);
        }
        hcVar.a.a(false);
        hcVar.b.setSingleLine(false);
        hcVar.b.setMaxLines(2);
        hcVar.b.setText(str);
        if (hcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) hcVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) hcVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            hcVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(hcVar, 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final ic h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        l90 l90Var;
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
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.lc
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
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        if (indexOf >= 0) {
            l90Var = new l90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), g6Var);
            spannableStringBuilder.setSpan(l90Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.k6.Hi;
            l90Var.a(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), 32), i0.a.k(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), 72));
        } else {
            l90Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.lc
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
        pb pbVar = new pb(W, g6Var);
        g90 g90Var = new g90(W, null);
        pbVar.d = g90Var;
        g90Var.setDisablePaddingsOffset(true);
        g90Var.setSingleLine();
        g90Var.setTypeface(Typeface.SANS_SERIF);
        g90Var.setTextSize(1, 15.0f);
        g90Var.setEllipsize(TextUtils.TruncateAt.END);
        g90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        pbVar.b.setVisibility(8);
        pbVar.addView(g90Var, k7.c6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.k6.Hi;
        pbVar.setTextColor(pbVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            pbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        pbVar.e(document, new String[i11]);
        pbVar.b.setTextSize(1, 14.0f);
        pbVar.b.setSingleLine(i11);
        pbVar.b.setMaxLines(3);
        g90Var.setText(spannableStringBuilder);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setSingleLine(i11);
        g90Var.setMaxLines(3);
        gc gcVar = new gc(W(), g6Var, true);
        gcVar.e(string);
        gcVar.a = runnable;
        pbVar.setButton(gcVar);
        ic b10 = b(pbVar, 2750);
        if (l90Var != null) {
            nb nbVar = b10.e;
            if (nbVar instanceof pb) {
                l90Var.b = ((pb) nbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new mc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final ic i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new gb();
        }
        qb qbVar = new qb(W(), null);
        qbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        qbVar.b.setText(str);
        return b(qbVar, 1500);
    }

    public final ic k(boolean z4) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new gb();
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        if (!z4) {
            qb qbVar = new qb(W(), g6Var);
            qbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            qbVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(qbVar, 1500);
        }
        fc fcVar = new fc(W(), g6Var);
        fcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        fcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        fcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(fcVar, 2750);
    }

    public final ic m(pc pcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.g6 g6Var) {
        qb qbVar = (i11 == 0 || i12 == 0) ? new qb(W(), g6Var) : new qb(i11, i12, W(), g6Var);
        oc ocVar = pcVar.d;
        qbVar.d(ocVar.a, ocVar.b);
        TextView textView = qbVar.b;
        String str = pcVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(pcVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, pcVar.b), new jc(1)));
        int i13 = pcVar.d.c;
        if (i13 != 0) {
            qbVar.setIconPaddingBottom(i13);
        }
        return b(qbVar, 1500);
    }

    public final ic n(pc pcVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        return m(pcVar, i10, 0, 0, g6Var);
    }

    public final ic o(pc pcVar, org.telegram.ui.ActionBar.g6 g6Var) {
        return m(pcVar, 1, 0, 0, g6Var);
    }

    public final ic p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        dc dcVar = new dc(W, g6Var);
        l5 l5Var = new l5(1, UserConfig.selectedAccount, j10);
        p9 p9Var = dcVar.a;
        p9Var.setAnimatedEmojiDrawable(l5Var);
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
        dcVar.b.setText(str);
        dcVar.c.setText(str2);
        return b(dcVar, 2750);
    }

    public final ic q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        qb qbVar = new qb(W, g6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            qbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        qbVar.e(document, new String[0]);
        if (qbVar.a.getImageReceiver() != null) {
            qbVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        qbVar.b.setText(charSequence);
        qbVar.b.setTextSize(1, 14.0f);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(3);
        gc gcVar = new gc(W(), g6Var, true);
        gcVar.e(str);
        gcVar.a = runnable;
        qbVar.setButton(gcVar);
        return b(qbVar, 2750);
    }

    public final ic r(TLRPC.Document document, String str) {
        qb qbVar = new qb(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            qbVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        qbVar.e(document, new String[0]);
        qbVar.b.setText(str);
        qbVar.b.setTextSize(1, 14.0f);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(3);
        return b(qbVar, 2750);
    }

    public final ic s(TLRPC.Document document, String str, CharSequence charSequence) {
        fc fcVar = new fc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        kj0 kj0Var = fcVar.a;
        if (isTextColorEmoji) {
            kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        kj0Var.setAutoRepeat(true);
        kj0Var.g(36, 36, document);
        fcVar.b.setText(str);
        fcVar.c.setText(charSequence);
        return b(fcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final ic t(CharSequence charSequence, org.telegram.ui.ActionBar.g6 g6Var) {
        qb qbVar = new qb(W(), g6Var);
        qbVar.d(R.raw.chats_infotip, new String[0]);
        qbVar.b.setText(charSequence);
        qbVar.b.setSingleLine(false);
        qbVar.b.setMaxLines(2);
        return b(qbVar, 1500);
    }

    public final ic u(String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        fc fcVar = new fc(W(), g6Var);
        fcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        fcVar.b.setText(str);
        fcVar.c.setText(str2);
        return b(fcVar, 1500);
    }

    public final ic w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        qb qbVar = new qb(W, g6Var);
        qbVar.setBackground(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Fi, g6Var), 12);
        qbVar.a.setImageResource(i10);
        qbVar.b.setText(charSequence);
        qbVar.b.setSingleLine(false);
        qbVar.b.setLines(2);
        qbVar.b.setMaxLines(4);
        TextView textView = qbVar.b;
        textView.setMaxWidth(qh.e3.a(textView.getText(), qbVar.b.getPaint()));
        qbVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) qbVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        qbVar.setWrapWidth();
        return b(qbVar, 5000);
    }

    public final ic y(int i10, TLRPC.Document document, j3.v vVar) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        qb qbVar = new qb(W, g6Var);
        qbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        qbVar.removeView(qbVar.b);
        t5 t5Var = new t5(qbVar.getContext());
        qbVar.b = t5Var;
        t5Var.setTypeface(Typeface.SANS_SERIF);
        qbVar.b.setTextSize(1, 15.0f);
        qbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        qbVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new u5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        qbVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (vVar != null) {
            gc gcVar = new gc(W(), g6Var, true);
            gcVar.e(LocaleController.getString(R.string.ViewAction));
            gcVar.a = vVar;
            qbVar.setButton(gcVar);
        }
        qbVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hi, g6Var));
        qbVar.addView(qbVar.b, k7.c6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(qbVar, 2750);
    }

    public qc(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = g6Var;
    }
}
