package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final e6 a;
    public a b;
    public kq c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
    }

    public final void a(int i7, boolean z10) {
        if (this.c == null) {
            kq kqVar = new kq(getContext(), this.a);
            this.c = kqVar;
            kqVar.setReverse(this.d);
            addView(this.c, ja.e(-1, 28, 48));
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
            lp lpVar = new lp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.e = lpVar;
            lpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, ja.e(46, 46, 17));
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
