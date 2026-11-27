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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class h85 extends hb5 {
    public final /* synthetic */ m85 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h85(m85 m85Var, Context context, TLRPC.Chat chat, boolean z) {
        super(context, false);
        this.r1 = m85Var;
        byte b = 0;
        int i = aob.Wg;
        int w0 = aob.w0(null, i, false);
        yob.x(this.b, this.s0, i, null, PorterDuff.Mode.MULTIPLY);
        db5 db5Var = new db5(this, context);
        this.b = db5Var;
        db5Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.s0);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        TextView textView = new TextView(getContext());
        if (xc2.W(chat)) {
            textView.setText(ob6.M0(2131743118, null));
        } else {
            textView.setText(ob6.M0(2131742900, null));
        }
        textView.setTextColor(-1);
        byte b2 = 1;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        this.b.addView(textView, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(ob6.M0(2131742899, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((ob6.a0 ? 5 : 3) | 48);
        this.b.addView(textView2, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.o1 = new TextView[3];
        fic ficVar = new fic(context);
        this.l1 = ficVar;
        ficVar.setClipChildren(false);
        ficVar.setOffscreenPageLimit(4);
        ficVar.setClipToPadding(false);
        hl.w3(ficVar, 2130706432);
        ficVar.setAdapter(new gb5(this, b));
        ficVar.setPageMargin(0);
        this.b.addView(ficVar, tre.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        ficVar.b(new eb5(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w0, 0}));
        this.b.addView(view, tre.d(jn7.E1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w0}));
        this.b.addView(view2, tre.d(jn7.E1, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        fb5 fb5Var = new fb5(this, getContext());
        this.m1 = fb5Var;
        fb5Var.setMinWidth(hl.L(64.0f));
        fb5Var.setTag(-1);
        fb5Var.setTextSize(1, 14.0f);
        int i3 = aob.eh;
        yob.X(fb5Var, i3, null);
        fb5Var.setGravity(17);
        fb5Var.setTypeface(hl.o());
        fb5Var.setText(ob6.M0(2131742901, null));
        int L = hl.L(6.0f);
        int o = vm2.o(aob.w0(null, i3, false), 76);
        fb5Var.setForeground(aob.i0(L, L, L, L, 0, o, o));
        fb5Var.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
        fb5Var.setOnClickListener(new sa5(this, b2));
        this.b.addView(fb5Var, tre.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
        this.b.addView(linearLayout, tre.e(-2, 64, 80));
        int i4 = 0;
        while (true) {
            TextView[] textViewArr = this.o1;
            if (i4 >= textViewArr.length) {
                break;
            }
            textViewArr[i4] = new TextView(context);
            this.o1[i4].setTextSize(1, 12.0f);
            this.o1[i4].setTextColor(-1);
            this.o1[i4].setTypeface(hl.o());
            this.o1[i4].setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            this.o1[i4].setGravity(16);
            this.o1[i4].setSingleLine(true);
            this.n1.addView(this.o1[i4], tre.o(-2, -1));
            TextView[] textViewArr2 = this.o1;
            if (i4 == 0) {
                textViewArr2[i4].setText(ob6.M0(2131742904, null));
            } else if (i4 == 1) {
                textViewArr2[i4].setText(ob6.M0(2131742902, null));
            } else {
                textViewArr2[i4].setText(ob6.M0(2131742903, null));
            }
            this.o1[i4].setOnClickListener(new w0(this, i4, (byte) 8));
            i4++;
        }
        if (z) {
            this.l1.setCurrentItem(1);
        }
    }

    public final void F0(int i) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i2 = aob.gh;
        id idVar = alertDialog$Builder.a;
        idVar.J = i2;
        j95 j95Var = this.r1.b;
        j95Var.q2 = false;
        idVar.S = ob6.M0(2131742978, null);
        if (i == 0) {
            idVar.U = ob6.M0(j95Var.T2.b.rtmp_stream ? 2131742981 : 2131742979, null);
        } else {
            if (xc2.W(j95Var.S2)) {
                idVar.U = ob6.M0(j95Var.T2.b.rtmp_stream ? 2131742980 : 2131743109, null);
            } else {
                idVar.U = ob6.M0(j95Var.T2.b.rtmp_stream ? 2131742980 : 2131742977, null);
            }
        }
        idVar.z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(aob.U(getContext(), aob.w0(null, aob.ei, false), aob.w0(null, aob.fi, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i3 = aob.eh;
        yob.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(ob6.M0(2131742995, null));
        editTextBoldCursor.setImeOptions(6);
        yob.D(editTextBoldCursor, aob.fh, null);
        yob.l(editTextBoldCursor, 30, i3, null);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, tre.t(-1, 36, 51, 24, 0, 24, 12));
        byte b = 2;
        editTextBoldCursor.setOnEditorActionListener(new de4(alertDialog$Builder, b));
        idVar.j(aob.w0(null, aob.Wg, false));
        idVar.setOnShowListener(new g85(this, idVar, editTextBoldCursor, (byte) 1));
        idVar.setOnDismissListener(new fe4(editTextBoldCursor, b));
        alertDialog$Builder.j(ob6.M0(2131744572, null), new bf((Object) this, (Object) editTextBoldCursor, i, (byte) 6));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new bu3(editTextBoldCursor, (byte) 3));
        idVar.j(aob.w0(null, aob.lh, false));
        idVar.show();
        idVar.o(aob.w0(null, i3, false));
        editTextBoldCursor.requestFocus();
    }
}
