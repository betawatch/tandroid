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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback, ve0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.Components.ve0
    public void k(int i10, int i11) {
        v5 v5Var = (v5) this.a;
        ve0 ve0Var = (ve0) this.b;
        ai.q4 q4Var = v5Var.e;
        TextView textView = v5Var.b;
        ve0Var.k(i10, i11);
        if (i11 > 0) {
            textView.setText("+" + i11);
        } else {
            textView.setText("" + i11);
        }
        if (textView.getTag() != null) {
            AndroidUtilities.cancelRunOnUIThread(q4Var);
            AndroidUtilities.runOnUIThread(q4Var, 1000L);
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
        v5Var.d.addListener(new org.telegram.ui.u4(v5Var, 10));
        v5Var.d.start();
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        o9 o9Var = (o9) this.a;
        Menu menu = (Menu) this.b;
        o9Var.a = str;
        o9Var.a(menu);
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        o9 o9Var = (o9) this.a;
        Menu menu = (Menu) this.b;
        o9Var.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        o9Var.a = null;
        o9Var.a(menu);
    }
}
