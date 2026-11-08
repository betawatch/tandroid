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
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class x4 extends v61 {
    public boolean V;
    public final w4 W;
    public final /* synthetic */ ArrayList a0;
    public final /* synthetic */ l0 b0;
    public final /* synthetic */ int c0;
    public final /* synthetic */ Rect d0;
    public final /* synthetic */ View[] e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.w4] */
    public x4(Context context, org.telegram.ui.ActionBar.f6 f6Var, final ArrayList arrayList, final l0 l0Var, int i7, Rect rect, View[] viewArr) {
        super(context, f6Var);
        this.a0 = arrayList;
        this.b0 = l0Var;
        this.c0 = i7;
        this.d0 = rect;
        this.e0 = viewArr;
        this.W = new ls() { // from class: org.telegram.ui.Wallet.w4
            @Override // org.telegram.messenger.ls
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = l0Var.c;
                m0[] m0VarArr = m0.O;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    m0.D(identityHashMap, hashMap, i12, (TL_wallet.walletTransaction) arrayList2.get(i12), true);
                }
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    int intValue = (treeSet == null || treeSet.isEmpty()) ? -1 : ((Integer) treeSet.first()).intValue();
                    ArrayList h02 = m0.h0(wallettransaction);
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
                            m0.D(identityHashMap, hashMap, intValue, wallettransaction2, false);
                            arrayList2.set(intValue, wallettransaction);
                            m0.D(identityHashMap, hashMap, intValue, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        m0.D(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override // org.telegram.ui.Components.v61
    public final void F(View view, float f10) {
        view.setTranslationX(f10);
        if (getMeasuredWidth() <= 0) {
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        view.setTranslationX(f10 - ((2.0f * i7) * this.d0.left));
        view.setPivotX(i7 > 0.0f ? 0.0f : view.getMeasuredWidth());
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i7));
        view.setRotationY(10.0f * i7);
        v6 v6Var = (v6) view.findViewWithTag(v6.class);
        if (v6Var != null) {
            boolean z9 = this.V;
            long nanoTime = System.nanoTime();
            if (!v6Var.S) {
                v6Var.S = true;
                v6Var.N = i7;
                v6Var.R = nanoTime;
                return;
            }
            float f11 = i7 - v6Var.N;
            v6Var.N = i7;
            if (!z9) {
                v6Var.Q = 0.0f;
                v6Var.R = nanoTime;
            } else if (f11 != 0.0f) {
                float max = Math.max(0.008333334f, Math.min(0.033333335f, (nanoTime - v6Var.R) / 1.0E9f));
                v6Var.R = nanoTime;
                float f12 = f11 / max;
                float L = (-(f12 - v6Var.Q)) * org.telegram.messenger.g0.L(140.0f);
                v6Var.Q = f12;
                if (v6Var.O == null) {
                    r1.g gVar = new r1.g(v6Var, r1.g.o);
                    v6Var.O = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.32f);
                    hVar.b(300.0f);
                    gVar.m = hVar;
                    v6Var.O.b(new p6(v6Var, 1));
                }
                float z10 = org.telegram.messenger.camera.q.z(v6Var.P, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                v6Var.P = z10;
                r1.g gVar2 = v6Var.O;
                gVar2.a = z10;
                gVar2.c(0.0f);
            }
            if (f11 == 0.0f) {
                return;
            }
            v6Var.U = Math.max(-720.0f, Math.min(720.0f, v6Var.U - (f11 * 300.0f)));
            if (v6Var.W || !v6Var.n) {
                return;
            }
            v6Var.W = true;
            v6Var.V = 0L;
            Choreographer.getInstance().postFrameCallback(v6Var.a0);
        }
    }

    public final void L() {
        if (this.b >= this.a0.size() - 2) {
            l0 l0Var = this.b0;
            if (l0Var.h) {
                return;
            }
            l0Var.h();
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

    @Override // org.telegram.ui.Components.v61
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.d0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.c0).c(this.W, qs.b4);
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.c0).n(this.W, qs.b4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = getViewPages()[0];
        if (view != null) {
            view.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            View view2 = getViewPages()[1];
            if (view2 != null && view2.getVisibility() == 0 && getMeasuredWidth() > 0) {
                view2.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = org.telegram.messenger.g0.W1(Utilities.i(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f), measuredHeight, view2.getMeasuredHeight());
            }
            i10 = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.v61
    public final void t(View view, View view2, int i7, int i10) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        L();
        cc ccVar = cc.w;
        if (ccVar != null) {
            ccVar.c(0L, false);
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        requestLayout();
        View view = this.e0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
