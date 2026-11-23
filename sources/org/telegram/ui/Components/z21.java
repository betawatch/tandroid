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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z21 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.n2 b;
    public final org.telegram.ui.d61 c;
    public final TextView d;
    public final x21 e;
    public final View f;
    public final View h;
    public final /* synthetic */ b31 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z21(b31 b31Var, Context context) {
        super(context);
        this.n = b31Var;
        View view = new View(context);
        this.f = view;
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.h6 h6Var = b31Var.J0;
        String str = b31Var.u1;
        org.telegram.ui.ActionBar.t6.h(i7, view, h6Var);
        addView(view, c8.ma.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.h6 h6Var2 = b31Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var2, mode);
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        final int i12 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, b31Var.J0), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.h6 h6Var3 = b31Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w21
            public final /* synthetic */ z21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i14 = i13;
                z21 z21Var = this.b;
                switch (i14) {
                    case 0:
                        z21Var.n.dismiss();
                        break;
                    default:
                        x21 x21Var = z21Var.e;
                        y21 y21Var = new y21(z21Var.getContext(), null);
                        Drawable mutate = z21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.m6.G8;
                        b31 b31Var2 = z21Var.n;
                        org.telegram.ui.ActionBar.t6.x(z21Var, mutate, i15, b31Var2.J0, PorterDuff.Mode.MULTIPLY);
                        y21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.a10.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i16);
                            if (ddVar == null || (((str2 = ddVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(ddVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.i00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f.equals(b31Var2.u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(b31Var2.v1, ddVar2.f);
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, z21Var.getContext(), b31Var2.J0, z10, i17 == arrayList.size() - 1);
                                y0Var.setText(b31.L0(b31.P0(ddVar2.f, null, null)));
                                y0Var.setChecked(TextUtils.equals(b31Var2.v1, ddVar2.f));
                                y0Var.setOnClickListener(new st(z21Var, runnableArr, ddVar2, 6));
                                y21Var.addView(y0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(y21Var, -2, -2);
                        runnableArr[0] = new cp0(g1Var, 23);
                        g1Var.e = true;
                        g1Var.c = org.telegram.messenger.ls.x3;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        y21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = y21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        g1Var.showAtLocation(b31Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (x21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, c8.ma.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(3, context, this);
        this.b = n2Var;
        org.telegram.ui.ActionBar.t6.U(n2Var, i10, b31Var.J0);
        n2Var.setTextSize(1, 20.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        n2Var.setText(org.telegram.messenger.hd.N0(2131753763, null));
        n2Var.setPivotX(0.0f);
        n2Var.setPivotY(0.0f);
        addView(n2Var, c8.ma.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(17, context, this);
        this.c = d61Var;
        if (org.telegram.messenger.hd.a0) {
            d61Var.setGravity(5);
        }
        d61Var.setPivotX(0.0f);
        d61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gj, b31Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(b31.L0(b31.P0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.o10.e(context, R.drawable.search_arrow);
        int i14 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.s(e10, i14, b31Var.J0, mode);
        if (org.telegram.messenger.hd.a0) {
            e10.setScaleX(-1.0f);
        }
        x21 x21Var = new x21(this, context);
        this.e = x21Var;
        if (org.telegram.messenger.hd.a0) {
            x21Var.setGravity(5);
        }
        x21Var.b(0.25f, 350L, nr.h);
        org.telegram.ui.ActionBar.t6.Y(x21Var, i14, b31Var.J0);
        x21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x21Var.setText(b31.L0(b31.P0(b31Var.v1, null, null)));
        x21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        x21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w21
            public final /* synthetic */ z21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i142 = i12;
                z21 z21Var = this.b;
                switch (i142) {
                    case 0:
                        z21Var.n.dismiss();
                        break;
                    default:
                        x21 x21Var2 = z21Var.e;
                        y21 y21Var = new y21(z21Var.getContext(), null);
                        Drawable mutate = z21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.m6.G8;
                        b31 b31Var2 = z21Var.n;
                        org.telegram.ui.ActionBar.t6.x(z21Var, mutate, i15, b31Var2.J0, PorterDuff.Mode.MULTIPLY);
                        y21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.a10.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i16);
                            if (ddVar == null || (((str2 = ddVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(ddVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.i00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f.equals(b31Var2.u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(b31Var2.v1, ddVar2.f);
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, z21Var.getContext(), b31Var2.J0, z10, i17 == arrayList.size() - 1);
                                y0Var.setText(b31.L0(b31.P0(ddVar2.f, null, null)));
                                y0Var.setChecked(TextUtils.equals(b31Var2.v1, ddVar2.f));
                                y0Var.setOnClickListener(new st(z21Var, runnableArr, ddVar2, 6));
                                y21Var.addView(y0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(y21Var, -2, -2);
                        runnableArr[0] = new cp0(g1Var, 23);
                        g1Var.e = true;
                        g1Var.c = org.telegram.messenger.ls.x3;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        y21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = y21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        g1Var.showAtLocation(b31Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (x21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        if (org.telegram.messenger.hd.a0) {
            d61Var.addView(x21Var, c8.ma.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                d61Var.addView(e10, c8.ma.t(-2, -2, 16, 0, 1, 0, 0));
                d61Var.addView(this.d, c8.ma.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                d61Var.addView(textView2, c8.ma.t(-2, -2, 16, 0, 0, 4, 0));
                d61Var.addView(e10, c8.ma.t(-2, -2, 16, 0, 1, 0, 0));
            }
            d61Var.addView(x21Var, c8.ma.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(d61Var, c8.ma.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view2, b31Var.J0);
        view2.setAlpha(0.0f);
        addView(view2, c8.ma.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = c8.l9.a((f10 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!b31.J0(this.n)) {
            a10 = 1.0f;
        }
        float interpolation = nr.g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        n2Var.setScaleX(T1);
        n2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        n2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.hd.a0;
        org.telegram.ui.d61 d61Var = this.c;
        if (!z10) {
            n2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            d61Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        d61Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
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
