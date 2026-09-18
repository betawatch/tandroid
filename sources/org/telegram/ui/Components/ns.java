package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;

    public /* synthetic */ ns(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = context;
        this.c = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ls lsVar = new ls(c2VarArr, 0);
                org.telegram.ui.ActionBar.f6 f6Var = this.c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, f6Var, lsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.b;
                    if (!find) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string2;
                        c2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        c2VarArr[0] = alertDialog$Builder.o();
                        break;
                    } else {
                        replaceTags.setSpan(new org.telegram.ui.n0(c2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                }
            default:
                new yh.o7(this.b, this.c).show();
                break;
        }
    }

    public /* synthetic */ ns(rs rsVar, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.c = f6Var;
        this.b = context;
    }
}
