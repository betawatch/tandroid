package com.google.android.recaptcha.internal;

import android.support.v4.media.a;
import com.google.android.recaptcha.internal.zzpv;
import com.google.android.recaptcha.internal.zzpw;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        } catch (IOException e6) {
            throw new RuntimeException(a.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e6);
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
        } catch (IOException e6) {
            throw new RuntimeException(a.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }
}
