package ci;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.Wallet.na;
import org.telegram.ui.g00;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements z10 {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.z10
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str) || (!str.startsWith("tg:") && !vf.c.g(Uri.parse(str), false, null))) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 1:
                String str2 = (String) obj;
                nr nrVar = b0.A0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !vf.c.g(Uri.parse(str2), false, null))) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 2:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 3:
                gj gjVar = (gj) obj;
                return Boolean.valueOf((gjVar == null || gjVar.R0() == null) ? false : true);
            case 4:
                gj gjVar2 = (gj) obj;
                return Boolean.valueOf((gjVar2 == null || gjVar2.M0() == null) ? false : true);
            case 5:
                return hd.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 6:
                return hd.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 7:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof a9) || (view instanceof z6) || (view instanceof g00) || (view instanceof y3) || (view instanceof e2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 8:
                return Boolean.valueOf(c51.K(((Integer) obj).intValue()));
            case 9:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            case 10:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 11:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
            case 12:
                return Boolean.valueOf(n6.G0(n6.i1((String) obj)));
            default:
                return Boolean.valueOf(na.l0((String) obj) != null);
        }
    }
}
