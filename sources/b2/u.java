package b2;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.y3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class u implements s4.d0, androidx.lifecycle.a0, y9.i {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static u g(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                arrayList.add(bundle2 != null ? new p4.m(bundle2) : null);
            }
        }
        return new u(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // s4.d0
    public void D(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).p(i10, i11);
    }

    @Override // s4.d0
    public void O0(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).t(i10, i11);
    }

    @Override // y9.i
    public void a(y9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        u6.p(!this.b);
        ((SparseBooleanArray) this.c).append(i10, true);
    }

    public void c(v vVar) {
        for (int i10 = 0; i10 < vVar.a.size(); i10++) {
            b(vVar.a(i10));
        }
    }

    public v d() {
        u6.p(!this.b);
        this.b = true;
        return new v((SparseBooleanArray) this.c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean f() {
        return this.b;
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        p0.e eVar = (p0.e) this.c;
        if (eVar == null) {
            return f();
        }
        eVar.getClass();
        char c10 = 2;
        for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            u uVar = p0.f.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c10 = 2;
                            break;
                    }
                }
                c10 = 0;
            }
            c10 = 1;
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return f();
        }
        return false;
    }

    public void i(y3 y3Var) {
        if (this.b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.c).a(new i5.a(null, y3Var, i5.d.a, null), new k2.y0(2));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // s4.d0
    public void j0(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).s(i10, i11);
    }

    @Override // s4.d0
    public void m1(int i10, int i11) {
        ((s4.g0) this.c).r(i10, i11, null);
    }

    @Override // androidx.lifecycle.a0
    public void n0(Object obj) {
        this.b = true;
        a6.m mVar = (a6.m) this.c;
        mVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) mVar.b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = true;
                    } else {
                        p4.m mVar = (p4.m) list.get(i10);
                        if (mVar != null && mVar.e()) {
                            i10++;
                        }
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 6:
            default:
                return super.toString();
            case 7:
                return ((a6.m) this.c).toString();
        }
    }

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    public u() {
        this.a = 0;
        this.c = new SparseBooleanArray();
    }

    public u(ArrayList arrayList, boolean z10) {
        this.a = 5;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.a = 4;
        this.b = z10;
    }

    public u(a6.d dVar, a6.m mVar) {
        this.a = 7;
        this.b = false;
        this.c = mVar;
    }

    public u(StringBuilder sb2) {
        this.a = 8;
        this.c = sb2;
        this.b = true;
    }
}
