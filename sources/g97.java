// default package

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g97 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ g97(yb4 yb4Var, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, qd4 qd4Var) {
        this.e = yb4Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = qd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qd4 qd4Var;
        qd4 qd4Var2;
        String str;
        TLRPC.TL_secureData tL_secureData;
        switch (this.a) {
            case 0:
                oc7 oc7Var = (oc7) this.e;
                d dVar = (d) this.f;
                k11 k11Var = (k11) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str2 = (String) this.c;
                boolean z = this.b;
                boolean z2 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (dVar == null) {
                    dVar = LaunchActivity.S();
                }
                if (dVar != null) {
                    if (k11Var != null) {
                        k11Var.b();
                    }
                    if (!zArr[0]) {
                        String D1 = oc7Var.D1(user.restriction_reason);
                        if (!TextUtils.isEmpty(D1)) {
                            oc7.Z4(D1, dVar);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (dVar.getParentLayout() instanceof ActionBarLayout) {
                                    dVar = ((ActionBarLayout) dVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                gm.t1(dVar.getFragmentView());
                                int i = oc7Var.currentAccount;
                                long j = user.id;
                                rwc b = rwc.b(i, j, j, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str2, user, 0, z, z2);
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().l(b) == null) {
                                    wx0 wx0Var = new wx0(dVar.getContext(), dVar.getResourceProvider());
                                    wx0Var.B(false);
                                    wx0Var.C0 = true;
                                    wx0Var.m0 = dVar.getParentActivity();
                                    wx0Var.x(dVar, b);
                                    wx0Var.show();
                                    break;
                                }
                            } else {
                                dVar.presentFragment(yv1.ga(user.id));
                                break;
                            }
                        } else {
                            long j2 = user.id;
                            if (dVar instanceof yv1) {
                                j2 = ((yv1) dVar).a();
                            } else if (dVar instanceof ProfileActivity) {
                                j2 = ((ProfileActivity) dVar).a();
                            }
                            if (dVar.getParentLayout() instanceof ActionBarLayout) {
                                dVar = ((ActionBarLayout) dVar.getParentLayout()).getSheetFragment();
                            }
                            gm.t1(dVar.getFragmentView());
                            rwc b2 = rwc.b(oc7Var.currentAccount, j2, user.id, null, null, 4, 0, 0L, null, false, str2, user, 0, z, z2);
                            LaunchActivity launchActivity2 = LaunchActivity.H1;
                            if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.H1.O().l(b2) == null) {
                                wx0 wx0Var2 = new wx0(dVar.getContext(), dVar.getResourceProvider());
                                wx0Var2.B(true);
                                wx0Var2.C0 = false;
                                wx0Var2.m0 = dVar.getParentActivity();
                                wx0Var2.x(dVar, b2);
                                wx0Var2.show();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                yb4 yb4Var = (yb4) this.e;
                boolean z3 = this.b;
                String str3 = (String) this.c;
                boolean z4 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                qd4 qd4Var3 = (qd4) this.s;
                bc4 bc4Var = yb4Var.d;
                if (z3) {
                    bc4Var.n.remove(str3);
                } else {
                    bc4Var.h.remove(str3);
                }
                bc4 bc4Var2 = yb4Var.d;
                if (z4) {
                    int i2 = bc4Var2.s - 1;
                    bc4Var2.s = i2;
                    if (i2 < 1 && (qd4Var2 = (qd4) bc4Var2.f.poll()) != null) {
                        yb4Var.d.s++;
                        qd4Var2.c();
                    }
                } else {
                    int i3 = bc4Var2.r - 1;
                    bc4Var2.r = i3;
                    if (i3 < 1 && (qd4Var = (qd4) bc4Var2.e.poll()) != null) {
                        yb4Var.d.r++;
                        qd4Var.c();
                    }
                }
                pm5 pm5Var = yb4Var.d.F;
                if (pm5Var != null) {
                    Utilities.d.c(new at0(pm5Var, pm5Var.a, str3, inputFile, inputEncryptedFile, bArr, bArr2, qd4Var3.t));
                    break;
                }
                break;
            default:
                xz7 xz7Var = (xz7) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                qy7 qy7Var = (qy7) this.h;
                boolean z5 = this.b;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.n;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.r;
                boolean z6 = this.d;
                ArrayList arrayList = (ArrayList) this.c;
                ny7 ny7Var = (ny7) this.s;
                String str4 = null;
                if (tL_error == null) {
                    if (!z5) {
                        if (z6) {
                            xz7Var.K1(tL_secureRequiredType2);
                        }
                        xz7Var.K1(tL_secureRequiredType);
                    } else if (tL_secureRequiredType != null) {
                        xz7Var.K1(tL_secureRequiredType);
                    } else {
                        xz7Var.K1(tL_secureRequiredType2);
                    }
                    if (xz7Var.b == 8) {
                        wz7 wz7Var = (wz7) xz7Var.r1.remove(tL_secureRequiredType2);
                        if (wz7Var != null) {
                            xz7Var.d0.removeView(wz7Var);
                            View childAt = xz7Var.d0.getChildAt(r1.getChildCount() - 6);
                            if (childAt instanceof wz7) {
                                ((wz7) childAt).setNeedDivider(false);
                            }
                        }
                        xz7Var.U1();
                    } else {
                        if (tL_secureRequiredType == null || arrayList == null || arrayList.size() <= 1) {
                            str = null;
                        } else {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    str = null;
                                } else {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(i4);
                                    TLRPC.TL_secureValue l1 = xz7Var.l1(tL_secureRequiredType3, false);
                                    if (l1 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = l1.data;
                                        str = tL_secureData2 != null ? xz7.a1(tL_secureData2.data, xz7Var.b1(tL_secureData2.secret, tL_secureData2.data_hash), l1.data.data_hash) : null;
                                        tL_secureRequiredType = tL_secureRequiredType3;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            if (tL_secureRequiredType == null) {
                                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(0);
                            }
                        }
                        if (z6) {
                            xz7Var.O1(tL_secureRequiredType2, null, null, tL_secureRequiredType, str, z5, arrayList != null ? arrayList.size() : 0);
                        } else {
                            String str5 = str;
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                            TLRPC.TL_secureValue l12 = xz7Var.l1(tL_secureRequiredType2, false);
                            if (l12 != null && (tL_secureData = l12.data) != null) {
                                str4 = xz7.a1(tL_secureData.data, xz7Var.b1(tL_secureData.secret, tL_secureData.data_hash), l12.data.data_hash);
                            }
                            xz7Var.O1(tL_secureRequiredType2, null, str4, tL_secureRequiredType4, str5, z5, arrayList != null ? arrayList.size() : 0);
                        }
                    }
                    if (ny7Var != null) {
                        ny7Var.run();
                        break;
                    }
                } else {
                    if (qy7Var != null) {
                        String str6 = tL_error.text;
                        qy7Var.b.A1();
                    }
                    xz7Var.P1(jb6.M0(R.string.AppName, null), tL_error.text);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g97(oc7 oc7Var, d dVar, k11 k11Var, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        this.e = oc7Var;
        this.f = dVar;
        this.h = k11Var;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z;
        this.d = z2;
        this.s = botInfoArr;
    }

    public /* synthetic */ g97(xz7 xz7Var, TLRPC.TL_error tL_error, qy7 qy7Var, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, ny7 ny7Var) {
        this.e = xz7Var;
        this.f = tL_error;
        this.h = qy7Var;
        this.b = z;
        this.n = tL_secureRequiredType;
        this.r = tL_secureRequiredType2;
        this.d = z2;
        this.c = arrayList;
        this.s = ny7Var;
    }
}
