package lh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.hw;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public /* synthetic */ i6(t7 t7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z4, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, kh.s5 s5Var) {
        this.e = t7Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z4;
        this.d = z10;
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
                ((t7) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (kh.s5) obj);
                break;
            default:
                ph.da daVar = (ph.da) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                org.telegram.ui.web.o0 o0Var = (org.telegram.ui.web.o0) obj;
                nh.b bVar = daVar.a;
                int i12 = daVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            ph.f8 f8Var = daVar.n0;
                            if (f8Var != null) {
                                new qc(f8Var.container, bVar).d0(tL_error, true);
                                o0Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(daVar.b, 0, bVar);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.O = string;
                            d2Var.Q = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            kh.a2.C(R.string.OK, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i12).processUpdates(updates, false);
                    ph.i9 i9Var = daVar.y0;
                    if (i9Var != null) {
                        i9Var.destroy(true, null);
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
                                        nh.e1 e1Var = nh.e1.T;
                                        if (e1Var != null) {
                                            e1Var.e();
                                            if (nh.e1.T != null) {
                                                nh.e1.T = null;
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                                                int i15 = NotificationCenter.liveStoryUpdated;
                                                Object[] objArr = new Object[1];
                                                objArr[c3] = Long.valueOf(nh.e1.T.g());
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
                                            }
                                        }
                                        AndroidUtilities.runOnUIThread(new hw(daVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ i6(ph.da daVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z4, long j10, boolean z10, TLRPC.TL_error tL_error, org.telegram.ui.web.o0 o0Var) {
        this.e = daVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z4;
        this.c = j10;
        this.d = z10;
        this.n = tL_error;
        this.r = o0Var;
    }
}
