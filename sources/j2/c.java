package j2;

import h2.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class c implements h {
    private m dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<d0> listeners = new ArrayList<>(1);

    public c(boolean z9) {
        this.isNetwork = z9;
    }

    @Override // j2.h
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        if (this.listeners.contains(d0Var)) {
            return;
        }
        this.listeners.add(d0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i7) {
        m mVar = this.dataSpec;
        String str = m0.a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            d0 d0Var = this.listeners.get(i10);
            boolean z9 = this.isNetwork;
            b3.g gVar = (b3.g) d0Var;
            synchronized (gVar) {
                if (z9) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    gVar.i += i7;
                }
            }
        }
    }

    @Override // j2.h
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        m mVar = this.dataSpec;
        String str = m0.a;
        for (int i7 = 0; i7 < this.listenerCount; i7++) {
            ((b3.g) this.listeners.get(i7)).f(mVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(m mVar) {
        for (int i7 = 0; i7 < this.listenerCount; i7++) {
            this.listeners.get(i7).getClass();
        }
    }

    public final void transferStarted(m mVar) {
        this.dataSpec = mVar;
        for (int i7 = 0; i7 < this.listenerCount; i7++) {
            ((b3.g) this.listeners.get(i7)).g(mVar, this.isNetwork);
        }
    }
}
