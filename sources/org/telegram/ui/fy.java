package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
