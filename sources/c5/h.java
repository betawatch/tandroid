package c5;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        return e2.i("Response Code: ", (!a0Var.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.j.b : (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
