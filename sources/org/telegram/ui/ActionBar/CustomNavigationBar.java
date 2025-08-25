package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.tgnet.TLObject;

/* loaded from: classes4.dex */
public class CustomNavigationBar extends View {
    private int height;
    private final Paint paint;

    public CustomNavigationBar(Context context) {
        super(context);
        this.paint = new Paint();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.CustomNavigationBar$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets;
                onApplyWindowInsets = CustomNavigationBar.this.onApplyWindowInsets(view, windowInsetsCompat);
                return onApplyWindowInsets;
            }
        });
    }

    public void setColor(int i) {
        if (this.paint.getColor() != i) {
            this.paint.setColor(i);
            invalidate();
        }
    }

    public int getColor() {
        return this.paint.getColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        if (this.height != i) {
            this.height = i;
            requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.height, TLObject.FLAG_30));
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
    }
}
