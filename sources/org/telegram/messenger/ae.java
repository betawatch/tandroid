package org.telegram.messenger;

import android.net.Uri;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ ae(u10 u10Var, Uri uri, int i3) {
        this.a = i3;
        this.b = u10Var;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Uri uri = this.c;
        u10 u10Var = this.b;
        switch (i3) {
            case 0:
                String[] strArr = MediaController.W1;
                u10Var.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                u10Var.a(uri);
                break;
        }
    }
}
