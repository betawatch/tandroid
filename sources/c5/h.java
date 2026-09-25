package c5;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class h {
    public int a;
    public int b;
    public String c;

    public static c3.a a() {
        c3.a aVar = new c3.a();
        aVar.c = 0;
        aVar.a = "";
        return aVar;
    }

    public final String toString() {
        int i10 = this.a;
        int i11 = com.google.android.gms.internal.play_billing.u.a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.c;
        Integer valueOf = Integer.valueOf(i10);
        return e2.j("Response Code: ", (!a0Var.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.j.b : (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
