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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        int i11 = 10;
        int i12 = 8;
        int i13 = 16;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                to toVar = (to) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = toVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    toVar.getMessagesStorage().updateUserInfo(toVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new lo(toVar, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new oh(15, (tp) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(obj2, (Object) tL_error, tLObject, obj, 12));
                break;
            case 3:
                org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) obj2;
                NotificationCenter.getInstance(m5Var.e).doOnIdle(new org.telegram.ui.Components.l5(m5Var, (ArrayList) obj, tLObject, i14));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.j8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, i11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.be(6, (org.telegram.ui.Components.xi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.be(7, (org.telegram.ui.Components.xi) obj2, (org.telegram.ui.Components.qi) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.np) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, i13));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw(i12, (org.telegram.ui.Components.f10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(obj2, (Object) tL_error, tLObject, obj, 22));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((org.telegram.ui.Components.j90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.ch0) obj2, (org.telegram.ui.Components.bh0) obj, tLObject, 29));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vo0((org.telegram.ui.Components.br0) obj2, tLObject, (Context) obj, 3));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.Components.ry0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((ms0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.Components.e11) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.Components.u41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new uq((gz) obj2, tLObject, (MessageObject) obj, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new cu(i11, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new cu(14, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new uq((y00) obj2, tL_error, (x00) obj, i12));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new cu(i13, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((p50) obj2, tL_error, tLObject, (String) obj, 10));
                break;
            case 24:
                o70 o70Var = (o70) obj2;
                if (Objects.equals(o70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new cu(24, o70Var, tLObject));
                    break;
                }
                break;
            case 25:
                c80 c80Var = (c80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new uq(c80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new uq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, 17));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new uq((dc0) obj2, tLObject, (String) obj, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new uq((ac0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}
