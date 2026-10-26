package b2;

import a8.yb;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u implements s4.e0, androidx.lifecycle.a0, z9.i {
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

    @Override // s4.e0
    public void A(int i10, int i11) {
        this.b = true;
        ((s4.h0) this.c).p(i10, i11);
    }

    @Override // s4.e0
    public void N0(int i10, int i11) {
        this.b = true;
        ((s4.h0) this.c).t(i10, i11);
    }

    @Override // androidx.lifecycle.a0
    public void Q(Object obj) {
        this.b = true;
        a4.l lVar = (a4.l) this.c;
        lVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) lVar.b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override // z9.i
    public void a(z9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        yb.p(!this.b);
        ((SparseBooleanArray) this.c).append(i10, true);
    }

    public void c(v vVar) {
        for (int i10 = 0; i10 < vVar.a.size(); i10++) {
            b(vVar.a(i10));
        }
    }

    public v d() {
        yb.p(!this.b);
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

    @Override // s4.e0
    public void g1(int i10, int i11) {
        ((s4.h0) this.c).r(i10, i11, null);
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

    public void i(x3 x3Var) {
        if (this.b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((m5.s) this.c).a(new j5.a(null, x3Var, j5.d.a, null), new m4.x0(11));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // s4.e0
    public void i0(int i10, int i11) {
        this.b = true;
        ((s4.h0) this.c).s(i10, i11);
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
                return ((a4.l) this.c).toString();
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

    public u(b6.d dVar, a4.l lVar) {
        this.a = 7;
        this.b = false;
        this.c = lVar;
    }

    public u(StringBuilder sb2) {
        this.a = 8;
        this.c = sb2;
        this.b = true;
    }
}
