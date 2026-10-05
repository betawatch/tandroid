package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class m5 implements ba {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public m5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override // org.telegram.ui.Cells.ba
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getRow() {
        return this.d;
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence getText() {
        return j6.h(this.e);
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getY() {
        return this.c;
    }
}
