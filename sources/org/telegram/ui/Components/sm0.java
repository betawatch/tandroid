package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sm0 extends Transition {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sm0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                break;
            case 1:
                transitionValues.values.put("start", Boolean.FALSE);
                Map map = transitionValues.values;
                iy0 iy0Var = (iy0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) iy0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + iy0Var.e0));
                break;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (view == photoViewer.Q1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.T1.getPendingMarginTopDiff()));
                    break;
                }
                break;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (view2 == secretMediaViewer.Z) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.a0.getPendingMarginTopDiff()));
                    break;
                }
                break;
        }
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                break;
            case 1:
                transitionValues.values.put("start", Boolean.TRUE);
                Map map = transitionValues.values;
                iy0 iy0Var = (iy0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) iy0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + iy0Var.e0));
                break;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.bu0 bu0Var = ((PhotoViewer) this.b).T1;
                if (view == bu0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(bu0Var.getScrollY()));
                    break;
                }
                break;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.bu0 bu0Var2 = ((SecretMediaViewer) this.b).a0;
                if (view2 == bu0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(bu0Var2.getScrollY()));
                    break;
                }
                break;
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i10 = this.a;
        Object obj = this.b;
        int i11 = 1;
        int i12 = 0;
        switch (i10) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new s70(this, 13));
                return ofFloat;
            case 1:
                int i13 = ((iy0) obj).e0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new ci.d5(this, intValue3, i13, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.T1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.du0(this, i12));
                    ofInt.addUpdateListener(new org.telegram.ui.b3(this, 21));
                    return ofInt;
                }
                if (transitionValues2.view != photoViewer.Q1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.Q1, (Property<org.telegram.ui.ru0, Float>) View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat3.addListener(new org.telegram.ui.du0(this, i11));
                return ofFloat3;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.a0) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.b51(this, i12));
                    ofInt2.addUpdateListener(new org.telegram.ui.i21(this, 5));
                    return ofInt2;
                }
                if (transitionValues2.view != secretMediaViewer.Z || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.Z, (Property<org.telegram.ui.ru0, Float>) View.TRANSLATION_Y, 0.0f, intValue2);
                ofFloat4.addListener(new org.telegram.ui.b51(this, i11));
                return ofFloat4;
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
