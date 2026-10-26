package jg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import fi.v3;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d2 extends LinearLayout implements p6 {
    public final TextView a;
    public final md b;
    public final md c;
    public final u6 d;

    public d2(Activity activity, int i10, long j10, String str, u6 u6Var) {
        super(activity);
        setOrientation(1);
        this.d = u6Var;
        TextView textView = new TextView(activity);
        this.a = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        textView.setGravity(17);
        md mdVar = new md(activity, 4);
        this.b = mdVar;
        mdVar.setTextAlignment(4);
        mdVar.setGravity(17);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        mdVar.setGravity(1);
        ak0 ak0Var = new ak0(activity);
        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
        ak0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        mdVar.setMaxWidth(AndroidUtilities.dp(160.0f));
        int i11 = 22;
        if (i10 == 9) {
            ak0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.WelcomeMessageEmptyTitle));
            mdVar.setText(LocaleController.getString(R.string.WelcomeMessageEmptySubtitle));
            mdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), v3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            ak0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.BusinessGreetingIntroTitle));
            mdVar.setText(LocaleController.getString(R.string.BusinessGreetingIntro));
            mdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), v3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            ak0Var.setImageResource(R.drawable.large_away);
            textView.setText(LocaleController.getString(R.string.BusinessAwayIntroTitle));
            mdVar.setText(LocaleController.getString(R.string.BusinessAwayIntro));
            mdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), v3.a(mdVar.getText(), mdVar.getPaint())));
        } else {
            if (i10 == 5) {
                ak0Var.setImageResource(R.drawable.large_quickreplies);
                b2 c10 = c2.f(UserConfig.selectedAccount).c(j10);
                String str2 = c10 == null ? str : c10.b;
                textView.setText(LocaleController.getString(R.string.BusinessRepliesIntroTitle));
                mdVar.setMaxWidth(AndroidUtilities.dp(208.0f));
                mdVar.setTextAlignment(2);
                mdVar.setGravity(3);
                mdVar.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessRepliesIntro1, str2)));
                mdVar.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                md mdVar2 = new md(activity, 4);
                this.c = mdVar2;
                mdVar2.setMaxWidth(AndroidUtilities.dp(208.0f));
                mdVar2.setTextAlignment(2);
                mdVar2.setGravity(3);
                mdVar2.setTextSize(1, 13.0f);
                mdVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessRepliesIntro2)));
                mdVar2.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
            }
            i11 = 12;
        }
        int i12 = i11;
        addView(ak0Var, gb1.x(78, 78, 49, 20, 17, 20, 9));
        addView(textView, gb1.x(-2, -2, 49, 20, 0, 20, 6));
        addView(mdVar, gb1.x(-2, -2, 49, i12, 0, i12, this.c == null ? 19 : 9));
        View view = this.c;
        if (view != null) {
            addView(view, gb1.x(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        md mdVar;
        TextView textView = this.a;
        if (textView == null || (mdVar = this.b) == null) {
            return;
        }
        int i10 = y6.ic;
        u6 u6Var = this.d;
        textView.setTextColor(y6.w0(i10, u6Var));
        mdVar.setTextColor(y6.w0(i10, u6Var));
        md mdVar2 = this.c;
        if (mdVar2 != null) {
            mdVar2.setTextColor(y6.w0(i10, u6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
