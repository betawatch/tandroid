package li;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements v10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ f6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ c(String str, String[] strArr, ImageView imageView, f6 f6Var, boolean z9, int[] iArr, fi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = f6Var;
        this.d = z9;
        this.i = iArr;
        this.c = dVar;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        f6 f6Var = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z9 = this.d;
        fi.d dVar = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        boolean[] zArr = this.b;
        switch (i7) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        r6.t(imageView, k6.q7, f6Var, PorterDuff.Mode.SRC_IN);
                        if (!z9) {
                            int i10 = -iArr[0];
                            iArr[0] = i10;
                            org.telegram.messenger.g0.G3(i10, imageView, null);
                        }
                    } else {
                        r6.t(imageView, k6.G6, f6Var, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    dVar.setEnabled(!bool.booleanValue());
                    horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
                    zArr[0] = bool.booleanValue();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !a2Var.m && !a2Var.n) {
                    boolean z10 = a2Var.p;
                    zArr2[0] = z10;
                    dVar.setEnabled(z10);
                    boolean z11 = zArr2[0];
                    if (z11 && !z9) {
                        SpannableStringBuilder n10 = org.telegram.ui.Wallet.m0.n(wallettransaction.fee, true);
                        CharSequence m10 = m0Var.m(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(m10) ? id.V(null, null, 2131743123, n10) : id.V(null, null, 2131743122, n10, m10));
                        break;
                    } else if (!z11) {
                        String M0 = str != null ? str : id.M0(2131742989, null);
                        if (str == null) {
                            org.telegram.ui.Wallet.e2.m("preview", M0);
                        }
                        hc.c0(M0, y2Var.E, f6Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(boolean[] zArr, org.telegram.ui.Wallet.a2 a2Var, boolean[] zArr2, fi.d dVar, boolean z9, org.telegram.ui.Wallet.m0 m0Var, TextView textView, org.telegram.ui.Wallet.y2 y2Var, f6 f6Var) {
        this.b = zArr;
        this.f = a2Var;
        this.g = zArr2;
        this.c = dVar;
        this.d = z9;
        this.h = m0Var;
        this.i = textView;
        this.j = y2Var;
        this.e = f6Var;
    }
}
