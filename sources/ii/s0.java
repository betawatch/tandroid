package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ca;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class s0 implements ca {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u0 d;

    public s0(u0 u0Var, Layout layout, int i10, int i11) {
        this.d = u0Var;
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
        a aVar = this.d.f;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        return pageBlock instanceof TL_iv.pageBlockDetails ? f6.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : "";
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
