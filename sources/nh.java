// default package

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nh implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ nh(byte b) {
        this.a = b;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                gm.t1(textView);
                break;
            case 1:
                if (i != 6) {
                    break;
                } else {
                    gm.t1(textView);
                    break;
                }
            case 2:
                if (i == 6) {
                    textView.clearFocus();
                    gm.t1(textView);
                    break;
                }
                break;
            case 3:
                if (i == 6) {
                    textView.clearFocus();
                    gm.t1(textView);
                    break;
                }
                break;
            case 4:
                if (i != 6) {
                    break;
                } else {
                    gm.t1(textView);
                    break;
                }
            default:
                if (i != 6) {
                    break;
                } else {
                    gm.t1(textView);
                    break;
                }
        }
        return false;
    }
}
