// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hnc extends wgc {
    public boolean W;
    public final gnc a0;
    public final /* synthetic */ ArrayList b0;
    public final /* synthetic */ b c0;
    public final /* synthetic */ int d0;
    public final /* synthetic */ Rect e0;
    public final /* synthetic */ View[] f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [gnc] */
    public hnc(Context context, ylb ylbVar, final ArrayList arrayList, final b bVar, int i, Rect rect, View[] viewArr) {
        super(context, ylbVar);
        this.b0 = arrayList;
        this.c0 = bVar;
        this.d0 = i;
        this.e0 = rect;
        this.f0 = viewArr;
        this.a0 = new jm7() { // from class: gnc
            @Override // jm7
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = bVar.c;
                c[] cVarArr = c.R;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    c.I(identityHashMap, hashMap, i4, (TL_wallet.walletTransaction) arrayList2.get(i4), true);
                }
                int size = arrayList3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList3.get(i5);
                    i5++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    int intValue = (treeSet == null || treeSet.isEmpty()) ? -1 : ((Integer) treeSet.first()).intValue();
                    ArrayList s0 = c.s0(wallettransaction);
                    int size2 = s0.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = s0.get(i6);
                        i6++;
                        TreeSet treeSet2 = (TreeSet) hashMap.get((String) obj2);
                        if (treeSet2 != null && !treeSet2.isEmpty()) {
                            int intValue2 = ((Integer) treeSet2.first()).intValue();
                            intValue = intValue < 0 ? intValue2 : Math.min(intValue, intValue2);
                        }
                    }
                    if (intValue >= 0) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList2.get(intValue);
                        if (wallettransaction2 != wallettransaction) {
                            c.I(identityHashMap, hashMap, intValue, wallettransaction2, false);
                            arrayList2.set(intValue, wallettransaction);
                            c.I(identityHashMap, hashMap, intValue, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        c.I(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override // wgc
    public final void F(View view, float f) {
        view.setTranslationX(f);
        if (getMeasuredWidth() > 0) {
            float i = Utilities.i(f / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f - ((2.0f * i) * this.e0.left));
            view.setPivotX(i > 0.0f ? 0.0f : view.getMeasuredWidth());
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * i));
            view.setRotationY(10.0f * i);
            npc npcVar = (npc) view.findViewWithTag(npc.class);
            if (npcVar != null) {
                boolean z = this.W;
                long nanoTime = System.nanoTime();
                if (!npcVar.T) {
                    npcVar.T = true;
                    npcVar.O = i;
                    npcVar.S = nanoTime;
                    return;
                }
                float f2 = i - npcVar.O;
                npcVar.O = i;
                if (!z) {
                    npcVar.R = 0.0f;
                    npcVar.S = nanoTime;
                } else if (f2 != 0.0f) {
                    float x = kt6.x(nanoTime - npcVar.S, 1.0E9f, 0.033333335f, 0.008333334f);
                    npcVar.S = nanoTime;
                    float f3 = f2 / x;
                    float L = (-(f3 - npcVar.R)) * gm.L(140.0f);
                    npcVar.R = f3;
                    if (npcVar.P == null) {
                        zna znaVar = new zna(npcVar, zna.o);
                        npcVar.P = znaVar;
                        aoa aoaVar = new aoa(0.0f);
                        aoaVar.a(0.32f);
                        aoaVar.b(300.0f);
                        znaVar.m = aoaVar;
                        npcVar.P.b(new hpc(npcVar, (byte) 1));
                    }
                    float f4 = mlb.f(npcVar.Q, L, gm.L(1600.0f), -gm.L(1600.0f));
                    npcVar.Q = f4;
                    zna znaVar2 = npcVar.P;
                    znaVar2.a = f4;
                    znaVar2.c(0.0f);
                }
                if (f2 != 0.0f) {
                    npcVar.V = Math.max(-720.0f, Math.min(720.0f, npcVar.V - (f2 * 300.0f)));
                    if (npcVar.a0 || !npcVar.n) {
                        return;
                    }
                    npcVar.a0 = true;
                    npcVar.W = 0L;
                    Choreographer.getInstance().postFrameCallback(npcVar.b0);
                }
            }
        }
    }

    public final void L() {
        if (this.b >= this.b0.size() - 2) {
            b bVar = this.c0;
            if (bVar.k || bVar.h) {
                return;
            }
            bVar.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.e0;
        canvas.clipRect(rect.left, -getHeight(), getWidth() - rect.right, getHeight() << 1);
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

    @Override // wgc
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.e0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.d0).b(this.a0, nm7.f4);
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.d0).n(this.a0, nm7.f4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = getViewPages()[0];
        if (view != null) {
            view.measure(i, 0);
            int measuredHeight = view.getMeasuredHeight();
            View view2 = getViewPages()[1];
            if (view2 != null && view2.getVisibility() == 0 && getMeasuredWidth() > 0) {
                view2.measure(i, 0);
                measuredHeight = gm.U1(Utilities.i(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f), measuredHeight, view2.getMeasuredHeight());
            }
            i2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }

    @Override // wgc
    public final void s(View view, View view2, int i, int i2) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        L();
        u31 u31Var = u31.x;
        if (u31Var != null) {
            u31Var.c(0L, false);
        }
    }

    @Override // wgc
    public final void w(boolean z) {
        requestLayout();
        View view = this.f0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
