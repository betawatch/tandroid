package bg;

import android.content.Context;
import android.view.KeyEvent;
import bi.ub;
import di.k8;
import di.o7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jg.c1;
import jg.d1;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh;
import org.telegram.ui.m40;
import org.telegram.ui.nr;
import org.telegram.ui.q10;
import org.telegram.ui.rp;
import org.telegram.ui.web.x0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k0(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                int i10 = this.b;
                org.telegram.messenger.g0.h3(new l0(i10, 0, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (bh) obj, (q4) obj3, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new l0((fi.d) obj4, tLObject, (v2[]) obj2, (f6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ub((fi.d) obj4, (v2[]) obj2, this.b, (TLObject) obj, (String) obj3, 0));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new l0((k8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new c1((d1) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (qp) obj3, 0));
                break;
            case 5:
                int i11 = this.b;
                org.telegram.messenger.g0.h3(new l0(i11, 6, (u1) obj4, (Context) obj2, (f6) obj, (m40) obj3, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new c1(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (rp) obj3));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new l0((qe0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new c1((u1) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new l0((nr) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new c1((u1) obj4, (vf.b) obj2, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                break;
            case 11:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new c1((LaunchActivity) obj4, tLObject, (vf.b) obj2, tL_error, (qp) obj, this.b, (String) obj3));
                break;
            case 12:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new c1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (q10) obj, this.b, (String) obj3));
                break;
            case 13:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new c1((LaunchActivity) obj4, tL_error, tLObject, this.b, (u1) obj2, (q10) obj, (String) obj3));
                break;
            default:
                org.telegram.messenger.g0.h3(new c1((x0) obj4, (String) obj2, tLObject, tL_error, this.b, (org.telegram.ui.web.u0) obj, (o7) obj3));
                break;
        }
    }

    public /* synthetic */ k0(KeyEvent.Callback callback, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i7;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ k0(KeyEvent.Callback callback, Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.f = obj3;
    }

    public /* synthetic */ k0(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i7;
    }
}
