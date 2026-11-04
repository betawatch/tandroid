package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import b8.mf;
import ci.e9;
import ci.s8;
import ci.w9;
import ei.g9;
import ei.i9;
import ei.r9;
import gi.ya;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.p10;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e3(int i3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 8;
        int i10 = 0;
        switch (this.a) {
            case 0:
                vp0 vp0Var = (vp0) this.c;
                int i11 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                s8 s8Var = vp0Var.e;
                if (i11 != -1) {
                    int i12 = tL_starGiftCollection.collection_id;
                    int i13 = s8Var.a;
                    int f10 = s8Var.f(i12);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) s8Var.e.remove(f10);
                        s8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = hp.s1(i13).j1(s8Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i13).sendRequest(deletestargiftcollection, null);
                    }
                    vp0Var.f(true);
                    m61 m61Var = vp0Var.n;
                    if (i11 < s8Var.d().size()) {
                        i11++;
                    }
                    m61Var.d(-1, i11);
                    vp0Var.o();
                    break;
                }
                break;
            case 1:
                bi.a0.p((org.telegram.ui.ActionBar.d2) this.c, this.b + 1, (bi.y) this.d);
                break;
            case 2:
                ci.h5 h5Var = (ci.h5) this.c;
                int i14 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = h5Var.W;
                ci.d5 d5Var = h5Var.f;
                ci.b5 b5Var = h5Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(h5Var.getContext());
                    fh0 fh0Var = new fh0(h5Var.getContext());
                    fh0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(fh0Var, mf.e(32, 32, 17));
                    fh0Var.setScaleX(0.5f);
                    fh0Var.setScaleY(0.5f);
                    fh0Var.setAlpha(0.0f);
                    fh0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    h5Var.m0 = fh0Var;
                    frameLayout.setBackground(new ci.v5(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.r1(0.075f, -1)));
                    b5Var.a[i14].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    b5Var.f(i14, frameLayout);
                    h5Var.G.a(iArr[2], iArr[3]);
                    ci.g5 g5Var = h5Var.b;
                    int[] iArr2 = h5Var.V;
                    g5Var.a(iArr2[2], iArr2[3]);
                    d5Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    ci.f5 f5Var = new ci.f5(h5Var.getContext());
                    f5Var.a(starGift, false);
                    f5Var.setRotation(180.0f);
                    b5Var.f(i14, f5Var);
                    f5Var.setScaleX(0.5f);
                    f5Var.setScaleY(0.5f);
                    f5Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = f5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    xq xqVar = xq.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(xqVar);
                    interpolator.setUpdateListener(new bh.f(h5Var, 4));
                    interpolator.start();
                    b5Var.a[i14].setVisibility(8);
                    d5Var.setVisibility(0);
                    d5Var.setAlpha(0.0f);
                    d5Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(xqVar).start();
                    break;
                }
            case 3:
                ((p10) this.d).a(bd.a0(null, null, 2131750054, ii.k.J0(this.b)), (ci.y5) this.c, Boolean.FALSE);
                break;
            case 4:
                e9 e9Var = (e9) this.c;
                int i15 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = e9Var.r;
                ArrayList[] arrayListArr = e9Var.q;
                int i16 = e9Var.a;
                e9Var.t[i15] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    hp.s1(i16).Y3(starsStatus.users, false);
                    hp.s1(i16).S3(starsStatus.chats, false);
                    arrayListArr[i15].addAll(starsStatus.history);
                    zArr[i15] = !arrayListArr[i15].isEmpty() || zArr[i15];
                    boolean[] zArr2 = e9Var.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i15] = z10;
                    e9Var.s[i15] = z10 ? null : starsStatus.next_offset;
                    e9Var.i0(starsStatus.balance);
                    hs.f(i16).k(hs.z3, new Object[0]);
                    break;
                }
                break;
            case 5:
                Context context = (Context) this.c;
                int i17 = this.b;
                sf.c.t(context, "https://" + hp.s1(i17).V2 + "/nft/" + ((String) this.d));
                break;
            case 6:
                dh.o oVar = (dh.o) this.c;
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) this.d;
                int i18 = this.b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(p5Var);
                int spanEnd = text.getSpanEnd(p5Var);
                int i19 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    dh.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i18 - i19, lVar.getText().length()));
                    break;
                }
                break;
            case 7:
                ((ei.g1) this.c).G.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 8:
                TLObject tLObject2 = (TLObject) this.c;
                int i20 = this.b;
                w9 w9Var = (w9) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i20) {
                            w9Var.a(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                w9Var.a(null);
                break;
            case 9:
                i9 i9Var = (i9) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i21 = this.b;
                r9 r9Var = i9Var.d;
                g9 g9Var = r9Var.o0;
                int i22 = r9Var.h;
                g9Var.B0 = arrayList2;
                g9Var.z0 = i22;
                g9Var.setAdapter(null);
                g9Var.setAdapter(g9Var.A0);
                g9Var.setCurrentItem(i21);
                g9Var.D0 = true;
                break;
            case 10:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i23 = this.b;
                g2.p pVar = (g2.p) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    g2.r rVar = (g2.r) it.next();
                    if (!rVar.d) {
                        if (i23 != -1) {
                            rVar.b.b(i23);
                        }
                        rVar.c = true;
                        pVar.invoke(rVar.a);
                    }
                }
                break;
            case 11:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 12:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 13:
                gi.m5 m5Var = (gi.m5) this.c;
                tg.g gVar = (tg.g) this.d;
                int i24 = this.b;
                if (m5Var.y0.getCurrentBrush() instanceof tg.g) {
                    m5Var.M0 = true;
                }
                m5Var.C(gVar);
                ug.g1 g1Var = m5Var.U0;
                int i25 = g1Var.d + 1;
                g1Var.a(i25);
                org.telegram.messenger.g0.R3(g1Var.a[i25], i24);
                g1Var.e = true;
                break;
            case 14:
                org.telegram.messenger.g0.h3(new cg.l0(this.b, ((qr) this.c).l0(new ArrayList((HashSet) this.d)), i3));
                break;
            case 15:
                ((ya) this.c).b((short[]) this.d, this.b);
                break;
            case 16:
                int[] iArr3 = (int[]) this.c;
                int i26 = this.b;
                cs[] csVarArr = (cs[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i26).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (csVarArr[0] != null) {
                    hs.f(i26).n(csVarArr[0], 59);
                    csVarArr[0] = null;
                    break;
                }
                break;
            case 17:
                ii.d4 d4Var = (ii.d4) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i27 = this.b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    d4Var.y = tL_webViewResultUrl.query_id;
                    d4Var.n.t(i27, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.h3(d4Var.V);
                    break;
                }
                break;
            case 18:
                k2.f1 f1Var = (k2.f1) this.c;
                Pair pair = (Pair) this.d;
                f1Var.b.h.M(((Integer) pair.first).intValue(), (w2.g0) pair.second, this.b);
                break;
            case 19:
                kg.e0 e0Var = (kg.e0) this.c;
                int i28 = this.b;
                String str = (String) this.d;
                int i29 = e0Var.t0;
                e0Var.r = null;
                if (i28 == e0Var.e0) {
                    if (e0Var.n >= 0) {
                        ConnectionsManager.getInstance(i29).cancelRequest(e0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    e0Var.n = ConnectionsManager.getInstance(i29).sendRequest(tL_channels_searchPosts, new kg.t(e0Var, i28, str, i10));
                    break;
                }
                break;
            case 20:
                lg.z zVar = (lg.z) this.c;
                zVar.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                hs.f(zVar.a).k(hs.J1, new Object[0]);
                break;
            case 21:
                mi.n5 n5Var = (mi.n5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i30 = this.b;
                mi.q5 m10 = n5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    mi.h1 h1Var = m10.a;
                    h1Var.N();
                    h1Var.setSelection(Math.max(0, Math.min(i30, h1Var.length())));
                    break;
                }
                break;
            case 22:
                mi.v5 v5Var = (mi.v5) this.c;
                mi.a aVar = (mi.a) this.d;
                int i31 = this.b;
                mi.b6 b6Var = v5Var.a;
                if (b6Var.E != null) {
                    mi.b6.e(aVar.b, "");
                    ((mi.d3) b6Var.E).c(aVar, i31);
                    break;
                }
                break;
            case 23:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 24:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 25:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 26:
                int i32 = this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.d;
                String str2 = hp.s1(i32).O6;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                sf.c.t(context2, str2);
                t2VarArr[0].dismiss();
                break;
            case 27:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                String str3 = (String) this.d;
                int i33 = this.b;
                HashMap hashMap = new HashMap(i4Var.v0[0].c.x);
                ArrayList arrayList3 = new ArrayList(i4Var.v0[0].c.y);
                i4Var.X0 = null;
                Utilities.g.c(new p1(i4Var, arrayList3, hashMap, str3, i33, 10));
                break;
            case 28:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.c;
                int i34 = this.b;
                sf.b bVar = (sf.b) this.d;
                if (i4Var2.J0 == i34 && i4Var2.H0 != 0) {
                    ConnectionsManager.getInstance(i4Var2.Y).cancelRequest(i4Var2.H0, false);
                    i4Var2.H0 = 0;
                }
                if (i4Var2.O0 == bVar) {
                    i4Var2.O0 = null;
                    break;
                }
                break;
            default:
                int i35 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                hp.s1(i35).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(i35).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
        }
    }

    public /* synthetic */ e3(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    public /* synthetic */ e3(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
    }
}
