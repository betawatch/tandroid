package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class py extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final FrameLayout[] b;
    public final org.telegram.ui.Components.g9[] c;
    public final FrameLayout[] d;
    public final FrameLayout[] e;
    public final float[] f;
    public final int[] h;
    public org.telegram.messenger.q20 n;
    public org.telegram.ui.Components.a51 r;
    public int s;
    public ValueAnimator w;
    public int x;
    public static final int[] y = {R.raw.topics_tabs, R.raw.topics_list, R.raw.topics_sidebar};
    public static final int[] D = {2131744010, 2131744011, 2131744007};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public py(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = 3;
        this.b = new FrameLayout[3];
        this.c = new org.telegram.ui.Components.g9[3];
        this.d = new FrameLayout[3];
        this.e = new FrameLayout[3];
        this.f = new float[3];
        this.h = new int[3];
        int i11 = -1;
        this.s = -1;
        this.a = p6Var;
        ?? r52 = 0;
        setOrientation(0);
        setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        setClipChildren(false);
        int i12 = 0;
        while (i12 < i10) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r52);
            w7.e6.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new bh.f(this, i12, 18));
            addView(frameLayout, w7.b6.p(r52, i11, 1.0f, org.telegram.messenger.zs.E1));
            this.b[i12] = frameLayout;
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9Var.setImageDrawable(new org.telegram.ui.Components.bi0(y[i12], org.telegram.messenger.i0.L(160.0f), org.telegram.messenger.i0.L(160.0f)));
            frameLayout.addView(g9Var, w7.b6.d(org.telegram.messenger.zs.q2, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.c[i12] = g9Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b10 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.z6, true, null);
            int[] iArr = D;
            b10.setText(org.telegram.messenger.cd.L0(iArr[i12], null));
            b10.setSingleLine();
            b10.setPadding(org.telegram.messenger.i0.L(10.0f), r52, org.telegram.messenger.i0.L(10.0f), r52);
            frameLayout2.addView(b10, w7.b6.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(org.telegram.messenger.i0.L(10.0f), r52, org.telegram.messenger.i0.L(10.0f), r52);
            int L = org.telegram.messenger.i0.L(13.0f);
            int i13 = org.telegram.ui.ActionBar.t6.Ci;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(frameLayout3, d02, N, null, p6Var);
            frameLayout2.addView(frameLayout3, w7.b6.e(-2, 26, 17));
            TextView b11 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.g6, true, null);
            b11.setText(org.telegram.messenger.cd.L0(iArr[i12], null));
            b11.setSingleLine();
            frameLayout3.addView(b11, w7.b6.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, w7.b6.e(-2, 26, 49));
            this.d[i12] = frameLayout2;
            this.e[i12] = frameLayout3;
            i12++;
            i10 = 3;
            i11 = -1;
            r52 = 0;
        }
        boolean z10 = r52;
        b(z10 ? 1 : 0, z10);
    }

    public final void a() {
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = org.telegram.ui.ActionBar.t6.C6;
            org.telegram.ui.ActionBar.p6 p6Var = this.a;
            int f7 = i0.b.f(this.f[i10], org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
            int[] iArr = this.h;
            if (f7 != iArr[i10]) {
                iArr[i10] = f7;
                org.telegram.ui.Components.g9[] g9VarArr = this.c;
                g9VarArr[i10].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
                g9VarArr[i10].invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.C6));
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [float[], java.io.Serializable] */
    public final void b(int i10, boolean z10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w = null;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= 3) {
                break;
            }
            float f7 = i11 != i10 ? 0.0f : 1.0f;
            FrameLayout[] frameLayoutArr = this.e;
            if (z10) {
                org.telegram.messenger.z20.m(frameLayoutArr[i11].animate().scaleX(f7).scaleY(f7).alpha(f7), org.telegram.ui.Components.gr.h, 320L);
            } else {
                frameLayoutArr[i11].animate().cancel();
                frameLayoutArr[i11].setScaleX(f7);
                frameLayoutArr[i11].setScaleY(f7);
                frameLayoutArr[i11].setAlpha(f7);
            }
            i11++;
        }
        float[] fArr = this.f;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new jg.p(this, (float[]) fArr.clone(), i10, 2));
            this.w.addListener(new org.telegram.ui.Components.voip.h2(this, 9));
            this.w.setInterpolator(org.telegram.ui.Components.gr.h);
            this.w.setDuration(320L);
            this.w.start();
        } else {
            int i12 = 0;
            while (i12 < 3) {
                fArr[i12] = i12 == i10 ? 1.0f : 0.0f;
                i12++;
            }
            a();
        }
        org.telegram.ui.Components.bi0 B = this.c[i10].getImageReceiver().B();
        if (B != null) {
            if (B.t() > 0.8f) {
                B.T(false, 0.0f);
            }
            B.H(true);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int max = Math.max(org.telegram.messenger.i0.L(48.0f), Math.min(org.telegram.messenger.i0.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - org.telegram.messenger.i0.L(8.0f)) / 0.61f)));
        if (max != this.x) {
            this.x = max;
            for (int i12 = 0; i12 < 3; i12++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c[i12].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i12].getLayoutParams()).topMargin = org.telegram.messenger.i0.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(66.0f) + max, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
