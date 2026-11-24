// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class gk9 implements qkb {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public gk9(Layout layout, int i, int i2, int i3, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pagetablecell;
    }

    @Override // qkb, mi7
    public final Layout a() {
        return this.a;
    }

    @Override // qkb
    public final Rect c() {
        return null;
    }

    @Override // qkb
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // qkb
    public final int getRow() {
        return this.d;
    }

    @Override // qkb
    public final CharSequence getText() {
        return fhb.h(this.e);
    }

    @Override // qkb
    public final int getX() {
        return this.b;
    }

    @Override // qkb
    public final int getY() {
        return this.c;
    }
}
