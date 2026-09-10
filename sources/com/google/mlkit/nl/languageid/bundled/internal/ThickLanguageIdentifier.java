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
import mb.a;
import n6.l;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class ThickLanguageIdentifier {
    public static boolean c;
    public final Context a;
    public long b;

    public ThickLanguageIdentifier(Context context) {
        this.a = context;
    }

    private native void nativeDestroy(long j3);

    private native IdentifiedLanguage[] nativeIdentifyPossibleLanguages(long j3, byte[] bArr, float f7);

    private native long nativeInitFromBuffer(MappedByteBuffer mappedByteBuffer, long j3);

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
                } catch (UnsatisfiedLinkError e) {
                    throw new a("Couldn't load language identification library.", e);
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
        } catch (IOException e7) {
            throw new a("Couldn't open language identification model file", e7);
        }
    }

    public final void c() {
        long j3 = this.b;
        if (j3 == 0) {
            return;
        }
        nativeDestroy(j3);
        this.b = 0L;
    }
}
