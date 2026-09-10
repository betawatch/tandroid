package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ac0;
import org.telegram.ui.l71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                rz rzVar = (rz) this.d;
                if (animator.equals(rzVar.M0)) {
                    rzVar.M0 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof g1) {
                    kj0 kj0Var = ((g1) view).c;
                    if (kj0Var.getAnimatedDrawable() != null) {
                        kj0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.b;
                if (viewGroup != null) {
                    chatActivityEnterView.l1.removeView(chatActivityEnterView.e1);
                    viewGroup.addView(chatActivityEnterView.e1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.e1.setAlpha(1.0f);
                chatActivityEnterView.h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.F1();
                di.f0 f0Var = chatActivityEnterView.l0;
                if (f0Var != null) {
                    f0Var.setAlpha(0.0f);
                    chatActivityEnterView.l0.setScaleX(0.0f);
                    chatActivityEnterView.l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.N1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.N1.b();
                    break;
                }
                break;
            case 2:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.c).setVisibility(4);
                ((ImageView) this.b).sendAccessibilityEvent(8);
                break;
            case 3:
                if (((com.google.firebase.messaging.m) this.d).a) {
                    ((View) this.c).postDelayed((l9) this.b, 300L);
                    break;
                }
                break;
            case 4:
                vl0 vl0Var = (vl0) this.c;
                s4.s sVar = (s4.s) this.b;
                rz rzVar = (rz) this.d;
                if (animator.equals(rzVar.M0)) {
                    int L0 = sVar.L0();
                    vl0Var.setTranslationY(0.0f);
                    if (vl0Var == rzVar.D0) {
                        vl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + rzVar.q2);
                    } else if (vl0Var == rzVar.h0) {
                        vl0Var.setPadding(0, rzVar.b1, 0, AndroidUtilities.dp(44.0f) + rzVar.q2);
                    } else if (vl0Var == rzVar.P) {
                        vl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + rzVar.q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    rzVar.M0 = null;
                    break;
                }
                break;
            case 5:
                f60 f60Var = (f60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((n50) this.c).run();
                }
                f60Var.b.setRotationY(0.0f);
                f60Var.m0.setRotationY(0.0f);
                f60Var.E0 = false;
                f60Var.invalidate();
                break;
            case 6:
                u70 u70Var = (u70) this.b;
                u70Var.setProgress(0.0f);
                u70Var.invalidate();
                AndroidUtilities.removeFromParent(u70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                w70 w70Var = (w70) this.d;
                View view2 = w70Var.f;
                viewTreeObserver.removeOnPreDrawListener(w70Var.y);
                if (w70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof wh.h1) {
                        wh.h1 h1Var = (wh.h1) view2;
                        FrameLayout frameLayout = h1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(h1Var.e);
                        break;
                    }
                }
                break;
            case 7:
                l71 l71Var = (l71) this.d;
                l71Var.r1 = null;
                l71Var.invalidate();
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((ac0) this.c).run();
                    break;
                }
                break;
            default:
                zh.o5 o5Var = (zh.o5) this.c;
                zh.g2 g2Var = (zh.g2) this.d;
                zh.a3 a3Var = g2Var.a;
                a3Var.u3 = false;
                a3Var.v3 = 1.0f;
                a3Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    zh.a3 a3Var2 = g2Var.a;
                    a3Var2.q3 = true;
                    try {
                        a3Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                o5Var.setAllowDrawReaction(true);
                o5Var.r = true;
                ImageReceiver imageReceiver = o5Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                zh.a3 a3Var3 = g2Var.a;
                org.telegram.ui.Components.p5 p5Var = a3Var3.o3;
                if (p5Var != null) {
                    p5Var.o(a3Var3);
                    g2Var.a.o3 = null;
                    break;
                }
                break;
        }
    }

    public l1(com.google.firebase.messaging.m mVar, View view) {
        this.a = 3;
        this.d = mVar;
        this.c = view;
        this.b = new l9(this, 8);
    }

    public l1(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, View view, ImageView imageView) {
        this.a = 2;
        this.d = chatAttachAlertPhotoLayout;
        this.c = view;
        this.b = imageView;
    }
}
