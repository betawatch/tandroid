package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ne implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ne(KeyEvent.Callback callback, int i7, int i10) {
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
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null && (currentPage = sfVar.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z10 = chatActivityEnterView.f4;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.f4 = z11;
                    boolean z12 = chatActivityEnterView.g4;
                    chatActivityEnterView.g4 = currentPage == 0;
                    if (chatActivityEnterView.h4) {
                        if (chatActivityEnterView.z2 != 0) {
                            chatActivityEnterView.D1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.O();
                        } else if (!z11) {
                            chatActivityEnterView.E1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.f4 || z12 != chatActivityEnterView.g4) {
                        chatActivityEnterView.N(true);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = this.b;
                ep epVar = (ep) callback;
                v4.o0 layoutManager = epVar.w1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i10 > epVar.K1 ? Math.min(i10 + 1, epVar.r1.d.size() - 1) : Math.max(i10 - 1, 0);
                    zo zoVar = epVar.B1;
                    zoVar.a = min;
                    layoutManager.w0(zoVar);
                }
                epVar.K1 = i10;
                break;
            default:
                int i11 = this.b;
                hi.y7 y7Var = (hi.y7) callback;
                if (((ne) y7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) y7Var.b).get(i11);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) y7Var.c).get(i11);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    y7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) y7Var.e).playTogether(arrayList);
                    ((AnimatorSet) y7Var.e).addListener(new h60(this, 8));
                    ((AnimatorSet) y7Var.e).start();
                    break;
                }
                break;
        }
    }

    public ne(ChatActivityEnterView chatActivityEnterView) {
        this.a = 0;
        this.c = chatActivityEnterView;
        this.b = -1;
    }
}
