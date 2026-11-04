package i2;

import g2.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c implements h {
    private n dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<d0> listeners = new ArrayList<>(1);

    public c(boolean z10) {
        this.isNetwork = z10;
    }

    @Override // i2.h
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        if (this.listeners.contains(d0Var)) {
            return;
        }
        this.listeners.add(d0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i3) {
        n nVar = this.dataSpec;
        String str = n0.a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            d0 d0Var = this.listeners.get(i10);
            boolean z10 = this.isNetwork;
            a3.g gVar = (a3.g) d0Var;
            synchronized (gVar) {
                if (z10) {
                    if (nVar != null) {
                        try {
                            if ((nVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.i += i3;
                }
            }
        }
    }

    @Override // i2.h
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        n nVar = this.dataSpec;
        String str = n0.a;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            ((a3.g) this.listeners.get(i3)).f(nVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(n nVar) {
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).getClass();
        }
    }

    public final void transferStarted(n nVar) {
        this.dataSpec = nVar;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            ((a3.g) this.listeners.get(i3)).g(nVar, this.isNetwork);
        }
    }
}
