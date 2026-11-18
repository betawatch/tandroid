package c8;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class ra {
    public static void a(View view) {
        b(view, 0.1f, 1.5f);
    }

    public static void b(View view, float f10, float f11) {
        if (view == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        float f12 = 1.0f - f10;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f12);
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f12));
        animatorSet.setDuration(80L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f));
        animatorSet2.setInterpolator(new OvershootInterpolator(f11));
        animatorSet2.setDuration(350L);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.state_pressed}, animatorSet);
        stateListAnimator.addState(new int[0], animatorSet2);
        view.setStateListAnimator(stateListAnimator);
    }
}
