package gh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ b5(g5 g5Var, int i9) {
        this.a = i9;
        this.b = g5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.a) {
            case 0:
                CharSequence text = this.b.v.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        break;
                    }
                }
                break;
            default:
                g5 g5Var = this.b;
                if (g5Var.J.getVisibility() == 0 && (onClickListener = g5Var.P) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
