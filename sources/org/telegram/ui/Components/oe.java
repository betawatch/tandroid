package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oe implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ oe(KeyEvent.Callback callback, int i3, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int currentPage;
        int i3 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i3) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                kf kfVar = chatActivityEnterView.V0;
                if (kfVar != null && (currentPage = kfVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.y3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.y3 = z11;
                    boolean z12 = chatActivityEnterView.z3;
                    chatActivityEnterView.z3 = currentPage == 0;
                    if (chatActivityEnterView.A3) {
                        if (chatActivityEnterView.S1 != 0) {
                            chatActivityEnterView.l1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.G();
                        } else if (!z11) {
                            chatActivityEnterView.m1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.y3 || z12 != chatActivityEnterView.z3) {
                        chatActivityEnterView.E(true);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = this.b;
                vo voVar = (vo) callback;
                u4.o0 layoutManager = voVar.t1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i10 > voVar.H1 ? Math.min(i10 + 1, voVar.o1.d.size() - 1) : Math.max(i10 - 1, 0);
                    qo qoVar = voVar.y1;
                    qoVar.a = min;
                    layoutManager.w0(qoVar);
                }
                voVar.H1 = i10;
                break;
            default:
                int i11 = this.b;
                gi.z7 z7Var = (gi.z7) callback;
                if (((oe) z7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) z7Var.b).get(i11);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) z7Var.c).get(i11);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    z7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) z7Var.e).playTogether(arrayList);
                    ((AnimatorSet) z7Var.e).addListener(new a60(this, 8));
                    ((AnimatorSet) z7Var.e).start();
                    break;
                }
                break;
        }
    }

    public oe(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
