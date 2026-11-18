package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class g5 implements u9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ l5 d;

    public g5(l5 l5Var, Layout layout, int i7, int i10) {
        this.d = l5Var;
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
        TL_iv.RichText richText;
        a aVar = this.d.a;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : b6.r(richText, null, true);
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
