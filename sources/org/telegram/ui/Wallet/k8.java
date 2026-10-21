package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class k8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.h9 c;
    public final org.telegram.ui.Components.w9 d;
    public final TextView e;
    public final j8 f;
    public final ImageView h;
    public TLRPC.User n;
    public String r;

    public k8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.a = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.z5.c(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
        w7.b6.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(w9Var, w7.z5.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        j8 j8Var = new j8(this, context);
        this.f = j8Var;
        frameLayout.addView(j8Var, w7.z5.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.D6, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new a8(this, runnable, d6Var, runnable2));
    }

    public final void a(String str, TLRPC.User user) {
        TLRPC.User user2 = this.n;
        boolean z10 = (user2 == null ? 0L : user2.id) != (user != null ? user.id : 0L);
        this.n = user;
        this.r = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.n;
        TextView textView = this.e;
        org.telegram.ui.Components.w9 w9Var = this.d;
        ImageView imageView = this.h;
        j8 j8Var = this.f;
        if (user3 == null) {
            if (TextUtils.isEmpty(str)) {
                setClickable(false);
                setVisibility(8);
                j8Var.c(null, true);
                return;
            } else {
                setClickable(false);
                setVisibility(0);
                w9Var.setImageDrawable(new zq(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(34.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.a)), getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
                textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
                j8Var.c(str, z10);
                imageView.setVisibility(8);
                return;
            }
        }
        setClickable(true);
        setVisibility(0);
        TLRPC.User user4 = this.n;
        org.telegram.ui.Components.h9 h9Var = this.c;
        h9Var.r(user4);
        w9Var.e(this.n, h9Var);
        textView.setText(UserObject.getUserName(this.n));
        if (TextUtils.isEmpty(str)) {
            j8Var.c(null, z10);
            imageView.setVisibility(8);
        } else {
            j8Var.c(str, z10);
            imageView.setVisibility(0);
        }
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float measuredHeight = getMeasuredHeight();
        FrameLayout frameLayout = this.b;
        int round = Math.round((measuredHeight - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int ceil = ((int) Math.ceil(r5.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i10), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        FrameLayout frameLayout = this.b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
