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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ks0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final ci.ic d;
    public final rq0 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i3 = premiumPreviewFragment.h0;
        int i10 = i3 == 1 ? org.telegram.messenger.hs.F2 : org.telegram.messenger.hs.U2;
        addView(frameLayout, b8.mf.r(i10, i10, 1));
        ci.ic icVar = new ci.ic(this, context, premiumPreviewFragment.i0 ? 1 : 0, i3 == 1 ? 1 : 0, context);
        this.d = icVar;
        frameLayout.addView(icVar, b8.mf.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        addView(textView, b8.mf.q(-2, -2, 0.0f, 1, 16, i3 == 1 ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, b8.mf.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        rq0 rq0Var = new rq0(this, context);
        this.e = rq0Var;
        rq0Var.setOverScrollMode(2);
        rq0Var.setLayoutManager(new u4.b0());
        rq0Var.setAdapter(new js0(this, context));
        rq0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        rq0Var.setSelectorTransformer(new q0.a() { // from class: org.telegram.ui.gs0
            @Override // q0.a
            public final void accept(Object obj) {
                Canvas canvas = (Canvas) obj;
                rq0 rq0Var2 = ks0.this.e;
                View pressedChildView = rq0Var2.getPressedChildView();
                int b10 = pressedChildView == null ? -1 : rq0Var2.T(pressedChildView).b();
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = rq0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.g0.L(12.0f));
                }
                if (b10 == rq0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.g0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(rq0Var, b8.mf.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
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
        if (premiumPreviewFragment.getMediaDataController().E != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().E.period_options;
            int size = arrayList2.size();
            int i3 = 0;
            j10 = 0;
            while (i3 < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i3);
                i3++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (premiumPreviewFragment.getUserConfig().q() && !tL_premiumSubscriptionOption2.can_purchase_upgrade && !tL_premiumSubscriptionOption2.current) {
                }
                ms0 ms0Var = new ms0(tL_premiumSubscriptionOption2);
                arrayList.add(ms0Var);
                if (premiumPreviewFragment.k0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = ms0Var;
                }
                if (org.telegram.messenger.r2.b() && ms0Var.i() > j10) {
                    j10 = ms0Var.i();
                }
            }
        } else {
            j10 = 0;
        }
        if (org.telegram.messenger.r2.b() && premiumPreviewFragment.getUserConfig().q()) {
            arrayList.clear();
            premiumPreviewFragment.f = null;
        } else {
            if (!org.telegram.messenger.r2.b() && premiumPreviewFragment.f != null) {
                String str = org.telegram.messenger.r1.i().e;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f.a;
            }
            ms0 ms0Var2 = premiumPreviewFragment.f;
            if (ms0Var2 != null) {
            }
        }
        if (org.telegram.messenger.r2.b()) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList.get(i10);
                i10++;
                ((ms0) obj).e = j10;
            }
        } else if (org.telegram.messenger.r1.i().k() && org.telegram.messenger.r1.l != null) {
            int size3 = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            long j11 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                ms0 ms0Var3 = (ms0) obj2;
                ms0Var3.f = org.telegram.messenger.r1.l;
                if (ms0Var3.i() > j11) {
                    j11 = ms0Var3.i();
                }
                ms0Var3.a();
                if (ms0Var3.g != null) {
                    z10 = true;
                }
            }
            if (z10) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    ms0 ms0Var4 = (ms0) arrayList.get(i12);
                    ms0Var4.a();
                    if (ms0Var4.g == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            int size4 = arrayList.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj3 = arrayList.get(i13);
                i13++;
                ((ms0) obj3).e = j11;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                if (((ms0) arrayList.get(i14)).a.months == 12) {
                    premiumPreviewFragment.e = i14;
                    break;
                }
                i14++;
            }
            if (premiumPreviewFragment.e == -1) {
                premiumPreviewFragment.e = 0;
            }
        }
        premiumPreviewFragment.y0(false);
        this.e.getAdapter().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        boolean z11;
        rq0 rq0Var;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        int i3 = premiumPreviewFragment.h0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (i3 == 0) {
            textView.setText(org.telegram.messenger.bd.M0(premiumPreviewFragment.q0 ? 2131744238 : 2131744241, null));
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.q0) ? 2131744239 : 2131744237, null)));
        } else if (i3 == 1) {
            textView.setText(org.telegram.messenger.bd.M0(premiumPreviewFragment.q0 ? 2131744238 : 2131744262, null));
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0((premiumPreviewFragment.getUserConfig().q() || premiumPreviewFragment.q0) ? 2131744260 : 2131744257, null)));
        }
        textView2.getLayoutParams().width = Math.min(org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(42.0f), gi.l3.a(textView2.getText(), textView2.getPaint()));
        if (!premiumPreviewFragment.q0) {
            boolean z12 = org.telegram.messenger.r2.a;
            if (premiumPreviewFragment.d.size() > 1) {
                z10 = false;
                z11 = this.f;
                rq0Var = this.e;
                if (z11 || !z10) {
                    rq0Var.setVisibility(z10 ? 8 : 0);
                    this.f = true;
                } else if (rq0Var.getVisibility() == 0 && z10 && this.h == z10) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    duration.addUpdateListener(new hs0(r2, rq0Var, this, duration));
                    duration.addListener(new org.telegram.ui.Components.ri0(11, this, rq0Var));
                    duration.setInterpolator(org.telegram.ui.Components.xq.f);
                    duration.start();
                }
                this.h = !z10;
            }
        }
        z10 = true;
        z11 = this.f;
        rq0Var = this.e;
        if (z11) {
        }
        rq0Var.setVisibility(z10 ? 8 : 0);
        this.f = true;
        this.h = !z10;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
