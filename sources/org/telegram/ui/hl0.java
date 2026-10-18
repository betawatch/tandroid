package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class hl0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final FrameLayout c;
    public final org.telegram.ui.Components.w9 d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public boolean n;
    public String r;

    public hl0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = i10;
        this.b = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, w7.z5.a(36.0f, 18.5f, 0.0f, 0.0f, 0.0f, 36, 19));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.3f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        w9Var.setColorFilter(new PorterDuffColorFilter(m12, mode));
        frameLayout.addView(w9Var, w7.z5.e(36, 36, 17));
        TextView b10 = w7.d6.b(context, 15.0f, i11, true, null);
        this.e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, w7.z5.a(-2.0f, 72.0f, 8.0f, 46.0f, 0.0f, -1, 55));
        int i12 = org.telegram.ui.ActionBar.h6.y6;
        TextView b11 = w7.d6.b(context, 13.0f, i12, false, null);
        this.f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, w7.z5.a(-2.0f, 72.0f, 31.0f, 46.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, -1));
        addView(imageView, w7.z5.a(32.0f, 0.0f, 0.0f, 13.0f, 0.0f, 32, 21));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n) {
            Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", this.b);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.h6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }
}
