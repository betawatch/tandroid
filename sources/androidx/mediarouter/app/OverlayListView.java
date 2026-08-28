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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q0 q0Var = (q0) it.next();
                BitmapDrawable bitmapDrawable = q0Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = q0Var.a;
                Rect rect = q0Var.c;
                if (q0Var.k) {
                    z10 = false;
                } else {
                    float max = q0Var.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - q0Var.i) / q0Var.e)) : 0.0f;
                    Interpolator interpolator = q0Var.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i9 = (int) (q0Var.g * interpolation);
                    Rect rect2 = q0Var.f;
                    rect.top = rect2.top + i9;
                    rect.bottom = rect2.bottom + i9;
                    float z11 = e2.c.z(q0Var.h, 1.0f, interpolation, 1.0f);
                    q0Var.b = z11;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (z11 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (q0Var.j && max >= 1.0f) {
                        q0Var.k = true;
                        we.b bVar = q0Var.l;
                        if (bVar != null) {
                            v vVar = (v) bVar.c;
                            vVar.V.remove((c2.a0) bVar.b);
                            vVar.R.notifyDataSetChanged();
                        }
                    }
                    z10 = !q0Var.k;
                }
                if (!z10) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.a = new ArrayList();
    }
}
