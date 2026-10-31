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
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z4 extends w71 {
    public boolean V;
    public final y4 W;
    public final /* synthetic */ ArrayList a0;
    public final /* synthetic */ j0 b0;
    public final /* synthetic */ int c0;
    public final /* synthetic */ Rect d0;
    public final /* synthetic */ View[] e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.y4] */
    public z4(Context context, org.telegram.ui.ActionBar.p6 p6Var, final ArrayList arrayList, final j0 j0Var, int i10, Rect rect, View[] viewArr) {
        super(context, p6Var);
        this.a0 = arrayList;
        this.b0 = j0Var;
        this.c0 = i10;
        this.d0 = rect;
        this.e0 = viewArr;
        this.W = new us() { // from class: org.telegram.ui.Wallet.y4
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = j0Var.c;
                k0[] k0VarArr = k0.O;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    k0.D(identityHashMap, hashMap, i13, (TL_wallet.walletTransaction) arrayList2.get(i13), true);
                }
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    int intValue = (treeSet == null || treeSet.isEmpty()) ? -1 : ((Integer) treeSet.first()).intValue();
                    ArrayList h02 = k0.h0(wallettransaction);
                    int size2 = h02.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = h02.get(i15);
                        i15++;
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

    @Override // org.telegram.ui.Components.w71
    public final void F(View view, float f7) {
        view.setTranslationX(f7);
        if (getMeasuredWidth() <= 0) {
            return;
        }
        float i10 = Utilities.i(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        view.setTranslationX(f7 - ((2.0f * i10) * this.d0.left));
        view.setPivotX(i10 > 0.0f ? 0.0f : view.getMeasuredWidth());
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i10));
        view.setRotationY(10.0f * i10);
        a7 a7Var = (a7) view.findViewWithTag(a7.class);
        if (a7Var != null) {
            boolean z10 = this.V;
            long nanoTime = System.nanoTime();
            if (!a7Var.S) {
                a7Var.S = true;
                a7Var.N = i10;
                a7Var.R = nanoTime;
                return;
            }
            float f10 = i10 - a7Var.N;
            a7Var.N = i10;
            if (!z10) {
                a7Var.Q = 0.0f;
                a7Var.R = nanoTime;
            } else if (f10 != 0.0f) {
                float max = Math.max(0.008333334f, Math.min(0.033333335f, (nanoTime - a7Var.R) / 1.0E9f));
                a7Var.R = nanoTime;
                float f11 = f10 / max;
                float L = (-(f11 - a7Var.Q)) * org.telegram.messenger.i0.L(140.0f);
                a7Var.Q = f11;
                if (a7Var.O == null) {
                    o1.j jVar = new o1.j(a7Var, o1.j.o);
                    a7Var.O = jVar;
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.32f);
                    kVar.b(300.0f);
                    jVar.m = kVar;
                    a7Var.O.b(new u6(a7Var, 1));
                }
                float z11 = z20.z(a7Var.P, L, org.telegram.messenger.i0.L(1600.0f), -org.telegram.messenger.i0.L(1600.0f));
                a7Var.P = z11;
                o1.j jVar2 = a7Var.O;
                jVar2.a = z11;
                jVar2.c(0.0f);
            }
            if (f10 == 0.0f) {
                return;
            }
            a7Var.U = Math.max(-720.0f, Math.min(720.0f, a7Var.U - (f10 * 300.0f)));
            if (a7Var.W || !a7Var.n) {
                return;
            }
            a7Var.W = true;
            a7Var.V = 0L;
            Choreographer.getInstance().postFrameCallback(a7Var.a0);
        }
    }

    public final void L() {
        if (this.b >= this.a0.size() - 2) {
            j0 j0Var = this.b0;
            if (j0Var.h) {
                return;
            }
            j0Var.h();
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

    @Override // org.telegram.ui.Components.w71
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.d0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.c0).c(this.W, zs.b4);
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.c0).n(this.W, zs.b4);
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
                measuredHeight = org.telegram.messenger.i0.W1(Utilities.i(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f), measuredHeight, view2.getMeasuredHeight());
            }
            i11 = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.w71
    public final void t(View view, View view2, int i10, int i11) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        L();
        wb wbVar = wb.w;
        if (wbVar != null) {
            wbVar.c(0L, false);
        }
    }

    @Override // org.telegram.ui.Components.w71
    public final void w(boolean z10) {
        requestLayout();
        View view = this.e0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
