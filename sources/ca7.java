// default package

import android.text.style.CharacterStyle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ca7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fn7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ca7(fn7 fn7Var, Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, Object obj5, byte b) {
        this.a = b;
        this.d = fn7Var;
        this.e = obj;
        this.f = obj2;
        this.h = obj3;
        this.n = obj4;
        this.b = z;
        this.c = z2;
        this.r = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.r;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) fn7Var;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                e eVar = (e) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.InputUser inputUser = (TLRPC.InputUser) obj;
                if (((gc7) obj5) == null) {
                    jj.c0(uc7Var.currentAccount, tL_error, eVar, tLObject, Boolean.valueOf(z2 && !z));
                }
                if (z2 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                    uc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                    break;
                }
                break;
            default:
                zu1 zu1Var = (zu1) fn7Var;
                String str = (String) obj5;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                r47 r47Var = (r47) obj3;
                wb2 wb2Var = (wb2) obj2;
                tu0 tu0Var = (tu0) obj;
                if (!str.startsWith("video?")) {
                    if (z2 && !z) {
                        tu0Var.run();
                        zu1Var.getParentActivity();
                        m01.p(str);
                        break;
                    } else {
                        zu1Var.Z9(r47Var, false, false);
                        tu0Var.run();
                        zu1Var.pa(characterStyle, str, false, wb2Var, r47Var);
                        break;
                    }
                } else {
                    zu1Var.m6(characterStyle, false, r47Var, wb2Var);
                    break;
                }
        }
    }
}
