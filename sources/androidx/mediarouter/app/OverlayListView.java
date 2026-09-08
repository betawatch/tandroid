package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                    int i10 = (int) (p0Var.g * interpolation);
                    Rect rect2 = p0Var.f;
                    rect.top = rect2.top + i10;
                    rect.bottom = rect2.bottom + i10;
                    float z11 = e2.z(p0Var.h, 1.0f, interpolation, 1.0f);
                    p0Var.b = z11;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (z11 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (p0Var.j && max >= 1.0f) {
                        p0Var.k = true;
                        n4.y yVar = p0Var.l;
                        if (yVar != null) {
                            u uVar = (u) yVar.c;
                            uVar.Z.remove((p4.v) yVar.b);
                            uVar.V.notifyDataSetChanged();
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

    public OverlayListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = new ArrayList();
    }
}
