package oi;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.t9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class h5 implements t9 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TL_iv.pageTableCell e;

    public h5(Layout layout, int i7, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.a = layout;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = pagetablecell;
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
        return this.d;
    }

    @Override // org.telegram.ui.Cells.t9
    public final CharSequence getText() {
        return d6.h(this.e);
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
