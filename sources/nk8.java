// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nk8 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final ok8 b;

    public nk8(Context context, vnb vnbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, tre.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        yob.Y(textView, yob.g(aob.G6, 100), vnbVar);
        textView.setTextSize(1, 13.0f);
        uh9.q(textView, 17, null, 2131743511);
        linearLayout.addView(textView, tre.t(-1, -2, 0, 16, 17, 17, 16));
        ok8 ok8Var = new ok8(vnbVar, context, false);
        this.b = ok8Var;
        String M0 = ob6.M0(2131743512, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new wm2(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        ok8Var.f.setText(spannableStringBuilder);
        linearLayout.addView(ok8Var, tre.t(-1, 48, 0, 16, 0, 16, 16));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        mk8 mk8Var;
        mk8 mk8Var2;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ok8 ok8Var = this.b;
                CharSequence text = (!ok8Var.r || (mk8Var2 = ok8Var.h) == null) ? null : mk8Var2.getText();
                if (text == null && (mk8Var = ok8Var.f) != null) {
                    text = mk8Var.getText();
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
    public nk8(ok8 ok8Var, Context context) {
        super(context);
        this.b = ok8Var;
    }
}
