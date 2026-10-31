package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c81 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final org.telegram.ui.ActionBar.p6 a;
    public final dl0 b;
    public final RectF c;
    public final RectF d;
    public final Path e;

    public c81(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        dl0 dl0Var = new dl0(this);
        this.b = dl0Var;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.a = p6Var;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wl, p6Var);
        dl0Var.B = w02;
        dl0Var.A = w02;
        dl0Var.z = w02;
        dl0Var.x = org.telegram.ui.ActionBar.t6.r1(0.1f, w02);
        dl0Var.j = false;
        dl0Var.i = false;
        dl0Var.l();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.c;
        rectF.set(0.0f, 0.0f, width, height);
        dl0 dl0Var = this.b;
        float[] fArr = dl0Var.e;
        float L = org.telegram.messenger.i0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = dl0Var.e;
        float L2 = org.telegram.messenger.i0.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.b.e(canvas, rectF, 1.0f, false, false);
        float L3 = org.telegram.messenger.i0.L(3.0f);
        float height2 = getHeight();
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, L3, height2);
        dl0Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z10 = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Wl, p6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, p6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.j5, p6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, w7.b6.o(-1, -2));
        }
        addView(linearLayout, w7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, z10 ? 56.0f : 0.0f, 0.0f));
        if (z10) {
            g9 g9Var = new g9(getContext());
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
            int L = org.telegram.messenger.i0.L(6.0f);
            int i10 = org.telegram.ui.ActionBar.t6.j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.08f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.08f, i10);
            g9Var.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(g9Var, d02, L2, null, p6Var);
            addView(g9Var, w7.b6.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(webPage.photo.sizes, 40, false, null, false);
            g9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(webPage.photo.sizes, org.telegram.messenger.i0.L(36.0f), false, w9, true), webPage.photo), org.telegram.messenger.ic.f(w9, webPage.photo));
        }
        setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(6.0f));
    }
}
