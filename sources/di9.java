// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class di9 implements pib {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ii9 d;

    public di9(ii9 ii9Var, Layout layout, int i, int i2) {
        this.d = ii9Var;
        this.a = layout;
        this.b = i;
        this.c = i2;
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
        return 0;
    }

    @Override // pib
    public final CharSequence getText() {
        TL_iv.RichText richText;
        lk0 lk0Var = this.d.a;
        if (lk0Var == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = lk0Var.b;
        return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : yi9.r(richText, null, true);
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
