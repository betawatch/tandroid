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
import org.telegram.ui.Components.af0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, af0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.af0
    public void i(int i10, int i11) {
        u5 u5Var = (u5) this.a;
        af0 af0Var = (af0) this.b;
        m2.b bVar = u5Var.e;
        TextView textView = u5Var.b;
        af0Var.i(i10, i11);
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
        AnimatorSet animatorSet = u5Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        u5Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(u5Var.a, (Property<TextView, Float>) property, 0.0f));
        u5Var.d.setDuration(250L);
        u5Var.d.setInterpolator(new DecelerateInterpolator());
        u5Var.d.addListener(new org.telegram.ui.u5(u5Var, 9));
        u5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        i9 i9Var = (i9) this.a;
        Menu menu = (Menu) this.b;
        i9Var.a = str;
        i9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        i9 i9Var = (i9) this.a;
        Menu menu = (Menu) this.b;
        i9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        i9Var.a = null;
        i9Var.a(menu);
    }
}
