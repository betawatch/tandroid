package lc;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h {
    public static final String[] e = {"Connection", "Upgrade"};
    public static final String[] f = {"Upgrade", "websocket"};
    public static final String[] g = {"Sec-WebSocket-Version", "13"};
    public Object a;
    public Serializable b;
    public Object c;
    public Serializable d;

    public synchronized void a(Exception exc) {
        try {
            CountDownLatch countDownLatch = (CountDownLatch) this.a;
            if (countDownLatch == null || ((ArrayList) this.b) == null) {
                throw new IllegalStateException("Cannot set exception before awaiting!");
            }
            if (((Exception) this.d) == null) {
                this.d = exc;
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(u uVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.a) == null || (arrayList = (ArrayList) this.b) == null) {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
        if (((Socket) this.c) == null) {
            this.c = socket;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                u uVar2 = (u) obj;
                if (uVar2 != uVar) {
                    uVar2.a(new InterruptedException());
                    uVar2.interrupt();
                }
            }
        } else {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        ((CountDownLatch) this.a).countDown();
    }
}
