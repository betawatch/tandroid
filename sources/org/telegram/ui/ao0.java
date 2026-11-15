package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ dp0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ ao0(PhotoViewer photoViewer, View view, dp0 dp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = dp0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Z8;
        View view = this.b;
        dp0 dp0Var = this.c;
        view.setOutlineProvider(dp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(dp0Var);
        photoViewer.x3.setClipToOutline(true);
        nq0 nq0Var = photoViewer.F2;
        if (nq0Var != null) {
            nq0Var.setOutlineProvider(dp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        nq0 nq0Var2 = photoViewer.F2;
        if (nq0Var2 != null) {
            nq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
