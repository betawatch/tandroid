package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r50 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public r50(org.telegram.ui.ActionBar.z2[] z2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = z2VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.z4(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
