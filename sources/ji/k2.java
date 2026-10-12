package ji;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                            mi.q qVar = mi.k.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b10 = mi.q.b(str);
                            if (!b10.isEmpty() && spannableString.length() != 0) {
                                mi.k.a.d(spannableString.toString(), b10, new m4.z0(2, spannableString, m0Var));
                                break;
                            } else {
                                AndroidUtilities.runOnUIThread(new v2(20, m0Var, spannableString));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
