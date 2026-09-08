package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ gt0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ ds0(PhotoViewer photoViewer, View view, gt0 gt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = gt0Var;
        this.d = f7;
        this.e = f10;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.T8;
        View view = this.b;
        gt0 gt0Var = this.c;
        view.setOutlineProvider(gt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(gt0Var);
        photoViewer.x3.setClipToOutline(true);
        tu0 tu0Var = photoViewer.E2;
        if (tu0Var != null) {
            tu0Var.setOutlineProvider(gt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        tu0 tu0Var2 = photoViewer.E2;
        if (tu0Var2 != null) {
            tu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
