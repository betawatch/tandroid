package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public final TextView b;
    public final org.telegram.ui.Components.l9 c;
    public final ImageView d;
    public final org.telegram.ui.Components.w8 e;
    public int f;

    public k(Activity activity, boolean z9) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.e = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(l9Var, c8.ha.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.a = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setEllipsizeByGradient(true);
        k5Var.setMaxLines(1);
        k5Var.setGravity(19);
        if (!z9) {
            addView(k5Var, c8.ha.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.H9, null, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.ha.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(k5Var, c8.ha.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.bh, null);
        k5Var.l(id.M0(2131743389, null), false);
        TextView textView = new TextView(activity);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.ch, null);
        org.telegram.messenger.camera.q.n(textView, 1, 15.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setMaxWidth(org.telegram.messenger.g0.L(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            org.telegram.ui.ActionBar.r6.Y(this.a, org.telegram.ui.ActionBar.k6.G9, null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        ImageView imageView = this.d;
        if (imageView != null || ((textView = this.b) != null && getLayoutParams().width != -2)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
            return;
        }
        if (View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
            return;
        }
        float L = org.telegram.messenger.g0.L(196.0f);
        float L2 = org.telegram.messenger.g0.L((imageView != null ? 50 : 0) + 69);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(k5Var.getTextPaint().measureText(k5Var.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + L2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
    }

    public void setObject(TLObject tLObject) {
        boolean z9 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.l9 l9Var = this.c;
        TextView textView = this.b;
        org.telegram.ui.Components.w8 w8Var = this.e;
        if (z9) {
            TLRPC.User user = (TLRPC.User) tLObject;
            w8Var.r(user);
            textView.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
            l9Var.e(user, w8Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        w8Var.q(chat);
        textView.setText(chat == null ? "" : chat.title);
        l9Var.e(chat, w8Var);
    }
}
