package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class zzcq implements zzbt {
    private final Context zza;
    private final String zzb = "rce_";

    public zzcq(Context context) {
        this.zza = context;
        new zzdl(context);
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzdl.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (File file : listFiles) {
                    if (StringsKt.startsWith$default(file.getName(), this.zzb, false, 2, null)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final void zzc(String str, String str2) {
        CharRange charRange = new CharRange('A', 'z');
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charRange, 10));
        Iterator it = charRange.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(((CharIterator) it).nextChar()));
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.shuffled(arrayList).subList(0, 8), "", null, null, 0, null, null, 62, null);
        Context context = this.zza;
        String str3 = this.zzb;
        File file = new File(context.getCacheDir(), str3.concat(String.valueOf(joinToString$default)));
        zzdl.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(context.getCacheDir(), str3.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final boolean zzd(String str) {
        File file;
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = listFiles[i];
                    if (Intrinsics.areEqual(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
