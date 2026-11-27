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
import org.telegram.ui.ActionBar.e;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bt(n64 n64Var, SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = (byte) 8;
        this.d = n64Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        kfc kfcVar;
        byte b2 = this.a;
        byte b3 = 2;
        int i = 0;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.d;
        switch (b2) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                while (i < i3 - i2) {
                    nv0Var.goBack();
                    i++;
                }
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", yac.h(i3).e());
                bundle.putInt("message_id", i2);
                ((e) obj).presentFragment(new zu1(bundle));
                break;
            case 2:
                ((ScrollView) obj).scrollTo(0, Math.max(0, (hl.L(44.0f) * i3) - (i2 / 2)));
                break;
            case 3:
                nc2 nc2Var = (nc2) obj;
                if (i3 != 0) {
                    SharedPreferences sharedPreferences = uc7.s1(i2).W3;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i3).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                nc2Var.q(i3);
                break;
            case 4:
                hc2 hc2Var = (hc2) obj;
                if (i3 != 0) {
                    SharedPreferences sharedPreferences2 = uc7.s1(i2).W3;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i3).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                hc2Var.a(Integer.valueOf(i3));
                break;
            case 5:
                ((ConnectionsManager) obj).lambda$discardConnection$0(i3, i2);
                break;
            case 6:
                rl3 rl3Var = (rl3) obj;
                try {
                    SQLiteCursor queryFinalized = jf7.Y(i3).b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    zh6 zh6Var = new zh6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (wf3.B(longValue)) {
                            if (i2 == 0 || i2 == 3) {
                                int i4 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i4))) {
                                    arrayList3.add(Integer.valueOf(i4));
                                    b = b3;
                                    sl3 sl3Var = new sl3();
                                    sl3Var.c = longValue;
                                    sl3Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(sl3Var);
                                    zh6Var.k(sl3Var.c, sl3Var);
                                }
                            }
                            b = b3;
                        } else if (wf3.D(longValue)) {
                            if (i2 != b3 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                b = b3;
                                sl3 sl3Var2 = new sl3();
                                sl3Var2.c = longValue;
                                sl3Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(sl3Var2);
                                zh6Var.k(sl3Var2.c, sl3Var2);
                            }
                            b = b3;
                        } else {
                            long j = -longValue;
                            b = b3;
                            if (!arrayList2.contains(Long.valueOf(j))) {
                                arrayList2.add(Long.valueOf(j));
                                sl3 sl3Var22 = new sl3();
                                sl3Var22.c = longValue;
                                sl3Var22.b = queryFinalized.intValue(1);
                                arrayList4.add(sl3Var22);
                                zh6Var.k(sl3Var22.c, sl3Var22);
                            }
                        }
                        b3 = b;
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        jf7.Y(i3).T(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                            sl3 sl3Var3 = (sl3) zh6Var.f(wf3.E(((TLRPC.EncryptedChat) arrayList6.get(i5)).id));
                            if (sl3Var3 != null) {
                                sl3Var3.a = (TLObject) arrayList6.get(i5);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        jf7.Y(i3).P(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i6 = 0; i6 < arrayList7.size(); i6++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i6);
                            long j2 = -chat.id;
                            if (chat.migrated_to != null) {
                                sl3 sl3Var4 = (sl3) zh6Var.f(j2);
                                zh6Var.l(j2);
                                if (sl3Var4 != null) {
                                    arrayList4.remove(sl3Var4);
                                }
                            } else {
                                sl3 sl3Var5 = (sl3) zh6Var.f(j2);
                                if (sl3Var5 != null) {
                                    sl3Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        jf7.Y(i3).k0(arrayList, arrayList5, false);
                        while (i < arrayList5.size()) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i);
                            sl3 sl3Var6 = (sl3) zh6Var.f(user.id);
                            if (sl3Var6 != null) {
                                sl3Var6.a = user;
                            }
                            i++;
                        }
                    }
                    Collections.sort(arrayList4, new f03((byte) 13));
                    hl.c3(new cv2(rl3Var, arrayList4, zh6Var, (byte) 9));
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 7:
                s64 s64Var = (s64) obj;
                s64Var.m.e(24, new ml0(i3, i2, b3));
                s64Var.m1(2, 14, new rma(i3, i2));
                break;
            case 8:
                ((n64) obj).a.f1(i3, i2);
                break;
            case 9:
                ea6 ea6Var = (ea6) obj;
                if (ea6Var.d != i3 || ea6Var.e != i2) {
                    ea6Var.d = i3;
                    ea6Var.e = i2;
                    ea6Var.requestLayout();
                    ((x96) ea6Var.a.b).n = 0L;
                    break;
                }
                break;
            case 10:
                MediaController mediaController = (MediaController) ((ed) obj).c;
                if (i3 == mediaController.l0 && i2 == 4 && (kfcVar = mediaController.k0) != null) {
                    try {
                        kfcVar.l0();
                        mediaController.k0 = null;
                        break;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        return;
                    }
                }
                break;
            case 11:
                ((ls6) obj).Z[i3] = i2;
                break;
            case 12:
                m57 m57Var = (m57) ((gu) obj).g3;
                View b4 = m57Var.b();
                gu guVar = m57Var.f;
                if (b4 != null) {
                    int top = b4.getTop() + i3;
                    int top2 = b4.getTop() + i2;
                    int i7 = top2 - top;
                    int paddingTop = guVar.getPaddingTop();
                    int height = guVar.getHeight() - guVar.getPaddingBottom();
                    if (i7 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i8 = top - paddingTop;
                    if (i8 < 0) {
                        guVar.scrollBy(0, i8);
                        break;
                    }
                }
                break;
            case 13:
                PushListenerController.lambda$sendRegistrationToServer$0(i3, i2, (String) obj);
                break;
            case 14:
                ((SurfaceTextureHelper) obj).lambda$setTextureSize$2(i3, i2);
                break;
            case 15:
                ((SurfaceViewRenderer) obj).lambda$onFrameResolutionChanged$0(i3, i2);
                break;
            case 16:
                bnb bnbVar = (bnb) obj;
                bnbVar.J = null;
                bnbVar.e = i3;
                bnbVar.f = i2;
                bnbVar.g();
                bnbVar.requestLayout();
                break;
            case 17:
                VoIPGroupNotification.decline((Context) obj, i3, i2);
                break;
            default:
                ((VoIPService) obj).lambda$initiateActualEncryptedCall$83(i3, i2);
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
