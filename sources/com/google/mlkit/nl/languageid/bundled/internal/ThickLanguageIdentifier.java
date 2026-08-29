package com.google.mlkit.nl.languageid.bundled.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import wa.a;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ThickLanguageIdentifier {
    public static boolean c;
    public final Context a;
    public long b;

    public ThickLanguageIdentifier(Context context) {
        this.a = context;
    }

    private native void nativeDestroy(long j10);

    private native IdentifiedLanguage[] nativeIdentifyPossibleLanguages(long j10, byte[] bArr, float f9);

    private native long nativeInitFromBuffer(MappedByteBuffer mappedByteBuffer, long j10);

    public final ArrayList a(String str) {
        l.k(this.b != 0);
        IdentifiedLanguage[] nativeIdentifyPossibleLanguages = nativeIdentifyPossibleLanguages(this.b, str.getBytes(StandardCharsets.UTF_8), 0.5f);
        ArrayList arrayList = new ArrayList();
        for (IdentifiedLanguage identifiedLanguage : nativeIdentifyPossibleLanguages) {
            arrayList.add(new IdentifiedLanguage(identifiedLanguage.a, identifiedLanguage.b));
        }
        return arrayList;
    }

    public final void b() {
        l.k(this.b == 0);
        synchronized (ThickLanguageIdentifier.class) {
            if (!c) {
                try {
                    System.loadLibrary("language_id_l2c_jni");
                    c = true;
                } catch (UnsatisfiedLinkError e10) {
                    throw new a("Couldn't load language identification library.", e10);
                }
            }
        }
        try {
            AssetFileDescriptor openFd = this.a.getAssets().openFd("tflite_langid.tflite.jpg");
            try {
                FileChannel channel = new FileInputStream(openFd.getFileDescriptor()).getChannel();
                try {
                    long nativeInitFromBuffer = nativeInitFromBuffer(channel.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength()), openFd.getDeclaredLength());
                    this.b = nativeInitFromBuffer;
                    if (nativeInitFromBuffer == 0) {
                        throw new a("Couldn't load language identification model", 13);
                    }
                    channel.close();
                    openFd.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e11) {
            throw new a("Couldn't open language identification model file", e11);
        }
    }

    public final void c() {
        long j10 = this.b;
        if (j10 == 0) {
            return;
        }
        nativeDestroy(j10);
        this.b = 0L;
    }
}
