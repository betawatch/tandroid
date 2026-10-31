package g2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f0 extends c {
    public final int a;
    public final byte[] b;
    public final DatagramPacket c;
    public Uri d;
    public DatagramSocket e;
    public MulticastSocket f;
    public InetAddress h;
    public boolean n;
    public int r;

    public f0() {
        super(true);
        this.a = 8000;
        byte[] bArr = new byte[2000];
        this.b = bArr;
        this.c = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // g2.h
    public final void close() {
        this.d = null;
        MulticastSocket multicastSocket = this.f;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.h;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f = null;
        }
        DatagramSocket datagramSocket = this.e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.e = null;
        }
        this.h = null;
        this.r = 0;
        if (this.n) {
            this.n = false;
            transferEnded();
        }
    }

    @Override // g2.h
    public final Uri getUri() {
        return this.d;
    }

    @Override // g2.h
    public final long open(n nVar) {
        Uri uri = nVar.a;
        this.d = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.d.getPort();
        transferInitializing(nVar);
        try {
            this.h = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.h, port);
            if (this.h.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f = multicastSocket;
                multicastSocket.joinGroup(this.h);
                this.e = this.f;
            } else {
                this.e = new DatagramSocket(inetSocketAddress);
            }
            this.e.setSoTimeout(this.a);
            this.n = true;
            transferStarted(nVar);
            return -1L;
        } catch (IOException e) {
            throw new e0(e, 2001);
        } catch (SecurityException e7) {
            throw new e0(e7, 2006);
        }
    }

    @Override // b2.p
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.r;
        DatagramPacket datagramPacket = this.c;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new e0(e, 2002);
            } catch (IOException e7) {
                throw new e0(e7, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.r;
        int min = Math.min(i13, i11);
        System.arraycopy(this.b, length2 - i13, bArr, i10, min);
        this.r -= min;
        return min;
    }
}
