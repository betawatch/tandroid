package kh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.hr;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b extends FrameLayout {
    public final u6 a;
    public a b;
    public hr c;
    public boolean d;

    public b(Context context, u6 u6Var) {
        super(context);
        this.a = u6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.c == null) {
            hr hrVar = new hr(getContext(), this.a);
            this.c = hrVar;
            hrVar.setReverse(this.d);
            addView(this.c, gb1.i(-1, 28, 48));
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
            gq gqVar = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = gqVar;
            gqVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, gb1.i(46, 46, 17));
        }
        oe.b bVar = aVar.a;
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
