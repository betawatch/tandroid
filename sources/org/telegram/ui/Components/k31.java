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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k31 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.q2 b;
    public final org.telegram.ui.u71 c;
    public final TextView d;
    public final i31 e;
    public final View f;
    public final View h;
    public final /* synthetic */ m31 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(m31 m31Var, Context context) {
        super(context);
        this.n = m31Var;
        View view = new View(context);
        this.f = view;
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        org.telegram.ui.ActionBar.p6 p6Var = m31Var.I0;
        String str = m31Var.q1;
        org.telegram.ui.ActionBar.a7.i(i10, view, p6Var);
        addView(view, w7.b6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.p6 p6Var2 = m31Var.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var2, mode);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        final int i13 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, m31Var.I0), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.p6 p6Var3 = m31Var.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var3);
        imageView.setAlpha(0.0f);
        final int i14 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h31
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i15 = i14;
                k31 k31Var = this.b;
                switch (i15) {
                    case 0:
                        k31Var.n.dismiss();
                        break;
                    default:
                        i31 i31Var = k31Var.e;
                        j31 j31Var = new j31(k31Var.getContext(), null);
                        Drawable mutate = k31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i16 = org.telegram.ui.ActionBar.t6.G8;
                        m31 m31Var2 = k31Var.n;
                        org.telegram.ui.ActionBar.a7.y(k31Var, mutate, i16, m31Var2.I0, PorterDuff.Mode.MULTIPLY);
                        j31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.t10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.cd.D0().N.values());
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) arrayList.get(i17);
                            if (zcVar == null || (((str2 = zcVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(zcVar.d))) {
                                arrayList.remove(i17);
                                i17--;
                            }
                            i17++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.a10(org.telegram.messenger.cd.D0().B, 1));
                        boolean z10 = true;
                        int i18 = 0;
                        while (i18 < arrayList.size()) {
                            org.telegram.messenger.zc zcVar2 = (org.telegram.messenger.zc) arrayList.get(i18);
                            if (!zcVar2.f.equals(m31Var2.q1) && "remote".equals(zcVar2.d)) {
                                TextUtils.equals(m31Var2.r1, zcVar2.f);
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, k31Var.getContext(), m31Var2.I0, z10, i18 == arrayList.size() - 1);
                                b1Var.setText(m31.K0(m31.O0(zcVar2.f, null, null)));
                                b1Var.setChecked(TextUtils.equals(m31Var2.r1, zcVar2.f));
                                b1Var.setOnClickListener(new ag.i(k31Var, runnableArr, zcVar2, 21));
                                j31Var.addView(b1Var);
                                z10 = false;
                            }
                            i18++;
                        }
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(j31Var, -2, -2);
                        runnableArr[0] = new uo0(k1Var, 25);
                        k1Var.e = true;
                        k1Var.c = org.telegram.messenger.zs.x3;
                        k1Var.setOutsideTouchable(true);
                        k1Var.setClippingEnabled(true);
                        k1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        k1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        i31Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.i0.q;
                        j31Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = j31Var.getMeasuredHeight();
                        int i19 = iArr[1];
                        k1Var.showAtLocation(m31Var2.b, 51, iArr[0] - org.telegram.messenger.i0.L(8.0f), ((float) i19) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.i0.L(8.0f) + (i19 - measuredHeight) : (i31Var.getMeasuredHeight() + i19) - org.telegram.messenger.i0.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, w7.b6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 3);
        this.b = q2Var;
        org.telegram.ui.ActionBar.a7.V(q2Var, i11, m31Var.I0);
        q2Var.setTextSize(1, 20.0f);
        q2Var.setTypeface(org.telegram.messenger.i0.o());
        q2Var.setText(org.telegram.messenger.cd.L0(2131753766, null));
        q2Var.setPivotX(0.0f);
        q2Var.setPivotY(0.0f);
        addView(q2Var, w7.b6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 12);
        this.c = u71Var;
        if (org.telegram.messenger.cd.X) {
            u71Var.setGravity(5);
        }
        u71Var.setPivotX(0.0f);
        u71Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Dj, m31Var.I0);
            textView.setTextSize(1, 14.0f);
            textView.setText(m31.K0(m31.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f));
        }
        ImageView e = org.telegram.messenger.z20.e(context, R.drawable.search_arrow);
        int i15 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.t(e, i15, m31Var.I0, mode);
        if (org.telegram.messenger.cd.X) {
            e.setScaleX(-1.0f);
        }
        i31 i31Var = new i31(this, context);
        this.e = i31Var;
        if (org.telegram.messenger.cd.X) {
            i31Var.setGravity(5);
        }
        i31Var.b(0.25f, 350L, gr.h);
        org.telegram.ui.ActionBar.a7.Z(i31Var, i15, m31Var.I0);
        i31Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        i31Var.setText(m31.K0(m31.O0(m31Var.r1, null, null)));
        i31Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
        i31Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h31
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i152 = i13;
                k31 k31Var = this.b;
                switch (i152) {
                    case 0:
                        k31Var.n.dismiss();
                        break;
                    default:
                        i31 i31Var2 = k31Var.e;
                        j31 j31Var = new j31(k31Var.getContext(), null);
                        Drawable mutate = k31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i16 = org.telegram.ui.ActionBar.t6.G8;
                        m31 m31Var2 = k31Var.n;
                        org.telegram.ui.ActionBar.a7.y(k31Var, mutate, i16, m31Var2.I0, PorterDuff.Mode.MULTIPLY);
                        j31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.t10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.cd.D0().N.values());
                        int i17 = 0;
                        while (i17 < arrayList.size()) {
                            org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) arrayList.get(i17);
                            if (zcVar == null || (((str2 = zcVar.c) != null && str2.endsWith("_raw")) || !"remote".equals(zcVar.d))) {
                                arrayList.remove(i17);
                                i17--;
                            }
                            i17++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.a10(org.telegram.messenger.cd.D0().B, 1));
                        boolean z10 = true;
                        int i18 = 0;
                        while (i18 < arrayList.size()) {
                            org.telegram.messenger.zc zcVar2 = (org.telegram.messenger.zc) arrayList.get(i18);
                            if (!zcVar2.f.equals(m31Var2.q1) && "remote".equals(zcVar2.d)) {
                                TextUtils.equals(m31Var2.r1, zcVar2.f);
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, k31Var.getContext(), m31Var2.I0, z10, i18 == arrayList.size() - 1);
                                b1Var.setText(m31.K0(m31.O0(zcVar2.f, null, null)));
                                b1Var.setChecked(TextUtils.equals(m31Var2.r1, zcVar2.f));
                                b1Var.setOnClickListener(new ag.i(k31Var, runnableArr, zcVar2, 21));
                                j31Var.addView(b1Var);
                                z10 = false;
                            }
                            i18++;
                        }
                        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(j31Var, -2, -2);
                        runnableArr[0] = new uo0(k1Var, 25);
                        k1Var.e = true;
                        k1Var.c = org.telegram.messenger.zs.x3;
                        k1Var.setOutsideTouchable(true);
                        k1Var.setClippingEnabled(true);
                        k1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        k1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        i31Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.i0.q;
                        j31Var.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = j31Var.getMeasuredHeight();
                        int i19 = iArr[1];
                        k1Var.showAtLocation(m31Var2.b, 51, iArr[0] - org.telegram.messenger.i0.L(8.0f), ((float) i19) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? org.telegram.messenger.i0.L(8.0f) + (i19 - measuredHeight) : (i31Var2.getMeasuredHeight() + i19) - org.telegram.messenger.i0.L(8.0f));
                        break;
                }
            }
        });
        if (org.telegram.messenger.cd.X) {
            u71Var.addView(i31Var, w7.b6.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                u71Var.addView(e, w7.b6.t(-2, -2, 16, 0, 1, 0, 0));
                u71Var.addView(this.d, w7.b6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                u71Var.addView(textView2, w7.b6.t(-2, -2, 16, 0, 0, 4, 0));
                u71Var.addView(e, w7.b6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            u71Var.addView(i31Var, w7.b6.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(u71Var, w7.b6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view2, m31Var.I0);
        view2.setAlpha(0.0f);
        addView(view2, w7.b6.d(-1, org.telegram.messenger.i0.f1() / org.telegram.messenger.i0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.u.a((f7 - org.telegram.messenger.i0.m) / org.telegram.messenger.i0.L(64.0f), 0.0f, 1.0f);
        if (!m31.I0(this.n)) {
            a2 = 1.0f;
        }
        float interpolation = gr.g.getInterpolation(a2);
        float T1 = org.telegram.messenger.i0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.q2 q2Var = this.b;
        q2Var.setScaleX(T1);
        q2Var.setScaleY(org.telegram.messenger.i0.T1(0.85f, 1.0f, interpolation));
        q2Var.setTranslationY(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.cd.X;
        org.telegram.ui.u71 u71Var = this.c;
        if (!z10) {
            q2Var.setTranslationX(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(50.0f), 0.0f, interpolation));
            u71Var.setTranslationX(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(50.0f), 0.0f, interpolation));
        }
        u71Var.setTranslationY(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(T12);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float T13 = org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f10);
    }
}
