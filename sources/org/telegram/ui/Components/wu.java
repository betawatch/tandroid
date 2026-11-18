package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class wu extends p41 {
    public final /* synthetic */ xu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(xu xuVar, String str) {
        super(str, (dz0) null);
        this.e = xuVar;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        xu xuVar = this.e;
        bv bvVar = xuVar.y;
        Pattern pattern = bv.Q1;
        org.telegram.messenger.mp.u1(bvVar.a).F3(getURL(), xuVar.y.n1, 1, null);
        xuVar.y.M0();
        xuVar.y.dismiss();
    }
}
