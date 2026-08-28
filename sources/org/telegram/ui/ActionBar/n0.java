package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ w0 c;

    public /* synthetic */ n0(w0 w0Var, ArrayList arrayList, int i9) {
        this.a = i9;
        this.c = w0Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.c;
                w0Var.B.setAlpha(0.0f);
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i9 >= arrayList.size()) {
                        w0Var.B.setVisibility(8);
                        break;
                    } else {
                        ((View) arrayList.get(i9)).setAlpha(1.0f);
                        i9++;
                    }
                }
            default:
                this.c.B.setAlpha(1.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        ((View) arrayList2.get(i10)).setAlpha(0.0f);
                        i10++;
                    }
                }
        }
    }
}
