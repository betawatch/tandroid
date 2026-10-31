package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k10 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.r20
    public final Object a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                p10 p10Var = (p10) obj2;
                p10Var.getClass();
                if (((View) obj).getParent() == p10Var.c) {
                    break;
                } else {
                    break;
                }
            case 1:
                se0 se0Var = (se0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.i0.g3(new ne0(se0Var, 3));
                    break;
                } else {
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.R6;
                if (uRLSpan == null) {
                    break;
                } else {
                    profileActivity.O4(uRLSpan.getURL(), null);
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
