// default package

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class mh implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ mh(byte b) {
        this.a = b;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                hl.t1(textView);
                break;
            case 1:
                if (i != 6) {
                    break;
                } else {
                    hl.t1(textView);
                    break;
                }
            case 2:
                if (i == 6) {
                    textView.clearFocus();
                    hl.t1(textView);
                    break;
                }
                break;
            case 3:
                if (i == 6) {
                    textView.clearFocus();
                    hl.t1(textView);
                    break;
                }
                break;
            case 4:
                if (i != 6) {
                    break;
                } else {
                    hl.t1(textView);
                    break;
                }
            default:
                if (i != 6) {
                    break;
                } else {
                    hl.t1(textView);
                    break;
                }
        }
        return false;
    }
}
