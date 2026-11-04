package org.telegram.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pp(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x0818, code lost:
    
        if (org.telegram.messenger.l10.x(r2.getMessagesController().a2(java.lang.Long.valueOf(r0))) != false) goto L302;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0860 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [int] */
    /* JADX WARN: Type inference failed for: r12v18 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        int i10;
        int i11;
        a0.h hVar;
        ArrayList arrayList3;
        int size;
        int i12;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i13;
        ArrayList arrayList4;
        ActionBarLayout actionBarLayout;
        int i14 = 8;
        int i15 = 2;
        TLRPC.UserFull userFull = null;
        boolean z10 = false;
        int i16 = 1;
        switch (this.a) {
            case 0:
                int i17 = 3;
                nq nqVar = (nq) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                a0.h hVar2 = nqVar.L;
                a0.h hVar3 = nqVar.M;
                int i18 = nqVar.e1;
                a0.h hVar4 = nqVar.K;
                int i19 = nqVar.O;
                ArrayList arrayList7 = nqVar.F;
                int i20 = 0;
                int i21 = 0;
                while (i21 < arrayList5.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList5.get(i21);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList6.get(i21);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        i3 = i17;
                        i20 = i20;
                    } else {
                        if (i19 == i16) {
                            i11 = i16;
                            i10 = i20;
                            nqVar.getMessagesController().I3(nqVar.N, tL_channels_channelParticipants);
                        } else {
                            i10 = i20;
                            i11 = i16;
                        }
                        nqVar.getMessagesController().Y3(tL_channels_channelParticipants.users, z10);
                        nqVar.getMessagesController().S3(tL_channels_channelParticipants.chats, z10);
                        long e10 = nqVar.getUserConfig().e();
                        if (i18 != 0) {
                            ?? r12 = z10;
                            while (true) {
                                if (r12 < tL_channels_channelParticipants.participants.size()) {
                                    if (org.telegram.messenger.zi.C1(tL_channels_channelParticipants.participants.get(r12).peer) == e10) {
                                        tL_channels_channelParticipants.participants.remove((int) r12);
                                    } else {
                                        r12++;
                                    }
                                }
                            }
                        }
                        if (i19 == 2) {
                            nqVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = nqVar.H;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = nqVar.G;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i12 = 0;
                            while (i12 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                                ArrayList arrayList8 = arrayList5;
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                if (channelParticipant.user_id == e10) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, org.telegram.messenger.zi.C1(channelParticipant.peer));
                                }
                                i12++;
                                arrayList5 = arrayList8;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                            }
                            arrayList = arrayList5;
                            int size2 = arrayList3.size() + i10;
                            if (i19 == 2) {
                                int size3 = arrayList7.size();
                                int i22 = 0;
                                while (i22 < size3) {
                                    TLObject tLObject = (TLObject) arrayList7.get(i22);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        int i23 = size3;
                                        i13 = size2;
                                        long C1 = org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(C1) == null && hVar2.f(C1) == null) {
                                            if (i18 == i11 && C1 > 0) {
                                                arrayList4 = arrayList6;
                                                break;
                                            } else {
                                                arrayList4 = arrayList6;
                                            }
                                            size3 = i23;
                                        } else {
                                            arrayList4 = arrayList6;
                                        }
                                        arrayList7.remove(i22);
                                        hVar4.l(C1);
                                        i22--;
                                        size3 = i23 - 1;
                                    } else {
                                        arrayList7.remove(i22);
                                        i22--;
                                        size3--;
                                        i13 = size2;
                                        arrayList4 = arrayList6;
                                    }
                                    i22++;
                                    size2 = i13;
                                    arrayList6 = arrayList4;
                                    i11 = 1;
                                }
                            }
                            int i24 = size2;
                            arrayList2 = arrayList6;
                            i3 = i17;
                            if ((i19 != 0 || i19 == i3 || i19 == 2) && (chat = nqVar.n) != null && chat.megagroup) {
                                chatFull = nqVar.r;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    nqVar.E0(arrayList3);
                                    i20 = i24;
                                }
                            }
                            if (i19 == 1) {
                                try {
                                    Collections.sort(arrayList7, new org.telegram.messenger.tq(24));
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                            }
                            i20 = i24;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList7;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i12 = 0;
                        while (i12 < size) {
                        }
                        arrayList = arrayList5;
                        int size22 = arrayList3.size() + i10;
                        if (i19 == 2) {
                        }
                        int i242 = size22;
                        arrayList2 = arrayList6;
                        i3 = i17;
                        if (i19 != 0) {
                        }
                        chatFull = nqVar.r;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            nqVar.E0(arrayList3);
                            i20 = i242;
                        }
                        if (i19 == 1) {
                        }
                        i20 = i242;
                    }
                    i21++;
                    i17 = i3;
                    arrayList6 = arrayList2;
                    arrayList5 = arrayList;
                    z10 = false;
                    i16 = 1;
                }
                int i25 = i20;
                if (i19 != 2 || nqVar.k1 <= 0) {
                    iq iqVar = nqVar.a;
                    nqVar.D0(iqVar != null ? iqVar.d.d1 : 0);
                    nqVar.Q = false;
                    nqVar.R = true;
                    org.telegram.ui.ActionBar.f5 f5Var = nqVar.f;
                    if (f5Var != null) {
                        f5Var.setVisibility((i19 != 0 || i25 > 5) ? 0 : 8);
                    }
                }
                nqVar.G0();
                iq iqVar2 = nqVar.a;
                if (iqVar2 != null) {
                    ci.j1 j1Var = nqVar.c;
                    j1Var.X1 = nqVar.B1;
                    j1Var.Y1 = 0;
                    iqVar2.f();
                    org.telegram.ui.Components.zu0 zu0Var = nqVar.b;
                    if (zu0Var != null && nqVar.a.d.d1 == 0 && nqVar.R) {
                        zu0Var.e(false, true);
                    }
                }
                nqVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                uw uwVar = (uw) this.b;
                ad adVar = (ad) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                uwVar.removeSelfFromStack();
                adVar.removeSelfFromStack();
                d2Var.finishFragment();
                break;
            case 2:
                uw uwVar2 = (uw) this.b;
                uwVar2.G4((tw) this.c);
                jw jwVar = uwVar2.A0;
                if (jwVar != null && jwVar.getVisibility() == 0) {
                    uwVar2.A0.c();
                    break;
                }
                break;
            case 3:
                kw kwVar = (kw) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) this.d;
                uw uwVar3 = kwVar.b;
                if (!zArr[0]) {
                    sy.f1(uwVar3, moVar, null);
                    break;
                } else {
                    uwVar3.presentFragment(new cy(moVar, null));
                    break;
                }
            case 4:
                fx fxVar = (fx) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.d;
                fxVar.getClass();
                fxVar.o((TLRPC.TL_messages_stickerSet) tLObject2, ziVar);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ArrayList arrayList9 = ExternalActionActivity.y;
                try {
                    s1Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.s1 w02 = org.telegram.ui.Components.t4.w0(externalActionActivity, org.telegram.messenger.bd.M0(2131743830, null), true);
                        if (w02 != null) {
                            w02.setOnDismissListener(new ci.h3(10, externalActionActivity, tL_error));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else {
                        if (!"BOT_INVALID".equals(tL_error.text) && !"PUBLIC_KEY_REQUIRED".equals(tL_error.text) && !"PUBLIC_KEY_INVALID".equals(tL_error.text) && !"SCOPE_EMPTY".equals(tL_error.text) && !"PAYLOAD_EMPTY".equals(tL_error.text)) {
                            externalActionActivity.setResult(0);
                            externalActionActivity.finish();
                        }
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    }
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 6:
                ez ezVar = (ez) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                ez.x0(tL_error2, ezVar, org.telegram.ui.Components.fc.a0(ezVar));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.hp.e1().edit().putBoolean("n_0", true).apply();
                    ezVar.getMessagesController().c3(true, null);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    cy cyVar = new cy(ezVar.r, tL_chatlists_exportedChatlistInvite.invite);
                    cyVar.y = new gy(ezVar, i16);
                    cyVar.x = new gy(ezVar, i15);
                    ezVar.presentFragment(cyVar);
                    org.telegram.messenger.g0.i3(new ly(false ? 1 : 0, ezVar, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                sy syVar = (sy) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = syVar.p1;
                ez.x0(tL_error3, d2Var2, new org.telegram.ui.Components.fc(syVar.T1, null));
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    org.telegram.messenger.hp.e1().edit().putBoolean("n_0", true).apply();
                    syVar.dismiss();
                    d2Var2.getMessagesController().c3(true, null);
                    d2Var2.presentFragment(new cy(syVar.R1, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                    break;
                }
                break;
            case 8:
                yy yyVar = (yy) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                wy wyVar = (wy) this.d;
                if (tL_error4 != null) {
                    org.telegram.ui.Components.fc.a0(yyVar.a).t(org.telegram.messenger.bd.M0(2131743889, null), null).j();
                    org.telegram.messenger.g0.r(wyVar);
                    break;
                }
                break;
            case 9:
                c00 c00Var = (c00) this.b;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.c;
                org.telegram.messenger.mo moVar2 = (org.telegram.messenger.mo) this.d;
                FiltersSetupActivity filtersSetupActivity = c00Var.e;
                if (s1Var2 != null) {
                    try {
                        s1Var2.dismiss();
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                    }
                }
                filtersSetupActivity.getMessagesController().h4(moVar2);
                org.telegram.messenger.qr messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.pq(false ? 1 : 0, messagesStorage, moVar2));
                break;
            case 10:
                p40 p40Var = (p40) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                r40 r40Var = p40Var.J;
                kg.v1 v1Var = p40Var.f;
                if (p40Var.n) {
                    p40Var.h = null;
                    p40Var.d = arrayList10;
                    p40Var.e = arrayList11;
                    v1Var.f(arrayList10, null);
                    r40Var.v0(p40Var.I);
                    p40Var.f();
                    if (p40Var.n && !v1Var.e() && p40Var.b() == 0) {
                        r40Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                o50 o50Var = (o50) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str = (String) this.d;
                if (!o50Var.N) {
                    o50Var.f.setText(tL_langPackString.value);
                    org.telegram.messenger.hp.e1().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                q50 q50Var = (q50) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                if (q50Var.h) {
                    q50Var.d = arrayList12;
                    q50Var.e = arrayList13;
                    q50Var.f();
                    q50Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                wm wmVar = (wm) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = LaunchActivity.E1;
                if (tL_error5 == null) {
                    if (user != null && !org.telegram.messenger.l10.B(user)) {
                        org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.a0(null, null, 2131748192, org.telegram.messenger.l10.j(user, true)), org.telegram.ui.Components.fc.a0(wmVar), R.raw.contact_check, 36);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.fc.a0(wmVar).f0(tL_error5, false);
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ly lyVar = (ly) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (tLObject5 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject5;
                    org.telegram.ui.Components.t4.w0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                ly lyVar2 = (ly) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                String str4 = LaunchActivity.E1;
                try {
                    lyVar2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error6.text)) {
                        org.telegram.ui.Components.t4.w0(launchActivity2, org.telegram.messenger.bd.M0(2131743830, null), true);
                    } else {
                        launchActivity2.F0(org.telegram.ui.Components.t4.M(launchActivity2, null, org.telegram.messenger.bd.M0(2131751106, null) + "\n" + tL_error6.text));
                    }
                    break;
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                    return;
                }
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.c;
                File file = (File) this.d;
                String str5 = LaunchActivity.E1;
                j6Var.d(file, j6Var.c);
                org.telegram.messenger.g0.h3(new m60(launchActivity3, i14));
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str6 = LaunchActivity.E1;
                int i26 = iArr[0] - 1;
                iArr[0] = i26;
                if (i26 == 0) {
                    org.telegram.messenger.hs.f(launchActivity4.P).k(org.telegram.messenger.hs.v5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 18:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) this.d;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    String str7 = LaunchActivity.E1;
                    launchActivity5.i0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                    launchActivity5.U0 = j6Var2;
                    launchActivity5.S0 = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                    launchActivity5.T0 = tL_wallPaper;
                    org.telegram.messenger.w7.G(j6Var2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 19:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                p70 p70Var = (p70) this.d;
                String str8 = LaunchActivity.E1;
                org.telegram.messenger.hp.s1(launchActivity6.P).X3(user2, true, false);
                p70Var.a(user2);
                break;
            case 20:
                androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.b;
                String str9 = (String) this.c;
                String str10 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) fVar.b;
                String str11 = LaunchActivity.E1;
                if (!"rebuild".equals(str9)) {
                    if (!"keys".equals(str9)) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                        String str12 = "Blue";
                        String string = sharedPreferences.getString("lastDayTheme", "Blue");
                        if (org.telegram.ui.ActionBar.k6.Q0(string) != null && !org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                            str12 = string;
                        }
                        String str13 = "Dark Blue";
                        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        if (org.telegram.ui.ActionBar.k6.Q0(string2) != null && org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                            str13 = string2;
                        }
                        boolean z11 = "night".equals(str9) || !("day".equals(str9) || org.telegram.ui.ActionBar.k6.I.q());
                        if (z11) {
                            str12 = str13;
                        }
                        org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(str12);
                        StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                        sb2.append(z11 ? "night" : "day");
                        sb2.append(" (");
                        sb2.append(Q0.m());
                        sb2.append("), style ");
                        sb2.append(str10);
                        Log.i("tmessages", sb2.toString());
                        if (!"instant".equals(str10)) {
                            if (!"fade".equals(str10)) {
                                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, Q0, Boolean.FALSE, new int[]{launchActivity7.A0.getMeasuredWidth() / 2, launchActivity7.A0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z11), null);
                                break;
                            } else {
                                org.telegram.ui.ActionBar.k6.K1(Q0, false, -1, null);
                                break;
                            }
                        } else {
                            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, Q0, Boolean.FALSE, null, -1);
                            break;
                        }
                    } else {
                        HashSet s6 = org.telegram.ui.ActionBar.r6.s();
                        StringBuilder sb3 = new StringBuilder();
                        Iterator it = s6.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (sb3.length() > 0) {
                                sb3.append(',');
                            }
                            sb3.append(org.telegram.ui.ActionBar.u4.c(intValue));
                        }
                        Log.i("tmessages", "DEBUG_THEME keys on screen (" + s6.size() + "): " + ((Object) sb3));
                        break;
                    }
                } else {
                    try {
                        launchActivity7.y0(true);
                        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = launchActivity7.t0) != null) {
                            actionBarLayout.X(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e16) {
                        org.telegram.messenger.a8.g(e16, true);
                        return;
                    }
                }
                break;
            case 21:
                m90 m90Var = (m90) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str14 = (String) this.d;
                m90Var.c();
                if (tLObject7 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.t4.w0(m90Var.a, org.telegram.messenger.bd.M0(2131743830, null), true);
                    }
                    i90 i90Var = new i90(m90Var, str14, 2);
                    if (!password.has_password) {
                        ra1 ra1Var = new ra1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        ra1Var.k0 = i90Var;
                        m90Var.u(ra1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.J = password;
                        twoStepVerificationActivity.K = false;
                        m90Var.u(twoStepVerificationActivity, false);
                        i90Var.run();
                        break;
                    }
                }
                break;
            case 22:
                j90 j90Var = (j90) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                if (tLObject8 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject8;
                    j90Var.getMessagesController().Y3(tL_users_userFull.users, false);
                    j90Var.getMessagesController().S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                org.telegram.ui.Components.voip.n1.m(user3, false, userFull2 != null && userFull2.video_calls_available, j90Var.getParentActivity(), userFull2, j90Var.getAccountInstance());
                break;
            case 23:
                la0 la0Var = (la0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(la0Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e17) {
                    org.telegram.messenger.a8.g(e17, true);
                }
                org.telegram.messenger.g0.i3(new pp(la0Var, viewGroup, gLSurfaceView, 25), 100L);
                break;
            case 24:
                la0 la0Var2 = (la0) this.b;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                la0Var2.getClass();
                try {
                    s1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                s1VarArr[0] = null;
                la0Var2.H0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                la0Var2.finishFragment();
                break;
            case 25:
                la0 la0Var3 = (la0) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e18) {
                    org.telegram.messenger.a8.g(e18, true);
                }
                la0Var3.J = true;
                la0Var3.finishFragment();
                break;
            case 26:
                ((xd0) this.b).z1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 27:
                xd0 xd0Var = (xd0) this.b;
                Bundle bundle = (Bundle) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                xd0Var.getClass();
                xd0Var.p1(bundle, (TLRPC.auth_SentCode) tLObject9, true);
                break;
            case 28:
                ai.a0 a0Var = (ai.a0) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                a0Var.getClass();
                editText.removeTextChangedListener(a0Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            default:
                lb0 lb0Var = (lb0) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                xd0 xd0Var2 = lb0Var.a0;
                if (!(tLObject10 instanceof TL_account.TL_emailVerified) || xd0Var2.G != 3) {
                    if (!(tLObject10 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject10 instanceof TLRPC.TL_auth_authorization) {
                            xd0Var2.x1((TLRPC.TL_auth_authorization) tLObject10, false);
                            break;
                        }
                    } else {
                        xd0Var2.p1(bundle2, ((TL_account.TL_emailVerifiedLogin) tLObject10).sent_code, true);
                        break;
                    }
                } else {
                    xd0Var2.finishFragment();
                    xd0Var2.e0.run();
                    break;
                }
                break;
        }
    }
}
