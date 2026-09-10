package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class sk implements Runnable {
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

    public /* synthetic */ sk(Object obj, Object obj2, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, boolean z10, org.telegram.ui.ActionBar.g1 g1Var5, org.telegram.ui.ActionBar.g1 g1Var6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = g1Var;
        this.e = g1Var2;
        this.f = g1Var3;
        this.h = g1Var4;
        this.r = z10;
        this.n = g1Var5;
        this.s = g1Var6;
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
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.b;
                xh.n5 n5Var = (xh.n5) this.c;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.f;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.n;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.s;
                if (g1Var != null) {
                    g1Var.g(LocaleController.getString(n5Var.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), n5Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                g1Var2.setChecked(TLObject.hasFlag(n5Var.g, 1));
                g1Var3.setChecked(TLObject.hasFlag(n5Var.g, 2));
                g1Var4.setChecked(TLObject.hasFlag(n5Var.g, 4));
                g1Var5.setChecked(TLObject.hasFlag(n5Var.g, 8));
                if (this.r) {
                    g1Var6.setChecked(TLObject.hasFlag(n5Var.g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(n5Var.g, 512));
                    break;
                }
                break;
            default:
                wh.i4 i4Var = (wh.i4) this.b;
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.f;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.n;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.s;
                xh.n5 n5Var2 = i4Var.c.Y;
                g1Var8.g(LocaleController.getString(n5Var2.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), n5Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                g1Var9.setChecked(TLObject.hasFlag(n5Var2.g, 1));
                g1Var10.setChecked(TLObject.hasFlag(n5Var2.g, 2));
                g1Var11.setChecked(TLObject.hasFlag(n5Var2.g, 4));
                g1Var12.setChecked(TLObject.hasFlag(n5Var2.g, 8));
                if (this.r) {
                    g1Var13.setChecked(TLObject.hasFlag(n5Var2.g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(n5Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sk(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
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

    public /* synthetic */ sk(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
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
