package ai;

import android.content.Context;
import android.view.View;
import di.m7;
import java.util.ArrayList;
import org.telegram.messenger.i5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.o6;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ e0(p0 p0Var, t tVar, String str, String[] strArr, int i7, boolean z10, bi.b1 b1Var) {
        this.d = p0Var;
        this.e = tVar;
        this.f = str;
        this.h = strArr;
        this.c = i7;
        this.b = z10;
        this.n = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.d;
                t tVar = (t) this.e;
                String str = (String) this.f;
                String[] strArr = (String[]) this.h;
                bi.b1 b1Var = (bi.b1) this.n;
                p0Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String d02 = DictationAsr.d0(tVar, str);
                for (String str2 : strArr) {
                    arrayList.add(new m0(p0Var.h, p0.N(str2), null, this.c, this.b && str2.equals(d02)));
                    arrayList2.add(new aa.r((Object) p0Var, (Object) str, (Object) str2, 3));
                }
                b1Var.g(arrayList, arrayList2);
                break;
            default:
                hi.e eVar = (hi.e) this.d;
                o6 o6Var = (o6) this.e;
                Runnable runnable = (Runnable) this.f;
                Context context = (Context) this.h;
                h6 h6Var = (h6) this.n;
                eVar.setLoading(true);
                boolean z10 = this.b;
                int i7 = this.c;
                if (z10) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i7).sendRequest(setprivacy, new bi.q1(eVar, o6Var, runnable, 19));
                    break;
                } else {
                    TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i7).Y;
                    setglobalprivacysettings.settings = globalPrivacySettings;
                    if (globalPrivacySettings == null) {
                        setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                    }
                    setglobalprivacysettings.settings.hide_read_marks = false;
                    ConnectionsManager.getInstance(i7).sendRequest(setglobalprivacysettings, new m7(context, h6Var, eVar, o6Var, runnable, 6));
                    break;
                }
        }
    }

    public /* synthetic */ e0(hi.e eVar, boolean z10, int i7, o6 o6Var, Runnable runnable, Context context, h6 h6Var) {
        this.d = eVar;
        this.b = z10;
        this.c = i7;
        this.e = o6Var;
        this.f = runnable;
        this.h = context;
        this.n = h6Var;
    }
}
