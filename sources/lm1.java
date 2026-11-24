// default package

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ lm1(yv1 yv1Var, String str, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V8(this.c);
                break;
            case 1:
                yv1 yv1Var = this.b;
                String str = this.c;
                yv1Var.getClass();
                if (str != null && str.length() != 0) {
                    yv1Var.getMessagesController().G4(str, yv1Var.f);
                    break;
                } else {
                    yv1Var.getSendMessagesHelper().q0(y5a.b("/start", yv1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    break;
                }
                break;
            case 2:
                this.b.Ba(this.c);
                break;
            case 3:
                l11.u(this.b.getParentActivity(), "tel:".concat(this.c));
                break;
            case 4:
                yv1 yv1Var2 = this.b;
                gm.g(this.c);
                c41.b0(yv1Var2).i(jb6.M0(2131747028, null)).j();
                break;
            case 5:
                this.b.W8(this.c);
                break;
            case 6:
                l11.u(this.b.getParentActivity(), "tel:".concat(this.c));
                break;
            case 7:
                yv1 yv1Var3 = this.b;
                gm.g(this.c);
                c41.b0(yv1Var3).i(jb6.M0(2131747028, null)).j();
                break;
            case 8:
                this.b.sa(this.c, false);
                break;
            case 9:
                yv1 yv1Var4 = this.b;
                String str2 = this.c;
                yv1Var4.getClass();
                yv1Var4.presentFragment(new rrc(str2));
                break;
            case 10:
                yv1 yv1Var5 = this.b;
                String str3 = this.c;
                String str4 = yv1Var5.getMessagesController().l4.G1.f;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "https://tonviewer.com/";
                } else if (!str4.endsWith("/")) {
                    str4 = str4.concat("/");
                }
                l11.w(yv1Var5.getParentActivity(), str4 + Uri.encode(str3), false);
                break;
            default:
                l11.u(this.b.getParentActivity(), "https://fragment.com/username/".concat(this.c));
                break;
        }
    }
}
