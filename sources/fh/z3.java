package fh;

import gh.n7;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ z3(a4 a4Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z10, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.a = 0;
        this.c = a4Var;
        this.d = g1Var;
        this.e = g1Var2;
        this.f = g1Var3;
        this.h = g1Var4;
        this.n = g1Var5;
        this.b = z10;
        this.r = g1Var6;
        this.s = g1Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a4 a4Var = (a4) this.c;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.d;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var3 = (org.telegram.ui.ActionBar.g1) this.f;
                org.telegram.ui.ActionBar.g1 g1Var4 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var5 = (org.telegram.ui.ActionBar.g1) this.n;
                org.telegram.ui.ActionBar.g1 g1Var6 = (org.telegram.ui.ActionBar.g1) this.r;
                org.telegram.ui.ActionBar.g1 g1Var7 = (org.telegram.ui.ActionBar.g1) this.s;
                n7 n7Var = a4Var.c.U;
                g1Var.g(LocaleController.getString(n7Var.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), n7Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                g1Var2.setChecked(TLObject.hasFlag(n7Var.g, 1));
                g1Var3.setChecked(TLObject.hasFlag(n7Var.g, 2));
                g1Var4.setChecked(TLObject.hasFlag(n7Var.g, 4));
                g1Var5.setChecked(TLObject.hasFlag(n7Var.g, 8));
                if (this.b) {
                    g1Var6.setChecked(TLObject.hasFlag(n7Var.g, 256));
                    g1Var7.setChecked(TLObject.hasFlag(n7Var.g, 512));
                    break;
                }
                break;
            case 1:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequest$86((TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f, (MessageObject) this.h, (String) this.n, (HashMap) this.r, this.b, (TLRPC.TL_messages_addPollAnswer) this.s);
                break;
            case 2:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f, (MessageObject) this.h, (String) this.n, (HashMap) this.r, this.b, (TLRPC.TL_messages_editMessage) this.s);
                break;
            case 3:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequest$100(this.b, (TLRPC.TL_error) this.d, (TLRPC.Message) this.e, (TLObject) this.f, (MessageObject) this.h, (HashMap) this.n, (String) this.r, (TLObject) this.s);
                break;
            default:
                org.telegram.ui.ActionBar.g1 g1Var8 = (org.telegram.ui.ActionBar.g1) this.d;
                n7 n7Var2 = (n7) this.c;
                org.telegram.ui.ActionBar.g1 g1Var9 = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var10 = (org.telegram.ui.ActionBar.g1) this.f;
                org.telegram.ui.ActionBar.g1 g1Var11 = (org.telegram.ui.ActionBar.g1) this.h;
                org.telegram.ui.ActionBar.g1 g1Var12 = (org.telegram.ui.ActionBar.g1) this.n;
                org.telegram.ui.ActionBar.g1 g1Var13 = (org.telegram.ui.ActionBar.g1) this.r;
                org.telegram.ui.ActionBar.g1 g1Var14 = (org.telegram.ui.ActionBar.g1) this.s;
                if (g1Var8 != null) {
                    g1Var8.g(LocaleController.getString(n7Var2.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), n7Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                g1Var9.setChecked(TLObject.hasFlag(n7Var2.g, 1));
                g1Var10.setChecked(TLObject.hasFlag(n7Var2.g, 2));
                g1Var11.setChecked(TLObject.hasFlag(n7Var2.g, 4));
                g1Var12.setChecked(TLObject.hasFlag(n7Var2.g, 8));
                if (this.b) {
                    g1Var13.setChecked(TLObject.hasFlag(n7Var2.g, 256));
                    g1Var14.setChecked(TLObject.hasFlag(n7Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i9) {
        this.a = i9;
        this.c = sendMessagesHelper;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = messageObject;
        this.n = str;
        this.r = hashMap;
        this.b = z10;
        this.s = tLMethod;
    }

    public /* synthetic */ z3(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.a = 3;
        this.c = sendMessagesHelper;
        this.b = z10;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = messageObject;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }

    public /* synthetic */ z3(org.telegram.ui.ActionBar.g1 g1Var, n7 n7Var, org.telegram.ui.ActionBar.g1 g1Var2, org.telegram.ui.ActionBar.g1 g1Var3, org.telegram.ui.ActionBar.g1 g1Var4, org.telegram.ui.ActionBar.g1 g1Var5, boolean z10, org.telegram.ui.ActionBar.g1 g1Var6, org.telegram.ui.ActionBar.g1 g1Var7) {
        this.a = 4;
        this.d = g1Var;
        this.c = n7Var;
        this.e = g1Var2;
        this.f = g1Var3;
        this.h = g1Var4;
        this.n = g1Var5;
        this.b = z10;
        this.r = g1Var6;
        this.s = g1Var7;
    }
}
