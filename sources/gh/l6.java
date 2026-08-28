package gh;

import java.util.ArrayList;
import kh.wb;
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
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ l6(v7 v7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, fh.h6 h6Var) {
        this.e = v7Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.d = z11;
        this.c = j10;
        this.n = tL_textWithEntities;
        this.r = h6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        int i9;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i10 = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i10) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((v7) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (fh.h6) obj);
                break;
            default:
                wb wbVar = (wb) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                kh.f1 f1Var = (kh.f1) obj;
                ih.b bVar = wbVar.a;
                int i11 = wbVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            kh.t9 t9Var = wbVar.m0;
                            if (t9Var != null) {
                                new oc(t9Var.container, bVar).d0(tL_error, true);
                                f1Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.b, 0, bVar);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            c2Var.P = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i11).processUpdates(updates, false);
                    kh.za zaVar = wbVar.x0;
                    if (zaVar != null) {
                        zaVar.destroy(true, null);
                    }
                    ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
                    int size = findUpdates.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            Object obj4 = findUpdates.get(i12);
                            i12++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            c10 = 0;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i9 = tL_updateStoryID.id;
                            }
                        } else {
                            c10 = 0;
                            i9 = -1;
                        }
                    }
                    ArrayList findUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
                    int size2 = findUpdates2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj5 = findUpdates2.get(i13);
                        i13++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i9 || i9 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        ih.f1 f1Var2 = ih.f1.S;
                                        if (f1Var2 != null) {
                                            f1Var2.e();
                                            if (ih.f1.S != null) {
                                                ih.f1.S = null;
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                                                int i14 = NotificationCenter.liveStoryUpdated;
                                                Object[] objArr = new Object[1];
                                                objArr[c10] = Long.valueOf(ih.f1.S.g());
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, objArr);
                                            }
                                        }
                                        AndroidUtilities.runOnUIThread(new kh.ia(wbVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ l6(wb wbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, kh.f1 f1Var) {
        this.e = wbVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.c = j10;
        this.d = z11;
        this.n = tL_error;
        this.r = f1Var;
    }
}
