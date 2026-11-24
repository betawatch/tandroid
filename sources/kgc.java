// default package

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kgc implements vt5, ed {
    public final /* synthetic */ TLRPC.User a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ d n;
    public final /* synthetic */ j5 r;

    public /* synthetic */ kgc(TLRPC.User user, TLRPC.Chat chat, String str, boolean z, boolean z2, boolean z3, Activity activity, d dVar, j5 j5Var) {
        this.a = user;
        this.b = chat;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.h = activity;
        this.n = dVar;
        this.r = j5Var;
    }

    @Override // vt5
    public final void a(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        boolean z4 = this.d;
        Activity activity = this.h;
        j5 j5Var = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z4 && z2) {
            h75.S0((LaunchActivity) activity, j5Var, chat, inputPeer, z, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z5 = this.e;
        boolean z6 = this.f;
        d dVar = this.n;
        if (z || str == null) {
            rgc.b(user, chat, str, inputPeer, z, z5, z6, z4, activity, dVar, j5Var, false, true, z3);
            return;
        }
        qgc qgcVar = new qgc(activity, chat, user, chat, str, inputPeer, z5, z6, z4, activity, dVar, j5Var, z3);
        if (dVar != null) {
            dVar.showDialog(qgcVar);
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.a;
        final TLRPC.Chat chat = this.b;
        final String str = this.c;
        final boolean z = this.d;
        final boolean z2 = this.e;
        final boolean z3 = this.f;
        final Activity activity = this.h;
        final d dVar = this.n;
        final j5 j5Var = this.r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() { // from class: mgc
                @Override // java.lang.Runnable
                public final void run() {
                    rgc.a = 0L;
                    rgc.b(TLRPC.User.this, chat, str, null, false, z, z2, z3, activity, dVar, j5Var, true, true, false);
                }
            });
        } else {
            rgc.b(user, chat, str, null, false, z, z2, z3, activity, dVar, j5Var, true, true, false);
        }
    }

    public /* synthetic */ kgc(boolean z, Activity activity, j5 j5Var, TLRPC.Chat chat, String str, TLRPC.User user, boolean z2, boolean z3, d dVar) {
        this.d = z;
        this.h = activity;
        this.r = j5Var;
        this.b = chat;
        this.c = str;
        this.a = user;
        this.e = z2;
        this.f = z3;
        this.n = dVar;
    }
}
