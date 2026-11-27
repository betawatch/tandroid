// default package

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class j72 implements icc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ c51 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vnb e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ j72(String str, String[] strArr, ImageView imageView, vnb vnbVar, boolean z, int[] iArr, c51 c51Var, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = vnbVar;
        this.d = z;
        this.i = iArr;
        this.c = c51Var;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        vnb vnbVar = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z = this.d;
        c51 c51Var = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        yob.s(imageView, aob.q7, vnbVar, PorterDuff.Mode.SRC_IN);
                        if (!z) {
                            int i = -iArr[0];
                            iArr[0] = i;
                            hl.A3(i, imageView, null);
                        }
                    } else {
                        yob.s(imageView, aob.G6, vnbVar, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    c51Var.setEnabled(!bool.booleanValue());
                    horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
                    zArr[0] = bool.booleanValue();
                    break;
                }
                break;
            default:
                w45 w45Var = (w45) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                c cVar = (c) obj4;
                TextView textView = (TextView) obj3;
                sk7 sk7Var = (sk7) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !w45Var.m && !w45Var.n) {
                    boolean z2 = w45Var.p;
                    zArr2[0] = z2;
                    c51Var.setEnabled(z2);
                    if (!zArr2[0]) {
                        if (str == null) {
                            str = ob6.M0(2131742617, null);
                            a55.m("preview", str);
                        }
                        d31.d0(str, sk7Var.F, vnbVar);
                        break;
                    } else if (!z) {
                        SpannableStringBuilder r = c.r(wallettransaction.fee, true);
                        CharSequence q = cVar.q(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(q) ? ob6.V(null, null, 2131742770, r) : ob6.V(null, null, 2131742769, r, q));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ j72(boolean[] zArr, w45 w45Var, boolean[] zArr2, c51 c51Var, boolean z, c cVar, TextView textView, sk7 sk7Var, vnb vnbVar) {
        this.b = zArr;
        this.f = w45Var;
        this.g = zArr2;
        this.c = c51Var;
        this.d = z;
        this.h = cVar;
        this.i = textView;
        this.j = sk7Var;
        this.e = vnbVar;
    }
}
