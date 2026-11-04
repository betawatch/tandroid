package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ly(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i3 = this.a;
        int i10 = 6;
        int i11 = 3;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ez ezVar = (ez) obj2;
                ezVar.getClass();
                ezVar.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 1:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new xz(filtersSetupActivity, i11));
                    break;
                }
                break;
            case 2:
                FiltersSetupActivity filtersSetupActivity2 = ((c00) obj2).e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(org.telegram.messenger.hs.O2, new Object[0]);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((x30) obj2).Q3;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    if (((org.telegram.ui.Components.voip.r) arrayList2.get(i13)).x != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.r) arrayList2.get(i13)).x);
                    }
                }
                while (i12 < arrayList.size()) {
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i12);
                    if (s3Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, s3Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(s3Var.a, s3Var.b);
                    }
                    i12++;
                }
                break;
            case 4:
                x30 x30Var = (x30) obj2;
                org.telegram.messenger.hs.f(x30Var.l1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                x30Var.dismiss();
                break;
            case 5:
                o4 o4Var = (o4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.z1) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new ly(i10, o4Var, b8.nc.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 6:
                ((x30) ((o4) obj2).b).M2.setNewColors((int[]) obj);
                break;
            case 7:
                g50.a0((g50) obj2, (TLRPC.TL_error) obj);
                break;
            case 8:
                c50 c50Var = (c50) obj2;
                String str = (String) obj;
                d50 d50Var = c50Var.a;
                d50Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                d50Var.c = d50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xy(i11, c50Var, str), 66);
                break;
            case 9:
                TLObject tLObject = (TLObject) obj;
                d50 d50Var2 = ((c50) obj2).a;
                if (tLObject != null) {
                    g50.f0(d50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    g50.f0(d50Var2.h, null);
                    break;
                }
            case 10:
                f50 f50Var = (f50) obj2;
                String str2 = (String) obj;
                f50Var.h = str2;
                g50 g50Var = f50Var.r;
                if (g50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                f50Var.n = g50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new y9(f50Var, str2, str2, 14), 66);
                break;
            case 11:
                org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(16, (u50) obj2, (org.telegram.messenger.s2) obj), 150L);
                break;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.f();
                break;
            case 13:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i14 = 12;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new ly(i14, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) languageSelectActivity2.h.get(i15);
                        if (ycVar.a.toLowerCase().startsWith(str3) || ycVar.b.toLowerCase().startsWith(str3)) {
                            arrayList3.add(ycVar);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i12 < size2) {
                        org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) languageSelectActivity2.f.get(i12);
                        if (ycVar2.a.toLowerCase().startsWith(str3) || ycVar2.b.toLowerCase().startsWith(str3)) {
                            arrayList3.add(ycVar2);
                        }
                        i12++;
                    }
                    org.telegram.messenger.g0.h3(new ly(i14, languageSelectActivity2, arrayList3));
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
                String str4 = LaunchActivity.E1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    org.telegram.messenger.hp.s1(launchActivity.P).Y3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.hp.s1(launchActivity.P).S3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.qr.a0(launchActivity.P).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    wm wmVar = new wm(bundle);
                    wmVar.Ca = resolvedbusinesschatlinks;
                    launchActivity.u0(wmVar, false, true);
                    break;
                } else {
                    launchActivity.F0(org.telegram.ui.Components.t4.M(launchActivity, org.telegram.messenger.bd.M0(2131752716, null), org.telegram.messenger.bd.M0(2131752712, null)));
                    break;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                String str5 = LaunchActivity.E1;
                org.telegram.messenger.hp.s1(launchActivity2.P).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.P);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j10, j10, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 16:
                String str6 = LaunchActivity.E1;
                String M0 = org.telegram.messenger.bd.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.t4.t0((g) obj2, M0, sb2.toString(), null);
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str7 = (String) obj;
                if (!launchActivity3.r0.getFragmentStack().isEmpty()) {
                    launchActivity3.r0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    break;
                }
                break;
            case 18:
                String str8 = LaunchActivity.E1;
                ((LaunchActivity) obj2).k0((TL_account.Password) obj);
                break;
            case 19:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) obj;
                if (!((LaunchActivity) obj2).R && LaunchActivity.I1) {
                    acVar.j();
                    break;
                }
                break;
            case 20:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
                launchActivity4.r0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.s0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.s0.getView().getVisibility() == 0) {
                        launchActivity4.s0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.t0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.t0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 21:
                String str9 = LaunchActivity.E1;
                ((LaunchActivity) obj2).t0((l71) obj);
                break;
            case 22:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                sf.b bVar = (sf.b) obj;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.T0 = null;
                launchActivity5.U0 = null;
                launchActivity5.X0 = null;
                launchActivity5.V0 = null;
                if (bVar != null) {
                    bVar.b();
                    break;
                }
                break;
            case 23:
                sf.b bVar2 = (sf.b) obj2;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj;
                String str10 = LaunchActivity.E1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (s1Var != null) {
                    s1Var.dismiss();
                    break;
                }
                break;
            case 24:
                m90 m90Var = (m90) obj2;
                TLObject tLObject3 = (TLObject) obj;
                m90Var.c();
                if (tLObject3 != null) {
                    m90Var.a.k0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 25:
                ((FiltersSetupActivity) obj).d0(((m90) obj2).a.M());
                break;
            case 26:
                la0 la0Var = (la0) obj2;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.h3(new pp(la0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 27:
                la0 la0Var2 = (la0) obj2;
                la0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                la0Var2.m0(((org.telegram.messenger.kd) obj).f);
                la0Var2.y = false;
                break;
            case 28:
                ((EditText) obj2).removeTextChangedListener((ai.a0) obj);
                break;
            default:
                Runnable runnable2 = (Runnable) obj;
                ib0 ib0Var = ((lb0) obj2).a;
                int i16 = 0;
                while (true) {
                    zq[] zqVarArr = ib0Var.f;
                    if (i16 >= zqVarArr.length) {
                        runnable2.run();
                        ib0Var.e = false;
                        break;
                    } else {
                        zqVarArr[i16].C(0.0f);
                        i16++;
                    }
                }
        }
    }
}
