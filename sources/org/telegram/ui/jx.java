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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jx extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final FrameLayout[] b;
    public final org.telegram.ui.Components.k9[] c;
    public final FrameLayout[] d;
    public final FrameLayout[] e;
    public final float[] f;
    public final int[] h;
    public org.telegram.messenger.u10 n;
    public org.telegram.ui.Components.r31 r;
    public int s;
    public ValueAnimator w;
    public int x;
    public static final int[] y = {R.raw.topics_tabs, R.raw.topics_list, R.raw.topics_sidebar};
    public static final int[] E = {2131743995, 2131743996, 2131743992};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public jx(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = 3;
        this.b = new FrameLayout[3];
        this.c = new org.telegram.ui.Components.k9[3];
        this.d = new FrameLayout[3];
        this.e = new FrameLayout[3];
        this.f = new float[3];
        this.h = new int[3];
        int i10 = -1;
        this.s = -1;
        this.a = e6Var;
        ?? r5 = 0;
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        setClipChildren(false);
        int i11 = 0;
        while (i11 < i3) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(r5);
            b8.pf.b(frameLayout, 0.05f, 1.25f);
            frameLayout.setOnClickListener(new bi.q(this, i11, 23));
            addView(frameLayout, b8.mf.p(r5, i10, 1.0f, org.telegram.messenger.hs.E1));
            this.b[i11] = frameLayout;
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setImageDrawable(new org.telegram.ui.Components.ch0(y[i11], org.telegram.messenger.g0.L(160.0f), org.telegram.messenger.g0.L(160.0f)));
            frameLayout.addView(k9Var, b8.mf.d(org.telegram.messenger.hs.q2, 160.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
            this.c[i11] = k9Var;
            FrameLayout frameLayout2 = new FrameLayout(context);
            TextView b10 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.z6, true, null);
            int[] iArr = E;
            b10.setText(org.telegram.messenger.bd.M0(iArr[i11], null));
            b10.setSingleLine();
            b10.setPadding(org.telegram.messenger.g0.L(10.0f), r5, org.telegram.messenger.g0.L(10.0f), r5);
            frameLayout2.addView(b10, b8.mf.e(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(org.telegram.messenger.g0.L(10.0f), r5, org.telegram.messenger.g0.L(10.0f), r5);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i12 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, d02, N, null, e6Var);
            frameLayout2.addView(frameLayout3, b8.mf.e(-2, 26, 17));
            TextView b11 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.g6, true, null);
            b11.setText(org.telegram.messenger.bd.M0(iArr[i11], null));
            b11.setSingleLine();
            frameLayout3.addView(b11, b8.mf.e(-2, -2, 17));
            frameLayout.addView(frameLayout2, b8.mf.e(-2, 26, 49));
            this.d[i11] = frameLayout2;
            this.e[i11] = frameLayout3;
            i11++;
            i3 = 3;
            i10 = -1;
            r5 = 0;
        }
        boolean z10 = r5;
        b(z10 ? 1 : 0, z10);
    }

    public final void a() {
        for (int i3 = 0; i3 < 3; i3++) {
            int i10 = org.telegram.ui.ActionBar.k6.C6;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            int f10 = i0.a.f(this.f[i3], org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
            int[] iArr = this.h;
            if (f10 != iArr[i3]) {
                iArr[i3] = f10;
                org.telegram.ui.Components.k9[] k9VarArr = this.c;
                k9VarArr[i3].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                k9VarArr[i3].invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C6));
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [float[], java.io.Serializable] */
    public final void b(int i3, boolean z10) {
        if (this.s == i3) {
            return;
        }
        this.s = i3;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w = null;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            float f10 = i10 != i3 ? 0.0f : 1.0f;
            FrameLayout[] frameLayoutArr = this.e;
            if (z10) {
                org.telegram.messenger.camera.q.l(frameLayoutArr[i10].animate().scaleX(f10).scaleY(f10).alpha(f10), org.telegram.ui.Components.xq.h, 320L);
            } else {
                frameLayoutArr[i10].animate().cancel();
                frameLayoutArr[i10].setScaleX(f10);
                frameLayoutArr[i10].setScaleY(f10);
                frameLayoutArr[i10].setAlpha(f10);
            }
            i10++;
        }
        float[] fArr = this.f;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new gi.b4(this, (float[]) fArr.clone(), i3, 2));
            this.w.addListener(new org.telegram.ui.Cells.w9(this, 28));
            this.w.setInterpolator(org.telegram.ui.Components.xq.h);
            this.w.setDuration(320L);
            this.w.start();
        } else {
            int i11 = 0;
            while (i11 < 3) {
                fArr[i11] = i11 == i3 ? 1.0f : 0.0f;
                i11++;
            }
            a();
        }
        org.telegram.ui.Components.ch0 B = this.c[i3].getImageReceiver().B();
        if (B != null) {
            if (B.t() > 0.8f) {
                B.T(false, 0.0f);
            }
            B.H(true);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), Math.min(org.telegram.messenger.g0.L(160.0f), (int) (((((size - getPaddingLeft()) - getPaddingRight()) / 3) - org.telegram.messenger.g0.L(8.0f)) / 0.61f)));
        if (max != this.x) {
            this.x = max;
            for (int i11 = 0; i11 < 3; i11++) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c[i11].getLayoutParams();
                layoutParams.height = max;
                layoutParams.width = max;
                ((FrameLayout.LayoutParams) this.d[i11].getLayoutParams()).topMargin = org.telegram.messenger.g0.L(22.0f) + max;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(66.0f) + max, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            a();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
