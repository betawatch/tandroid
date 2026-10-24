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
import org.telegram.ui.Components.sf0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, sf0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.sf0
    public void l(int i10, int i11) {
        v5 v5Var = (v5) this.a;
        sf0 sf0Var = (sf0) this.b;
        u5 u5Var = v5Var.e;
        TextView textView = v5Var.b;
        sf0Var.l(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = v5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        v5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(v5Var.a, (Property<TextView, Float>) property, 0.0f));
        v5Var.d.setDuration(250L);
        v5Var.d.setInterpolator(new DecelerateInterpolator());
        v5Var.d.addListener(new m.a(v5Var, 15));
        v5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        l9 l9Var = (l9) this.a;
        Menu menu = (Menu) this.b;
        l9Var.a = str;
        l9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        l9 l9Var = (l9) this.a;
        Menu menu = (Menu) this.b;
        l9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        l9Var.a = null;
        l9Var.a(menu);
    }
}
