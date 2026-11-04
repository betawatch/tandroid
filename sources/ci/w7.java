package ci;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ w7(e9 e9Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, ai.n6 n6Var) {
        this.e = e9Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.d = z11;
        this.c = j10;
        this.n = tL_textWithEntities;
        this.r = n6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
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
                ((e9) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (ai.n6) obj);
                break;
            default:
                gi.va vaVar = (gi.va) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                gi.f6 f6Var = (gi.f6) obj;
                ei.b bVar = vaVar.a;
                int i13 = vaVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            gi.t8 t8Var = vaVar.r0;
                            if (t8Var != null) {
                                new org.telegram.ui.Components.fc(t8Var.c, bVar).f0(tL_error, true);
                                f6Var.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vaVar.b, bVar);
                            String M0 = bd.M0(2131748834, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            s1Var.U = bd.M0(2131748835, null);
                            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    hp.s1(i13).O3(updates, false);
                    gi.y9 y9Var = vaVar.C0;
                    if (y9Var != null) {
                        y9Var.destroy(true, null);
                    }
                    ArrayList y02 = hp.y0(updates, TL_update.TL_updateStoryID.class);
                    int size = y02.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            Object obj4 = y02.get(i14);
                            i14++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            i3 = i12;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i10 = tL_updateStoryID.id;
                            } else {
                                i12 = i3;
                            }
                        } else {
                            i3 = i12;
                            i10 = -1;
                        }
                    }
                    ArrayList y03 = hp.y0(updates, TL_stories.TL_updateStory.class);
                    int size2 = y03.size();
                    int i15 = i3;
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
                                        ei.g1 g1Var = ei.g1.X;
                                        if (g1Var != null) {
                                            g1Var.e();
                                            if (ei.g1.X != null) {
                                                ei.g1.X = null;
                                                hs f10 = hs.f(i13);
                                                Object[] objArr = new Object[1];
                                                objArr[i3] = Long.valueOf(ei.g1.X.g());
                                                f10.k(hs.G2, objArr);
                                            }
                                        }
                                        org.telegram.messenger.g0.i3(new gi.i9(vaVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ w7(gi.va vaVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, gi.f6 f6Var) {
        this.e = vaVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.c = j10;
        this.d = z11;
        this.n = tL_error;
        this.r = f6Var;
    }
}
