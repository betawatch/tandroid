package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* loaded from: classes4.dex */
public class CustomNavigationBar extends View {
    private static final boolean USE_INSETS;
    private View activityContentView;
    private int height;
    private final Paint paint;

    static {
        USE_INSETS = Build.VERSION.SDK_INT >= 35;
    }

    public CustomNavigationBar(Context context) {
        super(context);
        this.paint = new Paint();
        if (USE_INSETS) {
            ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ActionBar.CustomNavigationBar$$ExternalSyntheticLambda0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    WindowInsetsCompat onApplyWindowInsets;
                    onApplyWindowInsets = CustomNavigationBar.this.onApplyWindowInsets(view, windowInsetsCompat);
                    return onApplyWindowInsets;
                }
            });
        }
    }

    public void setActivityContentView(View view) {
        this.activityContentView = view;
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
        if (!USE_INSETS) {
            this.height = AndroidUtilities.navigationBarHeight;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.height, TLObject.FLAG_30));
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!USE_INSETS && (getParent() instanceof View) && this.activityContentView.getMeasuredHeight() >= ((View) getParent()).getMeasuredHeight()) {
            setTranslationY(this.height);
        } else {
            setTranslationY(0.0f);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
    }
}
