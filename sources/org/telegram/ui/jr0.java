package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ms0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ jr0(PhotoViewer photoViewer, View view, ms0 ms0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = ms0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Q8;
        View view = this.b;
        ms0 ms0Var = this.c;
        view.setOutlineProvider(ms0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.u3.setOutlineProvider(ms0Var);
        photoViewer.u3.setClipToOutline(true);
        au0 au0Var = photoViewer.B2;
        if (au0Var != null) {
            au0Var.setOutlineProvider(ms0Var);
            photoViewer.B2.setClipToOutline(true);
        }
        photoViewer.u3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        au0 au0Var2 = photoViewer.B2;
        if (au0Var2 != null) {
            au0Var2.setTranslationY(f10);
        }
        photoViewer.V5 = 0.0f;
        photoViewer.b0.invalidate();
        this.f.start();
    }
}
