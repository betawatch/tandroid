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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class t implements s4.d0, androidx.lifecycle.a0, y9.i {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ t(int i10) {
        this.a = i10;
    }

    public static t g(Bundle bundle) {
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
        return new t(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // s4.d0
    public void X(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).s(i10, i11);
    }

    @Override // androidx.lifecycle.a0
    public void Y(Object obj) {
        this.b = true;
        qb.c cVar = (qb.c) this.c;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
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

    @Override // s4.d0
    public void a1(int i10, int i11) {
        ((s4.g0) this.c).r(i10, i11, null);
    }

    public void b(int i10) {
        u6.p(!this.b);
        ((SparseBooleanArray) this.c).append(i10, true);
    }

    public void c(u uVar) {
        for (int i10 = 0; i10 < uVar.a.size(); i10++) {
            b(uVar.a(i10));
        }
    }

    public u d() {
        u6.p(!this.b);
        this.b = true;
        return new u((SparseBooleanArray) this.c);
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
            ((l5.s) this.c).a(new i5.a(null, y3Var, i5.d.a, null), new k2.f0(4));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // s4.d0
    public void t0(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).t(i10, i11);
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
                return ((qb.c) this.c).toString();
        }
    }

    @Override // s4.d0
    public void y(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).p(i10, i11);
    }

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
    }

    public t() {
        this.a = 0;
        this.c = new SparseBooleanArray();
    }

    public t(ArrayList arrayList, boolean z10) {
        this.a = 5;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.a = 4;
        this.b = z10;
    }

    public t(a6.d dVar, qb.c cVar) {
        this.a = 7;
        this.b = false;
        this.c = cVar;
    }

    public t(StringBuilder sb2) {
        this.a = 8;
        this.c = sb2;
        this.b = true;
    }
}
