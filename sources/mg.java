// default package

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mg implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ mg(byte b) {
        this.a = b;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                gl.t1(textView);
                break;
            case 1:
                if (i != 6) {
                    break;
                } else {
                    gl.t1(textView);
                    break;
                }
            case 2:
                if (i == 6) {
                    textView.clearFocus();
                    gl.t1(textView);
                    break;
                }
                break;
            case 3:
                if (i == 6) {
                    textView.clearFocus();
                    gl.t1(textView);
                    break;
                }
                break;
            case 4:
                if (i != 6) {
                    break;
                } else {
                    gl.t1(textView);
                    break;
                }
            default:
                if (i != 6) {
                    break;
                } else {
                    gl.t1(textView);
                    break;
                }
        }
        return false;
    }
}
