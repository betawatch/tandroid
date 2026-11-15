package di;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ r5(w5 w5Var, int i7) {
        this.a = i7;
        this.b = w5Var;
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
                w5 w5Var = this.b;
                if (w5Var.P.getVisibility() == 0 && (onClickListener = w5Var.a0) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
