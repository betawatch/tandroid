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
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class y4 extends w61 {
    public boolean W;
    public final x4 a0;
    public final /* synthetic */ ArrayList b0;
    public final /* synthetic */ k0 c0;
    public final /* synthetic */ int d0;
    public final /* synthetic */ Rect e0;
    public final /* synthetic */ View[] f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.x4] */
    public y4(Context context, org.telegram.ui.ActionBar.e6 e6Var, final ArrayList arrayList, final k0 k0Var, int i7, Rect rect, View[] viewArr) {
        super(context, e6Var);
        this.b0 = arrayList;
        this.c0 = k0Var;
        this.d0 = i7;
        this.e0 = rect;
        this.f0 = viewArr;
        this.a0 = new is() { // from class: org.telegram.ui.Wallet.x4
            @Override // org.telegram.messenger.is
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = k0Var.c;
                l0[] l0VarArr = l0.O;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    l0.D(identityHashMap, hashMap, i12, (TL_wallet.walletTransaction) arrayList2.get(i12), true);
                }
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    int intValue = (treeSet == null || treeSet.isEmpty()) ? -1 : ((Integer) treeSet.first()).intValue();
                    ArrayList h02 = l0.h0(wallettransaction);
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
                            l0.D(identityHashMap, hashMap, intValue, wallettransaction2, false);
                            arrayList2.set(intValue, wallettransaction);
                            l0.D(identityHashMap, hashMap, intValue, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        l0.D(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override // org.telegram.ui.Components.w61
    public final void D(View view, float f10) {
        view.setTranslationX(f10);
        if (getMeasuredWidth() <= 0) {
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        view.setTranslationX(f10 - ((2.0f * i7) * this.e0.left));
        view.setPivotX(i7 > 0.0f ? 0.0f : view.getMeasuredWidth());
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i7));
        view.setRotationY(10.0f * i7);
        w6 w6Var = (w6) view.findViewWithTag(w6.class);
        if (w6Var != null) {
            boolean z10 = this.W;
            long nanoTime = System.nanoTime();
            if (!w6Var.T) {
                w6Var.T = true;
                w6Var.O = i7;
                w6Var.S = nanoTime;
                return;
            }
            float f11 = i7 - w6Var.O;
            w6Var.O = i7;
            if (!z10) {
                w6Var.R = 0.0f;
                w6Var.S = nanoTime;
            } else if (f11 != 0.0f) {
                float C = a8.p0.C(nanoTime - w6Var.S, 1.0E9f, 0.033333335f, 0.008333334f);
                w6Var.S = nanoTime;
                float f12 = f11 / C;
                float L = (-(f12 - w6Var.R)) * org.telegram.messenger.g0.L(140.0f);
                w6Var.R = f12;
                if (w6Var.P == null) {
                    r1.g gVar = new r1.g(w6Var, r1.g.o);
                    w6Var.P = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.32f);
                    hVar.b(300.0f);
                    gVar.m = hVar;
                    w6Var.P.b(new q6(w6Var, 1));
                }
                float z11 = i20.z(w6Var.Q, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                w6Var.Q = z11;
                r1.g gVar2 = w6Var.P;
                gVar2.a = z11;
                gVar2.c(0.0f);
            }
            if (f11 == 0.0f) {
                return;
            }
            w6Var.V = Math.max(-720.0f, Math.min(720.0f, w6Var.V - (f11 * 300.0f)));
            if (w6Var.a0 || !w6Var.n) {
                return;
            }
            w6Var.a0 = true;
            w6Var.W = 0L;
            Choreographer.getInstance().postFrameCallback(w6Var.b0);
        }
    }

    public final void J() {
        if (this.b >= this.b0.size() - 2) {
            k0 k0Var = this.c0;
            if (k0Var.h) {
                return;
            }
            k0Var.h();
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

    @Override // org.telegram.ui.Components.w61
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.e0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.d0).c(this.a0, ns.b4);
        J();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.d0).n(this.a0, ns.b4);
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

    @Override // org.telegram.ui.Components.w61
    public final void q(View view, View view2, int i7, int i10) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        J();
        xb xbVar = xb.w;
        if (xbVar != null) {
            xbVar.c(0L, false);
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
        requestLayout();
        View view = this.f0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
