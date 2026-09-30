package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h20 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h20(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                m20 m20Var = (m20) this.b;
                m20Var.getClass();
                if (((View) obj).getParent() == m20Var.c) {
                    break;
                } else {
                    break;
                }
            case 1:
                zf0 zf0Var = (zf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new vf0(zf0Var, 1));
                    break;
                } else {
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan == null) {
                    break;
                } else {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
