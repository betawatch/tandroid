package mi;

import android.text.SpannableString;
import android.text.TextUtils;
import ci.w9;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ j2(b6 b6Var, int i3) {
        this.a = i3;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                b6 b6Var = this.b;
                b6Var.H = null;
                a aVar = b6Var.y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = b6Var.f.getText().toString();
                        if (!obj.equals(b6Var.I)) {
                            a aVar2 = b6Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i3 = b6Var.J + 1;
                            b6Var.J = i3;
                            w9 w9Var = new w9(b6Var, i3, aVar2, obj, 2);
                            oi.q qVar = oi.k.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = oi.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                oi.k.a.d(spannableString.toString(), b10, new d4(10, spannableString, w9Var));
                                break;
                            } else {
                                org.telegram.messenger.g0.h3(new m2.s(18, w9Var, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
