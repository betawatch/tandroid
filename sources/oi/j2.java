package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.p9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ j2(a6 a6Var, int i7) {
        this.a = i7;
        this.b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                a6 a6Var = this.b;
                a6Var.H = null;
                a aVar = a6Var.y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = a6Var.f.getText().toString();
                        if (!obj.equals(a6Var.I)) {
                            a aVar2 = a6Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i7 = a6Var.J + 1;
                            a6Var.J = i7;
                            p9 p9Var = new p9(a6Var, i7, aVar2, obj, 4);
                            qi.p pVar = qi.j.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.a.d(spannableString.toString(), b10, new wc1(12, spannableString, p9Var));
                                break;
                            } else {
                                org.telegram.messenger.g0.g3(new p4.z(5, p9Var, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
