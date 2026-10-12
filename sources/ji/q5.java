package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.z9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class q5 implements z9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public q5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override // org.telegram.ui.Cells.z9
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.z9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int getRow() {
        return this.d;
    }

    @Override // org.telegram.ui.Cells.z9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.z9
    public final CharSequence getText() {
        return m6.h(this.e);
    }

    @Override // org.telegram.ui.Cells.z9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int getY() {
        return this.c;
    }
}
