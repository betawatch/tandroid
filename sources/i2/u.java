package i2;

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
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.o5;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.un;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import rh.l5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i10, int i11, Object obj, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u61 u61Var;
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.d;
                e2.r rVar = i0Var.m;
                int i10 = this.b;
                int i11 = this.c;
                rVar.e(24, new v(i10, i11, 1));
                i0Var.t1(2, 14, new e2.y(i10, i11));
                break;
            case 1:
                ((c0) this.d).a.q1(this.b, this.c);
                break;
            case 2:
                MediaController mediaController = (MediaController) ((c5.x) this.d).c;
                if (this.b == mediaController.k0 && this.c == 4 && (u61Var = mediaController.j0) != null) {
                    try {
                        u61Var.m0();
                        mediaController.j0 = null;
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                break;
            case 3:
                ((ui) this.d).Y[this.b] = this.c;
                break;
            case 4:
                PushListenerController.lambda$sendRegistrationToServer$0(this.b, this.c, (String) this.d);
                break;
            case 5:
                VoIPGroupNotification.decline((Context) this.d, this.b, this.c);
                break;
            case 6:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.b, this.c);
                break;
            case 7:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.b, this.c);
                break;
            case 8:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                for (int i12 = 0; i12 < this.b - this.c; i12++) {
                    v0Var.goBack();
                }
                break;
            case 9:
                k2 k2Var = (k2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", d20.i(this.b).e());
                bundle.putInt("message_id", this.c);
                k2Var.presentFragment(new un(bundle));
                break;
            case 10:
                fo foVar = (fo) this.d;
                int i13 = this.b;
                if (i13 != 0) {
                    SharedPreferences sharedPreferences = vp.r1(this.c).e7;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i13).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                foVar.E(i13);
                break;
            case 11:
                yn ynVar = (yn) this.d;
                int i14 = this.b;
                if (i14 != 0) {
                    SharedPreferences sharedPreferences2 = vp.r1(this.c).e7;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i14).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ynVar.a(Integer.valueOf(i14));
                break;
            case 12:
                ua0 ua0Var = (ua0) ((ag.b1) this.d).f3;
                View d = ua0Var.d();
                ag.b1 b1Var = ua0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i15 = top2 - top;
                    int paddingTop = b1Var.getPaddingTop();
                    int height = b1Var.getHeight() - b1Var.getPaddingBottom();
                    if (i15 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i16 = top - paddingTop;
                    if (i16 < 0) {
                        b1Var.scrollBy(0, i16);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.Components.voip.s0 s0Var = ((org.telegram.ui.Components.voip.r0) this.d).a;
                jf.f fVar = s0Var.O;
                if (fVar != null) {
                    fVar.d(this.b, this.c);
                }
                s0Var.a(false);
                break;
            case 14:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                break;
            case 15:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.b, this.c);
                break;
            case 16:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.b, this.c);
                break;
            default:
                int i17 = this.b;
                zf.x xVar = (zf.x) this.d;
                try {
                    SQLiteCursor queryFinalized = hs.a0(i17).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean C = o5.C(longValue);
                        int i18 = this.c;
                        if (C) {
                            if (i18 == 0 || i18 == 3) {
                                int i19 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i19))) {
                                    arrayList3.add(Integer.valueOf(i19));
                                    zf.y yVar = new zf.y();
                                    yVar.c = longValue;
                                    yVar.b = queryFinalized.intValue(1);
                                    arrayList4.add(yVar);
                                    hVar.k(yVar, yVar.c);
                                }
                            }
                        } else if (!o5.E(longValue)) {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                zf.y yVar2 = new zf.y();
                                yVar2.c = longValue;
                                yVar2.b = queryFinalized.intValue(1);
                                arrayList4.add(yVar2);
                                hVar.k(yVar2, yVar2.c);
                            }
                        } else if (i18 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            zf.y yVar22 = new zf.y();
                            yVar22.c = longValue;
                            yVar22.b = queryFinalized.intValue(1);
                            arrayList4.add(yVar22);
                            hVar.k(yVar22, yVar22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        hs.a0(i17).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                            zf.y yVar3 = (zf.y) hVar.f(o5.F(((TLRPC.EncryptedChat) arrayList6.get(i20)).id));
                            if (yVar3 != null) {
                                yVar3.a = (TLObject) arrayList6.get(i20);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        hs.a0(i17).Q(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i21);
                            long j11 = -chat.id;
                            if (chat.migrated_to != null) {
                                zf.y yVar4 = (zf.y) hVar.f(j11);
                                hVar.l(j11);
                                if (yVar4 != null) {
                                    arrayList4.remove(yVar4);
                                }
                            } else {
                                zf.y yVar5 = (zf.y) hVar.f(j11);
                                if (yVar5 != null) {
                                    yVar5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        hs.a0(i17).n0(arrayList, arrayList5, false);
                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i22);
                            zf.y yVar6 = (zf.y) hVar.f(user.id);
                            if (yVar6 != null) {
                                yVar6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new x2.e(9));
                    org.telegram.messenger.i0.g3(new l5(xVar, arrayList4, hVar, 28));
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                break;
        }
    }

    public /* synthetic */ u(c0 c0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.a = 1;
        this.d = c0Var;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ u(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }
}
