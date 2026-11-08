package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                return ((ck0) this.c).U;
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
                ck0 ck0Var = (ck0) this.c;
                return (ck0Var.S - ck0Var.j0) + ((org.telegram.utils.twidget.l1) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((ck0) this.c).T + ((org.telegram.utils.twidget.l1) this.b).c;
        }
    }

    public a0(ck0 ck0Var, org.telegram.utils.twidget.l1 l1Var) {
        this.c = ck0Var;
        this.b = l1Var;
    }
}
