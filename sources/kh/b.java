package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final i6 a;
    public a b;
    public qq c;
    public boolean d;

    public b(Context context, i6 i6Var) {
        super(context);
        this.a = i6Var;
    }

    public final void a(int i7, boolean z10) {
        if (this.c == null) {
            qq qqVar = new qq(getContext(), this.a);
            this.c = qqVar;
            qqVar.setReverse(this.d);
            addView(this.c, na.e(-1, 28, 48));
        }
        this.c.a.c(i7, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            rp rpVar = new rp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.e = rpVar;
            rpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, na.e(46, 46, 17));
        }
        te.a aVar2 = aVar.a;
        if (!aVar2.f && aVar2.e == 0.0f) {
            aVar.e.c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
