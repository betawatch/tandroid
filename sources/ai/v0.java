package ai;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.p9;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
