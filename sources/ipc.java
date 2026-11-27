// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ipc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ipc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        avc g;
        Object putIfAbsent;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                boolean[] zArr = (boolean[]) this.c;
                b8 b8Var = (b8) this.d;
                kta ktaVar = (kta) this.e;
                s43 s43Var = cVar.h;
                if (s43Var.f() == null || zArr[0]) {
                    return;
                }
                b8Var.setSubtext(s43Var.i());
                ktaVar.run();
                zArr[0] = true;
                return;
            case 1:
                ((WalletEngine2) this.b).lambda$signMessage$13((icc) this.c, (String) this.d, (String) this.e);
                return;
            case 2:
                ((WalletEngine2) this.b).lambda$decryptTransactionComment$48((String) this.c, (byte[]) this.d, (icc) this.e);
                return;
            case 3:
                ((WalletEngine2) this.b).lambda$prepareRotateKey$38((byte[]) this.c, (String) this.d, (mcc) this.e);
                return;
            case 4:
                WalletEngine2.lambda$emulateSend$18((AtomicBoolean) this.b, (icc) this.c, (TL_wallet.walletTransaction) this.d, (String) this.e);
                return;
            case 5:
                lvc lvcVar = (lvc) this.b;
                String str = (String) this.c;
                pi5 pi5Var = (pi5) this.d;
                kvc kvcVar = (kvc) this.e;
                ConcurrentHashMap concurrentHashMap = nvc.a;
                if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(str)) {
                    g = nvc.c();
                } else {
                    String a = pi5Var.a();
                    ConcurrentHashMap concurrentHashMap2 = nvc.a;
                    Object obj = concurrentHashMap2.get(a);
                    if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(a, (obj = new Object()))) != null) {
                        obj = putIfAbsent;
                    }
                    synchronized (obj) {
                        g = nvc.g(nvc.b(pi5Var));
                    }
                }
                hl.c3(new jvc(lvcVar, g, kvcVar));
                return;
            case 6:
                lvc lvcVar2 = (lvc) this.b;
                TLObject tLObject = (TLObject) this.c;
                kvc kvcVar2 = (kvc) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if ((tLObject instanceof TLRPC.TL_wallPaper) && (document = (tL_wallPaper = (TLRPC.TL_wallPaper) tLObject).document) != null) {
                    kvcVar2.e = document;
                    kvcVar2.f = tL_wallPaper;
                    lvcVar2.c(kvcVar2);
                    return;
                } else {
                    if (tL_error != null) {
                        String str2 = kvcVar2.b;
                        a.b.getSharedPreferences(ConnectionsManager.getInstance(lvcVar2.a).isTestBackend() ? "wallpaper_patterns_test" : "wallpaper_patterns", 0).edit().putLong(c00.i("rejected_", str2), System.currentTimeMillis()).apply();
                    }
                    lvcVar2.a(kvcVar2, null);
                    return;
                }
            default:
                lyc lycVar = (lyc) this.b;
                ((ArrayDeque) lycVar.b).addLast(new kyc((ht2) this.c, (jx8) this.d, (RequestTimeDelegate) this.e));
                lycVar.L();
                return;
        }
    }
}
