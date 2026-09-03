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
import org.telegram.ui.Components.bf0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, bf0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.bf0
    public void l(int i10, int i11) {
        v5 v5Var = (v5) this.a;
        bf0 bf0Var = (bf0) this.b;
        m2.b bVar = v5Var.e;
        TextView textView = v5Var.b;
        bf0Var.l(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 1000L);
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
        v5Var.d.addListener(new org.telegram.ui.s5(v5Var, 9));
        v5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        j9 j9Var = (j9) this.a;
        Menu menu = (Menu) this.b;
        j9Var.a = str;
        j9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        j9 j9Var = (j9) this.a;
        Menu menu = (Menu) this.b;
        j9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        j9Var.a = null;
        j9Var.a(menu);
    }
}
