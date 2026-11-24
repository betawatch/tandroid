// default package

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class eod implements r9, h89, m8a {
    public final /* synthetic */ byte a;
    public Object b;

    public eod(byte b) {
        this.a = b;
        switch (b) {
            case 5:
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void B(f7a f7aVar, boolean z) {
        yjf yjfVar = new yjf(new dd8(4));
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
    }

    @Override // m8a
    public final void C(f7a f7aVar, int i) {
        dd8 dd8Var = new dd8(8);
        dd8Var.b = Integer.valueOf(i);
        yjf yjfVar = new yjf(dd8Var);
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        sm2Var.T();
    }

    @Override // m8a
    public final void L(f7a f7aVar, int i) {
        dd8 dd8Var = new dd8(5);
        dd8Var.b = Integer.valueOf(i);
        yjf yjfVar = new yjf(dd8Var);
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        sm2Var.T();
    }

    @Override // m8a
    public final void P(f7a f7aVar, String str) {
        yjf yjfVar = new yjf(new dd8(7));
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
        njf njfVar2 = (njf) sm2Var.e;
        ite.h(njfVar2);
        String str2 = njfVar2.k;
        if (str2 == null) {
            njfVar2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            njfVar2.b(4);
        }
    }

    @Override // m8a
    public final void R(f7a f7aVar, String str) {
        yjf yjfVar = new yjf(new dd8(4));
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
        njf njfVar2 = (njf) sm2Var.e;
        ite.h(njfVar2);
        String str2 = njfVar2.k;
        if (str2 == null) {
            njfVar2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            njfVar2.b(4);
        }
    }

    public final void a(int i, Object obj, zye zyeVar) {
        nle nleVar = (nle) this.b;
        rfe rfeVar = (rfe) obj;
        nleVar.c(i, 2);
        int c = rfeVar.c();
        if (c == -1) {
            c = zyeVar.zzb(rfeVar);
            rfeVar.b(c);
        }
        nleVar.g(c);
        zyeVar.d(rfeVar, nleVar.a);
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                t13 t13Var = (t13) this.b;
                pr5 pr5Var = new pr5((TaskCompletionSource) obj2, (byte) 0);
                jj5 jj5Var = (jj5) ((zl5) obj).k();
                hp hpVar = new hp(new uq2(-1, -1, 0, true), false);
                hpVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i = rid.a;
                obtain.writeStrongBinder(pr5Var);
                rid.b(obtain, t13Var);
                rid.b(obtain, hpVar);
                ((hj5) jj5Var).a(obtain, 6);
                break;
            default:
                fue fueVar = new fue((TaskCompletionSource) obj2, (byte) 2);
                p9d p9dVar = (p9d) ((g7f) obj).k();
                String[] strArr = (String[]) this.b;
                Parcel R = p9dVar.R();
                kid.d(R, fueVar);
                R.writeStringArray(strArr);
                p9dVar.W(R, 7);
                break;
        }
    }

    public final void b(int i, tke tkeVar) {
        nle nleVar = (nle) this.b;
        nleVar.c(i, 2);
        nleVar.g(tkeVar.i());
        nleVar.k(tkeVar.b, tkeVar.m(), tkeVar.i());
    }

    public final void c(int i, Object obj, zye zyeVar) {
        nle nleVar = (nle) this.b;
        nleVar.c(i, 3);
        zyeVar.d((rfe) obj, nleVar.a);
        nleVar.c(i, 4);
    }

    public final void d(IBinder iBinder) {
        synchronized (((HashMap) this.b)) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new hke();
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/null");
                }
            }
        }
    }

    @Override // m8a
    public final void l(f7a f7aVar, int i) {
        dd8 dd8Var = new dd8(9);
        dd8Var.b = Integer.valueOf(i);
        sm2 sm2Var = (sm2) this.b;
        dd8Var.c = Boolean.valueOf(((r8d) sm2Var.c).c == 2);
        sm2.R(sm2Var, new yjf(dd8Var));
        sm2Var.T();
    }

    @Override // r9
    public final void m(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        q9 q9Var = (q9) obj;
        Intent intent = q9Var.b;
        int i = q9Var.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            yid.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = yid.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.P;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            yid.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            yid.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // m8a
    public final void o(f7a f7aVar) {
        me1 me1Var = (me1) f7aVar;
        dd8 dd8Var = new dd8(2);
        sm2 sm2Var = (sm2) this.b;
        dd8Var.c = Boolean.valueOf(((r8d) sm2Var.c).c == 2);
        sm2.R(sm2Var, new yjf(dd8Var));
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a(me1Var);
        me1Var.l = (fkd) sm2Var.f;
    }

    @Override // m8a
    public final void q(f7a f7aVar, int i) {
        dd8 dd8Var = new dd8(6);
        dd8Var.b = Integer.valueOf(i);
        yjf yjfVar = new yjf(dd8Var);
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void z(f7a f7aVar) {
    }

    public /* synthetic */ eod(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ eod(ua4 ua4Var, String[] strArr) {
        this.a = (byte) 3;
        this.b = strArr;
    }

    public eod(nle nleVar) {
        this.a = (byte) 4;
        Charset charset = iqe.a;
        this.b = nleVar;
        nleVar.a = this;
    }
}
