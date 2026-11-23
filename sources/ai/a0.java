package ai;

import android.content.Context;
import android.view.View;
import di.m7;
import java.util.ArrayList;
import org.telegram.messenger.i5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.p6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ a0(l0 l0Var, q qVar, String str, String[] strArr, int i7, boolean z10, bi.b1 b1Var) {
        this.d = l0Var;
        this.e = qVar;
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
                l0 l0Var = (l0) this.d;
                q qVar = (q) this.e;
                String str = (String) this.f;
                String[] strArr = (String[]) this.h;
                bi.b1 b1Var = (bi.b1) this.n;
                l0Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String g02 = DictationAsr.g0(qVar, str);
                for (String str2 : strArr) {
                    arrayList.add(new i0(l0Var.h, l0.L(str2), null, this.c, this.b && str2.equals(g02)));
                    arrayList2.add(new aa.r((Object) l0Var, (Object) str, (Object) str2, 3));
                }
                b1Var.g(arrayList, arrayList2);
                break;
            default:
                hi.e eVar = (hi.e) this.d;
                p6 p6Var = (p6) this.e;
                Runnable runnable = (Runnable) this.f;
                Context context = (Context) this.h;
                i6 i6Var = (i6) this.n;
                eVar.setLoading(true);
                boolean z10 = this.b;
                int i7 = this.c;
                if (z10) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i7).sendRequest(setprivacy, new bi.q1(eVar, p6Var, runnable, 19));
                    break;
                } else {
                    TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i7).Y;
                    setglobalprivacysettings.settings = globalPrivacySettings;
                    if (globalPrivacySettings == null) {
                        setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                    }
                    setglobalprivacysettings.settings.hide_read_marks = false;
                    ConnectionsManager.getInstance(i7).sendRequest(setglobalprivacysettings, new m7(context, i6Var, eVar, p6Var, runnable, 6));
                    break;
                }
        }
    }

    public /* synthetic */ a0(hi.e eVar, boolean z10, int i7, p6 p6Var, Runnable runnable, Context context, i6 i6Var) {
        this.d = eVar;
        this.b = z10;
        this.c = i7;
        this.e = p6Var;
        this.f = runnable;
        this.h = context;
        this.n = i6Var;
    }
}
