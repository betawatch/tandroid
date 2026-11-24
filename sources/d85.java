// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d85 extends eb5 {
    public final /* synthetic */ i85 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d85(i85 i85Var, Context context, TLRPC.Chat chat, boolean z) {
        super(context, false);
        this.r1 = i85Var;
        byte b = 0;
        int i = cmb.Vg;
        int w0 = cmb.w0(null, i, false);
        anb.x(this.b, this.s0, i, null, PorterDuff.Mode.MULTIPLY);
        ab5 ab5Var = new ab5(this, context);
        this.b = ab5Var;
        ab5Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.s0);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        TextView textView = new TextView(getContext());
        if (sd2.W(chat)) {
            textView.setText(jb6.M0(2131743150, null));
        } else {
            textView.setText(jb6.M0(2131742932, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        byte b2 = 3;
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        this.b.addView(textView, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(jb6.M0(2131742931, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
        this.b.addView(textView2, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.o1 = new TextView[3];
        ggc ggcVar = new ggc(context);
        this.l1 = ggcVar;
        ggcVar.setClipChildren(false);
        ggcVar.setOffscreenPageLimit(4);
        ggcVar.setClipToPadding(false);
        gm.w3(ggcVar, 2130706432);
        ggcVar.setAdapter(new db5(this, b));
        ggcVar.setPageMargin(0);
        this.b.addView(ggcVar, qoe.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        ggcVar.b(new bb5(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w0, 0}));
        this.b.addView(view, qoe.d(nm7.E1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w0}));
        this.b.addView(view2, qoe.d(nm7.E1, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        cb5 cb5Var = new cb5(this, getContext());
        this.m1 = cb5Var;
        cb5Var.setMinWidth(gm.L(64.0f));
        cb5Var.setTag(-1);
        cb5Var.setTextSize(1, 14.0f);
        int i3 = cmb.dh;
        anb.X(cb5Var, i3, null);
        cb5Var.setGravity(17);
        cb5Var.setTypeface(gm.o());
        cb5Var.setText(jb6.M0(2131742933, null));
        int L = gm.L(6.0f);
        int p = on2.p(cmb.w0(null, i3, false), 76);
        cb5Var.setForeground(cmb.i0(L, L, L, L, 0, p, p));
        cb5Var.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
        cb5Var.setOnClickListener(new ca5(this, b2));
        this.b.addView(cb5Var, qoe.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
        this.b.addView(linearLayout, qoe.e(-2, 64, 80));
        int i4 = 0;
        while (true) {
            TextView[] textViewArr = this.o1;
            if (i4 >= textViewArr.length) {
                break;
            }
            textViewArr[i4] = new TextView(context);
            this.o1[i4].setTextSize(1, 12.0f);
            this.o1[i4].setTextColor(-1);
            this.o1[i4].setTypeface(gm.o());
            this.o1[i4].setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
            this.o1[i4].setGravity(16);
            this.o1[i4].setSingleLine(true);
            this.n1.addView(this.o1[i4], qoe.o(-2, -1));
            TextView[] textViewArr2 = this.o1;
            if (i4 == 0) {
                textViewArr2[i4].setText(jb6.M0(2131742936, null));
            } else if (i4 == 1) {
                textViewArr2[i4].setText(jb6.M0(2131742934, null));
            } else {
                textViewArr2[i4].setText(jb6.M0(2131742935, null));
            }
            this.o1[i4].setOnClickListener(new v0(this, i4, (byte) 7));
            i4++;
        }
        if (z) {
            this.l1.setCurrentItem(1);
        }
    }

    public final void E0(int i) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i2 = cmb.fh;
        he heVar = alertDialog$Builder.a;
        heVar.J = i2;
        g95 g95Var = this.r1.b;
        g95Var.q2 = false;
        heVar.S = jb6.M0(2131743010, null);
        if (i == 0) {
            heVar.U = jb6.M0(g95Var.T2.b.rtmp_stream ? 2131743013 : 2131743011, null);
        } else {
            if (sd2.W(g95Var.S2)) {
                heVar.U = jb6.M0(g95Var.T2.b.rtmp_stream ? 2131743012 : 2131743141, null);
            } else {
                heVar.U = jb6.M0(g95Var.T2.b.rtmp_stream ? 2131743012 : 2131743009, null);
            }
        }
        heVar.z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(cmb.U(getContext(), cmb.w0(null, cmb.di, false), cmb.w0(null, cmb.ei, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i3 = cmb.dh;
        anb.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(jb6.M0(2131743027, null));
        editTextBoldCursor.setImeOptions(6);
        anb.D(editTextBoldCursor, cmb.eh, null);
        anb.l(editTextBoldCursor, 30, i3, null);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, qoe.t(-1, 36, 51, 24, 0, 24, 12));
        byte b = 2;
        editTextBoldCursor.setOnEditorActionListener(new ge4(alertDialog$Builder, b));
        heVar.j(cmb.w0(null, cmb.Vg, false));
        heVar.setOnShowListener(new c85(this, heVar, editTextBoldCursor, (byte) 1));
        heVar.setOnDismissListener(new ie4(editTextBoldCursor, b));
        alertDialog$Builder.j(jb6.M0(2131744604, null), new yg((Object) this, (Object) editTextBoldCursor, i, (byte) 6));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new uu3(editTextBoldCursor, (byte) 3));
        heVar.j(cmb.w0(null, cmb.kh, false));
        heVar.show();
        heVar.o(cmb.w0(null, i3, false));
        editTextBoldCursor.requestFocus();
    }
}
