package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mo(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 4;
        int i13 = 7;
        int i14 = 13;
        int i15 = 11;
        int i16 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                so soVar = (so) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = soVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    soVar.getMessagesStorage().updateUserInfo(soVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new ko(soVar, i11));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rh(i15, (sp) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(obj2, (Object) tL_error, tLObject, obj, 12));
                break;
            case 3:
                org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) obj2;
                NotificationCenter.getInstance(m5Var.e).doOnIdle(new org.telegram.ui.Components.l5(m5Var, (ArrayList) obj, tLObject, i16));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.j8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, i13));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ph(i11, (org.telegram.ui.Components.wi) obj2, (org.telegram.ui.Components.pi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ph(3, (org.telegram.ui.Components.wi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.lp) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, i14));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oy(i12, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(obj2, (Object) tL_error, tLObject, obj, 22));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((org.telegram.ui.Components.w80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.qg0) obj2, (org.telegram.ui.Components.pg0) obj, tLObject, 26));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oy((org.telegram.ui.Components.hq0) obj2, tLObject, (Context) obj));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.ux0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((ks0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.e01) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.u31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new tq((dz) obj2, tLObject, (MessageObject) obj, i12));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new hw(i13, (xz) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new hw(i15, (c10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new tq((v00) obj2, tL_error, (u00) obj, 8));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new hw(i14, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((m50) obj2, tL_error, tLObject, (String) obj, 10));
                break;
            case 24:
                m70 m70Var = (m70) obj2;
                if (Objects.equals(m70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new hw(21, m70Var, tLObject));
                    break;
                }
                break;
            case 25:
                a80 a80Var = (a80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new tq(a80Var, (TLRPC.TL_langPackString) langPackString, str, i15));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new tq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new tq((ac0) obj2, tLObject, (String) obj, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tq((xb0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}
