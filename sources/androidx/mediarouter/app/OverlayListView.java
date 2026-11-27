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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                nu7 nu7Var = (nu7) it.next();
                BitmapDrawable bitmapDrawable = nu7Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = nu7Var.a;
                Rect rect = nu7Var.c;
                if (nu7Var.k) {
                    z = false;
                } else {
                    float w = nu7Var.j ? qu6.w(drawingTime - nu7Var.i, nu7Var.e, 1.0f, 0.0f) : 0.0f;
                    Interpolator interpolator = nu7Var.d;
                    float interpolation = interpolator == null ? w : interpolator.getInterpolation(w);
                    int i = (int) (nu7Var.g * interpolation);
                    Rect rect2 = nu7Var.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float A = qd4.A(nu7Var.h, 1.0f, interpolation, 1.0f);
                    nu7Var.b = A;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (A * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (nu7Var.j && w >= 1.0f) {
                        nu7Var.k = true;
                        um4 um4Var = nu7Var.l;
                        if (um4Var != null) {
                            bv6 bv6Var = (bv6) um4Var.c;
                            bv6Var.a0.remove((jw6) um4Var.b);
                            bv6Var.W.notifyDataSetChanged();
                        }
                    }
                    z = !nu7Var.k;
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
