package mi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class i5 implements s9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ n5 d;

    public i5(n5 n5Var, Layout layout, int i3, int i10) {
        this.d = n5Var;
        this.a = layout;
        this.b = i3;
        this.c = i10;
    }

    @Override // org.telegram.ui.Cells.s9
    public final Layout a() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.s9
    public final CharSequence getText() {
        TL_iv.RichText richText;
        a aVar = this.d.a;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : d6.r(richText, null, true);
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getY() {
        return this.c;
    }
}
