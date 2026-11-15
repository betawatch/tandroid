package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class be implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ be(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                ((boolean[]) obj)[0] = true;
                break;
            case 1:
                String[] strArr2 = MediaController.W1;
                ((boolean[]) obj)[0] = true;
                break;
            case 2:
                ((boolean[]) obj)[0] = true;
                break;
            default:
                ((bf) obj).f = true;
                break;
        }
    }
}
