package com.google.android.recaptcha.internal;

import android.content.Context;
import cd.b;
import cd.c;
import fd.j;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import pc.g;
import pc.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
                int i9 = 0;
                for (File file : listFiles) {
                    if (j.h(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(i.d(cVar));
        Iterator it = cVar.iterator();
        while (true) {
            b bVar = (b) it;
            boolean z10 = bVar.d;
            if (!z10) {
                ArrayList o6 = g.o(arrayList);
                Collections.shuffle(o6);
                String h = g.h(o6.subList(0, 8), "", null, null, null, 62);
                Context context = this.zza;
                String str3 = this.zzb;
                File file = new File(context.getCacheDir(), str3.concat(String.valueOf(h)));
                zzdl.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(context.getCacheDir(), str3.concat(String.valueOf(str))));
                return;
            }
            int i9 = bVar.e;
            if (i9 != bVar.c) {
                bVar.e = bVar.b + i9;
            } else {
                if (!z10) {
                    throw new NoSuchElementException();
                }
                bVar.d = false;
            }
            arrayList.add(Character.valueOf((char) i9));
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
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    File file2 = listFiles[i9];
                    if (kotlin.jvm.internal.i.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i9++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
