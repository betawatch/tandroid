package li;

import android.text.SpannableString;
import android.text.TextUtils;
import bi.ua;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ i2(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w();
                break;
            default:
                d6 d6Var = this.b;
                d6Var.G = null;
                a aVar = d6Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = d6Var.f.getText().toString();
                        if (!obj.equals(d6Var.H)) {
                            a aVar2 = d6Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = d6Var.I + 1;
                            d6Var.I = i10;
                            ua uaVar = new ua(d6Var, i10, aVar2, obj, 2);
                            ni.q qVar = ni.k.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = ni.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                ni.k.a.d(spannableString.toString(), b10, new m4.s0(5, spannableString, uaVar));
                                break;
                            } else {
                                AndroidUtilities.runOnUIThread(new k2.e0(17, uaVar, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
