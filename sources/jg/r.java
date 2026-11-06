package jg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.a8;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.an;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(int i7, int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i7;
        this.c = i10;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n51 n51Var;
        switch (this.a) {
            case 0:
                int i7 = this.b;
                f0 f0Var = (f0) this.d;
                try {
                    SQLiteCursor queryFinalized = yr.a0(i7).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean C = m5.C(longValue);
                        int i10 = this.c;
                        if (C) {
                            if (i10 == 0 || i10 == 3) {
                                int i11 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i11))) {
                                    arrayList3.add(Integer.valueOf(i11));
                                    g0 g0Var = new g0();
                                    g0Var.c = longValue;
                                    g0Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(g0Var);
                                    hVar.k(g0Var, g0Var.c);
                                }
                            }
                        } else if (!m5.E(longValue)) {
                            long j3 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                arrayList2.add(Long.valueOf(j3));
                                g0 g0Var2 = new g0();
                                g0Var2.c = longValue;
                                g0Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(g0Var2);
                                hVar.k(g0Var2, g0Var2.c);
                            }
                        } else if (i10 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            g0 g0Var22 = new g0();
                            g0Var22.c = longValue;
                            g0Var22.b = queryFinalized.intValue(1);
                            arrayList4.add(g0Var22);
                            hVar.k(g0Var22, g0Var22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        yr.a0(i7).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            g0 g0Var3 = (g0) hVar.f(m5.F(((TLRPC.EncryptedChat) arrayList6.get(i12)).id));
                            if (g0Var3 != null) {
                                g0Var3.a = (TLObject) arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        yr.a0(i7).Q(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i13);
                            long j10 = -chat.id;
                            if (chat.migrated_to != null) {
                                g0 g0Var4 = (g0) hVar.f(j10);
                                hVar.l(j10);
                                if (g0Var4 != null) {
                                    arrayList4.remove(g0Var4);
                                }
                            } else {
                                g0 g0Var5 = (g0) hVar.f(j10);
                                if (g0Var5 != null) {
                                    g0Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        yr.a0(i7).n0(arrayList, arrayList5, false);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                            g0 g0Var6 = (g0) hVar.f(user.id);
                            if (g0Var6 != null) {
                                g0Var6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new x(0));
                    org.telegram.messenger.g0.h3(new fi.x1(f0Var, arrayList4, hVar, 17));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                l2.i0 i0Var = (l2.i0) this.d;
                h2.r rVar = i0Var.m;
                int i15 = this.b;
                int i16 = this.c;
                rVar.e(24, new gh.c(i15, i16, 2));
                i0Var.t1(2, 14, new h2.y(i15, i16));
                break;
            case 2:
                ((l2.c0) this.d).a.q1(this.b, this.c);
                break;
            case 3:
                MediaController mediaController = (MediaController) ((f5.u) this.d).c;
                if (this.b == mediaController.k0 && this.c == 4 && (n51Var = mediaController.j0) != null) {
                    try {
                        n51Var.m0();
                        mediaController.j0 = null;
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                break;
            case 4:
                ((ui) this.d).Y[this.b] = this.c;
                break;
            case 5:
                PushListenerController.lambda$sendRegistrationToServer$0(this.b, this.c, (String) this.d);
                break;
            case 6:
                VoIPGroupNotification.decline((Context) this.d, this.b, this.c);
                break;
            case 7:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.b, this.c);
                break;
            case 8:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.b, this.c);
                break;
            case 9:
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.d;
                for (int i17 = 0; i17 < this.b - this.c; i17++) {
                    u0Var.goBack();
                }
                break;
            case 10:
                f2 f2Var = (f2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", p10.i(this.b).e());
                bundle.putInt("message_id", this.c);
                f2Var.presentFragment(new an(bundle));
                break;
            case 11:
                xn xnVar = (xn) this.d;
                int i18 = this.b;
                if (i18 != 0) {
                    SharedPreferences sharedPreferences = qp.s1(this.c).d7;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                xnVar.R(i18);
                break;
            case 12:
                qn qnVar = (qn) this.d;
                int i19 = this.b;
                if (i19 != 0) {
                    SharedPreferences sharedPreferences2 = qp.s1(this.c).d7;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                qnVar.a(Integer.valueOf(i19));
                break;
            case 13:
                ca0 ca0Var = (ca0) ((bi.q1) this.d).f3;
                View d = ca0Var.d();
                bi.q1 q1Var = ca0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i20 = top2 - top;
                    int paddingTop = q1Var.getPaddingTop();
                    int height = q1Var.getHeight() - q1Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        q1Var.scrollBy(0, i21);
                        break;
                    }
                }
                break;
            case 14:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                break;
            case 15:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.b, this.c);
                break;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ r(Object obj, int i7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ r(l2.c0 c0Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        this.a = 2;
        this.d = c0Var;
        this.b = i7;
        this.c = i10;
    }
}
