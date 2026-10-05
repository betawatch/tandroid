package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l20 implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l20(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                r20 r20Var = (r20) this.b;
                r20Var.getClass();
                if (((View) obj).getParent() == r20Var.c) {
                    break;
                } else {
                    break;
                }
            case 1:
                dg0 dg0Var = (dg0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new zf0(dg0Var, 1));
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
