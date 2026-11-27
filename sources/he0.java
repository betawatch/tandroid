// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class he0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vnb b;
    public final /* synthetic */ Context c;

    public /* synthetic */ he0(nk3 nk3Var, vnb vnbVar, Context context) {
        this.a = (byte) 1;
        this.b = vnbVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vnb vnbVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                new eza(context, vnbVar).show();
                break;
            case 1:
                id[] idVarArr = new id[1];
                SpannableStringBuilder Q2 = hl.Q2(hl.H2(ob6.M0(2131754168, null), vnbVar, new xh0(idVarArr, (byte) 8)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(Q2);
                while (matcher.find()) {
                    Q2.setSpan(new uk(idVarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                String M0 = ob6.M0(2131754167, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = Q2;
                alertDialog$Builder.j(ob6.M0(2131754169, null), null);
                idVarArr[0] = alertDialog$Builder.o();
                break;
            default:
                uqc.K0(context, vnbVar);
                break;
        }
    }

    public /* synthetic */ he0(Context context, vnb vnbVar, byte b) {
        this.a = b;
        this.c = context;
        this.b = vnbVar;
    }
}
