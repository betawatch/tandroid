// default package

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nad extends d05 {
    public final Context F;
    public final byte G;
    public final String H;
    public final boolean I;
    public final boolean J;

    /* JADX WARN: Multi-variable type inference failed */
    public nad(int i, k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(4, k05Var, l05Var, oxbVar, context, looper);
        this.F = context;
        this.G = i;
        this.H = null;
        this.I = true;
        this.J = true;
    }

    public final Bundle B() {
        String packageName = this.F.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.G);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.J);
        bundle.putString("androidPackageName", packageName);
        String str = this.H;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.I ? 1 : 0);
        return bundle;
    }

    @Override // hg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof mhf ? (mhf) queryLocalInterface : new mhf(iBinder);
    }

    @Override // hg0
    public final a94[] f() {
        return qod.b;
    }

    @Override // hg0
    public final int i() {
        return 12600000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
