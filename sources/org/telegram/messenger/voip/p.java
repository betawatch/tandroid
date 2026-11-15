package org.telegram.messenger.voip;

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import bi.u2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.p2;
import org.telegram.ui.Wallet.s2;
import org.telegram.utils.twidget.l1;
import org.telegram.utils.twidget.y0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z10) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i7;
        this.c = j3;
        this.d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:6:0x001e, B:8:0x0028, B:11:0x0035, B:13:0x003d, B:17:0x0045, B:19:0x004b, B:21:0x0057, B:27:0x005f, B:28:0x0069, B:30:0x007a, B:32:0x0083, B:34:0x0089, B:35:0x0094, B:40:0x0096), top: B:5:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:6:0x001e, B:8:0x0028, B:11:0x0035, B:13:0x003d, B:17:0x0045, B:19:0x004b, B:21:0x0057, B:27:0x005f, B:28:0x0069, B:30:0x007a, B:32:0x0083, B:34:0x0089, B:35:0x0094, B:40:0x0096), top: B:5:0x001e }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        y0 y0Var;
        TLRPC.User user;
        boolean z10;
        switch (this.a) {
            case 0:
                VoIPPreNotificationService.lambda$show$1((Intent) this.e, (TL_phone.PhoneCall) this.f, (Context) this.h, this.b, this.c, this.d);
                return;
            case 1:
                l1 l1Var = (l1) this.e;
                int i7 = this.b;
                long j3 = this.c;
                JSONObject jSONObject = (JSONObject) this.f;
                String str = (String) this.h;
                boolean z11 = this.d;
                if (l1Var.w || (y0Var = l1Var.L) == null) {
                    return;
                }
                if (i7 != 19) {
                    if (y0Var.e == null) {
                        y0Var.b(3, null, j3);
                        return;
                    }
                    org.telegram.utils.twidget.k0 h = org.telegram.utils.twidget.n0.h(y0Var);
                    if (h == null || !h.i || (z11 && !org.telegram.utils.twidget.n0.F(h))) {
                        y0Var.b(3, null, j3);
                        return;
                    }
                    TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                    tL_widgetQueryTypeData.with_wallet = z11;
                    org.telegram.utils.twidget.n0.w(h, y0Var, j3, tL_widgetQueryTypeData, str.getBytes(StandardCharsets.UTF_8));
                    return;
                }
                if (y0Var.e == null) {
                    y0Var.b(3, null, j3);
                    return;
                }
                org.telegram.utils.twidget.k0 h7 = org.telegram.utils.twidget.n0.h(y0Var);
                if (h7 != null) {
                    long j10 = h7.n;
                    if (j10 != 0) {
                        user = np.s1(h7.b).a2(Long.valueOf(j10));
                        e2 T = LaunchActivity.T();
                        if (h7 != null || !org.telegram.utils.twidget.n0.F(h7) || user == null || !user.bot) {
                            y0Var.b(5, null, j3);
                            return;
                        }
                        if (T == null || T.getContext() == null) {
                            y0Var.b(3, null, j3);
                            return;
                        }
                        byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                        Context context = T.getContext();
                        int i10 = h7.b;
                        e6 resourceProvider = T.getResourceProvider();
                        org.telegram.utils.twidget.i0 i0Var = new org.telegram.utils.twidget.i0(h7, y0Var, j3, bytes);
                        ArrayList arrayList = s2.a;
                        p2 p2Var = new p2(new boolean[]{false}, i0Var);
                        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i10);
                        boolean[] zArr = {false};
                        u2 u2Var = new u2(zArr, context, i10, user, jSONObject, resourceProvider, p2Var);
                        if (x10.G()) {
                            u2Var.run();
                            return;
                        }
                        s2.a.add(u2Var);
                        x10.m0(u2Var);
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.g(u2Var, zArr, p2Var, 8), 10000L);
                        return;
                    }
                }
                user = null;
                e2 T2 = LaunchActivity.T();
                if (h7 != null) {
                }
                y0Var.b(5, null, j3);
                return;
            default:
                qi.i iVar = (qi.i) this.e;
                long j11 = this.c;
                qi.f fVar = (qi.f) this.f;
                int i11 = this.b;
                boolean z12 = this.d;
                ji.j jVar = (ji.j) this.h;
                synchronized (qi.j.d) {
                    try {
                        Spannable spannable = (Spannable) iVar.a.get();
                        if (spannable != null && iVar.b.get(Long.valueOf(j11)) == fVar) {
                            String str2 = fVar.a;
                            if (i11 <= spannable.length() && i11 == str2.length()) {
                                for (int i12 = 0; i12 < str2.length(); i12++) {
                                    if (spannable.charAt(i12) == str2.charAt(i12)) {
                                    }
                                }
                                z10 = true;
                                if (z10 && !z12) {
                                    qi.j.a(spannable, i11, (com.google.android.gms.internal.play_billing.s0) jVar.b);
                                }
                                iVar.b.remove(Long.valueOf(j11));
                                if (iVar.b.isEmpty()) {
                                    qi.j.e.remove(iVar);
                                    if (spannable instanceof qi.d) {
                                        ((qi.d) spannable).a = true;
                                    }
                                }
                                if (z10) {
                                    ns.e().k(ns.i4, new Object[0]);
                                }
                                return;
                            }
                            z10 = false;
                            if (z10) {
                                qi.j.a(spannable, i11, (com.google.android.gms.internal.play_billing.s0) jVar.b);
                            }
                            iVar.b.remove(Long.valueOf(j11));
                            if (iVar.b.isEmpty()) {
                            }
                            if (z10) {
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ p(l1 l1Var, int i7, long j3, JSONObject jSONObject, String str, boolean z10) {
        this.e = l1Var;
        this.b = i7;
        this.c = j3;
        this.f = jSONObject;
        this.h = str;
        this.d = z10;
    }

    public /* synthetic */ p(qi.i iVar, long j3, qi.f fVar, int i7, boolean z10, ji.j jVar) {
        this.e = iVar;
        this.c = j3;
        this.f = fVar;
        this.b = i7;
        this.d = z10;
        this.h = jVar;
    }
}
