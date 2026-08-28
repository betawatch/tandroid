package dc;

import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends SSLSocketFactory {
    public final SSLSocketFactory a = HttpsURLConnection.getDefaultSSLSocketFactory();
    public final boolean b;
    public final boolean c;

    public c() {
        String[] strArr;
        try {
            strArr = SSLContext.getDefault().getSupportedSSLParameters().getProtocols();
        } catch (NoSuchAlgorithmException unused) {
            strArr = new String[0];
        }
        boolean z10 = false;
        boolean z11 = false;
        for (String str : strArr) {
            if (str.equals("TLSv1.1")) {
                z10 = true;
            } else if (str.equals("TLSv1.2")) {
                z11 = true;
            }
        }
        this.b = z10;
        this.c = z11;
    }

    public final Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getEnabledProtocols()));
        if (this.b) {
            hashSet.add("TLSv1.1");
        }
        if (this.c) {
            hashSet.add("TLSv1.2");
        }
        sSLSocket.setEnabledProtocols((String[]) hashSet.toArray(new String[0]));
        return sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i9, boolean z10) {
        return a(this.a.createSocket(socket, str, i9, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i9) {
        return a(this.a.createSocket(str, i9));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i9, InetAddress inetAddress, int i10) {
        return a(this.a.createSocket(str, i9, inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i9) {
        return a(this.a.createSocket(inetAddress, i9));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i9, InetAddress inetAddress2, int i10) {
        return a(this.a.createSocket(inetAddress, i9, inetAddress2, i10));
    }
}
