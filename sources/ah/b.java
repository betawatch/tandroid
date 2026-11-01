package ah;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lq;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final p6 a;
    public a b;
    public lq c;
    public boolean d;

    public b(Context context, p6 p6Var) {
        super(context);
        this.a = p6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.c == null) {
            lq lqVar = new lq(getContext(), this.a);
            this.c = lqVar;
            lqVar.setReverse(this.d);
            addView(this.c, b6.e(-1, 28, 48));
        }
        this.c.a.c(i10, z10);
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
            kp kpVar = new kp(i0.L(18.0f), i0.L(1.7f), -9079435);
            aVar.e = kpVar;
            kpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, b6.e(46, 46, 17));
        }
        fe.b bVar = aVar.a;
        if (!bVar.f && bVar.e == 0.0f) {
            aVar.e.c = -1L;
        }
        bVar.a(z10, z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
