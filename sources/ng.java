// default package

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ng implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ ng(byte b) {
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
