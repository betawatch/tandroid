package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.am;
import org.telegram.ui.jm;
import org.telegram.ui.mh;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s1(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, n2.l] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((d2) this.c).F.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 1:
                TLObject tLObject = (TLObject) this.c;
                int i10 = this.b;
                fi.m0 m0Var = (fi.m0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i11);
                        i11++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i10) {
                            m0Var.run(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                m0Var.run(null);
                break;
            case 2:
                ac acVar = (ac) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i12 = this.b;
                jc jcVar = acVar.d;
                zb zbVar = jcVar.n0;
                int i13 = jcVar.h;
                zbVar.A0 = arrayList2;
                zbVar.y0 = i13;
                zbVar.setAdapter(null);
                zbVar.setAdapter(zbVar.z0);
                zbVar.setCurrentItem(i12);
                zbVar.C0 = true;
                break;
            case 3:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 4:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 5:
                ci.q6 q6Var = (ci.q6) this.c;
                pg.l lVar = (pg.l) this.d;
                int i14 = this.b;
                if (q6Var.O0.getCurrentBrush() instanceof pg.l) {
                    q6Var.c1 = true;
                }
                q6Var.b(lVar);
                qg.s1 s1Var = q6Var.k1;
                int i15 = s1Var.d + 1;
                s1Var.a(i15);
                AndroidUtilities.updateImageViewImageAnimated(s1Var.a[i15], i14);
                s1Var.e = true;
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new o8(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), 5));
                break;
            case 7:
                ((ci.oc) this.c).b((short[]) this.d, this.b);
                break;
            case 8:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i16 = this.b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i16 != -1) {
                            oVar.b.b(i16);
                        }
                        oVar.c = true;
                        mVar.invoke(oVar.a);
                    }
                }
                break;
            case 9:
                int[] iArr = (int[]) this.c;
                int i17 = this.b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i17).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i17).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 10:
                ei.q4 q4Var = (ei.q4) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i18 = this.b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    q4Var.x = tL_webViewResultUrl.query_id;
                    q4Var.n.u(i18, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(q4Var.U);
                    break;
                }
                break;
            case 11:
                gg.i0 i0Var = (gg.i0) this.c;
                int i19 = this.b;
                String str = (String) this.d;
                int i20 = i0Var.s0;
                i0Var.r = null;
                if (i19 == i0Var.d0) {
                    if (i0Var.n >= 0) {
                        ConnectionsManager.getInstance(i20).cancelRequest(i0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.n = ConnectionsManager.getInstance(i20).sendRequest(tL_channels_searchPosts, new gg.u(i0Var, i19, str, 0));
                    break;
                }
                break;
            case 12:
                hg.a0 a0Var = (hg.a0) this.c;
                a0Var.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(a0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 13:
                i2.d1 d1Var = (i2.d1) this.c;
                Pair pair = (Pair) this.d;
                d1Var.b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.b);
                break;
            case 14:
                ii.p5 p5Var = (ii.p5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i21 = this.b;
                ii.s5 m10 = p5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    ii.i1 i1Var = m10.a;
                    i1Var.r();
                    i1Var.setSelection(Math.max(0, Math.min(i21, i1Var.length())));
                    break;
                }
                break;
            case 15:
                ii.y5 y5Var = (ii.y5) this.c;
                ii.a aVar = (ii.a) this.d;
                int i22 = this.b;
                ii.e6 e6Var = y5Var.a;
                if (e6Var.y != null) {
                    ii.e6.f(aVar.b, "");
                    ((ii.f3) e6Var.y).c(aVar, i22);
                    break;
                }
                break;
            case 16:
                n2.k kVar = (n2.k) this.c;
                this.d.a(kVar.a, kVar.b, this.b);
                break;
            case 17:
                ((View) this.d).postOnAnimation(new o8((nh.a) this.c, this.b, 13));
                break;
            case 18:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 19:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 20:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 21:
                int i23 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.d;
                String str2 = MessagesController.getInstance(i23).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                nf.f.s(context, str2);
                e3VarArr[0].dismiss();
                break;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                String str3 = (String) this.d;
                int i24 = this.b;
                HashMap hashMap = new HashMap(i4Var.u0[0].c.w);
                ArrayList arrayList3 = new ArrayList(i4Var.u0[0].c.x);
                i4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ei.l3(i4Var, arrayList3, hashMap, str3, i24, 14));
                break;
            case 23:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.c;
                int i25 = this.b;
                nf.e eVar = (nf.e) this.d;
                if (i4Var2.H0 == i25 && i4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(i4Var2.X).cancelRequest(i4Var2.F0, false);
                    i4Var2.F0 = 0;
                }
                if (i4Var2.M0 == eVar) {
                    i4Var2.M0 = null;
                    break;
                }
                break;
            case 24:
                int i26 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i26).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i26).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 25:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                int i27 = this.b;
                int[] iArr2 = (int[]) this.d;
                g4Var.J = i27;
                g4Var.I = iArr2;
                g4Var.L.f0();
                break;
            case 26:
                String str4 = (String) this.d;
                int i28 = this.b;
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) this.c;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str4).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i28, tL_inputGroupCallSlug, false, null, null);
                e3VarArr2[0].dismiss();
                break;
            case 27:
                ((wn) this.c).Ka((ArrayList) this.d, this.b, false, false);
                break;
            case 28:
                wn wnVar = (wn) this.c;
                int i29 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                wnVar.x0.v0(0, i29, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new mh(0, editTextBoldCursor), 100L);
                break;
            default:
                am amVar = (am) this.c;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.d;
                int i30 = this.b;
                amVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                jm jmVar = amVar.a;
                jmVar.Q.F(i30, messageObject.getId(), messageObject.getDialogId() == jmVar.Q.L6 ? 1 : 0, 0, true, true);
                break;
        }
    }

    public /* synthetic */ s1(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ s1(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ s1(String str, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.a = 26;
        this.d = str;
        this.b = i10;
        this.c = e3VarArr;
    }

    public /* synthetic */ s1(org.telegram.ui.g4 g4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 25;
        this.c = g4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
