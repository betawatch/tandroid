package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements q4, org.telegram.messenger.rc {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.messenger.vs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ id(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.gj gjVar, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = document;
        this.a = str;
        this.e = obj;
        this.f = gjVar;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f;
        int i12 = ChatActivityEnterView.s5;
        chatActivityEnterView.a(document, this.a, this.e, gjVar, this.b, z10, i10, i11);
    }

    @Override // org.telegram.messenger.rc
    public void a(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        String[] strArr = (String[]) this.d;
        boolean[] zArr = (boolean[]) this.e;
        org.telegram.messenger.ge geVar = (org.telegram.messenger.ge) this.f;
        RectF rectF = ProfileActivity.S6;
        strArr[0] = str;
        zArr[0] = str != null && (!str.equals(this.a) || str.equals("und")) && ((this.b && !org.telegram.ui.e01.d0().contains(str)) || ((chat = profileActivity.D2) != null && ((chat.has_link || org.telegram.messenger.w3.t0(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        geVar.run();
    }

    public /* synthetic */ id(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, org.telegram.messenger.ge geVar) {
        this.c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.a = str;
        this.b = z10;
        this.f = geVar;
    }
}
