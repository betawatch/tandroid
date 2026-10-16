package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q extends LinearLayout {
    public final TextView a;
    public final p b;
    public final n c;
    public final di.d d;

    public q(Context context, c6 c6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        int i10 = g6.y6;
        sk.o(i10, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, z5.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        p pVar = new p(0, context, c6Var, true);
        this.b = pVar;
        pVar.setMinWidth(AndroidUtilities.dp(200.0f));
        pVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(pVar, z5.q(-2, 44, 17));
        n nVar = new n(context, c6Var);
        this.c = nVar;
        nVar.setTextColor(g6.w0(i10, c6Var));
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        addView(nVar, z5.t(165, -2, 17, 0, 17, 0, 12));
        di.d dVar = new di.d(context, c6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, z5.q(-2, 44, 17));
    }
}
