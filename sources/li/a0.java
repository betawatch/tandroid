package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.dk0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class a0 implements t9 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public a0(Layout layout, Rect rect) {
        this.b = layout;
        this.c = rect;
    }

    @Override // org.telegram.ui.Cells.t9
    public final Layout a() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.b;
                if (l1Var.h == null) {
                    l1Var.h = new org.telegram.utils.twidget.m1(l1Var);
                }
                return l1Var.h;
        }
    }

    @Override // org.telegram.ui.Cells.t9
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // org.telegram.ui.Cells.t9
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((dk0) this.c).U;
        }
    }

    @Override // org.telegram.ui.Cells.t9
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

    @Override // org.telegram.ui.Cells.t9
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                dk0 dk0Var = (dk0) this.c;
                return (dk0Var.S - dk0Var.j0) + ((org.telegram.utils.twidget.l1) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((dk0) this.c).T + ((org.telegram.utils.twidget.l1) this.b).c;
        }
    }

    public a0(dk0 dk0Var, org.telegram.utils.twidget.l1 l1Var) {
        this.c = dk0Var;
        this.b = l1Var;
    }
}
