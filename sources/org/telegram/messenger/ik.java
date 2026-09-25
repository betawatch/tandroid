package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class ik implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Object s;

    public /* synthetic */ ik(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f = e1Var3;
        this.h = e1Var4;
        this.r = z10;
        this.n = e1Var5;
        this.s = e1Var6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f, (String) this.h, (HashMap) this.n, this.r, (TLRPC.TL_messages_addPollAnswer) this.s);
                break;
            case 1:
                ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f, (String) this.h, (HashMap) this.n, this.r, (TLRPC.TL_messages_editMessage) this.s);
                break;
            case 2:
                ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$100(this.r, (TLRPC.TL_error) this.c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f, (HashMap) this.n, (String) this.h, (TLObject) this.s);
                break;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.b;
                yh.k5 k5Var = (yh.k5) this.c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.s;
                if (e1Var != null) {
                    e1Var.g(LocaleController.getString(k5Var.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), k5Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(k5Var.g, 1));
                e1Var3.setChecked(TLObject.hasFlag(k5Var.g, 2));
                e1Var4.setChecked(TLObject.hasFlag(k5Var.g, 4));
                e1Var5.setChecked(TLObject.hasFlag(k5Var.g, 8));
                if (this.r) {
                    e1Var6.setChecked(TLObject.hasFlag(k5Var.g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(k5Var.g, 512));
                    break;
                }
                break;
            default:
                xh.j4 j4Var = (xh.j4) this.b;
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.s;
                yh.k5 k5Var2 = j4Var.c.Y;
                e1Var8.g(LocaleController.getString(k5Var2.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), k5Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                e1Var9.setChecked(TLObject.hasFlag(k5Var2.g, 1));
                e1Var10.setChecked(TLObject.hasFlag(k5Var2.g, 2));
                e1Var11.setChecked(TLObject.hasFlag(k5Var2.g, 4));
                e1Var12.setChecked(TLObject.hasFlag(k5Var2.g, 8));
                if (this.r) {
                    e1Var13.setChecked(TLObject.hasFlag(k5Var2.g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(k5Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ik(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f = messageObject;
        this.h = str;
        this.n = hashMap;
        this.r = z10;
        this.s = tLMethod;
    }

    public /* synthetic */ ik(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.a = 2;
        this.b = sendMessagesHelper;
        this.r = z10;
        this.c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f = messageObject;
        this.n = hashMap;
        this.h = str;
        this.s = tLObject2;
    }
}
