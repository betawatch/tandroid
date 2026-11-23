package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.media.AudioManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.op;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        org.telegram.ui.Components.lc b02;
        int i7;
        gj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions2;
        fi.c1 c1Var;
        hi.ra raVar;
        fi.e9 e9Var;
        int i10 = this.a;
        int i11 = R.raw.error;
        int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                q8 q8Var = (q8) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                if (q8Var instanceof bi.x7) {
                    ((bi.x7) q8Var).n(tL_starGiftUnique);
                    return;
                }
                return;
            case 1:
                Runnable[] runnableArr = (Runnable[]) this.b;
                p2 p2Var = (p2) this.c;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                p2Var.a(0L);
                return;
            case 2:
                f6 f6Var = (f6) this.b;
                if (((y8) this.c).e) {
                    f6Var.g2.setLoading(false);
                    f6Var.x1();
                    return;
                } else {
                    org.telegram.ui.Components.gc Q = f6Var.k().Q(R.raw.error, 36, hd.a0(null, null, 2131743633, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    return;
                }
            case 3:
                ((f6) this.b).k().g0((TLRPC.TL_error) this.c, false);
                return;
            case 4:
                np.u1(((f6) this.b).a).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 5:
                f6 f6Var2 = (f6) this.b;
                org.telegram.ui.Components.lc.b0((bn) this.c).L(R.raw.gift, hd.N0(2131744853, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744851, org.telegram.messenger.n5.t(f6Var2.T1))), hd.N0(2131744852, null), new k1(f6Var2, 12)).k(true);
                return;
            case 6:
                f6 f6Var3 = (f6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                f6Var3.getClass();
                zArr[0] = true;
                f6Var3.g2.setLoading(false);
                f6Var3.x1();
                return;
            case 7:
                f6 f6Var4 = (f6) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                o10.u(hd.a0(null, null, 2131749445, tL_starGiftUnique2.title + " #" + tL_starGiftUnique2.num), f6Var4.k(), R.raw.ic_delete, 36);
                return;
            case 8:
                ((f6) this.b).B2((CharSequence) this.c);
                return;
            case 9:
                f6.h1((f6) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            case 10:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                t1Var.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        str = null;
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i7 = 2131743636;
                    } else {
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i11 = R.raw.fire_on;
                        i7 = 2131743635;
                        str = null;
                    }
                    org.telegram.messenger.f3.n(str, i7, b02, i11, 36);
                    return;
                }
                return;
            case 11:
                k6 k6Var = (k6) this.b;
                bn bnVar = (bn) this.c;
                org.telegram.ui.Cells.z zVar = k6Var.b;
                if (zVar == null) {
                    return;
                }
                try {
                    zVar.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                k6Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                org.telegram.ui.Cells.z zVar2 = k6Var.b;
                if (zVar2 instanceof org.telegram.ui.Cells.r1) {
                    messageObject = ((org.telegram.ui.Cells.r1) zVar2).getPrimaryMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.k;
                    if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                    arrayList = null;
                } else {
                    if (!(zVar2 instanceof org.telegram.ui.Cells.v0) || (messageObject = ((org.telegram.ui.Cells.v0) zVar2).getMessageObject()) == null) {
                        return;
                    }
                    TLRPC.Message message2 = messageObject.k;
                    if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                        arrayList = tL_messageReactions.top_reactors;
                    }
                    arrayList = null;
                }
                ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                gj gjVar = messageObject;
                w8 w8Var = y8.y(gjVar.K1, false).B;
                if (w8Var != null) {
                    w8Var.b();
                }
                TLRPC.ChatFull chatFull = bnVar.r8;
                mc mcVar = new mc(k6Var.getContext(), bnVar.getCurrentAccount(), bnVar.a(), bnVar, gjVar, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, bnVar.getResourceProvider());
                gjVar.e1();
                org.telegram.ui.Cells.z zVar3 = k6Var.b;
                mcVar.Q1 = bnVar;
                mcVar.R1 = zVar3;
                mcVar.show();
                return;
            case 12:
                TLObject tLObject = (TLObject) this.b;
                ai.h0 h0Var = (ai.h0) this.c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    h0Var.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    h0Var.a(null);
                    return;
                }
            case 13:
                boolean[] zArr2 = (boolean[]) this.b;
                r10 r10Var = (r10) this.c;
                if (zArr2[0]) {
                    return;
                }
                r10Var.a("cancelled", 0L);
                zArr2[0] = true;
                return;
            case 14:
                p8 p8Var = (p8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = p8Var.l;
                int i14 = p8Var.a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    np.u1(i14).f4(tL_payments_savedStarGifts.users, false);
                    np.u1(i14).Z3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i15 = 0;
                        while (i15 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i15)).pinned_to_top) {
                            i15++;
                        }
                        arrayList3.add(i15, savedStarGift);
                        ls.f(i14).k(ls.I3, Long.valueOf(p8Var.b), p8Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((np) this.b).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 16:
                new org.telegram.ui.Components.lc(((org.telegram.ui.ActionBar.w2[]) this.b)[0].F, (org.telegram.ui.ActionBar.h6) this.c).Q(R.raw.copy, 36, hd.N0(2131744704, null)).k(false);
                return;
            case 17:
                mc mcVar2 = (mc) this.b;
                w8 w8Var2 = (w8) this.c;
                mcVar2.O1 = true;
                mcVar2.K0(new u8(w8Var2, 2));
                org.telegram.messenger.g0.h3(new qb(mcVar2, 1), 240L);
                return;
            case 18:
                ((v0.g) this.b).a((w0.d) this.c);
                return;
            case 19:
                ((v0.g) this.b).onResult((v0.f) this.c);
                return;
            case 20:
                e1.d dVar = (e1.d) this.b;
                v0.c cVar = (v0.c) this.c;
                v0.g gVar = dVar.f;
                if (gVar != null) {
                    gVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 21:
                Context context = (Context) this.b;
                h2.i iVar = (h2.i) this.c;
                f2.i.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                iVar.e();
                return;
            case 22:
                ((fi.f9) this.b).N(ProfileActivity.D4(((fi.r0) this.c).c));
                return;
            case 23:
                fi.a2 a2Var = (fi.a2) this.b;
                org.telegram.messenger.g0.g(((fi.m0) this.c).w);
                if (org.telegram.messenger.g0.G3()) {
                    Toast.makeText(a2Var.getContext(), hd.N0(2131743951, null), 0).show();
                    return;
                }
                return;
            case 24:
                fi.a2 a2Var2 = (fi.a2) this.b;
                fi.r0 r0Var = (fi.r0) this.c;
                long j3 = r0Var.c;
                fi.z3 z3Var = a2Var2.j0;
                if (j3 != k10.i(z3Var.m2).e() && ((c1Var = a2Var2.i0.B0) == null || j3 != org.telegram.messenger.n5.o(c1Var.i()))) {
                    if (z3Var.y3 != null) {
                        for (int i16 = 0; i16 < z3Var.y3.peers.size(); i16++) {
                            if (j3 != org.telegram.messenger.n5.o(z3Var.y3.peers.get(i16).peer)) {
                            }
                        }
                    }
                    Context context2 = a2Var2.getContext();
                    long j10 = r0Var.c;
                    fi.b0 b0Var = new fi.b0(i13, a2Var2, r0Var);
                    fi.h0 h0Var2 = new fi.h0(i12);
                    org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context2, (org.telegram.ui.ActionBar.h6) h0Var2, false);
                    w2Var.O();
                    LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h0Var2);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setText(hd.N0(2131751484, null));
                    g10.addView(textView, c8.ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, h0Var2);
                    o4Var.setText(hd.N0(2131751581, null));
                    g10.addView(o4Var, c8.ma.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var2);
                    op checkBoxRound = d2Var.getCheckBoxRound();
                    int i17 = org.telegram.ui.ActionBar.m6.V6;
                    int i18 = org.telegram.ui.ActionBar.m6.g7;
                    int i19 = org.telegram.ui.ActionBar.m6.k7;
                    checkBoxRound.b(i17, i18, i19);
                    d2Var.e(hd.N0(2131751490, null), null, false, true, false);
                    d2Var.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    d2Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    d2Var.c(!r3.b(), true);
                                    break;
                                default:
                                    d2Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i20 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i20, h0Var2), 2, -1);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i20);
                    d2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.t6.j(d2Var, h02, null, M, h0Var2);
                    g10.addView(d2Var, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var2);
                    d2Var2.getCheckBoxRound().b(i17, i18, i19);
                    d2Var2.e(hd.a0(null, null, 2131751575, org.telegram.messenger.n5.l(k10.t0, j10)), null, false, true, false);
                    final int i21 = 1;
                    d2Var2.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    d2Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    d2Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    d2Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i20, h0Var2), 2, -1);
                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i20);
                    d2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.t6.j(d2Var2, h03, null, M2, h0Var2);
                    g10.addView(d2Var2, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var3 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var2);
                    d2Var3.getCheckBoxRound().b(i17, i18, i19);
                    d2Var3.e(hd.a0(null, null, 2131751556, org.telegram.messenger.n5.l(k10.t0, j10)), null, false, false, false);
                    final int i22 = 2;
                    d2Var3.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    d2Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    d2Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    d2Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i20, h0Var2), 2, -1);
                    org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i20);
                    d2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.t6.j(d2Var3, h04, null, M3, h0Var2);
                    g10.addView(d2Var3, c8.ma.o(-1, -2));
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2, h0Var2);
                    a9Var.setBackgroundColor(-16777216);
                    a9Var.setFixedSize(12);
                    g10.addView(a9Var, c8.ma.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    hi.e eVar = new hi.e(context2, h0Var2, true);
                    eVar.i(hd.N0(2131751501, null), false, true);
                    eVar.setOnClickListener(new fi.d0(d2Var, d2Var2, d2Var3, b0Var, w2Var, 0));
                    frameLayout.addView(eVar, c8.ma.d(-1, 48.0f, ls.E1, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, c8.ma.o(-1, -2));
                    w2Var.O = g10;
                    w2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = a2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(r0Var.a));
                ConnectionsManager.getInstance(a2Var2.O).sendRequest(deletegroupcallmessages, null);
                a2Var2.c(r0Var.a);
                return;
            case 25:
                fi.c1 c1Var2 = (fi.c1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int size = arrayList4.size();
                int i23 = 0;
                while (i23 < size) {
                    Object obj = arrayList4.get(i23);
                    i23++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    ls.f(c1Var2.e).k(ls.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 26:
                ((fi.c1) this.b).G.remove((String) this.c);
                return;
            case 27:
                fi.z3 z3Var2 = (fi.z3) this.b;
                hi.l3 l3Var = (hi.l3) this.c;
                z3Var2.removeView(l3Var);
                if (z3Var2.N1 == l3Var) {
                    z3Var2.N1 = null;
                    return;
                }
                return;
            case 28:
                fi.z3 z3Var3 = (fi.z3) this.b;
                hi.sa D = hi.sa.D((Activity) this.c, z3Var3.m2);
                fi.y3 y3Var = z3Var3.w2;
                long j11 = (y3Var == null || (e9Var = (fi.e9) y3Var.c) == null) ? 0L : e9Var.currentPosition;
                File h = z3Var3.y1.h();
                TL_stories.StoryItem storyItem = z3Var3.y1.a;
                hi.c7 c7Var = new hi.c7();
                c7Var.n = true;
                c7Var.t = storyItem.media;
                int i24 = c7Var.a;
                c7Var.q = np.u1(i24).B1(storyItem.dialogId);
                c7Var.r = storyItem.id;
                c7Var.s = storyItem.caption;
                c7Var.L = h;
                c7Var.M = false;
                c7Var.k0 = 720;
                c7Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    c7Var.K = false;
                    if (h != null) {
                        c7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    c7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i25 = 0;
                        while (true) {
                            if (i25 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i25);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    c7Var.k0 = documentAttribute.w;
                                    c7Var.l0 = documentAttribute.h;
                                    c7Var.i = documentAttribute.duration;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            c7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i26 = 0; i26 < storyItem.media.document.thumbs.size(); i26++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i26);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    c7Var.O = org.telegram.messenger.fc.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i24);
                                    File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        c7Var.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                c7Var.A();
                c7Var.e(storyItem);
                hi.la d = hi.na.d(z3Var3.t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i27 = D.c;
                if (!D.d) {
                    if (np.u1(i27).A2()) {
                        org.telegram.ui.b.b(i27);
                    } else {
                        D.v0 = false;
                        D.e = false;
                        D.C2 = false;
                        if (windowManager != null && (raVar = D.n) != null && raVar.getParent() == null) {
                            org.telegram.messenger.g0.w3(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.L1 = c7Var;
                        hi.q8.a(i27, c7Var);
                        hi.c7 c7Var2 = D.L1;
                        D.P1 = (c7Var2 == null || !c7Var2.K) ? 0 : 1;
                        D.t0.g = false;
                        if (d != null) {
                            D.G = d;
                            D.K = d.a;
                            rectF.set(d.c);
                            D.H = d.b;
                            D.G.e();
                        } else {
                            D.K = 0;
                            float L = org.telegram.messenger.g0.L(100.0f);
                            Point point = org.telegram.messenger.g0.q;
                            rectF.set(0.0f, L, point.x, org.telegram.messenger.g0.L(100.0f) + point.y);
                            D.H = org.telegram.messenger.g0.L(8.0f);
                        }
                        D.r.c();
                        hi.ea eaVar = D.i0;
                        int i28 = D.K;
                        eaVar.setBackgroundColor((i28 == 1 || i28 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.L = 0.0f;
                        org.telegram.messenger.g0.g2(D.b);
                        hi.c7 c7Var3 = D.L1;
                        if (c7Var3 != null) {
                            D.d1.setText(c7Var3.C0);
                        }
                        D.K(new hi.r8(D, 7), j11);
                        D.c1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.w0 = 0L;
                        D.x0 = "";
                    }
                }
                D.R = new fi.r1(z3Var3, 12);
                D.S = new fi.w1(i13, z3Var3, D);
                return;
            default:
                fi.r3 r3Var = (fi.r3) this.b;
                fi.f9 f9Var = (fi.f9) this.c;
                r3Var.getClass();
                ((fi.w8) r3Var.x.A1).h(new ug.y0(f9Var.f, 14, false));
                return;
        }
    }

    public /* synthetic */ f2(y8 y8Var, boolean[] zArr, r10 r10Var) {
        this.a = 13;
        this.b = zArr;
        this.c = r10Var;
    }
}
