package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.rs;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.c = context;
        this.b = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new aa(this.c, this.b).show();
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ms msVar = new ms(d2VarArr, 0);
                org.telegram.ui.ActionBar.g6 g6Var = this.b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, g6Var, msVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.c;
                    if (!find) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string2;
                        d2Var.Q = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        d2VarArr[0] = alertDialog$Builder.o();
                        break;
                    } else {
                        replaceTags.setSpan(new org.telegram.ui.p0(d2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                }
        }
    }

    public /* synthetic */ a(rs rsVar, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        this.b = g6Var;
        this.c = context;
    }
}
