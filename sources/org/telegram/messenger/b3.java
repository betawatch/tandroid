package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b3 {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;

    public b3(int i7, int i10, int i11) {
        this.a = i7;
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
