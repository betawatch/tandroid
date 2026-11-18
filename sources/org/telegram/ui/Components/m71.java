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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class m71 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final org.telegram.ui.ActionBar.i6 a;
    public final mk0 b;
    public final RectF c;
    public final RectF d;
    public final Path e;

    public m71(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        mk0 mk0Var = new mk0(this);
        this.b = mk0Var;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.a = i6Var;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zl, i6Var);
        mk0Var.B = w02;
        mk0Var.A = w02;
        mk0Var.z = w02;
        mk0Var.x = org.telegram.ui.ActionBar.n6.r1(0.1f, w02);
        mk0Var.j = false;
        mk0Var.i = false;
        mk0Var.l();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.c;
        rectF.set(0.0f, 0.0f, width, height);
        mk0 mk0Var = this.b;
        float[] fArr = mk0Var.e;
        float L = org.telegram.messenger.g0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = mk0Var.e;
        float L2 = org.telegram.messenger.g0.L(10.0f);
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
        float L3 = org.telegram.messenger.g0.L(3.0f);
        float height2 = getHeight();
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, L3, height2);
        mk0Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z10 = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Zl, i6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, i6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.j5, i6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, c8.ma.o(-1, -2));
        }
        addView(linearLayout, c8.ma.d(-1, -2.0f, 51, 0.0f, 0.0f, z10 ? 56.0f : 0.0f, 0.0f));
        if (z10) {
            q9 q9Var = new q9(getContext());
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.n6.j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.08f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.08f, i7);
            q9Var.setBackground(d02);
            org.telegram.ui.ActionBar.u6.j(q9Var, d02, K, null, i6Var);
            addView(q9Var, c8.ma.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(webPage.photo.sizes, 40, false, null, false);
            q9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), org.telegram.messenger.fc.f(w10, webPage.photo));
        }
        setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f));
    }
}
