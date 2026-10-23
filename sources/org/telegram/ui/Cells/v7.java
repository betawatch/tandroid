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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.mc0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v7 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final u5 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y a;
    public int b;
    public final org.telegram.ui.Components.w9 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public int e;
    public final TextView f;
    public boolean h;
    public org.telegram.ui.Components.h9 n;
    public final int r;
    public final RectF s;
    public LocationController.SharingLocationInfo v;
    public mc0 w;
    public final Location x;
    public final org.telegram.ui.ActionBar.g6 y;

    public v7(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        this.s = new RectF();
        this.x = new Location("network");
        this.E = UserConfig.selectedAccount;
        this.F = new u5(this, 3);
        this.K = "";
        this.y = g6Var;
        this.r = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        NotificationCenter.listenEmojiLoading(n5Var);
        n5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        n5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            addView(w9Var, w7.z5.d(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = LocaleController.isRTL;
            addView(n5Var, w7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.A6, g6Var);
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z13 = LocaleController.isRTL;
            addView(textView, w7.z5.d(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i10 : 73.0f, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            addView(w9Var, w7.z5.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = LocaleController.isRTL;
            addView(n5Var, w7.z5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i10 : 74.0f, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        v7 v7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) > 1.0E-6d || Math.abs(this.I - d10) > 1.0E-6d || TextUtils.isEmpty(this.K)) {
            this.G = true;
            v7Var = this;
            Utilities.globalQueue.postRunnable(new u7(v7Var, d, d10, 0));
        } else {
            v7Var = this;
        }
        return v7Var.K;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        CharSequence charSequence;
        float f7;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.Components.w9 w9Var = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = this.y;
        TextView textView = this.f;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.z(this, drawable, org.telegram.ui.ActionBar.k6.ni, g6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ti, g6Var);
            y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(42.0f), w02, w02);
            this.a = i02;
            this.b = w02;
            yq yqVar = new yq(i02, drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            yqVar.h = dp;
            yqVar.n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            yqVar.e = dp3;
            yqVar.f = dp4;
            w9Var.setImageDrawable(yqVar);
            n5Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.E).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), n5Var.getPaint().getFontMetricsInt(), false), false);
            this.h = false;
            textView.setSingleLine(false);
            String str = messageObject.messageOwner.media.address;
            this.e = new StaticLayout(str, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.E = messageObject.currentAccount;
        String str2 = !TextUtils.isEmpty(messageObject.messageOwner.media.address) ? messageObject.messageOwner.media.address : null;
        boolean isEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (isEmpty) {
            this.n = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.n = new org.telegram.ui.Components.h9(0, user);
                    charSequence = UserObject.getUserName(user);
                    w9Var.e(user, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(chat);
                    this.n = h9Var;
                    String str3 = chat.title;
                    w9Var.e(chat, h9Var);
                    charSequence = str3;
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    isEmpty = false;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                }
            }
        } else {
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.J == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.J = spannableString;
                f7 = 24.0f;
                spannableString.setSpan(new da0(n5Var, AndroidUtilities.dp(100.0f), 0, g6Var), 0, this.J.length(), 33);
            } else {
                f7 = 24.0f;
            }
            charSequence = this.J;
        } else {
            f7 = 24.0f;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                charSequence = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.r6.z(this, drawable2, org.telegram.ui.ActionBar.k6.ni, g6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ti, g6Var);
            y i03 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(42.0f), w03, w03);
            this.a = i03;
            this.b = w03;
            yq yqVar2 = new yq(i03, drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            yqVar2.h = dp5;
            yqVar2.n = dp6;
            int dp7 = AndroidUtilities.dp(f7);
            int dp8 = AndroidUtilities.dp(f7);
            yqVar2.e = dp7;
            yqVar2.f = dp8;
            w9Var.setImageDrawable(yqVar2);
        }
        n5Var.l(charSequence, false);
        double d = messageObject.messageOwner.media.geo.lat;
        Location location2 = this.x;
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
        AndroidUtilities.runOnUIThread(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.F);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        LocationController.SharingLocationInfo sharingLocationInfo = this.v;
        if (sharingLocationInfo == null && this.w == null) {
            return;
        }
        if (sharingLocationInfo != null) {
            i11 = sharingLocationInfo.stopTime;
            i10 = sharingLocationInfo.period;
        } else {
            TLRPC.Message message = this.w.b;
            int i12 = message.date;
            i10 = message.media.period;
            i11 = i12 + i10;
        }
        int i13 = i11;
        boolean z10 = i10 == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.E).getCurrentTime();
        if (i13 >= currentTime || z10) {
            float abs = z10 ? 1.0f : Math.abs(i13 - currentTime) / i10;
            boolean z11 = LocaleController.isRTL;
            TextView textView = this.f;
            RectF rectF = this.s;
            if (z11) {
                rectF.set(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            } else {
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView == null ? 42.0f : 48.0f));
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.y;
            int w02 = textView == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yi, g6Var) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.si, g6Var);
            org.telegram.ui.ActionBar.k6.l2.setColor(w02);
            org.telegram.ui.ActionBar.k6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.l2.getAlpha();
            org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
            org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
            if (!z10) {
                String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
                canvas.drawText(formatLocationLeftTime, rectF.centerX() - (org.telegram.ui.ActionBar.k6.F2.measureText(formatLocationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.k6.F2);
                return;
            }
            if (this.L == null) {
                this.L = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.M) {
                Drawable drawable = this.L;
                int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                this.M = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.L.setBounds(b1.f(2, (int) rectF.centerX(), this.L), sl.d(2, (int) rectF.centerY(), this.L), b1.y(2, (int) rectF.centerX(), this.L), b1.u(2, (int) rectF.centerY(), this.L));
            this.L.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        TextView textView = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(textView != null ? 66.0f : 54.0f) + ((textView == null || this.h) ? 0 : (-AndroidUtilities.dp(20.0f)) + this.e), TLObject.FLAG_30));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.v = sharingLocationInfo;
        this.E = sharingLocationInfo.account;
        org.telegram.ui.Components.w9 w9Var = this.c;
        w9Var.getImageReceiver().setCurrentAccount(this.E);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.n.m(this.E, user);
                n5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                w9Var.e(user, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.n.k(this.E, chat);
            n5Var.l(chat.title, false);
            w9Var.e(chat, this.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        try {
            if (this.a == null || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ti, this.y)) == this.b) {
                return;
            }
            this.b = w02;
            org.telegram.ui.ActionBar.k6.E1(this.a, w02, false);
            org.telegram.ui.ActionBar.k6.E1(this.a, w02, true);
            this.a.invalidateSelf();
            org.telegram.ui.Components.w9 w9Var = this.c;
            if (w9Var != null) {
                w9Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
