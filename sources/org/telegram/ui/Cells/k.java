package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.m5 a;
    public final TextView b;
    public final org.telegram.ui.Components.q9 c;
    public final ImageView d;
    public final org.telegram.ui.Components.b9 e;
    public int f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.e = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(q9Var, c8.ma.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(activity);
        this.a = m5Var;
        m5Var.setTextSize(15);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setEllipsizeByGradient(true);
        m5Var.setMaxLines(1);
        m5Var.setGravity(19);
        if (!z10) {
            addView(m5Var, c8.ma.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.H9, null, PorterDuff.Mode.MULTIPLY);
            addView(imageView, c8.ma.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(m5Var, c8.ma.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.eh, null);
        m5Var.l(gd.N0(2131743143, null), false);
        TextView textView = new TextView(activity);
        this.b = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.fh, null);
        n10.q(textView, 1, 15.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setMaxWidth(org.telegram.messenger.g0.L(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            org.telegram.ui.ActionBar.t6.X(this.a, org.telegram.ui.ActionBar.m6.G9, null);
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
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(m5Var.getTextPaint().measureText(m5Var.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + L2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
    }

    public void setObject(TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.q9 q9Var = this.c;
        TextView textView = this.b;
        org.telegram.ui.Components.b9 b9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            b9Var.r(user);
            textView.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            q9Var.f(user, b9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        b9Var.q(chat);
        textView.setText(chat == null ? "" : chat.title);
        q9Var.f(chat, b9Var);
    }
}
