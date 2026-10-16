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
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 a;
    public final FrameLayout b;
    public final k9 c;
    public final z9 d;
    public final TextView e;
    public final m7 f;
    public final ImageView h;
    public TLRPC.User n;
    public String r;

    public n7(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.c = new k9((org.telegram.ui.ActionBar.c6) null);
        this.a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.z5.d(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
        w7.b6.b(this, 0.02f, 1.2f);
        z9 z9Var = new z9(context);
        this.d = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(z9Var, w7.z5.a(34.0f, 15.0f, 0.0f, 0.0f, 0.0f, 34, 19));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.a(-2.0f, 60.0f, 7.0f, 52.0f, 0.0f, -1, 51));
        m7 m7Var = new m7(this, context);
        this.f = m7Var;
        frameLayout.addView(m7Var, w7.z5.a(-2.0f, 60.0f, 26.0f, 52.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.D6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.z5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        setOnClickListener(new e7(this, runnable, c6Var, runnable2));
    }

    public final void a(String str, TLRPC.User user) {
        TLRPC.User user2 = this.n;
        boolean z10 = (user2 == null ? 0L : user2.id) != (user != null ? user.id : 0L);
        this.n = user;
        this.r = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.n;
        TextView textView = this.e;
        z9 z9Var = this.d;
        ImageView imageView = this.h;
        m7 m7Var = this.f;
        if (user3 == null) {
            if (TextUtils.isEmpty(str)) {
                setClickable(false);
                setVisibility(8);
                m7Var.c(null, true);
                return;
            } else {
                setClickable(false);
                setVisibility(0);
                z9Var.setImageDrawable(new cr(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(34.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.a)), getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
                textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
                m7Var.c(str, z10);
                imageView.setVisibility(8);
                return;
            }
        }
        setClickable(true);
        setVisibility(0);
        TLRPC.User user4 = this.n;
        k9 k9Var = this.c;
        k9Var.r(user4);
        z9Var.e(this.n, k9Var);
        textView.setText(UserObject.getUserName(this.n));
        if (TextUtils.isEmpty(str)) {
            m7Var.c(null, z10);
            imageView.setVisibility(8);
        } else {
            m7Var.c(str, z10);
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
