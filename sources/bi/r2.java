package bi;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ r2(q6 q6Var, int i10) {
        this.a = i10;
        this.b = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                q6 q6Var = this.b;
                q6Var.G = null;
                a aVar = q6Var.y;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = q6Var.f.getText().toString();
                        if (!obj.equals(q6Var.H)) {
                            a aVar2 = q6Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = q6Var.I + 1;
                            q6Var.I = i10;
                            i6 i6Var = new i6(q6Var, i10, aVar2, obj, 0);
                            di.s sVar = di.l.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = di.s.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                di.l.a.d(spannableString.toString(), b10, new ag.m(10, spannableString, i6Var));
                                break;
                            } else {
                                org.telegram.messenger.i0.g3(new d1.e(2, i6Var, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
