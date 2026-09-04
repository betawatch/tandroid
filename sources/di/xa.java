package di;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ xa(pc pcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, bi.oa oaVar) {
        this.e = pcVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.d = j3;
        this.c = z11;
        this.n = tL_error;
        this.r = oaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        char c10;
        int i11;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i12 = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i12) {
            case 0:
                pc pcVar = (pc) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                bi.oa oaVar = (bi.oa) obj;
                bi.b bVar = pcVar.a;
                int i13 = pcVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            ia iaVar = pcVar.q0;
                            if (iaVar != null) {
                                new org.telegram.ui.Components.yc(iaVar.container, bVar).d0(tL_error, true);
                                oaVar.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pcVar.b, 0, bVar);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.R = string;
                            b2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            i2.g.B(R.string.OK, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i13).processUpdates(updates, false);
                    sb sbVar = pcVar.B0;
                    if (sbVar != null) {
                        sbVar.destroy(true, null);
                    }
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
                    int size = findUpdates.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            Object obj4 = findUpdates.get(i14);
                            i14++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            i10 = i13;
                            c10 = 0;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i11 = tL_updateStoryID.id;
                            } else {
                                i13 = i10;
                            }
                        } else {
                            i10 = i13;
                            c10 = 0;
                            i11 = -1;
                        }
                    }
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
                    int size2 = findUpdates2.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj5 = findUpdates2.get(i15);
                        i15++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i11 || i11 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        bi.t1 t1Var = bi.t1.W;
                                        if (t1Var != null) {
                                            t1Var.e();
                                            if (bi.t1.W != null) {
                                                bi.t1.W = null;
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
                                                int i16 = NotificationCenter.liveStoryUpdated;
                                                Object[] objArr = new Object[1];
                                                objArr[c10] = Long.valueOf(bi.t1.W.g());
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, objArr);
                                            }
                                        }
                                        AndroidUtilities.runOnUIThread(new ya(pcVar, this.b, storyItem, this.d, inputGroupCall, this.c), 100L);
                                        break;
                                    }
                                }
                            }
                            inputGroupCall = null;
                            if (inputGroupCall != null) {
                            }
                        }
                    }
                    storyItem = null;
                    if (storyItem != null) {
                    }
                    inputGroupCall = null;
                    if (inputGroupCall != null) {
                    }
                }
                break;
            default:
                ((boolean[]) obj2)[0] = true;
                ((zh.s5) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.c, this.d, (TLRPC.TL_textWithEntities) tLObject, (yh.l4) obj);
                break;
        }
    }

    public /* synthetic */ xa(zh.s5 s5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, yh.l4 l4Var) {
        this.e = s5Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.c = z11;
        this.d = j3;
        this.n = tL_textWithEntities;
        this.r = l4Var;
    }
}
