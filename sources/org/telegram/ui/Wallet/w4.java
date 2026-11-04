package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w4 extends n61 {
    public boolean W;
    public final v4 a0;
    public final /* synthetic */ ArrayList b0;
    public final /* synthetic */ j0 c0;
    public final /* synthetic */ int d0;
    public final /* synthetic */ Rect e0;
    public final /* synthetic */ View[] f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.v4] */
    public w4(Context context, org.telegram.ui.ActionBar.e6 e6Var, final ArrayList arrayList, final j0 j0Var, int i3, Rect rect, View[] viewArr) {
        super(context, e6Var);
        this.b0 = arrayList;
        this.c0 = j0Var;
        this.d0 = i3;
        this.e0 = rect;
        this.f0 = viewArr;
        this.a0 = new cs() { // from class: org.telegram.ui.Wallet.v4
            @Override // org.telegram.messenger.cs
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = j0Var.c;
                k0[] k0VarArr = k0.O;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    k0.D(identityHashMap, hashMap, i12, (TL_wallet.walletTransaction) arrayList2.get(i12), true);
                }
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    int intValue = (treeSet == null || treeSet.isEmpty()) ? -1 : ((Integer) treeSet.first()).intValue();
                    ArrayList h02 = k0.h0(wallettransaction);
                    int size2 = h02.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = h02.get(i14);
                        i14++;
                        TreeSet treeSet2 = (TreeSet) hashMap.get((String) obj2);
                        if (treeSet2 != null && !treeSet2.isEmpty()) {
                            int intValue2 = ((Integer) treeSet2.first()).intValue();
                            intValue = intValue < 0 ? intValue2 : Math.min(intValue, intValue2);
                        }
                    }
                    if (intValue >= 0) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList2.get(intValue);
                        if (wallettransaction2 != wallettransaction) {
                            k0.D(identityHashMap, hashMap, intValue, wallettransaction2, false);
                            arrayList2.set(intValue, wallettransaction);
                            k0.D(identityHashMap, hashMap, intValue, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        k0.D(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override // org.telegram.ui.Components.n61
    public final void E(View view, float f10) {
        view.setTranslationX(f10);
        if (getMeasuredWidth() <= 0) {
            return;
        }
        float i3 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        view.setTranslationX(f10 - ((2.0f * i3) * this.e0.left));
        view.setPivotX(i3 > 0.0f ? 0.0f : view.getMeasuredWidth());
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i3));
        view.setRotationY(10.0f * i3);
        u6 u6Var = (u6) view.findViewWithTag(u6.class);
        if (u6Var != null) {
            boolean z10 = this.W;
            long nanoTime = System.nanoTime();
            if (!u6Var.T) {
                u6Var.T = true;
                u6Var.O = i3;
                u6Var.S = nanoTime;
                return;
            }
            float f11 = i3 - u6Var.O;
            u6Var.O = i3;
            if (!z10) {
                u6Var.R = 0.0f;
                u6Var.S = nanoTime;
            } else if (f11 != 0.0f) {
                float max = Math.max(0.008333334f, Math.min(0.033333335f, (nanoTime - u6Var.S) / 1.0E9f));
                u6Var.S = nanoTime;
                float f12 = f11 / max;
                float L = (-(f12 - u6Var.R)) * org.telegram.messenger.g0.L(140.0f);
                u6Var.R = f12;
                if (u6Var.P == null) {
                    q1.g gVar = new q1.g(u6Var, q1.g.o);
                    u6Var.P = gVar;
                    q1.h hVar = new q1.h(0.0f);
                    hVar.a(0.32f);
                    hVar.b(300.0f);
                    gVar.m = hVar;
                    u6Var.P.b(new o6(u6Var, 1));
                }
                float z11 = org.telegram.messenger.camera.q.z(u6Var.Q, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                u6Var.Q = z11;
                q1.g gVar2 = u6Var.P;
                gVar2.a = z11;
                gVar2.c(0.0f);
            }
            if (f11 == 0.0f) {
                return;
            }
            u6Var.V = Math.max(-720.0f, Math.min(720.0f, u6Var.V - (f11 * 300.0f)));
            if (u6Var.a0 || !u6Var.n) {
                return;
            }
            u6Var.a0 = true;
            u6Var.W = 0L;
            Choreographer.getInstance().postFrameCallback(u6Var.b0);
        }
    }

    public final void L() {
        if (this.b >= this.b0.size() - 2) {
            j0 j0Var = this.c0;
            if (j0Var.h) {
                return;
            }
            j0Var.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.e0;
        canvas.clipRect(rect.left, -getHeight(), getWidth() - rect.right, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.W = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.W = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.n61
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.e0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.d0).c(this.a0, hs.b4);
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.d0).n(this.a0, hs.b4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        View view = getViewPages()[0];
        if (view != null) {
            view.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            View view2 = getViewPages()[1];
            if (view2 != null && view2.getVisibility() == 0 && getMeasuredWidth() > 0) {
                view2.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = org.telegram.messenger.g0.W1(Utilities.i(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f), measuredHeight, view2.getMeasuredHeight());
            }
            i10 = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i3, i10);
    }

    @Override // org.telegram.ui.Components.n61
    public final void r(View view, View view2, int i3, int i10) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        L();
        ac acVar = ac.w;
        if (acVar != null) {
            acVar.c(0L, false);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        requestLayout();
        View view = this.f0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
