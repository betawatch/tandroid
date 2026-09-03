package mh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ x4(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
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
                c5 c5Var = this.b;
                if (c5Var.K.getVisibility() == 0 && (onClickListener = c5Var.Q) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
