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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
                p0 p0Var = (p0) it.next();
                BitmapDrawable bitmapDrawable = p0Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = p0Var.a;
                Rect rect = p0Var.c;
                if (p0Var.k) {
                    z10 = false;
                } else {
                    float max = p0Var.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - p0Var.i) / p0Var.e)) : 0.0f;
                    Interpolator interpolator = p0Var.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i3 = (int) (p0Var.g * interpolation);
                    Rect rect2 = p0Var.f;
                    rect.top = rect2.top + i3;
                    rect.bottom = rect2.bottom + i3;
                    float y9 = com.google.android.recaptcha.internal.a.y(p0Var.h, 1.0f, interpolation, 1.0f);
                    p0Var.b = y9;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (y9 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (p0Var.j && max >= 1.0f) {
                        p0Var.k = true;
                        tf.b bVar = p0Var.l;
                        if (bVar != null) {
                            t tVar = (t) bVar.b;
                            tVar.a0.remove((r4.w) bVar.a);
                            tVar.W.notifyDataSetChanged();
                        }
                    }
                    z10 = !p0Var.k;
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

    public OverlayListView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.a = new ArrayList();
    }
}
