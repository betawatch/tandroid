package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 a;
    public final TextView b;
    public final org.telegram.ui.Components.x9 c;
    public final ImageView d;
    public final org.telegram.ui.Components.i9 e;
    public int f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.e = i9Var;
        i9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(activity);
        this.c = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(x9Var, w7.x5.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.a = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setEllipsizeByGradient(true);
        j5Var.setMaxLines(1);
        j5Var.setGravity(19);
        if (!z10) {
            addView(j5Var, w7.x5.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H9, false), PorterDuff.Mode.MULTIPLY));
            addView(imageView, w7.x5.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(j5Var, w7.x5.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
        j5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
        TextView textView = new TextView(activity);
        this.b = textView;
        wl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false), 1, 15.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setMaxWidth(AndroidUtilities.dp(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            this.a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G9, false));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        ImageView imageView = this.d;
        if (imageView != null || ((textView = this.b) != null && getLayoutParams().width != -2)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
            return;
        }
        if (View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
            return;
        }
        float dp = AndroidUtilities.dp(196.0f);
        float dp2 = AndroidUtilities.dp((imageView != null ? 50 : 0) + 69);
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(dp, Math.max(j5Var.getTextPaint().measureText(j5Var.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + dp2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    public void setObject(TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.x9 x9Var = this.c;
        TextView textView = this.b;
        org.telegram.ui.Components.i9 i9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            i9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            x9Var.e(user, i9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        i9Var.q(chat);
        textView.setText(chat == null ? "" : chat.title);
        x9Var.e(chat, i9Var);
    }
}
