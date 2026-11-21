package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class g0 implements u9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ i0 d;

    public g0(i0 i0Var, Layout layout, int i7, int i10) {
        this.d = i0Var;
        this.a = layout;
        this.b = i7;
        this.c = i10;
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
        a c12 = this.d.c.c1();
        return (c12 == null || (pageBlock = c12.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : c6.r(richText, null, true);
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
