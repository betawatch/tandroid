package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m3 extends View implements p6 {
    public final /* synthetic */ o3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(o3 o3Var, Context context) {
        super(context);
        this.a = o3Var;
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        o3 o3Var = this.a;
        try {
            y3 y3Var = o3Var.a;
            if (y3Var == null) {
                return;
            }
            int navigationBarColor = y3Var.getNavigationBarColor(y6.x0(null, y6.a7, false));
            if (o3Var.d.getColor() != navigationBarColor) {
                o3Var.d.setColor(navigationBarColor);
                invalidate();
                AndroidUtilities.setNavigationBarColor(o3Var, navigationBarColor);
                AndroidUtilities.setLightNavigationBar(o3Var, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
