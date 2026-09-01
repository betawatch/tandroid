package bh;

import a0.h;
import af.f;
import af.g;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c2.z0;
import dg.c1;
import dg.l;
import dg.r1;
import eg.d3;
import eg.m1;
import eg.m2;
import h5.j;
import j3.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k7.c6;
import mh.b4;
import mh.d4;
import mh.e4;
import mh.f4;
import mh.j7;
import mh.s4;
import mh.t7;
import mh.v4;
import mh.y3;
import ng.p;
import ng.s;
import o4.v;
import oh.e1;
import oh.i9;
import oh.y8;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bm;
import org.telegram.ui.ch;
import org.telegram.ui.j4;
import org.telegram.ui.jm;
import org.telegram.ui.l4;
import org.telegram.ui.la0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, o3.m] */
    @Override // java.lang.Runnable
    public final void run() {
        UndoView undoView = null;
        char c3 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((View) this.d).postOnAnimation(new af.b((b) this.c, this.b, c3 == true ? 1 : 0));
                break;
            case 1:
                c1 c1Var = (c1) this.c;
                c1Var.e((r1) this.d, this.b, c1Var.h);
                c1Var.h = null;
                break;
            case 2:
                ((e2.d) ((z0) this.c).c).u(this.b, this.d);
                break;
            case 3:
                eg.c1 c1Var2 = (eg.c1) this.c;
                l lVar = (l) this.d;
                int i11 = this.b;
                if (c1Var2.T0.getCurrentBrush() instanceof l) {
                    c1Var2.h1 = true;
                }
                c1Var2.g(lVar);
                m2 m2Var = c1Var2.q1;
                int i12 = m2Var.d + 1;
                m2Var.a(i12);
                AndroidUtilities.updateImageViewImageAnimated(m2Var.a[i12], i11);
                m2Var.e = true;
                break;
            case 4:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i13 = this.b;
                j jVar = (j) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    h5.l lVar2 = (h5.l) it.next();
                    if (!lVar2.d) {
                        if (i13 != -1) {
                            lVar2.b.b(i13);
                        }
                        lVar2.c = true;
                        jVar.invoke(lVar2.a);
                    }
                }
                break;
            case 5:
                f7.b bVar = (f7.b) this.c;
                Pair pair = (Pair) this.d;
                ((q1) bVar.c).h.c(((Integer) pair.first).intValue(), (v) pair.second, this.b);
                break;
            case 6:
                pr0 pr0Var = (pr0) this.c;
                int i14 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                j7 j7Var = pr0Var.e;
                if (i14 != -1) {
                    int i15 = tL_starGiftCollection.collection_id;
                    int i16 = j7Var.a;
                    int f10 = j7Var.f(i15);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) j7Var.e.remove(f10);
                        j7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i16).getInputPeer(j7Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i16).sendRequest(deletestargiftcollection, null);
                    }
                    pr0Var.f(true);
                    l81 l81Var = pr0Var.n;
                    if (i14 < j7Var.d().size()) {
                        i14++;
                    }
                    l81Var.d(-1, i14);
                    pr0Var.n();
                    break;
                }
                break;
            case 7:
                f4 f4Var = (f4) this.c;
                int i17 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = f4Var.S;
                b4 b4Var = f4Var.f;
                y3 y3Var = f4Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(f4Var.getContext());
                    lj0 lj0Var = new lj0(f4Var.getContext());
                    lj0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(lj0Var, c6.e(32, 32, 17));
                    lj0Var.setScaleX(0.5f);
                    lj0Var.setScaleY(0.5f);
                    lj0Var.setAlpha(0.0f);
                    lj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    f4Var.i0 = lj0Var;
                    frameLayout.setBackground(new s4(AndroidUtilities.dp(12.0f), k6.l1(0.075f, -1)));
                    y3Var.a[i17].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    y3Var.f(i17, frameLayout);
                    f4Var.C.a(iArr[2], iArr[3]);
                    e4 e4Var = f4Var.b;
                    int[] iArr2 = f4Var.R;
                    e4Var.a(iArr2[2], iArr2[3]);
                    b4Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    d4 d4Var = new d4(f4Var.getContext());
                    d4Var.a(starGift, false);
                    d4Var.setRotation(180.0f);
                    y3Var.f(i17, d4Var);
                    d4Var.setScaleX(0.5f);
                    d4Var.setScaleY(0.5f);
                    d4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = d4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    pr prVar = pr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(prVar);
                    interpolator.setUpdateListener(new m1(f4Var, 12));
                    interpolator.start();
                    y3Var.a[i17].setVisibility(8);
                    b4Var.setVisibility(0);
                    b4Var.setAlpha(0.0f);
                    b4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(prVar).start();
                    break;
                }
            case 8:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, sh.j.G0(this.b)), (v4) this.c, Boolean.FALSE);
                break;
            case 9:
                t7 t7Var = (t7) this.c;
                int i18 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = t7Var.r;
                ArrayList[] arrayListArr = t7Var.q;
                int i19 = t7Var.a;
                t7Var.t[i18] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i19).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i19).putChats(starsStatus.chats, false);
                    arrayListArr[i18].addAll(starsStatus.history);
                    zArr[i18] = !arrayListArr[i18].isEmpty() || zArr[i18];
                    boolean[] zArr2 = t7Var.u;
                    boolean z4 = (starsStatus.flags & 1) == 0;
                    zArr2[i18] = z4;
                    t7Var.s[i18] = z4 ? null : starsStatus.next_offset;
                    t7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 10:
                Context context = (Context) this.c;
                int i20 = this.b;
                g.s(context, "https://" + MessagesController.getInstance(i20).linkPrefix + "/nft/" + ((String) this.d));
                break;
            case 11:
                s sVar = (s) this.c;
                u5 u5Var = (u5) this.d;
                int i21 = this.b;
                Editable text = sVar.n.getText();
                int spanStart = text.getSpanStart(u5Var);
                int spanEnd = text.getSpanEnd(u5Var);
                int i22 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.n.getText().delete(spanStart, spanEnd);
                    p pVar = sVar.n;
                    pVar.setSelection(Math.min(i21 - i22, pVar.getText().length()));
                    break;
                }
                break;
            case 12:
                o3.l lVar3 = (o3.l) this.c;
                this.d.c(lVar3.a, lVar3.b, this.b);
                break;
            case 13:
                ((e1) this.c).C.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 14:
                TLObject tLObject2 = (TLObject) this.c;
                int i23 = this.b;
                la0 la0Var = (la0) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i23) {
                            la0Var.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                la0Var.accept(null);
                break;
            case 15:
                z8 z8Var = (z8) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i24 = this.b;
                i9 i9Var = z8Var.d;
                y8 y8Var = i9Var.k0;
                int i25 = i9Var.h;
                y8Var.x0 = arrayList2;
                y8Var.v0 = i25;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.w0);
                y8Var.setCurrentItem(i24);
                y8Var.z0 = true;
                break;
            case 16:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 17:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 18:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 19:
                int i26 = this.b;
                Context context2 = (Context) this.c;
                h3[] h3VarArr = (h3[]) this.d;
                String str = MessagesController.getInstance(i26).freezeAppealUrl;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                g.s(context2, str);
                h3VarArr[0].dismiss();
                break;
            case 20:
                l4 l4Var = (l4) this.c;
                String str2 = (String) this.d;
                int i27 = this.b;
                HashMap hashMap = new HashMap(l4Var.r0[0].c.w);
                ArrayList arrayList3 = new ArrayList(l4Var.r0[0].c.x);
                l4Var.S0 = null;
                Utilities.searchQueue.postRunnable(new d3(l4Var, arrayList3, hashMap, str2, i27));
                break;
            case 21:
                l4 l4Var2 = (l4) this.c;
                int i28 = this.b;
                f fVar = (f) this.d;
                if (l4Var2.E0 == i28 && l4Var2.C0 != 0) {
                    ConnectionsManager.getInstance(l4Var2.U).cancelRequest(l4Var2.C0, false);
                    l4Var2.C0 = 0;
                }
                if (l4Var2.J0 == fVar) {
                    l4Var2.J0 = null;
                    break;
                }
                break;
            case 22:
                int i29 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i29).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i29).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 23:
                j4 j4Var = (j4) this.c;
                int i30 = this.b;
                int[] iArr3 = (int[]) this.d;
                j4Var.G = i30;
                j4Var.F = iArr3;
                j4Var.I.f0();
                break;
            case 24:
                String str3 = (String) this.c;
                int i31 = this.b;
                h3[] h3VarArr2 = (h3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse(str3);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                g2.h(LaunchActivity.D1, i31, tL_inputGroupCallSlug, false, null, null);
                h3VarArr2[0].dismiss();
                break;
            case 25:
                ((xn) this.c).Ka((ArrayList) this.d, this.b, false, false);
                break;
            case 26:
                xn xnVar = (xn) this.c;
                int i32 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                xnVar.u0.v0(0, i32, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ch(i10, editTextBoldCursor), 100L);
                break;
            case 27:
                bm bmVar = (bm) this.c;
                v0 v0Var = (v0) this.d;
                int i33 = this.b;
                bmVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                jm jmVar = bmVar.a;
                jmVar.N.j(i33, messageObject.getId(), true, messageObject.getDialogId() == jmVar.N.I6 ? 1 : 0, true, 0);
                break;
            case 28:
                sn snVar = (sn) this.c;
                int i34 = this.b;
                View view = (View) this.d;
                snVar.S = 0;
                snVar.R = i34;
                if (!(view instanceof o8)) {
                    snVar.r.m(snVar.F0);
                    break;
                } else {
                    snVar.U((o8) view, true);
                    break;
                }
            default:
                bv bvVar = (bv) this.c;
                h hVar = (h) this.d;
                int i35 = this.b;
                p2 p2Var = bvVar.Y0.c;
                if (p2Var instanceof xn) {
                    xn xnVar2 = (xn) p2Var;
                    xnVar2.Q7();
                    undoView = xnVar2.v3;
                } else if (p2Var instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) p2Var).J;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (hVar.m() != 1) {
                        undoView2.k(0L, 53, Integer.valueOf(i35), Integer.valueOf(hVar.m()), null, null);
                        break;
                    } else {
                        undoView2.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i35), 53);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ a(j4 j4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 23;
        this.c = j4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
