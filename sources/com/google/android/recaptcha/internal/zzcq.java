package com.google.android.recaptcha.internal;

import android.content.Context;
import ed.g;
import ed.i;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import rd.b;
import rd.c;
import ud.l;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
                int i3 = 0;
                for (File file : listFiles) {
                    if (l.d(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(i.d(cVar, 10));
        Iterator it = cVar.iterator();
        while (true) {
            b bVar = (b) it;
            boolean z10 = bVar.d;
            if (!z10) {
                ArrayList n4 = g.n(arrayList);
                Collections.shuffle(n4);
                String g7 = g.g(n4.subList(0, 8), "", null, null, null, 62);
                Context context = this.zza;
                String str3 = this.zzb;
                File file = new File(context.getCacheDir(), str3.concat(String.valueOf(g7)));
                zzdl.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(context.getCacheDir(), str3.concat(String.valueOf(str))));
                return;
            }
            int i3 = bVar.e;
            if (i3 != bVar.c) {
                bVar.e = bVar.b + i3;
            } else {
                if (!z10) {
                    throw new NoSuchElementException();
                }
                bVar.d = false;
            }
            arrayList.add(Character.valueOf((char) i3));
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
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    File file2 = listFiles[i3];
                    if (j.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i3++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
