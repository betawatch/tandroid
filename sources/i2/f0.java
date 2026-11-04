package i2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // i2.h
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

    @Override // i2.h
    public final Uri getUri() {
        return this.d;
    }

    @Override // i2.h
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
        } catch (IOException e10) {
            throw new e0(e10, 2001);
        } catch (SecurityException e11) {
            throw new e0(e11, 2006);
        }
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.r;
        DatagramPacket datagramPacket = this.c;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.r = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e10) {
                throw new e0(e10, 2002);
            } catch (IOException e11) {
                throw new e0(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.r;
        int min = Math.min(i12, i10);
        System.arraycopy(this.b, length2 - i12, bArr, i3, min);
        this.r -= min;
        return min;
    }
}
