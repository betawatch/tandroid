// default package

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dka {
    public final SocketFactory a;
    public final qa b;
    public final short c;
    public int d = 1;
    public short e = 250;
    public boolean f;
    public Socket g;

    /* JADX WARN: Multi-variable type inference failed */
    public dka(SocketFactory socketFactory, qa qaVar, int i, pre preVar, SSLSocketFactory sSLSocketFactory) {
        this.a = socketFactory;
        this.b = qaVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        InetAddress[] inetAddressArr;
        String str = "";
        int i = this.d;
        short s = this.e;
        SocketFactory socketFactory = this.a;
        qa qaVar = this.b;
        fka fkaVar = new fka(socketFactory, qaVar, this.c, i, s);
        UnknownHostException unknownHostException = null;
        try {
            inetAddressArr = InetAddress.getAllByName(qaVar.a);
            try {
                Arrays.sort(inetAddressArr, new is6((byte) 9));
            } catch (UnknownHostException e) {
                e = e;
                unknownHostException = e;
                if (inetAddressArr != null) {
                }
                if (unknownHostException == null) {
                }
                throw new cuc(44, "Failed to resolve hostname " + qaVar + ": " + unknownHostException.getMessage(), unknownHostException);
            }
        } catch (UnknownHostException e2) {
            e = e2;
            inetAddressArr = null;
        }
        if (inetAddressArr != null || inetAddressArr.length <= 0) {
            if (unknownHostException == null) {
                unknownHostException = new UnknownHostException("No IP addresses found");
            }
            throw new cuc(44, "Failed to resolve hostname " + qaVar + ": " + unknownHostException.getMessage(), unknownHostException);
        }
        try {
            Socket a = fkaVar.a(inetAddressArr);
            this.g = a;
            if (a instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) a;
                String str2 = qaVar.a;
                if (!this.f || mo7.a.verify(str2, sSLSocket.getSession())) {
                    return;
                }
                try {
                    str = " (" + sSLSocket.getSession().getPeerPrincipal().toString() + ")";
                } catch (Exception unused) {
                }
                throw new ag5(49, b00.i("The certificate of the peer", str, " does not match the expected hostname (", str2, ")"));
            }
        } catch (Exception e3) {
            throw new cuc(44, "Failed to connect to '" + qaVar + "': " + e3.getMessage(), e3);
        }
    }
}
