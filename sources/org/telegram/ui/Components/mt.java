package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class mt extends EditTextBoldCursor implements org.telegram.ui.ActionBar.l4 {
    public static final int[] d2 = {1, 2, 4, 8, 16, 256, TLObject.FLAG_14, 32768};
    public String M1;
    public StaticLayout N1;
    public vy0 O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public kt T1;
    public int U1;
    public int V1;
    public boolean W1;
    public int X1;
    public boolean Y1;
    public final org.telegram.ui.ActionBar.i6 Z1;
    public int a2;
    public org.telegram.ui.ActionBar.u1 b2;
    public boolean c2;

    public mt(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.U1 = -1;
        this.V1 = -1;
        this.Z1 = i6Var;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Jd, i6Var);
        this.a2 = w02;
        this.E = w02;
        addTextChangedListener(new ah.j(this, 20));
        setClipToPadding(true);
    }

    public final void A(ez0 ez0Var) {
        int selectionEnd;
        int i7 = this.U1;
        if (i7 < 0 || (selectionEnd = this.V1) < 0) {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        org.telegram.messenger.ri.f(ez0Var, i7, selectionEnd, getText(), this.W1);
        if (ez0Var == null) {
            Editable text = getText();
            for (qi.g gVar : (qi.g[]) text.getSpans(i7, selectionEnd, qi.g.class)) {
                text.removeSpan(gVar);
            }
            hh0[] hh0VarArr = (hh0[]) text.getSpans(i7, selectionEnd, hh0.class);
            for (int i10 = 0; i10 < hh0VarArr.length; i10++) {
                text.removeSpan(hh0VarArr[i10]);
                text.removeSpan(hh0VarArr[i10].s);
                oi.v5 v5Var = hh0VarArr[i10].w;
                if (v5Var != null) {
                    text.removeSpan(v5Var);
                }
            }
            if (hh0VarArr.length > 0) {
                g(true);
            }
        }
        kt ktVar = this.T1;
        if (ktVar != null) {
            ktVar.g();
        }
    }

    public r41 B(String str) {
        return new r41(str, null);
    }

    public final void C() {
        int selectionEnd;
        int i7 = this.U1;
        if (i7 < 0 || (selectionEnd = this.V1) < 0) {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        Context context = getContext();
        di.i0 i0Var = new di.i0(this, i7, selectionEnd);
        me meVar = new me(6);
        Pattern pattern = b5.a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.Z1;
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        int i11 = i6Var != null ? i6Var.i(i10) : org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i12 = org.telegram.ui.ActionBar.n6.h5;
        int i13 = i6Var != null ? i6Var.i(i12) : org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        int i14 = org.telegram.ui.ActionBar.n6.Aj;
        if (i6Var != null) {
            i6Var.i(i14);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.n6.Ej;
        if (i6Var != null) {
            i6Var.i(i15);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.n6.E8;
        if (i6Var != null) {
            i6Var.i(i16);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.n6.G8;
        if (i6Var != null) {
            i6Var.i(i17);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.n6.i6;
        if (i6Var != null) {
            i6Var.i(i18);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.n6.Ji;
        if (i6Var != null) {
            i6Var.i(i19);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.n6.Fi;
        if (i6Var != null) {
            i6Var.i(i20);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.n6.Hi;
        if (i6Var != null) {
            i6Var.i(i21);
        } else {
            org.telegram.ui.ActionBar.n6.x0(null, i21, false);
        }
        hi.w4 w4Var = new hi.w4(context, i6Var);
        ((org.telegram.ui.ActionBar.x2) w4Var.b).w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i22 = calendar.get(1);
        sb0 sb0Var = new sb0(context, i6Var);
        sb0Var.setTextColor(i11);
        sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var.setItemCount(5);
        sb0Var.setMinValue(1);
        sb0Var.setMaxValue(31);
        sb0Var.setWrapSelectorWheel(false);
        sb0Var.setFormatter(new k2(11));
        sb0 sb0Var2 = new sb0(context, i6Var);
        sb0Var2.setTextColor(i11);
        sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        sb0Var2.setItemCount(5);
        sb0Var2.setMinValue(0);
        sb0Var2.setMaxValue(org.telegram.messenger.ks.O3);
        sb0Var2.setValue(120);
        sb0Var2.setWrapSelectorWheel(false);
        sb0Var2.setFormatter(new ai.s1(calendar, i22, 7));
        sb0 sb0Var3 = new sb0(context, i6Var);
        sb0Var3.setContentDescriptionCallback(new ci.y(5));
        sb0Var3.setWrapSelectorWheel(true);
        sb0Var3.setAllItemsCount(24);
        sb0Var3.setItemCount(5);
        sb0Var3.setTextColor(i11);
        sb0Var3.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        sb0Var3.setMinValue(0);
        sb0Var3.setMaxValue(23);
        sb0Var3.setFormatter(new k2(12));
        sb0 sb0Var4 = new sb0(context, i6Var);
        sb0Var4.setContentDescriptionCallback(new ci.y(6));
        sb0Var4.setWrapSelectorWheel(true);
        sb0Var4.setAllItemsCount(60);
        sb0Var4.setItemCount(5);
        sb0Var4.setTextColor(i11);
        sb0Var4.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        sb0Var4.setMinValue(0);
        sb0Var4.setMaxValue(59);
        sb0Var4.setValue(0);
        sb0Var4.setFormatter(new k2(13));
        calendar.setTimeInMillis(currentTimeMillis);
        sb0Var4.setValue(calendar.get(12));
        sb0Var3.setValue(calendar.get(11));
        sb0Var.setValue(calendar.get(5));
        sb0Var2.setValue(calendar.get(2) + 120);
        vy0 vy0Var = new vy0(org.telegram.messenger.gd.a0(null, null, 2131742525, "", "").trim(), 16.0f, null);
        vy0Var.p(org.telegram.messenger.g0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        vy0Var.a();
        vy0Var.m(1);
        vy0Var.n(i11);
        vy0 vy0Var2 = new vy0(":", 18.0f, null);
        vy0Var2.p(org.telegram.messenger.g0.L(100.0f));
        vy0Var2.a();
        vy0Var2.m(1);
        vy0Var2.a.setColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        e4 e4Var = new e4(context, sb0Var2, sb0Var, sb0Var3, sb0Var4);
        e4Var.setOrientation(1);
        frameLayout.addView(e4Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        e4Var.addView(frameLayout2, c8.ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.M0(2131746141, null));
        textView.setTextColor(i11);
        i5.c.x(textView, 1, 20.0f);
        frameLayout2.addView(textView, c8.ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        hi.x4 x4Var = new hi.x4(context, vy0Var2, sb0Var4);
        x4Var.setOrientation(0);
        x4Var.setWeightSum(1.0f);
        e4Var.addView(x4Var, c8.ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.d dVar = new hi.d(context, i6Var, true);
        di.l6 l6Var = new di.l6(dVar, sb0Var, sb0Var2, sb0Var3, sb0Var4);
        x4Var.addView(sb0Var, c8.ma.l(0.2f, 0, org.telegram.messenger.ks.t4));
        x4Var.addView(sb0Var2, c8.ma.l(0.4f, 0, org.telegram.messenger.ks.t4));
        x4Var.addView(sb0Var3, c8.ma.l(0.2f, 0, org.telegram.messenger.ks.t4));
        x4Var.addView(sb0Var4, c8.ma.l(0.2f, 0, org.telegram.messenger.ks.t4));
        sb0Var.setOnValueChangedListener(l6Var);
        sb0Var2.setOnValueChangedListener(l6Var);
        sb0Var3.setOnValueChangedListener(l6Var);
        sb0Var4.setOnValueChangedListener(l6Var);
        boolean[] zArr = {true};
        dVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        dVar.f();
        e4Var.addView(dVar, c8.ma.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new i3(zArr, sb0Var, sb0Var2, sb0Var3, sb0Var4, i0Var, new int[1], w4Var));
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
        x2Var.O = frameLayout;
        x2Var.show();
        x2Var.setOnDismissListener(new m2(1, meVar, zArr));
        x2Var.v0(i13);
        x2Var.P(i13);
        b5.c(dVar, sb0Var, sb0Var2, sb0Var3, sb0Var4);
    }

    public final void D(oi.b bVar) {
        int selectionEnd;
        int i7 = this.U1;
        if (i7 < 0 || (selectionEnd = this.V1) < 0) {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        I(org.telegram.messenger.gd.M0(2131751733, null), org.telegram.messenger.gd.M0(2131743680, null), "http://", true, this.c2, new ht(this, i7, selectionEnd, bVar));
    }

    public final boolean H(int i7) {
        int selectionEnd;
        int selectionEnd2;
        if (i7 == R.id.menu_regular) {
            A(null);
            return true;
        }
        if (i7 == R.id.menu_bold) {
            dz0 dz0Var = new dz0();
            dz0Var.a |= 1;
            A(new ez0(dz0Var, 0));
            return true;
        }
        int i10 = 2;
        if (i7 == R.id.menu_italic) {
            dz0 dz0Var2 = new dz0();
            dz0Var2.a |= 2;
            A(new ez0(dz0Var2, 0));
            return true;
        }
        if (i7 == R.id.menu_mono) {
            dz0 dz0Var3 = new dz0();
            dz0Var3.a |= 4;
            A(new ez0(dz0Var3, 0));
            return true;
        }
        if (i7 == R.id.menu_link) {
            D(null);
            return true;
        }
        if (i7 == R.id.menu_strike) {
            dz0 dz0Var4 = new dz0();
            dz0Var4.a |= 8;
            A(new ez0(dz0Var4, 0));
            return true;
        }
        if (i7 == R.id.menu_underline) {
            dz0 dz0Var5 = new dz0();
            dz0Var5.a |= 16;
            A(new ez0(dz0Var5, 0));
            return true;
        }
        if (i7 == R.id.menu_spoiler) {
            dz0 dz0Var6 = new dz0();
            dz0Var6.a |= 256;
            A(new ez0(dz0Var6, 0));
            h();
            return true;
        }
        if (i7 == R.id.menu_quote) {
            int i11 = this.U1;
            if (i11 < 0 || (selectionEnd2 = this.V1) < 0) {
                i11 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            } else {
                this.V1 = -1;
                this.U1 = -1;
            }
            int c10 = hh0.c(getText(), i11, selectionEnd2, false);
            if (c10 >= 0) {
                setSelection(c10);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        }
        if (i7 == R.id.menu_date) {
            C();
            return true;
        }
        if (i7 != R.id.menu_translate) {
            return false;
        }
        int i12 = this.U1;
        if (i12 < 0 || (selectionEnd = this.V1) < 0) {
            i12 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        CharSequence subSequence = getText().subSequence(i12, selectionEnd);
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        Context context = getContext();
        org.telegram.ui.ActionBar.i6 resourceProvider = T != null ? T.getResourceProvider() : null;
        k31 k31Var = new k31(context, null, false, false, 2, resourceProvider);
        org.telegram.ui.ActionBar.i6 i6Var = resourceProvider;
        k31Var.c2 = 1;
        k31Var.d2 = new String[]{"formal", "neutral", "casual"};
        k31Var.e2 = new String[]{"Formal", "Neutral", "Casual"};
        k31Var.g2 = true;
        k31Var.h2 = -1;
        ImageView imageView = new ImageView(context);
        k31Var.T1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i13, i6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i13, k31Var.J0)), 1, -1);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, K, i6Var);
        k31Var.p1.addView(imageView, c8.ma.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ra.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new a31(k31Var, i10));
        String N0 = y21.N0();
        k31Var.b2 = N0;
        if (N0 == null) {
            k31Var.b2 = org.telegram.messenger.z00.j();
        }
        k31Var.G1 = false;
        k31Var.F1 = org.telegram.messenger.g0.L(12.0f);
        int i14 = org.telegram.ui.ActionBar.n6.a7;
        k31Var.v0(org.telegram.ui.ActionBar.n6.w0(i14, k31Var.J0));
        FrameLayout frameLayout = new FrameLayout(context);
        k31Var.U1 = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, org.telegram.ui.ActionBar.n6.w0(i14, k31Var.J0)), org.telegram.ui.ActionBar.n6.w0(i14, k31Var.J0), org.telegram.ui.ActionBar.n6.w0(i14, k31Var.J0)}));
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.setRoundRadius(24);
        k31Var.V1 = dVar;
        dVar.setText(org.telegram.messenger.gd.M0(2131747638, null));
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, org.telegram.messenger.ks.E1, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = d.leftMargin;
        int i16 = k31Var.u0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        frameLayout.addView(dVar, d);
        k31Var.b.addView(frameLayout, c8.ma.e(-1, -2, 80));
        int i17 = k31Var.u0;
        int L = org.telegram.messenger.g0.L(66.0f);
        ck0 ck0Var = k31Var.o1;
        ck0Var.setPadding(i17, 0, i17, L);
        ck0Var.setClipToPadding(false);
        ck0Var.r1();
        ck0Var.setOnItemClickListener(new fi.g4(15, k31Var, i6Var));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        ck0Var.setItemAnimator(kVar);
        k31Var.f2.O(false);
        k31Var.W1 = subSequence;
        org.telegram.messenger.c6.d(subSequence.toString(), new iy(k31Var, 23), new wb0(21), false);
        k31Var.Z1 = new gt(this, i12, selectionEnd);
        k31Var.show();
        setSelection(i12, selectionEnd);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void I(String str, String str2, String str3, boolean z10, boolean z11, lt ltVar) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.i6 i6Var = this.Z1;
        final int i7 = 0;
        ?? w1Var = z11 ? new org.telegram.ui.ActionBar.w1(0, getContext(), i6Var) : new AlertDialog$Builder(0, getContext(), i6Var);
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.S = str;
        ?? frameLayout = new FrameLayout(getContext());
        final di.q qVar = new di.q(getContext(), 4);
        String str4 = str3 == null ? "" : str3;
        final int i10 = 1;
        qVar.setTextSize(1, 18.0f);
        qVar.setText(str4);
        org.telegram.ui.ActionBar.u6.U(qVar, org.telegram.ui.ActionBar.n6.j5, i6Var);
        qVar.setHintText(str2);
        org.telegram.ui.ActionBar.u6.l(qVar, 35, org.telegram.ui.ActionBar.n6.L6, i6Var);
        qVar.setSingleLine(true);
        qVar.setFocusable(true);
        qVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.u6.F(qVar, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var);
        qVar.setImeOptions(6);
        qVar.setBackgroundDrawable(null);
        qVar.requestFocus();
        qVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.u6.C(qVar, org.telegram.ui.ActionBar.n6.lg, i6Var);
        org.telegram.ui.ActionBar.u6.l(qVar, 36, org.telegram.ui.ActionBar.n6.mg, i6Var);
        frameLayout.addView(qVar, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.gd.M0(2131747242, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.n6.o6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i11);
        org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, K, K2, i6Var);
        c8.ra.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, c8.ma.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        ai.n nVar = new ai.n(this, z10, qVar, str4, textView, 9);
        textView.setOnClickListener(new ah.h(this, qVar, nVar, 29));
        qVar.addTextChangedListener(new ah.j(nVar, 21));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                charSequence = null;
            }
            if (charSequence != null) {
                qVar.setText(charSequence);
                qVar.setSelection(0, qVar.getText().length());
            }
        }
        nVar.run();
        w1Var.o(frameLayout);
        w1Var.k(org.telegram.messenger.gd.M0(2131747638, null), new g2(16, ltVar, qVar));
        w1Var.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        if (z11) {
            this.b2 = u1Var;
            u1Var.setOnDismissListener(new y0(this, 5));
            this.b2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jt
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i7) {
                        case 0:
                            di.q qVar2 = qVar;
                            qVar2.requestFocus();
                            org.telegram.messenger.g0.I3(qVar2);
                            break;
                        default:
                            di.q qVar3 = qVar;
                            qVar3.requestFocus();
                            org.telegram.messenger.g0.I3(qVar3);
                            break;
                    }
                }
            });
            this.b2.r(250L);
        } else {
            w1Var.p().setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jt
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            di.q qVar2 = qVar;
                            qVar2.requestFocus();
                            org.telegram.messenger.g0.I3(qVar2);
                            break;
                        default:
                            di.q qVar3 = qVar;
                            qVar3.requestFocus();
                            org.telegram.messenger.g0.I3(qVar3);
                            break;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L2 = org.telegram.messenger.g0.L(24.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.height = org.telegram.messenger.g0.L(36.0f);
            qVar.setLayoutParams(marginLayoutParams);
        }
        qVar.setSelection(0, qVar.getText().length());
    }

    public void a(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        dz0 dz0Var = new dz0();
        dz0Var.a = i7;
        org.telegram.messenger.ri.f(new ez0(dz0Var, 0), i10, min, text, true);
        if ((i7 & 256) != 0) {
            h();
        }
        kt ktVar = this.T1;
        if (ktVar != null) {
            ktVar.g();
        }
    }

    public void b(int i7, int i10, int i11) {
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11) {
            return;
        }
        int min = Math.min(i11, text.length());
        int i12 = i7 & 256;
        if (i12 != 0) {
            i7 |= 512;
        }
        for (ez0 ez0Var : (ez0[]) text.getSpans(i10, min, ez0.class)) {
            dz0 dz0Var = ez0Var.b;
            int i13 = dz0Var.a;
            if ((i13 & i7) != 0) {
                int spanStart = text.getSpanStart(ez0Var);
                int spanEnd = text.getSpanEnd(ez0Var);
                text.removeSpan(ez0Var);
                if (spanStart < i10) {
                    text.setSpan(new ez0(new dz0(dz0Var), 0), spanStart, i10, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new ez0(new dz0(dz0Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i10);
                int min2 = Math.min(spanEnd, min);
                int i14 = i13 & (~i7);
                if (i14 != 0 && max < min2) {
                    dz0 dz0Var2 = new dz0(dz0Var);
                    dz0Var2.a = i14;
                    text.setSpan(new ez0(dz0Var2, 0), max, min2, 33);
                }
            }
        }
        if (i12 != 0) {
            h();
        }
        kt ktVar = this.T1;
        if (ktVar != null) {
            ktVar.g();
        }
    }

    public int c(int i7, int i10) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i7);
        int min = Math.min(i10, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        ez0[] ez0VarArr = (ez0[]) text.getSpans(max, min, ez0.class);
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = d2[i12];
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < ez0VarArr.length; i15++) {
                    ez0 ez0Var = ez0VarArr[i15];
                    int i16 = ez0Var.b.a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(ez0Var);
                        int spanEnd = text.getSpanEnd(ez0VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            z10 = true;
                            i14 = spanEnd;
                        }
                    }
                }
            }
            if (i14 >= min) {
                i11 |= i13;
            }
        }
        return i11;
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.W1;
    }

    public String getCaption() {
        return this.M1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.E == this.a2) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Jd, this.Z1);
            this.a2 = w02;
            this.E = w02;
        }
        canvas.save();
        canvas.translate(0.0f, this.P);
        super.onDraw(canvas);
        try {
            if (this.N1 != null && this.P1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.S1);
                canvas.save();
                canvas.translate(this.Q1, this.R1);
                this.N1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.O1 == null || length() == 0 || (layout = getLayout()) == null || layout.getLineCount() <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.O1.c(layout.getLineRight(0), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, this.S1, canvas2);
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.c cVar = new s0.c(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.M1)) {
            cVar.l(this.M1);
        }
        ArrayList d = cVar.d();
        int size = d.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            s0.b bVar = (s0.b) d.get(i7);
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.a).getId() == 268435456) {
                cVar.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.a);
                break;
            }
            i7++;
        }
        if (hasSelection()) {
            cVar.b(new s0.b(null, R.id.menu_spoiler, org.telegram.messenger.gd.M0(2131745027, null), null));
            cVar.b(new s0.b(null, R.id.menu_bold, org.telegram.messenger.gd.M0(2131753669, null), null));
            cVar.b(new s0.b(null, R.id.menu_italic, org.telegram.messenger.gd.M0(2131748895, null), null));
            cVar.b(new s0.b(null, R.id.menu_mono, org.telegram.messenger.gd.M0(2131748158, null), null));
            cVar.b(new s0.b(null, R.id.menu_strike, org.telegram.messenger.gd.M0(2131744202, null), null));
            cVar.b(new s0.b(null, R.id.menu_underline, org.telegram.messenger.gd.M0(2131743652, null), null));
            cVar.b(new s0.b(null, R.id.menu_link, org.telegram.messenger.gd.M0(2131751733, null), null));
            cVar.b(new s0.b(null, R.id.menu_regular, org.telegram.messenger.gd.M0(2131746142, null), null));
            cVar.b(new s0.b(null, R.id.menu_date, org.telegram.messenger.gd.M0(2131750574, null), null));
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        int indexOf;
        try {
            this.Y1 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i7, i10);
            if (this.Y1) {
                this.X1 = getLineCount();
            }
            this.Y1 = false;
        } catch (Exception e10) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(51.0f));
            org.telegram.messenger.a8.g(e10, true);
        }
        this.N1 = null;
        String str = this.M1;
        if (str == null || str.length() <= 0) {
            return;
        }
        Editable text = getText();
        if (text.length() <= 1 || text.charAt(0) != '@' || (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) == -1) {
            return;
        }
        TextPaint paint = getPaint();
        CharSequence subSequence = text.subSequence(0, indexOf + 1);
        int ceil = (int) Math.ceil(paint.measureText(text, 0, r14));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.P1 = subSequence.length();
        int i11 = measuredWidth - ceil;
        CharSequence ellipsize = TextUtils.ellipsize(this.M1, paint, i11, TextUtils.TruncateAt.END);
        this.Q1 = ceil;
        try {
            StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.N1 = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.Q1 = (int) (this.Q1 + (-this.N1.getLineLeft(0)));
            }
            this.R1 = ((getMeasuredHeight() - this.N1.getLineBottom(0)) / 2) + org.telegram.messenger.g0.L(0.5f);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bg.p.a(primaryClip.getItemAt(0).getHtmlText()));
                    org.telegram.messenger.j6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                    if (x5VarArr != null) {
                        for (x5 x5Var : x5VarArr) {
                            x5Var.applyFontMetrics(getPaint().getFontMetricsInt(), o5.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    gh0[] gh0VarArr = (gh0[]) getText().getSpans(max, min, gh0.class);
                    if (gh0VarArr == null || gh0VarArr.length <= 0) {
                        hh0.a(spannableStringBuilder);
                    } else {
                        gh0[] gh0VarArr2 = (gh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gh0.class);
                        for (int i10 = 0; i10 < gh0VarArr2.length; i10++) {
                            spannableStringBuilder.removeSpan(gh0VarArr2[i10]);
                            spannableStringBuilder.removeSpan(gh0VarArr2[i10].a);
                        }
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            try {
                if (i7 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.g0.g(getText().subSequence(max2, min2));
                    org.telegram.messenger.g0.W(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.y3 y3Var = this.Z0;
                    if (y3Var != null) {
                        y3Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                }
                if (i7 == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.g0.g(getText().subSequence(max3, min3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (max3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, max3));
                    }
                    if (min3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(min3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(max3, max3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        try {
            super.onWindowFocusChanged(z10);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return H(i7) || super.performAccessibilityAction(i7, bundle);
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.W1 = z10;
    }

    public void setCaption(String str) {
        String str2 = this.M1;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        String str3 = this.M1;
        if (str3 == null || !str3.equals(str)) {
            this.M1 = str;
            if (str != null) {
                this.M1 = str.replace('\n', ' ');
            }
            requestLayout();
        }
    }

    public void setDelegate(kt ktVar) {
        this.T1 = ktVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i7) {
        super.setHintColor(i7);
        this.S1 = i7;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.O1 = new vy0(charSequence, 16.0f, getTypeface());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.g9(new org.telegram.ui.Cells.f9(this, callback), callback));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        return super.startActionMode(new org.telegram.ui.Cells.g9(new org.telegram.ui.Cells.f9(this, callback), callback), i7);
    }

    public void E() {
    }

    public void F() {
    }

    public void G(int i7, int i10) {
    }
}
