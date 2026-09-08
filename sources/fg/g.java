package fg;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ g(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    private final void a() {
        k kVar = this.b;
        kVar.e();
        synchronized (kVar.a) {
            try {
                if (kVar.p) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 1), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5.h hVar;
        byte[] bArr;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                b5.h hVar2 = kVar.n;
                if (hVar2 != null) {
                    try {
                        if (!m.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        hVar2.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.a(this.b);
                return;
            case 2:
                k.b(this.b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.b;
                while (true) {
                    synchronized (kVar2.a) {
                        hVar = kVar2.n;
                        if (!kVar2.p && hVar != null && !kVar2.l.isEmpty()) {
                            bArr = (byte[]) kVar2.l.removeFirst();
                            kVar2.r -= bArr.length;
                        }
                    }
                    try {
                        if (!m.a.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        hVar.a.postMessageWithPayload(new se.a(new b5.j(bArr)));
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        kVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
