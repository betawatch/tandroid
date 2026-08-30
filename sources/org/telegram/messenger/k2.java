package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.rn;
import org.telegram.ui.vn;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k2(FactCheckController factCheckController, vt vtVar, int i10, MessageObject messageObject, boolean z4) {
        this.d = factCheckController;
        this.e = vtVar;
        this.c = i10;
        this.f = messageObject;
        this.b = z4;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((vt) this.e, this.c, (MessageObject) this.f, this.b, d2Var, i10);
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f;
                strArr[0] = null;
                d2Var.dismiss();
                boolean z4 = this.b;
                int i11 = this.c;
                if (z4) {
                    MessagesController.getInstance(a1Var.J).unblockPeer(a1Var.R.id, new zt0(a1Var, i11, w0Var, 9));
                    break;
                } else {
                    SendMessagesHelper.getInstance(a1Var.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var.J).getCurrentUser(), a1Var.R.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "sent");
                        org.telegram.ui.web.a1.u(i11, w0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.d;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) this.e;
        dc0 dc0Var = (dc0) this.f;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((qf.a) pair.second).b;
        org.telegram.ui.ActionBar.e4 e4Var2 = vnVar.f;
        if (e4Var2 == null || longValue != e4Var2.i(vnVar.D ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = vnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = e4Var.k(this.b ? 1 : 0).settings.intensity;
        List list = ((qf.a) pair.second).c;
        dc0Var.R = list;
        long j10 = vnVar.S.Na;
        if (list != null) {
            dc0Var.S = new Random(j10).nextInt(dc0Var.R.size());
        }
        dc0Var.t(bitmap, i10);
        dc0Var.u(this.c);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vnVar.r = ofFloat;
        ofFloat.addUpdateListener(new rn(dc0Var, 2));
        vnVar.r.setDuration(250L);
        vnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ k2(vn vnVar, org.telegram.ui.ActionBar.e4 e4Var, boolean z4, dc0 dc0Var, int i10) {
        this.d = vnVar;
        this.e = e4Var;
        this.b = z4;
        this.f = dc0Var;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ k2(org.telegram.ui.web.a1 a1Var, String[] strArr, boolean z4, int i10, org.telegram.ui.web.w0 w0Var) {
        this.d = a1Var;
        this.e = strArr;
        this.b = z4;
        this.c = i10;
        this.f = w0Var;
    }
}
