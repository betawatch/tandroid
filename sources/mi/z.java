package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.gk0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class z implements s9 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public z(Layout layout, Rect rect) {
        this.b = layout;
        this.c = rect;
    }

    @Override // org.telegram.ui.Cells.s9
    public final Layout a() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.b;
                if (k0Var.h == null) {
                    k0Var.h = new org.telegram.utils.twidget.l0(k0Var);
                }
                return k0Var.h;
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((gk0) this.c).V;
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                Layout a10 = a();
                if (a10 == null) {
                    return null;
                }
                return a10.getText();
            default:
                Layout a11 = a();
                if (a11 == null) {
                    return null;
                }
                return a11.getText();
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                gk0 gk0Var = (gk0) this.c;
                return (gk0Var.T - gk0Var.k0) + ((org.telegram.utils.twidget.k0) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((gk0) this.c).U + ((org.telegram.utils.twidget.k0) this.b).c;
        }
    }

    public z(gk0 gk0Var, org.telegram.utils.twidget.k0 k0Var) {
        this.c = gk0Var;
        this.b = k0Var;
    }
}
