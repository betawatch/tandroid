// default package

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
