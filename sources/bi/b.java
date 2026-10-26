package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ b(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = i10;
        this.c = context;
        this.b = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new uc(this.c, this.b).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                xs xsVar = new xs(e2VarArr, 0);
                org.telegram.ui.ActionBar.u6 u6Var = this.b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, u6Var, xsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.c;
                    if (!find) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string2;
                        e2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        e2VarArr[0] = alertDialog$Builder.p();
                        break;
                    } else {
                        replaceTags.setSpan(new org.telegram.ui.n0(e2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                }
            default:
                org.telegram.ui.Wallet.m5.E0(this.c, this.b);
                break;
        }
    }

    public /* synthetic */ b(ct ctVar, org.telegram.ui.ActionBar.u6 u6Var, Context context) {
        this.a = 1;
        this.b = u6Var;
        this.c = context;
    }
}
