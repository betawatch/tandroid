package lh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final e6 a;
    public a b;
    public dq c;
    public boolean d;

    public b(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
    }

    public final void a(int i3, boolean z10) {
        if (this.c == null) {
            dq dqVar = new dq(getContext(), this.a);
            this.c = dqVar;
            dqVar.setReverse(this.d);
            addView(this.c, mf.e(-1, 28, 48));
        }
        this.c.a.c(i3, z10);
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
            cp cpVar = new cp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.e = cpVar;
            cpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, mf.e(46, 46, 17));
        }
        qe.a aVar2 = aVar.a;
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
