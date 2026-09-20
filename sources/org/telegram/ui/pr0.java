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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ pr0(PhotoViewer photoViewer, int i10) {
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
                qg.k2 k2Var = (qg.k2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.g7.get(photoViewer.P4)).filterPath);
                    qg.n2 n2Var = photoViewer.p5;
                    n2Var.L = true;
                    n2Var.E = k2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    qg.k2 k2Var2 = n2Var.E;
                    photoViewer.C4.setImageBitmap(k2Var2 == null ? n2Var.I : (isEmpty || bitmap == null) ? k2Var2.b() : n2Var.e(bitmap));
                    photoViewer.t5.setUndoCutState(true);
                    photoViewer.Z2(true, true);
                    photoViewer.t5.post(new jr0(photoViewer, i11));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                org.telegram.ui.Components.xc.F(this.b.e0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.L1.h2 = photoViewer2.K1.c();
                photoViewer2.e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.j2);
                float dp = (!(photoViewer2.L1.S0 instanceof qg.v2) || max <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
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
                ofFloat.addUpdateListener(new ir0(photoViewer2, i11));
                photoViewer2.s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.s7;
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                valueAnimator2.setInterpolator(qrVar);
                photoViewer2.s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ir0(photoViewer2, i12));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                qg.x1 x1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x1Var, (Property<qg.x1, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.c1, (Property<qg.l0, Float>) property, Math.min(0, AndroidUtilities.dp(40.0f) + r15));
                ci.x5 x5Var = photoViewer2.L1.f1;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(x5Var, (Property<ci.x5, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.L1.A0, (Property<qg.g1, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.L1.B0, (Property<qg.k1, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(qrVar);
                animatorSet2.start();
                au0 au0Var = photoViewer2.L1;
                qg.p1 p1Var = au0Var.u1;
                if (p1Var != null) {
                    if (au0Var.h2) {
                        p1Var.a(R.drawable.input_smile);
                    } else if (au0Var.g2) {
                        p1Var.a(R.drawable.input_keyboard);
                    } else {
                        p1Var.a(R.drawable.msg_add);
                    }
                }
                AndroidUtilities.updateViewShow(au0Var.y1, (au0Var.h2 || au0Var.g2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(au0Var.w1, (au0Var.h2 || au0Var.g2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(au0Var.A1, au0Var.h2 || au0Var.g2, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(au0Var.z1, au0Var.h2 || au0Var.g2, false, 1.0f, true, null);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.q5.b.N && (i10 = photoViewer3.P4) >= 0 && i10 < photoViewer3.g7.size() && (photoViewer3.g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.sf0 sf0Var = photoViewer3.q5;
                    ci.b4 b4Var = sf0Var.h;
                    if (b4Var != null) {
                        b4Var.dismiss();
                        sf0Var.h = null;
                    }
                    photoViewer3.q5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.vn0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.g7.get(photoViewer3.P4), PhotoViewer.y1(), 28));
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
                    photoViewer4.L2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.e1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.g1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                ci.i iVar = photoViewer5.U1.M;
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
                    photoViewer6.L2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                ci.i iVar2 = this.b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.B0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.B0(0, false);
                break;
        }
    }
}
