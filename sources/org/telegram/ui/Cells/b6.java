package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.hf;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b6 extends FrameLayout {
    public org.telegram.ui.Components.g9 a;
    public FrameLayout b;
    public ep c;
    public TextView d;
    public jg.b1 e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(org.telegram.ui.ActionBar.t6.W9, org.telegram.ui.ActionBar.t6.X9, org.telegram.ui.ActionBar.t6.V9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(ef efVar) {
        jg.b1 b1Var = this.e;
        org.telegram.ui.Components.g9 g9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = efVar.c;
        int i10 = efVar.C;
        String str2 = efVar.I;
        if (str != null) {
            g9Var.h(str, null, drawable);
            return;
        }
        if (str2 == null) {
            g9Var.setImageDrawable(drawable);
            return;
        }
        g9Var.s(efVar.J, efVar.K, true);
        if (efVar.d()) {
            b1Var.setVisibility(4);
            setContentDescription(cd.L0(2131753962, null));
            g9Var.h("thumb://" + i10 + ":" + str2, null, drawable);
            return;
        }
        if (!efVar.b) {
            b1Var.setVisibility(4);
            setContentDescription(cd.L0(2131753948, null));
            g9Var.h("thumb://" + i10 + ":" + str2, null, drawable);
            return;
        }
        b1Var.setVisibility(0);
        this.d.setText(org.telegram.messenger.i0.g0(efVar.E, false, false));
        StringBuilder sb2 = new StringBuilder();
        z20.q(null, 2131753933, sb2, ", ");
        sb2.append(cd.z(efVar.E));
        setContentDescription(sb2.toString());
        StringBuilder sb3 = new StringBuilder("vthumb://");
        sb3.append(i10);
        g9Var.h(a1.g.r(sb3, ":", str2), null, drawable);
    }

    public void setNum(int i10) {
        this.c.setNum(i10);
    }

    public void setImage(hf hfVar) {
        org.telegram.ui.Components.g9 g9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = hfVar.M;
        if (photoSize != null) {
            g9Var.j(ic.i(photoSize, hfVar.K), null, drawable, hfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = hfVar.L;
        if (photoSize2 != null) {
            g9Var.j(ic.i(photoSize2, hfVar.K), "80_80", drawable, hfVar);
            return;
        }
        String str = hfVar.c;
        if (str != null) {
            g9Var.h(str, null, drawable);
            return;
        }
        String str2 = hfVar.D;
        if (str2 != null && str2.length() > 0) {
            g9Var.h(hfVar.D, null, drawable);
        } else if (jj.W2(hfVar.J)) {
            g9Var.j(ic.c(org.telegram.messenger.b8.w(hfVar.J.thumbs, zs.r5, false, null, false), hfVar.J), null, drawable, hfVar);
        } else {
            g9Var.setImageDrawable(drawable);
        }
    }
}
