package b2;

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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class p implements s4.e0, androidx.lifecycle.a0, x9.i {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ p(int i10) {
        this.a = i10;
    }

    public static p g(Bundle bundle) {
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
        return new p(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        this.b = true;
        ((s4.h0) this.c).p(i10, i11);
    }

    @Override // s4.e0
    public void P0(int i10, int i11) {
        this.b = true;
        ((s4.h0) this.c).t(i10, i11);
    }

    @Override // x9.i
    public void a(x9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        e2.d.g(!this.b);
        ((SparseBooleanArray) this.c).append(i10, true);
    }

    public void c(q qVar) {
        for (int i10 = 0; i10 < qVar.a.size(); i10++) {
            b(qVar.a(i10));
        }
    }

    public q d() {
        e2.d.g(!this.b);
        this.b = true;
        return new q((SparseBooleanArray) this.c);
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

    @Override // androidx.lifecycle.a0
    public void f0(Object obj) {
        this.b = true;
        a6.m mVar = (a6.m) this.c;
        mVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) mVar.b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
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
            p pVar = p0.f.a;
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

    public void i(x3 x3Var) {
        if (this.b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.c).a(new i5.a(null, x3Var, i5.d.a, null), new j2.e(17));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // s4.e0
    public void k0(int i10, int i11) {
        this.b = true;
        ((s4.h0) this.c).s(i10, i11);
    }

    @Override // s4.e0
    public void m1(int i10, int i11) {
        ((s4.h0) this.c).r(i10, i11, null);
    }

    public String toString() {
        int i10;
        switch (this.a) {
            case 5:
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
                        p4.m mVar = (p4.m) list.get(i10);
                        i10 = (mVar != null && mVar.e()) ? i10 + 1 : 0;
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 8:
                return ((a6.m) this.c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    public p() {
        this.a = 0;
        this.c = new SparseBooleanArray();
    }

    public p(ArrayList arrayList, boolean z10) {
        this.a = 5;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.a = 4;
        this.b = z10;
    }

    public p(a6.d dVar, a6.m mVar) {
        this.a = 8;
        this.b = false;
        this.c = mVar;
    }

    public p(StringBuilder sb2) {
        this.a = 9;
        this.c = sb2;
        this.b = true;
    }
}
