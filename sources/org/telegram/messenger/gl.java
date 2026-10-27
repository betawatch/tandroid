package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ TranslateController a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ gl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.a = translateController;
        this.b = messageObject;
        this.c = j10;
        this.d = i10;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        this.a.lambda$checkLanguage$15(this.b, this.c, this.d, exc);
    }

    @Override // org.telegram.messenger.LanguageDetector.StringCallback
    public void run(String str) {
        long j10 = this.c;
        int i10 = this.d;
        this.a.lambda$checkLanguage$13(this.b, j10, i10, str);
    }
}
