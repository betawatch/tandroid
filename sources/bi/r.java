package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class r extends LinearLayout {
    public final TextView a;
    public final q b;
    public final o c;
    public final ci.d d;

    public r(Context context, e6 e6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        int i10 = i6.y6;
        vl.o(i10, e6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, x5.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        q qVar = new q(0, context, e6Var, true);
        this.b = qVar;
        qVar.setMinWidth(AndroidUtilities.dp(200.0f));
        qVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(qVar, x5.q(-2, 44, 17));
        o oVar = new o(context, e6Var);
        this.c = oVar;
        oVar.setTextColor(i6.v0(i10, e6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        addView(oVar, x5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar = new ci.d(context, e6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, x5.q(-2, 44, 17));
    }
}
