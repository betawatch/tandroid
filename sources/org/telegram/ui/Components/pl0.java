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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pl0 extends Transition {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pl0(Object obj, int i9) {
        this.a = i9;
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
                cx0 cx0Var = (cx0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) cx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + cx0Var.a0));
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
                cx0 cx0Var = (cx0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.f3) cx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + cx0Var.a0));
                break;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.zs0 zs0Var = ((PhotoViewer) this.b).P1;
                if (view == zs0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(zs0Var.getScrollY()));
                    break;
                }
                break;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.zs0 zs0Var2 = ((SecretMediaViewer) this.b).W;
                if (view2 == zs0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(zs0Var2.getScrollY()));
                    break;
                }
                break;
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        int i9 = this.a;
        Object obj = this.b;
        int i10 = 1;
        int i11 = 0;
        switch (i9) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q60(this, 13));
                return ofFloat;
            case 1:
                int i12 = ((cx0) obj).a0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new kh.v4(this, intValue3, i12, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.P1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.bt0(this, i11));
                    ofInt.addUpdateListener(new org.telegram.ui.f3(this, 22));
                    return ofInt;
                }
                if (transitionValues2.view != photoViewer.M1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.M1, (Property<org.telegram.ui.pt0, Float>) View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat3.addListener(new org.telegram.ui.bt0(this, i10));
                return ofFloat3;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.W) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.t31(this, i11));
                    ofInt2.addUpdateListener(new org.telegram.ui.v01(this, 6));
                    return ofInt2;
                }
                if (transitionValues2.view != secretMediaViewer.V || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.V, (Property<org.telegram.ui.pt0, Float>) View.TRANSLATION_Y, 0.0f, intValue2);
                ofFloat4.addListener(new org.telegram.ui.t31(this, i10));
                return ofFloat4;
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
