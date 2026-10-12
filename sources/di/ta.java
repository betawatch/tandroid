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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ta(kc kcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, x8 x8Var) {
        this.e = kcVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.d = j10;
        this.c = z11;
        this.n = tL_error;
        this.r = x8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i13 = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i14 = 0;
        switch (i13) {
            case 0:
                kc kcVar = (kc) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                x8 x8Var = (x8) obj;
                bi.b bVar = kcVar.a;
                int i15 = kcVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            ea eaVar = kcVar.q0;
                            if (eaVar != null) {
                                new org.telegram.ui.Components.zc(eaVar.container, bVar).f0(tL_error, true);
                                x8Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kcVar.b, 0, bVar);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.R = string;
                            a2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i15).lambda$processUpdates$377(updates, false);
                    nb nbVar = kcVar.B0;
                    if (nbVar != null) {
                        nbVar.destroy(true, null);
                    }
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
                    int size = findUpdates.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 < size) {
                            Object obj4 = findUpdates.get(i16);
                            i16++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            i10 = i14;
                            i11 = i15;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i12 = tL_updateStoryID.id;
                            } else {
                                i14 = i10;
                                i15 = i11;
                            }
                        } else {
                            i10 = i14;
                            i11 = i15;
                            i12 = -1;
                        }
                    }
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
                    int size2 = findUpdates2.size();
                    int i17 = i10;
                    while (i17 < size2) {
                        Object obj5 = findUpdates2.get(i17);
                        i17++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i12 || i12 == -1)) {
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
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                                                int i18 = NotificationCenter.liveStoryUpdated;
                                                Object[] objArr = new Object[1];
                                                objArr[i10] = Long.valueOf(bi.t1.W.g());
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                                            }
                                        }
                                        AndroidUtilities.runOnUIThread(new ua(kcVar, this.b, storyItem, this.d, inputGroupCall, this.c), 100L);
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
                ((zh.n5) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.c, this.d, (TLRPC.TL_textWithEntities) tLObject, (yh.l4) obj);
                break;
        }
    }

    public /* synthetic */ ta(zh.n5 n5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, yh.l4 l4Var) {
        this.e = n5Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.c = z11;
        this.d = j10;
        this.n = tL_textWithEntities;
        this.r = l4Var;
    }
}
