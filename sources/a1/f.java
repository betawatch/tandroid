package a1;

import a3.m0;
import ah.g1;
import ah.j1;
import ah.l1;
import ah.t0;
import ah.w;
import ah.w0;
import ah.y;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.b2;
import bi.a3;
import bi.e1;
import bi.f6;
import bi.g8;
import bi.h3;
import bi.h5;
import bi.i8;
import bi.j0;
import bi.j8;
import bi.jb;
import bi.l0;
import bi.o8;
import bi.p5;
import bi.p8;
import bi.q5;
import bi.r2;
import bi.rb;
import bi.sb;
import bi.t1;
import bi.w6;
import bi.z0;
import com.google.android.gms.internal.play_billing.k3;
import di.d4;
import di.dc;
import di.fa;
import di.fc;
import di.ga;
import di.jc;
import di.k8;
import di.kc;
import di.wb;
import fi.c2;
import i2.a0;
import i2.b0;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q;
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import sg.y0;
import v0.i;
import v0.o;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t1 t1Var;
        jc jcVar;
        rb rbVar;
        String str = null;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.b, (p) this.c);
                return;
            case 2:
                ((a3.f) ((qf.b) this.b).c).h.onVideoSizeChanged((b2) this.c);
                return;
            case 3:
                s sVar = (s) this.b;
                i2.c cVar = (i2.c) this.c;
                m0 m0Var = (m0) sVar.c;
                String str2 = e2.m0.a;
                s.e(((b0) m0Var).a.G, cVar);
                return;
            case 4:
                s sVar2 = (s) this.b;
                b2 b2Var = (b2) this.c;
                m0 m0Var2 = (m0) sVar2.c;
                String str3 = e2.m0.a;
                h0 h0Var = ((b0) m0Var2).a;
                h0Var.k0 = b2Var;
                h0Var.m.e(25, new a0(b2Var));
                return;
            case 5:
                s sVar3 = (s) this.b;
                Exception exc = (Exception) this.c;
                m0 m0Var3 = (m0) sVar3.c;
                String str4 = e2.m0.a;
                j2.f fVar = ((b0) m0Var3).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1030, new c2(p5, exc, 28));
                return;
            case 6:
                s sVar4 = (s) this.b;
                String str5 = (String) this.c;
                m0 m0Var4 = (m0) sVar4.c;
                String str6 = e2.m0.a;
                j2.f fVar2 = ((b0) m0Var4).a.s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1019, new j2.c(p9, str5, 5));
                return;
            case 7:
                ah.a0 a0Var = (ah.a0) this.b;
                b6 b6Var = (b6) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0Var.n.getText());
                for (b6 b6Var2 : (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class)) {
                    if (b6Var2 == b6Var) {
                        int editTextSelectionEnd = a0Var.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(b6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(b6Var2);
                        a0Var.n.getText().delete(spanStart, spanEnd);
                        int i11 = spanEnd - spanStart;
                        w wVar = a0Var.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i11;
                        }
                        wVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 8:
                ah.a0 a0Var2 = (ah.a0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (a0Var2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    l1.f(-a0Var2.M, a0Var2.R, a0Var2.Q);
                    return;
                }
                String str7 = tL_error.text;
                if (str7.equals("REACTIONS_TOO_MANY")) {
                    str7 = LocaleController.formatPluralString("ReactionMaxCountError", a0Var2.J, new Object[0]);
                }
                zc.a0(a0Var2).t(str7, null).j();
                return;
            case 9:
                y yVar = (y) this.b;
                b6 b6Var3 = (b6) this.c;
                ah.a0 a0Var3 = yVar.e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a0Var3.n.getText());
                for (b6 b6Var4 : (b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), b6.class)) {
                    if (b6Var4 == b6Var3) {
                        int editTextSelectionEnd2 = a0Var3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(b6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(b6Var4);
                        a0Var3.n.getText().delete(spanStart2, spanEnd2);
                        int i12 = spanEnd2 - spanStart2;
                        w wVar2 = a0Var3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i12;
                        }
                        wVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 10:
                t0 t0Var = (t0) this.b;
                gl0 gl0Var = (gl0) this.c;
                t0Var.l = true;
                t0Var.a.invalidate();
                gl0Var.b1 = false;
                gl0Var.invalidate();
                t0Var.c(true);
                return;
            case 11:
                w0 w0Var = (w0) this.b;
                ah.c cVar2 = (ah.c) this.c;
                w0Var.getText().delete(w0Var.getText().getSpanStart(cVar2), w0Var.getText().getSpanEnd(cVar2));
                w0Var.setCursorVisible(true);
                w0Var.setLongClickable(true);
                return;
            case 12:
                j1 j1Var = (j1) this.b;
                g1 g1Var = (g1) this.c;
                j1Var.getClass();
                TLRPC.ReactionCount reactionCount = g1Var.a;
                ViewParent viewParent = j1Var.z;
                if (k3.s(viewParent)) {
                    ((o4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                g1Var.Y.c(false);
                j1Var.S = null;
                j1Var.T = false;
                j1Var.U = null;
                return;
            case 13:
                ViewGroup container = (ViewGroup) this.b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 14:
                ((i) this.b).onError(this.c);
                return;
            case 15:
                ((i) this.b).onResult((o) this.c);
                return;
            case 16:
                ((sb) this.b).H(ProfileActivity.m4(((e1) this.c).c));
                return;
            case 17:
                h3 h3Var = (h3) this.b;
                AndroidUtilities.addToClipboard(((z0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(h3Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 18:
                h3 h3Var2 = (h3) this.b;
                e1 e1Var = (e1) this.c;
                long j10 = e1Var.c;
                q5 q5Var = h3Var2.i0;
                if (j10 != UserConfig.getInstance(q5Var.C2).getClientUserId() && ((t1Var = h3Var2.h0.A0) == null || j10 != DialogObject.getPeerDialogId(t1Var.i()))) {
                    if (q5Var.O3 != null) {
                        for (int i13 = 0; i13 < q5Var.O3.peers.size(); i13++) {
                            if (j10 != DialogObject.getPeerDialogId(q5Var.O3.peers.get(i13).peer)) {
                            }
                        }
                    }
                    Context context = h3Var2.getContext();
                    long j11 = e1Var.c;
                    j0 j0Var = new j0(i10, h3Var2, e1Var);
                    bi.t0 t0Var2 = new bi.t0();
                    e3 e3Var = new e3(1, context, (c6) t0Var2, false);
                    e3Var.fixNavigationBar();
                    LinearLayout e = yh.e(context, 1);
                    TextView g10 = q.g(context, 1, 20.0f);
                    g10.setTextColor(t0Var2.F0(g6.j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    e.addView(g10, a6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    m4 m4Var = new m4(context, t0Var2);
                    m4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    e.addView(m4Var, a6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final a2 a2Var = new a2(4, 21, context, t0Var2, true);
                    aq checkBoxRound = a2Var.getCheckBoxRound();
                    int i14 = g6.V6;
                    int i15 = g6.g7;
                    int i16 = g6.k7;
                    checkBoxRound.b(i14, i15, i16);
                    a2Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    a2Var.setOnClickListener(new View.OnClickListener() { // from class: bi.k0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
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
                    int i17 = g6.i6;
                    a2Var.setBackground(g6.g0(t0Var2.F0(i17), 2, -1));
                    e.addView(a2Var, a6.n(-1, -2));
                    final a2 a2Var2 = new a2(4, 21, context, t0Var2, true);
                    a2Var2.getCheckBoxRound().b(i14, i15, i16);
                    final int i18 = 1;
                    a2Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    a2Var2.setOnClickListener(new View.OnClickListener() { // from class: bi.k0
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
                    a2Var2.setBackground(g6.g0(t0Var2.F0(i17), 2, -1));
                    e.addView(a2Var2, a6.n(-1, -2));
                    final a2 a2Var3 = new a2(4, 21, context, t0Var2, true);
                    a2Var3.getCheckBoxRound().b(i14, i15, i16);
                    a2Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i19 = 2;
                    a2Var3.setOnClickListener(new View.OnClickListener() { // from class: bi.k0
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
                    a2Var3.setBackground(g6.g0(t0Var2.F0(i17), 2, -1));
                    e.addView(a2Var3, a6.n(-1, -2));
                    e9 e9Var = new e9(context, t0Var2);
                    e9Var.setBackgroundColor(-16777216);
                    e9Var.setFixedSize(12);
                    e.addView(e9Var, a6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    di.d dVar = new di.d(context, t0Var2, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new l0(a2Var, a2Var2, a2Var3, j0Var, e3Var, 0));
                    frameLayout.addView(dVar, a6.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 119));
                    e.addView(frameLayout, a6.n(-1, -2));
                    e3Var.setCustomView(e);
                    e3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = h3Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.a));
                ConnectionsManager.getInstance(h3Var2.N).sendRequest(deletegroupcallmessages, null);
                h3Var2.c(e1Var.a);
                return;
            case 19:
                t1 t1Var2 = (t1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                t1Var2.getClass();
                int size = arrayList.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(t1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 20:
                ((t1) this.b).F.remove((String) this.c);
                return;
            case 21:
                q5 q5Var2 = (q5) this.b;
                d4 d4Var = (d4) this.c;
                q5Var2.removeView(d4Var);
                if (q5Var2.d2 == d4Var) {
                    q5Var2.d2 = null;
                    return;
                }
                return;
            case 22:
                q5 q5Var3 = (q5) this.b;
                kc D = kc.D((Activity) this.c, q5Var3.C2);
                p5 p5Var = q5Var3.M2;
                long j12 = (p5Var == null || (rbVar = (rb) p5Var.c) == null) ? 0L : rbVar.currentPosition;
                File h = q5Var3.O1.h();
                TL_stories.StoryItem storyItem = q5Var3.O1.a;
                k8 k8Var = new k8();
                k8Var.n = true;
                k8Var.t = storyItem.media;
                int i21 = k8Var.a;
                k8Var.q = MessagesController.getInstance(i21).getPeer(storyItem.dialogId);
                k8Var.r = storyItem.id;
                k8Var.s = storyItem.caption;
                k8Var.L = h;
                k8Var.M = false;
                k8Var.k0 = 720;
                k8Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    k8Var.K = false;
                    if (h != null) {
                        k8Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    k8Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i22 = 0;
                        while (true) {
                            if (i22 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i22);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    k8Var.k0 = documentAttribute.w;
                                    k8Var.l0 = documentAttribute.h;
                                    k8Var.i = documentAttribute.duration;
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str8 = storyItem.firstFramePath;
                        if (str8 != null) {
                            k8Var.N = str8;
                        } else if (document2.thumbs != null) {
                            for (int i23 = 0; i23 < storyItem.media.document.thumbs.size(); i23++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i23);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    k8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i21).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        k8Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                k8Var.A();
                k8Var.e(storyItem);
                dc d = fc.d(q5Var3.J0);
                RectF rectF = D.H;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i24 = D.c;
                if (!D.d) {
                    if (MessagesController.getInstance(i24).isFrozen()) {
                        org.telegram.ui.b.b(i24);
                    } else {
                        D.u0 = false;
                        D.e = false;
                        D.B2 = false;
                        if (windowManager != null && (jcVar = D.n) != null && jcVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.K1 = k8Var;
                        fa.a(i24, k8Var);
                        k8 k8Var2 = D.K1;
                        D.O1 = (k8Var2 == null || !k8Var2.K) ? 0 : 1;
                        D.s0.g = false;
                        if (d != null) {
                            D.F = d;
                            D.J = d.a;
                            rectF.set(d.c);
                            D.G = d.b;
                            D.F.e();
                        } else {
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                        }
                        D.r.c();
                        wb wbVar = D.h0;
                        int i25 = D.J;
                        wbVar.setBackgroundColor((i25 == 1 || i25 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.K = 0.0f;
                        AndroidUtilities.lockOrientation(D.b, 1);
                        k8 k8Var3 = D.K1;
                        if (k8Var3 != null) {
                            D.c1.setText(k8Var3.C0);
                        }
                        D.K(new ga(D, 7), j12);
                        D.b1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.v0 = 0L;
                        D.w0 = "";
                    }
                }
                D.Q = new r2(q5Var3, 12);
                D.R = new a3(i10, q5Var3, D);
                return;
            case 23:
                h5 h5Var = (h5) this.b;
                sb sbVar = (sb) this.c;
                h5Var.getClass();
                ((jb) h5Var.l.Q1).h(new y0(sbVar.f, 14, false));
                return;
            case 24:
                f6 f6Var = (f6) this.b;
                String str9 = (String) this.c;
                f6Var.h = null;
                w6 w6Var = f6Var.n;
                w6Var.Q = false;
                w6Var.O.c = str9.toLowerCase();
                w6.b(w6Var);
                return;
            case 25:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error2 == null));
                    return;
                }
                return;
            case 26:
                g8 g8Var = (g8) this.b;
                TLObject tLObject = (TLObject) this.c;
                j8 j8Var = g8Var.q;
                int i26 = g8Var.c;
                ArrayList arrayList2 = g8Var.i;
                g8Var.I = 0;
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
                        g8Var.F.add(arrayList4);
                        arrayList2.add(messageObject);
                    }
                    g8Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        g8Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    g8Var.H = str;
                    g8Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(j8Var);
                    AndroidUtilities.runOnUIThread(j8Var);
                    return;
                }
                return;
            case 27:
                i8 i8Var = (i8) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = i8Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                i8Var.d = true;
                i8Var.e = false;
                i8Var.d();
                NotificationCenter.getInstance(i8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(i8Var.b), i8Var);
                return;
            case 28:
                i8 i8Var2 = (i8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = i8Var2.g;
                ArrayList arrayList7 = i8Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                        i8Var2.f = true;
                        i8Var2.e = false;
                        NotificationCenter.getInstance(i8Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(i8Var2.b), i8Var2);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                int size3 = arrayList9.size();
                int i28 = 0;
                while (i28 < size3) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i28);
                    i28++;
                    arrayList8.add(p8.a(tL_storyAlbum));
                }
                arrayList7.clear();
                arrayList7.addAll(arrayList8);
                arrayList6.clear();
                arrayList6.addAll(arrayList8);
                i8Var2.f = true;
                i8Var2.e = false;
                i8Var2.f(true);
                return;
            default:
                o8 o8Var = (o8) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                o8Var.getClass();
                callback2.run(o8Var);
                return;
        }
    }
}
