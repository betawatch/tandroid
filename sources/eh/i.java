package eh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.de0;
import org.telegram.ui.eb1;
import org.telegram.ui.ee0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i {
    public final RenderNode a;
    public final ba.i b;
    public final a c = new a();
    public long d = 0;
    public int e;
    public int f;

    public i(RenderNode renderNode, ba.i iVar) {
        this.a = renderNode;
        this.b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        a aVar = this.c;
        aVar.b = 0L;
        aVar.a = false;
        ba.i iVar = this.b;
        boolean z10 = iVar.b;
        ee0 ee0Var = (ee0) iVar.c;
        int themedColor = ee0Var.getThemedColor(k6.d6);
        RectF rectF = ee0Var.V;
        aVar.a(themedColor);
        aVar.b(az.f());
        SparseArray sparseArray = ee0Var.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            d2 d2Var = ((eb1) sparseArray.valueAt(i3)).a;
            View view = d2Var.fragmentView;
            if (view != null && kh.k.c(view, ee0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ee0Var.fragmentView.getMeasuredWidth() && (d2Var instanceof de0)) {
                de0 de0Var = (de0) d2Var;
                if ((z10 ? de0Var.k() : de0Var.B()) != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(d2Var.getClassGuid());
                }
            }
        }
        long j10 = aVar.a ? -1L : aVar.b;
        boolean z11 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z11) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = ee0Var.fragmentView;
            SparseArray sparseArray2 = ee0Var.a;
            RectF rectF2 = ee0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = ee0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(ee0Var.getThemedColor(k6.d6));
            int size2 = sparseArray2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                d2 d2Var2 = ((eb1) sparseArray2.valueAt(i10)).a;
                View view3 = d2Var2.fragmentView;
                if (view3 != null && kh.k.c(view3, ee0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < ee0Var.fragmentView.getMeasuredWidth() && (d2Var2 instanceof de0)) {
                    de0 de0Var2 = (de0) d2Var2;
                    si.f k10 = z10 ? de0Var2.k() : de0Var2.B();
                    if (k10 != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        k10.l(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        beginRecording.restore();
                    }
                }
            }
            this.a.endRecording();
        }
    }
}
