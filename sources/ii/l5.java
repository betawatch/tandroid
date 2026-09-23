package ii;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ca;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class l5 implements ca {
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
        return this.d;
    }

    @Override // org.telegram.ui.Cells.ca
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ca
    public final CharSequence getText() {
        return i6.h(this.e);
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
