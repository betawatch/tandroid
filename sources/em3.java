// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class em3 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ em3(u41 u41Var, boolean z, int i, i61 i61Var, Runnable runnable, Context context, wjb wjbVar) {
        this.d = u41Var;
        this.b = z;
        this.c = i;
        this.e = i61Var;
        this.f = runnable;
        this.h = context;
        this.n = wjbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = false;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z2 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                jm3 jm3Var = (jm3) obj5;
                String str = (String) obj3;
                String[] strArr = (String[]) obj2;
                vt4 vt4Var = (vt4) obj;
                jm3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String g0 = DictationAsr.g0((vl3) obj4, str);
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    arrayList.add(new k7(jm3Var.h, jm3.N(str2), null, this.c, (z2 && str2.equals(g0)) ? true : z));
                    arrayList2.add(new mg3(jm3Var, str, str2, (byte) 7));
                    i++;
                    z = false;
                }
                vt4Var.g(arrayList, arrayList2);
                break;
            default:
                u41 u41Var = (u41) obj5;
                i61 i61Var = (i61) obj4;
                Runnable runnable = (Runnable) obj3;
                Context context = (Context) obj2;
                wjb wjbVar = (wjb) obj;
                u41Var.setLoading(true);
                int i2 = this.c;
                if (!z2) {
                    TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = qu2.r(i2).Y;
                    setglobalprivacysettings.settings = globalPrivacySettings;
                    if (globalPrivacySettings == null) {
                        globalPrivacySettings = new TLRPC.TL_globalPrivacySettings();
                        setglobalprivacysettings.settings = globalPrivacySettings;
                    }
                    globalPrivacySettings.hide_read_marks = false;
                    ConnectionsManager.getInstance(i2).sendRequest(setglobalprivacysettings, new fn0(context, wjbVar, u41Var, i61Var, runnable, (byte) 9));
                    break;
                } else {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i2).sendRequest(setprivacy, new k45(u41Var, i61Var, runnable, (byte) 13));
                    break;
                }
        }
    }

    public /* synthetic */ em3(jm3 jm3Var, vl3 vl3Var, String str, String[] strArr, int i, boolean z, vt4 vt4Var) {
        this.d = jm3Var;
        this.e = vl3Var;
        this.f = str;
        this.h = strArr;
        this.c = i;
        this.b = z;
        this.n = vt4Var;
    }
}
