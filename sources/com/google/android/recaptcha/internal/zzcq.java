package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                    if (pbb.d(file.getName(), this.zzb)) {
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
        gl1 gl1Var = new gl1('A', 'z');
        ArrayList arrayList = new ArrayList(mm2.c(gl1Var, 10));
        Iterator it = gl1Var.iterator();
        while (true) {
            fl1 fl1Var = (fl1) it;
            boolean z = fl1Var.b;
            if (!z) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                Collections.shuffle(arrayList2);
                String f = km2.f(arrayList2.subList(0, 8), "", null, null, null, 62);
                Context context = this.zza;
                String str3 = this.zzb;
                File file = new File(context.getCacheDir(), str3.concat(f));
                zzdl.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(context.getCacheDir(), str3.concat(String.valueOf(str))));
                return;
            }
            int i = fl1Var.c;
            if (i != fl1Var.a) {
                fl1Var.c = i + 1;
            } else {
                if (!z) {
                    u36.g();
                    return;
                }
                fl1Var.b = false;
            }
            arrayList.add(Character.valueOf((char) i));
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
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = listFiles[i];
                    if (rr5.a(file2.getName(), this.zzb + str)) {
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
