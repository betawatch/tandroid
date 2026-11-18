package di;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ TLObject n;
    public final /* synthetic */ Object r;

    public /* synthetic */ r7(x8 x8Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, bi.l8 l8Var) {
        this.e = x8Var;
        this.f = zArr;
        this.h = starGift;
        this.b = z10;
        this.d = z11;
        this.c = j3;
        this.n = tL_textWithEntities;
        this.r = l8Var;
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
                ((x8) obj3).i((TL_stars.StarGift) tLObject2, this.b, this.d, this.c, (TLRPC.TL_textWithEntities) tLObject, (bi.l8) obj);
                break;
            default:
                hi.ta taVar = (hi.ta) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                hi.k kVar = (hi.k) obj;
                fi.b bVar = taVar.a;
                int i13 = taVar.c;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            hi.q8 q8Var = taVar.r0;
                            if (q8Var != null) {
                                new org.telegram.ui.Components.lc(q8Var.c, bVar).g0(tL_error, true);
                                kVar.run();
                                break;
                            }
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, taVar.b, bVar);
                            String M0 = gd.M0(2131748634, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M0;
                            u1Var.U = gd.M0(2131748635, null);
                            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    mp.u1(i13).V3(updates, false);
                    hi.w9 w9Var = taVar.C0;
                    if (w9Var != null) {
                        w9Var.destroy(true, null);
                    }
                    ArrayList A0 = mp.A0(updates, TL_update.TL_updateStoryID.class);
                    int size = A0.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            Object obj4 = A0.get(i14);
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
                    ArrayList A02 = mp.A0(updates, TL_stories.TL_updateStory.class);
                    int size2 = A02.size();
                    int i15 = i7;
                    while (i15 < size2) {
                        Object obj5 = A02.get(i15);
                        i15++;
                        TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                        if (storyItem2 != null && (storyItem2.id == i10 || i10 == -1)) {
                            storyItem = storyItem2;
                            if (storyItem != null) {
                                TLRPC.MessageMedia messageMedia = storyItem.media;
                                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                                    inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                                    if (inputGroupCall != null) {
                                        fi.c1 c1Var = fi.c1.X;
                                        if (c1Var != null) {
                                            c1Var.e();
                                            if (fi.c1.X != null) {
                                                fi.c1.X = null;
                                                ks f10 = ks.f(i13);
                                                Object[] objArr = new Object[1];
                                                objArr[i7] = Long.valueOf(fi.c1.X.g());
                                                f10.k(ks.G2, objArr);
                                            }
                                        }
                                        org.telegram.messenger.g0.h3(new hi.g9(taVar, this.b, storyItem, this.c, inputGroupCall, this.d), 100L);
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

    public /* synthetic */ r7(hi.ta taVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, hi.k kVar) {
        this.e = taVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z10;
        this.c = j3;
        this.d = z11;
        this.n = tL_error;
        this.r = kVar;
    }
}
