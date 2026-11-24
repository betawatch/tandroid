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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o5c extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final /* synthetic */ p5c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5c(p5c p5cVar, Context context) {
        super(context);
        this.d = p5cVar;
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
        p5c p5cVar = this.d;
        TextView textView = p5cVar.c;
        if (textView != null) {
            int[] iArr = this.a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = p5cVar.c.getMeasuredHeight() + iArr[1];
            aVar = ((d) p5cVar).actionBar;
            boolean z = measuredHeight < aVar.getBottom();
            if (z != (p5cVar.c.getTag() == null)) {
                p5cVar.c.setTag(z ? null : 1);
                AnimatorSet animatorSet = p5cVar.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    p5cVar.L = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                p5cVar.L = animatorSet2;
                a91 a91Var = p5cVar.E;
                float[] fArr = {z ? 1.0f : 0.0f};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a91Var, (Property<a91, Float>) property, fArr);
                aVar2 = ((d) p5cVar).actionBar;
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(aVar2.getTitleTextView(), (Property<lka, Float>) property, z ? 1.0f : 0.0f));
                p5cVar.L.setDuration(150L);
                p5cVar.L.addListener(new q7b(this, (byte) 13));
                p5cVar.L.start();
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
        rect.bottom = gm.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
