package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ca;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class j0 implements ca {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ l0 d;

    public j0(l0 l0Var, Layout layout, int i10, int i11) {
        this.d = l0Var;
        this.a = layout;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.ui.Cells.ca
    public final Layout getLayout() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.ca
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ca
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.ca
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ca
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a H = this.d.c.H();
        return (H == null || (pageBlock = H.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : f6.r(richText, null, true);
    }

    @Override // org.telegram.ui.Cells.ca
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.ca
    public final int getY() {
        return this.c;
    }
}
