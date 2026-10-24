package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ jz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.a = i10;
        this.b = alertDialog$Builder;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.b.a.d(-1).callOnClick();
                break;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.b.a.d(-1).callOnClick();
                break;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.b.a.d(-1).callOnClick();
                break;
        }
        return false;
    }
}
