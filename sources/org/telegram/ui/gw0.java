package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class gw0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;
    public ww0 f;
    public org.telegram.ui.Components.r5 h;
    public Drawable n;

    public gw0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.a = b6Var;
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(15);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        linearLayout.addView(b6Var, org.telegram.ui.Components.gb1.r(-1, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, u6Var);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, org.telegram.ui.Components.gb1.h(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.M6, u6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, org.telegram.ui.Components.gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ww0 ww0Var, boolean z10) {
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && ww0Var.a == 12 && ww0Var.b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
            b(emojiStatusDocumentId == null ? 0L : emojiStatusDocumentId.longValue(), false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.r5 r5Var = this.h;
            if (r5Var != null) {
                r5Var.b();
                this.h = null;
            }
        }
        this.f = ww0Var;
        this.a.l(ww0Var.c, false);
        this.b.setText(ww0Var.d);
        this.c.setImageResource(ww0Var.b);
        this.e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 != 0) {
            this.h.j(j10, z10);
            return;
        }
        if (this.n == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
            this.n = mutate;
            org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.v6, null, PorterDuff.Mode.SRC_IN);
        }
        this.h.g(this.n, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
