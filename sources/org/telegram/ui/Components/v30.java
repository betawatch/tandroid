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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class v30 extends View implements org.telegram.ui.ActionBar.b6 {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.g6 G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public boolean K;
    public int L;
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;
    public final Drawable e;
    public final RectF f;
    public final ImageReceiver h;
    public final StaticLayout n;
    public final h9 r;
    public final ContactsController.Contact s;
    public final int v;
    public final float w;
    public float x;
    public boolean y;

    public v30(Context context, Object obj) {
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
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.05f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.di, g6Var);
        int red = Color.red(o12);
        int[] iArr = this.F;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(o12);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(o12);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(o12);
        iArr[7] = Color.alpha(b10);
        if (!this.K || w02 != this.L) {
            this.K = true;
            this.L = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(o12);
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
        Paint paint = N;
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
        int i11 = org.telegram.ui.ActionBar.k6.bi;
        org.telegram.ui.ActionBar.g6 g6Var = this.G;
        M.setColor(i0.a.f(this.x, org.telegram.ui.ActionBar.k6.w0(i11, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J7, g6Var)));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            h9 h9Var = this.r;
            if (h9Var != null) {
                int i10 = this.J;
                org.telegram.ui.ActionBar.g6 g6Var = this.G;
                if (i10 == 1) {
                    h9Var.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qj, g6Var));
                } else if (i10 == 2) {
                    h9Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a8, g6Var));
                } else if (i10 == 3) {
                    h9Var.h(org.telegram.ui.ActionBar.k6.o1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, g6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v30(Context context, Object obj, ContactsController.Contact contact, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        String str;
        int i10;
        String str2;
        ImageLocation forUserOrChat;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        int A;
        StaticLayout staticLayout;
        this.f = new RectF();
        this.F = new int[8];
        this.I = true;
        this.G = g6Var;
        this.H = z10;
        this.d = false;
        this.s = contact;
        this.e = getResources().getDrawable(R.drawable.delete);
        float dp = AndroidUtilities.dp(z10 ? 13.0f : 14.0f);
        TextPaint textPaint = M;
        textPaint.setTextSize(dp);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
        this.r = h9Var;
        h9Var.u(AndroidUtilities.dp(20.0f));
        boolean z11 = obj instanceof String;
        if (!z11) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                this.b = user.id;
                if (UserObject.isReplyUser(user)) {
                    str2 = LocaleController.getString(R.string.RepliesTitle);
                    h9Var.p = 0.8f;
                    h9Var.g(12);
                } else if (UserObject.isUserSelf(user)) {
                    str2 = LocaleController.getString(R.string.SavedMessages);
                    h9Var.p = 0.8f;
                    h9Var.g(1);
                } else {
                    h9Var.r(user);
                    String firstName = UserObject.getFirstName(user);
                    int indexOf = firstName.indexOf(32);
                    firstName = indexOf >= 0 ? firstName.substring(0, indexOf) : firstName;
                    forUserOrChat = ImageLocation.getForUserOrChat(user, 1);
                    String str3 = firstName;
                    chat = user;
                    str2 = str3;
                }
                chat = null;
                forUserOrChat = null;
            } else if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                h9Var.q(chat2);
                this.b = -chat2.id;
                str2 = chat2.title;
                forUserOrChat = ImageLocation.getForUserOrChat(chat2, 1);
                chat = chat2;
            } else if (obj instanceof TLRPC.TL_help_country) {
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                String languageFlag = LocaleController.getLanguageFlag(tL_help_country.iso2);
                String str4 = tL_help_country.default_name;
                h9Var.g(17);
                h9Var.u(AndroidUtilities.dp(24.0f));
                i10 = 2;
                str = "premium";
                h9Var.o(0L, languageFlag, null, null, null);
                h9Var.h(org.telegram.ui.ActionBar.k6.o1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, g6Var)));
                this.J = 3;
                this.I = false;
                h9Var.w = false;
                this.b = tL_help_country.default_name.hashCode();
                this.a = tL_help_country.iso2;
                str2 = str4;
            } else {
                str = "premium";
                i10 = 2;
                h9Var.n(contact.contact_id, contact.first_name, contact.last_name);
                this.b = contact.contact_id;
                this.c = contact.key;
                str2 = !TextUtils.isEmpty(contact.first_name) ? contact.first_name : contact.last_name;
            }
            str = "premium";
            i10 = 2;
            imageReceiver = new ImageReceiver();
            this.h = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
            imageReceiver.setParentView(this);
            int i11 = i10;
            imageReceiver.setImageCoords(!this.I ? 0.0f : AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(!z10 ? 28.0f : 32.0f), AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
            if (AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                A = org.telegram.messenger.sl.A((z10 ? 28 : 32) + 132, Math.min(point.x, point.y), i11);
            } else {
                A = AndroidUtilities.dp(398 - (z10 ? 28 : 32)) / 2;
            }
            staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(str2.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, A, TextUtils.TruncateAt.END), textPaint, MediaDataController.MAX_STYLE_RUNS_COUNT, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.n = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.v = (int) Math.ceil(staticLayout.getLineWidth(0));
                this.w = -staticLayout.getLineLeft(0);
            }
            if (!z11 && str.equals((String) obj)) {
                imageReceiver.setImageBitmap(org.telegram.ui.Cells.f4.b(getContext(), true));
            } else if (z11 || !"miniapps".equals((String) obj)) {
                imageReceiver.setImage(forUserOrChat, "50_50", h9Var, 0L, (String) null, chat, 1);
            } else {
                getContext();
                imageReceiver.setImageBitmap(org.telegram.ui.Cells.f4.a(true));
            }
            c();
            NotificationCenter.listenEmojiLoading(this);
        }
        String str5 = (String) obj;
        h9Var.p = 0.8f;
        switch (str5.hashCode()) {
            case -1716307998:
                str5.equals("archived");
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -1359418551:
                if (str5.equals("miniapps")) {
                    this.d = true;
                    h9Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T7, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a8, g6Var));
                    this.J = 2;
                    str2 = LocaleController.getString(R.string.PrivacyMiniapps);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -1237460524:
                if (str5.equals("groups")) {
                    h9Var.g(6);
                    this.b = -9223372036854775806L;
                    str2 = LocaleController.getString(R.string.FilterGroups);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -1197490811:
                if (str5.equals("non_contacts")) {
                    h9Var.g(5);
                    this.b = -9223372036854775807L;
                    str2 = LocaleController.getString(R.string.FilterNonContacts);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -567451565:
                if (str5.equals("contacts")) {
                    h9Var.g(4);
                    this.b = Long.MIN_VALUE;
                    str2 = LocaleController.getString(R.string.FilterContacts);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -318452137:
                if (str5.equals("premium")) {
                    this.d = true;
                    h9Var.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qj, g6Var));
                    this.J = 1;
                    str2 = LocaleController.getString(R.string.PrivacyPremium);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case -268161860:
                if (str5.equals("new_chats")) {
                    h9Var.g(24);
                    this.b = -9223372036854775799L;
                    str2 = LocaleController.getString(R.string.FilterNewChats);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 3029900:
                if (str5.equals("bots")) {
                    h9Var.g(8);
                    this.b = -9223372036854775804L;
                    str2 = LocaleController.getString(R.string.FilterBots);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 3496342:
                if (str5.equals("read")) {
                    h9Var.g(10);
                    this.b = -9223372036854775802L;
                    str2 = LocaleController.getString(R.string.FilterRead);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 104264043:
                if (str5.equals("muted")) {
                    h9Var.g(9);
                    this.b = -9223372036854775803L;
                    str2 = LocaleController.getString(R.string.FilterMuted);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 151051367:
                if (str5.equals("existing_chats")) {
                    h9Var.g(23);
                    this.b = -9223372036854775800L;
                    str2 = LocaleController.getString(R.string.FilterExistingChats);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            case 1432626128:
                if (str5.equals("channels")) {
                    h9Var.g(7);
                    this.b = -9223372036854775805L;
                    str2 = LocaleController.getString(R.string.FilterChannels);
                    break;
                }
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
            default:
                h9Var.g(11);
                this.b = -9223372036854775801L;
                str2 = LocaleController.getString(R.string.FilterArchived);
                break;
        }
        str = "premium";
        i10 = 2;
        chat = null;
        forUserOrChat = null;
        imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        imageReceiver.setParentView(this);
        int i112 = i10;
        imageReceiver.setImageCoords(!this.I ? 0.0f : AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(!z10 ? 28.0f : 32.0f), AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
        if (AndroidUtilities.isTablet()) {
        }
        staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(str2.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, A, TextUtils.TruncateAt.END), textPaint, MediaDataController.MAX_STYLE_RUNS_COUNT, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
        }
        if (!z11) {
        }
        if (z11) {
        }
        imageReceiver.setImage(forUserOrChat, "50_50", h9Var, 0L, (String) null, chat, 1);
        c();
        NotificationCenter.listenEmojiLoading(this);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
