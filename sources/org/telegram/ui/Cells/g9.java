package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.ui.Components.qe0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, qe0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.qe0
    public void l(int i10, int i11) {
        t5 t5Var = (t5) this.a;
        qe0 qe0Var = (qe0) this.b;
        lh.m7 m7Var = t5Var.e;
        TextView textView = t5Var.b;
        qe0Var.l(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = t5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        t5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(t5Var.a, (Property<TextView, Float>) property, 0.0f));
        t5Var.d.setDuration(250L);
        t5Var.d.setInterpolator(new DecelerateInterpolator());
        t5Var.d.addListener(new nh.q5(t5Var, 18));
        t5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        h9 h9Var = (h9) this.a;
        Menu menu = (Menu) this.b;
        h9Var.a = str;
        h9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        h9 h9Var = (h9) this.a;
        Menu menu = (Menu) this.b;
        h9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        h9Var.a = null;
        h9Var.a(menu);
    }
}
