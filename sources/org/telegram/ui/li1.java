package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class li1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ li1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mg1(4, (mi1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((qh.n1) this.b, (String) this.c, tLObject, 12));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((qh.z2) this.b, tLObject, (MessagesController) this.c, 15));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((qh.x7) this.b, tLObject, (MessagesController) this.c, 18));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((boolean[]) this.b, tLObject, (sh.j1) this.c, 22));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((sh.d3) this.b, tLObject, (org.telegram.ui.ActionBar.d2) this.c, 25));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yx0(21, (uf.c) this.b, tL_error, tLObject, (String) this.c));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((uf.u0) this.b, (String) this.c, tLObject, 28));
                break;
            case 8:
                uf.l1 l1Var = (uf.l1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new uf.h1(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 1));
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.t) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 4));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new vf.d0(0, (vf.f0) this.b, (org.telegram.ui.Components.jm) this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.s1) this.b, tLObject, (SharedPreferences) this.c, 9));
                break;
        }
    }
}
