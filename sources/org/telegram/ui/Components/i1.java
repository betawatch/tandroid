package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ i1(EditText editText, int i7) {
        this.a = i7;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(this.b);
                break;
            default:
                org.telegram.messenger.g0.v1(this.b);
                break;
        }
    }
}
