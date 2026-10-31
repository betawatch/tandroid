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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class mt extends EditTextBoldCursor implements org.telegram.ui.ActionBar.r4 {
    public static final int[] X1 = {1, 2, 4, 8, 16, 256, TLObject.FLAG_14, 32768};
    public String G1;
    public StaticLayout H1;
    public qz0 I1;
    public int J1;
    public int K1;
    public int L1;
    public int M1;
    public kt N1;
    public int O1;
    public int P1;
    public boolean Q1;
    public int R1;
    public boolean S1;
    public final org.telegram.ui.ActionBar.p6 T1;
    public int U1;
    public org.telegram.ui.ActionBar.x1 V1;
    public boolean W1;

    public mt(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.O1 = -1;
        this.P1 = -1;
        this.T1 = p6Var;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gd, p6Var);
        this.U1 = w02;
        this.D = w02;
        addTextChangedListener(new ag.a1(this, 12));
        setClipToPadding(true);
    }

    public g51 A(String str) {
        return new g51(str, null);
    }

    public final void B() {
        int selectionEnd;
        int i10 = this.O1;
        if (i10 < 0 || (selectionEnd = this.P1) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.P1 = -1;
            this.O1 = -1;
        }
        Context context = getContext();
        ht htVar = new ht(this, i10, selectionEnd);
        org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(19);
        Pattern pattern = s4.a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.T1;
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        int f7 = p6Var != null ? p6Var.f(i11) : org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.t6.h5;
        int f10 = p6Var != null ? p6Var.f(i12) : org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.t6.xj;
        if (p6Var != null) {
            p6Var.f(i13);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.t6.Bj;
        if (p6Var != null) {
            p6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.t6.E8;
        if (p6Var != null) {
            p6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.t6.G8;
        if (p6Var != null) {
            p6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.t6.i6;
        if (p6Var != null) {
            p6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.t6.Gi;
        if (p6Var != null) {
            p6Var.f(i18);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.t6.Ci;
        if (p6Var != null) {
            p6Var.f(i19);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.t6.Ei;
        if (p6Var != null) {
            p6Var.f(i20);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i20, false);
        }
        l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.b).v0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i21 = calendar.get(1);
        ac0 ac0Var = new ac0(context, p6Var);
        ac0Var.setTextColor(f7);
        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var.setItemCount(5);
        ac0Var.setMinValue(1);
        ac0Var.setMaxValue(31);
        ac0Var.setWrapSelectorWheel(false);
        ac0Var.setFormatter(new v1(20));
        ac0 ac0Var2 = new ac0(context, p6Var);
        ac0Var2.setTextColor(f7);
        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        ac0Var2.setItemCount(5);
        ac0Var2.setMinValue(0);
        ac0Var2.setMaxValue(org.telegram.messenger.zs.O3);
        ac0Var2.setValue(120);
        ac0Var2.setWrapSelectorWheel(false);
        ac0Var2.setFormatter(new i2.q(calendar, i21, 6));
        ac0 ac0Var3 = new ac0(context, p6Var);
        ac0Var3.setContentDescriptionCallback(new org.telegram.ui.zh(2));
        ac0Var3.setWrapSelectorWheel(true);
        ac0Var3.setAllItemsCount(24);
        ac0Var3.setItemCount(5);
        ac0Var3.setTextColor(f7);
        ac0Var3.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var3.setMinValue(0);
        ac0Var3.setMaxValue(23);
        ac0Var3.setFormatter(new v1(21));
        ac0 ac0Var4 = new ac0(context, p6Var);
        ac0Var4.setContentDescriptionCallback(new org.telegram.ui.zh(3));
        ac0Var4.setWrapSelectorWheel(true);
        ac0Var4.setAllItemsCount(60);
        ac0Var4.setItemCount(5);
        ac0Var4.setTextColor(f7);
        ac0Var4.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        ac0Var4.setMinValue(0);
        ac0Var4.setMaxValue(59);
        ac0Var4.setValue(0);
        ac0Var4.setFormatter(new v1(22));
        calendar.setTimeInMillis(currentTimeMillis);
        ac0Var4.setValue(calendar.get(12));
        ac0Var3.setValue(calendar.get(11));
        ac0Var.setValue(calendar.get(5));
        ac0Var2.setValue(calendar.get(2) + 120);
        qz0 qz0Var = new qz0(org.telegram.messenger.cd.a0(null, null, 2131742808, "", "").trim(), 16.0f, null);
        qz0Var.p(org.telegram.messenger.i0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qz0Var.a();
        qz0Var.m(1);
        qz0Var.n(f7);
        qz0 qz0Var2 = new qz0(":", 18.0f, null);
        qz0Var2.p(org.telegram.messenger.i0.L(100.0f));
        qz0Var2.a();
        qz0Var2.m(1);
        qz0Var2.a.setColor(f7);
        FrameLayout frameLayout = new FrameLayout(context);
        mg.o oVar = new mg.o(context, ac0Var2, ac0Var, ac0Var3, ac0Var4);
        oVar.setOrientation(1);
        frameLayout.addView(oVar, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        oVar.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131746351, null));
        textView.setTextColor(f7);
        sc.e.t(textView, 1, 20.0f);
        frameLayout2.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        jg.d0 d0Var = new jg.d0(context, qz0Var2, ac0Var4);
        d0Var.setOrientation(0);
        d0Var.setWeightSum(1.0f);
        oVar.addView(d0Var, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        vh.d dVar = new vh.d(context, p6Var, true);
        f1.a aVar = new f1.a(dVar, ac0Var, ac0Var2, ac0Var3, ac0Var4);
        d0Var.addView(ac0Var, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
        d0Var.addView(ac0Var2, w7.b6.l(0.4f, 0, org.telegram.messenger.zs.t4));
        d0Var.addView(ac0Var3, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
        d0Var.addView(ac0Var4, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
        ac0Var.setOnValueChangedListener(aVar);
        ac0Var2.setOnValueChangedListener(aVar);
        ac0Var3.setOnValueChangedListener(aVar);
        ac0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        dVar.f();
        oVar.addView(dVar, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new b3(zArr, ac0Var, ac0Var2, ac0Var3, ac0Var4, htVar, new int[1], fVar));
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
        z2Var.N = frameLayout;
        z2Var.show();
        z2Var.setOnDismissListener(new d2(1, rzVar, zArr));
        z2Var.v0(f10);
        z2Var.P(f10);
        s4.c(dVar, ac0Var, ac0Var2, ac0Var3, ac0Var4);
    }

    public final void C(bi.b bVar) {
        int selectionEnd;
        int i10 = this.O1;
        if (i10 < 0 || (selectionEnd = this.P1) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.P1 = -1;
            this.O1 = -1;
        }
        H(org.telegram.messenger.cd.L0(2131751745, null), org.telegram.messenger.cd.L0(2131743942, null), "http://", true, this.W1, new m4.s0(this, i10, selectionEnd, bVar));
    }

    public final boolean G(int i10) {
        int selectionEnd;
        int selectionEnd2;
        int i11 = 1;
        if (i10 == R.id.menu_regular) {
            z(null);
            return true;
        }
        if (i10 == R.id.menu_bold) {
            yz0 yz0Var = new yz0();
            yz0Var.a |= 1;
            z(new zz0(yz0Var, 0));
            return true;
        }
        int i12 = 2;
        if (i10 == R.id.menu_italic) {
            yz0 yz0Var2 = new yz0();
            yz0Var2.a |= 2;
            z(new zz0(yz0Var2, 0));
            return true;
        }
        if (i10 == R.id.menu_mono) {
            yz0 yz0Var3 = new yz0();
            yz0Var3.a |= 4;
            z(new zz0(yz0Var3, 0));
            return true;
        }
        if (i10 == R.id.menu_link) {
            C(null);
            return true;
        }
        if (i10 == R.id.menu_strike) {
            yz0 yz0Var4 = new yz0();
            yz0Var4.a |= 8;
            z(new zz0(yz0Var4, 0));
            return true;
        }
        if (i10 == R.id.menu_underline) {
            yz0 yz0Var5 = new yz0();
            yz0Var5.a |= 16;
            z(new zz0(yz0Var5, 0));
            return true;
        }
        if (i10 == R.id.menu_spoiler) {
            yz0 yz0Var6 = new yz0();
            yz0Var6.a |= 256;
            z(new zz0(yz0Var6, 0));
            h();
            return true;
        }
        if (i10 == R.id.menu_quote) {
            int i13 = this.O1;
            if (i13 < 0 || (selectionEnd2 = this.P1) < 0) {
                i13 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            } else {
                this.P1 = -1;
                this.O1 = -1;
            }
            int c10 = wh0.c(getText(), i13, selectionEnd2, false);
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
        if (i10 == R.id.menu_date) {
            B();
            return true;
        }
        if (i10 != R.id.menu_translate) {
            return false;
        }
        int i14 = this.O1;
        if (i14 < 0 || (selectionEnd = this.P1) < 0) {
            i14 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.P1 = -1;
            this.O1 = -1;
        }
        CharSequence subSequence = getText().subSequence(i14, selectionEnd);
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        Context context = getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = T != null ? T.getResourceProvider() : null;
        x31 x31Var = new x31(context, null, false, false, 2, resourceProvider);
        org.telegram.ui.ActionBar.p6 p6Var = resourceProvider;
        x31Var.Y1 = 1;
        x31Var.Z1 = new String[]{"formal", "neutral", "casual"};
        x31Var.a2 = new String[]{"Formal", "Neutral", "Casual"};
        x31Var.c2 = true;
        x31Var.d2 = -1;
        ImageView imageView = new ImageView(context);
        x31Var.P1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i15 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i15, p6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i15, x31Var.I0)), 1, -1);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i15);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var);
        x31Var.l1.addView(imageView, w7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o31(x31Var, i12));
        String M0 = m31.M0();
        x31Var.X1 = M0;
        if (M0 == null) {
            x31Var.X1 = org.telegram.messenger.t10.j();
        }
        x31Var.C1 = false;
        x31Var.B1 = org.telegram.messenger.i0.L(12.0f);
        int i16 = org.telegram.ui.ActionBar.t6.a7;
        x31Var.v0(org.telegram.ui.ActionBar.t6.w0(i16, x31Var.I0));
        FrameLayout frameLayout = new FrameLayout(context);
        x31Var.Q1 = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i16, x31Var.I0)), org.telegram.ui.ActionBar.t6.w0(i16, x31Var.I0), org.telegram.ui.ActionBar.t6.w0(i16, x31Var.I0)}));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setRoundRadius(24);
        x31Var.R1 = dVar;
        dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 12.0f, 6.0f, 12.0f, 12.0f);
        int i17 = d.leftMargin;
        int i18 = x31Var.t0;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        frameLayout.addView(dVar, d);
        x31Var.b.addView(frameLayout, w7.b6.e(-1, -2, 80));
        int i19 = x31Var.t0;
        int L2 = org.telegram.messenger.i0.L(66.0f);
        tk0 tk0Var = x31Var.k1;
        tk0Var.setPadding(i19, 0, i19, L2);
        tk0Var.setClipToPadding(false);
        tk0Var.r1();
        tk0Var.setOnItemClickListener(new mg.q0(14, x31Var, p6Var));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        tk0Var.setItemAnimator(jVar);
        x31Var.b2.O(false);
        x31Var.S1 = subSequence;
        org.telegram.messenger.js.d(subSequence.toString(), new px(x31Var, 24), new z11(i11), false);
        x31Var.V1 = new gt(this, i14, selectionEnd);
        x31Var.show();
        setSelection(i14, selectionEnd);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void H(String str, String str2, String str3, boolean z10, boolean z11, lt ltVar) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.p6 p6Var = this.T1;
        final int i10 = 0;
        ?? a2Var = z11 ? new org.telegram.ui.ActionBar.a2(0, getContext(), p6Var) : new AlertDialog$Builder(0, getContext(), p6Var);
        org.telegram.ui.ActionBar.x1 x1Var = a2Var.a;
        x1Var.R = str;
        ?? frameLayout = new FrameLayout(getContext());
        final int i11 = 1;
        final org.telegram.ui.zd zdVar = new org.telegram.ui.zd(getContext(), i11);
        String str4 = str3 == null ? "" : str3;
        zdVar.setTextSize(1, 18.0f);
        zdVar.setText(str4);
        org.telegram.ui.ActionBar.a7.V(zdVar, org.telegram.ui.ActionBar.t6.j5, p6Var);
        zdVar.setHintText(str2);
        org.telegram.ui.ActionBar.a7.m(zdVar, 35, org.telegram.ui.ActionBar.t6.L6, p6Var);
        zdVar.setSingleLine(true);
        zdVar.setFocusable(true);
        zdVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.a7.G(zdVar, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, p6Var);
        zdVar.setImeOptions(6);
        zdVar.setBackgroundDrawable(null);
        zdVar.requestFocus();
        zdVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.a7.D(zdVar, org.telegram.ui.ActionBar.t6.ig, p6Var);
        org.telegram.ui.ActionBar.a7.m(zdVar, 36, org.telegram.ui.ActionBar.t6.jg, p6Var);
        frameLayout.addView(zdVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.cd.L0(2131747451, null));
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.t6.o6;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
        int L = org.telegram.messenger.i0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.t6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i12);
        org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.15f, i12);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView, k02, L2, L3, p6Var);
        w7.e6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.b6.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        ag.n0 n0Var = new ag.n0(this, z10, zdVar, str4, textView, 8);
        int i13 = 14;
        textView.setOnClickListener(new ag.i(this, zdVar, n0Var, i13));
        zdVar.addTextChangedListener(new ag.a1(n0Var, 13));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                charSequence = null;
            }
            if (charSequence != null) {
                zdVar.setText(charSequence);
                zdVar.setSelection(0, zdVar.getText().length());
            }
        }
        n0Var.run();
        a2Var.o(frameLayout);
        a2Var.k(org.telegram.messenger.cd.L0(2131747847, null), new f2(i13, ltVar, zdVar));
        a2Var.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        if (z11) {
            this.V1 = x1Var;
            x1Var.setOnDismissListener(new r0(this, 6));
            this.V1.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jt
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            org.telegram.ui.zd zdVar2 = zdVar;
                            zdVar2.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar2);
                            break;
                        default:
                            org.telegram.ui.zd zdVar3 = zdVar;
                            zdVar3.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar3);
                            break;
                    }
                }
            });
            this.V1.r(250L);
        } else {
            a2Var.p().setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jt
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.zd zdVar2 = zdVar;
                            zdVar2.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar2);
                            break;
                        default:
                            org.telegram.ui.zd zdVar3 = zdVar;
                            zdVar3.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar3);
                            break;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zdVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L4 = org.telegram.messenger.i0.L(24.0f);
            marginLayoutParams.leftMargin = L4;
            marginLayoutParams.rightMargin = L4;
            marginLayoutParams.height = org.telegram.messenger.i0.L(36.0f);
            zdVar.setLayoutParams(marginLayoutParams);
        }
        zdVar.setSelection(0, zdVar.getText().length());
    }

    public void a(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        yz0 yz0Var = new yz0();
        yz0Var.a = i10;
        org.telegram.messenger.ui.f(new zz0(yz0Var, 0), i11, min, text, true);
        if ((i10 & 256) != 0) {
            h();
        }
        kt ktVar = this.N1;
        if (ktVar != null) {
            ktVar.m();
        }
    }

    public void b(int i10, int i11, int i12) {
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12) {
            return;
        }
        int min = Math.min(i12, text.length());
        int i13 = i10 & 256;
        if (i13 != 0) {
            i10 |= 512;
        }
        for (zz0 zz0Var : (zz0[]) text.getSpans(i11, min, zz0.class)) {
            yz0 yz0Var = zz0Var.b;
            int i14 = yz0Var.a;
            if ((i14 & i10) != 0) {
                int spanStart = text.getSpanStart(zz0Var);
                int spanEnd = text.getSpanEnd(zz0Var);
                text.removeSpan(zz0Var);
                if (spanStart < i11) {
                    text.setSpan(new zz0(new yz0(yz0Var), 0), spanStart, i11, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new zz0(new yz0(yz0Var), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i11);
                int min2 = Math.min(spanEnd, min);
                int i15 = i14 & (~i10);
                if (i15 != 0 && max < min2) {
                    yz0 yz0Var2 = new yz0(yz0Var);
                    yz0Var2.a = i15;
                    text.setSpan(new zz0(yz0Var2, 0), max, min2, 33);
                }
            }
        }
        if (i13 != 0) {
            h();
        }
        kt ktVar = this.N1;
        if (ktVar != null) {
            ktVar.m();
        }
    }

    public int c(int i10, int i11) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i10);
        int min = Math.min(i11, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        zz0[] zz0VarArr = (zz0[]) text.getSpans(max, min, zz0.class);
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = X1[i13];
            int i15 = max;
            boolean z10 = true;
            while (z10 && i15 < min) {
                z10 = false;
                for (int i16 = 0; i16 < zz0VarArr.length; i16++) {
                    zz0 zz0Var = zz0VarArr[i16];
                    int i17 = zz0Var.b.a;
                    if ((i17 & 512) != 0) {
                        i17 |= 256;
                    }
                    if ((i17 & i14) != 0) {
                        int spanStart = text.getSpanStart(zz0Var);
                        int spanEnd = text.getSpanEnd(zz0VarArr[i16]);
                        if (spanStart <= i15 && spanEnd > i15) {
                            z10 = true;
                            i15 = spanEnd;
                        }
                    }
                }
            }
            if (i15 >= min) {
                i12 |= i14;
            }
        }
        return i12;
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.Q1;
    }

    public String getCaption() {
        return this.G1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.D == this.U1) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gd, this.T1);
            this.U1 = w02;
            this.D = w02;
        }
        canvas.save();
        canvas.translate(0.0f, this.O);
        super.onDraw(canvas);
        try {
            if (this.H1 != null && this.J1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.M1);
                canvas.save();
                canvas.translate(this.K1, this.L1);
                this.H1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (this.I1 == null || length() == 0 || (layout = getLayout()) == null || layout.getLineCount() <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.I1.c(layout.getLineRight(0), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(1.0f), 1.0f, this.M1, canvas2);
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.c cVar = new s0.c(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.G1)) {
            cVar.l(this.G1);
        }
        ArrayList d = cVar.d();
        int size = d.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            s0.b bVar = (s0.b) d.get(i10);
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.a).getId() == 268435456) {
                cVar.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.a);
                break;
            }
            i10++;
        }
        if (hasSelection()) {
            cVar.b(new s0.b(null, R.id.menu_spoiler, org.telegram.messenger.cd.L0(2131745280, null), null));
            cVar.b(new s0.b(null, R.id.menu_bold, org.telegram.messenger.cd.L0(2131753671, null), null));
            cVar.b(new s0.b(null, R.id.menu_italic, org.telegram.messenger.cd.L0(2131749097, null), null));
            cVar.b(new s0.b(null, R.id.menu_mono, org.telegram.messenger.cd.L0(2131748365, null), null));
            cVar.b(new s0.b(null, R.id.menu_strike, org.telegram.messenger.cd.L0(2131744463, null), null));
            cVar.b(new s0.b(null, R.id.menu_underline, org.telegram.messenger.cd.L0(2131743914, null), null));
            cVar.b(new s0.b(null, R.id.menu_link, org.telegram.messenger.cd.L0(2131751745, null), null));
            cVar.b(new s0.b(null, R.id.menu_regular, org.telegram.messenger.cd.L0(2131746352, null), null));
            cVar.b(new s0.b(null, R.id.menu_date, org.telegram.messenger.cd.L0(2131750591, null), null));
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int indexOf;
        try {
            this.S1 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i10, i11);
            if (this.S1) {
                this.R1 = getLineCount();
            }
            this.S1 = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(51.0f));
            org.telegram.messenger.f8.g(e, true);
        }
        this.H1 = null;
        String str = this.G1;
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
        this.J1 = subSequence.length();
        int i12 = measuredWidth - ceil;
        CharSequence ellipsize = TextUtils.ellipsize(this.G1, paint, i12, TextUtils.TruncateAt.END);
        this.K1 = ceil;
        try {
            StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.H1 = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.K1 = (int) (this.K1 + (-this.H1.getLineLeft(0)));
            }
            this.L1 = ((getMeasuredHeight() - this.H1.getLineBottom(0)) / 2) + org.telegram.messenger.i0.L(0.5f);
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rf.k.a(primaryClip.getItemAt(0).getHtmlText()));
                    org.telegram.messenger.k6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    o5[] o5VarArr = (o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o5.class);
                    if (o5VarArr != null) {
                        for (o5 o5Var : o5VarArr) {
                            o5Var.applyFontMetrics(getPaint().getFontMetricsInt(), f5.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    vh0[] vh0VarArr = (vh0[]) getText().getSpans(max, min, vh0.class);
                    if (vh0VarArr == null || vh0VarArr.length <= 0) {
                        wh0.a(spannableStringBuilder);
                    } else {
                        vh0[] vh0VarArr2 = (vh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vh0.class);
                        for (int i11 = 0; i11 < vh0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(vh0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(vh0VarArr2[i11].a);
                        }
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else {
            try {
                if (i10 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.i0.g(getText().subSequence(max2, min2));
                    org.telegram.messenger.i0.W(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.d4 d4Var = this.Y0;
                    if (d4Var != null) {
                        d4Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                }
                if (i10 == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.i0.g(getText().subSequence(max3, min3));
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
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        try {
            super.onWindowFocusChanged(z10);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return G(i10) || super.performAccessibilityAction(i10, bundle);
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.Q1 = z10;
    }

    public void setCaption(String str) {
        String str2 = this.G1;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        String str3 = this.G1;
        if (str3 == null || !str3.equals(str)) {
            this.G1 = str;
            if (str != null) {
                this.G1 = str.replace('\n', ' ');
            }
            requestLayout();
        }
    }

    public void setDelegate(kt ktVar) {
        this.N1 = ktVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.M1 = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.I1 = new qz0(charSequence, 16.0f, getTypeface());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.i9(new org.telegram.ui.Cells.h9(this, callback), callback));
    }

    public final void z(zz0 zz0Var) {
        int selectionEnd;
        int i10 = this.O1;
        if (i10 < 0 || (selectionEnd = this.P1) < 0) {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.P1 = -1;
            this.O1 = -1;
        }
        org.telegram.messenger.ui.f(zz0Var, i10, selectionEnd, getText(), this.Q1);
        if (zz0Var == null) {
            Editable text = getText();
            for (di.i iVar : (di.i[]) text.getSpans(i10, selectionEnd, di.i.class)) {
                text.removeSpan(iVar);
            }
            wh0[] wh0VarArr = (wh0[]) text.getSpans(i10, selectionEnd, wh0.class);
            for (int i11 = 0; i11 < wh0VarArr.length; i11++) {
                text.removeSpan(wh0VarArr[i11]);
                text.removeSpan(wh0VarArr[i11].s);
                bi.m6 m6Var = wh0VarArr[i11].w;
                if (m6Var != null) {
                    text.removeSpan(m6Var);
                }
            }
            if (wh0VarArr.length > 0) {
                g(true);
            }
        }
        kt ktVar = this.N1;
        if (ktVar != null) {
            ktVar.m();
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return super.startActionMode(new org.telegram.ui.Cells.i9(new org.telegram.ui.Cells.h9(this, callback), callback), i10);
    }

    public void D() {
    }

    public void E() {
    }

    public void F(int i10, int i11) {
    }
}
