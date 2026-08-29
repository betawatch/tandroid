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
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.ll0;
import org.telegram.ui.nn;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j2(FactCheckController factCheckController, st stVar, int i10, MessageObject messageObject, boolean z10) {
        this.d = factCheckController;
        this.e = stVar;
        this.c = i10;
        this.f = messageObject;
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((st) this.e, this.c, (MessageObject) this.f, this.b, c2Var, i10);
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f;
                strArr[0] = null;
                c2Var.dismiss();
                boolean z10 = this.b;
                int i11 = this.c;
                if (z10) {
                    MessagesController.getInstance(z0Var.I).unblockPeer(z0Var.Q.id, new ll0(z0Var, i11, w0Var, 11));
                    break;
                } else {
                    SendMessagesHelper.getInstance(z0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(z0Var.I).getCurrentUser(), z0Var.Q.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "sent");
                        org.telegram.ui.web.z0.u(i11, w0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        rn rnVar = (rn) this.d;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.e;
        yb0 yb0Var = (yb0) this.f;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((of.a) pair.second).b;
        org.telegram.ui.ActionBar.b4 b4Var2 = rnVar.f;
        if (b4Var2 == null || longValue != b4Var2.i(rnVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = rnVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = b4Var.k(this.b ? 1 : 0).settings.intensity;
        List list = ((of.a) pair.second).c;
        yb0Var.R = list;
        long j10 = rnVar.R.Ma;
        if (list != null) {
            yb0Var.S = new Random(j10).nextInt(yb0Var.R.size());
        }
        yb0Var.t(bitmap, i10);
        yb0Var.u(this.c);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        rnVar.r = ofFloat;
        ofFloat.addUpdateListener(new nn(yb0Var, 2));
        rnVar.r.setDuration(250L);
        rnVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public /* synthetic */ j2(rn rnVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, yb0 yb0Var, int i10) {
        this.d = rnVar;
        this.e = b4Var;
        this.b = z10;
        this.f = yb0Var;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ j2(org.telegram.ui.web.z0 z0Var, String[] strArr, boolean z10, int i10, org.telegram.ui.web.w0 w0Var) {
        this.d = z0Var;
        this.e = strArr;
        this.b = z10;
        this.c = i10;
        this.f = w0Var;
    }
}
