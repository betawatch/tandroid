// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kwa implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ kwa(jxa jxaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, p4a p4aVar) {
        this.e = jxaVar;
        this.f = zArr;
        this.h = starGift;
        this.b = z;
        this.d = z2;
        this.c = j;
        this.n = tL_textWithEntities;
        this.r = p4aVar;
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
                ((jxa) obj3).g((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (p4a) obj);
                break;
            default:
                rbb rbbVar = (rbb) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                s8b s8bVar = (s8b) obj;
                x53 x53Var = rbbVar.a;
                int i4 = rbbVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            w9b w9bVar = rbbVar.r0;
                            if (w9bVar != null) {
                                new d31(w9bVar.c, x53Var).g0(tL_error, true);
                                s8bVar.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, x53Var, rbbVar.b);
                            String M0 = ob6.M0(2131748580, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            idVar.U = ob6.M0(2131748581, null);
                            c00.u(null, 2131747558, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    uc7.s1(i4).Y3(updates, false);
                    wab wabVar = rbbVar.C0;
                    if (wabVar != null) {
                        wabVar.destroy(true, null);
                    }
                    ArrayList y0 = uc7.y0(updates, TL_update.TL_updateStoryID.class);
                    int size = y0.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            Object obj4 = y0.get(i5);
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
                    ArrayList y02 = uc7.y0(updates, TL_stories.TL_updateStory.class);
                    int size2 = y02.size();
                    int i6 = i;
                    while (i6 < size2) {
                        Object obj5 = y02.get(i6);
                        i6++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i2 || i2 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        w96 w96Var = w96.N;
                                        if (w96Var != null) {
                                            w96Var.h();
                                            if (w96.N != null) {
                                                w96.N = null;
                                                jn7 f = jn7.f(i4);
                                                Object[] objArr = new Object[1];
                                                objArr[i] = Long.valueOf(w96.N.j());
                                                f.k(jn7.G2, objArr);
                                            }
                                        }
                                        hl.d3(new nh3(rbbVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ kwa(rbb rbbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z, long j, boolean z2, TLRPC.TL_error tL_error, s8b s8bVar) {
        this.e = rbbVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.n = tL_error;
        this.r = s8bVar;
    }
}
