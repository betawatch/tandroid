package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.os;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = context;
        this.b = f6Var;
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
                js jsVar = new js(d2VarArr, 0);
                org.telegram.ui.ActionBar.f6 f6Var = this.b;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, f6Var, jsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.c;
                    if (!find) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string2;
                        d2Var.Q = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        d2VarArr[0] = alertDialog$Builder.o();
                        break;
                    } else {
                        replaceTags.setSpan(new org.telegram.ui.r0(d2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                }
        }
    }

    public /* synthetic */ a(os osVar, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.b = f6Var;
        this.c = context;
    }
}
