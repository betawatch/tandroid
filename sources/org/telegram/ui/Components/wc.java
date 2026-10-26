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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wc {
    public final org.telegram.ui.ActionBar.r2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.u6 c;

    public wc(org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var == null || r2Var.getLastStoryViewer() == null || !r2Var.getLastStoryViewer().attachedToParent()) {
            this.a = r2Var;
            this.b = null;
            this.c = r2Var != null ? r2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            di.q4 currentPeerView = r2Var.getLastStoryViewer().n0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.R0 : null;
            this.c = r2Var.getLastStoryViewer().y;
        }
    }

    public static qc A(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        return z(r2Var, z10 ? 3 : 4, 0, u6Var);
    }

    public static qc B(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, ai.h1 h1Var, org.telegram.ui.te teVar, org.telegram.ui.ActionBar.u6 u6Var) {
        yb ybVar = new yb(r2Var.getParentActivity(), u6Var);
        ybVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        ybVar.b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            oc ocVar = new oc(r2Var.getParentActivity(), u6Var, true);
            ocVar.b = h1Var;
            ocVar.c = teVar;
            ybVar.setButton(ocVar);
        }
        return qc.g(r2Var, ybVar, z10 ? 1500 : 5000);
    }

    public static qc C(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return qc.g(r2Var, ybVar, 1500);
    }

    public static qc D(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User user, String str) {
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
        ybVar.d(R.raw.ic_ban, "Hand");
        ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return qc.g(r2Var, ybVar, 1500);
    }

    public static qc F(FrameLayout frameLayout, boolean z10) {
        return new wc(frameLayout, null).m(z10 ? vc.h : vc.e, 1, -115203550, -1, null);
    }

    public static qc T(int i10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        String string;
        yb ybVar = new yb(r2Var.getParentActivity(), u6Var);
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
        return qc.g(r2Var, ybVar, 1500);
    }

    public static wc Y() {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return new wc(lb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.k3 ? new wc(((org.telegram.ui.ActionBar.k3) dialog).container, U.getResourceProvider()) : b0(U);
    }

    public static boolean a(org.telegram.ui.ActionBar.r2 r2Var) {
        return (r2Var == null || r2Var.getParentActivity() == null || r2Var.getLayoutContainer() == null) ? false : true;
    }

    public static wc a0(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var) {
        return new wc(frameLayout, u6Var);
    }

    public static wc b0(org.telegram.ui.ActionBar.r2 r2Var) {
        return r2Var == null ? Y() : new wc(r2Var);
    }

    public static void c0(String str) {
        if (LaunchActivity.E1) {
            Y().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
        }
    }

    public static qc d(org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        String string;
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
        if (z10) {
            ybVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ybVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ybVar.b.setText(AndroidUtilities.replaceTags(string));
        return qc.g(r2Var, ybVar, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var) {
        if (LaunchActivity.E1) {
            if (frameLayout == null) {
                c0(str);
                return;
            }
            qc t10 = new wc(frameLayout, u6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
            t10.s = false;
            t10.j();
        }
    }

    public static void e0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error == null || tL_error.code != 406) {
                Y().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static qc j(org.telegram.ui.ActionBar.r2 r2Var) {
        return b0(r2Var).k(false);
    }

    public static qc l(String str, org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        String string;
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        ybVar.b.setText(AndroidUtilities.replaceTags(string));
        ybVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return qc.g(r2Var, ybVar, 5000);
    }

    public static qc v(Context context, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, a3.i0 i0Var) {
        yb ybVar;
        SpannableStringBuilder replaceTags;
        qc g7;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || r2Var == null || i10 > 1 || j10 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            ybVar = new yb(i12, i13, context, r2Var != null ? r2Var.getResourceProvider() : null);
        } else {
            ybVar = new bc(i11, r2Var);
        }
        yb ybVar2 = ybVar;
        boolean z11 = i0Var != null;
        org.telegram.ui.ip ipVar = i0Var != null ? new org.telegram.ui.ip(8, new boolean[]{false}, i0Var) : null;
        int i15 = 2;
        if (i10 > 1) {
            replaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            ybVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new k5(4) : new k5(i15));
            } else {
                replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new k5(i15));
            }
            ybVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            a3.i0 i0Var2 = new a3.i0(ipVar, r2Var, j10, 19);
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                replaceTags = i11 <= 1 ? r2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title)) : r2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                if (i11 <= 1) {
                    int i16 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    replaceTags = r2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i16, UserObject.getFirstName(user)), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i16, UserObject.getFirstName(user)));
                } else {
                    int i17 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    replaceTags = r2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, i0Var2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                }
            }
            ybVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        ybVar2.b.setText(replaceTags);
        if (z11) {
            oc ocVar = new oc(ybVar2.getContext(), r2Var != null ? r2Var.getResourceProvider() : null, true, true);
            ocVar.b = null;
            ocVar.c = ipVar;
            ybVar2.setButton(ocVar);
        }
        ybVar2.postDelayed(new rc(ybVar2, 1), 300);
        if (frameLayout != null) {
            g7 = qc.f(frameLayout, ybVar2, i14);
        } else {
            if (r2Var == null) {
                throw new IllegalArgumentException();
            }
            g7 = qc.g(r2Var, ybVar2, i14);
        }
        if (ybVar2 instanceof bc) {
            ybVar2.b.setSingleLine(false);
            ybVar2.b.setMaxLines(2);
            ((bc) ybVar2).setBulletin(g7);
            g7.s = false;
        }
        return g7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qc x(Activity activity, FrameLayout frameLayout, int i10, long j10, int i11, int i12) {
        SpannableStringBuilder replaceTags;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        yb ybVar = new yb(i11, i12, activity, null);
        if (i10 > 1) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
            ybVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                ybVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
                ybVar.b.setText(spannableStringBuilder);
                if (i13 > 0) {
                    ybVar.postDelayed(new rc(ybVar, 0), i13);
                }
                return qc.f(frameLayout, ybVar, 1500);
            }
            if (DialogObject.isChatDialog(j10)) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
            }
            ybVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = replaceTags;
        i13 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        ybVar.b.setText(spannableStringBuilder);
        if (i13 > 0) {
        }
        return qc.f(frameLayout, ybVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qc z(org.telegram.ui.ActionBar.r2 r2Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        String formatString;
        boolean z10;
        yb ybVar = new yb(r2Var.getParentActivity(), u6Var);
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
                    ybVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    ybVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ybVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ybVar.b.setText(formatString);
                return qc.g(r2Var, ybVar, 1500);
            }
            formatString = LocaleController.getString(R.string.NotificationsMutedHint);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        ybVar.b.setText(formatString);
        return qc.g(r2Var, ybVar, 1500);
    }

    public final qc E(org.telegram.ui.ActionBar.u6 u6Var) {
        yb ybVar = new yb(X(), u6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(ybVar, 1500);
    }

    public final qc G(int i10, int i11, CharSequence charSequence) {
        yb ybVar = new yb(X(), this.c);
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
        return R(i10, 36, charSequence);
    }

    public final qc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        yb ybVar = new yb(X, u6Var);
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
        oc ocVar = new oc(X(), u6Var, true, z10);
        ocVar.e(charSequence2);
        ocVar.b = runnable;
        ybVar.setButton(ocVar);
        return b(ybVar, i11);
    }

    public final qc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final qc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        nc ncVar = new nc(X, u6Var);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.b.setText(str);
        ncVar.c.setText(charSequence);
        oc ocVar = new oc(X(), u6Var, true);
        ocVar.e(str2);
        ocVar.b = runnable;
        ncVar.setButton(ocVar);
        return b(ncVar, 5000);
    }

    public final qc L(Drawable drawable, CharSequence charSequence) {
        yb ybVar = new yb(X(), this.c);
        ybVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.mp0) {
            ((org.telegram.ui.mp0) drawable).e(ybVar.a);
        }
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, 2750);
    }

    public final qc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        nc ncVar = new nc(X(), this.c);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.b.setText(charSequence);
        ncVar.c.setText(charSequence2);
        return b(ncVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final qc N(String str, String str2) {
        nc ncVar = new nc(X(), this.c);
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
        mc mcVar = new mc(X(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = mcVar.a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
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
        qg0 qg0Var = new qg0(X(), this.c, null, charSequence);
        qg0Var.c.f(i10, 24, 24, null);
        qc b10 = b(qg0Var, 1780);
        b10.l = true;
        ub ubVar = b10.e;
        ubVar.pillStyle = true;
        ubVar.b();
        b10.a = 1313167187;
        return b10;
    }

    public final qc Q(int i10, CharSequence charSequence) {
        yb ybVar = new yb(X(), this.c);
        ybVar.c(i10, 36, 36, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setMaxLines(4);
        return b(ybVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final qc R(int i10, int i11, CharSequence charSequence) {
        yb ybVar = new yb(X(), this.c);
        ybVar.c(i10, i11, i11, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final qc S(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new pb();
        }
        mc mcVar = new mc(X(), this.c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = mcVar.a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = mcVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        mcVar.c.setVisibility(8);
        return b(mcVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final qc U(String str) {
        yb ybVar = new yb(X(), null);
        ybVar.d(R.raw.contact_check, new String[0]);
        ybVar.b.setText(str);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc V(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        nb nbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        if (isEmpty) {
            yb ybVar = new yb(X(), u6Var);
            ybVar.b.setText(str);
            ybVar.b.setSingleLine(false);
            ybVar.b.setMaxLines(2);
            nbVar = ybVar;
        } else {
            nc ncVar = new nc(X(), u6Var);
            ncVar.b.setText(str);
            ncVar.c.setText((CharSequence) null);
            nbVar = ncVar;
        }
        nbVar.setTimer();
        oc ocVar = new oc(X(), u6Var, true, z10);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.b = runnable;
        ocVar.c = runnable2;
        nbVar.setButton(ocVar);
        return b(nbVar, 5000);
    }

    public final qc W(List list, CharSequence charSequence, CharSequence charSequence2, m4.c cVar) {
        float f7;
        int i10;
        Context X = X();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        pc pcVar = new pc(X, u6Var, z10);
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
        if (cVar != null) {
            oc ocVar = new oc(X(), u6Var, true);
            ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ocVar.b = (Runnable) cVar.b;
            ocVar.c = (Runnable) cVar.c;
            pcVar.setButton(ocVar);
        }
        return b(pcVar, 5000);
    }

    public final Context X() {
        Context context;
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        if (r2Var != null) {
            context = r2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public final qc Z(TLRPC.TL_error tL_error) {
        return !LaunchActivity.E1 ? new pb() : tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final qc b(ub ubVar, int i10) {
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        return r2Var != null ? qc.g(r2Var, ubVar, i10) : qc.f(this.b, ubVar, i10);
    }

    public final qc c(CharSequence charSequence) {
        if (X() == null) {
            return new pb();
        }
        yb ybVar = new yb(X(), this.c);
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        ybVar.b.setText(charSequence);
        return b(ybVar, 2750);
    }

    public final qc e(boolean z10) {
        String string;
        yb ybVar = new yb(X(), this.c);
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

    public final qc f(int i10, Runnable runnable) {
        yb ybVar = new yb(X(), null);
        ybVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new tc(0, runnable), indexOf, indexOf2 - 1, 33);
        ybVar.b.setText(valueOf);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        return b(ybVar, 5000);
    }

    public final void f0(String str, boolean z10) {
        if (LaunchActivity.E1) {
            if (TextUtils.isEmpty(str)) {
                qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.s = false;
                t10.k(z10);
            } else {
                qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                t11.s = false;
                t11.k(z10);
            }
        }
    }

    public final qc g(String str, ArrayList arrayList) {
        pc pcVar = new pc(X(), this.c, false);
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

    public final void g0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.s = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.s = false;
                t11.k(z10);
            }
        }
    }

    public final qc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        ea0 ea0Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet inputStickerSet2 = MessageObject.getInputStickerSet(document);
        if (inputStickerSet2 == null) {
            return null;
        }
        final int i11 = 1;
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet2, true);
        final int i12 = 0;
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            return r(document, i10 == 1 ? AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title)) : i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title)), LocaleController.getString(R.string.ViewAction), new Runnable() { // from class: org.telegram.ui.Components.sc
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
        SpannableStringBuilder spannableStringBuilder = i10 == 1 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>"))) : i10 == 2 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>"))) : new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        if (indexOf >= 0) {
            ea0Var = new ea0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), u6Var);
            spannableStringBuilder.setSpan(ea0Var, indexOf, indexOf + 11, 33);
            int i13 = org.telegram.ui.ActionBar.y6.Hi;
            ea0Var.a(i0.a.o(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 32), i0.a.o(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 72));
        } else {
            ea0Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.sc
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
        Context X = X();
        wb wbVar = new wb(X, u6Var);
        z90 z90Var = new z90(X, null);
        wbVar.d = z90Var;
        z90Var.setDisablePaddingsOffset(true);
        z90Var.setSingleLine();
        z90Var.setTypeface(Typeface.SANS_SERIF);
        z90Var.setTextSize(1, 15.0f);
        z90Var.setEllipsize(TextUtils.TruncateAt.END);
        z90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        wbVar.b.setVisibility(8);
        wbVar.addView(z90Var, gb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i14 = org.telegram.ui.ActionBar.y6.Hi;
        wbVar.setTextColor(wbVar.getThemedColor(i14));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            org.telegram.ui.ActionBar.f7.t(wbVar.a, i14, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = inputStickerSet2;
        }
        wbVar.e(document, new String[0]);
        wbVar.b.setTextSize(1, 14.0f);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(3);
        z90Var.setText(spannableStringBuilder);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setSingleLine(false);
        z90Var.setMaxLines(3);
        oc ocVar = new oc(X(), u6Var, true);
        ocVar.e(string);
        ocVar.b = runnable;
        wbVar.setButton(ocVar);
        qc b10 = b(wbVar, 2750);
        if (ea0Var != null) {
            ub ubVar = b10.e;
            if (ubVar instanceof wb) {
                ea0Var.b = ((wb) ubVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new bi.f4(i10, b10, currentTimeMillis));
        return b10;
    }

    public final boolean h0(int i10, long j10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (r2Var = this.a) != null) {
            bc bcVar = new bc(i10, r2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder replaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new k5(2)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new k5(2));
                bcVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                bcVar.b.setText(replaceSingleTag);
                bcVar.b.setSingleLine(false);
                bcVar.b.setMaxLines(2);
                qc b10 = b(bcVar, 3500);
                bcVar.setBulletin(b10);
                b10.s = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final qc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new pb();
        }
        yb ybVar = new yb(X(), null);
        ybVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ybVar.b.setText(str);
        return b(ybVar, 1500);
    }

    public final qc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new pb();
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        if (!z10) {
            yb ybVar = new yb(X(), u6Var);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(ybVar, 1500);
        }
        nc ncVar = new nc(X(), u6Var);
        ncVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ncVar.b.setText(LocaleController.getString(R.string.LinkCopied));
        ncVar.c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(ncVar, 2750);
    }

    public final qc m(vc vcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.u6 u6Var) {
        yb ybVar = (i11 == 0 || i12 == 0) ? new yb(X(), u6Var) : new yb(i11, i12, X(), u6Var);
        uc ucVar = vcVar.d;
        ybVar.d(ucVar.a, ucVar.b);
        TextView textView = ybVar.b;
        String str = vcVar.a;
        textView.setText(AndroidUtilities.replaceSingleTag(vcVar.c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, vcVar.b), new k5(3)));
        int i13 = vcVar.d.c;
        if (i13 != 0) {
            ybVar.setIconPaddingBottom(i13);
        }
        return b(ybVar, 1500);
    }

    public final qc n(vc vcVar, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        return m(vcVar, i10, 0, 0, u6Var);
    }

    public final qc o(vc vcVar, org.telegram.ui.ActionBar.u6 u6Var) {
        return m(vcVar, 1, 0, 0, u6Var);
    }

    public final qc p(long j10, String str, String str2) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        lc lcVar = new lc(X, u6Var);
        t5 t5Var = new t5(1, UserConfig.selectedAccount, j10);
        y9 y9Var = lcVar.a;
        y9Var.setAnimatedEmojiDrawable(t5Var);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var), PorterDuff.Mode.SRC_IN));
        lcVar.b.setText(str);
        lcVar.c.setText(str2);
        return b(lcVar, 2750);
    }

    public final qc q(TLRPC.Document document, CharSequence charSequence) {
        yb ybVar = new yb(X(), this.c);
        if (MessageObject.isTextColorEmoji(document)) {
            org.telegram.ui.ActionBar.f7.t(ybVar.a, org.telegram.ui.ActionBar.y6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        ybVar.e(document, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        return b(ybVar, 2750);
    }

    public final qc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        yb ybVar = new yb(X, u6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            org.telegram.ui.ActionBar.f7.t(ybVar.a, org.telegram.ui.ActionBar.y6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        ybVar.e(document, new String[0]);
        if (ybVar.a.getImageReceiver() != null) {
            ybVar.a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        ybVar.b.setText(charSequence);
        ybVar.b.setTextSize(1, 14.0f);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(3);
        oc ocVar = new oc(X(), u6Var, true);
        ocVar.e(str);
        ocVar.b = runnable;
        ybVar.setButton(ocVar);
        return b(ybVar, 2750);
    }

    public final qc s(TLRPC.Document document, String str, CharSequence charSequence) {
        nc ncVar = new nc(X(), this.c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ak0 ak0Var = ncVar.a;
        if (isTextColorEmoji) {
            org.telegram.ui.ActionBar.f7.t(ak0Var, org.telegram.ui.ActionBar.y6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        ak0Var.setAutoRepeat(true);
        ak0Var.g(36, 36, document);
        ncVar.b.setText(str);
        ncVar.c.setText(charSequence);
        return b(ncVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final qc t(CharSequence charSequence, org.telegram.ui.ActionBar.u6 u6Var) {
        yb ybVar = new yb(X(), u6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc u(String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        nc ncVar = new nc(X(), u6Var);
        ncVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ncVar.b.setText(str);
        ncVar.c.setText(str2);
        return b(ncVar, 1500);
    }

    public final qc w(int i10, CharSequence charSequence) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        yb ybVar = new yb(X, u6Var);
        ybVar.setBackground(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Fi, u6Var), 12);
        ybVar.a.setImageResource(i10);
        ybVar.b.setText(charSequence);
        ybVar.b.setSingleLine(false);
        ybVar.b.setLines(2);
        ybVar.b.setMaxLines(4);
        TextView textView = ybVar.b;
        textView.setMaxWidth(fi.v3.a(textView.getText(), ybVar.b.getPaint()));
        ybVar.b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ybVar.b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        ybVar.setWrapWidth();
        return b(ybVar, 5000);
    }

    public final qc y(int i10, TLRPC.Document document, i2.v vVar) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        yb ybVar = new yb(X, u6Var);
        ybVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ybVar.removeView(ybVar.b);
        b6 b6Var = new b6(ybVar.getContext());
        ybVar.b = b6Var;
        b6Var.setTypeface(Typeface.SANS_SERIF);
        ybVar.b.setTextSize(1, 15.0f);
        ybVar.b.setEllipsize(TextUtils.TruncateAt.END);
        ybVar.b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new c6(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        ybVar.b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (vVar != null) {
            oc ocVar = new oc(X(), u6Var, true);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            ocVar.b = vVar;
            ybVar.setButton(ocVar);
        }
        ybVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hi, u6Var));
        ybVar.addView(ybVar.b, gb1.m(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ybVar, 2750);
    }

    public wc(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = u6Var;
    }
}
