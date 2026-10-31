package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b20 implements RequestDelegate {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b20(int i10, org.telegram.ui.ActionBar.x1 x1Var, Context context, long j10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.b = i10;
        this.e = x1Var;
        this.f = context;
        this.d = j10;
        this.g = p6Var;
        this.h = qVar;
        this.c = eVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                b50 b50Var = (b50) obj5;
                HashSet hashSet = (HashSet) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j10 = this.d;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.vp.r1(b50Var.a).L3(updates, false);
                    org.telegram.messenger.i0.g3(new a3.i0(b50Var, updates, j10, 18));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j10));
                }
                if (atomicInteger.incrementAndGet() == i11 && !hashSet.isEmpty()) {
                    org.telegram.messenger.i0.g3(new fp((Object) b50Var, (Object) hashSet, (Object) u3Var, (Object) str, 27));
                    break;
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.pb((LaunchActivity) obj5, tLObject, this.b, (String) obj, (String) obj4, (TLRPC.User) obj3, (String) obj2, this.d));
                break;
            case 2:
                Activity activity = (Activity) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                byte[] bArr = (byte[]) obj3;
                un unVar = (un) obj2;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.i0.h3(new rz0(unVar, activity, p6Var, jjVar, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            org.telegram.messenger.i0.h3(new xh(unVar, i11, jjVar), 200L);
                            break;
                        }
                    } else {
                        org.telegram.messenger.i0.h3(new rz0(unVar, activity, p6Var, jjVar, 0), 200L);
                        break;
                    }
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.f(tLObject, activity, p6Var, this.d, bArr, unVar, jjVar));
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.pb(tLObject, this.b, (org.telegram.ui.ActionBar.x1) obj5, (Context) obj4, this.d, (org.telegram.ui.ActionBar.p6) obj3, (org.telegram.ui.web.q) obj2, (org.telegram.tgnet.e) obj));
                break;
        }
    }

    public /* synthetic */ b20(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, long j10, byte[] bArr, un unVar, org.telegram.messenger.jj jjVar, int i10) {
        this.e = activity;
        this.f = p6Var;
        this.d = j10;
        this.g = bArr;
        this.h = unVar;
        this.c = jjVar;
        this.b = i10;
    }

    public /* synthetic */ b20(b50 b50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, org.telegram.messenger.u3 u3Var, String str) {
        this.e = b50Var;
        this.d = j10;
        this.f = hashSet;
        this.g = atomicInteger;
        this.b = i10;
        this.h = u3Var;
        this.c = str;
    }

    public /* synthetic */ b20(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.b = i10;
        this.c = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.d = j10;
    }
}
