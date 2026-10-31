package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class du0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final kg.h d;
    public final ls0 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = premiumPreviewFragment.g0;
        int i11 = i10 == 1 ? org.telegram.messenger.zs.F2 : org.telegram.messenger.zs.U2;
        addView(frameLayout, w7.b6.r(i11, i11, 1));
        kg.h hVar = new kg.h(this, context, premiumPreviewFragment.h0 ? 1 : 0, i10 == 1 ? 1 : 0, context);
        this.d = hVar;
        frameLayout.addView(hVar, w7.b6.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        addView(textView, w7.b6.q(-2, -2, 0.0f, 1, 16, i10 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, w7.b6.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        ls0 ls0Var = new ls0(this, context);
        this.e = ls0Var;
        ls0Var.setOverScrollMode(2);
        ls0Var.setLayoutManager(new s4.a0());
        ls0Var.setAdapter(new cu0(this, context));
        ls0Var.setOnItemClickListener(new g(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        ls0Var.setSelectorTransformer(new q0.a() { // from class: org.telegram.ui.zt0
            @Override // q0.a
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                ls0 ls0Var2 = du0.this.e;
                View pressedChildView = ls0Var2.getPressedChildView();
                int b10 = pressedChildView == null ? -1 : ls0Var2.T(pressedChildView).b();
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = ls0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.i0.L(12.0f));
                }
                if (b10 == ls0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.i0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(ls0Var, w7.b6.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c0, code lost:
    
        if (j$.util.Objects.equals(r5, (r7 == null || (r7 = r7.transaction) == null) ? null : r7.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1")) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00cc, code lost:
    
        r2.clear();
        r1.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ca, code lost:
    
        if (r5.a.months == 12) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j10;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        arrayList.clear();
        premiumPreviewFragment.e = -1;
        premiumPreviewFragment.f = null;
        if (premiumPreviewFragment.getMediaDataController().D != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().D.period_options;
            int size = arrayList2.size();
            int i10 = 0;
            j10 = 0;
            while (i10 < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i10);
                i10++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (premiumPreviewFragment.getUserConfig().q() && !tL_premiumSubscriptionOption2.can_purchase_upgrade && !tL_premiumSubscriptionOption2.current) {
                }
                fu0 fu0Var = new fu0(tL_premiumSubscriptionOption2);
                arrayList.add(fu0Var);
                if (premiumPreviewFragment.j0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = fu0Var;
                }
                if (org.telegram.messenger.v2.b() && fu0Var.i() > j10) {
                    j10 = fu0Var.i();
                }
            }
        } else {
            j10 = 0;
        }
        if (org.telegram.messenger.v2.b() && premiumPreviewFragment.getUserConfig().q()) {
            arrayList.clear();
            premiumPreviewFragment.f = null;
        } else {
            if (!org.telegram.messenger.v2.b() && premiumPreviewFragment.f != null) {
                String str = org.telegram.messenger.u1.i().e;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f.a;
            }
            fu0 fu0Var2 = premiumPreviewFragment.f;
            if (fu0Var2 != null) {
            }
        }
        if (org.telegram.messenger.v2.b()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((fu0) obj).e = j10;
            }
        } else if (org.telegram.messenger.u1.i().k() && org.telegram.messenger.u1.l != null) {
            int size3 = arrayList.size();
            boolean z10 = false;
            int i12 = 0;
            long j11 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                fu0 fu0Var3 = (fu0) obj2;
                fu0Var3.f = org.telegram.messenger.u1.l;
                if (fu0Var3.i() > j11) {
                    j11 = fu0Var3.i();
                }
                fu0Var3.a();
                if (fu0Var3.g != null) {
                    z10 = true;
                }
            }
            if (z10) {
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    fu0 fu0Var4 = (fu0) arrayList.get(i13);
                    fu0Var4.a();
                    if (fu0Var4.g == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int size4 = arrayList.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj3 = arrayList.get(i14);
                i14++;
                ((fu0) obj3).e = j11;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    break;
                }
                if (((fu0) arrayList.get(i15)).a.months == 12) {
                    premiumPreviewFragment.e = i15;
                    break;
                }
                i15++;
            }
            if (premiumPreviewFragment.e == -1) {
                premiumPreviewFragment.e = 0;
            }
        }
        premiumPreviewFragment.x0(false);
        this.e.getAdapter().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        boolean z11;
        ls0 ls0Var;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        int i10 = premiumPreviewFragment.g0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (i10 == 0) {
            textView.setText(org.telegram.messenger.cd.L0(premiumPreviewFragment.p0 ? 2131744253 : 2131744256, null));
            textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.p0) ? 2131744254 : 2131744252, null)));
        } else if (i10 == 1) {
            textView.setText(org.telegram.messenger.cd.L0(premiumPreviewFragment.p0 ? 2131744253 : 2131744277, null));
            textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.p0) ? 2131744275 : 2131744272, null)));
        }
        textView2.getLayoutParams().width = Math.min(org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(42.0f), vh.p2.a(textView2.getText(), textView2.getPaint()));
        if (!premiumPreviewFragment.p0) {
            boolean z12 = org.telegram.messenger.v2.a;
            if (premiumPreviewFragment.d.size() > 1) {
                z10 = false;
                z11 = this.f;
                ls0Var = this.e;
                if (z11 || !z10) {
                    ls0Var.setVisibility(z10 ? 8 : 0);
                    this.f = true;
                } else if (ls0Var.getVisibility() == 0 && z10 && this.h == z10) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    duration.addUpdateListener(new au0(r2, ls0Var, this, duration));
                    duration.addListener(new org.telegram.ui.Components.iw0(7, (Object) this, (Object) ls0Var));
                    duration.setInterpolator(org.telegram.ui.Components.gr.f);
                    duration.start();
                }
                this.h = !z10;
            }
        }
        z10 = true;
        z11 = this.f;
        ls0Var = this.e;
        if (z11) {
        }
        ls0Var.setVisibility(z10 ? 8 : 0);
        this.f = true;
        this.h = !z10;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
