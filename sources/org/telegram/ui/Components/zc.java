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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zc {
    public final org.telegram.ui.ActionBar.m2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.c6 c;

    public zc(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == null || m2Var.getLastStoryViewer() == null || !m2Var.getLastStoryViewer().attachedToParent()) {
            this.a = m2Var;
            this.b = null;
            this.c = m2Var != null ? m2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            bi.q5 currentPeerView = m2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.c1 : null;
            this.c = m2Var.getLastStoryViewer().y;
        }
    }

    public static sc A(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        return z(m2Var, z10 ? 3 : 4, 0, c6Var);
    }

    public static sc B(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, bi.n8 n8Var, org.telegram.ui.bf bfVar, org.telegram.ui.ActionBar.c6 c6Var) {
        ac acVar = new ac(m2Var.getParentActivity(), c6Var);
        acVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        acVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            qc qcVar = new qc(m2Var.getParentActivity(), c6Var, true);
            qcVar.a = n8Var;
            qcVar.b = bfVar;
            acVar.setButton(qcVar);
        }
        return sc.g(m2Var, acVar, z10 ? 1500 : 5000);
    }

    public static sc C(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
        acVar.d(R.raw.ic_admin, "Shield");
        acVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return sc.g(m2Var, acVar, 1500);
    }

    public static sc D(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
        acVar.d(R.raw.ic_ban, "Hand");
        acVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return sc.g(m2Var, acVar, 1500);
    }

    public static sc F(FrameLayout frameLayout, boolean z10) {
        return new zc(frameLayout, null).m(z10 ? yc.h : yc.e, 1, -115203550, -1, null);
    }

    public static sc S(int i10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        ac acVar = new ac(m2Var.getParentActivity(), c6Var);
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
            acVar.d(R.raw.sound_on, new String[0]);
        } else {
            acVar.d(R.raw.sound_off, new String[0]);
        }
        acVar.b.setText(string);
        return sc.g(m2Var, acVar, 1500);
    }

    public static zc X() {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return new zc(nb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.e3 ? new zc(((org.telegram.ui.ActionBar.e3) dialog).container, U.getResourceProvider()) : a0(U);
    }

    public static zc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        return new zc(frameLayout, c6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.m2 m2Var) {
        return (m2Var == null || m2Var.getParentActivity() == null || m2Var.getLayoutContainer() == null) ? false : true;
    }

    public static zc a0(org.telegram.ui.ActionBar.m2 m2Var) {
        return m2Var == null ? X() : new zc(m2Var);
    }

    public static void b0(String str) {
        if (LaunchActivity.C1) {
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
        }
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        if (LaunchActivity.C1) {
            if (frameLayout == null) {
                b0(str);
                return;
            }
            sc t10 = new zc(frameLayout, c6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
            t10.r = false;
            t10.j();
        }
    }

    public static sc d(org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        String string;
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
        if (z10) {
            acVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            acVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        acVar.b.setText(AndroidUtilities.replaceTags(string));
        return sc.g(m2Var, acVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static sc j(org.telegram.ui.ActionBar.m2 m2Var) {
        return a0(m2Var).k(false);
    }

    public static sc l(String str, org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        String string;
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        acVar.b.setText(AndroidUtilities.replaceTags(string));
        acVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return sc.g(m2Var, acVar, 5000);
    }

    public static sc v(Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, a3.i0 i0Var) {
        ac acVar;
        SpannableStringBuilder replaceTags;
        sc g10;
        int i15 = 1;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || m2Var == null || i10 > 1 || j10 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            acVar = new ac(i12, i13, context, m2Var != null ? m2Var.getResourceProvider() : null);
        } else {
            acVar = new dc(i11, m2Var);
        }
        ac acVar2 = acVar;
        boolean z11 = i0Var != null;
        org.telegram.ui.rp rpVar = i0Var != null ? new org.telegram.ui.rp(13, new boolean[]{false}, i0Var) : null;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            acVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            int i16 = 26;
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new ah.j(28) : new ah.j(i16));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ah.j(i16));
            }
            acVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            a3.i0 i0Var2 = new a3.i0(rpVar, m2Var, j10, 16);
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                replaceTags = i11 <= 1 ? m2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : m2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                if (i11 <= 1) {
                    int i17 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = m2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                } else {
                    int i18 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = m2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                }
            }
            acVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        acVar2.b.setText(replaceTags);
        if (z11) {
            qc qcVar = new qc(acVar2.getContext(), m2Var != null ? m2Var.getResourceProvider() : null, true, true);
            qcVar.a = null;
            qcVar.b = rpVar;
            acVar2.setButton(qcVar);
        }
        acVar2.postDelayed(new tc(acVar2, i15), 300);
        if (frameLayout != null) {
            g10 = sc.f(frameLayout, acVar2, i14);
        } else {
            if (m2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = sc.g(m2Var, acVar2, i14);
        }
        if (acVar2 instanceof dc) {
            acVar2.b.setSingleLine(false);
            acVar2.b.setMaxLines(2);
            ((dc) acVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sc x(Activity activity, FrameLayout frameLayout, int i10, long j10, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        ac acVar = new ac(i11, i12, activity, null);
        int i14 = 0;
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            acVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                acVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                acVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    acVar.postDelayed(new tc(acVar, i14), i13);
                }
                return sc.f(frameLayout, acVar, 1500);
            }
            if (DialogObject.isChatDialog(j10)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
            }
            acVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = replaceTags;
        i13 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        acVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return sc.f(frameLayout, acVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sc z(org.telegram.ui.ActionBar.m2 m2Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        String formatString;
        boolean z10;
        ac acVar = new ac(m2Var.getParentActivity(), c6Var);
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
                    acVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    acVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    acVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                acVar.b.setText(formatString);
                return sc.g(m2Var, acVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        acVar.b.setText(formatString);
        return sc.g(m2Var, acVar, 1500);
    }

    public final sc E(org.telegram.ui.ActionBar.c6 c6Var) {
        ac acVar = new ac(W(), c6Var);
        acVar.d(R.raw.chats_infotip, new String[0]);
        acVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(acVar, 1500);
    }

    public final sc G(int i10, int i11, CharSequence charSequence) {
        ac acVar = new ac(W(), this.c);
        acVar.c(i10, 36, 36, new String[0]);
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
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(i11);
        acVar.b.setText(charSequence);
        return b(acVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final sc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final sc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ac acVar = new ac(W, c6Var);
        if (i10 != 0) {
            acVar.c(i10, 36, 36, new String[0]);
        } else {
            acVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) acVar.b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        acVar.b.setTextSize(1, 14.0f);
        acVar.b.setTextDirection(5);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(3);
        acVar.b.setText(charSequence);
        qc qcVar = new qc(W(), c6Var, true, z10);
        qcVar.e(charSequence2);
        qcVar.a = runnable;
        acVar.setButton(qcVar);
        return b(acVar, i11);
    }

    public final sc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final sc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        pc pcVar = new pc(W, c6Var);
        pcVar.c(i10, 36, 36, new String[0]);
        pcVar.b.setText(str);
        pcVar.c.setText(charSequence);
        qc qcVar = new qc(W(), c6Var, true);
        qcVar.e(str2);
        qcVar.a = runnable;
        pcVar.setButton(qcVar);
        return b(pcVar, 5000);
    }

    public final sc L(Drawable drawable, CharSequence charSequence) {
        ac acVar = new ac(W(), this.c);
        acVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.bq0) {
            ((org.telegram.ui.bq0) drawable).e(acVar.a);
        }
        acVar.b.setText(charSequence);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(2);
        return b(acVar, 2750);
    }

    public final sc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        pc pcVar = new pc(W(), this.c);
        pcVar.c(i10, 36, 36, new String[0]);
        pcVar.b.setText(charSequence);
        pcVar.c.setText(charSequence2);
        return b(pcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final sc N(String str, String str2) {
        pc pcVar = new pc(W(), this.c);
        pcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) pcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        pcVar.b.setText(str);
        pcVar.c.setText(str2);
        return b(pcVar, 5000);
    }

    public final sc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new rb();
        }
        oc ocVar = new oc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        z9 z9Var = ocVar.a;
        z9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ocVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ocVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(ocVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final sc P(int i10, CharSequence charSequence) {
        ac acVar = new ac(W(), this.c);
        acVar.c(i10, 36, 36, new String[0]);
        acVar.b.setText(charSequence);
        acVar.b.setSingleLine(false);
        acVar.b.setTextSize(1, 14.0f);
        acVar.b.setMaxLines(4);
        return b(acVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final sc Q(int i10, int i11, CharSequence charSequence) {
        ac acVar = new ac(W(), this.c);
        acVar.c(i10, i11, i11, new String[0]);
        acVar.b.setText(charSequence);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(2);
        return b(acVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final sc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new rb();
        }
        oc ocVar = new oc(W(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        z9 z9Var = ocVar.a;
        z9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ocVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ocVar.c.setVisibility(8);
        return b(ocVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final sc T(String str) {
        ac acVar = new ac(W(), null);
        acVar.d(R.raw.contact_check, new String[0]);
        acVar.b.setText(str);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(2);
        return b(acVar, 1500);
    }

    public final sc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        pb pbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        if (isEmpty) {
            ac acVar = new ac(W(), c6Var);
            acVar.b.setText(str);
            acVar.b.setSingleLine(false);
            acVar.b.setMaxLines(2);
            pbVar = acVar;
        } else {
            pc pcVar = new pc(W(), c6Var);
            pcVar.b.setText(str);
            pcVar.c.setText((CharSequence) null);
            pbVar = pcVar;
        }
        pbVar.setTimer();
        qc qcVar = new qc(W(), c6Var, true, z10);
        qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        qcVar.a = runnable;
        qcVar.b = runnable2;
        pbVar.setButton(qcVar);
        return b(pbVar, 5000);
    }

    public final sc V(List list, CharSequence charSequence, CharSequence charSequence2, n6.o oVar) {
        float f7;
        int i10;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        rc rcVar = new rc(W, c6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    rcVar.a.setCount(i13);
                    rcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                rcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
                rcVar.a.setScaleX(1.2f);
                rcVar.a.setScaleY(1.2f);
            } else {
                rcVar.a.setScaleX(1.0f);
                rcVar.a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        rcVar.a.a(false);
        if (charSequence2 != null) {
            rcVar.b.setSingleLine(true);
            rcVar.b.setMaxLines(1);
            rcVar.b.setText(charSequence);
            rcVar.c.setText(charSequence2);
            rcVar.c.setSingleLine(false);
            rcVar.c.setMaxLines(3);
            if (rcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) rcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) rcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            rcVar.b.setSingleLine(false);
            rcVar.b.setMaxLines(4);
            rcVar.b.setText(charSequence);
            if (rcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    rcVar.b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) rcVar.b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) rcVar.b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (oVar != null) {
            qc qcVar = new qc(W(), c6Var, true);
            qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            qcVar.a = (Runnable) oVar.b;
            qcVar.b = (Runnable) oVar.c;
            rcVar.setButton(qcVar);
        }
        return b(rcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.m2 m2Var = this.a;
        if (m2Var != null) {
            context = m2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public final sc Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.C1 ? new rb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final sc b(pb pbVar, int i10) {
        org.telegram.ui.ActionBar.m2 m2Var = this.a;
        return m2Var != null ? sc.g(m2Var, pbVar, i10) : sc.f(this.b, pbVar, i10);
    }

    public final sc c(CharSequence charSequence) {
        if (W() == null) {
            return new rb();
        }
        ac acVar = new ac(W(), this.c);
        acVar.d(R.raw.ic_admin, "Shield");
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(3);
        acVar.b.setText(charSequence);
        return b(acVar, 2750);
    }

    public final sc e(boolean z10) {
        String string;
        ac acVar = new ac(W(), this.c);
        if (z10) {
            acVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            acVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        acVar.b.setText(AndroidUtilities.replaceTags(string));
        return b(acVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (LaunchActivity.C1) {
            if (TextUtils.isEmpty(str)) {
                sc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                sc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final sc f(int i10, Runnable runnable) {
        ac acVar = new ac(W(), null);
        acVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new wc(0, runnable), indexOf, indexOf2 - 1, 33);
        acVar.b.setText(valueOf);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(3);
        return b(acVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                sc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                sc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final sc g(String str, ArrayList arrayList) {
        rc rcVar = new rc(W(), this.c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                rcVar.a.setCount(i12);
                rcVar.a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            rcVar.a.setTranslationX(AndroidUtilities.dp(4.0f));
            rcVar.a.setScaleX(1.2f);
            rcVar.a.setScaleY(1.2f);
        } else {
            rcVar.a.setScaleX(1.0f);
            rcVar.a.setScaleY(1.0f);
        }
        rcVar.a.a(false);
        rcVar.b.setSingleLine(false);
        rcVar.b.setMaxLines(2);
        rcVar.b.setText(str);
        if (rcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) rcVar.b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) rcVar.b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            rcVar.a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(rcVar, 5000);
    }

    public final boolean g0(int i10, long j10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (m2Var = this.a) != null) {
            dc dcVar = new dc(i10, m2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ah.j(26)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ah.j(26));
                dcVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                dcVar.b.setText(replaceSingleTag);
                dcVar.b.setSingleLine(false);
                dcVar.b.setMaxLines(2);
                sc b10 = b(dcVar, 3500);
                dcVar.setBulletin(b10);
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
    public final sc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        ia0 ia0Var;
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
            return q(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.uc
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
            ia0Var = new ia0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), c6Var);
            spannableStringBuilder.setSpan(ia0Var, indexOf, indexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.g6.Hi;
            ia0Var.a(i0.a.k(org.telegram.ui.ActionBar.g6.w0(i14, c6Var), 32), i0.a.k(org.telegram.ui.ActionBar.g6.w0(i14, c6Var), 72));
        } else {
            ia0Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.uc
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
        yb ybVar = new yb(W, c6Var);
        da0 da0Var = new da0(W, null);
        ybVar.d = da0Var;
        da0Var.setDisablePaddingsOffset(true);
        da0Var.setSingleLine();
        da0Var.setTypeface(Typeface.SANS_SERIF);
        da0Var.setTextSize(1, 15.0f);
        da0Var.setEllipsize(TextUtils.TruncateAt.END);
        da0Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ybVar.b.setVisibility(8);
        ybVar.addView(da0Var, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.g6.Hi;
        ybVar.setTextColor(ybVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            ybVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        ybVar.e(document, new String[i11]);
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setSingleLine(i11);
        ybVar.b.setMaxLines(3);
        da0Var.setText(spannableStringBuilder);
        da0Var.setTextSize(1, 14.0f);
        da0Var.setSingleLine(i11);
        da0Var.setMaxLines(3);
        qc qcVar = new qc(W(), c6Var, true);
        qcVar.e(string);
        qcVar.a = runnable;
        ybVar.setButton(qcVar);
        sc b10 = b(ybVar, 2750);
        if (ia0Var != null) {
            wb wbVar = b10.e;
            if (wbVar instanceof yb) {
                ia0Var.b = ((yb) wbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new vc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final sc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new rb();
        }
        ac acVar = new ac(W(), null);
        acVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        acVar.b.setText(str);
        return b(acVar, 1500);
    }

    public final sc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new rb();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        if (!z10) {
            ac acVar = new ac(W(), c6Var);
            acVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            acVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(acVar, 1500);
        }
        pc pcVar = new pc(W(), c6Var);
        pcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        pcVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        pcVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(pcVar, 2750);
    }

    public final sc m(yc ycVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        ac acVar = (i11 == 0 || i12 == 0) ? new ac(W(), c6Var) : new ac(i11, i12, W(), c6Var);
        xc xcVar = ycVar.d;
        acVar.d(xcVar.a, xcVar.b);
        TextView textView = acVar.b;
        String str = ycVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(ycVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, ycVar.b), new ah.j(27)));
        int i13 = ycVar.d.c;
        if (i13 != 0) {
            acVar.setIconPaddingBottom(i13);
        }
        return b(acVar, 1500);
    }

    public final sc n(yc ycVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(ycVar, i10, 0, 0, c6Var);
    }

    public final sc o(yc ycVar, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(ycVar, 1, 0, 0, c6Var);
    }

    public final sc p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        nc ncVar = new nc(W, c6Var);
        s5 s5Var = new s5(1, UserConfig.selectedAccount, j10);
        z9 z9Var = ncVar.a;
        z9Var.setAnimatedEmojiDrawable(s5Var);
        z9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        ncVar.b.setText(str);
        ncVar.c.setText(str2);
        return b(ncVar, 2750);
    }

    public final sc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ac acVar = new ac(W, c6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            acVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        acVar.e(document, new String[0]);
        if (acVar.a.getImageReceiver() != null) {
            acVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        acVar.b.setText(charSequence);
        acVar.b.setTextSize(1, 14.0f);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(3);
        qc qcVar = new qc(W(), c6Var, true);
        qcVar.e(str);
        qcVar.a = runnable;
        acVar.setButton(qcVar);
        return b(acVar, 2750);
    }

    public final sc r(TLRPC.Document document, String str) {
        ac acVar = new ac(W(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            acVar.a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        acVar.e(document, new String[0]);
        acVar.b.setText(str);
        acVar.b.setTextSize(1, 14.0f);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(3);
        return b(acVar, 2750);
    }

    public final sc s(TLRPC.Document document, String str, CharSequence charSequence) {
        pc pcVar = new pc(W(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        bk0 bk0Var = pcVar.a;
        if (isTextColorEmoji) {
            bk0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        bk0Var.setAutoRepeat(true);
        bk0Var.g(36, 36, document);
        pcVar.b.setText(str);
        pcVar.c.setText(charSequence);
        return b(pcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final sc t(CharSequence charSequence, org.telegram.ui.ActionBar.c6 c6Var) {
        ac acVar = new ac(W(), c6Var);
        acVar.d(R.raw.chats_infotip, new String[0]);
        acVar.b.setText(charSequence);
        acVar.b.setSingleLine(false);
        acVar.b.setMaxLines(2);
        return b(acVar, 1500);
    }

    public final sc u(String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        pc pcVar = new pc(W(), c6Var);
        pcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        pcVar.b.setText(str);
        pcVar.c.setText(str2);
        return b(pcVar, 1500);
    }

    public final sc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ac acVar = new ac(W, c6Var);
        acVar.setBackground(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Fi, c6Var), 12);
        acVar.a.setImageResource(i10);
        acVar.b.setText(charSequence);
        acVar.b.setSingleLine(false);
        acVar.b.setLines(2);
        acVar.b.setMaxLines(4);
        TextView textView = acVar.b;
        textView.setMaxWidth(di.d4.a(textView.getText(), acVar.b.getPaint()));
        acVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) acVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        acVar.setWrapWidth();
        return b(acVar, 5000);
    }

    public final sc y(int i10, TLRPC.Document document, hg.n nVar) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ac acVar = new ac(W, c6Var);
        acVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        acVar.removeView(acVar.b);
        a6 a6Var = new a6(acVar.getContext());
        acVar.b = a6Var;
        a6Var.setTypeface(Typeface.SANS_SERIF);
        acVar.b.setTextSize(1, 15.0f);
        acVar.b.setEllipsize(TextUtils.TruncateAt.END);
        acVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new b6(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        acVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            qc qcVar = new qc(W(), c6Var, true);
            qcVar.e(LocaleController.getString(R.string.ViewAction));
            qcVar.a = nVar;
            acVar.setButton(qcVar);
        }
        acVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        acVar.addView(acVar.b, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(acVar, 2750);
    }

    public zc(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = c6Var;
    }
}
