// default package

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
