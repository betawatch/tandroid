package ch;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import jh.k;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.og0;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.ug1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h {
    public final RenderNode a;
    public final og0 b;
    public final a c = new a();
    public long d = 0;
    public int e;
    public int f;

    public h(RenderNode renderNode, og0 og0Var) {
        this.a = renderNode;
        this.b = og0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        hh.d y3;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        a aVar = this.c;
        aVar.b = 0L;
        aVar.a = false;
        rg0 rg0Var = this.b.a;
        int themedColor = rg0Var.getThemedColor(y6.d6);
        RectF rectF = rg0Var.S;
        aVar.a(themedColor);
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = rg0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            r2 r2Var = ((ug1) sparseArray.valueAt(i10)).a;
            View view = r2Var.fragmentView;
            if (view != null && k.c(view, rg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < rg0Var.fragmentView.getMeasuredWidth() && (r2Var instanceof qg0) && ((qg0) r2Var).y() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(r2Var.getClassGuid());
            }
        }
        long j10 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z10) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = rg0Var.fragmentView;
            SparseArray sparseArray2 = rg0Var.a;
            RectF rectF2 = rg0Var.S;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = rg0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(rg0Var.getThemedColor(y6.d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                r2 r2Var2 = ((ug1) sparseArray2.valueAt(i11)).a;
                View view3 = r2Var2.fragmentView;
                if (view3 != null && k.c(view3, rg0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < rg0Var.fragmentView.getMeasuredWidth() && (r2Var2 instanceof qg0) && (y3 = ((qg0) r2Var2).y()) != null) {
                    beginRecording.save();
                    beginRecording.translate(rectF2.left, rectF2.top);
                    y3.w(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
            this.a.endRecording();
        }
    }
}
