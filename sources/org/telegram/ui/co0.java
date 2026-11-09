package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class co0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ hp0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ co0(PhotoViewer photoViewer, View view, hp0 hp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = hp0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.b;
        hp0 hp0Var = this.c;
        view.setOutlineProvider(hp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.w3.setOutlineProvider(hp0Var);
        photoViewer.w3.setClipToOutline(true);
        qq0 qq0Var = photoViewer.E2;
        if (qq0Var != null) {
            qq0Var.setOutlineProvider(hp0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.w3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        qq0 qq0Var2 = photoViewer.E2;
        if (qq0Var2 != null) {
            qq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
