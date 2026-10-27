package ai;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.p9;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v0 implements x9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public v0(int i10, r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.ui.x9
    public final void H(String str) {
        String b10 = qf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new ag.c(1));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new i(this.b, 1));
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ String H0() {
        return null;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void R0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void onDismiss() {
    }
}
