package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ cz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.a = i10;
        this.b = alertDialog$Builder;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.v1(textView);
                this.b.a.d(-1).callOnClick();
                break;
            case 1:
                org.telegram.messenger.i0.v1(textView);
                this.b.a.d(-1).callOnClick();
                break;
            default:
                org.telegram.messenger.i0.v1(textView);
                this.b.a.d(-1).callOnClick();
                break;
        }
        return false;
    }
}
