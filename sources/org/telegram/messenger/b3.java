package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b3 {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;

    public b3(int i3, int i10, int i11) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
    }

    public static void a(b3 b3Var, String str) {
        if (b3Var.d) {
            return;
        }
        b3Var.d = true;
        ConnectionsManager.native_receivedCaptchaResult(b3Var.a, b3Var.b, b3Var.c, str);
    }
}
