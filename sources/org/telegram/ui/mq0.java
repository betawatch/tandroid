package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ mq0(PhotoViewer photoViewer, int i9) {
        this.a = i9;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        int i10 = 9;
        int i11 = 8;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                yf.j2 j2Var = (yf.j2) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.c7.get(photoViewer.L4)).filterPath);
                    yf.m2 m2Var = photoViewer.l5;
                    m2Var.H = true;
                    m2Var.A = j2Var;
                    Bitmap bitmap = photoViewer.y4.getBitmap();
                    photoViewer.y4.getOrientation();
                    yf.j2 j2Var2 = m2Var.A;
                    photoViewer.y4.setImageBitmap(j2Var2 == null ? m2Var.E : (isEmpty || bitmap == null) ? j2Var2.b() : m2Var.e(bitmap));
                    photoViewer.p5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.p5.post(new gq0(photoViewer, i10));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                org.telegram.ui.Components.oc.F(this.b.a0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.H1.d2 = photoViewer2.G1.c();
                photoViewer2.a0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.H1.f2);
                float dp = (!(photoViewer2.H1.O0 instanceof yf.v2) || max <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.H1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer2.o7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.o7 = null;
                }
                if (photoViewer2.q4 != 3) {
                    dp = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.V5, dp);
                photoViewer2.o7 = ofFloat;
                ofFloat.addUpdateListener(new fq0(photoViewer2, i10));
                photoViewer2.o7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.o7;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                valueAnimator2.setInterpolator(grVar);
                photoViewer2.o7.start();
                AnimatorSet animatorSet = photoViewer2.F1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new fq0(photoViewer2, i11));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.F1 = animatorSet2;
                yf.w1 w1Var = photoViewer2.H1.h1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w1Var, (Property<yf.w1, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.H1.Y0, (Property<yf.j0, Float>) property, Math.min(0, AndroidUtilities.dp(40.0f) + r15));
                kh.n5 n5Var = photoViewer2.H1.b1;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(n5Var, (Property<kh.n5, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.H1.w0, (Property<yf.f1, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.H1.x0, (Property<yf.j1, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(grVar);
                animatorSet2.start();
                xs0 xs0Var = photoViewer2.H1;
                yf.o1 o1Var = xs0Var.q1;
                if (o1Var != null) {
                    if (xs0Var.d2) {
                        o1Var.a(R.drawable.input_smile);
                    } else if (xs0Var.c2) {
                        o1Var.a(R.drawable.input_keyboard);
                    } else {
                        o1Var.a(R.drawable.msg_add);
                    }
                }
                AndroidUtilities.updateViewShow(xs0Var.u1, (xs0Var.d2 || xs0Var.c2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(xs0Var.s1, (xs0Var.d2 || xs0Var.c2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(xs0Var.w1, xs0Var.d2 || xs0Var.c2, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(xs0Var.v1, xs0Var.d2 || xs0Var.c2, false, 1.0f, true, null);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.m5.b.J && (i9 = photoViewer3.L4) >= 0 && i9 < photoViewer3.c7.size() && (photoViewer3.c7.get(photoViewer3.L4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.re0 re0Var = photoViewer3.m5;
                    kh.u3 u3Var = re0Var.h;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        re0Var.h = null;
                    }
                    photoViewer3.m5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.no0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.c7.get(photoViewer3.L4), PhotoViewer.y1(), 27));
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.c7.get(photoViewer4.L4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.L4)) {
                    photoViewer4.M2();
                }
                photoViewer4.R1.setTimer(num.intValue());
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.M7.setTranslationY(photoViewer5.L0.getTranslationY() - (photoViewer5.Q1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer5.Q1.getEditTextHeight(), 0)));
                }
                photoViewer5.a1.setTranslationY(photoViewer5.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.b1.setTranslationY(photoViewer5.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.c1.setTranslationY(photoViewer5.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                kh.i iVar = photoViewer5.Q1.I;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.c7.get(photoViewer6.L4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.L4)) {
                    photoViewer6.M2();
                }
                photoViewer6.Q1.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                kh.i iVar2 = this.b.R1.I;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer7.A0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.A0(0, false);
                break;
        }
    }
}
