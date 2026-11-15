package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e50 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public e50(org.telegram.ui.ActionBar.u2[] u2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = u2VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.C4(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
