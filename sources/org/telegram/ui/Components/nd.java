package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements s4, org.telegram.messenger.pc {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.ls c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9) {
        this.c = chatActivityEnterView;
        this.d = document;
        this.a = str;
        this.e = obj;
        this.f = ejVar;
        this.b = z9;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.f;
        int i11 = ChatActivityEnterView.s5;
        chatActivityEnterView.a(document, this.a, this.e, ejVar, this.b, z9, i7, i10);
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        String[] strArr = (String[]) this.d;
        boolean[] zArr = (boolean[]) this.e;
        jg.c1 c1Var = (jg.c1) this.f;
        RectF rectF = ProfileActivity.V6;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(this.a) || str.equals("und")) && ((this.b && !org.telegram.ui.uy0.d0().contains(str)) || ((chat = profileActivity.D2) != null && ((chat.has_link || org.telegram.messenger.t3.t0(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        c1Var.run();
    }

    public /* synthetic */ nd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z9, jg.c1 c1Var) {
        this.c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.a = str;
        this.b = z9;
        this.f = c1Var;
    }
}
