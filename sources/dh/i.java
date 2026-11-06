package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ie0;
import org.telegram.ui.je0;
import org.telegram.ui.lb1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i {
    public final RenderNode a;
    public final ca.i b;
    public final a c = new a();
    public long d = 0;
    public int e;
    public int f;

    public i(RenderNode renderNode, ca.i iVar) {
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
        ca.i iVar = this.b;
        boolean z9 = iVar.b;
        je0 je0Var = (je0) iVar.c;
        int themedColor = je0Var.getThemedColor(k6.d6);
        RectF rectF = je0Var.U;
        aVar.a(themedColor);
        aVar.b(iz.f());
        SparseArray sparseArray = je0Var.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            f2 f2Var = ((lb1) sparseArray.valueAt(i7)).a;
            View view = f2Var.fragmentView;
            if (view != null && jh.k.c(view, je0Var.b, rectF) && rectF.right > 0.0f && rectF.left < je0Var.fragmentView.getMeasuredWidth() && (f2Var instanceof ie0)) {
                ie0 ie0Var = (ie0) f2Var;
                if ((z9 ? ie0Var.k() : ie0Var.B()) != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(f2Var.getClassGuid());
                }
            }
        }
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = je0Var.fragmentView;
            SparseArray sparseArray2 = je0Var.a;
            RectF rectF2 = je0Var.U;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = je0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(je0Var.getThemedColor(k6.d6));
            int size2 = sparseArray2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                f2 f2Var2 = ((lb1) sparseArray2.valueAt(i10)).a;
                View view3 = f2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, je0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < je0Var.fragmentView.getMeasuredWidth() && (f2Var2 instanceof ie0)) {
                    ie0 ie0Var2 = (ie0) f2Var2;
                    ri.f k10 = z9 ? ie0Var2.k() : ie0Var2.B();
                    if (k10 != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        k10.e(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        beginRecording.restore();
                    }
                }
            }
            this.a.endRecording();
        }
    }
}
