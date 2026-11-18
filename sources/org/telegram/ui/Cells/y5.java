package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.hf;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y5 extends FrameLayout {
    public org.telegram.ui.Components.q9 a;
    public FrameLayout b;
    public mp c;
    public TextView d;
    public di.n4 e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(ef efVar) {
        di.n4 n4Var = this.e;
        org.telegram.ui.Components.q9 q9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = efVar.c;
        int i7 = efVar.C;
        String str2 = efVar.I;
        if (str != null) {
            q9Var.h(str, null, drawable);
            return;
        }
        if (str2 == null) {
            q9Var.setImageDrawable(drawable);
            return;
        }
        q9Var.s(efVar.J, efVar.K, true);
        if (efVar.d()) {
            n4Var.setVisibility(4);
            setContentDescription(gd.M0(2131753960, null));
            q9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            return;
        }
        if (!efVar.b) {
            n4Var.setVisibility(4);
            setContentDescription(gd.M0(2131753946, null));
            q9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            return;
        }
        n4Var.setVisibility(0);
        this.d.setText(org.telegram.messenger.g0.g0(efVar.E, false, false));
        StringBuilder sb2 = new StringBuilder();
        c0.u(null, 2131753931, sb2, ", ");
        sb2.append(gd.z(efVar.E));
        setContentDescription(sb2.toString());
        StringBuilder sb3 = new StringBuilder("vthumb://");
        sb3.append(i7);
        q9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
    }

    public void setNum(int i7) {
        this.c.setNum(i7);
    }

    public void setImage(hf hfVar) {
        org.telegram.ui.Components.q9 q9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = hfVar.M;
        if (photoSize != null) {
            q9Var.j(fc.i(photoSize, hfVar.K), null, drawable, hfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = hfVar.L;
        if (photoSize2 != null) {
            q9Var.j(fc.i(photoSize2, hfVar.K), "80_80", drawable, hfVar);
            return;
        }
        String str = hfVar.c;
        if (str != null) {
            q9Var.h(str, null, drawable);
            return;
        }
        String str2 = hfVar.D;
        if (str2 != null && str2.length() > 0) {
            q9Var.h(hfVar.D, null, drawable);
        } else if (fj.W2(hfVar.J)) {
            q9Var.j(fc.c(org.telegram.messenger.w7.w(hfVar.J.thumbs, ks.r5, false, null, false), hfVar.J), null, drawable, hfVar);
        } else {
            q9Var.setImageDrawable(drawable);
        }
    }
}
