// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oq5 extends ClickableSpan {
    public final /* synthetic */ fx0[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public oq5(fx0[] fx0VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = fx0VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(ProfileActivity.P2(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
