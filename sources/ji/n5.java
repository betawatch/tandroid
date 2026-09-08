package ji;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n5 implements ba {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ s5 d;

    public n5(s5 s5Var, Layout layout, int i10, int i11) {
        this.d = s5Var;
        this.a = layout;
        this.b = i10;
        this.c = i11;
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
        return 0;
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence getText() {
        TL_iv.RichText richText;
        a aVar = this.d.a;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : i6.r(richText, null, true);
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
