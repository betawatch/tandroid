package ji;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ k2(i6 i6Var, int i10) {
        this.a = i10;
        this.b = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                i6 i6Var = this.b;
                i6Var.G = null;
                a aVar = i6Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = i6Var.f.getText().toString();
                        if (!obj.equals(i6Var.H)) {
                            a aVar2 = i6Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = i6Var.I + 1;
                            i6Var.I = i10;
                            gi.m0 m0Var = new gi.m0(i6Var, i10, aVar2, obj, 1);
                            li.q qVar = li.k.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = li.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                li.k.a.d(spannableString.toString(), b10, new ah.h0(24, spannableString, m0Var));
                                break;
                            } else {
                                AndroidUtilities.runOnUIThread(new v2(9, m0Var, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
