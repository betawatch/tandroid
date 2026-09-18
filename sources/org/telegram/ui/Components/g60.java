package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g60 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public g60(org.telegram.ui.ActionBar.g3[] g3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = g3VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
