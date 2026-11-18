package f5;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public int b;
    public String c;

    public static f3.a a() {
        f3.a aVar = new f3.a();
        aVar.c = 0;
        aVar.a = "";
        return aVar;
    }

    public final String toString() {
        int i7 = this.a;
        int i10 = com.google.android.gms.internal.play_billing.u.a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.c;
        Integer valueOf = Integer.valueOf(i7);
        return e2.l("Response Code: ", (!a0Var.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.j.b : (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
