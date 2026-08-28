package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v71 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final org.telegram.ui.ActionBar.b6 a;
    public final dl0 b;
    public final RectF c;
    public final RectF d;
    public final Path e;

    public v71(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        dl0 dl0Var = new dl0(this);
        this.b = dl0Var;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.a = b6Var;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.il, b6Var);
        dl0Var.B = v02;
        dl0Var.A = v02;
        dl0Var.z = v02;
        dl0Var.x = org.telegram.ui.ActionBar.f6.l1(0.1f, v02);
        dl0Var.j = false;
        dl0Var.i = false;
        dl0Var.k();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.c;
        rectF.set(0.0f, 0.0f, width, height);
        dl0 dl0Var = this.b;
        float[] fArr = dl0Var.e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = dl0Var.e;
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
        this.b.d(canvas, rectF, 1.0f, false, false);
        float dp3 = AndroidUtilities.dp(3.0f);
        float height2 = getHeight();
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, dp3, height2);
        dl0Var.e(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z10 = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.il, b6Var));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, g7.e6.n(-1, -2));
        }
        addView(linearLayout, g7.e6.d(-1, -2.0f, 51, 0.0f, 0.0f, z10 ? 56.0f : 0.0f, 0.0f));
        if (z10) {
            o9 o9Var = new o9(getContext());
            o9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            o9Var.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var))));
            addView(o9Var, g7.e6.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            o9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
