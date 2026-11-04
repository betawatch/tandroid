package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d21 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.k2 b;
    public final org.telegram.ui.s51 c;
    public final TextView d;
    public final b21 e;
    public final View f;
    public final View h;
    public final /* synthetic */ f21 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(f21 f21Var, Context context) {
        super(context);
        this.n = f21Var;
        View view = new View(context);
        this.f = view;
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.e6 e6Var = f21Var.J0;
        String str = f21Var.r1;
        org.telegram.ui.ActionBar.r6.i(i3, view, e6Var);
        addView(view, b8.mf.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.e6 e6Var2 = f21Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var2, mode);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        final int i12 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, f21Var.J0), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.e6 e6Var3 = f21Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a21
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i14 = i13;
                d21 d21Var = this.b;
                switch (i14) {
                    case 0:
                        d21Var.n.dismiss();
                        break;
                    default:
                        b21 b21Var = d21Var.e;
                        c21 c21Var = new c21(d21Var.getContext(), null);
                        Drawable mutate = d21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        f21 f21Var2 = d21Var.n;
                        org.telegram.ui.ActionBar.r6.y(d21Var, mutate, i15, f21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        c21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.x00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.bd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) arrayList.get(i16);
                            if (ycVar == null || (((str2 = ycVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(ycVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.f00(org.telegram.messenger.bd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) arrayList.get(i17);
                            if (!ycVar2.f.equals(f21Var2.r1) && "remote".equals(ycVar2.d)) {
                                TextUtils.equals(f21Var2.s1, ycVar2.f);
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, d21Var.getContext(), f21Var2.J0, z10, i17 == arrayList.size() - 1);
                                y0Var.setText(f21.K0(f21.O0(ycVar2.f, null, null)));
                                y0Var.setChecked(TextUtils.equals(f21Var2.s1, ycVar2.f));
                                y0Var.setOnClickListener(new ct(d21Var, runnableArr, ycVar2, 6));
                                c21Var.addView(y0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(c21Var, -2, -2);
                        runnableArr[0] = new sp0(f1Var, 22);
                        f1Var.e = true;
                        f1Var.c = org.telegram.messenger.hs.x3;
                        f1Var.setOutsideTouchable(true);
                        f1Var.setClippingEnabled(true);
                        f1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        f1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        b21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        c21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = c21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        f1Var.showAtLocation(f21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (b21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, b8.mf.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(3, context, this);
        this.b = k2Var;
        org.telegram.ui.ActionBar.r6.V(k2Var, i10, f21Var.J0);
        k2Var.setTextSize(1, 20.0f);
        k2Var.setTypeface(org.telegram.messenger.g0.o());
        k2Var.setText(org.telegram.messenger.bd.M0(2131753766, null));
        k2Var.setPivotX(0.0f);
        k2Var.setPivotY(0.0f);
        addView(k2Var, b8.mf.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(17, context, this);
        this.c = s51Var;
        if (org.telegram.messenger.bd.a0) {
            s51Var.setGravity(5);
        }
        s51Var.setPivotX(0.0f);
        s51Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Dj, f21Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(f21.K0(f21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.search_arrow);
        int i14 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.t(e10, i14, f21Var.J0, mode);
        if (org.telegram.messenger.bd.a0) {
            e10.setScaleX(-1.0f);
        }
        b21 b21Var = new b21(this, context);
        this.e = b21Var;
        if (org.telegram.messenger.bd.a0) {
            b21Var.setGravity(5);
        }
        b21Var.b(0.25f, 350L, xq.h);
        org.telegram.ui.ActionBar.r6.Z(b21Var, i14, f21Var.J0);
        b21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b21Var.setText(f21.K0(f21.O0(f21Var.s1, null, null)));
        b21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        b21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a21
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i142 = i12;
                d21 d21Var = this.b;
                switch (i142) {
                    case 0:
                        d21Var.n.dismiss();
                        break;
                    default:
                        b21 b21Var2 = d21Var.e;
                        c21 c21Var = new c21(d21Var.getContext(), null);
                        Drawable mutate = d21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        f21 f21Var2 = d21Var.n;
                        org.telegram.ui.ActionBar.r6.y(d21Var, mutate, i15, f21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        c21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.x00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.bd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) arrayList.get(i16);
                            if (ycVar == null || (((str2 = ycVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(ycVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.f00(org.telegram.messenger.bd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) arrayList.get(i17);
                            if (!ycVar2.f.equals(f21Var2.r1) && "remote".equals(ycVar2.d)) {
                                TextUtils.equals(f21Var2.s1, ycVar2.f);
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, d21Var.getContext(), f21Var2.J0, z10, i17 == arrayList.size() - 1);
                                y0Var.setText(f21.K0(f21.O0(ycVar2.f, null, null)));
                                y0Var.setChecked(TextUtils.equals(f21Var2.s1, ycVar2.f));
                                y0Var.setOnClickListener(new ct(d21Var, runnableArr, ycVar2, 6));
                                c21Var.addView(y0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(c21Var, -2, -2);
                        runnableArr[0] = new sp0(f1Var, 22);
                        f1Var.e = true;
                        f1Var.c = org.telegram.messenger.hs.x3;
                        f1Var.setOutsideTouchable(true);
                        f1Var.setClippingEnabled(true);
                        f1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        f1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        b21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        c21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = c21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        f1Var.showAtLocation(f21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (b21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        if (org.telegram.messenger.bd.a0) {
            s51Var.addView(b21Var, b8.mf.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                s51Var.addView(e10, b8.mf.t(-2, -2, 16, 0, 1, 0, 0));
                s51Var.addView(this.d, b8.mf.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                s51Var.addView(textView2, b8.mf.t(-2, -2, 16, 0, 0, 4, 0));
                s51Var.addView(e10, b8.mf.t(-2, -2, 16, 0, 1, 0, 0));
            }
            s51Var.addView(b21Var, b8.mf.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(s51Var, b8.mf.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view2, f21Var.J0);
        view2.setAlpha(0.0f);
        addView(view2, b8.mf.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = b8.be.a((f10 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!f21.I0(this.n)) {
            a10 = 1.0f;
        }
        float interpolation = xq.g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        k2Var.setScaleX(T1);
        k2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        k2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.bd.a0;
        org.telegram.ui.s51 s51Var = this.c;
        if (!z10) {
            k2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            s51Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        s51Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
