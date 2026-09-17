package org.telegram.messenger.voip;

import j$.util.function.Function$-CC;
import java.util.function.Function;
import org.telegram.messenger.voip.ConferenceCall;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function {
    public /* synthetic */ Function andThen(Function function) {
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$poll$9;
        lambda$poll$9 = ConferenceCall.lambda$poll$9((ConferenceCall.CallParticipant) obj);
        return lambda$poll$9;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$-CC.$default$compose(this, function);
    }
}
