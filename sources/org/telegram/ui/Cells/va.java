package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.np;
import org.telegram.ui.lk0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class va extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.z8 B;
    public boolean C;
    public Object D;
    public CharSequence E;
    public CharSequence F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public TLRPC.FileLocation L;
    public final int M;
    public final int N;
    public final int O;
    public boolean P;
    public final l6 Q;
    public long R;
    public boolean S;
    public boolean T;
    public final oh.a4 a;
    public final org.telegram.ui.ActionBar.l5 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final ImageView d;
    public final np e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final org.telegram.ui.Components.j5 v;
    public final org.telegram.ui.Components.j5 w;
    public ImageView x;
    public final org.telegram.ui.ActionBar.g6 y;

    public va(Context context, int i10, int i11, boolean z4) {
        this(i10, i11, context, null, z4, false);
    }

    public final void a(String str, boolean z4, boolean z10, boolean z11, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.y;
        int v02 = z10 ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Dh, g6Var) : z4 ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ch, g6Var) : (z11 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var) : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ld, g6Var);
        textView.setTextColor(v02);
        if (z4 || z10) {
            textView.setText(str);
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.k6.l1(0.12f, v02)));
            textView.setOnClickListener(onClickListener);
        } else if (z11 && TextUtils.isEmpty(str)) {
            textView.setPadding(org.telegram.ui.b.e(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.l1(0.12f, v02), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setText(str);
            textView.setPadding(0, 0, 0, 0);
            textView.setTranslationX(0.0f);
            textView.setBackground(null);
            textView.setOnClickListener(onClickListener);
        }
        textView.setVisibility((str != null || z11) ? 0 : 8);
        if (str == null && !z11) {
            i(0, false);
        } else {
            CharSequence text = textView.getText();
            i((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    public final void b(int i10, int i11) {
        int i12;
        float f10;
        oh.a4 a4Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a4Var.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 7);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 7 : 0.0f);
        a4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z4 = LocaleController.isRTL;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z4) {
            i12 = (checkBoxSquare != null ? 18 : 0) + 28;
        } else {
            i12 = i10 + 64 + i11;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(i12);
        if (LocaleController.isRTL) {
            f10 = i10 + 64 + i11;
        } else {
            f10 = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : i10 + 64 + i11);
        layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 64 + i11 : 28.0f);
        np npVar = this.e;
        if (npVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) npVar.getLayoutParams();
            layoutParams4.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 32 + i11);
            layoutParams4.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 32 + i11 : 0.0f);
        }
    }

    public final void c(boolean z4, boolean z10) {
        np npVar = this.e;
        if (npVar != null) {
            if (npVar.getVisibility() != 0) {
                npVar.setVisibility(0);
            }
            npVar.a(z4, z10);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z4, z10);
        } else {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(z4 ? 0 : 8);
            }
        }
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.F = null;
            this.E = null;
            this.C = false;
            this.D = null;
            l5Var.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.F = charSequence2;
        if (charSequence != null && l5Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, l5Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.E = charSequence;
        this.C = !(obj instanceof String);
        this.D = obj;
        this.P = z4;
        setWillNotDraw(!z4);
        j(0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.S && view == this.a) {
            lf.r.a(canvas, org.telegram.ui.ActionBar.k6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void f(TLRPC.User user, boolean z4) {
        d(user, null, null, z4);
    }

    public final void g(lk0 lk0Var, CharSequence charSequence, boolean z4) {
        String string;
        Object user;
        boolean z10 = lk0Var.e;
        int i10 = this.M;
        if (z10) {
            int i11 = lk0Var.c;
            string = (i11 > 0 || !lk0Var.f) ? i11 <= 0 ? LocaleController.getString(R.string.NotificationEnabled) : LocaleController.getString(R.string.NotificationDisabled) : LocaleController.getString(R.string.NotificationEnabledAutomatically);
        } else {
            boolean z11 = lk0Var.b;
            int i12 = lk0Var.c;
            int i13 = lk0Var.a;
            boolean z12 = true;
            if (i12 != 3 || i13 == Integer.MAX_VALUE) {
                if (i12 != 0 && i12 != 1) {
                    z12 = false;
                }
                if (z12 && z11) {
                    string = LocaleController.getString(R.string.NotificationsCustom);
                } else {
                    string = LocaleController.getString(z12 ? R.string.NotificationsUnmuted : R.string.NotificationsMuted);
                }
            } else {
                int currentTime = i13 - ConnectionsManager.getInstance(i10).getCurrentTime();
                string = currentTime <= 0 ? z11 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsUnmuted) : currentTime < 3600 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0])) : currentTime < 86400 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0])) : currentTime < 31536000 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0])) : null;
            }
            if (string == null) {
                string = LocaleController.getString(R.string.NotificationsOff);
            }
            if (lk0Var.f) {
                string = w.c.e(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(lk0Var.d)) {
            TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(MessagesController.getInstance(i10), lk0Var.d);
            if (n10 == null || (user = MessagesController.getInstance(i10).getUser(Long.valueOf(n10.user_id))) == null) {
                return;
            }
            d(user, charSequence, string, false);
            return;
        }
        if (DialogObject.isUserDialog(lk0Var.d)) {
            Object user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(lk0Var.d));
            if (user2 != null) {
                d(user2, charSequence, string, z4);
                return;
            }
            return;
        }
        Object chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-lk0Var.d));
        if (chat != null) {
            d(chat, charSequence, string, z4);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public Object getCurrentObject() {
        return this.D;
    }

    public long getDialogId() {
        return this.R;
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public final void h(int i10, h51 h51Var, boolean z4) {
        long j10 = h51Var.x;
        if (j10 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null) {
                d(chat, null, chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z4);
                return;
            }
            return;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        String publicUsername = UserObject.getPublicUsername(user);
        if (user != null) {
            d(user, null, !TextUtils.isEmpty(publicUsername) ? yh.k("@", publicUsername) : user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z4);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int i10, boolean z4) {
        if (i10 > 0) {
            i10 += AndroidUtilities.dp(6.0f);
        }
        boolean z10 = LocaleController.isRTL;
        this.b.setPadding(z10 ? i10 : 0, 0, !z10 ? i10 : 0, 0);
        if (z4) {
            boolean z11 = LocaleController.isRTL;
            int i11 = z11 ? i10 : 0;
            if (z11) {
                i10 = 0;
            }
            this.c.setPadding(i11, 0, i10, 0);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        String str;
        String str2;
        CharSequence charSequence;
        boolean z4;
        long botVerificationIcon;
        CharSequence charSequence2;
        int i11;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z10;
        char c3;
        TLRPC.FileLocation fileLocation2;
        this.R = 0L;
        this.S = false;
        Object obj = this.D;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.R = user.id;
            fileLocation = fileLocation3;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.R = chat2.id;
            this.S = ChatObject.isCommunity(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i10 != 0) {
            boolean z11 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.L) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z11 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.K) {
                    z11 = true;
                }
            }
            if (z11 || this.E != null || this.J == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                str = null;
            } else {
                if (user != null) {
                    str = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
                } else {
                    str = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
                }
                if (!str.equals(this.J)) {
                    z11 = true;
                }
            }
            if (!z11) {
                return;
            }
        } else {
            str = null;
        }
        boolean z12 = this.D instanceof String;
        oh.a4 a4Var = this.a;
        int i12 = this.M;
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.b;
        org.telegram.ui.Components.z8 z8Var = this.B;
        if (z12) {
            ((FrameLayout.LayoutParams) l5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            String str3 = (String) this.D;
            str3.getClass();
            switch (str3.hashCode()) {
                case -1716307998:
                    if (str3.equals("archived")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    z8Var.g(11);
                    break;
                case 1:
                    z8Var.g(6);
                    break;
                case 2:
                    z8Var.g(5);
                    break;
                case 3:
                    z8Var.g(4);
                    break;
                case 4:
                    z8Var.g(24);
                    break;
                case 5:
                    z8Var.g(8);
                    break;
                case 6:
                    z8Var.g(10);
                    break;
                case 7:
                    z8Var.g(9);
                    break;
                case '\b':
                    z8Var.g(23);
                    break;
                case '\t':
                    z8Var.g(7);
                    break;
            }
            a4Var.f(null, "50_50", z8Var);
            this.F = "";
        } else {
            ((FrameLayout.LayoutParams) l5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            if (user != null) {
                if (this.H && UserObject.isUserSelf(user)) {
                    l5Var2.l(LocaleController.getString(R.string.SavedMessages), true);
                    l5Var.l(null, false);
                    z8Var.g(1);
                    a4Var.h(null, "50_50", z8Var, user);
                    ((FrameLayout.LayoutParams) l5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                z8Var.m(i12, user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.K = userStatus3.expires;
                } else {
                    this.K = 0;
                }
            } else {
                if (chat == null) {
                    CharSequence charSequence3 = this.E;
                    if (charSequence3 != null) {
                        str2 = null;
                        z8Var.n(this.G, charSequence3.toString(), null);
                    } else {
                        str2 = null;
                        z8Var.n(this.G, "#", null);
                    }
                    charSequence = this.E;
                    org.telegram.ui.ActionBar.g6 g6Var = this.y;
                    if (charSequence == null) {
                        this.J = str2;
                        String str4 = this.I;
                        if (str4 != null) {
                            charSequence = AndroidUtilities.highlightText(charSequence, str4, g6Var);
                        }
                        if (charSequence != null) {
                            try {
                                z10 = false;
                                try {
                                    charSequence = Emoji.replaceEmoji(charSequence, l5Var2.getPaint().getFontMetricsInt(), false);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                            l5Var2.l(charSequence, z10);
                        }
                        z10 = false;
                        l5Var2.l(charSequence, z10);
                    } else {
                        if (user != null) {
                            this.J = str == null ? UserObject.getUserName(user) : AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(str));
                        } else if (chat != null) {
                            if (str == null) {
                                str = chat.title;
                            }
                            this.J = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(str));
                        } else {
                            this.J = "";
                        }
                        CharSequence charSequence4 = this.J;
                        String str5 = this.I;
                        if (str5 != null) {
                            charSequence4 = AndroidUtilities.highlightText(charSequence4, str5, g6Var);
                        }
                        if (charSequence4 != null) {
                            try {
                                z4 = false;
                                try {
                                    charSequence4 = Emoji.replaceEmoji(charSequence4, l5Var2.getPaint().getFontMetricsInt(), false);
                                } catch (Exception unused3) {
                                }
                            } catch (Exception unused4) {
                            }
                            l5Var2.l(charSequence4, z4);
                        }
                        z4 = false;
                        l5Var2.l(charSequence4, z4);
                    }
                    botVerificationIcon = user == null ? DialogObject.getBotVerificationIcon(user) : chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
                    org.telegram.ui.Components.j5 j5Var = this.v;
                    if (botVerificationIcon != 0) {
                        j5Var.g(null, false);
                        l5Var2.setLeftDrawable((Drawable) null);
                    } else {
                        j5Var.j(botVerificationIcon, false);
                        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
                        l5Var2.setLeftDrawable(j5Var);
                    }
                    if (user == null && MessagesController.getInstance(i12).isPremiumUser(user) && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                        if (DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                            long emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(user.emoji_status);
                            org.telegram.ui.Components.j5 j5Var2 = this.w;
                            j5Var2.j(emojiStatusDocumentId, false);
                            j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
                            l5Var2.i(j5Var2);
                        } else {
                            if (this.s == null) {
                                this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                                ta taVar = new ta(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.s);
                                this.s = taVar;
                                taVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var), PorterDuff.Mode.MULTIPLY));
                            }
                            l5Var2.i(this.s);
                        }
                        l5Var2.setRightDrawableTopPadding(-AndroidUtilities.dp(0.5f));
                    } else {
                        l5Var2.i(null);
                        l5Var2.setRightDrawableTopPadding(0);
                    }
                    charSequence2 = this.F;
                    int i13 = this.N;
                    if (charSequence2 == null) {
                        l5Var.setTextColor(i13);
                        CharSequence charSequence5 = this.F;
                        String str6 = this.I;
                        if (str6 != null) {
                            charSequence5 = AndroidUtilities.highlightText(charSequence5, str6, g6Var);
                        }
                        i11 = 0;
                        l5Var.l(charSequence5, false);
                    } else if (user == null) {
                        i11 = 0;
                    } else if (user.bot) {
                        l5Var.setTextColor(i13);
                        if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                            i11 = 0;
                            l5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                        } else {
                            i11 = 0;
                            l5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                        }
                    } else if (user.id == UserConfig.getInstance(i12).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || MessagesController.getInstance(i12).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                        i11 = 0;
                        l5Var.setTextColor(this.O);
                        l5Var.l(LocaleController.getString(R.string.Online), false);
                    } else {
                        l5Var.setTextColor(i13);
                        i11 = 0;
                        l5Var.l(LocaleController.formatUserStatus(i12, user), false);
                    }
                    imageView = this.d;
                    if (imageView.getVisibility() != 0) {
                        imageView.setVisibility(8);
                        imageView.setImageResource(i11);
                    } else {
                        imageView.getVisibility();
                    }
                    this.L = fileLocation;
                    if (user == null) {
                        a4Var.e(user, z8Var);
                    } else if (chat != null) {
                        a4Var.e(chat, z8Var);
                    } else {
                        a4Var.setImageDrawable(z8Var);
                    }
                    a4Var.setRoundRadius(!this.S ? AndroidUtilities.dp(12.777778f) : (chat == null || !chat.forum) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(14.0f));
                    l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
                }
                z8Var.k(i12, chat);
            }
        }
        str2 = null;
        charSequence = this.E;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.y;
        if (charSequence == null) {
        }
        if (user == null) {
        }
        org.telegram.ui.Components.j5 j5Var3 = this.v;
        if (botVerificationIcon != 0) {
        }
        if (user == null) {
        }
        l5Var2.i(null);
        l5Var2.setRightDrawableTopPadding(0);
        charSequence2 = this.F;
        int i132 = this.N;
        if (charSequence2 == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.L = fileLocation;
        if (user == null) {
        }
        a4Var.setRoundRadius(!this.S ? AndroidUtilities.dp(12.777778f) : (chat == null || !chat.forum) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(14.0f));
        l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.w.a();
        this.v.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.w.b();
        this.v.b();
        this.Q.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.P) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            np npVar = this.e;
            if (npVar != null && npVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(npVar.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb = new StringBuilder();
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        if (l5Var != null) {
            CharSequence text = l5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb.append(text);
            }
        }
        TextView textView = this.n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text2);
            }
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = this.c;
        if (l5Var2 != null) {
            CharSequence text3 = l5Var2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(text3);
            }
        }
        if (sb.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.T ? 56.0f : 58.0f) + (this.P ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAddButtonVisible(boolean z4) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z4 ? 0 : 8);
    }

    public void setAvatarPadding(int i10) {
        b(i10, 0);
    }

    public void setCallCellStyle(int i10) {
        this.T = true;
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        l5Var.setTextSize(15);
        boolean z4 = LocaleController.isRTL;
        l5Var.setLayoutParams(k7.c6.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 30.0f : i10 + 66, 10.0f, z4 ? i10 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = this.c;
        l5Var2.setTextSize(13);
        boolean z10 = LocaleController.isRTL;
        l5Var2.setLayoutParams(k7.c6.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i10 + 66, 32.0f, z10 ? i10 + 66 : 30.0f, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        oh.a4 a4Var = this.a;
        a4Var.setRoundRadius(dp);
        boolean z11 = LocaleController.isRTL;
        a4Var.setLayoutParams(k7.c6.d(44, 44.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 8, 6.0f, z11 ? i10 + 8 : 0.0f, 0.0f));
        np npVar = this.e;
        if (npVar != null) {
            boolean z12 = LocaleController.isRTL;
            npVar.setLayoutParams(k7.c6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 37, 32.0f, z12 ? i10 + 37 : 0.0f, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z4) {
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z4);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            ImageView imageView = this.x;
            if (imageView != null) {
                removeView(imageView);
                this.x = null;
                return;
            }
            return;
        }
        if (this.x == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.x = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            k7.e6.a(this.x);
            this.x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.x;
            int i10 = org.telegram.ui.ActionBar.k6.A6;
            org.telegram.ui.ActionBar.g6 g6Var = this.y;
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN));
            this.x.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 5, -1));
            ImageView imageView4 = this.x;
            boolean z4 = LocaleController.isRTL;
            addView(imageView4, k7.c6.d(30, 30.0f, (z4 ? 3 : 5) | 16, z4 ? 14.0f : 0.0f, 0.0f, z4 ? 0.0f : 14.0f, 0.0f));
        }
        this.x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.G = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.I = str;
        j(0);
    }

    public void setSelfAsSavedMessages(boolean z4) {
        this.H = z4;
    }

    public va(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context);
        int i12;
        int i13;
        int i14;
        this.M = UserConfig.selectedAccount;
        this.Q = new l6(this);
        this.y = g6Var;
        if (z10) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.k6.Sh, g6Var, textView, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{14.0f}, org.telegram.ui.ActionBar.k6.Oh));
            textView.setPadding(org.telegram.ui.b.e(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z11 = LocaleController.isRTL;
            addView(textView, k7.c6.d(-2, 28.0f, (z11 ? 3 : 5) | 48, z11 ? 14.0f : 0.0f, 15.0f, z11 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i12 = 0;
        }
        this.N = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var);
        this.O = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.il, g6Var);
        this.B = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        oh.a4 a4Var = new oh.a4(this, context, 2);
        this.a = a4Var;
        a4Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(a4Var, k7.c6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 7, 6.0f, z12 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        int i15 = (z13 ? 5 : 3) | 48;
        if (z13) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f10 = i13;
        if (z13) {
            i14 = i10 + 64;
        } else {
            i14 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(l5Var, k7.c6.d(-1, 20.0f, i15, f10, 10.0f, i14, 0.0f));
        this.v = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), l5Var);
        this.w = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var2;
        l5Var2.setTextSize(15);
        l5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(l5Var2, k7.c6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? i12 + 28 : i10 + 64, 32.0f, z14 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.m6, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        boolean z15 = LocaleController.isRTL;
        addView(imageView, k7.c6.d(-2, -2.0f, (z15 ? 5 : 3) | 16, z15 ? 0.0f : 16.0f, 0.0f, z15 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f = checkBoxSquare;
            boolean z16 = LocaleController.isRTL;
            addView(checkBoxSquare, k7.c6.d(18, 18.0f, (z16 ? 3 : 5) | 16, z16 ? 19.0f : 0.0f, 0.0f, z16 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            np npVar = new np(context, 21, g6Var);
            this.e = npVar;
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
            npVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            boolean z17 = LocaleController.isRTL;
            addView(npVar, k7.c6.d(24, 24.0f, (z17 ? 5 : 3) | 48, z17 ? 0.0f : i10 + 24, 36.0f, z17 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var), mode));
            imageView2.setVisibility(8);
            boolean z18 = LocaleController.isRTL;
            addView(imageView2, k7.c6.d(24, 24.0f, (z18 ? 3 : 5) | 16, z18 ? i10 + 10 : 0.0f, 0.0f, z18 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z4) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            k7.e6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.uh, g6Var));
            textView2.setImportantForAccessibility(2);
            boolean z19 = LocaleController.isRTL;
            addView(textView2, k7.c6.d(-2, -2.0f, (z19 ? 3 : 5) | 48, z19 ? 23.0f : 0.0f, 10.0f, z19 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
    }
}
