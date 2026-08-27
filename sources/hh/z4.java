package hh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;

    public /* synthetic */ z4(e5 e5Var, int i10) {
        this.a = i10;
        this.b = e5Var;
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
                e5 e5Var = this.b;
                if (e5Var.J.getVisibility() == 0 && (onClickListener = e5Var.P) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
