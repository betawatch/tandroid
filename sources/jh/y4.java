package jh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ y4(d5 d5Var, int i10) {
        this.a = i10;
        this.b = d5Var;
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
                d5 d5Var = this.b;
                if (d5Var.J.getVisibility() == 0 && (onClickListener = d5Var.P) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
