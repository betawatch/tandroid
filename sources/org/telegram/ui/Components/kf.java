package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    boolean z10 = chatActivityEnterView.w3;
                    boolean z11 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.w3 = z11;
                    boolean z12 = chatActivityEnterView.x3;
                    chatActivityEnterView.x3 = currentPage == 0;
                    if (chatActivityEnterView.y3) {
                        if (chatActivityEnterView.Q1 != 0) {
                            chatActivityEnterView.m1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.L();
                        } else if (!z11) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z10 != chatActivityEnterView.w3 || z12 != chatActivityEnterView.x3) {
                        chatActivityEnterView.K(true);
                        break;
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                sp spVar = (sp) callback;
                s4.o0 layoutManager = spVar.w.getLayoutManager();
                if (layoutManager != null) {
                    int min = i11 > spVar.Q ? Math.min(i11 + 1, spVar.h.d.size() - 1) : Math.max(i11 - 1, 0);
                    mp mpVar = spVar.H;
                    mpVar.a = min;
                    layoutManager.w0(mpVar);
                }
                spVar.Q = i11;
                break;
            default:
                int i12 = this.b;
                bi.oa oaVar = (bi.oa) callback;
                if (((kf) oaVar.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) oaVar.b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) oaVar.c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    oaVar.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) oaVar.e).playTogether(arrayList);
                    ((AnimatorSet) oaVar.e).addListener(new rm(this, 22));
                    ((AnimatorSet) oaVar.e).start();
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
