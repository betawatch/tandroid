package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;

/* loaded from: classes5.dex */
public final /* synthetic */ class StarGiftSheet$$ExternalSyntheticLambda75 implements Utilities.Callback {
    public final /* synthetic */ StarGiftSheet f$0;

    public /* synthetic */ StarGiftSheet$$ExternalSyntheticLambda75(StarGiftSheet starGiftSheet) {
        this.f$0 = starGiftSheet;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.f$0.dismiss(((Boolean) obj).booleanValue());
    }
}
