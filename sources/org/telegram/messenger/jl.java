package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ TranslateController a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ TranslateController.MessageKey c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ jl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.a = translateController;
        this.b = messageObject;
        this.c = messageKey;
        this.d = callback;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        this.a.lambda$detectPhotoLanguage$42(this.b, this.c, this.d, exc);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.c;
        Utilities.Callback callback = this.d;
        this.a.lambda$detectPhotoLanguage$40(this.b, messageKey, callback, str);
    }
}
