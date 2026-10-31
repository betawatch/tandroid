package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ dz(AlertDialog$Builder alertDialog$Builder, int i10) {
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
