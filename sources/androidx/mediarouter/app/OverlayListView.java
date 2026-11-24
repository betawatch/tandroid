package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hr7 hr7Var = (hr7) it.next();
                BitmapDrawable bitmapDrawable = hr7Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = hr7Var.a;
                Rect rect = hr7Var.c;
                if (hr7Var.k) {
                    z = false;
                } else {
                    float w = hr7Var.j ? ls6.w(drawingTime - hr7Var.i, hr7Var.e, 1.0f, 0.0f) : 0.0f;
                    Interpolator interpolator = hr7Var.d;
                    float interpolation = interpolator == null ? w : interpolator.getInterpolation(w);
                    int i = (int) (hr7Var.g * interpolation);
                    Rect rect2 = hr7Var.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float A = tb4.A(hr7Var.h, 1.0f, interpolation, 1.0f);
                    hr7Var.b = A;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (A * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (hr7Var.j && w >= 1.0f) {
                        hr7Var.k = true;
                        wk4 wk4Var = hr7Var.l;
                        if (wk4Var != null) {
                            ws6 ws6Var = (ws6) wk4Var.c;
                            ws6Var.a0.remove((eu6) wk4Var.b);
                            ws6Var.W.notifyDataSetChanged();
                        }
                    }
                    z = !hr7Var.k;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }
}
