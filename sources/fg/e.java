package fg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import j3.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final b6 a;
    public final TextView b;

    public e(Context context, b6 b6Var) {
        super(context);
        this.a = b6Var;
        setBackgroundColor(f6.v0(f6.e7, b6Var));
        TextView textView = new TextView(getContext());
        this.b = textView;
        r0.u(14.0f, 1, textView);
        textView.setTextColor(f6.v0(f6.f7, b6Var));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i9) {
        this.b.setTextColor(f6.v0(i9, this.a));
    }
}
