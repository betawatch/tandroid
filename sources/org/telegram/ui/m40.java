package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m40 extends Dialog {
    public final ih.c a;
    public final bi.t0 b;
    public Bitmap c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f;
    public float h;
    public ValueAnimator n;
    public boolean r;

    public m40(Context context, bi.t0 t0Var) {
        super(context, R.style.TransparentDialog);
        this.f = new Matrix();
        this.b = t0Var;
        t0Var.setVisibility(4);
        org.telegram.messenger.i0.l2(new org.telegram.ui.Components.vg(18, this, t0Var), 14.0f);
        ih.c cVar = new ih.c(this, context, t0Var);
        this.a = cVar;
        cVar.setOnClickListener(new a(this, 28));
    }

    public final void b(float f7, k40 k40Var) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.n = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 13));
        this.n.addListener(new l40(this, f7, k40Var, 0));
        this.n.setDuration(420L);
        this.n.setInterpolator(org.telegram.ui.Components.gr.h);
        this.n.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.r) {
            return;
        }
        this.r = true;
        b(0.0f, new k40(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.zs.E1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        boolean z10 = org.telegram.messenger.v2.a;
        attributes.flags = i10 | (-2013060864);
        org.telegram.messenger.i0.h2();
        attributes.flags |= 1152;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        b(1.0f, null);
        org.telegram.messenger.i0.h3(new k40(this, 1), 16L);
    }
}
