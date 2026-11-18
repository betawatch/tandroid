package bg;

import ai.g1;
import android.content.Context;
import android.view.KeyEvent;
import bi.c5;
import fi.a8;
import fi.f7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jg.c1;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.df0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh;
import org.telegram.ui.o60;
import org.telegram.ui.p40;
import org.telegram.ui.qr;
import org.telegram.ui.up;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l0(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                org.telegram.messenger.g0.g3(new m0(i10, 0, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (bh) obj, (s4) obj3, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new m0((hi.d) obj4, tLObject, (x2[]) obj2, (i6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new g1((hi.d) obj4, (x2[]) obj2, this.b, (TLObject) obj, (String) obj3, 2));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new m0((a8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new c5((c1) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (mp) obj3, 1));
                break;
            case 5:
                int i11 = this.b;
                org.telegram.messenger.g0.g3(new m0(i11, 6, (u1) obj4, (Context) obj2, (i6) obj, (p40) obj3, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new c5(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (up) obj3, 7));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new m0((df0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new c5((u1) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new m0((qr) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new c5((u1) obj4, (vf.b) obj2, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 9));
                break;
            case 11:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new c5((LaunchActivity) obj4, tLObject, (vf.b) obj2, tL_error, (mp) obj, this.b, (String) obj3, 11));
                break;
            case 12:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new c5((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (o60) obj, this.b, (String) obj3, 13));
                break;
            case 13:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new c5((LaunchActivity) obj4, tL_error, tLObject, this.b, (u1) obj2, (o60) obj, (String) obj3));
                break;
            default:
                org.telegram.messenger.g0.g3(new c5((org.telegram.ui.web.v0) obj4, (String) obj2, tLObject, tL_error, this.b, (org.telegram.ui.web.s0) obj, (f7) obj3));
                break;
        }
    }

    public /* synthetic */ l0(KeyEvent.Callback callback, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i7;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ l0(KeyEvent.Callback callback, Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.f = obj3;
    }

    public /* synthetic */ l0(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i7;
    }
}
