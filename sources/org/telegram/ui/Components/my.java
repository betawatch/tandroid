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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ my(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        y11 y11Var = (y11) this.c;
        String str = (String) this.d;
        int i10 = this.b;
        x11 x11Var = y11Var.r.n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                y11Var.d = -1;
                AndroidUtilities.runOnUIThread(new di.q((Object) y11Var, y11Var.d, new ArrayList(), (Serializable) new ArrayList(), 29));
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
            int size = x11Var.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList arrayList3 = (ArrayList) x11Var.d.get(i12);
                String i13 = org.telegram.ui.ActionBar.i5.i(((org.telegram.ui.ActionBar.l6) arrayList3.get(0)).f);
                String lowerCase2 = i13.toLowerCase();
                int i14 = 0;
                while (true) {
                    if (i14 < i11) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(y11.E(i13, str2));
                            break;
                        }
                        i14++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new di.q((Object) y11Var, i10, arrayList, (Serializable) arrayList2, 29));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private final void b() {
        org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.vy vyVar = uyVar.g;
        org.telegram.ui.wy wyVar = uyVar.h;
        wyVar.S1 = true;
        wyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        wyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = wyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            vyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = wyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            wyVar.A4(true, true);
            vyVar.x.D();
            vyVar.q(true);
            wyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                wyVar.A4(true, true);
                vyVar.q(true);
                wyVar.o3();
            } else {
                if (!wyVar.R1.isEmpty()) {
                    wyVar.R1.remove(0);
                }
                vyVar.x.D();
                vyVar.q(true);
            }
        }
    }

    private final void c() {
        org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.c;
        org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var == null) {
            return;
        }
        d2Var.setOnCancelListener(new org.telegram.ui.ba(j60Var, this.b, 5));
        d2VarArr[0].show();
    }

    private final void e() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.b;
            if (z10) {
                launchActivity.I0(i10, tL_help_appUpdate, false);
            } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i10);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    private final void f() {
        org.telegram.ui.oi oiVar = (org.telegram.ui.oi) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tLObject instanceof TLRPC.User) {
            oiVar.a = (TLRPC.User) tLObject;
            MessagesController.getInstance(this.b).putUser(oiVar.a, false);
        }
        a10 a10Var = oiVar.c;
        m90 m90Var = oiVar.b;
        oiVar.setEnabled(oiVar.a != null);
        TLRPC.User user = oiVar.a;
        if (user != null) {
            m90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new bi.va(oiVar, user.id, 21)));
        }
        m90Var.animate().alpha(1.0f).setDuration(220L).start();
        a10Var.animate().alpha(0.0f).setDuration(220L).setListener(new yo(a10Var)).start();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0275: MOVE (r9 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:630), block:B:123:0x0275 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06ba  */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r92;
        long j3;
        String formatPluralString;
        ArrayList arrayList;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        int size3;
        int dp;
        float f7;
        int i13;
        int i14;
        int i15;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        String str;
        int i16 = 4;
        int i17 = 2;
        UndoView undoView = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        switch (this.a) {
            case 0:
                ny nyVar = (ny) this.c;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.d;
                int i18 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var == null) {
                    return;
                }
                d2Var.setOnCancelListener(new org.telegram.ui.ba(nyVar, i18, i16));
                d2VarArr[0].show();
                return;
            case 1:
                int i19 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i19;
                p2Var.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new fg.t(p2Var, i19, callback, 5));
                return;
            case 2:
                a40 a40Var = (a40) this.c;
                int i20 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                fg.d2 d2Var2 = a40Var.d;
                b40 b40Var = a40Var.w;
                if (i20 != a40Var.n) {
                    return;
                }
                a40Var.h = false;
                TLRPC.Chat chat = b40Var.V;
                jx0 jx0Var = b40Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.i iVar = d2Var2.h;
                    ArrayList arrayList3 = d2Var2.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i21 = 0; i21 < size4; i21++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i21);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            iVar.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            iVar.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    d2Var2.i();
                }
                int i22 = a40Var.f - 1;
                boolean z10 = jx0Var.getVisibility() == 0;
                a40Var.l();
                if (a40Var.f > i22) {
                    b40Var.J(i22);
                }
                if (a40Var.h || d2Var2.e() || !b40Var.d.R0()) {
                    return;
                }
                jx0Var.e(false, z10);
                return;
            case 3:
                o40 o40Var = (o40) this.c;
                int i23 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = o40Var.O;
                int i24 = o40Var.N;
                if (i23 != o40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(o40Var.b0[0] ? "$" : "#");
                sb2.append(o40Var.Y);
                String sb3 = sb2.toString();
                zh.u4 u4Var = o40Var.Q;
                if (u4Var == null || !TextUtils.equals(u4Var.C, sb3)) {
                    o40Var.Q = new zh.u4(i24, null, sb3);
                }
                if (o40Var.Q.i.size() <= 0) {
                    r92 = 1;
                    o40Var.Q.p(4, true);
                } else {
                    r92 = 1;
                }
                o40Var.P = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                o40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) hc.b.i(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = o40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i24).getInputPeer(messageObject.messageOwner.peer_id);
                }
                o40Var.U = ConnectionsManager.getInstance(i24).sendRequest(tL_channels_searchPosts, new fg.t(o40Var, i23, sb3, 6));
                return;
            case 4:
                f60 f60Var = (f60) this.c;
                int i25 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = f60Var.i0;
                if (f60Var.h0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i25);
                }
                if (!f60Var.n0) {
                    if (i25 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    f60Var.o0 = new CameraSession(f60Var.y, sizeArr[0], f60Var.j0, 256, true);
                    f60Var.r();
                    x50 x50Var = f60Var.h0;
                    CameraSession cameraSession = f60Var.o0;
                    Handler handler = x50Var.getHandler();
                    if (handler != null) {
                        x50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(f60Var.o0, surfaceTexture, new n50(f60Var, 1), new n50(f60Var, 2));
                    return;
                }
                if (f60Var.p0) {
                    Camera2Session camera2Session = f60Var.q0[i25];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i25 == 1) {
                    return;
                }
                x50 x50Var2 = f60Var.h0;
                Camera2Session camera2Session2 = f60Var.r0;
                Handler handler2 = x50Var2.getHandler();
                if (handler2 != null) {
                    x50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                f60Var.r0.open(surfaceTexture);
                return;
            case 5:
                e60 e60Var = (e60) this.c;
                int i26 = this.b;
                a60 a60Var = (a60) this.d;
                f60 f60Var2 = e60Var.H0;
                VideoEditedInfo videoEditedInfo = f60Var2.N;
                int i27 = f60Var2.a;
                y50 y50Var = f60Var2.c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    f60Var2.N = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (f60Var2.N.needConvert()) {
                    f60Var2.H = null;
                    f60Var2.I = null;
                    f60Var2.J = null;
                    f60Var2.K = null;
                    VideoEditedInfo videoEditedInfo3 = f60Var2.N;
                    long j10 = videoEditedInfo3.estimatedDuration;
                    j3 = 0;
                    double d = j10;
                    long j11 = videoEditedInfo3.startTime;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = videoEditedInfo3.endTime;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    videoEditedInfo3.estimatedDuration = j13;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * f60Var2.L));
                    VideoEditedInfo videoEditedInfo4 = f60Var2.N;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i27).cancelFileUpload(f60Var2.a0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    f60Var2.N.estimatedSize = Math.max(1L, f60Var2.L);
                }
                VideoEditedInfo videoEditedInfo5 = f60Var2.N;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = f60Var2.H;
                videoEditedInfo5.encryptedFile = f60Var2.I;
                videoEditedInfo5.key = f60Var2.J;
                videoEditedInfo5.iv = f60Var2.K;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = e60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = f60Var2.N;
                if (i26 != 1) {
                    e60Var.h(e60Var.a);
                    videoEditedInfo6.estimatedDuration = f60Var2.f0;
                    NotificationCenter.getInstance(i27).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(f60Var2.Q), videoEditedInfo6, e60Var.a.getAbsolutePath(), e60Var.A0);
                    return;
                }
                if (y50Var.c()) {
                    Activity parentActivity = y50Var.getParentActivity();
                    long a2 = y50Var.a();
                    androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(e60Var, a60Var, videoEditedInfo6, 28);
                    b60 b60Var = new b60(e60Var, 0);
                    org.telegram.ui.ActionBar.f6 f6Var = f60Var2.P0;
                    Pattern pattern = d5.a;
                    d5.K(parentActivity, a2, -1L, 0, false, aVar, b60Var, new b5(f6Var), f6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (a60Var != null) {
                        photoEntry.ttl = a60Var.c;
                        photoEntry.effectId = a60Var.d;
                    }
                    f60Var2.c.q(photoEntry, videoEditedInfo6, a60Var == null || a60Var.a, a60Var != null ? a60Var.b : 0, 0, false, a60Var != null ? a60Var.e : j3);
                }
                f60Var2.N = null;
                return;
            case 6:
                pj0 pj0Var = (pj0) this.c;
                int i28 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i29 = pj0Var.f;
                TextView textView = pj0Var.b;
                MessageObject messageObject2 = pj0Var.s;
                ImageView imageView = pj0Var.d;
                w9 w9Var = pj0Var.e;
                ArrayList arrayList5 = pj0Var.r;
                ArrayList arrayList6 = pj0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i28) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i28, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i28), i28 == arrayList6.size() ? String.valueOf(i28) : i28 + "/" + arrayList6.size());
                }
                if (pj0Var.getMeasuredWidth() > 0) {
                    pj0Var.v = pj0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject2.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i29).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            w9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            w9Var.setVisibility(0);
                            w9Var.setAlpha(0.0f);
                            w9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i30 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject2.messageOwner.from_id;
                                int i31 = size;
                                if (peer == null || user2.id == peer.user_id) {
                                    i13 = i30;
                                } else {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < arrayList.size()) {
                                            i13 = i30;
                                            if (((oj0) arrayList.get(i32)).b == user2.id) {
                                                break;
                                            }
                                            i32++;
                                            i30 = i13;
                                        } else {
                                            i13 = i30;
                                            arrayList.add(new oj0(0, user2));
                                        }
                                    }
                                }
                                size = i31;
                                i10 = i13;
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
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < arrayList.size()) {
                                            int i34 = i33;
                                            if (((oj0) arrayList.get(i33)).b == (-chat3.id)) {
                                                break;
                                            } else {
                                                i33 = i34 + 1;
                                            }
                                        } else {
                                            arrayList.add(new oj0(0, chat3));
                                        }
                                    }
                                }
                            }
                            a10 a10Var = pj0Var.a;
                            j9 j9Var = pj0Var.c;
                            pj0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    j9Var.b(i12, ((oj0) arrayList.get(i12)).a, i29);
                                } else {
                                    j9Var.b(i12, null, i29);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f7 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f7 = AndroidUtilities.dp(12.0f);
                                    }
                                    j9Var.setTranslationX(f7);
                                    j9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    j9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    a10Var.animate().alpha(0.0f).setDuration(220L).setListener(new yo(a10Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            j9Var.setTranslationX(f7);
                            j9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            j9Var.animate().alpha(1.0f).setDuration(220L).start();
                            a10Var.animate().alpha(0.0f).setDuration(220L).setListener(new yo(a10Var)).start();
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
                a10 a10Var2 = pj0Var.a;
                j9 j9Var2 = pj0Var.c;
                pj0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                j9Var2.setTranslationX(f7);
                j9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                j9Var2.animate().alpha(1.0f).setDuration(220L).start();
                a10Var2.animate().alpha(0.0f).setDuration(220L).setListener(new yo(a10Var2)).start();
                return;
            case 7:
                oq0 oq0Var = (oq0) this.c;
                int i35 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                mq0 mq0Var = oq0Var.e;
                sq0 sq0Var = oq0Var.K;
                if (i35 != oq0Var.r) {
                    return;
                }
                oq0Var.h();
                oq0Var.I = false;
                oq0Var.v = i35;
                if (oq0Var.s != i35) {
                    mq0Var.b();
                }
                tp0 tp0Var = sq0Var.F;
                oq0 oq0Var2 = sq0Var.M;
                if (tp0Var.getAdapter() != oq0Var2) {
                    sq0.F0(sq0Var);
                    oq0Var2.l();
                }
                for (int i36 = 0; i36 < arrayList9.size(); i36++) {
                    TLObject tLObject2 = ((gq0) arrayList9.get(i36)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i15 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
                        MessagesController.getInstance(i15).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i14 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
                        MessagesController.getInstance(i14).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !oq0Var.d.isEmpty() && arrayList9.isEmpty();
                if (oq0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (z11) {
                    sq0.F0(sq0Var);
                }
                oq0Var.d = arrayList9;
                mq0Var.f(arrayList9, null);
                int i37 = oq0Var.J;
                if (oq0Var.h() != 0 || mq0Var.e() || oq0Var.I) {
                    sq0Var.x0.b(i37);
                } else {
                    sq0Var.Q.e(false, true);
                }
                oq0Var.l();
                sq0Var.K0(true);
                return;
            case 8:
                r0.getStoriesController().c(this.b, ((iv0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 9:
                iv0 iv0Var = (iv0) this.c;
                int i38 = this.b;
                w70 w70Var = (w70) this.d;
                iv0Var.d1(i38);
                w70Var.u();
                return;
            case 10:
                iv0 iv0Var2 = (iv0) this.c;
                iv0Var2.S(this.b, (vl0) this.d, false);
                iv0Var2.J1 = null;
                return;
            case 11:
                lt0 lt0Var = (lt0) this.c;
                int i39 = this.b;
                w70 w70Var2 = (w70) this.d;
                lt0Var.d.c1(i39, false);
                w70Var2.u();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                a0.i iVar2 = (a0.i) this.d;
                int i40 = this.b;
                if (p2Var2 instanceof org.telegram.ui.eo) {
                    org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var2;
                    eoVar.Q7();
                    undoView = eoVar.y3;
                } else if (p2Var2 instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) p2Var2).M;
                }
                UndoView undoView3 = undoView;
                if (undoView3 != null) {
                    if (iVar2.m() == 1) {
                        undoView3.m(((TLRPC.Dialog) iVar2.n(0)).id, Integer.valueOf(i40), 53);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i40), Integer.valueOf(iVar2.m()), null, null);
                        return;
                    }
                }
                return;
            case 13:
                tu0 tu0Var = (tu0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != tu0Var.E) {
                    return;
                }
                tu0Var.y = ConnectionsManager.getInstance(tu0Var.d).sendRequest(tL_messages_search, new di.k4(tu0Var, i41, i17));
                return;
            case 14:
                tu0 tu0Var2 = (tu0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList10 = tu0Var2.h;
                int i43 = tu0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == tu0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i43).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i43).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i43).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        MessageObject messageObject3 = new MessageObject(i43, messages_messages.messages.get(i44), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(tu0Var2.w);
                        arrayList10.add(messageObject3);
                    }
                    tu0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        tu0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        tu0Var2.s = true;
                    }
                    tu0Var2.G(false);
                    tu0Var2.r = false;
                    tu0Var2.y = -1;
                    return;
                }
                return;
            case 15:
                iw0 iw0Var = (iw0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                iw0Var.Y0 = false;
                if (!iw0Var.V0 && iw0Var.W0) {
                    iw0Var.C(true);
                    return;
                }
                iw0Var.n0 = iw0Var.f1[0];
                iw0Var.l();
                DownloadController.getInstance(i45).removeLoadingFileObserver(t1Var);
                iw0Var.I();
                iw0Var.x();
                return;
            case 16:
                int i46 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i46).getDatabase();
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
                int i47 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i47).getDatabase();
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
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e7) {
                                e = e7;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor4 = sQLiteCursor2;
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor4 != null) {
                    }
                    throw th;
                }
                break;
            case 18:
                ux0 ux0Var = (ux0) this.c;
                a0.i iVar3 = (a0.i) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var3 = ux0Var.b1.L;
                if (p2Var3 instanceof org.telegram.ui.eo) {
                    org.telegram.ui.eo eoVar2 = (org.telegram.ui.eo) p2Var3;
                    eoVar2.Q7();
                    undoView2 = eoVar2.y3;
                } else if (p2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) p2Var3).M;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    if (iVar3.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) iVar3.n(0)).id, Integer.valueOf(i48), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i48), Integer.valueOf(iVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 19:
                zy0 zy0Var = (zy0) this.c;
                String str3 = (String) this.d;
                int i49 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(zy0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new di.q(zy0Var, i49, str3, arrayList11));
                return;
            case 20:
                a();
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new g21((i21) this.c, (rp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
                return;
            case 22:
                MessageObject messageObject4 = (MessageObject) this.c;
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
                int i50 = this.b;
                HashMap hashMap = r31.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(r31.o(messageObject4)));
                }
                if (k1Var != null) {
                    k1Var.c0(3);
                }
                NotificationCenter.getInstance(i50).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject4);
                NotificationCenter.getInstance(i50).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
                return;
            case 23:
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this.c;
                int i51 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                org.telegram.ui.wy wyVar = ayVar.f0;
                ArrayList arrayList12 = wyVar.R1;
                if (arrayList12 == null || i51 < 0 || i51 >= arrayList12.size()) {
                    return;
                }
                wyVar.R1.add(i51, dialog);
                wyVar.e0[0].q(true);
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
                org.telegram.ui.on0.X((org.telegram.ui.on0) this.c, (SecureDocument) this.d, this.b);
                return;
            default:
                org.telegram.ui.wo0 wo0Var = (org.telegram.ui.wo0) this.c;
                int i52 = this.b;
                Intent intent = (Intent) this.d;
                if (i52 == -1) {
                    Parcelable.Creator<v8.i> creator = v8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    v8.i iVar4 = (v8.i) (byteArrayExtra != null ? w7.f0.a(byteArrayExtra, creator) : null);
                    if (iVar4 == null || (str = iVar4.h) == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                        jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                        String string = jSONObject2.getString("token");
                        if (wo0Var.K0 == null && wo0Var.M0 == null) {
                            m.e3 a10 = w7.y7.a(string);
                            wo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.c, (String) a10.b);
                            uc.a aVar2 = (uc.a) a10.d;
                            wo0Var.x0 = aVar2.a() + " *" + aVar2.b();
                            wo0Var.t0();
                        }
                        TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                        wo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                        tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                        wo0Var.J0.payment_token.data = jSONObject2.toString();
                        String optString = jSONObject.optString("description");
                        if (TextUtils.isEmpty(optString)) {
                            wo0Var.x0 = "Android Pay";
                        } else {
                            wo0Var.x0 = optString;
                        }
                        wo0Var.t0();
                    } catch (JSONException e11) {
                        FileLog.e(e11);
                    }
                } else if (i52 == 1) {
                    int i53 = v8.a.c;
                    Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                    StringBuilder sb4 = new StringBuilder("android pay error ");
                    sb4.append(status != null ? status.b : "");
                    FileLog.e(sb4.toString());
                }
                wo0Var.H0(true, false);
                wo0Var.D0(false);
                FrameLayout frameLayout = wo0Var.P;
                if (frameLayout != null) {
                    frameLayout.setClickable(true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ my(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ my(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
