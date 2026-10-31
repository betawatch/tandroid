package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b40 extends org.telegram.ui.Components.r20 {
    public final /* synthetic */ f40 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(f40 f40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        this.o1 = f40Var;
        int i10 = org.telegram.ui.ActionBar.t6.Tg;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        org.telegram.ui.ActionBar.a7.y(this.b, this.r0, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.n20 n20Var = new org.telegram.ui.Components.n20(this, context);
        this.b = n20Var;
        n20Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.r0);
        ViewGroup viewGroup = this.b;
        int i11 = this.t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.w3.W(chat)) {
            textView.setText(org.telegram.messenger.cd.L0(2131743492, null));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131743274, null));
        }
        textView.setTextColor(-1);
        int i12 = 1;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        this.b.addView(textView, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.cd.L0(2131743273, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        this.b.addView(textView2, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.l1 = new TextView[3];
        z4.g gVar = new z4.g(context);
        this.i1 = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        org.telegram.messenger.i0.B3(gVar, 2130706432);
        gVar.setAdapter(new kg.e1(this, i12));
        gVar.setPageMargin(0);
        this.b.addView(gVar, w7.b6.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new org.telegram.ui.Components.o20(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.b.addView(view, w7.b6.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.b.addView(view2, w7.b6.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(this, getContext());
        this.j1 = p20Var;
        p20Var.setMinWidth(org.telegram.messenger.i0.L(64.0f));
        p20Var.setTag(-1);
        p20Var.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.t6.bh;
        org.telegram.ui.ActionBar.a7.V(p20Var, i13, null);
        p20Var.setGravity(17);
        p20Var.setTypeface(org.telegram.messenger.i0.o());
        p20Var.setText(org.telegram.messenger.cd.L0(2131743275, null));
        int L = org.telegram.messenger.i0.L(6.0f);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 76);
        p20Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10));
        p20Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        p20Var.setOnClickListener(new org.telegram.ui.Components.h0(this, 21));
        this.b.addView(p20Var, w7.b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.k1 = linearLayout;
        this.b.addView(linearLayout, w7.b6.e(-2, 64, 80));
        int i14 = 0;
        while (true) {
            TextView[] textViewArr = this.l1;
            if (i14 >= textViewArr.length) {
                break;
            }
            textViewArr[i14] = new TextView(context);
            this.l1[i14].setTextSize(1, 12.0f);
            this.l1[i14].setTextColor(-1);
            this.l1[i14].setTypeface(org.telegram.messenger.i0.o());
            this.l1[i14].setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            this.l1[i14].setGravity(16);
            this.l1[i14].setSingleLine(true);
            this.k1.addView(this.l1[i14], w7.b6.o(-2, -1));
            if (i14 == 0) {
                this.l1[i14].setText(org.telegram.messenger.cd.L0(2131743278, null));
            } else if (i14 == 1) {
                this.l1[i14].setText(org.telegram.messenger.cd.L0(2131743276, null));
            } else {
                this.l1[i14].setText(org.telegram.messenger.cd.L0(2131743277, null));
            }
            this.l1[i14].setOnClickListener(new bh.f(this, i14, 7));
            i14++;
        }
        if (z10) {
            this.i1.setCurrentItem(1);
        }
    }

    public final void J0(int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i11 = org.telegram.ui.ActionBar.t6.dh;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.I = i11;
        b50 b50Var = this.o1.b;
        b50Var.n2 = false;
        x1Var.R = org.telegram.messenger.cd.L0(2131743352, null);
        if (i10 == 0) {
            x1Var.T = org.telegram.messenger.cd.L0(b50Var.R2.b.rtmp_stream ? 2131743355 : 2131743353, null);
        } else {
            if (org.telegram.messenger.w3.W(b50Var.Q2)) {
                x1Var.T = org.telegram.messenger.cd.L0(b50Var.R2.b.rtmp_stream ? 2131743354 : 2131743483, null);
            } else {
                x1Var.T = org.telegram.messenger.cd.L0(b50Var.R2.b.rtmp_stream ? 2131743354 : 2131743351, null);
            }
        }
        x1Var.A0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.V(getContext(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bi, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ci, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.t6.bh;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.cd.L0(2131743369, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.ch, null);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i12, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 0, 24, 12));
        int i13 = 2;
        editTextBoldCursor.setOnEditorActionListener(new dz(alertDialog$Builder, i13));
        x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tg, false));
        x1Var.setOnShowListener(new a40(this, x1Var, editTextBoldCursor, 1));
        x1Var.setOnDismissListener(new ez(editTextBoldCursor, i13));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744933, null), new ag.b0(this, editTextBoldCursor, i10, 10));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new cz(editTextBoldCursor, i13));
        x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ih, false));
        x1Var.show();
        x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        editTextBoldCursor.requestFocus();
    }
}
