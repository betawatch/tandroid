// default package

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l6c extends qg0 {
    public final byte[] a;
    public final DatagramPacket b;
    public Uri c;
    public DatagramSocket d;
    public MulticastSocket e;
    public InetAddress f;
    public boolean h;
    public int n;

    public l6c() {
        super(true);
        byte[] bArr = new byte[2000];
        this.a = bArr;
        this.b = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // a83
    public final void close() {
        this.c = null;
        MulticastSocket multicastSocket = this.e;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.e = null;
        }
        DatagramSocket datagramSocket = this.d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.d = null;
        }
        this.f = null;
        this.n = 0;
        if (this.h) {
            this.h = false;
            transferEnded();
        }
    }

    @Override // a83
    public final Uri getUri() {
        return this.c;
    }

    @Override // a83
    public final long open(g83 g83Var) {
        Uri uri = g83Var.a;
        this.c = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.c.getPort();
        transferInitializing(g83Var);
        try {
            this.f = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f, port);
            if (this.f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.e = multicastSocket;
                multicastSocket.joinGroup(this.f);
                this.d = this.e;
            } else {
                this.d = new DatagramSocket(inetSocketAddress);
            }
            this.d.setSoTimeout(8000);
            this.h = true;
            transferStarted(g83Var);
            return -1L;
        } catch (IOException e) {
            throw new k6c(e, 2001);
        } catch (SecurityException e2) {
            throw new k6c(e2, 2006);
        }
    }

    @Override // s73
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.n;
        DatagramPacket datagramPacket = this.b;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.d;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.n = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new k6c(e, 2002);
            } catch (IOException e2) {
                throw new k6c(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.n;
        int min = Math.min(i4, i2);
        System.arraycopy(this.a, length2 - i4, bArr, i, min);
        this.n -= min;
        return min;
    }
}
