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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.Components.b20 {
    public final /* synthetic */ h30 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(h30 h30Var, Context context, TLRPC.Chat chat, boolean z9) {
        super(context, false);
        this.o1 = h30Var;
        int i7 = 0;
        int i10 = org.telegram.ui.ActionBar.k6.Tg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        org.telegram.ui.ActionBar.r6.y(this.b, this.r0, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.w10 w10Var = new org.telegram.ui.Components.w10(this, context);
        this.b = w10Var;
        w10Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.r0);
        ViewGroup viewGroup = this.b;
        int i11 = this.t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.t3.W(chat)) {
            textView.setText(org.telegram.messenger.id.M0(2131743469, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131743251, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        this.b.addView(textView, c8.ha.d(-2, -2.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.id.M0(2131743250, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        this.b.addView(textView2, c8.ha.d(-2, -2.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.l1 = new TextView[3];
        c5.k kVar = new c5.k(context);
        this.i1 = kVar;
        kVar.setClipChildren(false);
        kVar.setOffscreenPageLimit(4);
        kVar.setClipToPadding(false);
        org.telegram.messenger.g0.C3(kVar, 2130706432);
        kVar.setAdapter(new org.telegram.ui.Components.a20(this, i7));
        kVar.setPageMargin(0);
        this.b.addView(kVar, c8.ha.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        kVar.b(new org.telegram.ui.Components.x10(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.b.addView(view, c8.ha.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.b.addView(view2, c8.ha.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(this, getContext());
        this.j1 = y10Var;
        y10Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        y10Var.setTag(-1);
        y10Var.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.k6.bh;
        org.telegram.ui.ActionBar.r6.V(y10Var, i12, null);
        y10Var.setGravity(17);
        y10Var.setTypeface(org.telegram.messenger.g0.o());
        y10Var.setText(org.telegram.messenger.id.M0(2131743252, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 76);
        y10Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o4, o4));
        y10Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        y10Var.setOnClickListener(new org.telegram.ui.Components.h0(this, 22));
        this.b.addView(y10Var, c8.ha.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.k1 = linearLayout;
        this.b.addView(linearLayout, c8.ha.e(-2, 64, 80));
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.l1;
            if (i13 >= textViewArr.length) {
                break;
            }
            textViewArr[i13] = new TextView(context);
            this.l1[i13].setTextSize(1, 12.0f);
            this.l1[i13].setTextColor(-1);
            this.l1[i13].setTypeface(org.telegram.messenger.g0.o());
            this.l1[i13].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.l1[i13].setGravity(16);
            this.l1[i13].setSingleLine(true);
            this.k1.addView(this.l1[i13], c8.ha.o(-2, -1));
            if (i13 == 0) {
                this.l1[i13].setText(org.telegram.messenger.id.M0(2131743255, null));
            } else if (i13 == 1) {
                this.l1[i13].setText(org.telegram.messenger.id.M0(2131743253, null));
            } else {
                this.l1[i13].setText(org.telegram.messenger.id.M0(2131743254, null));
            }
            this.l1[i13].setOnClickListener(new ai.v(this, i13, 12));
            i13++;
        }
        if (z9) {
            this.i1.setCurrentItem(1);
        }
    }

    public final void J0(int i7) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i10 = org.telegram.ui.ActionBar.k6.dh;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.I = i10;
        c40 c40Var = this.o1.b;
        c40Var.n2 = false;
        u1Var.R = org.telegram.messenger.id.M0(2131743329, null);
        if (i7 == 0) {
            u1Var.T = org.telegram.messenger.id.M0(c40Var.R2.b.rtmp_stream ? 2131743332 : 2131743330, null);
        } else {
            if (org.telegram.messenger.t3.W(c40Var.Q2)) {
                u1Var.T = org.telegram.messenger.id.M0(c40Var.R2.b.rtmp_stream ? 2131743331 : 2131743460, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(c40Var.R2.b.rtmp_stream ? 2131743331 : 2131743328, null);
            }
        }
        u1Var.y0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V(getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bi, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ci, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.bh;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.id.M0(2131743346, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ch, null);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i11, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 0, 24, 12));
        int i12 = 2;
        editTextBoldCursor.setOnEditorActionListener(new ay(alertDialog$Builder, i12));
        u1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false));
        u1Var.setOnShowListener(new b30(this, u1Var, editTextBoldCursor, 1));
        u1Var.setOnDismissListener(new cy(editTextBoldCursor, i12));
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744918, null), new jg.a2(this, editTextBoldCursor, i7, 9));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new zx(editTextBoldCursor, i12));
        u1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ih, false));
        u1Var.show();
        u1Var.p(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
    }
}
