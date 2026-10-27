package bi;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ o8(ca caVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, zh.m4 m4Var) {
        this.e = caVar;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.d = z11;
        this.c = j10;
        this.n = tL_textWithEntities;
        this.r = m4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i12 = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i13 = 0;
        switch (i12) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((ca) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (zh.m4) obj);
                break;
            default:
                fi.sb sbVar = (fi.sb) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                di.s8 s8Var = (di.s8) obj;
                di.b bVar = sbVar.a;
                int i14 = sbVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            fi.n9 n9Var = sbVar.q0;
                            if (n9Var != null) {
                                new org.telegram.ui.Components.wc(n9Var.container, bVar).g0(tL_error, true);
                                s8Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.b, 0, bVar);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.R = string;
                            e2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i14).lambda$processUpdates$379(updates, false);
                    fi.va vaVar = sbVar.B0;
                    if (vaVar != null) {
                        vaVar.destroy(true, null);
                    }
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
                    int size = findUpdates.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            Object obj4 = findUpdates.get(i15);
                            i15++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            i10 = i13;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i11 = tL_updateStoryID.id;
                            } else {
                                i13 = i10;
                            }
                        } else {
                            i10 = i13;
                            i11 = -1;
                        }
                    }
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
                    int size2 = findUpdates2.size();
                    int i16 = i10;
                    while (i16 < size2) {
                        Object obj5 = findUpdates2.get(i16);
                        i16++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i11 || i11 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        di.h1 h1Var = di.h1.W;
                                        if (h1Var != null) {
                                            h1Var.e();
                                            if (di.h1.W != null) {
                                                di.h1.W = null;
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(i14);
                                                int i17 = NotificationCenter.liveStoryUpdated;
                                                Object[] objArr = new Object[1];
                                                objArr[i10] = Long.valueOf(di.h1.W.g());
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i17, objArr);
                                            }
                                        }
                                        AndroidUtilities.runOnUIThread(new fi.ca(sbVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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
        }
    }

    public /* synthetic */ o8(fi.sb sbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, di.s8 s8Var) {
        this.e = sbVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.c = j10;
        this.d = z11;
        this.n = tL_error;
        this.r = s8Var;
    }
}
