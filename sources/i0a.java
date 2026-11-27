// default package

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class i0a extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ n1a c;

    public i0a(n1a n1aVar, Integer num) {
        this.c = n1aVar;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        n1a n1aVar = this.c;
        byte b = n1aVar.e1;
        float width = (this.b == null ? view.getWidth() / 2.0f : r2.intValue()) + hl.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        boolean m = n1aVar.m();
        Rect rect = this.a;
        if (m) {
            rect.set((int) ((width - (n1aVar.b1 * width)) + view.getPaddingLeft()), (int) qd4.A(1.0f, n1aVar.c1, hl.L(b), qd4.A(1.0f, n1aVar.c1, height, view.getPaddingTop())), (int) (((width2 - width) * n1aVar.b1) + view.getPaddingLeft() + width), (int) qd4.A(1.0f, n1aVar.c1, hl.L(b), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (n1aVar.b1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * n1aVar.b1) + view.getPaddingLeft() + width), (int) ((height * n1aVar.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, hl.L(12.0f));
    }
}
