package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.gc1;
import org.telegram.ui.Components.hc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a0 implements da {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public a0(Layout layout, Rect rect) {
        this.b = layout;
        this.c = rect;
    }

    @Override // org.telegram.ui.Cells.da
    public final Layout getLayout() {
        switch (this.a) {
            case 0:
                return (Layout) this.b;
            default:
                gc1 gc1Var = (gc1) this.b;
                if (gc1Var.h == null) {
                    gc1Var.h = new hc1(gc1Var);
                }
                return gc1Var.h;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final /* synthetic */ CharSequence getPrefix() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final int getRow() {
        int i10;
        switch (this.a) {
            case 0:
                return 0;
            default:
                i10 = ((RichMessageLayout.RichBlock) ((bn0) this.c)).layoutRow;
                return i10;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final Rect getSelectionBounds() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                Layout layout = getLayout();
                if (layout == null) {
                    return null;
                }
                return layout.getText();
            default:
                Layout layout2 = getLayout();
                if (layout2 == null) {
                    return null;
                }
                return layout2.getText();
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final int getX() {
        int i10;
        switch (this.a) {
            case 0:
                return 0;
            default:
                bn0 bn0Var = (bn0) this.c;
                i10 = ((RichMessageLayout.RichBlock) bn0Var).layoutX;
                return (i10 - bn0Var.y) + ((gc1) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final int getY() {
        int i10;
        switch (this.a) {
            case 0:
                return 0;
            default:
                i10 = ((RichMessageLayout.RichBlock) ((bn0) this.c)).layoutY;
                return i10 + ((gc1) this.b).c;
        }
    }

    public a0(bn0 bn0Var, gc1 gc1Var) {
        this.c = bn0Var;
        this.b = gc1Var;
    }
}
