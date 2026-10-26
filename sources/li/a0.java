package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bc1;
import org.telegram.ui.Components.cc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                bc1 bc1Var = (bc1) this.b;
                if (bc1Var.h == null) {
                    bc1Var.h = new cc1(bc1Var);
                }
                return bc1Var.h;
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
                i10 = ((RichMessageLayout.RichBlock) ((an0) this.c)).layoutRow;
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
                an0 an0Var = (an0) this.c;
                i10 = ((RichMessageLayout.RichBlock) an0Var).layoutX;
                return (i10 - an0Var.y) + ((bc1) this.b).b;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final int getY() {
        int i10;
        switch (this.a) {
            case 0:
                return 0;
            default:
                i10 = ((RichMessageLayout.RichBlock) ((an0) this.c)).layoutY;
                return i10 + ((bc1) this.b).c;
        }
    }

    public a0(an0 an0Var, bc1 bc1Var) {
        this.c = an0Var;
        this.b = bc1Var;
    }
}
