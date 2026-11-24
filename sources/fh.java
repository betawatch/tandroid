// default package

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fh implements p8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ fh(int i, long j, wjb wjbVar, p8c p8cVar, Activity activity, ArrayList arrayList, HashMap hashMap) {
        this.c = i;
        this.d = arrayList;
        this.b = j;
        this.e = activity;
        this.f = wjbVar;
        this.g = p8cVar;
        this.h = hashMap;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        Serializable serializable = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                wjb wjbVar = (wjb) obj3;
                p8c p8cVar = (p8c) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = this.c;
                if (booleanValue) {
                    SharedPreferences.Editor edit = na7.q1(i).X3.edit();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = arrayList.get(i2);
                        i2++;
                        Long l = (Long) obj6;
                        long longValue = l.longValue();
                        long K1 = na7.q1(i).K1(longValue);
                        if (K1 <= 0 && longValue > 0) {
                            K1 = cf3.j(na7.q1(i).I2(longValue));
                        }
                        edit.putLong(ug8.n(longValue, "ask_paid_message_", "_price"), K1);
                        gta.v(i, false).O.put(l, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                pe peVar = new pe(i, this.b, wjbVar, p8cVar, activity, arrayList, hashMap);
                if (!gta.v(i, false).e) {
                    gta v = gta.v(i, false);
                    v.e = false;
                    v.n(peVar, false, true);
                    v.e = true;
                    break;
                } else {
                    peVar.run();
                    break;
                }
            case 1:
                kf2 kf2Var = (kf2) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                boolean z = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                long j = kf2Var.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = kf2Var.E;
                long j2 = this.b;
                se2 se2Var = new se2(kf2Var, j2, j, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j2);
                se2Var.Y0 = new te2(kf2Var, intValue, j2, this.c, z, zArr);
                kf2Var.presentFragment(se2Var);
                break;
            default:
                String str2 = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i3 = this.c;
                tL_messages_toggleBotInAttachMenu.bot = na7.q1(i3).m1(this.b);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new ot((LaunchActivity) obj5, i3, (cj3) obj4, (d) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                break;
        }
    }

    public /* synthetic */ fh(kf2 kf2Var, long j, int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.d = kf2Var;
        this.b = j;
        this.c = i;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }

    public /* synthetic */ fh(LaunchActivity launchActivity, int i, long j, cj3 cj3Var, d dVar, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.c = i;
        this.b = j;
        this.e = cj3Var;
        this.f = dVar;
        this.g = user;
        this.h = str;
    }
}
