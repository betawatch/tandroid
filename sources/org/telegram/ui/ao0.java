package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ fp0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ ao0(PhotoViewer photoViewer, View view, fp0 fp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = fp0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.b;
        fp0 fp0Var = this.c;
        view.setOutlineProvider(fp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.w3.setOutlineProvider(fp0Var);
        photoViewer.w3.setClipToOutline(true);
        oq0 oq0Var = photoViewer.E2;
        if (oq0Var != null) {
            oq0Var.setOutlineProvider(fp0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.w3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        oq0 oq0Var2 = photoViewer.E2;
        if (oq0Var2 != null) {
            oq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
