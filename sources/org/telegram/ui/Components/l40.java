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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.f6 a;
    public final e6 b;
    public final e6 c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public l40(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.x(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        final int i10 = 0;
        e6 e6Var = new e6(new Runnable(this) { // from class: org.telegram.ui.Components.k40
            public final /* synthetic */ l40 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        l40 l40Var = this.b;
                        l40Var.invalidate();
                        LinearLayout linearLayout2 = l40Var.d;
                        linearLayout2.invalidate();
                        for (int i11 = 0; i11 < linearLayout2.getChildCount(); i11++) {
                            linearLayout2.getChildAt(i11).invalidate();
                        }
                        break;
                    default:
                        l40 l40Var2 = this.b;
                        l40Var2.invalidate();
                        LinearLayout linearLayout3 = l40Var2.d;
                        linearLayout3.invalidate();
                        for (int i12 = 0; i12 < linearLayout3.getChildCount(); i12++) {
                            linearLayout3.getChildAt(i12).invalidate();
                        }
                        break;
                }
            }
        });
        this.b = e6Var;
        e6Var.g = 180L;
        final int i11 = 1;
        e6 e6Var2 = new e6(new Runnable(this) { // from class: org.telegram.ui.Components.k40
            public final /* synthetic */ l40 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        l40 l40Var = this.b;
                        l40Var.invalidate();
                        LinearLayout linearLayout2 = l40Var.d;
                        linearLayout2.invalidate();
                        for (int i112 = 0; i112 < linearLayout2.getChildCount(); i112++) {
                            linearLayout2.getChildAt(i112).invalidate();
                        }
                        break;
                    default:
                        l40 l40Var2 = this.b;
                        l40Var2.invalidate();
                        LinearLayout linearLayout3 = l40Var2.d;
                        linearLayout3.invalidate();
                        for (int i12 = 0; i12 < linearLayout3.getChildCount(); i12++) {
                            linearLayout3.getChildAt(i12).invalidate();
                        }
                        break;
                }
            }
        });
        this.c = e6Var2;
        e6Var2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.b.d(linearLayout.getChildAt(i10).getLeft(), z11);
        this.c.d(linearLayout.getChildAt(i10).getRight(), z11);
    }

    public final void b(ArrayList arrayList, MessagesStorage.IntCallback intCallback) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            di.eb ebVar = new di.eb(getContext());
            ebVar.setDrawingCacheEnabled(false);
            ebVar.setOnClickListener(new org.telegram.ui.Cells.ua(this, i10, intCallback, 7));
            ebVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams n10 = w7.x5.n(-2, -2);
            if (i10 < arrayList.size() - 1) {
                n10.rightMargin = AndroidUtilities.dp(4.0f);
            }
            ebVar.b = new f01(charSequence, this.f);
            linearLayout.addView(ebVar, n10);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int l1 = z10 ? org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var) & 520093695;
        Paint paint = this.e;
        paint.setColor(l1);
        canvas.drawPath(path, paint);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var);
        TextPaint textPaint = this.f;
        textPaint.setColor(v02);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, f6Var));
        canvas.save();
        canvas.clipPath(path);
        for (int i10 = 0; i10 < linearLayout.getChildCount(); i10++) {
            View childAt = linearLayout.getChildAt(i10);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(this.n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
