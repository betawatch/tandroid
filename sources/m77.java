// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class m77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ m44 c;
    public final /* synthetic */ ConcurrentHashMap d;
    public final /* synthetic */ ConcurrentHashMap e;

    public /* synthetic */ m77(uc7 uc7Var, m44 m44Var, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = m44Var;
        this.d = concurrentHashMap;
        this.e = concurrentHashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ConcurrentHashMap concurrentHashMap = this.e;
        ConcurrentHashMap concurrentHashMap2 = this.d;
        m44 m44Var = this.c;
        uc7 uc7Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                m44Var.b(uc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                hl.c3(new n87(uc7Var, m44Var, b2));
                break;
            case 1:
                m44Var.b(uc7Var.currentAccount, concurrentHashMap2, concurrentHashMap, 0);
                hl.c3(new n87(uc7Var, m44Var, (byte) 2));
                break;
            default:
                uc7 uc7Var2 = this.b;
                jf7 messagesStorage = uc7Var2.getMessagesStorage();
                m44 m44Var2 = this.c;
                ArrayList arrayList = m44Var2.a;
                m77 m77Var = new m77(uc7Var2, m44Var2, this.d, this.e, (byte) 1);
                messagesStorage.getClass();
                if (!arrayList.isEmpty()) {
                    messagesStorage.H(new es6(messagesStorage, arrayList, m77Var, (byte) 3));
                    break;
                }
                break;
        }
    }
}
