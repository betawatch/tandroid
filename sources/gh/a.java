package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this.c = context;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new fa(this.c, this.b).show();
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                cs csVar = new cs(c2VarArr, 0);
                org.telegram.ui.ActionBar.b6 b6Var = this.b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, b6Var, csVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.c;
                    if (!find) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string2;
                        c2Var.P = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        c2VarArr[0] = alertDialog$Builder.o();
                        break;
                    } else {
                        replaceTags.setSpan(new org.telegram.ui.q0(c2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                }
        }
    }

    public /* synthetic */ a(hs hsVar, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        this.b = b6Var;
        this.c = context;
    }
}
