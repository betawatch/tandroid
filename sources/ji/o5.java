package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class o5 implements ba {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public o5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
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
        return k6.h(this.e);
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
