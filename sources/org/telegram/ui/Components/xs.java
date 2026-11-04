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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class xs extends EditTextBoldCursor implements org.telegram.ui.ActionBar.j4 {
    public static final int[] Y1 = {1, 2, 4, 8, 16, 256, TLObject.FLAG_14, 32768};
    public String H1;
    public StaticLayout I1;
    public ly0 J1;
    public int K1;
    public int L1;
    public int M1;
    public int N1;
    public vs O1;
    public int P1;
    public int Q1;
    public boolean R1;
    public int S1;
    public boolean T1;
    public final org.telegram.ui.ActionBar.e6 U1;
    public int V1;
    public org.telegram.ui.ActionBar.s1 W1;
    public boolean X1;

    public xs(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.P1 = -1;
        this.Q1 = -1;
        this.U1 = e6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gd, e6Var);
        this.V1 = w02;
        this.E = w02;
        addTextChangedListener(new bh.h(this, 17));
        setClipToPadding(true);
    }

    public x31 A(String str) {
        return new x31(str, null);
    }

    public final void B() {
        int selectionEnd;
        int i3 = this.P1;
        if (i3 < 0 || (selectionEnd = this.Q1) < 0) {
            i3 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.Q1 = -1;
            this.P1 = -1;
        }
        Context context = getContext();
        ci.m0 m0Var = new ci.m0(this, i3, selectionEnd);
        go goVar = new go(2);
        Pattern pattern = t4.a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.U1;
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        int f10 = e6Var != null ? e6Var.f(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        int f11 = e6Var != null ? e6Var.f(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.xj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Bj;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        if (e6Var != null) {
            e6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.Ci;
        if (e6Var != null) {
            e6Var.f(i18);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.k6.Ei;
        if (e6Var != null) {
            e6Var.f(i19);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        }
        hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.b).w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i20 = calendar.get(1);
        cb0 cb0Var = new cb0(context, e6Var);
        cb0Var.setTextColor(f10);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        cb0Var.setMinValue(1);
        cb0Var.setMaxValue(31);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new a3(3));
        cb0 cb0Var2 = new cb0(context, e6Var);
        cb0Var2.setTextColor(f10);
        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        cb0Var2.setItemCount(5);
        cb0Var2.setMinValue(0);
        cb0Var2.setMaxValue(org.telegram.messenger.hs.O3);
        cb0Var2.setValue(120);
        cb0Var2.setWrapSelectorWheel(false);
        int i21 = 5;
        cb0Var2.setFormatter(new k2.q(calendar, i20, i21));
        cb0 cb0Var3 = new cb0(context, e6Var);
        cb0Var3.setContentDescriptionCallback(new bi.x(i21));
        cb0Var3.setWrapSelectorWheel(true);
        cb0Var3.setAllItemsCount(24);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextColor(f10);
        cb0Var3.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var3.setMinValue(0);
        cb0Var3.setMaxValue(23);
        cb0Var3.setFormatter(new a3(4));
        cb0 cb0Var4 = new cb0(context, e6Var);
        cb0Var4.setContentDescriptionCallback(new bi.x(6));
        cb0Var4.setWrapSelectorWheel(true);
        cb0Var4.setAllItemsCount(60);
        cb0Var4.setItemCount(5);
        cb0Var4.setTextColor(f10);
        cb0Var4.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        cb0Var4.setMinValue(0);
        cb0Var4.setMaxValue(59);
        cb0Var4.setValue(0);
        cb0Var4.setFormatter(new a3(5));
        calendar.setTimeInMillis(currentTimeMillis);
        cb0Var4.setValue(calendar.get(12));
        cb0Var3.setValue(calendar.get(11));
        cb0Var.setValue(calendar.get(5));
        cb0Var2.setValue(calendar.get(2) + 120);
        ly0 ly0Var = new ly0(org.telegram.messenger.bd.a0(null, null, 2131742793, "", "").trim(), 16.0f, null);
        ly0Var.p(org.telegram.messenger.g0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        ly0Var.m(1);
        ly0Var.n(f10);
        ly0 ly0Var2 = new ly0(":", 18.0f, null);
        ly0Var2.p(org.telegram.messenger.g0.L(100.0f));
        ly0Var2.a();
        ly0Var2.m(1);
        ly0Var2.a.setColor(f10);
        FrameLayout frameLayout = new FrameLayout(context);
        w3 w3Var = new w3(context, cb0Var2, cb0Var, cb0Var3, cb0Var4);
        w3Var.setOrientation(1);
        frameLayout.addView(w3Var, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        w3Var.addView(frameLayout2, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131746344, null));
        textView.setTextColor(f10);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout2.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        gi.y4 y4Var = new gi.y4(context, ly0Var2, cb0Var4);
        y4Var.setOrientation(0);
        y4Var.setWeightSum(1.0f);
        w3Var.addView(y4Var, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        gi.d dVar2 = new gi.d(context, e6Var, true);
        ci.r6 r6Var = new ci.r6(dVar2, cb0Var, cb0Var2, cb0Var3, cb0Var4);
        y4Var.addView(cb0Var, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
        y4Var.addView(cb0Var2, b8.mf.l(0.4f, 0, org.telegram.messenger.hs.t4));
        y4Var.addView(cb0Var3, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
        y4Var.addView(cb0Var4, b8.mf.l(0.2f, 0, org.telegram.messenger.hs.t4));
        cb0Var.setOnValueChangedListener(r6Var);
        cb0Var2.setOnValueChangedListener(r6Var);
        cb0Var3.setOnValueChangedListener(r6Var);
        cb0Var4.setOnValueChangedListener(r6Var);
        boolean[] zArr = {true};
        dVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        dVar2.f();
        w3Var.addView(dVar2, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        dVar2.setOnClickListener(new b3(zArr, cb0Var, cb0Var2, cb0Var3, cb0Var4, m0Var, new int[1], dVar));
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
        t2Var.O = frameLayout;
        t2Var.show();
        t2Var.setOnDismissListener(new c2(1, goVar, zArr));
        t2Var.v0(f11);
        t2Var.O(f11);
        t4.c(dVar2, cb0Var, cb0Var2, cb0Var3, cb0Var4);
    }

    public final void C(mi.b bVar) {
        int selectionEnd;
        int i3 = this.P1;
        if (i3 < 0 || (selectionEnd = this.Q1) < 0) {
            i3 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.Q1 = -1;
            this.P1 = -1;
        }
        H(org.telegram.messenger.bd.M0(2131751745, null), org.telegram.messenger.bd.M0(2131743927, null), "http://", true, this.X1, new o4.r0(this, i3, selectionEnd, bVar));
    }

    public final boolean G(int i3) {
        int selectionEnd;
        int selectionEnd2;
        if (i3 == R.id.menu_regular) {
            z(null);
            return true;
        }
        if (i3 == R.id.menu_bold) {
            ty0 ty0Var = new ty0();
            ty0Var.a |= 1;
            z(new uy0(ty0Var, 0));
            return true;
        }
        int i10 = 2;
        if (i3 == R.id.menu_italic) {
            ty0 ty0Var2 = new ty0();
            ty0Var2.a |= 2;
            z(new uy0(ty0Var2, 0));
            return true;
        }
        if (i3 == R.id.menu_mono) {
            ty0 ty0Var3 = new ty0();
            ty0Var3.a |= 4;
            z(new uy0(ty0Var3, 0));
            return true;
        }
        if (i3 == R.id.menu_link) {
            C(null);
            return true;
        }
        if (i3 == R.id.menu_strike) {
            ty0 ty0Var4 = new ty0();
            ty0Var4.a |= 8;
            z(new uy0(ty0Var4, 0));
            return true;
        }
        if (i3 == R.id.menu_underline) {
            ty0 ty0Var5 = new ty0();
            ty0Var5.a |= 16;
            z(new uy0(ty0Var5, 0));
            return true;
        }
        if (i3 == R.id.menu_spoiler) {
            ty0 ty0Var6 = new ty0();
            ty0Var6.a |= 256;
            z(new uy0(ty0Var6, 0));
            h();
            return true;
        }
        if (i3 == R.id.menu_quote) {
            int i11 = this.P1;
            if (i11 < 0 || (selectionEnd2 = this.Q1) < 0) {
                i11 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            } else {
                this.Q1 = -1;
                this.P1 = -1;
            }
            int c2 = xg0.c(getText(), i11, selectionEnd2, false);
            if (c2 >= 0) {
                setSelection(c2);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        }
        if (i3 == R.id.menu_date) {
            B();
            return true;
        }
        if (i3 != R.id.menu_translate) {
            return false;
        }
        int i12 = this.P1;
        if (i12 < 0 || (selectionEnd = this.Q1) < 0) {
            i12 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.Q1 = -1;
            this.P1 = -1;
        }
        CharSequence subSequence = getText().subSequence(i12, selectionEnd);
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = T != null ? T.getResourceProvider() : null;
        q21 q21Var = new q21(context, null, false, false, 2, resourceProvider);
        org.telegram.ui.ActionBar.e6 e6Var = resourceProvider;
        q21Var.Z1 = 1;
        q21Var.a2 = new String[]{"formal", "neutral", "casual"};
        q21Var.b2 = new String[]{"Formal", "Neutral", "Casual"};
        q21Var.d2 = true;
        q21Var.e2 = -1;
        ImageView imageView = new ImageView(context);
        q21Var.Q1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i13, q21Var.J0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var);
        q21Var.m1.addView(imageView, b8.mf.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        b8.pf.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new h21(q21Var, i10));
        String M0 = f21.M0();
        q21Var.Y1 = M0;
        if (M0 == null) {
            q21Var.Y1 = org.telegram.messenger.x00.j();
        }
        q21Var.D1 = false;
        q21Var.C1 = org.telegram.messenger.g0.L(12.0f);
        int i14 = org.telegram.ui.ActionBar.k6.a7;
        q21Var.v0(org.telegram.ui.ActionBar.k6.w0(i14, q21Var.J0));
        FrameLayout frameLayout = new FrameLayout(context);
        q21Var.R1 = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i14, q21Var.J0)), org.telegram.ui.ActionBar.k6.w0(i14, q21Var.J0), org.telegram.ui.ActionBar.k6.w0(i14, q21Var.J0)}));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.setRoundRadius(24);
        q21Var.S1 = dVar;
        dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
        FrameLayout.LayoutParams d = b8.mf.d(-1, 48.0f, org.telegram.messenger.hs.E1, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = d.leftMargin;
        int i16 = q21Var.u0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        frameLayout.addView(dVar, d);
        q21Var.b.addView(frameLayout, b8.mf.e(-1, -2, 80));
        int i17 = q21Var.u0;
        int L2 = org.telegram.messenger.g0.L(66.0f);
        tj0 tj0Var = q21Var.l1;
        tj0Var.setPadding(i17, 0, i17, L2);
        tj0Var.setClipToPadding(false);
        tj0Var.r1();
        int i18 = 15;
        tj0Var.setOnItemClickListener(new ei.q4(i18, q21Var, e6Var));
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        tj0Var.setItemAnimator(kVar);
        q21Var.c2.O(false);
        q21Var.T1 = subSequence;
        org.telegram.messenger.b6.d(subSequence.toString(), new zw(q21Var, 24), new lf0(i18), false);
        q21Var.W1 = new ts(this, i12, selectionEnd);
        q21Var.show();
        setSelection(i12, selectionEnd);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void H(String str, String str2, String str3, boolean z10, boolean z11, ws wsVar) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.e6 e6Var = this.U1;
        final int i3 = 0;
        ?? u1Var = z11 ? new org.telegram.ui.ActionBar.u1(0, getContext(), e6Var) : new AlertDialog$Builder(0, getContext(), e6Var);
        org.telegram.ui.ActionBar.s1 s1Var = u1Var.a;
        s1Var.S = str;
        ?? frameLayout = new FrameLayout(getContext());
        final ci.s sVar = new ci.s(getContext(), 4);
        String str4 = str3 == null ? "" : str3;
        final int i10 = 1;
        sVar.setTextSize(1, 18.0f);
        sVar.setText(str4);
        org.telegram.ui.ActionBar.r6.V(sVar, org.telegram.ui.ActionBar.k6.j5, e6Var);
        sVar.setHintText(str2);
        org.telegram.ui.ActionBar.r6.m(sVar, 35, org.telegram.ui.ActionBar.k6.L6, e6Var);
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        sVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.r6.G(sVar, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.requestFocus();
        sVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.r6.D(sVar, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(sVar, 36, org.telegram.ui.ActionBar.k6.jg, e6Var);
        frameLayout.addView(sVar, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131747443, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.k6.o6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i11);
        org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, L2, L3, e6Var);
        b8.pf.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, b8.mf.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        gi.q1 q1Var = new gi.q1(this, z10, sVar, str4, textView);
        textView.setOnClickListener(new ai.h(this, sVar, q1Var, 29));
        sVar.addTextChangedListener(new bh.h(q1Var, 18));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                charSequence = null;
            }
            if (charSequence != null) {
                sVar.setText(charSequence);
                sVar.setSelection(0, sVar.getText().length());
            }
        }
        q1Var.run();
        u1Var.o(frameLayout);
        u1Var.k(org.telegram.messenger.bd.M0(2131747839, null), new org.telegram.ui.jo(23, wsVar, sVar));
        u1Var.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        if (z11) {
            this.W1 = s1Var;
            s1Var.setOnDismissListener(new p0(this, 6));
            this.W1.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.us
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i3) {
                        case 0:
                            ci.s sVar2 = sVar;
                            sVar2.requestFocus();
                            org.telegram.messenger.g0.K3(sVar2);
                            break;
                        default:
                            ci.s sVar3 = sVar;
                            sVar3.requestFocus();
                            org.telegram.messenger.g0.K3(sVar3);
                            break;
                    }
                }
            });
            this.W1.r(250L);
        } else {
            u1Var.p().setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.us
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            ci.s sVar2 = sVar;
                            sVar2.requestFocus();
                            org.telegram.messenger.g0.K3(sVar2);
                            break;
                        default:
                            ci.s sVar3 = sVar;
                            sVar3.requestFocus();
                            org.telegram.messenger.g0.K3(sVar3);
                            break;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L4 = org.telegram.messenger.g0.L(24.0f);
            marginLayoutParams.leftMargin = L4;
            marginLayoutParams.rightMargin = L4;
            marginLayoutParams.height = org.telegram.messenger.g0.L(36.0f);
            sVar.setLayoutParams(marginLayoutParams);
        }
        sVar.setSelection(0, sVar.getText().length());
    }

    public void a(int i3, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        ty0 ty0Var = new ty0();
        ty0Var.a = i3;
        org.telegram.messenger.li.f(new uy0(ty0Var, 0), i10, min, text, true);
        if ((i3 & 256) != 0) {
            h();
        }
        vs vsVar = this.O1;
        if (vsVar != null) {
            vsVar.m();
        }
    }

    public void b(int i3, int i10, int i11) {
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11) {
            return;
        }
        int min = Math.min(i11, text.length());
        int i12 = i3 & 256;
        if (i12 != 0) {
            i3 |= 512;
        }
        for (uy0 uy0Var : (uy0[]) text.getSpans(i10, min, uy0.class)) {
            ty0 ty0Var = uy0Var.b;
            int i13 = ty0Var.a;
            if ((i13 & i3) != 0) {
                int spanStart = text.getSpanStart(uy0Var);
                int spanEnd = text.getSpanEnd(uy0Var);
                text.removeSpan(uy0Var);
                if (spanStart < i10) {
                    text.setSpan(new uy0(new ty0(ty0Var), 0), spanStart, i10, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new uy0(new ty0(ty0Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i10);
                int min2 = Math.min(spanEnd, min);
                int i14 = i13 & (~i3);
                if (i14 != 0 && max < min2) {
                    ty0 ty0Var2 = new ty0(ty0Var);
                    ty0Var2.a = i14;
                    text.setSpan(new uy0(ty0Var2, 0), max, min2, 33);
                }
            }
        }
        if (i12 != 0) {
            h();
        }
        vs vsVar = this.O1;
        if (vsVar != null) {
            vsVar.m();
        }
    }

    public int c(int i3, int i10) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i3);
        int min = Math.min(i10, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        uy0[] uy0VarArr = (uy0[]) text.getSpans(max, min, uy0.class);
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = Y1[i12];
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < uy0VarArr.length; i15++) {
                    uy0 uy0Var = uy0VarArr[i15];
                    int i16 = uy0Var.b.a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(uy0Var);
                        int spanEnd = text.getSpanEnd(uy0VarArr[i15]);
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
        return this.R1;
    }

    public String getCaption() {
        return this.H1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.E == this.V1) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gd, this.U1);
            this.V1 = w02;
            this.E = w02;
        }
        canvas.save();
        canvas.translate(0.0f, this.P);
        super.onDraw(canvas);
        try {
            if (this.I1 != null && this.K1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.N1);
                canvas.save();
                canvas.translate(this.L1, this.M1);
                this.I1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.J1 == null || length() == 0 || (layout = getLayout()) == null || layout.getLineCount() <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.J1.c(layout.getLineRight(0), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, this.N1, canvas2);
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.d dVar = new s0.d(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.H1)) {
            dVar.l(this.H1);
        }
        ArrayList d = dVar.d();
        int size = d.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s0.c cVar = (s0.c) d.get(i3);
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.a).getId() == 268435456) {
                dVar.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.a);
                break;
            }
            i3++;
        }
        if (hasSelection()) {
            dVar.b(new s0.c(null, R.id.menu_spoiler, org.telegram.messenger.bd.M0(2131745272, null), null));
            dVar.b(new s0.c(null, R.id.menu_bold, org.telegram.messenger.bd.M0(2131753671, null), null));
            dVar.b(new s0.c(null, R.id.menu_italic, org.telegram.messenger.bd.M0(2131749095, null), null));
            dVar.b(new s0.c(null, R.id.menu_mono, org.telegram.messenger.bd.M0(2131748358, null), null));
            dVar.b(new s0.c(null, R.id.menu_strike, org.telegram.messenger.bd.M0(2131744447, null), null));
            dVar.b(new s0.c(null, R.id.menu_underline, org.telegram.messenger.bd.M0(2131743899, null), null));
            dVar.b(new s0.c(null, R.id.menu_link, org.telegram.messenger.bd.M0(2131751745, null), null));
            dVar.b(new s0.c(null, R.id.menu_regular, org.telegram.messenger.bd.M0(2131746345, null), null));
            dVar.b(new s0.c(null, R.id.menu_date, org.telegram.messenger.bd.M0(2131750591, null), null));
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        int indexOf;
        try {
            this.T1 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i3, i10);
            if (this.T1) {
                this.S1 = getLineCount();
            }
            this.T1 = false;
        } catch (Exception e10) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(51.0f));
            org.telegram.messenger.a8.g(e10, true);
        }
        this.I1 = null;
        String str = this.H1;
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
        this.K1 = subSequence.length();
        int i11 = measuredWidth - ceil;
        CharSequence ellipsize = TextUtils.ellipsize(this.H1, paint, i11, TextUtils.TruncateAt.END);
        this.L1 = ceil;
        try {
            StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.I1 = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.L1 = (int) (this.L1 + (-this.I1.getLineLeft(0)));
            }
            this.M1 = ((getMeasuredHeight() - this.I1.getLineBottom(0)) / 2) + org.telegram.messenger.g0.L(0.5f);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i3) {
        if (i3 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cg.n.a(primaryClip.getItemAt(0).getHtmlText()));
                    org.telegram.messenger.i6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    p5[] p5VarArr = (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class);
                    if (p5VarArr != null) {
                        for (p5 p5Var : p5VarArr) {
                            p5Var.applyFontMetrics(getPaint().getFontMetricsInt(), g5.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    wg0[] wg0VarArr = (wg0[]) getText().getSpans(max, min, wg0.class);
                    if (wg0VarArr == null || wg0VarArr.length <= 0) {
                        xg0.a(spannableStringBuilder);
                    } else {
                        wg0[] wg0VarArr2 = (wg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wg0.class);
                        for (int i10 = 0; i10 < wg0VarArr2.length; i10++) {
                            spannableStringBuilder.removeSpan(wg0VarArr2[i10]);
                            spannableStringBuilder.removeSpan(wg0VarArr2[i10].a);
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
                if (i3 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.g0.g(getText().subSequence(max2, min2));
                    org.telegram.messenger.g0.W(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.u3 u3Var = this.Z0;
                    if (u3Var != null) {
                        u3Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                }
                if (i3 == 16908320) {
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
        return super.onTextContextMenuItem(i3);
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
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        return G(i3) || super.performAccessibilityAction(i3, bundle);
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.R1 = z10;
    }

    public void setCaption(String str) {
        String str2 = this.H1;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        String str3 = this.H1;
        if (str3 == null || !str3.equals(str)) {
            this.H1 = str;
            if (str != null) {
                this.H1 = str.replace('\n', ' ');
            }
            requestLayout();
        }
    }

    public void setDelegate(vs vsVar) {
        this.O1 = vsVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i3) {
        super.setHintColor(i3);
        this.N1 = i3;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.J1 = new ly0(charSequence, 16.0f, getTypeface());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.f9(new org.telegram.ui.Cells.e9(this, callback), callback));
    }

    public final void z(uy0 uy0Var) {
        int selectionEnd;
        int i3 = this.P1;
        if (i3 < 0 || (selectionEnd = this.Q1) < 0) {
            i3 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.Q1 = -1;
            this.P1 = -1;
        }
        org.telegram.messenger.li.f(uy0Var, i3, selectionEnd, getText(), this.R1);
        if (uy0Var == null) {
            Editable text = getText();
            for (oi.h hVar : (oi.h[]) text.getSpans(i3, selectionEnd, oi.h.class)) {
                text.removeSpan(hVar);
            }
            xg0[] xg0VarArr = (xg0[]) text.getSpans(i3, selectionEnd, xg0.class);
            for (int i10 = 0; i10 < xg0VarArr.length; i10++) {
                text.removeSpan(xg0VarArr[i10]);
                text.removeSpan(xg0VarArr[i10].s);
                mi.x5 x5Var = xg0VarArr[i10].w;
                if (x5Var != null) {
                    text.removeSpan(x5Var);
                }
            }
            if (xg0VarArr.length > 0) {
                g(true);
            }
        }
        vs vsVar = this.O1;
        if (vsVar != null) {
            vsVar.m();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
        return super.startActionMode(new org.telegram.ui.Cells.f9(new org.telegram.ui.Cells.e9(this, callback), callback), i3);
    }

    public void D() {
    }

    public void E() {
    }

    public void F(int i3, int i10) {
    }
}
