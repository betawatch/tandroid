// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class e7a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f7a b;

    public /* synthetic */ e7a(f7a f7aVar, byte b) {
        this.a = b;
        this.b = f7aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.a;
        f7a f7aVar = this.b;
        switch (b) {
            case 0:
                String str2 = f7aVar.b.text;
                if (str2 == null || !str2.equals("AUTH_TOKEN_EXCEPTION")) {
                    str = k96.M0(2131751093, null) + "\n" + f7aVar.b.text;
                } else {
                    str = k96.M0(2131754708, null);
                }
                ij.r0(f7aVar.c, k96.M0(2131753891, null), str, null);
                break;
            default:
                ij.r0(f7aVar.c, k96.M0(2131753891, null), k96.M0(2131751093, null), null);
                break;
        }
    }
}
