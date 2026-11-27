// default package

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class de4 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ de4(AlertDialog$Builder alertDialog$Builder, byte b) {
        this.a = b;
        this.b = alertDialog$Builder;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        AlertDialog$Builder alertDialog$Builder = this.b;
        switch (b) {
            case 0:
                hl.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 1:
                hl.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 2:
                hl.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            default:
                if (i != 5) {
                    return false;
                }
                alertDialog$Builder.a.c(-1).callOnClick();
                return true;
        }
    }
}
