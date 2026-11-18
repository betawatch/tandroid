package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class y implements t9 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public y(Layout layout, Rect rect) {
        this.b = layout;
        this.c = rect;
    }

    @Override // org.telegram.ui.Cells.t9
    public final Layout a() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            default:
                org.telegram.utils.twidget.t1 t1Var = (org.telegram.utils.twidget.t1) this.b;
                if (t1Var.h == null) {
                    t1Var.h = new org.telegram.utils.twidget.u1(t1Var);
                }
                return t1Var.h;
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
                return ((pk0) this.c).V;
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
                pk0 pk0Var = (pk0) this.c;
                return (pk0Var.T - pk0Var.k0) + ((org.telegram.utils.twidget.t1) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((pk0) this.c).U + ((org.telegram.utils.twidget.t1) this.b).c;
        }
    }

    public y(pk0 pk0Var, org.telegram.utils.twidget.t1 t1Var) {
        this.c = pk0Var;
        this.b = t1Var;
    }
}
