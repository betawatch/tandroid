package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class w0 implements u9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ y0 d;

    public w0(y0 y0Var, Layout layout, int i10, int i11) {
        this.d = y0Var;
        this.a = layout;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.ui.Cells.u9
    public final Layout a() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getText() {
        a aVar = this.d.f;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        return pageBlock instanceof TL_iv.pageBlockDetails ? s6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : "";
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getY() {
        return this.c;
    }
}
