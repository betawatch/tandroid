package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ff;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.jf;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public org.telegram.ui.Components.i9 a;
    public FrameLayout b;
    public fp c;
    public TextView d;
    public di.k4 e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(ff ffVar) {
        di.k4 k4Var = this.e;
        org.telegram.ui.Components.i9 i9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = ffVar.c;
        int i7 = ffVar.C;
        String str2 = ffVar.I;
        if (str != null) {
            i9Var.h(str, null, drawable);
            return;
        }
        if (str2 == null) {
            i9Var.setImageDrawable(drawable);
            return;
        }
        i9Var.s(ffVar.J, ffVar.K, true);
        if (ffVar.d()) {
            k4Var.setVisibility(4);
            setContentDescription(hd.M0(2131753962, null));
            i9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            return;
        }
        if (!ffVar.b) {
            k4Var.setVisibility(4);
            setContentDescription(hd.M0(2131753948, null));
            i9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            return;
        }
        k4Var.setVisibility(0);
        this.d.setText(org.telegram.messenger.g0.g0(ffVar.E, false, false));
        StringBuilder sb2 = new StringBuilder();
        y0.r(null, 2131753933, sb2, ", ");
        sb2.append(hd.z(ffVar.E));
        setContentDescription(sb2.toString());
        StringBuilder sb3 = new StringBuilder("vthumb://");
        sb3.append(i7);
        i9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
    }

    public void setNum(int i7) {
        this.c.setNum(i7);
    }

    public void setImage(jf jfVar) {
        org.telegram.ui.Components.i9 i9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = jfVar.M;
        if (photoSize != null) {
            i9Var.j(gc.i(photoSize, jfVar.K), null, drawable, jfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = jfVar.L;
        if (photoSize2 != null) {
            i9Var.j(gc.i(photoSize2, jfVar.K), "80_80", drawable, jfVar);
            return;
        }
        String str = jfVar.c;
        if (str != null) {
            i9Var.h(str, null, drawable);
            return;
        }
        String str2 = jfVar.D;
        if (str2 != null && str2.length() > 0) {
            i9Var.h(jfVar.D, null, drawable);
        } else if (gj.W2(jfVar.J)) {
            i9Var.j(gc.c(org.telegram.messenger.w7.w(jfVar.J.thumbs, ns.r5, false, null, false), jfVar.J), null, drawable, jfVar);
        } else {
            i9Var.setImageDrawable(drawable);
        }
    }
}
