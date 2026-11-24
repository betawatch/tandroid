// default package

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nqa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rqa b;

    public /* synthetic */ nqa(rqa rqaVar, byte b) {
        this.a = b;
        this.b = rqaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        byte b = this.a;
        rqa rqaVar = this.b;
        switch (b) {
            case 0:
                CharSequence text = rqaVar.w.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        break;
                    }
                }
                break;
            default:
                if (rqaVar.P.getVisibility() == 0 && (onClickListener = rqaVar.a0) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
