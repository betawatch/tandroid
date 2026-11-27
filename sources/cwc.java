// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cwc extends c79 {
    public vlc E;
    public final /* synthetic */ WallpapersListActivity F;
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f = true;
    public String h;
    public String n;
    public String r;
    public int s;
    public int w;
    public boolean x;
    public String y;

    public cwc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.F = wallpapersListActivity;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f != 2;
    }

    public final void E(String str, boolean z) {
        int i;
        if (str != null && this.n != null) {
            str = qu6.o(this.n, " ", str, new StringBuilder("#color"));
        }
        vlc vlcVar = this.E;
        if (vlcVar != null) {
            hl.r(vlcVar);
            this.E = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f = true;
            this.h = null;
            if (this.s != 0) {
                i = ((e) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i).cancelRequest(this.s, true);
                this.s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z) {
                arrayList.clear();
                hashMap.clear();
                this.f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                vlc vlcVar2 = new vlc(this, str, (byte) 26);
                this.E = vlcVar2;
                hl.d3(vlcVar2, 500L);
            }
        }
        f();
    }

    public final void F(String str, String str2, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.s;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (i10 != 0) {
            i9 = ((e) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i9).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.y = str;
        i = ((e) wallpapersListActivity).currentAccount;
        uc7 s1 = uc7.s1(i);
        i2 = ((e) wallpapersListActivity).currentAccount;
        TLObject c2 = s1.c2(uc7.s1(i2).p3);
        if (!(c2 instanceof TLRPC.User)) {
            if (!z || this.x) {
                return;
            }
            this.x = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i7 = ((e) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = uc7.s1(i7).p3;
            i8 = ((e) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i8).sendRequest(tL_contacts_resolveUsername, new yp9(this, (byte) 26));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = c00.i("#wallpaper ", str);
        i3 = ((e) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = uc7.s1(i3).q1((TLRPC.User) c2);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i11 = this.w + 1;
        this.w = i11;
        i4 = ((e) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getInlineBotResults, new b22(this, i11, (byte) 10));
        i5 = ((e) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
        int i12 = this.s;
        i6 = ((e) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i12, i6);
    }

    @Override // j79
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.F.O);
    }

    @Override // j79
    public final int d(int i) {
        if (TextUtils.isEmpty(this.h)) {
            return i == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 == 2) {
                ((p55) view).setText(ob6.M0(2131745543, null));
                return;
            }
            return;
        }
        evc evcVar = (evc) view;
        WallpapersListActivity wallpapersListActivity = this.F;
        int i3 = i * wallpapersListActivity.O;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.O);
        byte b = wallpapersListActivity.O;
        evcVar.d(b, i3 == 0, i3 / b == ceil - 1);
        for (int i4 = 0; i4 < wallpapersListActivity.O; i4++) {
            int i5 = i3 + i4;
            evcVar.e(i5 < arrayList.size() ? arrayList.get(i5) : null, wallpapersListActivity.r ? 1 : 0, i4, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v5, types: [p55] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, d79, qob] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        l22 l22Var;
        byte b = 2;
        Context context = this.c;
        if (i != 0) {
            l22Var = null;
            if (i == 1) {
                ?? qobVar = new qob(context, 0 == true ? 1 : 0, (byte) 14);
                qobVar.setItemAnimator(null);
                qobVar.setLayoutAnimation(null);
                as asVar = new as((byte) 20);
                qobVar.setPadding(hl.L(7.0f), 0, hl.L(7.0f), 0);
                qobVar.setClipToPadding(false);
                asVar.i1(0);
                qobVar.setLayoutManager(asVar);
                qobVar.setAdapter(new ox0(this, (byte) 12));
                qobVar.setOnItemClickListener(new bwc(this, (byte) 0));
                l22Var = qobVar;
            } else if (i == 2) {
                l22Var = new p55(context, null);
            }
        } else {
            l22Var = new l22(this, context, b);
            l22Var.setTag(-33024);
        }
        if (i == 1) {
            l22Var.setLayoutParams(new r79(-1, hl.L(60.0f)));
        } else {
            l22Var.setLayoutParams(new r79(-1, -2));
        }
        return new n69(l22Var);
    }
}
