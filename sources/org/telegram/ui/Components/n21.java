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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n21 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.l2 b;
    public final org.telegram.ui.z51 c;
    public final TextView d;
    public final l21 e;
    public final View f;
    public final View h;
    public final /* synthetic */ p21 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(p21 p21Var, Context context) {
        super(context);
        this.n = p21Var;
        View view = new View(context);
        this.f = view;
        int i7 = org.telegram.ui.ActionBar.j6.h5;
        org.telegram.ui.ActionBar.e6 e6Var = p21Var.J0;
        String str = p21Var.u1;
        org.telegram.ui.ActionBar.q6.h(i7, view, e6Var);
        addView(view, c8.ja.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.e6 e6Var2 = p21Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var2, mode);
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        final int i12 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, p21Var.J0), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.e6 e6Var3 = p21Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k21
            public final /* synthetic */ n21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i14 = i13;
                n21 n21Var = this.b;
                switch (i14) {
                    case 0:
                        n21Var.n.dismiss();
                        break;
                    default:
                        l21 l21Var = n21Var.e;
                        m21 m21Var = new m21(n21Var.getContext(), null);
                        Drawable mutate = n21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.j6.G8;
                        p21 p21Var2 = n21Var.n;
                        org.telegram.ui.ActionBar.q6.x(n21Var, mutate, i15, p21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        m21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.c10.N;
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
                        Collections.sort(arrayList, new org.telegram.messenger.k00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f.equals(p21Var2.u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(p21Var2.v1, ddVar2.f);
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, n21Var.getContext(), p21Var2.J0, z10, i17 == arrayList.size() - 1);
                                z0Var.setText(p21.K0(p21.O0(ddVar2.f, null, null)));
                                z0Var.setChecked(TextUtils.equals(p21Var2.v1, ddVar2.f));
                                z0Var.setOnClickListener(new lt(n21Var, runnableArr, ddVar2, 6));
                                m21Var.addView(z0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(m21Var, -2, -2);
                        runnableArr[0] = new ro0(g1Var, 24);
                        g1Var.e = true;
                        g1Var.c = org.telegram.messenger.ns.x3;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        l21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        m21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = m21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        g1Var.showAtLocation(p21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (l21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, c8.ja.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(3, context, this);
        this.b = l2Var;
        org.telegram.ui.ActionBar.q6.U(l2Var, i10, p21Var.J0);
        l2Var.setTextSize(1, 20.0f);
        l2Var.setTypeface(org.telegram.messenger.g0.o());
        l2Var.setText(org.telegram.messenger.hd.M0(2131753766, null));
        l2Var.setPivotX(0.0f);
        l2Var.setPivotY(0.0f);
        addView(l2Var, c8.ja.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(18, context, this);
        this.c = z51Var;
        if (org.telegram.messenger.hd.a0) {
            z51Var.setGravity(5);
        }
        z51Var.setPivotX(0.0f);
        z51Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Gj, p21Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(p21.K0(p21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.i20.e(context, R.drawable.search_arrow);
        int i14 = org.telegram.ui.ActionBar.j6.Gj;
        org.telegram.ui.ActionBar.q6.s(e10, i14, p21Var.J0, mode);
        if (org.telegram.messenger.hd.a0) {
            e10.setScaleX(-1.0f);
        }
        l21 l21Var = new l21(this, context);
        this.e = l21Var;
        if (org.telegram.messenger.hd.a0) {
            l21Var.setGravity(5);
        }
        l21Var.b(0.25f, 350L, er.h);
        org.telegram.ui.ActionBar.q6.Y(l21Var, i14, p21Var.J0);
        l21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        l21Var.setText(p21.K0(p21.O0(p21Var.v1, null, null)));
        l21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        l21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k21
            public final /* synthetic */ n21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i142 = i12;
                n21 n21Var = this.b;
                switch (i142) {
                    case 0:
                        n21Var.n.dismiss();
                        break;
                    default:
                        l21 l21Var2 = n21Var.e;
                        m21 m21Var = new m21(n21Var.getContext(), null);
                        Drawable mutate = n21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.j6.G8;
                        p21 p21Var2 = n21Var.n;
                        org.telegram.ui.ActionBar.q6.x(n21Var, mutate, i15, p21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        m21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.c10.N;
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
                        Collections.sort(arrayList, new org.telegram.messenger.k00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f.equals(p21Var2.u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(p21Var2.v1, ddVar2.f);
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, n21Var.getContext(), p21Var2.J0, z10, i17 == arrayList.size() - 1);
                                z0Var.setText(p21.K0(p21.O0(ddVar2.f, null, null)));
                                z0Var.setChecked(TextUtils.equals(p21Var2.v1, ddVar2.f));
                                z0Var.setOnClickListener(new lt(n21Var, runnableArr, ddVar2, 6));
                                m21Var.addView(z0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(m21Var, -2, -2);
                        runnableArr[0] = new ro0(g1Var, 24);
                        g1Var.e = true;
                        g1Var.c = org.telegram.messenger.ns.x3;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        l21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        m21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = m21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        g1Var.showAtLocation(p21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (l21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        if (org.telegram.messenger.hd.a0) {
            z51Var.addView(l21Var, c8.ja.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                z51Var.addView(e10, c8.ja.t(-2, -2, 16, 0, 1, 0, 0));
                z51Var.addView(this.d, c8.ja.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                z51Var.addView(textView2, c8.ja.t(-2, -2, 16, 0, 0, 4, 0));
                z51Var.addView(e10, c8.ja.t(-2, -2, 16, 0, 1, 0, 0));
            }
            z51Var.addView(l21Var, c8.ja.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(z51Var, c8.ja.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view2, p21Var.J0);
        view2.setAlpha(0.0f);
        addView(view2, c8.ja.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = c8.i9.a((f10 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!p21.I0(this.n)) {
            a10 = 1.0f;
        }
        float interpolation = er.g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.l2 l2Var = this.b;
        l2Var.setScaleX(T1);
        l2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        l2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.hd.a0;
        org.telegram.ui.z51 z51Var = this.c;
        if (!z10) {
            l2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            z51Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        z51Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
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
