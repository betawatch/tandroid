package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.vq;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final f6 a;
    public a b;
    public vq c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.c == null) {
            vq vqVar = new vq(getContext(), this.a);
            this.c = vqVar;
            vqVar.setReverse(this.d);
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
            sp spVar = new sp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = spVar;
            spVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, x5.e(46, 46, 17));
        }
        le.b bVar = aVar.a;
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
