package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ CaptchaController.Request d;

    public /* synthetic */ v0(String str, String str2, CaptchaController.Request request, int i10) {
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
