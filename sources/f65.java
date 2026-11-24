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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f65 extends g95 {
    public final /* synthetic */ k65 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f65(k65 k65Var, Context context, TLRPC.Chat chat, boolean z) {
        super(context, false);
        this.r1 = k65Var;
        byte b = 0;
        int i = bkb.Vg;
        int w0 = bkb.w0(null, i, false);
        zkb.x(this.b, this.s0, i, null, PorterDuff.Mode.MULTIPLY);
        c95 c95Var = new c95(this, context);
        this.b = c95Var;
        c95Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.s0);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        TextView textView = new TextView(getContext());
        if (hc2.W(chat)) {
            textView.setText(k96.M0(2131743224, null));
        } else {
            textView.setText(k96.M0(2131743006, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        this.b.addView(textView, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(k96.M0(2131743005, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((k96.a0 ? 5 : 3) | 48);
        this.b.addView(textView2, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.o1 = new TextView[3];
        gec gecVar = new gec(context);
        this.l1 = gecVar;
        gecVar.setClipChildren(false);
        gecVar.setOffscreenPageLimit(4);
        gecVar.setClipToPadding(false);
        gl.w3(gecVar, 2130706432);
        gecVar.setAdapter(new f95(this, b));
        gecVar.setPageMargin(0);
        this.b.addView(gecVar, nme.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gecVar.b(new d95(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w0, 0}));
        this.b.addView(view, nme.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w0}));
        this.b.addView(view2, nme.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        e95 e95Var = new e95(this, getContext());
        this.m1 = e95Var;
        e95Var.setMinWidth(gl.L(64.0f));
        e95Var.setTag(-1);
        e95Var.setTextSize(1, 14.0f);
        int i3 = bkb.dh;
        zkb.X(e95Var, i3, null);
        e95Var.setGravity(17);
        e95Var.setTypeface(gl.o());
        e95Var.setText(k96.M0(2131743007, null));
        int L = gl.L(6.0f);
        int o = bm2.o(bkb.w0(null, i3, false), 76);
        e95Var.setForeground(bkb.i0(L, L, L, L, 0, o, o));
        e95Var.setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
        e95Var.setOnClickListener(new b95(this, b));
        this.b.addView(e95Var, nme.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
        this.b.addView(linearLayout, nme.e(-2, 64, 80));
        int i4 = 0;
        while (true) {
            TextView[] textViewArr = this.o1;
            if (i4 >= textViewArr.length) {
                break;
            }
            textViewArr[i4] = new TextView(context);
            this.o1[i4].setTextSize(1, 12.0f);
            this.o1[i4].setTextColor(-1);
            this.o1[i4].setTypeface(gl.o());
            this.o1[i4].setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
            this.o1[i4].setGravity(16);
            this.o1[i4].setSingleLine(true);
            this.n1.addView(this.o1[i4], nme.o(-2, -1));
            TextView[] textViewArr2 = this.o1;
            if (i4 == 0) {
                textViewArr2[i4].setText(k96.M0(2131743010, null));
            } else if (i4 == 1) {
                textViewArr2[i4].setText(k96.M0(2131743008, null));
            } else {
                textViewArr2[i4].setText(k96.M0(2131743009, null));
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
        int i2 = bkb.fh;
        hd hdVar = alertDialog$Builder.a;
        hdVar.J = i2;
        h75 h75Var = this.r1.b;
        h75Var.q2 = false;
        hdVar.S = k96.M0(2131743084, null);
        if (i == 0) {
            hdVar.U = k96.M0(h75Var.T2.b.rtmp_stream ? 2131743087 : 2131743085, null);
        } else {
            if (hc2.W(h75Var.S2)) {
                hdVar.U = k96.M0(h75Var.T2.b.rtmp_stream ? 2131743086 : 2131743215, null);
            } else {
                hdVar.U = k96.M0(h75Var.T2.b.rtmp_stream ? 2131743086 : 2131743083, null);
            }
        }
        hdVar.z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(bkb.U(getContext(), bkb.w0(null, bkb.di, false), bkb.w0(null, bkb.ei, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i3 = bkb.dh;
        zkb.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(k96.M0(2131743101, null));
        editTextBoldCursor.setImeOptions(6);
        zkb.D(editTextBoldCursor, bkb.eh, null);
        zkb.l(editTextBoldCursor, 30, i3, null);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, nme.t(-1, 36, 51, 24, 0, 24, 12));
        byte b = 2;
        editTextBoldCursor.setOnEditorActionListener(new gc4(alertDialog$Builder, b));
        hdVar.j(bkb.w0(null, bkb.Vg, false));
        hdVar.setOnShowListener(new e65(this, hdVar, editTextBoldCursor, (byte) 1));
        hdVar.setOnDismissListener(new ic4(editTextBoldCursor, b));
        alertDialog$Builder.j(k96.M0(2131744678, null), new yf((Object) this, (Object) editTextBoldCursor, i, (byte) 5));
        alertDialog$Builder.g(k96.M0(2131752577, null), new kt3(editTextBoldCursor, (byte) 3));
        hdVar.j(bkb.w0(null, bkb.kh, false));
        hdVar.show();
        hdVar.o(bkb.w0(null, i3, false));
        editTextBoldCursor.requestFocus();
    }
}
