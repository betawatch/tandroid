package com.google.android.recaptcha.internal;

import a9.p;
import com.google.android.recaptcha.internal.zzpv;
import com.google.android.recaptcha.internal.zzpw;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        } catch (IOException e9) {
            throw new RuntimeException(p.m("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e9);
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
        } catch (IOException e9) {
            throw new RuntimeException(p.m("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e9);
        }
    }
}
