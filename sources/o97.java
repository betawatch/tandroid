// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o97 extends t61 {
    public final /* synthetic */ na7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o97(na7 na7Var) {
        super(3600000);
        this.e = na7Var;
    }

    @Override // t61
    public final void e(int i, Object obj, i8c i8cVar) {
        ad7.Y(i).a.c(new sm3(i, i8cVar, (byte) 25));
    }

    @Override // t61
    public final void f(int i, Object obj, long j, s61 s61Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new hc((byte) 0), new ur4((Object) s61Var, (byte) 20));
    }

    @Override // t61
    public final void g(int i, Object obj, Object obj2) {
        ad7.Y(i).a.c(new sm3(i, (TL_account.TL_webBrowserSettings) obj2, (byte) 26));
    }

    @Override // t61
    public final boolean j(Object obj) {
        return false;
    }
}
