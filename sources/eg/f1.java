package eg;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f1 extends xa {
    public final TLRPC.TL_payments_checkedGiftCode T;
    public final boolean U;
    public e1 V;
    public final String W;

    public f1(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(o2Var, true);
        this.U = tL_payments_checkedGiftCode.used_date == 0;
        this.T = tL_payments_checkedGiftCode;
        this.W = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        M();
        e1 e1Var = this.V;
        d3 d3Var = this.container;
        e1Var.getClass();
        e1Var.d = tL_payments_checkedGiftCode.used_date == 0;
        e1Var.e = o2Var;
        e1Var.f = tL_payments_checkedGiftCode;
        e1Var.h = str;
        e1Var.n = d3Var;
    }

    public static boolean S(Intent intent, ye.c cVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (!scheme.equals("http") && !scheme.equals("https")) {
            if (!scheme.equals("tg")) {
                return false;
            }
            String uri = data.toString();
            String lastPathSegment = data.getLastPathSegment();
            if ((!uri.startsWith("tg:giftcode") && !uri.startsWith("tg://giftcode")) || lastPathSegment == null) {
                return false;
            }
            T(LaunchActivity.R(), lastPathSegment, cVar);
            return true;
        }
        String lowerCase = data.getHost().toLowerCase();
        if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = data.getPath()) == null) {
            return false;
        }
        String lastPathSegment2 = data.getLastPathSegment();
        if (!path.startsWith("/giftcode") || lastPathSegment2 == null) {
            return false;
        }
        T(LaunchActivity.R(), lastPathSegment2, cVar);
        return true;
    }

    public static void T(org.telegram.ui.ActionBar.o2 o2Var, String str, ye.c cVar) {
        if (o2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cVar != null) {
            cVar.d();
            cVar.b = new k(atomicBoolean, 1);
        }
        d1 d1Var = new d1(atomicBoolean, o2Var, str, cVar, 0);
        m mVar = new m(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new z(messagesController, d1Var, mVar));
    }

    @Override // org.telegram.ui.Components.xa
    public final void F(hv0 hv0Var) {
        mc.a(this.container, new x(1));
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        e1 e1Var = new e1(this, this.resourcesProvider);
        this.V = e1Var;
        return e1Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return this.U ? LocaleController.getString(R.string.BoostingGiftLink) : LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
