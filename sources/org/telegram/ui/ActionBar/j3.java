package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j3 extends View implements b6 {
    public final /* synthetic */ l3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l3 l3Var, Context context) {
        super(context);
        this.a = l3Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
        setTranslationY(AndroidUtilities.navigationBarHeight);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        l3 l3Var = this.a;
        try {
            w3 w3Var = l3Var.a;
            if (w3Var == null) {
                return;
            }
            int navigationBarColor = w3Var.getNavigationBarColor(k6.x0(null, k6.a7, false));
            if (l3Var.d.getColor() != navigationBarColor) {
                l3Var.d.setColor(navigationBarColor);
                invalidate();
                AndroidUtilities.setNavigationBarColor(l3Var, navigationBarColor);
                AndroidUtilities.setLightNavigationBar(l3Var, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
