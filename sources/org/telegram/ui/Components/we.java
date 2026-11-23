package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class we implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ we(KeyEvent.Callback callback, int i7, int i10) {
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
                fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null && (currentPage = fgVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.n4;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.n4 = z11;
                    boolean z12 = chatActivityEnterView.o4;
                    chatActivityEnterView.o4 = currentPage == 0;
                    if (chatActivityEnterView.p4) {
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.P1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.Q();
                        } else if (!z11) {
                            chatActivityEnterView.Q1(false, true, false, true);
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
                np npVar = (np) callback;
                v4.p0 layoutManager = npVar.w1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i10 > npVar.K1 ? Math.min(i10 + 1, npVar.r1.d.size() - 1) : Math.max(i10 - 1, 0);
                    ip ipVar = npVar.B1;
                    ipVar.a = min;
                    layoutManager.w0(ipVar);
                }
                npVar.K1 = i10;
                break;
            default:
                int i11 = this.b;
                hi.x7 x7Var = (hi.x7) callback;
                if (((we) x7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) x7Var.b).get(i11);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) x7Var.c).get(i11);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    x7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) x7Var.e).playTogether(arrayList);
                    ((AnimatorSet) x7Var.e).addListener(new s60(this, 8));
                    ((AnimatorSet) x7Var.e).start();
                    break;
                }
                break;
        }
    }

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
