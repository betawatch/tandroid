// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class exc {
    public sg2 a;
    public id b;
    public TextView c;

    public static void a(Context context, pcc pccVar, Runnable runnable) {
        exc excVar = new exc();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = ob6.M0(2131743848, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        byte b = 1;
        LinearLayout j = uh9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        yob.X(textView, aob.j5, null);
        textView.setTextSize(1, 14.0f);
        j.addView(textView, tre.t(-1, -2, 0, 24, 0, 24, 0));
        sg2 sg2Var = new sg2(1, null, context);
        excVar.a = sg2Var;
        sg2Var.getTextView().getLayoutParams().width = -1;
        excVar.a.getTextView().setTextSize(1, 14.0f);
        j.addView(excVar.a, tre.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(hl.S2(ob6.M0(2131752900, null)));
        excVar.a.e(hl.N2(ob6.M0(2131752901, null), -1, 0, new xf1(context, (byte) 28), null), "", false, false, false);
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(ob6.M0(2131751736, null), new ee(b, pccVar, zArr));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new grb((byte) 29));
        excVar.b = idVar;
        idVar.show();
        TextView textView2 = (TextView) excVar.b.c(-1);
        excVar.c = textView2;
        textView2.setEnabled(false);
        excVar.c.setAlpha(0.5f);
        excVar.a.setOnClickListener(new xtc(excVar, b));
        excVar.a.setBackground(aob.f0(aob.w0(null, aob.i6, false), 7, -1));
        excVar.b.setOnDismissListener(new wf(zArr, runnable));
    }
}
