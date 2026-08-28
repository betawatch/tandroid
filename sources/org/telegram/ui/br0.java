package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ es0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ br0(PhotoViewer photoViewer, View view, es0 es0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = es0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.P8;
        View view = this.b;
        es0 es0Var = this.c;
        view.setOutlineProvider(es0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.t3.setOutlineProvider(es0Var);
        photoViewer.t3.setClipToOutline(true);
        st0 st0Var = photoViewer.A2;
        if (st0Var != null) {
            st0Var.setOutlineProvider(es0Var);
            photoViewer.A2.setClipToOutline(true);
        }
        photoViewer.t3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        st0 st0Var2 = photoViewer.A2;
        if (st0Var2 != null) {
            st0Var2.setTranslationY(f10);
        }
        photoViewer.U5 = 0.0f;
        photoViewer.a0.invalidate();
        this.f.start();
    }
}
