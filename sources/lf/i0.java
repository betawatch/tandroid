package lf;

import android.content.Context;
import android.view.KeyEvent;
import eg.d3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import lh.l2;
import oh.d8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.os;
import org.telegram.ui.p60;
import org.telegram.ui.sq;
import org.telegram.ui.z10;
import org.telegram.ui.zi;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i0(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
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
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (zi) obj, (f5) obj3, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new d3((qh.d) obj4, (h3[]) obj2, this.b, (TLObject) obj, (String) obj3, 2));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new j0((qh.d) obj4, tLObject, (h3[]) obj2, (g6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new j0((d8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b));
                break;
            case 4:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.b, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new j0(tLObject, this.b, (d2) obj4, (Context) obj2, (g6) obj, (p60) obj3, 7));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new l2(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (sq) obj3, 6));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new j0((xg0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new l2((d2) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new j0((os) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new l2((d2) obj4, (af.f) obj2, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 8));
                break;
            case 11:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new l2((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (z10) obj, this.b, (String) obj3, 10));
                break;
            case 12:
                Pattern pattern2 = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new l2((LaunchActivity) obj4, tL_error, tLObject, this.b, (d2) obj2, (z10) obj, (String) obj3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new l2((uf.p0) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 14));
                break;
        }
    }

    public /* synthetic */ i0(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ i0(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
    }

    public /* synthetic */ i0(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }
}
