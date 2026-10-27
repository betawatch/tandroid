package bi;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7 b;

    public /* synthetic */ v6(b7 b7Var, int i10) {
        this.a = i10;
        this.b = b7Var;
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
                b7 b7Var = this.b;
                if (b7Var.O.getVisibility() == 0 && (onClickListener = b7Var.W) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
