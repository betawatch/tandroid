package k2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ei.h9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.x90;
import org.telegram.ui.wm;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i3, int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i3;
        this.c = i10;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m51 m51Var;
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.d;
                g2.s sVar = i0Var.m;
                int i3 = this.b;
                int i10 = this.c;
                sVar.e(24, new hh.c(i3, i10, 2));
                i0Var.t1(2, 14, new g2.z(i3, i10));
                break;
            case 1:
                ((c0) this.d).a.q1(this.b, this.c);
                break;
            case 2:
                int i11 = this.b;
                kg.c0 c0Var = (kg.c0) this.d;
                try {
                    SQLiteCursor queryFinalized = qr.a0(i11).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean C = m5.C(longValue);
                        int i12 = this.c;
                        if (C) {
                            if (i12 == 0 || i12 == 3) {
                                int i13 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i13))) {
                                    arrayList3.add(Integer.valueOf(i13));
                                    kg.d0 d0Var = new kg.d0();
                                    d0Var.c = longValue;
                                    d0Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(d0Var);
                                    hVar.k(d0Var, d0Var.c);
                                }
                            }
                        } else if (!m5.E(longValue)) {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                kg.d0 d0Var2 = new kg.d0();
                                d0Var2.c = longValue;
                                d0Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(d0Var2);
                                hVar.k(d0Var2, d0Var2.c);
                            }
                        } else if (i12 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            kg.d0 d0Var22 = new kg.d0();
                            d0Var22.c = longValue;
                            d0Var22.b = queryFinalized.intValue(1);
                            arrayList4.add(d0Var22);
                            hVar.k(d0Var22, d0Var22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        qr.a0(i11).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                            kg.d0 d0Var3 = (kg.d0) hVar.f(m5.F(((TLRPC.EncryptedChat) arrayList6.get(i14)).id));
                            if (d0Var3 != null) {
                                d0Var3.a = (TLObject) arrayList6.get(i14);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        qr.a0(i11).Q(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i15);
                            long j11 = -chat.id;
                            if (chat.migrated_to != null) {
                                kg.d0 d0Var4 = (kg.d0) hVar.f(j11);
                                hVar.l(j11);
                                if (d0Var4 != null) {
                                    arrayList4.remove(d0Var4);
                                }
                            } else {
                                kg.d0 d0Var5 = (kg.d0) hVar.f(j11);
                                if (d0Var5 != null) {
                                    d0Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        qr.a0(i11).n0(arrayList, arrayList5, false);
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i16);
                            kg.d0 d0Var6 = (kg.d0) hVar.f(user.id);
                            if (d0Var6 != null) {
                                d0Var6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a3.u(22));
                    org.telegram.messenger.g0.h3(new h9((Object) c0Var, arrayList4, (Cloneable) hVar, 22));
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
                break;
            case 3:
                MediaController mediaController = (MediaController) ((e5.u) this.d).c;
                if (this.b == mediaController.l0 && this.c == 4 && (m51Var = mediaController.k0) != null) {
                    try {
                        m51Var.m0();
                        mediaController.k0 = null;
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                break;
            case 4:
                ((li) this.d).Z[this.b] = this.c;
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
                org.telegram.ui.web.t0 t0Var = (org.telegram.ui.web.t0) this.d;
                for (int i17 = 0; i17 < this.b - this.c; i17++) {
                    t0Var.goBack();
                }
                break;
            case 10:
                d2 d2Var = (d2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", h10.i(this.b).e());
                bundle.putInt("message_id", this.c);
                d2Var.presentFragment(new wm(bundle));
                break;
            case 11:
                wn wnVar = (wn) this.d;
                int i18 = this.b;
                if (i18 != 0) {
                    SharedPreferences sharedPreferences = hp.s1(this.c).d7;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                wnVar.z(i18);
                break;
            case 12:
                pn pnVar = (pn) this.d;
                int i19 = this.b;
                if (i19 != 0) {
                    SharedPreferences sharedPreferences2 = hp.s1(this.c).d7;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                pnVar.a(Integer.valueOf(i19));
                break;
            case 13:
                x90 x90Var = (x90) ((ci.j1) this.d).g3;
                View d = x90Var.d();
                ci.j1 j1Var = x90Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i20 = top2 - top;
                    int paddingTop = j1Var.getPaddingTop();
                    int height = j1Var.getHeight() - j1Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        j1Var.scrollBy(0, i21);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.s0 s0Var = ((org.telegram.ui.Components.voip.q0) this.d).a;
                uf.d dVar = s0Var.P;
                if (dVar != null) {
                    dVar.d(this.b, this.c);
                }
                s0Var.a(false);
                break;
            case 15:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                break;
            case 16:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.b, this.c);
                break;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ u(Object obj, int i3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i3;
        this.c = i10;
    }

    public /* synthetic */ u(c0 c0Var, SurfaceTexture surfaceTexture, int i3, int i10) {
        this.a = 1;
        this.d = c0Var;
        this.b = i3;
        this.c = i10;
    }
}
