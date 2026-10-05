package org.telegram.messenger.voip;

import j$.util.function.Function$-CC;
import java.util.function.Function;
import org.telegram.messenger.voip.ConferenceCall;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
