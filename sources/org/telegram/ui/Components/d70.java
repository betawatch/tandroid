package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d70 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.k3[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public d70(org.telegram.ui.ActionBar.k3[] k3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = k3VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.t4(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
