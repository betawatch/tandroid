// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gsa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ gsa(gta gtaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, w0a w0aVar) {
        this.e = gtaVar;
        this.f = zArr;
        this.h = starGift;
        this.b = z;
        this.d = z2;
        this.c = j;
        this.n = tL_textWithEntities;
        this.r = w0aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        byte b = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i3 = 0;
        switch (b) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((gta) obj3).g((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (w0a) obj);
                break;
            default:
                t7b t7bVar = (t7b) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                kya kyaVar = (kya) obj;
                f53 f53Var = t7bVar.a;
                int i4 = t7bVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            y5b y5bVar = t7bVar.r0;
                            if (y5bVar != null) {
                                new u21(y5bVar.c, f53Var).g0(tL_error, true);
                                kyaVar.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f53Var, t7bVar.b);
                            String M0 = k96.M0(2131748634, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131748635, null);
                            b00.t(null, 2131747638, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    na7.q1(i4).Q3(updates, false);
                    y6b y6bVar = t7bVar.C0;
                    if (y6bVar != null) {
                        y6bVar.destroy(true, null);
                    }
                    ArrayList w0 = na7.w0(updates, TL_update.TL_updateStoryID.class);
                    int size = w0.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            Object obj4 = w0.get(i5);
                            i5++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            i = i3;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i2 = tL_updateStoryID.id;
                            } else {
                                i3 = i;
                            }
                        } else {
                            i = i3;
                            i2 = -1;
                        }
                    }
                    ArrayList w02 = na7.w0(updates, TL_stories.TL_updateStory.class);
                    int size2 = w02.size();
                    int i6 = i;
                    while (i6 < size2) {
                        Object obj5 = w02.get(i6);
                        i6++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i2 || i2 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        t76 t76Var = t76.N;
                                        if (t76Var != null) {
                                            t76Var.h();
                                            if (t76.N != null) {
                                                t76.N = null;
                                                kk7 f = kk7.f(i4);
                                                Object[] objArr = new Object[1];
                                                objArr[i] = Long.valueOf(t76.N.j());
                                                f.k(kk7.F2, objArr);
                                            }
                                        }
                                        gl.e3(new tg3(t7bVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ gsa(t7b t7bVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z, long j, boolean z2, TLRPC.TL_error tL_error, kya kyaVar) {
        this.e = t7bVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.n = tL_error;
        this.r = kyaVar;
    }
}
