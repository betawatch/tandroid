package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ CaptchaController.Request d;

    public /* synthetic */ q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = request;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                CaptchaController.lambda$request$2(this.b, this.c, this.d, (RecaptchaTasksClient) obj);
                break;
            default:
                CaptchaController.lambda$request$0(this.b, this.c, this.d, (String) obj);
                break;
        }
    }
}
