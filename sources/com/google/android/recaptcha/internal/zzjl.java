package com.google.android.recaptcha.internal;

import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class zzjl implements zzjt {
    public static final zzjl zza = new zzjl();

    private zzjl() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        String joinToString$default;
        String str;
        if (zzztVarArr.length != 1) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            joinToString$default = ArraysKt.joinToString$default((int[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, Charsets.UTF_8);
            } else if (zza2 instanceof long[]) {
                joinToString$default = ArraysKt.joinToString$default((long[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof short[]) {
                joinToString$default = ArraysKt.joinToString$default((short[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof float[]) {
                joinToString$default = ArraysKt.joinToString$default((float[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof double[]) {
                joinToString$default = ArraysKt.joinToString$default((double[]) zza2, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                joinToString$default = ArraysKt.joinToString$default((Object[]) zza2, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzdm(4, 5, null);
                }
                joinToString$default = CollectionsKt.joinToString$default((Iterable) zza2, ",", "[", "]", 0, null, null, 56, null);
            }
            joinToString$default = str;
        }
        zzizVar.zzc().zze(i, joinToString$default);
    }
}
