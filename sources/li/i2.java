package li;

import android.text.SpannableString;
import android.text.TextUtils;
import bi.ya;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ i2(a6 a6Var, int i7) {
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
                a6Var.G = null;
                a aVar = a6Var.y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = a6Var.f.getText().toString();
                        if (!obj.equals(a6Var.H)) {
                            a aVar2 = a6Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i7 = a6Var.I + 1;
                            a6Var.I = i7;
                            ya yaVar = new ya(a6Var, i7, aVar2, obj, 2);
                            ni.s sVar = ni.m.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = ni.s.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                ni.m.a.d(spannableString.toString(), b10, new ni.c(0, spannableString, yaVar));
                                break;
                            } else {
                                org.telegram.messenger.g0.h3(new j3(13, yaVar, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
