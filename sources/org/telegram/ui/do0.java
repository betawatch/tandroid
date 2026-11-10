package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class do0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ip0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ do0(PhotoViewer photoViewer, View view, ip0 ip0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = ip0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.b;
        ip0 ip0Var = this.c;
        view.setOutlineProvider(ip0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.w3.setOutlineProvider(ip0Var);
        photoViewer.w3.setClipToOutline(true);
        rq0 rq0Var = photoViewer.E2;
        if (rq0Var != null) {
            rq0Var.setOutlineProvider(ip0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.w3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        rq0 rq0Var2 = photoViewer.E2;
        if (rq0Var2 != null) {
            rq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
