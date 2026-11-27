// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class gf9 implements kmb {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ if9 d;

    public gf9(if9 if9Var, Layout layout, int i, int i2) {
        this.d = if9Var;
        this.a = layout;
        this.b = i;
        this.c = i2;
    }

    @Override // kmb
    public final Layout a() {
        return this.a;
    }

    @Override // kmb
    public final Rect c() {
        return null;
    }

    @Override // kmb
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // kmb
    public final int getRow() {
        return 0;
    }

    @Override // kmb
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        mk0 X0 = this.d.c.X0();
        return (X0 == null || (pageBlock = X0.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : mm9.r(richText, null, true);
    }

    @Override // kmb
    public final int getX() {
        return this.b;
    }

    @Override // kmb
    public final int getY() {
        return this.c;
    }
}
