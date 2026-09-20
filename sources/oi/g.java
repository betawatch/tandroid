package oi;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                if (kVar.r) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 2), 1000L);
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
                b5.h hVar2 = kVar.p;
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
                        hVar = kVar2.p;
                        if (!kVar2.r && hVar != null && !kVar2.n.isEmpty()) {
                            bArr = (byte[]) kVar2.n.removeFirst();
                            kVar2.t -= bArr.length;
                        }
                    }
                    try {
                        if (!m.a.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        hVar.a.postMessageWithPayload(new se.a(new b5.j(bArr)));
                    } catch (Exception e) {
                        FileLog.e(e);
                        kVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
