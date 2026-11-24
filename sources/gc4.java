// default package

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc4 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ gc4(AlertDialog$Builder alertDialog$Builder, byte b) {
        this.a = b;
        this.b = alertDialog$Builder;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        AlertDialog$Builder alertDialog$Builder = this.b;
        switch (b) {
            case 0:
                gl.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 1:
                gl.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 2:
                gl.t1(textView);
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
