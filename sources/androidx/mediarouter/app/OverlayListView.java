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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o0 o0Var = (o0) it.next();
                BitmapDrawable bitmapDrawable = o0Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = o0Var.a;
                Rect rect = o0Var.c;
                if (o0Var.k) {
                    z9 = false;
                } else {
                    float max = o0Var.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - o0Var.i) / o0Var.e)) : 0.0f;
                    Interpolator interpolator = o0Var.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i7 = (int) (o0Var.g * interpolation);
                    Rect rect2 = o0Var.f;
                    rect.top = rect2.top + i7;
                    rect.bottom = rect2.bottom + i7;
                    float z10 = com.google.android.recaptcha.internal.a.z(o0Var.h, 1.0f, interpolation, 1.0f);
                    o0Var.b = z10;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (z10 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (o0Var.j && max >= 1.0f) {
                        o0Var.k = true;
                        q4.q qVar = o0Var.l;
                        if (qVar != null) {
                            t tVar = (t) qVar.c;
                            tVar.Z.remove((s4.v) qVar.b);
                            tVar.V.notifyDataSetChanged();
                        }
                    }
                    z9 = !o0Var.k;
                }
                if (!z9) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.a = new ArrayList();
    }
}
