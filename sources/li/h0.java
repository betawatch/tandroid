package li;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class h0 implements t9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j0 d;

    public h0(j0 j0Var, Layout layout, int i7, int i10) {
        this.d = j0Var;
        this.a = layout;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.ui.Cells.t9
    public final Layout a() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.t9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t9
    public final /* synthetic */ CharSequence getPrefix() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getRow() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.t9
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a V0 = this.d.c.V0();
        return (V0 == null || (pageBlock = V0.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : c6.r(richText, null, true);
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getX() {
        return this.b;
    }

    @Override // org.telegram.ui.Cells.t9
    public final int getY() {
        return this.c;
    }
}
