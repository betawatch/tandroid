package ai;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;

    public /* synthetic */ z6(f7 f7Var, int i10) {
        this.a = i10;
        this.b = f7Var;
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
                f7 f7Var = this.b;
                if (f7Var.O.getVisibility() == 0 && (onClickListener = f7Var.W) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
