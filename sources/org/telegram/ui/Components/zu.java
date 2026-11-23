package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zu extends s41 {
    public final /* synthetic */ av e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(av avVar, String str) {
        super(str, (fz0) null);
        this.e = avVar;
    }

    @Override // org.telegram.ui.Components.s41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        av avVar = this.e;
        ev evVar = avVar.y;
        Pattern pattern = ev.Q1;
        org.telegram.messenger.np.u1(evVar.a).F3(getURL(), avVar.y.n1, 1, null);
        avVar.y.M0();
        avVar.y.dismiss();
    }
}
