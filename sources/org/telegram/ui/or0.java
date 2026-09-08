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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ or0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11 = 9;
        int i12 = 8;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                rg.l2 l2Var = (rg.l2) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.g7.get(photoViewer.P4)).filterPath);
                    rg.o2 o2Var = photoViewer.p5;
                    o2Var.L = true;
                    o2Var.E = l2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    rg.l2 l2Var2 = o2Var.E;
                    photoViewer.C4.setImageBitmap(l2Var2 == null ? o2Var.I : (isEmpty || bitmap == null) ? l2Var2.b() : o2Var.e(bitmap));
                    photoViewer.t5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.t5.post(new ir0(photoViewer, i11));
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                org.telegram.ui.Components.yc.F(this.b.e0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.L1.h2 = photoViewer2.K1.c();
                photoViewer2.e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.j2);
                float dp = (!(photoViewer2.L1.S0 instanceof rg.x2) || max <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer2.s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.s7 = null;
                }
                if (photoViewer2.u4 != 3) {
                    dp = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, dp);
                photoViewer2.s7 = ofFloat;
                ofFloat.addUpdateListener(new hr0(photoViewer2, i11));
                photoViewer2.s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.s7;
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                valueAnimator2.setInterpolator(prVar);
                photoViewer2.s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new hr0(photoViewer2, i12));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                rg.y1 y1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y1Var, (Property<rg.y1, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.c1, (Property<rg.m0, Float>) property, Math.min(0, AndroidUtilities.dp(40.0f) + r15));
                di.x5 x5Var = photoViewer2.L1.f1;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(x5Var, (Property<di.x5, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.L1.A0, (Property<rg.h1, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.L1.B0, (Property<rg.l1, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(prVar);
                animatorSet2.start();
                zt0 zt0Var = photoViewer2.L1;
                rg.q1 q1Var = zt0Var.u1;
                if (q1Var != null) {
                    if (zt0Var.h2) {
                        q1Var.a(R.drawable.input_smile);
                    } else if (zt0Var.g2) {
                        q1Var.a(R.drawable.input_keyboard);
                    } else {
                        q1Var.a(R.drawable.msg_add);
                    }
                }
                AndroidUtilities.updateViewShow(zt0Var.y1, (zt0Var.h2 || zt0Var.g2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(zt0Var.w1, (zt0Var.h2 || zt0Var.g2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(zt0Var.A1, zt0Var.h2 || zt0Var.g2, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(zt0Var.z1, zt0Var.h2 || zt0Var.g2, false, 1.0f, true, null);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.q5.b.N && (i10 = photoViewer3.P4) >= 0 && i10 < photoViewer3.g7.size() && (photoViewer3.g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.kf0 kf0Var = photoViewer3.q5;
                    di.b4 b4Var = kf0Var.h;
                    if (b4Var != null) {
                        b4Var.dismiss();
                        kf0Var.h = null;
                    }
                    photoViewer3.q5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.in0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.g7.get(photoViewer3.P4), PhotoViewer.y1(), 28));
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.g7.get(photoViewer4.P4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.M2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.Q7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * i2.g.f(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.e1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.g.f(46.0f, num2.intValue(), 0)));
                photoViewer5.f1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.g.f(46.0f, num2.intValue(), 0)));
                photoViewer5.g1.setTranslationY(photoViewer5.U1.getAlpha() * (-i2.g.f(46.0f, num2.intValue(), 0)));
                di.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.g7.get(photoViewer6.P4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.M2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                di.i iVar2 = this.b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer7.B0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer8.B0(0, false);
                break;
        }
    }
}
