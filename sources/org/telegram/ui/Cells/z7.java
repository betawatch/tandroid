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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.jc0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z7 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public final m.g3 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y a;
    public int b;
    public final org.telegram.ui.Components.y9 c;
    public final org.telegram.ui.ActionBar.b6 d;
    public int e;
    public final TextView f;
    public boolean h;
    public org.telegram.ui.Components.j9 n;
    public final int r;
    public final RectF s;
    public LocationController.SharingLocationInfo v;
    public jc0 w;
    public final Location x;
    public final org.telegram.ui.ActionBar.u6 y;

    public z7(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.s = new RectF();
        this.x = new Location("network");
        this.E = UserConfig.selectedAccount;
        this.F = new m.g3(this, 7);
        this.K = "";
        this.y = u6Var;
        this.r = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        NotificationCenter.listenEmojiLoading(b6Var);
        b6Var.setTextSize(16);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        b6Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = LocaleController.isRTL;
            addView(y9Var, gb1.h(42, 42.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 0.0f));
            boolean z12 = LocaleController.isRTL;
            addView(b6Var, gb1.h(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 73.0f, 12.0f, z12 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z13 = LocaleController.isRTL;
            addView(textView, gb1.h(-1, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i10 : 73.0f, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = LocaleController.isRTL;
            addView(y9Var, gb1.h(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 15.0f, 6.0f, z14 ? 15.0f : 0.0f, 0.0f));
            boolean z15 = LocaleController.isRTL;
            addView(b6Var, gb1.h(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? i10 : 74.0f, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        z7 z7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) > 1.0E-6d || Math.abs(this.I - d10) > 1.0E-6d || TextUtils.isEmpty(this.K)) {
            this.G = true;
            z7Var = this;
            Utilities.globalQueue.postRunnable(new y7(z7Var, d, d10, 0));
        } else {
            z7Var = this;
        }
        return z7Var.K;
    }

    public final void b(MessageObject messageObject, Location location, boolean z10) {
        CharSequence charSequence;
        float f7;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        org.telegram.ui.Components.y9 y9Var = this.c;
        org.telegram.ui.ActionBar.u6 u6Var = this.y;
        TextView textView = this.f;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            org.telegram.ui.ActionBar.f7.y(this, drawable, org.telegram.ui.ActionBar.y6.ni, u6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ti, u6Var);
            y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(42.0f), w02, w02);
            this.a = i02;
            this.b = w02;
            ar arVar = new ar(i02, drawable);
            int dp = AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(42.0f);
            arVar.h = dp;
            arVar.n = dp2;
            int dp3 = AndroidUtilities.dp(24.0f);
            int dp4 = AndroidUtilities.dp(24.0f);
            arVar.e = dp3;
            arVar.f = dp4;
            y9Var.setImageDrawable(arVar);
            b6Var.l(Emoji.replaceEmoji(MessagesController.getInstance(this.E).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), b6Var.getPaint().getFontMetricsInt(), false), false);
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
                    this.n = new org.telegram.ui.Components.j9(0, user);
                    charSequence = UserObject.getUserName(user);
                    y9Var.f(user, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(chat);
                    this.n = j9Var;
                    String str3 = chat.title;
                    y9Var.f(chat, j9Var);
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
                spannableString.setSpan(new ea0(b6Var, AndroidUtilities.dp(100.0f), 0, u6Var), 0, this.J.length(), 33);
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
            org.telegram.ui.ActionBar.f7.y(this, drawable2, org.telegram.ui.ActionBar.y6.ni, u6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ti, u6Var);
            y i03 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(42.0f), w03, w03);
            this.a = i03;
            this.b = w03;
            ar arVar2 = new ar(i03, drawable2);
            int dp5 = AndroidUtilities.dp(42.0f);
            int dp6 = AndroidUtilities.dp(42.0f);
            arVar2.h = dp5;
            arVar2.n = dp6;
            int dp7 = AndroidUtilities.dp(f7);
            int dp8 = AndroidUtilities.dp(f7);
            arVar2.e = dp7;
            arVar2.f = dp8;
            y9Var.setImageDrawable(arVar2);
        }
        b6Var.l(charSequence, false);
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
            org.telegram.ui.ActionBar.u6 u6Var = this.y;
            int w02 = textView == null ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.yi, u6Var) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.si, u6Var);
            org.telegram.ui.ActionBar.y6.l2.setColor(w02);
            org.telegram.ui.ActionBar.y6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.y6.l2.getAlpha();
            org.telegram.ui.ActionBar.y6.l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.y6.l2);
            org.telegram.ui.ActionBar.y6.l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.y6.l2);
            org.telegram.ui.ActionBar.y6.l2.setAlpha(alpha);
            if (!z10) {
                String formatLocationLeftTime = LocaleController.formatLocationLeftTime(i13 - currentTime);
                canvas.drawText(formatLocationLeftTime, rectF.centerX() - (org.telegram.ui.ActionBar.y6.F2.measureText(formatLocationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), org.telegram.ui.ActionBar.y6.F2);
                return;
            }
            if (this.L == null) {
                this.L = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (org.telegram.ui.ActionBar.y6.F2.getColor() != this.M) {
                Drawable drawable = this.L;
                int color = org.telegram.ui.ActionBar.y6.F2.getColor();
                this.M = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.L.setBounds(org.telegram.ui.d3.x(2, (int) rectF.centerX(), this.L), org.telegram.ui.d3.i(2, (int) rectF.centerY(), this.L), org.telegram.ui.d3.C(2, (int) rectF.centerX(), this.L), org.telegram.ui.d3.B(2, (int) rectF.centerY(), this.L));
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
        org.telegram.ui.Components.y9 y9Var = this.c;
        y9Var.getImageReceiver().setCurrentAccount(this.E);
        boolean isUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.n.m(this.E, user);
                b6Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                y9Var.f(user, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.n.k(this.E, chat);
            b6Var.l(chat.title, false);
            y9Var.f(chat, this.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02;
        try {
            if (this.a == null || (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ti, this.y)) == this.b) {
                return;
            }
            this.b = w02;
            org.telegram.ui.ActionBar.y6.E1(this.a, w02, false);
            org.telegram.ui.ActionBar.y6.E1(this.a, w02, true);
            this.a.invalidateSelf();
            org.telegram.ui.Components.y9 y9Var = this.c;
            if (y9Var != null) {
                y9Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
