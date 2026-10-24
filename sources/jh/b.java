package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fr;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b extends FrameLayout {
    public final g6 a;
    public a b;
    public fr c;
    public boolean d;

    public b(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.c == null) {
            fr frVar = new fr(getContext(), this.a);
            this.c = frVar;
            frVar.setReverse(this.d);
            addView(this.c, z5.e(-1, 28, 48));
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
            eq eqVar = new eq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = eqVar;
            eqVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, z5.e(46, 46, 17));
        }
        ne.b bVar = aVar.a;
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
