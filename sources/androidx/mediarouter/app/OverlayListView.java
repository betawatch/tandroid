package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                o0 o0Var = (o0) it.next();
                BitmapDrawable bitmapDrawable = o0Var.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = o0Var.a;
                Rect rect = o0Var.c;
                if (o0Var.k) {
                    z10 = false;
                } else {
                    float max = o0Var.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - o0Var.i) / o0Var.e)) : 0.0f;
                    Interpolator interpolator = o0Var.d;
                    float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
                    int i10 = (int) (o0Var.g * interpolation);
                    Rect rect2 = o0Var.f;
                    rect.top = rect2.top + i10;
                    rect.bottom = rect2.bottom + i10;
                    float y3 = k3.y(o0Var.h, 1.0f, interpolation, 1.0f);
                    o0Var.b = y3;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (y3 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (o0Var.j && max >= 1.0f) {
                        o0Var.k = true;
                        n4.s sVar = o0Var.l;
                        if (sVar != null) {
                            t tVar = (t) sVar.c;
                            tVar.Z.remove((p4.v) sVar.b);
                            tVar.V.notifyDataSetChanged();
                        }
                    }
                    z10 = !o0Var.k;
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
