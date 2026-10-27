package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AgentController b;

    public /* synthetic */ b(AgentController agentController, int i10) {
        this.a = i10;
        this.b = agentController;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadSettings$1((TL_agent.settings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.b.lambda$setActiveProvider$4((TL_agent.settings) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.b.lambda$disconnect$3((TL_agent.settings) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.b.lambda$loadProviders$0((TL_agent.Providers) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
