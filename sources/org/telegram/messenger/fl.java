package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class fl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ TranslateController a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ fl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
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
