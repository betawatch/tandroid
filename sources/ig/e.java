package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final c6 a;
    public final TextView b;

    public e(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        setBackgroundColor(g6.v0(g6.e7, c6Var));
        TextView textView = new TextView(getContext());
        this.b = textView;
        th.n(14.0f, 1, textView);
        textView.setTextColor(g6.v0(g6.f7, c6Var));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(g6.v0(i10, this.a));
    }
}
