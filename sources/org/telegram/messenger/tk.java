package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ TranslateController a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ tk(TranslateController translateController, MessageObject messageObject, long j10, int i9) {
        this.a = translateController;
        this.b = messageObject;
        this.c = j10;
        this.d = i9;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        this.a.lambda$checkLanguage$15(this.b, this.c, this.d, exc);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        long j10 = this.c;
        int i9 = this.d;
        this.a.lambda$checkLanguage$13(this.b, j10, i9, str);
    }
}
