package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ff implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ff(KeyEvent.Callback callback, int i10, int i11) {
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
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null && (currentPage = cgVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.w3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.w3 = z11;
                    boolean z12 = chatActivityEnterView.x3;
                    chatActivityEnterView.x3 = currentPage == 0;
                    if (chatActivityEnterView.y3) {
                        if (chatActivityEnterView.Q1 != 0) {
                            chatActivityEnterView.n1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.M();
                        } else if (!z11) {
                            chatActivityEnterView.o1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.w3 || z12 != chatActivityEnterView.x3) {
                        chatActivityEnterView.L(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                mp mpVar = (mp) callback;
                s4.o0 layoutManager = mpVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > mpVar.Q ? Math.min(i11 + 1, mpVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    gp gpVar = mpVar.H;
                    gpVar.a = min;
                    layoutManager.w0(gpVar);
                }
                mpVar.Q = i11;
                break;
            default:
                int i12 = this.b;
                ci.m9 m9Var = (ci.m9) callback;
                if (((ff) m9Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) m9Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) m9Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    m9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) m9Var.e).playTogether(arrayList);
                    ((AnimatorSet) m9Var.e).addListener(new jd0(this, r1));
                    ((AnimatorSet) m9Var.e).start();
                    break;
                }
                break;
        }
    }

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
