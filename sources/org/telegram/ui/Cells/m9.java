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
import org.telegram.ui.Components.ve0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ve0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.ve0
    public void k(int i10, int i11) {
        u5 u5Var = (u5) this.a;
        ve0 ve0Var = (ve0) this.b;
        androidx.activity.i iVar = u5Var.e;
        TextView textView = u5Var.b;
        ve0Var.k(i10, i11);
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
        u5Var.d.addListener(new org.telegram.ui.s0(u5Var, 13));
        u5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        n9 n9Var = (n9) this.a;
        Menu menu = (Menu) this.b;
        n9Var.a = str;
        n9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        n9 n9Var = (n9) this.a;
        Menu menu = (Menu) this.b;
        n9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        n9Var.a = null;
        n9Var.a(menu);
    }
}
