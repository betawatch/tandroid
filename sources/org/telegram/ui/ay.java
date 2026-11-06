package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog$Builder b;

    public /* synthetic */ ay(AlertDialog$Builder alertDialog$Builder, int i7) {
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
