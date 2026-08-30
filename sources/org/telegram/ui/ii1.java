package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ii1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kg1(5, (ji1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.n1) this.b, (String) this.c, tLObject, 12));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.z2) this.b, tLObject, (MessagesController) this.c, 15));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.z7) this.b, tLObject, (MessagesController) this.c, 18));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((boolean[]) this.b, tLObject, (rh.k1) this.c, 22));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((rh.e3) this.b, tLObject, (org.telegram.ui.ActionBar.d2) this.c, 25));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new wx0(20, (tf.c) this.b, tL_error, tLObject, (String) this.c));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((tf.u0) this.b, (String) this.c, tLObject, 28));
                break;
            case 8:
                tf.l1 l1Var = (tf.l1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new tf.h1(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 1));
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new tf.h1((uf.t) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 4));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ph.f6(28, (uf.e0) this.b, (org.telegram.ui.Components.hm) this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tf.h1((uf.s1) this.b, tLObject, (SharedPreferences) this.c, 9));
                break;
        }
    }
}
