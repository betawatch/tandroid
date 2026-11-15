package org.telegram.ui;

import android.graphics.RectF;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l00 implements org.telegram.messenger.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.a20
    public final Object a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                p00 p00Var = (p00) obj2;
                p00Var.getClass();
                if (((View) obj).getParent() == p00Var.c) {
                    break;
                } else {
                    break;
                }
            case 1:
                kd0 kd0Var = (kd0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new fd0(kd0Var, 3));
                    break;
                } else {
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.X6;
                if (uRLSpan == null) {
                    break;
                } else {
                    profileActivity.R4(uRLSpan.getURL(), null);
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
