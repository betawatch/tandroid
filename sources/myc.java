// default package

import android.util.Base64;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class myc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pyc b;

    public /* synthetic */ myc(pyc pycVar, byte b) {
        this.a = b;
        this.b = pycVar;
    }

    private final void a() {
        pyc pycVar = this.b;
        pycVar.g();
        synchronized (pycVar.a) {
            if (pycVar.u) {
                return;
            }
            hl.d3(new myc(pycVar, (byte) 2), 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                pyc pycVar = this.b;
                cv5 cv5Var = pycVar.p;
                if (cv5Var != null) {
                    try {
                        if (!czc.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        cv5Var.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                pycVar.g();
                return;
            case 1:
                this.b.c();
                return;
            case 2:
                this.b.e();
                return;
            case 3:
                a();
                return;
            default:
                pyc pycVar2 = this.b;
                while (true) {
                    synchronized (pycVar2.a) {
                        cv5 cv5Var2 = pycVar2.p;
                        if (!pycVar2.u && cv5Var2 != null && pycVar2.r && !pycVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) pycVar2.n.removeFirst();
                            pycVar2.w -= bArr.length;
                            try {
                                if (!pycVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!czc.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    cv5Var2.a.postMessage(str);
                                } else {
                                    if (!czc.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    cv5Var2.a.postMessageWithPayload(new oy0(new sxc(bArr)));
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                                pycVar2.h();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
