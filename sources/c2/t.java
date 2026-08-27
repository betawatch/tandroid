package c2;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.w3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t implements g9.j, f2.m0, androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ t(int i10) {
        this.a = i10;
    }

    public static t f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                arrayList.add(bundle2 != null ? new n(bundle2) : null);
            }
        }
        return new t(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // f2.m0
    public void A(int i10, int i11) {
        this.b = true;
        ((f2.q0) this.c).p(i10, i11);
    }

    @Override // androidx.lifecycle.a0
    public void J(Object obj) {
        this.b = true;
        ga.c cVar = (ga.c) this.c;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.b;
        signInHubActivity.setResult(signInHubActivity.N, signInHubActivity.O);
        signInHubActivity.finish();
    }

    @Override // f2.m0
    public void K0(int i10, int i11) {
        this.b = true;
        ((f2.q0) this.c).t(i10, i11);
    }

    @Override // f2.m0
    public void S(int i10, int i11) {
        this.b = true;
        ((f2.q0) this.c).s(i10, i11);
    }

    @Override // g9.j
    public void a(g9.i iVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        d5.a.i(!this.b);
        ((SparseBooleanArray) this.c).append(i10, true);
    }

    public d5.g c() {
        d5.a.i(!this.b);
        this.b = true;
        return new d5.g((SparseBooleanArray) this.c);
    }

    public void d() {
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
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e() {
        return this.b;
    }

    public boolean g(int i10, CharSequence charSequence) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        p0.e eVar = (p0.e) this.c;
        if (eVar == null) {
            return e();
        }
        eVar.getClass();
        char c10 = 2;
        for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            t tVar = p0.f.a;
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
            return e();
        }
        return false;
    }

    public void h(w3 w3Var) {
        if (this.b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((w2.p) this.c).a(new t2.a(null, w3Var, t2.d.a, null), new u3.k(6));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // f2.m0
    public void k1(int i10, int i11) {
        ((f2.q0) this.c).r(i10, i11, null);
    }

    public String toString() {
        int i10;
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                while (true) {
                    if (i10 >= size) {
                        z10 = true;
                    } else {
                        n nVar = (n) list.get(i10);
                        i10 = (nVar != null && nVar.e()) ? i10 + 1 : 0;
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 8:
                return ((ga.c) this.c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    public t() {
        this.a = 1;
        this.c = new SparseBooleanArray();
    }

    public t(ArrayList arrayList, boolean z10) {
        this.a = 0;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(p0.e eVar, boolean z10) {
        this(eVar, 6);
        this.a = 6;
        this.b = z10;
    }

    public t(k5.d dVar, ga.c cVar) {
        this.a = 8;
        this.b = false;
        this.c = cVar;
    }

    public t(StringBuilder sb2) {
        this.a = 2;
        this.c = sb2;
        this.b = true;
    }
}
