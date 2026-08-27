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
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.ln;
import org.telegram.ui.ol0;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k2(FactCheckController factCheckController, lt ltVar, int i10, MessageObject messageObject, boolean z10) {
        this.d = factCheckController;
        this.e = ltVar;
        this.c = i10;
        this.f = messageObject;
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((lt) this.e, this.c, (MessageObject) this.f, this.b, b2Var, i10);
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f;
                strArr[0] = null;
                b2Var.dismiss();
                boolean z10 = this.b;
                int i11 = this.c;
                if (z10) {
                    MessagesController.getInstance(z0Var.I).unblockPeer(z0Var.Q.id, new ol0(z0Var, i11, w0Var, 11));
                    break;
                } else {
                    SendMessagesHelper.getInstance(z0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(z0Var.I).getCurrentUser(), z0Var.Q.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "sent");
                        org.telegram.ui.web.z0.u(i11, w0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        pn pnVar = (pn) this.d;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.e;
        nb0 nb0Var = (nb0) this.f;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((mf.a) pair.second).b;
        org.telegram.ui.ActionBar.b4 b4Var2 = pnVar.f;
        if (b4Var2 == null || longValue != b4Var2.i(pnVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = pnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = b4Var.k(this.b ? 1 : 0).settings.intensity;
        List list = ((mf.a) pair.second).c;
        nb0Var.R = list;
        long j10 = pnVar.R.Ma;
        if (list != null) {
            nb0Var.S = new Random(j10).nextInt(nb0Var.R.size());
        }
        nb0Var.t(bitmap, i10);
        nb0Var.u(this.c);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        pnVar.r = ofFloat;
        ofFloat.addUpdateListener(new ln(nb0Var, 2));
        pnVar.r.setDuration(250L);
        pnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    public /* synthetic */ k2(pn pnVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, nb0 nb0Var, int i10) {
        this.d = pnVar;
        this.e = b4Var;
        this.b = z10;
        this.f = nb0Var;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ k2(org.telegram.ui.web.z0 z0Var, String[] strArr, boolean z10, int i10, org.telegram.ui.web.w0 w0Var) {
        this.d = z0Var;
        this.e = strArr;
        this.b = z10;
        this.c = i10;
        this.f = w0Var;
    }
}
