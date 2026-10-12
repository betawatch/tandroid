package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p80(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.a2) this.c, tLObject, this.b, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.e, 5));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new bi.q9((org.telegram.ui.ActionBar.m2) this.c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.b, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.p) this.d, (org.telegram.ui.ActionBar.a2) this.c, tLObject, this.b, (Utilities.Callback) this.e));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.q9((zh.r3) this.c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.b, 4));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.n5) this.c, tLObject, (MessageObject) this.d, this.b, (Runnable) this.e, 10));
                break;
        }
    }

    public /* synthetic */ p80(org.telegram.ui.ActionBar.a2 a2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.a = 0;
        this.c = a2Var;
        this.b = j10;
        this.d = accountInstance;
        this.e = booleanCallback;
    }

    public /* synthetic */ p80(zh.p pVar, org.telegram.ui.ActionBar.a2 a2Var, long j10, Utilities.Callback callback) {
        this.a = 2;
        this.d = pVar;
        this.c = a2Var;
        this.b = j10;
        this.e = callback;
    }

    public /* synthetic */ p80(zh.n5 n5Var, MessageObject messageObject, long j10, Runnable runnable) {
        this.a = 4;
        this.c = n5Var;
        this.d = messageObject;
        this.b = j10;
        this.e = runnable;
    }
}
