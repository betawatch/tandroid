// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n7c extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final /* synthetic */ o7c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7c(o7c o7cVar, Context context) {
        super(context);
        this.d = o7cVar;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        a aVar;
        a aVar2;
        super.onScrollChanged(i, i2, i3, i4);
        o7c o7cVar = this.d;
        TextView textView = o7cVar.c;
        if (textView != null) {
            int[] iArr = this.a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = o7cVar.c.getMeasuredHeight() + iArr[1];
            aVar = ((e) o7cVar).actionBar;
            boolean z = measuredHeight < aVar.getBottom();
            if (z != (o7cVar.c.getTag() == null)) {
                o7cVar.c.setTag(z ? null : 1);
                AnimatorSet animatorSet = o7cVar.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    o7cVar.L = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                o7cVar.L = animatorSet2;
                a81 a81Var = o7cVar.E;
                float[] fArr = {z ? 1.0f : 0.0f};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property, fArr);
                aVar2 = ((e) o7cVar).actionBar;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(aVar2.getTitleTextView(), (Property<ema, Float>) property, z ? 1.0f : 0.0f));
                o7cVar.L.setDuration(150L);
                o7cVar.L.addListener(new omb(this, (byte) 10));
                o7cVar.L.start();
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.c = true;
        super.requestLayout();
    }

    @Override // android.widget.ScrollView
    public final void scrollToDescendant(View view) {
        Rect rect = this.b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = hl.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
