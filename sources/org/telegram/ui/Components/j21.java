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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j21 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.m2 b;
    public final org.telegram.ui.d61 c;
    public final TextView d;
    public final h21 e;
    public final View f;
    public final View h;
    public final /* synthetic */ l21 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j21(l21 l21Var, Context context) {
        super(context);
        this.n = l21Var;
        View view = new View(context);
        this.f = view;
        int i7 = org.telegram.ui.ActionBar.l6.h5;
        org.telegram.ui.ActionBar.g6 g6Var = l21Var.I0;
        String str = l21Var.q1;
        org.telegram.ui.ActionBar.s6.h(i7, view, g6Var);
        addView(view, c8.ha.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.l6.j5;
        org.telegram.ui.ActionBar.g6 g6Var2 = l21Var.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var2, mode);
        int i11 = org.telegram.ui.ActionBar.l6.i6;
        final int i12 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i11, l21Var.I0), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
        org.telegram.ui.ActionBar.g6 g6Var3 = l21Var.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g21
            public final /* synthetic */ j21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i14 = i13;
                j21 j21Var = this.b;
                switch (i14) {
                    case 0:
                        j21Var.n.dismiss();
                        break;
                    default:
                        h21 h21Var = j21Var.e;
                        i21 i21Var = new i21(j21Var.getContext(), null);
                        Drawable mutate = j21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.l6.G8;
                        l21 l21Var2 = j21Var.n;
                        org.telegram.ui.ActionBar.s6.x(j21Var, mutate, i15, l21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        i21Var.setBackground(mutate);
                        int i16 = 1;
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.id.E0().N.values());
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i17);
                            if (fdVar == null || (((str2 = fdVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(fdVar.d))) {
                                arrayList.remove(i17);
                                i17--;
                            }
                            i17++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.id.E0().B, 1));
                        boolean z9 = true;
                        int i18 = 0;
                        while (i18 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) arrayList.get(i18);
                            if (!fdVar2.f.equals(l21Var2.q1) && "remote".equals(fdVar2.d)) {
                                TextUtils.equals(l21Var2.r1, fdVar2.f);
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, j21Var.getContext(), l21Var2.I0, z9, i18 == arrayList.size() - 1);
                                z0Var.setText(l21.K0(l21.O0(fdVar2.f, null, null)));
                                z0Var.setChecked(TextUtils.equals(l21Var2.r1, fdVar2.f));
                                z0Var.setOnClickListener(new ud0(j21Var, runnableArr, fdVar2, i16));
                                i21Var.addView(z0Var);
                                z9 = false;
                            }
                            i18++;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(i21Var, -2, -2);
                        runnableArr[0] = new kr0(g1Var, 21);
                        g1Var.e = true;
                        g1Var.c = org.telegram.messenger.qs.x3;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        h21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        i21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = i21Var.getMeasuredHeight();
                        int i19 = iArr[1];
                        g1Var.showAtLocation(l21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i19) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i19 - measuredHeight) : (h21Var.getMeasuredHeight() + i19) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, c8.ha.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(3, context, this);
        this.b = m2Var;
        org.telegram.ui.ActionBar.s6.U(m2Var, i10, l21Var.I0);
        m2Var.setTextSize(1, 20.0f);
        m2Var.setTypeface(org.telegram.messenger.g0.o());
        m2Var.setText(org.telegram.messenger.id.M0(2131753766, null));
        m2Var.setPivotX(0.0f);
        m2Var.setPivotY(0.0f);
        addView(m2Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(16, context, this);
        this.c = d61Var;
        if (org.telegram.messenger.id.a0) {
            d61Var.setGravity(5);
        }
        d61Var.setPivotX(0.0f);
        d61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Dj, l21Var.I0);
            textView.setTextSize(1, 14.0f);
            textView.setText(l21.K0(l21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.search_arrow);
        int i14 = org.telegram.ui.ActionBar.l6.Dj;
        org.telegram.ui.ActionBar.s6.s(e10, i14, l21Var.I0, mode);
        if (org.telegram.messenger.id.a0) {
            e10.setScaleX(-1.0f);
        }
        h21 h21Var = new h21(this, context);
        this.e = h21Var;
        if (org.telegram.messenger.id.a0) {
            h21Var.setGravity(5);
        }
        h21Var.b(0.25f, 350L, xq.h);
        org.telegram.ui.ActionBar.s6.Y(h21Var, i14, l21Var.I0);
        h21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h21Var.setText(l21.K0(l21.O0(l21Var.r1, null, null)));
        h21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        h21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g21
            public final /* synthetic */ j21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i142 = i12;
                j21 j21Var = this.b;
                switch (i142) {
                    case 0:
                        j21Var.n.dismiss();
                        break;
                    default:
                        h21 h21Var2 = j21Var.e;
                        i21 i21Var = new i21(j21Var.getContext(), null);
                        Drawable mutate = j21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.l6.G8;
                        l21 l21Var2 = j21Var.n;
                        org.telegram.ui.ActionBar.s6.x(j21Var, mutate, i15, l21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        i21Var.setBackground(mutate);
                        int i16 = 1;
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.id.E0().N.values());
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i17);
                            if (fdVar == null || (((str2 = fdVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(fdVar.d))) {
                                arrayList.remove(i17);
                                i17--;
                            }
                            i17++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.id.E0().B, 1));
                        boolean z9 = true;
                        int i18 = 0;
                        while (i18 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) arrayList.get(i18);
                            if (!fdVar2.f.equals(l21Var2.q1) && "remote".equals(fdVar2.d)) {
                                TextUtils.equals(l21Var2.r1, fdVar2.f);
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, j21Var.getContext(), l21Var2.I0, z9, i18 == arrayList.size() - 1);
                                z0Var.setText(l21.K0(l21.O0(fdVar2.f, null, null)));
                                z0Var.setChecked(TextUtils.equals(l21Var2.r1, fdVar2.f));
                                z0Var.setOnClickListener(new ud0(j21Var, runnableArr, fdVar2, i16));
                                i21Var.addView(z0Var);
                                z9 = false;
                            }
                            i18++;
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(i21Var, -2, -2);
                        runnableArr[0] = new kr0(g1Var, 21);
                        g1Var.e = true;
                        g1Var.c = org.telegram.messenger.qs.x3;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        h21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        i21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = i21Var.getMeasuredHeight();
                        int i19 = iArr[1];
                        g1Var.showAtLocation(l21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i19) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i19 - measuredHeight) : (h21Var2.getMeasuredHeight() + i19) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        if (org.telegram.messenger.id.a0) {
            d61Var.addView(h21Var, c8.ha.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                d61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
                d61Var.addView(this.d, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                d61Var.addView(textView2, c8.ha.t(-2, -2, 16, 0, 0, 4, 0));
                d61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
            }
            d61Var.addView(h21Var, c8.ha.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(d61Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.V5, view2, l21Var.I0);
        view2.setAlpha(0.0f);
        addView(view2, c8.ha.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = c8.j9.a((f10 - org.telegram.messenger.g0.m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!l21.I0(this.n)) {
            a10 = 1.0f;
        }
        float interpolation = xq.g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.m2 m2Var = this.b;
        m2Var.setScaleX(T1);
        m2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        m2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z9 = org.telegram.messenger.id.a0;
        org.telegram.ui.d61 d61Var = this.c;
        if (!z9) {
            m2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
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
