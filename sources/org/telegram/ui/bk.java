package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ bk(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                AnimatorSet animatorSet = qnVar.R9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    qnVar.R9.start();
                    break;
                }
                break;
            default:
                qn qnVar2 = this.b;
                if (qnVar2.K2 == this && (sgVar = qnVar2.I0) != null && (frameLayout = qnVar2.J2) != null) {
                    sgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
