package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pe implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ pe(KeyEvent.Callback callback, int i7, int i10) {
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
                lf lfVar = chatActivityEnterView.U0;
                if (lfVar != null && (currentPage = lfVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z9 = chatActivityEnterView.x3;
                    boolean z10 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.x3 = z10;
                    boolean z11 = chatActivityEnterView.y3;
                    chatActivityEnterView.y3 = currentPage == 0;
                    if (chatActivityEnterView.z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.G();
                        } else if (!z10) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z9 != chatActivityEnterView.x3 || z11 != chatActivityEnterView.y3) {
                        chatActivityEnterView.E(true);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = this.b;
                vo voVar = (vo) callback;
                v4.n0 layoutManager = voVar.v1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i10 > voVar.J1 ? Math.min(i10 + 1, voVar.q1.d.size() - 1) : Math.max(i10 - 1, 0);
                    po poVar = voVar.A1;
                    poVar.a = min;
                    layoutManager.w0(poVar);
                }
                voVar.J1 = i10;
                break;
            default:
                int i11 = this.b;
                fi.a8 a8Var = (fi.a8) callback;
                if (((pe) a8Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) a8Var.b).get(i11);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) a8Var.c).get(i11);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    a8Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) a8Var.e).playTogether(arrayList);
                    ((AnimatorSet) a8Var.e).addListener(new e60(this, 8));
                    ((AnimatorSet) a8Var.e).start();
                    break;
                }
                break;
        }
    }

    public pe(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
