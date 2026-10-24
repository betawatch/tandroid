package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q3 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;
    public final /* synthetic */ k4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(k4 k4Var, Context context, boolean z10) {
        super(context);
        this.e = k4Var;
        this.d = z10;
        setTag(90);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(LocaleController.getString(z10 ? R.string.PreviewFeedbackAuto : R.string.PreviewFeedback2));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        addView(textView, w7.z5.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        addView(textView2, w7.z5.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
    }
}
