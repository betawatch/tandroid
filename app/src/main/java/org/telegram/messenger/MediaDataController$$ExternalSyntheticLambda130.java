package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda130 implements Comparator {
    public static final /* synthetic */ MediaDataController$$ExternalSyntheticLambda130 INSTANCE = new MediaDataController$$ExternalSyntheticLambda130();

    private /* synthetic */ MediaDataController$$ExternalSyntheticLambda130() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$increasePeerRaiting$119;
        lambda$increasePeerRaiting$119 = MediaDataController.lambda$increasePeerRaiting$119((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increasePeerRaiting$119;
    }
}
