package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
