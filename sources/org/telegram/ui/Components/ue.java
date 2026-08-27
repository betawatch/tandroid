package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ue implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ue(KeyEvent.Callback callback, int i10, int i11) {
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
                qf qfVar = chatActivityEnterView.Q0;
                if (qfVar != null && (currentPage = qfVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.s3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.s3 = z11;
                    boolean z12 = chatActivityEnterView.t3;
                    chatActivityEnterView.t3 = currentPage == 0;
                    if (chatActivityEnterView.u3) {
                        if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.l1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.L();
                        } else if (!z11) {
                            chatActivityEnterView.m1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.s3 || z12 != chatActivityEnterView.t3) {
                        chatActivityEnterView.K(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                ap apVar = (ap) callback;
                f2.x0 layoutManager = apVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > apVar.M ? Math.min(i11 + 1, apVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    uo uoVar = apVar.D;
                    uoVar.a = min;
                    layoutManager.w0(uoVar);
                }
                apVar.M = i11;
                break;
            default:
                int i12 = this.b;
                lh.w8 w8Var = (lh.w8) callback;
                if (((ue) w8Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) w8Var.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) w8Var.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    w8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) w8Var.e).playTogether(arrayList);
                    ((AnimatorSet) w8Var.e).addListener(new sz(this, 10));
                    ((AnimatorSet) w8Var.e).start();
                    break;
                }
                break;
        }
    }

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
