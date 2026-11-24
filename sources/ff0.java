// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ff0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ylb b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ff0(gl3 gl3Var, ylb ylbVar, Context context) {
        this.a = (byte) 1;
        this.b = ylbVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ylb ylbVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                new exa(context, ylbVar).show();
                break;
            case 1:
                he[] heVarArr = new he[1];
                SpannableStringBuilder Q2 = gm.Q2(gm.H2(jb6.M0(2131754140, null), ylbVar, new wi0(heVarArr, (byte) 8)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(Q2);
                while (matcher.find()) {
                    Q2.setSpan(new tl(heVarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                String M0 = jb6.M0(2131754139, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = Q2;
                alertDialog$Builder.j(jb6.M0(2131754141, null), null);
                heVarArr[0] = alertDialog$Builder.o();
                break;
            default:
                goc.L0(context, ylbVar);
                break;
        }
    }

    public /* synthetic */ ff0(Context context, ylb ylbVar, byte b) {
        this.a = b;
        this.c = context;
        this.b = ylbVar;
    }
}
