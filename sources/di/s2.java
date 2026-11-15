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
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.fp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions2;
        fi.e1 e1Var;
        hi.ra raVar;
        fi.h9 h9Var;
        String str = null;
        final int i7 = 0;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.b;
                if (((v8) this.c).e) {
                    c6Var.g2.setLoading(false);
                    c6Var.t1();
                    return;
                } else {
                    org.telegram.ui.Components.xb Q = c6Var.k().Q(R.raw.error, 36, hd.a0(null, null, 2131743878, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    return;
                }
            case 1:
                np.s1(((c6) this.b).a).O3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 2:
                ((c6) this.b).k().f0((TLRPC.TL_error) this.c, false);
                return;
            case 3:
                c6 c6Var2 = (c6) this.b;
                org.telegram.ui.Components.cc.a0((an) this.c).L(R.raw.gift, hd.M0(2131745096, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131745094, org.telegram.messenger.m5.t(c6Var2.T1))), hd.M0(2131745095, null), new l1(c6Var2, 8)).k(true);
                return;
            case 4:
                c6 c6Var3 = (c6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                c6Var3.getClass();
                zArr[0] = true;
                c6Var3.g2.setLoading(false);
                c6Var3.t1();
                return;
            case 5:
                c6 c6Var4 = (c6) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                i20.t(hd.a0(null, null, 2131749618, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), c6Var4.k(), R.raw.ic_delete, 36);
                return;
            case 6:
                ((c6) this.b).p2((CharSequence) this.c);
                return;
            case 7:
                h6 h6Var = (h6) this.b;
                an anVar = (an) this.c;
                org.telegram.ui.Cells.z zVar = h6Var.b;
                if (zVar == null) {
                    return;
                }
                try {
                    zVar.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                h6Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                org.telegram.ui.Cells.z zVar2 = h6Var.b;
                if (zVar2 instanceof org.telegram.ui.Cells.q1) {
                    messageObject = ((org.telegram.ui.Cells.q1) zVar2).getPrimaryMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.k;
                    if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                    arrayList = null;
                } else {
                    if (!(zVar2 instanceof org.telegram.ui.Cells.t0) || (messageObject = ((org.telegram.ui.Cells.t0) zVar2).getMessageObject()) == null) {
                        return;
                    }
                    TLRPC.Message message2 = messageObject.k;
                    if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                        arrayList = tL_messageReactions.top_reactors;
                    }
                    arrayList = null;
                }
                gj gjVar = messageObject;
                ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                t8 t8Var = v8.y(gjVar.K1, false).B;
                if (t8Var != null) {
                    t8Var.b();
                }
                TLRPC.ChatFull chatFull = anVar.q8;
                jc jcVar = new jc(h6Var.getContext(), anVar.getCurrentAccount(), anVar.a(), anVar, gjVar, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, anVar.getResourceProvider());
                gjVar.e1();
                org.telegram.ui.Cells.z zVar3 = h6Var.b;
                jcVar.Q1 = anVar;
                jcVar.R1 = zVar3;
                jcVar.show();
                return;
            case 8:
                TLObject tLObject = (TLObject) this.b;
                ai.f0 f0Var = (ai.f0) this.c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    f0Var.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    f0Var.a(null);
                    return;
                }
            case 9:
                boolean[] zArr2 = (boolean[]) this.b;
                s10 s10Var = (s10) this.c;
                if (zArr2[0]) {
                    return;
                }
                s10Var.a("cancelled", 0L);
                zArr2[0] = true;
                return;
            case 10:
                m8 m8Var = (m8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = m8Var.l;
                int i10 = m8Var.a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    np.s1(i10).Y3(tL_payments_savedStarGifts.users, false);
                    np.s1(i10).S3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i11 = 0;
                        while (i11 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i11)).pinned_to_top) {
                            i11++;
                        }
                        arrayList3.add(i11, savedStarGift);
                        ns.f(i10).k(ns.G3, Long.valueOf(m8Var.b), m8Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((np) this.b).O3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 12:
                new org.telegram.ui.Components.cc(((org.telegram.ui.ActionBar.u2[]) this.b)[0].F, (org.telegram.ui.ActionBar.e6) this.c).Q(R.raw.copy, 36, hd.M0(2131744947, null)).k(false);
                return;
            case 13:
                jc jcVar2 = (jc) this.b;
                t8 t8Var2 = (t8) this.c;
                jcVar2.O1 = true;
                jcVar2.J0(new r8(t8Var2, 2));
                org.telegram.messenger.g0.i3(new nb(jcVar2, 1), 240L);
                return;
            case 14:
                ((v0.g) this.b).a((w0.d) this.c);
                return;
            case 15:
                ((v0.g) this.b).onResult((v0.f) this.c);
                return;
            case 16:
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
            case 17:
                Context context = (Context) this.b;
                h2.i iVar = (h2.i) this.c;
                f2.h.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                iVar.e();
                return;
            case 18:
                ((fi.i9) this.b).N(ProfileActivity.C4(((fi.s0) this.c).c));
                return;
            case 19:
                fi.c2 c2Var = (fi.c2) this.b;
                org.telegram.messenger.g0.g(((fi.n0) this.c).w);
                if (org.telegram.messenger.g0.H3()) {
                    Toast.makeText(c2Var.getContext(), hd.M0(2131744194, null), 0).show();
                    return;
                }
                return;
            case 20:
                fi.c2 c2Var2 = (fi.c2) this.b;
                fi.s0 s0Var = (fi.s0) this.c;
                long j3 = s0Var.c;
                fi.b4 b4Var = c2Var2.j0;
                if (j3 != m10.i(b4Var.m2).e() && ((e1Var = c2Var2.i0.B0) == null || j3 != org.telegram.messenger.m5.o(e1Var.i()))) {
                    if (b4Var.y3 != null) {
                        for (int i12 = 0; i12 < b4Var.y3.peers.size(); i12++) {
                            if (j3 != org.telegram.messenger.m5.o(b4Var.y3.peers.get(i12).peer)) {
                            }
                        }
                    }
                    Context context2 = c2Var2.getContext();
                    long j10 = s0Var.c;
                    fi.b0 b0Var = new fi.b0(i7, c2Var2, s0Var);
                    fi.i0 i0Var = new fi.i0(1 == true ? 1 : 0);
                    org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context2, (org.telegram.ui.ActionBar.e6) i0Var, false);
                    u2Var.O();
                    LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                    TextView g10 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                    org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.j5, i0Var);
                    g10.setTypeface(org.telegram.messenger.g0.o());
                    g10.setText(hd.M0(2131751496, null));
                    f10.addView(g10, c8.ja.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i0Var);
                    n4Var.setText(hd.M0(2131751593, null));
                    f10.addView(n4Var, c8.ja.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var);
                    fp checkBoxRound = c2Var3.getCheckBoxRound();
                    int i13 = org.telegram.ui.ActionBar.j6.V6;
                    int i14 = org.telegram.ui.ActionBar.j6.g7;
                    int i15 = org.telegram.ui.ActionBar.j6.k7;
                    checkBoxRound.b(i13, i14, i15);
                    c2Var3.e(hd.M0(2131751502, null), null, false, true, false);
                    c2Var3.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i7) {
                                case 0:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i16 = org.telegram.ui.ActionBar.j6.i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i16, i0Var), 2, -1);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
                    c2Var3.setBackground(h02);
                    org.telegram.ui.ActionBar.q6.j(c2Var3, h02, null, M, i0Var);
                    f10.addView(c2Var3, c8.ja.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var4 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var);
                    c2Var4.getCheckBoxRound().b(i13, i14, i15);
                    c2Var4.e(hd.a0(null, null, 2131751587, org.telegram.messenger.m5.l(m10.t0, j10)), null, false, true, false);
                    final int i17 = 1;
                    c2Var4.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i17) {
                                case 0:
                                    c2Var4.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var4.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var4.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i16, i0Var), 2, -1);
                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i16);
                    c2Var4.setBackground(h03);
                    org.telegram.ui.ActionBar.q6.j(c2Var4, h03, null, M2, i0Var);
                    f10.addView(c2Var4, c8.ja.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var5 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var);
                    c2Var5.getCheckBoxRound().b(i13, i14, i15);
                    c2Var5.e(hd.a0(null, null, 2131751568, org.telegram.messenger.m5.l(m10.t0, j10)), null, false, false, false);
                    final int i18 = 2;
                    c2Var5.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    c2Var5.c(!r3.b(), true);
                                    break;
                                case 1:
                                    c2Var5.c(!r3.b(), true);
                                    break;
                                default:
                                    c2Var5.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i16, i0Var), 2, -1);
                    org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i16);
                    c2Var5.setBackground(h04);
                    org.telegram.ui.ActionBar.q6.j(c2Var5, h04, null, M3, i0Var);
                    f10.addView(c2Var5, c8.ja.o(-1, -2));
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context2, i0Var);
                    y8Var.setBackgroundColor(-16777216);
                    y8Var.setFixedSize(12);
                    f10.addView(y8Var, c8.ja.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    hi.d dVar2 = new hi.d(context2, i0Var, true);
                    dVar2.i(hd.M0(2131751513, null), false, true);
                    dVar2.setOnClickListener(new fi.d0(c2Var3, c2Var4, c2Var5, b0Var, u2Var, 0));
                    frameLayout.addView(dVar2, c8.ja.d(-1, 48.0f, ns.E1, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, c8.ja.o(-1, -2));
                    u2Var.O = f10;
                    u2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = c2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.a));
                ConnectionsManager.getInstance(c2Var2.O).sendRequest(deletegroupcallmessages, null);
                c2Var2.c(s0Var.a);
                return;
            case 21:
                fi.e1 e1Var2 = (fi.e1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int size = arrayList4.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList4.get(i19);
                    i19++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    ns.f(e1Var2.e).k(ns.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 22:
                ((fi.e1) this.b).G.remove((String) this.c);
                return;
            case 23:
                fi.b4 b4Var2 = (fi.b4) this.b;
                hi.l3 l3Var = (hi.l3) this.c;
                b4Var2.removeView(l3Var);
                if (b4Var2.N1 == l3Var) {
                    b4Var2.N1 = null;
                    return;
                }
                return;
            case 24:
                fi.b4 b4Var3 = (fi.b4) this.b;
                hi.sa D = hi.sa.D((Activity) this.c, b4Var3.m2);
                fi.a4 a4Var = b4Var3.w2;
                long j11 = (a4Var == null || (h9Var = (fi.h9) a4Var.c) == null) ? 0L : h9Var.currentPosition;
                File h = b4Var3.y1.h();
                TL_stories.StoryItem storyItem = b4Var3.y1.a;
                hi.d7 d7Var = new hi.d7();
                d7Var.n = true;
                d7Var.t = storyItem.media;
                int i20 = d7Var.a;
                d7Var.q = np.s1(i20).z1(storyItem.dialogId);
                d7Var.r = storyItem.id;
                d7Var.s = storyItem.caption;
                d7Var.L = h;
                d7Var.M = false;
                d7Var.k0 = 720;
                d7Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    d7Var.K = false;
                    if (h != null) {
                        d7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    d7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i21);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    d7Var.k0 = documentAttribute.w;
                                    d7Var.l0 = documentAttribute.h;
                                    d7Var.i = documentAttribute.duration;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            d7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i22 = 0; i22 < storyItem.media.document.thumbs.size(); i22++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i22);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    d7Var.O = org.telegram.messenger.fc.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i20);
                                    File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        d7Var.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                d7Var.A();
                d7Var.e(storyItem);
                hi.la d = hi.na.d(b4Var3.t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i23 = D.c;
                if (!D.d) {
                    if (np.s1(i23).v2()) {
                        org.telegram.ui.b.b(i23);
                    } else {
                        D.v0 = false;
                        D.e = false;
                        D.C2 = false;
                        if (windowManager != null && (raVar = D.n) != null && raVar.getParent() == null) {
                            org.telegram.messenger.g0.x3(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.L1 = d7Var;
                        hi.r8.a(i23, d7Var);
                        hi.d7 d7Var2 = D.L1;
                        D.P1 = (d7Var2 == null || !d7Var2.K) ? 0 : 1;
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
                        int i24 = D.K;
                        eaVar.setBackgroundColor((i24 == 1 || i24 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.L = 0.0f;
                        org.telegram.messenger.g0.g2(D.b);
                        hi.d7 d7Var3 = D.L1;
                        if (d7Var3 != null) {
                            D.d1.setText(d7Var3.C0);
                        }
                        D.K(new hi.s8(D, 7), j11);
                        D.c1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.w0 = 0L;
                        D.x0 = "";
                    }
                }
                D.R = new fi.t1(b4Var3, 12);
                D.S = new fi.y1(i7, b4Var3, D);
                return;
            case 25:
                fi.t3 t3Var = (fi.t3) this.b;
                fi.i9 i9Var = (fi.i9) this.c;
                t3Var.getClass();
                ((fi.z8) t3Var.x.A1).h(new ug.x0(i9Var.f, 14, false));
                return;
            case 26:
                fi.n4 n4Var2 = (fi.n4) this.b;
                String str3 = (String) this.c;
                n4Var2.f = null;
                fi.c5 c5Var = n4Var2.h;
                c5Var.R = false;
                c5Var.P.c = str3.toLowerCase();
                fi.c5.b(c5Var);
                return;
            case 27:
                z10 z10Var = (z10) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (z10Var != null) {
                    z10Var.a(Boolean.valueOf(tL_error == null));
                    return;
                }
                return;
            case 28:
                fi.d6 d6Var = (fi.d6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                fi.h6 h6Var2 = d6Var.q;
                int i25 = d6Var.c;
                ArrayList arrayList5 = d6Var.i;
                d6Var.I = 0;
                if (tLObject3 instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject3;
                    np.s1(i25).Y3(tL_foundStories.users, false);
                    np.s1(i25).S3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList6 = tL_foundStories.stories;
                    int size2 = arrayList6.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList6.get(i26);
                        i26++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = org.telegram.messenger.m5.o(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList5.size();
                        gj gjVar2 = new gj(i25, tL_foundStory2.storyItem);
                        gjVar2.r0(false);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(Integer.valueOf(arrayList5.size()));
                        d6Var.F.add(arrayList7);
                        arrayList5.add(gjVar2);
                    }
                    d6Var.J = Math.max(arrayList5.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        d6Var.J = arrayList5.size();
                    }
                    if (arrayList5.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    d6Var.H = str;
                    d6Var.G = false;
                    org.telegram.messenger.g0.r(h6Var2);
                    org.telegram.messenger.g0.h3(h6Var2);
                    return;
                }
                return;
            default:
                fi.g6 g6Var = (fi.g6) this.b;
                List list = (List) this.c;
                ArrayList arrayList8 = g6Var.h;
                arrayList8.clear();
                arrayList8.addAll(list);
                g6Var.d = true;
                g6Var.e = false;
                g6Var.d();
                ns.f(g6Var.a).k(ns.j3, Long.valueOf(g6Var.b), g6Var);
                return;
        }
    }

    public /* synthetic */ s2(v8 v8Var, boolean[] zArr, s10 s10Var) {
        this.a = 9;
        this.b = zArr;
        this.c = s10Var;
    }
}
