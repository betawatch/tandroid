package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.l9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Wallet.k8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ g2(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                y5 y5Var = this.b;
                y5Var.H = null;
                a aVar = y5Var.y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = y5Var.f.getText().toString();
                        if (!obj.equals(y5Var.I)) {
                            a aVar2 = y5Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i7 = y5Var.J + 1;
                            y5Var.J = i7;
                            l9 l9Var = new l9(y5Var, i7, aVar2, obj, 2);
                            qi.p pVar = qi.j.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.a.d(spannableString.toString(), b10, new k8(14, spannableString, l9Var));
                                break;
                            } else {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.web.e1(11, l9Var, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
