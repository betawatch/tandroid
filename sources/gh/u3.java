package gh;

import hh.m7;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class u3 implements Runnable {
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

    public /* synthetic */ u3(v3 v3Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, org.telegram.ui.ActionBar.f1 f1Var5, boolean z10, org.telegram.ui.ActionBar.f1 f1Var6, org.telegram.ui.ActionBar.f1 f1Var7) {
        this.a = 0;
        this.c = v3Var;
        this.d = f1Var;
        this.e = f1Var2;
        this.f = f1Var3;
        this.h = f1Var4;
        this.n = f1Var5;
        this.b = z10;
        this.r = f1Var6;
        this.s = f1Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v3 v3Var = (v3) this.c;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.n;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.r;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.s;
                m7 m7Var = v3Var.c.U;
                f1Var.g(LocaleController.getString(m7Var.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), m7Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                f1Var2.setChecked(TLObject.hasFlag(m7Var.g, 1));
                f1Var3.setChecked(TLObject.hasFlag(m7Var.g, 2));
                f1Var4.setChecked(TLObject.hasFlag(m7Var.g, 4));
                f1Var5.setChecked(TLObject.hasFlag(m7Var.g, 8));
                if (this.b) {
                    f1Var6.setChecked(TLObject.hasFlag(m7Var.g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(m7Var.g, 512));
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
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.d;
                m7 m7Var2 = (m7) this.c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.n;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.r;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.s;
                if (f1Var8 != null) {
                    f1Var8.g(LocaleController.getString(m7Var2.e ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), m7Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                f1Var9.setChecked(TLObject.hasFlag(m7Var2.g, 1));
                f1Var10.setChecked(TLObject.hasFlag(m7Var2.g, 2));
                f1Var11.setChecked(TLObject.hasFlag(m7Var2.g, 4));
                f1Var12.setChecked(TLObject.hasFlag(m7Var2.g, 8));
                if (this.b) {
                    f1Var13.setChecked(TLObject.hasFlag(m7Var2.g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(m7Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u3(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.a = i10;
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

    public /* synthetic */ u3(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
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

    public /* synthetic */ u3(org.telegram.ui.ActionBar.f1 f1Var, m7 m7Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, org.telegram.ui.ActionBar.f1 f1Var5, boolean z10, org.telegram.ui.ActionBar.f1 f1Var6, org.telegram.ui.ActionBar.f1 f1Var7) {
        this.a = 4;
        this.d = f1Var;
        this.c = m7Var;
        this.e = f1Var2;
        this.f = f1Var3;
        this.h = f1Var4;
        this.n = f1Var5;
        this.b = z10;
        this.r = f1Var6;
        this.s = f1Var7;
    }
}
