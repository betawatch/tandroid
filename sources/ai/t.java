package ai;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final /* synthetic */ x0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x0 x0Var, Context context) {
        super(context);
        this.c = x0Var;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(x0Var.x);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView, kb1.h(-1, -1.0f, 51, 15.0f, 8.0f, 15.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setText(LocaleController.getString(R.string.Unlock));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(620756991);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(13.0f));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new s(this, 0));
        addView(textView2, kb1.h(-2, 26.0f, 21, 0.0f, 4.0f, 12.0f, 0.0f));
    }
}
