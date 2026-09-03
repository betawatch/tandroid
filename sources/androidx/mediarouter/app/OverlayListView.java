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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z4;
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
                    z4 = false;
                } else {
                    float max = q0Var.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - q0Var.i) / q0Var.e)) : 0.0f;
                    Interpolator interpolator = q0Var.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i10 = (int) (q0Var.g * interpolation);
                    Rect rect2 = q0Var.f;
                    rect.top = rect2.top + i10;
                    rect.bottom = rect2.bottom + i10;
                    float w10 = e2.c.w(q0Var.h, 1.0f, interpolation, 1.0f);
                    q0Var.b = w10;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (w10 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (q0Var.j && max >= 1.0f) {
                        q0Var.k = true;
                        af.c cVar = q0Var.l;
                        if (cVar != null) {
                            v vVar = (v) cVar.c;
                            vVar.W.remove((c2.b0) cVar.b);
                            vVar.S.notifyDataSetChanged();
                        }
                    }
                    z4 = !q0Var.k;
                }
                if (!z4) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = new ArrayList();
    }
}
