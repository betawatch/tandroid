package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ik0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class wa extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.h9 E;
    public boolean F;
    public Object G;
    public CharSequence H;
    public CharSequence I;
    public int J;
    public boolean K;
    public String L;
    public String M;
    public int N;
    public TLRPC.FileLocation O;
    public final int P;
    public int Q;
    public int R;
    public boolean S;
    public final m6 T;
    public long U;
    public boolean V;
    public boolean W;
    public final ci.j4 a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final ImageView d;
    public final xp e;
    public final CheckBoxSquare f;
    public final ImageView h;
    public final TextView n;
    public final TextView r;
    public Drawable s;
    public final org.telegram.ui.Components.p5 v;
    public final org.telegram.ui.Components.p5 w;
    public ImageView x;
    public final org.telegram.ui.ActionBar.g6 y;

    public wa(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public final void a(String str, boolean z10, boolean z11, boolean z12, View.OnClickListener onClickListener) {
        TextView textView = this.n;
        if (textView == null) {
            return;
        }
        int i10 = z11 ? org.telegram.ui.ActionBar.k6.Dh : z10 ? org.telegram.ui.ActionBar.k6.Ch : (z12 && TextUtils.isEmpty(str)) ? org.telegram.ui.ActionBar.k6.Oh : org.telegram.ui.ActionBar.k6.ld;
        org.telegram.ui.ActionBar.g6 g6Var = this.y;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        if (z10 || z11) {
            textView.setText(str);
            textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(32.0f), org.telegram.ui.ActionBar.k6.o1(0.12f, w02));
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.12f, i10);
            textView.setBackground(c02);
            org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
            textView.setOnClickListener(onClickListener);
        } else if (z12 && TextUtils.isEmpty(str)) {
            textView.setPadding(b1.e(6.0f, R.string.AddTag, textView), AndroidUtilities.dp(0.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
            textView.setTranslationX(AndroidUtilities.dp(6.0f));
            y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.o1(0.12f, w02), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            org.telegram.ui.ActionBar.n6 M2 = org.telegram.ui.ActionBar.r6.M(0.12f, i10);
            textView.setBackground(Z);
            org.telegram.ui.ActionBar.r6.k(textView, Z, null, M2, g6Var);
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
            h(0, false);
        } else {
            CharSequence text = textView.getText();
            h((int) Math.ceil(textView.getPaint().measureText(text, 0, text.length())), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ch));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ld));
    }

    public final void b(int i10, int i11) {
        int i12;
        float f7;
        ci.j4 j4Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j4Var.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 7);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 7 : 0.0f);
        j4Var.setLayoutParams(layoutParams);
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
            f7 = i10 + 64 + i11;
        } else {
            f7 = (checkBoxSquare != null ? 18 : 0) + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : i10 + 64 + i11);
        layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 64 + i11 : 28.0f);
        xp xpVar = this.e;
        if (xpVar != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) xpVar.getLayoutParams();
            layoutParams4.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i10 + 32 + i11);
            layoutParams4.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i10 + 32 + i11 : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        xp xpVar = this.e;
        if (xpVar != null) {
            if (xpVar.getVisibility() != 0) {
                xpVar.setVisibility(0);
            }
            xpVar.a(z10, z11);
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

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.I = null;
            this.H = null;
            this.F = false;
            this.G = null;
            n5Var.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.I = charSequence2;
        if (charSequence != null && n5Var != null) {
            try {
                charSequence = Emoji.replaceEmoji(charSequence, n5Var.getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
        }
        this.H = charSequence;
        this.F = !(obj instanceof String);
        this.G = obj;
        this.S = z10;
        setWillNotDraw(!z10);
        i(0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.b.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.V && view == this.a) {
            zf.p.a(canvas, org.telegram.ui.ActionBar.k6.S0, (view.getWidth() / 2.0f) + view.getX(), (view.getHeight() / 2.0f) + view.getY(), view.getHeight());
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(TLRPC.User user, boolean z10) {
        d(user, null, null, z10);
    }

    public final void f(ik0 ik0Var, CharSequence charSequence, boolean z10) {
        String string;
        Object user;
        boolean z11 = ik0Var.e;
        int i10 = this.P;
        if (z11) {
            int i11 = ik0Var.c;
            string = (i11 > 0 || !ik0Var.f) ? i11 <= 0 ? LocaleController.getString(R.string.NotificationEnabled) : LocaleController.getString(R.string.NotificationDisabled) : LocaleController.getString(R.string.NotificationEnabledAutomatically);
        } else {
            boolean z12 = ik0Var.b;
            int i12 = ik0Var.c;
            int i13 = ik0Var.a;
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
            if (ik0Var.f) {
                string = si.o0.u(string, ", Auto");
            }
        }
        if (DialogObject.isEncryptedDialog(ik0Var.d)) {
            TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(MessagesController.getInstance(i10), ik0Var.d);
            if (l4 == null || (user = MessagesController.getInstance(i10).getUser(Long.valueOf(l4.user_id))) == null) {
                return;
            }
            d(user, charSequence, string, false);
            return;
        }
        if (DialogObject.isUserDialog(ik0Var.d)) {
            Object user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(ik0Var.d));
            if (user2 != null) {
                d(user2, charSequence, string, z10);
                return;
            }
            return;
        }
        Object chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-ik0Var.d));
        if (chat != null) {
            d(chat, charSequence, string, z10);
        }
    }

    public final void g(int i10, m61 m61Var, boolean z10) {
        long j10 = m61Var.x;
        if (j10 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null) {
                d(chat, null, chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z10);
                return;
            }
            return;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        String publicUsername = UserObject.getPublicUsername(user);
        if (user != null) {
            d(user, null, !TextUtils.isEmpty(publicUsername) ? si.o0.h("@", publicUsername) : user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z10);
        }
    }

    public Object getCurrentObject() {
        return this.G;
    }

    public long getDialogId() {
        return this.U;
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public final void h(int i10, boolean z10) {
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
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.FileLocation fileLocation;
        String str;
        String str2;
        CharSequence charSequence;
        boolean z10;
        long botVerificationIcon;
        int i11;
        TLRPC.UserStatus userStatus;
        TextView textView;
        ImageView imageView;
        boolean z11;
        char c10;
        TLRPC.FileLocation fileLocation2;
        this.U = 0L;
        this.V = false;
        Object obj = this.G;
        if (obj instanceof TLRPC.User) {
            user = (TLRPC.User) obj;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            this.U = user.id;
            fileLocation = fileLocation3;
            chat = null;
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
            this.U = chat2.id;
            this.V = ChatObject.isCommunity(chat2);
            fileLocation = fileLocation4;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
            fileLocation = null;
        }
        if (i10 != 0) {
            boolean z12 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.O) != null && fileLocation == null) || ((fileLocation2 == null && fileLocation != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id))));
            if (user != null && !z12 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.N) {
                    z12 = true;
                }
            }
            if (z12 || this.H != null || this.M == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                str = null;
            } else {
                if (user != null) {
                    str = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
                } else {
                    str = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
                }
                if (!str.equals(this.M)) {
                    z12 = true;
                }
            }
            if (!z12) {
                return;
            }
        } else {
            str = null;
        }
        boolean z13 = this.G instanceof String;
        ci.j4 j4Var = this.a;
        int i12 = this.P;
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.b;
        org.telegram.ui.Components.h9 h9Var = this.E;
        if (z13) {
            ((FrameLayout.LayoutParams) n5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            String str3 = (String) this.G;
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
                    h9Var.g(11);
                    break;
                case 1:
                    h9Var.g(6);
                    break;
                case 2:
                    h9Var.g(5);
                    break;
                case 3:
                    h9Var.g(4);
                    break;
                case 4:
                    h9Var.g(24);
                    break;
                case 5:
                    h9Var.g(8);
                    break;
                case 6:
                    h9Var.g(10);
                    break;
                case 7:
                    h9Var.g(9);
                    break;
                case '\b':
                    h9Var.g(23);
                    break;
                case '\t':
                    h9Var.g(7);
                    break;
            }
            j4Var.g(null, "50_50", h9Var);
            this.I = "";
        } else {
            ((FrameLayout.LayoutParams) n5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            if (user != null) {
                if (this.K && UserObject.isUserSelf(user)) {
                    n5Var2.l(LocaleController.getString(R.string.SavedMessages), true);
                    n5Var.l(null, false);
                    h9Var.g(1);
                    j4Var.h(null, "50_50", h9Var, user);
                    ((FrameLayout.LayoutParams) n5Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                h9Var.m(i12, user);
                TLRPC.UserStatus userStatus3 = user.status;
                if (userStatus3 != null) {
                    this.N = userStatus3.expires;
                } else {
                    this.N = 0;
                }
            } else {
                if (chat == null) {
                    CharSequence charSequence2 = this.H;
                    if (charSequence2 != null) {
                        str2 = null;
                        h9Var.n(this.J, charSequence2.toString(), null);
                    } else {
                        str2 = null;
                        h9Var.n(this.J, "#", null);
                    }
                    charSequence = this.H;
                    org.telegram.ui.ActionBar.g6 g6Var = this.y;
                    if (charSequence == null) {
                        this.M = str2;
                        String str4 = this.L;
                        if (str4 != null) {
                            charSequence = AndroidUtilities.highlightText(charSequence, str4, g6Var);
                        }
                        if (charSequence != null) {
                            try {
                                z11 = false;
                                try {
                                    charSequence = Emoji.replaceEmoji(charSequence, n5Var2.getPaint().getFontMetricsInt(), false);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                            n5Var2.l(charSequence, z11);
                        }
                        z11 = false;
                        n5Var2.l(charSequence, z11);
                    } else {
                        if (user != null) {
                            this.M = str == null ? UserObject.getUserName(user) : AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(str));
                        } else if (chat != null) {
                            if (str == null) {
                                str = chat.title;
                            }
                            this.M = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(str));
                        } else {
                            this.M = "";
                        }
                        CharSequence charSequence3 = this.M;
                        String str5 = this.L;
                        if (str5 != null) {
                            charSequence3 = AndroidUtilities.highlightText(charSequence3, str5, g6Var);
                        }
                        if (charSequence3 != null) {
                            try {
                                z10 = false;
                                try {
                                    charSequence3 = Emoji.replaceEmoji(charSequence3, n5Var2.getPaint().getFontMetricsInt(), false);
                                } catch (Exception unused3) {
                                }
                            } catch (Exception unused4) {
                            }
                            n5Var2.l(charSequence3, z10);
                        }
                        z10 = false;
                        n5Var2.l(charSequence3, z10);
                    }
                    botVerificationIcon = user == null ? DialogObject.getBotVerificationIcon(user) : chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
                    org.telegram.ui.Components.p5 p5Var = this.v;
                    if (botVerificationIcon != 0) {
                        p5Var.g(null, false);
                        n5Var2.setLeftDrawable((Drawable) null);
                    } else {
                        p5Var.j(botVerificationIcon, false);
                        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
                        n5Var2.setLeftDrawable(p5Var);
                    }
                    if (user == null && MessagesController.getInstance(i12).isPremiumUser(user) && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                        if (DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                            long emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(user.emoji_status);
                            org.telegram.ui.Components.p5 p5Var2 = this.w;
                            p5Var2.j(emojiStatusDocumentId, false);
                            p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
                            n5Var2.i(p5Var2);
                        } else {
                            if (this.s == null) {
                                this.s = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                                ua uaVar = new ua(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.s);
                                this.s = uaVar;
                                org.telegram.ui.ActionBar.r6.z(this, uaVar, org.telegram.ui.ActionBar.k6.z9, g6Var, PorterDuff.Mode.MULTIPLY);
                            }
                            n5Var2.i(this.s);
                        }
                        n5Var2.setRightDrawableTopPadding(-AndroidUtilities.dp(0.5f));
                    } else {
                        n5Var2.i(null);
                        n5Var2.setRightDrawableTopPadding(0);
                    }
                    if (this.I == null) {
                        n5Var.setTextColor(this.Q);
                        CharSequence charSequence4 = this.I;
                        String str6 = this.L;
                        if (str6 != null) {
                            charSequence4 = AndroidUtilities.highlightText(charSequence4, str6, g6Var);
                        }
                        i11 = 0;
                        n5Var.l(charSequence4, false);
                    } else if (user == null) {
                        i11 = 0;
                    } else if (user.bot) {
                        n5Var.setTextColor(this.Q);
                        if (user.bot_chat_history || ((textView = this.n) != null && textView.getVisibility() == 0)) {
                            i11 = 0;
                            n5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                        } else {
                            i11 = 0;
                            n5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                        }
                    } else if (user.id == UserConfig.getInstance(i12).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || MessagesController.getInstance(i12).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                        i11 = 0;
                        n5Var.setTextColor(this.R);
                        n5Var.l(LocaleController.getString(R.string.Online), false);
                    } else {
                        n5Var.setTextColor(this.Q);
                        i11 = 0;
                        n5Var.l(LocaleController.formatUserStatus(i12, user), false);
                    }
                    imageView = this.d;
                    if (imageView.getVisibility() != 0) {
                        imageView.setVisibility(8);
                        imageView.setImageResource(i11);
                    } else {
                        imageView.getVisibility();
                    }
                    this.O = fileLocation;
                    if (user == null) {
                        j4Var.e(user, h9Var);
                    } else if (chat != null) {
                        j4Var.e(chat, h9Var);
                    } else {
                        j4Var.setImageDrawable(h9Var);
                    }
                    j4Var.setRoundRadius(!this.V ? AndroidUtilities.dp(12.777778f) : (chat == null || !chat.forum) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(14.0f));
                    org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.G6, g6Var);
                }
                h9Var.k(i12, chat);
            }
        }
        str2 = null;
        charSequence = this.H;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.y;
        if (charSequence == null) {
        }
        if (user == null) {
        }
        org.telegram.ui.Components.p5 p5Var3 = this.v;
        if (botVerificationIcon != 0) {
        }
        if (user == null) {
        }
        n5Var2.i(null);
        n5Var2.setRightDrawableTopPadding(0);
        if (this.I == null) {
        }
        imageView = this.d;
        if (imageView.getVisibility() != 0) {
        }
        this.O = fileLocation;
        if (user == null) {
        }
        j4Var.setRoundRadius(!this.V ? AndroidUtilities.dp(12.777778f) : (chat == null || !chat.forum) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.G6, g6Var2);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
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
        this.T.g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.f;
        if (checkBoxSquare == null || checkBoxSquare.getVisibility() != 0) {
            xp xpVar = this.e;
            if (xpVar != null && xpVar.getVisibility() == 0) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(xpVar.a.q);
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            }
        } else {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(checkBoxSquare.h);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        if (n5Var != null) {
            CharSequence text = n5Var.getText();
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
        org.telegram.ui.ActionBar.n5 n5Var2 = this.c;
        if (n5Var2 != null) {
            CharSequence text3 = n5Var2.getText();
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.W ? 56.0f : 58.0f) + (this.S ? 1 : 0), TLObject.FLAG_30));
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
        this.W = true;
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        n5Var.setTextSize(15);
        boolean z10 = LocaleController.isRTL;
        n5Var.setLayoutParams(w7.z5.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 30.0f : i10 + 66, 10.0f, z10 ? i10 + 66 : 30.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = this.c;
        n5Var2.setTextSize(13);
        boolean z11 = LocaleController.isRTL;
        n5Var2.setLayoutParams(w7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 30.0f : i10 + 66, 32.0f, z11 ? i10 + 66 : 30.0f, 0.0f));
        int dp = AndroidUtilities.dp(22.0f);
        ci.j4 j4Var = this.a;
        j4Var.setRoundRadius(dp);
        boolean z12 = LocaleController.isRTL;
        j4Var.setLayoutParams(w7.z5.d(44, 44.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 8, 6.0f, z12 ? i10 + 8 : 0.0f, 0.0f));
        xp xpVar = this.e;
        if (xpVar != null) {
            boolean z13 = LocaleController.isRTL;
            xpVar.setLayoutParams(w7.z5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 37, 32.0f, z13 ? i10 + 37 : 0.0f, 0.0f));
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
            w7.b6.a(this.x);
            this.x.setImageResource(R.drawable.ic_close_white);
            ImageView imageView3 = this.x;
            int i10 = org.telegram.ui.ActionBar.k6.A6;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.g6 g6Var = this.y;
            org.telegram.ui.ActionBar.r6.t(imageView3, i10, g6Var, mode);
            ImageView imageView4 = this.x;
            int i11 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.S(imageView4, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 5, -1), null, org.telegram.ui.ActionBar.r6.O(i11), g6Var);
            ImageView imageView5 = this.x;
            boolean z10 = LocaleController.isRTL;
            addView(imageView5, w7.z5.d(30, 30.0f, (z10 ? 3 : 5) | 16, z10 ? 14.0f : 0.0f, 0.0f, z10 ? 0.0f : 14.0f, 0.0f));
        }
        this.x.setOnClickListener(onClickListener);
    }

    public void setCurrentId(int i10) {
        this.J = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setQuery(String str) {
        this.L = str;
        i(0);
    }

    public void setSelfAsSavedMessages(boolean z10) {
        this.K = z10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int i10 = this.Q;
            int i11 = this.R;
            org.telegram.ui.ActionBar.g6 g6Var = this.y;
            if (!this.a0) {
                this.Q = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, g6Var);
                this.R = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.il, g6Var);
            }
            org.telegram.ui.ActionBar.n5 n5Var = this.c;
            if (n5Var != null) {
                int textColor = n5Var.getTextColor();
                if (textColor == i11 && i11 != i10) {
                    n5Var.setTextColor(this.R);
                } else if (textColor == i10) {
                    n5Var.setTextColor(this.Q);
                }
            }
            ci.j4 j4Var = this.a;
            if (j4Var != null) {
                j4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public wa(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        int i13;
        float f7;
        this.P = UserConfig.selectedAccount;
        this.T = new m6(this);
        this.y = g6Var;
        int i14 = 3;
        if (z11) {
            TextView textView = new TextView(context);
            this.r = textView;
            textView.setGravity(17);
            org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.Sh, g6Var, 1, 14.0f);
            textView.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{14.0f}, org.telegram.ui.ActionBar.k6.Oh));
            textView.setPadding(b1.e(17.0f, R.string.Add, textView), 0, AndroidUtilities.dp(17.0f), 0);
            boolean z12 = LocaleController.isRTL;
            addView(textView, w7.z5.d(-2, 28.0f, (z12 ? 3 : 5) | 48, z12 ? 14.0f : 0.0f, 15.0f, z12 ? 0.0f : 14.0f, 0.0f));
            i12 = (int) Math.ceil((textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i12 = 0;
        }
        this.Q = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, g6Var);
        this.R = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.il, g6Var);
        this.E = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        ci.j4 j4Var = new ci.j4(this, context, i14);
        this.a = j4Var;
        j4Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z13 = LocaleController.isRTL;
        addView(j4Var, w7.z5.d(46, 46.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : i10 + 7, 6.0f, z13 ? i10 + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(16);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        int i15 = (z14 ? 5 : 3) | 48;
        if (z14) {
            i13 = (i11 == 2 ? 18 : 0) + 28 + i12;
        } else {
            i13 = i10 + 64;
        }
        float f10 = i13;
        if (z14) {
            f7 = i10 + 64;
        } else {
            f7 = (i11 != 2 ? 0 : 18) + 28 + i12;
        }
        addView(n5Var, w7.z5.d(-1, 20.0f, i15, f10, 10.0f, f7, 0.0f));
        this.v = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), n5Var);
        this.w = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var2;
        n5Var2.setTextSize(15);
        n5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z15 = LocaleController.isRTL;
        addView(n5Var2, w7.z5.d(-1, 20.0f, (z15 ? 5 : 3) | 48, z15 ? i12 + 28 : i10 + 64, 32.0f, z15 ? i10 + 64 : i12 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.k6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i16, g6Var, mode);
        imageView.setVisibility(8);
        boolean z16 = LocaleController.isRTL;
        addView(imageView, w7.z5.d(-2, -2.0f, (z16 ? 5 : 3) | 16, z16 ? 0.0f : 16.0f, 0.0f, z16 ? 16.0f : 0.0f, 0.0f));
        if (i11 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, null, false);
            this.f = checkBoxSquare;
            boolean z17 = LocaleController.isRTL;
            addView(checkBoxSquare, w7.z5.d(18, 18.0f, (z17 ? 3 : 5) | 16, z17 ? 19.0f : 0.0f, 0.0f, z17 ? 0.0f : 19.0f, 0.0f));
        } else if (i11 == 1) {
            xp xpVar = new xp(context, 21, g6Var);
            this.e = xpVar;
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
            xpVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            boolean z18 = LocaleController.isRTL;
            addView(xpVar, w7.z5.d(24, 24.0f, (z18 ? 5 : 3) | 48, z18 ? 0.0f : i10 + 24, 36.0f, z18 ? i10 + 24 : 0.0f, 0.0f));
        } else if (i11 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.h = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.account_check);
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Oh, g6Var, mode);
            imageView2.setVisibility(8);
            boolean z19 = LocaleController.isRTL;
            addView(imageView2, w7.z5.d(24, 24.0f, (z19 ? 3 : 5) | 16, z19 ? i10 + 10 : 0.0f, 0.0f, z19 ? 0.0f : i10 + 10, 0.0f));
        }
        if (z10) {
            TextView textView2 = new TextView(context);
            this.n = textView2;
            w7.b6.b(textView2, 0.05f, 1.2f);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.uh, g6Var);
            textView2.setImportantForAccessibility(2);
            boolean z20 = LocaleController.isRTL;
            addView(textView2, w7.z5.d(-2, -2.0f, (z20 ? 3 : 5) | 48, z20 ? 23.0f : 0.0f, 10.0f, z20 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }
}
