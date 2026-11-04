package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x40 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.t2[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public x40(org.telegram.ui.ActionBar.t2[] t2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = t2VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.A4(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
