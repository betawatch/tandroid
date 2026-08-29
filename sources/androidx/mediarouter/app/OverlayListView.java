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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                n0 n0Var = (n0) it.next();
                BitmapDrawable bitmapDrawable = n0Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = n0Var.a;
                Rect rect = n0Var.c;
                if (n0Var.k) {
                    z10 = false;
                } else {
                    float max = n0Var.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - n0Var.i) / n0Var.e)) : 0.0f;
                    Interpolator interpolator = n0Var.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i10 = (int) (n0Var.g * interpolation);
                    Rect rect2 = n0Var.f;
                    rect.top = rect2.top + i10;
                    rect.bottom = rect2.bottom + i10;
                    float z11 = com.google.android.recaptcha.internal.a.z(n0Var.h, 1.0f, interpolation, 1.0f);
                    n0Var.b = z11;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (z11 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (n0Var.j && max >= 1.0f) {
                        n0Var.k = true;
                        ze.b bVar = n0Var.l;
                        if (bVar != null) {
                            s sVar = (s) bVar.b;
                            sVar.V.remove((c2.b0) bVar.a);
                            sVar.R.notifyDataSetChanged();
                        }
                    }
                    z10 = !n0Var.k;
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

    public OverlayListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = new ArrayList();
    }
}
