package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;

    public /* synthetic */ os(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.b = context;
        this.c = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ms msVar = new ms(a2VarArr, 0);
                org.telegram.ui.ActionBar.d6 d6Var = this.c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, d6Var, msVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.b;
                    if (!find) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.R = string2;
                        a2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        a2VarArr[0] = alertDialog$Builder.o();
                        break;
                    } else {
                        replaceTags.setSpan(new org.telegram.ui.o0(a2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                }
            default:
                new yh.m7(this.b, this.c).show();
                break;
        }
    }

    public /* synthetic */ os(ss ssVar, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.c = d6Var;
        this.b = context;
    }
}
