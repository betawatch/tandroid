package b1;

import a8.t1;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import jd.i;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        ld.b bVar;
        int i10 = this.a;
        i iVar = i.a;
        switch (i10) {
            case 0:
                ud.a f7 = (ud.a) obj2;
                kotlin.jvm.internal.i.e(f7, "f");
                int i11 = d.d;
                t1.a((CancellationSignal) obj, f7);
                return iVar;
            case 1:
                ud.a f10 = (ud.a) obj2;
                kotlin.jvm.internal.i.e(f10, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f10.invoke();
                }
                return iVar;
            case 2:
                ud.a f11 = (ud.a) obj2;
                kotlin.jvm.internal.i.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 3:
                ud.a f12 = (ud.a) obj2;
                kotlin.jvm.internal.i.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                ld.f element = (ld.f) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                ld.h acc2 = (ld.h) obj;
                ld.f element2 = (ld.f) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                ld.h minusKey = acc2.minusKey(element2.getKey());
                ld.i iVar2 = ld.i.a;
                if (minusKey == iVar2) {
                    return element2;
                }
                ld.d dVar = ld.d.a;
                ld.e eVar = (ld.e) minusKey.get(dVar);
                if (eVar == null) {
                    bVar = new ld.b(element2, minusKey);
                } else {
                    ld.h minusKey2 = minusKey.minusKey(dVar);
                    if (minusKey2 == iVar2) {
                        return new ld.b(eVar, element2);
                    }
                    bVar = new ld.b(eVar, new ld.b(element2, minusKey2));
                }
                return bVar;
        }
    }
}
