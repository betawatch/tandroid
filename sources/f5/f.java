package f5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
