package a1;

import a3.l0;
import ah.h1;
import ah.k1;
import ah.m1;
import ah.u0;
import ah.x;
import ah.x0;
import ah.z;
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
import b2.x1;
import bi.c6;
import bi.d8;
import bi.e1;
import bi.e3;
import bi.f5;
import bi.f8;
import bi.g8;
import bi.gb;
import bi.j0;
import bi.l8;
import bi.m8;
import bi.n5;
import bi.o5;
import bi.ob;
import bi.pb;
import bi.q2;
import bi.s6;
import bi.t0;
import bi.t1;
import bi.t8;
import bi.u8;
import bi.x2;
import bi.z0;
import com.google.android.gms.internal.vision.e2;
import di.bc;
import di.f4;
import di.ic;
import di.ja;
import di.ka;
import di.kc;
import di.o8;
import di.oc;
import di.pc;
import e2.d0;
import i2.b0;
import i2.c0;
import i2.f0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
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
import org.telegram.messenger.w1;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ProfileActivity;
import sg.a1;
import v0.i;
import v0.o;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    @Override // java.lang.Runnable
    public final void run() {
        t1 t1Var;
        oc ocVar;
        ob obVar;
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
                pf.b bVar = (pf.b) this.b;
                x1 x1Var = (x1) this.c;
                l0 l0Var = (l0) bVar.c;
                String str2 = d0.a;
                f0 f0Var = ((c0) l0Var).a;
                f0Var.h0 = x1Var;
                f0Var.m.e(25, new b0(x1Var));
                return;
            case 3:
                pf.b bVar2 = (pf.b) this.b;
                Exception exc = (Exception) this.c;
                l0 l0Var2 = (l0) bVar2.c;
                String str3 = d0.a;
                j2.f fVar = ((c0) l0Var2).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1030, new i0.b(p5, exc, 13));
                return;
            case 4:
                pf.b bVar3 = (pf.b) this.b;
                String str4 = (String) this.c;
                l0 l0Var3 = (l0) bVar3.c;
                String str5 = d0.a;
                j2.f fVar2 = ((c0) l0Var3).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1019, new i0.b(p10, str4, 20));
                return;
            case 5:
                ah.b0 b0Var = (ah.b0) this.b;
                z5 z5Var = (z5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b0Var.n.getText());
                for (z5 z5Var2 : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = b0Var.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        b0Var.n.getText().delete(spanStart, spanEnd);
                        int i11 = spanEnd - spanStart;
                        x xVar = b0Var.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i11;
                        }
                        xVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 6:
                ah.b0 b0Var2 = (ah.b0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (b0Var2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    m1.f(-b0Var2.M, b0Var2.R, b0Var2.Q);
                    return;
                }
                String str6 = tL_error.text;
                if (str6.equals("REACTIONS_TOO_MANY")) {
                    str6 = LocaleController.formatPluralString("ReactionMaxCountError", b0Var2.J, new Object[0]);
                }
                yc.a0(b0Var2).t(str6, null).j();
                return;
            case 7:
                z zVar = (z) this.b;
                z5 z5Var3 = (z5) this.c;
                ah.b0 b0Var3 = zVar.e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b0Var3.n.getText());
                for (z5 z5Var4 : (z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = b0Var3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        b0Var3.n.getText().delete(spanStart2, spanEnd2);
                        int i12 = spanEnd2 - spanStart2;
                        x xVar2 = b0Var3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i12;
                        }
                        xVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 8:
                u0 u0Var = (u0) this.b;
                fk0 fk0Var = (fk0) this.c;
                u0Var.l = true;
                u0Var.a.invalidate();
                fk0Var.b1 = false;
                fk0Var.invalidate();
                u0Var.c(true);
                return;
            case 9:
                x0 x0Var = (x0) this.b;
                ah.c cVar = (ah.c) this.c;
                x0Var.getText().delete(x0Var.getText().getSpanStart(cVar), x0Var.getText().getSpanEnd(cVar));
                x0Var.setCursorVisible(true);
                x0Var.setLongClickable(true);
                return;
            case 10:
                k1 k1Var = (k1) this.b;
                h1 h1Var = (h1) this.c;
                k1Var.getClass();
                TLRPC.ReactionCount reactionCount = h1Var.a;
                ViewParent viewParent = k1Var.z;
                if (e2.u(viewParent)) {
                    ((n4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                h1Var.Y.c(false);
                k1Var.S = null;
                k1Var.T = false;
                k1Var.U = null;
                return;
            case 11:
                ViewGroup container = (ViewGroup) this.b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 12:
                ((i) this.b).onError(this.c);
                return;
            case 13:
                ((i) this.b).onResult((o) this.c);
                return;
            case 14:
                ((pb) this.b).H(ProfileActivity.m4(((e1) this.c).c));
                return;
            case 15:
                e3 e3Var = (e3) this.b;
                AndroidUtilities.addToClipboard(((z0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(e3Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 16:
                e3 e3Var2 = (e3) this.b;
                e1 e1Var = (e1) this.c;
                long j3 = e1Var.c;
                o5 o5Var = e3Var2.i0;
                if (j3 != UserConfig.getInstance(o5Var.C2).getClientUserId() && ((t1Var = e3Var2.h0.A0) == null || j3 != DialogObject.getPeerDialogId(t1Var.i()))) {
                    if (o5Var.O3 != null) {
                        for (int i13 = 0; i13 < o5Var.O3.peers.size(); i13++) {
                            if (j3 != DialogObject.getPeerDialogId(o5Var.O3.peers.get(i13).peer)) {
                            }
                        }
                    }
                    Context context = e3Var2.getContext();
                    long j10 = e1Var.c;
                    j0 j0Var = new j0(i10, e3Var2, e1Var);
                    t0 t0Var = new t0();
                    f3 f3Var = new f3(1, context, (f6) t0Var, false);
                    f3Var.fixNavigationBar();
                    LinearLayout f7 = wl.f(context, 1);
                    TextView g10 = w1.g(context, 1, 20.0f);
                    g10.setTextColor(t0Var.G0(j6.j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f7.addView(g10, x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    l4 l4Var = new l4(context, t0Var);
                    l4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f7.addView(l4Var, x5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final z1 z1Var = new z1(4, 21, context, t0Var, true);
                    mp checkBoxRound = z1Var.getCheckBoxRound();
                    int i14 = j6.V6;
                    int i15 = j6.g7;
                    int i16 = j6.k7;
                    checkBoxRound.b(i14, i15, i16);
                    z1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    z1Var.setOnClickListener(new View.OnClickListener() { // from class: bi.k0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
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
                    int i17 = j6.i6;
                    z1Var.setBackground(j6.f0(t0Var.G0(i17), 2, -1));
                    f7.addView(z1Var, x5.n(-1, -2));
                    final z1 z1Var2 = new z1(4, 21, context, t0Var, true);
                    z1Var2.getCheckBoxRound().b(i14, i15, i16);
                    final int i18 = 1;
                    z1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j10)), null, false, true, false);
                    z1Var2.setOnClickListener(new View.OnClickListener() { // from class: bi.k0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
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
                    z1Var2.setBackground(j6.f0(t0Var.G0(i17), 2, -1));
                    f7.addView(z1Var2, x5.n(-1, -2));
                    final z1 z1Var3 = new z1(4, 21, context, t0Var, true);
                    z1Var3.getCheckBoxRound().b(i14, i15, i16);
                    z1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j10)), null, false, false, false);
                    final int i19 = 2;
                    z1Var3.setOnClickListener(new View.OnClickListener() { // from class: bi.k0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
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
                    z1Var3.setBackground(j6.f0(t0Var.G0(i17), 2, -1));
                    f7.addView(z1Var3, x5.n(-1, -2));
                    e9 e9Var = new e9(context, t0Var);
                    e9Var.setBackgroundColor(-16777216);
                    e9Var.setFixedSize(12);
                    f7.addView(e9Var, x5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    di.d dVar = new di.d(context, t0Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new bi.l0(z1Var, z1Var2, z1Var3, j0Var, f3Var, 0));
                    frameLayout.addView(dVar, x5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f7.addView(frameLayout, x5.n(-1, -2));
                    f3Var.setCustomView(f7);
                    f3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = e3Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.a));
                ConnectionsManager.getInstance(e3Var2.N).sendRequest(deletegroupcallmessages, null);
                e3Var2.c(e1Var.a);
                return;
            case 17:
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
            case 18:
                ((t1) this.b).F.remove((String) this.c);
                return;
            case 19:
                o5 o5Var2 = (o5) this.b;
                f4 f4Var = (f4) this.c;
                o5Var2.removeView(f4Var);
                if (o5Var2.d2 == f4Var) {
                    o5Var2.d2 = null;
                    return;
                }
                return;
            case 20:
                o5 o5Var3 = (o5) this.b;
                pc E = pc.E((Activity) this.c, o5Var3.C2);
                n5 n5Var = o5Var3.M2;
                long j11 = (n5Var == null || (obVar = (ob) n5Var.c) == null) ? 0L : obVar.currentPosition;
                File h = o5Var3.O1.h();
                TL_stories.StoryItem storyItem = o5Var3.O1.a;
                o8 o8Var = new o8();
                o8Var.n = true;
                o8Var.t = storyItem.media;
                int i21 = o8Var.a;
                o8Var.q = MessagesController.getInstance(i21).getPeer(storyItem.dialogId);
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
                        int i22 = 0;
                        while (true) {
                            if (i22 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i22);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    o8Var.k0 = documentAttribute.w;
                                    o8Var.l0 = documentAttribute.h;
                                    o8Var.i = documentAttribute.duration;
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str7 = storyItem.firstFramePath;
                        if (str7 != null) {
                            o8Var.N = str7;
                        } else if (document2.thumbs != null) {
                            for (int i23 = 0; i23 < storyItem.media.document.thumbs.size(); i23++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i23);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    o8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i21).getPathToAttach(photoSize, true);
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
                ic d = kc.d(o5Var3.J0);
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
                        if (windowManager != null && (ocVar = E.n) != null && ocVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.K1 = o8Var;
                        ja.a(i24, o8Var);
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
                        bc bcVar = E.h0;
                        int i25 = E.J;
                        bcVar.setBackgroundColor((i25 == 1 || i25 == 0) ? 0 : -14737633);
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
                E.Q = new q2(o5Var3, 12);
                E.R = new x2(i10, o5Var3, E);
                return;
            case 21:
                f5 f5Var = (f5) this.b;
                pb pbVar = (pb) this.c;
                f5Var.getClass();
                ((gb) f5Var.l.Q1).h(new a1(pbVar.f, 14, false));
                return;
            case 22:
                c6 c6Var = (c6) this.b;
                String str8 = (String) this.c;
                c6Var.h = null;
                s6 s6Var = c6Var.n;
                s6Var.Q = false;
                s6Var.O.c = str8.toLowerCase();
                s6.b(s6Var);
                return;
            case 23:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error2 == null));
                    return;
                }
                return;
            case 24:
                d8 d8Var = (d8) this.b;
                TLObject tLObject = (TLObject) this.c;
                g8 g8Var = d8Var.q;
                int i26 = d8Var.c;
                ArrayList arrayList2 = d8Var.i;
                d8Var.I = 0;
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
                        d8Var.F.add(arrayList4);
                        arrayList2.add(messageObject);
                    }
                    d8Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        d8Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    d8Var.H = str;
                    d8Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(g8Var);
                    AndroidUtilities.runOnUIThread(g8Var);
                    return;
                }
                return;
            case 25:
                f8 f8Var = (f8) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = f8Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                f8Var.d = true;
                f8Var.e = false;
                f8Var.d();
                NotificationCenter.getInstance(f8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f8Var.b), f8Var);
                return;
            case 26:
                f8 f8Var2 = (f8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = f8Var2.g;
                ArrayList arrayList7 = f8Var2.h;
                if (!(tLObject2 instanceof TL_stories.TL_albums)) {
                    if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                        f8Var2.f = true;
                        f8Var2.e = false;
                        NotificationCenter.getInstance(f8Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f8Var2.b), f8Var2);
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
                    arrayList8.add(m8.a(tL_storyAlbum));
                }
                arrayList7.clear();
                arrayList7.addAll(arrayList8);
                arrayList6.clear();
                arrayList6.addAll(arrayList8);
                f8Var2.f = true;
                f8Var2.e = false;
                f8Var2.f(true);
                return;
            case 27:
                l8 l8Var = (l8) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                l8Var.getClass();
                callback2.run(l8Var);
                return;
            case 28:
                MessagesController.getInstance(((t8) this.b).M.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                return;
            default:
                t8 t8Var = (t8) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                o8 o8Var4 = t8Var.c;
                o8Var4.w = true;
                u8 u8Var = t8Var.M;
                if (u8Var.n(tL_error3)) {
                    o8Var4.x = null;
                } else {
                    o8Var4.x = tL_error3;
                }
                t8Var.d = true;
                t8Var.I = true;
                t8Var.H = true;
                u8Var.w.d(o8Var4);
                return;
        }
    }
}
