package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class th implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ th(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 5;
        int i12 = 2;
        int i13 = 24;
        int i14 = 4;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ee(i11, (yi) obj2, (ri) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ee(6, (yi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gf((qp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, i11));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hy(7, (k10) obj2, (Pair) obj));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((k10) obj2, tL_error, tLObject, (Utilities.Callback) obj, false, 18));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((b40) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, false, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((f90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 22));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new gf((zg0) obj2, (yg0) obj, tLObject, 18));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new yo0((sq0) obj2, tLObject, (Context) obj, i12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((hy0) obj2, tL_error, tLObject, (MediaDataController) obj, false, 28));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((org.telegram.ui.qs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, false, 29));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new q01((s01) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, tL_error, 0));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new q01(obj2, tL_error, tLObject, obj, 2));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.iz) obj2, tLObject, (MessageObject) obj, i14));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(10, (org.telegram.ui.c00) obj2, (org.telegram.ui.ActionBar.d2) obj));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(14, (org.telegram.ui.h10) obj2, (org.telegram.ui.ActionBar.d2) obj));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.a10) obj2, tL_error, (org.telegram.ui.z00) obj, 8));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(16, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new q01(obj2, tL_error, tLObject, obj, 6));
                break;
            case 19:
                org.telegram.ui.o70 o70Var = (org.telegram.ui.o70) obj2;
                if (Objects.equals(o70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(i13, o70Var, tLObject));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.c80 c80Var = (org.telegram.ui.c80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.zq(c80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 21:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                break;
            case 22:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new q01((org.telegram.ui.ActionBar.d2) obj2, tLObject, (org.telegram.ui.h) obj, tL_error));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.fc0) obj2, tLObject, (String) obj, 19));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.cc0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new q01(obj2, tLObject, obj, (TLObject) tL_error, 12));
                break;
            case 26:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.zq(xg0Var, bundle, tLObject, i13));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kd0(xg0Var, i12));
                    break;
                }
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new q01(obj2, tLObject, obj, (TLObject) tL_error, 15));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.zf0) obj2, tL_error, (TL_account.confirmPhone) obj, 29));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.pf0((KeyEvent.Callback) obj2, tLObject, obj, i14));
                break;
        }
    }
}
