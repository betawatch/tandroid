package ci;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.Wallet.na;
import org.telegram.ui.g00;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements y10 {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.y10
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
                lr lrVar = b0.A0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !vf.c.g(Uri.parse(str2), false, null))) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 2:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 3:
                fj fjVar = (fj) obj;
                return Boolean.valueOf((fjVar == null || fjVar.R0() == null) ? false : true);
            case 4:
                fj fjVar2 = (fj) obj;
                return Boolean.valueOf((fjVar2 == null || fjVar2.M0() == null) ? false : true);
            case 5:
                return gd.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 6:
                return gd.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 7:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof z8) || (view instanceof y6) || (view instanceof g00) || (view instanceof x3) || (view instanceof d2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 8:
                return Boolean.valueOf(z41.K(((Integer) obj).intValue()));
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
