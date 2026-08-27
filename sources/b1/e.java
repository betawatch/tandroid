package b1;

import ad.p;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import g7.d0;
import kotlin.jvm.internal.j;
import pc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        rc.b bVar;
        int i10 = this.a;
        i iVar = i.a;
        switch (i10) {
            case 0:
                ad.a f10 = (ad.a) obj2;
                j.e(f10, "f");
                int i11 = d.d;
                d0.a((CancellationSignal) obj, f10);
                return iVar;
            case 1:
                ad.a f11 = (ad.a) obj2;
                j.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 2:
                ad.a f12 = (ad.a) obj2;
                j.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 3:
                ad.a f13 = (ad.a) obj2;
                j.e(f13, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f13.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                rc.f element = (rc.f) obj2;
                j.e(acc, "acc");
                j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                rc.h acc2 = (rc.h) obj;
                rc.f element2 = (rc.f) obj2;
                j.e(acc2, "acc");
                j.e(element2, "element");
                rc.h minusKey = acc2.minusKey(element2.getKey());
                rc.i iVar2 = rc.i.a;
                if (minusKey == iVar2) {
                    return element2;
                }
                rc.d dVar = rc.d.a;
                rc.e eVar = (rc.e) minusKey.get(dVar);
                if (eVar == null) {
                    bVar = new rc.b(element2, minusKey);
                } else {
                    rc.h minusKey2 = minusKey.minusKey(dVar);
                    if (minusKey2 == iVar2) {
                        return new rc.b(eVar, element2);
                    }
                    bVar = new rc.b(eVar, new rc.b(element2, minusKey2));
                }
                return bVar;
        }
    }
}
