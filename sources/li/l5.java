package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l5 implements da {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public l5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override // org.telegram.ui.Cells.da
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.da
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final int getRow() {
        return this.d;
    }

    @Override // org.telegram.ui.Cells.da
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final CharSequence getText() {
        return h6.h(this.e);
    }

    @Override // org.telegram.ui.Cells.da
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.da
    public final int getY() {
        return this.c;
    }
}
