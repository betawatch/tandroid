package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements q4, org.telegram.messenger.qc {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.us c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ id(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.fj fjVar, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = document;
        this.a = str;
        this.e = obj;
        this.f = fjVar;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f;
        int i12 = ChatActivityEnterView.s5;
        chatActivityEnterView.a(document, this.a, this.e, fjVar, this.b, z10, i10, i11);
    }

    @Override // org.telegram.messenger.qc
    public void a(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        String[] strArr = (String[]) this.d;
        boolean[] zArr = (boolean[]) this.e;
        org.telegram.messenger.fe feVar = (org.telegram.messenger.fe) this.f;
        RectF rectF = ProfileActivity.R6;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(this.a) || str.equals("und")) && ((this.b && !org.telegram.ui.e01.c0().contains(str)) || ((chat = profileActivity.D2) != null && ((chat.has_link || org.telegram.messenger.w3.t0(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        feVar.run();
    }

    public /* synthetic */ id(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, org.telegram.messenger.fe feVar) {
        this.c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.a = str;
        this.b = z10;
        this.f = feVar;
    }
}
