package jh;

import java.util.ArrayList;
import nh.gb;
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
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ i6(s7 s7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, ih.s5 s5Var) {
        this.e = s7Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.d = z11;
        this.c = j10;
        this.n = tL_textWithEntities;
        this.r = s5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c3;
        int i10;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i11 = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i11) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((s7) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (ih.s5) obj);
                break;
            default:
                gb gbVar = (gb) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                nh.m6 m6Var = (nh.m6) obj;
                lh.b bVar = gbVar.a;
                int i12 = gbVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            nh.e9 e9Var = gbVar.m0;
                            if (e9Var != null) {
                                new tc(e9Var.container, bVar).d0(tL_error, true);
                                m6Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gbVar.b, 0, bVar);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            c2Var.P = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            j7.l1.C(R.string.OK, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i12).processUpdates(updates, false);
                    nh.ka kaVar = gbVar.x0;
                    if (kaVar != null) {
                        kaVar.destroy(true, null);
                    }
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
                    int size = findUpdates.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = findUpdates.get(i13);
                            i13++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            c3 = 0;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i10 = tL_updateStoryID.id;
                            }
                        } else {
                            c3 = 0;
                            i10 = -1;
                        }
                    }
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
                    int size2 = findUpdates2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj5 = findUpdates2.get(i14);
                        i14++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i10 || i10 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        lh.d1 d1Var = lh.d1.S;
                                        if (d1Var != null) {
                                            d1Var.e();
                                            if (lh.d1.S != null) {
                                                lh.d1.S = null;
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                                                int i15 = NotificationCenter.liveStoryUpdated;
                                                Object[] objArr = new Object[1];
                                                objArr[c3] = Long.valueOf(lh.d1.S.g());
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
                                            }
                                        }
                                        AndroidUtilities.runOnUIThread(new nh.t9(gbVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ i6(gb gbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, nh.m6 m6Var) {
        this.e = gbVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.c = j10;
        this.d = z11;
        this.n = tL_error;
        this.r = m6Var;
    }
}
