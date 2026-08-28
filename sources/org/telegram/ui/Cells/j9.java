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
import org.telegram.ui.Components.ce0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ce0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.ce0
    public void l(int i9, int i10) {
        v5 v5Var = (v5) this.a;
        ce0 ce0Var = (ce0) this.b;
        m.i3 i3Var = v5Var.e;
        TextView textView = v5Var.b;
        ce0Var.l(i9, i10);
        if (i10 > 0) {
            textView.setText("+" + i10);
        } else {
            textView.setText("" + i10);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 1000L);
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
        v5Var.d.addListener(new mh.x(v5Var, 16));
        v5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        k9 k9Var = (k9) this.a;
        Menu menu = (Menu) this.b;
        k9Var.a = str;
        k9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        k9 k9Var = (k9) this.a;
        Menu menu = (Menu) this.b;
        k9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        k9Var.a = null;
        k9Var.a(menu);
    }
}
