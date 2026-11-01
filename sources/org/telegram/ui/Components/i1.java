package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ i1(EditText editText, int i10) {
        this.a = i10;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.v1(this.b);
                break;
            default:
                org.telegram.messenger.i0.v1(this.b);
                break;
        }
    }
}
