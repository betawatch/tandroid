// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fe0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wjb b;
    public final /* synthetic */ Context c;

    public /* synthetic */ fe0(vj3 vj3Var, wjb wjbVar, Context context) {
        this.a = (byte) 1;
        this.b = wjbVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wjb wjbVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                new ava(context, wjbVar).show();
                break;
            case 1:
                hd[] hdVarArr = new hd[1];
                SpannableStringBuilder Q2 = gl.Q2(gl.H2(k96.M0(2131754172, null), wjbVar, new wh0(hdVarArr, (byte) 8)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(Q2);
                while (matcher.find()) {
                    Q2.setSpan(new tk(hdVarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                String M0 = k96.M0(2131754171, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = Q2;
                alertDialog$Builder.j(k96.M0(2131754173, null), null);
                hdVarArr[0] = alertDialog$Builder.o();
                break;
            default:
                hmc.K0(context, wjbVar);
                break;
        }
    }

    public /* synthetic */ fe0(Context context, wjb wjbVar, byte b) {
        this.a = b;
        this.c = context;
        this.b = wjbVar;
    }
}
