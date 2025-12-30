package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import kotlin.io.FilesKt;

/* loaded from: classes.dex */
public final class zzdl {
    public zzdl(Context context) {
    }

    public static final byte[] zza(File file) {
        return FilesKt.readBytes(file);
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        FilesKt.writeBytes(file, bArr);
    }
}
