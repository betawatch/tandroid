// default package

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hl1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hl1(zu1 zu1Var, String str, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zu1 zu1Var = this.b;
                String str = this.c;
                zu1Var.getClass();
                if (str != null && str.length() != 0) {
                    zu1Var.getMessagesController().M4(str, zu1Var.f);
                    break;
                } else {
                    zu1Var.getSendMessagesHelper().q0(p7a.b("/start", zu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                    break;
                }
                break;
            case 1:
                this.b.Ca(this.c);
                break;
            case 2:
                this.b.W8(this.c);
                break;
            case 3:
                this.b.ta(this.c, false);
                break;
            case 4:
                zu1 zu1Var2 = this.b;
                String str2 = this.c;
                zu1Var2.getClass();
                zu1Var2.presentFragment(new euc(str2));
                break;
            case 5:
                zu1 zu1Var3 = this.b;
                String str3 = this.c;
                String str4 = zu1Var3.getMessagesController().k4.O1.f;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "https://tonviewer.com/";
                } else if (!str4.endsWith("/")) {
                    str4 = str4.concat("/");
                }
                m01.w(zu1Var3.getParentActivity(), str4 + Uri.encode(str3), false);
                break;
            case 6:
                m01.u(this.b.getParentActivity(), "tel:".concat(this.c));
                break;
            case 7:
                zu1 zu1Var4 = this.b;
                hl.g(this.c);
                d31.b0(zu1Var4).i(ob6.M0(2131747022, null)).j();
                break;
            case 8:
                this.b.X8(this.c);
                break;
            case 9:
                m01.u(this.b.getParentActivity(), "tel:".concat(this.c));
                break;
            case 10:
                zu1 zu1Var5 = this.b;
                hl.g(this.c);
                d31.b0(zu1Var5).i(ob6.M0(2131747022, null)).j();
                break;
            default:
                m01.u(this.b.getParentActivity(), "https://fragment.com/username/".concat(this.c));
                break;
        }
    }
}
