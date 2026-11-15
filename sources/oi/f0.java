package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class f0 implements s9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ h0 d;

    public f0(h0 h0Var, Layout layout, int i7, int i10) {
        this.d = h0Var;
        this.a = layout;
        this.b = i7;
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
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a P = this.d.c.P();
        return (P == null || (pageBlock = P.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : a6.r(richText, null, true);
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
