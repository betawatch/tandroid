package di;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ u5(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
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
                z5 z5Var = this.b;
                if (z5Var.P.getVisibility() == 0 && (onClickListener = z5Var.a0) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
