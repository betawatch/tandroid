package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class do0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ gp0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ do0(PhotoViewer photoViewer, View view, gp0 gp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = gp0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Z8;
        View view = this.b;
        gp0 gp0Var = this.c;
        view.setOutlineProvider(gp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(gp0Var);
        photoViewer.x3.setClipToOutline(true);
        pq0 pq0Var = photoViewer.F2;
        if (pq0Var != null) {
            pq0Var.setOutlineProvider(gp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        pq0 pq0Var2 = photoViewer.F2;
        if (pq0Var2 != null) {
            pq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
