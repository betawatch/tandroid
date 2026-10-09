package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a4 extends o91 {
    public boolean T;
    public final z3 U;
    public final /* synthetic */ j0 V;
    public final /* synthetic */ ArrayList W;
    public final /* synthetic */ int a0;
    public final /* synthetic */ Rect b0;
    public final /* synthetic */ View[] c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.z3] */
    public a4(Context context, org.telegram.ui.ActionBar.e6 e6Var, final j0 j0Var, final ArrayList arrayList, int i10, Rect rect, View[] viewArr) {
        super(context, e6Var);
        this.V = j0Var;
        this.W = arrayList;
        this.a0 = i10;
        this.b0 = rect;
        this.c0 = viewArr;
        this.U = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.z3
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                ArrayList arrayList2;
                ArrayList arrayList3 = j0.this.c;
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    int i14 = 0;
                    while (true) {
                        arrayList2 = arrayList;
                        if (i14 >= arrayList2.size()) {
                            arrayList2.add(wallettransaction);
                            break;
                        } else if (arrayList2.get(i14) == wallettransaction || k0.d0((TL_wallet.walletTransaction) arrayList2.get(i14), wallettransaction)) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    arrayList2.set(i14, wallettransaction);
                }
            }
        };
    }

    @Override // org.telegram.ui.Components.o91
    public final void E(View view, float f7) {
        view.setTranslationX(f7);
        if (getMeasuredWidth() <= 0) {
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        view.setTranslationX(f7 - ((2.0f * clamp) * this.b0.left));
        view.setPivotX(clamp > 0.0f ? 0.0f : view.getMeasuredWidth());
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(10.0f * clamp);
        c6 c6Var = (c6) view.findViewWithTag(c6.class);
        if (c6Var != null) {
            boolean z10 = this.T;
            long nanoTime = System.nanoTime();
            if (!c6Var.S) {
                c6Var.S = true;
                c6Var.N = clamp;
                c6Var.R = nanoTime;
                return;
            }
            float f10 = clamp - c6Var.N;
            c6Var.N = clamp;
            if (!z10) {
                c6Var.Q = 0.0f;
                c6Var.R = nanoTime;
            } else if (f10 != 0.0f) {
                float max = Math.max(0.008333334f, Math.min(0.033333335f, (nanoTime - c6Var.R) / 1.0E9f));
                c6Var.R = nanoTime;
                float f11 = f10 / max;
                float dp = (-(f11 - c6Var.Q)) * AndroidUtilities.dp(140.0f);
                c6Var.Q = f11;
                if (c6Var.O == null) {
                    o1.k kVar = new o1.k(c6Var, o1.h.m);
                    c6Var.O = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.32f);
                    lVar.b(300.0f);
                    kVar.u = lVar;
                    c6Var.O.b(new w5(c6Var, 1));
                }
                float max2 = Math.max(-AndroidUtilities.dp(1600.0f), Math.min(AndroidUtilities.dp(1600.0f), c6Var.P + dp));
                c6Var.P = max2;
                o1.k kVar2 = c6Var.O;
                kVar2.a = max2;
                kVar2.g(0.0f);
            }
            if (f10 == 0.0f) {
                return;
            }
            c6Var.U = Math.max(-720.0f, Math.min(720.0f, c6Var.U - (f10 * 300.0f)));
            if (c6Var.W || !c6Var.n) {
                return;
            }
            c6Var.W = true;
            c6Var.V = 0L;
            Choreographer.getInstance().postFrameCallback(c6Var.a0);
        }
    }

    public final void J() {
        if (this.b >= this.W.size() - 2) {
            j0 j0Var = this.V;
            if (j0Var.g) {
                return;
            }
            j0Var.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.o91
    public final float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a0).addObserver(this.U, NotificationCenter.walletTransactionsUpdate);
        J();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.a0).removeObserver(this.U, NotificationCenter.walletTransactionsUpdate);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = getViewPages()[0];
        if (view != null) {
            view.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            View view2 = getViewPages()[1];
            if (view2 != null && view2.getVisibility() == 0 && getMeasuredWidth() > 0) {
                view2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = AndroidUtilities.lerp(measuredHeight, view2.getMeasuredHeight(), Utilities.clamp(Math.abs(view.getTranslationX()) / getMeasuredWidth(), 1.0f, 0.0f));
            }
            i11 = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.o91
    public final void t(View view, View view2, int i10, int i11) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        J();
        tc tcVar = tc.w;
        if (tcVar != null) {
            tcVar.c(0L, false);
        }
    }

    @Override // org.telegram.ui.Components.o91
    public final void w(boolean z10) {
        requestLayout();
        View view = this.c0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
