package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ fy(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.a = i7;
        this.b = alertDialog$Builder;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.b.a.d(-1).callOnClick();
                break;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.b.a.d(-1).callOnClick();
                break;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.b.a.d(-1).callOnClick();
                break;
        }
        return false;
    }
}
