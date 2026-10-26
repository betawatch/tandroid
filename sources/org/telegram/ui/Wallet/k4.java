package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k4 extends u91 {
    public boolean V;
    public final j4 W;
    public final /* synthetic */ k0 a0;
    public final /* synthetic */ ArrayList b0;
    public final /* synthetic */ int c0;
    public final /* synthetic */ Rect d0;
    public final /* synthetic */ View[] e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.j4] */
    public k4(Context context, org.telegram.ui.ActionBar.u6 u6Var, final k0 k0Var, final ArrayList arrayList, int i10, Rect rect, View[] viewArr) {
        super(context, u6Var);
        this.a0 = k0Var;
        this.b0 = arrayList;
        this.c0 = i10;
        this.d0 = rect;
        this.e0 = viewArr;
        this.W = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.Wallet.j4
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                ArrayList arrayList2;
                ArrayList arrayList3 = k0.this.c;
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
                        } else if (arrayList2.get(i14) == wallettransaction || l0.f0((TL_wallet.walletTransaction) arrayList2.get(i14), wallettransaction)) {
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

    @Override // org.telegram.ui.Components.u91
    public final void F(View view, float f7) {
        view.setTranslationX(f7);
        if (getMeasuredWidth() <= 0) {
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        view.setTranslationX(f7 - ((2.0f * clamp) * this.d0.left));
        view.setPivotX(clamp > 0.0f ? 0.0f : view.getMeasuredWidth());
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(10.0f * clamp);
        l6 l6Var = (l6) view.findViewWithTag(l6.class);
        if (l6Var != null) {
            boolean z10 = this.V;
            long nanoTime = System.nanoTime();
            if (!l6Var.S) {
                l6Var.S = true;
                l6Var.N = clamp;
                l6Var.R = nanoTime;
                return;
            }
            float f10 = clamp - l6Var.N;
            l6Var.N = clamp;
            if (!z10) {
                l6Var.Q = 0.0f;
                l6Var.R = nanoTime;
            } else if (f10 != 0.0f) {
                float max = Math.max(0.008333334f, Math.min(0.033333335f, (nanoTime - l6Var.R) / 1.0E9f));
                l6Var.R = nanoTime;
                float f11 = f10 / max;
                float dp = (-(f11 - l6Var.Q)) * AndroidUtilities.dp(140.0f);
                l6Var.Q = f11;
                if (l6Var.O == null) {
                    o1.j jVar = new o1.j(l6Var, o1.h.m);
                    l6Var.O = jVar;
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.32f);
                    kVar.b(300.0f);
                    jVar.u = kVar;
                    l6Var.O.b(new f6(l6Var, 1));
                }
                float A = vh.A(l6Var.P, dp, AndroidUtilities.dp(1600.0f), -AndroidUtilities.dp(1600.0f));
                l6Var.P = A;
                o1.j jVar2 = l6Var.O;
                jVar2.a = A;
                jVar2.g(0.0f);
            }
            if (f10 == 0.0f) {
                return;
            }
            l6Var.U = Math.max(-720.0f, Math.min(720.0f, l6Var.U - (f10 * 300.0f)));
            if (l6Var.W || !l6Var.n) {
                return;
            }
            l6Var.W = true;
            l6Var.V = 0L;
            Choreographer.getInstance().postFrameCallback(l6Var.a0);
        }
    }

    public final void L() {
        if (this.b >= this.b0.size() - 2) {
            k0 k0Var = this.a0;
            if (k0Var.h) {
                return;
            }
            k0Var.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.d0;
        canvas.clipRect(rect.left, -getHeight(), getWidth() - rect.right, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.V = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.u91
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.d0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.c0).addObserver(this.W, NotificationCenter.walletTransactionsUpdate);
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.c0).removeObserver(this.W, NotificationCenter.walletTransactionsUpdate);
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
                measuredHeight = AndroidUtilities.lerp(measuredHeight, view2.getMeasuredHeight(), Utilities.clamp(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f));
            }
            i11 = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.u91
    public final void t(View view, View view2, int i10, int i11) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        L();
        qc qcVar = qc.x;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
    }

    @Override // org.telegram.ui.Components.u91
    public final void w(boolean z10) {
        requestLayout();
        View view = this.e0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
