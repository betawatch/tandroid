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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                it7 it7Var = (it7) it.next();
                BitmapDrawable bitmapDrawable = it7Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = it7Var.a;
                Rect rect = it7Var.c;
                if (it7Var.k) {
                    z = false;
                } else {
                    float x = it7Var.j ? kt6.x(drawingTime - it7Var.i, it7Var.e, 1.0f, 0.0f) : 0.0f;
                    Interpolator interpolator = it7Var.d;
                    float interpolation = interpolator == null ? x : interpolator.getInterpolation(x);
                    int i = (int) (it7Var.g * interpolation);
                    Rect rect2 = it7Var.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float A = td4.A(it7Var.h, 1.0f, interpolation, 1.0f);
                    it7Var.b = A;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (A * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (it7Var.j && x >= 1.0f) {
                        it7Var.k = true;
                        wm4 wm4Var = it7Var.l;
                        if (wm4Var != null) {
                            wu6 wu6Var = (wu6) wm4Var.c;
                            wu6Var.a0.remove((ew6) wm4Var.b);
                            wu6Var.W.notifyDataSetChanged();
                        }
                    }
                    z = !it7Var.k;
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
