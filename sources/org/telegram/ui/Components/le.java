package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class le implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ le(KeyEvent.Callback callback, int i10, int i11) {
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
                gf gfVar = chatActivityEnterView.U0;
                if (gfVar != null && (currentPage = gfVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.x3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.x3 = z11;
                    boolean z12 = chatActivityEnterView.y3;
                    chatActivityEnterView.y3 = currentPage == 0;
                    if (chatActivityEnterView.z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.k1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.G();
                        } else if (!z11) {
                            chatActivityEnterView.l1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.x3 || z12 != chatActivityEnterView.y3) {
                        chatActivityEnterView.F(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                dp dpVar = (dp) callback;
                s4.n0 layoutManager = dpVar.s1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > dpVar.G1 ? Math.min(i11 + 1, dpVar.n1.d.size() - 1) : Math.max(i11 - 1, 0);
                    yo yoVar = dpVar.x1;
                    yoVar.a = min;
                    layoutManager.w0(yoVar);
                }
                dpVar.G1 = i11;
                break;
            default:
                int i12 = this.b;
                uc0 uc0Var = (uc0) callback;
                if (((le) uc0Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) uc0Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) uc0Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    uc0Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) uc0Var.e).playTogether(arrayList);
                    ((AnimatorSet) uc0Var.e).addListener(new t60(this, 8));
                    ((AnimatorSet) uc0Var.e).start();
                    break;
                }
                break;
        }
    }

    public le(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
