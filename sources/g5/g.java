package g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class g implements m {
    private p dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<v0> listeners = new ArrayList<>(1);

    public g(boolean z4) {
        this.isNetwork = z4;
    }

    @Override // g5.m
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        if (this.listeners.contains(v0Var)) {
            return;
        }
        this.listeners.add(v0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i10) {
        p pVar = this.dataSpec;
        int i11 = h5.d0.a;
        for (int i12 = 0; i12 < this.listenerCount; i12++) {
            v0 v0Var = this.listeners.get(i12);
            boolean z4 = this.isNetwork;
            s sVar = (s) v0Var;
            synchronized (sVar) {
                if (z4) {
                    if (pVar != null) {
                        try {
                            if ((pVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    sVar.h += i10;
                }
            }
        }
    }

    @Override // g5.m
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        p pVar = this.dataSpec;
        int i10 = h5.d0.a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            ((s) this.listeners.get(i11)).e(pVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(p pVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(p pVar) {
        this.dataSpec = pVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((s) this.listeners.get(i10)).f(pVar, this.isNetwork);
        }
    }
}
