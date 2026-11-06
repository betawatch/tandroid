package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final f6 a;
    public a b;
    public cq c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
    }

    public final void a(int i7, boolean z9) {
        if (this.c == null) {
            cq cqVar = new cq(getContext(), this.a);
            this.c = cqVar;
            cqVar.setReverse(this.d);
            addView(this.c, ha.e(-1, 28, 48));
        }
        this.c.a.c(i7, z9);
    }

    public final void b(boolean z9, boolean z10) {
        super.setEnabled(z9);
        this.b.e(z9, z10);
    }

    public final void c(boolean z9, boolean z10) {
        a aVar = this.b;
        if (aVar.d == null) {
            if (!z9) {
                return;
            }
            cp cpVar = new cp(g0.L(18.0f), g0.L(1.7f), -9079435);
            aVar.e = cpVar;
            cpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, ha.e(46, 46, 17));
        }
        te.a aVar2 = aVar.a;
        if (!aVar2.f && aVar2.e == 0.0f) {
            aVar.e.c = -1L;
        }
        aVar2.a(z9, z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        b(z9, false);
    }
}
