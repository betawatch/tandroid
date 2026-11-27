// default package

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ km9 b;

    public /* synthetic */ fh9(km9 km9Var, byte b) {
        this.a = b;
        this.b = km9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w();
                break;
            default:
                km9 km9Var = this.b;
                km9Var.H = null;
                mk0 mk0Var = km9Var.y;
                if (mk0Var != null) {
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = km9Var.f.getText().toString();
                        if (!obj.equals(km9Var.I)) {
                            mk0 mk0Var2 = km9Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) mk0Var2.b).language;
                            int i = km9Var.J + 1;
                            km9Var.J = i;
                            zo2 zo2Var = new zo2(km9Var, i, mk0Var2, obj, (byte) 6);
                            wm8 wm8Var = mk2.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b = wm8.b(str);
                            if (!b.isEmpty() && spannableString.length() != 0) {
                                mk2.a.d(spannableString.toString(), b, new q72((Object) spannableString, (Object) zo2Var, (byte) 8));
                                break;
                            } else {
                                hl.c3(new ea2(zo2Var, spannableString, (byte) 20));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
