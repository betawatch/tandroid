package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.q80;
import org.telegram.ui.jc0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u7 extends FrameLayout {
    public boolean A;
    public double B;
    public double C;
    public SpannableString D;
    public CharSequence E;
    public Drawable F;
    public int G;
    public final org.telegram.ui.Components.o9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public int c;
    public final TextView d;
    public boolean e;
    public org.telegram.ui.Components.z8 f;
    public final int h;
    public final RectF n;
    public LocationController.SharingLocationInfo r;
    public jc0 s;
    public final Location v;
    public final org.telegram.ui.ActionBar.b6 w;
    public int x;
    public final m.i3 y;

    public u7(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.n = new RectF();
        this.v = new Location("network");
        this.x = UserConfig.selectedAccount;
        this.y = new m.i3(this, 8);
        this.E = "";
        this.w = b6Var;
        this.h = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            addView(o9Var, g7.e6.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = LocaleController.isRTL;
            addView(h5Var, g7.e6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i9 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z13 = LocaleController.isRTL;
            addView(textView, g7.e6.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i9 : 73.0f, 33.0f, z13 ? 73.0f : i9, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            addView(o9Var, g7.e6.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = LocaleController.isRTL;
            addView(h5Var, g7.e6.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i9 : 74.0f, 17.0f, z15 ? 74.0f : i9, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d9) {
        u7 u7Var;
        if (this.A) {
            return this.E;
        }
        if (Math.abs(this.B - d) > 1.0E-6d || Math.abs(this.C - d9) > 1.0E-6d || TextUtils.isEmpty(this.E)) {
            this.A = true;
            u7Var = this;
            Utilities.globalQueue.postRunnable(new t7(u7Var, d, d9, 0));
        } else {
            u7Var = this;
        }
        return u7Var.E;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        CharSequence charSequence;
        float f10;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        org.telegram.ui.Components.o9 o9Var = this.a;
        org.telegram.ui.ActionBar.b6 b6Var = this.w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ni, b6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ti, b6Var);
            fq fqVar = new fq(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            fqVar.h = dp;
            fqVar.n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            fqVar.e = dp3;
            fqVar.f = dp4;
            o9Var.setImageDrawable(fqVar);
            h5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), h5Var.getPaint().getFontMetricsInt(), false), false);
            this.e = false;
            textView.setSingleLine(false);
            String str = messageObject.messageOwner.media.address;
            this.c = new StaticLayout(str, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.h + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.e = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.x = messageObject.currentAccount;
        String str2 = !TextUtils.isEmpty(messageObject.messageOwner.media.address) ? messageObject.messageOwner.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (isEmpty) {
            this.f = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.x).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.f = new org.telegram.ui.Components.z8(0, user);
                    charSequence = UserObject.getUserName(user);
                    o9Var.e(user, this.f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(chat);
                    this.f = z8Var;
                    String str3 = chat.title;
                    o9Var.e(chat, z8Var);
                    charSequence = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.D == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.D = spannableString;
                f10 = 24.0f;
                spannableString.setSpan(new q80(h5Var, AndroidUtilities.dp(100.0f), 0, b6Var), 0, this.D.length(), 33);
            } else {
                f10 = 24.0f;
            }
            charSequence = this.D;
        } else {
            f10 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ni, b6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ti, b6Var);
            fq fqVar2 = new fq(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            fqVar2.h = dp5;
            fqVar2.n = dp6;
            int dp7 = AndroidUtilities.dp(f10);
            int dp8 = AndroidUtilities.dp(f10);
            fqVar2.e = dp7;
            fqVar2.f = dp8;
            o9Var.setImageDrawable(fqVar2);
        }
        h5Var.l(charSequence, false);
        double d = messageObject.messageOwner.media.geo.lat;
        Location location2 = this.v;
        location2.setLatitude(d);
        location2.setLongitude(messageObject.messageOwner.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z10) {
                textView.setText("");
                return;
            } else {
                textView.setText(LocaleController.getString(R.string.Loading));
                return;
            }
        }
        float distanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(LocaleController.formatDistance(distanceTo, 0));
            return;
        }
        textView.setText(str2 + " - " + LocaleController.formatDistance(distanceTo, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.y);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        LocationController.SharingLocationInfo sharingLocationInfo = this.r;
        if (sharingLocationInfo == null && this.s == null) {
            return;
        }
        if (sharingLocationInfo != null) {
            i10 = sharingLocationInfo.stopTime;
            i9 = sharingLocationInfo.period;
        } else {
            TLRPC.Message message = this.s.b;
            int i11 = message.date;
            i9 = message.media.period;
            i10 = i11 + i9;
        }
        int i12 = i10;
        boolean z10 = i9 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.x).getCurrentTime();
        if (i12 >= currentTime || z10) {
            float abs = z10 ? 1.0f : Math.abs(i12 - currentTime) / i9;
            boolean z11 = LocaleController.isRTL;
            TextView textView = this.d;
            RectF rectF = this.n;
            if (z11) {
                rectF.set(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.w;
            int v02 = textView == null ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.yi, b6Var) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.si, b6Var);
            org.telegram.ui.ActionBar.f6.l2.setColor(v02);
            org.telegram.ui.ActionBar.f6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.f6.l2.getAlpha();
            org.telegram.ui.ActionBar.f6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.f6.l2);
            org.telegram.ui.ActionBar.f6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.f6.l2);
            org.telegram.ui.ActionBar.f6.l2.setAlpha(alpha);
            if (!z10) {
                String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i12 - currentTime);
                canvas.drawText(formatLocationLeftTime, rectF.centerX() - (org.telegram.ui.ActionBar.f6.F2.measureText(formatLocationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.f6.F2);
                return;
            }
            if (this.F == null) {
                this.F = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.f6.F2.getColor() != this.G) {
                Drawable drawable = this.F;
                int color = org.telegram.ui.ActionBar.f6.F2.getColor();
                this.G = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.F.setBounds(ll.x(2, (int) rectF.centerX(), this.F), ll.e(2, (int) rectF.centerY(), this.F), ll.B(2, (int) rectF.centerX(), this.F), ll.z(2, (int) rectF.centerY(), this.F));
            this.F.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
        TextView textView = this.d;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(textView != null ? 66.0f : 54.0f) + ((textView == null || this.e) ? 0 : (-AndroidUtilities.dp(20.0f)) + this.c), TLObject.FLAG_30));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.r = sharingLocationInfo;
        this.x = sharingLocationInfo.account;
        org.telegram.ui.Components.o9 o9Var = this.a;
        o9Var.getImageReceiver().setCurrentAccount(this.x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f.m(this.x, user);
                h5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                o9Var.e(user, this.f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f.k(this.x, chat);
            h5Var.l(chat.title, false);
            o9Var.e(chat, this.f);
        }
    }
}
