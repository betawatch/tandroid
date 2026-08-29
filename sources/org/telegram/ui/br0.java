package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ds0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ br0(PhotoViewer photoViewer, View view, ds0 ds0Var, float f9, float f10, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = ds0Var;
        this.d = f9;
        this.e = f10;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.P8;
        View view = this.b;
        ds0 ds0Var = this.c;
        view.setOutlineProvider(ds0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.t3.setOutlineProvider(ds0Var);
        photoViewer.t3.setClipToOutline(true);
        qt0 qt0Var = photoViewer.A2;
        if (qt0Var != null) {
            qt0Var.setOutlineProvider(ds0Var);
            photoViewer.A2.setClipToOutline(true);
        }
        photoViewer.t3.setTranslationY(this.d);
        float f9 = this.e;
        view.setTranslationY(f9);
        qt0 qt0Var2 = photoViewer.A2;
        if (qt0Var2 != null) {
            qt0Var2.setTranslationY(f9);
        }
        photoViewer.U5 = 0.0f;
        photoViewer.a0.invalidate();
        this.f.start();
    }
}
