package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c8.ja;
import di.k8;
import di.m5;
import di.m9;
import di.s4;
import di.u4;
import di.v8;
import di.w4;
import di.x4;
import di.y4;
import fi.i9;
import fi.y8;
import fi.z8;
import hi.va;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.y3;
import oi.a3;
import oi.k5;
import oi.n5;
import oi.s5;
import oi.y5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.g4;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z0(int i7, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 8;
        int i10 = 0;
        switch (this.a) {
            case 0:
                DictationLid.c((byte[]) this.c, this.b, (b1) this.d);
                break;
            case 1:
                int i11 = this.b;
                int[] iArr = (int[]) this.c;
                g1 g1Var = (g1) this.d;
                ns f10 = ns.f(i11);
                int length = iArr.length;
                while (i10 < length) {
                    f10.n(g1Var, iArr[i10]);
                    i10++;
                }
                break;
            case 2:
                wp0 wp0Var = (wp0) this.c;
                int i12 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                k8 k8Var = wp0Var.e;
                if (i12 != -1) {
                    int i13 = tL_starGiftCollection.collection_id;
                    int i14 = k8Var.a;
                    int f11 = k8Var.f(i13);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) k8Var.e.remove(f11);
                        k8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = np.s1(i14).j1(k8Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i14).sendRequest(deletestargiftcollection, null);
                    }
                    wp0Var.f(true);
                    v61 v61Var = wp0Var.n;
                    if (i12 < k8Var.d().size()) {
                        i12++;
                    }
                    v61Var.d(-1, i12);
                    wp0Var.o();
                    break;
                }
                break;
            case 3:
                ch.o oVar = (ch.o) this.c;
                p5 p5Var = (p5) this.d;
                int i15 = this.b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(p5Var);
                int spanEnd = text.getSpanEnd(p5Var);
                int i16 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    ch.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i15 - i16, lVar.getText().length()));
                    break;
                }
                break;
            case 4:
                ci.a0.p((org.telegram.ui.ActionBar.e2) this.c, this.b + 1, (ci.y) this.d);
                break;
            case 5:
                y4 y4Var = (y4) this.c;
                int i17 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr2 = y4Var.W;
                u4 u4Var = y4Var.f;
                s4 s4Var = y4Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(y4Var.getContext());
                    fh0 fh0Var = new fh0(y4Var.getContext());
                    fh0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(fh0Var, ja.e(32, 32, 17));
                    fh0Var.setScaleX(0.5f);
                    fh0Var.setScaleY(0.5f);
                    fh0Var.setAlpha(0.0f);
                    fh0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    y4Var.m0 = fh0Var;
                    frameLayout.setBackground(new m5(org.telegram.messenger.g0.L(12.0f), j6.r1(0.075f, -1)));
                    s4Var.a[i17].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    s4Var.f(i17, frameLayout);
                    y4Var.G.a(iArr2[2], iArr2[3]);
                    x4 x4Var = y4Var.b;
                    int[] iArr3 = y4Var.V;
                    x4Var.a(iArr3[2], iArr3[3]);
                    u4Var.a(iArr2[3], iArr2[2]);
                    break;
                } else {
                    w4 w4Var = new w4(y4Var.getContext());
                    w4Var.a(starGift, false);
                    w4Var.setRotation(180.0f);
                    s4Var.f(i17, w4Var);
                    w4Var.setScaleX(0.5f);
                    w4Var.setScaleY(0.5f);
                    w4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = w4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    er erVar = er.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(erVar);
                    interpolator.setUpdateListener(new ah.h(y4Var, 6));
                    interpolator.start();
                    s4Var.a[i17].setVisibility(8);
                    u4Var.setVisibility(0);
                    u4Var.setAlpha(0.0f);
                    u4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(erVar).start();
                    break;
                }
            case 6:
                ((u10) this.d).a(hd.a0(null, null, 2131750046, ki.k.J0(this.b)), (di.p5) this.c, Boolean.FALSE);
                break;
            case 7:
                v8 v8Var = (v8) this.c;
                int i18 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = v8Var.r;
                ArrayList[] arrayListArr = v8Var.q;
                int i19 = v8Var.a;
                v8Var.t[i18] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    np.s1(i19).Y3(starsStatus.users, false);
                    np.s1(i19).S3(starsStatus.chats, false);
                    arrayListArr[i18].addAll(starsStatus.history);
                    zArr[i18] = !arrayListArr[i18].isEmpty() || zArr[i18];
                    boolean[] zArr2 = v8Var.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i18] = z10;
                    v8Var.s[i18] = z10 ? null : starsStatus.next_offset;
                    v8Var.i0(starsStatus.balance);
                    ns.f(i19).k(ns.z3, new Object[0]);
                    break;
                }
                break;
            case 8:
                Context context = (Context) this.c;
                int i20 = this.b;
                vf.c.t(context, "https://" + np.s1(i20).V2 + "/nft/" + ((String) this.d));
                break;
            case 9:
                ((fi.e1) this.c).G.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 10:
                TLObject tLObject2 = (TLObject) this.c;
                int i21 = this.b;
                m9 m9Var = (m9) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i21) {
                            m9Var.a(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                m9Var.a(null);
                break;
            case 11:
                z8 z8Var = (z8) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i22 = this.b;
                i9 i9Var = z8Var.d;
                y8 y8Var = i9Var.o0;
                int i23 = i9Var.h;
                y8Var.B0 = arrayList2;
                y8Var.z0 = i23;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.A0);
                y8Var.setCurrentItem(i22);
                y8Var.D0 = true;
                break;
            case 12:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i24 = this.b;
                h2.o oVar2 = (h2.o) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    h2.q qVar = (h2.q) it.next();
                    if (!qVar.d) {
                        if (i24 != -1) {
                            qVar.b.b(i24);
                        }
                        qVar.c = true;
                        oVar2.invoke(qVar.a);
                    }
                }
                break;
            case 13:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 14:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 15:
                hi.m5 m5Var = (hi.m5) this.c;
                sg.g gVar = (sg.g) this.d;
                int i25 = this.b;
                if (m5Var.y0.getCurrentBrush() instanceof sg.g) {
                    m5Var.M0 = true;
                }
                m5Var.w(gVar);
                tg.h1 h1Var = m5Var.U0;
                int i26 = h1Var.d + 1;
                h1Var.a(i26);
                org.telegram.messenger.g0.Q3(h1Var.a[i26], i25);
                h1Var.e = true;
                break;
            case 16:
                org.telegram.messenger.g0.h3(new v0(this.b, ((vr) this.c).l0(new ArrayList((HashSet) this.d)), i7));
                break;
            case 17:
                ((va) this.c).b((short[]) this.d, this.b);
                break;
            case 18:
                jg.h0 h0Var = (jg.h0) this.c;
                int i27 = this.b;
                String str = (String) this.d;
                int i28 = h0Var.t0;
                h0Var.r = null;
                if (i27 == h0Var.e0) {
                    if (h0Var.n >= 0) {
                        ConnectionsManager.getInstance(i28).cancelRequest(h0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.n = ConnectionsManager.getInstance(i28).sendRequest(tL_channels_searchPosts, new jg.u(h0Var, i27, str, i10));
                    break;
                }
                break;
            case 19:
                kg.y yVar = (kg.y) this.c;
                yVar.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                ns.f(yVar.a).k(ns.J1, new Object[0]);
                break;
            case 20:
                int[] iArr4 = (int[]) this.c;
                int i29 = this.b;
                is[] isVarArr = (is[]) this.d;
                if (iArr4[0] >= 0) {
                    ConnectionsManager.getInstance(i29).cancelRequest(iArr4[0], true);
                    iArr4[0] = -1;
                }
                if (isVarArr[0] != null) {
                    ns.f(i29).n(isVarArr[0], 59);
                    isVarArr[0] = null;
                    break;
                }
                break;
            case 21:
                y3 y3Var = (y3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i30 = this.b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    y3Var.y = tL_webViewResultUrl.query_id;
                    y3Var.n.t(i30, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.h3(y3Var.V);
                    break;
                }
                break;
            case 22:
                l2.c1 c1Var = (l2.c1) this.c;
                Pair pair = (Pair) this.d;
                c1Var.b.h.N(((Integer) pair.first).intValue(), (x2.f0) pair.second, this.b);
                break;
            case 23:
                k5 k5Var = (k5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i31 = this.b;
                n5 m10 = k5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    oi.e1 e1Var = m10.a;
                    e1Var.O();
                    e1Var.setSelection(Math.max(0, Math.min(i31, e1Var.length())));
                    break;
                }
                break;
            case 24:
                s5 s5Var = (s5) this.c;
                oi.a aVar = (oi.a) this.d;
                int i32 = this.b;
                y5 y5Var = s5Var.a;
                if (y5Var.E != null) {
                    y5.e(aVar.b, "");
                    ((a3) y5Var.E).c(aVar, i32);
                    break;
                }
                break;
            case 25:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 26:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 27:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 28:
                int i33 = this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.d;
                String str2 = np.s1(i33).P6;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                vf.c.t(context2, str2);
                u2VarArr[0].dismiss();
                break;
            default:
                g4 g4Var = (g4) this.c;
                String str3 = (String) this.d;
                int i34 = this.b;
                HashMap hashMap = new HashMap(g4Var.v0[0].c.x);
                ArrayList arrayList3 = new ArrayList(g4Var.v0[0].c.y);
                g4Var.X0 = null;
                Utilities.g.c(new f1(g4Var, arrayList3, hashMap, str3, i34, 10));
                break;
        }
    }

    public /* synthetic */ z0(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ z0(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
