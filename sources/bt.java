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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bt(t54 t54Var, SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = (byte) 8;
        this.d = t54Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        lbc lbcVar;
        byte b2 = this.a;
        byte b3 = 2;
        int i = 0;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.d;
        switch (b2) {
            case 0:
                cv0 cv0Var = (cv0) obj;
                while (i < i3 - i2) {
                    cv0Var.goBack();
                    i++;
                }
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", y6c.h(i3).e());
                bundle.putInt("message_id", i2);
                ((d) obj).presentFragment(new mu1(bundle));
                break;
            case 2:
                ((ScrollView) obj).scrollTo(0, Math.max(0, (gl.L(44.0f) * i3) - (i2 / 2)));
                break;
            case 3:
                xb2 xb2Var = (xb2) obj;
                if (i3 != 0) {
                    SharedPreferences sharedPreferences = na7.q1(i2).W3;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i3).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                xb2Var.p(i3);
                break;
            case 4:
                rb2 rb2Var = (rb2) obj;
                if (i3 != 0) {
                    SharedPreferences sharedPreferences2 = na7.q1(i2).W3;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i3).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                rb2Var.a(Integer.valueOf(i3));
                break;
            case 5:
                ((ConnectionsManager) obj).lambda$discardConnection$0(i3, i2);
                break;
            case 6:
                zk3 zk3Var = (zk3) obj;
                try {
                    SQLiteCursor queryFinalized = ad7.Y(i3).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    vf6 vf6Var = new vf6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (cf3.B(longValue)) {
                            if (i2 == 0 || i2 == 3) {
                                int i4 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i4))) {
                                    arrayList3.add(Integer.valueOf(i4));
                                    b = b3;
                                    al3 al3Var = new al3();
                                    al3Var.c = longValue;
                                    al3Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(al3Var);
                                    vf6Var.k(al3Var, al3Var.c);
                                }
                            }
                            b = b3;
                        } else if (cf3.D(longValue)) {
                            if (i2 != b3 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                b = b3;
                                al3 al3Var2 = new al3();
                                al3Var2.c = longValue;
                                al3Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(al3Var2);
                                vf6Var.k(al3Var2, al3Var2.c);
                            }
                            b = b3;
                        } else {
                            long j = -longValue;
                            b = b3;
                            if (!arrayList2.contains(Long.valueOf(j))) {
                                arrayList2.add(Long.valueOf(j));
                                al3 al3Var22 = new al3();
                                al3Var22.c = longValue;
                                al3Var22.b = queryFinalized.intValue(1);
                                arrayList4.add(al3Var22);
                                vf6Var.k(al3Var22, al3Var22.c);
                            }
                        }
                        b3 = b;
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        ad7.Y(i3).T(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                            al3 al3Var3 = (al3) vf6Var.f(cf3.E(((TLRPC.EncryptedChat) arrayList6.get(i5)).id));
                            if (al3Var3 != null) {
                                al3Var3.a = (TLObject) arrayList6.get(i5);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        ad7.Y(i3).P(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i6 = 0; i6 < arrayList7.size(); i6++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i6);
                            long j2 = -chat.id;
                            if (chat.migrated_to != null) {
                                al3 al3Var4 = (al3) vf6Var.f(j2);
                                vf6Var.l(j2);
                                if (al3Var4 != null) {
                                    arrayList4.remove(al3Var4);
                                }
                            } else {
                                al3 al3Var5 = (al3) vf6Var.f(j2);
                                if (al3Var5 != null) {
                                    al3Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ad7.Y(i3).k0(arrayList, arrayList5, false);
                        while (i < arrayList5.size()) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i);
                            al3 al3Var6 = (al3) vf6Var.f(user.id);
                            if (al3Var6 != null) {
                                al3Var6.a = user;
                            }
                            i++;
                        }
                    }
                    Collections.sort(arrayList4, new mz2((byte) 13));
                    gl.c3(new mg3(zk3Var, arrayList4, vf6Var, (byte) 5));
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 7:
                y54 y54Var = (y54) obj;
                y54Var.m.e(24, new ll0(i3, i2, b3));
                y54Var.m1(2, 14, new wia(i3, i2));
                break;
            case 8:
                ((t54) obj).a.f1(i3, i2);
                break;
            case 9:
                a86 a86Var = (a86) obj;
                if (a86Var.d != i3 || a86Var.e != i2) {
                    a86Var.d = i3;
                    a86Var.e = i2;
                    a86Var.requestLayout();
                    ((u76) a86Var.a.a).n = 0L;
                    break;
                }
                break;
            case 10:
                MediaController mediaController = (MediaController) ((dd) obj).c;
                if (i3 == mediaController.l0 && i2 == 4 && (lbcVar = mediaController.k0) != null) {
                    try {
                        lbcVar.l0();
                        mediaController.k0 = null;
                        break;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                break;
            case 11:
                ((hq6) obj).Z[i3] = i2;
                break;
            case 12:
                f37 f37Var = (f37) ((fu) obj).g3;
                View b4 = f37Var.b();
                fu fuVar = f37Var.f;
                if (b4 != null) {
                    int top = b4.getTop() + i3;
                    int top2 = b4.getTop() + i2;
                    int i7 = top2 - top;
                    int paddingTop = fuVar.getPaddingTop();
                    int height = fuVar.getHeight() - fuVar.getPaddingBottom();
                    if (i7 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i8 = top - paddingTop;
                    if (i8 < 0) {
                        fuVar.scrollBy(0, i8);
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

    public /* synthetic */ bt(int i, int i2, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public /* synthetic */ bt(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
