package a1;

import a3.l0;
import ai.aa;
import ai.ac;
import ai.b1;
import ai.c3;
import ai.d2;
import ai.d9;
import ai.da;
import ai.e6;
import ai.fb;
import ai.h1;
import ai.i9;
import ai.ic;
import ai.jc;
import ai.k3;
import ai.k7;
import ai.k9;
import ai.l9;
import ai.m1;
import ai.q0;
import ai.r3;
import ai.s0;
import ai.t6;
import ai.v5;
import ai.v8;
import ai.x8;
import ai.y8;
import ai.y9;
import ai.z7;
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
import ci.e4;
import ci.ec;
import ci.ga;
import ci.gc;
import ci.ha;
import ci.kc;
import ci.l8;
import ci.lc;
import ci.xb;
import e2.d0;
import hg.r;
import i2.b0;
import i2.c0;
import i2.f0;
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
import org.telegram.messenger.ok;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.op;
import org.telegram.ui.ProfileActivity;
import rg.x0;
import v0.i;
import w7.y5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[Catch: all -> 0x010a, TryCatch #1 {all -> 0x010a, blocks: (B:36:0x00c0, B:39:0x00d0, B:41:0x00f0, B:43:0x00fb, B:45:0x010f, B:47:0x0115, B:50:0x0166, B:52:0x017e, B:53:0x0183, B:58:0x0139, B:60:0x013d), top: B:35:0x00c0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        d2 d2Var;
        kc kcVar;
        ic icVar;
        int i10;
        boolean z10;
        int i11 = 12;
        int i12 = 14;
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
                f0 f0Var = ((c0) l0Var).a;
                f0Var.h0 = x1Var;
                f0Var.m.e(25, new b0(x1Var));
                break;
            case 3:
                of.b bVar2 = (of.b) this.b;
                Exception exc = (Exception) this.c;
                l0 l0Var2 = (l0) bVar2.c;
                String str3 = d0.a;
                j2.f fVar = ((c0) l0Var2).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1030, new r(p5, exc, i12));
                break;
            case 4:
                of.b bVar3 = (of.b) this.b;
                String str4 = (String) this.c;
                l0 l0Var3 = (l0) bVar3.c;
                String str5 = d0.a;
                j2.f fVar2 = ((c0) l0Var3).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1019, new r(p10, str4, 21));
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
                e6 e6Var = r3Var2.i0;
                if (j3 != UserConfig.getInstance(e6Var.C2).getClientUserId() && ((d2Var = r3Var2.h0.A0) == null || j3 != DialogObject.getPeerDialogId(d2Var.i()))) {
                    if (e6Var.O3 != null) {
                        for (int i13 = 0; i13 < e6Var.O3.peers.size(); i13++) {
                            if (j3 != DialogObject.getPeerDialogId(e6Var.O3.peers.get(i13).peer)) {
                            }
                        }
                    }
                    Context context = r3Var2.getContext();
                    long j10 = m1Var.c;
                    q0 q0Var = new q0(r8, r3Var2, m1Var);
                    b1 b1Var = new b1();
                    e3 e3Var = new e3(1, context, (d6) b1Var, false);
                    e3Var.fixNavigationBar();
                    LinearLayout f7 = ok.f(context, 1);
                    TextView f10 = org.telegram.messenger.f0.f(context, 1, 20.0f);
                    f10.setTextColor(b1Var.G0(h6.j5));
                    f10.setTypeface(AndroidUtilities.bold());
                    f10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f7.addView(f10, y5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    m4 m4Var = new m4(context, b1Var);
                    m4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f7.addView(m4Var, y5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final a2 a2Var = new a2(4, 21, context, b1Var, true);
                    op checkBoxRound = a2Var.getCheckBoxRound();
                    int i14 = h6.V6;
                    int i15 = h6.g7;
                    int i16 = h6.k7;
                    checkBoxRound.b(i14, i15, i16);
                    a2Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    a2Var.setOnClickListener(new View.OnClickListener() { // from class: ai.r0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    a2Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    a2Var.c(!r3.b(), true);
                                    break;
                                default:
                                    a2Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i17 = h6.i6;
                    a2Var.setBackground(h6.f0(b1Var.G0(i17), 2, -1));
                    f7.addView(a2Var, y5.n(-1, -2));
                    final a2 a2Var2 = new a2(4, 21, context, b1Var, true);
                    a2Var2.getCheckBoxRound().b(i14, i15, i16);
                    final int i18 = 1;
                    a2Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j10)), null, false, true, false);
                    a2Var2.setOnClickListener(new View.OnClickListener() { // from class: ai.r0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    a2Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    a2Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    a2Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    a2Var2.setBackground(h6.f0(b1Var.G0(i17), 2, -1));
                    f7.addView(a2Var2, y5.n(-1, -2));
                    final a2 a2Var3 = new a2(4, 21, context, b1Var, true);
                    a2Var3.getCheckBoxRound().b(i14, i15, i16);
                    a2Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j10)), null, false, false, false);
                    final int i19 = 2;
                    a2Var3.setOnClickListener(new View.OnClickListener() { // from class: ai.r0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    a2Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    a2Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    a2Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    a2Var3.setBackground(h6.f0(b1Var.G0(i17), 2, -1));
                    f7.addView(a2Var3, y5.n(-1, -2));
                    e9 e9Var = new e9(context, b1Var);
                    e9Var.setBackgroundColor(-16777216);
                    e9Var.setFixedSize(12);
                    f7.addView(e9Var, y5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    ci.d dVar = new ci.d(context, b1Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new s0(a2Var, a2Var2, a2Var3, q0Var, e3Var, 0));
                    frameLayout.addView(dVar, y5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f7.addView(frameLayout, y5.n(-1, -2));
                    e3Var.setCustomView(f7);
                    e3Var.show();
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
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(d2Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 9:
                ((d2) this.b).F.remove((String) this.c);
                break;
            case 10:
                e6 e6Var2 = (e6) this.b;
                e4 e4Var = (e4) this.c;
                e6Var2.removeView(e4Var);
                if (e6Var2.d2 == e4Var) {
                    e6Var2.d2 = null;
                    break;
                }
                break;
            case 11:
                e6 e6Var3 = (e6) this.b;
                lc E = lc.E((Activity) this.c, e6Var3.C2);
                ai.d6 d6Var = e6Var3.M2;
                long j11 = (d6Var == null || (icVar = (ic) d6Var.c) == null) ? 0L : icVar.currentPosition;
                File h = e6Var3.O1.h();
                TL_stories.StoryItem storyItem = e6Var3.O1.a;
                l8 l8Var = new l8();
                l8Var.n = true;
                l8Var.t = storyItem.media;
                int i21 = l8Var.a;
                l8Var.q = MessagesController.getInstance(i21).getPeer(storyItem.dialogId);
                l8Var.r = storyItem.id;
                l8Var.s = storyItem.caption;
                l8Var.L = h;
                l8Var.M = false;
                l8Var.k0 = 720;
                l8Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    l8Var.K = false;
                    if (h != null) {
                        l8Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    l8Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i22 = 0;
                        while (true) {
                            if (i22 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i22);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    l8Var.k0 = documentAttribute.w;
                                    l8Var.l0 = documentAttribute.h;
                                    l8Var.i = documentAttribute.duration;
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str6 = storyItem.firstFramePath;
                        if (str6 != null) {
                            l8Var.N = str6;
                        } else if (document2.thumbs != null) {
                            for (int i23 = 0; i23 < storyItem.media.document.thumbs.size(); i23++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i23);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    l8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i21).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        l8Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                l8Var.A();
                l8Var.e(storyItem);
                ec d = gc.d(e6Var3.J0);
                RectF rectF = E.H;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i24 = E.c;
                if (!E.d) {
                    if (MessagesController.getInstance(i24).isFrozen()) {
                        org.telegram.ui.b.b(i24);
                    } else {
                        E.u0 = false;
                        E.e = false;
                        E.B2 = false;
                        if (windowManager != null && (kcVar = E.n) != null && kcVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.K1 = l8Var;
                        ga.a(i24, l8Var);
                        l8 l8Var2 = E.K1;
                        E.O1 = (l8Var2 == null || !l8Var2.K) ? 0 : 1;
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
                        xb xbVar = E.h0;
                        int i25 = E.J;
                        xbVar.setBackgroundColor((i25 == 1 || i25 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.K = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        l8 l8Var3 = E.K1;
                        if (l8Var3 != null) {
                            E.c1.setText(l8Var3.C0);
                        }
                        E.L(new ha(E, 7), j11);
                        E.b1.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.v0 = 0L;
                        E.w0 = "";
                    }
                }
                E.Q = new c3(e6Var3, i11);
                E.R = new k3(r8, e6Var3, E);
                break;
            case 12:
                v5 v5Var = (v5) this.b;
                jc jcVar = (jc) this.c;
                v5Var.getClass();
                ((ac) v5Var.l.Q1).h(new x0(jcVar.f, 14, false));
                break;
            case 13:
                t6 t6Var = (t6) this.b;
                String str7 = (String) this.c;
                t6Var.h = null;
                k7 k7Var = t6Var.n;
                k7Var.Q = false;
                k7Var.O.c = str7.toLowerCase();
                k7.b(k7Var);
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
                int i26 = v8Var.c;
                ArrayList arrayList2 = v8Var.i;
                v8Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i26).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i26).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i27 = 0;
                    while (i27 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i27);
                        i27++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        MessageObject messageObject = new MessageObject(i26, tL_foundStory2.storyItem);
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
                    int i28 = 0;
                    while (i28 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i28);
                        i28++;
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
                l8 l8Var4 = k9Var.c;
                l8Var4.w = true;
                l9 l9Var = k9Var.M;
                if (l9Var.n(tL_error2)) {
                    l8Var4.x = null;
                } else {
                    l8Var4.x = tL_error2;
                }
                k9Var.d = true;
                k9Var.I = true;
                k9Var.H = true;
                l9Var.w.d(l8Var4);
                break;
            case 21:
                k9 k9Var2 = (k9) this.b;
                k9Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new i9(k9Var2, r8));
                break;
            case 22:
                y9 y9Var = (y9) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = y9Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i29 = storyItem2.id;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i29, new Object[0]);
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
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i29).stepThis().dispose();
                        if (z10) {
                            i10 = -1;
                            SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                            r8 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            database.executeFast("UPDATE stories_counter SET count = " + (r8 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            break;
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r8 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            y9Var.l(peerDialogId, storyItem2);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i29, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r8 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r8 + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    }
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 23:
                y9.a((y9) this.b, (z7) this.c);
                break;
            case 24:
                y9 y9Var2 = (y9) this.b;
                z7 z7Var = (z7) this.c;
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
                AndroidUtilities.runOnUIThread(new e(27, z7Var, longSparseIntArray));
                break;
            case 25:
                ((z7) this.b).run((TL_stories.TL_stories_allStories) this.c);
                break;
            case 26:
                ((y9) this.b).j((ArrayList) this.c);
                break;
            case 27:
                ((z7) this.b).b.f = (LongSparseIntArray) this.c;
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
