package g2;

import e2.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c implements h {
    private n dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<d0> listeners = new ArrayList<>(1);

    public c(boolean z10) {
        this.isNetwork = z10;
    }

    @Override // g2.h
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        if (this.listeners.contains(d0Var)) {
            return;
        }
        this.listeners.add(d0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i10) {
        n nVar = this.dataSpec;
        String str = l0.a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            d0 d0Var = this.listeners.get(i11);
            boolean z10 = this.isNetwork;
            y2.f fVar = (y2.f) d0Var;
            synchronized (fVar) {
                if (z10) {
                    if (nVar != null) {
                        try {
                            if ((nVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    fVar.i += i10;
                }
            }
        }
    }

    @Override // g2.h
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        n nVar = this.dataSpec;
        String str = l0.a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).f(nVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(n nVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(n nVar) {
        this.dataSpec = nVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).g(nVar, this.isNetwork);
        }
    }
}
