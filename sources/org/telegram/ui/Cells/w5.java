package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.kf;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public org.telegram.ui.Components.l9 a;
    public FrameLayout b;
    public wo c;
    public TextView d;
    public bi.m5 e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(org.telegram.ui.ActionBar.l6.W9, org.telegram.ui.ActionBar.l6.X9, org.telegram.ui.ActionBar.l6.V9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(gf gfVar) {
        bi.m5 m5Var = this.e;
        org.telegram.ui.Components.l9 l9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = gfVar.c;
        int i7 = gfVar.C;
        String str2 = gfVar.I;
        if (str != null) {
            l9Var.h(str, null, drawable);
            return;
        }
        if (str2 == null) {
            l9Var.setImageDrawable(drawable);
            return;
        }
        l9Var.s(gfVar.J, gfVar.K, true);
        if (gfVar.d()) {
            m5Var.setVisibility(4);
            setContentDescription(id.M0(2131753962, null));
            l9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            return;
        }
        if (!gfVar.b) {
            m5Var.setVisibility(4);
            setContentDescription(id.M0(2131753948, null));
            l9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            return;
        }
        m5Var.setVisibility(0);
        this.d.setText(org.telegram.messenger.g0.g0(gfVar.E, false, false));
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
        sb2.append(id.z(gfVar.E));
        setContentDescription(sb2.toString());
        StringBuilder sb3 = new StringBuilder("vthumb://");
        sb3.append(i7);
        l9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
    }

    public void setNum(int i7) {
        this.c.setNum(i7);
    }

    public void setImage(kf kfVar) {
        org.telegram.ui.Components.l9 l9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = kfVar.M;
        if (photoSize != null) {
            l9Var.j(hc.i(photoSize, kfVar.K), null, drawable, kfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = kfVar.L;
        if (photoSize2 != null) {
            l9Var.j(hc.i(photoSize2, kfVar.K), "80_80", drawable, kfVar);
            return;
        }
        String str = kfVar.c;
        if (str != null) {
            l9Var.h(str, null, drawable);
            return;
        }
        String str2 = kfVar.D;
        if (str2 != null && str2.length() > 0) {
            l9Var.h(kfVar.D, null, drawable);
        } else if (ij.W2(kfVar.J)) {
            l9Var.j(hc.c(org.telegram.messenger.w7.w(kfVar.J.thumbs, qs.r5, false, null, false), kfVar.J), null, drawable, kfVar);
        } else {
            l9Var.setImageDrawable(drawable);
        }
    }
}
