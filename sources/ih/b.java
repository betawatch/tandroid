package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import le.c;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.yq;
import w7.y5;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final d6 a;
    public a b;
    public yq c;
    public boolean d;

    public b(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.c == null) {
            yq yqVar = new yq(getContext(), this.a);
            this.c = yqVar;
            yqVar.setReverse(this.d);
            addView(this.c, y5.e(-1, 28, 48));
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
            vp vpVar = new vp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = vpVar;
            vpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, y5.e(46, 46, 17));
        }
        c cVar = aVar.a;
        if (!cVar.f && cVar.e == 0.0f) {
            aVar.e.c = -1L;
        }
        cVar.a(z10, z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
