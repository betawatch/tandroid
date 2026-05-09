package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.ModelResource;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.LanguageIdentificationOptions;
import java.util.Iterator;
import org.telegram.messenger.TranslateController;

/* loaded from: classes3.dex */
public final class zzg extends ModelResource {
    private LanguageIdentifierDelegate zza;
    private LanguageIdentificationOptions zzb;
    private final Context zzc;
    private final LanguageIdentifierCreatorDelegate zzd;
    private final boolean zze;

    public zzg(Context context, LanguageIdentifierCreatorDelegate languageIdentifierCreatorDelegate) {
        this.zzc = context;
        this.zzd = languageIdentifierCreatorDelegate;
        this.zze = languageIdentifierCreatorDelegate.getPriority() == 100;
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void load() {
        this.taskQueue.checkIsRunningOnCurrentThread();
        if (this.zza == null) {
            LanguageIdentifierDelegate create = this.zzd.create(this.zzc, this.zzb);
            this.zza = create;
            create.init();
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void release() {
        this.taskQueue.checkIsRunningOnCurrentThread();
        LanguageIdentifierDelegate languageIdentifierDelegate = this.zza;
        if (languageIdentifierDelegate != null) {
            languageIdentifierDelegate.release();
            this.zza = null;
        }
    }

    public final String zzc(String str, float f) {
        String str2;
        if (this.zza == null) {
            load();
        }
        if (str.isEmpty()) {
            return TranslateController.UNKNOWN_LANGUAGE;
        }
        Iterator it = ((LanguageIdentifierDelegate) Preconditions.checkNotNull(this.zza)).identifyPossibleLanguages(str, f).iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = "";
                break;
            }
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) it.next();
            if (!"unknown".equals(identifiedLanguage.getLanguageTag())) {
                str2 = identifiedLanguage.getLanguageTag();
                break;
            }
        }
        return str2.isEmpty() ? TranslateController.UNKNOWN_LANGUAGE : "iw".equals(str2) ? "he" : str2;
    }

    final void zze(LanguageIdentificationOptions languageIdentificationOptions) {
        this.zzb = languageIdentificationOptions;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
