package f8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
import w8.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b extends o6.g {
    public final Context U;
    public final int V;
    public final String W;
    public final int X;
    public final boolean Y;

    public b(Context context, Looper looper, r3 r3Var, k kVar, l lVar, int i10) {
        super(context, looper, 4, r3Var, kVar, lVar, 0);
        this.U = context;
        this.V = i10;
        this.W = null;
        this.X = 1;
        this.Y = true;
    }

    @Override // o6.g
    public final boolean C() {
        return true;
    }

    public final Bundle G() {
        String packageName = this.U.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.V);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.Y);
        bundle.putString("androidPackageName", packageName);
        String str = this.W;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.X);
        return bundle;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12600000;
    }

    @Override // o6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return p.c;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.wallet.service.BIND";
    }
}
