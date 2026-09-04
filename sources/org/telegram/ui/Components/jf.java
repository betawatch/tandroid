package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jf implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ jf(KeyEvent.Callback callback, int i10, int i11) {
        this.a = i11;
        this.c = callback;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int currentPage;
        int i10 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null && (currentPage = egVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.w3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.w3 = z11;
                    boolean z12 = chatActivityEnterView.x3;
                    chatActivityEnterView.x3 = currentPage == 0;
                    if (chatActivityEnterView.y3) {
                        if (chatActivityEnterView.Q1 != 0) {
                            chatActivityEnterView.m1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.L();
                        } else if (!z11) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.w3 || z12 != chatActivityEnterView.x3) {
                        chatActivityEnterView.K(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                lp lpVar = (lp) callback;
                s4.o0 layoutManager = lpVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > lpVar.Q ? Math.min(i11 + 1, lpVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    fp fpVar = lpVar.H;
                    fpVar.a = min;
                    layoutManager.w0(fpVar);
                }
                lpVar.Q = i11;
                break;
            default:
                int i12 = this.b;
                di.l9 l9Var = (di.l9) callback;
                if (((jf) l9Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) l9Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) l9Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    l9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) l9Var.e).playTogether(arrayList);
                    ((AnimatorSet) l9Var.e).addListener(new r80(this, 5));
                    ((AnimatorSet) l9Var.e).start();
                    break;
                }
                break;
        }
    }

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
