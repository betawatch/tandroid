package oi;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ hi.e c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ h6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ c(String str, String[] strArr, ImageView imageView, h6 h6Var, boolean z10, int[] iArr, hi.e eVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = h6Var;
        this.d = z10;
        this.i = iArr;
        this.c = eVar;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        h6 h6Var = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        hi.e eVar = this.c;
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
                        t6.s(imageView, m6.q7, h6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i10 = -iArr[0];
                            iArr[0] = i10;
                            org.telegram.messenger.g0.E3(i10, imageView, null);
                        }
                    } else {
                        t6.s(imageView, m6.G6, h6Var, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    eVar.setEnabled(!bool.booleanValue());
                    horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
                    zArr[0] = bool.booleanValue();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !h2Var.m && !h2Var.n) {
                    boolean z11 = h2Var.p;
                    zArr2[0] = z11;
                    eVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.u0.s(wallettransaction.fee, true);
                        CharSequence r10 = u0Var.r(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(r10) ? gd.V(null, null, 2131742875, s5) : gd.V(null, null, 2131742874, s5, r10));
                        break;
                    } else if (!z12) {
                        String N0 = str != null ? str : gd.N0(2131742722, null);
                        if (str == null) {
                            org.telegram.ui.Wallet.l2.m("preview", N0);
                        }
                        lc.d0(N0, d3Var.F, h6Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(boolean[] zArr, org.telegram.ui.Wallet.h2 h2Var, boolean[] zArr2, hi.e eVar, boolean z10, org.telegram.ui.Wallet.u0 u0Var, TextView textView, org.telegram.ui.Wallet.d3 d3Var, h6 h6Var) {
        this.b = zArr;
        this.f = h2Var;
        this.g = zArr2;
        this.c = eVar;
        this.d = z10;
        this.h = u0Var;
        this.i = textView;
        this.j = d3Var;
        this.e = h6Var;
    }
}
