package org.telegram.ui;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g4(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) this.c;
        String str = (String) this.d;
        int i10 = this.b;
        org.telegram.ui.Components.u21 u21Var = v21Var.r.n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                v21Var.d = -1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.as0(v21Var, v21Var.d, new ArrayList(), new ArrayList(), 4));
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
            int size = u21Var.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList arrayList3 = (ArrayList) u21Var.d.get(i12);
                String c10 = org.telegram.ui.ActionBar.m5.c(((org.telegram.ui.ActionBar.h7) arrayList3.get(0)).e);
                String lowerCase2 = c10.toLowerCase();
                int i13 = 0;
                while (true) {
                    if (i13 < i11) {
                        String str2 = strArr[i13];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.v21.E(c10, str2));
                            break;
                        }
                        i13++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.as0(v21Var, i10, arrayList, arrayList2, 4));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:461:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01af  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        UndoView undoView2;
        ?? r10;
        org.telegram.ui.Components.c60 c60Var;
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
        float f7;
        int i13;
        int i14;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        org.telegram.ui.Components.cc1 cc1Var;
        int i15 = 5;
        int i16 = 6;
        UndoView undoView3 = null;
        UndoView undoView4 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        int i17 = 0;
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.c;
                int i18 = this.b;
                int[] iArr = (int[]) this.d;
                h4Var.J = i18;
                h4Var.I = iArr;
                h4Var.L.f0();
                return;
            case 1:
                String str = (String) this.c;
                int i19 = this.b;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, i19, tL_inputGroupCallSlug, false, null, null);
                k3VarArr[0].dismiss();
                return;
            case 2:
                ((wn) this.c).Wa((ArrayList) this.d, this.b, false, false);
                return;
            case 3:
                wn wnVar = (wn) this.c;
                int i20 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i21 = 0;
                wnVar.x0.w0(0, i20, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ch(editTextBoldCursor, i21), 100L);
                return;
            case 4:
                yl ylVar = (yl) this.c;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.d;
                int i22 = this.b;
                ylVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                hm hmVar = ylVar.a;
                hmVar.Q.j(i22, messageObject.getId(), true, messageObject.getDialogId() == hmVar.Q.b7 ? 1 : 0, true, 0);
                return;
            case 5:
                org.telegram.ui.Wallet.m5.F0(((org.telegram.ui.Components.al) this.c).getContext(), this.b, (org.telegram.ui.ActionBar.u6) this.d);
                return;
            case 6:
                org.telegram.ui.Components.go goVar = (org.telegram.ui.Components.go) this.c;
                int i23 = this.b;
                View view = (View) this.d;
                goVar.V = 0;
                goVar.U = i23;
                if (view instanceof org.telegram.ui.Cells.v8) {
                    goVar.X((org.telegram.ui.Cells.v8) view, true);
                    return;
                } else {
                    goVar.r.m(goVar.I0);
                    return;
                }
            case 7:
                org.telegram.ui.Components.nv nvVar = (org.telegram.ui.Components.nv) this.c;
                a0.h hVar = (a0.h) this.d;
                int i24 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = nvVar.a1.c;
                if (r2Var instanceof wn) {
                    wn wnVar2 = (wn) r2Var;
                    wnVar2.Z7();
                    undoView2 = wnVar2.K3;
                } else {
                    if (!(r2Var instanceof ProfileActivity)) {
                        undoView = null;
                        if (undoView == null) {
                            if (hVar.m() == 1) {
                                undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i24), 53);
                                return;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(i24), Integer.valueOf(hVar.m()), null, null);
                                return;
                            }
                        }
                        return;
                    }
                    undoView2 = ((ProfileActivity) r2Var).L;
                }
                undoView = undoView2;
                if (undoView == null) {
                }
            case 8:
                org.telegram.ui.Components.my myVar = (org.telegram.ui.Components.my) this.c;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.d;
                int i25 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var == null) {
                    return;
                }
                e2Var.setOnCancelListener(new bi.f0(myVar, i25, i15));
                e2VarArr[0].show();
                return;
            case 9:
                int i26 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i26;
                r2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new ig.u(r2Var2, i26, callback, i15));
                return;
            case 10:
                org.telegram.ui.Components.b40 b40Var = (org.telegram.ui.Components.b40) this.c;
                int i27 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                ig.a2 a2Var = b40Var.d;
                org.telegram.ui.Components.c40 c40Var = b40Var.w;
                if (i27 != b40Var.n) {
                    return;
                }
                b40Var.h = false;
                TLRPC.Chat chat = c40Var.V;
                org.telegram.ui.Components.fy0 fy0Var = c40Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = a2Var.h;
                    ArrayList arrayList3 = a2Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i28 = 0; i28 < size4; i28++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i28);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    a2Var.i();
                }
                int i29 = b40Var.f - 1;
                boolean z10 = fy0Var.getVisibility() == 0;
                b40Var.l();
                if (b40Var.f > i29) {
                    c40Var.J(i29);
                }
                if (b40Var.h || a2Var.e() || !c40Var.d.S0()) {
                    return;
                }
                fy0Var.e(false, z10);
                return;
            case 11:
                org.telegram.ui.Components.p40 p40Var = (org.telegram.ui.Components.p40) this.c;
                int i30 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = p40Var.Q;
                int i31 = p40Var.P;
                if (i30 != p40Var.V) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(p40Var.d0[0] ? "$" : "#");
                sb2.append(p40Var.a0);
                String sb3 = sb2.toString();
                di.t6 t6Var = p40Var.S;
                if (t6Var == null || !TextUtils.equals(t6Var.C, sb3)) {
                    p40Var.S = new di.t6(i31, null, sb3);
                }
                if (p40Var.S.i.size() <= 0) {
                    r10 = 1;
                    p40Var.S.p(4, true);
                } else {
                    r10 = 1;
                }
                p40Var.R = r10;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r10;
                p40Var.a0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject2 = (MessageObject) ic.a.g(r10, arrayList4);
                    tL_channels_searchPosts.offset_rate = p40Var.b0;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i31).getInputPeer(messageObject2.messageOwner.peer_id);
                }
                p40Var.W = ConnectionsManager.getInstance(i31).sendRequest(tL_channels_searchPosts, new ig.u(p40Var, i30, sb3, i16));
                return;
            case 12:
                org.telegram.ui.Components.p60 p60Var = (org.telegram.ui.Components.p60) this.c;
                int i32 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (p60Var.l0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i32);
                }
                if (p60Var.A0 && i32 == p60Var.z0) {
                    p60Var.q("camera open submitted: surface=" + i32);
                }
                if (!p60Var.r0) {
                    if (i32 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(p60Var.m0[0].getWidth(), p60Var.m0[0].getHeight());
                    p60Var.s0 = new CameraSession(p60Var.H, p60Var.m0[0], p60Var.n0, 256, true);
                    p60Var.w();
                    org.telegram.ui.Components.z50 z50Var = p60Var.l0;
                    CameraSession cameraSession = p60Var.s0;
                    Handler handler = z50Var.getHandler();
                    if (handler != null) {
                        z50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(p60Var.s0, surfaceTexture, new org.telegram.ui.Components.p50(p60Var, 1), new org.telegram.ui.Components.p50(p60Var, 2));
                    return;
                }
                if (p60Var.t0) {
                    Camera2Session camera2Session = p60Var.u0[i32];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i32 == 1) {
                    return;
                }
                org.telegram.ui.Components.z50 z50Var2 = p60Var.l0;
                Camera2Session camera2Session2 = p60Var.v0;
                Handler handler2 = z50Var2.getHandler();
                if (handler2 != null) {
                    z50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                p60Var.v0.open(surfaceTexture);
                return;
            case 13:
                org.telegram.ui.Components.h60 h60Var = (org.telegram.ui.Components.h60) this.c;
                int i33 = this.b;
                org.telegram.ui.Components.c60 c60Var2 = (org.telegram.ui.Components.c60) this.d;
                org.telegram.ui.Components.p60 p60Var2 = h60Var.H0;
                VideoEditedInfo videoEditedInfo = p60Var2.R;
                int i34 = p60Var2.e;
                org.telegram.ui.Components.a60 a60Var = p60Var2.h;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    p60Var2.R = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (p60Var2.R.needConvert()) {
                    p60Var2.L = null;
                    p60Var2.M = null;
                    p60Var2.N = null;
                    p60Var2.O = null;
                    VideoEditedInfo videoEditedInfo3 = p60Var2.R;
                    long j11 = videoEditedInfo3.estimatedDuration;
                    j10 = 0;
                    double d = j11;
                    c60Var = c60Var2;
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
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j14 / d) * p60Var2.P));
                    VideoEditedInfo videoEditedInfo4 = p60Var2.R;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j15 = videoEditedInfo4.startTime;
                    if (j15 > 0) {
                        videoEditedInfo4.startTime = j15 * 1000;
                    }
                    long j16 = videoEditedInfo4.endTime;
                    if (j16 > 0) {
                        videoEditedInfo4.endTime = j16 * 1000;
                    }
                    FileLoader.getInstance(i34).cancelFileUpload(p60Var2.e0.getAbsolutePath(), false);
                } else {
                    c60Var = c60Var2;
                    j10 = 0;
                    p60Var2.R.estimatedSize = Math.max(1L, p60Var2.P);
                }
                VideoEditedInfo videoEditedInfo5 = p60Var2.R;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = p60Var2.L;
                videoEditedInfo5.encryptedFile = p60Var2.M;
                videoEditedInfo5.key = p60Var2.N;
                videoEditedInfo5.iv = p60Var2.O;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = h60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = p60Var2.R;
                if (i33 != 1) {
                    h60Var.h(h60Var.a);
                    videoEditedInfo6.estimatedDuration = p60Var2.j0;
                    NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(p60Var2.U), videoEditedInfo6, h60Var.a.getAbsolutePath(), h60Var.A0);
                    return;
                }
                if (a60Var.c()) {
                    Activity parentActivity = a60Var.getParentActivity();
                    long a2 = a60Var.a();
                    org.telegram.ui.Components.qy qyVar = new org.telegram.ui.Components.qy(h60Var, c60Var, videoEditedInfo6, 2);
                    org.telegram.ui.Components.e60 e60Var = new org.telegram.ui.Components.e60(h60Var, 0);
                    org.telegram.ui.ActionBar.u6 u6Var = p60Var2.Y0;
                    Pattern pattern = org.telegram.ui.Components.g5.a;
                    org.telegram.ui.Components.g5.J(parentActivity, a2, -1L, 0, false, qyVar, e60Var, new org.telegram.ui.Components.d5(u6Var), u6Var);
                } else {
                    org.telegram.ui.Components.c60 c60Var3 = c60Var;
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, h60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (c60Var3 != null) {
                        photoEntry.ttl = c60Var3.c;
                        photoEntry.effectId = c60Var3.d;
                    }
                    p60Var2.h.r(photoEntry, videoEditedInfo6, c60Var3 == null || c60Var3.a, c60Var3 != null ? c60Var3.b : 0, 0, false, c60Var3 != null ? c60Var3.e : j10);
                }
                p60Var2.R = null;
                return;
            case 14:
                org.telegram.ui.Components.gk0 gk0Var = (org.telegram.ui.Components.gk0) this.c;
                int i35 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i36 = gk0Var.f;
                TextView textView = gk0Var.b;
                MessageObject messageObject3 = gk0Var.s;
                ImageView imageView = gk0Var.d;
                org.telegram.ui.Components.y9 y9Var = gk0Var.e;
                ArrayList arrayList5 = gk0Var.r;
                ArrayList arrayList6 = gk0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i35) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i35, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i35), i35 == arrayList6.size() ? String.valueOf(i35) : i35 + "/" + arrayList6.size());
                }
                if (gk0Var.getMeasuredWidth() > 0) {
                    gk0Var.v = gk0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject3.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i36).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            y9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            y9Var.setVisibility(0);
                            y9Var.setAlpha(0.0f);
                            y9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i37 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject3.messageOwner.from_id;
                                if (peer != null && user2.id != peer.user_id) {
                                    int i38 = 0;
                                    while (true) {
                                        if (i38 < arrayList.size()) {
                                            int i39 = i38;
                                            if (((org.telegram.ui.Components.fk0) arrayList.get(i38)).b == user2.id) {
                                                break;
                                            } else {
                                                i38 = i39 + 1;
                                            }
                                        } else {
                                            arrayList.add(new org.telegram.ui.Components.fk0(0, user2));
                                        }
                                    }
                                }
                                i10 = i37;
                            }
                            ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList8.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat2 = arrayList8.get(i11);
                                i11++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject3.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i40 = i17;
                                    while (true) {
                                        if (i40 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.fk0(0, chat3));
                                        } else if (((org.telegram.ui.Components.fk0) arrayList.get(i40)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i40++;
                                        }
                                    }
                                }
                                i17 = 0;
                            }
                            org.telegram.ui.Components.c10 c10Var = gk0Var.a;
                            org.telegram.ui.Components.m9 m9Var = gk0Var.c;
                            gk0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    m9Var.b(i12, ((org.telegram.ui.Components.fk0) arrayList.get(i12)).a, i36);
                                } else {
                                    m9Var.b(i12, null, i36);
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
                                    m9Var.setTranslationX(f7);
                                    m9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    m9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    c10Var.animate().alpha(0.0f).setDuration(220L).setListener(new lo(c10Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            m9Var.setTranslationX(f7);
                            m9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            m9Var.animate().alpha(1.0f).setDuration(220L).start();
                            c10Var.animate().alpha(0.0f).setDuration(220L).setListener(new lo(c10Var)).start();
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
                org.telegram.ui.Components.c10 c10Var2 = gk0Var.a;
                org.telegram.ui.Components.m9 m9Var2 = gk0Var.c;
                gk0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                m9Var2.setTranslationX(f7);
                m9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                m9Var2.animate().alpha(1.0f).setDuration(220L).start();
                c10Var2.animate().alpha(0.0f).setDuration(220L).setListener(new lo(c10Var2)).start();
                return;
            case 15:
                org.telegram.ui.Components.jr0 jr0Var = (org.telegram.ui.Components.jr0) this.c;
                int i41 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                org.telegram.ui.Components.hr0 hr0Var = jr0Var.e;
                org.telegram.ui.Components.nr0 nr0Var = jr0Var.K;
                if (i41 != jr0Var.r) {
                    return;
                }
                jr0Var.h();
                jr0Var.I = false;
                jr0Var.v = i41;
                if (jr0Var.s != i41) {
                    hr0Var.b();
                }
                org.telegram.ui.Components.oq0 oq0Var = nr0Var.G;
                org.telegram.ui.Components.jr0 jr0Var2 = nr0Var.N;
                if (oq0Var.getAdapter() != jr0Var2) {
                    org.telegram.ui.Components.nr0.C0(nr0Var);
                    jr0Var2.l();
                }
                for (int i42 = 0; i42 < arrayList9.size(); i42++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.br0) arrayList9.get(i42)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i14 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
                        MessagesController.getInstance(i14).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i13 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
                        MessagesController.getInstance(i13).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !jr0Var.d.isEmpty() && arrayList9.isEmpty();
                if (jr0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.nr0.C0(nr0Var);
                }
                jr0Var.d = arrayList9;
                hr0Var.f(arrayList9, null);
                int i43 = jr0Var.J;
                if (jr0Var.h() != 0 || hr0Var.e() || jr0Var.I) {
                    nr0Var.y0.b(i43);
                } else {
                    nr0Var.R.e(false, true);
                }
                jr0Var.l();
                nr0Var.M0(true);
                return;
            case 16:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.bw0) this.c).l1, (TL_stories.StoryItem) this.d);
                return;
            case 17:
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) this.c;
                bw0Var.Z(this.b, (org.telegram.ui.Components.nm0) this.d, false);
                bw0Var.M1 = null;
                return;
            case 18:
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i44 = this.b;
                if (r2Var3 instanceof wn) {
                    wn wnVar3 = (wn) r2Var3;
                    wnVar3.Z7();
                    undoView3 = wnVar3.K3;
                } else if (r2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) r2Var3).L;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar3.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i44), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i44), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 19:
                org.telegram.ui.Components.nv0 nv0Var = (org.telegram.ui.Components.nv0) this.c;
                int i45 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i45 != nv0Var.E) {
                    return;
                }
                nv0Var.y = ConnectionsManager.getInstance(nv0Var.d).sendRequest(tL_messages_search, new bi.l2(nv0Var, i45, i16));
                return;
            case 20:
                org.telegram.ui.Components.nv0 nv0Var2 = (org.telegram.ui.Components.nv0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i46 = this.b;
                ArrayList arrayList10 = nv0Var2.h;
                int i47 = nv0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i46 == nv0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i47).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i47).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i47).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i48 = 0; i48 < messages_messages.messages.size(); i48++) {
                        MessageObject messageObject4 = new MessageObject(i47, messages_messages.messages.get(i48), false, true);
                        if (messageObject4.hasValidGroupId()) {
                            messageObject4.isPrimaryGroupMessage = true;
                        }
                        messageObject4.setQuery(nv0Var2.w);
                        arrayList10.add(messageObject4);
                    }
                    nv0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        nv0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        nv0Var2.s = true;
                    }
                    nv0Var2.G(false);
                    nv0Var2.r = false;
                    nv0Var2.y = -1;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.ex0 ex0Var = (org.telegram.ui.Components.ex0) this.c;
                int i49 = this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                ex0Var.Y0 = false;
                if (!ex0Var.V0 && ex0Var.W0) {
                    ex0Var.C(true);
                    return;
                }
                ex0Var.m0 = ex0Var.f1[0];
                ex0Var.l();
                DownloadController.getInstance(i49).removeLoadingFileObserver(s1Var);
                ex0Var.I();
                ex0Var.x();
                return;
            case 22:
                int i50 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i50).getDatabase();
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
            case 23:
                int i51 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i51).getDatabase();
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
                                    callback2.run(Long.valueOf(r5.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e10) {
                                e = e10;
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
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 24:
                org.telegram.ui.Components.py0 py0Var = (org.telegram.ui.Components.py0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i52 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var4 = py0Var.a1.L;
                if (r2Var4 instanceof wn) {
                    wn wnVar4 = (wn) r2Var4;
                    wnVar4.Z7();
                    undoView4 = wnVar4.K3;
                } else if (r2Var4 instanceof ProfileActivity) {
                    undoView4 = ((ProfileActivity) r2Var4).L;
                }
                UndoView undoView6 = undoView4;
                if (undoView6 != null) {
                    if (hVar4.m() == 1) {
                        undoView6.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i52), 53);
                        return;
                    } else {
                        undoView6.k(0L, 53, Integer.valueOf(i52), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 25:
                org.telegram.ui.Components.uz0 uz0Var = (org.telegram.ui.Components.uz0) this.c;
                String str3 = (String) this.d;
                int i53 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(uz0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new org.telegram.ui.Components.as0(uz0Var, i53, str3, arrayList11));
                return;
            case 26:
                a();
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.as0((org.telegram.ui.Components.e31) this.c, (org.telegram.ui.Components.yp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 5));
                return;
            case 28:
                MessageObject messageObject5 = (MessageObject) this.c;
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.d;
                int i54 = this.b;
                HashMap hashMap = org.telegram.ui.Components.m41.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(org.telegram.ui.Components.m41.o(messageObject5)));
                }
                if (j1Var != null) {
                    j1Var.Z(3);
                }
                NotificationCenter.getInstance(i54).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject5);
                NotificationCenter.getInstance(i54).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.dc1 dc1Var = (org.telegram.ui.Components.dc1) this.c;
                int i55 = this.b;
                String str4 = (String) this.d;
                if (dc1Var.t || (cc1Var = dc1Var.I) == null) {
                    return;
                }
                if (i55 == 13) {
                    cc1Var.b(str4);
                    return;
                } else {
                    if (i55 == 14) {
                        cc1Var.a("1".equals(str4));
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str4);
                        dc1Var.I.i(jSONObject.getLong("id"), jSONObject.getString("data"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
        }
    }

    public /* synthetic */ g4(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ g4(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ g4(h4 h4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 0;
        this.c = h4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
