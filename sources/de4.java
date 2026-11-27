// default package

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
