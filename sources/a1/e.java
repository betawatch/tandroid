package a1;

import a3.l0;
import ai.aa;
import ai.b1;
import ai.c3;
import ai.d2;
import ai.d9;
import ai.da;
import ai.e6;
import ai.f6;
import ai.fb;
import ai.h1;
import ai.h8;
import ai.i9;
import ai.ic;
import ai.j7;
import ai.jc;
import ai.k3;
import ai.k9;
import ai.l9;
import ai.m1;
import ai.q0;
import ai.r3;
import ai.s0;
import ai.t6;
import ai.v8;
import ai.w5;
import ai.x8;
import ai.y8;
import ai.y9;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.x1;
import ci.ac;
import ci.f4;
import ci.hc;
import ci.ja;
import ci.ka;
import ci.nc;
import ci.o8;
import ci.oc;
import e2.d0;
import i2.a0;
import i2.b0;
import i2.e0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.p;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.w1;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.np;
import org.telegram.ui.ProfileActivity;
import rg.x0;
import v0.i;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0164 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:32:0x00a6, B:35:0x00b6, B:37:0x00d6, B:39:0x00e1, B:41:0x00f5, B:43:0x00fb, B:46:0x014c, B:48:0x0164, B:49:0x0169, B:54:0x011f, B:56:0x0123), top: B:31:0x00a6 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        d2 d2Var;
        nc ncVar;
        ic icVar;
        int i10;
        boolean z10;
        int i11 = 12;
        String str = null;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (p) this.c);
                break;
            case 2:
                of.b bVar = (of.b) this.b;
                x1 x1Var = (x1) this.c;
                l0 l0Var = (l0) bVar.c;
                String str2 = d0.a;
                e0 e0Var = ((b0) l0Var).a;
                e0Var.h0 = x1Var;
                e0Var.m.e(25, new a0(x1Var));
                break;
            case 3:
                of.b bVar2 = (of.b) this.b;
                Exception exc = (Exception) this.c;
                l0 l0Var2 = (l0) bVar2.c;
                String str3 = d0.a;
                j2.f fVar = ((b0) l0Var2).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1030, new ga.a(p5, exc, 15));
                break;
            case 4:
                of.b bVar3 = (of.b) this.b;
                String str4 = (String) this.c;
                l0 l0Var3 = (l0) bVar3.c;
                String str5 = d0.a;
                j2.f fVar2 = ((b0) l0Var3).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1019, new ga.a(p10, str4, 22));
                break;
            case 5:
                ((jc) this.b).H(ProfileActivity.m4(((m1) this.c).c));
                break;
            case 6:
                r3 r3Var = (r3) this.b;
                AndroidUtilities.addToClipboard(((h1) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(r3Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 7:
                r3 r3Var2 = (r3) this.b;
                m1 m1Var = (m1) this.c;
                long j3 = m1Var.c;
                f6 f6Var = r3Var2.i0;
                if (j3 != UserConfig.getInstance(f6Var.C2).getClientUserId() && ((d2Var = r3Var2.h0.A0) == null || j3 != DialogObject.getPeerDialogId(d2Var.i()))) {
                    if (f6Var.O3 != null) {
                        for (int i12 = 0; i12 < f6Var.O3.peers.size(); i12++) {
                            if (j3 != DialogObject.getPeerDialogId(f6Var.O3.peers.get(i12).peer)) {
                            }
                        }
                    }
                    Context context = r3Var2.getContext();
                    long j10 = m1Var.c;
                    q0 q0Var = new q0(r7, r3Var2, m1Var);
                    b1 b1Var = new b1();
                    g3 g3Var = new g3(1, context, (org.telegram.ui.ActionBar.f6) b1Var, false);
                    g3Var.fixNavigationBar();
                    LinearLayout f7 = wl.f(context, 1);
                    TextView g10 = w1.g(context, 1, 20.0f);
                    g10.setTextColor(b1Var.G0(j6.j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f7.addView(g10, x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    l4 l4Var = new l4(context, b1Var);
                    l4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f7.addView(l4Var, x5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final z1 z1Var = new z1(4, 21, context, b1Var, true);
                    np checkBoxRound = z1Var.getCheckBoxRound();
                    int i13 = j6.V6;
                    int i14 = j6.g7;
                    int i15 = j6.k7;
                    checkBoxRound.b(i13, i14, i15);
                    z1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    z1Var.setOnClickListener(new View.OnClickListener() { // from class: ai.r0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    z1Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    z1Var.c(!r3.b(), true);
                                    break;
                                default:
                                    z1Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i16 = j6.i6;
                    z1Var.setBackground(j6.f0(b1Var.G0(i16), 2, -1));
                    f7.addView(z1Var, x5.n(-1, -2));
                    final z1 z1Var2 = new z1(4, 21, context, b1Var, true);
                    z1Var2.getCheckBoxRound().b(i13, i14, i15);
                    final int i17 = 1;
                    z1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j10)), null, false, true, false);
                    z1Var2.setOnClickListener(new View.OnClickListener() { // from class: ai.r0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i17) {
                                case 0:
                                    z1Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    z1Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    z1Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    z1Var2.setBackground(j6.f0(b1Var.G0(i16), 2, -1));
                    f7.addView(z1Var2, x5.n(-1, -2));
                    final z1 z1Var3 = new z1(4, 21, context, b1Var, true);
                    z1Var3.getCheckBoxRound().b(i13, i14, i15);
                    z1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j10)), null, false, false, false);
                    final int i18 = 2;
                    z1Var3.setOnClickListener(new View.OnClickListener() { // from class: ai.r0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    z1Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    z1Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    z1Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    z1Var3.setBackground(j6.f0(b1Var.G0(i16), 2, -1));
                    f7.addView(z1Var3, x5.n(-1, -2));
                    e9 e9Var = new e9(context, b1Var);
                    e9Var.setBackgroundColor(-16777216);
                    e9Var.setFixedSize(12);
                    f7.addView(e9Var, x5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    ci.d dVar = new ci.d(context, b1Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new s0(z1Var, z1Var2, z1Var3, q0Var, g3Var, 0));
                    frameLayout.addView(dVar, x5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f7.addView(frameLayout, x5.n(-1, -2));
                    g3Var.setCustomView(f7);
                    g3Var.show();
                    break;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = r3Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(m1Var.a));
                ConnectionsManager.getInstance(r3Var2.N).sendRequest(deletegroupcallmessages, null);
                r3Var2.c(m1Var.a);
                break;
            case 8:
                d2 d2Var2 = (d2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                d2Var2.getClass();
                int size = arrayList.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(d2Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 9:
                ((d2) this.b).F.remove((String) this.c);
                break;
            case 10:
                f6 f6Var2 = (f6) this.b;
                f4 f4Var = (f4) this.c;
                f6Var2.removeView(f4Var);
                if (f6Var2.d2 == f4Var) {
                    f6Var2.d2 = null;
                    break;
                }
                break;
            case 11:
                f6 f6Var3 = (f6) this.b;
                oc E = oc.E((Activity) this.c, f6Var3.C2);
                e6 e6Var = f6Var3.M2;
                long j11 = (e6Var == null || (icVar = (ic) e6Var.c) == null) ? 0L : icVar.currentPosition;
                File h = f6Var3.O1.h();
                TL_stories.StoryItem storyItem = f6Var3.O1.a;
                o8 o8Var = new o8();
                o8Var.n = true;
                o8Var.t = storyItem.media;
                int i20 = o8Var.a;
                o8Var.q = MessagesController.getInstance(i20).getPeer(storyItem.dialogId);
                o8Var.r = storyItem.id;
                o8Var.s = storyItem.caption;
                o8Var.L = h;
                o8Var.M = false;
                o8Var.k0 = 720;
                o8Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    o8Var.K = false;
                    if (h != null) {
                        o8Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    o8Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i21);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    o8Var.k0 = documentAttribute.w;
                                    o8Var.l0 = documentAttribute.h;
                                    o8Var.i = documentAttribute.duration;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str6 = storyItem.firstFramePath;
                        if (str6 != null) {
                            o8Var.N = str6;
                        } else if (document2.thumbs != null) {
                            for (int i22 = 0; i22 < storyItem.media.document.thumbs.size(); i22++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i22);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    o8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i20).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        o8Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                o8Var.A();
                o8Var.e(storyItem);
                hc d = ci.jc.d(f6Var3.J0);
                RectF rectF = E.H;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i23 = E.c;
                if (!E.d) {
                    if (MessagesController.getInstance(i23).isFrozen()) {
                        org.telegram.ui.b.b(i23);
                    } else {
                        E.u0 = false;
                        E.e = false;
                        E.B2 = false;
                        if (windowManager != null && (ncVar = E.n) != null && ncVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.K1 = o8Var;
                        ja.a(i23, o8Var);
                        o8 o8Var2 = E.K1;
                        E.O1 = (o8Var2 == null || !o8Var2.K) ? 0 : 1;
                        E.s0.g = false;
                        if (d != null) {
                            E.F = d;
                            E.J = d.a;
                            rectF.set(d.c);
                            E.G = d.b;
                            E.F.e();
                        } else {
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                        }
                        E.r.c();
                        ac acVar = E.h0;
                        int i24 = E.J;
                        acVar.setBackgroundColor((i24 == 1 || i24 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.K = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        o8 o8Var3 = E.K1;
                        if (o8Var3 != null) {
                            E.c1.setText(o8Var3.C0);
                        }
                        E.L(new ka(E, 7), j11);
                        E.b1.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.v0 = 0L;
                        E.w0 = "";
                    }
                }
                E.Q = new c3(f6Var3, i11);
                E.R = new k3(r7, f6Var3, E);
                break;
            case 12:
                w5 w5Var = (w5) this.b;
                jc jcVar = (jc) this.c;
                w5Var.getClass();
                ((ai.ac) w5Var.l.Q1).h(new x0(jcVar.f, 14, false));
                break;
            case 13:
                t6 t6Var = (t6) this.b;
                String str7 = (String) this.c;
                t6Var.h = null;
                j7 j7Var = t6Var.n;
                j7Var.Q = false;
                j7Var.O.c = str7.toLowerCase();
                j7.b(j7Var);
                break;
            case 14:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 15:
                v8 v8Var = (v8) this.b;
                TLObject tLObject = (TLObject) this.c;
                y8 y8Var = v8Var.q;
                int i25 = v8Var.c;
                ArrayList arrayList2 = v8Var.i;
                v8Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i25).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i25).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i26);
                        i26++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        MessageObject messageObject = new MessageObject(i25, tL_foundStory2.storyItem);
                        messageObject.generateThumbs(false);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(Integer.valueOf(arrayList2.size()));
                        v8Var.F.add(arrayList4);
                        arrayList2.add(messageObject);
                    }
                    v8Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        v8Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    v8Var.H = str;
                    v8Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(y8Var);
                    AndroidUtilities.runOnUIThread(y8Var);
                    break;
                }
                break;
            case 16:
                x8 x8Var = (x8) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = x8Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                x8Var.d = true;
                x8Var.e = false;
                x8Var.d();
                NotificationCenter.getInstance(x8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(x8Var.b), x8Var);
                break;
            case 17:
                x8 x8Var2 = (x8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = x8Var2.g;
                ArrayList arrayList7 = x8Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                    int size3 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i27);
                        i27++;
                        arrayList8.add(ai.e9.a(tL_storyAlbum));
                    }
                    arrayList7.clear();
                    arrayList7.addAll(arrayList8);
                    arrayList6.clear();
                    arrayList6.addAll(arrayList8);
                    x8Var2.f = true;
                    x8Var2.e = false;
                    x8Var2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList6);
                    x8Var2.f = true;
                    x8Var2.e = false;
                    NotificationCenter.getInstance(x8Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(x8Var2.b), x8Var2);
                    break;
                }
                break;
            case 18:
                d9 d9Var = (d9) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                d9Var.getClass();
                callback2.run(d9Var);
                break;
            case 19:
                MessagesController.getInstance(((k9) this.b).M.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                break;
            case 20:
                k9 k9Var = (k9) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                o8 o8Var4 = k9Var.c;
                o8Var4.w = true;
                l9 l9Var = k9Var.M;
                if (l9Var.n(tL_error2)) {
                    o8Var4.x = null;
                } else {
                    o8Var4.x = tL_error2;
                }
                k9Var.d = true;
                k9Var.I = true;
                k9Var.H = true;
                l9Var.w.d(o8Var4);
                break;
            case 21:
                k9 k9Var2 = (k9) this.b;
                k9Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new i9(k9Var2, r7));
                break;
            case 22:
                y9.a((y9) this.b, (h8) this.c);
                break;
            case 23:
                ((h8) this.b).accept((TL_stories.TL_stories_allStories) this.c);
                break;
            case 24:
                y9 y9Var = (y9) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = y9Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i28 = storyItem2.id;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i28, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                fb.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        queryFinalized.dispose();
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i28).stepThis().dispose();
                        if (z10) {
                            i10 = -1;
                            SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                            r7 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            break;
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            y9Var.l(peerDialogId, storyItem2);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i28, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    }
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 25:
                y9 y9Var2 = (y9) this.b;
                h8 h8Var = (h8) this.c;
                MessagesStorage messagesStorage2 = y9Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e) {
                    messagesStorage2.checkSQLException(e);
                }
                AndroidUtilities.runOnUIThread(new e(27, h8Var, longSparseIntArray));
                break;
            case 26:
                ((y9) this.b).j((ArrayList) this.c);
                break;
            case 27:
                ((h8) this.b).b.f = (LongSparseIntArray) this.c;
                break;
            case 28:
                da daVar = (da) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!daVar.b) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Runnable[] runnableArr = (Runnable[]) this.b;
                da daVar2 = (da) this.c;
                runnableArr[0] = null;
                ((e) daVar2.d).run();
                aa aaVar = (aa) daVar2.e;
                if (aaVar != null) {
                    aaVar.onDetachedFromWindow();
                    break;
                }
                break;
        }
    }
}
