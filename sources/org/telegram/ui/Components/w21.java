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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w21 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.o2 b;
    public final org.telegram.ui.d61 c;
    public final TextView d;
    public final u21 e;
    public final View f;
    public final View h;
    public final /* synthetic */ y21 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(y21 y21Var, Context context) {
        super(context);
        this.n = y21Var;
        View view = new View(context);
        this.f = view;
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        org.telegram.ui.ActionBar.i6 i6Var = y21Var.J0;
        String str = y21Var.u1;
        org.telegram.ui.ActionBar.u6.h(i7, view, i6Var);
        addView(view, c8.ma.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.i6 i6Var2 = y21Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var2, mode);
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        final int i12 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, y21Var.J0), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.i6 i6Var3 = y21Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t21
            public final /* synthetic */ w21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i14 = i13;
                w21 w21Var = this.b;
                switch (i14) {
                    case 0:
                        w21Var.n.dismiss();
                        break;
                    default:
                        u21 u21Var = w21Var.e;
                        v21 v21Var = new v21(w21Var.getContext(), null);
                        Drawable mutate = w21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.n6.G8;
                        y21 y21Var2 = w21Var.n;
                        org.telegram.ui.ActionBar.u6.x(w21Var, mutate, i15, y21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        v21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.z00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.gd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) arrayList.get(i16);
                            if (cdVar == null || (((str2 = cdVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(cdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.h00(org.telegram.messenger.gd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) arrayList.get(i17);
                            if (!cdVar2.f.equals(y21Var2.u1) && "remote".equals(cdVar2.d)) {
                                TextUtils.equals(y21Var2.v1, cdVar2.f);
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, w21Var.getContext(), y21Var2.J0, z10, i17 == arrayList.size() - 1);
                                z0Var.setText(y21.L0(y21.P0(cdVar2.f, null, null)));
                                z0Var.setChecked(TextUtils.equals(y21Var2.v1, cdVar2.f));
                                z0Var.setOnClickListener(new qt(w21Var, runnableArr, cdVar2, 6));
                                v21Var.addView(z0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(v21Var, -2, -2);
                        runnableArr[0] = new ap0(h1Var, 23);
                        h1Var.e = true;
                        h1Var.c = org.telegram.messenger.ks.x3;
                        h1Var.setOutsideTouchable(true);
                        h1Var.setClippingEnabled(true);
                        h1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        h1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        v21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = v21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        h1Var.showAtLocation(y21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (u21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, c8.ma.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(3, context, this);
        this.b = o2Var;
        org.telegram.ui.ActionBar.u6.U(o2Var, i10, y21Var.J0);
        o2Var.setTextSize(1, 20.0f);
        o2Var.setTypeface(org.telegram.messenger.g0.o());
        o2Var.setText(org.telegram.messenger.gd.M0(2131753764, null));
        o2Var.setPivotX(0.0f);
        o2Var.setPivotY(0.0f);
        addView(o2Var, c8.ma.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(17, context, this);
        this.c = d61Var;
        if (org.telegram.messenger.gd.a0) {
            d61Var.setGravity(5);
        }
        d61Var.setPivotX(0.0f);
        d61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Gj, y21Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(y21.L0(y21.P0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.n10.e(context, R.drawable.search_arrow);
        int i14 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.s(e10, i14, y21Var.J0, mode);
        if (org.telegram.messenger.gd.a0) {
            e10.setScaleX(-1.0f);
        }
        u21 u21Var = new u21(this, context);
        this.e = u21Var;
        if (org.telegram.messenger.gd.a0) {
            u21Var.setGravity(5);
        }
        u21Var.b(0.25f, 350L, lr.h);
        org.telegram.ui.ActionBar.u6.Y(u21Var, i14, y21Var.J0);
        u21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        u21Var.setText(y21.L0(y21.P0(y21Var.v1, null, null)));
        u21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        u21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t21
            public final /* synthetic */ w21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i142 = i12;
                w21 w21Var = this.b;
                switch (i142) {
                    case 0:
                        w21Var.n.dismiss();
                        break;
                    default:
                        u21 u21Var2 = w21Var.e;
                        v21 v21Var = new v21(w21Var.getContext(), null);
                        Drawable mutate = w21Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i15 = org.telegram.ui.ActionBar.n6.G8;
                        y21 y21Var2 = w21Var.n;
                        org.telegram.ui.ActionBar.u6.x(w21Var, mutate, i15, y21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        v21Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.z00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.gd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) arrayList.get(i16);
                            if (cdVar == null || (((str2 = cdVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(cdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.h00(org.telegram.messenger.gd.E0().B, 1));
                        boolean z10 = true;
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) arrayList.get(i17);
                            if (!cdVar2.f.equals(y21Var2.u1) && "remote".equals(cdVar2.d)) {
                                TextUtils.equals(y21Var2.v1, cdVar2.f);
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, w21Var.getContext(), y21Var2.J0, z10, i17 == arrayList.size() - 1);
                                z0Var.setText(y21.L0(y21.P0(cdVar2.f, null, null)));
                                z0Var.setChecked(TextUtils.equals(y21Var2.v1, cdVar2.f));
                                z0Var.setOnClickListener(new qt(w21Var, runnableArr, cdVar2, 6));
                                v21Var.addView(z0Var);
                                z10 = false;
                            }
                            i17++;
                        }
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(v21Var, -2, -2);
                        runnableArr[0] = new ap0(h1Var, 23);
                        h1Var.e = true;
                        h1Var.c = org.telegram.messenger.ks.x3;
                        h1Var.setOutsideTouchable(true);
                        h1Var.setClippingEnabled(true);
                        h1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        h1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.q;
                        v21Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = v21Var.getMeasuredHeight();
                        int i18 = iArr[1];
                        h1Var.showAtLocation(y21Var2.b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), ((float) i18) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight) : (u21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f));
                        break;
                }
            }
        });
        if (org.telegram.messenger.gd.a0) {
            d61Var.addView(u21Var, c8.ma.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
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
            d61Var.addView(u21Var, c8.ma.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(d61Var, c8.ma.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view2, y21Var.J0);
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
        if (!y21.J0(this.n)) {
            a10 = 1.0f;
        }
        float interpolation = lr.g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        o2Var.setScaleX(T1);
        o2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        o2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.gd.a0;
        org.telegram.ui.d61 d61Var = this.c;
        if (!z10) {
            o2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
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
