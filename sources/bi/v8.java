package bi;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ v8(ea eaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z9, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, zh.p3 p3Var) {
        this.e = eaVar;
        this.f = zArr;
        this.h = starGift;
        this.b = z9;
        this.d = z10;
        this.c = j3;
        this.n = tL_textWithEntities;
        this.r = p3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i11 = this.a;
        Object obj = this.r;
        TLObject tLObject = this.n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i12 = 0;
        switch (i11) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((ea) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (zh.p3) obj);
                break;
            default:
                fi.va vaVar = (fi.va) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                di.f8 f8Var = (di.f8) obj;
                di.b bVar = vaVar.a;
                int i13 = vaVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            fi.s8 s8Var = vaVar.q0;
                            if (s8Var != null) {
                                new org.telegram.ui.Components.gc(s8Var.c, bVar).f0(tL_error, true);
                                f8Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vaVar.b, bVar);
                            String M0 = org.telegram.messenger.id.M0(2131748826, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.id.M0(2131748827, null);
                            jg.g.C(null, 2131747831, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    qp.s1(i13).O3(updates, false);
                    fi.y9 y9Var = vaVar.B0;
                    if (y9Var != null) {
                        y9Var.destroy(true, null);
                    }
                    ArrayList y02 = qp.y0(updates, TL_update.TL_updateStoryID.class);
                    int size = y02.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            Object obj4 = y02.get(i14);
                            i14++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            i7 = i12;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i10 = tL_updateStoryID.id;
                            } else {
                                i12 = i7;
                            }
                        } else {
                            i7 = i12;
                            i10 = -1;
                        }
                    }
                    ArrayList y03 = qp.y0(updates, TL_stories.TL_updateStory.class);
                    int size2 = y03.size();
                    int i15 = i7;
                    while (i15 < size2) {
                        Object obj5 = y03.get(i15);
                        i15++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i10 || i10 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        di.g1 g1Var = di.g1.W;
                                        if (g1Var != null) {
                                            g1Var.e();
                                            if (di.g1.W != null) {
                                                di.g1.W = null;
                                                qs f10 = qs.f(i13);
                                                Object[] objArr = new Object[1];
                                                objArr[i7] = Long.valueOf(di.g1.W.g());
                                                f10.k(qs.G2, objArr);
                                            }
                                        }
                                        org.telegram.messenger.g0.i3(new fi.h9(vaVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ v8(fi.va vaVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z9, long j3, boolean z10, TLRPC.TL_error tL_error, di.f8 f8Var) {
        this.e = vaVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z9;
        this.c = j3;
        this.d = z10;
        this.n = tL_error;
        this.r = f8Var;
    }
}
