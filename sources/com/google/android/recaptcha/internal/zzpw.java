package com.google.android.recaptcha.internal;

import a4.a;
import com.google.android.recaptcha.internal.zzpv;
import com.google.android.recaptcha.internal.zzpw;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class zzpw<MessageType extends zzpw<MessageType, BuilderType>, BuilderType extends zzpv<MessageType, BuilderType>> implements zzts {
    protected int zza = 0;

    public static void zzc(Iterable iterable, List list) {
        zzpv.zzd(iterable, list);
    }

    public int zza(zzug zzugVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final zzqm zzb() {
        try {
            int zzo = zzo();
            zzqm zzqmVar = zzqm.zzb;
            byte[] bArr = new byte[zzo];
            int i10 = zzqv.zzb;
            zzqs zzqsVar = new zzqs(bArr, 0, zzo);
            zze(zzqsVar);
            zzqsVar.zzC();
            return new zzqk(bArr);
        } catch (IOException e) {
            throw new RuntimeException(a.q("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzd() {
        try {
            int zzo = zzo();
            byte[] bArr = new byte[zzo];
            int i10 = zzqv.zzb;
            zzqs zzqsVar = new zzqs(bArr, 0, zzo);
            zze(zzqsVar);
            zzqsVar.zzC();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a.q("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
