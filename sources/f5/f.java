package f5;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        return com.google.android.recaptcha.internal.a.l("Response Code: ", (!a0Var.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.j.b : (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
