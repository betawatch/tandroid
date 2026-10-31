package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e0 implements u9 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public e0(Layout layout, Rect rect) {
        this.b = layout;
        this.c = rect;
    }

    @Override // org.telegram.ui.Cells.u9
    public final Layout a() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            default:
                org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) this.b;
                if (o0Var.h == null) {
                    o0Var.h = new org.telegram.utils.twidget.p0(o0Var);
                }
                return o0Var.h;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((gl0) this.c).U;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                Layout a2 = a();
                if (a2 == null) {
                    return null;
                }
                return a2.getText();
            default:
                Layout a10 = a();
                if (a10 == null) {
                    return null;
                }
                return a10.getText();
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                gl0 gl0Var = (gl0) this.c;
                return (gl0Var.S - gl0Var.j0) + ((org.telegram.utils.twidget.o0) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((gl0) this.c).T + ((org.telegram.utils.twidget.o0) this.b).c;
        }
    }

    public e0(gl0 gl0Var, org.telegram.utils.twidget.o0 o0Var) {
        this.c = gl0Var;
        this.b = o0Var;
    }
}
