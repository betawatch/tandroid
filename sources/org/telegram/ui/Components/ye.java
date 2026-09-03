package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ye implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ye(KeyEvent.Callback callback, int i10, int i11) {
        this.a = i11;
        this.c = callback;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int currentPage;
        int i10 = this.a;
        KeyEvent.Callback callback = this.c;
        int i11 = 1;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null && (currentPage = ufVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z4 = chatActivityEnterView.t3;
                    boolean z10 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.t3 = z10;
                    boolean z11 = chatActivityEnterView.u3;
                    chatActivityEnterView.u3 = currentPage == 0;
                    if (chatActivityEnterView.v3) {
                        if (chatActivityEnterView.N1 != 0) {
                            chatActivityEnterView.m1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.K();
                        } else if (!z10) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z4 != chatActivityEnterView.t3 || z11 != chatActivityEnterView.u3) {
                        chatActivityEnterView.J(true);
                        break;
                    }
                }
                break;
            case 1:
                int i12 = this.b;
                jp jpVar = (jp) callback;
                f2.v0 layoutManager = jpVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i12 > jpVar.N ? Math.min(i12 + 1, jpVar.h.d.size() - 1) : Math.max(i12 - 1, 0);
                    cp cpVar = jpVar.E;
                    cpVar.a = min;
                    layoutManager.w0(cpVar);
                }
                jpVar.N = i12;
                break;
            default:
                int i13 = this.b;
                sd0 sd0Var = (sd0) callback;
                if (((ye) sd0Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) sd0Var.b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) sd0Var.c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    sd0Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) sd0Var.e).playTogether(arrayList);
                    ((AnimatorSet) sd0Var.e).addListener(new od0(this, i11));
                    ((AnimatorSet) sd0Var.e).start();
                    break;
                }
                break;
        }
    }

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
