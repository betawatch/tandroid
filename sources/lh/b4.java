package lh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oi0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class b4 extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final org.telegram.ui.Components.n9 a;
    public final d b;
    public boolean c;

    public b4(Context context) {
        super(context);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        addView(g10, h7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.a = n9Var;
        g10.addView(n9Var, h7.z5.q(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        g10.addView(textView, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.b = dVar;
        dVar.g(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        g10.addView(dVar, h7.z5.t((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new ag.l2(7));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.c) {
            return;
        }
        this.a.setImageDrawable(new oi0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), "utyan_empty2", AndroidUtilities.dp(130.0f)));
        this.c = true;
    }
}
