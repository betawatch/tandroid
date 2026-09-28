package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                    boolean z10 = chatActivityEnterView.x3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.x3 = z11;
                    boolean z12 = chatActivityEnterView.y3;
                    chatActivityEnterView.y3 = currentPage == 0;
                    if (chatActivityEnterView.z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.L();
                        } else if (!z11) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.x3 || z12 != chatActivityEnterView.y3) {
                        chatActivityEnterView.K(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                op opVar = (op) callback;
                s4.o0 layoutManager = opVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > opVar.Q ? Math.min(i11 + 1, opVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    ip ipVar = opVar.H;
                    ipVar.a = min;
                    layoutManager.w0(ipVar);
                }
                opVar.Q = i11;
                break;
            default:
                int i12 = this.b;
                ci.j9 j9Var = (ci.j9) callback;
                if (((jf) j9Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) j9Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) j9Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    j9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) j9Var.e).playTogether(arrayList);
                    ((AnimatorSet) j9Var.e).addListener(new hd0(this, 3));
                    ((AnimatorSet) j9Var.e).start();
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
