// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ei9 implements pib {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public ei9(Layout layout, int i, int i2, int i3, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pagetablecell;
    }

    @Override // pib, jg7
    public final Layout a() {
        return this.a;
    }

    @Override // pib
    public final Rect c() {
        return null;
    }

    @Override // pib
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // pib
    public final int getRow() {
        return this.d;
    }

    @Override // pib
    public final CharSequence getText() {
        return ffb.h(this.e);
    }

    @Override // pib
    public final int getX() {
        return this.b;
    }

    @Override // pib
    public final int getY() {
        return this.c;
    }
}
