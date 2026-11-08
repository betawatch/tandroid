package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ce implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ce(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                ((boolean[]) obj)[0] = true;
                break;
            case 1:
                String[] strArr2 = MediaController.V1;
                ((boolean[]) obj)[0] = true;
                break;
            case 2:
                ((boolean[]) obj)[0] = true;
                break;
            default:
                ((cf) obj).f = true;
                break;
        }
    }
}
