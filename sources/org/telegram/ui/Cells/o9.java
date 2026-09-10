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
import org.telegram.ui.Components.ef0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ef0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.ef0
    public void k(int i10, int i11) {
        w5 w5Var = (w5) this.a;
        ef0 ef0Var = (ef0) this.b;
        androidx.activity.i iVar = w5Var.e;
        TextView textView = w5Var.b;
        ef0Var.k(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(iVar);
            AndroidUtilities.runOnUIThread(iVar, 1000L);
            return;
        }
        AnimatorSet animatorSet = w5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        w5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(w5Var.a, (Property<TextView, Float>) property, 0.0f));
        w5Var.d.setDuration(250L);
        w5Var.d.setInterpolator(new DecelerateInterpolator());
        w5Var.d.addListener(new v5(w5Var, 0));
        w5Var.d.start();
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
