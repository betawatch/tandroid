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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                    float C = o0Var.j ? a8.p0.C(drawingTime - o0Var.i, o0Var.e, 1.0f, 0.0f) : 0.0f;
                    Interpolator interpolator = o0Var.d;
                    float interpolation = interpolator == null ? C : interpolator.getInterpolation(C);
                    int i7 = (int) (o0Var.g * interpolation);
                    Rect rect2 = o0Var.f;
                    rect.top = rect2.top + i7;
                    rect.bottom = rect2.bottom + i7;
                    float z11 = e2.z(o0Var.h, 1.0f, interpolation, 1.0f);
                    o0Var.b = z11;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (z11 * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (o0Var.j && C >= 1.0f) {
                        o0Var.k = true;
                        q4.q qVar = o0Var.l;
                        if (qVar != null) {
                            t tVar = (t) qVar.c;
                            tVar.a0.remove((s4.v) qVar.b);
                            tVar.W.notifyDataSetChanged();
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

    public OverlayListView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.a = new ArrayList();
    }
}
