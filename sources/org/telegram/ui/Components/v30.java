package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v30 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.b6 a;
    public final y5 b;
    public final y5 c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public v30(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = b6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        final int i9 = 0;
        y5 y5Var = new y5(new Runnable(this) { // from class: org.telegram.ui.Components.u30
            public final /* synthetic */ v30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        v30 v30Var = this.b;
                        v30Var.invalidate();
                        LinearLayout linearLayout2 = v30Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        break;
                    default:
                        v30 v30Var2 = this.b;
                        v30Var2.invalidate();
                        LinearLayout linearLayout3 = v30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.b = y5Var;
        y5Var.g = 180L;
        final int i10 = 1;
        y5 y5Var2 = new y5(new Runnable(this) { // from class: org.telegram.ui.Components.u30
            public final /* synthetic */ v30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        v30 v30Var = this.b;
                        v30Var.invalidate();
                        LinearLayout linearLayout2 = v30Var.d;
                        linearLayout2.invalidate();
                        for (int i102 = 0; i102 < linearLayout2.getChildCount(); i102++) {
                            linearLayout2.getChildAt(i102).invalidate();
                        }
                        break;
                    default:
                        v30 v30Var2 = this.b;
                        v30Var2.invalidate();
                        LinearLayout linearLayout3 = v30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.c = y5Var2;
        y5Var2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i9, boolean z10) {
        this.n = i9;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.b.d(linearLayout.getChildAt(i9).getLeft(), z11);
        this.c.d(linearLayout.getChildAt(i9).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i9);
            fh.l2 l2Var = new fh.l2(getContext(), 16);
            l2Var.setDrawingCacheEnabled(false);
            l2Var.setOnClickListener(new fh.a3(this, i9, intCallback, 10));
            l2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = g7.e6.n(-2, -2);
            if (i9 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            l2Var.b = new nz0(charSequence, this.f);
            linearLayout.addView(l2Var, n10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float c10 = this.b.c();
        float c11 = this.c.c();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = v;
        rectF.set(c10, 0.0f, c11, measuredHeight);
        Path path = this.r;
        path.rewind();
        float dp = AndroidUtilities.dp(13.0f);
        float dp2 = AndroidUtilities.dp(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, dp, dp2, direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        int l1 = z10 ? org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var) & 520093695;
        Paint paint = this.e;
        paint.setColor(l1);
        canvas.drawPath(path, paint);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var);
        TextPaint textPaint = this.f;
        textPaint.setColor(v02);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Y8, b6Var));
        canvas.save();
        canvas.clipPath(path);
        for (int i9 = 0; i9 < linearLayout.getChildCount(); i9++) {
            View childAt = linearLayout.getChildAt(i9);
            if (rectF.right >= childAt.getLeft() && rectF.left <= childAt.getRight()) {
                canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a(this.n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
