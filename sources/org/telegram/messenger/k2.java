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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.bu0;
import org.telegram.ui.rn;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k2(FactCheckController factCheckController, xt xtVar, int i10, MessageObject messageObject, boolean z4) {
        this.d = factCheckController;
        this.e = xtVar;
        this.c = i10;
        this.f = messageObject;
        this.b = z4;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((xt) this.e, this.c, (MessageObject) this.f, this.b, d2Var, i10);
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f;
                strArr[0] = null;
                d2Var.dismiss();
                boolean z4 = this.b;
                int i11 = this.c;
                if (z4) {
                    MessagesController.getInstance(a1Var.J).unblockPeer(a1Var.R.id, new bu0(a1Var, i11, x0Var, 9));
                    break;
                } else {
                    SendMessagesHelper.getInstance(a1Var.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var.J).getCurrentUser(), a1Var.R.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "sent");
                        org.telegram.ui.web.a1.u(i11, x0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.d;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) this.e;
        fc0 fc0Var = (fc0) this.f;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((qf.a) pair.second).b;
        org.telegram.ui.ActionBar.f4 f4Var2 = vnVar.f;
        if (f4Var2 == null || longValue != f4Var2.i(vnVar.D ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = vnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = f4Var.k(this.b ? 1 : 0).settings.intensity;
        List list = ((qf.a) pair.second).c;
        fc0Var.R = list;
        long j10 = vnVar.S.Na;
        if (list != null) {
            fc0Var.S = new Random(j10).nextInt(fc0Var.R.size());
        }
        fc0Var.t(bitmap, i10);
        fc0Var.u(this.c);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vnVar.r = ofFloat;
        ofFloat.addUpdateListener(new rn(fc0Var, 2));
        vnVar.r.setDuration(250L);
        vnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ k2(vn vnVar, org.telegram.ui.ActionBar.f4 f4Var, boolean z4, fc0 fc0Var, int i10) {
        this.d = vnVar;
        this.e = f4Var;
        this.b = z4;
        this.f = fc0Var;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ k2(org.telegram.ui.web.a1 a1Var, String[] strArr, boolean z4, int i10, org.telegram.ui.web.x0 x0Var) {
        this.d = a1Var;
        this.e = strArr;
        this.b = z4;
        this.c = i10;
        this.f = x0Var;
    }
}
