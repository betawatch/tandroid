package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ox0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    private final void a() {
        vh.k4 k4Var = (vh.k4) this.c;
        Bitmap[] bitmapArr = (Bitmap[]) this.d;
        vh.n5 n5Var = (vh.n5) this.e;
        boolean[] zArr = (boolean[]) this.b;
        org.telegram.ui.Components.s9 s9Var = k4Var.G;
        Bitmap bitmap = k4Var.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            k4Var.a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        k4Var.a = bitmap2;
        if (n5Var != null && !n5Var.c && n5Var.K && bitmap2 != null) {
            n5Var.k0 = bitmap2.getWidth();
            n5Var.l0 = k4Var.a.getHeight();
            n5Var.A();
        }
        if (zArr[0] && n5Var != null && s9Var != null && k4Var.a != null) {
            s9Var.e();
            s9Var.f(n5Var.b(0.2f, k4Var.a), false);
            vh.y6 y6Var = k4Var.w;
            if (y6Var != null) {
                y6Var.run();
            }
        }
        k4Var.r();
        k4Var.invalidate();
    }

    private final void b() {
        int i10;
        long j10;
        int i11;
        long j11;
        long j12;
        ArrayList arrayList;
        vh.n5 n5Var = (vh.n5) this.c;
        String str = (String) this.d;
        int[][] iArr = (int[][]) this.e;
        org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.b;
        n5Var.getClass();
        org.telegram.messenger.y20 y20Var = new org.telegram.messenger.y20();
        char c10 = 1;
        y20Var.J = true;
        y20Var.a0 = n5Var.c1;
        y20Var.h = n5Var.k0;
        y20Var.i = n5Var.l0;
        y20Var.k = n5Var.i0;
        y20Var.l = n5Var.j0;
        File file = n5Var.P0;
        y20Var.B = file == null ? null : file.getPath();
        File file2 = n5Var.W0;
        y20Var.D = file2 == null ? null : file2.getPath();
        File file3 = n5Var.X0;
        y20Var.E = file3 == null ? null : file3.getPath();
        File file4 = n5Var.Y0;
        y20Var.F = file4 == null ? null : file4.getPath();
        int v = MediaController.v(y20Var.k, y20Var.l, y20Var.m, true);
        if (!n5Var.K || str == null || n5Var.v()) {
            File file5 = n5Var.Z0;
            if (file5 != null) {
                y20Var.o = file5.getAbsolutePath();
            } else {
                y20Var.o = str;
            }
            y20Var.I = true;
            y20Var.L = n5Var.S;
            if (n5Var.v()) {
                int i12 = 0;
                boolean z10 = false;
                while (i12 < n5Var.T.size()) {
                    vh.n5 n5Var2 = (vh.n5) n5Var.T.get(i12);
                    if (n5Var2.K) {
                        n5Var2.k0 = Math.max(n5Var2.k0, iArr[i12][c10]);
                        n5Var2.l0 = Math.max(n5Var2.l0, iArr[i12][2]);
                        i11 = v;
                        n5Var2.h0 = Math.max(n5Var2.h0, iArr[i12][4]);
                        z10 = true;
                    } else {
                        i11 = v;
                    }
                    i12++;
                    v = i11;
                    c10 = 1;
                }
                i10 = v;
                ArrayList a2 = org.telegram.messenger.x20.a(n5Var);
                y20Var.M = a2;
                if (z10) {
                    int size = a2.size();
                    long j13 = 0;
                    org.telegram.messenger.x20 x20Var = null;
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = a2.get(i13);
                        i13++;
                        org.telegram.messenger.x20 x20Var2 = (org.telegram.messenger.x20) obj;
                        if (x20Var2.b) {
                            long j14 = x20Var2.o;
                            if (j14 > j13) {
                                x20Var = x20Var2;
                                j13 = j14;
                            }
                        }
                    }
                    if (x20Var != null) {
                        float f7 = x20Var.o;
                        float f10 = x20Var.k;
                        float f11 = x20Var.j;
                        long j15 = (long) ((f10 - f11) * f7);
                        n5Var.h0 = j15;
                        y20Var.v = j15;
                        y20Var.r = j15;
                        j10 = -(x20Var.f + ((long) (f11 * f7)));
                        x20Var.f = j10;
                        ArrayList arrayList2 = y20Var.M;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            org.telegram.messenger.x20 x20Var3 = (org.telegram.messenger.x20) obj2;
                            if (x20Var3.b && x20Var3 != x20Var) {
                                x20Var3.f += j10;
                            }
                        }
                        y20Var.a = -1L;
                        y20Var.b = -1L;
                        y20Var.t = true;
                        y20Var.j = -1;
                        y20Var.u = 1.0f;
                        y20Var.m = -1;
                        y20Var.n = 30;
                        y20Var.q = (long) (((n5Var.h0 / 1000.0f) * i10) / 8.0f);
                        y20Var.A = null;
                    }
                } else {
                    long j16 = n5Var.S0;
                    n5Var.h0 = j16;
                    y20Var.v = j16;
                    y20Var.r = j16;
                }
            } else {
                i10 = v;
                if (n5Var.o0 != null) {
                    long j17 = (long) ((n5Var.t0 - n5Var.s0) * n5Var.q0);
                    n5Var.h0 = j17;
                    y20Var.v = j17;
                    y20Var.r = j17;
                } else if (n5Var.y != null) {
                    long j18 = (long) ((n5Var.F - n5Var.E) * n5Var.C);
                    n5Var.h0 = j18;
                    y20Var.v = j18;
                    y20Var.r = j18;
                } else {
                    long j19 = n5Var.S0;
                    n5Var.h0 = j19;
                    y20Var.v = j19;
                    y20Var.r = j19;
                }
            }
            j10 = 0;
            y20Var.a = -1L;
            y20Var.b = -1L;
            y20Var.t = true;
            y20Var.j = -1;
            y20Var.u = 1.0f;
            y20Var.m = -1;
            y20Var.n = 30;
            y20Var.q = (long) (((n5Var.h0 / 1000.0f) * i10) / 8.0f);
            y20Var.A = null;
        } else {
            y20Var.o = str;
            y20Var.I = false;
            y20Var.n = Math.min(59, iArr[0][7]);
            int E = MediaController.E(str);
            if (E == -1) {
                E = iArr[0][3];
            }
            y20Var.j = E;
            if (E >= 1000000 || (arrayList = n5Var.T0) == null || arrayList.isEmpty()) {
                int i15 = y20Var.j;
                if (i15 < 500000) {
                    y20Var.m = 2500000;
                    y20Var.j = -1;
                } else {
                    y20Var.m = Utilities.j(i15, 3000000, 500000);
                }
            } else {
                y20Var.m = 2000000;
                y20Var.j = -1;
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(y20Var.j);
            sb2.append(" => ");
            i0.a.p(y20Var.m, sb2);
            int i16 = iArr[0][4];
            long j20 = i16;
            n5Var.h0 = j20;
            y20Var.v = j20 * 1000;
            float f12 = j20;
            long j21 = ((long) (n5Var.Z * f12)) * 1000;
            y20Var.a = j21;
            long j22 = ((long) (n5Var.a0 * f12)) * 1000;
            y20Var.b = j22;
            y20Var.r = j22 - j21;
            y20Var.u = n5Var.P;
            y20Var.t = n5Var.Y;
            y20Var.q = (long) a1.g.A(i16 / 1000.0f, v, 8.0f, r2[5]);
            y20Var.q = Math.max(n5Var.L.length(), y20Var.q);
            y20Var.A = n5Var.a1;
            File file6 = n5Var.Q0;
            y20Var.C = file6 == null ? null : file6.getPath();
            j10 = 0;
        }
        y20Var.S = n5Var.a;
        y20Var.U = n5Var.z0;
        y20Var.T = n5Var.y0;
        y20Var.c = -1L;
        org.telegram.messenger.ze zeVar = n5Var.m0;
        if (zeVar != null) {
            y20Var.H = zeVar.clone();
        } else {
            y20Var.H = new org.telegram.messenger.ze();
        }
        y20Var.H.B = new Matrix();
        y20Var.H.B.set(n5Var.n0);
        y20Var.G = n5Var.T0;
        y20Var.Q = Integer.valueOf(n5Var.A0);
        y20Var.R = Integer.valueOf(n5Var.B0);
        y20Var.V = true;
        y20Var.K = n5Var.d1;
        y20Var.b0.clear();
        if (n5Var.v() && !n5Var.Y) {
            ArrayList arrayList3 = y20Var.M;
            int size3 = arrayList3.size();
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                org.telegram.messenger.x20 x20Var4 = (org.telegram.messenger.x20) obj3;
                if (x20Var4.b && x20Var4.e > 0.0f && !x20Var4.c) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(x20Var4.d);
                    mixedSoundInfo.volume = x20Var4.e;
                    float f13 = x20Var4.j;
                    float f14 = x20Var4.o;
                    mixedSoundInfo.audioOffset = ((long) (f13 * f14)) * 1000;
                    mixedSoundInfo.startTime = x20Var4.f * 1000;
                    mixedSoundInfo.duration = ((long) ((x20Var4.k - f13) * f14)) * 1000;
                    y20Var.b0.add(mixedSoundInfo);
                }
            }
        }
        File file7 = n5Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = n5Var.u0;
            float f15 = n5Var.s0;
            float f16 = n5Var.q0;
            long j23 = ((long) (f15 * f16)) * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (n5Var.K) {
                mixedSoundInfo2.startTime = ((long) (n5Var.r0 - (n5Var.Z * n5Var.h0))) * 1000;
                j12 = 0;
            } else {
                j12 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j24 = mixedSoundInfo2.startTime + j10;
            mixedSoundInfo2.startTime = j24;
            if (j24 < j12) {
                mixedSoundInfo2.audioOffset = j23 - j24;
                mixedSoundInfo2.startTime = j12;
            }
            mixedSoundInfo2.duration = ((long) ((n5Var.t0 - f15) * f16)) * 1000;
            y20Var.b0.add(mixedSoundInfo2);
        }
        String str2 = n5Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = n5Var.G;
            float f17 = n5Var.E;
            float f18 = n5Var.C;
            long j25 = ((long) (f17 * f18)) * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (n5Var.K) {
                mixedSoundInfo3.startTime = ((long) (n5Var.D - (n5Var.Z * n5Var.h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j26 = mixedSoundInfo3.startTime + j10;
            mixedSoundInfo3.startTime = j26;
            if (j26 < j11) {
                mixedSoundInfo3.audioOffset = j25 - j26;
                mixedSoundInfo3.startTime = j11;
            }
            mixedSoundInfo3.duration = ((long) ((n5Var.F - f17) * f18)) * 1000;
            y20Var.b0.add(mixedSoundInfo3);
        }
        r20Var.a(y20Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0184 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189 A[DONT_GENERATE] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        char c10;
        String G;
        org.telegram.ui.web.z0 z0Var;
        String str;
        int i12;
        int i13;
        vh.n5 n5Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        th.n7 n7Var;
        char c11;
        org.telegram.ui.ActionBar.k2 T;
        boolean z11;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList2;
        long j10 = 0;
        int i14 = 2;
        int i15 = 1;
        switch (this.a) {
            case 0:
                px0 px0Var = (px0) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                ProfileActivity profileActivity = px0Var.c.e;
                profileActivity.e5(null);
                if (!(tLObject instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.cc.d0(tL_error);
                    return;
                }
                TLObject Z1 = profileActivity.d1 != 0 ? profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1)) : profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.e1));
                if (profileActivity.getParentActivity() == null) {
                    return;
                }
                h10.a(profileActivity.getParentActivity(), 0, tL_username.username, Z1, (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.z0);
                return;
            case 1:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                try {
                    x1Var.dismiss();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (tL_error2 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    n41 n41Var = sessionsActivity.a;
                    if (n41Var != null) {
                        n41Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                try {
                    x1Var2.dismiss();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                if (tL_error3 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    n41 n41Var2 = sessionsActivity2.a;
                    if (n41Var2 != null) {
                        n41Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                m41 m41Var = (m41) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                k9 k9Var = (k9) this.e;
                m41Var.a = tLObject2;
                m41Var.b = tL_error4;
                k9Var.run();
                return;
            case 4:
                c51.d0((c51) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d, (String) this.e);
                return;
            case 5:
                d61 d61Var = (d61) this.c;
                cg.b bVar = (cg.b) this.d;
                String str2 = (String) this.e;
                r61 r61Var = (r61) this.b;
                s61 s61Var = d61Var.x;
                if (bVar != null) {
                    s61Var.U.l(str2, bVar);
                }
                if (bVar != null && !r61Var.b && (i10 = r61Var.a) >= 0) {
                    View m10 = s61Var.T.m(i10);
                    if (m10 instanceof d61) {
                        d61Var.r.e = bVar;
                        d61 d61Var2 = (d61) m10;
                        d61Var2.b.t0.d(false, false);
                        d61Var2.g(false);
                    }
                }
                s61.c0(s61Var);
                return;
            case 6:
                e61 e61Var = (e61) this.c;
                cg.b bVar2 = (cg.b) this.d;
                String str3 = (String) this.e;
                org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) this.b;
                e61Var.k = false;
                e61Var.d = bVar2;
                e61Var.g = str3;
                c61 c61Var = (c61) j20Var.run();
                if (c61Var != null) {
                    c61Var.e(e61Var, true);
                    return;
                }
                return;
            case 7:
                fa1 fa1Var = (fa1) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str4 = (String) this.e;
                org.telegram.ui.ActionBar.x1 x1Var3 = (org.telegram.ui.ActionBar.x1) this.b;
                ja1 ja1Var = fa1Var.a;
                if (tLObject3 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i16);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = ja1Var.getMessagesController().y1(ja1Var.a);
                            tL_messageService.dialog_id = ja1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
                            arrayList3.add(new org.telegram.messenger.kj(i11, tL_messageService, false, false));
                            TLRPC.Chat L0 = ja1Var.getMessagesController().L0(Long.valueOf(-ja1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j11 = ja1Var.b;
                            if (j11 != 0) {
                                tL_forumTopic.icon_emoji_id = j11;
                                z10 = true;
                                tL_forumTopic.flags |= 1;
                            } else {
                                z10 = true;
                            }
                            tL_forumTopic.my = z10;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = ja1Var.getMessagesController().y1(ja1Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = ja1Var.E;
                            un unVar = ja1Var.D;
                            if (unVar != null) {
                                unVar.fb();
                                unVar.jb();
                                unVar.Mb(arrayList3, L0, tL_messageService.id, 1, 1, tL_forumTopic);
                                unVar.c = true;
                                unVar.G8();
                                unVar.nd(true);
                                unVar.o1.n(true);
                                unVar.td();
                                unVar.f2.setCurrentTopic(unVar.b());
                                unVar.qd(true);
                                unVar.Gc(true);
                                unVar.w9(true);
                                unVar.K6(true, true);
                                unVar.Ya();
                                ja1Var.getMessagesController().r7.q(ja1Var.a, tL_forumTopic, true);
                                ja1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -ja1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                un unVar2 = new un(bundle);
                                unVar2.Mb(arrayList3, L0, tL_messageService.id, 1, 1, tL_forumTopic);
                                unVar2.c = true;
                                ja1Var.getMessagesController().r7.q(ja1Var.a, tL_forumTopic, true);
                                ja1Var.presentFragment(unVar2);
                            }
                        }
                    }
                }
                x1Var3.dismiss();
                return;
            case 8:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.c, (byte[]) this.e, (TLObject) this.d, (byte[]) this.b);
                return;
            case 9:
                rc1 rc1Var = (rc1) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                String str5 = (String) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    rc1Var.z0(new y01(19, rc1Var, str5));
                    return;
                }
                if (tL_error5 == null || tL_error5.text.startsWith("CODE_INVALID")) {
                    rc1Var.D0();
                    return;
                }
                if (!tL_error5.text.startsWith("FLOOD_WAIT")) {
                    rc1Var.L0(org.telegram.messenger.dd.L0(2131743956, null), tL_error5.text);
                    return;
                }
                int intValue = Utilities.z(tL_error5.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String L02 = org.telegram.messenger.dd.L0(2131743956, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                rc1Var.L0(L02, org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, objArr));
                return;
            case 10:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.c;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                String str6 = (String) this.e;
                JSONObject jSONObject = (JSONObject) this.b;
                if (v0Var.c && ((z0Var = v0Var.Q) == null || !z0Var.o(x0Var))) {
                    org.telegram.messenger.f8.b("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                v0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 11:
                final ph.f2 f2Var = (ph.f2) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                ph.c1 c1Var = (ph.c1) this.e;
                final View view = (View) this.b;
                org.telegram.ui.Components.wq0 wq0Var = f2Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    c1Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = f2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(f2Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z12 = savedStarGift.pinned_to_top;
                final boolean z13 = !z12;
                if (f2Var.e.o(savedStarGift, z13, false)) {
                    new ph.i2(f2Var.getContext(), wq0Var.c, savedStarGift, f2Var.c, new org.telegram.messenger.j20() { // from class: ph.z1
                        @Override // org.telegram.messenger.j20
                        public final Object run() {
                            ((c1) view).d(z13, true);
                            f2 f2Var2 = f2.this;
                            f2Var2.f.v0(0);
                            return cc.a0(f2Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z12) {
                    org.telegram.messenger.m5.n(null, 2131749889, org.telegram.ui.Components.cc.a0(wq0Var.a), R.raw.ic_unpin, 36);
                } else {
                    org.telegram.ui.Components.cc.a0(wq0Var.a).I(R.raw.ic_pin, org.telegram.messenger.dd.L0(2131750085, null), org.telegram.messenger.dd.L0(2131750086, null)).j();
                }
                ((ph.c1) view).d(z13, true);
                f2Var.f.v0(0);
                return;
            case 12:
                q5.b bVar3 = (q5.b) this.c;
                l5.i iVar = (l5.i) this.d;
                String str7 = iVar.a;
                i5.g gVar = (i5.g) this.e;
                l5.h hVar = (l5.h) this.b;
                bVar3.getClass();
                Logger logger = q5.b.f;
                try {
                    m5.f a2 = bVar3.c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.c(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) bVar3.e).f(new q5.a(bVar3, iVar, ((j5.b) a2).a(hVar), 0));
                        gVar.c(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.c(e10);
                    return;
                }
            case 13:
                org.telegram.ui.Components.s51 s51Var = (org.telegram.ui.Components.s51) this.c;
                qh.y yVar = (qh.y) this.d;
                org.telegram.messenger.s20 s20Var = (org.telegram.messenger.s20) this.e;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.b;
                if (qh.y.d(s51Var.getParentActivity())) {
                    yVar.e();
                    wn0 wn0Var = new wn0(10, false, false, null);
                    wn0Var.G = 1;
                    wn0Var.H = false;
                    wn0Var.y = false;
                    wn0Var.V = new q5.d(s20Var, s51Var, r20Var, 2);
                    s51Var.presentFragment(wn0Var);
                    return;
                }
                return;
            case 14:
                String str9 = (String) this.c;
                org.telegram.messenger.s20 s20Var2 = (org.telegram.messenger.s20) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
                org.telegram.messenger.r20 r20Var2 = (org.telegram.messenger.r20) this.b;
                try {
                    Point c12 = org.telegram.messenger.i0.c1();
                    Bitmap K = org.telegram.messenger.ic.K(str9, null, c12.x, c12.y, true);
                    if (K != null) {
                        str = qh.y.l(K, s20Var2);
                        try {
                            K.recycle();
                        } catch (Throwable th2) {
                            th = th2;
                            org.telegram.messenger.f8.g(th, true);
                            org.telegram.messenger.i0.g3(new qh.w(k2Var, str, r20Var2));
                            return;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = null;
                }
                org.telegram.messenger.i0.g3(new qh.w(k2Var, str, r20Var2));
                return;
            case 15:
                rh.h hVar2 = (rh.h) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                String str10 = (String) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                ph.x1 x1Var4 = hVar2.n;
                rh.i iVar2 = hVar2.r;
                if (iVar2.O) {
                    return;
                }
                hVar2.e = false;
                if (tLObject5 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                    i12 = ((org.telegram.ui.ActionBar.k2) iVar2).currentAccount;
                    org.telegram.messenger.wp.r1(i12).V3(starsStatus.users, false);
                    i13 = ((org.telegram.ui.ActionBar.k2) iVar2).currentAccount;
                    org.telegram.messenger.wp.r1(i13).P3(starsStatus.chats, false);
                    boolean z14 = ((starsStatus.flags & 1) == 0 || starsStatus.next_offset == null) ? false : true;
                    if (z14 && TextUtils.equals(str10, starsStatus.next_offset)) {
                        hVar2.h = true;
                    } else {
                        hVar2.b.addAll(starsStatus.history);
                        hVar2.d = starsStatus.next_offset;
                        hVar2.f = !z14;
                    }
                } else {
                    hVar2.h = true;
                    if (tL_error6 != null) {
                        org.telegram.ui.Components.cc.d0(tL_error6);
                    }
                }
                hVar2.c.f3.O(false);
                hVar2.removeCallbacks(x1Var4);
                hVar2.post(x1Var4);
                return;
            case 16:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                gf.e eVar = (gf.e) this.d;
                org.telegram.ui.ActionBar.x1 x1Var5 = (org.telegram.ui.ActionBar.x1) this.e;
                if (k2Var2 != null && tL_error7 != null) {
                    org.telegram.ui.Components.cc.a0(k2Var2).f0(tL_error7, false);
                }
                if ((k2Var2 instanceof un) && tL_error7 == null) {
                    ((un) k2Var2).wc();
                }
                eVar.b();
                x1Var5.dismiss();
                return;
            case 17:
                rh.e4 e4Var = (rh.e4) this.c;
                boolean[] zArr = (boolean[]) this.d;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) this.e;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) this.b;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                TL_stars.StarGift y12 = e4Var.y1();
                org.telegram.messenger.y9.c(e4Var.a).j(y12.gift_id, new pa(e4Var, y12, starGiftAttribute, ecVarArr, zArr, 6));
                return;
            case 18:
                rh.e4 e4Var2 = (rh.e4) this.c;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                e4Var2.d3 = true;
                e4Var2.i2(kjVar, null);
                e4Var2.s2(0, true, null);
                org.telegram.ui.Components.xz xzVar = e4Var2.S1;
                if (xzVar != null) {
                    xzVar.c(true);
                }
                rh.e6.y(e4Var2.a, false).O();
                rh.v5 G2 = rh.e6.y(e4Var2.a, false).G(org.telegram.messenger.e20.i(e4Var2.a).e(), false);
                if (G2 != null) {
                    G2.k(arrayList4, starGift);
                    return;
                }
                return;
            case 19:
                rh.e4 e4Var3 = (rh.e4) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                org.telegram.ui.Components.v41 v41Var = (org.telegram.ui.Components.v41) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                if (!(tLObject6 instanceof TLRPC.TL_messages_chatFull)) {
                    org.telegram.ui.Components.wb Y = e4Var3.k().Y(tL_error8);
                    Y.t = true;
                    Y.j();
                    return;
                }
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject6;
                org.telegram.messenger.wp.r1(e4Var3.a).V3(tL_messages_chatFull.users, false);
                org.telegram.messenger.wp.r1(e4Var3.a).P3(tL_messages_chatFull.chats, false);
                org.telegram.messenger.wp.r1(e4Var3.a).O3(tL_messages_chatFull.full_chat);
                if (tL_messages_chatFull.full_chat.stargifts_available) {
                    v41Var.run();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e4Var3.getContext(), e4Var3.I0);
                alertDialog$Builder.a.R = org.telegram.messenger.dd.L0(2131750271, null);
                alertDialog$Builder.a.T = org.telegram.messenger.dd.L0(2131750272, null);
                i0.a.w(null, 2131747847, alertDialog$Builder, null);
                return;
            case 20:
                rh.e4 e4Var4 = (rh.e4) this.c;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error9 != null || !(tLObject7 instanceof TLRPC.Updates)) {
                    e4Var4.k().f0(tL_error9, false);
                    return;
                }
                e4Var4.j2 = true;
                e4Var4.k3 = null;
                e4Var4.m1(inputSavedStarGift, (TLRPC.Updates) tLObject7, new rh.w0(e4Var4, 9));
                Utilities.d.c(new rh.n(6, e4Var4, tLObject7));
                return;
            case 21:
                rh.b3 b3Var = (rh.b3) this.c;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.Components.f6 f6Var = b3Var.H;
                b3Var.h0 = false;
                if (starGift2 != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    return;
                }
                org.telegram.ui.Components.fi0 fi0Var = b3Var.l0;
                if (fi0Var != null) {
                    fi0Var.d();
                    org.telegram.messenger.i0.h3(new r5.a(3), 750L);
                }
                b3Var.Q.animate().alpha(0.0f).start();
                b3Var.S.animate().alpha(1.0f).start();
                b3Var.G.animate().alpha(1.0f).start();
                b3Var.R.animate().alpha(0.0f).start();
                b3Var.P.animate().alpha(1.0f).start();
                b3Var.M.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(arrayList5.size(), "GiftCraftFailedText", new Object[0])));
                f6Var.setText(org.telegram.messenger.dd.L0(2131749804, null));
                f6Var.setTranslationY(org.telegram.messenger.i0.L(6.0f));
                b3Var.I.setAlpha(0.0f);
                if (b3Var.O != null) {
                    int i17 = 0;
                    while (true) {
                        ph.c1[] c1VarArr = b3Var.O;
                        if (i17 < c1VarArr.length) {
                            org.telegram.messenger.i0.E2(c1VarArr[i17]);
                            i17++;
                        } else {
                            b3Var.O = null;
                        }
                    }
                }
                b3Var.O = new ph.c1[arrayList5.size()];
                int i18 = 0;
                while (i18 < arrayList5.size()) {
                    TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList5.get(i18);
                    ph.c1 c1Var2 = new ph.c1(b3Var.W, b3Var.getContext(), b3Var.a);
                    c1Var2.h(starGift3, false, false, false, false, true);
                    c1Var2.y.setVisibility(8);
                    c1Var2.setRibbonColor(-3065286);
                    org.telegram.ui.Components.g9 g9Var = c1Var2.D;
                    FrameLayout.LayoutParams e11 = w7.b6.e(42, 42, 17);
                    c1Var2.E = e11;
                    g9Var.setLayoutParams(e11);
                    int i19 = i18 + 1;
                    boolean z15 = i19 >= arrayList5.size();
                    LinearLayout linearLayout = b3Var.N;
                    b3Var.O[i18] = c1Var2;
                    linearLayout.addView(c1Var2, w7.b6.q(74, 74, 0.0f, 51, 0, 0, z15 ? 0 : 6, 0));
                    i18 = i19;
                }
                return;
            case 22:
                th.u2 u2Var = (th.u2) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                org.telegram.messenger.r20 r20Var3 = (org.telegram.messenger.r20) this.b;
                th.z2 z2Var = u2Var.x;
                if (tLObject8 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject8;
                    org.telegram.messenger.wp.r1(z2Var.l2).V3(tL_stories_stories.users, false);
                    org.telegram.messenger.wp.r1(z2Var.l2).P3(tL_stories_stories.chats, false);
                    for (int i20 = 0; i20 < tL_stories_stories.stories.size(); i20++) {
                        if (tL_stories_stories.stories.get(i20).id == storyItem2.id) {
                            r20Var3.a(tL_stories_stories.stories.get(i20).media.document);
                            return;
                        }
                    }
                }
                r20Var3.a(null);
                return;
            case 23:
                th.u2 u2Var2 = (th.u2) this.c;
                Activity activity = (Activity) this.d;
                th.o7 o7Var = (th.o7) this.e;
                th.x2 x2Var = (th.x2) this.b;
                vh.o8 D = vh.o8.D(activity, u2Var2.x.l2);
                k2.t0 t0Var = u2Var2.x.v2;
                if (t0Var != null && (n7Var = (th.n7) t0Var.c) != null) {
                    j10 = n7Var.currentPosition;
                }
                vh.t0 t0Var2 = org.telegram.messenger.wp.r1(u2Var2.x.l2).O1().w;
                TL_stories.StoryItem storyItem3 = u2Var2.x.x1.a;
                long j12 = storyItem3.dialogId;
                ArrayList arrayList6 = t0Var2.b;
                int size = arrayList6.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj = arrayList6.get(i21);
                    i21++;
                    vh.n5 n5Var2 = (vh.n5) obj;
                    if (n5Var2.g && storyItem3.id == n5Var2.f && j12 == n5Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList6;
                        storyItem = storyItem3;
                        if ((document == null || document.id == n5Var2.H) && ((photo = messageMedia.photo) == null || photo.id == n5Var2.I)) {
                            n5Var2.h = true;
                            n5Var = n5Var2;
                            if (n5Var != null || n5Var.u || (file = n5Var.L) == null || !file.exists()) {
                                n5Var = vh.n5.n(u2Var2.x.x1.h(), u2Var2.x.x1.a);
                                n5Var.e = u2Var2.x.k1;
                            }
                            vh.n5 g10 = n5Var.g();
                            if (u2Var2.x.G0()) {
                                th.z2 z2Var2 = u2Var2.x;
                                g10.J0 = z2Var2.k1;
                                g10.L0 = org.telegram.messenger.wp.W4(z2Var2.x1.a.media);
                                th.x4 x4Var = o7Var.O0;
                                if (x4Var instanceof th.q4) {
                                    g10.K0 = ((th.q4) x4Var).E;
                                }
                            }
                            D.R(vh.j8.d(o7Var), g10, j10);
                            D.Q = new th.o2(u2Var2, 3);
                            D.R = new th.q2(u2Var2, x2Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList6;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList6 = arrayList;
                }
                n5Var = null;
                if (n5Var != null) {
                }
                n5Var = vh.n5.n(u2Var2.x.x1.h(), u2Var2.x.x1.a);
                n5Var.e = u2Var2.x.k1;
                vh.n5 g102 = n5Var.g();
                if (u2Var2.x.G0()) {
                }
                D.R(vh.j8.d(o7Var), g102, j10);
                D.Q = new th.o2(u2Var2, 3);
                D.R = new th.q2(u2Var2, x2Var, 1);
                return;
            case 24:
                th.t4 t4Var = (th.t4) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                org.telegram.messenger.r20 r20Var4 = (org.telegram.messenger.r20) this.e;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                t4Var.i = false;
                if (tLObject9 instanceof TL_stories.TL_storyAlbum) {
                    th.y4 a10 = th.y4.a((TL_stories.TL_storyAlbum) tLObject9);
                    t4Var.h.add(a10);
                    t4Var.f(true);
                    r20Var4.a(a10);
                    return;
                }
                if (tL_error10 == null || (T = LaunchActivity.T()) == null) {
                    c11 = 0;
                } else {
                    c11 = 0;
                    org.telegram.ui.Components.cc.a0(T).f0(tL_error10, false);
                }
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(t4Var.a);
                Object[] objArr2 = new Object[2];
                objArr2[c11] = Long.valueOf(t4Var.b);
                objArr2[1] = t4Var;
                f7.k(org.telegram.messenger.at.j3, objArr2);
                return;
            case 25:
                th.x4 x4Var2 = (th.x4) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                org.telegram.messenger.is isVar = (org.telegram.messenger.is) this.e;
                ArrayList arrayList8 = (ArrayList) this.b;
                int i22 = x4Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i23 = x4Var2.e;
                sb2.append(i23);
                sb2.append("{");
                ArrayList arrayList9 = arrayList8;
                long j13 = x4Var2.d;
                sb2.append(j13);
                sb2.append("} saveCache {");
                sb2.append(th.e5.a(arrayList7));
                a1.g.z("}", sb2);
                try {
                    SQLiteDatabase sQLiteDatabase = isVar.b;
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j13 + " AND album_id = " + i22).stepThis().dispose();
                        SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i24 = 0;
                        while (i24 < arrayList7.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((org.telegram.messenger.kj) arrayList7.get(i24)).l;
                                if (storyItem4 == null) {
                                    arrayList2 = arrayList9;
                                } else {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(i15, j13);
                                    executeFast.bindInteger(i14, storyItem4.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i23);
                                    executeFast.bindInteger(5, x4Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    arrayList2 = arrayList9;
                                    executeFast.bindInteger(6, arrayList2.indexOf(Integer.valueOf(storyItem4.id)) + i15);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    executeFast2.requery();
                                    executeFast2.bindLong(1, j13);
                                    executeFast2.bindInteger(2, i22);
                                    executeFast2.bindInteger(3, storyItem4.id);
                                    executeFast2.bindInteger(4, i24);
                                    executeFast2.step();
                                }
                                i24++;
                                arrayList9 = arrayList2;
                                i14 = 2;
                                i15 = 1;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement2 = executeFast2;
                                sQLitePreparedStatement = executeFast;
                                z11 = true;
                                try {
                                    isVar.o(th, z11);
                                    org.telegram.messenger.i0.g3(new th.u4(x4Var2, 2));
                                    return;
                                } finally {
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                }
                            }
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                        }
                        if (executeFast2 != null) {
                            executeFast2.dispose();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sQLitePreparedStatement = executeFast;
                        z11 = true;
                        sQLitePreparedStatement2 = null;
                        isVar.o(th, z11);
                        org.telegram.messenger.i0.g3(new th.u4(x4Var2, 2));
                        return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    z11 = true;
                    sQLitePreparedStatement = null;
                }
                org.telegram.messenger.i0.g3(new th.u4(x4Var2, 2));
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                vh.d dVar = (vh.d) this.c;
                TLObject tLObject10 = (TLObject) this.d;
                org.telegram.ui.ActionBar.z2 z2Var3 = (org.telegram.ui.ActionBar.z2) this.e;
                xh.h1 h1Var = (xh.h1) this.b;
                dVar.setLoading(false);
                if (tLObject10 instanceof TLRPC.TL_boolTrue) {
                    z2Var3.dismiss();
                    h1Var.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                org.telegram.ui.ActionBar.z2 z2Var4 = (org.telegram.ui.ActionBar.z2) this.d;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.e;
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.messenger.i0.g(connectedbotstarref.url);
                new org.telegram.ui.Components.cc(z2Var4.E, p6Var).I(R.raw.copy, org.telegram.messenger.dd.L0(2131754333, null), org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754334, xh.i.J0(connectedbotstarref.commission_permille), org.telegram.messenger.i20.p(user)))).j();
                return;
        }
    }

    public /* synthetic */ ox0(Object obj, Object obj2, TLRPC.TL_error tL_error, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tL_error;
        this.e = obj3;
    }

    public /* synthetic */ ox0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tL_error;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ox0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        this.a = 8;
        this.c = twoStepVerificationActivity;
        this.e = bArr;
        this.d = tLObject;
        this.b = bArr2;
    }
}
