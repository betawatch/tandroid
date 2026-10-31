package ji;

import android.util.Base64;
import b5.m;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ g(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    private final void a() {
        k kVar = this.b;
        kVar.g();
        synchronized (kVar.a) {
            try {
                if (kVar.u) {
                    return;
                }
                i0.h3(new g(kVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                b5.h hVar = kVar.p;
                if (hVar != null) {
                    try {
                        if (!m.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        hVar.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                kVar.g();
                return;
            case 1:
                k.d(this.b);
                return;
            case 2:
                k.c(this.b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.b;
                while (true) {
                    synchronized (kVar2.a) {
                        b5.h hVar2 = kVar2.p;
                        if (!kVar2.u && hVar2 != null && kVar2.r && !kVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) kVar2.n.removeFirst();
                            kVar2.w -= bArr.length;
                            try {
                                if (!kVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!m.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    hVar2.a.postMessage(str);
                                } else {
                                    if (!m.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    hVar2.a.postMessageWithPayload(new me.a(new b5.j(bArr)));
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                                kVar2.h();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
