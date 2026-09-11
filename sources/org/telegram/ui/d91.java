package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.i9 b;
    public final org.telegram.ui.Components.x9 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.o5 h;
    public final org.telegram.ui.Components.o5 n;

    public d91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.c = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.h = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 7, j5Var, false);
        this.n = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 7, j5Var, false);
        j5Var.addOnAttachStateChangeListener(new f5(this, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m6, f6Var), PorterDuff.Mode.SRC_IN));
        if (!LocaleController.isRTL) {
            j5Var.setGravity(19);
            addView(x9Var, w7.x5.t(28, 28, 19, 18, 0, 18, 0));
            addView(j5Var, w7.x5.p(0, -1, 1.0f, 119, 0, 0, 18, 0));
            addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, w7.x5.p(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        j5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, w7.x5.p(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, w7.x5.p(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(j5Var, w7.x5.p(0, -1, 1.0f, 119, 18, 0, 0, 0));
        addView(x9Var, w7.x5.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m6, f6Var), PorterDuff.Mode.SRC_IN));
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i10) {
        Long emojiStatusDocumentId;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        org.telegram.ui.Components.i9 i9Var = this.b;
        i9Var.m(i10, currentUser);
        org.telegram.ui.Components.x9 x9Var = this.c;
        x9Var.getImageReceiver().setCurrentAccount(i10);
        x9Var.e(currentUser, i9Var);
        String userName = UserObject.getUserName(currentUser);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.l(userName, false);
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.Components.o5 o5Var = this.h;
        o5Var.x = valueOf;
        Integer valueOf2 = Integer.valueOf(i10);
        org.telegram.ui.Components.o5 o5Var2 = this.n;
        o5Var2.x = valueOf2;
        int i11 = org.telegram.ui.ActionBar.j6.zh;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        if (currentUser != null) {
            long j3 = currentUser.bot_verification_icon;
            if (j3 != 0) {
                o5Var.j(j3, false);
                emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
                o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
                if (emojiStatusDocumentId == null) {
                    o5Var2.j(emojiStatusDocumentId.longValue(), false);
                } else if (currentUser == null || !currentUser.premium) {
                    o5Var2.g(null, false);
                } else {
                    o5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (o5Var.d()) {
                    o5Var = null;
                }
                j5Var.setLeftDrawable(o5Var);
                if (o5Var2.d()) {
                    o5Var2 = null;
                }
                j5Var.i(o5Var2);
                int mainUnreadCount = MessagesStorage.getInstance(i10).getMainUnreadCount();
                int i12 = mainUnreadCount <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i12);
                textView.setText(LocaleController.formatNumber(mainUnreadCount, ','));
            }
        }
        o5Var.g(null, false);
        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        if (emojiStatusDocumentId == null) {
        }
        if (o5Var.d()) {
        }
        j5Var.setLeftDrawable(o5Var);
        if (o5Var2.d()) {
        }
        j5Var.i(o5Var2);
        int mainUnreadCount2 = MessagesStorage.getInstance(i10).getMainUnreadCount();
        if (mainUnreadCount2 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i12);
        textView2.setText(LocaleController.formatNumber(mainUnreadCount2, ','));
    }
}
