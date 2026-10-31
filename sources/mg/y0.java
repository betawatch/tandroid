package mg;

import ag.m2;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y0 extends ha {
    public final TLRPC.TL_payments_checkedGiftCode P1;
    public final boolean Q1;
    public x0 R1;
    public final String S1;

    public y0(k2 k2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(k2Var, true);
        this.Q1 = tL_payments_checkedGiftCode.used_date == 0;
        this.P1 = tL_payments_checkedGiftCode;
        this.S1 = str;
        this.u0 = false;
        this.v0 = false;
        O();
        b1();
        x0 x0Var = this.R1;
        p2 p2Var = this.c;
        x0Var.getClass();
        x0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        x0Var.e = k2Var;
        x0Var.f = tL_payments_checkedGiftCode;
        x0Var.h = str;
        x0Var.n = p2Var;
    }

    public static boolean d1(Intent intent, gf.e eVar) {
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
            e1(LaunchActivity.Q(), lastPathSegment, eVar);
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
        e1(LaunchActivity.Q(), lastPathSegment2, eVar);
        return true;
    }

    public static void e1(k2 k2Var, String str, gf.e eVar) {
        if (k2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (eVar != null) {
            eVar.d();
            eVar.b = new i(atomicBoolean, 1);
        }
        m2 m2Var = new m2(atomicBoolean, k2Var, str, eVar, 1);
        k kVar = new k(atomicBoolean, eVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.s0);
        vp r12 = vp.r1(d20.s0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new ag.p0(r12, m2Var, kVar, 4));
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        x0 x0Var = new x0(this, this.I0);
        this.R1 = x0Var;
        return x0Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return this.Q1 ? cd.L0(2131753500, null) : cd.L0(2131753173, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void U0(uu0 uu0Var) {
        wb.a(this.c, new u(1));
    }
}
