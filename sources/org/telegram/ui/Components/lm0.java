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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lm0 extends Transition {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lm0(Object obj, int i10) {
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
                xx0 xx0Var = (xx0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.g3) xx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + xx0Var.b0));
                break;
            case 2:
                View view = transitionValues.view;
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (view == photoViewer.N1) {
                    transitionValues.values.put("translationY", Integer.valueOf(photoViewer.Q1.getPendingMarginTopDiff()));
                    break;
                }
                break;
            default:
                View view2 = transitionValues.view;
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                if (view2 == secretMediaViewer.W) {
                    transitionValues.values.put("translationY", Integer.valueOf(secretMediaViewer.X.getPendingMarginTopDiff()));
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
                xx0 xx0Var = (xx0) this.b;
                viewGroup = ((org.telegram.ui.ActionBar.g3) xx0Var).containerView;
                map.put("offset", Integer.valueOf(viewGroup.getTop() + xx0Var.b0));
                break;
            case 2:
                View view = transitionValues.view;
                org.telegram.ui.nt0 nt0Var = ((PhotoViewer) this.b).Q1;
                if (view == nt0Var) {
                    transitionValues.values.put("scrollY", Integer.valueOf(nt0Var.getScrollY()));
                    break;
                }
                break;
            default:
                View view2 = transitionValues.view;
                org.telegram.ui.nt0 nt0Var2 = ((SecretMediaViewer) this.b).X;
                if (view2 == nt0Var2) {
                    transitionValues.values.put("scrollY", Integer.valueOf(nt0Var2.getScrollY()));
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
                ofFloat.addUpdateListener(new j70(this, 13));
                return ofFloat;
            case 1:
                int i13 = ((xx0) obj).b0;
                int intValue3 = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.addUpdateListener(new dg.g0(this, intValue3, i13, 4));
                return ofFloat2;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (transitionValues.view == photoViewer.Q1) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt.addListener(new org.telegram.ui.pt0(this, i12));
                    ofInt.addUpdateListener(new org.telegram.ui.g3(this, 22));
                    return ofInt;
                }
                if (transitionValues2.view != photoViewer.N1 || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(photoViewer.N1, (Property<org.telegram.ui.du0, Float>) View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat3.addListener(new org.telegram.ui.pt0(this, i11));
                return ofFloat3;
            default:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                if (transitionValues.view == secretMediaViewer.X) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                    ofInt2.addListener(new org.telegram.ui.m41(this, i12));
                    ofInt2.addUpdateListener(new org.telegram.ui.o11(this, 6));
                    return ofInt2;
                }
                if (transitionValues2.view != secretMediaViewer.W || (intValue2 = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(secretMediaViewer.W, (Property<org.telegram.ui.du0, Float>) View.TRANSLATION_Y, 0.0f, intValue2);
                ofFloat4.addListener(new org.telegram.ui.m41(this, i11));
                return ofFloat4;
        }
    }

    private final void a(TransitionValues transitionValues) {
    }

    private final void b(TransitionValues transitionValues) {
    }
}
