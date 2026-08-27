package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ fs0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ dr0(PhotoViewer photoViewer, View view, fs0 fs0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = fs0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.P8;
        View view = this.b;
        fs0 fs0Var = this.c;
        view.setOutlineProvider(fs0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.t3.setOutlineProvider(fs0Var);
        photoViewer.t3.setClipToOutline(true);
        tt0 tt0Var = photoViewer.A2;
        if (tt0Var != null) {
            tt0Var.setOutlineProvider(fs0Var);
            photoViewer.A2.setClipToOutline(true);
        }
        photoViewer.t3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        tt0 tt0Var2 = photoViewer.A2;
        if (tt0Var2 != null) {
            tt0Var2.setTranslationY(f10);
        }
        photoViewer.U5 = 0.0f;
        photoViewer.a0.invalidate();
        this.f.start();
    }
}
