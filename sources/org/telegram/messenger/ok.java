package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class ok implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$getMusicDialogsSortedByVisibleOrder$1;
        int lambda$getLocales$3;
        int lambda$getLanguages$1;
        switch (this.a) {
            case 0:
                lambda$getMusicDialogsSortedByVisibleOrder$1 = TelegramMediaSession.lambda$getMusicDialogsSortedByVisibleOrder$1((HashMap) this.b, (Long) obj, (Long) obj2);
                return lambda$getMusicDialogsSortedByVisibleOrder$1;
            case 1:
                lambda$getLocales$3 = TranslateController.lambda$getLocales$3((LocaleController.LocaleInfo) this.b, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
                return lambda$getLocales$3;
            default:
                lambda$getLanguages$1 = TranslateController.lambda$getLanguages$1((Collator) this.b, (TranslateController.Language) obj, (TranslateController.Language) obj2);
                return lambda$getLanguages$1;
        }
    }
}
