package oi;

import android.util.Base64;
import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        kVar.e();
        synchronized (kVar.a) {
            try {
                if (kVar.u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
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
                kVar.e();
                return;
            case 1:
                k.b(this.b);
                return;
            case 2:
                k.a(this.b);
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
                                    hVar2.a.postMessageWithPayload(new te.a(new b5.j(bArr)));
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                kVar2.f();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
