package oi;

import android.text.SpannableString;
import android.text.TextUtils;
import di.o9;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ h2(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                z5 z5Var = this.b;
                z5Var.H = null;
                a aVar = z5Var.y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = z5Var.f.getText().toString();
                        if (!obj.equals(z5Var.I)) {
                            a aVar2 = z5Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i7 = z5Var.J + 1;
                            z5Var.J = i7;
                            o9 o9Var = new o9(z5Var, i7, aVar2, obj, 3);
                            qi.p pVar = qi.j.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = qi.p.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                qi.j.a.d(spannableString.toString(), b10, new wc1(12, spannableString, o9Var));
                                break;
                            } else {
                                org.telegram.messenger.g0.g3(new p4.o0(3, o9Var, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
