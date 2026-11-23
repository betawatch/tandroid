package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xe implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ xe(KeyEvent.Callback callback, int i7, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int currentPage;
        int i7 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null && (currentPage = egVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.n4;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.n4 = z11;
                    boolean z12 = chatActivityEnterView.o4;
                    chatActivityEnterView.o4 = currentPage == 0;
                    if (chatActivityEnterView.p4) {
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.R1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.Q();
                        } else if (!z11) {
                            chatActivityEnterView.S1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.n4 || z12 != chatActivityEnterView.o4) {
                        chatActivityEnterView.P(true);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = this.b;
                kp kpVar = (kp) callback;
                v4.p0 layoutManager = kpVar.w1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i10 > kpVar.K1 ? Math.min(i10 + 1, kpVar.r1.d.size() - 1) : Math.max(i10 - 1, 0);
                    fp fpVar = kpVar.B1;
                    fpVar.a = min;
                    layoutManager.w0(fpVar);
                }
                kpVar.K1 = i10;
                break;
            default:
                int i11 = this.b;
                hi.s8 s8Var = (hi.s8) callback;
                if (((xe) s8Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) s8Var.b).get(i11);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) s8Var.c).get(i11);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    s8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) s8Var.e).playTogether(arrayList);
                    ((AnimatorSet) s8Var.e).addListener(new p60(this, 8));
                    ((AnimatorSet) s8Var.e).start();
                    break;
                }
                break;
        }
    }

    public xe(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
