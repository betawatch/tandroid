package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements a5, org.telegram.messenger.nc {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.fs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = document;
        this.a = str;
        this.e = obj;
        this.f = bjVar;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.f;
        int i11 = ChatActivityEnterView.s7;
        chatActivityEnterView.d(document, this.a, this.e, bjVar, this.b, z10, i7, i10);
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        String[] strArr = (String[]) this.d;
        boolean[] zArr = (boolean[]) this.e;
        bi.g5 g5Var = (bi.g5) this.f;
        RectF rectF = ProfileActivity.Z6;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(this.a) || str.equals("und")) && ((this.b && !org.telegram.ui.sy0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.v3.t0(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        g5Var.run();
    }

    public /* synthetic */ xd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.g5 g5Var) {
        this.c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.a = str;
        this.b = z10;
        this.f = g5Var;
    }
}
