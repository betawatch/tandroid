package ag;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView h = org.telegram.messenger.y1.h(context, 1, 14.0f);
        int i10 = g6.G6;
        h.setTextColor(g6.w0(null, i10, false));
        h.setTypeface(AndroidUtilities.bold());
        h.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(h);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(g6.w0(null, i10, false));
        org.telegram.messenger.y1.p(R.string.AboutPremiumDescription, textView);
        addView(textView, z5.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.w0(null, i10, false));
        org.telegram.messenger.y1.p(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
