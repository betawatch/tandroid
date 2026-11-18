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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        org.telegram.ui.Components.lc b02;
        int i7;
        fj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions2;
        fi.c1 c1Var;
        hi.sa saVar;
        fi.e9 e9Var;
        int i10 = this.a;
        int i11 = R.raw.error;
        final int i12 = 0;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) this.b;
                if (((x8) this.c).e) {
                    f6Var.g2.setLoading(false);
                    f6Var.x1();
                    return;
                } else {
                    org.telegram.ui.Components.gc Q = f6Var.k().Q(R.raw.error, 36, gd.a0(null, null, 2131743641, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    return;
                }
            case 1:
                ((f6) this.b).k().g0((TLRPC.TL_error) this.c, false);
                return;
            case 2:
                mp.u1(((f6) this.b).a).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 3:
                f6 f6Var2 = (f6) this.b;
                org.telegram.ui.Components.lc.b0((bn) this.c).L(R.raw.gift, gd.M0(2131744861, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744859, org.telegram.messenger.n5.t(f6Var2.T1))), gd.M0(2131744860, null), new k1(f6Var2, 12)).k(true);
                return;
            case 4:
                f6 f6Var3 = (f6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                f6Var3.getClass();
                zArr[0] = true;
                f6Var3.g2.setLoading(false);
                f6Var3.x1();
                return;
            case 5:
                f6 f6Var4 = (f6) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                n10.u(gd.a0(null, null, 2131749446, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), f6Var4.k(), R.raw.ic_delete, 36);
                return;
            case 6:
                ((f6) this.b).B2((CharSequence) this.c);
                return;
            case 7:
                f6.h1((f6) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            case 8:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                u1Var.dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        str = null;
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i7 = 2131743644;
                    } else {
                        b02 = org.telegram.ui.Components.lc.b0(T);
                        i11 = R.raw.fire_on;
                        i7 = 2131743643;
                        str = null;
                    }
                    org.telegram.messenger.f3.n(str, i7, b02, i11, 36);
                    return;
                }
                return;
            case 9:
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
                fj fjVar = messageObject;
                v8 v8Var = x8.y(fjVar.K1, false).B;
                if (v8Var != null) {
                    v8Var.b();
                }
                TLRPC.ChatFull chatFull = bnVar.r8;
                mc mcVar = new mc(k6Var.getContext(), bnVar.getCurrentAccount(), bnVar.a(), bnVar, fjVar, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, bnVar.getResourceProvider());
                fjVar.e1();
                org.telegram.ui.Cells.z zVar3 = k6Var.b;
                mcVar.Q1 = bnVar;
                mcVar.R1 = zVar3;
                mcVar.show();
                return;
            case 10:
                TLObject tLObject = (TLObject) this.b;
                ai.g0 g0Var = (ai.g0) this.c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    g0Var.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    g0Var.a(null);
                    return;
                }
            case 11:
                boolean[] zArr2 = (boolean[]) this.b;
                q10 q10Var = (q10) this.c;
                if (zArr2[0]) {
                    return;
                }
                q10Var.a("cancelled", 0L);
                zArr2[0] = true;
                return;
            case 12:
                o8 o8Var = (o8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = o8Var.l;
                int i13 = o8Var.a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    mp.u1(i13).f4(tL_payments_savedStarGifts.users, false);
                    mp.u1(i13).Z3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i14 = 0;
                        while (i14 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i14)).pinned_to_top) {
                            i14++;
                        }
                        arrayList3.add(i14, savedStarGift);
                        ks.f(i13).k(ks.I3, Long.valueOf(o8Var.b), o8Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((mp) this.b).V3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 14:
                new org.telegram.ui.Components.lc(((org.telegram.ui.ActionBar.x2[]) this.b)[0].F, (org.telegram.ui.ActionBar.i6) this.c).Q(R.raw.copy, 36, gd.M0(2131744712, null)).k(false);
                return;
            case 15:
                mc mcVar2 = (mc) this.b;
                v8 v8Var2 = (v8) this.c;
                mcVar2.O1 = true;
                mcVar2.K0(new t8(v8Var2, 2));
                org.telegram.messenger.g0.h3(new qb(mcVar2, 1), 240L);
                return;
            case 16:
                ((v0.g) this.b).a((w0.d) this.c);
                return;
            case 17:
                ((v0.g) this.b).onResult((v0.f) this.c);
                return;
            case 18:
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
            case 19:
                Context context = (Context) this.b;
                h2.i iVar = (h2.i) this.c;
                f2.i.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                iVar.e();
                return;
            case 20:
                ((fi.f9) this.b).N(ProfileActivity.D4(((fi.r0) this.c).c));
                return;
            case 21:
                fi.a2 a2Var = (fi.a2) this.b;
                org.telegram.messenger.g0.g(((fi.m0) this.c).w);
                if (org.telegram.messenger.g0.G3()) {
                    Toast.makeText(a2Var.getContext(), gd.M0(2131743959, null), 0).show();
                    return;
                }
                return;
            case 22:
                fi.a2 a2Var2 = (fi.a2) this.b;
                fi.r0 r0Var = (fi.r0) this.c;
                long j3 = r0Var.c;
                fi.z3 z3Var = a2Var2.j0;
                if (j3 != j10.i(z3Var.m2).e() && ((c1Var = a2Var2.i0.B0) == null || j3 != org.telegram.messenger.n5.o(c1Var.i()))) {
                    if (z3Var.y3 != null) {
                        for (int i15 = 0; i15 < z3Var.y3.peers.size(); i15++) {
                            if (j3 != org.telegram.messenger.n5.o(z3Var.y3.peers.get(i15).peer)) {
                            }
                        }
                    }
                    Context context2 = a2Var2.getContext();
                    long j10 = r0Var.c;
                    fi.b0 b0Var = new fi.b0(i12, a2Var2, r0Var);
                    fi.h0 h0Var = new fi.h0(1 == true ? 1 : 0);
                    org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, context2, (org.telegram.ui.ActionBar.i6) h0Var, false);
                    x2Var.O();
                    LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, h0Var);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setText(gd.M0(2131751485, null));
                    g10.addView(textView, c8.ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, h0Var);
                    o4Var.setText(gd.M0(2131751582, null));
                    g10.addView(o4Var, c8.ma.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    org.telegram.ui.Components.mp checkBoxRound = d2Var.getCheckBoxRound();
                    int i16 = org.telegram.ui.ActionBar.n6.V6;
                    int i17 = org.telegram.ui.ActionBar.n6.g7;
                    int i18 = org.telegram.ui.ActionBar.n6.k7;
                    checkBoxRound.b(i16, i17, i18);
                    d2Var.e(gd.M0(2131751491, null), null, false, true, false);
                    d2Var.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
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
                    int i19 = org.telegram.ui.ActionBar.n6.i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i19, h0Var), 2, -1);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i19);
                    d2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, h0Var);
                    g10.addView(d2Var, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    d2Var2.getCheckBoxRound().b(i16, i17, i18);
                    d2Var2.e(gd.a0(null, null, 2131751576, org.telegram.messenger.n5.l(j10.t0, j10)), null, false, true, false);
                    final int i20 = 1;
                    d2Var2.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
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
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i19, h0Var), 2, -1);
                    org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i19);
                    d2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.u6.j(d2Var2, h03, null, M2, h0Var);
                    g10.addView(d2Var2, c8.ma.o(-1, -2));
                    final org.telegram.ui.Cells.d2 d2Var3 = new org.telegram.ui.Cells.d2(context2, 4, 21, true, h0Var);
                    d2Var3.getCheckBoxRound().b(i16, i17, i18);
                    d2Var3.e(gd.a0(null, null, 2131751557, org.telegram.messenger.n5.l(j10.t0, j10)), null, false, false, false);
                    final int i21 = 2;
                    d2Var3.setOnClickListener(new View.OnClickListener() { // from class: fi.c0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
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
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i19, h0Var), 2, -1);
                    org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i19);
                    d2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.u6.j(d2Var3, h04, null, M3, h0Var);
                    g10.addView(d2Var3, c8.ma.o(-1, -2));
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2, h0Var);
                    a9Var.setBackgroundColor(-16777216);
                    a9Var.setFixedSize(12);
                    g10.addView(a9Var, c8.ma.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    hi.d dVar2 = new hi.d(context2, h0Var, true);
                    dVar2.i(gd.M0(2131751502, null), false, true);
                    dVar2.setOnClickListener(new fi.d0(d2Var, d2Var2, d2Var3, b0Var, x2Var, 0));
                    frameLayout.addView(dVar2, c8.ma.d(-1, 48.0f, ks.E1, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, c8.ma.o(-1, -2));
                    x2Var.O = g10;
                    x2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = a2Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(r0Var.a));
                ConnectionsManager.getInstance(a2Var2.O).sendRequest(deletegroupcallmessages, null);
                a2Var2.c(r0Var.a);
                return;
            case 23:
                fi.c1 c1Var2 = (fi.c1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int size = arrayList4.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj = arrayList4.get(i22);
                    i22++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    ks.f(c1Var2.e).k(ks.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 24:
                ((fi.c1) this.b).G.remove((String) this.c);
                return;
            case 25:
                fi.z3 z3Var2 = (fi.z3) this.b;
                hi.m3 m3Var = (hi.m3) this.c;
                z3Var2.removeView(m3Var);
                if (z3Var2.N1 == m3Var) {
                    z3Var2.N1 = null;
                    return;
                }
                return;
            case 26:
                fi.z3 z3Var3 = (fi.z3) this.b;
                hi.ta D = hi.ta.D((Activity) this.c, z3Var3.m2);
                fi.y3 y3Var = z3Var3.w2;
                long j11 = (y3Var == null || (e9Var = (fi.e9) y3Var.c) == null) ? 0L : e9Var.currentPosition;
                File h = z3Var3.y1.h();
                TL_stories.StoryItem storyItem = z3Var3.y1.a;
                hi.d7 d7Var = new hi.d7();
                d7Var.n = true;
                d7Var.t = storyItem.media;
                int i23 = d7Var.a;
                d7Var.q = mp.u1(i23).B1(storyItem.dialogId);
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
                        int i24 = 0;
                        while (true) {
                            if (i24 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i24);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    d7Var.k0 = documentAttribute.w;
                                    d7Var.l0 = documentAttribute.h;
                                    d7Var.i = documentAttribute.duration;
                                } else {
                                    i24++;
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
                            for (int i25 = 0; i25 < storyItem.media.document.thumbs.size(); i25++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i25);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    d7Var.O = org.telegram.messenger.ec.F(null, photoSize.bytes);
                                } else {
                                    org.telegram.messenger.w7.G(i23);
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
                hi.ma d = hi.oa.d(z3Var3.t0);
                RectF rectF = D.I;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i26 = D.c;
                if (!D.d) {
                    if (mp.u1(i26).A2()) {
                        org.telegram.ui.b.b(i26);
                    } else {
                        D.v0 = false;
                        D.e = false;
                        D.C2 = false;
                        if (windowManager != null && (saVar = D.n) != null && saVar.getParent() == null) {
                            org.telegram.messenger.g0.w3(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.L1 = d7Var;
                        hi.r8.a(i26, d7Var);
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
                        hi.fa faVar = D.i0;
                        int i27 = D.K;
                        faVar.setBackgroundColor((i27 == 1 || i27 == 0) ? 0 : -14737633);
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
                D.R = new fi.r1(z3Var3, 12);
                D.S = new fi.w1(i12, z3Var3, D);
                return;
            case 27:
                fi.r3 r3Var = (fi.r3) this.b;
                fi.f9 f9Var = (fi.f9) this.c;
                r3Var.getClass();
                ((fi.w8) r3Var.x.A1).h(new ug.z0(f9Var.f, 14, false));
                return;
            case 28:
                fi.l4 l4Var = (fi.l4) this.b;
                String str3 = (String) this.c;
                l4Var.f = null;
                fi.a5 a5Var = l4Var.h;
                a5Var.R = false;
                a5Var.P.c = str3.toLowerCase();
                fi.a5.b(a5Var);
                return;
            default:
                x10 x10Var = (x10) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (x10Var != null) {
                    x10Var.a(Boolean.valueOf(tL_error2 == null));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ w2(x8 x8Var, boolean[] zArr, q10 q10Var) {
        this.a = 11;
        this.b = zArr;
        this.c = q10Var;
    }
}
