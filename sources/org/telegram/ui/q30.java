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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q30 extends Dialog {
    public final di.b3 a;
    public final o00 b;
    public Bitmap c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f;
    public float h;
    public ValueAnimator n;
    public boolean r;

    public q30(Context context, o00 o00Var) {
        super(context, R.style.TransparentDialog);
        this.f = new Matrix();
        this.b = o00Var;
        o00Var.setVisibility(4);
        org.telegram.messenger.g0.l2(new org.telegram.ui.Components.ex(12, this, o00Var), 14.0f);
        di.b3 b3Var = new di.b3(this, context, o00Var);
        this.a = b3Var;
        b3Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f10, p30 p30Var) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.n = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 13));
        this.n.addListener(new bi.o7(this, f10, p30Var, 4));
        this.n.setDuration(420L);
        this.n.setInterpolator(org.telegram.ui.Components.wq.h);
        this.n.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.r) {
            return;
        }
        this.r = true;
        b(0.0f, new p30(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        attributes.gravity = org.telegram.messenger.qs.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z9 = org.telegram.messenger.r2.a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
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
        org.telegram.messenger.g0.i3(new p30(this, 1), 16L);
    }
}
