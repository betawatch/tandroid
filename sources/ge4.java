// default package

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ge4 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ ge4(AlertDialog$Builder alertDialog$Builder, byte b) {
        this.a = b;
        this.b = alertDialog$Builder;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        AlertDialog$Builder alertDialog$Builder = this.b;
        switch (b) {
            case 0:
                gm.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 1:
                gm.t1(textView);
                alertDialog$Builder.a.c(-1).callOnClick();
                return false;
            case 2:
                gm.t1(textView);
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
