// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cu implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cu(c74 c74Var, SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = (byte) 8;
        this.d = c74Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        ndc ndcVar;
        byte b2 = this.a;
        byte b3 = 2;
        int i = 0;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.d;
        switch (b2) {
            case 0:
                mw0 mw0Var = (mw0) obj;
                while (i < i3 - i2) {
                    mw0Var.goBack();
                    i++;
                }
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", z8c.h(i3).e());
                bundle.putInt("message_id", i2);
                ((d) obj).presentFragment(new yv1(bundle));
                break;
            case 2:
                ((ScrollView) obj).scrollTo(0, Math.max(0, (gm.L(44.0f) * i3) - (i2 / 2)));
                break;
            case 3:
                id2 id2Var = (id2) obj;
                if (i3 != 0) {
                    SharedPreferences sharedPreferences = oc7.r1(i2).W3;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i3).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                id2Var.t(i3);
                break;
            case 4:
                cd2 cd2Var = (cd2) obj;
                if (i3 != 0) {
                    SharedPreferences sharedPreferences2 = oc7.r1(i2).W3;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i3).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                cd2Var.a(Integer.valueOf(i3));
                break;
            case 5:
                ((ConnectionsManager) obj).lambda$discardConnection$0(i3, i2);
                break;
            case 6:
                km3 km3Var = (km3) obj;
                try {
                    SQLiteCursor queryFinalized = cf7.Y(i3).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    vh6 vh6Var = new vh6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (pg3.B(longValue)) {
                            if (i2 == 0 || i2 == 3) {
                                int i4 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i4))) {
                                    arrayList3.add(Integer.valueOf(i4));
                                    b = b3;
                                    lm3 lm3Var = new lm3();
                                    lm3Var.c = longValue;
                                    lm3Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(lm3Var);
                                    vh6Var.k(lm3Var, lm3Var.c);
                                }
                            }
                            b = b3;
                        } else if (pg3.D(longValue)) {
                            if (i2 != b3 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                b = b3;
                                lm3 lm3Var2 = new lm3();
                                lm3Var2.c = longValue;
                                lm3Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(lm3Var2);
                                vh6Var.k(lm3Var2, lm3Var2.c);
                            }
                            b = b3;
                        } else {
                            long j = -longValue;
                            b = b3;
                            if (!arrayList2.contains(Long.valueOf(j))) {
                                arrayList2.add(Long.valueOf(j));
                                lm3 lm3Var22 = new lm3();
                                lm3Var22.c = longValue;
                                lm3Var22.b = queryFinalized.intValue(1);
                                arrayList4.add(lm3Var22);
                                vh6Var.k(lm3Var22, lm3Var22.c);
                            }
                        }
                        b3 = b;
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        cf7.Y(i3).T(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                            lm3 lm3Var3 = (lm3) vh6Var.f(pg3.E(((TLRPC.EncryptedChat) arrayList6.get(i5)).id));
                            if (lm3Var3 != null) {
                                lm3Var3.a = (TLObject) arrayList6.get(i5);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        cf7.Y(i3).P(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i6 = 0; i6 < arrayList7.size(); i6++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i6);
                            long j2 = -chat.id;
                            if (chat.migrated_to != null) {
                                lm3 lm3Var4 = (lm3) vh6Var.f(j2);
                                vh6Var.l(j2);
                                if (lm3Var4 != null) {
                                    arrayList4.remove(lm3Var4);
                                }
                            } else {
                                lm3 lm3Var5 = (lm3) vh6Var.f(j2);
                                if (lm3Var5 != null) {
                                    lm3Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        cf7.Y(i3).k0(arrayList, arrayList5, false);
                        while (i < arrayList5.size()) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i);
                            lm3 lm3Var6 = (lm3) vh6Var.f(user.id);
                            if (lm3Var6 != null) {
                                lm3Var6.a = user;
                            }
                            i++;
                        }
                    }
                    Collections.sort(arrayList4, new x03((byte) 13));
                    gm.c3(new pz2(km3Var, arrayList4, vh6Var, (byte) 7));
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 7:
                h74 h74Var = (h74) obj;
                h74Var.m.e(24, new lm0(i3, i2, b3));
                h74Var.m1(2, 14, new yka(i3, i2));
                break;
            case 8:
                ((c74) obj).a.f1(i3, i2);
                break;
            case 9:
                z96 z96Var = (z96) obj;
                if (z96Var.d != i3 || z96Var.e != i2) {
                    z96Var.d = i3;
                    z96Var.e = i2;
                    z96Var.requestLayout();
                    ((t96) z96Var.a.a).n = 0L;
                    break;
                }
                break;
            case 10:
                MediaController mediaController = (MediaController) ((de) obj).c;
                if (i3 == mediaController.l0 && i2 == 4 && (ndcVar = mediaController.k0) != null) {
                    try {
                        ndcVar.l0();
                        mediaController.k0 = null;
                        break;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        return;
                    }
                }
                break;
            case 11:
                ((hs6) obj).Z[i3] = i2;
                break;
            case 12:
                f57 f57Var = (f57) ((fv) obj).g3;
                View b4 = f57Var.b();
                fv fvVar = f57Var.f;
                if (b4 != null) {
                    int top = b4.getTop() + i3;
                    int top2 = b4.getTop() + i2;
                    int i7 = top2 - top;
                    int paddingTop = fvVar.getPaddingTop();
                    int height = fvVar.getHeight() - fvVar.getPaddingBottom();
                    if (i7 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i8 = top - paddingTop;
                    if (i8 < 0) {
                        fvVar.scrollBy(0, i8);
                        break;
                    }
                }
                break;
            case 13:
                PushListenerController.lambda$sendRegistrationToServer$0(i3, i2, (String) obj);
                break;
            case 14:
                ((ScreenCapturerAndroid) obj).lambda$changeCaptureFormat$1(i3, i2);
                break;
            case 15:
                ((SurfaceTextureHelper) obj).lambda$setTextureSize$2(i3, i2);
                break;
            case 16:
                ((SurfaceViewRenderer) obj).lambda$onFrameResolutionChanged$0(i3, i2);
                break;
            case 17:
                ((TextureViewRenderer) obj).lambda$updateVideoSizes$1(i3, i2);
                break;
            case 18:
                VoIPGroupNotification.decline((Context) obj, i3, i2);
                break;
            default:
                ((VoIPService) obj).lambda$initiateActualEncryptedCall$82(i3, i2);
                break;
        }
    }

    public /* synthetic */ cu(int i, int i2, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public /* synthetic */ cu(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
