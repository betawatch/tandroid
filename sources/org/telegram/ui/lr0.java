package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ os0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ lr0(PhotoViewer photoViewer, View view, os0 os0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = os0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Q8;
        View view = this.b;
        os0 os0Var = this.c;
        view.setOutlineProvider(os0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.u3.setOutlineProvider(os0Var);
        photoViewer.u3.setClipToOutline(true);
        cu0 cu0Var = photoViewer.B2;
        if (cu0Var != null) {
            cu0Var.setOutlineProvider(os0Var);
            photoViewer.B2.setClipToOutline(true);
        }
        photoViewer.u3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        cu0 cu0Var2 = photoViewer.B2;
        if (cu0Var2 != null) {
            cu0Var2.setTranslationY(f10);
        }
        photoViewer.V5 = 0.0f;
        photoViewer.b0.invalidate();
        this.f.start();
    }
}
