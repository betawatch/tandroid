package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ r1(EditText editText, int i7) {
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
