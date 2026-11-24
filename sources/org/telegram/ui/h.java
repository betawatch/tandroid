package org.telegram.ui;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, String str, String str2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        String str2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                j jVar = ((ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) obj).a;
                if ("resize_frame".equals(str2)) {
                    try {
                        jVar.r = Utilities.z(new JSONObject(str).getString("height")).intValue();
                        jVar.requestLayout();
                        break;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            default:
                p pVar = ((PaymentFormActivity$TelegramWebviewProxy) obj).a;
                if (pVar.getParentActivity() != null && str2.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        pVar.x0 = jSONObject.getJSONObject("credentials").toString();
                        pVar.y0 = jSONObject.getString("title");
                    } catch (Throwable th) {
                        pVar.x0 = str;
                        fa4.g(th, true);
                    }
                    pVar.h0();
                    break;
                }
                break;
        }
    }
}
