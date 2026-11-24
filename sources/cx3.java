// default package

import android.os.Bundle;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cx3 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cx3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 7;
        byte b3 = 1;
        byte b4 = 2;
        byte b5 = 18;
        byte b6 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gm.c3(new pz2((dx3) obj2, (String) obj, tLObject, b5));
                break;
            case 1:
                gm.c3(new pv3((ke4) obj2, (he) obj, (byte) 29));
                break;
            case 2:
                gm.c3(new ve4((qf4) obj2, (he) obj, (byte) 3));
                break;
            case 3:
                gm.c3(new if4((kf4) obj2, tL_error, (hf4) obj, b6));
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                gm.c3(new ve4(filtersSetupActivity, (TLRPC.TL_messages_toggleDialogFilterTags) obj, b2));
                break;
            case 5:
                gm.c3(new ve4((ln4) obj2, (Pair) obj, (byte) 13));
                break;
            case 6:
                gm.c3(new xo1((ln4) obj2, tL_error, tLObject, (qac) obj, (byte) 20));
                break;
            case 7:
                gm.c3(new if4((st4) obj2, tLObject, (oc7) obj, b2));
                break;
            case 8:
                gm.c3(new if4(obj2, obj, (Object) tLObject, (byte) 8));
                break;
            case 9:
                gm.c3(new d65((r85) obj2, tL_error, tLObject, (String) obj, (byte) 3));
                break;
            case 10:
                gd5 gd5Var = (gd5) obj2;
                if (Objects.equals(gd5Var.a.e, (String) obj)) {
                    gm.c3(new fd5(gd5Var, tLObject, b3));
                    break;
                }
                break;
            case 11:
                gm.c3(new d65((pd5) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, (byte) 6));
                break;
            case 12:
                vr5 vr5Var = (vr5) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            gm.c3(new if4((Object) vr5Var, langPackString, (Object) str, (byte) 25));
                            break;
                        }
                    }
                }
                break;
            case 13:
                String str2 = LaunchActivity.C1;
                gm.c3(new dt5((LaunchActivity) obj2, tLObject, (bmb) obj, (byte) 6));
                break;
            case 14:
                String str3 = LaunchActivity.C1;
                gm.c3(new d65((he) obj2, tLObject, (u8) obj, tL_error, (byte) 10));
                break;
            case 15:
                gm.c3(new d65((f56) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, (byte) 11));
                break;
            case 16:
                gm.c3(new dt5((a66) obj2, tLObject, (String) obj, (byte) 9));
                break;
            case 17:
                gm.c3(new dt5((x56) obj2, tLObject, (TLRPC.User) obj, (byte) 10));
                break;
            case 18:
                gm.c3(new d65((x56) obj2, tLObject, (HashSet) obj, tL_error, (byte) 13));
                break;
            case 19:
                mh6 mh6Var = (mh6) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    gm.c3(new dt5(mh6Var, bundle, tLObject, (byte) 19));
                    break;
                } else {
                    gm.c3(new de6(mh6Var, b4));
                    break;
                }
                break;
            case 20:
                gm.c3(new d65((sf6) obj2, tLObject, (String) obj, tL_error, (byte) 17));
                break;
            case 21:
                gm.c3(new dt5((rg6) obj2, tL_error, (TL_account.confirmPhone) obj, (byte) 23));
                break;
            case 22:
                gm.c3(new dt5((lh6) obj2, tLObject, (HashMap) obj, (byte) 28));
                break;
            case 23:
                gm.c3(new d65((lh6) obj2, tL_error, tLObject, (String) obj, (byte) 21));
                break;
            case 24:
                hs6 hs6Var = (hs6) obj2;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && ad4.r(tL_error.text)) {
                    hs6Var.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    break;
                }
                break;
            case 25:
                gm.c3(new fp6((hs6) obj2, tLObject, (TLRPC.Document) obj, b4));
                break;
            case 26:
                hs6 hs6Var2 = (hs6) obj2;
                v15 v15Var = (v15) obj;
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    hs6Var2.w1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    hs6Var2.w1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (v15Var != null) {
                    gm.c3(v15Var);
                    break;
                }
                break;
            case 27:
                gm.c3(new fp6(obj2, obj, (Object) tLObject, (byte) 12));
                break;
            case 28:
                gm.c3(new fp6(obj2, tLObject, (ArrayList) obj, b5));
                break;
            default:
                oc7 oc7Var = (oc7) obj2;
                ko2 ko2Var = (ko2) obj;
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    if (ko2Var != null) {
                        gm.c3(ko2Var);
                        break;
                    }
                }
                break;
        }
    }
}
