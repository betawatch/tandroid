package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ TranslateController a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
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
