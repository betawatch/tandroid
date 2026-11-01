package bi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class l0 implements u9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ n0 d;

    public l0(n0 n0Var, Layout layout, int i10, int i11) {
        this.d = n0Var;
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
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a L = this.d.c.L();
        return (L == null || (pageBlock = L.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : s6.r(richText, null, true);
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
