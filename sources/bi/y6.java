package bi;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ y6(e7 e7Var, int i7) {
        this.a = i7;
        this.b = e7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.a) {
            case 0:
                CharSequence text = this.b.w.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        break;
                    }
                }
                break;
            default:
                e7 e7Var = this.b;
                if (e7Var.O.getVisibility() == 0 && (onClickListener = e7Var.W) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
