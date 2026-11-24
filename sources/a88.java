// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a88 extends FrameLayout {
    public bf0 a;
    public FrameLayout b;
    public jh2 c;
    public TextView d;
    public jp0 e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(cmb.V9, cmb.W9, cmb.U9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(jo6 jo6Var) {
        jp0 jp0Var = this.e;
        bf0 bf0Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = jo6Var.c;
        int i = jo6Var.C;
        String str2 = jo6Var.I;
        if (str != null) {
            bf0Var.o(str, null, drawable);
            return;
        }
        if (str2 == null) {
            bf0Var.setImageDrawable(drawable);
            return;
        }
        bf0Var.r(jo6Var.J, jo6Var.K, true);
        if (jo6Var.d()) {
            jp0Var.setVisibility(4);
            setContentDescription(jb6.M0(2131753927, null));
            bf0Var.o(mle.d("thumb://", i, ":", str2), null, drawable);
        } else {
            if (!jo6Var.b) {
                jp0Var.setVisibility(4);
                setContentDescription(jb6.M0(2131753913, null));
                bf0Var.o(mle.d("thumb://", i, ":", str2), null, drawable);
                return;
            }
            jp0Var.setVisibility(0);
            this.d.setText(gm.g0(jo6Var.E, false, false));
            setContentDescription(jb6.M0(2131753898, null) + ", " + jb6.z(jo6Var.E));
            StringBuilder sb = new StringBuilder("vthumb://");
            sb.append(i);
            bf0Var.o(b10.j(sb, ":", str2), null, drawable);
        }
    }

    public void setNum(int i) {
        this.c.setNum(i);
    }

    public void setImage(no6 no6Var) {
        bf0 bf0Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = no6Var.M;
        if (photoSize != null) {
            bf0Var.m(gn5.i(photoSize, no6Var.K), null, drawable, no6Var);
            return;
        }
        TLRPC.PhotoSize photoSize2 = no6Var.L;
        if (photoSize2 != null) {
            bf0Var.m(gn5.i(photoSize2, no6Var.K), "80_80", drawable, no6Var);
            return;
        }
        String str = no6Var.c;
        if (str != null) {
            bf0Var.o(str, null, drawable);
            return;
        }
        String str2 = no6Var.D;
        if (str2 != null && str2.length() > 0) {
            bf0Var.o(no6Var.D, null, drawable);
        } else if (k47.W2(no6Var.J)) {
            bf0Var.m(gn5.c(bc4.w(no6Var.J.thumbs, nm7.q5, false, null, false), no6Var.J), null, drawable, no6Var);
        } else {
            bf0Var.setImageDrawable(drawable);
        }
    }
}
