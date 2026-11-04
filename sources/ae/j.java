package ae;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b8.f1;
import wd.u1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements od.p {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i3) {
        this.a = i3;
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        fd.b bVar;
        int i3 = this.a;
        dd.k kVar = dd.k.a;
        switch (i3) {
            case 0:
                break;
            case 1:
                od.a f10 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f10, "f");
                int i10 = b1.d.d;
                f1.a((CancellationSignal) obj, f10);
                break;
            case 2:
                fd.f fVar = (fd.f) obj2;
                if (fVar instanceof u1) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    int intValue = num != null ? num.intValue() : 1;
                    if (intValue != 0) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 3:
                u1 u1Var = (u1) obj;
                fd.f fVar2 = (fd.f) obj2;
                if (u1Var == null) {
                    if (fVar2 instanceof u1) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                od.a f11 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f11.invoke();
                    break;
                }
                break;
            case 6:
                od.a f12 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f12.invoke();
                    break;
                }
                break;
            case 7:
                od.a f13 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f13, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f13.invoke();
                    break;
                }
                break;
            case 8:
                String acc = (String) obj;
                fd.f element = (fd.f) obj2;
                kotlin.jvm.internal.j.e(acc, "acc");
                kotlin.jvm.internal.j.e(element, "element");
                if (acc.length() != 0) {
                    break;
                } else {
                    break;
                }
            case 9:
                fd.h acc2 = (fd.h) obj;
                fd.f element2 = (fd.f) obj2;
                kotlin.jvm.internal.j.e(acc2, "acc");
                kotlin.jvm.internal.j.e(element2, "element");
                fd.h minusKey = acc2.minusKey(element2.getKey());
                fd.i iVar = fd.i.a;
                if (minusKey != iVar) {
                    fd.d dVar = fd.d.a;
                    fd.e eVar = (fd.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new fd.b(element2, minusKey);
                    } else {
                        fd.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar) {
                            break;
                        } else {
                            bVar = new fd.b(eVar, new fd.b(element2, minusKey2));
                        }
                    }
                    break;
                }
                break;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((fd.h) obj).plus((fd.f) obj2);
    }
}
