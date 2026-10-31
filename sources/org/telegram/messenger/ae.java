package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ae implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ae(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                ((boolean[]) obj)[0] = true;
                break;
            case 1:
                String[] strArr2 = MediaController.U1;
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
