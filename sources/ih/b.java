package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import le.c;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.xq;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final d6 a;
    public a b;
    public xq c;
    public boolean d;

    public b(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.c == null) {
            xq xqVar = new xq(getContext(), this.a);
            this.c = xqVar;
            xqVar.setReverse(this.d);
            addView(this.c, x5.e(-1, 28, 48));
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
            up upVar = new up(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = upVar;
            upVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
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
