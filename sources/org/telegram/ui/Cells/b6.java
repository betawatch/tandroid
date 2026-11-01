package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.ff;
import org.telegram.messenger.jc;
import org.telegram.messenger.jf;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    public void setImage(ff ffVar) {
        jg.b1 b1Var = this.e;
        org.telegram.ui.Components.g9 g9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = ffVar.c;
        int i10 = ffVar.C;
        String str2 = ffVar.I;
        if (str != null) {
            g9Var.h(str, null, drawable);
            return;
        }
        if (str2 == null) {
            g9Var.setImageDrawable(drawable);
            return;
        }
        g9Var.s(ffVar.J, ffVar.K, true);
        if (ffVar.d()) {
            b1Var.setVisibility(4);
            setContentDescription(dd.L0(2131753962, null));
            g9Var.h("thumb://" + i10 + ":" + str2, null, drawable);
            return;
        }
        if (!ffVar.b) {
            b1Var.setVisibility(4);
            setContentDescription(dd.L0(2131753948, null));
            g9Var.h("thumb://" + i10 + ":" + str2, null, drawable);
            return;
        }
        b1Var.setVisibility(0);
        this.d.setText(org.telegram.messenger.i0.g0(ffVar.E, false, false));
        StringBuilder sb2 = new StringBuilder();
        a30.q(null, 2131753933, sb2, ", ");
        sb2.append(dd.z(ffVar.E));
        setContentDescription(sb2.toString());
        StringBuilder sb3 = new StringBuilder("vthumb://");
        sb3.append(i10);
        g9Var.h(a1.g.r(sb3, ":", str2), null, drawable);
    }

    public void setNum(int i10) {
        this.c.setNum(i10);
    }

    public void setImage(jf jfVar) {
        org.telegram.ui.Components.g9 g9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = jfVar.M;
        if (photoSize != null) {
            g9Var.j(jc.i(photoSize, jfVar.K), null, drawable, jfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = jfVar.L;
        if (photoSize2 != null) {
            g9Var.j(jc.i(photoSize2, jfVar.K), "80_80", drawable, jfVar);
            return;
        }
        String str = jfVar.c;
        if (str != null) {
            g9Var.h(str, null, drawable);
            return;
        }
        String str2 = jfVar.D;
        if (str2 != null && str2.length() > 0) {
            g9Var.h(jfVar.D, null, drawable);
        } else if (kj.W2(jfVar.J)) {
            g9Var.j(jc.c(org.telegram.messenger.b8.w(jfVar.J.thumbs, at.r5, false, null, false), jfVar.J), null, drawable, jfVar);
        } else {
            g9Var.setImageDrawable(drawable);
        }
    }
}
