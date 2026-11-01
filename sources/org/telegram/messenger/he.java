package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ he(r20 r20Var, Uri uri, int i10) {
        this.a = i10;
        this.b = r20Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Uri uri = this.c;
        r20 r20Var = this.b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                r20Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.U1;
                r20Var.a(uri);
                break;
        }
    }
}
