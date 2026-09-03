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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u implements j9.j, f2.l0, androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static u f(Bundle bundle) {
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
        return new u(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // f2.l0
    public void C(int i10, int i11) {
        this.b = true;
        ((f2.p0) this.c).p(i10, i11);
    }

    @Override // f2.l0
    public void L0(int i10, int i11) {
        this.b = true;
        ((f2.p0) this.c).t(i10, i11);
    }

    @Override // androidx.lifecycle.a0
    public void W(Object obj) {
        this.b = true;
        androidx.biometric.f0 f0Var = (androidx.biometric.f0) this.c;
        f0Var.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) f0Var.b;
        signInHubActivity.setResult(signInHubActivity.O, signInHubActivity.P);
        signInHubActivity.finish();
    }

    @Override // j9.j
    public void a(j9.i iVar, int i10) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i10);
    }

    public void b(int i10) {
        h5.a.i(!this.b);
        ((SparseBooleanArray) this.c).append(i10, true);
    }

    public h5.g c() {
        h5.a.i(!this.b);
        this.b = true;
        return new h5.g((SparseBooleanArray) this.c);
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
        char c3 = 2;
        for (int i11 = 0; i11 < i10 && c3 == 2; i11++) {
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
                            c3 = 2;
                            break;
                    }
                }
                c3 = 0;
            }
            c3 = 1;
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 != 1) {
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
            ((y2.p) this.c).a(new v2.a(null, x3Var, v2.d.a, null), new sg.a(29));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // f2.l0
    public void i1(int i10, int i11) {
        ((f2.p0) this.c).r(i10, i11, null);
    }

    @Override // f2.l0
    public void j0(int i10, int i11) {
        this.b = true;
        ((f2.p0) this.c).s(i10, i11);
    }

    public String toString() {
        int i10;
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z4 = false;
                while (true) {
                    if (i10 >= size) {
                        z4 = true;
                    } else {
                        n nVar = (n) list.get(i10);
                        i10 = (nVar != null && nVar.e()) ? i10 + 1 : 0;
                    }
                }
                sb.append(z4);
                sb.append(" }");
                return sb.toString();
            case 8:
                return ((androidx.biometric.f0) this.c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    public u(ArrayList arrayList, boolean z4) {
        this.a = 0;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z4;
    }

    public u() {
        this.a = 1;
        this.c = new SparseBooleanArray();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(p0.e eVar, boolean z4) {
        this(eVar, 4);
        this.a = 4;
        this.b = z4;
    }

    public u(o5.d dVar, androidx.biometric.f0 f0Var) {
        this.a = 8;
        this.b = false;
        this.c = f0Var;
    }

    public u(StringBuilder sb) {
        this.a = 2;
        this.c = sb;
        this.b = true;
    }
}
