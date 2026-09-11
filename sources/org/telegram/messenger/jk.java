package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class jk implements Runnable {
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

    public /* synthetic */ jk(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = f1Var;
        this.e = f1Var2;
        this.f = f1Var3;
        this.h = f1Var4;
        this.r = z10;
        this.n = f1Var5;
        this.s = f1Var6;
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
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.b;
                zh.j5 j5Var = (zh.j5) this.c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.s;
                if (f1Var != null) {
                    f1Var.g(LocaleController.getString(j5Var.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), j5Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(j5Var.g, 1));
                f1Var3.setChecked(TLObject.hasFlag(j5Var.g, 2));
                f1Var4.setChecked(TLObject.hasFlag(j5Var.g, 4));
                f1Var5.setChecked(TLObject.hasFlag(j5Var.g, 8));
                if (this.r) {
                    f1Var6.setChecked(TLObject.hasFlag(j5Var.g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(j5Var.g, 512));
                    break;
                }
                break;
            default:
                yh.h4 h4Var = (yh.h4) this.b;
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.s;
                zh.j5 j5Var2 = h4Var.c.Y;
                f1Var8.g(LocaleController.getString(j5Var2.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), j5Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                f1Var9.setChecked(TLObject.hasFlag(j5Var2.g, 1));
                f1Var10.setChecked(TLObject.hasFlag(j5Var2.g, 2));
                f1Var11.setChecked(TLObject.hasFlag(j5Var2.g, 4));
                f1Var12.setChecked(TLObject.hasFlag(j5Var2.g, 8));
                if (this.r) {
                    f1Var13.setChecked(TLObject.hasFlag(j5Var2.g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(j5Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
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

    public /* synthetic */ jk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
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
