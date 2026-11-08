package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j00 implements org.telegram.messenger.d20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.d20
    public final Object a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                o00 o00Var = (o00) obj2;
                o00Var.getClass();
                if (((View) obj).getParent() == o00Var.c) {
                    break;
                } else {
                    break;
                }
            case 1:
                ld0 ld0Var = (ld0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new hd0(ld0Var, 3));
                    break;
                } else {
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.S6;
                if (uRLSpan == null) {
                    break;
                } else {
                    profileActivity.P4(uRLSpan.getURL(), null);
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
