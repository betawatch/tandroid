package ai;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.d20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.x9;
import org.telegram.ui.Wallet.y5;
import org.telegram.ui.b00;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements d20 {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.d20
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
                xq xqVar = i0.z0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !vf.c.g(Uri.parse(str2), false, null))) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 2:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 3:
                ij ijVar = (ij) obj;
                return Boolean.valueOf((ijVar == null || ijVar.R0() == null) ? false : true);
            case 4:
                ij ijVar2 = (ij) obj;
                return Boolean.valueOf((ijVar2 == null || ijVar2.M0() == null) ? false : true);
            case 5:
                return hd.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 6:
                return hd.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 7:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof z8) || (view instanceof y6) || (view instanceof b00) || (view instanceof x3) || (view instanceof d2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 8:
                return Boolean.valueOf(f41.K(((Integer) obj).intValue()));
            case 9:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            case 10:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
            case 11:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 12:
                return Boolean.valueOf(y5.C0(y5.b1((String) obj)));
            default:
                return Boolean.valueOf(x9.l0((String) obj) != null);
        }
    }
}
