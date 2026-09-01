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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lo(int i10, Object obj, Object obj2) {
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
                po poVar = (po) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = poVar.B0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    poVar.getMessagesStorage().updateUserInfo(poVar.B0, false);
                }
                AndroidUtilities.runOnUIThread(new jo(poVar, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fc(i12, (rp) obj2, (org.telegram.ui.ActionBar.d2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ih(obj2, (Object) tL_error, tLObject, obj, 3));
                break;
            case 3:
                org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) obj2;
                NotificationCenter.getInstance(h5Var.e).doOnIdle(new org.telegram.ui.Components.g5(h5Var, (ArrayList) obj, tLObject, i16));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new mh.p6((org.telegram.ui.Components.c8) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, i11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new mp(i14, (org.telegram.ui.Components.mi) obj2, (org.telegram.ui.Components.fi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new mp(i15, (org.telegram.ui.Components.mi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jp((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, i16));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gm(21, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ih(obj2, (Object) tL_error, tLObject, obj, 13));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ih(obj2, (Object) tL_error, tLObject, obj, 15));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ih((org.telegram.ui.Components.y80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jp(obj2, obj, tLObject, 13));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a90((org.telegram.ui.Components.mq0) obj2, tLObject, (Context) obj, 16));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ih(obj2, (Object) tL_error, tLObject, obj, 23));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ih(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ih((org.telegram.ui.Components.k01) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, tL_error));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ih(obj2, (Object) tL_error, tLObject, obj, 27));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new sq((cz) obj2, tLObject, (MessageObject) obj, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l41(i11, (xz) obj2, (org.telegram.ui.ActionBar.d2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l41(i12, (b10) obj2, (org.telegram.ui.ActionBar.d2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new sq((u00) obj2, tL_error, (t00) obj, i13));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new v10(i16, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new b30(obj2, (Object) tL_error, tLObject, obj, 1));
                break;
            case 24:
                j70 j70Var = (j70) obj2;
                if (Objects.equals(j70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new v10(i13, j70Var, tLObject));
                    break;
                }
                break;
            case 25:
                v70 v70Var = (v70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new sq(v70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new sq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new b30(obj2, tLObject, obj, (Object) tL_error, 5));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new sq((xb0) obj2, tLObject, (String) obj, i14));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sq((ub0) obj2, tLObject, (TLRPC.User) obj, i15));
                break;
        }
    }
}
