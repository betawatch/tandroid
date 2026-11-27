// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gha implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ jga a;
    public final /* synthetic */ SparseBooleanArray b;
    public final /* synthetic */ tk4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ eja e;

    public gha(eja ejaVar, jga jgaVar, SparseBooleanArray sparseBooleanArray, tk4 tk4Var, int i) {
        this.e = ejaVar;
        this.a = jgaVar;
        this.b = sparseBooleanArray;
        this.c = tk4Var;
        this.d = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        eja ejaVar = this.e;
        ejaVar.getViewTreeObserver().removeOnPreDrawListener(this);
        final jga jgaVar = this.a;
        j79 adapter = jgaVar.getAdapter();
        final byte b = 2;
        final byte b2 = 1;
        final byte b3 = 0;
        if (adapter == ejaVar.K || adapter == ejaVar.N || adapter == ejaVar.P || adapter == ejaVar.O) {
            SparseBooleanArray sparseBooleanArray = this.b;
            if (sparseBooleanArray != null) {
                int childCount = jgaVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    int Q = eja.Q(jgaVar.getChildAt(i));
                    if (Q != 0 && sparseBooleanArray.get(Q, false)) {
                        ejaVar.S1.put(Q, Float.valueOf(0.0f));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new e34(this, Q, jgaVar));
                        ofFloat.addListener(new dn(this, Q, (byte) 12));
                        ofFloat.setStartDelay((int) ((Math.min(jgaVar.getMeasuredHeight(), Math.max(0, r10.getTop())) / jgaVar.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fha
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b4 = b3;
                                jga jgaVar2 = jgaVar;
                                switch (b4) {
                                    case 0:
                                        if (jgaVar2.d1()) {
                                            jgaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (jgaVar2.d1()) {
                                            jgaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (jgaVar2.d1()) {
                                            jgaVar2.invalidate();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    }
                    jgaVar.invalidate();
                }
            }
            return true;
        }
        int childCount2 = jgaVar.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt = jgaVar.getChildAt(i2);
            tk4 tk4Var = this.c;
            if (childAt != tk4Var && RecyclerView.S(childAt) >= this.d - 1) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(jgaVar.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jgaVar.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat2.setStartDelay(min);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fha
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b4 = b2;
                        jga jgaVar2 = jgaVar;
                        switch (b4) {
                            case 0:
                                if (jgaVar2.d1()) {
                                    jgaVar2.invalidate();
                                    break;
                                }
                                break;
                            case 1:
                                if (jgaVar2.d1()) {
                                    jgaVar2.invalidate();
                                    break;
                                }
                                break;
                            default:
                                if (jgaVar2.d1()) {
                                    jgaVar2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat2);
            }
            if (tk4Var != null && tk4Var.getParent() == null) {
                jgaVar.addView(tk4Var);
                q79 layoutManager = jgaVar.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.L(tk4Var);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tk4Var, (Property<tk4, Float>) View.ALPHA, tk4Var.getAlpha(), 0.0f);
                    ofFloat3.addListener(new po9(this, layoutManager));
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fha
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b4 = b;
                            jga jgaVar2 = jgaVar;
                            switch (b4) {
                                case 0:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        break;
                                    }
                                    break;
                                default:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    ofFloat3.start();
                }
            }
        }
        animatorSet.start();
        return true;
    }
}
