package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ no(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 24;
        int i12 = 28;
        int i13 = 8;
        int i14 = 19;
        int i15 = 20;
        int i16 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ro roVar = (ro) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = roVar.B0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    roVar.getMessagesStorage().updateUserInfo(roVar.B0, false);
                }
                AndroidUtilities.runOnUIThread(new lo(roVar, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hc(i12, (sp) obj2, (org.telegram.ui.ActionBar.d2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kh(obj2, (Object) tL_error, tLObject, obj, 3));
                break;
            case 3:
                org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) obj2;
                NotificationCenter.getInstance(h5Var.e).doOnIdle(new org.telegram.ui.Components.g5(h5Var, (ArrayList) obj, tLObject, i16));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new lh.p6((org.telegram.ui.Components.c8) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, i11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new np(i14, (org.telegram.ui.Components.li) obj2, (org.telegram.ui.Components.ei) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new np(i15, (org.telegram.ui.Components.li) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gp((org.telegram.ui.Components.hp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, i16));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.em(21, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new kh(obj2, (Object) tL_error, tLObject, obj, 13));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new kh(obj2, (Object) tL_error, tLObject, obj, 15));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new kh((org.telegram.ui.Components.x80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gp(obj2, obj, tLObject, 13));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.z80((org.telegram.ui.Components.lq0) obj2, tLObject, (Context) obj, 16));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new kh(obj2, (Object) tL_error, tLObject, obj, 23));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new kh(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new kh((org.telegram.ui.Components.j01) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, tL_error));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new kh(obj2, (Object) tL_error, tLObject, obj, 27));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new tq((dz) obj2, tLObject, (MessageObject) obj, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(i11, (yz) obj2, (org.telegram.ui.ActionBar.d2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(i12, (c10) obj2, (org.telegram.ui.ActionBar.d2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new tq((v00) obj2, tL_error, (u00) obj, i13));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new w10(i16, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new c30(obj2, (Object) tL_error, tLObject, obj, 1));
                break;
            case 24:
                k70 k70Var = (k70) obj2;
                if (Objects.equals(k70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new w10(i13, k70Var, tLObject));
                    break;
                }
                break;
            case 25:
                w70 w70Var = (w70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new tq(w70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new tq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new c30(obj2, tLObject, obj, (Object) tL_error, 5));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new tq((yb0) obj2, tLObject, (String) obj, i14));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tq((vb0) obj2, tLObject, (TLRPC.User) obj, i15));
                break;
        }
    }
}
