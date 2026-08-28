package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ye implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ye(KeyEvent.Callback callback, int i9, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int currentPage;
        int i9 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i9) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null && (currentPage = ufVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.s3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.s3 = z11;
                    boolean z12 = chatActivityEnterView.t3;
                    chatActivityEnterView.t3 = currentPage == 0;
                    if (chatActivityEnterView.u3) {
                        if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.m1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.K();
                        } else if (!z11) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.s3 || z12 != chatActivityEnterView.t3) {
                        chatActivityEnterView.J(true);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = this.b;
                cp cpVar = (cp) callback;
                f2.z0 layoutManager = cpVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i10 > cpVar.M ? Math.min(i10 + 1, cpVar.h.d.size() - 1) : Math.max(i10 - 1, 0);
                    wo woVar = cpVar.D;
                    woVar.a = min;
                    layoutManager.w0(woVar);
                }
                cpVar.M = i10;
                break;
            default:
                int i11 = this.b;
                kh.z8 z8Var = (kh.z8) callback;
                if (((ye) z8Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) z8Var.b).get(i11);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) z8Var.c).get(i11);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    z8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) z8Var.e).playTogether(arrayList);
                    ((AnimatorSet) z8Var.e).addListener(new r60(this, 8));
                    ((AnimatorSet) z8Var.e).start();
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
