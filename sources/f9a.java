// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f9a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g9a b;

    public /* synthetic */ f9a(g9a g9aVar, byte b) {
        this.a = b;
        this.b = g9aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.a;
        g9a g9aVar = this.b;
        switch (b) {
            case 0:
                String str2 = g9aVar.b.text;
                if (str2 == null || !str2.equals("AUTH_TOKEN_EXCEPTION")) {
                    str = jb6.M0(2131751042, null) + "\n" + g9aVar.b.text;
                } else {
                    str = jb6.M0(2131754708, null);
                }
                ik.r0(g9aVar.c, jb6.M0(2131753859, null), str, null);
                break;
            default:
                ik.r0(g9aVar.c, jb6.M0(2131753859, null), jb6.M0(2131751042, null), null);
                break;
        }
    }
}
