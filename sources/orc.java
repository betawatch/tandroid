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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class orc extends n39 {
    public mhc E;
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

    public orc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.F = wallpapersListActivity;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f != 2;
    }

    public final void E(String str, boolean z) {
        int i;
        if (str != null && this.n != null) {
            str = ls6.o(this.n, " ", str, new StringBuilder("#color"));
        }
        mhc mhcVar = this.E;
        if (mhcVar != null) {
            gl.r(mhcVar);
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
                i = ((d) wallpapersListActivity).currentAccount;
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
                mhc mhcVar2 = new mhc(this, str, (byte) 27);
                this.E = mhcVar2;
                gl.e3(mhcVar2, 500L);
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
            i9 = ((d) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i9).cancelRequest(this.s, true);
            this.s = 0;
        }
        this.y = str;
        i = ((d) wallpapersListActivity).currentAccount;
        na7 q1 = na7.q1(i);
        i2 = ((d) wallpapersListActivity).currentAccount;
        TLObject a2 = q1.a2(na7.q1(i2).p3);
        if (!(a2 instanceof TLRPC.User)) {
            if (!z || this.x) {
                return;
            }
            this.x = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            i7 = ((d) wallpapersListActivity).currentAccount;
            tL_contacts_resolveUsername.username = na7.q1(i7).p3;
            i8 = ((d) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i8).sendRequest(tL_contacts_resolveUsername, new wx9(this, (byte) 25));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = b00.h("#wallpaper ", str);
        i3 = ((d) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = na7.q1(i3).o1((TLRPC.User) a2);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i11 = this.w + 1;
        this.w = i11;
        i4 = ((d) wallpapersListActivity).currentAccount;
        this.s = ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getInlineBotResults, new l12(this, i11, (byte) 10));
        i5 = ((d) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
        int i12 = this.s;
        i6 = ((d) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i12, i6);
    }

    @Override // w39
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.F.O);
    }

    @Override // w39
    public final int d(int i) {
        if (TextUtils.isEmpty(this.h)) {
            return i == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 == 2) {
                ((l35) view).setText(k96.M0(2131745623, null));
                return;
            }
            return;
        }
        qqc qqcVar = (qqc) view;
        WallpapersListActivity wallpapersListActivity = this.F;
        int i3 = i * wallpapersListActivity.O;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.O);
        byte b = wallpapersListActivity.O;
        qqcVar.d(b, i3 == 0, i3 / b == ceil - 1);
        for (int i4 = 0; i4 < wallpapersListActivity.O; i4++) {
            int i5 = i3 + i4;
            qqcVar.e(i5 < arrayList.size() ? arrayList.get(i5) : null, wallpapersListActivity.r ? 1 : 0, i4, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v5, types: [l35] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, o39, rkb] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        u12 u12Var;
        byte b = 2;
        Context context = this.c;
        if (i != 0) {
            u12Var = null;
            if (i == 1) {
                ?? rkbVar = new rkb(context, 0 == true ? 1 : 0, (byte) 14);
                rkbVar.setItemAnimator(null);
                rkbVar.setLayoutAnimation(null);
                zr zrVar = new zr((byte) 20);
                rkbVar.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
                rkbVar.setClipToPadding(false);
                zrVar.i1(0);
                rkbVar.setLayoutManager(zrVar);
                rkbVar.setAdapter(new gx0(this, (byte) 12));
                rkbVar.setOnItemClickListener(new nrc(this, (byte) 0));
                u12Var = rkbVar;
            } else if (i == 2) {
                u12Var = new l35(context, null);
            }
        } else {
            u12Var = new u12(this, context, b);
            u12Var.setTag(-33024);
        }
        if (i == 1) {
            u12Var.setLayoutParams(new e49(-1, gl.L(60.0f)));
        } else {
            u12Var.setLayoutParams(new e49(-1, -2));
        }
        return new y29(u12Var);
    }
}
