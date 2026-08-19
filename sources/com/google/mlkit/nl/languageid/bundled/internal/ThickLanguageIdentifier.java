package com.google.mlkit.nl.languageid.bundled.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.LanguageIdentificationOptions;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierDelegate;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ThickLanguageIdentifier implements LanguageIdentifierDelegate {
    private static boolean zba;
    private final Context zbb;
    private long zbc;

    ThickLanguageIdentifier(Context context, LanguageIdentificationOptions languageIdentificationOptions) {
        this.zbb = context;
    }

    private native void nativeDestroy(long j);

    private native IdentifiedLanguage[] nativeIdentifyPossibleLanguages(long j, byte[] bArr, float f);

    private native long nativeInitFromBuffer(MappedByteBuffer mappedByteBuffer, long j);

    public static synchronized void zba() {
        synchronized (ThickLanguageIdentifier.class) {
            if (zba) {
                return;
            }
            try {
                System.loadLibrary("language_id_l2c_jni");
                zba = true;
            } catch (UnsatisfiedLinkError e) {
                throw new MlKitException("Couldn't load language identification library.", 13, e);
            }
        }
    }

    @Override // com.google.mlkit.nl.languageid.internal.LanguageIdentifierDelegate
    public final List identifyPossibleLanguages(String str, float f) {
        Preconditions.checkState(this.zbc != 0);
        IdentifiedLanguage[] nativeIdentifyPossibleLanguages = nativeIdentifyPossibleLanguages(this.zbc, str.getBytes(StandardCharsets.UTF_8), f);
        ArrayList arrayList = new ArrayList();
        for (IdentifiedLanguage identifiedLanguage : nativeIdentifyPossibleLanguages) {
            arrayList.add(new IdentifiedLanguage(identifiedLanguage.getLanguageTag(), identifiedLanguage.getConfidence()));
        }
        return arrayList;
    }

    @Override // com.google.mlkit.nl.languageid.internal.LanguageIdentifierDelegate
    public final void init() {
        Preconditions.checkState(this.zbc == 0);
        zba();
        try {
            AssetFileDescriptor openFd = this.zbb.getAssets().openFd("tflite_langid.tflite.jpg");
            try {
                FileChannel channel = new FileInputStream(openFd.getFileDescriptor()).getChannel();
                try {
                    long nativeInitFromBuffer = nativeInitFromBuffer(channel.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength()), openFd.getDeclaredLength());
                    this.zbc = nativeInitFromBuffer;
                    if (nativeInitFromBuffer == 0) {
                        throw new MlKitException("Couldn't load language identification model", 13);
                    }
                    channel.close();
                    openFd.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new MlKitException("Couldn't open language identification model file", 13, e);
        }
    }

    @Override // com.google.mlkit.nl.languageid.internal.LanguageIdentifierDelegate
    public final void release() {
        long j = this.zbc;
        if (j == 0) {
            return;
        }
        nativeDestroy(j);
        this.zbc = 0L;
    }
}
