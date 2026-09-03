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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.pq;
import org.telegram.ui.vc0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u7 extends FrameLayout {
    public boolean B;
    public double C;
    public double D;
    public SpannableString E;
    public CharSequence F;
    public Drawable G;
    public int H;
    public final org.telegram.ui.Components.p9 a;
    public final org.telegram.ui.ActionBar.l5 b;
    public int c;
    public final TextView d;
    public boolean e;
    public org.telegram.ui.Components.z8 f;
    public final int h;
    public final RectF n;
    public LocationController.SharingLocationInfo r;
    public vc0 s;
    public final Location v;
    public final org.telegram.ui.ActionBar.g6 w;
    public int x;
    public final m2.b y;

    public u7(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.n = new RectF();
        this.v = new Location("network");
        this.x = UserConfig.selectedAccount;
        this.y = new m2.b(this, 10);
        this.F = "";
        this.w = g6Var;
        this.h = i10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTextSize(16);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        l5Var.setScrollNonFitText(true);
        if (z4) {
            boolean z10 = LocaleController.isRTL;
            addView(p9Var, k7.c6.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
            boolean z11 = LocaleController.isRTL;
            addView(l5Var, k7.c6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? i10 : 73.0f, 12.0f, z11 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z12 = LocaleController.isRTL;
            addView(textView, k7.c6.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 73.0f, 33.0f, z12 ? 73.0f : i10, 0.0f));
        } else {
            boolean z13 = LocaleController.isRTL;
            addView(p9Var, k7.c6.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 15.0f, 6.0f, z13 ? 15.0f : 0.0f, 0.0f));
            boolean z14 = LocaleController.isRTL;
            addView(l5Var, k7.c6.d(-2, -2.0f, (z14 ? 5 : 3) | 48, z14 ? i10 : 74.0f, 17.0f, z14 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        u7 u7Var;
        if (this.B) {
            return this.F;
        }
        if (Math.abs(this.C - d) > 1.0E-6d || Math.abs(this.D - d10) > 1.0E-6d || TextUtils.isEmpty(this.F)) {
            this.B = true;
            u7Var = this;
            Utilities.globalQueue.postRunnable(new t7(u7Var, d, d10, 0));
        } else {
            u7Var = this;
        }
        return u7Var.F;
    }

    public final void b(MessageObject messageObject, Location location, boolean z4) {
        CharSequence charSequence;
        float f10;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        org.telegram.ui.Components.p9 p9Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ni, g6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ti, g6Var);
            pq pqVar = new pq(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            pqVar.h = dp;
            pqVar.n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            pqVar.e = dp3;
            pqVar.f = dp4;
            p9Var.setImageDrawable(pqVar);
            l5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), l5Var.getPaint().getFontMetricsInt(), false), false);
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
                    p9Var.e(user, this.f);
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
                    p9Var.e(chat, z8Var);
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
            if (this.E == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.E = spannableString;
                f10 = 24.0f;
                spannableString.setSpan(new l90(l5Var, AndroidUtilities.dp(100.0f), 0, g6Var), 0, this.E.length(), 33);
            } else {
                f10 = 24.0f;
            }
            charSequence = this.E;
        } else {
            f10 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ni, g6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ti, g6Var);
            pq pqVar2 = new pq(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            pqVar2.h = dp5;
            pqVar2.n = dp6;
            int dp7 = AndroidUtilities.dp(f10);
            int dp8 = AndroidUtilities.dp(f10);
            pqVar2.e = dp7;
            pqVar2.f = dp8;
            p9Var.setImageDrawable(pqVar2);
        }
        l5Var.l(charSequence, false);
        double d = messageObject.messageOwner.media.geo.lat;
        Location location2 = this.v;
        location2.setLatitude(d);
        location2.setLongitude(messageObject.messageOwner.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z4) {
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
        int i10;
        int i11;
        LocationController.SharingLocationInfo sharingLocationInfo = this.r;
        if (sharingLocationInfo == null && this.s == null) {
            return;
        }
        if (sharingLocationInfo != null) {
            i11 = sharingLocationInfo.stopTime;
            i10 = sharingLocationInfo.period;
        } else {
            TLRPC.Message message = this.s.b;
            int i12 = message.date;
            i10 = message.media.period;
            i11 = i12 + i10;
        }
        int i13 = i11;
        boolean z4 = i10 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.x).getCurrentTime();
        if (i13 >= currentTime || z4) {
            float abs = z4 ? 1.0f : Math.abs(i13 - currentTime) / i10;
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.d;
            RectF rectF = this.n;
            if (z10) {
                rectF.set(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.w;
            int v02 = textView == null ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.yi, g6Var) : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.si, g6Var);
            org.telegram.ui.ActionBar.k6.l2.setColor(v02);
            org.telegram.ui.ActionBar.k6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.k6.l2.getAlpha();
            org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            if (!z4) {
                String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
                canvas.drawText(formatLocationLeftTime, rectF.centerX() - (org.telegram.ui.ActionBar.k6.F2.measureText(formatLocationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.k6.F2);
                return;
            }
            if (this.G == null) {
                this.G = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.H) {
                Drawable drawable = this.G;
                int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                this.H = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.G.setBounds(org.telegram.ui.b.u(2, (int) rectF.centerX(), this.G), org.telegram.ui.b.f(2, (int) rectF.centerY(), this.G), org.telegram.ui.b.A(2, (int) rectF.centerX(), this.G), org.telegram.ui.b.y(2, (int) rectF.centerY(), this.G));
            this.G.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        TextView textView = this.d;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(textView != null ? 66.0f : 54.0f) + ((textView == null || this.e) ? 0 : (-AndroidUtilities.dp(20.0f)) + this.c), TLObject.FLAG_30));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.r = sharingLocationInfo;
        this.x = sharingLocationInfo.account;
        org.telegram.ui.Components.p9 p9Var = this.a;
        p9Var.getImageReceiver().setCurrentAccount(this.x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f.m(this.x, user);
                l5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                p9Var.e(user, this.f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f.k(this.x, chat);
            l5Var.l(chat.title, false);
            p9Var.e(chat, this.f);
        }
    }
}
