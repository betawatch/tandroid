package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bq extends FrameLayout {
    public final View a;
    public final TextView b;

    public bq(Context context) {
        super(context);
        View view = new View(context);
        this.a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        view.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, w02, w03, w03));
        addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.y0.q(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false), 1, 14.0f);
        addView(textView, w7.x5.e(-2, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
