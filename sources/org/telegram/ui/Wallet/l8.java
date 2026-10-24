package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.h9 c;
    public final org.telegram.ui.Components.w9 d;
    public ShapeDrawable e;
    public final TextView f;
    public final k8 h;
    public final ImageView n;
    public TLRPC.User r;
    public String s;

    public l8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.z5.c(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(w02, org.telegram.ui.ActionBar.k6.v(w03, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(i10, i11);
        frameLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, a02, O, q6, g6Var);
        w7.b6.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        frameLayout.addView(w9Var, w7.z5.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        k8 k8Var = new k8(this, context);
        this.h = k8Var;
        frameLayout.addView(k8Var, w7.z5.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.D6, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new a8(this, g6Var, runnable, runnable2, 1));
    }

    public final void a(String str, TLRPC.User user) {
        TLRPC.User user2 = this.r;
        boolean z10 = (user2 == null ? 0L : user2.id) != (user != null ? user.id : 0L);
        this.r = user;
        this.s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.r;
        TextView textView = this.f;
        ImageView imageView = this.n;
        org.telegram.ui.Components.w9 w9Var = this.d;
        k8 k8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.r;
            org.telegram.ui.Components.h9 h9Var = this.c;
            h9Var.r(user4);
            w9Var.e(this.r, h9Var);
            textView.setText(UserObject.getUserName(this.r));
            if (TextUtils.isEmpty(str)) {
                k8Var.c(null, z10);
                imageView.setVisibility(8);
                return;
            } else {
                k8Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(8);
            k8Var.c(null, true);
            return;
        }
        setClickable(false);
        setVisibility(0);
        if (this.e == null) {
            ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(34.0f), -1);
            this.e = K;
            org.telegram.ui.ActionBar.r6.z(w9Var, K, org.telegram.ui.ActionBar.k6.Oh, this.a, PorterDuff.Mode.SRC_IN);
        }
        w9Var.setImageDrawable(new yq(this.e, getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
        textView.setText(LocaleController.getString(R.string.WalletGramWalletAddress));
        k8Var.c(str, z10);
        imageView.setVisibility(8);
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
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
