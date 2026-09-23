package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hf implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ hf(KeyEvent.Callback callback, int i10, int i11) {
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
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null && (currentPage = dgVar.getCurrentPage()) != this.b) {
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
                np npVar = (np) callback;
                s4.o0 layoutManager = npVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > npVar.Q ? Math.min(i11 + 1, npVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    hp hpVar = npVar.H;
                    hpVar.a = min;
                    layoutManager.w0(hpVar);
                }
                npVar.Q = i11;
                break;
            default:
                int i12 = this.b;
                ci.j9 j9Var = (ci.j9) callback;
                if (((hf) j9Var.f) == this) {
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
                    ((AnimatorSet) j9Var.e).addListener(new jd0(this, r1));
                    ((AnimatorSet) j9Var.e).start();
                    break;
                }
                break;
        }
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
