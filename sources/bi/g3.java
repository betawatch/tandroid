package bi;

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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.eo;
import org.telegram.ui.gm;
import org.telegram.ui.kh;
import org.telegram.ui.pm;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g3(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.c = i10;
        this.b = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        UndoView undoView;
        switch (this.a) {
            case 0:
                ((FfmpegAudioWaveformLoader) this.b).lambda$new$0((String) this.d, this.c);
                break;
            case 1:
                ((FfmpegAudioWaveformLoader) this.b).lambda$receiveChunk$1((short[]) this.d, this.c);
                break;
            case 2:
                r7 r7Var = (r7) this.b;
                og.l lVar = (og.l) this.d;
                int i10 = this.c;
                if (r7Var.O0.getCurrentBrush() instanceof og.l) {
                    r7Var.c1 = true;
                }
                r7Var.B(lVar);
                pg.r1 r1Var = r7Var.k1;
                int i11 = r1Var.d + 1;
                r1Var.a(i11);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.a[i11], i10);
                r1Var.e = true;
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new s(this.c, ((MessagesStorage) this.b).getUsers(new ArrayList<>((HashSet) this.d)), 3));
                break;
            case 4:
                ((fe) this.b).b((short[]) this.d, this.c);
                break;
            case 5:
                int[] iArr = (int[]) this.b;
                int i12 = this.c;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i12).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i12).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 6:
                di.u4 u4Var = (di.u4) this.b;
                TLObject tLObject = (TLObject) this.d;
                int i13 = this.c;
                if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                    u4Var.x = tL_webViewResultUrl.query_id;
                    u4Var.n.u(i13, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(u4Var.U);
                    break;
                }
                break;
            case 7:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
                int i14 = this.c;
                e2.m mVar = (e2.m) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i14 != -1) {
                            oVar.b.b(i14);
                        }
                        oVar.c = true;
                        mVar.invoke(oVar.a);
                    }
                }
                break;
            case 8:
                fg.h0 h0Var = (fg.h0) this.b;
                int i15 = this.c;
                String str = (String) this.d;
                int i16 = h0Var.s0;
                h0Var.r = null;
                if (i15 == h0Var.d0) {
                    if (h0Var.n >= 0) {
                        ConnectionsManager.getInstance(i16).cancelRequest(h0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.n = ConnectionsManager.getInstance(i16).sendRequest(tL_channels_searchPosts, new fg.t(h0Var, i15, str, 0));
                    break;
                }
                break;
            case 9:
                gg.b0 b0Var = (gg.b0) this.b;
                b0Var.b.add(this.c, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(b0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 10:
                hi.r5 r5Var = (hi.r5) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i17 = this.c;
                hi.u5 m10 = r5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    hi.k1 k1Var = m10.a;
                    k1Var.r();
                    k1Var.setSelection(Math.max(0, Math.min(i17, k1Var.length())));
                    break;
                }
                break;
            case 11:
                hi.a6 a6Var = (hi.a6) this.b;
                hi.a aVar = (hi.a) this.d;
                int i18 = this.c;
                hi.g6 g6Var = a6Var.a;
                if (g6Var.y != null) {
                    hi.g6.f(aVar.b, "");
                    ((hi.h3) g6Var.y).c(aVar, i18);
                    break;
                }
                break;
            case 12:
                i2.b1 b1Var = (i2.b1) this.b;
                Pair pair = (Pair) this.d;
                b1Var.b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.c);
                break;
            case 13:
                ((View) this.d).postOnAnimation(new s((mh.a) this.b, this.c, 11));
                break;
            case 14:
                n2.j jVar = (n2.j) this.b;
                this.d.a(jVar.a, jVar.b, this.c);
                break;
            case 15:
                og.v0 v0Var = (og.v0) this.b;
                v0Var.e((og.k1) this.d, this.c, v0Var.h);
                v0Var.h = null;
                break;
            case 16:
                ((CameraView) this.b).lambda$createCamera$13(this.c, (SurfaceTexture) this.d);
                break;
            case 17:
                ((NativeInstance) this.b).lambda$onEmitJoinPayload$3(this.c, (String) this.d);
                break;
            case 18:
                ((VoIPService) this.b).lambda$createGroupInstance$74((String) this.d, this.c);
                break;
            case 19:
                int i19 = this.c;
                Context context = (Context) this.b;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.d;
                String str2 = MessagesController.getInstance(i19).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                nf.f.s(context, str2);
                h3VarArr[0].dismiss();
                break;
            case 20:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.b;
                String str3 = (String) this.d;
                int i20 = this.c;
                HashMap hashMap = new HashMap(j4Var.u0[0].c.w);
                ArrayList arrayList = new ArrayList(j4Var.u0[0].c.x);
                j4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new di.o3(j4Var, arrayList, hashMap, str3, i20, 13));
                break;
            case 21:
                org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) this.b;
                int i21 = this.c;
                nf.e eVar = (nf.e) this.d;
                if (j4Var2.H0 == i21 && j4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(j4Var2.X).cancelRequest(j4Var2.F0, false);
                    j4Var2.F0 = 0;
                }
                if (j4Var2.M0 == eVar) {
                    j4Var2.M0 = null;
                    break;
                }
                break;
            case 22:
                int i22 = this.c;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i22).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i22).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 23:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.b;
                int i23 = this.c;
                int[] iArr2 = (int[]) this.d;
                h4Var.J = i23;
                h4Var.I = iArr2;
                h4Var.L.f0();
                break;
            case 24:
                String str4 = (String) this.d;
                int i24 = this.c;
                org.telegram.ui.ActionBar.h3[] h3VarArr2 = (org.telegram.ui.ActionBar.h3[]) this.b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str4).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, i24, tL_inputGroupCallSlug, false, null, null);
                h3VarArr2[0].dismiss();
                break;
            case 25:
                ((eo) this.b).Ka((ArrayList) this.d, this.c, false, false);
                break;
            case 26:
                eo eoVar = (eo) this.b;
                int i25 = this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                eoVar.x0.v0(0, i25, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new kh(0, editTextBoldCursor), 100L);
                break;
            case 27:
                gm gmVar = (gm) this.b;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.d;
                int i26 = this.c;
                gmVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                pm pmVar = gmVar.a;
                pmVar.Q.E(i26, messageObject.getId(), messageObject.getDialogId() == pmVar.Q.L6 ? 1 : 0, 0, true, true);
                break;
            case 28:
                zn znVar = (zn) this.b;
                int i27 = this.c;
                View view = (View) this.d;
                znVar.V = 0;
                znVar.U = i27;
                if (!(view instanceof org.telegram.ui.Cells.s8)) {
                    znVar.r.m(znVar.I0);
                    break;
                } else {
                    znVar.U((org.telegram.ui.Cells.s8) view, true);
                    break;
                }
            default:
                jv jvVar = (jv) this.b;
                a0.i iVar = (a0.i) this.d;
                int i28 = this.c;
                org.telegram.ui.ActionBar.p2 p2Var = jvVar.b1.c;
                if (p2Var instanceof eo) {
                    eo eoVar2 = (eo) p2Var;
                    eoVar2.Q7();
                    undoView = eoVar2.y3;
                } else {
                    undoView = p2Var instanceof ProfileActivity ? ((ProfileActivity) p2Var).M : null;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (iVar.m() != 1) {
                        undoView2.k(0L, 53, Integer.valueOf(i28), Integer.valueOf(iVar.m()), null, null);
                        break;
                    } else {
                        undoView2.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i28), 53);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g3(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.d = obj2;
    }

    public /* synthetic */ g3(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.c = i10;
    }

    public /* synthetic */ g3(String str, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.a = 24;
        this.d = str;
        this.c = i10;
        this.b = h3VarArr;
    }

    public /* synthetic */ g3(org.telegram.ui.h4 h4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 23;
        this.b = h4Var;
        this.c = i10;
        this.d = iArr2;
    }
}
