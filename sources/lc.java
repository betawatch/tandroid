// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lc implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc b;

    public /* synthetic */ lc(mc mcVar, byte b) {
        this.a = b;
        this.b = mcVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        mc mcVar = this.b;
        switch (b) {
            case 0:
                TL_agent.settings settingsVar = (TL_agent.settings) obj;
                mcVar.h = -1;
                if (settingsVar != null) {
                    mcVar.e = true;
                    mcVar.a(settingsVar);
                    break;
                }
                break;
            case 1:
                TL_agent.Providers providers = (TL_agent.Providers) obj;
                ArrayList arrayList = mcVar.b;
                mcVar.f = -1;
                if (!(providers instanceof TL_agent.TL_providers)) {
                    if (providers instanceof TL_agent.TL_providersNotModified) {
                        mcVar.g = System.currentTimeMillis();
                        break;
                    }
                } else {
                    mcVar.g = System.currentTimeMillis();
                    TL_agent.TL_providers tL_providers = (TL_agent.TL_providers) providers;
                    mcVar.c = tL_providers.hash;
                    arrayList.clear();
                    arrayList.addAll(tL_providers.providers);
                    mcVar.i();
                    break;
                }
                break;
            case 2:
                TL_agent.settings settingsVar2 = (TL_agent.settings) obj;
                if (settingsVar2 == null) {
                    mcVar.h();
                    break;
                } else {
                    mcVar.a(settingsVar2);
                    break;
                }
            case 3:
                TL_agent.settings settingsVar3 = (TL_agent.settings) obj;
                if (settingsVar3 != null) {
                    mcVar.a(settingsVar3);
                    break;
                }
                break;
            case 4:
                TL_agent.settings settingsVar4 = (TL_agent.settings) obj;
                if (settingsVar4 == null) {
                    mcVar.h();
                    break;
                } else {
                    mcVar.a(settingsVar4);
                    break;
                }
            default:
                TL_agent.settings settingsVar5 = (TL_agent.settings) obj;
                if (settingsVar5 == null) {
                    mcVar.h();
                    break;
                } else {
                    mcVar.a(settingsVar5);
                    break;
                }
        }
    }
}
