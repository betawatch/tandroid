package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.b6;
import bi.c6;
import bi.d6;
import bi.ea;
import bi.t6;
import bi.ub;
import bi.w5;
import bi.w6;
import bi.ya;
import bi.z5;
import c8.ha;
import di.f9;
import di.g9;
import di.p9;
import fi.o5;
import hi.c4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import li.a6;
import li.c3;
import li.m5;
import li.p5;
import li.u5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.k2;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.e4;
import org.telegram.ui.g4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(int i7, Object obj, Object obj2, int i10) {
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
                i0.p((f2) this.c, this.b + 1, (f0) this.d);
                break;
            case 1:
                d6 d6Var = (d6) this.c;
                int i11 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = d6Var.V;
                z5 z5Var = d6Var.f;
                w5 w5Var = d6Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(d6Var.getContext());
                    ch0 ch0Var = new ch0(d6Var.getContext());
                    ch0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(ch0Var, ha.e(32, 32, 17));
                    ch0Var.setScaleX(0.5f);
                    ch0Var.setScaleY(0.5f);
                    ch0Var.setAlpha(0.0f);
                    ch0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    d6Var.l0 = ch0Var;
                    frameLayout.setBackground(new t6(org.telegram.messenger.g0.L(12.0f), k6.r1(0.075f, -1)));
                    w5Var.a[i11].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    w5Var.f(i11, frameLayout);
                    d6Var.F.a(iArr[2], iArr[3]);
                    c6 c6Var = d6Var.b;
                    int[] iArr2 = d6Var.U;
                    c6Var.a(iArr2[2], iArr2[3]);
                    z5Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    b6 b6Var = new b6(d6Var.getContext());
                    b6Var.a(starGift, false);
                    b6Var.setRotation(180.0f);
                    w5Var.f(i11, b6Var);
                    b6Var.setScaleX(0.5f);
                    b6Var.setScaleY(0.5f);
                    b6Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = b6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    xq xqVar = xq.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(xqVar);
                    interpolator.setUpdateListener(new ah.h(d6Var, 4));
                    interpolator.start();
                    w5Var.a[i11].setVisibility(8);
                    z5Var.setVisibility(0);
                    z5Var.setAlpha(0.0f);
                    z5Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(xqVar).start();
                    break;
                }
            case 2:
                ((x10) this.d).a(hd.a0(null, null, 2131750045, hi.j.J0(this.b)), (w6) this.c, Boolean.FALSE);
                break;
            case 3:
                ea eaVar = (ea) this.c;
                int i12 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = eaVar.r;
                ArrayList[] arrayListArr = eaVar.q;
                int i13 = eaVar.a;
                eaVar.t[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i13).Y3(starsStatus.users, false);
                    qp.s1(i13).S3(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr[i12] = !arrayListArr[i12].isEmpty() || zArr[i12];
                    boolean[] zArr2 = eaVar.u;
                    boolean z9 = (starsStatus.flags & 1) == 0;
                    zArr2[i12] = z9;
                    eaVar.s[i12] = z9 ? null : starsStatus.next_offset;
                    eaVar.i0(starsStatus.balance);
                    qs.f(i13).k(qs.z3, new Object[0]);
                    break;
                }
                break;
            case 4:
                Context context = (Context) this.c;
                int i14 = this.b;
                vf.c.t(context, "https://" + qp.s1(i14).U2 + "/nft/" + ((String) this.d));
                break;
            case 5:
                ch.o oVar = (ch.o) this.c;
                r5 r5Var = (r5) this.d;
                int i15 = this.b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(r5Var);
                int spanEnd = text.getSpanEnd(r5Var);
                int i16 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    ch.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i15 - i16, lVar.getText().length()));
                    break;
                }
                break;
            case 6:
                ((di.g1) this.c).F.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 7:
                TLObject tLObject2 = (TLObject) this.c;
                int i17 = this.b;
                ya yaVar = (ya) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i17) {
                            yaVar.a(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                yaVar.a(null);
                break;
            case 8:
                g9 g9Var = (g9) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i18 = this.b;
                p9 p9Var = g9Var.d;
                f9 f9Var = p9Var.n0;
                int i19 = p9Var.h;
                f9Var.A0 = arrayList2;
                f9Var.y0 = i19;
                f9Var.setAdapter(null);
                f9Var.setAdapter(f9Var.z0);
                f9Var.setCurrentItem(i18);
                f9Var.C0 = true;
                break;
            case 9:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 10:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 11:
                o5 o5Var = (o5) this.c;
                sg.g gVar = (sg.g) this.d;
                int i20 = this.b;
                if (o5Var.x0.getCurrentBrush() instanceof sg.g) {
                    o5Var.L0 = true;
                }
                o5Var.w(gVar);
                tg.h1 h1Var = o5Var.T0;
                int i21 = h1Var.d + 1;
                h1Var.a(i21);
                org.telegram.messenger.g0.R3(h1Var.a[i21], i20);
                h1Var.e = true;
                break;
            case 12:
                org.telegram.messenger.g0.h3(new bg.m0(this.b, ((yr) this.c).l0(new ArrayList((HashSet) this.d)), i7));
                break;
            case 13:
                ((fi.ya) this.c).b((short[]) this.d, this.b);
                break;
            case 14:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i22 = this.b;
                h2.o oVar2 = (h2.o) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    h2.q qVar = (h2.q) it.next();
                    if (!qVar.d) {
                        if (i22 != -1) {
                            qVar.b.b(i22);
                        }
                        qVar.c = true;
                        oVar2.invoke(qVar.a);
                    }
                }
                break;
            case 15:
                int[] iArr3 = (int[]) this.c;
                int i23 = this.b;
                ls[] lsVarArr = (ls[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i23).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (lsVarArr[0] != null) {
                    qs.f(i23).n(lsVarArr[0], 59);
                    lsVarArr[0] = null;
                    break;
                }
                break;
            case 16:
                c4 c4Var = (c4) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i24 = this.b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    c4Var.y = tL_webViewResultUrl.query_id;
                    c4Var.n.t(i24, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.h3(c4Var.U);
                    break;
                }
                break;
            case 17:
                jg.h0 h0Var = (jg.h0) this.c;
                int i25 = this.b;
                String str = (String) this.d;
                int i26 = h0Var.s0;
                h0Var.r = null;
                if (i25 == h0Var.d0) {
                    if (h0Var.n >= 0) {
                        ConnectionsManager.getInstance(i26).cancelRequest(h0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.n = ConnectionsManager.getInstance(i26).sendRequest(tL_channels_searchPosts, new jg.v(h0Var, i25, str, i10));
                    break;
                }
                break;
            case 18:
                kg.y yVar = (kg.y) this.c;
                yVar.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                qs.f(yVar.a).k(qs.J1, new Object[0]);
                break;
            case 19:
                l2.g1 g1Var = (l2.g1) this.c;
                Pair pair = (Pair) this.d;
                g1Var.b.h.N(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.b);
                break;
            case 20:
                m5 m5Var = (m5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i27 = this.b;
                p5 m10 = m5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    li.g1 g1Var2 = m10.a;
                    g1Var2.N();
                    g1Var2.setSelection(Math.max(0, Math.min(i27, g1Var2.length())));
                    break;
                }
                break;
            case 21:
                u5 u5Var = (u5) this.c;
                li.a aVar = (li.a) this.d;
                int i28 = this.b;
                a6 a6Var = u5Var.a;
                if (a6Var.D != null) {
                    a6.e(aVar.b, "");
                    ((c3) a6Var.D).c(aVar, i28);
                    break;
                }
                break;
            case 22:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 23:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 24:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 25:
                int i29 = this.b;
                Context context2 = (Context) this.c;
                v2[] v2VarArr = (v2[]) this.d;
                String str2 = qp.s1(i29).O6;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                vf.c.t(context2, str2);
                v2VarArr[0].dismiss();
                break;
            case 26:
                g4 g4Var = (g4) this.c;
                String str3 = (String) this.d;
                int i30 = this.b;
                HashMap hashMap = new HashMap(g4Var.u0[0].c.x);
                ArrayList arrayList3 = new ArrayList(g4Var.u0[0].c.y);
                g4Var.W0 = null;
                Utilities.g.c(new ub(g4Var, arrayList3, hashMap, str3, i30, 8));
                break;
            case 27:
                g4 g4Var2 = (g4) this.c;
                int i31 = this.b;
                vf.b bVar = (vf.b) this.d;
                if (g4Var2.I0 == i31 && g4Var2.G0 != 0) {
                    ConnectionsManager.getInstance(g4Var2.X).cancelRequest(g4Var2.G0, false);
                    g4Var2.G0 = 0;
                }
                if (g4Var2.N0 == bVar) {
                    g4Var2.N0 = null;
                    break;
                }
                break;
            case 28:
                int i32 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                qp.s1(i32).Y3(tL_chatInviteJoinResultWebView.users, false);
                k2.b(i32).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                e4 e4Var = (e4) this.c;
                int i33 = this.b;
                int[] iArr4 = (int[]) this.d;
                e4Var.K = i33;
                e4Var.J = iArr4;
                e4Var.M.d0();
                break;
        }
    }

    public /* synthetic */ e0(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ e0(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }

    public /* synthetic */ e0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.a = 29;
        this.c = e4Var;
        this.b = i7;
        this.d = iArr2;
    }
}
