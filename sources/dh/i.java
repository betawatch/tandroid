package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.cz;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.le0;
import org.telegram.ui.me0;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        me0 me0Var = (me0) iVar.c;
        int themedColor = me0Var.getThemedColor(m6.d6);
        RectF rectF = me0Var.V;
        aVar.a(themedColor);
        aVar.b(cz.f());
        SparseArray sparseArray = me0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2 g2Var = ((ob1) sparseArray.valueAt(i10)).a;
            View view = g2Var.fragmentView;
            if (view != null && jh.k.c(view, me0Var.b, rectF) && rectF.right > 0.0f && rectF.left < me0Var.fragmentView.getMeasuredWidth() && (g2Var instanceof le0)) {
                le0 le0Var = (le0) g2Var;
                if ((z10 ? le0Var.k() : le0Var.B()) != null) {
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
            View view2 = me0Var.fragmentView;
            SparseArray sparseArray2 = me0Var.a;
            RectF rectF2 = me0Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = me0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(me0Var.getThemedColor(m6.d6));
            int size2 = sparseArray2.size();
            while (i7 < size2) {
                g2 g2Var2 = ((ob1) sparseArray2.valueAt(i7)).a;
                View view3 = g2Var2.fragmentView;
                if (view3 != null && jh.k.c(view3, me0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < me0Var.fragmentView.getMeasuredWidth() && (g2Var2 instanceof le0)) {
                    le0 le0Var2 = (le0) g2Var2;
                    ui.f k10 = z10 ? le0Var2.k() : le0Var2.B();
                    if (k10 != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        k10.o(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
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
