package b1;

import a8.d7;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import gd.k;
import id.h;
import id.i;
import kotlin.jvm.internal.j;
import rd.p;
import zd.u1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        id.b bVar;
        int i7 = this.a;
        k kVar = k.a;
        switch (i7) {
            case 0:
                rd.a f10 = (rd.a) obj2;
                j.e(f10, "f");
                int i10 = d.d;
                d7.a((CancellationSignal) obj, f10);
                break;
            case 1:
                rd.a f11 = (rd.a) obj2;
                j.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                    break;
                }
                break;
            case 2:
                rd.a f12 = (rd.a) obj2;
                j.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                rd.a f13 = (rd.a) obj2;
                j.e(f13, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f13.invoke();
                    break;
                }
                break;
            case 5:
                id.f fVar = (id.f) obj2;
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
            case 6:
                u1 u1Var = (u1) obj;
                id.f fVar2 = (id.f) obj2;
                if (u1Var == null) {
                    if (fVar2 instanceof u1) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 7:
                break;
            case 8:
                String acc = (String) obj;
                id.f element = (id.f) obj2;
                j.e(acc, "acc");
                j.e(element, "element");
                if (acc.length() != 0) {
                    break;
                } else {
                    break;
                }
            case 9:
                h acc2 = (h) obj;
                id.f element2 = (id.f) obj2;
                j.e(acc2, "acc");
                j.e(element2, "element");
                h minusKey = acc2.minusKey(element2.getKey());
                i iVar = i.a;
                if (minusKey != iVar) {
                    id.d dVar = id.d.a;
                    id.e eVar = (id.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new id.b(element2, minusKey);
                    } else {
                        h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar) {
                            break;
                        } else {
                            bVar = new id.b(eVar, new id.b(element2, minusKey2));
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
        return ((h) obj).plus((id.f) obj2);
    }
}
