package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q8(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new m4.a1(tLObject, this.b, (org.telegram.ui.ActionBar.x1) obj4, (Context) obj2, (org.telegram.ui.ActionBar.p6) obj, (l50) obj3, 5));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (qq) obj3));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new m4.a1((org.telegram.ui.Components.tf0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3, 8));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe((org.telegram.ui.ActionBar.x1) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3, 6));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new m4.a1((ns) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b, 9));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe((org.telegram.ui.ActionBar.x1) obj4, (gf.e) obj, tLObject, this.b, (Context) obj2, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 7));
                break;
            case 6:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe((LaunchActivity) obj4, tLObject, (gf.e) obj2, tL_error, (org.telegram.messenger.vp) obj, this.b, (String) obj3, 9));
                break;
            case 7:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (f70) obj, this.b, (String) obj3, 11));
                break;
            case 8:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe((LaunchActivity) obj2, tL_error, tLObject, this.b, (org.telegram.ui.ActionBar.x1) obj4, (f70) obj, (String) obj3, 8));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe((org.telegram.ui.web.z0) obj4, (String) obj2, tLObject, tL_error, this.b, (org.telegram.ui.web.v0) obj, (org.telegram.ui.web.x0) obj3));
                break;
            case 10:
                org.telegram.messenger.i0.g3(new m4.a1(tLObject, this.b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (rh) obj, (org.telegram.ui.ActionBar.z4) obj3, 13));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new m4.a1((vh.d) obj4, tLObject, (org.telegram.ui.ActionBar.z2[]) obj2, (org.telegram.ui.ActionBar.p6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3, 14));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new i2.g1((vh.d) obj4, (org.telegram.ui.ActionBar.z2[]) obj2, this.b, (TLObject) obj, (String) obj3, 21));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new m4.a1((th.l6) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b, 15));
                break;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.fe((zf.s0) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (org.telegram.messenger.vp) obj3));
                break;
        }
    }

    public /* synthetic */ q8(KeyEvent.Callback callback, Serializable serializable, int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = serializable;
        this.b = i10;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ q8(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
    }

    public /* synthetic */ q8(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ q8(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ q8(org.telegram.ui.ActionBar.x1 x1Var, gf.e eVar, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug) {
        this.a = 5;
        this.c = x1Var;
        this.e = eVar;
        this.b = i10;
        this.d = context;
        this.f = tL_inputGroupCallSlug;
    }

    public /* synthetic */ q8(LaunchActivity launchActivity, int i10, org.telegram.ui.ActionBar.x1 x1Var, f70 f70Var, String str) {
        this.a = 8;
        this.d = launchActivity;
        this.b = i10;
        this.c = x1Var;
        this.e = f70Var;
        this.f = str;
    }
}
