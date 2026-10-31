package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ pq0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ mp0(PhotoViewer photoViewer, View view, pq0 pq0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = pq0Var;
        this.d = f7;
        this.e = f10;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.b;
        pq0 pq0Var = this.c;
        view.setOutlineProvider(pq0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(pq0Var);
        photoViewer.x3.setClipToOutline(true);
        zr0 zr0Var = photoViewer.E2;
        if (zr0Var != null) {
            zr0Var.setOutlineProvider(pq0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        zr0 zr0Var2 = photoViewer.E2;
        if (zr0Var2 != null) {
            zr0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
