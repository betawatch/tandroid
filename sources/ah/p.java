package ah;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import bi.fb;
import bi.gb;
import bi.pb;
import bi.t1;
import di.q6;
import di.sc;
import fi.l3;
import fi.r4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ji.a6;
import ji.d3;
import ji.g6;
import ji.s5;
import ji.v5;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.voip.d2;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.co;
import org.telegram.ui.g4;
import org.telegram.ui.i4;
import org.telegram.ui.kh;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.c;
                z5 z5Var = (z5) this.d;
                int i10 = this.b;
                Editable text = b0Var.n.getText();
                int spanStart = text.getSpanStart(z5Var);
                int spanEnd = text.getSpanEnd(z5Var);
                int i11 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    b0Var.n.getText().delete(spanStart, spanEnd);
                    x xVar = b0Var.n;
                    xVar.setSelection(Math.min(i10 - i11, xVar.getText().length()));
                    break;
                }
                break;
            case 1:
                ((t1) this.c).F.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 2:
                TLObject tLObject = (TLObject) this.c;
                int i12 = this.b;
                ua0 ua0Var = (ua0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i13);
                        i13++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i12) {
                            ua0Var.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                ua0Var.accept(null);
                break;
            case 3:
                gb gbVar = (gb) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i14 = this.b;
                pb pbVar = gbVar.d;
                fb fbVar = pbVar.n0;
                int i15 = pbVar.h;
                fbVar.A0 = arrayList2;
                fbVar.y0 = i15;
                fbVar.setAdapter(null);
                fbVar.setAdapter(fbVar.z0);
                fbVar.setCurrentItem(i14);
                fbVar.C0 = true;
                break;
            case 4:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 5:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 6:
                q6 q6Var = (q6) this.c;
                qg.l lVar = (qg.l) this.d;
                int i16 = this.b;
                if (q6Var.O0.getCurrentBrush() instanceof qg.l) {
                    q6Var.c1 = true;
                }
                q6Var.o(lVar);
                rg.t1 t1Var = q6Var.k1;
                int i17 = t1Var.d + 1;
                t1Var.a(i17);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.a[i17], i16);
                t1Var.e = true;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new g(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), 6));
                break;
            case 8:
                ((sc) this.c).b((short[]) this.d, this.b);
                break;
            case 9:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i18 = this.b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i18 != -1) {
                            oVar.b.b(i18);
                        }
                        oVar.c = true;
                        mVar.invoke(oVar.a);
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
                r4 r4Var = (r4) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i20 = this.b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    r4Var.x = tL_webViewResultUrl.query_id;
                    r4Var.n.u(i20, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(r4Var.U);
                    break;
                }
                break;
            case 12:
                hg.i0 i0Var = (hg.i0) this.c;
                int i21 = this.b;
                String str = (String) this.d;
                int i22 = i0Var.s0;
                i0Var.r = null;
                if (i21 == i0Var.d0) {
                    if (i0Var.n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(i0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new hg.u(i0Var, i21, str, 0));
                    break;
                }
                break;
            case 13:
                i2.c1 c1Var = (i2.c1) this.c;
                Pair pair = (Pair) this.d;
                c1Var.b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.b);
                break;
            case 14:
                ig.y yVar = (ig.y) this.c;
                yVar.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 15:
                s5 s5Var = (s5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i23 = this.b;
                v5 m10 = s5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    ji.h1 h1Var = m10.a;
                    h1Var.r();
                    h1Var.setSelection(Math.max(0, Math.min(i23, h1Var.length())));
                    break;
                }
                break;
            case 16:
                a6 a6Var = (a6) this.c;
                ji.a aVar = (ji.a) this.d;
                int i24 = this.b;
                g6 g6Var = a6Var.a;
                if (g6Var.y != null) {
                    g6.f(aVar.b, "");
                    ((d3) g6Var.y).c(aVar, i24);
                    break;
                }
                break;
            case 17:
                n2.j jVar = (n2.j) this.c;
                this.d.a(jVar.a, jVar.b, this.b);
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
                f3[] f3VarArr = (f3[]) this.d;
                String str2 = MessagesController.getInstance(i25).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                of.f.s(context, str2);
                f3VarArr[0].dismiss();
                break;
            case 23:
                i4 i4Var = (i4) this.c;
                String str3 = (String) this.d;
                int i26 = this.b;
                HashMap hashMap = new HashMap(i4Var.u0[0].c.w);
                ArrayList arrayList3 = new ArrayList(i4Var.u0[0].c.x);
                i4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new l3(i4Var, arrayList3, hashMap, str3, i26, 13));
                break;
            case 24:
                i4 i4Var2 = (i4) this.c;
                int i27 = this.b;
                of.e eVar = (of.e) this.d;
                if (i4Var2.H0 == i27 && i4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(i4Var2.X).cancelRequest(i4Var2.F0, false);
                    i4Var2.F0 = 0;
                }
                if (i4Var2.M0 == eVar) {
                    i4Var2.M0 = null;
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
                g4 g4Var = (g4) this.c;
                int i29 = this.b;
                int[] iArr2 = (int[]) this.d;
                g4Var.J = i29;
                g4Var.I = iArr2;
                g4Var.L.f0();
                break;
            case 27:
                String str4 = (String) this.c;
                int i30 = this.b;
                f3[] f3VarArr2 = (f3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str4).getPathSegments().get(r0.getPathSegments().size() - 1);
                d2.g(LaunchActivity.G1, i30, tL_inputGroupCallSlug, false, null, null);
                f3VarArr2[0].dismiss();
                break;
            case 28:
                ((co) this.c).Ka((ArrayList) this.d, this.b, false, false);
                break;
            default:
                co coVar = (co) this.c;
                int i31 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                coVar.x0.v0(0, i31, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new kh(0, editTextBoldCursor), 100L);
                break;
        }
    }

    public /* synthetic */ p(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ p(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ p(g4 g4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 26;
        this.c = g4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
