// default package

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jba implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tba b;

    public /* synthetic */ jba(tba tbaVar, byte b) {
        this.a = b;
        this.b = tbaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        tba tbaVar = this.b;
        switch (b) {
            case 0:
                m01.u(tbaVar.getParentActivity(), tbaVar.getMessagesController().k4.w2.f);
                tbaVar.getMessagesController().v4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                tbaVar.getClass();
                tbaVar.presentFragment(new v8(3));
                break;
            case 2:
                tbaVar.getMessagesController().v4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                tbaVar.getClass();
                tbaVar.presentFragment(new o7c(8, null));
                break;
            case 4:
                tbaVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                tbaVar.c0();
                break;
            default:
                int i = tbaVar.R + 1;
                tbaVar.R = i;
                if (i >= 2) {
                    tbaVar.presentFragment(new k93());
                    break;
                } else {
                    boolean z = f11.a;
                    try {
                        Toast.makeText(tbaVar.getParentActivity(), ob6.M0(2131751590, null), 0).show();
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
        }
    }
}
