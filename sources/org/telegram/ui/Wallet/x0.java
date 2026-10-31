package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.hf;
import org.telegram.messenger.hs;
import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.pe1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x0(int i10, q20 q20Var, k0 k0Var) {
        this.a = 1;
        this.b = i10;
        this.c = q20Var;
        this.d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        org.telegram.utils.twidget.w wVar;
        int i10 = 8;
        int i11 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                y0 y0Var = (y0) this.c;
                lc.v vVar = (lc.v) this.d;
                int i12 = this.b;
                z0 z0Var = y0Var.c;
                if (z0Var.c(vVar, i12)) {
                    z0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 1:
                int i13 = this.b;
                q20 q20Var = (q20) this.c;
                k0 k0Var = (k0) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new a3.b(z11 ? 1 : 0), new j(q20Var, k0Var, connectionsManager));
                break;
            case 2:
                Context context = (Context) this.c;
                int i14 = this.b;
                String str = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = vp.r1(i14).I6;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "https://tonviewer.com/";
                    } else if (!str2.endsWith("/")) {
                        str2 = str2.concat("/");
                    }
                    StringBuilder i15 = sc.e.i(str2, "transaction/");
                    i15.append(Uri.encode(str));
                    gf.f.t(context, i15.toString());
                    break;
                }
                break;
            case 3:
                c6 c6Var = (c6) this.c;
                int i16 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (c6Var.f0 == i16) {
                    c6Var.f(bitmapArr);
                    c6Var.a.run();
                    break;
                }
                break;
            case 4:
                k8 k8Var = (k8) this.c;
                int i17 = this.b;
                ra raVar = (ra) this.d;
                int i18 = i17 + 1;
                ArrayList arrayList = k8Var.w;
                if (i18 >= arrayList.size()) {
                    org.telegram.messenger.i0.v1(raVar);
                    break;
                } else {
                    ((ra) arrayList.get(i18)).a.requestFocus();
                    break;
                }
            case 5:
                ja jaVar = (ja) this.c;
                int i19 = this.b;
                ra raVar2 = (ra) this.d;
                int i20 = i19 + 1;
                ArrayList arrayList2 = jaVar.d;
                if (i20 >= arrayList2.size()) {
                    org.telegram.messenger.i0.v1(raVar2);
                    break;
                } else {
                    ((ra) arrayList2.get(i20)).a.requestFocus();
                    break;
                }
            case 6:
                pe1 pe1Var = (pe1) this.c;
                int i21 = this.b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = pe1Var.e;
                WallpapersListActivity wallpapersListActivity = pe1Var.E;
                ArrayList arrayList3 = pe1Var.d;
                if (i21 == pe1Var.w) {
                    pe1Var.s = 0;
                    int size = arrayList3.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        pe1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i22);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                hf hfVar = new hf();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                                    z10 = z11;
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(botInlineResult.photo.sizes, zs.r5, false, null, false);
                                    if (w9 != null) {
                                        hfVar.E = w9.w;
                                        hfVar.F = w9.h;
                                        hfVar.L = w9;
                                        hfVar.K = botInlineResult.photo;
                                        hfVar.G = w9.size;
                                        hfVar.M = w10;
                                        hfVar.B = botInlineResult.id;
                                        hfVar.H = 0;
                                        arrayList3.add(hfVar);
                                        hashMap.put(hfVar.B, hfVar);
                                    }
                                } else {
                                    z10 = z11;
                                    if (botInlineResult.content != null) {
                                        int i23 = 0;
                                        while (true) {
                                            if (i23 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i23);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    hfVar.E = documentAttribute.w;
                                                    hfVar.F = documentAttribute.h;
                                                } else {
                                                    i23++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            hfVar.D = webDocument.url;
                                        } else {
                                            hfVar.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        hfVar.C = webDocument2.url;
                                        hfVar.G = webDocument2.size;
                                        hfVar.B = botInlineResult.id;
                                        hfVar.H = 0;
                                        arrayList3.add(hfVar);
                                        hashMap.put(hfVar.B, hfVar);
                                    }
                                }
                            } else {
                                z10 = z11;
                            }
                            i22++;
                            z11 = z10;
                        }
                        pe1Var.f = (size == arrayList3.size() || pe1Var.r == null) ? z11 : false;
                    }
                    if (size != arrayList3.size()) {
                        int i24 = size % wallpapersListActivity.N;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r3);
                        if (i24 != 0) {
                            pe1Var.g(((int) Math.ceil(f7 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.H.o(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    break;
                }
                break;
            case 7:
                org.telegram.utils.twidget.k0 k0Var2 = (org.telegram.utils.twidget.k0) this.c;
                int i25 = this.b;
                String str3 = (String) this.d;
                if (!k0Var2.u && (wVar = k0Var2.J) != null) {
                    if (i25 == 13) {
                        if (wVar.e != null && !TextUtils.isEmpty(str3)) {
                            org.telegram.messenger.i0.g(str3);
                            org.telegram.ui.ActionBar.k2 T = org.telegram.messenger.i0.H3() ? LaunchActivity.T() : null;
                            if (T != null) {
                                if (str3.length() > 80) {
                                    str3 = str3.substring(0, 80) + "…";
                                }
                                cc.a0(T).Q(R.raw.copy, 36, cd.a0(null, null, 2131742891, str3)).j();
                                break;
                            }
                        }
                    } else if (i25 == 14) {
                        boolean equals = "1".equals(str3);
                        if (wVar.A != equals) {
                            wVar.A = equals;
                            t7.u uVar = wVar.e;
                            if (uVar != null) {
                                uVar.getClass();
                                org.telegram.utils.twidget.p.C();
                                break;
                            }
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            if (i25 != 19) {
                                org.telegram.utils.twidget.w wVar2 = k0Var2.J;
                                long j10 = jSONObject.getLong("id");
                                String string = jSONObject.getString("data");
                                boolean optBoolean = jSONObject.optBoolean("wallet");
                                t7.u uVar2 = wVar2.e;
                                if (uVar2 == null) {
                                    wVar2.a(3, null, j10);
                                    break;
                                } else {
                                    uVar2.getClass();
                                    org.telegram.utils.twidget.m h = org.telegram.utils.twidget.p.h(wVar2);
                                    if (h != null && h.i && (!optBoolean || org.telegram.utils.twidget.p.D(h))) {
                                        TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                                        tL_widgetQueryTypeData.with_wallet = optBoolean;
                                        org.telegram.utils.twidget.p.u(h, wVar2, j10, tL_widgetQueryTypeData, string.getBytes(StandardCharsets.UTF_8));
                                        break;
                                    } else {
                                        wVar2.a(3, null, j10);
                                        break;
                                    }
                                }
                            } else {
                                k0Var2.J.i(jSONObject.getLong("id"), jSONObject.getJSONObject("call"));
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 8:
                vq0 vq0Var = (vq0) this.c;
                int i26 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                rh.u5 u5Var = vq0Var.e;
                if (i26 != -1) {
                    int i27 = tL_starGiftCollection.collection_id;
                    int i28 = u5Var.a;
                    int f10 = u5Var.f(i27);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) u5Var.e.remove(f10);
                        u5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = vp.r1(i28).i1(u5Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i28).sendRequest(deletestargiftcollection, null);
                    }
                    vq0Var.f(true);
                    v71 v71Var = vq0Var.n;
                    if (i26 < u5Var.d().size()) {
                        i26++;
                    }
                    v71Var.d(-1, i26);
                    vq0Var.o();
                    break;
                }
                break;
            case 9:
                qh.y.p((org.telegram.ui.ActionBar.k2) this.c, this.b + 1, (qh.w) this.d);
                break;
            case 10:
                ((r4.c) ((p4.t0) this.c).c).r(this.b, this.d);
                break;
            case 11:
                rh.a3 a3Var = (rh.a3) this.c;
                int i29 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = a3Var.V;
                rh.w2 w2Var = a3Var.f;
                rh.u2 u2Var = a3Var.h;
                int i30 = 2;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(a3Var.getContext());
                    ei0 ei0Var = new ei0(a3Var.getContext());
                    ei0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(ei0Var, w7.b6.e(32, 32, 17));
                    ei0Var.setScaleX(0.5f);
                    ei0Var.setScaleY(0.5f);
                    ei0Var.setAlpha(0.0f);
                    ei0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    a3Var.l0 = ei0Var;
                    frameLayout.setBackground(new rh.o3(org.telegram.messenger.i0.L(12.0f), org.telegram.ui.ActionBar.t6.r1(0.075f, -1)));
                    u2Var.a[i29].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    u2Var.f(i29, frameLayout);
                    a3Var.F.a(iArr[2], iArr[3]);
                    rh.z2 z2Var = a3Var.b;
                    int[] iArr2 = a3Var.U;
                    z2Var.a(iArr2[2], iArr2[3]);
                    w2Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    rh.y2 y2Var = new rh.y2(a3Var.getContext());
                    y2Var.a(starGift, false);
                    y2Var.setRotation(180.0f);
                    u2Var.f(i29, y2Var);
                    y2Var.setScaleX(0.5f);
                    y2Var.setScaleY(0.5f);
                    y2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = y2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    gr grVar = gr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(grVar);
                    interpolator.setUpdateListener(new qh.e0(a3Var, i30));
                    interpolator.start();
                    u2Var.a[i29].setVisibility(8);
                    w2Var.setVisibility(0);
                    w2Var.setAlpha(0.0f);
                    w2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(grVar).start();
                    break;
                }
            case 12:
                ((l20) this.d).a(cd.a0(null, null, 2131750055, xh.i.I0(this.b)), (rh.r3) this.c, Boolean.FALSE);
                break;
            case 13:
                rh.e6 e6Var = (rh.e6) this.c;
                int i31 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                boolean[] zArr = e6Var.r;
                ArrayList[] arrayListArr = e6Var.q;
                int i32 = e6Var.a;
                e6Var.t[i31] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    vp.r1(i32).V3(starsStatus.users, false);
                    vp.r1(i32).P3(starsStatus.chats, false);
                    arrayListArr[i31].addAll(starsStatus.history);
                    zArr[i31] = !arrayListArr[i31].isEmpty() || zArr[i31];
                    boolean[] zArr2 = e6Var.u;
                    boolean z12 = (starsStatus.flags & 1) == 0;
                    zArr2[i31] = z12;
                    e6Var.s[i31] = z12 ? null : starsStatus.next_offset;
                    e6Var.i0(starsStatus.balance);
                    zs.f(i32).k(zs.z3, new Object[0]);
                    break;
                }
                break;
            case 14:
                Context context2 = (Context) this.c;
                int i33 = this.b;
                gf.f.r(context2, "https://" + vp.r1(i33).U2 + "/nft/" + ((String) this.d));
                break;
            case 15:
                sg.o oVar = (sg.o) this.c;
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) this.d;
                int i34 = this.b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(o5Var);
                int spanEnd = text.getSpanEnd(o5Var);
                int i35 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    sg.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i34 - i35, lVar.getText().length()));
                    break;
                }
                break;
            case 16:
                ((th.s0) this.c).F.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 17:
                TLObject tLObject3 = (TLObject) this.c;
                int i36 = this.b;
                bi.i6 i6Var = (bi.i6) this.d;
                if (tLObject3 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList4 = ((TL_stories.TL_albums) tLObject3).albums;
                    int size3 = arrayList4.size();
                    while (i11 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList4.get(i11);
                        i11++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i36) {
                            i6Var.a(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                i6Var.a(null);
                break;
            case 18:
                th.f7 f7Var = (th.f7) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                int i37 = this.b;
                th.o7 o7Var = f7Var.d;
                th.e7 e7Var = o7Var.n0;
                int i38 = o7Var.h;
                e7Var.A0 = arrayList5;
                e7Var.y0 = i38;
                e7Var.setAdapter(null);
                e7Var.setAdapter(e7Var.z0);
                e7Var.setCurrentItem(i37);
                e7Var.C0 = true;
                break;
            case 19:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 20:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 21:
                vh.b4 b4Var = (vh.b4) this.c;
                ig.g gVar = (ig.g) this.d;
                int i39 = this.b;
                if (b4Var.x0.getCurrentBrush() instanceof ig.g) {
                    b4Var.L0 = true;
                }
                b4Var.z(gVar);
                jg.y1 y1Var = b4Var.T0;
                int i40 = y1Var.d + 1;
                y1Var.a(i40);
                org.telegram.messenger.i0.Q3(y1Var.a[i40], i39);
                y1Var.e = true;
                break;
            case 22:
                org.telegram.messenger.i0.g3(new org.telegram.utils.twidget.v(this.b, ((hs) this.c).l0(new ArrayList((HashSet) this.d)), i10));
                break;
            case 23:
                ((vh.s8) this.c).b((short[]) this.d, this.b);
                break;
            case 24:
                int[] iArr3 = (int[]) this.c;
                int i41 = this.b;
                us[] usVarArr = (us[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i41).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (usVarArr[0] != null) {
                    zs.f(i41).n(usVarArr[0], 59);
                    usVarArr[0] = null;
                    break;
                }
                break;
            case 25:
                xh.i3 i3Var = (xh.i3) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i42 = this.b;
                if (tLObject4 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject4;
                    i3Var.y = tL_webViewResultUrl.query_id;
                    i3Var.n.t(i42, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.i0.g3(i3Var.U);
                    break;
                }
                break;
            default:
                zf.z zVar = (zf.z) this.c;
                int i43 = this.b;
                String str4 = (String) this.d;
                int i44 = zVar.s0;
                zVar.r = null;
                if (i43 == zVar.d0) {
                    if (zVar.n >= 0) {
                        ConnectionsManager.getInstance(i44).cancelRequest(zVar.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str4;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.n = ConnectionsManager.getInstance(i44).sendRequest(tL_channels_searchPosts, new mg.w(zVar, i43, str4, 9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ x0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
