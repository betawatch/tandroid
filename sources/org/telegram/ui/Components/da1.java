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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class da1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final org.telegram.ui.ActionBar.u6 a;
    public final xm0 b;
    public final RectF c;
    public final RectF d;
    public final Path e;

    public da1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        xm0 xm0Var = new xm0(this);
        this.b = xm0Var;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.a = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.il, u6Var);
        xm0Var.B = w02;
        xm0Var.A = w02;
        xm0Var.z = w02;
        xm0Var.x = org.telegram.ui.ActionBar.y6.o1(0.1f, w02);
        xm0Var.j = false;
        xm0Var.i = false;
        xm0Var.l();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.c;
        rectF.set(0.0f, 0.0f, width, height);
        xm0 xm0Var = this.b;
        float[] fArr = xm0Var.e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = xm0Var.e;
        float dp2 = AndroidUtilities.dp(10.0f);
        fArr2[5] = dp2;
        fArr2[4] = dp2;
        fArr2[3] = dp2;
        fArr2[2] = dp2;
        Path path = this.e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.b.e(canvas, rectF, 1.0f, false, false);
        float dp3 = AndroidUtilities.dp(3.0f);
        float height2 = getHeight();
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, dp3, height2);
        xm0Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z10 = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.il, u6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, u6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.j5, u6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, kb1.r(-1, -2));
        }
        addView(linearLayout, kb1.h(-1, -2.0f, 51, 0.0f, 0.0f, z10 ? 56.0f : 0.0f, 0.0f));
        if (z10) {
            y9 y9Var = new y9(getContext());
            y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            int dp = AndroidUtilities.dp(6.0f);
            int i10 = org.telegram.ui.ActionBar.y6.j5;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.08f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.08f, i10);
            y9Var.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(y9Var, c02, L, null, u6Var);
            addView(y9Var, kb1.h(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            y9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
