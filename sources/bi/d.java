package bi;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements j20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ vh.d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ d(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, int[] iArr, vh.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = p6Var;
        this.d = z10;
        this.i = iArr;
        this.c = dVar;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        vh.d dVar = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        boolean[] zArr = this.b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        a7.t(imageView, org.telegram.ui.ActionBar.t6.q7, p6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.i0.F3(i11, imageView, null);
                        }
                    } else {
                        a7.t(imageView, org.telegram.ui.ActionBar.t6.G6, p6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !a2Var.m && !a2Var.n) {
                    boolean z11 = a2Var.p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder n10 = org.telegram.ui.Wallet.k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var.m(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(m10) ? cd.V(null, null, 2131743146, n10) : cd.V(null, null, 2131743145, n10, m10));
                        break;
                    } else if (!z12) {
                        String L0 = str != null ? str : cd.L0(2131743012, null);
                        if (str == null) {
                            org.telegram.ui.Wallet.e2.m("preview", L0);
                        }
                        cc.c0(L0, y2Var.E, p6Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d(boolean[] zArr, org.telegram.ui.Wallet.a2 a2Var, boolean[] zArr2, vh.d dVar, boolean z10, org.telegram.ui.Wallet.k0 k0Var, TextView textView, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.b = zArr;
        this.f = a2Var;
        this.g = zArr2;
        this.c = dVar;
        this.d = z10;
        this.h = k0Var;
        this.i = textView;
        this.j = y2Var;
        this.e = p6Var;
    }
}
