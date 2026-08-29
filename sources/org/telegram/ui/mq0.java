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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ mq0(PhotoViewer photoViewer, int i10) {
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
                bg.r3 r3Var = (bg.r3) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.c7.get(photoViewer.L4)).filterPath);
                    bg.u3 u3Var = photoViewer.l5;
                    u3Var.H = true;
                    u3Var.A = r3Var;
                    Bitmap bitmap = photoViewer.y4.getBitmap();
                    photoViewer.y4.getOrientation();
                    bg.r3 r3Var2 = u3Var.A;
                    photoViewer.y4.setImageBitmap(r3Var2 == null ? u3Var.E : (isEmpty || bitmap == null) ? r3Var2.b() : u3Var.e(bitmap));
                    photoViewer.p5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.p5.post(new gq0(photoViewer, i11));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                org.telegram.ui.Components.tc.F(this.b.a0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.H1.d2 = photoViewer2.G1.c();
                photoViewer2.a0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.H1.f2);
                float dp = (!(photoViewer2.H1.O0 instanceof bg.f4) || max <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.H1.getSelectedEntityBottom();
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
                ofFloat.addUpdateListener(new fq0(photoViewer2, i11));
                photoViewer2.o7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.o7;
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
                valueAnimator2.setInterpolator(jrVar);
                photoViewer2.o7.start();
                AnimatorSet animatorSet = photoViewer2.F1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new fq0(photoViewer2, i12));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.F1 = animatorSet2;
                bg.w2 w2Var = photoViewer2.H1.h1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w2Var, (Property<bg.w2, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.H1.Y0, (Property<bg.b1, Float>) property, Math.min(0, AndroidUtilities.dp(40.0f) + r15));
                bg.l0 l0Var = photoViewer2.H1.b1;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(l0Var, (Property<bg.l0, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.H1.w0, (Property<bg.e2, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.H1.x0, (Property<bg.i2, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(jrVar);
                animatorSet2.start();
                ws0 ws0Var = photoViewer2.H1;
                bg.n2 n2Var = ws0Var.q1;
                if (n2Var != null) {
                    if (ws0Var.d2) {
                        n2Var.a(R.drawable.input_smile);
                    } else if (ws0Var.c2) {
                        n2Var.a(R.drawable.input_keyboard);
                    } else {
                        n2Var.a(R.drawable.msg_add);
                    }
                }
                AndroidUtilities.updateViewShow(ws0Var.u1, (ws0Var.d2 || ws0Var.c2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(ws0Var.s1, (ws0Var.d2 || ws0Var.c2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(ws0Var.w1, ws0Var.d2 || ws0Var.c2, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(ws0Var.v1, ws0Var.d2 || ws0Var.c2, false, 1.0f, true, null);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.m5.b.J && (i10 = photoViewer3.L4) >= 0 && i10 < photoViewer3.c7.size() && (photoViewer3.c7.get(photoViewer3.L4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.ff0 ff0Var = photoViewer3.m5;
                    nh.r3 r3Var3 = ff0Var.h;
                    if (r3Var3 != null) {
                        r3Var3.dismiss();
                        ff0Var.h = null;
                    }
                    photoViewer3.m5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new n20(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.c7.get(photoViewer3.L4), PhotoViewer.y1(), 21));
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
                    photoViewer5.M7.setTranslationY(photoViewer5.L0.getTranslationY() - (photoViewer5.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer5.Q1.getEditTextHeight(), 0)));
                }
                photoViewer5.a1.setTranslationY(photoViewer5.Q1.getAlpha() * (-j7.l1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.b1.setTranslationY(photoViewer5.Q1.getAlpha() * (-j7.l1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.c1.setTranslationY(photoViewer5.Q1.getAlpha() * (-j7.l1.d(46.0f, num2.intValue(), 0)));
                nh.i iVar = photoViewer5.Q1.I;
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
                nh.i iVar2 = this.b.R1.I;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer7.B0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.B0(0, false);
                break;
        }
    }
}
