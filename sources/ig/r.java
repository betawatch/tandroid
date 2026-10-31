package ig;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i10) {
        this.a = i10;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (i10 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    break;
                }
                break;
            case 1:
                if (i10 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.i0.v1(textView);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.i0.v1(textView);
                break;
            case 3:
                if (i10 == 6) {
                    org.telegram.messenger.i0.v1(textView);
                    break;
                }
                break;
            case 4:
                if (i10 == 6) {
                    org.telegram.messenger.i0.v1(textView);
                    break;
                }
                break;
            default:
                if (i10 == 6) {
                    org.telegram.messenger.i0.v1(textView);
                    break;
                }
                break;
        }
        return false;
    }
}
