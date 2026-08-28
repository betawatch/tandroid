package h3;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import g7.e6;
import ih.b4;
import ih.d9;
import ih.g5;
import ih.h4;
import ih.h6;
import ih.i4;
import ih.i7;
import ih.j6;
import ih.j8;
import ih.k6;
import ih.l9;
import ih.m9;
import ih.n6;
import ih.o6;
import ih.r4;
import ih.s6;
import ih.u6;
import ih.v6;
import ih.y5;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kh.a8;
import kh.ib;
import kh.pb;
import kh.rb;
import kh.u9;
import kh.v9;
import kh.vb;
import kh.wb;
import kh.x3;
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
import org.telegram.messenger.ll;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0147 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:24:0x0089, B:27:0x0099, B:29:0x00b9, B:31:0x00c4, B:33:0x00d8, B:35:0x00de, B:38:0x012f, B:40:0x0147, B:41:0x014c, B:46:0x0102, B:48:0x0106), top: B:23:0x0089 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ih.f1 f1Var;
        vb vbVar;
        l9 l9Var;
        int i9;
        boolean z10;
        int i10 = 12;
        String str = null;
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList = h0Var.a.m0;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((k61) ((e5.t) obj)).F.onSurfaceTextureUpdated(surfaceTexture);
                }
                break;
            case 1:
                hg.s sVar = (hg.s) this.b;
                t5 t5Var = (t5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                for (t5 t5Var2 : (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class)) {
                    if (t5Var2 == t5Var) {
                        int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(t5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(t5Var2);
                        sVar.n.getText().delete(spanStart, spanEnd);
                        int i12 = spanEnd - spanStart;
                        hg.p pVar = sVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i12;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            case 2:
                hg.s sVar2 = (hg.s) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (sVar2.M == null || !tL_error.text.equals("BOOSTS_REQUIRED")) {
                    String str2 = tL_error.text;
                    if (str2.equals("REACTIONS_TOO_MANY")) {
                        str2 = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.F, new Object[0]);
                    }
                    oc.a0(sVar2).t(str2, null).j();
                    break;
                } else {
                    hg.t0.f(-sVar2.I, sVar2.N, sVar2.M);
                    break;
                }
                break;
            case 3:
                hg.q qVar = (hg.q) this.b;
                t5 t5Var3 = (t5) this.c;
                hg.s sVar3 = qVar.a2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.n.getText());
                for (t5 t5Var4 : (t5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), t5.class)) {
                    if (t5Var4 == t5Var3) {
                        int editTextSelectionEnd2 = sVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(t5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(t5Var4);
                        sVar3.n.getText().delete(spanStart2, spanEnd2);
                        int i13 = spanEnd2 - spanStart2;
                        hg.p pVar2 = sVar3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i13;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        break;
                    }
                }
                break;
            case 4:
                hg.e0 e0Var = (hg.e0) this.b;
                uj0 uj0Var = (uj0) this.c;
                e0Var.l = true;
                e0Var.a.invalidate();
                uj0Var.X0 = false;
                uj0Var.invalidate();
                e0Var.c(true);
                break;
            case 5:
                hg.g0 g0Var = (hg.g0) this.b;
                hg.b bVar = (hg.b) this.c;
                g0Var.getText().delete(g0Var.getText().getSpanStart(bVar), g0Var.getText().getSpanEnd(bVar));
                g0Var.setCursorVisible(true);
                g0Var.setLongClickable(true);
                break;
            case 6:
                hg.s0 s0Var = (hg.s0) this.b;
                hg.p0 p0Var = (hg.p0) this.c;
                s0Var.getClass();
                TLRPC.ReactionCount reactionCount = p0Var.a;
                ViewParent viewParent = s0Var.z;
                if (e2.c.v(viewParent)) {
                    ((o4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                p0Var.Y.c(false);
                s0Var.S = null;
                s0Var.T = false;
                s0Var.U = null;
                break;
            case 7:
                ((m9) this.b).H(ProfileActivity.m4(((ih.u0) this.c).c));
                break;
            case 8:
                ih.h2 h2Var = (ih.h2) this.b;
                AndroidUtilities.addToClipboard(((ih.p0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(h2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 9:
                ih.h2 h2Var2 = (ih.h2) this.b;
                ih.u0 u0Var = (ih.u0) this.c;
                long j10 = u0Var.c;
                i4 i4Var = h2Var2.e0;
                if (j10 != UserConfig.getInstance(i4Var.y2).getClientUserId() && ((f1Var = h2Var2.d0.w0) == null || j10 != DialogObject.getPeerDialogId(f1Var.i()))) {
                    if (i4Var.K3 != null) {
                        for (int i14 = 0; i14 < i4Var.K3.peers.size(); i14++) {
                            if (j10 != DialogObject.getPeerDialogId(i4Var.K3.peers.get(i14).peer)) {
                            }
                        }
                    }
                    Context context = h2Var2.getContext();
                    long j11 = u0Var.c;
                    ih.b0 b0Var = new ih.b0(r9, h2Var2, u0Var);
                    ih.k0 k0Var = new ih.k0();
                    f3 f3Var = new f3(context, k0Var, false, false);
                    f3Var.fixNavigationBar();
                    LinearLayout f10 = ll.f(context, 1);
                    TextView g10 = org.telegram.messenger.l0.g(context, 1, 20.0f);
                    g10.setTextColor(k0Var.N0(f6.j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f10.addView(g10, e6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    m4 m4Var = new m4(context, k0Var);
                    m4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f10.addView(m4Var, e6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, context, k0Var, true);
                    dp checkBoxRound = z1Var.getCheckBoxRound();
                    int i15 = f6.V6;
                    int i16 = f6.g7;
                    int i17 = f6.k7;
                    checkBoxRound.b(i15, i16, i17);
                    z1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    z1Var.setOnClickListener(new View.OnClickListener() { // from class: ih.c0
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
                    int i18 = f6.i6;
                    z1Var.setBackground(f6.f0(k0Var.N0(i18), 2, -1));
                    f10.addView(z1Var, e6.n(-1, -2));
                    final org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, context, k0Var, true);
                    z1Var2.getCheckBoxRound().b(i15, i16, i17);
                    final int i19 = 1;
                    z1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    z1Var2.setOnClickListener(new View.OnClickListener() { // from class: ih.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
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
                    z1Var2.setBackground(f6.f0(k0Var.N0(i18), 2, -1));
                    f10.addView(z1Var2, e6.n(-1, -2));
                    final org.telegram.ui.Cells.z1 z1Var3 = new org.telegram.ui.Cells.z1(4, 21, context, k0Var, true);
                    z1Var3.getCheckBoxRound().b(i15, i16, i17);
                    z1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i20 = 2;
                    z1Var3.setOnClickListener(new View.OnClickListener() { // from class: ih.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
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
                    z1Var3.setBackground(f6.f0(k0Var.N0(i18), 2, -1));
                    f10.addView(z1Var3, e6.n(-1, -2));
                    b9 b9Var = new b9(context, k0Var);
                    b9Var.setBackgroundColor(-16777216);
                    b9Var.setFixedSize(12);
                    f10.addView(b9Var, e6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    kh.d dVar = new kh.d(context, k0Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new ih.d0(z1Var, z1Var2, z1Var3, b0Var, f3Var, 0));
                    frameLayout.addView(dVar, e6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, e6.n(-1, -2));
                    f3Var.setCustomView(f10);
                    f3Var.show();
                    break;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = h2Var2.K;
                deletegroupcallmessages.messages.add(Integer.valueOf(u0Var.a));
                ConnectionsManager.getInstance(h2Var2.J).sendRequest(deletegroupcallmessages, null);
                h2Var2.c(u0Var.a);
                break;
            case 10:
                ih.f1 f1Var2 = (ih.f1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                f1Var2.getClass();
                int size2 = arrayList2.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj2 = arrayList2.get(i21);
                    i21++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj2;
                    NotificationCenter.getInstance(f1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 11:
                ((ih.f1) this.b).B.remove((String) this.c);
                break;
            case 12:
                i4 i4Var2 = (i4) this.b;
                x3 x3Var = (x3) this.c;
                i4Var2.removeView(x3Var);
                if (i4Var2.Z1 == x3Var) {
                    i4Var2.Z1 = null;
                    break;
                }
                break;
            case 13:
                i4 i4Var3 = (i4) this.b;
                wb E = wb.E((Activity) this.c, i4Var3.y2);
                h4 h4Var = i4Var3.I2;
                long j12 = (h4Var == null || (l9Var = h4Var.b) == null) ? 0L : l9Var.currentPosition;
                File h = i4Var3.K1.h();
                TL_stories.StoryItem storyItem = i4Var3.K1.a;
                a8 a8Var = new a8();
                a8Var.n = true;
                a8Var.t = storyItem.media;
                int i22 = a8Var.a;
                a8Var.q = MessagesController.getInstance(i22).getPeer(storyItem.dialogId);
                a8Var.r = storyItem.id;
                a8Var.s = storyItem.caption;
                a8Var.L = h;
                a8Var.M = false;
                a8Var.k0 = 720;
                a8Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    a8Var.K = false;
                    if (h != null) {
                        a8Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    a8Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i23 = 0;
                        while (true) {
                            if (i23 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i23);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    a8Var.k0 = documentAttribute.w;
                                    a8Var.l0 = documentAttribute.h;
                                    a8Var.i = documentAttribute.duration;
                                } else {
                                    i23++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str3 = storyItem.firstFramePath;
                        if (str3 != null) {
                            a8Var.N = str3;
                        } else if (document2.thumbs != null) {
                            for (int i24 = 0; i24 < storyItem.media.document.thumbs.size(); i24++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i24);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    a8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i22).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        a8Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                a8Var.A();
                a8Var.e(storyItem);
                pb d = rb.d(i4Var3.F0);
                RectF rectF = E.D;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i25 = E.c;
                if (!E.d) {
                    if (MessagesController.getInstance(i25).isFrozen()) {
                        org.telegram.ui.b.b(i25);
                    } else {
                        E.q0 = false;
                        E.e = false;
                        E.x2 = false;
                        if (windowManager != null && (vbVar = E.n) != null && vbVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.G1 = a8Var;
                        u9.a(i25, a8Var);
                        a8 a8Var2 = E.G1;
                        E.K1 = (a8Var2 == null || !a8Var2.K) ? 0 : 1;
                        E.o0.g = false;
                        if (d != null) {
                            E.B = d;
                            E.F = d.a;
                            rectF.set(d.c);
                            E.C = d.b;
                            E.B.e();
                        } else {
                            E.F = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.C = AndroidUtilities.dp(8.0f);
                        }
                        E.r.c();
                        ib ibVar = E.d0;
                        int i26 = E.F;
                        ibVar.setBackgroundColor((i26 == 1 || i26 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.G = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        a8 a8Var3 = E.G1;
                        if (a8Var3 != null) {
                            E.Y0.setText(a8Var3.C0);
                        }
                        E.L(new v9(E, 7), j12);
                        E.X0.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.r0 = 0L;
                        E.s0 = "";
                    }
                }
                E.M = new ih.x1(i4Var3, i10);
                E.N = new ih.c2(r9, i4Var3, E);
                break;
            case 14:
                b4 b4Var = (b4) this.b;
                m9 m9Var = (m9) this.c;
                b4Var.getClass();
                ((d9) b4Var.l.M1).h(new zf.x0(m9Var.f, 14, false));
                break;
            case 15:
                r4 r4Var = (r4) this.b;
                String str4 = (String) this.c;
                r4Var.h = null;
                g5 g5Var = r4Var.n;
                g5Var.M = false;
                g5Var.K.c = str4.toLowerCase();
                g5.b(g5Var);
                break;
            case 16:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error2 == null));
                    break;
                }
                break;
            case 17:
                h6 h6Var = (h6) this.b;
                TLObject tLObject = (TLObject) this.c;
                k6 k6Var = h6Var.q;
                int i27 = h6Var.c;
                ArrayList arrayList3 = h6Var.i;
                h6Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i27).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i27).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList4 = tL_foundStories.stories;
                    int size3 = arrayList4.size();
                    int i28 = 0;
                    while (i28 < size3) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList4.get(i28);
                        i28++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList3.size();
                        MessageObject messageObject = new MessageObject(i27, tL_foundStory2.storyItem);
                        messageObject.generateThumbs(false);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(Integer.valueOf(arrayList3.size()));
                        h6Var.F.add(arrayList5);
                        arrayList3.add(messageObject);
                    }
                    h6Var.J = Math.max(arrayList3.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        h6Var.J = arrayList3.size();
                    }
                    if (arrayList3.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    h6Var.H = str;
                    h6Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(k6Var);
                    AndroidUtilities.runOnUIThread(k6Var);
                    break;
                }
                break;
            case 18:
                j6 j6Var = (j6) this.b;
                List list = (List) this.c;
                ArrayList arrayList6 = j6Var.h;
                arrayList6.clear();
                arrayList6.addAll(list);
                j6Var.d = true;
                j6Var.e = false;
                j6Var.d();
                NotificationCenter.getInstance(j6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j6Var.b), j6Var);
                break;
            case 19:
                j6 j6Var2 = (j6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList7 = j6Var2.g;
                ArrayList arrayList8 = j6Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList9 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList10 = tL_albums.albums;
                    int size4 = arrayList10.size();
                    int i29 = 0;
                    while (i29 < size4) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList10.get(i29);
                        i29++;
                        arrayList9.add(o6.a(tL_storyAlbum));
                    }
                    arrayList8.clear();
                    arrayList8.addAll(arrayList9);
                    arrayList7.clear();
                    arrayList7.addAll(arrayList9);
                    j6Var2.f = true;
                    j6Var2.e = false;
                    j6Var2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList8.clear();
                    arrayList8.addAll(arrayList7);
                    j6Var2.f = true;
                    j6Var2.e = false;
                    NotificationCenter.getInstance(j6Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j6Var2.b), j6Var2);
                    break;
                }
                break;
            case 20:
                n6 n6Var = (n6) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                n6Var.getClass();
                callback2.run(n6Var);
                break;
            case 21:
                MessagesController.getInstance(((u6) this.b).I.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                break;
            case 22:
                u6 u6Var = (u6) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                a8 a8Var4 = u6Var.c;
                a8Var4.w = true;
                v6 v6Var = u6Var.I;
                if (v6Var.n(tL_error3)) {
                    a8Var4.x = null;
                } else {
                    a8Var4.x = tL_error3;
                }
                u6Var.d = true;
                u6Var.E = true;
                u6Var.D = true;
                v6Var.w.d(a8Var4);
                break;
            case 23:
                u6 u6Var2 = (u6) this.b;
                u6Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new s6(u6Var2, r9));
                break;
            case 24:
                ((y5) this.b).accept((TL_stories.TL_stories_allStories) this.c);
                break;
            case 25:
                i7 i7Var = (i7) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = i7Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i30 = storyItem2.id;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i30, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                j8.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
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
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i30).stepThis().dispose();
                        if (z10) {
                            i9 = -1;
                            SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                            r9 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            database.executeFast("UPDATE stories_counter SET count = " + (r9 + i9) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            break;
                        }
                        i9 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r9 + i9) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            i7Var.l(peerDialogId, storyItem2);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i30, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i9 = 1;
                                SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r9 + i9) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            }
                        }
                        i9 = 0;
                        SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r9 + i9) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    }
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            case 26:
                i7 i7Var2 = (i7) this.b;
                y5 y5Var = (y5) this.c;
                MessagesStorage messagesStorage2 = i7Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e10) {
                    messagesStorage2.checkSQLException(e10);
                }
                AndroidUtilities.runOnUIThread(new g0(29, y5Var, longSparseIntArray));
                break;
            case 27:
                i7.a((i7) this.b, (y5) this.c);
                break;
            case 28:
                ((i7) this.b).j((ArrayList) this.c);
                break;
            default:
                ((y5) this.b).b.f = (LongSparseIntArray) this.c;
                break;
        }
    }
}
