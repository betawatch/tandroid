// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class fk9 implements qkb {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kk9 d;

    public fk9(kk9 kk9Var, Layout layout, int i, int i2) {
        this.d = kk9Var;
        this.a = layout;
        this.b = i;
        this.c = i2;
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
        return 0;
    }

    @Override // qkb
    public final CharSequence getText() {
        TL_iv.RichText richText;
        ll0 ll0Var = this.d.a;
        if (ll0Var == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = ll0Var.b;
        return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : zk9.r(richText, null, true);
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
