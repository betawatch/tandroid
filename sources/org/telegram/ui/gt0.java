package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ au0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public gt0(PhotoViewer photoViewer, au0 au0Var, Integer num) {
        this.c = photoViewer;
        this.a = au0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.c0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.B.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.B.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
        duration.setInterpolator(erVar).start();
        photoViewer.J0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.J0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.L0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.O0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.O0.setAlpha(0.0f);
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.o3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.o3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(erVar).start();
        photoViewer.a0.setAlpha(0.0f);
        photoViewer.H0.setAlpha(0);
        photoViewer.j4 = 4;
        photoViewer.a0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        ag.w wVar = photoViewer.L0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(wVar, (Property<ag.w, Float>) View.TRANSLATION_Y, wVar.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(erVar);
        ag.w wVar2 = photoViewer.L0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(wVar2, (Property<ag.w, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(erVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.a0, (Property<ut0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.f0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new ft0(this));
        animatorSet.start();
        return true;
    }
}
