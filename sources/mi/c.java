package mi;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements n10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ gi.d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int[] iArr, gi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = e6Var;
        this.d = z10;
        this.i = iArr;
        this.c = dVar;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        gi.d dVar = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        boolean[] zArr = this.b;
        switch (i3) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        r6.t(imageView, k6.q7, e6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i10 = -iArr[0];
                            iArr[0] = i10;
                            org.telegram.messenger.g0.G3(i10, imageView, null);
                        }
                    } else {
                        r6.t(imageView, k6.G6, e6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !y1Var.m && !y1Var.n) {
                    boolean z11 = y1Var.p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder n4 = org.telegram.ui.Wallet.k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var.m(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(m10) ? bd.V(null, null, 2131743130, n4) : bd.V(null, null, 2131743129, n4, m10));
                        break;
                    } else if (!z12) {
                        String M0 = str != null ? str : bd.M0(2131742996, null);
                        if (str == null) {
                            org.telegram.ui.Wallet.c2.m("preview", M0);
                        }
                        fc.c0(M0, x2Var.F, e6Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(boolean[] zArr, org.telegram.ui.Wallet.y1 y1Var, boolean[] zArr2, gi.d dVar, boolean z10, org.telegram.ui.Wallet.k0 k0Var, TextView textView, org.telegram.ui.Wallet.x2 x2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = zArr;
        this.f = y1Var;
        this.g = zArr2;
        this.c = dVar;
        this.d = z10;
        this.h = k0Var;
        this.i = textView;
        this.j = x2Var;
        this.e = e6Var;
    }
}
