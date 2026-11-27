// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hha implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ hha(KeyEvent.Callback callback, int i, byte b) {
        this.a = b;
        this.c = callback;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        int i = this.b;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                eja ejaVar = (eja) callback;
                ejaVar.n0[i].getViewTreeObserver().removeOnPreDrawListener(this);
                ejaVar.N(i);
                break;
            default:
                xbc xbcVar = (xbc) callback;
                gw9 gw9Var = xbcVar.n1;
                gw9Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = gw9Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = gw9Var.getChildAt(i2);
                    gw9Var.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= i) {
                        if (S == 1 && gw9Var.getAdapter() == xbcVar.o1 && (childAt instanceof p55)) {
                            childAt = ((p55) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(gw9Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / gw9Var.getMeasuredHeight()) * 100.0f);
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
