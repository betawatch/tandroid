// default package

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ema {
    public final SocketFactory a;
    public final qa b;
    public final short c;
    public int d = 1;
    public short e = 250;
    public boolean f;
    public Socket g;

    /* JADX WARN: Multi-variable type inference failed */
    public ema(SocketFactory socketFactory, qa qaVar, int i, ste steVar, SSLSocketFactory sSLSocketFactory) {
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
        gma gmaVar = new gma(socketFactory, qaVar, this.c, i, s);
        UnknownHostException unknownHostException = null;
        try {
            inetAddressArr = InetAddress.getAllByName(qaVar.a);
            try {
                Arrays.sort(inetAddressArr, new ju6((byte) 9));
            } catch (UnknownHostException e) {
                e = e;
                unknownHostException = e;
                if (inetAddressArr != null) {
                }
                if (unknownHostException == null) {
                }
                throw new dwc(44, "Failed to resolve hostname " + qaVar + ": " + unknownHostException.getMessage(), unknownHostException);
            }
        } catch (UnknownHostException e2) {
            e = e2;
            inetAddressArr = null;
        }
        if (inetAddressArr != null || inetAddressArr.length <= 0) {
            if (unknownHostException == null) {
                unknownHostException = new UnknownHostException("No IP addresses found");
            }
            throw new dwc(44, "Failed to resolve hostname " + qaVar + ": " + unknownHostException.getMessage(), unknownHostException);
        }
        try {
            Socket a = gmaVar.a(inetAddressArr);
            this.g = a;
            if (a instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) a;
                String str2 = qaVar.a;
                if (!this.f || pq7.a.verify(str2, sSLSocket.getSession())) {
                    return;
                }
                try {
                    str = " (" + sSLSocket.getSession().getPeerPrincipal().toString() + ")";
                } catch (Exception unused) {
                }
                throw new zh5(49, b10.i("The certificate of the peer", str, " does not match the expected hostname (", str2, ")"));
            }
        } catch (Exception e3) {
            throw new dwc(44, "Failed to connect to '" + qaVar + "': " + e3.getMessage(), e3);
        }
    }
}
