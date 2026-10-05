package ah;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.bh0;
import org.telegram.ui.ch0;
import org.telegram.ui.ph1;
import org.telegram.ui.zg0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k {
    public final RenderNode a;
    public final zg0 b;
    public final a c = new a();
    public long d = 0;
    public int e;
    public int f;

    public k(RenderNode renderNode, zg0 zg0Var) {
        this.a = renderNode;
        this.b = zg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        fh.d x10;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        a aVar = this.c;
        aVar.b = 0L;
        aVar.a = false;
        ch0 ch0Var = this.b.a;
        int themedColor = ch0Var.getThemedColor(i6.d6);
        RectF rectF = ch0Var.T;
        aVar.a(themedColor);
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = ch0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            n2 n2Var = ((ph1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, ch0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ch0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof bh0) && ((bh0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = ch0Var.fragmentView;
            SparseArray sparseArray2 = ch0Var.a;
            RectF rectF2 = ch0Var.T;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = ch0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(ch0Var.getThemedColor(i6.d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                n2 n2Var2 = ((ph1) sparseArray2.valueAt(i11)).a;
                View view3 = n2Var2.fragmentView;
                if (view3 != null && hh.k.c(view3, ch0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < ch0Var.fragmentView.getMeasuredWidth() && (n2Var2 instanceof bh0) && (x10 = ((bh0) n2Var2).x()) != null) {
                    beginRecording.save();
                    beginRecording.translate(rectF2.left, rectF2.top);
                    x10.v(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
            this.a.endRecording();
        }
    }
}
