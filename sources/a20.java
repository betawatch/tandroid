// default package

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a20 extends d20 {
    public final /* synthetic */ byte E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ KeyEvent.Callback G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a20(KeyEvent.Callback callback, Context context, Context context2, byte b) {
        super(context);
        this.E = b;
        this.G = callback;
        this.F = context2;
    }

    @Override // d20
    public final TextView a() {
        byte b = this.E;
        KeyEvent.Callback callback = this.G;
        Context context = this.F;
        switch (b) {
            case 0:
                hl6 hl6Var = new hl6((Activity) context);
                yob.X(hl6Var, aob.Fj, ((j20) callback).J0);
                hl6Var.setTextSize(1, 17.0f);
                hl6Var.setTypeface(hl.o());
                hl6Var.setEllipsize(TextUtils.TruncateAt.END);
                hl6Var.setSingleLine(true);
                return hl6Var;
            case 1:
                hl6 hl6Var2 = new hl6((Activity) context);
                j20 j20Var = (j20) callback;
                yob.X(hl6Var2, aob.Jj, j20Var.J0);
                hl6Var2.setTextSize(1, 13.0f);
                hl6Var2.setEllipsize(TextUtils.TruncateAt.END);
                hl6Var2.setSingleLine(true);
                hl6Var2.setPadding(hl.L(6.0f), 0, hl.L(6.0f), hl.L(1.0f));
                int i = aob.i6;
                hf0 Y = aob.Y(aob.v0(i, j20Var.J0), hl.L(4.0f), hl.L(4.0f));
                uob M = yob.M(i);
                vnb vnbVar = j20Var.J0;
                hl6Var2.setBackground(Y);
                yob.j(hl6Var2, Y, null, M, vnbVar);
                hl6Var2.setOnClickListener(new t(this, hl6Var2, (byte) 21));
                return hl6Var2;
            default:
                hl6 hl6Var3 = new hl6(context);
                yob.X(hl6Var3, aob.Jj, ((uy9) callback).O);
                hl6Var3.setTextSize(1, 12.0f);
                hl6Var3.setEllipsize(TextUtils.TruncateAt.END);
                hl6Var3.setSingleLine(true);
                hl6Var3.setPadding(hl.L(0.0f), 0, hl.L(0.0f), hl.L(0.0f));
                return hl6Var3;
        }
    }
}
