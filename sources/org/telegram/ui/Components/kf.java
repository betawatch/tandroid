package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class kf implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ kf(KeyEvent.Callback callback, int i10, int i11) {
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
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null && (currentPage = fgVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.x3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.x3 = z11;
                    boolean z12 = chatActivityEnterView.y3;
                    chatActivityEnterView.y3 = currentPage == 0;
                    if (chatActivityEnterView.z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.l1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.J();
                        } else if (!z11) {
                            chatActivityEnterView.m1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.x3 || z12 != chatActivityEnterView.y3) {
                        chatActivityEnterView.I(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                pp ppVar = (pp) callback;
                s4.o0 layoutManager = ppVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > ppVar.Q ? Math.min(i11 + 1, ppVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    jp jpVar = ppVar.H;
                    jpVar.a = min;
                    layoutManager.w0(jpVar);
                }
                ppVar.Q = i11;
                break;
            default:
                int i12 = this.b;
                ci.i9 i9Var = (ci.i9) callback;
                if (((kf) i9Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) i9Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) i9Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    i9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) i9Var.e).playTogether(arrayList);
                    ((AnimatorSet) i9Var.e).addListener(new hd0(this, 3));
                    ((AnimatorSet) i9Var.e).start();
                    break;
                }
                break;
        }
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
