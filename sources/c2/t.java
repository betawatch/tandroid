package c2;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.x3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t implements f9.j, f2.o0, androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ t(int i9) {
        this.a = i9;
    }

    public static t f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i9);
                arrayList.add(bundle2 != null ? new n(bundle2) : null);
            }
        }
        return new t(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // androidx.lifecycle.a0
    public void E(Object obj) {
        this.b = true;
        k5.i iVar = (k5.i) this.c;
        iVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) iVar.b;
        signInHubActivity.setResult(signInHubActivity.N, signInHubActivity.O);
        signInHubActivity.finish();
    }

    @Override // f2.o0
    public void I(int i9, int i10) {
        this.b = true;
        ((f2.r0) this.c).s(i9, i10);
    }

    @Override // f2.o0
    public void J0(int i9, int i10) {
        this.b = true;
        ((f2.r0) this.c).t(i9, i10);
    }

    @Override // f9.j
    public void a(f9.i iVar, int i9) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i9);
    }

    public void b(int i9) {
        d5.a.i(!this.b);
        ((SparseBooleanArray) this.c).append(i9, true);
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

    public boolean g(int i9, CharSequence charSequence) {
        if (charSequence == null || i9 < 0 || charSequence.length() - i9 < 0) {
            throw new IllegalArgumentException();
        }
        p0.e eVar = (p0.e) this.c;
        if (eVar == null) {
            return e();
        }
        eVar.getClass();
        char c10 = 2;
        for (int i10 = 0; i10 < i9 && c10 == 2; i10++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i10));
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

    public void h(x3 x3Var) {
        if (this.b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((w2.p) this.c).a(new t2.a(null, x3Var, t2.d.a, null), new v0.l(1));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // f2.o0
    public void j1(int i9, int i10) {
        ((f2.r0) this.c).r(i9, i10, null);
    }

    @Override // f2.o0
    public void t(int i9, int i10) {
        this.b = true;
        ((f2.r0) this.c).p(i9, i10);
    }

    public String toString() {
        int i9;
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                while (true) {
                    if (i9 >= size) {
                        z10 = true;
                    } else {
                        n nVar = (n) list.get(i9);
                        i9 = (nVar != null && nVar.e()) ? i9 + 1 : 0;
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 8:
                return ((k5.i) this.c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(Object obj, int i9) {
        this.a = i9;
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
        this(eVar, 7);
        this.a = 7;
        this.b = z10;
    }

    public t(k5.d dVar, k5.i iVar) {
        this.a = 8;
        this.b = false;
        this.c = iVar;
    }

    public t(StringBuilder sb2) {
        this.a = 2;
        this.c = sb2;
        this.b = true;
    }
}
