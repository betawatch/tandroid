package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ TranslateController a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.a = translateController;
        this.b = messageObject;
        this.c = j3;
        this.d = i10;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        this.a.lambda$checkLanguage$15(this.b, this.c, this.d, exc);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        long j3 = this.c;
        int i10 = this.d;
        this.a.lambda$checkLanguage$13(this.b, j3, i10, str);
    }
}
