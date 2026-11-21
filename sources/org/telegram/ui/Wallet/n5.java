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
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class n5 extends j71 {
    public boolean W;
    public final m5 a0;
    public final /* synthetic */ ArrayList b0;
    public final /* synthetic */ t0 c0;
    public final /* synthetic */ int d0;
    public final /* synthetic */ Rect e0;
    public final /* synthetic */ View[] f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Wallet.m5] */
    public n5(Context context, org.telegram.ui.ActionBar.h6 h6Var, final ArrayList arrayList, final t0 t0Var, int i7, Rect rect, View[] viewArr) {
        super(context, h6Var);
        this.b0 = arrayList;
        this.c0 = t0Var;
        this.d0 = i7;
        this.e0 = rect;
        this.f0 = viewArr;
        this.a0 = new fs() { // from class: org.telegram.ui.Wallet.m5
            @Override // org.telegram.messenger.fs
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = t0Var.c;
                u0[] u0VarArr = u0.R;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    u0.J(identityHashMap, hashMap, i12, (TL_wallet.walletTransaction) arrayList2.get(i12), true);
                }
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    int intValue = (treeSet == null || treeSet.isEmpty()) ? -1 : ((Integer) treeSet.first()).intValue();
                    ArrayList s02 = u0.s0(wallettransaction);
                    int size2 = s02.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = s02.get(i14);
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
                            u0.J(identityHashMap, hashMap, intValue, wallettransaction2, false);
                            arrayList2.set(intValue, wallettransaction);
                            u0.J(identityHashMap, hashMap, intValue, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        u0.J(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override // org.telegram.ui.Components.j71
    public final void B(View view, float f10) {
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
        m7 m7Var = (m7) view.findViewWithTag(m7.class);
        if (m7Var != null) {
            boolean z10 = this.W;
            long nanoTime = System.nanoTime();
            if (!m7Var.T) {
                m7Var.T = true;
                m7Var.O = i7;
                m7Var.S = nanoTime;
                return;
            }
            float f11 = i7 - m7Var.O;
            m7Var.O = i7;
            if (!z10) {
                m7Var.R = 0.0f;
                m7Var.S = nanoTime;
            } else if (f11 != 0.0f) {
                float C = a8.p0.C(nanoTime - m7Var.S, 1.0E9f, 0.033333335f, 0.008333334f);
                m7Var.S = nanoTime;
                float f12 = f11 / C;
                float L = (-(f12 - m7Var.R)) * org.telegram.messenger.g0.L(140.0f);
                m7Var.R = f12;
                if (m7Var.P == null) {
                    r1.g gVar = new r1.g(m7Var, r1.g.o);
                    m7Var.P = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.32f);
                    hVar.b(300.0f);
                    gVar.m = hVar;
                    m7Var.P.b(new g7(m7Var, 1));
                }
                float A = n10.A(m7Var.Q, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                m7Var.Q = A;
                r1.g gVar2 = m7Var.P;
                gVar2.a = A;
                gVar2.c(0.0f);
            }
            if (f11 == 0.0f) {
                return;
            }
            m7Var.V = Math.max(-720.0f, Math.min(720.0f, m7Var.V - (f11 * 300.0f)));
            if (m7Var.a0 || !m7Var.n) {
                return;
            }
            m7Var.a0 = true;
            m7Var.W = 0L;
            Choreographer.getInstance().postFrameCallback(m7Var.b0);
        }
    }

    public final void H() {
        if (this.b >= this.b0.size() - 2) {
            t0 t0Var = this.c0;
            if (t0Var.k || t0Var.h) {
                return;
            }
            t0Var.h();
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

    @Override // org.telegram.ui.Components.j71
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.e0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.d0).c(this.a0, ks.e4);
        H();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.d0).n(this.a0, ks.e4);
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

    @Override // org.telegram.ui.Components.j71
    public final void p(View view, View view2, int i7, int i10) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        H();
        gc gcVar = gc.w;
        if (gcVar != null) {
            gcVar.c(0L, false);
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void s(boolean z10) {
        requestLayout();
        View view = this.f0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
