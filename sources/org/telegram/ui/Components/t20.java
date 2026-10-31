package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t20(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 27;
        int i12 = 17;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp(obj2, (Object) tL_error, (Object) tLObject, obj, 13));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp(obj2, obj, (Object) tL_error, (Object) tLObject, 15));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new jg((tf0) obj2, (sf0) obj, tLObject, 16));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new gi0((op0) obj2, tLObject, (Context) obj, 6));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp(obj2, (Object) tL_error, (Object) tLObject, obj, 21));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp(obj2, (Object) tL_error, (Object) tLObject, obj, 22));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp(obj2, obj, (Object) tLObject, (Object) tL_error, 23));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp(obj2, (Object) tL_error, (Object) tLObject, obj, 25));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.ly) obj2, tLObject, (org.telegram.messenger.jj) obj, 4));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new org.telegram.ui.xs(13, (org.telegram.ui.gz) obj2, (org.telegram.ui.ActionBar.x1) obj));
                break;
            case 10:
                org.telegram.messenger.i0.g3(new org.telegram.ui.xs(i12, (org.telegram.ui.i00) obj2, (org.telegram.ui.ActionBar.x1) obj));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.c00) obj2, tL_error, (org.telegram.ui.b00) obj, 8));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new org.telegram.ui.xs(19, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((org.telegram.ui.j40) obj2, tL_error, tLObject, (String) obj, 29));
                break;
            case 14:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj2;
                if (Objects.equals(g60Var.a.e, (String) obj)) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.xs(i11, g60Var, tLObject));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.s60 s60Var = (org.telegram.ui.s60) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.i0.g3(new org.telegram.ui.qq(s60Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 16:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.s6) obj, 18));
                break;
            case 17:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.ui.w50((org.telegram.ui.ActionBar.x1) obj2, tLObject, (org.telegram.ui.f) obj, tL_error, 3));
                break;
            case 18:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.ua0) obj2, tLObject, (String) obj, 21));
                break;
            case 19:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.ra0) obj2, tLObject, (TLRPC.User) obj, 22));
                break;
            case 20:
                org.telegram.messenger.i0.g3(new org.telegram.ui.w50((org.telegram.ui.ra0) obj2, tLObject, (HashSet) obj, tL_error, 5));
                break;
            case 21:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.qq(hf0Var, bundle, tLObject, i11));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.zb0(hf0Var, 2));
                    break;
                }
                break;
            case 22:
                org.telegram.messenger.i0.g3(new org.telegram.ui.w50((org.telegram.ui.od0) obj2, tLObject, (String) obj, tL_error, 8));
                break;
            case 23:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qd0((org.telegram.ui.me0) obj2, tL_error, (TL_account.confirmPhone) obj, false, 2));
                break;
            case 24:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qd0((org.telegram.ui.gf0) obj2, tLObject, (HashMap) obj, 7));
                break;
            case 25:
                org.telegram.messenger.i0.g3(new org.telegram.ui.w50((org.telegram.ui.gf0) obj2, tL_error, tLObject, (String) obj, 12));
                break;
            case 26:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qd0((org.telegram.ui.gi0) obj2, tLObject, (vg) obj, 10));
                break;
            case 27:
                org.telegram.ui.ok0 ok0Var = (org.telegram.ui.ok0) obj2;
                ok0Var.getClass();
                ok0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 28:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qd0((org.telegram.ui.hl0) obj2, tL_error, (TL_account.verifyPhone) obj, false, 16));
                break;
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.tl0(sm0Var, tL_error, tLObject2, 1));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.uf0(i12, sm0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
        }
    }
}
