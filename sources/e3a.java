// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class e3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ e3a(z3a z3aVar, TLRPC.Updates updates, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = updates;
        this.d = message;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.e;
        TLRPC.Message message = this.d;
        TLRPC.Updates updates = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().R3(updates, false);
                gl.c3(new s1a(z3aVar, message, z, (byte) 0));
                break;
            default:
                z3aVar.getMessagesController().R3(updates, false);
                gl.c3(new s1a(z3aVar, message, z, (byte) 1));
                break;
        }
    }
}
