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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ hi.d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ i6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ c(String str, String[] strArr, ImageView imageView, i6 i6Var, boolean z10, int[] iArr, hi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = i6Var;
        this.d = z10;
        this.i = iArr;
        this.c = dVar;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        i6 i6Var = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        hi.d dVar = this.c;
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
                        u6.s(imageView, n6.q7, i6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i10 = -iArr[0];
                            iArr[0] = i10;
                            org.telegram.messenger.g0.E3(i10, imageView, null);
                        }
                    } else {
                        u6.s(imageView, n6.G6, i6Var, PorterDuff.Mode.SRC_IN);
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
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.u0.s(wallettransaction.fee, true);
                        CharSequence r10 = u0Var.r(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(r10) ? gd.V(null, null, 2131742881, s5) : gd.V(null, null, 2131742880, s5, r10));
                        break;
                    } else if (!z12) {
                        String M0 = str != null ? str : gd.M0(2131742728, null);
                        if (str == null) {
                            org.telegram.ui.Wallet.l2.m("preview", M0);
                        }
                        lc.d0(M0, d3Var.F, i6Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(boolean[] zArr, org.telegram.ui.Wallet.h2 h2Var, boolean[] zArr2, hi.d dVar, boolean z10, org.telegram.ui.Wallet.u0 u0Var, TextView textView, org.telegram.ui.Wallet.d3 d3Var, i6 i6Var) {
        this.b = zArr;
        this.f = h2Var;
        this.g = zArr2;
        this.c = dVar;
        this.d = z10;
        this.h = u0Var;
        this.i = textView;
        this.j = d3Var;
        this.e = i6Var;
    }
}
