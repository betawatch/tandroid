package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ke0;
import org.telegram.ui.le0;
import org.telegram.ui.mb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        le0 le0Var = (le0) iVar.c;
        int themedColor = le0Var.getThemedColor(n6.d6);
        RectF rectF = le0Var.V;
        aVar.a(themedColor);
        aVar.b(bz.f());
        SparseArray sparseArray = le0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2 g2Var = ((mb1) sparseArray.valueAt(i10)).a;
            View view = g2Var.fragmentView;
            if (view != null && jh.k.c(view, le0Var.b, rectF) && rectF.right > 0.0f && rectF.left < le0Var.fragmentView.getMeasuredWidth() && (g2Var instanceof ke0)) {
                ke0 ke0Var = (ke0) g2Var;
                if ((z10 ? ke0Var.k() : ke0Var.B()) != null) {
                    aVar.c(rectF.left);
                    aVar.c(rectF.top);
                    aVar.a(g2Var.getClassGuid());
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
            View view2 = le0Var.fragmentView;
            SparseArray sparseArray2 = le0Var.a;
            RectF rectF2 = le0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = le0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(le0Var.getThemedColor(n6.d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                g2 g2Var2 = ((mb1) sparseArray2.valueAt(i7)).a;
                View view3 = g2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, le0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < le0Var.fragmentView.getMeasuredWidth() && (g2Var2 instanceof ke0)) {
                    ke0 ke0Var2 = (ke0) g2Var2;
                    ui.f k10 = z10 ? ke0Var2.k() : ke0Var2.B();
                    if (k10 != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        k10.z(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
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
