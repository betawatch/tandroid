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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w40 extends HorizontalScrollView {
    public static final RectF v = new RectF();
    public final org.telegram.ui.ActionBar.u6 a;
    public final h6 b;
    public final h6 c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public w40(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = u6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, kb1.B(-1, -1, 8388611));
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        final int i10 = 0;
        h6 h6Var = new h6(new Runnable(this) { // from class: org.telegram.ui.Components.v40
            public final /* synthetic */ w40 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        w40 w40Var = this.b;
                        w40Var.invalidate();
                        LinearLayout linearLayout2 = w40Var.d;
                        linearLayout2.invalidate();
                        for (int i11 = 0; i11 < linearLayout2.getChildCount(); i11++) {
                            linearLayout2.getChildAt(i11).invalidate();
                        }
                        break;
                    default:
                        w40 w40Var2 = this.b;
                        w40Var2.invalidate();
                        LinearLayout linearLayout3 = w40Var2.d;
                        linearLayout3.invalidate();
                        for (int i12 = 0; i12 < linearLayout3.getChildCount(); i12++) {
                            linearLayout3.getChildAt(i12).invalidate();
                        }
                        break;
                }
            }
        });
        this.b = h6Var;
        h6Var.g = 180L;
        final int i11 = 1;
        h6 h6Var2 = new h6(new Runnable(this) { // from class: org.telegram.ui.Components.v40
            public final /* synthetic */ w40 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        w40 w40Var = this.b;
                        w40Var.invalidate();
                        LinearLayout linearLayout2 = w40Var.d;
                        linearLayout2.invalidate();
                        for (int i112 = 0; i112 < linearLayout2.getChildCount(); i112++) {
                            linearLayout2.getChildAt(i112).invalidate();
                        }
                        break;
                    default:
                        w40 w40Var2 = this.b;
                        w40Var2.invalidate();
                        LinearLayout linearLayout3 = w40Var2.d;
                        linearLayout3.invalidate();
                        for (int i12 = 0; i12 < linearLayout3.getChildCount(); i12++) {
                            linearLayout3.getChildAt(i12).invalidate();
                        }
                        break;
                }
            }
        });
        this.c = h6Var2;
        h6Var2.g = 180L;
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
            bi.cc ccVar = new bi.cc(getContext());
            ccVar.setDrawingCacheEnabled(false);
            ccVar.setOnClickListener(new bi.pa(this, i10, intCallback, 10));
            ccVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
            LinearLayout.LayoutParams r6 = kb1.r(-2, -2);
            if (i10 < arrayList.size() - 1) {
                r6.rightMargin = AndroidUtilities.dp(4.0f);
            }
            ccVar.b = new r11(charSequence, this.f);
            linearLayout.addView(ccVar, r6);
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
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        int o12 = z10 ? org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var) & 520093695;
        Paint paint = this.e;
        paint.setColor(o12);
        canvas.drawPath(path, paint);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var);
        TextPaint textPaint = this.f;
        textPaint.setColor(w02);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Y8, u6Var));
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
