package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p6 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.r8 c;
    public final org.telegram.ui.Components.g9 d;
    public ShapeDrawable e;
    public final TextView f;
    public final v8 h;
    public final ImageView n;
    public TLRPC.User r;
    public String s;

    public w8(Context context, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.a = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, w7.b6.c(-1.0f, -1));
        int i10 = org.telegram.ui.ActionBar.t6.a7;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(w02, org.telegram.ui.ActionBar.t6.w(w03, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i10, i11);
        frameLayout.setBackground(b02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, b02, N, q6, p6Var);
        w7.e6.b(this, 0.02f, 1.2f);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.d = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
        frameLayout.addView(g9Var, w7.b6.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        v8 v8Var = new v8(this, context);
        this.h = v8Var;
        frameLayout.addView(v8Var, w7.b6.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.D6, p6Var, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new n8(this, p6Var, runnable, runnable2, 2));
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
        org.telegram.ui.Components.g9 g9Var = this.d;
        v8 v8Var = this.h;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.r;
            org.telegram.ui.Components.r8 r8Var = this.c;
            r8Var.r(user4);
            g9Var.e(this.r, r8Var);
            textView.setText(h20.p(this.r));
            if (TextUtils.isEmpty(str)) {
                v8Var.c(null, z10);
                imageView.setVisibility(8);
                return;
            } else {
                v8Var.c(str, z10);
                imageView.setVisibility(0);
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(8);
            v8Var.c(null, true);
            return;
        }
        setClickable(false);
        setVisibility(0);
        if (this.e == null) {
            ShapeDrawable L = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(34.0f), -1);
            this.e = L;
            org.telegram.ui.ActionBar.a7.y(g9Var, L, org.telegram.ui.ActionBar.t6.Ci, this.a, PorterDuff.Mode.SRC_IN);
        }
        g9Var.setImageDrawable(new eq(this.e, getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
        textView.setText(cd.L0(2131743125, null));
        v8Var.c(str, z10);
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
