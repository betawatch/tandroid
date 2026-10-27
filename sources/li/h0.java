package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.da;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h0 implements da {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j0 d;

    public h0(j0 j0Var, Layout layout, int i10, int i11) {
        this.d = j0Var;
        this.a = layout;
        this.b = i10;
        this.c = i11;
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
        return 0;
    }

    @Override // org.telegram.ui.Cells.da
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a L = this.d.c.L();
        return (L == null || (pageBlock = L.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : f6.r(richText, null, true);
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
