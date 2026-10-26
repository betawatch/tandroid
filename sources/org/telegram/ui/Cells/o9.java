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
import org.telegram.ui.Components.pf0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, pf0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.pf0
    public void l(int i10, int i11) {
        z5 z5Var = (z5) this.a;
        pf0 pf0Var = (pf0) this.b;
        m.g3 g3Var = z5Var.e;
        TextView textView = z5Var.b;
        pf0Var.l(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            AndroidUtilities.runOnUIThread(g3Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = z5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        z5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(z5Var.a, (Property<TextView, Float>) property, 0.0f));
        z5Var.d.setDuration(250L);
        z5Var.d.setInterpolator(new DecelerateInterpolator());
        z5Var.d.addListener(new kg.e(z5Var, 17));
        z5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        p9 p9Var = (p9) this.a;
        Menu menu = (Menu) this.b;
        p9Var.a = str;
        p9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        p9 p9Var = (p9) this.a;
        Menu menu = (Menu) this.b;
        p9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        p9Var.a = null;
        p9Var.a(menu);
    }
}
