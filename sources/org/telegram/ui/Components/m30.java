package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m30 extends View {
    public static final TextPaint J = new TextPaint(1);
    public static final Paint K = new Paint(1);
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.f6 G;
    public final boolean H;
    public final boolean I;
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final Drawable e;
    public final RectF f;
    public final ImageReceiver h;
    public final StaticLayout n;
    public final i9 r;
    public final ContactsController.Contact s;
    public final int v;
    public final float w;
    public float x;
    public boolean y;

    public m30(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (this.y) {
            this.y = false;
            this.E = System.currentTimeMillis();
            invalidate();
        }
    }

    public final void b() {
        if (this.y) {
            return;
        }
        this.y = true;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.r.b();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.di, f6Var);
        int red = Color.red(l1);
        int[] iArr = this.F;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(l1);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(l1);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(l1);
        iArr[7] = Color.alpha(b10);
        this.e.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        K.setColor(l1);
    }

    public ContactsController.Contact getContact() {
        return this.s;
    }

    public String getCountryIso2() {
        return this.a;
    }

    public String getKey() {
        return this.c;
    }

    public long getUid() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.y;
        if ((z10 && this.x != 1.0f) || (!z10 && this.x != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.y) {
                float f7 = (currentTimeMillis / 120.0f) + this.x;
                this.x = f7;
                if (f7 >= 1.0f) {
                    this.x = 1.0f;
                }
            } else {
                float f10 = this.x - (currentTimeMillis / 120.0f);
                this.x = f10;
                if (f10 < 0.0f) {
                    this.x = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.H;
        float dp = AndroidUtilities.dp(z11 ? 28.0f : 32.0f);
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, measuredWidth, dp);
        int[] iArr = this.F;
        int i10 = iArr[6];
        float f11 = iArr[7] - i10;
        float f12 = this.x;
        int argb = Color.argb(i10 + ((int) (f11 * f12)), iArr[0] + ((int) ((iArr[1] - r6) * f12)), iArr[2] + ((int) ((iArr[3] - r8) * f12)), iArr[4] + ((int) ((iArr[5] - r9) * f12)));
        Paint paint = K;
        paint.setColor(argb);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(z11 ? 14.0f : 16.0f), AndroidUtilities.dp(z11 ? 14.0f : 16.0f), paint);
        if (this.x != 1.0f) {
            this.h.draw(canvas);
        }
        if (this.x != 0.0f) {
            paint.setColor(this.r.b());
            paint.setAlpha((int) (this.x * 255.0f * (Color.alpha(r2) / 255.0f)));
            canvas.drawCircle(AndroidUtilities.dp(z11 ? 14.0f : 16.0f), AndroidUtilities.dp(z11 ? 14.0f : 16.0f), AndroidUtilities.dp(z11 ? 14.0f : 16.0f), paint);
            canvas.save();
            canvas.rotate((1.0f - this.x) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            int dp2 = AndroidUtilities.dp(z11 ? 9.0f : 11.0f);
            int dp3 = AndroidUtilities.dp(z11 ? 9.0f : 11.0f);
            int dp4 = AndroidUtilities.dp(z11 ? 19.0f : 21.0f);
            int dp5 = AndroidUtilities.dp(z11 ? 19.0f : 21.0f);
            Drawable drawable = this.e;
            drawable.setBounds(dp2, dp3, dp4, dp5);
            drawable.setAlpha((int) (this.x * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.translate(this.w + AndroidUtilities.dp((z11 ? 26 : 32) + 9), AndroidUtilities.dp(z11 ? 6.0f : 8.0f));
        int i11 = org.telegram.ui.ActionBar.j6.bi;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        J.setColor(i0.a.d(this.x, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J7, f6Var)));
        this.n.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.n.getText());
        if (this.y) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.H;
        setMeasuredDimension(AndroidUtilities.dp((z10 ? 20 : 32) + 25) + this.v, AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m30(Context context, Object obj, ContactsController.Contact contact, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        String str;
        String str2;
        ImageLocation forUserOrChat;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ImageReceiver imageReceiver;
        int y3;
        StaticLayout staticLayout;
        this.f = new RectF();
        this.F = new int[8];
        this.I = true;
        this.G = f6Var;
        this.H = z10;
        this.d = false;
        this.s = contact;
        this.e = getResources().getDrawable(R.drawable.delete);
        float dp = AndroidUtilities.dp(z10 ? 13.0f : 14.0f);
        TextPaint textPaint = J;
        textPaint.setTextSize(dp);
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        this.r = i9Var;
        i9Var.u(AndroidUtilities.dp(20.0f));
        boolean z11 = obj instanceof String;
        if (!z11) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.b = user.id;
                if (UserObject.isReplyUser(user)) {
                    str2 = LocaleController.getString(R.string.RepliesTitle);
                    i9Var.p = 0.8f;
                    i9Var.g(12);
                } else if (UserObject.isUserSelf(user)) {
                    str2 = LocaleController.getString(R.string.SavedMessages);
                    i9Var.p = 0.8f;
                    i9Var.g(1);
                } else {
                    i9Var.r(user);
                    String firstName = UserObject.getFirstName(user);
                    int indexOf = firstName.indexOf(32);
                    firstName = indexOf >= 0 ? firstName.substring(0, indexOf) : firstName;
                    forUserOrChat = ImageLocation.getForUserOrChat(user, 1);
                    String str3 = firstName;
                    chat2 = user;
                    str2 = str3;
                    chat = chat2;
                }
                chat2 = null;
                forUserOrChat = null;
                chat = chat2;
            } else if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                i9Var.q(chat3);
                this.b = -chat3.id;
                String str4 = chat3.title;
                forUserOrChat = ImageLocation.getForUserOrChat(chat3, 1);
                chat = chat3;
                str2 = str4;
            } else if (obj instanceof TLRPC.TL_help_country) {
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                String languageFlag = LocaleController.getLanguageFlag(tL_help_country.iso2);
                String str5 = tL_help_country.default_name;
                i9Var.g(17);
                i9Var.u(AndroidUtilities.dp(24.0f));
                str = "premium";
                i9Var.o(0L, languageFlag, null, null, null);
                i9Var.h(org.telegram.ui.ActionBar.j6.l1(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var)));
                this.I = false;
                i9Var.w = false;
                this.b = tL_help_country.default_name.hashCode();
                this.a = tL_help_country.iso2;
                str2 = str5;
            } else {
                str = "premium";
                i9Var.n(contact.contact_id, contact.first_name, contact.last_name);
                this.b = contact.contact_id;
                this.c = contact.key;
                str2 = !TextUtils.isEmpty(contact.first_name) ? contact.first_name : contact.last_name;
            }
            str = "premium";
            imageReceiver = new ImageReceiver();
            this.h = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
            imageReceiver.setParentView(this);
            imageReceiver.setImageCoords(!this.I ? 0.0f : AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(!z10 ? 28.0f : 32.0f), AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
            if (AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                y3 = org.telegram.messenger.wl.y((z10 ? 28 : 32) + 132, Math.min(point.x, point.y), 2);
            } else {
                y3 = AndroidUtilities.dp(398 - (z10 ? 28 : 32)) / 2;
            }
            staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(str2.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, y3, TextUtils.TruncateAt.END), textPaint, MediaDataController.MAX_STYLE_RUNS_COUNT, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.n = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.v = (int) Math.ceil(staticLayout.getLineWidth(0));
                this.w = -staticLayout.getLineLeft(0);
            }
            if (!z11 && str.equals((String) obj)) {
                imageReceiver.setImageBitmap(org.telegram.ui.Cells.f4.b(getContext(), true));
            } else if (z11 || !"miniapps".equals((String) obj)) {
                imageReceiver.setImage(forUserOrChat, "50_50", i9Var, 0L, (String) null, chat, 1);
            } else {
                getContext();
                imageReceiver.setImageBitmap(org.telegram.ui.Cells.f4.a(true));
            }
            c();
            NotificationCenter.listenEmojiLoading(this);
        }
        String str6 = (String) obj;
        i9Var.p = 0.8f;
        switch (str6.hashCode()) {
            case -1716307998:
                str6.equals("archived");
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -1359418551:
                if (str6.equals("miniapps")) {
                    this.d = true;
                    i9Var.i(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.T7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a8, f6Var));
                    str2 = LocaleController.getString(R.string.PrivacyMiniapps);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -1237460524:
                if (str6.equals("groups")) {
                    i9Var.g(6);
                    this.b = -9223372036854775806L;
                    str2 = LocaleController.getString(R.string.FilterGroups);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -1197490811:
                if (str6.equals("non_contacts")) {
                    i9Var.g(5);
                    this.b = -9223372036854775807L;
                    str2 = LocaleController.getString(R.string.FilterNonContacts);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -567451565:
                if (str6.equals("contacts")) {
                    i9Var.g(4);
                    this.b = Long.MIN_VALUE;
                    str2 = LocaleController.getString(R.string.FilterContacts);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -318452137:
                if (str6.equals("premium")) {
                    this.d = true;
                    i9Var.h(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qj, f6Var));
                    str2 = LocaleController.getString(R.string.PrivacyPremium);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -268161860:
                if (str6.equals("new_chats")) {
                    i9Var.g(24);
                    this.b = -9223372036854775799L;
                    str2 = LocaleController.getString(R.string.FilterNewChats);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 3029900:
                if (str6.equals("bots")) {
                    i9Var.g(8);
                    this.b = -9223372036854775804L;
                    str2 = LocaleController.getString(R.string.FilterBots);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 3496342:
                if (str6.equals("read")) {
                    i9Var.g(10);
                    this.b = -9223372036854775802L;
                    str2 = LocaleController.getString(R.string.FilterRead);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 104264043:
                if (str6.equals("muted")) {
                    i9Var.g(9);
                    this.b = -9223372036854775803L;
                    str2 = LocaleController.getString(R.string.FilterMuted);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 151051367:
                if (str6.equals("existing_chats")) {
                    i9Var.g(23);
                    this.b = -9223372036854775800L;
                    str2 = LocaleController.getString(R.string.FilterExistingChats);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 1432626128:
                if (str6.equals("channels")) {
                    i9Var.g(7);
                    this.b = -9223372036854775805L;
                    str2 = LocaleController.getString(R.string.FilterChannels);
                    break;
                }
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            default:
                i9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
        }
        str = "premium";
        forUserOrChat = null;
        chat = null;
        imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        imageReceiver.setParentView(this);
        imageReceiver.setImageCoords(!this.I ? 0.0f : AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(!z10 ? 28.0f : 32.0f), AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
        if (AndroidUtilities.isTablet()) {
        }
        staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(str2.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, y3, TextUtils.TruncateAt.END), textPaint, MediaDataController.MAX_STYLE_RUNS_COUNT, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
        }
        if (!z11) {
        }
        if (z11) {
        }
        imageReceiver.setImage(forUserOrChat, "50_50", i9Var, 0L, (String) null, chat, 1);
        c();
        NotificationCenter.listenEmojiLoading(this);
    }
}
