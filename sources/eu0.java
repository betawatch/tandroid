// default package

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eu0(c51 c51Var, nx0[] nx0VarArr, int i, TLObject tLObject, String str) {
        this.a = (byte) 12;
        this.c = c51Var;
        this.e = nx0VarArr;
        this.b = i;
        this.f = tLObject;
        this.d = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                hl.c3(new st((rv0) obj4, (String) obj, tLObject, tL_error, this.b, (nv0) obj2, (pv0) obj3));
                break;
            case 1:
                hl.c3(new te(tLObject, this.b, (id) obj4, (Context) obj, (vnb) obj2, (gc5) obj3));
                break;
            case 2:
                hl.c3(new te(obj4, this.b, tLObject, obj, obj2, obj3, (byte) 5));
                break;
            case 3:
                hl.c3(new st(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj, (ArrayList) obj2, (on1) obj3));
                break;
            case 4:
                hl.c3(new st((id) obj4, (l01) obj, tLObject, this.b, (Activity) obj2, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                break;
            case 5:
                String str = LaunchActivity.C1;
                hl.c3(new st((fn7) obj4, tLObject, obj2, (TLObject) tL_error, obj3, this.b, (String) obj, (byte) 9));
                break;
            case 6:
                String str2 = LaunchActivity.C1;
                hl.c3(new st((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (tg5) obj3, this.b, (String) obj));
                break;
            case 7:
                String str3 = LaunchActivity.C1;
                hl.c3(new st((LaunchActivity) obj4, tL_error, tLObject, this.b, (id) obj2, (tg5) obj3, (String) obj));
                break;
            case 8:
                hl.c3(new st((n17) obj4, this.b, (ArrayList) obj, (zh6) obj2, tL_error, tLObject, (uc7) obj3));
                break;
            case 9:
                hl.c3(new te((Object) tLObject, this.b, (TLObject) obj4, obj, obj2, obj3, (byte) 8));
                break;
            case 10:
                hl.c3(new te((KeyEvent.Callback) obj4, obj, this.b, (Object) tLObject, obj2, (TLObject) obj3, (byte) 9));
                break;
            case 11:
                hl.c3(new te((c51) obj4, tLObject, (nx0[]) obj, (vnb) obj2, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 12:
                hl.c3(new l77(obj4, obj2, this.b, obj3, obj, (byte) 26));
                break;
            case 13:
                hl.c3(new st((id) obj4, tLObject, this.b, (TLRPC.Document) obj, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            default:
                hl.c3(new te((u7b) obj4, tLObject, this.d, (ArrayList) obj2, (boolean[]) obj3, this.b));
                break;
        }
    }

    public /* synthetic */ eu0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ eu0(c51 c51Var, nx0[] nx0VarArr, vnb vnbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = c51Var;
        this.d = nx0VarArr;
        this.e = vnbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    public /* synthetic */ eu0(u7b u7bVar, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 14;
        this.c = u7bVar;
        this.d = obj;
        this.e = arrayList;
        this.f = zArr;
        this.b = i;
    }

    public /* synthetic */ eu0(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ eu0(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ eu0(LaunchActivity launchActivity, int i, id idVar, tg5 tg5Var, String str) {
        this.a = (byte) 7;
        this.c = launchActivity;
        this.b = i;
        this.e = idVar;
        this.f = tg5Var;
        this.d = str;
    }

    public /* synthetic */ eu0(LaunchActivity launchActivity, Object obj, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.c = launchActivity;
        this.e = obj;
        this.f = obj2;
        this.b = i;
        this.d = str;
    }
}
