package cg;

import ai.d3;
import ai.p1;
import android.content.Context;
import android.view.KeyEvent;
import ei.k8;
import ei.p7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kg.z0;
import org.telegram.messenger.hp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.se0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h40;
import org.telegram.ui.lr;
import org.telegram.ui.ly;
import org.telegram.ui.pp;
import org.telegram.ui.web.w0;
import org.telegram.ui.xg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j0(int i3, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                int i10 = this.b;
                org.telegram.messenger.g0.h3(new k0(i10, 0, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (xg) obj, (q4) obj3, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new k0((gi.d) obj4, tLObject, (t2[]) obj2, (e6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new p1((gi.d) obj4, (t2[]) obj2, this.b, (TLObject) obj, (String) obj3, 1));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new k0((k8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new d3((z0) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (hp) obj3, 1));
                break;
            case 5:
                int i11 = this.b;
                org.telegram.messenger.g0.h3(new k0(i11, 7, (s1) obj4, (Context) obj2, (e6) obj, (h40) obj3, tLObject));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new d3(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (pp) obj3, 7));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new k0((se0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new d3((s1) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new k0((lr) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new d3((s1) obj4, (sf.b) obj2, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 9));
                break;
            case 11:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new d3((LaunchActivity) obj4, tLObject, (sf.b) obj2, tL_error, (hp) obj, this.b, (String) obj3, 11));
                break;
            case 12:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new d3((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (ly) obj, this.b, (String) obj3, 13));
                break;
            case 13:
                String str3 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new d3((LaunchActivity) obj4, tL_error, tLObject, this.b, (s1) obj2, (ly) obj, (String) obj3));
                break;
            default:
                org.telegram.messenger.g0.h3(new d3((w0) obj4, (String) obj2, tLObject, tL_error, this.b, (org.telegram.ui.web.t0) obj, (p7) obj3));
                break;
        }
    }

    public /* synthetic */ j0(KeyEvent.Callback callback, Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i3;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ j0(KeyEvent.Callback callback, Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.f = obj3;
    }

    public /* synthetic */ j0(Object obj, int i3, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i3;
    }
}
