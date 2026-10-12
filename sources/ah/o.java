package ah;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import bi.ib;
import bi.jb;
import bi.sb;
import bi.t1;
import di.nc;
import di.o6;
import fi.l3;
import fi.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ji.c6;
import ji.f3;
import ji.i6;
import ji.u5;
import ji.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.voip.d2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.fo;
import org.telegram.ui.i4;
import org.telegram.ui.k4;
import org.telegram.ui.oh;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, n2.l] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.c;
                b6 b6Var = (b6) this.d;
                int i10 = this.b;
                Editable text = a0Var.n.getText();
                int spanStart = text.getSpanStart(b6Var);
                int spanEnd = text.getSpanEnd(b6Var);
                int i11 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    a0Var.n.getText().delete(spanStart, spanEnd);
                    w wVar = a0Var.n;
                    wVar.setSelection(Math.min(i10 - i11, wVar.getText().length()));
                    break;
                }
                break;
            case 1:
                ((t1) this.c).F.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 2:
                TLObject tLObject = (TLObject) this.c;
                int i12 = this.b;
                gi.m0 m0Var = (gi.m0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i13);
                        i13++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i12) {
                            m0Var.run(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                m0Var.run(null);
                break;
            case 3:
                jb jbVar = (jb) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i14 = this.b;
                sb sbVar = jbVar.d;
                ib ibVar = sbVar.n0;
                int i15 = sbVar.h;
                ibVar.A0 = arrayList2;
                ibVar.y0 = i15;
                ibVar.setAdapter(null);
                ibVar.setAdapter(ibVar.z0);
                ibVar.setCurrentItem(i14);
                ibVar.C0 = true;
                break;
            case 4:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 5:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 6:
                o6 o6Var = (o6) this.c;
                qg.l lVar = (qg.l) this.d;
                int i16 = this.b;
                if (o6Var.O0.getCurrentBrush() instanceof qg.l) {
                    o6Var.c1 = true;
                }
                o6Var.o(lVar);
                rg.t1 t1Var = o6Var.k1;
                int i17 = t1Var.d + 1;
                t1Var.a(i17);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.a[i17], i16);
                t1Var.e = true;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new g(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), 6));
                break;
            case 8:
                ((nc) this.c).b((short[]) this.d, this.b);
                break;
            case 9:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i18 = this.b;
                e2.o oVar = (e2.o) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    e2.q qVar = (e2.q) it.next();
                    if (!qVar.d) {
                        if (i18 != -1) {
                            qVar.b.b(i18);
                        }
                        qVar.c = true;
                        oVar.invoke(qVar.a);
                    }
                }
                break;
            case 10:
                int[] iArr = (int[]) this.c;
                int i19 = this.b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i19).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i19).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 11:
                q4 q4Var = (q4) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i20 = this.b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    q4Var.x = tL_webViewResultUrl.query_id;
                    q4Var.n.t(i20, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(q4Var.U);
                    break;
                }
                break;
            case 12:
                hg.h0 h0Var = (hg.h0) this.c;
                int i21 = this.b;
                String str = (String) this.d;
                int i22 = h0Var.s0;
                h0Var.r = null;
                if (i21 == h0Var.d0) {
                    if (h0Var.n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(h0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new hg.u(h0Var, i21, str, 0));
                    break;
                }
                break;
            case 13:
                i2.g1 g1Var = (i2.g1) this.c;
                Pair pair = (Pair) this.d;
                g1Var.b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.b);
                break;
            case 14:
                ig.y yVar = (ig.y) this.c;
                yVar.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 15:
                u5 u5Var = (u5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i23 = this.b;
                x5 m10 = u5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    ji.h1 h1Var = m10.a;
                    h1Var.r();
                    h1Var.setSelection(Math.max(0, Math.min(i23, h1Var.length())));
                    break;
                }
                break;
            case 16:
                c6 c6Var = (c6) this.c;
                ji.a aVar = (ji.a) this.d;
                int i24 = this.b;
                i6 i6Var = c6Var.a;
                if (i6Var.y != null) {
                    i6.f(aVar.b, "");
                    ((f3) i6Var.y).c(aVar, i24);
                    break;
                }
                break;
            case 17:
                n2.k kVar = (n2.k) this.c;
                this.d.a(kVar.a, kVar.b, this.b);
                break;
            case 18:
                ((View) this.d).postOnAnimation(new g((oh.a) this.c, this.b, 14));
                break;
            case 19:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 20:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 21:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 22:
                int i25 = this.b;
                Context context = (Context) this.c;
                e3[] e3VarArr = (e3[]) this.d;
                String str2 = MessagesController.getInstance(i25).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                pf.d.s(context, str2);
                e3VarArr[0].dismiss();
                break;
            case 23:
                k4 k4Var = (k4) this.c;
                String str3 = (String) this.d;
                int i26 = this.b;
                HashMap hashMap = new HashMap(k4Var.u0[0].c.w);
                ArrayList arrayList3 = new ArrayList(k4Var.u0[0].c.x);
                k4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new l3(k4Var, arrayList3, hashMap, str3, i26, 14));
                break;
            case 24:
                k4 k4Var2 = (k4) this.c;
                int i27 = this.b;
                pf.c cVar = (pf.c) this.d;
                if (k4Var2.H0 == i27 && k4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(k4Var2.X).cancelRequest(k4Var2.F0, false);
                    k4Var2.F0 = 0;
                }
                if (k4Var2.M0 == cVar) {
                    k4Var2.M0 = null;
                    break;
                }
                break;
            case 25:
                int i28 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i28).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i28).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 26:
                i4 i4Var = (i4) this.c;
                int i29 = this.b;
                int[] iArr2 = (int[]) this.d;
                i4Var.J = i29;
                i4Var.I = iArr2;
                i4Var.L.f0();
                break;
            case 27:
                String str4 = (String) this.c;
                int i30 = this.b;
                e3[] e3VarArr2 = (e3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str4).getPathSegments().get(r0.getPathSegments().size() - 1);
                d2.g(LaunchActivity.G1, i30, tL_inputGroupCallSlug, false, null, null);
                e3VarArr2[0].dismiss();
                break;
            case 28:
                ((fo) this.c).Oa((ArrayList) this.d, this.b, false, false);
                break;
            default:
                fo foVar = (fo) this.c;
                int i31 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                foVar.x0.v0(0, i31, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new oh(0, editTextBoldCursor), 100L);
                break;
        }
    }

    public /* synthetic */ o(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ o(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ o(i4 i4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 26;
        this.c = i4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
