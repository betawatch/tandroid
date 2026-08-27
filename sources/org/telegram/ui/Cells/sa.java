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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.n41;
import org.telegram.ui.fk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class sa extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.Components.y8 A;
    public boolean B;
    public Object C;
    public CharSequence D;
    public CharSequence E;
    public int F;
    public boolean G;
    public String H;
    public String I;
    public int J;
    public TLRPC.FileLocation K;
    public final int L;
    public final int M;
    public final int N;
    public boolean O;
    public final i6 P;
    public long Q;
    public boolean R;
    public boolean S;
    public final jh.z3 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final ImageView d;
    public final bp e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final org.telegram.ui.Components.i5 v;
    public final org.telegram.ui.Components.i5 w;
    public ImageView x;
    public final org.telegram.ui.ActionBar.c6 y;

    public sa(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.y;
        int v02 = z11 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Dh, c6Var) : z10 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ch, c6Var) : (z12 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ld, c6Var);
        textView.setTextColor(v02);
        if (z10 || z11) {
            textView.setText(str);
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, v02)));
            textView.setOnClickListener(onClickListener);
        } else if (z12 && TextUtils.isEmpty(str)) {
            textView.setPadding(pa.c(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            textView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.12f, v02), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setText(str);
            textView.setPadding(0, 0, 0, 0);
            textView.setTranslationX(0.0f);
            textView.setBackground(null);
            textView.setOnClickListener(onClickListener);
        }
        textView.setVisibility((str != null || z12) ? 0 : 8);
        if (str == null && !z12) {
            i(0, false);
        } else {
            CharSequence text = textView.getText();
            i((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    public final void b(int i10, int i11) {
        int i12;
        float f10;
        jh.z3 z3Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z3Var.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 7);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 7 : 0.0f);
        z3Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        boolean z10 = LocaleController.isRTL;
        CheckBoxSquare checkBoxSquare = this.f;
        if (z10) {
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
        bp bpVar = this.e;
        if (bpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) bpVar.getLayoutParams();
            layoutParams4.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 32 + i11);
            layoutParams4.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 32 + i11 : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        bp bpVar = this.e;
        if (bpVar != null) {
            if (bpVar.getVisibility() != 0) {
                bpVar.setVisibility(0);
            }
            bpVar.a(z10, z11);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                checkBoxSquare.setVisibility(0);
            }
            checkBoxSquare.a(z10, z11);
        } else {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.R && view == this.a) {
            gf.s.a(canvas, org.telegram.ui.ActionBar.g6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.E = null;
            this.D = null;
            this.B = false;
            this.C = null;
            h5Var.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.E = charSequence2;
        if (charSequence != null && h5Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.D = charSequence;
        this.B = !(obj instanceof String);
        this.C = obj;
        this.O = z10;
        setWillNotDraw(!z10);
        j(0);
    }

    public final void f(TLRPC.User user, boolean z10) {
        e(user, null, null, z10);
    }

    public final void g(fk0 fk0Var, CharSequence charSequence, boolean z10) {
        String string;
        Object user;
        boolean z11 = fk0Var.e;
        int i10 = this.L;
        if (z11) {
            int i11 = fk0Var.c;
            string = (i11 > 0 || !fk0Var.f) ? i11 <= 0 ? LocaleController.getString(R.string.NotificationEnabled) : LocaleController.getString(R.string.NotificationDisabled) : LocaleController.getString(R.string.NotificationEnabledAutomatically);
        } else {
            boolean z12 = fk0Var.b;
            int i12 = fk0Var.c;
            int i13 = fk0Var.a;
            boolean z13 = true;
            if (i12 != 3 || i13 == Integer.MAX_VALUE) {
                if (i12 != 0 && i12 != 1) {
                    z13 = false;
                }
                if (z13 && z12) {
                    string = LocaleController.getString(R.string.NotificationsCustom);
                } else {
                    string = LocaleController.getString(z13 ? R.string.NotificationsUnmuted : R.string.NotificationsMuted);
                }
            } else {
                int currentTime = i13 - ConnectionsManager.getInstance(i10).getCurrentTime();
                string = currentTime <= 0 ? z12 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsUnmuted) : currentTime < 3600 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0])) : currentTime < 86400 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0])) : currentTime < 31536000 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0])) : null;
            }
            if (string == null) {
                string = LocaleController.getString(R.string.NotificationsOff);
            }
            if (fk0Var.f) {
                string = s3.c.l(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(fk0Var.d)) {
            TLRPC.EncryptedChat n10 = org.telegram.messenger.y1.n(MessagesController.getInstance(i10), fk0Var.d);
            if (n10 == null || (user = MessagesController.getInstance(i10).getUser(Long.valueOf(n10.user_id))) == null) {
                return;
            }
            e(user, charSequence, string, false);
            return;
        }
        if (DialogObject.isUserDialog(fk0Var.d)) {
            Object user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(fk0Var.d));
            if (user2 != null) {
                e(user2, charSequence, string, z10);
                return;
            }
            return;
        }
        Object chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-fk0Var.d));
        if (chat != null) {
            e(chat, charSequence, string, z10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public Object getCurrentObject() {
        return this.C;
    }

    public long getDialogId() {
        return this.Q;
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public final void h(int i10, n41 n41Var, boolean z10) {
        long j10 = n41Var.x;
        if (j10 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null) {
                e(chat, null, chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z10);
                return;
            }
            return;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        String publicUsername = UserObject.getPublicUsername(user);
        if (user != null) {
            e(user, null, !TextUtils.isEmpty(publicUsername) ? s3.c.e("@", publicUsername) : user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z10);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(int i10, boolean z10) {
        if (i10 > 0) {
            i10 += AndroidUtilities.dp(6.0f);
        }
        boolean z11 = LocaleController.isRTL;
        this.b.setPadding(z11 ? i10 : 0, 0, !z11 ? i10 : 0, 0);
        if (z10) {
            boolean z12 = LocaleController.isRTL;
            int i11 = z12 ? i10 : 0;
            if (z12) {
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
        boolean z10;
        long botVerificationIcon;
        CharSequence charSequence2;
        int i11;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z11;
        char c10;
        TLRPC.FileLocation fileLocation2;
        this.Q = 0L;
        this.R = false;
        Object obj = this.C;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.Q = user.id;
            fileLocation = fileLocation3;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.Q = chat2.id;
            this.R = ChatObject.isCommunity(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i10 != 0) {
            boolean z12 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.K) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z12 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.J) {
                    z12 = true;
                }
            }
            if (z12 || this.D != null || this.I == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                str = null;
            } else {
                if (user != null) {
                    str = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
                } else {
                    str = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
                }
                if (!str.equals(this.I)) {
                    z12 = true;
                }
            }
            if (!z12) {
                return;
            }
        } else {
            str = null;
        }
        boolean z13 = this.C instanceof String;
        jh.z3 z3Var = this.a;
        int i12 = this.L;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.b;
        org.telegram.ui.Components.y8 y8Var = this.A;
        if (z13) {
            ((FrameLayout.LayoutParams) h5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            String str3 = (String) this.C;
            str3.getClass();
            switch (str3.hashCode()) {
                case -1716307998:
                    if (str3.equals("archived")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1237460524:
                    if (str3.equals("groups")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1197490811:
                    if (str3.equals("non_contacts")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -567451565:
                    if (str3.equals("contacts")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -268161860:
                    if (str3.equals("new_chats")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3029900:
                    if (str3.equals("bots")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3496342:
                    if (str3.equals("read")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 104264043:
                    if (str3.equals("muted")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 151051367:
                    if (str3.equals("existing_chats")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1432626128:
                    if (str3.equals("channels")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    y8Var.g(11);
                    break;
                case 1:
                    y8Var.g(6);
                    break;
                case 2:
                    y8Var.g(5);
                    break;
                case 3:
                    y8Var.g(4);
                    break;
                case 4:
                    y8Var.g(24);
                    break;
                case 5:
                    y8Var.g(8);
                    break;
                case 6:
                    y8Var.g(10);
                    break;
                case 7:
                    y8Var.g(9);
                    break;
                case '\b':
                    y8Var.g(23);
                    break;
                case '\t':
                    y8Var.g(7);
                    break;
            }
            z3Var.f(null, "50_50", y8Var);
            this.E = "";
        } else {
            ((FrameLayout.LayoutParams) h5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            if (user != null) {
                if (this.G && UserObject.isUserSelf(user)) {
                    h5Var2.l(LocaleController.getString(R.string.SavedMessages), true);
                    h5Var.l(null, false);
                    y8Var.g(1);
                    z3Var.h(null, "50_50", y8Var, user);
                    ((FrameLayout.LayoutParams) h5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                y8Var.m(i12, user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.J = userStatus3.expires;
                } else {
                    this.J = 0;
                }
            } else {
                if (chat == null) {
                    CharSequence charSequence3 = this.D;
                    if (charSequence3 != null) {
                        str2 = null;
                        y8Var.n(this.F, charSequence3.toString(), null);
                    } else {
                        str2 = null;
                        y8Var.n(this.F, "#", null);
                    }
                    charSequence = this.D;
                    org.telegram.ui.ActionBar.c6 c6Var = this.y;
                    if (charSequence == null) {
                        this.I = str2;
                        String str4 = this.H;
                        if (str4 != null) {
                            charSequence = AndroidUtilities.highlightText(charSequence, str4, c6Var);
                        }
                        if (charSequence != null) {
                            try {
                                z11 = false;
                                try {
                                    charSequence = Emoji.replaceEmoji(charSequence, h5Var2.getPaint().getFontMetricsInt(), false);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                            h5Var2.l(charSequence, z11);
                        }
                        z11 = false;
                        h5Var2.l(charSequence, z11);
                    } else {
                        if (user != null) {
                            this.I = str == null ? UserObject.getUserName(user) : AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(str));
                        } else if (chat != null) {
                            if (str == null) {
                                str = chat.title;
                            }
                            this.I = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(str));
                        } else {
                            this.I = "";
                        }
                        CharSequence charSequence4 = this.I;
                        String str5 = this.H;
                        if (str5 != null) {
                            charSequence4 = AndroidUtilities.highlightText(charSequence4, str5, c6Var);
                        }
                        if (charSequence4 != null) {
                            try {
                                z10 = false;
                                try {
                                    charSequence4 = Emoji.replaceEmoji(charSequence4, h5Var2.getPaint().getFontMetricsInt(), false);
                                } catch (Exception unused3) {
                                }
                            } catch (Exception unused4) {
                            }
                            h5Var2.l(charSequence4, z10);
                        }
                        z10 = false;
                        h5Var2.l(charSequence4, z10);
                    }
                    botVerificationIcon = user == null ? DialogObject.getBotVerificationIcon(user) : chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
                    org.telegram.ui.Components.i5 i5Var = this.v;
                    if (botVerificationIcon != 0) {
                        i5Var.g(null, false);
                        h5Var2.setLeftDrawable((Drawable) null);
                    } else {
                        i5Var.j(botVerificationIcon, false);
                        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var)));
                        h5Var2.setLeftDrawable(i5Var);
                    }
                    if (user == null && MessagesController.getInstance(i12).isPremiumUser(user) && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                        if (DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                            long emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(user.emoji_status);
                            org.telegram.ui.Components.i5 i5Var2 = this.w;
                            i5Var2.j(emojiStatusDocumentId, false);
                            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var)));
                            h5Var2.i(i5Var2);
                        } else {
                            if (this.s == null) {
                                this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                                qa qaVar = new qa(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.s);
                                this.s = qaVar;
                                qaVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var), PorterDuff.Mode.MULTIPLY));
                            }
                            h5Var2.i(this.s);
                        }
                        h5Var2.setRightDrawableTopPadding(-AndroidUtilities.dp(0.5f));
                    } else {
                        h5Var2.i(null);
                        h5Var2.setRightDrawableTopPadding(0);
                    }
                    charSequence2 = this.E;
                    int i13 = this.M;
                    if (charSequence2 == null) {
                        h5Var.setTextColor(i13);
                        CharSequence charSequence5 = this.E;
                        String str6 = this.H;
                        if (str6 != null) {
                            charSequence5 = AndroidUtilities.highlightText(charSequence5, str6, c6Var);
                        }
                        i11 = 0;
                        h5Var.l(charSequence5, false);
                    } else if (user == null) {
                        i11 = 0;
                    } else if (user.bot) {
                        h5Var.setTextColor(i13);
                        if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                            i11 = 0;
                            h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                        } else {
                            i11 = 0;
                            h5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                        }
                    } else if (user.id == UserConfig.getInstance(i12).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || MessagesController.getInstance(i12).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                        i11 = 0;
                        h5Var.setTextColor(this.N);
                        h5Var.l(LocaleController.getString(R.string.Online), false);
                    } else {
                        h5Var.setTextColor(i13);
                        i11 = 0;
                        h5Var.l(LocaleController.formatUserStatus(i12, user), false);
                    }
                    imageView = this.d;
                    if (imageView.getVisibility() != 0) {
                        imageView.setVisibility(8);
                        imageView.setImageResource(i11);
                    } else {
                        imageView.getVisibility();
                    }
                    this.K = fileLocation;
                    if (user == null) {
                        z3Var.e(user, y8Var);
                    } else if (chat != null) {
                        z3Var.e(chat, y8Var);
                    } else {
                        z3Var.setImageDrawable(y8Var);
                    }
                    z3Var.setRoundRadius(!this.R ? AndroidUtilities.dp(12.777778f) : (chat == null || !chat.forum) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(14.0f));
                    h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                }
                y8Var.k(i12, chat);
            }
        }
        str2 = null;
        charSequence = this.D;
        org.telegram.ui.ActionBar.c6 c6Var2 = this.y;
        if (charSequence == null) {
        }
        if (user == null) {
        }
        org.telegram.ui.Components.i5 i5Var3 = this.v;
        if (botVerificationIcon != 0) {
        }
        if (user == null) {
        }
        h5Var2.i(null);
        h5Var2.setRightDrawableTopPadding(0);
        charSequence2 = this.E;
        int i132 = this.M;
        if (charSequence2 == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.K = fileLocation;
        if (user == null) {
        }
        z3Var.setRoundRadius(!this.R ? AndroidUtilities.dp(12.777778f) : (chat == null || !chat.forum) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(14.0f));
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
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
        this.P.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.O) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            bp bpVar = this.e;
            if (bpVar != null && bpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(bpVar.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        if (h5Var != null) {
            CharSequence text = h5Var.getText();
            if (!TextUtils.isEmpty(text)) {
                sb2.append(text);
            }
        }
        TextView textView = this.n;
        if (textView != null && textView.getVisibility() == 0) {
            CharSequence text2 = textView.getText();
            if (!TextUtils.isEmpty(text2)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text2);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.c;
        if (h5Var2 != null) {
            CharSequence text3 = h5Var2.getText();
            if (!TextUtils.isEmpty(text3)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(text3);
            }
        }
        if (sb2.length() > 0) {
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.S ? 56.0f : 58.0f) + (this.O ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAddButtonVisible(boolean z10) {
        TextView textView = this.r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public void setAvatarPadding(int i10) {
        b(i10, 0);
    }

    public void setCallCellStyle(int i10) {
        this.S = true;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        h5Var.setTextSize(15);
        boolean z10 = LocaleController.isRTL;
        h5Var.setLayoutParams(h7.z5.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i10 + 66, 10.0f, z10 ? i10 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.c;
        h5Var2.setTextSize(13);
        boolean z11 = LocaleController.isRTL;
        h5Var2.setLayoutParams(h7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 30.0f : i10 + 66, 32.0f, z11 ? i10 + 66 : 30.0f, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        jh.z3 z3Var = this.a;
        z3Var.setRoundRadius(dp);
        boolean z12 = LocaleController.isRTL;
        z3Var.setLayoutParams(h7.z5.d(44, 44.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 8, 6.0f, z12 ? i10 + 8 : 0.0f, 0.0f));
        bp bpVar = this.e;
        if (bpVar != null) {
            boolean z13 = LocaleController.isRTL;
            bpVar.setLayoutParams(h7.z5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 37, 32.0f, z13 ? i10 + 37 : 0.0f, 0.0f));
        }
    }

    public void setCheckDisabled(boolean z10) {
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z10);
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
            h7.b6.a(this.x);
            this.x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.x;
            int i10 = org.telegram.ui.ActionBar.g6.A6;
            org.telegram.ui.ActionBar.c6 c6Var = this.y;
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
            this.x.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 5, -1));
            ImageView imageView4 = this.x;
            boolean z10 = LocaleController.isRTL;
            addView(imageView4, h7.z5.d(30, 30.0f, (z10 ? 3 : 5) | 16, z10 ? 14.0f : 0.0f, 0.0f, z10 ? 0.0f : 14.0f, 0.0f));
        }
        this.x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.F = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.H = str;
        j(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.G = z10;
    }

    public sa(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        int i13;
        int i14;
        this.L = UserConfig.selectedAccount;
        this.P = new i6(this);
        this.y = c6Var;
        if (z11) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            rl.w(org.telegram.ui.ActionBar.g6.Sh, c6Var, textView, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{14.0f}, org.telegram.ui.ActionBar.g6.Oh));
            textView.setPadding(pa.c(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z12 = LocaleController.isRTL;
            addView(textView, h7.z5.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i12 = 0;
        }
        this.M = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var);
        this.N = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il, c6Var);
        this.A = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        jh.z3 z3Var = new jh.z3(this, context, 2);
        this.a = z3Var;
        z3Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z13 = LocaleController.isRTL;
        addView(z3Var, h7.z5.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        int i15 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f10 = i13;
        if (z14) {
            i14 = i10 + 64;
        } else {
            i14 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(h5Var, h7.z5.d(-1, 20.0f, i15, f10, 10.0f, i14, 0.0f));
        this.v = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), h5Var);
        this.w = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var2;
        h5Var2.setTextSize(15);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z15 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i12 + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.m6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        boolean z16 = LocaleController.isRTL;
        addView(imageView, h7.z5.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f = checkBoxSquare;
            boolean z17 = LocaleController.isRTL;
            addView(checkBoxSquare, h7.z5.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            bp bpVar = new bp(context, 21, c6Var);
            this.e = bpVar;
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            bpVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
            boolean z18 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), mode));
            imageView2.setVisibility(8);
            boolean z19 = LocaleController.isRTL;
            addView(imageView2, h7.z5.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            h7.b6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uh, c6Var));
            textView2.setImportantForAccessibility(2);
            boolean z20 = LocaleController.isRTL;
            addView(textView2, h7.z5.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
    }
}
