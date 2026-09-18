package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ jt0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ gs0(PhotoViewer photoViewer, View view, jt0 jt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = jt0Var;
        this.d = f7;
        this.e = f10;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.b;
        jt0 jt0Var = this.c;
        view.setOutlineProvider(jt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(jt0Var);
        photoViewer.x3.setClipToOutline(true);
        wu0 wu0Var = photoViewer.E2;
        if (wu0Var != null) {
            wu0Var.setOutlineProvider(jt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        wu0 wu0Var2 = photoViewer.E2;
        if (wu0Var2 != null) {
            wu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
