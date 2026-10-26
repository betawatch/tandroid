package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    boolean z10 = chatActivityEnterView.x3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.x3 = z11;
                    boolean z12 = chatActivityEnterView.y3;
                    chatActivityEnterView.y3 = currentPage == 0;
                    if (chatActivityEnterView.z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.j1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.H();
                        } else if (!z11) {
                            chatActivityEnterView.k1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.x3 || z12 != chatActivityEnterView.y3) {
                        chatActivityEnterView.G(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                yp ypVar = (yp) callback;
                s4.p0 layoutManager = ypVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > ypVar.P ? Math.min(i11 + 1, ypVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    tp tpVar = ypVar.G;
                    tpVar.a = min;
                    layoutManager.w0(tpVar);
                }
                ypVar.P = i11;
                break;
            default:
                int i12 = this.b;
                fi.t8 t8Var = (fi.t8) callback;
                if (((hf) t8Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) t8Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) t8Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    t8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) t8Var.e).playTogether(arrayList);
                    ((AnimatorSet) t8Var.e).addListener(new i10(this, 10));
                    ((AnimatorSet) t8Var.e).start();
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
