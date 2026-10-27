package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final TextView b;
    public final org.telegram.ui.Components.y9 c;
    public final ImageView d;
    public final org.telegram.ui.Components.j9 e;
    public int f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.e = j9Var;
        j9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(y9Var, kb1.h(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(activity);
        this.a = b6Var;
        b6Var.setTextSize(15);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setEllipsizeByGradient(true);
        b6Var.setMaxLines(1);
        b6Var.setGravity(19);
        if (!z10) {
            addView(b6Var, kb1.h(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.E8, null);
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.H9, null, PorterDuff.Mode.MULTIPLY);
            addView(imageView, kb1.h(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(b6Var, kb1.h(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.ng, null);
        b6Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
        TextView textView = new TextView(activity);
        this.b = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.og, null);
        wh.r(textView, 1, 15.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setMaxWidth(AndroidUtilities.dp(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, kb1.h(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            org.telegram.ui.ActionBar.f7.Y(this.a, org.telegram.ui.ActionBar.y6.G9, null);
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
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(dp, Math.max(b6Var.getTextPaint().measureText(b6Var.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + dp2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    public void setObject(TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.y9 y9Var = this.c;
        TextView textView = this.b;
        org.telegram.ui.Components.j9 j9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            j9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            y9Var.f(user, j9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        j9Var.q(chat);
        textView.setText(chat == null ? "" : chat.title);
        y9Var.f(chat, j9Var);
    }
}
