package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ie0;
import org.telegram.ui.je0;
import org.telegram.ui.kb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        RecordingCanvas recordingCanvas;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        a aVar = this.c;
        aVar.b = 0L;
        int i7 = 0;
        aVar.a = false;
        ca.i iVar = this.b;
        boolean z10 = iVar.b;
        je0 je0Var = (je0) iVar.c;
        int themedColor = je0Var.getThemedColor(j6.d6);
        RectF rectF = je0Var.V;
        aVar.a(themedColor);
        aVar.b(gz.f());
        SparseArray sparseArray = je0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2 e2Var = ((kb1) sparseArray.valueAt(i10)).a;
            View view = e2Var.fragmentView;
            if (view != null && jh.k.c(view, je0Var.b, rectF) && rectF.right > 0.0f && rectF.left < je0Var.fragmentView.getMeasuredWidth() && (e2Var instanceof ie0)) {
                ie0 ie0Var = (ie0) e2Var;
                if ((z10 ? ie0Var.k() : ie0Var.B()) != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(e2Var.getClassGuid());
                }
            }
        }
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z11 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z11) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = je0Var.fragmentView;
            SparseArray sparseArray2 = je0Var.a;
            RectF rectF2 = je0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = je0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(je0Var.getThemedColor(j6.d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                e2 e2Var2 = ((kb1) sparseArray2.valueAt(i7)).a;
                View view3 = e2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, je0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < je0Var.fragmentView.getMeasuredWidth() && (e2Var2 instanceof ie0)) {
                    ie0 ie0Var2 = (ie0) e2Var2;
                    ui.f k10 = z10 ? ie0Var2.k() : ie0Var2.B();
                    if (k10 != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        k10.b0(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
                        recordingCanvas.restore();
                        i7++;
                        beginRecording = recordingCanvas;
                    }
                }
                recordingCanvas = beginRecording;
                i7++;
                beginRecording = recordingCanvas;
            }
            this.a.endRecording();
        }
    }
}
