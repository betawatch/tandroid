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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.jh0;
import org.telegram.ui.kn;
import org.telegram.ui.on;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j2(FactCheckController factCheckController, mt mtVar, int i9, MessageObject messageObject, boolean z10) {
        this.d = factCheckController;
        this.e = mtVar;
        this.c = i9;
        this.f = messageObject;
        this.b = z10;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((mt) this.e, this.c, (MessageObject) this.f, this.b, c2Var, i9);
                break;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                String[] strArr = (String[]) this.e;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f;
                strArr[0] = null;
                c2Var.dismiss();
                boolean z10 = this.b;
                int i10 = this.c;
                if (z10) {
                    MessagesController.getInstance(y0Var.I).unblockPeer(y0Var.Q.id, new jh0(y0Var, i10, v0Var, 12));
                    break;
                } else {
                    SendMessagesHelper.getInstance(y0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(y0Var.I).getCurrentUser(), y0Var.Q.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "sent");
                        org.telegram.ui.web.y0.u(i10, v0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        on onVar = (on) this.d;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.e;
        jb0 jb0Var = (jb0) this.f;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((lf.a) pair.second).b;
        org.telegram.ui.ActionBar.b4 b4Var2 = onVar.f;
        if (b4Var2 == null || longValue != b4Var2.i(onVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = onVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i9 = b4Var.k(this.b ? 1 : 0).settings.intensity;
        List list = ((lf.a) pair.second).c;
        jb0Var.R = list;
        long j10 = onVar.R.Ma;
        if (list != null) {
            jb0Var.S = new Random(j10).nextInt(jb0Var.R.size());
        }
        jb0Var.t(bitmap, i9);
        jb0Var.u(this.c);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        onVar.r = ofFloat;
        ofFloat.addUpdateListener(new kn(jb0Var, 2));
        onVar.r.setDuration(250L);
        onVar.r.start();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    public /* synthetic */ j2(on onVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, jb0 jb0Var, int i9) {
        this.d = onVar;
        this.e = b4Var;
        this.b = z10;
        this.f = jb0Var;
        this.c = i9;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ j2(org.telegram.ui.web.y0 y0Var, String[] strArr, boolean z10, int i9, org.telegram.ui.web.v0 v0Var) {
        this.d = y0Var;
        this.e = strArr;
        this.b = z10;
        this.c = i9;
        this.f = v0Var;
    }
}
