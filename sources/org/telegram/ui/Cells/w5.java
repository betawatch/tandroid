package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bf;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public org.telegram.ui.Components.k9 a;
    public FrameLayout b;
    public wo c;
    public TextView d;
    public ci.t4 e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(ye yeVar) {
        ci.t4 t4Var = this.e;
        org.telegram.ui.Components.k9 k9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = yeVar.c;
        int i3 = yeVar.C;
        String str2 = yeVar.I;
        if (str != null) {
            k9Var.h(str, null, drawable);
            return;
        }
        if (str2 == null) {
            k9Var.setImageDrawable(drawable);
            return;
        }
        k9Var.s(yeVar.J, yeVar.K, true);
        if (yeVar.d()) {
            t4Var.setVisibility(4);
            setContentDescription(bd.M0(2131753962, null));
            k9Var.h("thumb://" + i3 + ":" + str2, null, drawable);
            return;
        }
        if (!yeVar.b) {
            t4Var.setVisibility(4);
            setContentDescription(bd.M0(2131753948, null));
            k9Var.h("thumb://" + i3 + ":" + str2, null, drawable);
            return;
        }
        t4Var.setVisibility(0);
        this.d.setText(org.telegram.messenger.g0.g0(yeVar.E, false, false));
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
        sb2.append(bd.z(yeVar.E));
        setContentDescription(sb2.toString());
        StringBuilder sb3 = new StringBuilder("vthumb://");
        sb3.append(i3);
        k9Var.h(a1.g.s(sb3, ":", str2), null, drawable);
    }

    public void setNum(int i3) {
        this.c.setNum(i3);
    }

    public void setImage(bf bfVar) {
        org.telegram.ui.Components.k9 k9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = bfVar.M;
        if (photoSize != null) {
            k9Var.j(ac.i(photoSize, bfVar.K), null, drawable, bfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = bfVar.L;
        if (photoSize2 != null) {
            k9Var.j(ac.i(photoSize2, bfVar.K), "80_80", drawable, bfVar);
            return;
        }
        String str = bfVar.c;
        if (str != null) {
            k9Var.h(str, null, drawable);
            return;
        }
        String str2 = bfVar.D;
        if (str2 != null && str2.length() > 0) {
            k9Var.h(bfVar.D, null, drawable);
        } else if (zi.X2(bfVar.J)) {
            k9Var.j(ac.c(org.telegram.messenger.w7.w(bfVar.J.thumbs, hs.r5, false, null, false), bfVar.J), null, drawable, bfVar);
        } else {
            k9Var.setImageDrawable(drawable);
        }
    }
}
