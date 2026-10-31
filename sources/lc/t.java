package lc;

import j4.g0;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.telegram.messenger.zs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t {
    public final SocketFactory a;
    public final a b;
    public final int c;
    public int d = 1;
    public int e = zs.Z3;
    public boolean f;
    public Socket g;

    public t(SocketFactory socketFactory, a aVar, int i10, c cVar, SSLSocketFactory sSLSocketFactory) {
        this.a = socketFactory;
        this.b = aVar;
        this.c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        InetAddress[] inetAddressArr;
        String str = "";
        int i10 = this.d;
        int i11 = this.e;
        SocketFactory socketFactory = this.a;
        a aVar = this.b;
        g0 g0Var = new g0(socketFactory, aVar, this.c, i10, i11);
        UnknownHostException unknownHostException = null;
        try {
            inetAddressArr = InetAddress.getAllByName(aVar.a);
            try {
                Arrays.sort(inetAddressArr, new s(0));
            } catch (UnknownHostException e) {
                e = e;
                unknownHostException = e;
                if (inetAddressArr != null) {
                }
                if (unknownHostException == null) {
                }
                throw new w(44, "Failed to resolve hostname " + aVar + ": " + unknownHostException.getMessage(), unknownHostException);
            }
        } catch (UnknownHostException e7) {
            e = e7;
            inetAddressArr = null;
        }
        if (inetAddressArr != null || inetAddressArr.length <= 0) {
            if (unknownHostException == null) {
                unknownHostException = new UnknownHostException("No IP addresses found");
            }
            throw new w(44, "Failed to resolve hostname " + aVar + ": " + unknownHostException.getMessage(), unknownHostException);
        }
        try {
            Socket a2 = g0Var.a(inetAddressArr);
            this.g = a2;
            if (a2 instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) a2;
                String str2 = aVar.a;
                if (this.f && !m.a.verify(str2, sSLSocket.getSession())) {
                    try {
                        str = " (" + sSLSocket.getSession().getPeerPrincipal().toString() + ")";
                    } catch (Exception unused) {
                    }
                    throw new i(49, f1.o("The certificate of the peer", str, " does not match the expected hostname (", str2, ")"));
                }
            }
        } catch (Exception e10) {
            throw new w(44, "Failed to connect to '" + aVar + "': " + e10.getMessage(), e10);
        }
    }
}
