package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ w0 c;

    public /* synthetic */ o0(w0 w0Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = w0Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.c;
                w0Var.C.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i10 >= arrayList.size()) {
                        w0Var.C.setVisibility(8);
                        break;
                    } else {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    }
                }
            default:
                this.c.C.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        ((View) arrayList2.get(i11)).setAlpha(0.0f);
                        i11++;
                    }
                }
        }
    }
}
