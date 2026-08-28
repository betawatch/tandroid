package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class as0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ as0(KeyEvent.Callback callback, int i9, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = i9;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i9 = this.a;
        int i10 = this.b;
        KeyEvent.Callback callback = this.c;
        switch (i9) {
            case 0:
                eu0 eu0Var = (eu0) callback;
                eu0Var.g0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                eu0Var.U(i10);
                break;
            default:
                s51 s51Var = (s51) callback;
                gh.f1 f1Var = s51Var.d;
                f1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = f1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = f1Var.getChildAt(i11);
                    f1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && f1Var.getAdapter() == s51Var.e && (childAt instanceof org.telegram.ui.Cells.v3)) {
                            childAt = ((org.telegram.ui.Cells.v3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / f1Var.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
        }
        return true;
    }
}
