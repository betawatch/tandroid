package ki;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ei.d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, int[] iArr, ei.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = g6Var;
        this.d = z10;
        this.i = iArr;
        this.c = dVar;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        ei.d dVar = this.c;
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
                        r6.t(imageView, k6.q7, g6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            AndroidUtilities.shakeViewSpring(imageView, i11);
                        }
                    } else {
                        r6.t(imageView, k6.G6, g6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !a2Var.m && !a2Var.n) {
                    boolean z11 = a2Var.p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder m10 = org.telegram.ui.Wallet.l0.m(wallettransaction.fee, true);
                        CharSequence l4 = l0Var.l(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(l4) ? LocaleController.formatSpannable(R.string.WalletFeeAmount, m10) : LocaleController.formatSpannable(R.string.WalletFeeAmountWithCurrency, m10, l4));
                        break;
                    } else if (!z12) {
                        String string = str != null ? str : LocaleController.getString(R.string.WalletTransactionSimulationFailed);
                        if (str == null) {
                            org.telegram.ui.Wallet.e2.k("preview", string);
                        }
                        xc.c0(string, i2Var.topBulletinContainer, g6Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(boolean[] zArr, org.telegram.ui.Wallet.a2 a2Var, boolean[] zArr2, ei.d dVar, boolean z10, org.telegram.ui.Wallet.l0 l0Var, TextView textView, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = zArr;
        this.f = a2Var;
        this.g = zArr2;
        this.c = dVar;
        this.d = z10;
        this.h = l0Var;
        this.i = textView;
        this.j = i2Var;
        this.e = g6Var;
    }
}
