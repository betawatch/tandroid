package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ v0 c;

    public /* synthetic */ n0(v0 v0Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = v0Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.c;
                v0Var.B.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i10 >= arrayList.size()) {
                        v0Var.B.setVisibility(8);
                        break;
                    } else {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    }
                }
            default:
                this.c.B.setAlpha(1.0f);
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
