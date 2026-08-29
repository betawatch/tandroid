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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cm0 extends Transition {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cm0(Object obj, int i10) {
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
                nx0 nx0Var = (nx0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) nx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + nx0Var.a0));
                break;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (view == photoViewer.M1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.P1.getPendingMarginTopDiff()));
                    break;
                }
                break;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (view2 == secretMediaViewer.V) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.W.getPendingMarginTopDiff()));
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
                nx0 nx0Var = (nx0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) nx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + nx0Var.a0));
                break;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.xs0 xs0Var = ((PhotoViewer) this.b).P1;
                if (view == xs0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(xs0Var.getScrollY()));
                    break;
                }
                break;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.xs0 xs0Var2 = ((SecretMediaViewer) this.b).W;
                if (view2 == xs0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(xs0Var2.getScrollY()));
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
                ofFloat.addUpdateListener(new d70(this, 13));
                return ofFloat;
            case 1:
                int i13 = ((nx0) obj).a0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new bg.h0(this, intValue3, i13, 5));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.P1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.zs0(this, i12));
                    ofInt.addUpdateListener(new org.telegram.ui.g3(this, 22));
                    return ofInt;
                }
                if (transitionValues2.view != photoViewer.M1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.M1, (Property<org.telegram.ui.nt0, Float>) View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat3.addListener(new org.telegram.ui.zs0(this, i11));
                return ofFloat3;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.W) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.v31(this, i12));
                    ofInt2.addUpdateListener(new org.telegram.ui.w01(this, 6));
                    return ofInt2;
                }
                if (transitionValues2.view != secretMediaViewer.V || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.V, (Property<org.telegram.ui.nt0, Float>) View.TRANSLATION_Y, 0.0f, intValue2);
                ofFloat4.addListener(new org.telegram.ui.v31(this, i11));
                return ofFloat4;
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
