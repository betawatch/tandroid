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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g30 extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ k30 s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(k30 k30Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        this.s1 = k30Var;
        int i7 = 0;
        int i10 = org.telegram.ui.ActionBar.m6.Wg;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        org.telegram.ui.ActionBar.t6.x(this.b, this.s0, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(this, context);
        this.b = j20Var;
        j20Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.s0);
        ViewGroup viewGroup = this.b;
        int i11 = this.u0;
        viewGroup.setPadding(i11, 0, i11, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.v3.W(chat)) {
            textView.setText(org.telegram.messenger.hd.N0(2131743221, null));
        } else {
            textView.setText(org.telegram.messenger.hd.N0(2131743003, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        this.b.addView(textView, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.hd.N0(2131743002, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        this.b.addView(textView2, c8.ma.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.p1 = new TextView[3];
        c5.l lVar = new c5.l(context);
        this.m1 = lVar;
        lVar.setClipChildren(false);
        lVar.setOffscreenPageLimit(4);
        lVar.setClipToPadding(false);
        org.telegram.messenger.g0.A3(lVar, 2130706432);
        lVar.setAdapter(new org.telegram.ui.Components.n20(this, i7));
        lVar.setPageMargin(0);
        this.b.addView(lVar, c8.ma.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        lVar.b(new org.telegram.ui.Components.k20(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.b.addView(view, c8.ma.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.b.addView(view2, c8.ma.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(this, getContext());
        this.n1 = l20Var;
        l20Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        l20Var.setTag(-1);
        l20Var.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.m6.eh;
        org.telegram.ui.ActionBar.t6.U(l20Var, i12, null);
        l20Var.setGravity(17);
        l20Var.setTypeface(org.telegram.messenger.g0.o());
        l20Var.setText(org.telegram.messenger.hd.N0(2131743004, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 76);
        l20Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
        l20Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        l20Var.setOnClickListener(new org.telegram.ui.Components.o0(this, 24));
        this.b.addView(l20Var, c8.ma.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.o1 = linearLayout;
        this.b.addView(linearLayout, c8.ma.e(-2, 64, 80));
        int i13 = 0;
        while (true) {
            TextView[] textViewArr = this.p1;
            if (i13 >= textViewArr.length) {
                break;
            }
            textViewArr[i13] = new TextView(context);
            this.p1[i13].setTextSize(1, 12.0f);
            this.p1[i13].setTextColor(-1);
            this.p1[i13].setTypeface(org.telegram.messenger.g0.o());
            this.p1[i13].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.p1[i13].setGravity(16);
            this.p1[i13].setSingleLine(true);
            this.o1.addView(this.p1[i13], c8.ma.o(-2, -1));
            if (i13 == 0) {
                this.p1[i13].setText(org.telegram.messenger.hd.N0(2131743007, null));
            } else if (i13 == 1) {
                this.p1[i13].setText(org.telegram.messenger.hd.N0(2131743005, null));
            } else {
                this.p1[i13].setText(org.telegram.messenger.hd.N0(2131743006, null));
            }
            this.p1[i13].setOnClickListener(new ci.q(this, i13, 14));
            i13++;
        }
        if (z10) {
            this.m1.setCurrentItem(1);
        }
    }

    public final void K0(int i7) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i10 = org.telegram.ui.ActionBar.m6.gh;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.J = i10;
        f40 f40Var = this.s1.b;
        f40Var.r2 = false;
        t1Var.S = org.telegram.messenger.hd.N0(2131743081, null);
        if (i7 == 0) {
            t1Var.U = org.telegram.messenger.hd.N0(f40Var.V2.b.rtmp_stream ? 2131743084 : 2131743082, null);
        } else {
            if (org.telegram.messenger.v3.W(f40Var.U2)) {
                t1Var.U = org.telegram.messenger.hd.N0(f40Var.V2.b.rtmp_stream ? 2131743083 : 2131743212, null);
            } else {
                t1Var.U = org.telegram.messenger.hd.N0(f40Var.V2.b.rtmp_stream ? 2131743083 : 2131743080, null);
            }
        }
        t1Var.z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.V(getContext(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ei, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.fi, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.m6.eh;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i11, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.N0(2131743098, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.fh, null);
        org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i11, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, c8.ma.t(-1, 36, 51, 24, 0, 24, 12));
        int i12 = 2;
        editTextBoldCursor.setOnEditorActionListener(new fy(alertDialog$Builder, i12));
        t1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wg, false));
        t1Var.setOnShowListener(new f30(this, t1Var, editTextBoldCursor, 1));
        t1Var.setOnDismissListener(new gy(editTextBoldCursor, i12));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744672, null), new ai.u1(this, editTextBoldCursor, i7, 11));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ey(editTextBoldCursor, i12));
        t1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lh, false));
        t1Var.show();
        t1Var.p(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
    }
}
