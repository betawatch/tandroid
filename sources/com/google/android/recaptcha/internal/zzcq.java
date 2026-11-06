package com.google.android.recaptcha.internal;

import android.content.Context;
import hd.f;
import hd.h;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import ud.b;
import ud.c;
import xd.l;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                int i7 = 0;
                for (File file : listFiles) {
                    if (l.d(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(h.d(cVar, 10));
        Iterator it = cVar.iterator();
        while (true) {
            b bVar = (b) it;
            boolean z9 = bVar.d;
            if (!z9) {
                ArrayList n10 = f.n(arrayList);
                Collections.shuffle(n10);
                String g10 = f.g(n10.subList(0, 8), "", null, null, null, 62);
                Context context = this.zza;
                String str3 = this.zzb;
                File file = new File(context.getCacheDir(), str3.concat(String.valueOf(g10)));
                zzdl.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(context.getCacheDir(), str3.concat(String.valueOf(str))));
                return;
            }
            int i7 = bVar.e;
            if (i7 != bVar.c) {
                bVar.e = bVar.b + i7;
            } else {
                if (!z9) {
                    throw new NoSuchElementException();
                }
                bVar.d = false;
            }
            arrayList.add(Character.valueOf((char) i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final boolean zzd(String str) {
        File file;
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    File file2 = listFiles[i7];
                    if (j.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i7++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
