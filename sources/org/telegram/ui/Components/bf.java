package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bf implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ bf(KeyEvent.Callback callback, int i10, int i11) {
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
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null && (currentPage = xfVar.getCurrentPage()) != this.b) {
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
                int i11 = this.b;
                gp gpVar = (gp) callback;
                f2.w0 layoutManager = gpVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > gpVar.M ? Math.min(i11 + 1, gpVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    ap apVar = gpVar.D;
                    apVar.a = min;
                    layoutManager.w0(apVar);
                }
                gpVar.M = i11;
                break;
            default:
                int i12 = this.b;
                nh.l8 l8Var = (nh.l8) callback;
                if (((bf) l8Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) l8Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) l8Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    l8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) l8Var.e).playTogether(arrayList);
                    ((AnimatorSet) l8Var.e).addListener(new zz(this, 10));
                    ((AnimatorSet) l8Var.e).start();
                    break;
                }
                break;
        }
    }

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
