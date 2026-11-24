// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class iua implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ iua(jva jvaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, y2a y2aVar) {
        this.e = jvaVar;
        this.f = zArr;
        this.h = starGift;
        this.b = z;
        this.d = z2;
        this.c = j;
        this.n = tL_textWithEntities;
        this.r = y2aVar;
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
                ((jva) obj3).g((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (y2a) obj);
                break;
            default:
                v9b v9bVar = (v9b) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                nsa nsaVar = (nsa) obj;
                r63 r63Var = v9bVar.a;
                int i4 = v9bVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            a8b a8bVar = v9bVar.r0;
                            if (a8bVar != null) {
                                new c41(a8bVar.c, r63Var).g0(tL_error, true);
                                nsaVar.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r63Var, v9bVar.b);
                            String M0 = jb6.M0(2131748583, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            heVar.U = jb6.M0(2131748584, null);
                            b10.t(null, 2131747564, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    oc7.r1(i4).T3(updates, false);
                    a9b a9bVar = v9bVar.C0;
                    if (a9bVar != null) {
                        a9bVar.destroy(true, null);
                    }
                    ArrayList w0 = oc7.w0(updates, TL_update.TL_updateStoryID.class);
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
                    ArrayList w02 = oc7.w0(updates, TL_stories.TL_updateStory.class);
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
                                        s96 s96Var = s96.N;
                                        if (s96Var != null) {
                                            s96Var.h();
                                            if (s96.N != null) {
                                                s96.N = null;
                                                nm7 f = nm7.f(i4);
                                                Object[] objArr = new Object[1];
                                                objArr[i] = Long.valueOf(s96.N.j());
                                                f.k(nm7.G2, objArr);
                                            }
                                        }
                                        gm.d3(new fi3(v9bVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ iua(v9b v9bVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z, long j, boolean z2, TLRPC.TL_error tL_error, nsa nsaVar) {
        this.e = v9bVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.n = tL_error;
        this.r = nsaVar;
    }
}
