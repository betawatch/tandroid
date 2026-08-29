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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 a;
    public final TextView b;
    public final org.telegram.ui.Components.t9 c;
    public final ImageView d;
    public final org.telegram.ui.Components.e9 e;
    public int f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.e = e9Var;
        e9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
        this.c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(t9Var, i7.f6.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setEllipsizeByGradient(true);
        h5Var.setMaxLines(1);
        h5Var.setGravity(19);
        if (!z10) {
            addView(h5Var, i7.f6.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H9, false), PorterDuff.Mode.MULTIPLY));
            addView(imageView, i7.f6.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(h5Var, i7.f6.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
        h5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
        TextView textView = new TextView(activity);
        this.b = textView;
        org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.og, false), 1, 15.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setMaxWidth(AndroidUtilities.dp(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, i7.f6.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            this.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G9, false));
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
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(dp, Math.max(h5Var.getTextPaint().measureText(h5Var.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + dp2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    public void setObject(TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.t9 t9Var = this.c;
        TextView textView = this.b;
        org.telegram.ui.Components.e9 e9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            e9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            t9Var.e(user, e9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        e9Var.q(chat);
        textView.setText(chat == null ? "" : chat.title);
        t9Var.e(chat, e9Var);
    }
}
