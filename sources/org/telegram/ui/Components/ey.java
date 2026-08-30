package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ey(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        o11 o11Var = (o11) this.c;
        String str = (String) this.d;
        int i10 = this.b;
        n11 n11Var = o11Var.r.n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                o11Var.d = -1;
                AndroidUtilities.runOnUIThread(new cg.v1((Object) o11Var, o11Var.d, new ArrayList(), (Serializable) new ArrayList(), 28));
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i11 = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i11];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = n11Var.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList arrayList3 = (ArrayList) n11Var.d.get(i12);
                String i13 = org.telegram.ui.ActionBar.h5.i(((org.telegram.ui.ActionBar.l6) arrayList3.get(0)).f);
                String lowerCase2 = i13.toLowerCase();
                int i14 = 0;
                while (true) {
                    if (i14 < i11) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(o11.E(i13, str2));
                            break;
                        }
                        i14++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new cg.v1((Object) o11Var, i10, arrayList, (Serializable) arrayList2, 28));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private final void b() {
        org.telegram.ui.my myVar = (org.telegram.ui.my) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ny nyVar = myVar.g;
        org.telegram.ui.oy oyVar = myVar.h;
        oyVar.P1 = true;
        oyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        oyVar.P1 = false;
        ArrayList<TLRPC.Dialog> dialogs = oyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            nyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = oyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            oyVar.A4(true, true);
            nyVar.x.D();
            nyVar.q(true);
            oyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                oyVar.A4(true, true);
                nyVar.q(true);
                oyVar.o3();
            } else {
                if (!oyVar.O1.isEmpty()) {
                    oyVar.O1.remove(0);
                }
                nyVar.x.D();
                nyVar.q(true);
            }
        }
    }

    private final void c() {
        org.telegram.ui.c60 c60Var = (org.telegram.ui.c60) this.c;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var == null) {
            return;
        }
        d2Var.setOnCancelListener(new lh.w(c60Var, this.b, 6));
        d2VarArr[0].show();
    }

    private final void e() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.y1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z4 = tL_help_appUpdate.can_not_skip;
            int i10 = this.b;
            if (z4) {
                launchActivity.I0(i10, tL_help_appUpdate, false);
            } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i10);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    private final void f() {
        org.telegram.ui.ii iiVar = (org.telegram.ui.ii) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tLObject instanceof TLRPC.User) {
            iiVar.a = (TLRPC.User) tLObject;
            MessagesController.getInstance(this.b).putUser(iiVar.a, false);
        }
        t00 t00Var = iiVar.c;
        e90 e90Var = iiVar.b;
        iiVar.setEnabled(iiVar.a != null);
        TLRPC.User user = iiVar.a;
        if (user != null) {
            e90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new gg.y1(iiVar, user.id, 23)));
        }
        e90Var.animate().alpha(1.0f).setDuration(220L).start();
        t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new l00(t00Var)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06b9  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r92;
        long j10;
        String formatPluralString;
        ArrayList arrayList;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        int size3;
        int dp;
        float f10;
        int i13;
        int i14;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        String str;
        int i15 = 5;
        UndoView undoView = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        switch (this.a) {
            case 0:
                fy fyVar = (fy) this.c;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.d;
                int i16 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var == null) {
                    return;
                }
                d2Var.setOnCancelListener(new lh.w(fyVar, i16, i15));
                d2VarArr[0].show();
                return;
            case 1:
                int i17 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i17;
                p2Var.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new gg.l0(p2Var, i17, callback, i15));
                return;
            case 2:
                s30 s30Var = (s30) this.c;
                int i18 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                tf.k1 k1Var = s30Var.d;
                t30 t30Var = s30Var.w;
                if (i18 != s30Var.n) {
                    return;
                }
                s30Var.h = false;
                TLRPC.Chat chat = t30Var.S;
                zw0 zw0Var = t30Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar = k1Var.h;
                    ArrayList arrayList3 = k1Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i19 = 0; i19 < size4; i19++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i19);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    k1Var.i();
                }
                int i20 = s30Var.f - 1;
                boolean z4 = zw0Var.getVisibility() == 0;
                s30Var.l();
                if (s30Var.f > i20) {
                    t30Var.I(i20);
                }
                if (s30Var.h || k1Var.e() || !t30Var.d.S0()) {
                    return;
                }
                zw0Var.e(false, z4);
                return;
            case 3:
                g40 g40Var = (g40) this.c;
                int i21 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = g40Var.L;
                int i22 = g40Var.K;
                if (i21 != g40Var.Q) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(g40Var.Y[0] ? "$" : "#");
                sb.append(g40Var.V);
                String sb2 = sb.toString();
                nh.f6 f6Var = g40Var.N;
                if (f6Var == null || !TextUtils.equals(f6Var.C, sb2)) {
                    g40Var.N = new nh.f6(i22, null, sb2);
                }
                if (g40Var.N.i.size() <= 0) {
                    r92 = 1;
                    g40Var.N.p(4, true);
                } else {
                    r92 = 1;
                }
                g40Var.M = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                g40Var.V = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) kh.a2.i(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = g40Var.W;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i22).getInputPeer(messageObject.messageOwner.peer_id);
                }
                g40Var.R = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new gg.l0(g40Var, i21, sb2, 6));
                return;
            case 4:
                x50 x50Var = (x50) this.c;
                int i23 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = x50Var.f0;
                if (x50Var.e0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i23);
                }
                if (!x50Var.k0) {
                    if (i23 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    x50Var.l0 = new CameraSession(x50Var.y, sizeArr[0], x50Var.g0, 256, true);
                    x50Var.r();
                    p50 p50Var = x50Var.e0;
                    CameraSession cameraSession = x50Var.l0;
                    Handler handler = p50Var.getHandler();
                    if (handler != null) {
                        p50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(x50Var.l0, surfaceTexture, new f50(x50Var, 1), new f50(x50Var, 2));
                    return;
                }
                if (x50Var.m0) {
                    Camera2Session camera2Session = x50Var.n0[i23];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i23 == 1) {
                    return;
                }
                p50 p50Var2 = x50Var.e0;
                Camera2Session camera2Session2 = x50Var.o0;
                Handler handler2 = p50Var2.getHandler();
                if (handler2 != null) {
                    p50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                x50Var.o0.open(surfaceTexture);
                return;
            case 5:
                w50 w50Var = (w50) this.c;
                int i24 = this.b;
                s50 s50Var = (s50) this.d;
                x50 x50Var2 = w50Var.E0;
                VideoEditedInfo videoEditedInfo = x50Var2.K;
                int i25 = x50Var2.a;
                q50 q50Var = x50Var2.c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    x50Var2.K = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (x50Var2.K.needConvert()) {
                    x50Var2.E = null;
                    x50Var2.F = null;
                    x50Var2.G = null;
                    x50Var2.H = null;
                    VideoEditedInfo videoEditedInfo3 = x50Var2.K;
                    long j11 = videoEditedInfo3.estimatedDuration;
                    j10 = 0;
                    double d = j11;
                    long j12 = videoEditedInfo3.startTime;
                    if (j12 < 0) {
                        j12 = 0;
                    }
                    long j13 = videoEditedInfo3.endTime;
                    if (j13 >= 0) {
                        j11 = j13;
                    }
                    long j14 = j11 - j12;
                    videoEditedInfo3.estimatedDuration = j14;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j14 / d) * x50Var2.I));
                    VideoEditedInfo videoEditedInfo4 = x50Var2.K;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j15 = videoEditedInfo4.startTime;
                    if (j15 > 0) {
                        videoEditedInfo4.startTime = j15 * 1000;
                    }
                    long j16 = videoEditedInfo4.endTime;
                    if (j16 > 0) {
                        videoEditedInfo4.endTime = j16 * 1000;
                    }
                    FileLoader.getInstance(i25).cancelFileUpload(x50Var2.U.getAbsolutePath(), false);
                } else {
                    j10 = 0;
                    x50Var2.K.estimatedSize = Math.max(1L, x50Var2.I);
                }
                VideoEditedInfo videoEditedInfo5 = x50Var2.K;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = x50Var2.E;
                videoEditedInfo5.encryptedFile = x50Var2.F;
                videoEditedInfo5.key = x50Var2.G;
                videoEditedInfo5.iv = x50Var2.H;
                int i26 = 25;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = w50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = x50Var2.K;
                if (i24 != 1) {
                    w50Var.h(w50Var.a);
                    videoEditedInfo6.estimatedDuration = x50Var2.c0;
                    NotificationCenter.getInstance(i25).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(x50Var2.N), videoEditedInfo6, w50Var.a.getAbsolutePath(), w50Var.x0);
                    return;
                }
                if (q50Var.c()) {
                    Activity parentActivity = q50Var.getParentActivity();
                    long a2 = q50Var.a();
                    androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(w50Var, s50Var, videoEditedInfo6, i26);
                    t50 t50Var = new t50(w50Var, 0);
                    org.telegram.ui.ActionBar.f6 f6Var2 = x50Var2.M0;
                    Pattern pattern = z4.a;
                    z4.K(parentActivity, a2, -1L, 0, false, aVar, t50Var, new x4(f6Var2), f6Var2);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (s50Var != null) {
                        photoEntry.ttl = s50Var.c;
                        photoEntry.effectId = s50Var.d;
                    }
                    x50Var2.c.r(photoEntry, videoEditedInfo6, s50Var == null || s50Var.a, s50Var != null ? s50Var.b : 0, 0, false, s50Var != null ? s50Var.e : j10);
                }
                x50Var2.K = null;
                return;
            case 6:
                oj0 oj0Var = (oj0) this.c;
                int i27 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i28 = oj0Var.f;
                TextView textView = oj0Var.b;
                MessageObject messageObject2 = oj0Var.s;
                ImageView imageView = oj0Var.d;
                p9 p9Var = oj0Var.e;
                ArrayList arrayList5 = oj0Var.r;
                ArrayList arrayList6 = oj0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i27) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i27, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i27), i27 == arrayList6.size() ? String.valueOf(i27) : i27 + "/" + arrayList6.size());
                }
                if (oj0Var.getMeasuredWidth() > 0) {
                    oj0Var.v = oj0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject2.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i28).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            p9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            p9Var.setVisibility(0);
                            p9Var.setAlpha(0.0f);
                            p9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i29 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject2.messageOwner.from_id;
                                if (peer != null && user2.id != peer.user_id) {
                                    int i30 = 0;
                                    while (true) {
                                        if (i30 < arrayList.size()) {
                                            int i31 = i30;
                                            if (((nj0) arrayList.get(i30)).b == user2.id) {
                                                break;
                                            } else {
                                                i30 = i31 + 1;
                                            }
                                        } else {
                                            arrayList.add(new nj0(0, user2));
                                        }
                                    }
                                }
                                i10 = i29;
                            }
                            ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList8.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat2 = arrayList8.get(i11);
                                i11++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject2.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 >= arrayList.size()) {
                                            arrayList.add(new nj0(0, chat3));
                                        } else if (((nj0) arrayList.get(i32)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i32++;
                                        }
                                    }
                                }
                            }
                            t00 t00Var = oj0Var.a;
                            d9 d9Var = oj0Var.c;
                            oj0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    d9Var.b(i12, ((nj0) arrayList.get(i12)).a, i28);
                                } else {
                                    d9Var.b(i12, null, i28);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f10 = AndroidUtilities.dp(12.0f);
                                    }
                                    d9Var.setTranslationX(f10);
                                    d9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    d9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new l00(t00Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f10 = dp;
                            if (LocaleController.isRTL) {
                            }
                            d9Var.setTranslationX(f10);
                            d9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            d9Var.animate().alpha(1.0f).setDuration(220L).start();
                            t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new l00(t00Var)).start();
                            return;
                        }
                    }
                }
                arrayList = arrayList5;
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList72 = tL_messages_messageReactionsList.users;
                size = arrayList72.size();
                i10 = 0;
                while (i10 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList82 = tL_messages_messageReactionsList.chats;
                size2 = arrayList82.size();
                i11 = 0;
                while (i11 < size2) {
                }
                t00 t00Var2 = oj0Var.a;
                d9 d9Var2 = oj0Var.c;
                oj0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = dp;
                if (LocaleController.isRTL) {
                }
                d9Var2.setTranslationX(f10);
                d9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                d9Var2.animate().alpha(1.0f).setDuration(220L).start();
                t00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new l00(t00Var2)).start();
                return;
            case 7:
                hq0 hq0Var = (hq0) this.c;
                int i33 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                fq0 fq0Var = hq0Var.e;
                lq0 lq0Var = hq0Var.H;
                if (i33 != hq0Var.r) {
                    return;
                }
                hq0Var.h();
                hq0Var.F = false;
                hq0Var.v = i33;
                if (hq0Var.s != i33) {
                    fq0Var.b();
                }
                mp0 mp0Var = lq0Var.C;
                hq0 hq0Var2 = lq0Var.J;
                if (mp0Var.getAdapter() != hq0Var2) {
                    lq0.F0(lq0Var);
                    hq0Var2.l();
                }
                for (int i34 = 0; i34 < arrayList9.size(); i34++) {
                    TLObject tLObject2 = ((zp0) arrayList9.get(i34)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i14 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                        MessagesController.getInstance(i14).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i13 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                        MessagesController.getInstance(i13).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z10 = !hq0Var.d.isEmpty() && arrayList9.isEmpty();
                if (hq0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (z10) {
                    lq0.F0(lq0Var);
                }
                hq0Var.d = arrayList9;
                fq0Var.f(arrayList9, null);
                int i35 = hq0Var.G;
                if (hq0Var.h() != 0 || fq0Var.e() || hq0Var.F) {
                    lq0Var.u0.b(i35);
                } else {
                    lq0Var.N.e(false, true);
                }
                hq0Var.l();
                lq0Var.K0(true);
                return;
            case 8:
                r0.getStoriesController().c(this.b, ((yu0) this.c).g1, (TL_stories.StoryItem) this.d);
                return;
            case 9:
                yu0 yu0Var = (yu0) this.c;
                int i36 = this.b;
                o70 o70Var = (o70) this.d;
                yu0Var.d1(i36);
                o70Var.u();
                return;
            case 10:
                yu0 yu0Var2 = (yu0) this.c;
                yu0Var2.S(this.b, (sl0) this.d, false);
                yu0Var2.G1 = null;
                return;
            case 11:
                bt0 bt0Var = (bt0) this.c;
                int i37 = this.b;
                o70 o70Var2 = (o70) this.d;
                bt0Var.d.c1(i37, false);
                o70Var2.u();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                a0.h hVar2 = (a0.h) this.d;
                int i38 = this.b;
                if (p2Var2 instanceof org.telegram.ui.xn) {
                    org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var2;
                    xnVar.Q7();
                    undoView = xnVar.v3;
                } else if (p2Var2 instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) p2Var2).J;
                }
                UndoView undoView3 = undoView;
                if (undoView3 != null) {
                    if (hVar2.m() == 1) {
                        undoView3.m(((TLRPC.Dialog) hVar2.n(0)).id, Integer.valueOf(i38), 53);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i38), Integer.valueOf(hVar2.m()), null, null);
                        return;
                    }
                }
                return;
            case 13:
                ju0 ju0Var = (ju0) this.c;
                int i39 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i39 != ju0Var.B) {
                    return;
                }
                ju0Var.y = ConnectionsManager.getInstance(ju0Var.d).sendRequest(tL_messages_search, new lh.s1(ju0Var, i39, i15));
                return;
            case 14:
                ju0 ju0Var2 = (ju0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i40 = this.b;
                ArrayList arrayList10 = ju0Var2.h;
                int i41 = ju0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i40 == ju0Var2.B) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i41).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i41).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i41).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i42 = 0; i42 < messages_messages.messages.size(); i42++) {
                        MessageObject messageObject3 = new MessageObject(i41, messages_messages.messages.get(i42), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(ju0Var2.w);
                        arrayList10.add(messageObject3);
                    }
                    ju0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        ju0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        ju0Var2.s = true;
                    }
                    ju0Var2.G(false);
                    ju0Var2.r = false;
                    ju0Var2.y = -1;
                    return;
                }
                return;
            case 15:
                yv0 yv0Var = (yv0) this.c;
                int i43 = this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                yv0Var.V0 = false;
                if (!yv0Var.S0 && yv0Var.T0) {
                    yv0Var.A(true);
                    return;
                }
                yv0Var.k0 = yv0Var.c1[0];
                yv0Var.j();
                DownloadController.getInstance(i43).removeLoadingFileObserver(t1Var);
                yv0Var.G();
                yv0Var.v();
                return;
            case 16:
                int i44 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i44).getDatabase();
                    if (database != null) {
                        if (tL_messages_emojiGroups == null) {
                            database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 17:
                int i45 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i45).getDatabase();
                        if (database2 != null) {
                            sQLiteCursor = database2.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num2);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    callback2.run(Long.valueOf(r4.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e6) {
                                e = e6;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor3 = num2;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 18:
                jx0 jx0Var = (jx0) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i46 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var3 = jx0Var.Y0.I;
                if (p2Var3 instanceof org.telegram.ui.xn) {
                    org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) p2Var3;
                    xnVar2.Q7();
                    undoView2 = xnVar2.v3;
                } else if (p2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) p2Var3).J;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    if (hVar3.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i46), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i46), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 19:
                qy0 qy0Var = (qy0) this.c;
                String str3 = (String) this.d;
                int i47 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(qy0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new cg.v1(qy0Var, i47, str3, arrayList11, 27));
                return;
            case 20:
                a();
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new cg.v1((w11) this.c, (jp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 29));
                return;
            case 22:
                MessageObject messageObject4 = (MessageObject) this.c;
                org.telegram.ui.Cells.k1 k1Var2 = (org.telegram.ui.Cells.k1) this.d;
                int i48 = this.b;
                HashMap hashMap = d31.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(d31.o(messageObject4)));
                }
                if (k1Var2 != null) {
                    k1Var2.g0(3);
                }
                NotificationCenter.getInstance(i48).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject4);
                NotificationCenter.getInstance(i48).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
                return;
            case 23:
                org.telegram.ui.sx sxVar = (org.telegram.ui.sx) this.c;
                int i49 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                org.telegram.ui.oy oyVar = sxVar.c0;
                ArrayList arrayList12 = oyVar.O1;
                if (arrayList12 == null || i49 < 0 || i49 >= arrayList12.size()) {
                    return;
                }
                oyVar.O1.add(i49, dialog);
                oyVar.b0[0].q(true);
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                e();
                return;
            case 27:
                f();
                return;
            case 28:
                org.telegram.ui.dn0.X((org.telegram.ui.dn0) this.c, (SecureDocument) this.d, this.b);
                return;
            default:
                org.telegram.ui.jo0 jo0Var = (org.telegram.ui.jo0) this.c;
                int i50 = this.b;
                Intent intent = (Intent) this.d;
                if (i50 == -1) {
                    Parcelable.Creator<j8.i> creator = j8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    j8.i iVar = (j8.i) (byteArrayExtra != null ? j7.g5.a(byteArrayExtra, creator) : null);
                    if (iVar == null || (str = iVar.h) == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                        jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                        String string = jSONObject2.getString("token");
                        if (jo0Var.H0 == null && jo0Var.J0 == null) {
                            androidx.biometric.e a10 = j7.w7.a(string);
                            jo0Var.t0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.c, (String) a10.b);
                            gc.a aVar2 = (gc.a) a10.d;
                            jo0Var.u0 = aVar2.a() + " *" + aVar2.b();
                            jo0Var.t0();
                        }
                        TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                        jo0Var.G0 = tL_inputPaymentCredentialsGooglePay;
                        tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                        jo0Var.G0.payment_token.data = jSONObject2.toString();
                        String optString = jSONObject.optString("description");
                        if (TextUtils.isEmpty(optString)) {
                            jo0Var.u0 = "Android Pay";
                        } else {
                            jo0Var.u0 = optString;
                        }
                        jo0Var.t0();
                    } catch (JSONException e11) {
                        FileLog.e(e11);
                    }
                } else if (i50 == 1) {
                    int i51 = j8.a.c;
                    Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                    StringBuilder sb3 = new StringBuilder("android pay error ");
                    sb3.append(status != null ? status.b : "");
                    FileLog.e(sb3.toString());
                }
                jo0Var.H0(true, false);
                jo0Var.D0(false);
                FrameLayout frameLayout = jo0Var.M;
                if (frameLayout != null) {
                    frameLayout.setClickable(true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ey(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ ey(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
