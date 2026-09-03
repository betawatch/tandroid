package lg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final g6 a;
    public final TextView b;

    public e(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        setBackgroundColor(k6.v0(k6.e7, g6Var));
        TextView textView = new TextView(getContext());
        this.b = textView;
        yh.p(14.0f, 1, textView);
        textView.setTextColor(k6.v0(k6.f7, g6Var));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, c6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(k6.v0(i10, this.a));
    }
}
