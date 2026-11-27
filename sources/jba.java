// default package

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jba implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uba b;

    public /* synthetic */ jba(uba ubaVar, byte b) {
        this.a = b;
        this.b = ubaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        uba ubaVar = this.b;
        switch (b) {
            case 0:
                m01.u(ubaVar.getParentActivity(), ubaVar.getMessagesController().l4.w2.f);
                ubaVar.getMessagesController().v4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                ubaVar.getClass();
                ubaVar.presentFragment(new v8(3));
                break;
            case 2:
                ubaVar.getMessagesController().v4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                ubaVar.getClass();
                ubaVar.presentFragment(new o7c(8, null));
                break;
            case 4:
                ubaVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                ubaVar.c0();
                break;
            default:
                int i = ubaVar.R + 1;
                ubaVar.R = i;
                if (i >= 2) {
                    ubaVar.presentFragment(new k93());
                    break;
                } else {
                    boolean z = f11.a;
                    try {
                        Toast.makeText(ubaVar.getParentActivity(), ob6.M0(2131751590, null), 0).show();
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
        }
    }
}
