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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oo(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 10;
        int i12 = 8;
        int i13 = 19;
        int i14 = 0;
        int i15 = 17;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                uo uoVar = (uo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = uoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    uoVar.getMessagesStorage().updateUserInfo(uoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new mo(uoVar, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gh(i15, (up) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(obj2, (Object) tL_error, tLObject, obj, 12));
                break;
            case 3:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) obj2;
                NotificationCenter.getInstance(l5Var.e).doOnIdle(new org.telegram.ui.Components.k5(l5Var, (ArrayList) obj, tLObject, i14));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.i8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, i11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.tc(i12, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.tc(9, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 16));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bv(i11, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(obj2, (Object) tL_error, tLObject, obj, 22));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.d90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.zg0) obj2, (org.telegram.ui.Components.yg0) obj, tLObject, 29));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wn0((org.telegram.ui.Components.uq0) obj2, tLObject, (Context) obj, 5));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.gy0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((rs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.t01) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.j41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new vq((gz) obj2, tLObject, (MessageObject) obj, 4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new yt(13, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new yt(i15, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new vq((y00) obj2, tL_error, (x00) obj, i12));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new yt(i13, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((p50) obj2, tL_error, tLObject, (String) obj, 10));
                break;
            case 24:
                p70 p70Var = (p70) obj2;
                if (Objects.equals(p70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new yt(27, p70Var, tLObject));
                    break;
                }
                break;
            case 25:
                d80 d80Var = (d80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new vq(d80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new vq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, i15));
                break;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new vq((hc0) obj2, tLObject, (String) obj, i13));
                break;
            default:
                AndroidUtilities.runOnUIThread(new vq((ec0) obj2, tLObject, (TLRPC.User) obj, 20));
                break;
        }
    }
}
