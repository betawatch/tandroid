package bg;

import ai.f1;
import android.content.Context;
import android.view.KeyEvent;
import fi.d8;
import fi.i7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jg.c1;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.te0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh;
import org.telegram.ui.g50;
import org.telegram.ui.m40;
import org.telegram.ui.pr;
import org.telegram.ui.tp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                org.telegram.messenger.g0.h3(new l0(i10, 0, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (bh) obj, (o4) obj3, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new l0((hi.d) obj4, tLObject, (u2[]) obj2, (e6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new f1((hi.d) obj4, (u2[]) obj2, this.b, (TLObject) obj, (String) obj3, 2));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new l0((d8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new bi.u2((c1) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (np) obj3, 1));
                break;
            case 5:
                int i11 = this.b;
                org.telegram.messenger.g0.h3(new l0(i11, 6, (t1) obj4, (Context) obj2, (e6) obj, (m40) obj3, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new bi.u2(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (tp) obj3, 7));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new l0((te0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new bi.u2((t1) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new l0((pr) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new bi.u2((t1) obj4, (vf.b) obj2, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 9));
                break;
            case 11:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new bi.u2((LaunchActivity) obj4, tLObject, (vf.b) obj2, tL_error, (np) obj, this.b, (String) obj3, 11));
                break;
            case 12:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new bi.u2((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (g50) obj, this.b, (String) obj3, 13));
                break;
            case 13:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new bi.u2((LaunchActivity) obj4, tL_error, tLObject, this.b, (t1) obj2, (g50) obj, (String) obj3));
                break;
            default:
                org.telegram.messenger.g0.h3(new bi.u2((org.telegram.ui.web.v0) obj4, (String) obj2, tLObject, tL_error, this.b, (org.telegram.ui.web.s0) obj, (i7) obj3));
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
