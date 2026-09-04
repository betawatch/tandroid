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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public boolean E;
    public double F;
    public double G;
    public SpannableString H;
    public CharSequence I;
    public Drawable J;
    public int K;
    public final org.telegram.ui.Components.x9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public int c;
    public final TextView d;
    public boolean e;
    public org.telegram.ui.Components.i9 f;
    public final int h;
    public final RectF n;
    public LocationController.SharingLocationInfo r;
    public cd0 s;
    public final Location v;
    public final org.telegram.ui.ActionBar.f6 w;
    public int x;
    public final l7 y;

    public w7(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.n = new RectF();
        this.v = new Location("network");
        this.x = UserConfig.selectedAccount;
        this.y = new l7(this, 1);
        this.I = "";
        this.w = f6Var;
        this.h = i10;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.f = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        NotificationCenter.listenEmojiLoading(j5Var);
        j5Var.setTextSize(16);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            addView(x9Var, w7.x5.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = LocaleController.isRTL;
            addView(j5Var, w7.x5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setSingleLine();
            this.e = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z13 = LocaleController.isRTL;
            addView(textView, w7.x5.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i10 : 73.0f, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            addView(x9Var, w7.x5.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = LocaleController.isRTL;
            addView(j5Var, w7.x5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i10 : 74.0f, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        w7 w7Var;
        if (this.E) {
            return this.I;
        }
        if (Math.abs(this.F - d) > 1.0E-6d || Math.abs(this.G - d10) > 1.0E-6d || TextUtils.isEmpty(this.I)) {
            this.E = true;
            w7Var = this;
            Utilities.globalQueue.postRunnable(new v7(w7Var, d, d10, 0));
        } else {
            w7Var = this;
        }
        return w7Var.I;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        CharSequence charSequence;
        float f7;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.j5 j5Var = this.b;
        org.telegram.ui.Components.x9 x9Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = this.w;
        TextView textView = this.d;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ni, f6Var), PorterDuff.Mode.MULTIPLY));
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ti, f6Var);
            oq oqVar = new oq(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(42.0f), v02, v02), drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            oqVar.h = dp;
            oqVar.n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            oqVar.e = dp3;
            oqVar.f = dp4;
            x9Var.setImageDrawable(oqVar);
            j5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), j5Var.getPaint().getFontMetricsInt(), false), false);
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
                    this.f = new org.telegram.ui.Components.i9(0, user);
                    charSequence = UserObject.getUserName(user);
                    x9Var.e(user, this.f);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.x).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(chat);
                    this.f = i9Var;
                    String str3 = chat.title;
                    x9Var.e(chat, i9Var);
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
            if (this.H == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.H = spannableString;
                f7 = 24.0f;
                spannableString.setSpan(new i90(j5Var, AndroidUtilities.dp(100.0f), 0, f6Var), 0, this.H.length(), 33);
            } else {
                f7 = 24.0f;
            }
            charSequence = this.H;
        } else {
            f7 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ni, f6Var), PorterDuff.Mode.MULTIPLY));
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ti, f6Var);
            oq oqVar2 = new oq(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(42.0f), v03, v03), drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            oqVar2.h = dp5;
            oqVar2.n = dp6;
            int dp7 = AndroidUtilities.dp(f7);
            int dp8 = AndroidUtilities.dp(f7);
            oqVar2.e = dp7;
            oqVar2.f = dp8;
            x9Var.setImageDrawable(oqVar2);
        }
        j5Var.l(charSequence, false);
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
            org.telegram.ui.ActionBar.f6 f6Var = this.w;
            int v02 = textView == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yi, f6Var) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.si, f6Var);
            org.telegram.ui.ActionBar.j6.l2.setColor(v02);
            org.telegram.ui.ActionBar.j6.F2.setColor(v02);
            int alpha = org.telegram.ui.ActionBar.j6.l2.getAlpha();
            org.telegram.ui.ActionBar.j6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.l2);
            org.telegram.ui.ActionBar.j6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.j6.l2);
            org.telegram.ui.ActionBar.j6.l2.setAlpha(alpha);
            if (!z10) {
                String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
                canvas.drawText(formatLocationLeftTime, rectF.centerX() - (org.telegram.ui.ActionBar.j6.F2.measureText(formatLocationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.j6.F2);
                return;
            }
            if (this.J == null) {
                this.J = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.j6.F2.getColor() != this.K) {
                Drawable drawable = this.J;
                int color = org.telegram.ui.ActionBar.j6.F2.getColor();
                this.K = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.J.setBounds(wl.w(2, (int) rectF.centerX(), this.J), wl.e(2, (int) rectF.centerY(), this.J), wl.B(2, (int) rectF.centerX(), this.J), wl.z(2, (int) rectF.centerY(), this.J));
            this.J.draw(canvas);
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
        org.telegram.ui.Components.x9 x9Var = this.a;
        x9Var.getImageReceiver().setCurrentAccount(this.x);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.j5 j5Var = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.x).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.f.m(this.x, user);
                j5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                x9Var.e(user, this.f);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.x).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.f.k(this.x, chat);
            j5Var.l(chat.title, false);
            x9Var.e(chat, this.f);
        }
    }
}
