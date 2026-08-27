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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.nc0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public boolean A;
    public double B;
    public double C;
    public SpannableString D;
    public CharSequence E;
    public Drawable F;
    public int G;
    public final org.telegram.ui.Components.n9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public int c;
    public final TextView d;
    public boolean e;
    public org.telegram.ui.Components.y8 f;
    public final int h;
    public final RectF n;
    public LocationController.SharingLocationInfo r;
    public nc0 s;
    public final Location v;
    public final org.telegram.ui.ActionBar.c6 w;
    public int x;
    public final m.i3 y;

    public r7(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.n = new RectF();
        this.v = new Location("network");
        this.x = UserConfig.selectedAccount;
        this.y = new m.i3(this, 8);
        this.E = "";
        this.w = c6Var;
        this.h = i10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            addView(n9Var, h7.z5.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = LocaleController.isRTL;
            addView(h5Var, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z13 = LocaleController.isRTL;
            addView(textView, h7.z5.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i10 : 73.0f, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            addView(n9Var, h7.z5.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = LocaleController.isRTL;
            addView(h5Var, h7.z5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i10 : 74.0f, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        r7 r7Var;
        if (this.A) {
            return this.E;
        }
        if (Math.abs(this.B - d) > 1.0E-6d || Math.abs(this.C - d10) > 1.0E-6d || TextUtils.isEmpty(this.E)) {
            this.A = true;
            r7Var = this;
            Utilities.globalQueue.postRunnable(new q7(r7Var, d, d10, 0));
        } else {
            r7Var = this;
        }
        return r7Var.E;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        CharSequence charSequence;
        float f10;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        org.telegram.ui.Components.n9 n9Var = this.a;
        org.telegram.ui.ActionBar.c6 c6Var = this.w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ti, c6Var);
            dq dqVar = new dq(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            dqVar.h = dp;
            dqVar.n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            dqVar.e = dp3;
            dqVar.f = dp4;
            n9Var.setImageDrawable(dqVar);
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
                    this.f = new org.telegram.ui.Components.y8(0, user);
                    charSequence = UserObject.getUserName(user);
                    n9Var.e(user, this.f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(chat);
                    this.f = y8Var;
                    String str3 = chat.title;
                    n9Var.e(chat, y8Var);
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
                spannableString.setSpan(new u80(h5Var, AndroidUtilities.dp(100.0f), 0, c6Var), 0, this.D.length(), 33);
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
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ni, c6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ti, c6Var);
            dq dqVar2 = new dq(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            dqVar2.h = dp5;
            dqVar2.n = dp6;
            int dp7 = AndroidUtilities.dp(f10);
            int dp8 = AndroidUtilities.dp(f10);
            dqVar2.e = dp7;
            dqVar2.f = dp8;
            n9Var.setImageDrawable(dqVar2);
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
        boolean z10 = i10 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.x).getCurrentTime();
        if (i13 >= currentTime || z10) {
            float abs = z10 ? 1.0f : Math.abs(i13 - currentTime) / i10;
            boolean z11 = LocaleController.isRTL;
            TextView textView = this.d;
            RectF rectF = this.n;
            if (z11) {
                rectF.set(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.w;
            int v02 = textView == null ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yi, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.si, c6Var);
            org.telegram.ui.ActionBar.g6.l2.setColor(v02);
            org.telegram.ui.ActionBar.g6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.g6.l2.getAlpha();
            org.telegram.ui.ActionBar.g6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.g6.l2);
            org.telegram.ui.ActionBar.g6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.g6.l2);
            org.telegram.ui.ActionBar.g6.l2.setAlpha(alpha);
            if (!z10) {
                String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
                canvas.drawText(formatLocationLeftTime, rectF.centerX() - (org.telegram.ui.ActionBar.g6.F2.measureText(formatLocationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.g6.F2);
                return;
            }
            if (this.F == null) {
                this.F = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.g6.F2.getColor() != this.G) {
                Drawable drawable = this.F;
                int color = org.telegram.ui.ActionBar.g6.F2.getColor();
                this.G = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.F.setBounds(rl.v(2, (int) rectF.centerX(), this.F), rl.e(2, (int) rectF.centerY(), this.F), rl.A(2, (int) rectF.centerX(), this.F), rl.y(2, (int) rectF.centerY(), this.F));
            this.F.draw(canvas);
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
        org.telegram.ui.Components.n9 n9Var = this.a;
        n9Var.getImageReceiver().setCurrentAccount(this.x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f.m(this.x, user);
                h5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                n9Var.e(user, this.f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f.k(this.x, chat);
            h5Var.l(chat.title, false);
            n9Var.e(chat, this.f);
        }
    }
}
