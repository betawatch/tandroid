package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.a5;
import bi.e4;
import bi.y4;
import c8.ma;
import di.b5;
import di.n8;
import di.p5;
import di.p9;
import di.s5;
import di.v4;
import di.x4;
import di.y8;
import di.z4;
import fi.f9;
import fi.v8;
import fi.w8;
import hi.k5;
import hi.va;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.s3;
import oi.a6;
import oi.d3;
import oi.m5;
import oi.u5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.s10;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c1(int i7, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        int i11 = this.b;
        switch (i7) {
            case 0:
                DictationLid.c((byte[]) obj2, i11, (e1) obj);
                break;
            case 1:
                int[] iArr = (int[]) obj2;
                j1 j1Var = (j1) obj;
                ks f10 = ks.f(i11);
                int length = iArr.length;
                while (i10 < length) {
                    f10.n(j1Var, iArr[i10]);
                    i10++;
                }
                break;
            case 2:
                ((a5) obj2).run();
                org.telegram.messenger.g0.g3(new e4(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749566, y4.k(((org.telegram.ui.Wallet.p0) obj).b), gd.x(i11, true))), i10));
                break;
            case 3:
                gq0 gq0Var = (gq0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                n8 n8Var = gq0Var.e;
                if (i11 != -1) {
                    int i12 = tL_starGiftCollection.collection_id;
                    int i13 = n8Var.a;
                    int f11 = n8Var.f(i12);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) n8Var.e.remove(f11);
                        n8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = mp.u1(i13).l1(n8Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i13).sendRequest(deletestargiftcollection, null);
                    }
                    gq0Var.f(true);
                    i71 i71Var = gq0Var.n;
                    if (i11 < n8Var.d().size()) {
                        i11++;
                    }
                    i71Var.e(-1, i11);
                    gq0Var.o();
                    break;
                }
                break;
            case 4:
                ch.p pVar = (ch.p) obj2;
                y5 y5Var = (y5) obj;
                Editable text = pVar.h.getText();
                int spanStart = text.getSpanStart(y5Var);
                int spanEnd = text.getSpanEnd(y5Var);
                int i14 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    pVar.h.getText().delete(spanStart, spanEnd);
                    ch.m mVar = pVar.h;
                    mVar.setSelection(Math.min(i11 - i14, mVar.getText().length()));
                    break;
                }
                break;
            case 5:
                ci.b0.p((org.telegram.ui.ActionBar.g2) obj2, i11 + 1, (ci.z) obj);
                break;
            case 6:
                b5 b5Var = (b5) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr2 = b5Var.W;
                x4 x4Var = b5Var.f;
                v4 v4Var = b5Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(b5Var.getContext());
                    rh0 rh0Var = new rh0(b5Var.getContext());
                    rh0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(rh0Var, ma.e(32, 32, 17));
                    rh0Var.setScaleX(0.5f);
                    rh0Var.setScaleY(0.5f);
                    rh0Var.setAlpha(0.0f);
                    rh0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    b5Var.m0 = rh0Var;
                    frameLayout.setBackground(new p5(org.telegram.messenger.g0.L(12.0f), m6.r1(0.075f, -1)));
                    v4Var.a[i11].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    v4Var.f(i11, frameLayout);
                    b5Var.G.a(iArr2[2], iArr2[3]);
                    di.a5 a5Var = b5Var.b;
                    int[] iArr3 = b5Var.V;
                    a5Var.a(iArr3[2], iArr3[3]);
                    x4Var.a(iArr2[3], iArr2[2]);
                    break;
                } else {
                    z4 z4Var = new z4(b5Var.getContext());
                    z4Var.a(starGift, false);
                    z4Var.setRotation(180.0f);
                    v4Var.f(i11, z4Var);
                    z4Var.setScaleX(0.5f);
                    z4Var.setScaleY(0.5f);
                    z4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = z4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    nr nrVar = nr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(nrVar);
                    interpolator.setUpdateListener(new ah.g(b5Var, 6));
                    interpolator.start();
                    v4Var.a[i11].setVisibility(8);
                    x4Var.setVisibility(0);
                    x4Var.setAlpha(0.0f);
                    x4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(nrVar).start();
                    break;
                }
            case 7:
                ((s10) obj).a(gd.a0(null, null, 2131750029, ki.j.J0(i11)), (s5) obj2, Boolean.FALSE);
                break;
            case 8:
                y8 y8Var = (y8) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean[] zArr = y8Var.r;
                ArrayList[] arrayListArr = y8Var.q;
                int i15 = y8Var.a;
                y8Var.t[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    mp.u1(i15).f4(starsStatus.users, false);
                    mp.u1(i15).Z3(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    zArr[i11] = !arrayListArr[i11].isEmpty() || zArr[i11];
                    boolean[] zArr2 = y8Var.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i11] = z10;
                    y8Var.s[i11] = z10 ? null : starsStatus.next_offset;
                    y8Var.i0(starsStatus.balance);
                    ks.f(i15).k(ks.B3, new Object[0]);
                    break;
                }
                break;
            case 9:
                vf.c.t((Context) obj2, "https://" + mp.u1(i11).X2 + "/nft/" + ((String) obj));
                break;
            case 10:
                ((fi.c1) obj2).G.put((String) obj, Integer.valueOf(i11));
                break;
            case 11:
                TLObject tLObject2 = (TLObject) obj2;
                p9 p9Var = (p9) obj;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i11) {
                            p9Var.a(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                p9Var.a(null);
                break;
            case 12:
                f9 f9Var = ((w8) obj2).d;
                v8 v8Var = f9Var.o0;
                int i16 = f9Var.h;
                v8Var.B0 = (ArrayList) obj;
                v8Var.z0 = i16;
                v8Var.setAdapter(null);
                v8Var.setAdapter(v8Var.A0);
                v8Var.setCurrentItem(i11);
                v8Var.D0 = true;
                break;
            case 13:
                h2.o oVar = (h2.o) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    h2.q qVar = (h2.q) it.next();
                    if (!qVar.d) {
                        if (i11 != -1) {
                            qVar.b.b(i11);
                        }
                        qVar.c = true;
                        oVar.invoke(qVar.a);
                    }
                }
                break;
            case 14:
                ((FfmpegAudioWaveformLoader) obj2).lambda$new$0((String) obj, i11);
                break;
            case 15:
                ((FfmpegAudioWaveformLoader) obj2).lambda$receiveChunk$1((short[]) obj, i11);
                break;
            case 16:
                k5 k5Var = (k5) obj2;
                sg.g gVar = (sg.g) obj;
                if (k5Var.y0.getCurrentBrush() instanceof sg.g) {
                    k5Var.M0 = true;
                }
                k5Var.w(gVar);
                tg.i1 i1Var = k5Var.U0;
                int i17 = i1Var.d + 1;
                i1Var.a(i17);
                org.telegram.messenger.g0.P3(i1Var.a[i17], i11);
                i1Var.e = true;
                break;
            case 17:
                org.telegram.messenger.g0.g3(new y0(i11, ((tr) obj2).l0(new ArrayList((HashSet) obj)), 11));
                break;
            case 18:
                ((va) obj2).b((short[]) obj, i11);
                break;
            case 19:
                jg.h0 h0Var = (jg.h0) obj2;
                String str = (String) obj;
                int i18 = h0Var.t0;
                h0Var.r = null;
                if (i11 == h0Var.e0) {
                    if (h0Var.n >= 0) {
                        ConnectionsManager.getInstance(i18).cancelRequest(h0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.n = ConnectionsManager.getInstance(i18).sendRequest(tL_channels_searchPosts, new jg.u(h0Var, i11, str, i10));
                    break;
                }
                break;
            case 20:
                kg.z zVar = (kg.z) obj2;
                zVar.b.add(i11, (TL_account.TL_businessChatLink) obj);
                ks.f(zVar.a).k(ks.J1, new Object[0]);
                break;
            case 21:
                int[] iArr4 = (int[]) obj2;
                fs[] fsVarArr = (fs[]) obj;
                if (iArr4[0] >= 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(iArr4[0], true);
                    iArr4[0] = -1;
                }
                if (fsVarArr[0] != null) {
                    ks.f(i11).n(fsVarArr[0], 59);
                    fsVarArr[0] = null;
                    break;
                }
                break;
            case 22:
                s3 s3Var = (s3) obj2;
                TLObject tLObject3 = (TLObject) obj;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    s3Var.y = tL_webViewResultUrl.query_id;
                    s3Var.n.t(i11, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.g3(s3Var.V);
                    break;
                }
                break;
            case 23:
                Pair pair = (Pair) obj;
                ((l2.c1) obj2).b.h.N(((Integer) pair.first).intValue(), (x2.g0) pair.second, i11);
                break;
            case 24:
                oi.p5 m10 = ((m5) obj2).getGrid().m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    oi.f1 f1Var = m10.a;
                    f1Var.O();
                    f1Var.setSelection(Math.max(0, Math.min(i11, f1Var.length())));
                    break;
                }
                break;
            case 25:
                oi.a aVar = (oi.a) obj;
                a6 a6Var = ((u5) obj2).a;
                if (a6Var.E != null) {
                    a6.e(aVar.b, "");
                    ((d3) a6Var.E).c(aVar, i11);
                    break;
                }
                break;
            case 26:
                ((CameraView) obj2).lambda$createCamera$13(i11, (SurfaceTexture) obj);
                break;
            case 27:
                ((NativeInstance) obj2).lambda$onEmitJoinPayload$3(i11, (String) obj);
                break;
            case 28:
                ((VoIPService) obj2).lambda$createGroupInstance$74((String) obj, i11);
                break;
            default:
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                String str2 = mp.u1(i11).R6;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                vf.c.t(context, str2);
                w2VarArr[0].dismiss();
                break;
        }
    }

    public /* synthetic */ c1(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ c1(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
