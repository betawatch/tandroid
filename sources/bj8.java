// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bj8 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final cj8 b;

    public bj8(Context context, ylb ylbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, qoe.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        anb.Y(textView, anb.g(cmb.F6, 100), ylbVar);
        textView.setTextSize(1, 13.0f);
        hg9.p(textView, 17, null, 2131743543);
        linearLayout.addView(textView, qoe.t(-1, -2, 0, 16, 17, 17, 16));
        cj8 cj8Var = new cj8(ylbVar, context, false);
        this.b = cj8Var;
        String M0 = jb6.M0(2131743544, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new pn2(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        cj8Var.f.setText(spannableStringBuilder);
        linearLayout.addView(cj8Var, qoe.t(-1, 48, 0, 16, 0, 16, 16));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        aj8 aj8Var;
        aj8 aj8Var2;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                cj8 cj8Var = this.b;
                CharSequence text = (!cj8Var.r || (aj8Var2 = cj8Var.h) == null) ? null : aj8Var2.getText();
                if (text == null && (aj8Var = cj8Var.f) != null) {
                    text = aj8Var.getText();
                }
                if (text != null) {
                    accessibilityNodeInfo.setText(text);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(text);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj8(cj8 cj8Var, Context context) {
        super(context);
        this.b = cj8Var;
    }
}
